/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreHDBC
 *  cpw.mods.fml.common.FMLCommonHandler
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.command.WrongUsageException
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.StatCollector
 *  net.minecraft.world.Teleporter
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.Worlds.WorldTeleporterDBCTelep;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHDBC;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.Teleporter;

public class ComDbc
extends CommandBase {
    public String getCommandName() {
        return "dbc";
    }

    public String getCommandUsage(ICommandSender icommandsender) {
        return "Use '/dbc locations' or '/dbc loc' to receive the locations in DBC and Use '/dbc accept' to accept offers like revive with teleport.";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }

    public boolean canCommandSenderUseCommand(ICommandSender par1ICommandSender) {
        return true;
    }

    private NBTTagCompound nbt(EntityPlayer p, String s) {
        return JRMCoreH.nbt((Entity)p, (String)s);
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        if (par2ArrayOfStr.length <= 0) {
            throw new WrongUsageException("Use '/dbc locations' or '/dbc loc' to receive the locations in DBC and Use '/dbc accept' to accept offers like revive with teleport.", new Object[0]);
        }
        EntityPlayerMP entityplayermp = ComDbc.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        String s = par2ArrayOfStr[0];
        boolean loc = s.toLowerCase().contains("locations") || s.toLowerCase().contains("loc");
        boolean accept = s.toLowerCase().contains("accept");
        boolean heal = false;
        if (loc) {
            ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
            if (entityplayermp.dimension == 0) {
                String[] kamh = DBCH.genKH.split(";");
                String[] clar = DBCH.genCA.split(";");
                String[] gkhs = DBCH.genGH.split(";");
                String[] bs2 = DBCH.genBS.split(";");
                entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.coords")).setChatStyle(color));
                entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.kami")).setChatStyle(color));
                if (kamh.length > 2) {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.kame") + ": " + (JRMCoreH.parseInt((String)kamh[0]) + DBCH.genKHnpc1[0]) + " " + (JRMCoreH.parseInt((String)kamh[1]) + DBCH.genKHnpc1[1]) + " " + (JRMCoreH.parseInt((String)kamh[2]) + DBCH.genKHnpc1[2])).setChatStyle(color));
                } else {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.kamenotexp")).setChatStyle(color));
                }
                if (clar.length > 2) {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.cell") + ": " + (JRMCoreH.parseInt((String)clar[0]) + DBCH.genCAnpc1[0]) + " " + (JRMCoreH.parseInt((String)clar[1]) + DBCH.genCAnpc1[1]) + " " + (JRMCoreH.parseInt((String)clar[2]) + DBCH.genCAnpc1[2])).setChatStyle(color));
                } else {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.cellnotexp")).setChatStyle(color));
                }
                if (gkhs.length > 2) {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.goku") + ": " + (JRMCoreH.parseInt((String)gkhs[0]) + DBCH.genGHnpc1[0]) + " " + (JRMCoreH.parseInt((String)gkhs[1]) + DBCH.genGHnpc1[1]) + " " + (JRMCoreH.parseInt((String)gkhs[2]) + DBCH.genGHnpc1[2])).setChatStyle(color));
                } else {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.gokunotexp")).setChatStyle(color));
                }
                if (bs2.length > 2) {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.babidi") + ": " + (JRMCoreH.parseInt((String)bs2[0]) + DBCH.genBSnpc1[0]) + " " + (JRMCoreH.parseInt((String)bs2[1]) + DBCH.genBSnpc1[1]) + " " + (JRMCoreH.parseInt((String)bs2[2]) + DBCH.genBSnpc1[2])).setChatStyle(color));
                } else {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.babidinotexp")).setChatStyle(color));
                }
            }
            if (entityplayermp.dimension == DBCConfig.planetNamek) {
                String fzsp = DBCH.genFS.replace(";", " ");
                String guru = DBCH.genGuru.replace(";", " ");
                entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.coords")).setChatStyle(color));
                if (fzsp.length() > 3) {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.freeza") + ": " + fzsp).setChatStyle(color));
                } else {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.freezanotexp")).setChatStyle(color));
                }
                entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.coords")).setChatStyle(color));
                if (guru.length() > 3) {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.guruhouse") + ": " + guru).setChatStyle(color));
                } else {
                    entityplayermp.addChatMessage(new ChatComponentText(StatCollector.translateToLocal((String)"dbc.com.loc.guruhousenotexp")).setChatStyle(color));
                }
            }
        }
        if (accept) {
            String[] sa;
            MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
            EntityPlayerMP p = entityplayermp;
            if (p.dimension == DBCConfig.otherWorld && p != null && p.ridingEntity == null && p.riddenByEntity == null && (sa = JRMCoreH.getString((EntityPlayer)p, (String)"jrmcRevtpInit").split(";")).length > 3) {
                EntityPlayerMP target;
                String wisherNam = sa[0];
                int reviveDim = Integer.parseInt(sa[1]);
                int x = Integer.parseInt(sa[2]);
                int y = Integer.parseInt(sa[3]);
                int z = Integer.parseInt(sa[4]);
                JRMCoreH.setByte((int)0, (EntityPlayer)p, (String)"jrmcAlv");
                server.getConfigurationManager().transferPlayerToDimension(p, reviveDim, (Teleporter)new WorldTeleporterDBCTelep(server.worldServerForDimension(reviveDim)));
                p.addExperience(1);
                double[] d = new double[]{x, y, z};
                p.playerNetServerHandler.setPlayerLocation(d[0], d[1], d[2], 0.0f, 0.0f);
                mod_DragonBC.logger.info(p.getCommandSenderName() + " revived by " + wisherNam + "!");
                if (JRMCoreHDBC.DBCgetConfigDeadInv() && p.worldObj.getGameRules().getGameRuleBooleanValue("keepInventory") && !p.capabilities.isCreativeMode && JRMCoreH.getByte((EntityPlayer)p, (String)"jrmcAlv") == 1) {
                    JRMCoreH.nbt((EntityPlayer)p).setTag("InventoryDead", (NBTBase)p.inventory.writeToNBT(new NBTTagList()));
                    p.inventory.readFromNBT(JRMCoreH.nbt((EntityPlayer)p).getTagList("InventoryLiving", 10));
                    p.getEntityData().setTag("Inventory", (NBTBase)p.inventory.writeToNBT(new NBTTagList()));
                }
                if ((target = JRMCoreH.getPlayerForUsername((MinecraftServer)server, (String)wisherNam)) != null) {
                    String t = JRMCoreH.trlai((String)"dbc", (String)"reviveaccepted");
                    ChatStyle styl = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                    target.addChatMessage(new ChatComponentTranslation(t, new Object[]{p.getCommandSenderName(), JRMCoreH.trl((String)"dbc", (String)DBCH.plntNms.get(reviveDim)), x + ", " + y + ", " + z}).setChatStyle(styl));
                }
            }
            JRMCoreH.setString((String)"e", (EntityPlayer)p, (String)"jrmcRevtpInit");
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComDbc.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }
}

