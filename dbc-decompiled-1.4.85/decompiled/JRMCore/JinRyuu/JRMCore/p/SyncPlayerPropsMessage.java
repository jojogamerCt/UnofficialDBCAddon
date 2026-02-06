/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  cpw.mods.fml.common.network.simpleimpl.MessageContext
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 */
package JinRyuu.JRMCore.p;

import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.p.CAmh;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class SyncPlayerPropsMessage
implements IMessage {
    private NBTTagCompound data;

    public SyncPlayerPropsMessage() {
    }

    public SyncPlayerPropsMessage(EntityPlayer player) {
        this.data = new NBTTagCompound();
        ExtendedPlayer.get(player).saveNBTData(this.data);
    }

    public void fromBytes(ByteBuf buffer) {
        this.data = ByteBufUtils.readTag((ByteBuf)buffer);
    }

    public void toBytes(ByteBuf buffer) {
        ByteBufUtils.writeTag((ByteBuf)buffer, (NBTTagCompound)this.data);
    }

    public static class Handler
    extends CAmh<SyncPlayerPropsMessage> {
        @Override
        @SideOnly(value=Side.CLIENT)
        public IMessage handleClientMessage(EntityPlayer player, SyncPlayerPropsMessage message, MessageContext ctx) {
            ExtendedPlayer.get(player).loadNBTData(message.data);
            return null;
        }
    }
}

