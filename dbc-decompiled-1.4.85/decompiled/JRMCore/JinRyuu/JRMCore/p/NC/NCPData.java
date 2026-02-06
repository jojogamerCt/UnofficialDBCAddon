/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.NarutoC.common.NC
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  cpw.mods.fml.common.network.simpleimpl.MessageContext
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 */
package JinRyuu.JRMCore.p.NC;

import JinRyuu.JRMCore.p.BAmh;
import JinRyuu.NarutoC.common.NC;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class NCPData
implements IMessage {
    byte b1;
    byte b2;

    public NCPData() {
    }

    public NCPData(byte b1, byte b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeByte((int)this.b1);
        buffer.writeByte((int)this.b2);
    }

    public void fromBytes(ByteBuf buffer) {
        this.b1 = buffer.readByte();
        this.b2 = buffer.readByte();
    }

    public static class Handler
    extends BAmh<NCPData> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, NCPData m, MessageContext ctx) {
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, NCPData m, MessageContext ctx) {
            NC.phs.handleJRNC(m.b1, m.b2, p);
            return null;
        }
    }
}

