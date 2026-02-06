/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.command.WrongUsageException
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.ChatComponentTranslation
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreH2;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;

public class ComJrmcRei
extends CommandBase {
    private final String[] VALUES = new String[]{"1"};
    private final String[] BOOLEANS = new String[]{"true", "false"};

    public String getCommandName() {
        return "jrmcrei";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public void processCommand(ICommandSender commandSender, String[] stringArray) {
        if (stringArray.length < 3) {
            throw new WrongUsageException(this.getCommandUsage(commandSender), new Object[0]);
        }
        EntityPlayerMP entityplayermp = stringArray.length > 0 ? ComJrmcRei.getPlayer((ICommandSender)commandSender, (String)stringArray[0]) : ComJrmcRei.getCommandSenderAsPlayer((ICommandSender)commandSender);
        String entitycommansender = "Console";
        try {
            EntityPlayerMP commansender = ComJrmcRei.getCommandSenderAsPlayer((ICommandSender)commandSender);
            entitycommansender = commansender.getCommandSenderName();
        }
        catch (Exception commansender) {
            // empty catch block
        }
        boolean n = entitycommansender.equals("Console") ? JRMCoreConfig.ComSENAC : (entitycommansender.equals(entityplayermp.getCommandSenderName()) ? JRMCoreConfig.ComSENAS : JRMCoreConfig.ComSENAO);
        boolean keepSkills = false;
        if (stringArray.length > 2) {
            keepSkills = stringArray[2].toLowerCase().contentEquals("true");
        }
        boolean keepTechs = false;
        if (stringArray.length > 3) {
            keepTechs = stringArray[3].toLowerCase().contentEquals("true");
        }
        boolean keepMasteries = false;
        if (stringArray.length > 4) {
            keepMasteries = stringArray[4].toLowerCase().contentEquals("true");
        }
        float per = 0.1f;
        if (stringArray.length > 1) {
            per = (float)Integer.parseInt(stringArray[1]) * 0.01001f;
            float f = per > 1.0f ? 1.0f : (per = per < 0.0f ? 0.0f : per);
        }
        if (entityplayermp != null) {
            JRMCoreH.setInt(1, (EntityPlayer)entityplayermp, "jrmcRencrnt");
            for (int j = 0; j < 6; ++j) {
                int i = (int)((float)JRMCoreH.getInt((EntityPlayer)entityplayermp, JRMCoreH.AttrbtNbtI[j]) * per);
                JRMCoreH.setInt(i, (EntityPlayer)entityplayermp, JRMCoreH.AttrbtNbtR[j]);
            }
            JRMCoreH.resetChar((EntityPlayer)entityplayermp, keepSkills, keepTechs, keepMasteries, per);
            String t = "You have been reincarnated, you kept " + (int)(per * 100.0f) + "%% of attributes and learnable skills " + (keepSkills ? "have been kept" : "has been removed") + ".";
            entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
            if (n) {
                this.notifyAdmins(commandSender, "%s has been reincarnated with %s%% of attributes and learnable skills " + (keepSkills ? "have been kept" : "has been removed") + ".", new Object[]{entityplayermp.getCommandSenderName(), (int)(per * 100.0f)});
            }
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComJrmcRei.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public String getCommandUsage(ICommandSender icommandsender) {
        return "/jrmcrei (playerName) [keepAttributePercentage] [keepSkillsBoolean] [keepTechsBoolean] [KeepFormMasteriesBoolean]";
    }

    public List addTabCompletionOptions(ICommandSender commandSender, String[] stringArray) {
        int length = stringArray.length;
        switch (length) {
            case 1: {
                return ComJrmcRei.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.getListOfPlayers());
            }
            case 2: {
                return ComJrmcRei.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.VALUES);
            }
            case 3: {
                return ComJrmcRei.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.BOOLEANS);
            }
            case 4: {
                return ComJrmcRei.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.BOOLEANS);
            }
            case 5: {
                return ComJrmcRei.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.BOOLEANS);
            }
        }
        return null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int par1) {
        return par1 == 0;
    }
}

