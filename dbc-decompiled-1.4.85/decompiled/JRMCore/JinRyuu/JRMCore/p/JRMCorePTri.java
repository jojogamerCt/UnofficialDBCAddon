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

public class JRMCorePTri
implements IMessage {
    byte b;
    byte b2;
    byte b3;

    public JRMCorePTri() {
    }

    public JRMCorePTri(byte b, byte b2, byte b3) {
        this.b = b;
        this.b2 = b2;
        this.b3 = b3;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeByte((int)this.b);
        buffer.writeByte((int)this.b2);
        buffer.writeByte((int)this.b3);
    }

    public void fromBytes(ByteBuf buffer) {
        this.b = buffer.readByte();
        this.b2 = buffer.readByte();
        this.b3 = buffer.readByte();
    }

    public static class Handler
    extends BAmh<JRMCorePTri> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, JRMCorePTri m, MessageContext ctx) {
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, JRMCorePTri m, MessageContext ctx) {
            JRMCore.phs.handleTri(m.b, m.b2, m.b3, p);
            return null;
        }
    }
}

