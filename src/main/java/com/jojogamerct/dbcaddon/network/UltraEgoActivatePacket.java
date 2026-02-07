package com.jojogamerct.dbcaddon.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import com.jojogamerct.dbcaddon.config.UltraEgoConfig;
import com.jojogamerct.dbcaddon.transformation.UltraEgoData;
import com.jojogamerct.dbcaddon.util.DBCPlayerHelper;
import com.jojogamerct.dbcaddon.util.DebugHelper;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

/**
 * Packet sent from client to server when the player presses the Ultra Ego key.
 * The server validates and toggles the transformation.
 */
public class UltraEgoActivatePacket implements IMessage {

    private boolean activate;

    public UltraEgoActivatePacket() {}

    public UltraEgoActivatePacket(boolean activate) {
        this.activate = activate;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(activate);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        activate = buf.readBoolean();
    }

    public static class Handler implements IMessageHandler<UltraEgoActivatePacket, IMessage> {

        @Override
        public IMessage onMessage(UltraEgoActivatePacket message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().playerEntity;

            DebugHelper.logNetwork(
                "Received UltraEgoActivatePacket: activate=" + message.activate
                    + " from "
                    + player.getCommandSenderName());

            if (message.activate) {
                tryActivate(player);
            } else {
                deactivate(player);
            }

            return null;
        }

        private void tryActivate(EntityPlayerMP player) {
            DebugHelper.logActivation(player, "Ultra Ego activation attempt by " + player.getCommandSenderName());

            // Dump full player data when debug is enabled
            DebugHelper.dumpPlayerData(player);

            // Check if already active
            if (UltraEgoData.isActive(player)) {
                DebugHelper.logActivation(player, "BLOCKED: Already active");
                return;
            }

            // Check race: must be Saiyan or Half-Saiyan
            if (!DBCPlayerHelper.isSaiyanOrHalfSaiyan(player)) {
                DebugHelper
                    .logActivation(player, "BLOCKED: Race check failed (race=" + DBCPlayerHelper.getRace(player) + ")");
                sendMessage(
                    player,
                    EnumChatFormatting.RED + "Ultra Ego is only available to Saiyans and Half-Saiyans.");
                return;
            }

            DebugHelper.logActivation(player, "PASSED: Race check (race=" + DBCPlayerHelper.getRace(player) + ")");

            // Check if unlocked (first time costs TP)
            if (!UltraEgoData.isUnlocked(player)) {
                int tp = DBCPlayerHelper.getTP(player);
                DebugHelper
                    .logActivation(player, "Unlock check: current TP=" + tp + ", required=" + UltraEgoConfig.tpCost);

                if (tp < UltraEgoConfig.tpCost) {
                    sendMessage(
                        player,
                        EnumChatFormatting.RED + "You need "
                            + UltraEgoConfig.tpCost
                            + " TP to unlock Ultra Ego. (Current: "
                            + tp
                            + ")");
                    return;
                }
                // Spend TP to unlock
                DBCPlayerHelper.setTP(player, tp - (int) UltraEgoConfig.tpCost);
                UltraEgoData.setUnlocked(player, true);
                DebugHelper.logActivation(player, "Ultra Ego unlocked! TP spent: " + UltraEgoConfig.tpCost);
                sendMessage(
                    player,
                    EnumChatFormatting.DARK_PURPLE + "Ultra Ego has been unlocked! "
                        + UltraEgoConfig.tpCost
                        + " TP spent.");
            } else {
                DebugHelper.logActivation(player, "Already unlocked, skipping TP check");
            }

            // Check if Ultra Instinct is active (cannot use both)
            if (DBCPlayerHelper.isUltraInstinctActive(player)) {
                DebugHelper.logActivation(player, "BLOCKED: Ultra Instinct is active");
                sendMessage(
                    player,
                    EnumChatFormatting.RED + "Cannot activate Ultra Ego while Ultra Instinct is active.");
                return;
            }

            // Check Ki requirement (need at least 10% Ki)
            long currentKi = DBCPlayerHelper.getCurrentEnergy(player);
            long maxKi = DBCPlayerHelper.getMaxEnergy(player);
            DebugHelper.logActivation(
                player,
                "Ki check: current=" + currentKi + ", max=" + maxKi + ", required=" + (maxKi / 10));

            if (maxKi > 0 && currentKi < maxKi / 10) {
                DebugHelper.logActivation(player, "BLOCKED: Not enough Ki");
                sendMessage(player, EnumChatFormatting.RED + "Not enough Ki to activate Ultra Ego.");
                return;
            }

            // Activate Ultra Ego
            UltraEgoData.setActive(player, true);
            DebugHelper.logActivation(player, "Ultra Ego ACTIVATED successfully");
            sendMessage(
                player,
                EnumChatFormatting.DARK_PURPLE + ""
                    + EnumChatFormatting.BOLD
                    + "Ultra Ego activated! The power of destruction flows through you...");

            // Sync to client
            NetworkHandler.INSTANCE.sendTo(new UltraEgoSyncPacket(true, 0.0), player);
            DebugHelper.logNetwork("Sent UltraEgoSyncPacket(active=true) to " + player.getCommandSenderName());
        }

        private void deactivate(EntityPlayerMP player) {
            if (!UltraEgoData.isActive(player)) {
                return;
            }

            UltraEgoData.setActive(player, false);
            DebugHelper.logActivation(player, "Ultra Ego DEACTIVATED by " + player.getCommandSenderName());
            sendMessage(player, EnumChatFormatting.GRAY + "Ultra Ego deactivated.");

            // Sync to client
            NetworkHandler.INSTANCE.sendTo(new UltraEgoSyncPacket(false, 0.0), player);
            DebugHelper.logNetwork("Sent UltraEgoSyncPacket(active=false) to " + player.getCommandSenderName());
        }

        private void sendMessage(EntityPlayer player, String message) {
            player.addChatMessage(new ChatComponentText(message));
        }
    }
}
