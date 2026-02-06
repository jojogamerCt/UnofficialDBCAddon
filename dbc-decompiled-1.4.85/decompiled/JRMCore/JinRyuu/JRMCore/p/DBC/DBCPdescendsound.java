/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.DBC
 *  JinRyuu.DragonBC.common.DBCClient
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  cpw.mods.fml.common.network.simpleimpl.MessageContext
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 */
package JinRyuu.JRMCore.p.DBC;

import JinRyuu.DragonBC.common.DBC;
import JinRyuu.DragonBC.common.DBCClient;
import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class DBCPdescendsound
implements IMessage {
    int i;

    public DBCPdescendsound() {
    }

    public DBCPdescendsound(int i) {
        this.i = i;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.i);
    }

    public void fromBytes(ByteBuf buffer) {
        this.i = buffer.readInt();
    }

    public static class Handler
    extends BAmh<DBCPdescendsound> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, DBCPdescendsound m, MessageContext ctx) {
            DBCClient.phc.handleDBCdescendsound(m.i, p);
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, DBCPdescendsound m, MessageContext ctx) {
            DBC.phs.handleDBCdescendsound(m.i, p);
            return null;
        }
    }
}

