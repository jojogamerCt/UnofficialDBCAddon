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
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;

public class ComJrmcStatusEffect
extends CommandBase {
    private final String[] MODES = new String[]{"set"};
    private final String[] STATUS = new String[]{"Strain", "GodPower", "Fatigue", "NoFuse", "Majin", "Legendary", "Divine", "Pain", "Heat", "KO", "GodOfDestruction"};
    private final String[] TIME = new String[]{"0", "1", "100"};
    private final String[] statusEffectNBT = new String[]{"jrmcStrain", "jrmcGodPwr", "jrmcGodStrain", "jrmcFuzion", "jrmcMajin", "", "", "jrmcGyJ7dp", "jrmcEf8slc", "jrmcHar4va"};

    public String getCommandName() {
        return "jrmcse";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] stringArray) {
        if (stringArray.length < 3) {
            String list = "";
            for (int i = 0; i < this.STATUS.length; ++i) {
                list = list + ", " + this.STATUS[i];
            }
            throw new WrongUsageException("/jrmcse set (statusEffectName) (Minutes) [playerName] --> StatusEffectName can be: " + list, new Object[0]);
        }
        EntityPlayerMP entityplayermp = stringArray.length > 3 ? ComJrmcStatusEffect.getPlayer((ICommandSender)par1ICommandSender, (String)stringArray[3]) : ComJrmcStatusEffect.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        String entitycommansender = "Console";
        try {
            EntityPlayerMP commansender = ComJrmcStatusEffect.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
            entitycommansender = commansender.getCommandSenderName();
        }
        catch (Exception commansender) {
            // empty catch block
        }
        boolean n = entitycommansender.equals("Console") ? JRMCoreConfig.ComSENAC : (entitycommansender.equals(entityplayermp.getCommandSenderName()) ? JRMCoreConfig.ComSENAS : JRMCoreConfig.ComSENAO);
        String s = stringArray[0];
        boolean set = s.toLowerCase().contentEquals("set");
        s = stringArray[2];
        float value = Float.parseFloat(s);
        if (set) {
            int id = -1;
            for (int i = 0; i < this.STATUS.length; ++i) {
                if (!stringArray[1].toLowerCase().equals(this.STATUS[i].toLowerCase())) continue;
                id = i;
                break;
            }
            if (id == 5) {
                JRMCoreH.StusEfcts(14, (EntityPlayer)entityplayermp, value != 0.0f);
                String t = "Status Effect " + this.STATUS[id] + " has been " + (value == 0.0f ? "removed" : "added") + ".";
                entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
                if (n) {
                    this.notifyAdmins(par1ICommandSender, "%s's Status Effect %s has been " + (value == 0.0f ? "removed" : "added") + ".", new Object[]{entityplayermp.getCommandSenderName(), this.STATUS[id], Float.valueOf(value)});
                }
            } else if (id == 4) {
                JRMCoreH.StusEfcts(12, (EntityPlayer)entityplayermp, value != 0.0f);
                String t = "Status Effect " + this.STATUS[id] + " has been " + (value == 0.0f ? "removed" : "added") + ".";
                entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
                if (n) {
                    this.notifyAdmins(par1ICommandSender, "%s's Status Effect %s has been " + (value == 0.0f ? "removed" : "added") + ".", new Object[]{entityplayermp.getCommandSenderName(), this.STATUS[id], Float.valueOf(value)});
                }
            } else if (id == 6) {
                JRMCoreH.StusEfcts(17, (EntityPlayer)entityplayermp, value != 0.0f);
                String t = "Status Effect " + this.STATUS[id] + " has been " + (value == 0.0f ? "removed" : "added") + ".";
                entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
                if (n) {
                    this.notifyAdmins(par1ICommandSender, "%s's Status Effect %s has been " + (value == 0.0f ? "removed" : "added") + ".", new Object[]{entityplayermp.getCommandSenderName(), this.STATUS[id], Float.valueOf(value)});
                }
            } else if (id == 10) {
                JRMCoreH.StusEfcts(20, (EntityPlayer)entityplayermp, value != 0.0f);
                String t = "Status Effect " + this.STATUS[id] + " has been " + (value == 0.0f ? "removed" : "added") + ".";
                entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
                if (n) {
                    this.notifyAdmins(par1ICommandSender, "%s's Status Effect %s has been " + (value == 0.0f ? "removed" : "added") + ".", new Object[]{entityplayermp.getCommandSenderName(), this.STATUS[id], Float.valueOf(value)});
                }
            } else if (id >= 0) {
                if (id == 3) {
                    String f = JRMCoreH.getString((EntityPlayer)entityplayermp, this.statusEffectNBT[id]);
                    if (!f.contains(",")) {
                        JRMCoreH.setString("" + (int)(value * 60.0f / 5.0f), (EntityPlayer)entityplayermp, this.statusEffectNBT[id]);
                    }
                } else {
                    JRMCoreH.setInt(value * 60.0f / 5.0f, (EntityPlayer)entityplayermp, this.statusEffectNBT[id]);
                }
                if (this.statusEffectNBT[id].equals("jrmcGyJ7dp")) {
                    NBTTagCompound nbt = JRMCoreH.nbt((Entity)entityplayermp, "pres");
                    if (value > 0.0f) {
                        nbt.setInteger("jrmcUIWasInPainDuration", 0);
                        nbt.setByte("jrmcUIWasInPain", (byte)1);
                    }
                } else if (this.statusEffectNBT[id].equals("jrmcEf8slc")) {
                    NBTTagCompound nbt = JRMCoreH.nbt((Entity)entityplayermp, "pres");
                    nbt.setDouble("jrmcEf8slcD", 0.0);
                }
                String t = "Status Effect " + this.STATUS[id] + " has been set to " + value + " mins.";
                entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
                if (n) {
                    this.notifyAdmins(par1ICommandSender, "%s's Status Effect %s has been set to %s mins.", new Object[]{entityplayermp.getCommandSenderName(), this.STATUS[id], Float.valueOf(value)});
                }
            }
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComJrmcStatusEffect.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public String getCommandUsage(ICommandSender icommandsender) {
        return "/jrmcse set (statusEffectName) (TimeValue) [playerName]";
    }

    public List addTabCompletionOptions(ICommandSender commandSender, String[] stringArray) {
        int length = stringArray.length;
        switch (length) {
            case 1: {
                return ComJrmcStatusEffect.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.MODES);
            }
            case 2: {
                return ComJrmcStatusEffect.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.STATUS);
            }
            case 3: {
                return ComJrmcStatusEffect.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.TIME);
            }
            case 4: {
                return ComJrmcStatusEffect.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.getListOfPlayers());
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

