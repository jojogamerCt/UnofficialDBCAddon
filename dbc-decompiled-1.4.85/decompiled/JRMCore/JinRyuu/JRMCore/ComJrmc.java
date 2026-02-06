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
 *  net.minecraft.util.ChatComponentTranslation
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreH2;
import cpw.mods.fml.common.FMLCommonHandler;
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

public class ComJrmc
extends CommandBase {
    public String getCommandName() {
        return "jrmc";
    }

    public String getCommandUsage(ICommandSender icommandsender) {
        return "Use '/jrmc startnew' to Start from the begining, resetting attributes and character look.and Use '/dbc accept' to accept offers like revive with teleport.";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }

    public boolean canCommandSenderUseCommand(ICommandSender par1ICommandSender) {
        return true;
    }

    private NBTTagCompound nbt(EntityPlayer p, String s) {
        return JRMCoreH.nbt((Entity)p, s);
    }

    public void processCommand(ICommandSender commandSender, String[] stringArray) {
        if (stringArray.length <= 0) {
            throw new WrongUsageException(this.getCommandUsage(commandSender), new Object[0]);
        }
        EntityPlayerMP entityplayermp = stringArray.length > 1 ? ComJrmc.getPlayer((ICommandSender)commandSender, (String)stringArray[1]) : ComJrmc.getCommandSenderAsPlayer((ICommandSender)commandSender);
        byte pwrtyp = JRMCoreH.getByte((EntityPlayer)entityplayermp, "jrmcPwrtyp");
        String s = stringArray[0];
        boolean startnew = s.toLowerCase().contains("startnew");
        boolean heal = false;
        boolean accept = s.toLowerCase().contains("accept");
        boolean decline = s.toLowerCase().contains("decline");
        if (entityplayermp != null && JRMCoreConfig.osbic > 0 && JRMCoreH.osbic.get(entityplayermp.getCommandSenderName()) < JRMCoreConfig.osbic * 20) {
            entityplayermp.addChatMessage(new ChatComponentTranslation("Offline Protection: " + ((int)((float)(JRMCoreConfig.osbic * 20 - JRMCoreH.osbic.get(entityplayermp.getCommandSenderName())) * 0.05f) + 1) + "s left", new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
            return;
        }
        if (startnew) {
            EntityPlayerMP Player = entityplayermp;
            if (JRMCoreH.DBC()) {
                if (!JRMCoreH.isFused((Entity)Player)) {
                    JRMCoreH.resetChar((EntityPlayer)Player);
                    this.notifyAdmins(commandSender, "Resetting attributes and character look has been processed.", new Object[]{entityplayermp.getCommandSenderName()});
                } else {
                    this.notifyAdmins(commandSender, "Unable to reset attributes and character look while fused.", new Object[]{entityplayermp.getCommandSenderName()});
                }
            }
        } else if (accept || decline) {
            MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
            EntityPlayerMP p = entityplayermp;
            String toteach1 = JRMCoreH.getString((EntityPlayer)p, "jrmcTechLearn");
            if (toteach1.contains(";:;")) {
                String[] toteach = toteach1.split(";:;");
                String[] tn = toteach[0].split(";");
                EntityPlayerMP teacher = JRMCoreH.getPlayerForUsername(server, toteach[1]);
                if (teacher != null && p.getDistanceToEntity((Entity)teacher) < 8.0f && accept) {
                    if (pwrtyp == 1) {
                        int b = 0;
                        boolean may = false;
                        for (int i = 0; i < 4; ++i) {
                            String s1 = JRMCoreH.getString((EntityPlayer)p, JRMCoreH.techNbt[i]);
                            if (!s1.contains(";")) {
                                b = i;
                                may = true;
                                break;
                            }
                            may = false;
                        }
                        if (may) {
                            int costTp = JRMCoreH.techDBCtpc(tn, true) * 2;
                            int tp = JRMCoreH.getInt((EntityPlayer)p, "jrmcTpint");
                            if (tp - costTp >= 0) {
                                JRMCoreH.setInt(tp - costTp, (EntityPlayer)p, "jrmcTpint");
                                JRMCoreH.setString(toteach[0], (EntityPlayer)p, JRMCoreH.techNbt[b]);
                                teacher.addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai("jrmc", "teachingOfferAccepted"), new Object[]{p.getCommandSenderName(), tn[0]}).setChatStyle(JRMCoreH2.styl_ylw));
                                p.addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai("jrmc", "techadded"), new Object[]{tn[0]}).setChatStyle(JRMCoreH2.styl_ylw));
                            } else {
                                p.addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai("jrmc", "notenoughtp"), new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
                            }
                        } else {
                            p.addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai("jrmc", "noslotleft"), new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
                        }
                    }
                } else if (toteach1.contains(";:;") && decline) {
                    JRMCoreH.setString(" ", (EntityPlayer)p, "jrmcTechLearn");
                    p.addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai("jrmc", "teachingOfDeclByYou"), new Object[]{toteach[1], tn[0]}).setChatStyle(JRMCoreH2.styl_ylw));
                    if (teacher != null) {
                        teacher.addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai("jrmc", "teachingOfDeclByPlayr"), new Object[]{p.getCommandSenderName()}).setChatStyle(JRMCoreH2.styl_ylw));
                    }
                } else {
                    JRMCoreH.setString(" ", (EntityPlayer)p, "jrmcTechLearn");
                    p.addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai("jrmc", "teachingOfferDeclined"), new Object[]{toteach[1], tn[0]}).setChatStyle(JRMCoreH2.styl_ylw));
                }
            } else {
                p.addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai("jrmc", "nothingtoaccept"), new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
            }
        } else {
            EntityPlayerMP p = entityplayermp;
            p.addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai("jrmc", "typedWrong"), new Object[0]).setChatStyle(JRMCoreH2.styl_red));
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComJrmc.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }
}

