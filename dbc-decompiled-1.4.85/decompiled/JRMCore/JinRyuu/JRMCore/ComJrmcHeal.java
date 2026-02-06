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
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
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

public class ComJrmcHeal
extends CommandBase {
    public static HashMap<String, Object[]> SList = new HashMap();

    public String getCommandName() {
        return "jrmcheal";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public String getCommandUsage(ICommandSender par1ICommandSender) {
        return "Usage: '/jrmcheal (energy, body, stamina, food, all) [amount] [playerName]'";
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        if (par2ArrayOfStr.length <= 0) {
            throw new WrongUsageException(this.getCommandUsage(par1ICommandSender), new Object[0]);
        }
        String entitycommansender = "Console";
        try {
            EntityPlayerMP commansender = ComJrmcHeal.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
            entitycommansender = commansender.getCommandSenderName();
        }
        catch (Exception commansender) {
            // empty catch block
        }
        boolean energy = par2ArrayOfStr.length > 0 && par2ArrayOfStr[0].equalsIgnoreCase("energy");
        boolean body = par2ArrayOfStr.length > 0 && par2ArrayOfStr[0].equalsIgnoreCase("body");
        boolean stamina = par2ArrayOfStr.length > 0 && par2ArrayOfStr[0].equalsIgnoreCase("stamina");
        boolean food = par2ArrayOfStr.length > 0 && par2ArrayOfStr[0].equalsIgnoreCase("food");
        boolean all = par2ArrayOfStr.length > 0 && par2ArrayOfStr[0].equalsIgnoreCase("all");
        int amount = 0;
        EntityPlayerMP entityplayermp = par2ArrayOfStr.length > 2 ? ComJrmcHeal.getPlayer((ICommandSender)par1ICommandSender, (String)par2ArrayOfStr[2]) : ComJrmcHeal.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        if (par2ArrayOfStr.length > 1) {
            amount = Integer.parseInt(par2ArrayOfStr[1]);
        }
        NBTTagCompound nbt = JRMCoreH.nbt((Entity)entityplayermp, "pres");
        if (body || all || stamina || food || energy) {
            boolean n;
            int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts((EntityPlayer)entityplayermp);
            byte pwr = JRMCoreH.getByte((EntityPlayer)entityplayermp, "jrmcPwrtyp");
            byte rce = JRMCoreH.getByte((EntityPlayer)entityplayermp, "jrmcRace");
            byte cls = JRMCoreH.getByte((EntityPlayer)entityplayermp, "jrmcClass");
            int maxBody = JRMCoreH.stat((Entity)entityplayermp, 2, pwr, 2, PlyrAttrbts[2], rce, cls, 0.0f);
            int curBody = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcBdy");
            int maxEnergy = JRMCoreH.stat((Entity)entityplayermp, 5, pwr, 5, PlyrAttrbts[5], rce, cls, JRMCoreH.SklLvl_KiBs((EntityPlayer)entityplayermp, (int)pwr));
            int curEnergy = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcEnrgy");
            int maxStam = JRMCoreH.stat((Entity)entityplayermp, 2, pwr, 3, PlyrAttrbts[2], rce, cls, 0.0f);
            int curStam = JRMCoreH.getInt((EntityPlayer)entityplayermp, "jrmcStamina");
            if (body || all) {
                JRMCoreH.setInt(amount == 0 ? maxBody : (curBody + amount > maxBody ? maxBody : curBody + amount), (EntityPlayer)entityplayermp, "jrmcBdy");
            }
            if (energy || all) {
                JRMCoreH.setInt(amount == 0 ? maxEnergy : (curEnergy + amount > maxEnergy ? maxEnergy : curEnergy + amount), (EntityPlayer)entityplayermp, "jrmcEnrgy");
            }
            if (stamina || all) {
                JRMCoreH.setInt(amount == 0 ? maxStam : (curStam + amount > maxStam ? maxStam : curStam + amount), (EntityPlayer)entityplayermp, "jrmcStamina");
            }
            if (body || all) {
                entityplayermp.setHealth(entityplayermp.getMaxHealth());
            }
            if (food || all) {
                entityplayermp.getFoodStats().addStats(20, 0.9f);
            }
            boolean bl = entitycommansender.equals("Console") ? JRMCoreConfig.ComHealNAC : (n = entitycommansender.equals(entityplayermp.getCommandSenderName()) ? JRMCoreConfig.ComHealNAS : JRMCoreConfig.ComHealNAO);
            if (n) {
                this.notifyAdmins(par1ICommandSender, "%s was healed %s %s by %s", new Object[]{entityplayermp.getCommandSenderName(), amount == 0 ? "max" : Integer.valueOf(amount), par2ArrayOfStr[0], entitycommansender});
            }
        } else {
            throw new WrongUsageException("%s failed to use jrmcheal stat!", new Object[]{entitycommansender, par2ArrayOfStr[0]});
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComJrmcHeal.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        return par2ArrayOfStr.length == 2 ? ComJrmcHeal.getListOfStringsMatchingLastWord((String[])par2ArrayOfStr, (String[])this.getListOfPlayers()) : null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int par1) {
        return par1 == 0;
    }
}

