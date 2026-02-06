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
package JinRyuu.JRMCore.p;

import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class JRMCorePData3
implements IMessage {
    private String title;
    private String description;
    private byte category;
    private byte icon;
    private byte renderLocation;
    private int iconColor;

    public JRMCorePData3() {
    }

    public JRMCorePData3(String title, String description, byte category, byte icon, byte renderLocation, int iconColor) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.icon = icon;
        this.renderLocation = renderLocation;
        this.iconColor = iconColor;
    }

    public void toBytes(ByteBuf buffer) {
        ByteBufUtils.writeUTF8String((ByteBuf)buffer, (String)this.title);
        ByteBufUtils.writeUTF8String((ByteBuf)buffer, (String)this.description);
        buffer.writeByte((int)this.category);
        buffer.writeByte((int)this.icon);
        buffer.writeByte((int)this.renderLocation);
        buffer.writeInt(this.iconColor);
    }

    public void fromBytes(ByteBuf buffer) {
        this.title = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        this.description = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        this.category = buffer.readByte();
        this.icon = buffer.readByte();
        this.renderLocation = buffer.readByte();
        this.iconColor = buffer.readInt();
    }

    public static class Handler
    extends BAmh<JRMCorePData3> {
        @Override
        public IMessage handleClientMessage(EntityPlayer p, JRMCorePData3 m, MessageContext ctx) {
            JRMCoreClient.phc.handleNotification(p, m.title, m.description, m.category, m.icon, m.renderLocation, m.iconColor);
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, JRMCorePData3 m, MessageContext ctx) {
            return null;
        }
    }
}

