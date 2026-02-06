/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.mod_JRMCore;
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

public class ComJrmcCheck
extends CommandBase {
    public static HashMap<String, Object[]> SList = new HashMap();

    public String getCommandName() {
        return "jrmccheck";
    }

    public int getRequiredPermissionLevel() {
        return 1;
    }

    public String getCommandUsage(ICommandSender par1ICommandSender) {
        return "Usage: '/jrmccheck sheet [playerName]' to view players character sheet.";
    }

    public boolean canCommandSenderUseCommand(ICommandSender par1ICommandSender) {
        return true;
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        EntityPlayerMP entitycommansender;
        if (par2ArrayOfStr.length <= 0) {
            throw new WrongUsageException(this.getCommandUsage(par1ICommandSender), new Object[0]);
        }
        String entitycommansenderName = "Console";
        try {
            EntityPlayerMP commansender = ComJrmcCheck.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
            entitycommansenderName = commansender.getCommandSenderName();
        }
        catch (Exception commansender) {
            // empty catch block
        }
        if (entitycommansenderName.equals("Console")) {
            mod_JRMCore.logger.info("This command can't be run from Console");
            return;
        }
        EntityPlayerMP entityplayermp = entitycommansender = ComJrmcCheck.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        boolean sheet = false;
        if (par2ArrayOfStr.length > 0 && par2ArrayOfStr[0].equalsIgnoreCase("sheet")) {
            sheet = true;
        }
        if (par2ArrayOfStr.length > 1) {
            if (!(JRMCoreConfig.JRMCCheckOnOthersWithoutOP || entityplayermp == null || entitycommansenderName.equals("Console") || par2ArrayOfStr[1].equals(entitycommansenderName))) {
                sheet = false;
                ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.RED);
                entityplayermp.addChatMessage(new ChatComponentText("JRMCCheck - Non OP Players can check other Player's Sheet is DISABLED!").setChatStyle(color));
            }
            entityplayermp = ComJrmcCheck.getPlayer((ICommandSender)par1ICommandSender, (String)par2ArrayOfStr[1]);
        }
        NBTTagCompound nbt = JRMCoreH.nbt((Entity)entityplayermp, "pres");
        ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
        ChatStyle colorG = new ChatStyle().setColor(EnumChatFormatting.GOLD);
        if (sheet) {
            int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts((EntityPlayer)entityplayermp);
            byte rc = nbt.getByte("jrmcRace");
            byte pwr = nbt.getByte("jrmcPwrtyp");
            byte Cls = nbt.getByte("jrmcClass");
            byte rls = JRMCoreH.getByte((EntityPlayer)entityplayermp, "jrmcRelease");
            int ac = nbt.getInteger("jrmcAlCntr");
            byte alive = nbt.getByte("jrmcAlv");
            byte Diff = JRMCoreH.getByte((EntityPlayer)entityplayermp, "jrmcDiff");
            byte Align = JRMCoreH.getByte((EntityPlayer)entityplayermp, "jrmcAlign");
            int TPint = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcTpint");
            String[] pw = new String[]{"NotSelected", "DBC", "NC", "SAO"};
            entitycommansender.addChatMessage(new ChatComponentText(entityplayermp.getDisplayName() + "'s Character Sheet").setChatStyle(colorG));
            entitycommansender.addChatMessage(new ChatComponentText("Level: " + JRMCoreH.getPlayerLevel(PlyrAttrbts)).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Power User: " + pw[pwr]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Race: " + JRMCoreH.Races[rc]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Class: " + JRMCoreH.cl(pwr)[Cls]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Training Points: " + TPint).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Power Release: " + rls + "%").setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("STR: " + PlyrAttrbts[0]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("DEX: " + PlyrAttrbts[1]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("CON: " + PlyrAttrbts[2]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("WIL: " + PlyrAttrbts[3]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("MND: " + PlyrAttrbts[4]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("SPI: " + PlyrAttrbts[5]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Status: " + (alive == 0 ? "Alive" : "Dead")).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Difficulty: " + JRMCoreH.DifficultyNames[Diff]).setChatStyle(color));
            entitycommansender.addChatMessage(new ChatComponentText("Alignment: " + JRMCoreH.AlgnmntNms[JRMCoreH.Algnmnt(Align)]).setChatStyle(color));
            String[] PlyrSkills = nbt.getString("jrmcSSlts").split(",");
            for (int j = 0; j < PlyrSkills.length; j = (int)((byte)(j + 1))) {
                String skl = PlyrSkills[j];
                if (skl.length() <= 2) continue;
                entitycommansender.addChatMessage(new ChatComponentText("Skill: lvl " + (Integer.parseInt(skl.substring(2)) + 1) + " " + JRMCoreH.SklName(skl, JRMCoreH.DBCSkillsIDs, JRMCoreH.DBCSkillNames)).setChatStyle(colorG));
            }
            Object[] objectArray = new Object[2];
            objectArray[0] = ComJrmcCheck.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender).getDisplayName();
            objectArray[1] = entityplayermp.getCommandSenderName();
            this.notifyAdmins(par1ICommandSender, "%s checked char sheet of %s ", objectArray);
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
        ComJrmcCheck.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        return par2ArrayOfStr.length == 2 ? ComJrmcCheck.getListOfStringsMatchingLastWord((String[])par2ArrayOfStr, (String[])this.getListOfPlayers()) : null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int par1) {
        return par1 == 0;
    }
}

