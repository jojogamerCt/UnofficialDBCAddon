package com.jojogamerct.dbcaddon.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import com.jojogamerct.dbcaddon.config.UltraEgoConfig;
import com.jojogamerct.dbcaddon.network.NetworkHandler;
import com.jojogamerct.dbcaddon.network.UltraEgoSyncPacket;
import com.jojogamerct.dbcaddon.transformation.UltraEgoData;
import com.jojogamerct.dbcaddon.util.DBCPlayerHelper;
import com.jojogamerct.dbcaddon.util.DebugHelper;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

/**
 * Core event handler for the Ultra Ego transformation.
 * Handles:
 * - Per-tick Ki/Stamina drain and battle damage decay
 * - Damage output amplification (Hakai bonus)
 * - Damage taken reduction + battle damage bonus accumulation
 * - Auto-deactivation when resources run out
 */
public class UltraEgoEventHandler {

    /**
     * Server-side player tick: handle Ki/Stamina drain, battle damage decay,
     * and auto-deactivation.
     */
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        if (event.side.isClient()) return;

        EntityPlayer player = event.player;
        if (!UltraEgoData.isActive(player)) return;

        UltraEgoData.incrementActiveTicks(player);
        UltraEgoData.incrementTicksSinceLastHit(player);

        // --- Ki Drain ---
        long maxKi = DBCPlayerHelper.getMaxEnergy(player);
        long currentKi = DBCPlayerHelper.getCurrentEnergy(player);
        if (maxKi > 0) {
            long kiDrain = (long) (maxKi * UltraEgoConfig.kiDrainPercentPerSecond / 100.0 / 20.0);
            if (kiDrain < 1) kiDrain = 1;
            long newKi = currentKi - kiDrain;

            if (newKi <= 0) {
                // Out of Ki - force deactivation
                newKi = 0;
                DBCPlayerHelper.setCurrentEnergy(player, newKi);
                DebugHelper.logTick("Ki depleted for " + player.getCommandSenderName() + " - force deactivating");
                forceDeactivate(player, "Your Ki has been depleted. Ultra Ego deactivated.");
                return;
            }
            DBCPlayerHelper.setCurrentEnergy(player, newKi);
        }

        // --- Stamina Drain ---
        long maxStamina = DBCPlayerHelper.getMaxStamina(player);
        long currentStamina = DBCPlayerHelper.getCurrentStamina(player);
        if (maxStamina > 0) {
            long staminaDrain = (long) (maxStamina * UltraEgoConfig.staminaDrainPercentPerSecond / 100.0 / 20.0);
            if (staminaDrain < 1) staminaDrain = 1;
            long newStamina = Math.max(0, currentStamina - staminaDrain);
            DBCPlayerHelper.setCurrentStamina(player, newStamina);
        }

        // --- Battle Damage Decay ---
        int ticksSinceHit = UltraEgoData.getTicksSinceLastHit(player);
        if (ticksSinceHit > UltraEgoConfig.battleDamageDecayTicks) {
            UltraEgoData.decayBattleDamageBonus(player, UltraEgoConfig.battleDamageDecayRate);
        }

        // --- Periodic Sync to Client (every 2 seconds) ---
        int activeTicks = UltraEgoData.getActiveTicks(player);
        if (activeTicks % 40 == 0 && player instanceof EntityPlayerMP) {
            double bonus = UltraEgoData.getBattleDamageBonus(player);
            NetworkHandler.INSTANCE.sendTo(new UltraEgoSyncPacket(true, bonus), (EntityPlayerMP) player);

            // Log tick state every sync (every 2 seconds instead of every tick)
            DebugHelper.logTick(
                "Tick sync [" + player.getCommandSenderName()
                    + "] activeTicks="
                    + activeTicks
                    + " battleBonus="
                    + String.format("%.3f", bonus)
                    + " Ki="
                    + DBCPlayerHelper.getCurrentEnergy(player)
                    + "/"
                    + DBCPlayerHelper.getMaxEnergy(player)
                    + " ticksSinceHit="
                    + ticksSinceHit);
        }
    }

    /**
     * When the Ultra Ego player deals damage: apply Hakai bonus damage.
     */
    @SubscribeEvent(priority = EventPriority.LOW)
    public void onLivingHurtByPlayer(LivingHurtEvent event) {
        if (event.source == null) return;
        if (!(event.source.getEntity() instanceof EntityPlayer)) return;

        EntityPlayer attacker = (EntityPlayer) event.source.getEntity();
        if (!UltraEgoData.isActive(attacker)) return;

        // Calculate total multiplier
        double multiplier = UltraEgoData.getCurrentMultiplier(
            attacker,
            UltraEgoConfig.baseAttributeMultiplier,
            UltraEgoConfig.maxAttributeMultiplier);

        // Apply the multiplier to outgoing damage
        float originalDamage = event.ammount;
        float hakaiBonus = (float) (event.ammount * UltraEgoConfig.hakaiDamageBonus);
        float multipliedDamage = (float) (event.ammount * multiplier);
        event.ammount = multipliedDamage + hakaiBonus;

        DebugHelper.logDamage(
            "OUTGOING [" + attacker.getCommandSenderName()
                + " -> "
                + event.entityLiving.getCommandSenderName()
                + "] original="
                + String.format("%.1f", originalDamage)
                + " multiplier="
                + String.format("%.2f", multiplier)
                + " hakai="
                + String.format("%.1f", hakaiBonus)
                + " final="
                + String.format("%.1f", event.ammount));
    }

    /**
     * When the Ultra Ego player takes damage:
     * - Apply damage reduction
     * - Increase battle damage bonus (the core Ultra Ego mechanic)
     */
    @SubscribeEvent(priority = EventPriority.HIGH)
    public void onPlayerHurt(LivingHurtEvent event) {
        if (!(event.entityLiving instanceof EntityPlayer)) return;

        EntityPlayer player = (EntityPlayer) event.entityLiving;
        if (!UltraEgoData.isActive(player)) return;

        // Ignore void/creative damage
        if (event.source == DamageSource.outOfWorld) return;

        // Apply damage reduction
        float originalDamage = event.ammount;
        float reducedDamage = (float) (event.ammount * (1.0 - UltraEgoConfig.damageReductionBase));
        event.ammount = reducedDamage;

        // Increase battle damage bonus based on damage taken relative to max body
        long maxBody = DBCPlayerHelper.getMaxBody(player);
        double bonusGain;
        if (maxBody > 0) {
            double damageRatio = event.ammount / (double) maxBody;
            bonusGain = damageRatio * UltraEgoConfig.battleDamageScaling * 100.0;
        } else {
            // Fallback: flat bonus per hit if maxBody is 0
            bonusGain = 0.1;
        }
        UltraEgoData.addBattleDamageBonus(player, bonusGain, UltraEgoConfig.maxBattleDamageBonus);

        DebugHelper.logDamage(
            "INCOMING [" + player.getCommandSenderName()
                + "] source="
                + event.source.getDamageType()
                + " original="
                + String.format("%.1f", originalDamage)
                + " reduced="
                + String.format("%.1f", reducedDamage)
                + " bonusGain="
                + String.format("%.4f", bonusGain)
                + " totalBonus="
                + String.format("%.3f", UltraEgoData.getBattleDamageBonus(player)));
    }

    /**
     * Clean up player data when they log out.
     */
    @SubscribeEvent
    public void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent event) {
        // Deactivate on logout to prevent lingering state
        if (UltraEgoData.isActive(event.player)) {
            UltraEgoData.setActive(event.player, false);
            DebugHelper.logActivation(
                "Player " + event.player.getCommandSenderName() + " logged out with Ultra Ego active - deactivated");
        }
        UltraEgoData.removePlayer(event.player);
    }

    /**
     * When a player dies, deactivate Ultra Ego.
     */
    @SubscribeEvent
    public void onPlayerDeath(LivingAttackEvent event) {
        if (!(event.entityLiving instanceof EntityPlayer)) return;
        EntityPlayer player = (EntityPlayer) event.entityLiving;

        if (player.getHealth() <= 0 && UltraEgoData.isActive(player)) {
            UltraEgoData.setActive(player, false);
            DebugHelper
                .logActivation("Player " + player.getCommandSenderName() + " died with Ultra Ego active - deactivated");
        }
    }

    private void forceDeactivate(EntityPlayer player, String reason) {
        UltraEgoData.setActive(player, false);
        player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + reason));
        DebugHelper.logActivation(player, "Force deactivated: " + reason);

        if (player instanceof EntityPlayerMP) {
            NetworkHandler.INSTANCE.sendTo(new UltraEgoSyncPacket(false, 0.0), (EntityPlayerMP) player);
        }
    }
}
