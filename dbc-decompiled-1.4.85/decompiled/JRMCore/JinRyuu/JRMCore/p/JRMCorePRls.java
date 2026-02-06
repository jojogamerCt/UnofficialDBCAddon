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
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class JRMCorePRls
implements IMessage {
    byte b;

    public JRMCorePRls() {
    }

    public JRMCorePRls(byte b) {
        this.b = b;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeByte((int)this.b);
    }

    public void fromBytes(ByteBuf buffer) {
        this.b = buffer.readByte();
    }

    public static class Handler
    extends BAmh<JRMCorePRls> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, JRMCorePRls m, MessageContext ctx) {
            JRMCoreClient.phc.handleRls(m.b, p);
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, JRMCorePRls m, MessageContext ctx) {
            JRMCore.phs.handleRls(m.b, p);
            return null;
        }
    }
}

