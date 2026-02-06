/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.server.MinecraftServer
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import java.util.HashMap;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;

public class ComJrmcRep
extends CommandBase {
    public static HashMap<String, Object[]> SList = new HashMap();

    public String getCommandName() {
        return "jrmcrepair";
    }

    public int getRequiredPermissionLevel() {
        return 1;
    }

    public String getCommandUsage(ICommandSender par1ICommandSender) {
        return "Usage: '/jrmcrepair [playerName]'";
    }

    public boolean canCommandSenderUseCommand(ICommandSender par1ICommandSender) {
        return true;
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        boolean n;
        String entitycommansender = "Console";
        try {
            EntityPlayerMP commansender = ComJrmcRep.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
            entitycommansender = commansender.getCommandSenderName();
        }
        catch (Exception commansender) {
            // empty catch block
        }
        EntityPlayerMP entityplayermp = par2ArrayOfStr.length > 0 ? ComJrmcRep.getPlayer((ICommandSender)par1ICommandSender, (String)par2ArrayOfStr[2]) : ComJrmcRep.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        NBTTagCompound nbt = JRMCoreH.nbt((Entity)entityplayermp, "pres");
        if (entityplayermp != null) {
            int i;
            for (i = 0; i < entityplayermp.inventory.armorInventory.length; ++i) {
                if (entityplayermp.inventory.armorInventory[i] == null) continue;
                entityplayermp.inventory.armorInventory[i].setItemDamage(0);
            }
            for (i = 0; i < 11; ++i) {
                if (ExtendedPlayer.get((EntityPlayer)entityplayermp).inventory.getStackInSlot(i) == null) continue;
                ExtendedPlayer.get((EntityPlayer)entityplayermp).inventory.getStackInSlot(i).setItemDamage(0);
            }
        }
        boolean bl = entitycommansender.equals("Console") ? JRMCoreConfig.ComHealNAC : (n = entitycommansender.equals(entityplayermp.getCommandSenderName()) ? JRMCoreConfig.ComHealNAS : JRMCoreConfig.ComHealNAO);
        if (n) {
            this.notifyAdmins(par1ICommandSender, "%s -> all equiped items were fixed!", new Object[]{entityplayermp.getCommandSenderName()});
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComJrmcRep.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        return par2ArrayOfStr.length == 2 ? ComJrmcRep.getListOfStringsMatchingLastWord((String[])par2ArrayOfStr, (String[])this.getListOfPlayers()) : null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int par1) {
        return par1 == 0;
    }
}

