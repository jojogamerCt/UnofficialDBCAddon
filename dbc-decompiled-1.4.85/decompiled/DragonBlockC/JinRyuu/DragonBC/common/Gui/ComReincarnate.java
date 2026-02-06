/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreHDBC
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.command.WrongUsageException
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.EnumChatFormatting
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHDBC;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;

public class ComReincarnate
extends CommandBase {
    public String getCommandName() {
        return "dbcreincarnate";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        if (par2ArrayOfStr.length < 0) {
            throw new WrongUsageException("/dbcreincarnate [playerName]", new Object[0]);
        }
        EntityPlayerMP p = par2ArrayOfStr.length > 0 ? ComReincarnate.getPlayer((ICommandSender)par1ICommandSender, (String)par2ArrayOfStr[0]) : ComReincarnate.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        if (!JRMCoreH.isFused((Entity)p)) {
            JRMCoreHDBC.reincarnate((EntityPlayer)p);
            String t = JRMCoreH.trlai((String)"dbc", (String)"reincarnated");
            ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
            p.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(color));
            this.notifyAdmins(par1ICommandSender, "%s reincarnated!", new Object[]{p.getCommandSenderName()});
        } else {
            this.notifyAdmins(par1ICommandSender, "Unable to reincarnate while fused.", new Object[]{p.getCommandSenderName()});
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComReincarnate.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public String getCommandUsage(ICommandSender icommandsender) {
        return "/dbcreincarnate (playerName)";
    }

    public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        return par2ArrayOfStr.length == 1 ? ComReincarnate.getListOfStringsMatchingLastWord((String[])par2ArrayOfStr, (String[])this.getListOfPlayers()) : null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int par1) {
        return par1 == 0;
    }
}

