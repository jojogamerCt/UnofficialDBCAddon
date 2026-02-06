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

import JinRyuu.JRMCore.JRMCore;
import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class JRMCorePUpgrade
implements IMessage {
    byte b;

    public JRMCorePUpgrade() {
    }

    public JRMCorePUpgrade(byte b) {
        this.b = b;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeByte((int)this.b);
    }

    public void fromBytes(ByteBuf buffer) {
        this.b = buffer.readByte();
    }

    public static class Handler
    extends BAmh<JRMCorePUpgrade> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, JRMCorePUpgrade m, MessageContext ctx) {
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, JRMCorePUpgrade m, MessageContext ctx) {
            JRMCore.phs.handleUpgrade(m.b, p);
            return null;
        }
    }
}

