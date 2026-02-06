/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  cpw.mods.fml.common.network.simpleimpl.MessageContext
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.IChatComponent
 */
package JinRyuu.JRMCore.p.YC;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JYearsCH;
import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class JYearsCP
implements IMessage {
    public int jycdatey;
    public int jycdatem;
    public int jycdated;
    public String jycp;
    public int jycpy;

    public JYearsCP() {
    }

    public JYearsCP(int jycdatey, int jycdatem, int jycdated, String jycp, int jycpy) {
        this.jycdatey = jycdatey;
        this.jycdatem = jycdatem;
        this.jycdated = jycdated;
        this.jycp = jycp;
        this.jycpy = jycpy;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.jycdatey);
        buffer.writeShort(this.jycdatem);
        buffer.writeShort(this.jycdated);
        ByteBufUtils.writeUTF8String((ByteBuf)buffer, (String)this.jycp);
        buffer.writeInt(this.jycpy);
    }

    public void fromBytes(ByteBuf buffer) {
        this.jycdatey = buffer.readInt();
        this.jycdatem = buffer.readShort();
        this.jycdated = buffer.readShort();
        this.jycp = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        this.jycpy = buffer.readInt();
    }

    public static class Handler
    extends BAmh<JYearsCP> {
        @Override
        public IMessage handleClientMessage(EntityPlayer player, JYearsCP m, MessageContext ctx) {
            EntityPlayer Player = player;
            JYearsCH.y = m.jycdatey;
            JYearsCH.m = m.jycdatem;
            JYearsCH.d = m.jycdated;
            JYearsCH.py = m.jycpy;
            JYearsCH.p = m.jycp == "::" ? null : m.jycp.toString().replaceAll("::", "").split(":");
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer Player, JYearsCP m, MessageContext ctx) {
            if (m.jycpy == 1) {
                if (Player.inventory.hasItem(Items.emerald)) {
                    Player.inventory.inventoryChanged = true;
                    Player.inventory.consumeInventoryItem(Items.emerald);
                    Player.inventory.inventoryChanged = false;
                    JRMCoreH.setFloat(0, Player, "JRYCAge");
                } else {
                    Player.addChatMessage((IChatComponent)new ChatComponentText("You need an Emerald to use Rebirth!"));
                }
            }
            return null;
        }
    }
}

