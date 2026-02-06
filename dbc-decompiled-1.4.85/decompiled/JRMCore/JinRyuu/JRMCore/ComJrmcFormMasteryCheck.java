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

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.server.JGPlayerMP;
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

public class ComJrmcFormMasteryCheck
extends CommandBase {
    private final String name = "jrmcformmasterycheck";

    public String getCommandName() {
        return "jrmcformmasterycheck";
    }

    public String getCommandUsage(ICommandSender icommandsender) {
        return "/jrmcformmasterycheck [playerName]. ";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }

    public boolean canCommandSenderUseCommand(ICommandSender par1ICommandSender) {
        return true;
    }

    public List addTabCompletionOptions(ICommandSender commandSender, String[] stringArray) {
        int length = stringArray.length;
        switch (length) {
            case 1: {
                return ComJrmcFormMasteryCheck.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.getListOfPlayers());
            }
        }
        return null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    private NBTTagCompound nbt(EntityPlayer p, String s) {
        return JRMCoreH.nbt((Entity)p, s);
    }

    private void notifyAdmins(ICommandSender commandSender, String string, Object[] objects) {
        ComJrmcFormMasteryCheck.func_152373_a((ICommandSender)commandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public void processCommand(ICommandSender commandSender, String[] stringArray) {
        if (stringArray.length <= 0) {
            throw new WrongUsageException(this.getCommandUsage(commandSender), new Object[0]);
        }
        boolean playerNameID = false;
        EntityPlayerMP player = stringArray.length > 0 ? ComJrmcFormMasteryCheck.getPlayer((ICommandSender)commandSender, (String)stringArray[0]) : ComJrmcFormMasteryCheck.getCommandSenderAsPlayer((ICommandSender)commandSender);
        String entitycommansender = "Console";
        EntityPlayerMP commansender = null;
        try {
            commansender = ComJrmcFormMasteryCheck.getCommandSenderAsPlayer((ICommandSender)commandSender);
            entitycommansender = commansender.getCommandSenderName();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (player != null) {
            JGPlayerMP playerMP = new JGPlayerMP(player);
            NBTTagCompound nbt = this.nbt((EntityPlayer)player, "pres");
            playerMP.setNBT(nbt);
            byte race = playerMP.getRace();
            String[] masteries = JRMCoreH.getFormMasteryData((EntityPlayer)player).split(";");
            String masteryValues = "[Form Mastery Points]:";
            int length = masteries.length;
            int i = 0;
            for (String s : masteries) {
                String[] values = s.split(",");
                if (JRMCoreH.isRaceSaiyan(race) && (values[0].equals(JRMCoreH.trans[race][12]) || values[0].equals(JRMCoreH.trans[race][13]))) {
                    ++i;
                    continue;
                }
                masteryValues = masteryValues + " (" + values[0] + " Lvl: " + values[1] + ")" + (i + 1 < length ? "," : "");
                ++i;
            }
            if (commansender != null) {
                ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                commansender.addChatMessage(new ChatComponentText(masteryValues).setChatStyle(color));
            } else {
                JRMCoreH.log(masteryValues);
            }
        }
    }
}

