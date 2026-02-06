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

public class JRMCorePCol
implements IMessage {
    int i;
    byte b;

    public JRMCorePCol() {
    }

    public JRMCorePCol(int i, byte b) {
        this.i = i;
        this.b = b;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.i);
        buffer.writeByte((int)this.b);
    }

    public void fromBytes(ByteBuf buffer) {
        this.i = buffer.readInt();
        this.b = buffer.readByte();
    }

    public static class Handler
    extends BAmh<JRMCorePCol> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, JRMCorePCol m, MessageContext ctx) {
            JRMCoreClient.phc.handleCol(m.i, m.b, p);
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, JRMCorePCol m, MessageContext ctx) {
            JRMCore.phs.handleCol(m.i, m.b, p);
            return null;
        }
    }
}

