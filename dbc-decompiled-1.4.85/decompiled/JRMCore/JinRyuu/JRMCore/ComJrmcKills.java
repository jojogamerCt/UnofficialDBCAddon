/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.FMLCommonHandler
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.command.WrongUsageException
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.EnumChatFormatting
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.common.FMLCommonHandler;
import java.util.HashMap;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;

public class ComJrmcKills
extends CommandBase {
    public static HashMap<String, Object[]> SList = new HashMap();

    public String getCommandName() {
        return "jrmckills";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }

    public String getCommandUsage(ICommandSender par1ICommandSender) {
        return "Usage: '/jrmckills top' to view top kills OR '/jrmckills [playerName]' to view players kill statistics.";
    }

    public boolean canCommandSenderUseCommand(ICommandSender par1ICommandSender) {
        return true;
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        boolean alone;
        EntityPlayerMP entitycommansender;
        if (par2ArrayOfStr.length <= 0) {
            throw new WrongUsageException(this.getCommandUsage(par1ICommandSender), new Object[0]);
        }
        EntityPlayerMP entityplayermp = entitycommansender = ComJrmcKills.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        boolean flagTop = false;
        boolean flagPlayer = false;
        if (par2ArrayOfStr.length > 0 && par2ArrayOfStr[0].equalsIgnoreCase("top")) {
            entityplayermp = ComJrmcKills.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
            flagTop = true;
        } else if (par2ArrayOfStr.length > 0) {
            entityplayermp = ComJrmcKills.getPlayer((ICommandSender)par1ICommandSender, (String)par2ArrayOfStr[0]);
            flagPlayer = true;
        }
        NBTTagCompound nbt = JRMCoreH.nbt((Entity)entityplayermp, "pres");
        ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
        ChatStyle colorG = new ChatStyle().setColor(EnumChatFormatting.GOLD);
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        int cur = server.getCurrentPlayerCount();
        boolean bl = alone = cur <= 1 && flagTop;
        if (cur <= 1 || flagPlayer) {
            byte Align = JRMCoreH.getByte((EntityPlayer)entityplayermp, "jrmcAlign");
            int Karma = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcKarma");
            int KllCG = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcKillCountGood");
            int KllCN = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcKillCountNeut");
            int KllCE = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcKillCountEvil");
            int total = KllCG + KllCN + KllCE;
            if (alone) {
                entitycommansender.addChatMessage(new ChatComponentText("You are alone on the server!").setChatStyle(color));
            }
            entitycommansender.addChatMessage(new ChatComponentText(entityplayermp.getDisplayName() + "'s Player Kill counts").setChatStyle(colorG));
            entitycommansender.addChatMessage(new ChatComponentText("Total Kills: " + total).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Good Kills: " + KllCG).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Neutral Kills: " + KllCN).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Evil Kills: " + KllCE).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Bad Karma: " + Karma).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Alignment: " + JRMCoreH.AlgnmntNms[JRMCoreH.Algnmnt(Align)]).setChatStyle(color));
            Object[] objectArray = new Object[2];
            objectArray[0] = ComJrmcKills.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender).getDisplayName();
            objectArray[1] = entityplayermp.getCommandSenderName();
            this.notifyAdmins(par1ICommandSender, "%s checked kill counts of %s  ", objectArray);
        } else if (flagTop) {
            for (int pl = 0; pl < cur; ++pl) {
                EntityPlayerMP player = JRMCoreH.getPlayerForUsername(server, server.getAllUsernames()[pl]);
                byte Align = JRMCoreH.getByte((EntityPlayer)entityplayermp, "jrmcAlign");
                int Karma = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcKarma");
                int KllCG = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcKillCountGood");
                int KllCN = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcKillCountNeut");
                int KllCE = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcKillCountEvil");
                int total = KllCG + KllCN + KllCE;
                this.setter("topBadKarma", Karma, player.getCommandSenderName());
                this.setter("topTotalKills", total, player.getCommandSenderName());
                this.setter("topGoodKills", KllCG, player.getCommandSenderName());
                this.setter("topNeutralKills", KllCN, player.getCommandSenderName());
                this.setter("topEvilKills", KllCE, player.getCommandSenderName());
            }
            Object[] topBadKarma = this.getter("topBadKarma");
            Object[] topTotalKills = this.getter("topTotalKills");
            Object[] topGoodKills = this.getter("topGoodKills");
            Object[] topNeutralKills = this.getter("topNeutralKills");
            Object[] topEvilKills = this.getter("topEvilKills");
            int Karma = Integer.parseInt(topBadKarma[0] + "");
            int Total = Integer.parseInt(topTotalKills[0] + "");
            int Good = Integer.parseInt(topGoodKills[0] + "");
            int Neutral = Integer.parseInt(topNeutralKills[0] + "");
            int Evil = Integer.parseInt(topEvilKills[0] + "");
            boolean b = Karma == 0 && Total == 0 && Good == 0 && Neutral == 0 && Evil == 0;
            entitycommansender.addChatMessage(new ChatComponentText("Current Top Players").setChatStyle(colorG));
            if (Karma > 0) {
                entitycommansender.addChatMessage(new ChatComponentText("Most Wanted: " + topBadKarma[1] + " with " + topBadKarma[0] + " bad karma").setChatStyle(color));
            }
            if (Total > 0) {
                entitycommansender.addChatMessage(new ChatComponentText("Top Total Kills: " + topTotalKills[1] + " with " + topTotalKills[0] + " kill count").setChatStyle(color));
            }
            if (Good > 0) {
                entitycommansender.addChatMessage(new ChatComponentText("Top Good Kills: " + topGoodKills[1] + " with " + topGoodKills[0] + " kill count").setChatStyle(color));
            }
            if (Neutral > 0) {
                entitycommansender.addChatMessage(new ChatComponentText("Top Neutral Kills: " + topNeutralKills[1] + " with " + topNeutralKills[0] + " kill count").setChatStyle(color));
            }
            if (Evil > 0) {
                entitycommansender.addChatMessage(new ChatComponentText("Top Evil Kills: " + topEvilKills[1] + " with " + topEvilKills[0] + " kill count").setChatStyle(color));
            }
            if (b) {
                entitycommansender.addChatMessage(new ChatComponentText("There are no Top Players!").setChatStyle(color));
            }
            SList.clear();
        }
    }

    private void setter(String s, int v, String n) {
        Object[] o = SList.get(s);
        if (o != null) {
            int prevV = Integer.parseInt(o[0] + "");
            if (prevV > v) {
                Object[] sTemp = new Object[]{v, n};
                SList.put(s, sTemp);
            }
        } else {
            Object[] sTemp = new Object[]{v, n};
            SList.put(s, sTemp);
        }
    }

    private Object[] getter(String s) {
        Object[] o = SList.get(s);
        if (o.length == 2) {
            return o;
        }
        return null;
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComJrmcKills.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        return par2ArrayOfStr.length == 1 ? ComJrmcKills.getListOfStringsMatchingLastWord((String[])par2ArrayOfStr, (String[])this.getListOfPlayers()) : null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int par1) {
        return par1 == 0;
    }
}

