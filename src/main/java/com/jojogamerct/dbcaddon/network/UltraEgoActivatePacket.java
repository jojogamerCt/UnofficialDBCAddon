package com.jojogamerct.dbcaddon.network;

import io.netty.buffer.ByteBuf;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

import com.jojogamerct.dbcaddon.config.UltraEgoConfig;
import com.jojogamerct.dbcaddon.transformation.UltraEgoData;
import com.jojogamerct.dbcaddon.util.DBCPlayerHelper;

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

            if (message.activate) {
                tryActivate(player);
            } else {
                deactivate(player);
            }

            return null;
        }

        private void tryActivate(EntityPlayerMP player) {
            // Check if already active
            if (UltraEgoData.isActive(player)) {
                return;
            }

            // Check race: must be Saiyan or Half-Saiyan
            if (!DBCPlayerHelper.isSaiyanOrHalfSaiyan(player)) {
                sendMessage(player, EnumChatFormatting.RED + "Ultra Ego is only available to Saiyans and Half-Saiyans.");
                return;
            }

            // Check level requirement
            int level = DBCPlayerHelper.getLevel(player);
            if (level < UltraEgoConfig.requiredLevel) {
                sendMessage(
                    player,
                    EnumChatFormatting.RED + "You need to be at least level " + UltraEgoConfig.requiredLevel
                        + " to use Ultra Ego. (Current: "
                        + level
                        + ")");
                return;
            }

            // Check if unlocked (first time costs TP)
            if (!UltraEgoData.isUnlocked(player)) {
                long tp = DBCPlayerHelper.getTP(player);
                if (tp < UltraEgoConfig.tpCost) {
                    sendMessage(
                        player,
                        EnumChatFormatting.RED + "You need " + UltraEgoConfig.tpCost
                            + " TP to unlock Ultra Ego. (Current: "
                            + tp
                            + ")");
                    return;
                }
                // Spend TP to unlock
                DBCPlayerHelper.setTP(player, tp - UltraEgoConfig.tpCost);
                UltraEgoData.setUnlocked(player, true);
                sendMessage(
                    player,
                    EnumChatFormatting.DARK_PURPLE + "Ultra Ego has been unlocked! " + UltraEgoConfig.tpCost
                        + " TP spent.");
            }

            // Check if Ultra Instinct is active (cannot use both)
            if (DBCPlayerHelper.isUltraInstinctActive(player)) {
                sendMessage(
                    player,
                    EnumChatFormatting.RED + "Cannot activate Ultra Ego while Ultra Instinct is active.");
                return;
            }

            // Check Ki requirement (need at least 10% Ki)
            long currentKi = DBCPlayerHelper.getCurrentEnergy(player);
            long maxKi = DBCPlayerHelper.getMaxEnergy(player);
            if (maxKi > 0 && currentKi < maxKi / 10) {
                sendMessage(player, EnumChatFormatting.RED + "Not enough Ki to activate Ultra Ego.");
                return;
            }

            // Activate Ultra Ego
            UltraEgoData.setActive(player, true);
            sendMessage(
                player,
                EnumChatFormatting.DARK_PURPLE + "" + EnumChatFormatting.BOLD
                    + "Ultra Ego activated! The power of destruction flows through you...");

            // Sync to client
            NetworkHandler.INSTANCE
                .sendTo(new UltraEgoSyncPacket(true, 0.0), player);
        }

        private void deactivate(EntityPlayerMP player) {
            if (!UltraEgoData.isActive(player)) {
                return;
            }

            UltraEgoData.setActive(player, false);
            sendMessage(player, EnumChatFormatting.GRAY + "Ultra Ego deactivated.");

            // Sync to client
            NetworkHandler.INSTANCE
                .sendTo(new UltraEgoSyncPacket(false, 0.0), player);
        }

        private void sendMessage(EntityPlayer player, String message) {
            player.addChatMessage(new ChatComponentText(message));
        }
    }
}
