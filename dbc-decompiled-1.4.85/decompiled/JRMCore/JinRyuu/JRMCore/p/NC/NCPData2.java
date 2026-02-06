/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.NarutoC.common.NC
 *  JinRyuu.NarutoC.common.NCClient
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  cpw.mods.fml.common.network.simpleimpl.MessageContext
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 */
package JinRyuu.JRMCore.p.NC;

import JinRyuu.JRMCore.p.BAmh;
import JinRyuu.NarutoC.common.NC;
import JinRyuu.NarutoC.common.NCClient;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class NCPData2
implements IMessage {
    int i;
    String s;

    public NCPData2() {
    }

    public NCPData2(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.i);
        ByteBufUtils.writeUTF8String((ByteBuf)buffer, (String)this.s);
    }

    public void fromBytes(ByteBuf buffer) {
        this.i = buffer.readInt();
        this.s = ByteBufUtils.readUTF8String((ByteBuf)buffer);
    }

    public static class Handler
    extends BAmh<NCPData2> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, NCPData2 m, MessageContext ctx) {
            NCClient.phc.handleJRNC(m.i, m.s, p);
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, NCPData2 m, MessageContext ctx) {
            NC.phs.handleJRNC(m.i, m.s, p);
            return null;
        }
    }
}

