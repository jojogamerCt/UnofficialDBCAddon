package com.jojogamerct.dbcaddon.transformation;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

import com.jojogamerct.dbcaddon.util.DBCPlayerHelper;

/**
 * Tracks per-player Ultra Ego state. Data is stored in player's persisted NBT
 * under our addon's namespace to avoid conflicts with DBC.
 */
public class UltraEgoData {

    // NBT keys for our addon data (prefixed to avoid collisions)
    private static final String NBT_PREFIX = "dbcaddon_";
    private static final String NBT_UE_ACTIVE = NBT_PREFIX + "ueActive";
    private static final String NBT_UE_UNLOCKED = NBT_PREFIX + "ueUnlocked";
    private static final String NBT_UE_BATTLE_DAMAGE = NBT_PREFIX + "ueBattleDamage";
    private static final String NBT_UE_LAST_HIT_TICK = NBT_PREFIX + "ueLastHitTick";
    private static final String NBT_UE_ACTIVE_TICKS = NBT_PREFIX + "ueActiveTicks";

    // In-memory cache for per-player transient data (not saved to NBT)
    private static final Map<UUID, TransientData> transientDataMap = new HashMap<>();

    private static class TransientData {

        double battleDamageBonus = 0.0;
        int ticksSinceLastHit = 0;
        int activeTicks = 0;
    }

    private static TransientData getTransient(EntityPlayer player) {
        UUID id = player.getUniqueID();
        TransientData data = transientDataMap.get(id);
        if (data == null) {
            data = new TransientData();
            transientDataMap.put(id, data);
        }
        return data;
    }

    private static NBTTagCompound getAddonNBT(EntityPlayer player) {
        return DBCPlayerHelper.getPersistedData(player);
    }

    // --- Unlocked State ---

    public static boolean isUnlocked(EntityPlayer player) {
        return getAddonNBT(player).getBoolean(NBT_UE_UNLOCKED);
    }

    public static void setUnlocked(EntityPlayer player, boolean unlocked) {
        getAddonNBT(player).setBoolean(NBT_UE_UNLOCKED, unlocked);
    }

    // --- Active State ---

    public static boolean isActive(EntityPlayer player) {
        return getAddonNBT(player).getBoolean(NBT_UE_ACTIVE);
    }

    public static void setActive(EntityPlayer player, boolean active) {
        getAddonNBT(player).setBoolean(NBT_UE_ACTIVE, active);
        if (!active) {
            // Reset transient data on deactivation
            TransientData td = getTransient(player);
            td.battleDamageBonus = 0.0;
            td.ticksSinceLastHit = 0;
            td.activeTicks = 0;
        }
    }

    // --- Battle Damage Bonus ---

    public static double getBattleDamageBonus(EntityPlayer player) {
        return getTransient(player).battleDamageBonus;
    }

    public static void addBattleDamageBonus(EntityPlayer player, double amount, double max) {
        TransientData td = getTransient(player);
        td.battleDamageBonus = Math.min(td.battleDamageBonus + amount, max);
        td.ticksSinceLastHit = 0;
    }

    public static void decayBattleDamageBonus(EntityPlayer player, double rate) {
        TransientData td = getTransient(player);
        td.battleDamageBonus = Math.max(0.0, td.battleDamageBonus - rate);
    }

    // --- Hit Tracking ---

    public static int getTicksSinceLastHit(EntityPlayer player) {
        return getTransient(player).ticksSinceLastHit;
    }

    public static void incrementTicksSinceLastHit(EntityPlayer player) {
        getTransient(player).ticksSinceLastHit++;
    }

    // --- Active Duration ---

    public static int getActiveTicks(EntityPlayer player) {
        return getTransient(player).activeTicks;
    }

    public static void incrementActiveTicks(EntityPlayer player) {
        getTransient(player).activeTicks++;
    }

    // --- Cleanup ---

    public static void removePlayer(EntityPlayer player) {
        transientDataMap.remove(player.getUniqueID());
    }

    /**
     * Gets the current total attribute multiplier for Ultra Ego.
     * Base multiplier + battle damage bonus.
     */
    public static double getCurrentMultiplier(EntityPlayer player, double baseMulti, double maxMulti) {
        double bonus = getBattleDamageBonus(player);
        return Math.min(baseMulti + bonus, maxMulti);
    }
}
