/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.command.WrongUsageException
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.EnumChatFormatting
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.JRMCore.JRMCoreH;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;

public class ComRevive
extends CommandBase {
    public String getCommandName() {
        return "dbcrevive";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        if (par2ArrayOfStr.length < 0) {
            throw new WrongUsageException("/dbcrevive (playerName)", new Object[0]);
        }
        EntityPlayerMP entityplayermp = par2ArrayOfStr.length > 0 ? ComRevive.getPlayer((ICommandSender)par1ICommandSender, (String)par2ArrayOfStr[0]) : ComRevive.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        JRMCoreH.setInt((int)0, (EntityPlayer)entityplayermp, (String)"jrmcReviveTmer");
        String t = JRMCoreH.trlai((String)"dbc", (String)"canrevivenow");
        ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
        entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(color));
        this.notifyAdmins(par1ICommandSender, "%s can revive now.", new Object[]{entityplayermp.getCommandSenderName()});
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComRevive.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public String getCommandUsage(ICommandSender icommandsender) {
        return "/dbcrevive (playerName)";
    }

    public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        return par2ArrayOfStr.length == 1 ? ComRevive.getListOfStringsMatchingLastWord((String[])par2ArrayOfStr, (String[])this.getListOfPlayers()) : null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int par1) {
        return par1 == 0;
    }
}

