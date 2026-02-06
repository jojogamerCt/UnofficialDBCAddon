/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreConfig
 *  JinRyuu.JRMCore.JRMCoreH
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
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.EnumChatFormatting
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
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
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;

public class ComSkill
extends CommandBase {
    public String getCommandName() {
        return "dbcskill";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new WrongUsageException(this.getCommandUsage(par1ICommandSender), new Object[0]);
        }
        String s = stringArray[0];
        boolean give = s.toLowerCase().contentEquals("give");
        boolean givelvl = s.toLowerCase().contentEquals("givelvl");
        boolean take = s.toLowerCase().contentEquals("take");
        boolean all = stringArray[1].toLowerCase().contentEquals("all");
        int id = -1;
        if (!all) {
            for (int i = 0; i < JRMCoreH.DBCSkillNames.length; ++i) {
                if (!stringArray[1].toLowerCase().equals(JRMCoreH.DBCSkillNames[i].toLowerCase())) continue;
                id = i;
                break;
            }
        }
        EntityPlayerMP entityplayermp = stringArray.length > (givelvl ? 3 : 2) ? ComSkill.getPlayer((ICommandSender)par1ICommandSender, (String)stringArray[givelvl ? 3 : 2]) : ComSkill.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        String entitycommansender = "Console";
        try {
            EntityPlayerMP commansender = ComSkill.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
            entitycommansender = commansender.getCommandSenderName();
        }
        catch (Exception commansender) {
            // empty catch block
        }
        boolean n = entitycommansender.equals("Console") ? JRMCoreConfig.ComANAC : (entitycommansender.equals(entityplayermp.getCommandSenderName()) ? JRMCoreConfig.ComANAS : JRMCoreConfig.ComANAO);
        NBTTagCompound nbt = JRMCoreH.nbt((Entity)entityplayermp, (String)"pres");
        EntityPlayerMP p = entityplayermp;
        byte pwrtyp = JRMCoreH.getByte((EntityPlayer)p, (String)"jrmcPwrtyp");
        byte rc = JRMCoreH.getByte((EntityPlayer)p, (String)"jrmcRace");
        int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts((EntityPlayer)entityplayermp);
        String[] PlyrSkills = nbt.getString("jrmcSSlts").split(",");
        int PlyrSkills_Amount = PlyrSkills.length;
        String[] skls = JRMCoreH.DBCSkillsIDs;
        String[] sklsNms = JRMCoreH.DBCSkillNames;
        if (id >= 0 || all) {
            if (give || givelvl) {
                int i;
                boolean stop = false;
                if (all && givelvl) {
                    for (i = 0; i < JRMCoreH.DBCSkillNames.length; i = (int)((byte)(i + 1))) {
                        for (int j = 0; j < PlyrSkills_Amount; ++j) {
                            int re;
                            if (!PlyrSkills[j].contains(skls[i])) continue;
                            boolean po = stringArray[2].contains("+");
                            boolean ne = stringArray[2].contains("-");
                            int lv = Integer.parseInt(stringArray[2]);
                            int slv = JRMCoreH.SklLvl((int)j, (int)1, (String[])PlyrSkills) - 1;
                            int n2 = re = po || ne ? slv + lv : lv - 1;
                            re = re > 9 ? 9 : (re < 0 ? 0 : re);
                            String sn2 = JRMCoreH.cleanUpCommas((String)nbt.getString("jrmcSSlts").replaceAll(PlyrSkills[j], skls[i] + re));
                            nbt.setString("jrmcSSlts", sn2);
                            String t = JRMCoreH.trlai((String)"jrmc", (String)"skillupped");
                            ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                            entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[]{sklsNms[i], re + 1}).setChatStyle(color));
                            if (!n) continue;
                            this.notifyAdmins(par1ICommandSender, "%s has upgraded skill %s to lvl %s", new Object[]{entityplayermp.getCommandSenderName(), sklsNms[i], re + 1});
                        }
                    }
                } else if (id >= 0) {
                    for (i = 0; i < PlyrSkills_Amount; i = (int)((byte)(i + 1))) {
                        int re;
                        if (!PlyrSkills[i].contains(skls[id]) || !(stop = true) || !givelvl) continue;
                        boolean po = stringArray[2].contains("+");
                        boolean ne = stringArray[2].contains("-");
                        int lv = Integer.parseInt(stringArray[2]);
                        int slv = JRMCoreH.SklLvl((int)id, (int)1, (String[])PlyrSkills) - 1;
                        int n3 = re = po || ne ? slv + lv : lv - 1;
                        re = re > 9 ? 9 : (re < 0 ? 0 : re);
                        String sn2 = JRMCoreH.cleanUpCommas((String)nbt.getString("jrmcSSlts").replaceAll(PlyrSkills[i], skls[id] + re));
                        nbt.setString("jrmcSSlts", sn2);
                        String t = JRMCoreH.trlai((String)"jrmc", (String)"skillupped");
                        ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                        entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[]{sklsNms[id], re + 1}).setChatStyle(color));
                        if (n) {
                            this.notifyAdmins(par1ICommandSender, "%s has upgraded skill %s to lvl %s", new Object[]{entityplayermp.getCommandSenderName(), sklsNms[id], re + 1});
                        }
                        return;
                    }
                }
                if (stop) {
                    String t = JRMCoreH.trlai((String)"jrmc", (String)"alreadyhaveskill");
                    ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                    entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(color));
                    if (n) {
                        this.notifyAdmins(par1ICommandSender, "%s already has skill %s", new Object[]{entityplayermp.getCommandSenderName(), sklsNms[id]});
                    }
                } else {
                    PlyrSkills = nbt.getString("jrmcSSlts").split(",");
                    PlyrSkills_Amount = PlyrSkills.length;
                    if (all) {
                        for (i = 0; i < JRMCoreH.DBCSkillNames.length; i = (int)((byte)(i + 1))) {
                            boolean have = false;
                            for (int j = 0; j < PlyrSkills_Amount; ++j) {
                                if (!PlyrSkills[j].contains(skls[i])) continue;
                                have = true;
                            }
                            if (have) continue;
                            int re = 0;
                            if (givelvl) {
                                boolean po = stringArray[2].contains("+");
                                boolean ne = stringArray[2].contains("-");
                                int lv = Integer.parseInt(stringArray[2]);
                                int slv = 0;
                                int n4 = re = po || ne ? slv + lv : lv - 1;
                                re = re > 9 ? 9 : (re < 0 ? 0 : re);
                            }
                            nbt.setString("jrmcSSlts", JRMCoreH.cleanUpCommas((String)(nbt.getString("jrmcSSlts") + "," + skls[i] + re)));
                            String t = JRMCoreH.trlai((String)"jrmc", (String)"skilladded");
                            ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                            entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[]{sklsNms[i]}).setChatStyle(color));
                            if (!n) continue;
                            this.notifyAdmins(par1ICommandSender, "%s has received skill %s to lvl %s", new Object[]{entityplayermp.getCommandSenderName(), sklsNms[i], re + 1});
                        }
                    } else {
                        int re = 0;
                        if (givelvl) {
                            boolean po = stringArray[2].contains("+");
                            boolean ne = stringArray[2].contains("-");
                            int lv = Integer.parseInt(stringArray[2]);
                            int slv = 0;
                            int n5 = re = po || ne ? slv + lv : lv - 1;
                            re = re > 9 ? 9 : (re < 0 ? 0 : re);
                        }
                        nbt.setString("jrmcSSlts", JRMCoreH.cleanUpCommas((String)(nbt.getString("jrmcSSlts") + "," + skls[id] + re)));
                        String t = JRMCoreH.trlai((String)"jrmc", (String)"skilladded");
                        ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                        entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[]{sklsNms[id]}).setChatStyle(color));
                        if (n) {
                            this.notifyAdmins(par1ICommandSender, "%s has received skill %s to lvl %s", new Object[]{entityplayermp.getCommandSenderName(), sklsNms[id], re + 1});
                        }
                    }
                }
            }
            if (take) {
                if (id >= 0) {
                    for (int i = 0; i < PlyrSkills_Amount; i = (int)((byte)(i + 1))) {
                        String sn2;
                        if (!PlyrSkills[i].contains(skls[id])) continue;
                        if (id == 8) {
                            JRMCoreH.PlyrSettingsRem((NBTTagCompound)nbt, (int)0);
                        }
                        if (id == 16) {
                            JRMCoreH.PlyrSettingsRem((NBTTagCompound)nbt, (int)11);
                        }
                        if (id == 18) {
                            JRMCoreH.PlyrSettingsRem((NBTTagCompound)nbt, (int)16);
                        }
                        nbt.setString("jrmcSSlts", (sn2 = JRMCoreH.cleanUpCommas((String)nbt.getString("jrmcSSlts").replaceAll(PlyrSkills[i], ""))).length() < 3 ? "," : sn2);
                        String skl = sklsNms[id];
                        String t = "Skill " + skl + " removed";
                        ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                        entityplayermp.addChatMessage(new ChatComponentText(t).setChatStyle(color));
                        if (!n) continue;
                        this.notifyAdmins(par1ICommandSender, "%s's skill %s has been removed!", new Object[]{entityplayermp.getCommandSenderName(), skl});
                    }
                } else {
                    nbt.setString("jrmcSSlts", ",");
                    String t = JRMCoreH.trlai((String)"jrmc", (String)"skillallremoved");
                    ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                    entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(color));
                    if (n) {
                        this.notifyAdmins(par1ICommandSender, "%s's all skill has been removed!", new Object[]{entityplayermp.getCommandSenderName()});
                    }
                }
            }
        } else {
            String t = JRMCoreH.trlai((String)"jrmc", (String)"skillnameinvalid");
            ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
            entityplayermp.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(color));
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComSkill.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public String getSkillList() {
        String list = "";
        for (int i = 0; i < JRMCoreH.DBCSkillNames.length; ++i) {
            list = list + ", " + JRMCoreH.DBCSkillNames[i];
        }
        return list;
    }

    public String getCommandUsage(ICommandSender icommandsender) {
        String list = this.getSkillList();
        return "/dbcskill (give or take) (skillName) [playerName] OR /dbcskill take all [playerName] OR /dbcskill givelvl (skillName) (lvl 1-10) [playerName] --> skillNames can be: " + list;
    }

    public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] arrayString) {
        int length = arrayString.length;
        switch (length) {
            case 1: {
                return ComSkill.getListOfStringsMatchingLastWord((String[])arrayString, (String[])new String[]{"give", "take", "givelvl"});
            }
            case 2: {
                return ComSkill.getListOfStringsMatchingLastWord((String[])arrayString, (String[])this.getSkillList().split(", "));
            }
            case 3: {
                String[] stringArray;
                if (arrayString[0].equals("givelvl")) {
                    String[] stringArray2 = new String[1];
                    stringArray = stringArray2;
                    stringArray2[0] = "1";
                } else {
                    stringArray = this.getListOfPlayers();
                }
                return ComSkill.getListOfStringsMatchingLastWord((String[])arrayString, (String[])stringArray);
            }
            case 4: {
                return arrayString[0].equals("givelvl") ? ComSkill.getListOfStringsMatchingLastWord((String[])arrayString, (String[])this.getListOfPlayers()) : null;
            }
        }
        return null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int id) {
        return id == 0;
    }
}

