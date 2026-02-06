/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  cpw.mods.fml.common.network.simpleimpl.MessageContext
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 */
package JinRyuu.JRMCore.p;

import JinRyuu.JRMCore.mod_JRMCore;
import JinRyuu.JRMCore.p.SAmh;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class OpenGuiMessage
implements IMessage {
    private int id;

    public OpenGuiMessage() {
    }

    public OpenGuiMessage(int id) {
        this.id = id;
    }

    public void fromBytes(ByteBuf buffer) {
        this.id = buffer.readInt();
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.id);
    }

    public static class Handler
    extends SAmh<OpenGuiMessage> {
        @Override
        public IMessage handleServerMessage(EntityPlayer player, OpenGuiMessage message, MessageContext ctx) {
            player.openGui((Object)mod_JRMCore.instance, message.id, player.worldObj, (int)player.posX, (int)player.posY, (int)player.posZ);
            return null;
        }
    }
}

