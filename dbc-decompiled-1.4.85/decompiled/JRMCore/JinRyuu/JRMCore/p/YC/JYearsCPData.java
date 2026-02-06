/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  cpw.mods.fml.common.network.simpleimpl.MessageContext
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 */
package JinRyuu.JRMCore.p.YC;

import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class JYearsCPData
implements IMessage {
    public static int i;
    public static String s;

    public JYearsCPData() {
    }

    public JYearsCPData(int i, String s) {
        JYearsCPData.i = i;
        JYearsCPData.s = s;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(i);
        ByteBufUtils.writeUTF8String((ByteBuf)buffer, (String)s);
    }

    public void fromBytes(ByteBuf buffer) {
        i = buffer.readInt();
        s = ByteBufUtils.readUTF8String((ByteBuf)buffer);
    }

    public static class Handler
    extends BAmh<JYearsCPData> {
        @Override
        public IMessage handleClientMessage(EntityPlayer player, JYearsCPData m, MessageContext ctx) {
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer Player, JYearsCPData m, MessageContext ctx) {
            return null;
        }
    }
}

