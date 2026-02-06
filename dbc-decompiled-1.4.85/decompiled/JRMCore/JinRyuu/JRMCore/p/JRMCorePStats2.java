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

import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class JRMCorePStats2
implements IMessage {
    int curTP;
    int curExp;
    byte align;
    int[] PlyrAttrbts = new int[JRMCoreH.PlyrAttrbts.length];

    public JRMCorePStats2() {
    }

    public JRMCorePStats2(int curTP2, int curExp2, byte align, int[] plyrAttrbts2) {
        this.curTP = curTP2;
        this.curExp = curExp2;
        this.align = align;
        this.PlyrAttrbts = plyrAttrbts2;
    }

    public void toBytes(ByteBuf buffer) {
        int[] PlyrAttrbts = new int[this.PlyrAttrbts.length];
        buffer.writeInt(this.curTP);
        buffer.writeInt(this.curExp);
        buffer.writeByte((int)this.align);
        for (int i = 0; i < PlyrAttrbts.length; ++i) {
            buffer.writeInt(this.PlyrAttrbts[i]);
        }
        this.PlyrAttrbts = PlyrAttrbts;
    }

    public void fromBytes(ByteBuf buffer) {
        this.curTP = buffer.readInt();
        this.curExp = buffer.readInt();
        this.align = buffer.readByte();
        for (int i = 0; i < this.PlyrAttrbts.length; ++i) {
            this.PlyrAttrbts[i] = buffer.readInt();
        }
    }

    public static class Handler
    extends BAmh<JRMCorePStats2> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, JRMCorePStats2 m, MessageContext ctx) {
            JRMCoreClient.phc.handleStats2(m.curTP, m.curExp, m.align, m.PlyrAttrbts, p);
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, JRMCorePStats2 m, MessageContext ctx) {
            return null;
        }
    }
}

