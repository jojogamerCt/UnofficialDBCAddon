package com.jojogamerct.dbcaddon.network;

import io.netty.buffer.ByteBuf;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

import com.jojogamerct.dbcaddon.transformation.UltraEgoData;

/**
 * Packet sent from server to client to synchronize Ultra Ego state.
 */
public class UltraEgoSyncPacket implements IMessage {

    private boolean active;
    private double battleDamageBonus;

    public UltraEgoSyncPacket() {}

    public UltraEgoSyncPacket(boolean active, double battleDamageBonus) {
        this.active = active;
        this.battleDamageBonus = battleDamageBonus;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(active);
        buf.writeDouble(battleDamageBonus);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        active = buf.readBoolean();
        battleDamageBonus = buf.readDouble();
    }

    public static class Handler implements IMessageHandler<UltraEgoSyncPacket, IMessage> {

        @Override
        public IMessage onMessage(UltraEgoSyncPacket message, MessageContext ctx) {
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            if (player != null) {
                UltraEgoData.setActive(player, message.active);
                if (message.active && message.battleDamageBonus > 0) {
                    UltraEgoData.addBattleDamageBonus(player, message.battleDamageBonus, Double.MAX_VALUE);
                }
            }
            return null;
        }
    }
}
