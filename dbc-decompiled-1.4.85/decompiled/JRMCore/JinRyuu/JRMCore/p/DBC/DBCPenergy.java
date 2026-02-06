/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.DBC
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  cpw.mods.fml.common.network.simpleimpl.MessageContext
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 */
package JinRyuu.JRMCore.p.DBC;

import JinRyuu.DragonBC.common.DBC;
import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class DBCPenergy
implements IMessage {
    byte b;
    byte b2;

    public DBCPenergy() {
    }

    public DBCPenergy(byte b, byte b2) {
        this.b = b;
        this.b2 = b2;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeByte((int)this.b);
        buffer.writeByte((int)this.b2);
    }

    public void fromBytes(ByteBuf buffer) {
        this.b = buffer.readByte();
        this.b2 = buffer.readByte();
    }

    public static class Handler
    extends BAmh<DBCPenergy> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, DBCPenergy m, MessageContext ctx) {
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, DBCPenergy m, MessageContext ctx) {
            DBC.phs.handleDBCenergy(m.b, m.b2, p);
            return null;
        }
    }
}

