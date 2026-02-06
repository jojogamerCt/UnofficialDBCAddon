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

public class NCPchargesound
implements IMessage {
    int i;

    public NCPchargesound() {
    }

    public NCPchargesound(int i) {
        this.i = i;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.i);
    }

    public void fromBytes(ByteBuf buffer) {
        this.i = buffer.readInt();
    }

    public static class Handler
    extends BAmh<NCPchargesound> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, NCPchargesound m, MessageContext ctx) {
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, NCPchargesound m, MessageContext ctx) {
            NC.phs.handleNCchargesound(m.i, p);
            return null;
        }
    }
}

