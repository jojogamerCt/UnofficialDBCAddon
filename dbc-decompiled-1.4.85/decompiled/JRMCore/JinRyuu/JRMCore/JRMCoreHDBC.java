/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.Blocks.BlocksDBC
 *  JinRyuu.DragonBC.common.DBCConfig
 *  JinRyuu.DragonBC.common.DBCH
 *  JinRyuu.DragonBC.common.DBCKiTech
 *  JinRyuu.DragonBC.common.Items.ItemsDBC
 *  JinRyuu.DragonBC.common.Npcs.EntityDBC
 *  JinRyuu.DragonBC.common.Npcs.EntityDBCEvil
 *  JinRyuu.DragonBC.common.Npcs.EntityDBCKami
 *  JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldier1
 *  JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldier2
 *  JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldier3
 *  JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldiers
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterBabidi
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterCell
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterEnma
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterFreeza
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterGohan
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterGoku
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterGuru
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterJin
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterKaio
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterKami
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterKarin
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterRoshi
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterTrunksFuture
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterWhis
 *  JinRyuu.DragonBC.common.Npcs.EntitySaibaiman
 *  JinRyuu.DragonBC.common.Villages.builds
 *  JinRyuu.DragonBC.common.Worlds.WorldGeneratorDB
 *  JinRyuu.DragonBC.common.Worlds.WorldTeleporterDBCTelep
 *  JinRyuu.DragonBC.common.mod_DragonBC
 *  cpw.mods.fml.common.FMLCommonHandler
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.Teleporter
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraftforge.event.entity.living.LivingDropsEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$Action
 */
package JinRyuu.JRMCore;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.DBCKiTech;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDBCEvil;
import JinRyuu.DragonBC.common.Npcs.EntityDBCKami;
import JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldier1;
import JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldier2;
import JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldier3;
import JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldiers;
import JinRyuu.DragonBC.common.Npcs.EntityMasterBabidi;
import JinRyuu.DragonBC.common.Npcs.EntityMasterCell;
import JinRyuu.DragonBC.common.Npcs.EntityMasterEnma;
import JinRyuu.DragonBC.common.Npcs.EntityMasterFreeza;
import JinRyuu.DragonBC.common.Npcs.EntityMasterGohan;
import JinRyuu.DragonBC.common.Npcs.EntityMasterGoku;
import JinRyuu.DragonBC.common.Npcs.EntityMasterGuru;
import JinRyuu.DragonBC.common.Npcs.EntityMasterJin;
import JinRyuu.DragonBC.common.Npcs.EntityMasterKaio;
import JinRyuu.DragonBC.common.Npcs.EntityMasterKami;
import JinRyuu.DragonBC.common.Npcs.EntityMasterKarin;
import JinRyuu.DragonBC.common.Npcs.EntityMasterRoshi;
import JinRyuu.DragonBC.common.Npcs.EntityMasterTrunksFuture;
import JinRyuu.DragonBC.common.Npcs.EntityMasterWhis;
import JinRyuu.DragonBC.common.Npcs.EntitySaibaiman;
import JinRyuu.DragonBC.common.Villages.builds;
import JinRyuu.DragonBC.common.Worlds.WorldGeneratorDB;
import JinRyuu.DragonBC.common.Worlds.WorldTeleporterDBCTelep;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreA;
import JinRyuu.JRMCore.JRMCoreComTickH;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreEH;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreSafe;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntitySafeZone;
import JinRyuu.JRMCore.p.DBC.DBCPwish;
import JinRyuu.JRMCore.p.PD;
import JinRyuu.JRMCore.server.config.dbc.JGConfigUltraInstinct;
import cpw.mods.fml.common.FMLCommonHandler;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class JRMCoreHDBC {
    public static final int Skl_GodFormLVLrequHN = 6;
    public static final int Skl_GodFormLVLrequA = 7;
    public static final int GodRacialRequirement = 6;
    public static final int Action_Kaioken = 1;
    public static final int Action_TransformType = 2;
    public static final int Action_GodForm = 3;
    public static final int Action_TailMode = 4;
    public static final int Action_ArcFace = 4;
    public static final int Action_Dodge = 5;
    public static final int Action_Descend = 6;
    public static final int Action_FlyMode = 7;
    public static final int Action_EnergyInfusedProjectile = 8;
    public static final int Action_Fuzion = 9;
    public static final int Action_Mystic = 10;
    public static final int Action_KiFist = 11;
    public static final int Action_KiProtection = 12;
    public static final int Action_UltraInstinct = 13;
    public static final int Action_FriendlyFist = 14;
    public static final int Action_KiSword = 15;
    public static final int Action_InstantTransShortTPMode = 16;
    public static final int Action_InstantTransSurroundMode = 17;
    public static final int Action_GodOfDestruction = 18;
    public static float gravityDev = 1.0f;
    public static float gravityDevCB = 0.0f;
    public static int dragonSum = 100;
    public static String[] ar = new String[]{"a", "i", "u", "e", "o"};

    public static int col_fe(int t, int d, int p, int r, int s, boolean v, boolean y, boolean ui) {
        return JRMCoreHDBC.getPlayerColor(t, d, p, r, s, v, y, ui, false, false);
    }

    public static int getPlayerColor2(int t, int d, int p, int r, int s, boolean v, boolean y, boolean ui, boolean gd) {
        return JRMCoreHDBC.getPlayerColor(t, d, p, r, s, v, y, ui, false, gd);
    }

    public static int col_fe(int t, int d, int p, int r, int s, boolean v, boolean y, boolean ui, boolean ui2) {
        return JRMCoreHDBC.getPlayerColor(t, d, p, r, s, v, y, ui, ui2, false);
    }

    public static int getPlayerColor(int type, int def, int p, int r, int s, boolean divine, boolean y, boolean ui, boolean ui2, boolean gd) {
        boolean ssb = s == 10;
        boolean ssbs = s == 15;
        boolean ss4 = s == 14;
        boolean ssg = JRMCoreHDBC.godKiUserBase(r, s);
        boolean ss = s > 0 && s != 7;
        int clr = def;
        if (p == 1 && JRMCoreH.rc_sai(r)) {
            if (gd) {
                clr = type == 0 ? 9446263 : (type == 3 ? 12464847 : (type == 1 ? 12976974 : 12464847));
            } else if (ui2) {
                clr = type == 0xF0F0F0 ? 0xF0F0F0 : (type == 1 ? 0xD2D2D2 : 0xF0F0F0);
            } else if (ui) {
                clr = type == 0 ? 0xF0F0F0 : (type == 1 ? 0xD2D2D2 : 0xF0F0F0);
            } else if (ssb && divine) {
                clr = type == 0 || type == 3 ? 14985390 : (type == 1 ? 0xA99B9A : 7536661);
            } else if (ssbs && divine) {
                clr = type == 0 || type == 3 ? 14184352 : (type == 1 ? 9338493 : 14030412);
            } else if (ssb) {
                clr = type == 0 || type == 3 ? 2805230 : (type == 1 ? 2469062 : 2805230);
            } else if (ssbs) {
                clr = type == 0 || type == 3 ? Short.MAX_VALUE : (type == 1 ? 23039 : Short.MAX_VALUE);
            } else if (ssg) {
                clr = type == 0 || type == 3 ? 14028139 : (type == 1 ? 14943270 : 16761125);
            } else if (ss4) {
                clr = type == 0 ? def : (type == 1 ? 15976455 : (type == 3 ? (y ? 0x99FF66 : 16574610) : (y ? 0x99FF66 : 16701952)));
            } else if (ss) {
                clr = type == 0 || type == 3 ? (y ? 0x99FF66 : 16574610) : (type == 1 ? 2988684 : (y ? 0x99FF66 : 16701952));
            }
        } else if (p == 1 && JRMCoreH.rc_hum(r) && ui2) {
            if (ui2) {
                clr = type == 0xF0F0F0 ? 0xF0F0F0 : (type == 1 ? 0xD2D2D2 : 0xF0F0F0);
            }
        } else if (p == 1 && JRMCoreH.rc_humNam(r)) {
            if (gd) {
                clr = JRMCoreH.rc_hum(r) ? (type == 0 ? 9446263 : (type == 3 ? 12464847 : (type == 1 ? 12976974 : 12464847))) : (type == 3 ? 12464847 : (type == 1 ? 12976974 : 12464847));
            } else if (ui) {
                clr = type == 0 ? def : (type == 1 ? 0xD2D2D2 : 0xF0F0F0);
            } else if (ssg) {
                clr = type == 1 ? 14943270 : (type == 2 ? 16761125 : clr);
            }
        } else if (p == 1 && JRMCoreH.rc_arc(r)) {
            if (gd) {
                clr = type == 3 ? 12464847 : (type == 1 ? 12976974 : 12464847);
            } else if (ui) {
                clr = type == 0 ? def : (type == 1 ? 0xD2D2D2 : 0xF0F0F0);
            } else if (ssg) {
                clr = type == 1 ? 14943270 : (type == 2 ? 16761125 : clr);
            } else if (s == 6) {
                clr = type == 2 ? 16430355 : clr;
            }
        } else if (p == 1 && JRMCoreH.isRaceMajin(r)) {
            if (gd) {
                clr = type == 3 ? 12464847 : (type == 1 ? 12976974 : 12464847);
            } else if (ui) {
                clr = type == 1 ? 0xD2D2D2 : 0xF0F0F0;
            } else if (ssg) {
                clr = type == 1 ? 14943270 : (type == 2 ? 16761125 : clr);
            } else if (s == 1) {
                clr = type == 1 ? 0xFCFCFC : (type == 3 ? 12561588 : clr);
            } else if (s == 2) {
                clr = type == 3 ? 16024763 : clr;
            } else if (s == 3) {
                clr = type == 3 || type == 2 ? 16756968 : clr;
            }
        }
        return clr;
    }

    public static boolean godKiUser(int r, int s) {
        if (JRMCoreH.rc_sai(r)) {
            return s == 10 || s == 9 || s == 11;
        }
        if (JRMCoreH.rc_humNam(r)) {
            return s == 3;
        }
        if (JRMCoreH.isRaceMajin(r)) {
            return s == 4;
        }
        if (JRMCoreH.rc_arc(r)) {
            return s == 7;
        }
        return s == 10 || s == 9 || s == 11;
    }

    public static boolean godKiUserBase(int r, int s) {
        if (JRMCoreH.rc_sai(r)) {
            return s == 9 || s == 11;
        }
        if (JRMCoreHDBC.DBCgetConfigGodformCosm() && JRMCoreH.rc_humNam(r)) {
            return s == 3;
        }
        if (JRMCoreHDBC.DBCgetConfigGodformCosm() && JRMCoreH.isRaceMajin(r)) {
            return s == 4;
        }
        if (JRMCoreHDBC.DBCgetConfigGodformCosm() && JRMCoreH.rc_arc(r)) {
            return s == 7;
        }
        return false;
    }

    public static boolean godformslr(int s) {
        return s >= 6;
    }

    public static boolean godformslrHN(int s) {
        return s >= 6;
    }

    public static boolean godformslrA(int s) {
        return s >= 7;
    }

    public static boolean godKiAble() {
        if (JRMCoreH.rc_sai(JRMCoreH.Race) && JRMCoreHDBC.godformslr(JRMCoreH.SklLvlX(1, JRMCoreH.PlyrSkillX))) {
            return true;
        }
        if (JRMCoreH.rc_humNam(JRMCoreH.Race) && JRMCoreHDBC.godformslrHN(JRMCoreH.SklLvlX(1, JRMCoreH.PlyrSkillX))) {
            return true;
        }
        if (JRMCoreH.isRaceMajin(JRMCoreH.Race) && JRMCoreHDBC.hasMajinGodRacialRequirement(JRMCoreH.SklLvlX(1, JRMCoreH.PlyrSkillX))) {
            return true;
        }
        return JRMCoreH.rc_arc(JRMCoreH.Race) && JRMCoreHDBC.godformslrA(JRMCoreH.SklLvlX(1, JRMCoreH.PlyrSkillX));
    }

    public static boolean godKiAble(int r, int sklX) {
        if (JRMCoreH.rc_sai(r) && JRMCoreHDBC.godformslr(sklX)) {
            return true;
        }
        if (JRMCoreH.rc_humNam(r) && JRMCoreHDBC.godformslrHN(sklX)) {
            return true;
        }
        if (JRMCoreH.isRaceMajin(r) && JRMCoreHDBC.hasMajinGodRacialRequirement(sklX)) {
            return true;
        }
        return JRMCoreH.rc_arc(r) && JRMCoreHDBC.godformslrA(sklX);
    }

    public static boolean auc(int sklX) {
        return sklX >= 6;
    }

    public static boolean hasMajinGodRacialRequirement(int racialLvl) {
        return racialLvl >= 6;
    }

    public static void actionInitDBC() {
        JRMCoreA.actionsDBC.put(0, 1);
        JRMCoreA.actionsDBC.put(1, 2);
        JRMCoreA.actionsDBC.put(2, 6);
        JRMCoreA.actionsDBC.put(3, 5);
        JRMCoreA.actionsDBC.put(5, 7);
        JRMCoreA.actionsDBC.put(6, 9);
        JRMCoreA.actionsDBC.put(7, 4);
        JRMCoreA.actionsDBC.put(8, 10);
        JRMCoreA.actionsDBC.put(9, 11);
        JRMCoreA.actionsDBC.put(10, 12);
        JRMCoreA.actionsDBC.put(11, 13);
        JRMCoreA.actionsDBC.put(12, 14);
        JRMCoreA.actionsDBC.put(14, 15);
        JRMCoreA.actionsDBC.put(15, 16);
        JRMCoreA.actionsDBC.put(16, 17);
        JRMCoreA.actionsDBC.put(17, 18);
    }

    public static String action(int d, boolean action, boolean black) {
        String opt1 = JGConfigClientSettings.CLIENT_GR12 ? "Enable" : "Off";
        String opt2 = JGConfigClientSettings.CLIENT_GR12 ? "Disable" : "On";
        String clr1 = "\u00a74";
        String clr2 = "\u00a72";
        if (JGConfigClientSettings.CLIENT_GR13) {
            black = true;
        }
        byte race = JRMCoreH.Race;
        byte pwr = JRMCoreH.Pwrtyp;
        byte state = JRMCoreH.State;
        byte align = JRMCoreH.align;
        if (JRMCoreH.PlyrSettingsB(6) && JRMCoreH.SklLvl(10, JRMCoreH.Pwrtyp) < 1) {
            JRMCoreH.Skll((byte)6, (byte)6, (byte)1);
        }
        if (JRMCoreH.PlyrSettingsB(11) && JGConfigUltraInstinct.CONFIG_UI_LEVELS == 0) {
            JRMCoreH.Skll((byte)6, (byte)11, (byte)1);
        }
        switch (d) {
            case 1: {
                String skllName = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.DBCSkillsIDs[8], JRMCoreH.DBCSkillsIDs, JRMCoreH.DBCSkillNames));
                int skillLvl = JRMCoreH.SklLvl(8, JRMCoreH.Pwrtyp);
                boolean ps = JRMCoreH.PlyrSettingsB(0);
                if (!(JRMCoreH.PlyrSettingsB(11) || JRMCoreH.PlyrSettingsB(16) || JRMCoreH.PlyrSettingsB(6))) {
                    skllName = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.DBCSkillsIDs[8], JRMCoreH.DBCSkillsIDs, JRMCoreH.DBCSkillNames));
                    skillLvl = JRMCoreH.SklLvl(8, JRMCoreH.Pwrtyp);
                    ps = JRMCoreH.PlyrSettingsB(0);
                    if (skillLvl > 0) {
                        if (action) {
                            if (ps) {
                                JRMCoreH.Skll((byte)6, (byte)0, (byte)1);
                            } else {
                                JRMCoreH.Skll((byte)6, (byte)0, (byte)0);
                            }
                        } else {
                            String enable = JRMCoreH.trl("jrmc", opt1);
                            String disable = JRMCoreH.trl("jrmc", opt2);
                            return skllName + ": " + (ps ? (black ? "" : "\u00a72") + disable : (black ? "" : "\u00a74") + enable);
                        }
                    }
                }
                if (skillLvl > 0 && !action) {
                    return skllName + " is not useable, because " + (JRMCoreH.PlyrSettingsB(11) ? "Ultra instinct" : (JRMCoreH.PlyrSettingsB(16) ? "God of Destruction" : "Mystic form")) + " is enabled!";
                }
                return "";
            }
            case 13: {
                if (JGConfigUltraInstinct.CONFIG_UI_LEVELS > 0) {
                    String skllName = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.DBCSkillsIDs[16], JRMCoreH.DBCSkillsIDs, JRMCoreH.DBCSkillNames));
                    int skillLvl = JRMCoreH.SklLvl(16, JRMCoreH.Pwrtyp);
                    boolean ps = JRMCoreH.PlyrSettingsB(11);
                    if (!(JRMCoreH.PlyrSettingsB(0) || JRMCoreH.PlyrSettingsB(16) || JRMCoreH.PlyrSettingsB(6) || skillLvl <= 0)) {
                        if (action) {
                            if (ps) {
                                JRMCoreH.Skll((byte)6, (byte)11, (byte)1);
                            } else {
                                JRMCoreH.Skll((byte)6, (byte)11, (byte)0);
                            }
                        } else {
                            String enable = JRMCoreH.trl("jrmc", opt1);
                            String disable = JRMCoreH.trl("jrmc", opt2);
                            return skllName + ": " + (ps ? (black ? "" : "\u00a72") + disable : (black ? "" : "\u00a74") + enable);
                        }
                    }
                    if (skillLvl > 0 && !action) {
                        return skllName + " is not useable, because " + (JRMCoreH.PlyrSettingsB(0) ? "Kaioken" : (JRMCoreH.PlyrSettingsB(16) ? "God of Destruction" : "Mystic form")) + " is enabled!";
                    }
                    return "";
                }
            }
            case 10: {
                String skllName = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.DBCSkillsIDs[10], JRMCoreH.DBCSkillsIDs, JRMCoreH.DBCSkillNames));
                int skillLvl = JRMCoreH.SklLvl(10, JRMCoreH.Pwrtyp);
                boolean ps = JRMCoreH.PlyrSettingsB(6);
                if (!(JRMCoreH.PlyrSettingsB(0) || JRMCoreH.PlyrSettingsB(16) || JRMCoreH.PlyrSettingsB(11) || skillLvl <= 0)) {
                    if (action) {
                        if (ps) {
                            JRMCoreH.Skll((byte)6, (byte)6, (byte)1);
                        } else {
                            JRMCoreH.Skll((byte)6, (byte)6, (byte)0);
                        }
                    } else {
                        String enable = JRMCoreH.trl("jrmc", opt1);
                        String disable = JRMCoreH.trl("jrmc", opt2);
                        return skllName + ": " + (ps ? (black ? "" : "\u00a72") + disable : (black ? "" : "\u00a74") + enable);
                    }
                }
                if (skillLvl > 0 && !action) {
                    return skllName + " is not useable, because " + (JRMCoreH.PlyrSettingsB(0) ? "Kaioken" : (JRMCoreH.PlyrSettingsB(16) ? "God of Destruction" : "Ultra instinct")) + " is enabled!";
                }
                return "";
            }
            case 5: {
                String skllName = JRMCoreH.trl("dbc", "DodgeSwoop");
                int skl_d = JRMCoreH.SklLvl(2, JRMCoreH.Pwrtyp);
                int skl_f = JRMCoreH.SklLvl(3, JRMCoreH.Pwrtyp);
                boolean ps = JRMCoreH.PlyrSettingsB(2);
                if (skl_d > 0 || skl_f > 0) {
                    if (action) {
                        if (ps) {
                            JRMCoreH.Skll((byte)6, (byte)2, (byte)1);
                        } else {
                            JRMCoreH.Skll((byte)6, (byte)2, (byte)0);
                        }
                    } else {
                        String enable = JRMCoreH.trl("jrmc", opt1);
                        String disable = JRMCoreH.trl("jrmc", opt2);
                        return skllName + ": " + (ps ? (black ? "" : "\u00a74") + enable : (black ? "" : "\u00a72") + disable);
                    }
                }
                return "";
            }
            case 7: {
                String skllName = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.DBCSkillsIDs[3], JRMCoreH.DBCSkillsIDs, JRMCoreH.DBCSkillNames));
                int skillLvl = JRMCoreH.SklLvl(3, JRMCoreH.Pwrtyp);
                boolean ps = JRMCoreH.StusEfctsMe(9);
                if (skillLvl > 0) {
                    if (action) {
                        if (ps) {
                            JRMCoreH.Skll((byte)5, (byte)1, (byte)9);
                        } else {
                            JRMCoreH.Skll((byte)5, (byte)0, (byte)9);
                        }
                    } else {
                        String enable = JRMCoreH.trl("jrmc", "OnSimple");
                        String disable = JRMCoreH.trl("jrmc", "OnDynamic");
                        return skllName + ": " + (ps ? (black ? "" : "\u00a72") + disable : (black ? "" : "\u00a74") + enable);
                    }
                }
                return "";
            }
            case 9: {
                String skllName = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.DBCSkillsIDs[0], JRMCoreH.DBCSkillsIDs, JRMCoreH.DBCSkillNames));
                int skillLvl = JRMCoreH.SklLvl(0, JRMCoreH.Pwrtyp);
                boolean ps = JRMCoreH.PlyrSettingsB(4);
                if (skillLvl > 0) {
                    if (action) {
                        if (ps) {
                            JRMCoreH.Skll((byte)6, (byte)4, (byte)1);
                        } else {
                            JRMCoreH.Skll((byte)6, (byte)4, (byte)0);
                        }
                    } else {
                        String enable = JRMCoreH.trl("jrmc", opt1);
                        String disable = JRMCoreH.trl("jrmc", opt2);
                        return skllName + ": " + (ps ? (black ? "" : "\u00a72") + disable : (black ? "" : "\u00a74") + enable);
                    }
                }
                return "";
            }
            case 6: {
                if (JRMCoreH.isRaceMajin(race)) {
                    int sklX = JRMCoreH.SklLvlX(pwr, JRMCoreH.PlyrSkillX);
                    if (sklX > 4) {
                        String TransNms = JRMCoreH.trl("jrmc", "MAbsorption");
                        String name = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.PlyrSkillX, JRMCoreH.vlblRSkls, JRMCoreH.vlblRSklsNms, JRMCoreH.Race));
                        name = name + "/n" + TransNms;
                        if (!action) {
                            boolean bo = JRMCoreH.StusEfctsMe(21);
                            String enable = JRMCoreH.trl("jrmc", opt1);
                            String disable = JRMCoreH.trl("jrmc", opt2);
                            return TransNms + ": " + (!bo ? (black ? "" : "\u00a74") + enable : (black ? "" : "\u00a72") + disable);
                        }
                        JRMCoreH.Skll((byte)5, (byte)(JRMCoreH.StusEfctsMe(21) ? 1 : 0), (byte)21);
                        return name;
                    }
                } else if (JRMCoreH.isRaceArcosian(race) && state >= 1) {
                    if (action) {
                        JRMCoreHDBC.Dscndng(4);
                    } else {
                        return JRMCoreH.trl("dbc", "Descend");
                    }
                }
                return race == 4 ? JRMCoreH.trl("dbc", "Descend") : "";
            }
            case 2: {
                byte nag;
                String name;
                String TransNms;
                int sklX = JRMCoreH.SklLvlX(pwr, JRMCoreH.PlyrSkillX);
                boolean tt = JRMCoreH.PlyrSettingsI(1, 0);
                boolean ttg = JRMCoreH.PlyrSettingsI(1, 1);
                boolean ttb = JRMCoreH.PlyrSettingsI(1, 2);
                boolean tt4 = JRMCoreH.PlyrSettingsI(1, 3);
                int skillLvl = JRMCoreH.SklLvl(9, JRMCoreH.Pwrtyp);
                int skl2 = JRMCoreH.SklLvl(10, JRMCoreH.Pwrtyp);
                if (JRMCoreH.rc_sai(race) && sklX >= 6) {
                    TransNms = JRMCoreH.trl("jrmc", JRMCoreH.getTransformationName(race, ttb ? 10 : (ttg ? 9 : (tt ? 5 : (tt4 ? 14 : 2))), JRMCoreH.StusEfctsMe(17), false, false, false));
                    name = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.PlyrSkillX, JRMCoreH.vlblRSkls, JRMCoreH.vlblRSklsNms, JRMCoreH.Race));
                    name = name + "/n" + TransNms;
                    if (action) {
                        boolean s4ap;
                        boolean bl = s4ap = sklX >= 7 && JRMCoreH.s4ft > 0 && JRMCoreH.tailHas(JRMCoreH.TlMd);
                        byte nag2 = (byte)(skillLvl > 1 ? 2 : (skillLvl > 0 ? 1 : (s4ap ? 3 : -1)));
                        if (ttb) {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)1);
                        } else if (ttg) {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)(s4ap ? 3 : -1));
                        } else if (tt4) {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)-1);
                        } else if (tt) {
                            JRMCoreH.Skll((byte)8, (byte)1, nag2);
                        } else {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)0);
                        }
                    } else {
                        return name;
                    }
                }
                if (JRMCoreH.rc_humNam(race) && sklX >= 3) {
                    TransNms = JRMCoreH.trl("jrmc", JRMCoreH.getTransformationName(race, ttg ? 3 : (tt ? 1 : 2), false, false, false, false));
                    name = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.PlyrSkillX, JRMCoreH.vlblRSkls, JRMCoreH.vlblRSklsNms, JRMCoreH.Race));
                    name = name + "/n" + TransNms;
                    if (action) {
                        nag = (byte)(skillLvl > 0 ? 1 : -1);
                        if (ttg) {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)-1);
                        } else if (tt) {
                            JRMCoreH.Skll((byte)8, (byte)1, nag);
                        } else {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)0);
                        }
                    } else {
                        return name;
                    }
                }
                if (JRMCoreH.isRaceMajin(race) && sklX >= 6) {
                    TransNms = JRMCoreH.trl("jrmc", JRMCoreH.getTransformationName(race, ttg ? 4 : (tt ? 3 : 1), false, false, false, false));
                    name = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.PlyrSkillX, JRMCoreH.vlblRSkls, JRMCoreH.vlblRSklsNms, JRMCoreH.Race));
                    name = name + "/n" + TransNms;
                    if (action) {
                        nag = (byte)(skillLvl > 0 ? 1 : -1);
                        if (ttg) {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)-1);
                        } else if (tt) {
                            JRMCoreH.Skll((byte)8, (byte)1, nag);
                        } else {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)0);
                        }
                    } else {
                        return name;
                    }
                }
                if (JRMCoreH.rc_arc(race) && sklX >= 7) {
                    TransNms = JRMCoreH.trl("jrmc", JRMCoreH.getTransformationName(race, ttg ? 7 : (tt ? 6 : 5), false, false, false, false));
                    name = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.PlyrSkillX, JRMCoreH.vlblRSkls, JRMCoreH.vlblRSklsNms, JRMCoreH.Race));
                    name = name + "/n" + TransNms;
                    if (action) {
                        nag = (byte)(skillLvl > 0 ? 1 : -1);
                        if (ttg) {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)-1);
                        } else if (tt) {
                            JRMCoreH.Skll((byte)8, (byte)1, nag);
                        } else {
                            JRMCoreH.Skll((byte)8, (byte)1, (byte)0);
                        }
                    } else {
                        return name;
                    }
                }
                return "";
            }
            case 4: {
                byte tlmd = JRMCoreH.TlMd;
                if (action) {
                    if (!(race != 1 && race != 2 || tlmd != 1 && tlmd != 0 && tlmd != -1)) {
                        JRMCoreH.Char((byte)102, (byte)0);
                    }
                    if (race == 4 && state == 5) {
                        JRMCoreH.Skll((byte)5, (byte)(JRMCoreH.StusEfctsMe(6) ? 1 : 0), (byte)6);
                    }
                } else {
                    if (!(race != 1 && race != 2 || tlmd != 1 && tlmd != 0 && tlmd != -1)) {
                        String n = JRMCoreH.trl("jrmc", "TailMode");
                        return n;
                    }
                    if (race == 4 && state == 5) {
                        String n = JRMCoreH.trl("jrmc", "ArcMask");
                        boolean bo = JRMCoreH.StusEfctsMe(6);
                        String enable = JRMCoreH.trl("jrmc", opt1);
                        String disable = JRMCoreH.trl("jrmc", opt2);
                        return n + ": " + (!bo ? (black ? "" : "\u00a74") + enable : (black ? "" : "\u00a72") + disable);
                    }
                }
                return race == 1 || race == 2 ? JRMCoreH.trl("jrmc", "TailMode") : (race == 4 ? JRMCoreH.trl("jrmc", "ArcMask") : "");
            }
            case 11: {
                String skllName = JRMCoreH.trl("dbc", "KiFist");
                int skl_f = JRMCoreH.SklLvl(12, JRMCoreH.Pwrtyp);
                boolean ps = JRMCoreH.PlyrSettingsB(9);
                if (skl_f > 0) {
                    if (action) {
                        if (ps) {
                            JRMCoreH.Skll((byte)6, (byte)9, (byte)1);
                        } else {
                            JRMCoreH.Skll((byte)6, (byte)9, (byte)0);
                        }
                    } else {
                        String enable = JRMCoreH.trl("jrmc", opt1);
                        String disable = JRMCoreH.trl("jrmc", opt2);
                        return skllName + ": " + (ps ? (black ? "" : "\u00a74") + enable : (black ? "" : "\u00a72") + disable);
                    }
                }
                return "";
            }
            case 12: {
                String skllName = JRMCoreH.trl("dbc", "KiProtection");
                int skl_f = JRMCoreH.SklLvl(11, JRMCoreH.Pwrtyp);
                boolean ps = JRMCoreH.PlyrSettingsB(10);
                if (skl_f > 0) {
                    if (action) {
                        if (ps) {
                            JRMCoreH.Skll((byte)6, (byte)10, (byte)1);
                        } else {
                            JRMCoreH.Skll((byte)6, (byte)10, (byte)0);
                        }
                    } else {
                        String enable = JRMCoreH.trl("jrmc", opt1);
                        String disable = JRMCoreH.trl("jrmc", opt2);
                        return skllName + ": " + (ps ? (black ? "" : "\u00a74") + enable : (black ? "" : "\u00a72") + disable);
                    }
                }
                return "";
            }
            case 14: {
                String skllName = JRMCoreH.trl("dbc", "FriendlyFist");
                int skl_f = 1;
                boolean ps = JRMCoreH.PlyrSettingsB(12);
                if (skl_f > 0) {
                    if (action) {
                        if (ps) {
                            JRMCoreH.Skll((byte)6, (byte)12, (byte)1);
                        } else {
                            JRMCoreH.Skll((byte)6, (byte)12, (byte)0);
                        }
                    } else {
                        String enable = JRMCoreH.trl("jrmc", opt1);
                        String disable = JRMCoreH.trl("jrmc", opt2);
                        return skllName + ": " + (ps ? (black ? "" : "\u00a72") + disable : (black ? "" : "\u00a74") + enable);
                    }
                }
                return "";
            }
            case 15: {
                int skl_f = JRMCoreH.SklLvl(12, JRMCoreH.Pwrtyp);
                int skl_f2 = JRMCoreH.SklLvl(15, JRMCoreH.Pwrtyp);
                boolean kwsw = JRMCoreH.PlyrSettingsI(13, 0);
                boolean kssc = JRMCoreH.PlyrSettingsI(13, 1);
                if (skl_f > 0 && skl_f2 > 0) {
                    if (action) {
                        if (kwsw) {
                            JRMCoreH.Skll((byte)8, (byte)13, (byte)1);
                        } else if (kssc) {
                            JRMCoreH.Skll((byte)8, (byte)13, (byte)-1);
                        } else {
                            JRMCoreH.Skll((byte)8, (byte)13, (byte)0);
                        }
                    } else {
                        String enable = JRMCoreH.trl("jrmc", opt1);
                        String disable = JRMCoreH.trl("jrmc", opt2);
                        String name = JRMCoreH.trl("dbc", "KiWeapon") + ": " + (kwsw ? (black ? "" : "\u00a72") + JRMCoreH.trl("dbc", "KiSword") : (kssc ? (black ? "" : "\u00a72") + JRMCoreH.trl("dbc", "KiScythe") : (black ? "" : "\u00a74") + JRMCoreH.trl("jrmc", "Off")));
                        return name;
                    }
                }
                return "";
            }
            case 16: {
                int itLevel = JRMCoreH.SklLvl(17, JRMCoreH.Pwrtyp);
                if (itLevel > 0) {
                    if (action) {
                        int id = JRMCoreH.PlyrSettings(14);
                        if (++id > 1) {
                            id = -1;
                        }
                        JRMCoreH.Skll((byte)8, (byte)14, (byte)id);
                    } else {
                        int id = JRMCoreH.PlyrSettings(14);
                        String ID = "InstantTransShortTPMode";
                        String name = JRMCoreH.trl("dbc", "InstantTransShortTPMode") + ": " + (black ? "" : "\u00a72") + JRMCoreH.trl("dbc", "InstantTransShortTPMode" + (id + 1));
                        return name;
                    }
                }
                return "";
            }
            case 17: {
                int itLevel = JRMCoreH.SklLvl(17, JRMCoreH.Pwrtyp);
                if (itLevel > 0) {
                    if (action) {
                        int id = JRMCoreH.PlyrSettings(15);
                        if (++id > 1) {
                            id = -1;
                        }
                        JRMCoreH.Skll((byte)8, (byte)15, (byte)id);
                    } else {
                        int id = JRMCoreH.PlyrSettings(15);
                        String ID = "InstantTransSurroundMode";
                        String name = JRMCoreH.trl("dbc", "InstantTransSurroundMode") + ": " + (black ? "" : "\u00a72") + JRMCoreH.trl("dbc", "InstantTransSurroundMode" + (id + 1));
                        return name;
                    }
                }
                return "";
            }
            case 18: {
                String skllName = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.DBCSkillsIDs[18], JRMCoreH.DBCSkillsIDs, JRMCoreH.DBCSkillNames));
                int skillLvl = JRMCoreH.SklLvl(18, JRMCoreH.Pwrtyp);
                boolean ps = JRMCoreH.PlyrSettingsB(16);
                if (!(JRMCoreH.PlyrSettingsB(0) || JRMCoreH.PlyrSettingsB(6) || JRMCoreH.PlyrSettingsB(11) || skillLvl <= 0)) {
                    if (action) {
                        if (ps) {
                            JRMCoreH.Skll((byte)6, (byte)16, (byte)1);
                        } else {
                            JRMCoreH.Skll((byte)6, (byte)16, (byte)0);
                        }
                    } else {
                        String enable = JRMCoreH.trl("jrmc", opt1);
                        String disable = JRMCoreH.trl("jrmc", opt2);
                        return skllName + ": " + (ps ? (black ? "" : "\u00a72") + disable : (black ? "" : "\u00a74") + enable);
                    }
                }
                if (skillLvl > 0 && !action) {
                    return skllName + " is not useable, because " + (JRMCoreH.PlyrSettingsB(0) ? "Kaioken" : (JRMCoreH.PlyrSettingsB(6) ? "Mystic form" : "Ultra instinct")) + " is enabled!";
                }
                return "";
            }
        }
        return "";
    }

    public static int ItemWeightOn(ItemStack itemStack) {
        if (itemStack != null) {
            if (itemStack.getItem() == ItemsDBC.ItemWeightShell) {
                return 0;
            }
            if (itemStack.getItem() == ItemsDBC.ItemWeightHandLeg) {
                return 1;
            }
            if (itemStack.getItem() == ItemsDBC.ItemWeightShirt) {
                return 2;
            }
            if (itemStack.getItem() == ItemsDBC.ItemWeightCape) {
                return 3;
            }
            if (itemStack.getItem() == ItemsDBC.ItemWeightHeavySuit) {
                return 4;
            }
        }
        return -1;
    }

    public static float gravity(EntityPlayer player, float g) {
        float G = 1.0f;
        if (player.dimension == DBCConfig.otherWorld) {
            AxisAlignedBB ab = AxisAlignedBB.getBoundingBox((double)DBCH.KPminX, (double)DBCH.KPminY, (double)DBCH.KPminZ, (double)DBCH.KPmaxX, (double)DBCH.KPmaxY, (double)DBCH.KPmaxZ);
            if (ab.maxX > player.posX && ab.minX < player.posX && ab.maxY > player.posY && ab.minY < player.posY && ab.maxZ > player.posZ && ab.minZ < player.posZ) {
                G = 10.0f;
            }
        }
        if (player.dimension == DBCConfig.dimTimeChamber) {
            G = 10.0f;
        }
        G = G < g ? g : G;
        return G;
    }

    public static void openGui(int id, EntityPlayer pl) {
        pl.openGui((Object)mod_DragonBC.instance, id, pl.worldObj, (int)pl.posX, (int)pl.posY, (int)pl.posZ);
    }

    public static void onEventDrop(LivingDropsEvent event) {
        DBCH.onEventDrop((LivingDropsEvent)event);
    }

    public static Block getMedBlock() {
        return BlocksDBC.BlockHealingPods;
    }

    public static void DBCDeath(EntityPlayer p) {
        DBCH.DBCDeath((EntityPlayer)p);
    }

    public static void DBSpawn(EntityPlayer p, long wt) {
        DBCH.DBSpawn((EntityPlayer)p, (long)wt);
    }

    public static void Dscndng(int i) {
        DBCKiTech.Dscndng((int)i);
    }

    public static void Dscndng() {
        DBCKiTech.Dscndng();
    }

    public static boolean DBCKiTechFly() {
        return DBCKiTech.floating;
    }

    public static void spawnSaibaimans(EntityPlayer player) {
        int i = MathHelper.floor_double((double)player.posX);
        int j = MathHelper.floor_double((double)player.posY);
        int r = 30;
        int k = MathHelper.floor_double((double)player.posZ);
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)((double)i - (double)r), (double)1.0, (double)((double)k - (double)r), (double)((double)i + (double)r), (double)254.0, (double)((double)k + (double)r));
        List list = player.worldObj.getEntitiesWithinAABB(EntitySaibaiman.class, aabb);
        if (list.size() < 3) {
            EntitySaibaiman s = null;
            block0: for (int l = 0; l < 3 - list.size(); ++l) {
                int i1;
                int n = i1 = j + 1 > 254 ? 254 : j + 1;
                while (i1 > 50) {
                    Random ran1 = new Random();
                    int r1 = ran1.nextInt(10);
                    Random ran2 = new Random();
                    int r2 = ran1.nextInt(10);
                    Block block = player.worldObj.getBlock(i - 5 + r1, i1, k - 5 + r2);
                    if (block.getMaterial() == Material.air) {
                        EntitySaibaiman sai1 = new EntitySaibaiman(player.worldObj);
                        sai1.setLocationAndAngles((double)(i - 5 + r1), (double)i1, (double)(k - 5 + r2), 0.0f, 0.0f);
                        sai1.setETA((Entity)player);
                        sai1.settarget((Entity)player);
                        sai1.setSpwner((Entity)player);
                        player.worldObj.spawnEntityInWorld((Entity)sai1);
                        s = sai1;
                        continue block0;
                    }
                    --i1;
                }
            }
            if (s != null) {
                s.worldObj.playSoundAtEntity((Entity)player, "jinryuudragonbc:DBC3.teleport", 1.0f, 1.0f);
            }
        }
    }

    public static void spawnFeezahenchmen(EntityPlayer player) {
        int i = MathHelper.floor_double((double)player.posX);
        int j = MathHelper.floor_double((double)player.posY);
        int r = 30;
        int k = MathHelper.floor_double((double)player.posZ);
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)((double)i - (double)r), (double)1.0, (double)((double)k - (double)r), (double)((double)i + (double)r), (double)254.0, (double)((double)k + (double)r));
        List list = player.worldObj.getEntitiesWithinAABB(EntityFreezaSoldiers.class, aabb);
        if (list.size() < 2) {
            int i1;
            EntityFreezaSoldier1 s = null;
            int n = i1 = j + 1 > 254 ? 254 : j + 1;
            while (i1 > 50) {
                Block block3;
                Block block2;
                Random ran1 = new Random();
                int r1 = ran1.nextInt(10);
                Random ran2 = new Random();
                int r2 = ran1.nextInt(10);
                Block block1 = player.worldObj.getBlock(i - 5 + r1, i1, k - 5 + r2);
                if (block1.getMaterial() == Material.air) {
                    EntityFreezaSoldier1 men1 = new EntityFreezaSoldier1(player.worldObj);
                    men1.setLocationAndAngles((double)(i - 5 + r1), (double)i1, (double)(k - 5 + r2), 0.0f, 0.0f);
                    men1.attackEntityAsMob((Entity)player);
                    men1.setETA((Entity)player);
                    men1.settarget((Entity)player);
                    men1.setSpwner((Entity)player);
                    player.worldObj.spawnEntityInWorld((Entity)men1);
                    s = men1;
                }
                if ((block2 = player.worldObj.getBlock(i - 5 + r1 + 1, i1, k - 5 + r2)).getMaterial() == Material.air) {
                    EntityFreezaSoldier2 men2 = new EntityFreezaSoldier2(player.worldObj);
                    men2.setLocationAndAngles((double)(i - 5 + r1 + 1), (double)i1, (double)(k - 5 + r2), 0.0f, 0.0f);
                    men2.attackEntityAsMob((Entity)player);
                    men2.setETA((Entity)player);
                    men2.settarget((Entity)player);
                    men2.setSpwner((Entity)player);
                    player.worldObj.spawnEntityInWorld((Entity)men2);
                }
                if ((block3 = player.worldObj.getBlock(i - 5 + r1 - 1, i1, k - 5 + r2)).getMaterial() == Material.air) {
                    EntityFreezaSoldier3 men3 = new EntityFreezaSoldier3(player.worldObj);
                    men3.setLocationAndAngles((double)(i - 5 + r1 - 1), (double)i1, (double)(k - 5 + r2), 0.0f, 0.0f);
                    men3.attackEntityAsMob((Entity)player);
                    men3.setETA((Entity)player);
                    men3.settarget((Entity)player);
                    men3.setSpwner((Entity)player);
                    player.worldObj.spawnEntityInWorld((Entity)men3);
                    break;
                }
                --i1;
            }
            if (s != null) {
                s.worldObj.playSoundAtEntity((Entity)player, "jinryuudragonbc:DBC3.teleport", 1.0f, 1.0f);
            }
        }
    }

    public static List listEvilDBCnpcs(EntityPlayer player, AxisAlignedBB aabb) {
        return player.worldObj.getEntitiesWithinAABB(EntityDBCEvil.class, aabb);
    }

    public static void ifEvilDBCnpcs(Entity e, EntityPlayer p) {
        boolean b = e instanceof EntityDBCEvil;
        if (b) {
            e.setWorld(p.worldObj);
            ((EntityDBCEvil)e).setSpwner((Entity)p);
        }
    }

    public static void ifEvilDBCnpcs(Entity e, Entity p) {
        boolean b = e instanceof EntityDBCEvil;
        boolean b2 = p instanceof EntityDBCEvil;
        if (b && b2) {
            e.setWorld(p.worldObj);
            ((EntityDBCEvil)e).setSpwner(((EntityDBCEvil)p).getSpwner());
            ((EntityDBCEvil)e).settarget(((EntityDBCEvil)p).gettarget());
        }
    }

    public static boolean DBCTrainingArea(EntityPlayer thePlayer) {
        int nX = DBCH.KPminX;
        int xX = DBCH.KPmaxX;
        int nY = DBCH.KPminY;
        int xY = DBCH.KPmaxY;
        int nZ = DBCH.KPminZ;
        int xZ = DBCH.KPmaxZ;
        int pX = (int)thePlayer.posX;
        int pY = (int)thePlayer.posY;
        int pZ = (int)thePlayer.posZ;
        return pX > nX && pX < xX && pY > nY && pY < xY && pZ > nZ && pZ < xZ;
    }

    public static void DBCreleaseZeroTurnOffTurbo() {
        if (JRMCoreH.curRelease == 0 && DBCKiTech.turbo) {
            DBCKiTech.turbo = false;
            JRMCoreH.Skll((byte)5, (byte)1, (byte)3);
        }
    }

    public static float DBCsizeBasedOnCns(int[] plyrAttrbts) {
        float f1 = 0.0f;
        int c = plyrAttrbts[2];
        int m = JRMCoreHDBC.nRP9ea();
        if (mod_DragonBC.ConsSizeChangeOn) {
            f1 += 0.192f * (float)(c > m ? m : c) / (float)m;
        }
        return f1;
    }

    public static float DBCsizeBasedOnCns2(int[] plyrAttrbts) {
        float f1 = 0.0f;
        int c = plyrAttrbts[2];
        int m = JRMCoreHDBC.nRP9ea();
        f1 = mod_DragonBC.ConsSizeChangeOn ? (f1 += 0.192f * (float)(c > m ? m : c) / (float)m) : (f1 += 0.2f);
        return f1;
    }

    public static float DBCsizeBasedOnRace(int race, int state) {
        return JRMCoreHDBC.DBCsizeBasedOnRace(race, state, false);
    }

    public static float DBCsizeBasedOnRace(int race, int state, boolean divine) {
        float f2 = 1.0f;
        if (JRMCoreH.rc_sai(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransSaiBlk.length > state) {
            f2 = JRMCoreH.TransSaiBlk[state];
        }
        if (JRMCoreH.rc_hum(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransHmBlk.length > state) {
            f2 = JRMCoreH.TransHmBlk[state];
        }
        if (JRMCoreH.rc_nam(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransNaBlk.length > state) {
            boolean ssg = JRMCoreHDBC.godKiUserBase(race, state);
            f2 = ssg && divine ? 1.1f : JRMCoreH.TransNaBlk[state];
        }
        if (JRMCoreH.isRaceMajin(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransMaBulk.length > state) {
            f2 = JRMCoreH.TransMaBulk[state];
        }
        if (JRMCoreH.rc_arc(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransFrBlk.length > state) {
            f2 = JRMCoreH.TransFrBlk[state];
        }
        return f2;
    }

    public static float DBCsizeBasedOnRace2(int race, int state) {
        return JRMCoreHDBC.DBCsizeBasedOnRace2(race, state, false);
    }

    public static float DBCsizeBasedOnRace2(int race, int state, boolean divine) {
        float f3 = 1.0f;
        if (JRMCoreH.rc_sai(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransSaiSz.length > state) {
            f3 = JRMCoreH.TransSaiSz[state];
        }
        if (JRMCoreH.rc_hum(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransHmSz.length > state) {
            f3 = JRMCoreH.TransHmSz[state];
        }
        if (JRMCoreH.rc_nam(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransNaSz.length > state) {
            boolean ssg = JRMCoreHDBC.godKiUserBase(race, state);
            f3 = ssg && divine ? 1.5f : JRMCoreH.TransNaSz[state];
        }
        if (JRMCoreH.isRaceMajin(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransMaSize.length > state) {
            f3 = JRMCoreH.TransMaSize[state];
        }
        if (JRMCoreH.rc_arc(race) && mod_DragonBC.TransSizeChangeOn && JRMCoreH.TransFrSz.length > state) {
            f3 = JRMCoreH.TransFrSz[state];
        }
        return f3;
    }

    public static boolean DBCboolPlyrDimNotOtherworld(EntityPlayerMP player) {
        return player.dimension != JRMCoreHDBC.otherworld();
    }

    public static boolean FreeRev() {
        return DBCConfig.FreeRev;
    }

    public static boolean FreeRevC() {
        return DBCConfig.cFreeRev;
    }

    public static void FreeRevSet(boolean i) {
        DBCConfig.FreeRev = i;
    }

    public static int otherworld() {
        return DBCConfig.otherWorld;
    }

    public static void WorldTper(MinecraftServer s, EntityPlayerMP p, int w) {
        s.getConfigurationManager().transferPlayerToDimension(p, w, (Teleporter)JRMCoreHDBC.WorldTper(s, w));
    }

    private static WorldTeleporterDBCTelep WorldTper(MinecraftServer s, int w) {
        return new WorldTeleporterDBCTelep(s.worldServerForDimension(w));
    }

    public static boolean isPlayerInNullRealmDimension(EntityPlayerMP player) {
        return player.dimension == JRMCoreHDBC.nullrealm();
    }

    public static int nullrealm() {
        return DBCConfig.dimNullRealm;
    }

    public static boolean DBCgetConfigGodformCosm() {
        return DBCConfig.GodformCosm;
    }

    public static boolean DBCgetConfigGodform() {
        return DBCConfig.Godform;
    }

    public static boolean DBCgetConfigcGodform() {
        return DBCConfig.cGodform;
    }

    public static void DBCsetConfigGodform(boolean i) {
        DBCConfig.Godform = i;
    }

    public static int DBCgetConfigcsenzuCool() {
        return DBCConfig.csenzuCool;
    }

    public static void DBCsetConfigsenzuCool(int i) {
        DBCConfig.senzuCool = i;
    }

    public static int DBCgetConfigcmaxTrnExp() {
        return DBCConfig.cmaxTrnExp;
    }

    public static boolean DBCgetConfigcplntVegeta() {
        return DBCConfig.cplntVegeta;
    }

    public static boolean DBCgetConfigcflyAnyLvl() {
        return DBCConfig.cflyAnyLvl;
    }

    public static boolean DBCgetConfigcDeathSystemOff() {
        return mod_DragonBC.cDeathSystemOff;
    }

    public static boolean DBCgetConfigcDBSpawnEnabled() {
        return mod_DragonBC.cDBSpawnEnabled;
    }

    public static String DBCgetConfigcDBSpawnTime() {
        return mod_DragonBC.cDBSpawnTime;
    }

    public static boolean DBCgetConfigcSagaSystemOn() {
        return mod_DragonBC.cSagaSystemOn;
    }

    public static boolean DBCgetConfigcSagaSysSpawnPods() {
        return mod_DragonBC.cSagaSysSpawnPods;
    }

    public static void DBCsetConfigmaxTrnExp(int maxTrnExp) {
        DBCConfig.maxTrnExp = maxTrnExp;
    }

    public static void DBCsetConfigplntVegeta(boolean plntVegeta) {
        DBCConfig.plntVegeta = plntVegeta;
    }

    public static void DBCsetConfigflyAnyLvl(boolean flyAnyLvl) {
        DBCConfig.flyAnyLvl = flyAnyLvl;
    }

    public static void DBCsetConfigDeathSystemOff(boolean DeathSystemOff) {
        mod_DragonBC.DeathSystemOff = DeathSystemOff;
    }

    public static void DBCsetConfigDBSpawnEnabled(boolean DBSpawnEnabled) {
        mod_DragonBC.DBSpawnEnabled = DBSpawnEnabled;
    }

    public static void DBCsetConfigDBSpawnTime(String DBSpawnTime) {
        mod_DragonBC.DBSpawnTime = DBSpawnTime;
    }

    public static void DBCsetConfigDBSagaSystemOn(boolean SagaSystemOn) {
        mod_DragonBC.SagaSystemOn = SagaSystemOn;
    }

    public static void DBCsetConfigDBSagaSysSpawnPods(boolean SagaSysSpawnPods) {
        mod_DragonBC.SagaSysSpawnPods = SagaSysSpawnPods;
    }

    public static Block DBCgetBlockTCPort() {
        return BlocksDBC.BlockTCPort;
    }

    public static boolean DBCgetSagaSystemOn() {
        return mod_DragonBC.SagaSystemOn;
    }

    public static boolean DBCgetConfigplntVegeta() {
        return DBCConfig.plntVegeta;
    }

    public static boolean DBCgetConfigflyAnyLvl() {
        return DBCConfig.flyAnyLvl;
    }

    public static int DBCgetConfigeDBrate() {
        return DBCConfig.eDBrate;
    }

    public static int DBCgetConfignDBrate() {
        return DBCConfig.nDBrate;
    }

    public static boolean DBCgetConfigDeathSystemOff() {
        return mod_DragonBC.DeathSystemOff;
    }

    public static boolean DBCgetConfigDBSpawnEnabled() {
        return mod_DragonBC.DBSpawnEnabled;
    }

    public static String DBCgetConfigDBSpawnTime() {
        return mod_DragonBC.DBSpawnTime;
    }

    public static boolean DBCgetConfigSagaSystemOn() {
        return mod_DragonBC.SagaSystemOn;
    }

    public static boolean DBCgetConfigDeadInv() {
        return DBCConfig.DeadInv;
    }

    public static void DBCsetConfigDeadInv(boolean i) {
        DBCConfig.DeadInv = i;
    }

    public static float DBCgetConfigReinc() {
        return DBCConfig.Reinc;
    }

    public static float DBCgetConfigcReinc() {
        return DBCConfig.cReinc;
    }

    public static void DBCsetConfigReinc(float i) {
        DBCConfig.Reinc = i;
    }

    public static boolean DBCgetEntityDBC(Entity shootingEntity) {
        return shootingEntity instanceof EntityDBC;
    }

    public static int DBCgetConfigcwfb() {
        return mod_DragonBC.cwfb;
    }

    public static int DBCgetConfigchfb() {
        return mod_DragonBC.chfb;
    }

    public static int DBCgetConfigcwfn() {
        return mod_DragonBC.cwfn;
    }

    public static int DBCgetConfigchfn() {
        return mod_DragonBC.chfn;
    }

    public static int DBCgetConfighealingpodhealingrate() {
        return DBCConfig.healingpodhealingrate;
    }

    public static boolean DBCgetConfigDBGT() {
        return DBCConfig.DBGT;
    }

    public static int DBCgetConfighPodUpd() {
        return DBCConfig.hPodUpd;
    }

    public static int DBCgetConfighPodRate(int id) {
        return DBCConfig.hPodRate[id];
    }

    public static boolean DBCgetConfighPodPerc(int id) {
        return DBCConfig.hPodPerc[id];
    }

    public static int[][] npc_ps() {
        int[] Kmhs = new int[3];
        if (DBCH.genKH.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                Kmhs[i] = Integer.parseInt(DBCH.genKH.split(";")[i]) + DBCH.genKHnpc1[i];
            }
        }
        int[] ClAr = new int[3];
        if (DBCH.genCA.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                ClAr[i] = Integer.parseInt(DBCH.genCA.split(";")[i]) + DBCH.genCAnpc1[i];
            }
        }
        int[] Gkhs = new int[3];
        if (DBCH.genGH.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                Gkhs[i] = Integer.parseInt(DBCH.genGH.split(";")[i]) + DBCH.genGHnpc1[i];
            }
        }
        int[] Gkhs2 = new int[3];
        if (DBCH.genGH.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                Gkhs2[i] = Integer.parseInt(DBCH.genGH.split(";")[i]) + DBCH.genGHnpc2[i];
            }
        }
        int[] FzSp = new int[3];
        if (DBCH.genFS.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                FzSp[i] = Integer.parseInt(DBCH.genFS.split(";")[i]) + DBCH.genFSnpc1[i];
            }
        }
        int[] BS = new int[3];
        if (DBCH.genBS.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                BS[i] = Integer.parseInt(DBCH.genBS.split(";")[i]) + DBCH.genBSnpc1[i];
            }
        }
        int[] GURU = new int[3];
        if (DBCH.genGuru.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                GURU[i] = Integer.parseInt(DBCH.genGuru.split(";")[i]) + DBCH.genGurunpc1[i];
            }
        }
        int[][] ps = new int[][]{Kmhs, DBCH.Kami, DBCH.Karn, DBCH.Enma, DBCH.KaiO, ClAr, Gkhs, Gkhs2, FzSp, BS, DBCH.TrnksF, DBCH.Jin, GURU, DBCH.Whis1, DBCH.Whis2};
        return ps;
    }

    public static EntityDBCKami[] npc_ent(World w) {
        EntityDBCKami[] ent = new EntityDBCKami[]{new EntityMasterRoshi(w), new EntityMasterKami(w), new EntityMasterKarin(w), new EntityMasterEnma(w), new EntityMasterKaio(w), new EntityMasterCell(w), new EntityMasterGoku(w), new EntityMasterGohan(w), new EntityMasterFreeza(w), new EntityMasterBabidi(w), new EntityMasterTrunksFuture(w), new EntityMasterJin(w), new EntityMasterGuru(w), new EntityMasterWhis(w), new EntityMasterWhis(w)};
        return ent;
    }

    public static Class[] npc_entclss() {
        Class[] entclss = new Class[]{EntityMasterRoshi.class, EntityMasterKami.class, EntityMasterKarin.class, EntityMasterEnma.class, EntityMasterKaio.class, EntityMasterCell.class, EntityMasterGoku.class, EntityMasterGohan.class, EntityMasterFreeza.class, EntityMasterBabidi.class, EntityMasterTrunksFuture.class, EntityMasterJin.class, EntityMasterGuru.class, EntityMasterWhis.class, EntityMasterWhis.class};
        return entclss;
    }

    public static int[] npc_dims() {
        int[] dims = new int[]{0, 0, 0, DBCConfig.otherWorld, DBCConfig.otherWorld, 0, 0, 0, DBCConfig.planetNamek, 0, 0, DBCConfig.otherWorld, DBCConfig.planetNamek, 0, DBCConfig.dimNullRealm};
        return dims;
    }

    public static boolean[] npc_spawn() {
        boolean[] spawn = new boolean[]{DBCH.genKH.contains(";"), true, true, true, true, DBCH.genCA.contains(";"), DBCH.genGH.contains(";"), DBCH.genGH.contains(";"), DBCH.genFS.contains(";"), DBCH.genBS.contains(";"), true, true, DBCH.genGuru.contains(";"), true, true};
        return spawn;
    }

    public static void DBCCommonTickHandlerNPCSpawnCheck(EntityPlayerMP player) {
        if (JRMCoreConfig.NPCSpawnCheck) {
            int[][] ps = JRMCoreHDBC.npc_ps();
            EntityDBCKami[] ent = JRMCoreHDBC.npc_ent(player.worldObj);
            Class[] entclss = JRMCoreHDBC.npc_entclss();
            int[] dims = JRMCoreHDBC.npc_dims();
            boolean[] spawn = JRMCoreHDBC.npc_spawn();
            for (int i = 0; i < ps.length; ++i) {
                int a;
                AxisAlignedBB ab;
                List enma;
                int[] npc = ps[i];
                if (dims[i] != player.dimension || npc.length <= 2 || !(enma = player.worldObj.getEntitiesWithinAABB(entclss[i], ab = AxisAlignedBB.getBoundingBox((double)(npc[0] - (a = 2)), (double)(npc[1] - a), (double)(npc[2] - a), (double)(npc[0] + a), (double)(npc[1] + a), (double)(npc[2] + a)))).isEmpty() || !spawn[i]) continue;
                EntityDBCKami en = ent[i];
                en.setLocationAndAngles((double)npc[0], (double)npc[1], (double)npc[2], 0.0f, 0.0f);
                player.worldObj.spawnEntityInWorld((Entity)en);
            }
        }
    }

    public static void DBCCommonTickHandlerWorldGenBuildingsResetted(MinecraftServer server) {
        if (JRMCoreH.DBCresetted) {
            JRMCoreH.DBCresetted = false;
            JRMCoreHDBC.WorldGenBuildingsSpawnCheck(server);
        }
    }

    public static void WorldGenBuildingsSpawnCheck(MinecraftServer server) {
        DBCH.genKH = DBCH.khrwi((MinecraftServer)server);
        DBCH.genCA = DBCH.carwi((MinecraftServer)server);
        DBCH.genGH = DBCH.ghrwi((MinecraftServer)server);
        DBCH.genFS = DBCH.fsrwi((MinecraftServer)server);
        DBCH.genBS = DBCH.bsrwi((MinecraftServer)server);
        DBCH.genGuru = DBCH.guruhrwi((MinecraftServer)server);
    }

    public static void spawnBuilds(MinecraftServer server) {
        JRMCoreSafe safe = new JRMCoreSafe(server.getEntityWorld());
        safe.saveSpawnList("false ", safe.OWDataDir, "edp.dbc");
        safe.saveSpawnList("false ", safe.OWDataDir, "swk.dbc");
        safe.saveSpawnList("false ", safe.dataDir, "kl.dbc");
        JRMCoreHDBC.WorldGenBuildingsSpawnCheck(server);
        int[] ClAr = new int[3];
        if (DBCH.genCA.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                ClAr[i] = Integer.parseInt(DBCH.genCA.split(";")[i]);
            }
        }
        int[] Gkhs = new int[3];
        if (DBCH.genGH.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                Gkhs[i] = Integer.parseInt(DBCH.genGH.split(";")[i]);
            }
        }
        int[] FzSp = new int[3];
        if (DBCH.genFS.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                FzSp[i] = Integer.parseInt(DBCH.genFS.split(";")[i]);
            }
        }
        int[] BS = new int[3];
        if (DBCH.genBS.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                BS[i] = Integer.parseInt(DBCH.genBS.split(";")[i]);
            }
        }
        int[] GURU = new int[3];
        if (DBCH.genGuru.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                GURU[i] = Integer.parseInt(DBCH.genGuru.split(";")[i]);
            }
        }
        int[][] ps = new int[][]{ClAr, Gkhs, FzSp, BS, GURU};
        for (int i = 0; i < ps.length; ++i) {
            int[] npc = ps[i];
            if (server.worldServerForDimension((int)WorldGeneratorDB.DBbuildsdim[i]).isRemote || npc.length <= 2) continue;
            builds v = WorldGeneratorDB.DBbuilds[i];
            WorldServer w = server.worldServerForDimension(WorldGeneratorDB.DBbuildsdim[i]);
            v.setWorld((World)w);
            if (npc[0] == 0 && npc[1] == 0 && npc[2] == 0 || JRMCoreComTickH.bs.contains(WorldGeneratorDB.DBbuildsNams2((int)i))) continue;
            v.generate((World)w, w.rand, npc[0], npc[1], npc[2]);
        }
    }

    public static int d5keKm(String l) {
        String w = "0123456789ABCDEF";
        l = l.toUpperCase();
        int a = 0;
        for (int i = 0; i < l.length(); ++i) {
            char c = l.charAt(i);
            int d = w.indexOf(c);
            a = 16 * a + d;
        }
        return a;
    }

    public static int nRP9ea() {
        int b = JRMCoreConfig.tmx;
        String r = "64";
        String k = "3B9ACA00";
        return b > JRMCoreHDBC.d5keKm(k) ? JRMCoreHDBC.d5keKm(k) : (b < JRMCoreHDBC.d5keKm(r) ? 0 : b);
    }

    public static void JRMCoreEHonPlayerInteract(PlayerInteractEvent event) {
        EntityPlayer p = event.entityPlayer;
        int x = event.x;
        int y = event.y;
        int z = event.z;
        int length = JRMCoreEH.allSafeZones.size();
        for (int i = length - 1; i >= 0; --i) {
            EntitySafeZone sz = (EntitySafeZone)((Object)JRMCoreEH.allSafeZones.get(i));
            if (sz == null || sz.isDead) {
                JRMCoreEH.allSafeZones.remove(i);
                continue;
            }
            if (sz.dimension != p.dimension) continue;
            AxisAlignedBB ab = sz.createSafeZoneHitBox();
            if (!(ab.minX < (double)x) || !((double)x < ab.maxX) || !(ab.minY < (double)y) || !((double)y < ab.maxY) || !(ab.minZ < (double)z) || !((double)z < ab.maxZ)) continue;
            Block block = p.worldObj.getBlock(x, y, z);
            boolean door = false;
            if (JRMCoreConfig.sfzna != null) {
                for (int j = 0; j < JRMCoreConfig.sfzna.length; ++j) {
                    if (block != Block.getBlockFromName((String)JRMCoreConfig.sfzna[j])) continue;
                    door = true;
                    break;
                }
            }
            if ((block == null || door || !event.isCancelable()) && (event.action != PlayerInteractEvent.Action.LEFT_CLICK_BLOCK || block == null || !door)) continue;
            event.setCanceled(true);
            return;
        }
    }

    public static boolean JRMCoreEHonLivingHurtSafeZone(EntityLivingBase targetEntity) {
        if (targetEntity instanceof EntityPlayer) {
            EntityPlayer targetPlayer = (EntityPlayer)targetEntity;
            int x = (int)targetEntity.posX;
            int y = (int)targetEntity.posY;
            int z = (int)targetEntity.posZ;
            int length = JRMCoreEH.allSafeZones.size();
            for (int i = length - 1; i >= 0; --i) {
                EntitySafeZone sz = (EntitySafeZone)((Object)JRMCoreEH.allSafeZones.get(i));
                if (sz == null || sz.isDead) {
                    JRMCoreEH.allSafeZones.remove(i);
                    continue;
                }
                if (sz.dimension != targetPlayer.dimension) continue;
                AxisAlignedBB ab = sz.createSafeZoneHitBox();
                if (!(ab.minX < (double)x) || !((double)x < ab.maxX) || !(ab.minY < (double)y) || !((double)y < ab.maxY) || !(ab.minZ < (double)z) || !((double)z < ab.maxZ)) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean checkForBuildsAound(World world, int RPX, int RPZ, int s) {
        JRMCoreHDBC.WorldGenBuildingsSpawnCheck(FMLCommonHandler.instance().getMinecraftServerInstance());
        s = s + 50 + (world.provider.dimensionId == 22 ? 20 : 0);
        boolean bo = true;
        int[][] ps = JRMCoreHDBC.npc_ps();
        int[] dims = JRMCoreHDBC.npc_dims();
        for (int i = 0; i < ps.length; ++i) {
            AxisAlignedBB ab2;
            int[] npc = ps[i];
            if (dims[i] != world.provider.dimensionId || npc.length <= 2) continue;
            double genX = npc[0];
            double genY = npc[1];
            double genZ = npc[2];
            AxisAlignedBB ab = AxisAlignedBB.getBoundingBox((double)((double)RPX - (double)s), (double)65.0, (double)((double)RPZ - (double)s), (double)((double)RPX + (double)s), (double)100.0, (double)((double)RPZ + (double)s));
            if (!ab.intersectsWith(ab2 = AxisAlignedBB.getBoundingBox((double)(genX - (double)s), (double)65.0, (double)(genZ - (double)s), (double)(genX + (double)s), (double)100.0, (double)(genZ + (double)s)))) continue;
            bo = false;
        }
        return bo;
    }

    public static boolean hasHalo(EntityPlayer p) {
        return JRMCoreH.getByte(p, "jrmcAlv") == 1;
    }

    public static boolean isAlive(EntityPlayer p) {
        return JRMCoreH.getByte(p, "jrmcAlv") == 0;
    }

    public static int DBCgetConfigTechExpRate() {
        return DBCConfig.TechExpRate;
    }

    public static int DBCgetConfigTechExpNeed() {
        return DBCConfig.TechExpNeed;
    }

    public static int DBCgetConfigTechCostMod() {
        return DBCConfig.TechCostMod;
    }

    public static int DBCgetConfigcTechExpNeed() {
        return DBCConfig.cTechExpNeed;
    }

    public static int DBCgetConfigcTechCostMod() {
        return DBCConfig.cTechCostMod;
    }

    public static void DBCsetConfigTechExpNeed(int i) {
        DBCConfig.TechExpNeed = i;
    }

    public static void DBCsetConfigTechCostMod(int i) {
        DBCConfig.TechCostMod = i;
    }

    public static void reincarnate(EntityPlayer p) {
        if (!JRMCoreH.isFused((Entity)p)) {
            JRMCoreH.setInt(1, p, "jrmcRencrnt");
            for (int j = 0; j < 6; ++j) {
                int i = (int)((float)JRMCoreH.getInt(p, JRMCoreH.AttrbtNbtI[j]) * DBCConfig.Reinc);
                JRMCoreH.setInt(i, p, JRMCoreH.AttrbtNbtR[j]);
            }
            JRMCoreH.resetChar(p);
            if (JRMCoreHDBC.DBCgetConfigDeadInv() && p.worldObj.getGameRules().getGameRuleBooleanValue("keepInventory") && !p.capabilities.isCreativeMode && JRMCoreH.getByte(p, "jrmcAlv") == 1) {
                JRMCoreH.nbt(p).setTag("InventoryDead", (NBTBase)p.inventory.writeToNBT(new NBTTagList()));
                p.inventory.readFromNBT(JRMCoreH.nbt(p).getTagList("InventoryLiving", 10));
                p.getEntityData().setTag("Inventory", (NBTBase)p.inventory.writeToNBT(new NBTTagList()));
            }
            JRMCoreH.setByte(0, p, "jrmcAlv");
            if (p.dimension != DBCConfig.planetEarth) {
                FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)p, DBCConfig.planetEarth, (Teleporter)new WorldTeleporterDBCTelep(FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(DBCConfig.planetEarth)));
                p.addExperience(1);
                double[] d = DBCConfig.RevLocG;
                boolean by = false;
                ((EntityPlayerMP)p).playerNetServerHandler.setPlayerLocation(d[0], d[1], d[2], (float)DBCConfig.RevAng[0][0], (float)DBCConfig.RevAng[0][1]);
                ((EntityPlayerMP)p).playerNetServerHandler.setPlayerLocation(d[0], d[1] + 1.0, d[2], (float)DBCConfig.RevAng[0][0], (float)DBCConfig.RevAng[0][1]);
            }
        }
    }

    public static String f_namgen(String s1, String s2) {
        return s1.substring(0, s1.length() / 2) + s2.substring(s2.length() / 2);
    }

    public static void requestNullRealmKnockout() {
        PD.sendToServer(new DBCPwish(7, ""));
    }
}

