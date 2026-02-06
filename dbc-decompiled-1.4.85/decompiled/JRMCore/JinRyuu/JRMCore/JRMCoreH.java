/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.DBCClientTickHandler
 *  JinRyuu.DragonBC.common.DBCConfig
 *  JinRyuu.DragonBC.common.DBCH
 *  JinRyuu.DragonBC.common.Npcs.EntityDBCKami
 *  JinRyuu.DragonBC.common.Npcs.EntityDragon
 *  JinRyuu.DragonBC.common.Npcs.EntityPorunga
 *  JinRyuu.DragonBC.common.Render.KintounEntity
 *  JinRyuu.DragonBC.common.Render.SpacePod01Entity
 *  JinRyuu.DragonBC.common.Worlds.WorldGeneratorDB
 *  JinRyuu.NarutoC.common.NCCommonTickHandler
 *  JinRyuu.NarutoC.common.NCH
 *  JinRyuu.NarutoC.common.Worlds.WorldGeneratorNC
 *  com.google.common.base.Joiner
 *  com.google.common.base.Splitter
 *  com.google.gson.Gson
 *  cpw.mods.fml.common.FMLCommonHandler
 *  cpw.mods.fml.common.Loader
 *  cpw.mods.fml.common.ModContainer
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.relauncher.Side
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.CompressedStreamTools
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.StatCollector
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore;

import JinRyuu.DragonBC.common.DBCClientTickHandler;
import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.Npcs.EntityDBCKami;
import JinRyuu.DragonBC.common.Npcs.EntityDragon;
import JinRyuu.DragonBC.common.Npcs.EntityPorunga;
import JinRyuu.DragonBC.common.Render.KintounEntity;
import JinRyuu.DragonBC.common.Render.SpacePod01Entity;
import JinRyuu.DragonBC.common.Worlds.WorldGeneratorDB;
import JinRyuu.JRMCore.ComJrmcaBonus;
import JinRyuu.JRMCore.FamilyCH;
import JinRyuu.JRMCore.JRMCore;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreComTickH;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreEH;
import JinRyuu.JRMCore.JRMCoreGuiButtons01;
import JinRyuu.JRMCore.JRMCoreGuiScreen;
import JinRyuu.JRMCore.JRMCoreHC;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.JRMCoreHJFC;
import JinRyuu.JRMCore.JRMCoreHJYC;
import JinRyuu.JRMCore.JRMCoreM;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.ExplosionJRMC;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.items.ItemHeadwear;
import JinRyuu.JRMCore.mod_JRMCore;
import JinRyuu.JRMCore.p.DBC.DBCPacketHandlerServer;
import JinRyuu.JRMCore.p.DBC.DBCPduo;
import JinRyuu.JRMCore.p.JRMCorePAttck;
import JinRyuu.JRMCore.p.JRMCorePChar;
import JinRyuu.JRMCore.p.JRMCorePCost;
import JinRyuu.JRMCore.p.JRMCorePData;
import JinRyuu.JRMCore.p.JRMCorePExpl;
import JinRyuu.JRMCore.p.JRMCorePFall;
import JinRyuu.JRMCore.p.JRMCorePQuad;
import JinRyuu.JRMCore.p.JRMCorePQuadI;
import JinRyuu.JRMCore.p.JRMCorePRls;
import JinRyuu.JRMCore.p.JRMCorePStats;
import JinRyuu.JRMCore.p.JRMCorePStats2;
import JinRyuu.JRMCore.p.JRMCorePStats3;
import JinRyuu.JRMCore.p.JRMCorePStats3b;
import JinRyuu.JRMCore.p.JRMCorePTech;
import JinRyuu.JRMCore.p.JRMCorePTick;
import JinRyuu.JRMCore.p.JRMCorePTri;
import JinRyuu.JRMCore.p.JRMCorePTrib;
import JinRyuu.JRMCore.p.JRMCorePUpgrade;
import JinRyuu.JRMCore.p.PD;
import JinRyuu.JRMCore.server.JGMathHelper;
import JinRyuu.JRMCore.server.JGPlayerMP;
import JinRyuu.JRMCore.server.JGRaceHelper;
import JinRyuu.JRMCore.server.config.core.JGConfigMiniGameAirBoxing;
import JinRyuu.JRMCore.server.config.core.JGConfigMiniGameConcentration;
import JinRyuu.JRMCore.server.config.core.JGConfigSkills;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCAAiDifficulty;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCFormMastery;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCGoD;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCInstantTransmission;
import JinRyuu.JRMCore.server.config.dbc.JGConfigRaces;
import JinRyuu.JRMCore.server.config.dbc.JGConfigUltraInstinct;
import JinRyuu.NarutoC.common.NCCommonTickHandler;
import JinRyuu.NarutoC.common.NCH;
import JinRyuu.NarutoC.common.Worlds.WorldGeneratorNC;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.gson.Gson;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;
import java.util.regex.Matcher;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class JRMCoreH {
    public static final byte RACE_HUMAN = 0;
    public static final byte RACE_SAIYAN = 1;
    public static final byte RACE_HALF_SAIYAN = 2;
    public static final byte RACE_NAMEKIAN = 3;
    public static final byte RACE_ARCOSIAN = 4;
    public static final byte RACE_MAJIN = 5;
    public static final byte RACE_BASE_HUMAN = 0;
    public static final byte RACE_BASE_SAIYAN = 0;
    public static final byte RACE_BASE_HALF_SAIYAN = 0;
    public static final byte RACE_BASE_NAMEKIAN = 0;
    public static final byte RACE_BASE_ARCOSIAN = 4;
    public static final byte RACE_BASE_MAJIN = 0;
    public static String tjnc = "jinryuunarutoc";
    public static String tjdbc = "jinryuudragonblockc";
    public static String tjdbcAssts = "jinryuudragonbc";
    public static String tjyc = "jinryuuyearsc";
    public static String tjycAssts = "jinryuujyearsc";
    public static String tjfc = "jinryuufamilyc";
    public static String tjrmc = "jinryuujrmcore";
    public static String tjsaoc = "jinryuusaoc";
    public static String tjjrmc = "jinryuumodscore";
    public static String tjbc = "jinryuubleachc";
    public static HashMap<String, Integer> osbic = new HashMap();
    public static int pg = 0;
    public static String[] p = null;
    public static Entity targ = null;
    public static Entity targNPC = null;
    public static String ask = null;
    public static final String RACE_NAME_HUMAN = "Human";
    public static final String RACE_NAME_SAIYAN = "Saiyan";
    public static final String RACE_NAME_HALF_SAIYAN = "Half-Saiyan";
    public static final String RACE_NAME_NAMEKIAN = "Namekian";
    public static final String RACE_NAME_ARCOSIAN = "Arcosian";
    public static final String RACE_NAME_MAJIN = "Majin";
    public static final String[] Races = new String[]{"Human", "Saiyan", "Half-Saiyan", "Namekian", "Arcosian", "Majin"};
    public static final int RACES = Races.length;
    public static final String[] RaceAllow = new String[]{"All", "DBC", "DBC", "DBC", "DBC", "DBC", "HHC", "HHC", "HHC", "HHC", "HHC", "HHC", "HHC", "HHC"};
    public static final String[] RaceCanHaveHair = new String[]{"H", "H", "H", "A", "R", "H", "H", "H", "H", "H", "H", "H", "H", "H"};
    public static final String[] RaceCanHavePwr = new String[]{"0123", "012", "012", "012", "012", "012", "012", "012", "012", "012", "012", "012", "012", "012"};
    public static final int[] RaceCustomSkin = new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2};
    public static final int[] RaceHairColor = new int[]{-1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] RaceGenders = new int[]{2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    public static final int[] Specials = new int[]{1, 4, 4, 3, 3, 5, 5, 4, 1, 3, 4, 4, 3, 1};
    public static final String race = "Race";
    public static final String gender = "Gender";
    public static final String hair = "Hair";
    public static final String[] skinTyps = new String[]{"DefaultSkin", "CustomSkin"};
    public static final String bodytype = "BodyType";
    public static final int[][][] defbodycols = new int[][][]{new int[][]{{16297621, 6498048}, {16297621, 6498048}, {16297621, 6498048}, {5095183, 13796998, 12854822}, {15460342, 16111595, 8533141, 16550015}, {16757199, 15766205}}, new int[][]{{15979704, 6498048}, {15979704, 6498048}, {15979704, 6498048}, {4566029, 0xD88A8A, 0xDB2B2B}, {15460342, 15188457, 287340, 16550015}, {16752073, 16028862}}, new int[][]{{13014656, 6498048}, {13014656, 6498048}, {13014656, 6498048}, {4896782, 12875121, 12920870}, {15460342, 10442657, 3625381, 13125463}, {16483508, 15825582}}, new int[][]{{12622942, 6498048}, {12622942, 6498048}, {12622942, 6498048}, {0}, {0}, {14383492, 13987449}}, new int[][]{{10112303, 6498048}, {10112303, 6498048}, {10112303, 6498048}, {0}, {0}, {11433702, 10776284}}, new int[][]{{7225375, 6498048}, {7225375, 6498048}, {7225375, 6498048}, {0}, {0}, {7907292, 7578067}}, new int[][]{{3677711, 6498048}, {3677711, 6498048}, {3677711, 6498048}, {0}, {0}, {7916929, 7652472}}};
    public static final int[][] defeyecols = new int[][]{{1, 1, 1, 1, 14617612, 14551628}, {4896782, 1, 4896782, 4896782, 1, 8235495}, {14617612, 1, 14617612, 14617612, 4896782, 0xFFFFFF}};
    public static final int[][] customSknLimits = new int[][]{{1, 1, 5, 5, 6, 2}, {1, 1, 5, 5, 6, 0}, {1, 2, 5, 5, 6, 2}, {3, 3, 5, 5, 3, 2}, {3, 4, 5, 6, 2, 2}, {1, 1, 5, 5, 6, 2}};
    public static final int[] customSknLimitsBCP = new int[]{7, 7, 7, 3, 3, 7};
    public static final int hairLengthG2 = 786;
    public static final int hairLengthG1 = 392;
    public static final String[] defHairPrsts = new String[]{"345050555050801250505550501901505055505080235050455050803450505550508001505055505080015050555050802350505550508034505055505080125050555050800150505550508023505055505080015050555050800150505550506712505045505080015050455050800150504550508023505045505080345050455050801250504550508001505045505080235050455050800150504550508001505045505061015550505050800155505050508001555050505080015550505050800155505050508001555050505080015550505050800155505050508001555050505080015550505050800155505050508001555050505080015550505050630155505050506701555050505061015550505050671170505050503814705050505041147050505050411770505050503817705050505041207050505050412070505050504117705050505041227050505050412570505050504125705050505041207050505050412070505050503225705050505041257050505050412270505050503420", "18080801808080180808018080801808080180808018080801808080180808018080801808080180808018080801808080180808018080801808080180808018080801808080180808018080801808080180808018080804808080180808018080801808080180808018080804808080180808018080801808080180808018080801808080180808018080801808080180808028080801808080180808018080801808080180808018080801808080180808018080801808080180808018080801808080", "33843554384754461805224154501455050143505014550501435050143505014350501435050050505505050550505055145505014350501455050145505014550501455050145505005050450505045050504515050501505050150505015050501475049147504914750501475050152505015250501525050152505005550501475050147505005550503631847363184726318522631850267194727218502701850270185027019501701850270185027018501505050150505015050501505050", "08080180181919019191901819190505055050505505050550505055050505505050550505055050505505050550505055050504505050450505045050504505050450505045050504505050450505045050504505550504785050478505005550500555050474505047450500555050055505047150504715050055505005550500555050055505005550500325050425505042550500345050030505042350504235050038505003450504215050421505003450500695050419505041950500285050", "225067556150391150675561502311503245615023205032456150361750505450507117505054505071175050545050711750505450507101505054505071025050545050710150505450507100505054505071005050545050710050505450507122505045505071225050455050722250504550507222505045505072015050455050720150504550507201505045505072005050455050720050504550507200505045505072225445505050712254475050507122545250505071225454505050710154455050507101544950505071015450505050710154545050507100545050505071005450505050710054505050507100545050505071005450505050710054505050507100545050505071005450505050712850505650507465505074801930655050251819303750504550507437505056505074685050748018326850502519183234505045505074345050565050746850507480183868505025181838345050455050743450505650507480505074801843805050251819433450504550507420", "025050545050210250505450501801505045505021025050475050180147507467503248505072675043255250726750360150505667501922475071675038255050716750380152507167503202475071675032025250716750300050507167503000505047655036205250276550362250502765503620475027655036225250306550363150503065503622475030655034015250276550250147502765503000505027655036175050505050803150505050508028505050505080225050505050801750505050508022505050505080255050505050801750505050508000505050505080005050505050800050505050508000505050505080005050505050800050505050508000505050505080005050505050803154508067504931545080615028285450766150472854506561506551525080675038655250806150786052507861503451525069615050625050806950528250508061503485505078615030625050696150585149508069506157495080615080624950786150805149506961504920"};
    public static final String facenose = "Nose";
    public static final String facemouth = "Mouth";
    public static final String eyes = "Eyes";
    public static final String color = "Color";
    public static final String tail = "Tail";
    public static final String pwrtyp = "PowerType";
    public static final String[] Genders = new String[]{"Male", "Female"};
    public static final String[] GenderAllow = new String[]{"JRFC", "JRFC"};
    public static final String[] Years = new String[]{"Child", "Teen", "YoungAdult", "Adult", "MiddleAged", "Senior"};
    public static final int[] YearsD = new int[]{0, 25, 40, 52};
    public static final String[] Hairs = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "00"};
    public static final String[] HairsT = new String[]{"A", "B", "B", "C", "B", "C", "D", "B", "B", "A", "B", "A", "C", "C", "E", "C"};
    public static final String[] Hairs2 = new String[]{"01", "02", "03", "04", "05"};
    public static final String[] Hairs2T = new String[]{"A", "B", "B", "C", "B", "C", "D"};
    public static final String[] StateNames = new String[]{"Normal", "Super", "Super", "Super"};
    public static final String[] DifficultyNames = new String[]{"Normal", "Hard", "Insane"};
    public static final String[] DifficultySNmes = new String[]{"N", "H", "I"};
    public static final String[] DifficultyDesc = new String[]{"NormalDesc", "HardDesc", "InsaneDesc"};
    public static final String KaioDiffRed = "KaioDiffRed";
    public static final String[] Pwrtyps = new String[]{"Natural", "Ki", "Chakra", "SwordArt"};
    public static final String[] PwrtypAllow = new String[]{"All", "DBC", "NC", "SAOC"};
    public static final String[] PwrtypDesc = new String[]{"NaturalDesc", "KiDesc", "ChakraDesc", "SwordartDesc"};
    public static final String[] Classes = new String[]{"Survival"};
    public static final String[] ClassesDesc = new String[]{"SurvivalDesc"};
    public static final String[] ClassesDBC = new String[]{"MartialArtist", "Spiritualist", "Warrior"};
    public static final String[] ClassesDBCDesc = new String[]{"MartialArtistDesc", "SpiritualistDesc", "WarriorDesc"};
    public static final String[] Clans = new String[]{"Clanless", "Hyuuga", "Uchiha"};
    public static final String[] ClansDesc = new String[]{"ClanlessDesc", "HyuugaDesc", "UchihaDesc"};
    public static final String[] ClassNames = new String[]{"Class", "Class", "Clan", "None"};
    public static int BPMode;
    public static int kiAmount;
    public static double kiMultip;
    public static int dbcHealthCur;
    public static String[] dbcBP;
    public static int jrmcExp;
    public static int dbcEvilness;
    public static int dbcHealth;
    public static int dbcTrainPoint;
    public static int kiMax;
    public static int kiChargRa;
    public static int kiDash;
    public static int kiPunch;
    public static int kiJump;
    public static int kiFly;
    public static int kiAsclvl;
    public static int kiAscPow;
    public static int DSpeed;
    public static int minKi;
    public static String SEvil;
    public static String SHealth;
    public static String STrainPoint;
    public static String SkiMax;
    public static String SkiChargRa;
    public static String SkiDash;
    public static String SkiPunch;
    public static String SkiJump;
    public static String SkiFly;
    public static String SkiAsclvl;
    public static String SkiAscPow;
    public static int kiKaioKen;
    public static int kiInSuper;
    public static int KABigBang;
    public static int KABlast;
    public static int KABurningAtt;
    public static int KADeathBeam;
    public static int KADodon;
    public static int KAEnergyDisk;
    public static int KAFinalFlash;
    public static int KAFingerLaser;
    public static int KAGalicGun;
    public static int KAKameHame;
    public static int KAKameHame10x;
    public static int KAMakanko;
    public static int KAMasenko;
    public static int KAPlanetDest;
    public static int KASpiritBomb;
    public static int KTKaioken;
    public static int KASelected;
    public static int KACharge;
    public static int KAFired;
    public static int KAFireStop;
    public static int Senzu;
    public static boolean driF;
    public static boolean driB;
    public static boolean driU;
    public static boolean driD;
    public static boolean dbchalo;
    public static String[] dbcpd;
    public static String[] dbcSuperOn;
    public static String[] dbcLieDown;
    public static String Har;
    public static String Col;
    public static double forw;
    public static final String MOB_NBT_SPAWNINITIATED_CHP = "jrmcSpawnInitiatedCHP";
    public static final String MOB_NBT_SPAWNINITIATED_CAT = "jrmcSpawnInitiatedCAT";
    public static final String MOB_NBT_SPAWNINITIATED_CMT = "jrmcSpawnInitiatedCMT";
    public static final String MOB_NBT_SPAWNINITIATED_IMP = "jrmcSpawnInitiatedIMP";
    public static int ChakraAmount;
    public static double ChakraMultip;
    public static String hsp;
    public static int jutsumode;
    public static int handsealfailed;
    public static int jutsu;
    public static int jutsuinfo;
    public static String[] ncDou;
    public static int ncBodyCur;
    public static int ncExp;
    public static int ncEvil;
    public static int ncBody;
    public static int ncTP;
    public static int ncChMax;
    public static int ncChRa;
    public static int ncSpe;
    public static int ncTai;
    public static int ncTaiJump;
    public static int ncNinj;
    public static int ncGenj;
    public static int ncPow;
    public static String Sbody;
    public static String Stp;
    public static String SchMax;
    public static String SchRa;
    public static String Sspe;
    public static String Stai;
    public static String StaiJump;
    public static String SNinj;
    public static String SGenj;
    public static String SPow;
    public static String[] plyrsArnd;
    public static final String JTCCBattleData = "JTCCBattleData";
    public static final String JTCCBattleDataP1 = "JTCCBattleDataP1";
    public static final String JTCCBattleDataP2 = "JTCCBattleDataP2";
    public static final String JTCCBattleOps = "JTCCBattleOps";
    public static final String JTCCCCD = "JTCCCCD";
    public static final String JTCCDD = "JTCCDD";
    public static final String MissionSyncData = "JRMCmissionSync";
    public static final String MissionSyncDataVers = "JRMCmissionSyncVers";
    public static final String SagaSideDBC = "JRMCSideSaga";
    public static final String SagaSideTimesDBC = "JRMCSideSagaTimes";
    public static final String SagaMainDBC = "DBCSagaSys";
    public static final String SagaMainTimesDBC = "DBCSagaTimes";
    public static final String SagaGID = "JRMCGID";
    public static final String SagaGLID = "JRMCGLIDs";
    public static final String SagaGIDi = "JRMCGIDis";
    public static final String AttackTimer = "jrmcAttackTimer";
    public static final String AttackLstPlyrTm = "jrmcAttackLstPlyrTm";
    public static final String AttackLstPlyrNam = "jrmcAttackLstPlyrNam";
    public static final String SenzuCC = "jrmcSenzuCC";
    public static final String GravZoneLast = "jrmcGravZoneLast";
    public static final String GravZoneForce = "jrmcGravForce";
    public static final String Age = "JRYCAge";
    public static final String DNS = "jrmcDNS";
    public static final String DNSAU = "jrmcDNSAU";
    public static final String DNSH = "jrmcDNSH";
    public static final String R = "jrmcRace";
    public static final String P = "jrmcPwrtyp";
    public static final String Cl = "jrmcClass";
    public static final String Acc = "jrmcAccept";
    public static final String St = "jrmcState";
    public static final String St2 = "jrmcState2";
    public static final String StE = "jrmcStatusEff";
    public static final String senzu = "DBCSenzu";
    public static final String firing = "jrmcFrng";
    public static final String Diff = "jrmcDiff";
    public static final String Tm = "jrmcTlmd";
    public static final String master = "jrmcMaster";
    public static final String plyrSttngs = "jrmcSettings";
    public static final String AuraCol = "jrmcAuraColor";
    public static final String StrainTemp = "jrmcStrainTemp";
    public static final String Strain = "jrmcStrain";
    public static final String StrainActv = "jrmcStrainActv";
    public static final String GodStrain = "jrmcGodStrain";
    public static final String GodPwr = "jrmcGodPwr";
    public static final String S4afgft = "jrmcAfGFtStFT";
    public static final String Pain = "jrmcGyJ7dp";
    public static final String Heat = "jrmcEf8slc";
    public static final String KO = "jrmcHar4va";
    public static final String HeatD = "jrmcEf8slcD";
    public static final String SsnoCol = "jrmcSsnoc";
    public static final String DiffRed = "jrmcDiffRed";
    public static final String Ptch = "jrmcPtch";
    public static final String TrngTPlmt = "jrmcTPlimit";
    public static final String TrngTPlmt2 = "jrmcTPlimit2";
    public static final String SklSlt0 = "jrmcSSlt0";
    public static final String SklSlt1 = "jrmcSSlt1";
    public static final String SklSlt2 = "jrmcSSlt2";
    public static final String SklSlt3 = "jrmcSSlt3";
    public static final String SklSlt4 = "jrmcSSlt4";
    public static final String SklSlt5 = "jrmcSSlt5";
    public static final String SklSlt6 = "jrmcSSlt6";
    public static final String SklSlt7 = "jrmcSSlt7";
    public static final String SklSlt8 = "jrmcSSlt8";
    public static final String SklSlt9 = "jrmcSSlt9";
    public static final String SklSltX = "jrmcSSltX";
    public static final String SklSltY = "jrmcSSltY";
    public static final String[] AttrbtNbt;
    public static final String[] AttrbtNbtI;
    public static final String[] AttrbtNbtR;
    public static final String SkillXNbt = "jrmcSSltX";
    public static final String SkillYNbt = "jrmcSSltY";
    public static final String SkillZNbt = "jrmcSSltZ";
    public static final String[] SkillsNbt;
    public static final String SkillsNbt2 = "jrmcSSlts";
    public static final String CurBody = "jrmcBdy";
    public static final String CurEnergy = "jrmcEnrgy";
    public static final String CurStamina = "jrmcStamina";
    public static final String CurRelease = "jrmcRelease";
    public static final String Align = "jrmcAlign";
    public static final String Karma = "jrmcKarma";
    public static final String KllCG = "jrmcKillCountGood";
    public static final String KllCN = "jrmcKillCountNeut";
    public static final String KllCE = "jrmcKillCountEvil";
    public static final String DiedTimes = "jrmcDiedTimes";
    public static final String GTrnng = "jrmcGTrnng";
    public static final String htcTmO = "jrmcHTCTmO";
    public static final String alCntr = "jrmcAlCntr";
    public static final String inventoryLiving = "InventoryLiving";
    public static final String inventoryDead = "InventoryDead";
    public static final String RevTmr = "jrmcReviveTmer";
    public static final String Rencrnt = "jrmcRencrnt";
    public static final String RevtpInit = "jrmcRevtpInit";
    public static final String LastDamageDealt = "jrmcLastDamageDealt";
    public static final String LastDamageReceived = "jrmcLastDamageReceived";
    public static final String LastAttacker = "jrmcLastAttacker";
    public static final String[] FAttrbtNbt;
    public static final String FAge = "JRYCAgeF";
    public static final String FDNS = "jrmcDNSF";
    public static final String FDNSH = "jrmcDNSHF";
    public static final String FTP = "jrmcTpF";
    public static final String FUSION = "jrmcFuzion";
    public static final String FUSION_DEATH = "jrmcFuzionDeath";
    public static final String Majin = "jrmcMajin";
    public static final String MysticTimer = "jrmcUltmtTm";
    public static final String alive = "jrmcAlv";
    public static final String stand = "jrmcStnd";
    public static final String Wishes = "jrmcWishes";
    public static final String Drgn = "jrmcDrgn";
    public static final String dj = "jrmcdj";
    public static final String NBT_UI_HighestStateReached = "jrmcUIStateReach";
    public static final String NBT_UI_WasInPain = "jrmcUIWasInPain";
    public static final String NBT_UI_WasInPainDuration = "jrmcUIWasInPainDuration";
    public static final String NBT_InstantTransmissionTimers = "jrmcInstantTransmissionTimers";
    public static final String NBT_FormMasteryRacial = "jrmcFormMasteryRacial";
    public static final String NBT_FormMasteryDefault = "Base,0";
    public static final String NBT_FormMasteryDefaultNonRacial = "Kaioken,0";
    public static final String NBT_FormMasteryNonRacial = "jrmcFormMasteryNonRacial";
    public static final String NBT_MajinAbsorptionData = "jrmcMajinAbsorptionData";
    public static final String NBT_MajinAbsorptionTimer = "jrmcMajinAbsorptionTimer";
    public static String bonusAttributes;
    public static String FznDC;
    public static int Master;
    public static String MSD;
    public static String MSDV;
    public static int SagaProg;
    public static int SagaTimes;
    public static int SagaSideProg;
    public static int[] SagaSideTimes;
    public static int GID;
    public static String GLID;
    public static int[] GIDs;
    public static String GIDi;
    public static int GMN;
    public static HashMap<Integer, ArrayList<String>> nwl;
    public static int ServerPoints;
    public static int trngTPlmt;
    public static int trngTPlmt2;
    public static int revTmr;
    public static String revtpInit;
    public static int wishes;
    public static byte Race;
    public static String dns;
    public static String dnsau;
    public static String dnsH;
    public static byte Pwrtyp;
    public static byte Class;
    public static byte Accepted;
    public static byte State;
    public static byte State2;
    public static byte Dffclty;
    public static byte TlMd;
    public static byte PtchVc;
    public static int GTrnngCB;
    public static float WeightOn;
    public static float GravZone;
    public static int s4ft;
    public static float age;
    public static int curBody;
    public static int curEnergy;
    public static int curStamina;
    public static int maxBody;
    public static int maxEnergy;
    public static int maxStamina;
    public static byte curRelease;
    public static int curTP;
    public static int curExp;
    public static int curn;
    public static int cura;
    public static int ko;
    public static boolean kob;
    public static int pnp;
    public static boolean pnh;
    public static short charged;
    public static byte chrgPrc;
    public static byte channel;
    public static byte wave;
    public static boolean mrAtts;
    public static byte EnAtSlct;
    public static float curTech1CD;
    public static float curTech2CD;
    public static float curTech3CD;
    public static float curTech4CD;
    public static float curTech5CD;
    public static float curTech6CD;
    public static float curTech7CD;
    public static float curTech8CD;
    public static boolean isShtng;
    public static boolean isChrgng;
    public static float cast;
    public static byte align;
    public static int karma;
    public static float[] techniqueCooldowns;
    public static String PlyrSettings;
    public static int[] PlyrAttrbts;
    public static String PlyrSkillX;
    public static String PlyrSkillY;
    public static String PlyrSkillZ;
    public static String[] PlyrSkills;
    public static final String[] StusEfcts;
    private static final String[] PlyrSttngs;
    public static final String[] vlblRSkls;
    public static int[][] DBCRacialSkillTPCost;
    public static int[][] cDBCRacialSkillTPCost;
    public static int[][] DBCRacialSkillMindCost;
    public static int[][] cDBCRacialSkillMindCost;
    public static final String[] vlblRSklsNms;
    public static final String[] vlblCSkls;
    public static final int[][] vlblCSklsLvl;
    public static final String[] vlblCSklsNms;
    public static final String[] DBCSkillsIDs;
    public static final int[] vlblSklsUps;
    public static int[][] DBCSkillTPCost;
    public static int[][] cDBCSkillTPCost;
    public static int[][] DBCSkillMindCost;
    public static int[][] cDBCSkillMindCost;
    public static final String[] DBCSkillNames;
    public static final float SklLvl_KiBsM = 0.01f;
    public static String[] inIll;
    public static final String[] ncRSkls;
    public static final int[][] ncRSklsLvl;
    public static final String[] ncRSklsNms;
    public static final String[] ncCSkls;
    public static final String[] NCRacialSkillAbilityNames;
    public static int[][] NCRacialSkillTPCost;
    public static int[][] cNCRacialSkillTPCost;
    public static int[][] NCRacialSkillMindCost;
    public static int[][] cNCRacialSkillMindCost;
    public static final String[] NCSkillIDs;
    public static final int[] ncSklsUps;
    public static int[][] NCSkillTPCost;
    public static int[][] cNCSkillTPCost;
    public static int[][] NCSkillMindCost;
    public static int[][] cNCSkillMindCost;
    public static final String[] NCSkillNames;
    public static final String[] NCRankNames;
    public static String[] tech1;
    public static String[] tech2;
    public static String[] tech3;
    public static String[] tech4;
    public static int[] techPM;
    public static String[] plyrs;
    public static String[] data0;
    public static String[] data1;
    public static String[] data2;
    public static String[] data3;
    public static String[] data4;
    public static String[] data5;
    public static String[] data6;
    public static String[] data7;
    public static String[] data8;
    public static String[] data9;
    public static String[] dat10;
    public static String[] dat11;
    public static String[] dat12;
    public static String[] dat13;
    public static String[] dat14;
    public static String[] dat15;
    public static String[] dat16;
    public static String[] dat17;
    public static String[] dat18;
    public static String[] dat19;
    public static String[] dat20;
    public static String[] dat21;
    public static String[] dat22;
    public static String[] dat23;
    public static String[] dat24;
    public static String[] dat25;
    public static String[] dat26;
    public static String[] dat27;
    public static String[] dat28;
    public static String[] dat29;
    public static String[] dat30;
    public static String[] dat31;
    public static String[] dat32;
    public static String[] dat32Segmented;
    public static final int BPCH_Original = 0;
    public static final int BPCH_Previous = 1;
    public static final int BPCH_Current = 2;
    public static final int BPCH_ResetTime = 3;
    public static final int BPCH_TimeCurrent = 4;
    public static final int BPCH_TimePrevious = 5;
    private static HashMap<String, Object[]> tacx;
    public static final String[] techNbt;
    public static final String techNbtLearn = "jrmcTechLearn";
    public static final short TransSaiMxRg = 100;
    public static final String TransSaiRgNbt = "jrmcSaiRg";
    public static final String ArcRsrvNbt = "jrmcArcRsrv";
    public static final int[] ArcRsrvGrowth;
    public static final int[] ArcRsrvMaxSkll;
    public static int[] ArcRsrvPowCst;
    public static byte TransSaiCurRg;
    public static float[][] TransSaiStBnP;
    public static float[][] TransSaiStBnPO;
    public static int[][] TransSaiStBnF;
    public static float[][] TransHalfSaiStBnP;
    public static float[][] TransHalfSaiStBnPO;
    public static int[][] TransHalfSaiStBnF;
    public static float[][] TransFrStBnP;
    public static float[][] TransFrStBnPO;
    public static int[][] TransFrStBnF;
    public static float[][] TransHmStBnP;
    public static float[][] TransHmStBnPO;
    public static int[][] TransHmStBnF;
    public static float[][] TransNaStBnP;
    public static float[][] TransNaStBnPO;
    public static int[][] TransNaStBnF;
    public static float[][] TransMaStBnP;
    public static float[][] TransMaStBnPO;
    public static int[][] TransMaStBnF;
    public static float[][] DoujutsuPowerBonusMulti;
    public static int[][] DoujutsuPowerBonusFlat;
    public static final String[][] TransNms;
    public static final String[][] trans;
    public static final String[][] TransNmsM;
    public static final byte[][] transformationDescendToFormID;
    public static final String[] majinRacialSkillNames;
    public static final String trans_KAIOKEN = "Kaioken";
    public static final String trans_MYSTIC = "Mystic";
    public static final String trans_ULTRA_INSTINCT = "UltraInstict";
    public static final String trans_GOD_OF_DESTRUCTION = "GodOfDestruction";
    public static final int trans_KAIOKEN_ID = 0;
    public static final int trans_MYSTIC_ID = 1;
    public static final int trans_UI_ID = 2;
    public static final int trans_GOD_ID = 3;
    public static final String[] transNonRacial;
    public static final String[] TransSaiUpNam;
    public static final short[] TransSaiTre;
    public static final float[] TransSaiBlk;
    public static final float[] TransSaiSz;
    public static float[] TransSaiRgnO;
    public static float[] TransSaiRgn;
    public static float[] TransHalfSaiRgnO;
    public static float[] TransHalfSaiRgn;
    public static final float Kkm = 0.01f;
    public static final short[] TransFrSkn;
    public static final short[] TransFrSkn2;
    public static final short[] TransFrHrn;
    public static final float[] TransFrBlk;
    public static final float[] TransFrSz;
    public static float[] TransFrRgnO;
    public static float[] TransFrRgn;
    public static float[] TransHmRgnO;
    public static float[] TransHmRgn;
    public static final float[] TransHmBlk;
    public static final float[] TransHmSz;
    public static float[] TransNaRgnO;
    public static float[] TransNaRgn;
    public static final float[] TransNaBlk;
    public static final float[] TransNaSz;
    public static final float[] TransMaBulk;
    public static final float[] TransMaSize;
    public static float[] TransMaRgnO;
    public static float[] TransMaRgn;
    public static final String[] TransGtsNms;
    public static float[] TransGtsDmg;
    public static float[] TransGtsDmgO;
    public static String[] TransKaiNms;
    public static String[] TransKaiNmsO;
    public static float[] TransKaiDmg;
    public static float[] TransKaiDmgO;
    public static float[] TransKaiDrainRace;
    public static float[] TransKaiDrainORace;
    public static float[] TransKaiDrainLevel;
    public static float[] TransKaiDrainOLevel;
    public static float[] TransMngDmg;
    public static float[] TransMngDmgO;
    public static final String[] AlgnmntNms;
    public static final int[] techCol;
    public static final int[] techCol2;
    public static final int[] techCol3;
    public static final int[] techCol4;
    public static final String[] techColName;
    public static final byte techMult = 20;
    public static final int[] techBase;
    public static final int[] techMin;
    public static final int[] techMax;
    public static final int[] techUpg;
    public static final int[] techNCBase;
    public static final int[] techNCMin;
    public static final int[] techNCMax;
    public static final int[] techNCUpg;
    public static final byte TECH_AMOUNT_CUSTOM = 4;
    public static final byte TECH_AMOUNT_FIX = 4;
    public static final byte TECH_AMOUNT = 8;
    public static final int tech_statmod_sped = 0;
    public static final int tech_statmod_damg = 1;
    public static final int tech_statmod_cost = 2;
    public static final int tech_statmod_cast = 3;
    public static final int tech_statmod_cool = 4;
    public static final int tech_statmod_dens = 5;
    public static final int tech_statmod_size = 6;
    public static final String[] techDBCstatmods;
    private static final byte[] tech_stats;
    public static final int tech_type_wave = 0;
    public static final int tech_type_ball = 1;
    public static final int tech_type_disk = 2;
    public static final int tech_type_laser = 3;
    public static final int tech_type_spiral = 4;
    public static final int tech_type_large = 5;
    public static final int tech_type_barrage = 6;
    public static final int tech_type_defensive_kiai = 7;
    public static final int tech_type_offensive_kiai = 8;
    public static final String[] techDBCName;
    public static final String[] techDBCTypes;
    public static final float[] techDBCaddTYCost;
    public static final float[] techDBCct;
    public static final float[] techDBCcd;
    public static final String[] techDBCEffects;
    public static final String[] techDBCAcquired;
    public static final String[] techDBCSpeed;
    public static final float[] techDBCaddSPCost;
    public static final byte[] techDBCstatsDefault;
    public static final String[] techName;
    public static final String[] techTypes;
    public static final String[] techEffects;
    public static final String[] techAcquired;
    public static final String[] techSpeed;
    public static final String[] techSndIncBeam;
    public static final String[] techSndFireBeam;
    public static final String[] techSndMoveBeam;
    public static final String[] techSndIncDisk;
    public static final String[] techSndFireDisk;
    public static final String[] techSndMoveDisk;
    public static final String[] techSndFireLeser;
    public static final String[] techSndPMInc;
    public static final String[] techSndPMIncFire;
    public static final String[] techSndPMFire;
    public static final String[] techSndPMMove;
    public static final String techTPCost = "TP Current/Cost";
    public static final int masterNone = 0;
    public static final int masterGeneral = 1;
    public static final int masterRoshi = 2;
    public static final int masterShen = 3;
    public static final int masterKorin = 4;
    public static final int masterKami = 5;
    public static final int masterKai = 6;
    public static final int masterKrillin = 7;
    public static final int masterPiccolo = 8;
    public static final int masterVegeta = 9;
    public static final int masterTrunks = 10;
    public static final int masterFreiza = 11;
    public static final int masterCell = 12;
    public static final int masterGoku = 13;
    public static final int masterGohan = 14;
    public static final int masterBabidi = 15;
    public static final int masterJin = 16;
    public static final int masterGuru = 17;
    public static final int masterWhis = 18;
    public static final String[] Masters;
    public static final String[][] pmdbc;
    public static final int tech_element_fire = 0;
    public static final int tech_element_wind = 1;
    public static final int tech_element_lightning = 2;
    public static final int tech_element_earth = 3;
    public static final int tech_element_water = 4;
    public static final String[] techNCName;
    public static final String[] techNCTypes;
    public static final String[] techNCEffects;
    public static final String[] techNCAcquired;
    public static final String[] techNCDam;
    public static final String[] techNCClassn;
    public static final String[] techNCSpeed;
    public static final String[] techNCBunshintyp;
    public static final String[] techNCSndIncAff;
    public static final String[] techNCSndIncTyp;
    public static final String[] techNCSndIncCls;
    public static final String[] techNCSndIncSpec;
    public static final String[] techNCSndIncBeam;
    public static final String[] techNCSndIncDisk;
    public static final String[] techNCSndFireBeam;
    public static final String[] techNCSndFireDisk;
    public static final String[] techNCSndMoveBeam;
    public static final String[] techNCSndMoveDisk;
    public static final String[] techNCSndIncPM;
    public static final String[] techNCSndHitPM;
    public static final String[] techNCSndFirePM;
    public static final int[] techNCCol;
    public static final int[] techNCCostP;
    public static final String[] techNCEffHS;
    public static final String[] techNCCCHS;
    public static final int techNCCD = 100;
    public static final String hsF = "323";
    public static final String hsD = "132";
    public static final String hsL = "213";
    public static final String hsE = "312";
    public static final String hsW = "121";
    public static final String hsG = "231";
    public static final String hsY = "313";
    public static final String hsN = "131";
    public static final String hsT = "212";
    public static final String hsR = "133";
    public static final String hsH = "232";
    public static String[] techNCPreMadeSeals;
    public static final String[] NarutoNPCnames;
    public static final int[] NarutoNPCclans;
    public static final String[] MastersNC;
    public static final String[][] pmj;
    public static final String[] dmgMlTyps;
    public static final String EXP = "jrmcExp";
    public static final String TP = "jrmcTp";
    public static final String TPint = "jrmcTpint";
    public static final String tp = "Training Points";
    public static final String cost = "Cost";
    public static final String AP = "jrmcAp";
    public static final int MaxAttribute = 1000000000;
    public static final int MaxTP = 2000000000;
    public static final String[][] statNames;
    public static final String[][] attrInit;
    public static final String[][] attrNms;
    public static final String[][] attrDsc;
    public static final String[][] attrStat;
    public static final float[][] statInc;
    public static final int[][][] attrStart;
    static Splitter splitter;
    static Joiner joiner;
    public static final int TP_COST_UPGRADE_LOCK = -1;
    public static final int maxCalculatableAttribute = 6000000;
    public static HashMap<Integer, Long> attrCstH;
    public static final int[][] statIncBonusRaceDBC;
    public static final int[][][] statIncBonusClass;
    public static String[] sao_skillSlot;
    public static String[] sao_skills;
    public static int sao_level;
    public static int sao_exp;
    public static int sao_ap;
    public static int sao_sp;
    public static int sao_col;
    public static final String SAO_EXP = "saocExp";
    public static final String SAO_LVL = "saocLvl";
    public static final String SAO_AP = "saocAp";
    public static final String SAO_SP = "saocSp";
    public static final String SAO_SS = "saocSklslt";
    public static final String SAO_SM = "saocSklmp";
    public static final String SAO_COL = "saocCol";
    public static final int SAO_MAXCHAR_LVL = 250;
    public static final float SAO_MAXSKILL_LVL = 1000.0f;
    public static Map saoSkls;
    public static final String[] SAO_SkillMap_Cats;
    public static final String[] SAO_SkillMap_Weapons;
    public static final String[] SAO_SkillMap_WeaponTypes;
    public static final String[] SAO_Weapon_Cat_Sword;
    public static final String[] SAO_Weapon_Cat_Curved;
    public static final String[] SAO_Weapon_Cat_Dagger;
    public static final String[] SAO_Weapon_Cat_Rapier;
    public static final String[] SAO_Weapon_Cat_Axe;
    public static final String[] SAO_Weapon_Cat_Spear;
    public static final String[] SAO_Weapon_Cat_BattleAxe;
    public static final String[] SAO_Weapon_Cat_WarHammer;
    public static final String[] SAO_Weapon_Cat_Sword2;
    public static final String[] SAO_Weapon_Cat_Katana;
    public static final String[] SAO_SkillMap_Armors;
    public static HashMap<String, String> damInd;
    public static final String[] TrnngOptns;
    public static String[] jfcData0;
    public static String[] jfcaa;
    public static String[] jfcms;
    public static String[] jfcmt;
    public static String[] jfccp;
    public static String[] jfccs;
    public static String proc;
    public static String[] preg;
    public static HashMap<String, Boolean> modsC;
    public static HashMap<String, Boolean> modsS;
    public static float Perc10;
    public static float Perc15;
    public static float Perc20;
    public static boolean DBCresetted;
    public static boolean NCresetted;
    public static String difp;
    public static final int TP_GAIN_MODE = -1;
    private static final String[] NAMES;
    private static final BigInteger THOUSAND;
    private static final NavigableMap<BigInteger, String> MAP;
    public static String[] ltnb;
    public static String cldb;
    public static String cldg;
    public static String cla;
    public static String cldr;
    public static String cldp;
    public static String clgd;
    public static String clgy;
    public static String cldgy;
    public static String clbe;
    public static String clb;
    public static String cllg;
    public static String cllb;
    public static String cllr;
    public static String clpr;
    public static String cly;
    public static String clw;
    public static final ChatStyle CHAT_STYLE_YELLOW;
    public static double explosionX;
    public static double explosionY;
    public static double explosionZ;
    public static float explosionSize;
    public static List chunkPositionRecords;
    private static float playerVelocityX;
    private static float playerVelocityY;
    private static float playerVelocityZ;
    public static double expDam;
    public static Entity origin1;
    public static byte extype;
    static String wi;
    static String bs;
    static String wip;
    public static HashMap<String, String> modAssetIDs;
    public static boolean paused;
    public static HashMap<String, String> turih;
    public static long mem;
    public static boolean familyCEmptyFamiliesCleared;
    public static String previousServerFolder;

    public static boolean DGE(Entity e) {
        return JRMCoreH.DBC() && !(e instanceof EntityDBCKami) && !(e instanceof SpacePod01Entity) && !(e instanceof KintounEntity) && !(e instanceof EntityDragon) && !(e instanceof EntityPorunga);
    }

    public static int PlyrState2(EntityPlayer p) {
        int on = 0;
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(2)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(p.getCommandSenderName())) continue;
                String[] s2 = data2[pl].split(";");
                on = Integer.parseInt(s2[1]);
                break;
            }
        }
        if (side == Side.SERVER) {
            on = JRMCoreH.getByte(p, St2);
        }
        return on;
    }

    public static byte PlyrPwr(EntityPlayer p) {
        byte on = 0;
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(1)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(p.getCommandSenderName())) continue;
                String[] s = data1[pl].split(";");
                on = Byte.parseByte(s[2]);
                break;
            }
        }
        if (side == Side.SERVER) {
            NBTTagCompound aPlayer = JRMCoreH.nbt((Entity)p, "pres");
            on = aPlayer.getByte(P);
        }
        return on;
    }

    public static byte clsTypOn(EntityPlayer par1EntityPlayer) {
        byte on = 0;
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(1)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(par1EntityPlayer.getCommandSenderName())) continue;
                String[] s = data1[pl].split(";");
                on = Byte.parseByte(s[3]);
                break;
            }
        }
        if (side == Side.SERVER) {
            NBTTagCompound aPlayer = JRMCoreH.nbt((Entity)par1EntityPlayer, "pres");
            on = aPlayer.getByte(Cl);
        }
        return on;
    }

    public static boolean HairExists(EntityPlayer par1EntityPlayer) {
        boolean on = false;
        on = JRMCoreH.armTypSaiyansOn(par1EntityPlayer);
        return on;
    }

    public static boolean saiyanBlood(String[] s) {
        return s[4].contains("1") && JRMCoreH.userKi(s) && (s[0].contains("1") || s[0].contains("2"));
    }

    public static boolean userNatur(String[] s) {
        return s[2].contains("0");
    }

    public static boolean userKi(String[] s) {
        return s[2].contains("1");
    }

    public static boolean userChakra(String[] s) {
        return s[2].contains("2");
    }

    public static boolean userSwordArt(String[] s) {
        return s[2].contains("3");
    }

    public static boolean state(String s, int i) {
        return s.contains("" + i);
    }

    public static boolean saiyanBlood(NBTTagCompound nbt) {
        return nbt.getByte(Acc) == 1 && JRMCoreH.kiUser(nbt) && JRMCoreH.rc_sai(nbt.getByte(R));
    }

    public static boolean NaturUser(NBTTagCompound nbt) {
        return nbt.getByte(P) == 0;
    }

    public static boolean kiUser(NBTTagCompound nbt) {
        return nbt.getByte(P) == 1;
    }

    public static boolean chakraUser(NBTTagCompound nbt) {
        return nbt.getByte(P) == 2;
    }

    public static boolean state(NBTTagCompound nbt, int i) {
        return nbt.getByte(St) == (byte)i;
    }

    public static boolean isRaceSaiyan() {
        return Race == 1 || Race == 2;
    }

    public static boolean isRaceNamekian() {
        return Race == 3;
    }

    public static boolean isRaceHuman() {
        return Race == 0;
    }

    public static boolean isRaceHumanOrNamekian() {
        return JRMCoreH.isRaceHuman() || JRMCoreH.isRaceNamekian();
    }

    public static boolean isRaceArcosian() {
        return Race == 4;
    }

    public static boolean isRaceMajin() {
        return Race == 5;
    }

    public static boolean isRaceHalfSaiyan(int r) {
        return r == 2;
    }

    public static boolean isRaceFullSaiyan(int r) {
        return r == 1;
    }

    public static boolean isRaceSaiyan(int r) {
        return r == 1 || r == 2;
    }

    public static boolean isRaceNamekian(int r) {
        return r == 3;
    }

    public static boolean isRaceHuman(int r) {
        return r == 0;
    }

    public static boolean isRaceHumanOrNamekian(int r) {
        return JRMCoreH.isRaceHuman(r) || JRMCoreH.isRaceNamekian(r);
    }

    public static boolean isRaceArcosian(int r) {
        return r == 4;
    }

    public static boolean isRaceMajin(int r) {
        return r == 5;
    }

    public static boolean rc_sai(int r) {
        return JRMCoreH.isRaceSaiyan(r);
    }

    public static boolean rc_humNam(int r) {
        return JRMCoreH.isRaceHumanOrNamekian(r);
    }

    public static boolean rc_hum(int r) {
        return JRMCoreH.isRaceHuman(r);
    }

    public static boolean rc_nam(int r) {
        return JRMCoreH.isRaceNamekian(r);
    }

    public static boolean rc_arc(int r) {
        return JRMCoreH.isRaceArcosian(r);
    }

    public static boolean rc_maj(int r) {
        return JRMCoreH.isRaceMajin(r);
    }

    public static boolean isInState(int state) {
        return State == (byte)state;
    }

    public static boolean isInState(int currentState, int state) {
        return currentState == state;
    }

    public static int getBaseForm(int race) {
        return JRMCoreH.rc_arc(race) ? 4 : 0;
    }

    public static boolean isInBaseForm(int race, int state) {
        return state == JRMCoreH.getBaseForm(race);
    }

    public static boolean rc_bs(int r, int s) {
        return JRMCoreH.isInBaseForm(r, s);
    }

    public static boolean rc_sai() {
        return Race == 1 || Race == 2;
    }

    public static boolean rc_humNam() {
        return Race == 0 || Race == 3;
    }

    public static boolean rc_hum() {
        return Race == 0;
    }

    public static boolean rc_nam() {
        return Race == 3;
    }

    public static boolean rc_arc() {
        return Race == 4;
    }

    public static boolean rc_bs() {
        return State == (JRMCoreH.rc_arc() ? (byte)4 : 0);
    }

    public static boolean race_match(int race, int race2) {
        return JRMCoreH.isRaceSaiyan(race) && JRMCoreH.isRaceSaiyan(race2) || JRMCoreH.isRaceHuman(race) && JRMCoreH.isRaceHuman(race2) || JRMCoreH.isRaceArcosian(race) && JRMCoreH.isRaceArcosian(race2) || JRMCoreH.isRaceNamekian(race) && JRMCoreH.isRaceNamekian(race2) || JRMCoreH.isRaceMajin(race) && JRMCoreH.isRaceMajin(race2);
    }

    public static boolean isPowerTypeKi(int powerType) {
        return powerType == 1;
    }

    public static boolean isPowerTypeChakra(int powerType) {
        return powerType == 2;
    }

    public static boolean isPowerTypeSAO(int powerType) {
        return powerType == 3;
    }

    public static boolean isPowerTypeKi() {
        return Pwrtyp == 1;
    }

    public static boolean isPowerTypeChakra() {
        return Pwrtyp == 2;
    }

    public static boolean isPowerTypeSAO() {
        return Pwrtyp == 3;
    }

    public static boolean pwr_ki(int powerType) {
        return JRMCoreH.isPowerTypeKi(powerType);
    }

    public static boolean pwr_cha(int powerType) {
        return JRMCoreH.isPowerTypeChakra(powerType);
    }

    public static boolean pwr_sa(int powerType) {
        return JRMCoreH.isPowerTypeSAO(powerType);
    }

    public static boolean pwr_ki() {
        return JRMCoreH.isPowerTypeKi();
    }

    public static boolean pwr_cha() {
        return JRMCoreH.isPowerTypeChakra();
    }

    public static boolean pwr_sa() {
        return JRMCoreH.isPowerTypeSAO();
    }

    public static boolean armTypSaiyansOn(EntityPlayer par1EntityPlayer) {
        boolean on = false;
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(1) && JRMCoreH.dnn(2)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(par1EntityPlayer.getCommandSenderName())) continue;
                String[] s = data1[pl].split(";");
                String[] s2 = data2[pl].split(";");
                if (!JRMCoreH.saiyanBlood(s)) break;
                if (JRMCoreH.state(s2[0], 0)) {
                    kiInSuper = 0;
                }
                on = true;
                break;
            }
        }
        if (side == Side.SERVER) {
            NBTTagCompound aPlayer = JRMCoreH.nbt((Entity)par1EntityPlayer, "pres");
            on = JRMCoreH.saiyanBlood(aPlayer);
        }
        return on;
    }

    public static boolean armTypNormOn(EntityPlayer par1EntityPlayer) {
        boolean on = false;
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(1) && JRMCoreH.dnn(2)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(par1EntityPlayer.getCommandSenderName())) continue;
                String[] s = data1[pl].split(";");
                String[] s2 = data2[pl].split(";");
                if (!JRMCoreH.saiyanBlood(s) || !JRMCoreH.state(s2[0], 0)) break;
                kiInSuper = 0;
                on = true;
                break;
            }
        }
        if (side == Side.SERVER) {
            NBTTagCompound aPlayer = JRMCoreH.nbt((Entity)par1EntityPlayer, "pres");
            on = JRMCoreH.saiyanBlood(aPlayer) && JRMCoreH.state(aPlayer, 0);
        }
        return on;
    }

    public static boolean armTypSuperOn(EntityPlayer par1EntityPlayer) {
        boolean on = false;
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(1) && JRMCoreH.dnn(2)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(par1EntityPlayer.getCommandSenderName())) continue;
                String[] s = data1[pl].split(";");
                String[] s2 = data2[pl].split(";");
                if (!JRMCoreH.saiyanBlood(s) || JRMCoreH.state(s2[0], 0)) break;
                kiInSuper = 0;
                on = true;
                break;
            }
        }
        if (side == Side.SERVER) {
            NBTTagCompound aPlayer = JRMCoreH.nbt((Entity)par1EntityPlayer, "pres");
            on = JRMCoreH.saiyanBlood(aPlayer) && !JRMCoreH.state(aPlayer, 0);
        }
        return on;
    }

    public static boolean armTypSS1On(EntityPlayer par1EntityPlayer) {
        boolean on = false;
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(1) && JRMCoreH.dnn(2)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(par1EntityPlayer.getCommandSenderName())) continue;
                String[] s = data1[pl].split(";");
                String[] s2 = data2[pl].split(";");
                if (!JRMCoreH.saiyanBlood(s) || !JRMCoreH.state(s2[0], 1)) break;
                on = true;
                break;
            }
        }
        if (side == Side.SERVER) {
            NBTTagCompound aPlayer = JRMCoreH.nbt((Entity)par1EntityPlayer, "pres");
            on = JRMCoreH.saiyanBlood(aPlayer) && JRMCoreH.state(aPlayer, 1);
        }
        return on;
    }

    public static boolean armTypSS2On(EntityPlayer par1EntityPlayer) {
        boolean on = false;
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(1) && JRMCoreH.dnn(2)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(par1EntityPlayer.getCommandSenderName())) continue;
                String[] s = data1[pl].split(";");
                String[] s2 = data2[pl].split(";");
                if (!JRMCoreH.saiyanBlood(s) || !JRMCoreH.state(s2[0], 2)) break;
                on = true;
                break;
            }
        }
        if (side == Side.SERVER) {
            NBTTagCompound aPlayer = JRMCoreH.nbt((Entity)par1EntityPlayer, "pres");
            on = JRMCoreH.saiyanBlood(aPlayer) && JRMCoreH.state(aPlayer, 2);
        }
        return on;
    }

    public static boolean armTypSS3On(EntityPlayer par1EntityPlayer) {
        boolean on = false;
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(1) && JRMCoreH.dnn(2)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(par1EntityPlayer.getCommandSenderName())) continue;
                String[] s = data1[pl].split(";");
                String[] s2 = data2[pl].split(";");
                if (!JRMCoreH.saiyanBlood(s) || !JRMCoreH.state(s2[0], 3)) break;
                on = true;
                break;
            }
        }
        if (side == Side.SERVER) {
            NBTTagCompound aPlayer = JRMCoreH.nbt((Entity)par1EntityPlayer, "pres");
            on = JRMCoreH.saiyanBlood(aPlayer) && JRMCoreH.state(aPlayer, 3);
        }
        return on;
    }

    public static boolean armTypScoutAllOn(ItemStack stackhead) {
        return stackhead.getItem() instanceof ItemHeadwear;
    }

    public static boolean armTypScoutOn(ItemStack var9) {
        boolean on = false;
        on = JRMCoreH.armTypScoutAllOn(var9) && ((ItemHeadwear)var9.getItem()).getTier().equals("1");
        return on;
    }

    public static boolean armTypScoutAOn(ItemStack var9) {
        boolean on = false;
        on = JRMCoreH.armTypScoutAllOn(var9) && ((ItemHeadwear)var9.getItem()).getTier().equals("2");
        return on;
    }

    public static boolean armTypScoutBOn(ItemStack var9) {
        boolean on = false;
        on = JRMCoreH.armTypScoutAllOn(var9) && ((ItemHeadwear)var9.getItem()).getTier().equals("3");
        return on;
    }

    public static NBTTagCompound nbt(Entity entity) {
        return JRMCoreH.nbt(entity, "");
    }

    public static NBTTagCompound nbt(Entity entity, String s) {
        NBTTagCompound nbt = null;
        if (s.contains("pres") && entity instanceof EntityPlayer) {
            EntityPlayer cfr_ignored_0 = (EntityPlayer)entity;
            if (!entity.getEntityData().hasKey("PlayerPersisted")) {
                nbt = new NBTTagCompound();
                EntityPlayer cfr_ignored_1 = (EntityPlayer)entity;
                entity.getEntityData().setTag("PlayerPersisted", (NBTBase)nbt);
            } else {
                EntityPlayer cfr_ignored_2 = (EntityPlayer)entity;
                nbt = entity.getEntityData().getCompoundTag("PlayerPersisted");
            }
        } else if (entity != null) {
            nbt = entity.getEntityData();
        }
        return nbt;
    }

    public static NBTTagCompound nbt(EntityPlayer p) {
        return JRMCoreH.nbt((Entity)p, "pres");
    }

    public static short getShort(EntityPlayer Player, String string) {
        return JRMCoreH.nbt((Entity)Player, "pres").getShort(string);
    }

    public static void setShort(int s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setShort(string, (short)s);
    }

    public static void setShort(short s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setShort(string, s);
    }

    public static void setShort(byte s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setShort(string, (short)s);
    }

    public static void setShort(float s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setShort(string, (short)s);
    }

    public static byte getByte(EntityPlayer Player, String string) {
        return JRMCoreH.nbt((Entity)Player, "pres").getByte(string);
    }

    public static void setByte(int s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setByte(string, (byte)s);
    }

    public static void setByte(short s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setByte(string, (byte)s);
    }

    public static void setByte(byte s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setByte(string, s);
    }

    public static void setByte(float s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setByte(string, (byte)s);
    }

    public static int getInt(EntityPlayer Player, String string) {
        return JRMCoreH.nbt((Entity)Player, "pres").getInteger(string);
    }

    public static void setInt(int s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setInteger(string, s);
    }

    public static void setInt(short s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setInteger(string, (int)s);
    }

    public static void setInt(byte s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setInteger(string, (int)s);
    }

    public static void setInt(float s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setInteger(string, (int)s);
    }

    public static float getFloat(EntityPlayer Player, String string) {
        return JRMCoreH.nbt((Entity)Player, "pres").getFloat(string);
    }

    public static void setFloat(int s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setFloat(string, (float)s);
    }

    public static void setFloat(short s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setFloat(string, (float)s);
    }

    public static void setFloat(byte s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setFloat(string, (float)s);
    }

    public static void setFloat(float s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setFloat(string, s);
    }

    public static String getString(EntityPlayer Player, String string) {
        return JRMCoreH.nbt((Entity)Player, "pres").getString(string);
    }

    public static void setString(String s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setString(string, s);
    }

    public static long getLong(EntityPlayer Player, String string) {
        return JRMCoreH.nbt((Entity)Player, "pres").getLong(string);
    }

    public static void setLong(long s, EntityPlayer Player, String string) {
        JRMCoreH.nbt((Entity)Player, "pres").setLong(string, (long)((int)s));
    }

    public static NBTBase getTag(EntityPlayer Player, String string) {
        return JRMCoreH.nbt((Entity)Player, "pres").getTag(string);
    }

    public static boolean inAir(EntityPlayer plyr) {
        return !plyr.onGround;
    }

    public static byte parseByte(String i) {
        return Byte.parseByte(i);
    }

    public static short parseShort(String i) {
        return Short.parseShort(i);
    }

    public static int parseInt(String i) {
        return Integer.parseInt(i);
    }

    public static float parseFloat(String i) {
        return Float.parseFloat(i);
    }

    public static double parseDouble(String i) {
        return Double.parseDouble(i);
    }

    public static boolean isAprilFoolsModeOn() {
        if (JGConfigClientSettings.CLIENT_DA17) {
            return true;
        }
        boolean apr = false;
        try {
            Calendar cal = Calendar.getInstance();
            cal.setLenient(false);
            cal.getTime();
            String[] date = cal.getTime().toString().split(" ");
            if (date[1].equals("Apr") && date[2].equals("01")) {
                apr = true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return apr;
    }

    public static float calculateEnergyScale(float damage, float maxDamage, float perc, byte[] sts, byte density, float minScale, float maxScale) {
        if (density < 1) {
            density = 1;
        }
        if (damage > maxDamage) {
            damage = maxDamage;
        }
        float damEgy = maxDamage / 100.0f;
        float damPercentage = damage / damEgy;
        float scaleEgy = maxScale / 100.0f;
        float scaleDam = damPercentage * scaleEgy;
        float scale = minScale + scaleDam;
        scale /= (float)density;
        scale *= perc;
        if (sts != null && sts.length > 0) {
            scale *= 1.0f + JRMCoreH.tech_statmod(sts, 6);
        }
        return scale;
    }

    public static int getEnegyDamageC(String[] t, byte[] sts) {
        int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts();
        byte pwr = Pwrtyp;
        byte rc = Race;
        byte cls = Class;
        byte curRel = curRelease;
        byte state = State;
        byte state2 = State2;
        String[] PlyrSkills = JRMCoreH.PlyrSkills;
        String sklx = PlyrSkillX;
        int resrv = JRMCoreH.getArcRsrv();
        String absorption = JRMCoreH.getMajinAbsorption();
        boolean mj = JRMCoreH.StusEfctsMe(12);
        boolean lg = JRMCoreH.StusEfctsMe(14);
        boolean kk = JRMCoreH.StusEfctsMe(5);
        boolean mc = JRMCoreH.StusEfctsMe(13);
        boolean mn = JRMCoreH.StusEfctsMe(19);
        boolean gd = JRMCoreH.StusEfctsMe(20);
        boolean v = JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11);
        int WIL = JRMCoreH.getPlayerAttribute(mod_JRMCore.proxy.getPlayerClient(), PlyrAttrbts, 3, state, state2, rc, sklx, curRel, resrv, lg, mj, kk, mc, mn, gd, pwr, PlyrSkills, v, absorption);
        int stat = JRMCoreH.stat((Entity)mod_JRMCore.proxy.getPlayerClient(), 3, pwr, 4, WIL, rc, cls, 0.0f);
        int dam1 = JRMCoreH.techDBCdmg(t, stat, sts);
        return dam1 / 2;
    }

    public static int getEnegyDamage(EntityPlayer p, String[] t, byte[] sts) {
        int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts(p);
        byte curRel = JRMCoreH.getByte(p, CurRelease);
        String[] PlyrSkills = JRMCoreH.getString(p, SkillsNbt2).split(",");
        byte pwr = JRMCoreH.getByte(p, P);
        byte rc = JRMCoreH.getByte(p, R);
        byte cls = JRMCoreH.getByte(p, Cl);
        byte state = JRMCoreH.getByte(p, St);
        byte state2 = JRMCoreH.getByte(p, St2);
        String sklx = JRMCoreH.getString(p, "jrmcSSltX");
        int resrv = JRMCoreH.getInt(p, ArcRsrvNbt);
        String absorption = JRMCoreH.getString(p, NBT_MajinAbsorptionData);
        String ste = JRMCoreH.getString(p, StE);
        boolean mj = JRMCoreH.StusEfcts(12, ste);
        boolean lg = JRMCoreH.StusEfcts(14, ste);
        boolean kk = JRMCoreH.StusEfcts(5, ste);
        boolean mc = JRMCoreH.StusEfcts(13, ste);
        boolean mn = JRMCoreH.StusEfcts(19, ste);
        boolean gd = JRMCoreH.StusEfcts(20, ste);
        boolean v = JRMCoreH.StusEfcts(10, ste) || JRMCoreH.StusEfcts(11, ste);
        int WIL = JRMCoreH.getPlayerAttribute(p, PlyrAttrbts, 3, state, state2, rc, sklx, curRel, resrv, lg, mj, kk, mc, mn, gd, pwr, PlyrSkills, v, absorption);
        int stat = JRMCoreH.stat((Entity)p, 3, pwr, 4, WIL, rc, cls, 0.0f);
        int dam1 = JRMCoreH.techDBCdmg(t, stat, sts);
        return dam1 / 2;
    }

    public static void a1t3(EntityPlayer e) {
        int epoch = (int)(System.currentTimeMillis() / 1000L) + 30;
        JRMCoreH.setInt(epoch, e, AttackTimer);
    }

    public static boolean aliveState(int pl) {
        return dat13[pl].split(";")[0].contains("1");
    }

    public static boolean aliveState() {
        if (plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(13)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(mod_JRMCore.proxy.getPlayerClient().getCommandSenderName())) continue;
                return JRMCoreH.aliveState(pl);
            }
        }
        return false;
    }

    public static boolean plyrSttngsClient(int plytSttngs, int pl) {
        if (dat13 != null && dat13.length > pl) {
            String[] s = dat13[pl].split(";");
            return s[1].contains(PlyrSttngs[plytSttngs]);
        }
        return false;
    }

    public static float SklLvl_KiBs(EntityPlayer p, int w) {
        return w == 1 ? (float)JRMCoreH.SklLvl(13, p) * 0.01f : 0.0f;
    }

    public static float SklLvl_KiBs(int w) {
        return w == 1 ? (float)JRMCoreH.SklLvl(13) * 0.01f : 0.0f;
    }

    public static float SklLvl_KiBs(String[] s, int w) {
        return w == 1 ? (float)JRMCoreH.SklLvl(13, s) * 0.01f : 0.0f;
    }

    public static float SklLvl_Fd(EntityPlayer p, int w) {
        float e = p.fallDistance;
        return e;
    }

    public static String StusEfctsClient2(String id) {
        if (JRMCoreH.dnn(19)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(id)) continue;
                String[] s = dat19[pl].split(";");
                return s[1];
            }
        }
        return "";
    }

    public static String StusEfctsClient(EntityPlayer p) {
        return JRMCoreH.data(p.getCommandSenderName(), 19, "0; ;");
    }

    public static String StusEfctsClient(int pl) {
        if (dat19 != null && dat19.length > pl) {
            String[] s = dat19[pl].split(";");
            return s[1];
        }
        return "";
    }

    public static boolean StusEfcts(int ste, String se) {
        return se.contains(StusEfcts[ste]);
    }

    public static boolean StusEfctsClient(int ste, EntityPlayer p) {
        return JRMCoreH.StusEfctsClient(p).contains(StusEfcts[ste]);
    }

    public static boolean StusEfctsClient(int ste, int pl) {
        return JRMCoreH.StusEfctsClient(pl).contains(StusEfcts[ste]);
    }

    public static String StusEfctsMe() {
        return JRMCoreH.StusEfctsClient2(mod_JRMCore.proxy.getPlayerClient().getCommandSenderName());
    }

    public static boolean StusEfctsMe(int ste) {
        return JRMCoreH.StusEfctsMe().contains(StusEfcts[ste]);
    }

    public static void StusEfcts(int i, String s, EntityPlayer p, boolean b) {
        String bns = StusEfcts[i];
        if (!b && s.contains(bns)) {
            s = s.contains(bns) ? s.replace(bns, "") : s;
            JRMCoreH.setString(s, p, StE);
            return;
        }
        if (b) {
            s = s + bns;
            JRMCoreH.setString(s, p, StE);
        }
    }

    public static void StusEfcts(int i, EntityPlayer p, boolean b) {
        String bns = StusEfcts[i];
        String s = JRMCoreH.getString(p, StE);
        if (!b && s.contains(bns)) {
            s = s.contains(bns) ? s.replace(bns, "") : s;
            JRMCoreH.setString(s, p, StE);
            return;
        }
        if (b) {
            JRMCoreH.setString(s + bns, p, StE);
        }
    }

    public static String StusEfcts(int i, String s, NBTTagCompound nbt, boolean b) {
        String bns = StusEfcts[i];
        if (!b && s.contains(bns)) {
            s = s.contains(bns) ? s.replace(bns, "") : s;
            nbt.setString(StE, s);
            return s;
        }
        if (b) {
            nbt.setString(StE, s + bns);
            return s + bns;
        }
        return s;
    }

    public static String StusEfcts(int i, NBTTagCompound nbt, boolean b) {
        String bns = StusEfcts[i];
        String s = nbt.getString(StE);
        if (!b && s.contains(bns)) {
            s = s.contains(bns) ? s.replace(bns, "") : s;
            nbt.setString(StE, s);
            return s;
        }
        if (b) {
            nbt.setString(StE, s + bns);
            return s + bns;
        }
        return s;
    }

    public static boolean isFused() {
        return JRMCoreH.isPowerTypeKi() && (JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11));
    }

    public static boolean isFused(Entity Player) {
        NBTTagCompound nbt = JRMCoreH.nbt(Player, "pres");
        byte powerType = nbt.getByte(P);
        if (JRMCoreH.isPowerTypeKi(powerType)) {
            String Fzn = nbt.getString(FUSION);
            if (Fzn.contains(",") && Fzn.split(",").length == 3) {
                return true;
            }
            String StE = nbt.getString(StE);
            boolean fused = JRMCoreH.StusEfcts(10, StE) || JRMCoreH.StusEfcts(11, StE);
            return fused;
        }
        return false;
    }

    public static boolean isFusionSpectator(Entity Player) {
        String[] fusionMembers;
        String Fzn;
        NBTTagCompound nbt;
        byte powerType;
        if (Player != null && Player instanceof EntityPlayer && JRMCoreH.isPowerTypeKi(powerType = (nbt = JRMCoreH.nbt(Player, "pres")).getByte(P)) && (Fzn = nbt.getString(FUSION)).contains(",") && (fusionMembers = Fzn.split(",")).length == 3) {
            return fusionMembers[1].equalsIgnoreCase(Player.getCommandSenderName());
        }
        return false;
    }

    public static EntityPlayer getFusionSpectatorPartnerC(EntityPlayer player) {
        if (curRelease != 0 && JRMCoreH.StusEfctsMe(11) && !kob && JRMCoreH.isFused() && plyrs != null && plyrs.length > 0 && JRMCoreH.dnn(18)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                String[] fusionData;
                if (!plyrs[pl].equals(player.getCommandSenderName())) continue;
                String[] fullFusionData = dat18[pl].split(";");
                if (fullFusionData.length < 3 || (fusionData = fullFusionData[2].split(",")).length != 3) break;
                EntityPlayer playerPartner = player.worldObj.getPlayerEntityByName(fusionData[0]);
                if (player == null) break;
                return playerPartner;
            }
        }
        return null;
    }

    public static EntityPlayer isFusionSpectatorPartnerC(EntityPlayer player) {
        return JRMCoreH.getFusionSpectatorPartnerC(player);
    }

    public static float SklInc(float j) {
        return 60.0f / (60.0f + j) * j * 3.0f;
    }

    public static float SklInc100(float j) {
        return 50.0f / (50.0f + j) * j * 3.0f;
    }

    public static float SklInc(float j, int m) {
        float i = 100.0f / (float)m;
        return 50.0f / (50.0f + (j *= i)) * j * 3.0f;
    }

    public static int SklLvl(int sn) {
        switch (Pwrtyp) {
            case 1: {
                return JRMCoreH.SklLvlC(sn, DBCSkillsIDs);
            }
            case 2: {
                return JRMCoreH.SklLvlC(sn, NCSkillIDs);
            }
        }
        return 0;
    }

    public static int SklLvl(int sn, byte pwr) {
        switch (pwr) {
            case 1: {
                return JRMCoreH.SklLvlC(sn, DBCSkillsIDs);
            }
            case 2: {
                return JRMCoreH.SklLvlC(sn, NCSkillIDs);
            }
        }
        return 0;
    }

    public static int SklLvlC(int sn, String[] s) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        if (PlyrSkills != null) {
            for (int i = 0; i < PlyrSkills.length; i = (int)((byte)(i + 1))) {
                String curSkl = PlyrSkills[i];
                if (curSkl == null || curSkl.length() <= 2 || s.length <= sn || !curSkl.contains(s[sn]) || curSkl.contains("pty")) continue;
                n = 1 + Integer.parseInt(curSkl.substring(2));
                break;
            }
        }
        return n;
    }

    public static int SklLvl(int sn, String[] ps) {
        return JRMCoreH.SklLvl(sn, DBCSkillsIDs, ps);
    }

    public static int SklLvl(int sn, EntityPlayer p) {
        return JRMCoreH.SklLvl(sn, JRMCoreH.PlyrPwr(p) == 1 ? DBCSkillsIDs : NCSkillIDs, JRMCoreH.PlyrSkills(p));
    }

    public static int SklLvl(int sn, int pwr, String[] ps) {
        return JRMCoreH.SklLvl(sn, pwr == 1 ? DBCSkillsIDs : NCSkillIDs, ps);
    }

    public static int SklLvl(int sn, String[] s, String[] ps) {
        if (ps == null || s == null) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < ps.length; i = (int)((byte)(i + 1))) {
            if (ps[i] == null || s[sn] == null || !ps[i].contains(s[sn]) || ps[i].length() <= 2) continue;
            n = Integer.parseInt(ps[i].replaceAll(s[sn], ""));
            n = JRMCoreH.SklLvl_m(sn, s, n) + 1;
            return n;
        }
        return n;
    }

    public static int SklLvl_m(int sn, String[] s, int n) {
        if (s.equals(DBCSkillsIDs) && n - 1 > JRMCoreH.SklInit(s[sn], s, vlblSklsUps)) {
            return JRMCoreH.SklInit(s[sn], s, vlblSklsUps) + 1;
        }
        if (s.equals(NCSkillIDs) && n - 1 > JRMCoreH.SklInit(s[sn], s, ncSklsUps)) {
            return JRMCoreH.SklInit(s[sn], s, ncSklsUps) + 1;
        }
        return n;
    }

    public static int SklLvl_m(String sn, String[] s, int n) {
        if (s.equals(DBCSkillsIDs) && n - 1 > JRMCoreH.SklInit(sn, s, vlblSklsUps)) {
            return JRMCoreH.SklInit(sn, s, vlblSklsUps) + 1;
        }
        if (s.equals(NCSkillIDs) && n - 1 > JRMCoreH.SklInit(sn, s, ncSklsUps)) {
            return JRMCoreH.SklInit(sn, s, ncSklsUps) + 1;
        }
        return n;
    }

    public static void SklLvl(int sn, String[] s, String[] ps, EntityPlayer p, int inc) {
        int i;
        if (ps == null || s == null) {
            return;
        }
        int n = 0;
        String psa = "";
        for (i = 0; i < ps.length; ++i) {
            psa = psa + ps[i] + ",";
        }
        for (i = 0; i < ps.length; ++i) {
            if (!ps[i].contains(s[sn]) || ps[i].length() <= 2) continue;
            n = Integer.parseInt(ps[i].replaceAll(s[sn], "")) + inc;
            if (n < 0) {
                psa = psa.replace(ps[i] + ",", "");
                break;
            }
            n = n > 9 ? 9 : (n < 0 ? 0 : n);
            n = JRMCoreH.SklLvl_m(sn, s, n);
            psa = psa.replace(ps[i] + ",", s[sn] + n + ",");
            break;
        }
        JRMCoreH.setString(psa, p, SkillsNbt2);
    }

    public static int SklLvlX(EntityPlayer player) {
        return JRMCoreH.SklLvlX(JRMCoreH.getByte(player, P), JRMCoreH.getString(player, "jrmcSSltX"));
    }

    public static int SklLvlX(int powerType, String playerSkills) {
        return JRMCoreH.SklLvl(powerType == 1 ? vlblRSkls : ncRSkls, playerSkills);
    }

    public static int SklLvlY(int powerType, String playerSkills) {
        return JRMCoreH.SklLvl(powerType == 1 ? vlblCSkls : ncCSkls, playerSkills);
    }

    public static int SklLvl(String[] s, String ps) {
        if (ps == null || s == null) {
            return 0;
        }
        int n = 0;
        if (ps.length() > 2 && !ps.contains("pty")) {
            n = 1 + Integer.parseInt(ps.substring(2));
        }
        return n;
    }

    public static int SklInit(String curSkl, String[] s1, int[] s2) {
        int s = 8;
        for (int i = 0; i < s1.length; ++i) {
            if (!curSkl.contains(s1[i]) || s1[i].length() <= 0) continue;
            s = i == 16 ? JGConfigUltraInstinct.CONFIG_UI_LEVELS - 2 : s2[i];
            break;
        }
        return s;
    }

    public static String SklName(String curSkl, String[] s1, String[] s2) {
        String s = "error";
        for (int i = 0; i < s1.length; ++i) {
            if (!curSkl.contains(s1[i]) || s1[i].length() <= 0) continue;
            s = s2[i];
            break;
        }
        return s;
    }

    public static String SklName(String curSkl, String[] s1, String[] s2, int r) {
        String s = "error";
        for (int i = 0; i < s1.length; ++i) {
            if (!curSkl.contains(s1[i]) || s1[i].length() <= 0) continue;
            s = s2[r];
            break;
        }
        return s;
    }

    public static int SklID(String skillName, String[] skills) {
        if (skillName == null) {
            return -1;
        }
        if (skillName.length() > 1) {
            for (int i = 0; i < skills.length; i = (int)((byte)(i + 1))) {
                if (skillName.length() <= 1 || !skills[i].contains(skillName.substring(0, 2))) continue;
                return i;
            }
        }
        return -1;
    }

    public static double[] frmt_d(double[] d, double i, double x) {
        double[] n = new double[d.length];
        for (int j = 0; j < d.length; ++j) {
            n[j] = d[j] < i ? i : (d[j] > x ? x : d[j]);
        }
        return n;
    }

    public static int[] frmt_d(int[] d, int i, int x) {
        int[] n = new int[d.length];
        for (int j = 0; j < d.length; ++j) {
            n[j] = d[j] < i ? i : (d[j] > x ? x : d[j]);
        }
        return n;
    }

    public static boolean SklSlt(int[] PlyrAttrbts, int h) {
        return JRMCoreH.canAffordSkill(PlyrAttrbts[4], h);
    }

    public static String SklGveX(byte rc, byte cls, byte pwr) {
        String ret = "pty";
        if (pwr == 1) {
            ret = vlblRSkls[0] + "0";
        } else if (pwr == 2) {
            // empty if block
        }
        return ret;
    }

    public static String SklGveY(byte rc, byte cls, byte pwr) {
        String ret = "pty";
        if (pwr == 1) {
            if (rc == 1 || rc == 2) {
                ret = "Sai";
            }
        } else if (pwr == 2 && rc == 0 && ncCSkls[cls].length() > 0) {
            ret = ncCSkls[cls] + "0";
        }
        return ret;
    }

    public static String[] data(int i) {
        switch (i) {
            case 0: {
                return data0;
            }
            case -1: {
                return plyrs;
            }
            case 1: {
                return data1;
            }
            case 2: {
                return data2;
            }
            case 3: {
                return data3;
            }
            case 4: {
                return data4;
            }
            case 5: {
                return data5;
            }
            case 6: {
                return data6;
            }
            case 7: {
                return data7;
            }
            case 8: {
                return data8;
            }
            case 9: {
                return data9;
            }
            case 10: {
                return dat10;
            }
            case 11: {
                return dat11;
            }
            case 12: {
                return dat12;
            }
            case 13: {
                return dat13;
            }
            case 14: {
                return dat14;
            }
            case 15: {
                return dat15;
            }
            case 16: {
                return dat16;
            }
            case 17: {
                return dat17;
            }
            case 18: {
                return dat18;
            }
            case 19: {
                return dat19;
            }
            case 20: {
                return dat20;
            }
            case 21: {
                return dat21;
            }
            case 22: {
                return dat22;
            }
            case 23: {
                return dat23;
            }
            case 24: {
                return dat24;
            }
            case 25: {
                return dat25;
            }
            case 26: {
                return dat26;
            }
            case 27: {
                return dat27;
            }
            case 28: {
                return dat28;
            }
            case 29: {
                return dat29;
            }
            case 30: {
                return dat30;
            }
            case 31: {
                return dat31;
            }
            case 32: {
                return dat32;
            }
        }
        return plyrs;
    }

    public static void rdc(String[] d, int c) {
        if (c == 0) {
            data0 = d;
        } else if (c == -1) {
            plyrs = d;
        } else if (c == 1) {
            data1 = d;
        } else if (c == 2) {
            data2 = d;
        } else if (c == 3) {
            data3 = d;
        } else if (c == 4) {
            data4 = d;
        } else if (c == 5) {
            data5 = d;
        } else if (c == 6) {
            data6 = d;
        } else if (c == 7) {
            data7 = d;
        } else if (c == 8) {
            data8 = d;
        } else if (c == 9) {
            data9 = d;
        } else if (c == 10) {
            dat10 = d;
        } else if (c == 11) {
            dat11 = d;
        } else if (c == 12) {
            dat12 = d;
        } else if (c == 13) {
            dat13 = d;
        } else if (c == 14) {
            dat14 = d;
        } else if (c == 15) {
            dat15 = d;
        } else if (c == 16) {
            dat16 = d;
        } else if (c == 17) {
            dat17 = d;
        } else if (c == 18) {
            dat18 = d;
        } else if (c == 19) {
            dat19 = d;
        } else if (c == 20) {
            dat20 = d;
        } else if (c == 21) {
            dat21 = d;
        } else if (c == 22) {
            dat22 = d;
        } else if (c == 23) {
            dat23 = d;
        } else if (c == 24) {
            dat24 = d;
        } else if (c == 25) {
            dat25 = d;
        } else if (c == 26) {
            dat26 = d;
        } else if (c == 27) {
            dat27 = d;
        } else if (c == 28) {
            dat28 = d;
        } else if (c == 29) {
            dat29 = d;
        } else if (c == 30) {
            dat30 = d;
        } else if (c == 31) {
            dat31 = d;
        } else if (c == 32) {
            dat32 = d;
        }
    }

    public static boolean dnn(int c) {
        boolean b = false;
        if (plyrs != null) {
            if (c == 0 && data0 != null && data0.length >= plyrs.length) {
                b = true;
            } else if (c == -1 && plyrs != null) {
                b = true;
            } else if (c == 1 && data1 != null && data1.length >= plyrs.length) {
                b = true;
            } else if (c == 2 && data2 != null && data2.length >= plyrs.length) {
                b = true;
            } else if (c == 3 && data3 != null && data3.length >= plyrs.length) {
                b = true;
            } else if (c == 4 && data4 != null && data4.length >= plyrs.length) {
                b = true;
            } else if (c == 5 && data5 != null && data5.length >= plyrs.length) {
                b = true;
            } else if (c == 6 && data6 != null && data6.length >= plyrs.length) {
                b = true;
            } else if (c == 7 && data7 != null && data7.length >= plyrs.length) {
                b = true;
            } else if (c == 8 && data8 != null && data8.length >= plyrs.length) {
                b = true;
            } else if (c == 9 && data9 != null && data9.length >= plyrs.length) {
                b = true;
            } else if (c == 10 && dat10 != null && dat10.length >= plyrs.length) {
                b = true;
            } else if (c == 11 && dat11 != null && dat11.length >= plyrs.length) {
                b = true;
            } else if (c == 12 && dat12 != null && dat12.length >= plyrs.length) {
                b = true;
            } else if (c == 13 && dat13 != null && dat13.length >= plyrs.length) {
                b = true;
            } else if (c == 14 && dat14 != null && dat14.length >= plyrs.length) {
                b = true;
            } else if (c == 15 && dat15 != null && dat15.length >= plyrs.length) {
                b = true;
            } else if (c == 16 && dat16 != null && dat16.length >= plyrs.length) {
                b = true;
            } else if (c == 17 && dat17 != null && dat17.length >= plyrs.length) {
                b = true;
            } else if (c == 18 && dat18 != null && dat18.length >= plyrs.length) {
                b = true;
            } else if (c == 19 && dat19 != null && dat19.length >= plyrs.length) {
                b = true;
            } else if (c == 20 && dat20 != null && dat20.length >= plyrs.length) {
                b = true;
            } else if (c == 21 && dat21 != null && dat21.length >= plyrs.length) {
                b = true;
            } else if (c == 22 && dat22 != null && dat22.length >= plyrs.length) {
                b = true;
            } else if (c == 23 && dat23 != null && dat23.length >= plyrs.length) {
                b = true;
            } else if (c == 24 && dat24 != null && dat24.length >= plyrs.length) {
                b = true;
            } else if (c == 25 && dat25 != null && dat25.length >= plyrs.length) {
                b = true;
            } else if (c == 26 && dat26 != null && dat26.length >= plyrs.length) {
                b = true;
            } else if (c == 27 && dat27 != null && dat27.length >= plyrs.length) {
                b = true;
            } else if (c == 28 && dat28 != null && dat28.length >= plyrs.length) {
                b = true;
            } else if (c == 29 && dat29 != null && dat29.length >= plyrs.length) {
                b = true;
            } else if (c == 30 && dat30 != null && dat30.length >= plyrs.length) {
                b = true;
            } else if (c == 31 && dat31 != null && dat31.length >= plyrs.length) {
                b = true;
            } else if (c == 32 && dat32 != null && dat32.length >= plyrs.length) {
                b = true;
            }
        }
        return b;
    }

    public static String data(int i, String d) {
        return JRMCoreH.data(mod_JRMCore.proxy.getPlayerClient().getCommandSenderName(), i, d);
    }

    public static String data(String p, int i, String d) {
        if (JRMCoreH.dnn(i)) {
            HashMap<String, Integer> l = new HashMap<String, Integer>();
            for (int j = 0; j < plyrs.length; ++j) {
                l.put(plyrs[j], j);
            }
            if (l.get(p) != null) {
                return JRMCoreH.data(i)[(Integer)l.get(p)];
            }
        }
        return d;
    }

    public static String dataP(int i, String d) {
        if (JRMCoreH.data(i) != null) {
            return JRMCoreH.data(i)[0];
        }
        return d;
    }

    public static String data(int p, int i, String d) {
        if (JRMCoreH.dnn(i)) {
            return JRMCoreH.data(i)[p];
        }
        return d;
    }

    public static long bpc(Entity e) {
        if (e instanceof EntityCreature) {
            int atr = (int)(((EntityCreature)e).getMaxHealth() / JRMCoreH.statInc(1, 2, 1, 0, 0, 0.0f));
            long res = 1L;
            res = atr * 10 + atr * 4 + atr * 6 + atr * 10 + atr * 5;
            long l = res = res < 2L ? 2L : res;
            if (BPMode == 1) {
                res *= res / 2L;
            }
            return res < 1L ? 1L : res;
        }
        if (e instanceof EntityPlayer) {
            String[] s = JRMCoreH.data(e.getCommandSenderName(), 0, "0;0;0").split(";");
            long l = JRMCoreH.bpc((EntityPlayer)e, e.getCommandSenderName());
            return l < 5L ? 5L : l;
        }
        return 1L;
    }

    public static long bpc(String p) {
        return JRMCoreH.bpc(p, (byte)1);
    }

    public static long bpc(EntityPlayer player, String p) {
        return JRMCoreH.bpc(player, p, (byte)1);
    }

    public static long bpc(String p, byte pt) {
        return JRMCoreH.bpc(null, p, pt, -1);
    }

    public static long bpc(EntityPlayer player, String p, byte pt) {
        return JRMCoreH.bpc(player, p, pt, -1);
    }

    public static long bpc(String playerID, byte powerType, int rl) {
        return JRMCoreH.bpc(null, playerID, powerType, rl);
    }

    public static long bpc(EntityPlayer player, String playerID, byte powerType, int rl) {
        long in = 1L;
        if (JRMCoreH.dnn(1) && JRMCoreH.dnn(10) && JRMCoreH.dnn(2) && JRMCoreH.dnn(14) && JRMCoreH.dnn(6)) {
            for (int i = 0; i < plyrs.length; ++i) {
                boolean c;
                if (!playerID.equals(plyrs[i])) continue;
                String[] d0 = JRMCoreH.data(playerID, 0, "0;0").split(";");
                int alvc = Integer.parseInt(d0[0]);
                int gp = Integer.parseInt(d0[1]);
                String[] s = data1[i].split(";");
                int pwr = Integer.parseInt(s[2]);
                int race = Integer.parseInt(s[0]);
                s = data6[i].split(";");
                String sX = s[1];
                String sY = s[2];
                String sZ = s[3];
                String[] PlyrSkills = s[0].split(",");
                int cr = rl >= 0 ? rl : Integer.parseInt(dat10[i].split(";")[0]);
                int stam = Integer.parseInt(dat10[i].split(";")[1]);
                int st = Integer.parseInt(data2[i].split(";")[0]);
                int st2 = Integer.parseInt(data2[i].split(";")[1]);
                int resrv = JRMCoreH.getArcRsrv(i);
                String[] a = dat14[i].split(",");
                int[] PlyrAttrbts = new int[a.length];
                boolean mj = JRMCoreH.StusEfctsClient(12, i);
                boolean lg = JRMCoreH.StusEfctsClient(14, i);
                boolean kk = JRMCoreH.StusEfctsClient(5, i);
                boolean mc = JRMCoreH.StusEfctsClient(13, i);
                boolean vb = JRMCoreH.StusEfctsClient(17, i);
                boolean mn = JRMCoreH.StusEfctsClient(19, i);
                boolean gd = JRMCoreH.StusEfctsClient(20, i);
                for (int i1 = 0; i1 < PlyrAttrbts.length; ++i1) {
                    PlyrAttrbts[i1] = Integer.parseInt(a[i1]);
                }
                long sr = PlyrAttrbts[0];
                long de = PlyrAttrbts[1];
                long co = PlyrAttrbts[2];
                long wi = PlyrAttrbts[3];
                long mi = PlyrAttrbts[4];
                long cc = PlyrAttrbts[5];
                boolean bl = c = JRMCoreH.StusEfctsClient(10, i) || JRMCoreH.StusEfctsClient(11, i);
                if (pwr == 1) {
                    boolean sgf;
                    boolean bl2 = sgf = JRMCoreH.SklLvl(9) > 0 || gp > 0 || vb;
                    if (JRMCoreHDBC.godKiUser(race, st) && !sgf) {
                        st = 0;
                    }
                    String absorption = JRMCoreH.dnn(6) ? JRMCoreH.getMajinAbsorptionValue(playerID) + "" : "0";
                    sr = JRMCoreH.getPlayerAttribute(player, PlyrAttrbts, 0, st, st2, race, sX, cr, resrv, lg, mj, kk, mc, mn, gd, 1, PlyrSkills, c, absorption);
                    de = JRMCoreH.getPlayerAttribute(player, PlyrAttrbts, 1, st, st2, race, sX, cr, resrv, lg, mj, kk, mc, mn, gd, 1, PlyrSkills, c, absorption);
                    wi = JRMCoreH.getPlayerAttribute(player, PlyrAttrbts, 3, st, st2, race, sX, cr, resrv, lg, mj, kk, mc, mn, gd, 1, PlyrSkills, c, absorption);
                }
                long f = sr + de + co;
                long m = wi + mi + cc;
                ++alvc;
                if (JRMCoreH.isPowerTypeKi(powerType)) {
                    double re;
                    long res = 0L;
                    res = sr * 10L + de * 4L + co * 6L + wi * 10L + cc * 5L;
                    long l = res = res < 2L ? 2L : res;
                    if (BPMode == 1) {
                        res = res / 2L * (res / 100L) * (res / 100L);
                    }
                    in = res = (res = (long)((double)res * (re = (double)cr * 0.01))) < 5L ? 5L : res;
                    break;
                }
                if (!JRMCoreH.isPowerTypeChakra(powerType)) break;
                int n = 0;
                for (int i1 = 0; i1 < PlyrSkills.length; i1 = (int)((byte)(i1 + 1))) {
                    String curSkl = PlyrSkills[i1];
                    if (curSkl.length() <= 2 || curSkl.contains("pty")) continue;
                    n += Integer.parseInt(curSkl.substring(2)) * 5;
                }
                float flt = 0.001388f;
                int b = (int)((float)alvc * flt + (float)f + (float)m + (float)n);
                in = b;
                break;
            }
        }
        return in;
    }

    public static long time(double m) {
        return (long)((double)System.currentTimeMillis() * 0.04 * m);
    }

    public static long gkap(long in, String p) {
        return JRMCoreH.gkap(in, p, 40, 1.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static long gkap(long in, String p, int c, double m) {
        Object[] ny = tacx.get(p);
        if (ny == null) {
            Object[] no = new Object[]{in, in, in, c, JRMCoreH.time(m), JRMCoreH.time(m)};
            tacx.put(p, no);
            return in;
        }
        long bo = (Long)ny[0];
        long bp = (Long)ny[1];
        long bc = (Long)ny[2];
        int br = (Integer)ny[3];
        long btc = (Long)ny[4];
        long btp = (Long)ny[5];
        if (in != bo) {
            bc = (bo - bp) / (long)br;
            long bt = btc - btp;
            long bs = bt * bc + bp;
            Object[] no = new Object[]{in, bs, bc, c, JRMCoreH.time(m), JRMCoreH.time(m)};
            tacx.put(p, no);
            return bs;
        }
        if (btp + (long)br <= JRMCoreH.time(m)) {
            Object[] no = new Object[]{in, bo, in, c, JRMCoreH.time(m), JRMCoreH.time(m)};
            tacx.put(p, no);
            return in;
        }
        bc = (bo - bp) / (long)br;
        long bt = btc - btp;
        long bs = bt * bc + bp;
        Object[] no = new Object[]{in, bp, bc, c, JRMCoreH.time(m), btp};
        tacx.put(p, no);
        return bs;
    }

    public static int updateArcosianPowerPoints(int resrv, String SklX, int st, int stateID) {
        int skl = JRMCoreH.SklLvlX(1, SklX) - 1;
        skl = skl < 0 ? 0 : skl;
        int arg = (int)((double)JRMCoreConfig.ArcosianPPGrowth[stateID] * JRMCoreConfig.appm);
        return resrv + arg > JRMCoreConfig.ArcosianPPMax[skl] ? JRMCoreConfig.ArcosianPPMax[skl] : resrv + arg;
    }

    public static int updateArcosianPowerPoints(int resrv, String SklX, int st, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        int stateID = JRMCoreH.getArcosianFormID(st, isMysticOn, isUltraInstinctOn, isGoDOn);
        return JRMCoreH.updateArcosianPowerPoints(resrv, SklX, st, stateID);
    }

    public static int ArcRsrvMaxSkll(int resrv, String SklX, int st) {
        return JRMCoreH.updateArcosianPowerPoints(resrv, SklX, st, st);
    }

    public static int getArcRsrv(int pl) {
        return JRMCoreH.dnn(13) && dat13.length > pl ? Integer.parseInt(dat13[pl].split(";")[2]) : 0;
    }

    public static int getArcRsrvID(String id) {
        for (int pl = 0; pl < plyrs.length; ++pl) {
            if (!plyrs[pl].equals(id) || !JRMCoreH.dnn(13)) continue;
            return Integer.parseInt(dat13[pl].split(";")[2]);
        }
        return 0;
    }

    public static int getArcRsrv() {
        return JRMCoreH.getArcRsrvID(mod_JRMCore.proxy.getPlayerClient().getCommandSenderName());
    }

    public static int getArcosianPowerPointBoost(int curentPow, int state, int currentRelease, int currentReserv, int stateID) {
        if (state > 3 && currentRelease == 100 && currentReserv > 0) {
            boolean addPointValue = JRMCoreConfig.ArcosianPPDamMultiPoint[stateID] != -1.0f;
            int result = (int)((float)curentPow * JRMCoreConfig.ArcosianPPDamMulti[stateID] * (addPointValue ? 1.0f + JRMCoreH.getArcosianReserveMaxPointPercentage(currentReserv) * JRMCoreConfig.ArcosianPPDamMultiPoint[stateID] : 1.0f));
            return result;
        }
        return curentPow;
    }

    public static int ArcRsrvPowBst(int curentPow, int state, int currentRelease, int currentReserv) {
        return JRMCoreH.getArcosianPowerPointBoost(curentPow, state, currentRelease, currentReserv, state);
    }

    public static float getArcosianReserveMaxPointPercentage(int currentReserv) {
        float highest = JRMCoreConfig.ArcosianPPMax[JRMCoreConfig.ArcosianPPDamMultiHighest];
        return (float)currentReserv / highest;
    }

    public static int getMajinAbsorptionValueS(String absorptionData) {
        String[] data = absorptionData.split(",");
        String value = data.length >= 3 ? data[0] : absorptionData;
        return Integer.parseInt(value);
    }

    public static String getMajinAbsorptionID(String playerName) {
        if (JRMCoreH.dnn(13)) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (plyrs.length <= pl || plyrs[pl] == null || !plyrs[pl].equals(playerName) || dat13.length <= pl || dat13[pl] == null) continue;
                String[] data = dat13[pl].split(";");
                if (data.length <= 3) break;
                return data[3];
            }
        }
        return "0";
    }

    public static int getMajinAbsorptionValue(String playerName) {
        String data = JRMCoreH.getMajinAbsorptionID(playerName);
        return Integer.parseInt(data.split(",")[0]);
    }

    public static String getMajinAbsorption() {
        return JRMCoreH.getMajinAbsorptionID(mod_JRMCore.proxy.getPlayerClient().getCommandSenderName());
    }

    public static int getMajinAbsorptionValue() {
        String data = JRMCoreH.getMajinAbsorptionID(mod_JRMCore.proxy.getPlayerClient().getCommandSenderName());
        return Integer.parseInt(data.split(",")[0]);
    }

    public static boolean rSai(int r) {
        return JRMCoreH.isRaceSaiyan(r);
    }

    public static boolean rSai() {
        return Race == 1 || Race == 2;
    }

    public static boolean tailHas(int r) {
        return r != 2 && r != 3 && r != 4;
    }

    public static final String TransNms(int i1, int i2, boolean v, boolean my, boolean ui) {
        return JRMCoreH.getTransformationName(i1, i2, v, my, ui, false);
    }

    public static final String getTransformationName(int i1, int i2, boolean v, boolean my, boolean ui, boolean gd) {
        if (my) {
            return "PotUnleashed";
        }
        if (ui) {
            return "UInstinct";
        }
        if (gd) {
            return JRMCoreH.rc_sai(i1) && JRMCoreH.isAprilFoolsModeOn() ? "UltraEgo" : "GoDestruction";
        }
        if (JRMCoreH.rc_sai(i1) && i2 == 10 && v) {
            return "SuperR";
        }
        if (JRMCoreH.rc_sai(i1) && i2 == 15 && v) {
            return "SuperRS";
        }
        if (JRMCoreH.rc_sai(i1) && TransNms[i1][i2].equals("Super4") && JRMCoreH.isAprilFoolsModeOn()) {
            return "Super5";
        }
        if (JRMCoreH.rc_sai(i1) && TransNms[i1][i2].equals("Super") && JRMCoreH.isAprilFoolsModeOn()) {
            return "SuperFalse";
        }
        return TransNms[i1][i2];
    }

    public static byte getTransformationDescendToFormID(byte race, byte state, boolean hasFullPowerSSJ) {
        byte result = transformationDescendToFormID[race][state];
        if (JRMCoreH.isRaceSaiyan(race) && (result == 1 || result == 4)) {
            result = (byte)(hasFullPowerSSJ ? 4 : 1);
        }
        return result;
    }

    public static boolean isSaiyanSuperFullPower(NBTTagCompound nbt) {
        String s1 = nbt.getString("jrmcSSltX");
        int racialSkillLevel = JRMCoreH.SklLvlX(1, s1);
        return racialSkillLevel >= 5;
    }

    public static String getNBTFormMasteryRacialKey(int race) {
        return "jrmcFormMasteryRacial_" + Races[race];
    }

    public static String[] getNBTFormMasteryRacialKeys(int race) {
        String[] NBT = new String[]{JRMCoreH.getNBTFormMasteryRacialKey(race), NBT_FormMasteryNonRacial};
        return NBT;
    }

    public static String getNBTFormMasteryRacialKey(boolean racial, int race) {
        String[] NBT = new String[]{JRMCoreH.getNBTFormMasteryRacialKey(race), NBT_FormMasteryNonRacial};
        return NBT[racial ? 0 : 1];
    }

    public static boolean hasNBTFormMasteryRacial(NBTTagCompound nbt) {
        byte race = nbt.getByte(R);
        String nbtKey = JRMCoreH.getNBTFormMasteryRacialKey(race);
        return nbt.hasKey(nbtKey) || nbt.getString(nbtKey).equals(NBT_FormMasteryDefault);
    }

    public static boolean hasNBTFormMasteryNonRacial(NBTTagCompound nbt) {
        return nbt.hasKey(NBT_FormMasteryNonRacial) || nbt.getString(NBT_FormMasteryNonRacial).equals(NBT_FormMasteryDefaultNonRacial) || nbt.getString(NBT_FormMasteryNonRacial).equals(NBT_FormMasteryDefault);
    }

    public static String getDefaultFormMasteryRacialText(int race) {
        String mastery = "";
        int length = trans[race].length;
        for (int i = 0; i < length; ++i) {
            mastery = mastery + trans[race][i] + ",0" + (i + 1 < length ? ";" : "");
        }
        return mastery;
    }

    public static String getDefaultFormMasteryNonRacialText() {
        String mastery = "";
        int length = transNonRacial.length;
        for (int i = 0; i < length; ++i) {
            mastery = mastery + transNonRacial[i] + ",0" + (i + 1 < length ? ";" : "");
        }
        return mastery;
    }

    public static int getFormID(String formID, int race, boolean addRacials) {
        int i = 0;
        for (String form : transNonRacial) {
            if (formID.equals(form)) {
                return i + (addRacials ? trans[race].length : 0);
            }
            ++i;
        }
        i = 0;
        for (String form : trans[race]) {
            if (formID.equals(form)) {
                return i;
            }
            ++i;
        }
        return 0;
    }

    public static int getFormID(String formID, int race) {
        return JRMCoreH.getFormID(formID, race, true);
    }

    public static boolean isCurrentFormID(String checkedFormID, int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        if (state2 > 0) {
            if (isKaiokenOn && checkedFormID.equals(trans_KAIOKEN)) {
                return true;
            }
            if (isUltraInstinctOn && checkedFormID.equals(trans_ULTRA_INSTINCT)) {
                return true;
            }
        }
        if (isMysticOn && checkedFormID.equals(trans_MYSTIC)) {
            return true;
        }
        return isGoDOn && checkedFormID.equals(trans_GOD_OF_DESTRUCTION);
    }

    public static String getCurrentFormName(int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        int baseState = JRMCoreH.isRaceArcosian(race) ? 4 : 0;
        String currentFormID = "";
        if (isMysticOn) {
            currentFormID = transNonRacial[1];
        } else if (isGoDOn) {
            currentFormID = transNonRacial[3];
        } else if (state == baseState && !isUltraInstinctOn) {
            currentFormID = "Base";
        } else if (state > baseState || JRMCoreH.isRaceArcosian(race) && state < baseState && !isUltraInstinctOn) {
            currentFormID = trans[race][state];
        } else if (state2 > 0) {
            currentFormID = isKaiokenOn ? transNonRacial[0] : (isUltraInstinctOn ? transNonRacial[2] : trans[race][state]);
        }
        return currentFormID;
    }

    public static int getCurrentFormID(int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        int baseState = JRMCoreH.isRaceArcosian(race) ? 4 : 0;
        int currentFormID = 0;
        if (isMysticOn) {
            currentFormID = trans[race].length + 1;
        } else if (isGoDOn) {
            currentFormID = trans[race].length + 3;
        } else if (state == baseState && !isUltraInstinctOn) {
            currentFormID = baseState;
        } else if (state > baseState || JRMCoreH.isRaceArcosian(race) && state < baseState && !isUltraInstinctOn) {
            currentFormID = state;
        } else if (state2 > 0) {
            currentFormID = isKaiokenOn ? trans[race].length + 0 : (isUltraInstinctOn ? trans[race].length + 2 : state);
        }
        return currentFormID;
    }

    public static boolean isCurrentFormRacial(int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        int baseState;
        int n = baseState = JRMCoreH.isRaceArcosian(race) ? 4 : 0;
        if (isMysticOn || isGoDOn) {
            return false;
        }
        if (state2 > 0 && (isKaiokenOn || isUltraInstinctOn)) {
            return false;
        }
        if (state == baseState && !isUltraInstinctOn) {
            return true;
        }
        if (state > 0) {
            return true;
        }
        return true;
    }

    public static void updateFormMasteryVersion(NBTTagCompound nbt) {
        if (nbt.hasKey(NBT_FormMasteryRacial)) {
            String mastery = nbt.getString(NBT_FormMasteryRacial);
            if (mastery != null && mastery.length() > 0) {
                int oldMasteryRace = -1;
                String[] masteryData = mastery.split(";");
                int races = Races.length;
                for (int raceID = 0; raceID < races; ++raceID) {
                    int forms = trans[raceID].length;
                    if (forms != masteryData.length) continue;
                    boolean sameForms = true;
                    for (int formID = 0; formID < forms; ++formID) {
                        String formName = masteryData[formID].split(",")[0];
                        if (formName.equals(trans[raceID][formID])) continue;
                        sameForms = false;
                        break;
                    }
                    if (!sameForms) continue;
                    nbt.setString(JRMCoreH.getNBTFormMasteryRacialKey(raceID), mastery);
                    break;
                }
            }
            nbt.removeTag(NBT_FormMasteryRacial);
        }
    }

    public static String convertFormMasteryToFormat(String formMastery, String decimalFormat) {
        DecimalFormat format = new DecimalFormat(decimalFormat);
        String[] data = formMastery.split(";");
        String newFormMastery = "";
        for (int i = 0; i < data.length; ++i) {
            String[] values = data[i].split(",");
            double value = Double.parseDouble(format.format(Double.parseDouble(values[1])).replace(",", "."));
            newFormMastery = newFormMastery + values[0] + "," + (value == (double)((int)value) ? (int)value + "" : Double.valueOf(value)) + (i + 1 < data.length ? ";" : "");
        }
        return newFormMastery;
    }

    public static String getFormMasteryData(EntityPlayer player) {
        return JRMCoreH.getFormMasteryData(player, "");
    }

    public static String getFormMasteryData(EntityPlayer player, String decimalFormat) {
        if (player != null && player.worldObj != null) {
            if (!player.worldObj.isRemote) {
                String[] FznA;
                String Fzn;
                JGPlayerMP jgPlayer = new JGPlayerMP(player);
                jgPlayer.connectBaseNBT();
                String mastery = "";
                JRMCoreH.updateFormMasteryVersion(jgPlayer.getNBT());
                if (JRMCoreH.isFused((Entity)player) && (Fzn = jgPlayer.getNBT().getString(FUSION)).contains(",") && (FznA = Fzn.split(",")).length == 3) {
                    MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
                    EntityPlayerMP p1 = JRMCoreH.getPlayerForUsername(server, FznA[0]);
                    EntityPlayerMP p2 = JRMCoreH.getPlayerForUsername(server, FznA[1]);
                    if (p1 != null && p2 != null) {
                        jgPlayer = new JGPlayerMP((EntityPlayer)p1);
                        jgPlayer.connectBaseNBT();
                        mastery = !JRMCoreH.hasNBTFormMasteryRacial(jgPlayer.getNBT()) ? mastery + JRMCoreH.getDefaultFormMasteryRacialText(jgPlayer.getRace()) : mastery + jgPlayer.getNBT().getString(JRMCoreH.getNBTFormMasteryRacialKey(jgPlayer.getRace()));
                        mastery = mastery + ";";
                        mastery = !JRMCoreH.hasNBTFormMasteryNonRacial(jgPlayer.getNBT()) ? mastery + JRMCoreH.getDefaultFormMasteryNonRacialText() : mastery + jgPlayer.getNBT().getString(NBT_FormMasteryNonRacial);
                        JGPlayerMP jgPlayerPartner = new JGPlayerMP((EntityPlayer)p2);
                        jgPlayerPartner.connectBaseNBT();
                        if (jgPlayerPartner.getRace() == jgPlayer.getRace()) {
                            JRMCoreH.updateFormMasteryVersion(jgPlayerPartner.getNBT());
                            String masteryPartner = "";
                            masteryPartner = !JRMCoreH.hasNBTFormMasteryRacial(jgPlayerPartner.getNBT()) ? masteryPartner + JRMCoreH.getDefaultFormMasteryRacialText(jgPlayerPartner.getRace()) : masteryPartner + jgPlayerPartner.getNBT().getString(JRMCoreH.getNBTFormMasteryRacialKey(jgPlayer.getRace()));
                            masteryPartner = masteryPartner + ";";
                            masteryPartner = !JRMCoreH.hasNBTFormMasteryNonRacial(jgPlayerPartner.getNBT()) ? masteryPartner + JRMCoreH.getDefaultFormMasteryNonRacialText() : masteryPartner + jgPlayerPartner.getNBT().getString(NBT_FormMasteryNonRacial);
                            String[] p1Mastery = mastery.split(";");
                            String[] p2Mastery = masteryPartner.split(";");
                            mastery = "";
                            int length = p1Mastery.length;
                            int length2 = p2Mastery.length;
                            if (length == length2) {
                                for (int i = 0; i < length; ++i) {
                                    String[] values = p1Mastery[i].split(",");
                                    String[] values2 = p2Mastery[i].split(",");
                                    double result = (Double.parseDouble(values[1]) + Double.parseDouble(values2[1])) * 1.0;
                                    mastery = mastery + values[0] + "," + result + (i + 1 < length ? ";" : "");
                                }
                            }
                        }
                    }
                }
                if (mastery == null || mastery.length() == 0) {
                    mastery = "";
                    mastery = !JRMCoreH.hasNBTFormMasteryRacial(jgPlayer.getNBT()) ? mastery + JRMCoreH.getDefaultFormMasteryRacialText(jgPlayer.getRace()) : mastery + jgPlayer.getNBT().getString(JRMCoreH.getNBTFormMasteryRacialKey(jgPlayer.getRace()));
                    mastery = mastery + ";";
                    mastery = !JRMCoreH.hasNBTFormMasteryRacial(jgPlayer.getNBT()) ? mastery + JRMCoreH.getDefaultFormMasteryNonRacialText() : mastery + jgPlayer.getNBT().getString(NBT_FormMasteryNonRacial);
                }
                return decimalFormat == null || decimalFormat.length() == 0 ? mastery : JRMCoreH.convertFormMasteryToFormat(mastery, decimalFormat);
            }
            if (JRMCoreH.dnn(32) && plyrs != null) {
                String playerName = mod_JRMCore.proxy.getPlayerClient().getCommandSenderName();
                if (playerName == null || playerName.length() == 0) {
                    return "";
                }
                for (int pl = 0; pl < plyrs.length; ++pl) {
                    if (plyrs[pl] == null || !plyrs[pl].equals(playerName)) continue;
                    if (dat32 == null || dat32.length <= pl) break;
                    return dat32[pl];
                }
            }
        }
        return NBT_FormMasteryDefault;
    }

    public static String getFormMasteryData() {
        String data = JRMCoreH.getFormMasteryData(mod_JRMCore.proxy.getPlayerClient());
        if (data != null && data.length() > 0 && data.contains(";")) {
            byte race = Race;
            byte state = State;
            byte state2 = State2;
            boolean isKaiokenOn = JRMCoreH.StusEfctsMe(5);
            boolean isMysticOn = JRMCoreH.StusEfctsMe(13);
            boolean isUltraInstinctOn = JRMCoreH.StusEfctsMe(19);
            boolean isGoDOn = JRMCoreH.StusEfctsMe(20);
            int formID = JRMCoreH.getCurrentFormID(race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
            String[] dataArray = data.split(";");
            if (dataArray.length > formID) {
                return dataArray[formID];
            }
        }
        return NBT_FormMasteryDefault;
    }

    public static String getFormMasteryData(EntityPlayer player, int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        String data = JRMCoreH.getFormMasteryData(player);
        if (data != null && data.length() > 0 && data.contains(";")) {
            int formID = JRMCoreH.getCurrentFormID(race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
            String[] dataArray = data.split(";");
            if (dataArray.length > formID) {
                return dataArray[formID];
            }
        }
        return "";
    }

    public static String getFormMasteryNameFromData(String data) {
        if (data != null && data.length() > 0 && data.contains(",")) {
            String[] formData = data.split(",");
            return formData[0];
        }
        return "";
    }

    public static double getFormMasteryValueFromData(String data) {
        if (data != null && data.length() > 0 && data.contains(",")) {
            String[] formData = data.split(",");
            double currFormValue = Double.parseDouble(formData[1]);
            return currFormValue;
        }
        return 0.0;
    }

    public static double getFormMasteryValue(EntityPlayer player, int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        String data = JRMCoreH.getFormMasteryData(player, race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
        return JRMCoreH.getFormMasteryValueFromData(data);
    }

    public static double getFormMasteryValue(EntityPlayer player, int formID) {
        String[] dataArray;
        String data = JRMCoreH.getFormMasteryData(player);
        if (data != null && data.length() > 0 && data.contains(";") && (dataArray = data.split(";")).length > formID) {
            String[] formData = dataArray[formID].split(",");
            double currFormValue = Double.parseDouble(formData[1]);
            return currFormValue;
        }
        return 0.0;
    }

    public static double getFormMasteryValue(EntityPlayer player) {
        if (JRMCoreH.dnn(1) && JRMCoreH.dnn(2) && JRMCoreH.dnn(19) && JRMCoreH.dnn(32) && plyrs != null) {
            if (player == null) {
                return 0.0;
            }
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (plyrs[pl] == null || !plyrs[pl].equals(player.getCommandSenderName())) continue;
                if (dat32 == null || dat32.length <= pl) break;
                int race = Integer.parseInt(data1[pl].split(";")[0]);
                int state = Integer.parseInt(data2[pl].split(";")[0]);
                int state2 = Integer.parseInt(data2[pl].split(";")[1]);
                String statusEffects = dat19[pl].split(";")[1];
                boolean isKaiokenOn = JRMCoreH.StusEfcts(5, statusEffects);
                boolean isMysticOn = JRMCoreH.StusEfcts(13, statusEffects);
                boolean isUltraInstinctOn = JRMCoreH.StusEfcts(19, statusEffects);
                boolean isGoDOn = JRMCoreH.StusEfcts(20, statusEffects);
                return JRMCoreH.getFormMasteryValue(player, race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
            }
        }
        return 0.0;
    }

    public static double getFormMasteryValue() {
        byte race = Race;
        byte state = State;
        byte state2 = State2;
        boolean isKaiokenOn = JRMCoreH.StusEfctsMe(5);
        boolean isMysticOn = JRMCoreH.StusEfctsMe(13);
        boolean isUltraInstinctOn = JRMCoreH.StusEfctsMe(19);
        boolean isGoDOn = JRMCoreH.StusEfctsMe(20);
        return JRMCoreH.getFormMasteryValue(mod_JRMCore.proxy.getPlayerClient(), race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
    }

    public static int getFormIDFromName(int race, String formName) {
        int i;
        boolean formID = false;
        int length = trans[race].length;
        for (i = 0; i < length; ++i) {
            if (!trans[race][i].equals(formName)) continue;
            return i;
        }
        length = transNonRacial.length;
        for (i = 0; i < length; ++i) {
            if (!transNonRacial[i].equals(formName)) continue;
            return i + trans[race].length;
        }
        return 0;
    }

    public static void changeFormMasteryValue(EntityPlayer player, double value, boolean add, int race, int formID, boolean racial, int gainMultiID) {
        String mastery;
        boolean hasNBTNonRacial;
        if (!JGConfigDBCFormMastery.FM_Enabled) {
            return;
        }
        if (JRMCoreH.isFused((Entity)player)) {
            return;
        }
        JGPlayerMP jgPlayer = new JGPlayerMP(player);
        NBTTagCompound nbt = jgPlayer.connectBaseNBT();
        String nbtKey = JRMCoreH.getNBTFormMasteryRacialKey(racial, race);
        String nbtKeyRacial = JRMCoreH.getNBTFormMasteryRacialKey(true, race);
        String nbtKeyNonRacial = JRMCoreH.getNBTFormMasteryRacialKey(false, race);
        boolean hasNBTRacial = nbt.hasKey(nbtKeyRacial) && !nbt.getString(nbtKeyRacial).equals(NBT_FormMasteryDefault) && !nbt.getString(nbtKeyRacial).equals(NBT_FormMasteryDefaultNonRacial) && nbt.getString(nbtKeyRacial).contains(",");
        boolean bl = hasNBTNonRacial = nbt.hasKey(nbtKeyNonRacial) && !nbt.getString(nbtKeyNonRacial).equals(NBT_FormMasteryDefaultNonRacial) && !nbt.getString(nbtKeyNonRacial).equals(NBT_FormMasteryDefault) && nbt.getString(nbtKeyNonRacial).contains(",");
        if (!hasNBTRacial) {
            mastery = JRMCoreH.getDefaultFormMasteryRacialText(race);
            nbt.setString(nbtKeyRacial, mastery);
        }
        if (!hasNBTNonRacial) {
            mastery = JRMCoreH.getDefaultFormMasteryNonRacialText();
            nbt.setString(nbtKeyNonRacial, mastery);
        }
        String addToOther = "";
        String[] masteries = nbt.getString(nbtKey).split(";");
        int length = masteries.length;
        for (int i = 0; i < length; ++i) {
            double FM_LevelMax;
            if (i != formID - (racial ? 0 : trans[race].length)) continue;
            String[] values = masteries[i].split(",");
            if (values.length <= 1) break;
            double result = value;
            if (add) {
                String FM_AddGainsToOtherMastery;
                double prevLevel = Double.parseDouble(values[1]);
                if (gainMultiID > -1) {
                    int gainID = JGConfigDBCFormMastery.DATA_ID_GAIN_PASSIVE + gainMultiID;
                    result = value = JGConfigDBCFormMastery.getDouble(race, formID, gainID, 0);
                    double multipliedGain = JGConfigDBCFormMastery.getMultipliedGain(prevLevel, result, gainID, race, formID);
                    int mind = jgPlayer.getAttributes()[4];
                    double mindMulti = JGConfigDBCFormMastery.getMindGainMulti(gainMultiID, mind, gainMultiID, race, formID);
                    result = multipliedGain * mindMulti;
                }
                if ((FM_AddGainsToOtherMastery = JGConfigDBCFormMastery.getString(race, formID, JGConfigDBCFormMastery.DATA_ID_GAIN_TO_OTHER_MASTERIES, 0)) != null && FM_AddGainsToOtherMastery.contains(",") && FM_AddGainsToOtherMastery.length() > 0) {
                    String[] masteryGainsOther = FM_AddGainsToOtherMastery.split(";");
                    int lengthOther = masteryGainsOther.length;
                    for (int j = 0; j < lengthOther; ++j) {
                        String[] valuesOther = masteryGainsOther[j].split(",");
                        String nameOther = valuesOther[0];
                        int id = 0;
                        boolean found = false;
                        String[] allForms = JRMCoreH.getFormMasteryData(player).split(";");
                        int lengthAll = allForms.length;
                        for (int k = 0; k < lengthAll; ++k) {
                            String name = allForms[k].split(",")[0];
                            if (!name.equals(nameOther)) continue;
                            id = k;
                            found = true;
                            break;
                        }
                        if (!found || id == -1 || id == formID) continue;
                        double valueOther = Double.parseDouble(valuesOther[1]) * result;
                        addToOther = addToOther + id + "," + valueOther + "," + (id < trans[race].length) + (j + 1 < length ? ";" : "");
                    }
                }
                result += prevLevel;
            }
            if (result > (FM_LevelMax = JGConfigDBCFormMastery.getDouble(race, formID, JGConfigDBCFormMastery.DATA_ID_MAX_LEVEL, 0))) {
                result = FM_LevelMax;
            }
            masteries[i] = values[0] + "," + result;
            break;
        }
        String mastery2 = "";
        for (int i = 0; i < length; ++i) {
            mastery2 = mastery2 + masteries[i] + (i + 1 < length ? ";" : "");
        }
        nbt.setString(nbtKey, mastery2);
        if (addToOther.length() > 0) {
            String[] otherData = addToOther.split(";");
            int lengthOther = otherData.length;
            for (int i = 0; i < lengthOther; ++i) {
                boolean hasNBTOther;
                String[] otherDataValues = otherData[i].split(",");
                boolean isRacialOther = Boolean.parseBoolean(otherDataValues[2]);
                String nbtKeyOther = JRMCoreH.getNBTFormMasteryRacialKey(isRacialOther, race);
                boolean bl2 = hasNBTOther = nbt.hasKey(nbtKey) && !nbt.getString(nbtKey).equals(NBT_FormMasteryDefault) && !nbt.getString(nbtKey).equals(NBT_FormMasteryDefaultNonRacial);
                if (!hasNBTOther) {
                    mastery2 = isRacialOther ? JRMCoreH.getDefaultFormMasteryRacialText(race) : JRMCoreH.getDefaultFormMasteryNonRacialText();
                    nbt.setString(nbtKey, mastery2);
                }
                int formIDOther = Integer.parseInt(otherDataValues[0]);
                double multiOther = Double.parseDouble(otherDataValues[1]);
                String[] masteryBefore = nbt.getString(nbtKeyOther).split(";");
                length = masteryBefore.length;
                mastery2 = "";
                for (int j = 0; j < length; ++j) {
                    double FM_LevelMax;
                    String[] masteryValuesAfter = masteryBefore[j].split(",");
                    double masteryValueBefore = Double.parseDouble(masteryValuesAfter[1]);
                    double result = masteryValueBefore + (j == formIDOther - (isRacialOther ? 0 : trans[race].length) ? multiOther : 0.0);
                    if (result > (FM_LevelMax = JGConfigDBCFormMastery.getDouble(race, j + (isRacialOther ? 0 : trans[race].length), JGConfigDBCFormMastery.DATA_ID_MAX_LEVEL, 0))) {
                        result = FM_LevelMax;
                    }
                    mastery2 = mastery2 + masteryValuesAfter[0] + "," + result + (j + 1 < length ? ";" : "");
                }
                nbt.setString(nbtKeyOther, mastery2);
            }
        }
    }

    public static void addToFormMasteryValue(EntityPlayer player, double value, int race, int FormID, boolean racial, int gainMultiID) {
        JRMCoreH.changeFormMasteryValue(player, value, true, race, FormID, racial, gainMultiID);
    }

    public static void setFormMasteryValue(EntityPlayer player, double value, int race, int FormID, boolean racial) {
        JRMCoreH.changeFormMasteryValue(player, value, false, race, FormID, racial, -1);
    }

    public static void addToFormMasteryValue(EntityPlayer player, double value, int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn, int gainMultiID) {
        int currentFormID = JRMCoreH.getCurrentFormID(race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
        boolean racial = JRMCoreH.isCurrentFormRacial(race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
        JRMCoreH.changeFormMasteryValue(player, value, true, race, currentFormID, racial, gainMultiID);
    }

    public static void setFormMasteryValue(EntityPlayer player, double value, int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        int currentFormID = JRMCoreH.getCurrentFormID(race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
        boolean racial = JRMCoreH.isCurrentFormRacial(race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
        JRMCoreH.changeFormMasteryValue(player, value, false, race, currentFormID, racial, -1);
    }

    public static void changeFormMasteriesValue(EntityPlayer player, double value, double valueKK, boolean add, int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn, int gainMultiID) {
        if (add) {
            JRMCoreH.addToFormMasteryValue(player, value, race, state, state2, false, isMysticOn, isUltraInstinctOn, isGoDOn, gainMultiID);
        } else {
            JRMCoreH.setFormMasteryValue(player, value, race, state, state2, false, isMysticOn, isUltraInstinctOn, isGoDOn);
        }
        boolean isInKaioken = JRMCoreH.isCurrentFormID(trans_KAIOKEN, race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
        if (isKaiokenOn && isInKaioken) {
            int kaiokenID = JRMCoreH.getFormID(trans_KAIOKEN, race);
            if (add) {
                JRMCoreH.addToFormMasteryValue(player, valueKK, race, kaiokenID, false, gainMultiID);
            } else {
                JRMCoreH.setFormMasteryValue(player, valueKK, race, kaiokenID, false);
            }
            double d = JRMCoreH.getFormMasteryValue(player, kaiokenID);
        }
    }

    public static void addToFormMasteriesValue(EntityPlayer player, double value, double valueKK, int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn, int gainMultiID) {
        JRMCoreH.changeFormMasteriesValue(player, value, valueKK, true, race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn, gainMultiID);
    }

    public static void setFormMasteriesValue(EntityPlayer player, double value, double valueKK, int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn, int gainMultiID) {
        JRMCoreH.changeFormMasteriesValue(player, value, valueKK, false, race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn, gainMultiID);
    }

    public static boolean hasRequiredFormMasteries(EntityPlayer player, String data, String requiredMastery, int formID, boolean sayChat) {
        if (JGConfigDBCFormMastery.FM_Enabled && requiredMastery.contains(",") && requiredMastery.length() > 0) {
            String[] formData = data.split(";");
            String[] formDataR = requiredMastery.split(";");
            int i = 0;
            for (String s : formData) {
                if (formID == -1 || formID == i) {
                    String[] formDataValues = s.split(",");
                    for (String sR : formDataR) {
                        double formValueR;
                        String[] formDataValuesR = sR.split(",");
                        if (!formDataValues[0].equals(formDataValuesR[0])) continue;
                        double formValue = Double.parseDouble(formDataValues[1]);
                        if (!(formValue < (formValueR = Double.parseDouble(formDataValuesR[1])))) break;
                        if (sayChat) {
                            player.addChatMessage(new ChatComponentText("Failed to Transform! Form Mastery Requirement needed: " + formDataValuesR[0] + " Lvl: " + formDataValuesR[1]).setChatStyle(DBCPacketHandlerServer.styleRed));
                        } else {
                            player.addChatMessage(new ChatComponentText("Failed to hold Form! Form Mastery Requirement needed: " + formDataValuesR[0] + " Lvl: " + formDataValuesR[1]).setChatStyle(DBCPacketHandlerServer.styleRed));
                        }
                        return false;
                    }
                }
                ++i;
            }
        }
        return true;
    }

    public static boolean hasRequiredFormMasteries(EntityPlayer player, String data, String requiredMastery, int formID) {
        return JRMCoreH.hasRequiredFormMasteries(player, data, requiredMastery, formID, true);
    }

    public static boolean hasRequiredFormMasteries(EntityPlayer player, String data, int race, String formName, boolean sayChat) {
        int formID = JRMCoreH.getFormIDFromName(race, formName);
        String FM_RequiredMastery = JGConfigDBCFormMastery.getString(race, formID, JGConfigDBCFormMastery.DATA_ID_REQUIRED_MASTERIES, 0);
        if (FM_RequiredMastery == null) {
            return true;
        }
        return JRMCoreH.hasRequiredFormMasteries(player, data, FM_RequiredMastery, -1, sayChat);
    }

    public static boolean hasRequiredFormMasteries(EntityPlayer player, String data, int race, String formName) {
        return JRMCoreH.hasRequiredFormMasteries(player, data, race, formName, true);
    }

    public static boolean hasRequiredFormMasteries(EntityPlayer player, String data, int race, int formID) {
        String FM_RequiredMastery = JGConfigDBCFormMastery.getString(race, formID, JGConfigDBCFormMastery.DATA_ID_REQUIRED_MASTERIES, 0);
        if (FM_RequiredMastery == null) {
            return true;
        }
        return JRMCoreH.hasRequiredFormMasteries(player, data, FM_RequiredMastery, -1);
    }

    public static boolean hasRequiredFormMasteries(EntityPlayer player, String data, String requiredMastery) {
        return JRMCoreH.hasRequiredFormMasteries(player, data, requiredMastery, -1);
    }

    public static boolean hasRequiredFormMasteries2(EntityPlayer player, String data, int race, int state, int state2, boolean isKaiokenOn, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        String formName = JRMCoreH.getCurrentFormName(race, state, state2, isKaiokenOn, isMysticOn, isUltraInstinctOn, isGoDOn);
        return JRMCoreH.hasRequiredFormMasteries(player, data, race, formName, false);
    }

    public static void autoLearnFormMastery(EntityPlayer player, int race) {
        if (!JGConfigDBCFormMastery.FM_Enabled) {
            return;
        }
        if (JRMCoreH.isFused((Entity)player)) {
            return;
        }
        String[] data = JRMCoreH.getFormMasteryData(player).split(";");
        int formID = 0;
        for (String mastery : data) {
            String[] values = mastery.split(",");
            double value = Double.parseDouble(values[1]);
            String FM_AutoLearnOnLevel = JGConfigDBCFormMastery.getString(race, formID, JGConfigDBCFormMastery.DATA_ID_AUTO_LEARN_ON_LEVEL, 0);
            if (FM_AutoLearnOnLevel != null && FM_AutoLearnOnLevel.length() > 0 && FM_AutoLearnOnLevel.contains(",")) {
                String[] autoUnlocks;
                for (String autoUnlock : autoUnlocks = FM_AutoLearnOnLevel.split(";")) {
                    int maxLevel;
                    String nameUnlock;
                    String[] valuesUnlock = autoUnlock.split(",");
                    double valueUnlock = Double.parseDouble(valuesUnlock[2]);
                    if (!(value >= valueUnlock)) continue;
                    String nameUnlockID = nameUnlock = valuesUnlock[0];
                    int levelID = Integer.parseInt(valuesUnlock[1]);
                    if (levelID < 0) {
                        levelID = 0;
                    }
                    JGPlayerMP jgPlayer = new JGPlayerMP(player);
                    jgPlayer.connectBaseNBT();
                    NBTTagCompound nbt = jgPlayer.getNBT();
                    if (nameUnlockID.equals("Racial")) {
                        String s1 = nbt.getString("jrmcSSltX");
                        int racialSkillLevel = JRMCoreH.SklLvlX(1, s1);
                        byte maxLevel2 = JGRaceHelper.getMaxRacialSkillLevel(JRMCoreH.DBC(), JRMCoreH.NC(), (byte)race);
                        if (levelID > maxLevel2) {
                            levelID = maxLevel2;
                        }
                        if (racialSkillLevel >= levelID + 1 || s1.length() <= 2 || s1.contains("pty")) continue;
                        String name = s1.substring(0, 2);
                        nbt.setString("jrmcSSltX", name + levelID);
                        player.addChatMessage(new ChatComponentText("Form Mastery: Auto Unlocked Racial Skill Level " + levelID).setChatStyle(DBCPacketHandlerServer.styleYellow));
                        continue;
                    }
                    if (--levelID < 0) {
                        levelID = 0;
                    }
                    String nameFullUnlock = "";
                    int id = 0;
                    for (String ids : DBCSkillsIDs) {
                        if (ids.equals(nameUnlockID)) {
                            nameFullUnlock = DBCSkillNames[id];
                            break;
                        }
                        ++id;
                    }
                    boolean isUI = id == 16;
                    int n = maxLevel = isUI ? JGConfigUltraInstinct.CONFIG_UI_LEVELS : vlblSklsUps[id] + 1;
                    if (levelID > maxLevel) {
                        levelID = maxLevel;
                    }
                    String[] s1 = nbt.getString(SkillsNbt2).split(",");
                    id = 0;
                    boolean foundSkill = false;
                    boolean learn = false;
                    for (String skill2 : s1) {
                        String name;
                        if (skill2.length() > 2 && (name = skill2.substring(0, 2)).equals(nameUnlockID)) {
                            foundSkill = true;
                            int skillLevel = Integer.parseInt(skill2.substring(2, 3));
                            if (skillLevel < levelID) {
                                s1[id] = name + levelID;
                                player.addChatMessage(new ChatComponentText("Form Mastery: Auto Unlocked Skill " + nameFullUnlock + " Level " + (levelID + (isUI ? 0 : 1))).setChatStyle(DBCPacketHandlerServer.styleYellow));
                                learn = true;
                            }
                        }
                        ++id;
                    }
                    String skills = "";
                    for (String skill3 : s1) {
                        if (s1.length <= 0) continue;
                        skills = skills + skill3 + ",";
                    }
                    if (!foundSkill) {
                        skills = skills + nameUnlockID + levelID + ",";
                        player.addChatMessage(new ChatComponentText("Form Mastery: Auto Unlocked Skill " + nameFullUnlock + " Level " + (levelID + (isUI ? 0 : 1))).setChatStyle(DBCPacketHandlerServer.styleYellow));
                        learn = true;
                    }
                    if (!learn) continue;
                    nbt.setString(SkillsNbt2, skills);
                }
            }
            ++formID;
        }
    }

    public static int mstc_sai(int skl) {
        int[] in = new int[]{1, 1, 1, 4, 5, 6, 6, 6};
        return in[skl];
    }

    public static int mstc_arc() {
        return 5;
    }

    public static int mstc_humnam() {
        return 1;
    }

    public static double ev_oob(float[][] f, int a1, int a2) {
        if (f.length <= a1) {
            a1 = f.length - 1;
        }
        if (f[a1].length <= a2) {
            a2 = f[a1].length - 1;
        }
        return f[a1][a2];
    }

    public static double ev_oob(int[][] f, int a1, int a2) {
        if (f.length <= a1) {
            a1 = f.length - 1;
        }
        if (f[a1].length <= a2) {
            a2 = f[a1].length - 1;
        }
        return f[a1][a2];
    }

    public static String ev_oob(String[][] f, int a1, int a2) {
        if (f.length <= a1) {
            a1 = f.length - 1;
        }
        if (f[a1].length <= a2) {
            a2 = f[a1].length - 1;
        }
        return f[a1][a2];
    }

    public static boolean inBaseForm(int race, int state) {
        return race == 4 ? state == 4 : state == 0;
    }

    public static int TransSaiPwr(int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v) {
        return JRMCoreH.getAttributeSaiyan(null, curAtr, atr, st, skl, mystic, mysticLvl, v, false, -1, false);
    }

    public static int TransSaiPwr(int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype) {
        return JRMCoreH.getAttributeSaiyan(null, curAtr, atr, st, skl, mystic, mysticLvl, v, ultraInstinct, powertype, false);
    }

    public static int getAttributeSaiyan(EntityPlayer player, int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype, boolean GoD) {
        double secondaryMulti;
        boolean race = true;
        boolean isPowerTypeKi = JRMCoreH.isPowerTypeKi(powertype);
        double formMasteryMulti = ultraInstinct || GoD ? 1.0 : JRMCoreH.getFormMasteryAttributeMulti(player, st, 0, 1, false, mystic, ultraInstinct, GoD);
        float[][] flatPercentage = isPowerTypeKi ? TransSaiStBnP : DoujutsuPowerBonusMulti;
        int[][] flatBonus = isPowerTypeKi ? TransSaiStBnF : DoujutsuPowerBonusFlat;
        double stateBonusPercentage = JRMCoreH.ev_oob(flatPercentage, st, atr) * formMasteryMulti;
        double stateBonusFlat = JRMCoreH.ev_oob(flatBonus, st, atr);
        if (GoD && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(1, st)) {
            stateBonusPercentage = 1.0;
        } else if (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(1, st)) {
            stateBonusPercentage = 1.0;
        } else if (mysticLvl > 0 && mystic && JRMCoreConfig.MysticDamMulti[1] != -1.0f) {
            stateBonusPercentage = 1.0 * formMasteryMulti;
        }
        int atrLimit = JRMCoreH.checkLimit();
        int n = atrLimit = atrLimit > 1000 ? 1000 : atrLimit;
        if (isPowerTypeKi) {
            if (mysticLvl > 0 && mystic) {
                float AttibuteBonusPerRacialSkill = JRMCoreConfig.AttibuteBonusPerRacialSkill[1][trans[1].length] * (float)skl;
                secondaryMulti = JRMCoreConfig.MysticDamMulti[1] == -1.0f ? flatPercentage[JRMCoreH.mstc_sai(skl)][atr] * (1.0f + AttibuteBonusPerRacialSkill) : JRMCoreConfig.MysticDamMulti[1] + AttibuteBonusPerRacialSkill;
            } else {
                int attributeBonusMaxID = JRMCoreConfig.AttibuteBonusPerRacialSkill[1].length - 1;
                secondaryMulti = 1.0f + JRMCoreConfig.AttibuteBonusPerRacialSkill[1][Math.min(st, attributeBonusMaxID)] * (float)skl;
            }
        } else {
            secondaryMulti = 1.0;
        }
        int per = (int)(stateBonusPercentage * (double)curAtr[atr] * secondaryMulti);
        int flt = isPowerTypeKi && mysticLvl > 0 && mystic ? (int)((float)curAtr[atr] + (float)flatBonus[JRMCoreH.mstc_sai(skl)][atr] * (1.0f + JRMCoreConfig.AttibuteBonusPerRacialSkill[1][trans[1].length] * (float)skl) * (float)atrLimit * 0.001f) : (int)((double)curAtr[atr] + stateBonusFlat * (double)atrLimit * (double)0.001f);
        flt = flt > JRMCoreH.checkLimit() ? JRMCoreH.checkLimit() : flt;
        per = per > flt || stateBonusFlat == 0.0 || atr == 4 ? per : flt;
        return per;
    }

    public static int getAttributeHalfSaiyan(EntityPlayer player, int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype, boolean GoD) {
        double secondaryMulti;
        int race = 2;
        boolean isPowerTypeKi = JRMCoreH.isPowerTypeKi(powertype);
        double formMasteryMulti = ultraInstinct || GoD ? 1.0 : JRMCoreH.getFormMasteryAttributeMulti(player, st, 0, 2, false, mystic, ultraInstinct, GoD);
        float[][] flatPercentage = isPowerTypeKi ? TransHalfSaiStBnP : DoujutsuPowerBonusMulti;
        int[][] flatBonus = isPowerTypeKi ? TransHalfSaiStBnF : DoujutsuPowerBonusFlat;
        double stateBonusPercentage = JRMCoreH.ev_oob(flatPercentage, st, atr) * formMasteryMulti;
        double stateBonusFlat = JRMCoreH.ev_oob(flatBonus, st, atr);
        if (GoD && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(2, st)) {
            stateBonusPercentage = 1.0;
        } else if (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(2, st)) {
            stateBonusPercentage = 1.0;
        } else if (mysticLvl > 0 && mystic && JRMCoreConfig.MysticDamMulti[2] != -1.0f) {
            stateBonusPercentage = 1.0 * formMasteryMulti;
        }
        int atrLimit = JRMCoreH.checkLimit();
        int n = atrLimit = atrLimit > 1000 ? 1000 : atrLimit;
        if (isPowerTypeKi) {
            if (mysticLvl > 0 && mystic) {
                float AttibuteBonusPerRacialSkill = JRMCoreConfig.AttibuteBonusPerRacialSkill[2][trans[2].length] * (float)skl;
                secondaryMulti = JRMCoreConfig.MysticDamMulti[2] == -1.0f ? flatPercentage[JRMCoreH.mstc_sai(skl)][atr] * (1.0f + AttibuteBonusPerRacialSkill) : JRMCoreConfig.MysticDamMulti[2] + AttibuteBonusPerRacialSkill;
            } else {
                int attributeBonusMaxID = JRMCoreConfig.AttibuteBonusPerRacialSkill[2].length - 1;
                secondaryMulti = 1.0f + JRMCoreConfig.AttibuteBonusPerRacialSkill[2][Math.min(st, attributeBonusMaxID)] * (float)skl;
            }
        } else {
            secondaryMulti = 1.0;
        }
        int per = (int)(stateBonusPercentage * (double)curAtr[atr] * secondaryMulti);
        int flt = isPowerTypeKi && mysticLvl > 0 && mystic ? (int)((float)curAtr[atr] + (float)flatBonus[JRMCoreH.mstc_sai(skl)][atr] * (1.0f + JRMCoreConfig.AttibuteBonusPerRacialSkill[2][trans[2].length] * (float)skl) * (float)atrLimit * 0.001f) : (int)((double)curAtr[atr] + stateBonusFlat * (double)atrLimit * (double)0.001f);
        flt = flt > JRMCoreH.checkLimit() ? JRMCoreH.checkLimit() : flt;
        per = per > flt || stateBonusFlat == 0.0 || atr == 4 ? per : flt;
        return per;
    }

    public static int TransFrPwr(int[] curAtr, int atr, int st, int rg, int e, int skl, boolean mystic, int mysticLvl, boolean v) {
        return JRMCoreH.getAttributeArcosian(null, curAtr, atr, st, rg, e, skl, mystic, mysticLvl, v, false, -1, false);
    }

    public static int TransFrPwr(int[] curAtr, int atr, int st, int rg, int e, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype) {
        return JRMCoreH.getAttributeArcosian(null, curAtr, atr, st, rg, e, skl, mystic, mysticLvl, v, ultraInstinct, powertype, false);
    }

    public static int getAttributeArcosian(EntityPlayer player, int[] curAtr, int atr, int st, int rg, int e, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype, boolean GoD) {
        double secondaryMulti;
        int race = 4;
        boolean isPowerTypeKi = JRMCoreH.isPowerTypeKi(powertype);
        double formMasteryMulti = ultraInstinct || GoD ? 1.0 : JRMCoreH.getFormMasteryAttributeMulti(player, st, 0, 4, false, mystic, ultraInstinct, GoD);
        float[][] flatPercentage = isPowerTypeKi ? TransFrStBnP : DoujutsuPowerBonusMulti;
        int[][] flatBonus = isPowerTypeKi ? TransFrStBnF : DoujutsuPowerBonusFlat;
        double stateBonusPercentage = JRMCoreH.ev_oob(flatPercentage, st, atr) * formMasteryMulti;
        double stateBonusFlat = JRMCoreH.ev_oob(flatBonus, st, atr);
        if (GoD && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(4, st)) {
            stateBonusPercentage = 1.0;
        } else if (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(4, st)) {
            stateBonusPercentage = 1.0;
        } else if (mysticLvl > 0 && mystic && JRMCoreConfig.MysticDamMulti[4] != -1.0f) {
            stateBonusPercentage = 1.0 * formMasteryMulti;
        }
        int atrLimit = JRMCoreH.checkLimit();
        int n = atrLimit = atrLimit > 1000 ? 1000 : atrLimit;
        if (isPowerTypeKi && mysticLvl > 0 && mystic) {
            float AttibuteBonusPerRacialSkill = JRMCoreConfig.AttibuteBonusPerRacialSkill[4][trans[4].length] * (float)skl;
            secondaryMulti = JRMCoreConfig.MysticDamMulti[4] == -1.0f ? flatPercentage[JRMCoreH.mstc_arc()][atr] * (1.0f + AttibuteBonusPerRacialSkill) : JRMCoreConfig.MysticDamMulti[4] + AttibuteBonusPerRacialSkill;
        } else {
            int attributeBonusMaxID = JRMCoreConfig.AttibuteBonusPerRacialSkill[4].length - 1;
            secondaryMulti = 1.0f + (isPowerTypeKi ? JRMCoreConfig.AttibuteBonusPerRacialSkill[4][Math.min(st, attributeBonusMaxID)] * (float)skl : 0.0f);
        }
        int per = (int)(stateBonusPercentage * (double)curAtr[atr] * secondaryMulti);
        int flt = isPowerTypeKi && mysticLvl > 0 && mystic ? (int)((float)curAtr[atr] + (float)flatBonus[JRMCoreH.mstc_arc()][atr] * (1.0f + JRMCoreConfig.AttibuteBonusPerRacialSkill[4][trans[4].length] * (float)skl) * (float)atrLimit * 0.001f) : (int)((double)curAtr[atr] + stateBonusFlat * (double)atrLimit * (double)0.001f);
        flt = flt > JRMCoreH.checkLimit() ? JRMCoreH.checkLimit() : flt;
        per = per > flt || stateBonusFlat == 0.0 || atr == 4 ? per : flt;
        per = JRMCoreH.getArcosianPowerPointBoost(per, st, rg, e, JRMCoreH.getArcosianFormID(st, mystic, ultraInstinct, GoD));
        return per;
    }

    public static int TransHmPwr(int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v) {
        return JRMCoreH.getAttributeHuman(null, curAtr, atr, st, skl, mystic, mysticLvl, v, false, -1, false);
    }

    public static int TransHmPwr(int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype) {
        return JRMCoreH.getAttributeHuman(null, curAtr, atr, st, skl, mystic, mysticLvl, v, ultraInstinct, powertype, false);
    }

    public static int getAttributeHuman(EntityPlayer player, int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype, boolean GoD) {
        double secondaryMulti;
        boolean race = false;
        boolean isPowerTypeKi = JRMCoreH.isPowerTypeKi(powertype);
        double formMasteryMulti = ultraInstinct || GoD ? 1.0 : JRMCoreH.getFormMasteryAttributeMulti(player, st, 0, 0, false, mystic, ultraInstinct, GoD);
        float[][] flatPercentage = isPowerTypeKi ? TransHmStBnP : DoujutsuPowerBonusMulti;
        int[][] flatBonus = isPowerTypeKi ? TransHmStBnF : DoujutsuPowerBonusFlat;
        double stateBonusPercentage = JRMCoreH.ev_oob(flatPercentage, mysticLvl > 0 && mystic ? 1 : st, atr) * formMasteryMulti;
        double stateBonusFlat = JRMCoreH.ev_oob(flatBonus, mysticLvl > 0 && mystic ? 1 : st, atr);
        if (GoD && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(0, st)) {
            stateBonusPercentage = 1.0;
        } else if (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(0, st)) {
            stateBonusPercentage = 1.0;
        } else if (mysticLvl > 0 && mystic && JRMCoreConfig.MysticDamMulti[0] != -1.0f) {
            stateBonusPercentage = 1.0 * formMasteryMulti;
        }
        int atrLimit = JRMCoreH.checkLimit();
        int n = atrLimit = atrLimit > 1000 ? 1000 : atrLimit;
        if (isPowerTypeKi) {
            if (mysticLvl > 0 && mystic) {
                float AttibuteBonusPerRacialSkill = JRMCoreConfig.AttibuteBonusPerRacialSkill[0][trans[0].length] * (float)skl;
                secondaryMulti = (JRMCoreConfig.MysticDamMulti[0] == -1.0f ? 1.0f : JRMCoreConfig.MysticDamMulti[0]) + AttibuteBonusPerRacialSkill;
            } else {
                int attributeBonusMaxID = JRMCoreConfig.AttibuteBonusPerRacialSkill[0].length - 1;
                secondaryMulti = 1.0f + JRMCoreConfig.AttibuteBonusPerRacialSkill[0][Math.min(st, attributeBonusMaxID)] * (float)skl;
            }
        } else {
            secondaryMulti = 1.0;
        }
        int per = (int)(stateBonusPercentage * (double)curAtr[atr] * secondaryMulti);
        int flt = (int)((double)curAtr[atr] + stateBonusFlat * (double)atrLimit * (double)0.001f);
        flt = flt > JRMCoreH.checkLimit() ? JRMCoreH.checkLimit() : flt;
        per = per > flt || stateBonusFlat == 0.0 || atr == 4 ? per : flt;
        return per;
    }

    public static int TransNaPwr(int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v) {
        return JRMCoreH.getAttributeNamekian(null, curAtr, atr, st, skl, mystic, mysticLvl, v, false, -1, false);
    }

    public static int TransNaPwr(int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype) {
        return JRMCoreH.getAttributeNamekian(null, curAtr, atr, st, skl, mystic, mysticLvl, v, ultraInstinct, powertype, false);
    }

    public static int getAttributeNamekian(EntityPlayer player, int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype, boolean GoD) {
        double secondaryMulti;
        int race = 3;
        boolean isPowerTypeKi = JRMCoreH.isPowerTypeKi(powertype);
        double formMasteryMulti = ultraInstinct || GoD ? 1.0 : JRMCoreH.getFormMasteryAttributeMulti(player, st, 0, 3, false, mystic, ultraInstinct, GoD);
        float[][] flatPercentage = isPowerTypeKi ? TransNaStBnP : DoujutsuPowerBonusMulti;
        int[][] flatBonus = isPowerTypeKi ? TransNaStBnF : DoujutsuPowerBonusFlat;
        double stateBonusPercentage = JRMCoreH.ev_oob(flatPercentage, mysticLvl > 0 && mystic ? 1 : st, atr) * formMasteryMulti;
        double stateBonusFlat = JRMCoreH.ev_oob(flatBonus, mysticLvl > 0 && mystic ? 1 : st, atr);
        if (GoD && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(3, st)) {
            stateBonusPercentage = 1.0;
        } else if (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(3, st)) {
            stateBonusPercentage = 1.0;
        } else if (mysticLvl > 0 && mystic && JRMCoreConfig.MysticDamMulti[3] != -1.0f) {
            stateBonusPercentage = 1.0 * formMasteryMulti;
        }
        int atrLimit = JRMCoreH.checkLimit();
        int n = atrLimit = atrLimit > 1000 ? 1000 : atrLimit;
        if (isPowerTypeKi) {
            if (mysticLvl > 0 && mystic) {
                float AttibuteBonusPerRacialSkill = JRMCoreConfig.AttibuteBonusPerRacialSkill[3][trans[3].length] * (float)skl;
                secondaryMulti = (JRMCoreConfig.MysticDamMulti[3] == -1.0f ? 1.0f : JRMCoreConfig.MysticDamMulti[3]) + AttibuteBonusPerRacialSkill;
            } else {
                int attributeBonusMaxID = JRMCoreConfig.AttibuteBonusPerRacialSkill[3].length - 1;
                secondaryMulti = 1.0f + JRMCoreConfig.AttibuteBonusPerRacialSkill[3][Math.min(st, attributeBonusMaxID)] * (float)skl;
            }
        } else {
            secondaryMulti = 1.0;
        }
        int per = (int)(stateBonusPercentage * (double)curAtr[atr] * secondaryMulti);
        int flt = (int)((double)curAtr[atr] + stateBonusFlat * (double)atrLimit * (double)0.001f);
        flt = flt > JRMCoreH.checkLimit() ? JRMCoreH.checkLimit() : flt;
        per = per > flt || stateBonusFlat == 0.0 || atr == 4 ? per : flt;
        return per;
    }

    public static int getAttributeMajin(EntityPlayer player, int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype, boolean GoD) {
        return JRMCoreH.getAttributeMajin(player, curAtr, atr, st, skl, mystic, mysticLvl, v, ultraInstinct, powertype, GoD, "");
    }

    public static int getAttributeMajin(EntityPlayer player, int[] curAtr, int atr, int st, int skl, boolean mystic, int mysticLvl, boolean v, boolean ultraInstinct, int powertype, boolean GoD, String majinAbs) {
        double secondaryMulti;
        double formMasteryMulti;
        int race = 5;
        boolean isPowerTypeKi = JRMCoreH.isPowerTypeKi(powertype);
        double d = formMasteryMulti = ultraInstinct || GoD ? 1.0 : JRMCoreH.getFormMasteryAttributeMulti(player, st, 0, 5, false, mystic, ultraInstinct, GoD);
        if (isPowerTypeKi && majinAbs.length() > 0 && JGConfigRaces.CONFIG_MAJIN_ENABLED && JGConfigRaces.CONFIG_MAJIN_ABSORPTION_ENABLED) {
            int stateID = JRMCoreH.getMajinFormID(st, mystic, ultraInstinct, GoD);
            float attributeMulti = JGConfigRaces.CONFIG_MAJIN_ABSORPTON_ATTRIBUTE_MULTI[stateID] * (float)JRMCoreH.getMajinAbsorptionValueS(majinAbs);
            formMasteryMulti = JGConfigRaces.CONFIG_MAJIN_ABSORPTON_MULTIPLIES_BONUS_ATTRIBUTE_MULTIPLIERS ? (formMasteryMulti *= 1.0 + (double)attributeMulti) : (formMasteryMulti += (double)attributeMulti);
        }
        float[][] flatPercentage = isPowerTypeKi ? TransMaStBnP : DoujutsuPowerBonusMulti;
        int[][] flatBonus = isPowerTypeKi ? TransMaStBnF : DoujutsuPowerBonusFlat;
        double stateBonusPercentage = JRMCoreH.ev_oob(flatPercentage, mysticLvl > 0 && mystic ? 1 : st, atr) * formMasteryMulti;
        double stateBonusFlat = JRMCoreH.ev_oob(flatBonus, mysticLvl > 0 && mystic ? 1 : st, atr);
        if (GoD && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(5, st)) {
            stateBonusPercentage = 1.0;
        } else if (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_CONFIG && JRMCoreH.inBaseForm(5, st)) {
            stateBonusPercentage = 1.0;
        } else if (mysticLvl > 0 && mystic && JRMCoreConfig.MysticDamMulti[5] != -1.0f) {
            stateBonusPercentage = 1.0 * formMasteryMulti;
        }
        int atrLimit = JRMCoreH.checkLimit();
        int n = atrLimit = atrLimit > 1000 ? 1000 : atrLimit;
        if (isPowerTypeKi) {
            if (mysticLvl > 0 && mystic) {
                float AttibuteBonusPerRacialSkill = JRMCoreConfig.AttibuteBonusPerRacialSkill[5][trans[5].length] * (float)skl;
                secondaryMulti = (JRMCoreConfig.MysticDamMulti[5] == -1.0f ? 1.0f : JRMCoreConfig.MysticDamMulti[5]) + AttibuteBonusPerRacialSkill;
            } else {
                int attributeBonusMaxID = JRMCoreConfig.AttibuteBonusPerRacialSkill[5].length - 1;
                secondaryMulti = 1.0f + JRMCoreConfig.AttibuteBonusPerRacialSkill[5][Math.min(st, attributeBonusMaxID)] * (float)skl;
            }
        } else {
            secondaryMulti = 1.0;
        }
        int per = (int)(stateBonusPercentage * (double)curAtr[atr] * secondaryMulti);
        int flt = (int)((double)curAtr[atr] + stateBonusFlat * (double)atrLimit * (double)0.001f);
        flt = flt > JRMCoreH.checkLimit() ? JRMCoreH.checkLimit() : flt;
        per = per > flt || stateBonusFlat == 0.0 || atr == 4 ? per : flt;
        return per;
    }

    public static boolean lgndb(int r, int st) {
        String[] b = JRMCoreConfig.lgndb.split(",");
        for (int i = 0; i < b.length; ++i) {
            if (!b[i].equalsIgnoreCase(JRMCoreH.ev_oob(trans, r, st))) continue;
            return true;
        }
        return false;
    }

    public static boolean lgndb() {
        return JRMCoreH.lgndb(Race, State);
    }

    public static boolean lgndb2() {
        return JRMCoreH.StusEfctsMe(14) && JRMCoreH.lgndb(Race, State);
    }

    public static boolean lgndb(String se, int r, int s) {
        return JRMCoreH.StusEfcts(14, se) && JRMCoreH.lgndb(r, s);
    }

    public static boolean lgndb(int p, int r, int s) {
        return JRMCoreH.StusEfctsClient(14, p) && JRMCoreH.lgndb(r, s);
    }

    public static boolean lgndb(EntityPlayer p, int r, int s) {
        return JRMCoreH.StusEfctsClient(14, p) && JRMCoreH.lgndb(r, s);
    }

    public static int TransPwrModAtr(int[] currAttributes, int attribute, int st, int st2, int race, String SklX, int currRelease, int arcRel, boolean legendOn, boolean majinOn, boolean mysticOn, int powerType, String[] Skls, boolean isFused) {
        return JRMCoreH.getPlayerAttribute(null, currAttributes, attribute, st, st2, race, SklX, currRelease, arcRel, legendOn, majinOn, false, mysticOn, false, false, powerType, Skls, isFused, "0");
    }

    public static int TransPwrModAtr(int[] currAttributes, int attribute, int st, int st2, int race, String SklX, int currRelease, int arcRel, boolean legendOn, boolean majinOn, boolean mysticOn, boolean uiOn, int powerType, String[] Skls, boolean isFused) {
        return JRMCoreH.getPlayerAttribute(null, currAttributes, attribute, st, st2, race, SklX, currRelease, arcRel, legendOn, majinOn, false, mysticOn, false, false, powerType, Skls, isFused, "0");
    }

    public static int getPlayerAttribute(int[] currAttributes, int attribute, int st, int st2, int race, String SklX, int currRelease, int arcRel, boolean legendOn, boolean majinOn, boolean mysticOn, boolean uiOn, boolean GoDOn, int powerType, String[] Skls, boolean isFused) {
        return JRMCoreH.getPlayerAttribute(null, currAttributes, attribute, st, st2, race, SklX, currRelease, arcRel, legendOn, majinOn, false, mysticOn, uiOn, GoDOn, powerType, Skls, isFused, "0");
    }

    public static int getPlayerAttribute(EntityPlayer player, int[] currAttributes, int attribute, int st, int st2, int race, String SklX, int currRelease, int arcRel, boolean legendOn, boolean majinOn, boolean kaiokenOn, boolean mysticOn, boolean uiOn, boolean GoDOn, int powerType, String[] Skls, boolean isFused, String majinAbs) {
        double formMasteryMulti;
        int skillX = powerType == 1 ? JRMCoreH.SklLvlX(1, SklX) - 1 : 0;
        int mysticLvl = powerType == 1 ? JRMCoreH.SklLvl(10, 1, Skls) : 0;
        int result = 0;
        switch (race) {
            case 0: {
                result = JRMCoreH.getAttributeHuman(player, currAttributes, attribute, st, skillX, mysticOn, mysticLvl, isFused, uiOn, powerType, GoDOn);
                break;
            }
            case 1: {
                result = JRMCoreH.getAttributeSaiyan(player, currAttributes, attribute, st, skillX, mysticOn, mysticLvl, isFused, uiOn, powerType, GoDOn);
                break;
            }
            case 2: {
                result = JRMCoreH.getAttributeHalfSaiyan(player, currAttributes, attribute, st, skillX, mysticOn, mysticLvl, isFused, uiOn, powerType, GoDOn);
                break;
            }
            case 3: {
                result = JRMCoreH.getAttributeNamekian(player, currAttributes, attribute, st, skillX, mysticOn, mysticLvl, isFused, uiOn, powerType, GoDOn);
                break;
            }
            case 4: {
                result = JRMCoreH.getAttributeArcosian(player, currAttributes, attribute, st, currRelease, arcRel, skillX, mysticOn, mysticLvl, isFused, uiOn, powerType, GoDOn);
                break;
            }
            case 5: {
                result = JRMCoreH.getAttributeMajin(player, currAttributes, attribute, st, skillX, mysticOn, mysticLvl, isFused, uiOn, powerType, GoDOn, majinAbs);
                break;
            }
            default: {
                result = currAttributes[attribute];
            }
        }
        if (powerType == 1 && GoDOn) {
            formMasteryMulti = JRMCoreH.getFormMasteryAttributeMulti(player, trans_GOD_OF_DESTRUCTION, st, st2, race, kaiokenOn, mysticOn, uiOn, GoDOn);
            result = (int)((float)result * (float)((double)(JGConfigDBCGoD.CONFIG_GOD_ATTRIBUTE_MULTI * JGConfigDBCGoD.CONFIG_GOD_ATTRIBUTE_MULTI_RACE[race]) * formMasteryMulti));
        }
        if (powerType == 1 && uiOn) {
            if (JGConfigUltraInstinct.CONFIG_UI_LEVELS > 0) {
                formMasteryMulti = JRMCoreH.getFormMasteryAttributeMulti(player, trans_ULTRA_INSTINCT, st, st2, race, kaiokenOn, mysticOn, uiOn, GoDOn);
                int uiLevel = JRMCoreH.state2UltraInstinct(false, (byte)st2);
                result = (int)((double)result * ((double)((float)JGConfigUltraInstinct.CONFIG_UI_ATTRIBUTE_MULTI[uiLevel] * 0.01f * JGConfigUltraInstinct.CONFIG_UI_ATTRIBUTE_MULTI_RACE[uiLevel][race]) * 1.0 * formMasteryMulti));
            }
        } else if (powerType == 1 && st2 < TransKaiDmg.length) {
            formMasteryMulti = 1.0;
            if (st2 > 0 && kaiokenOn) {
                formMasteryMulti = JRMCoreH.getFormMasteryAttributeMulti(player, trans_KAIOKEN, st, st2, race, kaiokenOn, mysticOn, uiOn, GoDOn);
            }
            result = (int)((double)result * ((double)TransKaiDmg[st2] * 1.0 * formMasteryMulti) + (double)(majinOn ? (float)(result * JRMCoreConfig.mjn) * 0.01f : 0.0f) + (double)(legendOn && (JRMCoreH.lgndb(race, st) || mysticOn) ? (float)(result * JRMCoreConfig.lgnd) * 0.01f : 0.0f));
        }
        if (powerType == 2 && st2 < TransGtsDmg.length) {
            result = (int)((double)result * ((double)TransGtsDmg[st2] * 1.0));
        }
        if (!JRMCoreConfig.OverAtrLimit) {
            result = result > JRMCoreH.checkLimit() ? JRMCoreH.checkLimit() : result;
        }
        result = (int)((double)result > Double.MAX_VALUE ? Double.MAX_VALUE : (double)result);
        return result;
    }

    public static double getFormMasteryAttributeMulti(EntityPlayer player, int st, int st2, int race, boolean kaiokenOn, boolean mysticOn, boolean uiOn, boolean GoDOn) {
        double masteryResult;
        boolean hasFormMastery = JGConfigDBCFormMastery.FM_Enabled && player != null;
        double formMasteryMulti = 0.0;
        if (hasFormMastery) {
            double masteryValue;
            double FM_DamageMultiMax;
            double FM_DamageMultiPerLevel;
            double FM_DamageMultiFlat;
            boolean isInKaioken = JRMCoreH.isCurrentFormID(trans_KAIOKEN, race, st, st2, kaiokenOn, mysticOn, uiOn, GoDOn);
            if (isInKaioken) {
                int formIDKaioken = JRMCoreH.getFormIDFromName(race, isInKaioken ? trans_KAIOKEN : "");
                FM_DamageMultiFlat = JGConfigDBCFormMastery.getDouble(race, formIDKaioken, JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI, 0);
                FM_DamageMultiPerLevel = JGConfigDBCFormMastery.getDouble(race, formIDKaioken, JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI, 1);
                FM_DamageMultiMax = JGConfigDBCFormMastery.getDouble(race, formIDKaioken, JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI, 2);
                masteryValue = JRMCoreH.getFormMasteryValue(player, formIDKaioken);
                masteryResult = FM_DamageMultiPerLevel * masteryValue + FM_DamageMultiFlat;
                if (masteryResult > FM_DamageMultiMax) {
                    masteryResult = FM_DamageMultiMax;
                }
                formMasteryMulti += masteryResult;
            }
            int formID = JRMCoreH.getCurrentFormID(race, st, st2, kaiokenOn, mysticOn, uiOn, GoDOn);
            FM_DamageMultiFlat = JGConfigDBCFormMastery.getDouble(race, formID, JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI, 0);
            FM_DamageMultiPerLevel = JGConfigDBCFormMastery.getDouble(race, formID, JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI, 1);
            FM_DamageMultiMax = JGConfigDBCFormMastery.getDouble(race, formID, JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI, 2);
            masteryValue = JRMCoreH.getFormMasteryValue(player, race, st, st2, kaiokenOn, mysticOn, uiOn, GoDOn);
            masteryResult = FM_DamageMultiPerLevel * masteryValue + FM_DamageMultiFlat;
            if (masteryResult > FM_DamageMultiMax) {
                masteryResult = FM_DamageMultiMax;
            }
        } else {
            return 1.0;
        }
        return formMasteryMulti += masteryResult;
    }

    public static double getFormMasteryAttributeMulti(EntityPlayer player, String formName, int st, int st2, int race, boolean kaiokenOn, boolean mysticOn, boolean uiOn, boolean GoDOn) {
        boolean hasFormMastery = JGConfigDBCFormMastery.FM_Enabled && player != null && formName != null && formName.length() > 0;
        double formMasteryMulti = 0.0;
        if (hasFormMastery) {
            boolean isInForm = JRMCoreH.isCurrentFormID(formName, race, st, st2, kaiokenOn, mysticOn, uiOn, GoDOn);
            if (isInForm) {
                int formID = JRMCoreH.getFormIDFromName(race, isInForm ? formName : "");
                double FM_DamageMultiFlat = JGConfigDBCFormMastery.getDouble(race, formID, JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI, 0);
                double FM_DamageMultiPerLevel = JGConfigDBCFormMastery.getDouble(race, formID, JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI, 1);
                double FM_DamageMultiMax = JGConfigDBCFormMastery.getDouble(race, formID, JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI, 2);
                double masteryValue = JRMCoreH.getFormMasteryValue(player, formID);
                double masteryResult = FM_DamageMultiPerLevel * masteryValue + FM_DamageMultiFlat;
                if (masteryResult > FM_DamageMultiMax) {
                    masteryResult = FM_DamageMultiMax;
                }
                formMasteryMulti += masteryResult;
            }
        } else {
            return 1.0;
        }
        return formMasteryMulti;
    }

    public static int weightModifier(int[] curAtr, int atr, float weight) {
        int i = (int)((float)curAtr[atr] - weight);
        return i < 0 ? 0 : i;
    }

    public static float weightPerc(int atr, EntityPlayer p) {
        float lastGravity = JRMCoreH.getFloat(p, GravZoneForce);
        lastGravity = JRMCoreHDBC.gravity(p, lastGravity);
        int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts(p);
        float IWeight = JRMCoreH.weightExtra(PlyrAttrbts, lastGravity, p);
        return 0.5f + JRMCoreH.weightPerc(PlyrAttrbts, atr, IWeight, p) * 0.5f;
    }

    public static float weightPerc(int atr) {
        boolean c = JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11);
        float f = atr == 0 ? 0.5f + JRMCoreH.weightPerc(PlyrAttrbts, atr, WeightOn, c) * 0.5f : JRMCoreH.weightPerc(PlyrAttrbts, atr, WeightOn, c);
        return f;
    }

    public static float weightPerc(int atr, float weight) {
        float w = (float)atr - weight;
        return (w /= (float)atr) < 0.05f ? 0.05f : (w > 1.0f ? 1.0f : w);
    }

    public static float weightPerc(int[] curAtr, int atr, float weight, EntityPlayer p) {
        byte pwr = JRMCoreH.getByte(p, P);
        byte rc = JRMCoreH.getByte(p, R);
        byte st = JRMCoreH.getByte(p, St);
        byte st2 = JRMCoreH.getByte(p, St2);
        byte rl = JRMCoreH.getByte(p, CurRelease);
        String sklx = JRMCoreH.getString(p, "jrmcSSltX");
        int resrv = JRMCoreH.getInt(p, ArcRsrvNbt);
        String absorption = JRMCoreH.getString(p, NBT_MajinAbsorptionData);
        String ste = JRMCoreH.getString(p, StE);
        boolean mj = JRMCoreH.StusEfcts(12, ste);
        boolean lg = JRMCoreH.StusEfcts(14, ste);
        boolean kk = JRMCoreH.StusEfcts(5, ste);
        boolean mc = JRMCoreH.StusEfcts(13, ste);
        boolean mn = JRMCoreH.StusEfcts(19, ste);
        boolean gd = JRMCoreH.StusEfcts(20, ste);
        int a = curAtr[atr];
        if (pwr != 3 && pwr > 0) {
            String s = JRMCoreH.getString(p, StE);
            boolean c = JRMCoreH.StusEfcts(10, s) || JRMCoreH.StusEfcts(11, s);
            a = JRMCoreH.getPlayerAttribute(p, curAtr, atr, st, st2, rc, sklx, rl, resrv, lg, mj, kk, mc, mn, gd, pwr, JRMCoreH.PlyrSkills(p), c, absorption);
        }
        return JRMCoreH.weightPerc(a, weight);
    }

    public static float weightPerc(int[] curAtr, int atr, float weight, boolean b) {
        int a = curAtr[atr];
        if (Pwrtyp != 3 && Pwrtyp > 0) {
            a = JRMCoreH.getPlayerAttribute(mod_JRMCore.proxy.getPlayerClient(), curAtr, atr, State, State2, Race, PlyrSkillX, curRelease, JRMCoreH.getArcRsrv(), JRMCoreH.StusEfctsMe(14), JRMCoreH.StusEfctsMe(12), JRMCoreH.StusEfctsMe(5), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20), Pwrtyp, PlyrSkills, b, JRMCoreH.getMajinAbsorption());
        }
        return JRMCoreH.weightPerc(a, weight);
    }

    public static float weightOfPlayerBody(int[] curAtr, boolean g) {
        float am = 1 / JRMCoreH.checkLimit();
        float body = 1.0f + (float)curAtr[2] * am * 100.0f + (float)curAtr[0] * am * 50.0f + (float)curAtr[1] * am * 25.0f;
        return body;
    }

    public static float weightExtra(int[] curAtr, float grav, EntityPlayer p) {
        float weight = JRMCoreH.getItemWeight(p);
        String s = JRMCoreH.getString(p, StE);
        float body = JRMCoreH.weightOfPlayerBody(curAtr, JRMCoreH.StusEfcts(10, s) || JRMCoreH.StusEfcts(11, s));
        return (body + weight) * grav - body;
    }

    public static float getItemWeight(EntityPlayer player) {
        int i;
        NBTTagList nbttaglist;
        ExtendedPlayer p = ExtendedPlayer.get(player);
        ItemStack is = p.inventory.getStackInSlot(0);
        if (is != null && (nbttaglist = JRMCoreH.ItemWeightStatsNBTTag(is)) != null && (i = 0) < nbttaglist.tagCount()) {
            float weight = nbttaglist.getCompoundTagAt(i).getFloat("weight");
            return weight;
        }
        return 0.0f;
    }

    public static double TransSaiRegen(int[] curAtr, double r, int st, String SklX, int cr, int resrv) {
        return JRMCoreH.getKiRegenSaiyan(curAtr, r, st, SklX, cr, resrv, false, false);
    }

    public static double TransSaiRegen(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct) {
        return JRMCoreH.getKiRegenSaiyan(curAtr, r, st, SklX, cr, resrv, ultraInstinct, false);
    }

    public static double getKiRegenSaiyan(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct, boolean godOfDestruction) {
        double c = 0.0;
        if (st > 0) {
            int might = (int)((float)(JRMCoreH.getPlayerAttribute(curAtr, 0, st, 0, 1, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[0]) * 0.4f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 1, st, 0, 1, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[1]) * 0.25f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 3, st, 0, 1, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[3]) * 0.35f);
            c = (float)might * TransSaiRgn[st];
        } else {
            float regen = godOfDestruction && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(1, st) ? 1.0f : (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(1, st) ? 1.0f : TransSaiRgn[st]);
            c = r * (double)regen;
        }
        return c;
    }

    public static double getKiRegenHalfSaiyan(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct, boolean godOfDestruction) {
        double c = 0.0;
        if (st > 0) {
            int might = (int)((float)(JRMCoreH.getPlayerAttribute(curAtr, 0, st, 0, 1, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[0]) * 0.4f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 1, st, 0, 1, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[1]) * 0.25f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 3, st, 0, 1, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[3]) * 0.35f);
            c = (float)might * TransHalfSaiRgn[st];
        } else {
            float regen = godOfDestruction && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(2, st) ? 1.0f : (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(2, st) ? 1.0f : TransHalfSaiRgn[st]);
            c = r * (double)regen;
        }
        return c;
    }

    public static double TransFrRegen(int[] curAtr, double r, int st, String SklX, int cr, int resrv) {
        return JRMCoreH.getKiRegenArcosian(curAtr, r, st, SklX, cr, resrv, false, false);
    }

    public static double TransFrRegen(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct) {
        return JRMCoreH.getKiRegenArcosian(curAtr, r, st, SklX, cr, resrv, ultraInstinct, false);
    }

    public static double getKiRegenArcosian(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct, boolean godOfDestruction) {
        double c = 0.0;
        if (st >= 5) {
            int might = (int)((float)(JRMCoreH.getPlayerAttribute(curAtr, 0, st, 0, 4, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[0]) * 0.4f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 1, st, 0, 4, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[1]) * 0.25f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 3, st, 0, 4, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[3]) * 0.35f);
            int skl = JRMCoreH.SklLvlX(1, SklX);
            if (skl != 0) {
                double m = st == 6 ? (double)(1.0f - 0.1f * ((float)skl - 6.0f)) : (double)(1.0f - 0.1f * ((float)skl - 3.0f));
                c = (double)((float)might * TransFrRgn[st]) * m;
            }
        } else {
            float regen = godOfDestruction && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(4, st) ? 1.0f : (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(4, st) ? 1.0f : TransFrRgn[st]);
            c = r * (double)regen;
        }
        return c;
    }

    public static double TransHmRegen(int[] curAtr, double r, int st, String SklX, int cr, int resrv) {
        return JRMCoreH.getKiRegenHuman(curAtr, r, st, SklX, cr, resrv, false, false);
    }

    public static double TransHmRegen(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct) {
        return JRMCoreH.getKiRegenHuman(curAtr, r, st, SklX, cr, resrv, ultraInstinct, false);
    }

    public static double getKiRegenHuman(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct, boolean godOfDestruction) {
        double c = 0.0;
        if (st > 0) {
            int might = (int)((float)(JRMCoreH.getPlayerAttribute(curAtr, 0, st, 0, 0, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[0]) * 0.4f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 1, st, 0, 0, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[1]) * 0.25f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 3, st, 0, 0, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[3]) * 0.35f);
            c = (float)might * TransHmRgn[st];
        } else {
            float regen = godOfDestruction && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(0, st) ? 1.0f : (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(0, st) ? 1.0f : TransHmRgn[st]);
            c = r * (double)regen;
        }
        return c;
    }

    public static double TransNaRegen(int[] curAtr, double r, int st, String SklX, int cr, int resrv) {
        return JRMCoreH.getKiRegenNamekian(curAtr, r, st, SklX, cr, resrv, false, false);
    }

    public static double TransNaRegen(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct) {
        return JRMCoreH.getKiRegenNamekian(curAtr, r, st, SklX, cr, resrv, ultraInstinct, false);
    }

    public static double getKiRegenNamekian(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct, boolean godOfDestruction) {
        double c = 0.0;
        if (st > 0) {
            int might = (int)((float)(JRMCoreH.getPlayerAttribute(curAtr, 0, st, 0, 0, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[0]) * 0.4f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 1, st, 0, 0, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[1]) * 0.25f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 3, st, 0, 0, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[3]) * 0.35f);
            c = (float)might * TransNaRgn[st];
        } else {
            float regen = godOfDestruction && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(3, st) ? 1.0f : (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(3, st) ? 1.0f : TransNaRgn[st]);
            c = r * (double)regen;
        }
        return c;
    }

    public static double getKiRegenMajin(int[] curAtr, double r, int st, String SklX, int cr, int resrv, boolean ultraInstinct, boolean godOfDestruction) {
        double c = 0.0;
        if (st > 0) {
            int might = (int)((float)(JRMCoreH.getPlayerAttribute(curAtr, 0, st, 0, 0, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[0]) * 0.4f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 1, st, 0, 0, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[1]) * 0.25f + (float)(JRMCoreH.getPlayerAttribute(curAtr, 3, st, 0, 0, SklX, cr, resrv, false, false, false, false, false, 1, null, false) - curAtr[3]) * 0.35f);
            c = (float)might * TransMaRgn[st];
        } else {
            float regen = godOfDestruction && JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(5, st) ? 1.0f : (ultraInstinct && JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_KI_REGEN_CONFIG && JRMCoreH.inBaseForm(5, st) ? 1.0f : TransMaRgn[st]);
            c = r * (double)regen;
        }
        return c;
    }

    public static double EGtsCost(EntityPlayer p) {
        int[] a = JRMCoreH.PlyrAttrbts(p);
        int skl = JRMCoreH.SklLvl(0, p);
        byte rc = JRMCoreH.getByte(p, R);
        byte st = JRMCoreH.getByte(p, St);
        byte st2 = JRMCoreH.getByte(p, St2);
        int strnTmp = JRMCoreH.getInt(p, StrainTemp);
        int strn = JRMCoreH.getInt(p, Strain);
        int might = a[0] / 2 + a[3] / 2;
        int cons = a[2];
        double c = (double)(10 - JRMCoreH.SklLvl(12, p) + st2) * 0.01;
        float kc = JRMCoreH.EGtsFBal(rc, st, st2, skl, strn);
        c = (double)(JRMCoreConfig.sskai ? 0.0f : kc) + c;
        double r = 1.0 / (double)cons * (double)might * c;
        return r;
    }

    public static float EGtsFBal(int rc, int st, int st2, int skl, int strn) {
        float ret = st;
        if (strn > 0) {
            ret = skl + st;
            return ret * 0.75f;
        }
        return ret;
    }

    public static void EGtsStrainAct(NBTTagCompound nbt, int st2, int strn, int strnTmp, int strnAct) {
        if (strnAct > 0) {
            nbt.setInteger(StrainActv, --strnAct);
        }
        if (st2 == 0 && strn > 0) {
            nbt.setInteger(Strain, --strn);
        }
        if (!(JRMCoreConfig.sskai || st2 != 0 && strnAct > 0 || strnTmp <= 0)) {
            strn = (strn += strnTmp) > 239 ? 239 : strn;
            strnAct = 0;
            nbt.setInteger(StrainActv, 0);
            nbt.setInteger(Strain, strn);
            nbt.setInteger(StrainTemp, 0);
        }
    }

    public static double EGtsDmg(EntityPlayer p) {
        return TransGtsDmg[JRMCoreH.PlyrState2(p)];
    }

    public static double EGtsDmg() {
        return TransGtsDmg[State2];
    }

    public static double KaiKCost(EntityPlayer p) {
        int[] attributes = JRMCoreH.PlyrAttrbts(p);
        int skl = JRMCoreH.SklLvlX(1, JRMCoreH.getString(p, "jrmcSSltX"));
        byte race = JRMCoreH.getByte(p, R);
        int state = JRMCoreH.getByte(p, St);
        byte state2 = JRMCoreH.getByte(p, St2);
        int strnTmp = JRMCoreH.getInt(p, StrainTemp);
        int strn = JRMCoreH.getInt(p, Strain);
        boolean mystic = JRMCoreH.StusEfcts(13, JRMCoreH.getString(p, StE));
        int might = attributes[0] / 2 + attributes[3] / 2;
        int cons = attributes[2];
        double c = (double)(10 - JRMCoreH.SklLvl(8, p) + state2) * 0.01;
        float kc = JRMCoreH.KaiKFBal(race, state, state2, skl, strn);
        c = (double)(JRMCoreConfig.sskai ? 0.0f : kc) + c;
        int kaiokenState = !JRMCoreH.DBC() ? 0 : (mystic ? JRMCoreConfig.KaiokenFormHealthCost[race].length - 1 : state);
        double cost = 1.0 / (double)cons * (double)might * c * (double)TransKaiDrainRace[race] * ((double)TransKaiDrainLevel[state2] * (double)(JRMCoreH.DBC() ? JRMCoreConfig.KaiokenFormHealthCost[race][kaiokenState] : 1.0f));
        if (JGConfigDBCFormMastery.FM_Enabled) {
            int kkID = JRMCoreH.getFormID(trans_KAIOKEN, race);
            double kkMasteryLevel = JRMCoreH.getFormMasteryValue(p, kkID);
            float costMulti = (float)JGConfigDBCFormMastery.getCostMulti(kkMasteryLevel, race, kkID, JGConfigDBCFormMastery.DATA_ID_KAIOKEN_HEALTH_COST_MULTI);
            cost *= (double)costMulti;
        }
        return cost;
    }

    public static float KaiKFBal(int rc, int st, int st2, int skl, int strn) {
        float ret = st;
        if (strn > 0) {
            if (JRMCoreH.rc_arc(rc)) {
                st = (st -= 4) < 0 ? 0 : st * 3;
                ret = st;
            } else if (JRMCoreH.rc_humNam(rc)) {
                ret = skl + st;
            }
            return ret * 0.75f;
        }
        if (JRMCoreH.rc_sai(rc)) {
            ret = st == 10 && st2 < 4 ? 1.2f : 0.6f * (float)st;
        } else if (JRMCoreH.rc_humNam(rc)) {
            ret = st == 3 && st2 < 4 ? 0.9f : (st == 3 ? (float)st * 2.4f : (float)st);
        } else if (JRMCoreH.isRaceMajin(rc)) {
            ret = st == 4 && st2 < 4 ? 0.9f : (st == 4 ? (float)st * 2.4f : (float)st);
        } else if (JRMCoreH.rc_arc(rc)) {
            if (st == 7 && st2 < 4) {
                ret = 1.35f;
            } else {
                st = (st -= 4) < 0 ? 0 : st * 3;
                ret = 0.6f * (float)st;
            }
        }
        return ret;
    }

    public static void KaiKStrainAct(NBTTagCompound nbt, int st2, int strn, int strnTmp, int strnAct) {
        JRMCoreH.KaiKStrainAct(null, nbt, st2, strn, strnTmp, strnAct);
    }

    public static void KaiKStrainAct(EntityPlayer player, NBTTagCompound nbt, int st2, int strn, int strnTmp, int strnAct) {
        if (strnAct > 0) {
            nbt.setInteger(StrainActv, --strnAct);
        }
        if (st2 == 0 && strn > 0) {
            nbt.setInteger(Strain, --strn);
        }
        if (!(JRMCoreConfig.sskai || st2 != 0 && strnAct > 0 || strnTmp <= 0)) {
            strn = (strn += strnTmp) > 239 ? 239 : strn;
            strnAct = 0;
            nbt.setInteger(StrainActv, 0);
            nbt.setInteger(Strain, strn);
            nbt.setInteger(StrainTemp, 0);
        }
    }

    public static double KaiKDmg(EntityPlayer p) {
        return TransKaiDmg[JRMCoreH.PlyrState2(p)];
    }

    public static double KaiKDmg() {
        return TransKaiDmg[State2];
    }

    public static double NngDmg(EntityPlayer p) {
        return TransMngDmg[1];
    }

    public static double NmgDmg() {
        return TransMngDmg[1];
    }

    public static int Algnmnt(int a) {
        if (a > 66) {
            return 0;
        }
        if (a <= 66 && a >= 33) {
            return 1;
        }
        return 2;
    }

    public static boolean Algnmnt_Good(int a) {
        return JRMCoreH.Algnmnt(a) == 0;
    }

    public static boolean Algnmnt_Neut(int a) {
        return JRMCoreH.Algnmnt(a) == 1;
    }

    public static boolean Algnmnt_Evil(int a) {
        return JRMCoreH.Algnmnt(a) == 2;
    }

    public static int Algnmnt_rc(int a) {
        return JRMCoreH.Algnmnt_Good(a) ? 0xA8FFFF : (JRMCoreH.Algnmnt_Evil(a) ? 0xFE0000 : 14526719);
    }

    public static byte[] tech_statmods(String s) {
        String[] sp = s.split(",");
        byte[] rs = new byte[sp.length];
        for (int i = 0; i < sp.length; ++i) {
            rs[i] = Byte.parseByte(sp[i]);
        }
        return rs;
    }

    public static String tech_statmods_Rev(String[] s) {
        String sp = "";
        for (int i = 0; i < s.length; ++i) {
            sp = sp + "," + s[i];
        }
        return sp.substring(1);
    }

    public static float tech_statmod(byte[] rs, int sm) {
        switch (sm) {
            case 0: {
                return (float)tech_stats[rs[sm]] * 0.02f;
            }
            case 1: {
                return (float)tech_stats[rs[sm]] * 0.01f;
            }
            case 2: {
                return (float)(-tech_stats[rs[sm]]) * 0.01f;
            }
            case 3: {
                return (float)(-tech_stats[rs[sm]]) * 0.01f;
            }
            case 4: {
                return (float)(-tech_stats[rs[sm]]) * 0.01f;
            }
            case 5: {
                return rs[sm];
            }
            case 6: {
                return (float)tech_stats[rs[sm]] * 0.02f;
            }
        }
        return 0.0f;
    }

    public static int techDBCty(String[] t) {
        return Integer.parseInt(t[3]);
    }

    public static float techDBCct(String[] t, byte[] sts) {
        int ty = Integer.parseInt(t[3]);
        float ct = ty == 6 ? techDBCct[ty] : (float)Integer.parseInt(t[5]) / 20.0f + techDBCct[ty];
        return ct + ct * JRMCoreH.tech_statmod(sts, 3);
    }

    public static float techDBCctWc(String[] t, byte[] sts) {
        return JRMCoreH.techDBCct(t, sts) * 20.0f;
    }

    public static float techDBCcd(String[] t, byte[] sts) {
        int ty = Integer.parseInt(t[3]);
        return techDBCcd[ty] + techDBCcd[ty] * JRMCoreH.tech_statmod(sts, 4);
    }

    public static int techDBCdmg(String[] t, int w) {
        return (int)((double)Integer.parseInt(t[5]) * 0.01 * (double)w);
    }

    public static int techDBCdmg(String[] t, int w, byte[] sts) {
        double dm = (double)Integer.parseInt(t[5]) * 0.01 * (double)w;
        return (int)(dm + dm * (double)JRMCoreH.tech_statmod(sts, 1));
    }

    public static int techDBCkic(String[] listOfAttacks, int playerStat, byte[] kiAttackStats) {
        int ty = Integer.parseInt(listOfAttacks[3]);
        int sp = Integer.parseInt(listOfAttacks[4]);
        int ef = Integer.parseInt(listOfAttacks[6]) + 1;
        double ct = (double)JRMCoreH.techDBCdmg(listOfAttacks, playerStat) * (double)techDBCaddTYCost[ty] * (double)techDBCaddSPCost[sp] * (double)ef;
        int dm = (int)(ct + ct * (double)JRMCoreH.tech_statmod(kiAttackStats, 2));
        return (int)((double)dm * (JRMCoreH.DBC() ? (double)JRMCoreHDBC.DBCgetConfigTechCostMod() : 100.0) * (double)0.01f);
    }

    public static int techDBCtpc(String[] t) {
        return JRMCoreH.techDBCtpc(t, false);
    }

    public static int techDBCtpc(String[] t, boolean teach) {
        int dm = Integer.parseInt(t[5]);
        int ty = Integer.parseInt(t[3]);
        int cl = Integer.parseInt(t[10]);
        int sp = Integer.parseInt(t[4]);
        int ef = Integer.parseInt(t[6]) + 1;
        int lv = 1;
        int up = 1;
        if (t.length >= 17 && teach) {
            lv += Integer.parseInt(t[17]);
            up += Integer.parseInt(t[18]);
        }
        return (int)((float)(dm * 10) * techDBCaddTYCost[ty] * techDBCaddSPCost[sp] * (float)ef * (float)lv * (float)up + (float)(cl > 0 ? 100 : 0));
    }

    public static String[] tech_conv(String[] t) {
        if (t != null && t.length > 3) {
            String[] tn = new String[20];
            for (int i = 0; i < tn.length; ++i) {
                if (i >= t.length) {
                    if (i == 19) {
                        tn[i] = "0,0,0,0,0,0,0";
                        continue;
                    }
                    tn[i] = "0";
                    continue;
                }
                tn[i] = t[i];
            }
            return tn;
        }
        return t;
    }

    public static String tech_conv(String tr) {
        String[] t = JRMCoreH.tech_conv(tr.split(";"));
        String te = "";
        for (int i = 0; i < t.length; ++i) {
            te = te + ";" + t[i];
        }
        return te.substring(1);
    }

    public static String tech_teach(String[] t) {
        String[] tn = JRMCoreH.tech_conv(t);
        String te = "";
        for (int i = 0; i < t.length; ++i) {
            te = i == 1 ? te + ";0" : te + ";" + tn[i];
        }
        return te.substring(1);
    }

    public static String tech_teach(String tr) {
        String[] t = tr.split(";");
        return JRMCoreH.tech_teach(t);
    }

    public static String tech_upgrd(String[] t, int id) {
        String[] tn = JRMCoreH.tech_conv(t);
        int curap = Integer.parseInt(tn[18]);
        byte[] sts = JRMCoreH.tech_statmods(tn[19]);
        String[] stss = new String[sts.length];
        if (curap > 0) {
            --curap;
            for (int i = 0; i < stss.length; ++i) {
                stss[i] = i == id ? "" + (sts[i] + 1) : "" + sts[i];
            }
            tn[18] = "" + curap;
            tn[19] = "" + JRMCoreH.tech_statmods_Rev(stss);
        }
        String te = "";
        for (int i = 0; i < t.length; ++i) {
            te = te + ";" + tn[i];
        }
        return te.substring(1);
    }

    public static String tech_upgrd(String tr, int id) {
        String[] t = tr.split(";");
        return JRMCoreH.tech_upgrd(t, id);
    }

    public static String tech_expgiv(String[] t, int expgained) {
        String[] tn = JRMCoreH.tech_conv(t);
        if (tn.length > 3) {
            int curexp = Integer.parseInt(tn[16]);
            int curlvl = Integer.parseInt(tn[17]);
            int curap = Integer.parseInt(tn[18]);
            String curst = tn[19];
            boolean b = true;
            while (b && curlvl < 10) {
                int expneed = JRMCoreH.tech_expNeeded(curlvl, curexp);
                if (expgained >= expneed) {
                    expgained -= expneed;
                    ++curlvl;
                    ++curap;
                    curexp = 0;
                    continue;
                }
                curexp += expgained;
                b = false;
                break;
            }
            if (curlvl >= 10) {
                // empty if block
            }
            tn[16] = "" + curexp;
            tn[17] = "" + curlvl;
            tn[18] = "" + curap;
            tn[19] = "" + curst;
        }
        String te = "";
        for (int i = 0; i < tn.length; ++i) {
            te = te + ";" + tn[i];
        }
        return te.substring(1);
    }

    public static String tech_expgiv(String tr, int e) {
        String[] t = tr.split(";");
        return JRMCoreH.tech_expgiv(t, e);
    }

    public static int tech_getexpFor(int i) {
        return ++i * i * (JRMCoreH.DBC() ? JRMCoreHDBC.DBCgetConfigTechExpNeed() : 15);
    }

    public static int tech_expNeeded(int lvl, int exp) {
        return JRMCoreH.tech_getexpFor(lvl) - exp;
    }

    public static int tech_getlvl(String[] t) {
        if (20 != t.length) {
            return 0;
        }
        return Integer.parseInt(t[17]);
    }

    public static int tech_getlvl(String tr) {
        String[] t = tr.split(";");
        return JRMCoreH.tech_getlvl(t);
    }

    public static int tech_getexp(String[] t) {
        if (20 != t.length) {
            return 0;
        }
        return Integer.parseInt(t[16]);
    }

    public static int tech_getexp(String tr) {
        String[] t = tr.split(";");
        return JRMCoreH.tech_getexp(t);
    }

    public static int tech_getupg(String[] t) {
        if (20 != t.length) {
            return 0;
        }
        return Integer.parseInt(t[18]);
    }

    public static int tech_getupg(String tr) {
        String[] t = tr.split(";");
        return JRMCoreH.tech_getupg(t);
    }

    public static int techNCty(String[] t) {
        return Integer.parseInt(t[3]);
    }

    public static String techNCHS(String[] t) {
        if (t[8].length() == 5) {
            return t[8];
        }
        int ef = Integer.parseInt(t[6]);
        int ty = Integer.parseInt(t[3]) + 1;
        int sp = Integer.parseInt(t[4]) + 1;
        int cc = Integer.parseInt(t[7]);
        String ctb = techNCCCHS[cc];
        return techNCEffHS[ef] + sp + ty + ctb;
    }

    public static int cbtdmg(int ae, int ad, int te, int td) {
        if (te == ae + 1 && ae <= 4 || te == 0 && ae == 4) {
            td = (int)((float)td * 0.25f);
            return td;
        }
        if (te == ae) {
            td = td > ad ? td + ad : 0;
            return td;
        }
        return td;
    }

    public static int cbadmg(int ae, int ad, int te, int td) {
        if (te == ae) {
            ad = ad > td ? td + ad : 0;
            return ad;
        }
        return ad;
    }

    public static String[] techs(byte i) {
        if (i < 4 && JRMCoreH.tech(i) != null) {
            return JRMCoreH.tech(i);
        }
        if (i >= 4 && JRMCoreH.techsPM(i - 4) >= 0) {
            return Pwrtyp == 2 ? pmj[JRMCoreH.techsPM(i - 4)] : (Pwrtyp == 1 ? pmdbc[JRMCoreH.techsPM(i - 4)] : null);
        }
        return null;
    }

    public static String techs(byte i, int f) {
        if (i < 4 && JRMCoreH.tech(i) != null) {
            return f == 8 ? JRMCoreH.techNCHS(JRMCoreH.tech(i)) : JRMCoreH.tech(i)[f];
        }
        if (i >= 4 && JRMCoreH.techsPM(i - 4) >= 0) {
            return Pwrtyp == 2 ? pmj[JRMCoreH.techsPM(i - 4)][f] : (Pwrtyp == 1 ? pmdbc[JRMCoreH.techsPM(i - 4)][f] : "");
        }
        return "";
    }

    public static int techsPM(int j) {
        if (j >= 0 && techPM != null && techPM.length > j) {
            return techPM[j];
        }
        return -1;
    }

    public static boolean techOwnd(int i, byte pwr) {
        return JRMCoreH.techOwnd(i, pwr == 1 ? pmdbc : pmj);
    }

    public static boolean techOwnd(int i, String[][] s) {
        for (int it = 0; it < 4; it = (int)((byte)(it + 1))) {
            int pm = JRMCoreH.techsPM(it);
            if (s.length <= i || pm != i) continue;
            return true;
        }
        return false;
    }

    public static int[] PlyrAttrbtsC(EntityPlayer p) {
        String d = JRMCoreH.data(p.getCommandSenderName(), 14, "10,10,10,10,10,10");
        if (d != "") {
            String[] a = d.split(",");
            int[] PlyrAttrbts = new int[a.length];
            for (int i1 = 0; i1 < PlyrAttrbts.length; ++i1) {
                PlyrAttrbts[i1] = Integer.parseInt(a[i1]);
            }
            return PlyrAttrbts;
        }
        return new int[]{10, 10, 10, 10, 10, 10};
    }

    public static int[] PlyrAttrbts() {
        return PlyrAttrbts;
    }

    public static int[] PlyrAttrbts(EntityPlayer p) {
        return JRMCoreH.PlyrAttrbts(p, true);
    }

    public static int[] PlyrAttrbts(EntityPlayer p, boolean fused) {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.SERVER) {
            String[] FznA;
            String Fzn;
            NBTTagCompound nbt = JRMCoreH.nbt(p);
            if (fused && (Fzn = nbt.getString(FUSION)).contains(",") && (FznA = Fzn.split(",")).length == 3) {
                MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
                EntityPlayerMP p1 = JRMCoreH.getPlayerForUsername(server, FznA[0]);
                EntityPlayerMP p2 = JRMCoreH.getPlayerForUsername(server, FznA[1]);
                if (p1 != null && p2 != null) {
                    return JRMCoreH.PlyrAttrbts((EntityPlayer)p1, (EntityPlayer)p2);
                }
                nbt.setString(FUSION, "" + JRMCoreConfig.FznOverTime);
                if (p1 != null) {
                    NBTTagCompound nbt1 = JRMCoreH.nbt((EntityPlayer)p1);
                    JRMCoreH.StusEfcts(10, nbt1, false);
                    JRMCoreH.StusEfcts(11, nbt1, false);
                }
                if (p2 != null) {
                    NBTTagCompound nbt2 = JRMCoreH.nbt((EntityPlayer)p2);
                    JRMCoreH.StusEfcts(10, nbt2, false);
                    JRMCoreH.StusEfcts(11, nbt2, false);
                }
            }
            int[] PlyrAttrbts = new int[JRMCoreH.PlyrAttrbts.length];
            for (int i = 0; i < AttrbtNbt.length; i = (int)((byte)(i + 1))) {
                int r;
                if (nbt.getTag(AttrbtNbtI[i]) == null & nbt.getTag(AttrbtNbt[i]) != null) {
                    nbt.setInteger(AttrbtNbtI[i], (int)nbt.getShort(AttrbtNbt[i]));
                    nbt.removeTag(AttrbtNbt[i]);
                } else if (nbt.getTag(AttrbtNbtI[i]) == null) {
                    nbt.setInteger(AttrbtNbtI[i], 1);
                }
                PlyrAttrbts[i] = r = JRMCoreH.etXq4V(nbt.getInteger(AttrbtNbtI[i]));
            }
            return PlyrAttrbts;
        }
        return PlyrAttrbts;
    }

    public static String[] PlyrSkills(EntityPlayer p) {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.SERVER) {
            NBTTagCompound nbt = JRMCoreH.nbt(p);
            if (nbt.getTag(SkillsNbt2) == null) {
                nbt.setString(SkillsNbt2, ",");
            }
            String[] PlyrSkills = nbt.getString(SkillsNbt2).split(",");
            return PlyrSkills;
        }
        return PlyrSkills;
    }

    public static boolean PlyrSettingsI(EntityPlayer p, int ps, int i) {
        return JRMCoreH.PlyrSettings(p, ps) == i;
    }

    public static boolean PlyrSettingsB(EntityPlayer p, int ps) {
        return JRMCoreH.PlyrSettings(p, ps) >= 0;
    }

    public static int PlyrSettings(EntityPlayer p, int ps) {
        String n = JRMCoreH.getString(p, plyrSttngs).trim();
        for (int i = 0; i < n.length() / 2; ++i) {
            String c = JRMCoreH.sa(n, i * 2);
            if (!c.equals(PlyrSttngs[ps])) continue;
            return JRMCoreH.saI(n, i * 2 + 1);
        }
        return -1;
    }

    public static boolean PlyrSettingsI(NBTTagCompound nbt, int ps, int i) {
        return JRMCoreH.PlyrSettings(nbt, ps) == i;
    }

    public static boolean PlyrSettingsB(NBTTagCompound nbt, int ps) {
        return JRMCoreH.PlyrSettings(nbt, ps) >= 0;
    }

    public static int PlyrSettings(NBTTagCompound nbt, int ps) {
        String n = nbt.getString(plyrSttngs).trim();
        for (int i = 0; i < n.length() / 2; ++i) {
            String c = JRMCoreH.sa(n, i * 2);
            if (!c.equals(PlyrSttngs[ps])) continue;
            return JRMCoreH.saI(n, i * 2 + 1);
        }
        return -1;
    }

    public static void PlyrSettingsRem(EntityPlayer p, int ps) {
        String n = JRMCoreH.getString(p, plyrSttngs).trim();
        for (int i = 0; i < n.length() / 2; ++i) {
            String c = JRMCoreH.sa(n, i * 2);
            if (!c.equals(PlyrSttngs[ps])) continue;
            String x = JRMCoreH.sa(n, i * 2 + 1);
            JRMCoreH.setString(n.replaceAll(c + x, ""), p, plyrSttngs);
            return;
        }
    }

    public static void PlyrSettingsRem(NBTTagCompound nbt, int ps) {
        String n = nbt.getString(plyrSttngs).trim();
        for (int i = 0; i < n.length() / 2; ++i) {
            String c = JRMCoreH.sa(n, i * 2);
            if (!c.equals(PlyrSttngs[ps])) continue;
            String x = JRMCoreH.sa(n, i * 2 + 1);
            nbt.setString(plyrSttngs, n.replaceAll(c + x, ""));
            return;
        }
    }

    public static void PlyrSettingsSet(EntityPlayer p, int ps, int pi) {
        if (pi == -1) {
            JRMCoreH.PlyrSettingsRem(p, ps);
            return;
        }
        String n = JRMCoreH.getString(p, plyrSttngs).trim();
        for (int i = 0; i < n.length() / 2; ++i) {
            String c = JRMCoreH.sa(n, i * 2);
            if (!c.equals(PlyrSttngs[ps])) continue;
            String x = JRMCoreH.sa(n, i * 2 + 1);
            JRMCoreH.setString(n.replaceAll(c + x, c + pi), p, plyrSttngs);
            return;
        }
        JRMCoreH.setString(n + PlyrSttngs[ps] + pi, p, plyrSttngs);
    }

    public static void PlyrSettingsOn(EntityPlayer p, int ps) {
        JRMCoreH.PlyrSettingsSet(p, ps, 0);
    }

    public static void PlyrSettingsSet(NBTTagCompound nbt, int ps, int pi) {
        if (pi == -1) {
            JRMCoreH.PlyrSettingsRem(nbt, ps);
            return;
        }
        String n = nbt.getString(plyrSttngs).trim();
        for (int i = 0; i < n.length() / 2; ++i) {
            String c = JRMCoreH.sa(n, i * 2);
            if (!c.equals(PlyrSttngs[ps])) continue;
            String x = JRMCoreH.sa(n, i * 2 + 1);
            nbt.setString(plyrSttngs, n.replaceAll(c + x, c + pi));
            return;
        }
        nbt.setString(plyrSttngs, n + PlyrSttngs[ps] + pi);
    }

    public static void PlyrSettingsOn(NBTTagCompound nbt, int ps) {
        JRMCoreH.PlyrSettingsSet(nbt, ps, 0);
    }

    public static boolean PlyrSettingsI(int ps, int i) {
        return JRMCoreH.PlyrSettings(ps) == i;
    }

    public static boolean PlyrSettingsB(int ps) {
        return JRMCoreH.PlyrSettings(ps) >= 0;
    }

    public static int PlyrSettings(int ps) {
        String n = PlyrSettings;
        for (int i = 0; i < n.length() / 2; ++i) {
            String c = JRMCoreH.sa(n, i * 2);
            if (!c.equals(PlyrSttngs[ps])) continue;
            return JRMCoreH.saI(n, i * 2 + 1);
        }
        return -1;
    }

    public static int[] PlyrAttrbts(EntityPlayer p, EntityPlayer p2) {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.SERVER) {
            NBTTagCompound nbt = JRMCoreH.nbt(p);
            NBTTagCompound nbt2 = JRMCoreH.nbt(p2);
            int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts(p, false);
            int[] PlyrAttrbts2 = JRMCoreH.PlyrAttrbts(p2, false);
            int[] PlyrAttrbtsF = new int[JRMCoreH.PlyrAttrbts.length];
            for (int i = 0; i < AttrbtNbt.length; i = (int)((byte)(i + 1))) {
                if (i != 4) {
                    float attributeMulti = JRMCoreConfig.fusionAttributeMultis[i];
                    PlyrAttrbtsF[i] = PlyrAttrbts[i] < PlyrAttrbts2[i] ? (int)((float)PlyrAttrbts[i] * attributeMulti) : (int)((float)PlyrAttrbts2[i] * attributeMulti);
                    continue;
                }
                PlyrAttrbtsF[i] = PlyrAttrbts[i] < PlyrAttrbts2[i] ? PlyrAttrbts[i] : PlyrAttrbts2[i];
            }
            return PlyrAttrbtsF;
        }
        return PlyrAttrbts;
    }

    public static int costEnAt(String[] tech) {
        return JRMCoreH.costEnAt(tech, -1);
    }

    public static short costEnAt(String[] tech, int men) {
        short cost = 0;
        if (tech != null && men < 0) {
            byte type = Byte.parseByte(tech[3]);
            byte speed = Byte.parseByte(tech[4]);
            short dam = Short.parseShort(tech[5]);
            byte effect = Byte.parseByte(tech[6]);
            short casttime = (short)(techBase[8] - Short.parseShort(tech[8]));
            short cooldown = (short)(techBase[9] - Short.parseShort(tech[9]));
            byte color = Byte.parseByte(tech[10]);
            byte density = Byte.parseByte(tech[11]);
            int costInt = (int)((1.0f + (float)dam * 0.5f) * ((float)effect + 1.0f) * ((float)type + 1.0f) * ((float)speed * 0.1f) * (float)density + (float)casttime + (float)cooldown);
            cost = (short)(costInt > JRMCoreH.getMaxTP() ? JRMCoreH.getMaxTP() : costInt);
        } else if (tech != null && tech.length > 12) {
            byte density;
            byte tcost = Byte.parseByte(tech[7]);
            int costInt = 1 + (int)((float)tcost * 0.01f * (float)men * (float)(density = Byte.parseByte(tech[11])));
            cost = (short)(costInt > JRMCoreH.getMaxTP() ? JRMCoreH.getMaxTP() : costInt);
        }
        return cost <= 1 ? (short)1 : cost;
    }

    public static void swapCD(byte from, byte to) {
        float CDFrom = JRMCoreH.techCD(from);
        float CDTo = JRMCoreH.techCD(to);
        JRMCoreH.setCDAt(from, CDTo);
        JRMCoreH.setCDAt(to, CDFrom);
        JRMCoreH.updateOldCooldownValue(from);
        JRMCoreH.updateOldCooldownValue(to);
    }

    public static void setCDAt(byte id, float cd) {
        JRMCoreH.techniqueCooldowns[id] = cd;
    }

    public static boolean cDEnAt(byte id, float cd) {
        if (JRMCoreH.DBC() && DBCClientTickHandler.isPlayerInCreativeMode()) {
            return true;
        }
        cd *= 10.0f;
        boolean cd1 = true;
        if (techniqueCooldowns[id] == 0.0f) {
            JRMCoreH.techniqueCooldowns[id] = cd;
            JRMCoreH.updateOldCooldownValue(id);
            cd1 = true;
        }
        return cd1;
    }

    public static float curCDEnAt(byte id) {
        return JRMCoreH.techCD(id);
    }

    public static String[] tech(int id) {
        String[] tech = null;
        if (id == 0 && tech1 != null) {
            tech = tech1;
        }
        if (id == 1 && tech2 != null) {
            tech = tech2;
        }
        if (id == 2 && tech3 != null) {
            tech = tech3;
        }
        if (id == 3 && tech4 != null) {
            tech = tech4;
        }
        if (id >= 4 && id < 8 && techPM != null && JRMCoreH.techsPM(id - 4) >= 0) {
            tech = (Pwrtyp == 1 ? pmdbc : (Pwrtyp == 2 ? pmj : pmj))[JRMCoreH.techsPM(id - 4)];
        }
        return JRMCoreH.tech_conv(tech);
    }

    public static float techCD(byte id) {
        return techniqueCooldowns[id];
    }

    public static void resetCD(byte id) {
        if (techniqueCooldowns[id] > 0.0f) {
            JRMCoreH.techniqueCooldowns[id] = 0.0f;
        }
    }

    public static void updateAllOldCooldownValues() {
        for (int i = 0; i < techniqueCooldowns.length; ++i) {
            JRMCoreH.updateOldCooldownValue(i);
        }
    }

    public static void updateOldCooldownValue(int id) {
        if (id == 0) {
            curTech1CD = techniqueCooldowns[id];
        } else if (id == 1) {
            curTech2CD = techniqueCooldowns[id];
        } else if (id == 2) {
            curTech3CD = techniqueCooldowns[id];
        } else if (id == 3) {
            curTech4CD = techniqueCooldowns[id];
        } else if (id == 4) {
            curTech5CD = techniqueCooldowns[id];
        } else if (id == 5) {
            curTech6CD = techniqueCooldowns[id];
        } else if (id == 6) {
            curTech7CD = techniqueCooldowns[id];
        } else if (id == 7) {
            curTech8CD = techniqueCooldowns[id];
        }
    }

    public static int getMaxTP() {
        return 2000000000;
    }

    public static String attrNms(int g, int a) {
        return JRMCoreH.trl("jrmc", attrNms[g][a]);
    }

    public static String attrDsc(int g, int a) {
        return JRMCoreH.trl("jrmc", attrDsc[g][a]);
    }

    public static final String attrStat(int g, int a) {
        return JRMCoreH.trl("jrmc", attrStat[g][a]);
    }

    public static int attrStart(int powerType, int attribute, int race) {
        return JRMCoreH.attributeStart(powerType, attribute, race, 0);
    }

    public static int attributeStart(int powerType, int attribute, int race, int classID) {
        if (powerType == 1) {
            int[][][] attributes = JGConfigRaces.CONFIG_RACES_ATTRIBUTE_START;
            attribute = attributes[race][classID].length > attribute ? attribute : attributes[race][classID].length - 1;
            race = attributes.length > race ? race : attributes.length - 1;
            return attributes[race][classID][attribute];
        }
        int[][][] attributes = attrStart;
        attribute = attributes[powerType].length > attribute ? attribute : attributes[powerType].length - 1;
        race = attributes[powerType][attribute].length > race ? race : attributes[powerType][attribute].length - 1;
        return attributes[powerType][attribute][race];
    }

    public static float[] getStatIncreases(int powerType, int race, int classID) {
        if (powerType == 1) {
            return JGConfigRaces.CONFIG_RACES_STATS_MULTI[race][classID];
        }
        return statInc[powerType];
    }

    public static int getStatBonus(int powerType, int race, int classID, int stat, boolean classBonusOnly) {
        if (powerType == 1) {
            if (classBonusOnly) {
                return 0;
            }
            return JGConfigRaces.CONFIG_RACES_STAT_BONUS[race][classID][stat];
        }
        if (classBonusOnly) {
            return statIncBonusRaceDBC[stat][race];
        }
        return statIncBonusClass[powerType][stat][classID];
    }

    public static double regenRate(int powerType, int maxStat, float race) {
        if (powerType == 1 || powerType == 2) {
            return 1.0 + (double)maxStat * 0.01 * (double)race * 0.01;
        }
        return 1.0 + (double)maxStat * 0.02 * (double)race * 0.01;
    }

    public static String cleanUpCommas(String string) {
        return joiner.join(splitter.split((CharSequence)string));
    }

    public static int skillSlot_MindUsed() {
        int[][] sklsMR;
        String[] skls;
        String[] cSkls;
        int[][] rSklsMR = null;
        int[][] cSklsMR = null;
        if (JRMCoreH.isPowerTypeChakra()) {
            cSkls = ncCSkls;
            cSklsMR = NCRacialSkillMindCost;
            skls = NCSkillIDs;
            sklsMR = NCSkillMindCost;
            String mod = "nc";
        } else {
            rSklsMR = DBCRacialSkillMindCost;
            cSkls = vlblCSkls;
            skls = DBCSkillsIDs;
            sklsMR = DBCSkillMindCost;
            String mod = "dbc";
        }
        return JRMCoreH.skillSlot_SpentMindRequirement(PlyrSkills, skls, sklsMR) + JRMCoreH.skillSlot_SpentMindRequirement_X(PlyrSkillX, Race, rSklsMR) + JRMCoreH.skillSlot_SpentMindRequirement(PlyrSkillY, cSkls, cSklsMR);
    }

    public static int skillSlot_AvailableMindLeft() {
        return PlyrAttrbts[4] - JRMCoreH.skillSlot_MindUsed();
    }

    public static boolean skillSlot_EnoughMindLeft() {
        return JRMCoreH.canAffordSkill(PlyrAttrbts[4], JRMCoreH.skillSlot_MindUsed());
    }

    public static int skillSlot_SpentMindRequirement(String playerSkills, String[] premadeSkills, int[][] mindRequirements) {
        if (playerSkills == null || mindRequirements == null || premadeSkills == null || playerSkills == "" || playerSkills.equals("") || playerSkills.equals("pty")) {
            return 0;
        }
        return JRMCoreH.skillSlot_SpentMindRequirement(new String[]{playerSkills}, premadeSkills, mindRequirements, false);
    }

    public static int skillSlot_SpentMindRequirement(String[] playerSkills, String[] premadeSkills, int[][] mindRequirements) {
        return JRMCoreH.skillSlot_SpentMindRequirement(playerSkills, premadeSkills, mindRequirements, true);
    }

    public static int skillSlot_SpentMindRequirement(String[] playerSkills, String[] premadeSkills, int[][] mindRequirements, boolean granted) {
        int z = granted ? 1 : 0;
        int haveSkillLvls = 0;
        for (int i = 0; i < playerSkills.length; i = (int)((byte)(i + 1))) {
            if (playerSkills[i].length() <= 2) continue;
            int l = Integer.parseInt(playerSkills[i].substring(2)) + z;
            for (int j = 0; j < l; ++j) {
                haveSkillLvls += JRMCoreH.skillMindRequirement(playerSkills[i].substring(0, 2) + j, premadeSkills, mindRequirements, granted);
            }
        }
        return haveSkillLvls;
    }

    public static int skillSlot_SpentMindRequirement_X(String playerRacialSkill, int skills, int[][] mindRequirements) {
        if (playerRacialSkill == null || mindRequirements == null || playerRacialSkill == "" || playerRacialSkill.equals("") || playerRacialSkill.equals("pty")) {
            return 0;
        }
        int haveSkillLvls = 0;
        if (playerRacialSkill.length() > 2) {
            int racialSkillLevel = Integer.parseInt(playerRacialSkill.substring(2));
            for (int j = 0; j <= racialSkillLevel; ++j) {
                haveSkillLvls += JRMCoreH.skillMindRequirement_X(playerRacialSkill.substring(0, 2) + j, skills, mindRequirements, true);
            }
        }
        return haveSkillLvls;
    }

    public static int skillMindRequirement(String skill2, String[] skills, int[][] mindRequirements) {
        return JRMCoreH.skillMindRequirement(skill2, skills, mindRequirements, false);
    }

    public static int skillMindRequirement(String skill2, String[] skills, int[][] mindRequirements, boolean granted) {
        for (int i = 0; i < skills.length; i = (int)((byte)(i + 1))) {
            if (!skill2.contains(skills[i])) continue;
            int z = !granted ? 1 : 0;
            int lvl = skill2.length() > 2 ? Integer.parseInt(skill2.substring(2)) + z : 0;
            int a = JRMCoreH.SklID(skill2, skills);
            if (a < 0) break;
            int[] mindRequirement = mindRequirements[a];
            float f = mindRequirement.length - 1 > -1 ? (float)(mindRequirement.length > lvl ? mindRequirement[lvl] : mindRequirement[mindRequirement.length - 1]) : 1.0f;
            float x = f * JGConfigSkills.GlobalSkillMindMultiplier * (lvl == 0 ? JGConfigSkills.GlobalSkillMindMultiplierFirst : 1.0f) * (float)(JGConfigSkills.GlobalSkillMindMultiplierWithLevel ? lvl + 1 : 1);
            return (int)(x < (float)z ? (float)z : x);
        }
        return 0;
    }

    public static int skillMindRequirement_X(String playerRacialSkill, int race, int[][] mindRequirements) {
        return JRMCoreH.skillMindRequirement_X(playerRacialSkill, race, mindRequirements, false);
    }

    public static int skillMindRequirement_X(String playerRacialSkill, int race, int[][] mindRequirements, boolean granted) {
        if (playerRacialSkill.length() > 1) {
            int lvl;
            int z = !granted ? 1 : 0;
            int n = lvl = playerRacialSkill.length() > 2 ? Integer.parseInt(playerRacialSkill.substring(2)) + z : 0;
            if (race >= 0) {
                int[] mindRequirement = mindRequirements[race];
                if (lvl == 0) {
                    return 0;
                }
                float f = mindRequirement.length > --lvl ? mindRequirement[lvl] : mindRequirement[mindRequirement.length - 1];
                float x = f * JGConfigSkills.GlobalSkillMindMultiplier * (lvl == 0 ? JGConfigSkills.GlobalSkillMindMultiplierFirst : 1.0f) * (float)(JGConfigSkills.GlobalSkillMindMultiplierWithLevel ? lvl + 1 : 1);
                return (int)(x < (float)z ? (float)z : x);
            }
        }
        return 0;
    }

    public static int skillTPCost(String skill2, String[] skills, int[][] tpCosts) {
        return JRMCoreH.skillTPCost(skill2, skills, tpCosts, false);
    }

    public static int skillTPCost(String skill2, String[] skills, int[][] tpCosts, boolean granted) {
        for (int i = 0; i < skills.length; i = (int)((byte)(i + 1))) {
            if (!skill2.contains(skills[i])) continue;
            int z = !granted ? 1 : 0;
            int lvl = skill2.length() > 2 ? Integer.parseInt(skill2.substring(2)) + z : 0;
            int a = JRMCoreH.SklID(skill2, skills);
            if (a < 0) break;
            int[] tpCost = tpCosts[a];
            float f = tpCost.length - 1 > -1 ? (float)(tpCost.length > lvl ? tpCost[lvl] : tpCost[tpCost.length - 1]) : 1.0f;
            float x = f * JGConfigSkills.GlobalSkillTPMultiplier * (lvl == 0 ? JGConfigSkills.GlobalSkillTPMultiplierFirst : 1.0f) * (float)(JGConfigSkills.GlobalSkillTPMultiplierWithLevel ? lvl + 1 : 1);
            return (int)(x < -1.0f ? -1.0f : x);
        }
        return 0;
    }

    public static int skillTPCost_X(String playerRacialSkill, int race, int[][] tpCosts) {
        return JRMCoreH.skillTPCost_X(playerRacialSkill, race, tpCosts, false);
    }

    public static int skillTPCost_X(String playerRacialSkill, int race, int[][] tpCosts, boolean granted) {
        if (playerRacialSkill.length() > 1) {
            int lvl;
            int z = !granted ? 1 : 0;
            int n = lvl = playerRacialSkill.length() > 2 ? Integer.parseInt(playerRacialSkill.substring(2)) + z : 0;
            if (race >= 0) {
                int[] tpCost = tpCosts[race];
                if (lvl == 0) {
                    return 0;
                }
                float f = tpCost.length > --lvl ? tpCost[lvl] : tpCost[tpCost.length - 1];
                float x = f * JGConfigSkills.GlobalSkillTPMultiplier * (lvl == 0 ? JGConfigSkills.GlobalSkillTPMultiplierFirst : 1.0f) * (float)(JGConfigSkills.GlobalSkillTPMultiplierWithLevel ? lvl + 1 : 1);
                return (int)(x < -1.0f ? -1.0f : x);
            }
        }
        return 0;
    }

    public static int getSkillTPCost(int skillID, int lvl, boolean dbc) {
        return dbc ? JRMCoreH.getDBCSkillTPCost(skillID, lvl) : JRMCoreH.getNCSkillTPCost(skillID, lvl);
    }

    public static int getDBCSkillTPCost(int skillID, int lvl) {
        return (int)((float)DBCSkillTPCost[skillID][lvl] * JGConfigSkills.GlobalSkillTPMultiplier * (lvl == 0 ? JGConfigSkills.GlobalSkillTPMultiplierFirst : 1.0f) * (float)(JGConfigSkills.GlobalSkillTPMultiplierWithLevel ? lvl + 1 : 1));
    }

    public static int getNCSkillTPCost(int skillID, int lvl) {
        return (int)((float)NCSkillTPCost[skillID][lvl] * JGConfigSkills.GlobalSkillTPMultiplier * (lvl == 0 ? JGConfigSkills.GlobalSkillTPMultiplierFirst : 1.0f) * (float)(JGConfigSkills.GlobalSkillTPMultiplierWithLevel ? lvl + 1 : 1));
    }

    public static int getSkillMindCost(int skillID, int lvl, boolean dbc) {
        return dbc ? JRMCoreH.getDBCSkillMindCost(skillID, lvl) : JRMCoreH.getNCSkillMindCost(skillID, lvl);
    }

    public static int getDBCSkillMindCost(int skillID, int lvl) {
        return (int)((float)DBCSkillMindCost[skillID][lvl] * JGConfigSkills.GlobalSkillMindMultiplier * (lvl == 0 ? JGConfigSkills.GlobalSkillMindMultiplierFirst : 1.0f) * (float)(JGConfigSkills.GlobalSkillMindMultiplierWithLevel ? lvl + 1 : 1));
    }

    public static int getNCSkillMindCost(int skillID, int lvl) {
        return (int)((float)NCSkillMindCost[skillID][lvl] * JGConfigSkills.GlobalSkillMindMultiplier * (lvl == 0 ? JGConfigSkills.GlobalSkillMindMultiplierFirst : 1.0f) * (float)(JGConfigSkills.GlobalSkillMindMultiplierWithLevel ? lvl + 1 : 1));
    }

    public static boolean skillSlots(int mindRequirement, int haveSkillLvls) {
        return JRMCoreH.canAffordSkill(mindRequirement, haveSkillLvls);
    }

    public static boolean canAffordSkill(int mindAttribute, int haveSkillLvls) {
        return mindAttribute >= haveSkillLvls;
    }

    public static HashMap<Integer, Long> attrCstH() {
        HashMap<Integer, Long> attrCstH = new HashMap<Integer, Long>();
        long res = 1L;
        for (int i = 0; i <= 6000000; ++i) {
            attrCstH.put(i, res += (long)JRMCoreH.attrCst(i));
        }
        long res2 = 0L;
        for (int i = 0; i < 60; ++i) {
            res2 += (long)JRMCoreH.attrCst(i);
        }
        attrCstH.put(-1, res2);
        return attrCstH;
    }

    public static int attrCstO(int att) {
        int am = (int)((double)att * JRMCoreConfig.atcm);
        int dec = JRMCoreConfig.AttributeUpgradeCost_StartMinus - att < 0 ? 0 : JRMCoreConfig.AttributeUpgradeCost_StartMinus - att;
        int c = am - dec;
        return c < JRMCoreConfig.AttributeUpgradeCost_Min ? JRMCoreConfig.AttributeUpgradeCost_Min : (c > JRMCoreH.getMaxTP() ? JRMCoreH.getMaxTP() : c);
    }

    public static long attrCstE(int att) {
        Long l;
        if (att > 6000000) {
            att = 6000000;
        }
        if (attrCstH != null) {
            l = attrCstH.get(att);
        } else {
            attrCstH = JRMCoreH.attrCstH();
            l = attrCstH.get(att);
        }
        return l;
    }

    public static long attrCstEP(int att) {
        long l;
        if (att > 6000000) {
            att = 6000000;
        }
        if (attrCstH != null) {
            l = attrCstH.get(att) - attrCstH.get(-1);
        } else {
            attrCstH = JRMCoreH.attrCstH();
            l = attrCstH.get(att) - attrCstH.get(-1);
        }
        return l;
    }

    public static int am(int id) {
        return JRMCoreH.attributeMultiplier(id);
    }

    public static int attributeMultiplier(int id) {
        switch (id) {
            case 0: {
                return 1;
            }
            case 1: {
                return 10;
            }
            case 2: {
                return 100;
            }
            case 3: {
                return 1000;
            }
        }
        return 1;
    }

    public static int attrCst(int att, int count) {
        int attributes = att;
        if (attributes >= JRMCoreH.getMaxTP() || attributes <= 0) {
            if (count == 0) {
                return JRMCoreH.getMaxTP();
            }
            return 0;
        }
        int attributeCost = 0;
        int attributeMultiplier = JRMCoreH.attributeMultiplier(count);
        for (int j = 0; j < attributeMultiplier; ++j) {
            int ac = JRMCoreH.attrCst(attributes++);
            attributeCost += ac;
            if (ac != 0) continue;
            return 0;
        }
        if (attributeCost <= 0) {
            return 0;
        }
        if (attributeCost > JRMCoreH.getMaxTP()) {
            return 0;
        }
        return attributeCost;
    }

    public static int attrCst(int att) {
        if (JRMCoreH.checkLimit() * 6 <= att) {
            return 0;
        }
        int am = (int)((double)att * JRMCoreConfig.atcm);
        int dec = JRMCoreConfig.AttributeUpgradeCost_StartMinus - att < 0 ? 0 : JRMCoreConfig.AttributeUpgradeCost_StartMinus - att;
        int c = am - dec;
        int a = c < JRMCoreConfig.AttributeUpgradeCost_Min ? JRMCoreConfig.AttributeUpgradeCost_Min : (c > JRMCoreH.getMaxTP() ? JRMCoreH.getMaxTP() : c);
        return a;
    }

    public static boolean acm(int[] attrbts) {
        int att = attrbts[0] + attrbts[1] + attrbts[2] + attrbts[3] + attrbts[4] + attrbts[5];
        return JRMCoreConfig.tmx * 6 <= att;
    }

    public static int attrCst(int[] attrbts, int count) {
        int att = JRMCoreH.attributeCostAboveLimit(attrbts);
        return JRMCoreH.attrCst(att, count);
    }

    public static int attributeCostAboveLimit(int[] attributes) {
        float result = 0.0f;
        for (int i = 0; i < 6; ++i) {
            float attribute;
            if (!(JRMCoreConfig.AttributeUpgradeCost_AttributeMulti[i] > 0.0f) || !((result += (attribute = (float)attributes[i] * JRMCoreConfig.AttributeUpgradeCost_AttributeMulti[i])) >= (float)JRMCoreH.getMaxTP()) && !(result <= 0.0f)) continue;
            return JRMCoreH.getMaxTP();
        }
        return (int)result;
    }

    public static int getPlayerLevel(int[] playerAttributes) {
        return JRMCoreH.getPlayerLevel(playerAttributes[0] + playerAttributes[1] + playerAttributes[2] + playerAttributes[3] + playerAttributes[4] + playerAttributes[5]);
    }

    public static int attrLvl(int[] PlyrAttrbts) {
        return JRMCoreH.getPlayerLevel(PlyrAttrbts);
    }

    public static int getPlayerLevel(int all) {
        int i = all / 5 - 11;
        return i < 0 ? 0 : i;
    }

    public static int attrLvl(int all) {
        return JRMCoreH.getPlayerLevel(all);
    }

    public static int attrLvlNext(int[] PlyrAttrbts) {
        int all = PlyrAttrbts[0] + PlyrAttrbts[1] + PlyrAttrbts[2] + PlyrAttrbts[3] + PlyrAttrbts[4] + PlyrAttrbts[5];
        return 5 - (all - all / 5 * 5);
    }

    public static float spdFrm(int a, int s, float r, boolean t, boolean i, int st, int st2, float aa) {
        float prc = 0.5f + (t ? 0.5f : 0.0f) + (0.075f * (float)s + (float)(a / JRMCoreH.checkLimit()) + (float)st * 0.02f + (float)st2 * 0.1f + 0.5f) * (r * 0.01f);
        return prc * aa;
    }

    public static String[] cl(int pwr) {
        String[] cl = PwrtypAllow[pwr].contains("DBC") ? ClassesDBC : (PwrtypAllow[pwr].contains("NC") ? Clans : Classes);
        return cl;
    }

    public static int statMindC() {
        double mind = PlyrAttrbts[4];
        return (int)mind;
    }

    public static String getBonusAttributes(String player, int attributeID) {
        if (plyrs != null) {
            if (player == null || player.length() == 0) {
                player = mod_JRMCore.proxy.getPlayerClient().getCommandSenderName();
            }
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (plyrs[pl] == null || !plyrs[pl].equals(player)) continue;
                if (dat31 == null || dat31.length <= pl || dat31[pl].split("\\=").length != 6) break;
                return dat31[pl].split("\\=")[attributeID];
            }
        }
        return "";
    }

    public static String getBonusAttributes(int attributeID) {
        return JRMCoreH.getBonusAttributes(null, attributeID);
    }

    public static int stat(Entity player, int attributeID, int powerType, int stat, int attribute, int race, int classID, float skillBonus) {
        float[] attributes = JRMCoreH.getStatIncreases(powerType, race, classID);
        stat = attributes.length > stat ? stat : attributes.length - 1;
        double bs = attributes[stat] * (float)attribute;
        int value = (int)JRMCoreH.round(bs + (double)JRMCoreH.getStatBonus(powerType, race, classID, stat, false) * 0.01 * bs + (double)JRMCoreH.getStatBonus(powerType, race, classID, stat, true) * 0.01 * bs + bs * (double)skillBonus, 0, 0);
        if (JRMCoreConfig.JRMCABonusOn && attributeID > -1 && attributeID <= 5 && player instanceof EntityPlayer) {
            String nbtValue = "NONE";
            if (!player.worldObj.isRemote) {
                NBTTagCompound nbt = JRMCoreH.nbt((Entity)((EntityPlayer)player), "pres");
                nbtValue = nbt.getString("jrmcAttrBonus" + ComJrmcaBonus.ATTRIBUTES_SHORT[attributeID]);
            } else {
                nbtValue = JRMCoreH.getBonusAttributes(player.getCommandSenderName(), attributeID);
            }
            if (!nbtValue.equals("NONE") && !nbtValue.equals("n")) {
                double bonusValueResult = value;
                String[] bonus = nbtValue.split("\\|");
                String[][] bonusValues = new String[bonus.length][2];
                if (bonus.length > 0 && bonus[0].length() > 0) {
                    for (int i = 0; i < bonus.length; ++i) {
                        if (bonus[i].length() <= 1) continue;
                        String[] bonusValue = bonus[i].split("\\;");
                        bonusValues[i][1] = bonusValue[1];
                        try {
                            double value2 = Double.parseDouble(bonusValues[i][1].substring(1));
                            bonusValueResult = JGMathHelper.StringMethod(bonusValues[i][1].substring(0, 1), bonusValueResult, value2);
                            continue;
                        }
                        catch (Exception e) {
                            double d = 1.0;
                        }
                    }
                }
                value = (int)bonusValueResult;
            }
        }
        if (powerType == 1 && attributeID > -1 && attributeID <= 5) {
            double multiplier = JGConfigRaces.CONFIG_RACES_ATTRIBUTE_MULTI[race][classID][attributeID];
            value = (int)((double)value * multiplier);
        }
        return value;
    }

    public static int stat(int attributeID, int g, int s, int a, int r, int c, float b) {
        return JRMCoreH.stat(null, attributeID, g, s, a, r, c, b);
    }

    public static int stat(int g, int s, int a, int r, int c, float b) {
        return JRMCoreH.stat(-1, g, s, a, r, c, b);
    }

    public static int stat(int attributeID, EntityPlayer en, int s, int a, float b) {
        byte g = JRMCoreH.getByte(en, P);
        byte r = JRMCoreH.getByte(en, R);
        byte c = JRMCoreH.getByte(en, Cl);
        return JRMCoreH.stat(attributeID, g, s, a, r, c, b);
    }

    public static int stat(EntityPlayer en, int s, int a, float b) {
        byte g = JRMCoreH.getByte(en, P);
        byte r = JRMCoreH.getByte(en, R);
        byte c = JRMCoreH.getByte(en, Cl);
        return JRMCoreH.stat(g, s, a, r, c, b);
    }

    public static float statInc(int powerType, int stat, int attribute, int race, int classID, float skillBonus) {
        float[] attributes = JRMCoreH.getStatIncreases(powerType, race, classID);
        stat = attributes.length > stat ? stat : attributes.length - 1;
        float bs = attributes[stat] * (float)attribute;
        return JRMCoreH.round(bs + (float)JRMCoreH.getStatBonus(powerType, race, classID, stat, false) * 0.01f * bs + (float)JRMCoreH.getStatBonus(powerType, race, classID, stat, true) * 0.01f * bs + bs * skillBonus, 1, 1);
    }

    public static String algnCur(byte align) {
        String c = "";
        if (align > 66) {
            c = clbe;
        }
        if (align <= 66 && align >= 33) {
            c = cldp;
        }
        if (align < 33) {
            c = cldr;
        }
        return JRMCoreH.trl(c + AlgnmntNms[JRMCoreH.Algnmnt(align)]);
    }

    public static void sao_addlevel(int addlvl, EntityPlayer p) {
        int curexp = JRMCoreH.getInt(p, SAO_EXP);
        int curlvl = JRMCoreH.getInt(p, SAO_LVL);
        curlvl = curlvl < 1 ? 1 : curlvl;
        int curap = JRMCoreH.getInt(p, SAO_AP);
        int lvltoreach = curlvl + addlvl;
        boolean b = true;
        while (b) {
            if (lvltoreach > curlvl + addlvl) {
                ++curlvl;
                curap += 3;
                curexp = 0;
                continue;
            }
            b = false;
            break;
        }
        JRMCoreH.setInt(curexp, p, SAO_EXP);
        JRMCoreH.setInt(curlvl, p, SAO_LVL);
        JRMCoreH.setInt(curap, p, SAO_AP);
    }

    public static void sao_expgain(int expgained, EntityPlayer p) {
        int curexp = JRMCoreH.getInt(p, SAO_EXP);
        int curlvl = JRMCoreH.getInt(p, SAO_LVL);
        curlvl = curlvl < 1 ? 1 : curlvl;
        int curap = JRMCoreH.getInt(p, SAO_AP);
        boolean b = true;
        while (b && curlvl < 255) {
            int expneed = JRMCoreH.SAOexpNeeded(curlvl, curexp);
            if (expgained >= expneed) {
                expgained -= expneed;
                curap += 3;
                curexp = 0;
                p.addChatMessage(new ChatComponentText("Congratulations!! LV UP! " + (++curlvl - 1) + " > " + curlvl).setChatStyle(JRMCoreEH.color));
                continue;
            }
            curexp += expgained;
            b = false;
            break;
        }
        if (curlvl >= 255) {
            p.addChatMessage(new ChatComponentText("Congratulations!! You Reached Max Level!").setChatStyle(JRMCoreEH.color));
        }
        JRMCoreH.setInt(curexp, p, SAO_EXP);
        JRMCoreH.setInt(curlvl, p, SAO_LVL);
        JRMCoreH.setInt(curap, p, SAO_AP);
    }

    public static void sao_colgain(int colgained, EntityPlayer p) {
        int curcol = JRMCoreH.getInt(p, SAO_COL);
        JRMCoreH.setInt(curcol + colgained, p, SAO_COL);
    }

    public static int SAOCExpForLvl(int lvl) {
        return (int)(Math.pow(lvl, 2.0) * 20.0);
    }

    public static int SAOmaxExpGain(int lvl) {
        return 18 * lvl;
    }

    public static int SAOmaxColGain(int lvl) {
        return 15 * lvl;
    }

    public static int SAOexpNeeded(int lvl, int exp) {
        return JRMCoreH.SAOCExpForLvl(lvl) - exp;
    }

    public static int SAOCSklSlt(int lvl) {
        return 2 + (lvl > 5 ? 1 : 0) + (lvl > 19 ? lvl / 10 - 1 : 0);
    }

    public static int SAOSklMastery(String sklName, String[] sao_skillSlot) {
        int m = 0;
        for (int i = 0; i < sao_skillSlot.length; ++i) {
            if (!sao_skillSlot[i].contains(sklName)) continue;
            String[] skl = sao_skillSlot[i].split(":");
            m = Integer.parseInt(skl[2]);
        }
        return m;
    }

    public static int SAOSklLvl(String sklName, String[] sao_skillSlot) {
        int m = 0;
        for (int i = 0; i < sao_skillSlot.length; ++i) {
            if (!sao_skillSlot[i].contains(sklName)) continue;
            String[] skl = sao_skillSlot[i].split(":");
            m = Integer.parseInt(skl[1]);
        }
        return m;
    }

    public static String TrnngOptnsNam(int i) {
        return JRMCoreH.trl("jrmc", TrnngOptns[i]);
    }

    public static String TrnngOptnsDesc(int i) {
        return JRMCoreH.trl("jrmc", TrnngOptns[i] + "Desc");
    }

    public static String TeleportSound(int p) {
        return p == 1 ? "jinryuudragonbc:DBC2.tp" : (p == 2 ? "jinryuunarutoc:NC1.bunshin" : "");
    }

    public static boolean HairsT(int s, String t) {
        return HairsT[s].equals(t);
    }

    public static boolean HairsT(int s, int s2) {
        return HairsT[s].equals(HairsT[s2]);
    }

    public static boolean Allow(String allow) {
        return allow.contains("All") || allow.contains("DBC") && JRMCoreH.DBC() || allow.contains("HHC") && JRMCoreH.HHC() || allow.contains("JRFC") && JRMCoreH.JFC() || allow.contains("NC") && JRMCoreH.NC() || allow.contains("JYC") && JRMCoreH.JYC() || allow.contains("JBRA") && JRMCoreH.JBRA() || allow.contains("SAOC") && JRMCoreH.SAOC() || allow.contains("RoNC") && JRMCoreH.RoNC();
    }

    public static void mld() {
        if (modsS == null) {
            modsS = new HashMap();
            modsS.put(tjdbc, JRMCoreH.DBC());
            modsS.put(tjnc, JRMCoreH.NC());
            modsS.put(tjfc, JRMCoreH.JFC());
            modsS.put(tjyc, JRMCoreH.JYC());
            modsS.put(tjsaoc, JRMCoreH.SAOC());
            modsS.put(tjbc, JRMCoreH.BC());
            modsC = modsS;
        }
    }

    public static boolean iml(String tj) {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT) {
            if (modsC != null) {
                return modsC.get(tj);
            }
            return Loader.isModLoaded((String)tj);
        }
        return Loader.isModLoaded((String)tj);
    }

    public static boolean DBC() {
        return JRMCoreH.iml(tjdbc);
    }

    public static boolean NC() {
        return JRMCoreH.iml(tjnc);
    }

    public static boolean JFC() {
        return JRMCoreH.iml(tjfc);
    }

    public static boolean JYC() {
        return JRMCoreH.iml(tjyc);
    }

    public static boolean JBRA() {
        return Loader.isModLoaded((String)"jinryuubetterrenderaddon");
    }

    public static boolean HHC() {
        return Loader.isModLoaded((String)"jinryuuhalfbreedhumanc");
    }

    public static boolean JHDSE() {
        return Loader.isModLoaded((String)"jinryuu_hdskins_extended");
    }

    public static boolean RoNC() {
        return Loader.isModLoaded((String)"aoiandjinryuuronc");
    }

    public static boolean SAOC() {
        return JRMCoreH.iml(tjsaoc);
    }

    public static boolean BC() {
        return JRMCoreH.iml(tjbc);
    }

    public static String Vers(String id) {
        String c = "";
        for (ModContainer mod : Loader.instance().getModList()) {
            if (!mod.getModId().equals(id)) continue;
            c = mod.getVersion();
            break;
        }
        return c;
    }

    public static String Nams(String id) {
        String c = "";
        if (id.equals("jinryuujrmcore")) {
            c = "JinRyuu's JRMCore";
        }
        if (id.equals("jinryuudragonblockc")) {
            c = JRMCoreH.DragonBCmodName();
        }
        if (id.equals("jinryuunarutoc")) {
            c = JRMCoreH.NarutoCmodName();
        }
        if (id.equals("jinryuufamilyc")) {
            c = JRMCoreH.FamilyCmodName();
        }
        if (id.equals("jinryuujyearsc")) {
            c = JRMCoreH.JYearsCmodName();
        }
        if (id.equals("jinryuubetterrenderaddon")) {
            c = JRMCoreH.JBRAmodName();
        }
        if (id.equals("jinryuuhdskinsextended")) {
            c = JRMCoreH.JHDSkinsmodName();
        }
        if (id.equals("aoiandjinryuuronc")) {
            c = JRMCoreH.RoNCmodName();
        }
        if (id.equals("jinryuusaoc")) {
            c = JRMCoreH.SAOCmodName();
        }
        if (id.equals("jinryuubleachc")) {
            c = JRMCoreH.BCmodName();
        }
        return c;
    }

    public static final String DragonBCmodName() {
        return "Dragon Block C";
    }

    public static final String NarutoCmodName() {
        return "Naruto C";
    }

    public static final String FamilyCmodName() {
        return "JinRyuu's Family C";
    }

    public static final String JYearsCmodName() {
        return "JinRyuu's JYears C";
    }

    public static final String JBRAmodName() {
        return "JinRyuu's Better Render Addon";
    }

    public static final String JHDSkinsmodName() {
        return "JinRyuu's HD Skins";
    }

    public static final String RoNCmodName() {
        return "Rise of Nature C";
    }

    public static final String SAOCmodName() {
        return "Sword Art Online C";
    }

    public static final String BCmodName() {
        return "JinRyuu's Bleach C";
    }

    public static final String DragonBCmodVer() {
        return "1.4.85";
    }

    public static final String NarutoCmodVer() {
        return "0.7.18";
    }

    public static final String FamilyCmodVer() {
        return "1.2.18";
    }

    public static final String JYearsCmodVer() {
        return "1.2.5";
    }

    public static final String JBRAmodVer() {
        return "1.6.52";
    }

    public static final String JHDSkinsmodVer() {
        return "1.3.1";
    }

    public static final String SAOCmodVer() {
        return "0.0.6";
    }

    public static String format_leadingZero(int l, Object ... args) {
        return String.format("%0" + l + "d", args);
    }

    public static String format_lz2(Object ... args) {
        return String.format("%02d", args);
    }

    public static String format_remTim(int t) {
        int s = t / 1 % 60;
        int m = t / 60 % 60 + 1;
        int h = t / 3600 % 24 + 1;
        int d = t / 86400 + 1;
        if (t < 60) {
            return s + "s";
        }
        if (t < 3600) {
            return m + "m";
        }
        if (t < 86400) {
            return h + "h";
        }
        if (t < 86400) {
            return d + "d";
        }
        return "";
    }

    public static float round(float d, int decimalPlace) {
        return JRMCoreH.round(d, decimalPlace, 4);
    }

    public static float round(float d, int decimalPlace, int rm) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, rm);
        return bd.floatValue();
    }

    public static double round(double d, int decimalPlace) {
        return JRMCoreH.round(d, decimalPlace, 4);
    }

    public static double round(double d, int decimalPlace, int rm) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(decimalPlace, rm);
        return bd.doubleValue();
    }

    public static String[] jfcPDat(String i) {
        String[] s = null;
        if (plyrs != null && jfcData0 != null) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(i)) continue;
                s = jfcData0[pl].toString().split(";");
                break;
            }
        }
        return s;
    }

    public static int jrmcPDta1(String i, int a) {
        int g = 0;
        if (plyrs != null && data1 != null) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(i)) continue;
                String[] s = data1[pl].split(";");
                g = Integer.parseInt(s[a]);
                break;
            }
        }
        return g;
    }

    public static String jrmcPDtaDNS(String i) {
        if (plyrs != null && data1 != null) {
            for (int pl = 0; pl < plyrs.length; ++pl) {
                if (!plyrs[pl].equals(i)) continue;
                String s = data1[pl].split(";")[1];
                return s;
            }
        }
        return null;
    }

    public static void configToClient(MinecraftServer server) {
        if (JRMCoreConfig.playerCount != server.getCurrentPlayerCount()) {
            PD.sendToAll(new JRMCorePTrib());
            JRMCoreConfig.playerCount = server.getCurrentPlayerCount();
        }
    }

    public static void configToClient(ByteBuf b) {
        int j;
        int i;
        int j2;
        int count;
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson(modsS));
        b.writeBoolean(JRMCoreComTickH.tna3fu);
        if (JRMCoreH.DBC()) {
            b.writeInt(JRMCoreHDBC.DBCgetConfigcmaxTrnExp());
            b.writeBoolean(JRMCoreHDBC.DBCgetConfigcplntVegeta());
            b.writeBoolean(JRMCoreHDBC.DBCgetConfigcflyAnyLvl());
            b.writeBoolean(JRMCoreHDBC.DBCgetConfigcDeathSystemOff());
            b.writeBoolean(JRMCoreHDBC.DBCgetConfigcDBSpawnEnabled());
            ByteBufUtils.writeUTF8String((ByteBuf)b, (String)JRMCoreHDBC.DBCgetConfigcDBSpawnTime());
            b.writeBoolean(JRMCoreHDBC.DBCgetConfigcSagaSystemOn());
            b.writeBoolean(JRMCoreHDBC.DBCgetConfigcSagaSysSpawnPods());
            b.writeInt(JRMCoreHDBC.DBCgetConfigcsenzuCool());
            b.writeFloat(JRMCoreHDBC.DBCgetConfigcReinc());
            b.writeBoolean(JRMCoreHDBC.DBCgetConfigcGodform());
            b.writeBoolean(JRMCoreHDBC.FreeRevC());
            b.writeInt(JRMCoreHDBC.DBCgetConfigcTechExpNeed());
            b.writeInt(JRMCoreHDBC.DBCgetConfigcTechCostMod());
        }
        if (JRMCoreH.JYC()) {
            b.writeInt(JRMCoreHJYC.JYCgetConfigcpgut());
        }
        if (JRMCoreH.JFC()) {
            b.writeInt(JRMCoreHJFC.getConfigcpt());
        }
        if (JRMCoreH.NC()) {
            ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)cNCRacialSkillTPCost));
            ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)cNCSkillTPCost));
            ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransGtsDmgO));
        }
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)cDBCRacialSkillTPCost));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)cDBCSkillTPCost));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransKaiDmgO));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransKaiDrainOLevel));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransKaiDrainORace));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransMngDmgO));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransKaiNmsO));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransSaiStBnPO));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransHalfSaiStBnPO));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransFrStBnPO));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransHmStBnPO));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransNaStBnPO));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)TransMaStBnPO));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)cDBCRacialSkillMindCost));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)cDBCSkillMindCost));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)cNCRacialSkillMindCost));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)cNCSkillMindCost));
        b.writeBoolean(JRMCoreConfig.OverAtrLimitO);
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)JRMCoreConfig.cMysticDamMulti));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)JRMCoreConfig.cArcosianPPMax));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)JRMCoreConfig.cArcosianPPGrowth));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)JRMCoreConfig.cArcosianPPCost));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)JRMCoreConfig.cArcosianPPDamMulti));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)JRMCoreConfig.cArcosianPPDamMultiPoint));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)JRMCoreConfig.cAttibuteBonusPerRacialSkill));
        b.writeInt(JRMCoreConfig.cArcosianPPDamMultiHighest);
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)JRMCoreConfig.cTPGainRateRace));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)new Gson().toJson((Object)JRMCoreConfig.cTPGainRace));
        b.writeBoolean(JRMCoreConfig.cexpGriOff);
        b.writeInt(JRMCoreConfig.cSklMedCat);
        b.writeFloat(JRMCoreConfig.cSklMedRate);
        b.writeBoolean(JRMCoreConfig.creleaseStop);
        b.writeBoolean(JRMCoreConfig.cregen);
        b.writeBoolean(JRMCoreConfig.crelease);
        b.writeInt(JRMCoreConfig.ctpgn);
        b.writeInt(JRMCoreH.etXq4V(JRMCoreConfig.ctmx));
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)JRMCoreConfig.cregenRate);
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)JRMCoreConfig.chRegenRate);
        b.writeBoolean(JRMCoreConfig.csizes);
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)JRMCoreConfig.cssurl);
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)JRMCoreConfig.cssurl2);
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)JRMCoreConfig.cssc);
        b.writeBoolean(JRMCoreConfig.csfzns);
        b.writeBoolean(JRMCoreConfig.cNPCSpawnCheck);
        b.writeBoolean(JRMCoreConfig.cBuildingSpawnCheck);
        b.writeInt(JRMCoreConfig.cbuildingSpawnAreaSize);
        b.writeBoolean(JGConfigMiniGameConcentration.cTPGainOn);
        b.writeFloat(JGConfigMiniGameConcentration.cTPlimitIncreasesWithPlayerLevel);
        b.writeFloat(JGConfigMiniGameConcentration.cTPMultiplier);
        b.writeInt(JGConfigMiniGameConcentration.cTPDailyLimit);
        b.writeFloat(JGConfigMiniGameConcentration.cComboTimer);
        b.writeBoolean(JGConfigMiniGameConcentration.cConstantClickOn);
        b.writeInt(JGConfigMiniGameConcentration.cRandomMovementSpeed);
        b.writeBoolean(JGConfigMiniGameAirBoxing.cTPGainOn);
        b.writeFloat(JGConfigMiniGameAirBoxing.cTPlimitIncreasesWithPlayerLevel);
        b.writeFloat(JGConfigMiniGameAirBoxing.cTPMultiplier);
        b.writeInt(JGConfigMiniGameAirBoxing.cTPDailyLimit);
        b.writeInt(JGConfigMiniGameAirBoxing.cStartLife);
        for (int i2 = 0; i2 < 4; ++i2) {
            b.writeFloat(JGConfigMiniGameAirBoxing.cKeySpawnSpeed[i2]);
            b.writeFloat(JGConfigMiniGameAirBoxing.cKeySpeed[i2]);
            b.writeInt(JGConfigMiniGameAirBoxing.cKeyLifeTaken[i2]);
            count = JGConfigMiniGameAirBoxing.cKeyTypeIDs[i2].length;
            b.writeInt(count);
            for (j2 = 0; j2 < count; ++j2) {
                b.writeInt(JGConfigMiniGameAirBoxing.cKeyTypeIDs[i2][j2]);
            }
        }
        b.writeInt(JRMCoreConfig.cStatPasDef);
        b.writeInt(JRMCoreConfig.cmjn);
        b.writeDouble(JRMCoreConfig.catcm);
        b.writeInt(JRMCoreConfig.cAttributeUpgradeCost_StartMinus);
        b.writeInt(JRMCoreConfig.cAttributeUpgradeCost_Min);
        float[] i2 = JRMCoreConfig.cAttributeUpgradeCost_AttributeMulti;
        count = i2.length;
        for (j2 = 0; j2 < count; ++j2) {
            double d = i2[j2];
            b.writeDouble(d);
        }
        b.writeInt(JRMCoreConfig.clgnd);
        ByteBufUtils.writeUTF8String((ByteBuf)b, (String)JRMCoreConfig.clgndb);
        b.writeBoolean(JRMCoreConfig.clockon);
        b.writeDouble(JRMCoreConfig.cFlngspd);
        if (JRMCoreH.DBC()) {
            String s = "";
            for (i = 0; i < JRMCoreConfig.cdat5695.length; ++i) {
                s = s + JRMCoreConfig.cdat5695[i];
                if (i + 1 >= JRMCoreConfig.cdat5695.length) continue;
                s = s + " ";
            }
            ByteBufUtils.writeUTF8String((ByteBuf)b, (String)s);
            s = "";
            for (i = 0; i < JRMCoreConfig.cdat5696.length; ++i) {
                for (j2 = 0; j2 < JRMCoreConfig.cdat5696[j2].length; ++j2) {
                    s = s + JRMCoreConfig.cdat5696[i][j2];
                    if (j2 + 1 >= JRMCoreConfig.cdat5696.length) continue;
                    s = s + " ";
                }
                if (i + 1 >= JRMCoreConfig.cdat5696.length) continue;
                s = s + ";";
            }
            ByteBufUtils.writeUTF8String((ByteBuf)b, (String)s);
            s = "";
            for (i = 0; i < JRMCoreConfig.cdat5709.length; ++i) {
                s = s + JRMCoreConfig.cdat5709[i];
                if (i + 1 >= JRMCoreConfig.cdat5709.length) continue;
                s = s + " ";
            }
            ByteBufUtils.writeUTF8String((ByteBuf)b, (String)s);
        }
        if (JRMCoreH.DBC() || JRMCoreH.NC()) {
            b.writeBoolean(JRMCoreConfig.cdat5711);
        }
        if (JRMCoreH.DBC()) {
            b.writeByte((int)JGConfigUltraInstinct.cCONFIG_UI_LEVELS);
            for (int i3 = 0; i3 < JGConfigUltraInstinct.cCONFIG_UI_LEVELS; ++i3) {
                b.writeInt(JGConfigUltraInstinct.cCONFIG_UI_HEAT_DURATION[i3]);
                b.writeBoolean(JGConfigUltraInstinct.cCONFIG_UI_HAIR_WHITE[i3]);
                b.writeInt(JGConfigUltraInstinct.cCONFIG_UI_ATTRIBUTE_MULTI[i3]);
                for (j = 0; j < Races.length; ++j) {
                    b.writeFloat(JGConfigUltraInstinct.cCONFIG_UI_ATTRIBUTE_MULTI_RACE[i3][j]);
                }
                for (j = 0; j < 2; ++j) {
                    b.writeByte((int)JGConfigUltraInstinct.cCONFIG_UI_DODGE_RATE[i3][j]);
                    b.writeByte((int)JGConfigUltraInstinct.cCONFIG_UI_ATTACK_RATE[i3][j]);
                }
            }
        }
        b.writeByte((int)JRMCoreConfig.cExtendedPlayerBlockID);
        b.writeByte((int)JRMCoreConfig.cExtendedPlayerOtherID);
        b.writeByte((int)JRMCoreConfig.cExtendedPlayerHairID);
        if (JRMCoreH.DBC()) {
            b.writeBoolean(DBCConfig.cCanWhisTeleport);
            b.writeFloat(DBCConfig.cEnmaScale);
            b.writeFloat(DBCConfig.cGuruScale);
            for (int i4 = 0; i4 < JRMCoreConfig.cContinuesKiAttacks.length; ++i4) {
                b.writeBoolean(JRMCoreConfig.cContinuesKiAttacks[i4]);
            }
            b.writeBoolean(JRMCoreConfig.cKiAttackScalesWithUser);
        }
        if (JRMCoreH.NC()) {
            for (int i5 = 0; i5 < JRMCoreConfig.cContinuesJutsuAttacks.length; ++i5) {
                b.writeBoolean(JRMCoreConfig.cContinuesJutsuAttacks[i5]);
            }
            b.writeBoolean(JRMCoreConfig.cJutsuScalesWithUser);
        }
        if (JRMCoreH.DBC() || JRMCoreH.NC()) {
            b.writeBoolean(JRMCoreConfig.cWavesShrinkOnceLetGo);
            b.writeBoolean(JRMCoreConfig.cContinuesEnergyAttackTargetSlowdown);
            b.writeInt(JRMCoreConfig.cContinuesEnergyAttackTimer);
        }
        b.writeInt(JRMCoreConfig.ceaesl);
        b.writeFloat(JRMCoreConfig.cealbm);
        if (JRMCoreH.DBC()) {
            b.writeInt(DBCConfig.cNullRealmMinimumHeight);
            for (int i6 = 0; i6 < 9; ++i6) {
                b.writeDouble(JRMCoreConfig.cdat5696[i6][2]);
            }
            b.writeBoolean(DBCConfig.cNullRealmBGColorNodeGreen);
            b.writeBoolean(JRMCoreConfig.cPlayerFlyingDragDownOn);
        }
        if (JRMCoreH.DBC()) {
            for (int k = 0; k < Races.length; ++k) {
                for (i = 0; i < ClassesDBC.length; ++i) {
                    for (j2 = 0; j2 < attrInit[1].length; ++j2) {
                        b.writeDouble(JGConfigRaces.cCONFIG_RACES_ATTRIBUTE_MULTI[k][i][j2]);
                        b.writeInt(JGConfigRaces.cCONFIG_RACES_ATTRIBUTE_START[k][i][j2]);
                    }
                    for (j2 = 0; j2 < statNames[1].length; ++j2) {
                        b.writeFloat(JGConfigRaces.cCONFIG_RACES_STATS_MULTI[k][i][j2]);
                        b.writeInt(JGConfigRaces.cCONFIG_RACES_STAT_BONUS[k][i][j2]);
                    }
                }
            }
            b.writeBoolean(JGConfigRaces.cCONFIG_MAJIN_ENABLED);
            b.writeBoolean(JGConfigRaces.cCONFIG_MAJIN_ABSORPTION_ENABLED);
            b.writeBoolean(JGConfigRaces.cCONFIG_MAJIN_PURE_PINK_SKIN);
            b.writeBoolean(JGConfigRaces.cCONFIG_MAJIN_ABSORPTON_MULTIPLIES_BONUS_ATTRIBUTE_MULTIPLIERS);
            for (int i7 = 0; i7 < TransNms[5].length + 3; ++i7) {
                b.writeFloat(JGConfigRaces.cCONFIG_MAJIN_ABSORPTON_ATTRIBUTE_MULTI[i7]);
                b.writeFloat(JGConfigRaces.cCONFIG_MAJIN_ABSORPTON_SPEED_MULTI[i7]);
            }
        }
        b.writeBoolean(JRMCoreConfig.cJRMCABonusOn);
        b.writeBoolean(JRMCoreConfig.cShadowDummyScaleToTarget);
        if (JRMCoreH.DBC()) {
            int j3;
            b.writeBoolean(JGConfigUltraInstinct.cCONFIG_UI_IGNORE_BASE_CONFIG);
            b.writeBoolean(JGConfigDBCGoD.cCONFIG_GOD_IGNORE_BASE_CONFIG);
            b.writeInt(JGConfigDBCGoD.cCONFIG_GOD_IGNORED_DAMAGE_SOURCES.length);
            for (j3 = 0; j3 < JGConfigDBCGoD.cCONFIG_GOD_IGNORED_DAMAGE_SOURCES.length; ++j3) {
                ByteBufUtils.writeUTF8String((ByteBuf)b, (String)JGConfigDBCGoD.cCONFIG_GOD_IGNORED_DAMAGE_SOURCES[j3]);
            }
            b.writeInt(JGConfigDBCGoD.cCONFIG_GOD_IGNORED_ENTITIES.length);
            for (j3 = 0; j3 < JGConfigDBCGoD.cCONFIG_GOD_IGNORED_ENTITIES.length; ++j3) {
                ByteBufUtils.writeUTF8String((ByteBuf)b, (String)JGConfigDBCGoD.cCONFIG_GOD_IGNORED_ENTITIES[j3]);
            }
            b.writeFloat(JGConfigDBCGoD.cCONFIG_GOD_IGNORE_DAMAGE_MULTI);
            b.writeBoolean(JGConfigDBCGoD.cCONFIG_GOD_IGNORE_PROJECTILES_ENABLED);
            b.writeBoolean(JGConfigDBCGoD.cCONFIG_GOD_ENABLED);
            b.writeBoolean(JGConfigDBCGoD.cCONFIG_GOD_AURA_ENABLED);
            b.writeBoolean(JGConfigDBCGoD.cCONFIG_GOD_AURA_ENABLED_WITH_AURA);
            b.writeBoolean(JGConfigDBCGoD.cCONFIG_GOD_ENERGY_ENABLED);
            b.writeFloat(JGConfigDBCGoD.cCONFIG_GOD_ENERGY_DAMAGE_MULTI);
            b.writeFloat(JGConfigDBCGoD.cCONFIG_GOD_ATTRIBUTE_MULTI);
            for (j3 = 0; j3 < Races.length; ++j3) {
                b.writeFloat(JGConfigDBCGoD.cCONFIG_GOD_ATTRIBUTE_MULTI_RACE[j3]);
            }
        }
        b.writeBoolean(JRMCoreConfig.cBuildingBlocksRenderAsNormalBlock);
        b.writeFloat(JGConfigSkills.cGlobalSkillTPMultiplier);
        b.writeFloat(JGConfigSkills.cGlobalSkillMindMultiplier);
        b.writeFloat(JGConfigSkills.cGlobalSkillTPMultiplierFirst);
        b.writeFloat(JGConfigSkills.cGlobalSkillMindMultiplierFirst);
        b.writeBoolean(JGConfigSkills.cGlobalSkillTPMultiplierWithLevel);
        b.writeBoolean(JGConfigSkills.cGlobalSkillMindMultiplierWithLevel);
        if (JRMCoreH.NC()) {
            b.writeInt(JRMCoreConfig.cNCExplosionTagTickTimer);
        }
        if (JRMCoreH.DBC()) {
            int i8;
            b.writeInt(DBCConfig.cAaiForceDifficulty);
            b.writeBoolean(DBCConfig.cAaiDisabled);
            b.writeInt(DBCConfig.cEnemyDefaultAttackTimer);
            b.writeInt(DBCConfig.cEnemyDefaultShortRangeAttackTimer);
            b.writeDouble(DBCConfig.cEnemyDefaultMoveSpeed);
            b.writeBoolean(DBCConfig.cKiAttackGoThroughInvulnerableEnemies);
            b.writeBoolean(DBCConfig.cInstantTransformOn);
            b.writeBoolean(DBCConfig.cSingleFormDescendOn);
            for (i8 = 0; i8 < DBCConfig.cIsInstantTransformEnabled.length; ++i8) {
                b.writeBoolean(DBCConfig.cIsInstantTransformEnabled[i8]);
            }
            b.writeBoolean(DBCConfig.cKaiokenSingleFormDescendOn);
            b.writeBoolean(DBCConfig.cMoveWhileTransforming);
            b.writeBoolean(DBCConfig.cMoveWhileInstantTransforming);
            for (i8 = 0; i8 < JGConfigDBCAAiDifficulty.DIFFICULTIES.length; ++i8) {
                b.writeDouble(JGConfigDBCAAiDifficulty.cGroundDashSpeedMulti[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cGroundDashSpeedMulti2[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cGroundDashLimit[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cJumpMulti[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cJumpMulti2[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cJumpLimit[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cJumpLimit2[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cJumpRate[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cFlyingDashMulti[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cFlyingDashLimit[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cKiAttackChargeMulti[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cKiAttackChargeLimit[i8]);
                b.writeInt(JGConfigDBCAAiDifficulty.cTeleportRateMin[i8]);
                b.writeInt(JGConfigDBCAAiDifficulty.cTeleportRateMax[i8]);
                b.writeDouble(JGConfigDBCAAiDifficulty.cSpeedMulti[i8]);
            }
            b.writeBoolean(DBCConfig.cMysticKaiokenOn);
            for (i8 = 0; i8 < Races.length; ++i8) {
                for (j = 0; j < JRMCoreConfig.KaiokenFormHealthCost[i8].length; ++j) {
                    b.writeFloat(JRMCoreConfig.cKaiokenFormHealthCost[i8][j]);
                }
            }
            for (i8 = 0; i8 < 2; ++i8) {
                b.writeBoolean(JGConfigDBCInstantTransmission.CCONFIG_INSTANT_TRANSMISSION_ENABLED[i8]);
            }
        }
        b.writeBoolean(JGConfigDBCFormMastery.cFM_Enabled);
        for (int raceID = 0; raceID < Races.length; ++raceID) {
            int racials = trans[raceID].length;
            for (int formID = 0; formID < JGConfigDBCFormMastery.cFormMasteries[raceID].length; ++formID) {
                String form;
                boolean racial = formID < racials;
                String string = form = racial ? trans[raceID][formID] : transNonRacial[formID - racials];
                if (racial && JRMCoreH.isRaceSaiyan(raceID) && (form.equals(trans[raceID][12]) || form.equals(trans[raceID][13]))) continue;
                for (int j4 = 0; j4 < 3; ++j4) {
                    b.writeDouble(JGConfigDBCFormMastery.cFormMasteries[raceID][formID].getDouble(0, j4));
                }
            }
        }
    }

    public static float getMaxEnergyDamage() {
        float max = (float)JRMCoreConfig.tmx * 10.0f;
        if (max < 0.0f) {
            max = JRMCoreConfig.tmx;
        }
        return max;
    }

    public static int state2UltraInstinct(byte state2) {
        return JRMCoreH.state2UltraInstinct(false, state2);
    }

    public static int state2UltraInstinct(boolean kaioken, byte state2) {
        return kaioken || state2 == 0 || state2 > JGConfigUltraInstinct.CONFIG_UI_LEVELS ? 0 : state2 - 1;
    }

    public static float getHeatPercentageClient() {
        if (JGConfigUltraInstinct.CONFIG_UI_LEVELS > 0) {
            int heat_current = cura;
            int state2 = JRMCoreH.state2UltraInstinct(JRMCoreH.StusEfctsMe(5), State2);
            int heat_max = JGConfigUltraInstinct.CONFIG_UI_HEAT_DURATION[state2];
            if (heat_max == 0) {
                return 100.0f;
            }
            float heat_one = (float)heat_max / 100.0f;
            float heat_current_percentage = (float)heat_current / heat_one;
            if (heat_current_percentage < 0.0f) {
                heat_current_percentage *= -1.0f;
            }
            return heat_current_percentage;
        }
        return 0.0f;
    }

    public static float getHeatPercentage(EntityPlayer player, byte status2) {
        if (JGConfigUltraInstinct.CONFIG_UI_LEVELS > 0) {
            byte heatCurrent = JRMCoreH.getByte(player, Heat);
            int heatMax = JGConfigUltraInstinct.CONFIG_UI_HEAT_DURATION[status2];
            if (heatMax == 0) {
                return 100.0f;
            }
            float heatOne = (float)heatMax / 100.0f;
            float heatPercentage = (float)heatCurrent / heatOne;
            if (heatPercentage < 0.0f) {
                heatPercentage *= -1.0f;
            }
            return heatPercentage;
        }
        return 0.0f;
    }

    public static byte getUltraInstinctRate(EntityPlayer player, byte status2, byte[][] rates) {
        if (JGConfigUltraInstinct.CONFIG_UI_LEVELS > 0) {
            byte max = rates[status2][1];
            if (max == 0) {
                return 0;
            }
            byte min = rates[status2][0];
            byte diff = (byte)(max - min);
            if (diff == 0) {
                return min;
            }
            float heatPercentage = JRMCoreH.getHeatPercentage(player, status2);
            int current = (int)((float)diff * (heatPercentage * 0.01f) + (float)diff);
            if (current < 0) {
                current *= -1;
            }
            if (current > 100) {
                current = 100;
            }
            return (byte)current;
        }
        return 0;
    }

    public static byte getUltraInstinctDodgeRate(EntityPlayer player, byte status2) {
        return JRMCoreH.getUltraInstinctRate(player, status2, JGConfigUltraInstinct.CONFIG_UI_DODGE_RATE);
    }

    public static byte getUltraInstinctCounterRate(EntityPlayer player, byte status2) {
        return JRMCoreH.getUltraInstinctRate(player, status2, JGConfigUltraInstinct.CONFIG_UI_ATTACK_RATE);
    }

    public static boolean canUltraInstinctDodgeSource(DamageSource source) {
        return !JGConfigUltraInstinct.CONFIG_UI_CANT_DODGE.contains(source.getDamageType());
    }

    public static boolean canUltraInstinctCounterSource(DamageSource source) {
        return JGConfigUltraInstinct.CONFIG_UI_CAN_COUNTER.contains(source.getDamageType());
    }

    public static float Perc(int d) {
        return d == 1 ? Perc10 : (d == 2 ? Perc15 : 1.0f);
    }

    public static void expPls(EntityPlayer player, int value) {
        int xpLimit = 10;
        int tpGain = 1;
        if (JRMCoreH.DBC()) {
            byte d = JRMCoreH.getByte(player, Diff);
            JGPlayerMP jgPlayer = new JGPlayerMP(player);
            jgPlayer.connectBaseNBT();
            byte race = jgPlayer.getRace();
            tpGain = (int)((float)JRMCoreConfig.tpgn * JRMCoreConfig.TPGainRace[race]);
        }
        byte exp = JRMCoreH.getByte(player, EXP);
        int tp = JRMCoreH.getInt(player, TPint);
        int add = value;
        if (tp < JRMCoreH.getMaxTP()) {
            if (exp + value >= xpLimit) {
                for (int i = 0; i < (exp + value) / xpLimit; ++i) {
                    if (i != (exp + value) / xpLimit - 1) continue;
                    JRMCoreH.setInt(tp + (i + 1) * tpGain, player, TPint);
                }
            }
            add = exp + value - (exp + value) / xpLimit * xpLimit;
            JRMCoreH.setByte(add, player, EXP);
        }
    }

    public static void triForce(int i, int j, int k) {
        PD.sendToServer(new JRMCorePTri((byte)i, (byte)j, (byte)k));
    }

    static void jrmct(int t, String s, EntityPlayer p) {
        PD.sendTo(new JRMCorePTick(t, s), (EntityPlayerMP)p);
    }

    public static void jrmct(int t) {
    }

    public static void jrmctAll(int t, String s) {
        PD.sendToAll(new JRMCorePTick(t, s));
    }

    public static void jrmcDataFC(int c, String d) {
        PD.sendToServer(new JRMCorePData(c, d));
    }

    public static void jrmcData(int c, String d) {
        PD.sendToAll(new JRMCorePData(c, d));
    }

    public static void jrmcDataToP(int c, String d, EntityPlayer p) {
        PD.sendTo(new JRMCorePData(c, d), (EntityPlayerMP)p);
    }

    public static void Char(byte b, byte b2) {
        PD.sendToServer(new JRMCorePChar(b, b2));
    }

    public static void Upg(byte b) {
        PD.sendToServer(new JRMCorePUpgrade(b));
    }

    public static void Attck(byte b) {
        PD.sendToServer(new JRMCorePAttck(b));
    }

    public static void Rls(byte b) {
        PD.sendToServer(new JRMCorePRls(b));
    }

    public static void Cost(int cost2) {
        PD.sendToServer(new JRMCorePCost((short)cost2));
    }

    public static void Stats(EntityPlayer p, int curBody, int curEnergy, int curStamina, byte curRelease, byte b) {
        PD.sendTo(new JRMCorePStats(curBody, curEnergy, curStamina, curRelease, b), (EntityPlayerMP)p);
    }

    public static void Stats2(EntityPlayer p, int curTP, int curExp, byte align, int[] plyrAttrbts2) {
        PD.sendTo(new JRMCorePStats2(curTP, curExp, align, plyrAttrbts2), (EntityPlayerMP)p);
    }

    public static void Stats3(EntityPlayer p, String PlyrSkills, String x, String y, String z) {
        PD.sendTo(new JRMCorePStats3b(PlyrSkills, x, y, z), (EntityPlayerMP)p);
    }

    public static void Tech(EntityPlayer p, byte n, String t) {
        PD.sendTo(new JRMCorePTech(n, t), (EntityPlayerMP)p);
    }

    public static void Tech(byte n, String t) {
        PD.sendToServer(new JRMCorePTech(n, t));
    }

    public static void Skll(byte op, byte id) {
        PD.sendToServer(new JRMCorePStats3(op, id, 1));
    }

    public static void Skll(byte op, byte id, byte bn) {
        PD.sendToServer(new JRMCorePStats3(op, id, bn));
    }

    public static void Anim(int i) {
        PD.sendToServer(new JRMCorePFall((byte)i));
    }

    public static void resetDBCworldgen() {
        WorldGeneratorDB.KiLtSpawn = true;
        WorldGeneratorDB.KiLtTCSpawn = true;
        WorldGeneratorDB.ChkInStSpawn = true;
        WorldGeneratorDB.SnkWySpawn = true;
        WorldGeneratorDB.TiChaSpawn = true;
        WorldGeneratorDB.TiChaKLSpawn = true;
        WorldGeneratorDB.KnTrSpawn = true;
        WorldGeneratorDB.WorldGen_TOPArena_Done = true;
        WorldGeneratorDB.WorldGen_TOPZeno_Done = true;
        WorldGeneratorDB.WorldGen_Zeno_Done = true;
        WorldGeneratorDB.KHSpawn = true;
        WorldGeneratorDB.CASpawn = true;
        WorldGeneratorDB.GHSpawn = true;
        WorldGeneratorDB.FSSpawn = true;
        WorldGeneratorDB.BSSpawn = true;
        WorldGeneratorDB.WorldGen_GuruHouse_Done = true;
        DBCH.genCA = "";
        DBCH.genKH = "";
        DBCH.genGH = "";
        DBCH.genFS = "";
        DBCH.genBS = "";
        DBCH.genGuru = "";
    }

    public static void resetNCworldgen() {
        WorldGeneratorNC.KonohaSpawn = true;
        NCH.genKnvl = "";
        NCCommonTickHandler.sentDatnc0 = null;
        NCCommonTickHandler.sentDatnc1 = null;
    }

    public static void resetDedSer() {
        DBCresetted = true;
        NCresetted = true;
        if (JRMCoreH.DBC()) {
            JRMCoreH.resetDBCworldgen();
        }
        if (JRMCoreH.NC()) {
            JRMCoreH.resetNCworldgen();
        }
        JRMCoreComTickH.bldngChkr = true;
        JRMCoreComTickH.start = true;
        JRMCoreComTickH.bldngsChecker = 300;
        JRMCoreComTickH.sentData0 = null;
        JRMCoreComTickH.sentData1 = null;
        JRMCoreComTickH.sentData2 = null;
        JRMCoreComTickH.sentData3 = null;
        JRMCoreComTickH.sentData4 = null;
        JRMCoreComTickH.sentData5 = null;
        JRMCoreComTickH.sentData6 = null;
        JRMCoreComTickH.sentData7 = null;
        JRMCoreComTickH.sentData8 = null;
        JRMCoreComTickH.sentData9 = null;
        JRMCoreComTickH.sentDat10 = null;
        JRMCoreComTickH.sentDat11 = null;
        JRMCoreComTickH.sentDat12 = null;
        JRMCoreComTickH.sentDat13 = null;
        JRMCoreComTickH.sentDat14 = null;
        JRMCoreComTickH.sentDat15 = null;
        JRMCoreComTickH.sentDat16 = null;
        JRMCoreComTickH.sentDat17 = null;
        JRMCoreComTickH.sentDat18 = null;
        JRMCoreComTickH.sentDat19 = null;
        JRMCoreComTickH.sentDat20 = null;
        JRMCoreComTickH.sentDat21 = null;
        JRMCoreComTickH.sentDat22 = null;
        JRMCoreComTickH.sentDat23 = null;
        JRMCoreComTickH.sentDat24 = null;
        JRMCoreComTickH.sentDat25 = null;
        JRMCoreComTickH.sentDat26 = null;
        JRMCoreComTickH.sentDat27 = null;
        JRMCoreComTickH.sentDat28 = null;
        JRMCoreComTickH.sentDat29 = null;
        JRMCoreComTickH.sentDat30 = null;
        JRMCoreComTickH.sentDat31 = null;
        JRMCoreComTickH.sentDat32 = null;
        if (JRMCoreH.JFC()) {
            // empty if block
        }
    }

    public static void resetChar(EntityPlayer p) {
        JRMCoreH.resetChar(p, false, false, false, 0.0f);
    }

    public static void resetChar(EntityPlayer p, boolean keepSkills, boolean keepTechs) {
        JRMCoreH.resetChar(p, keepSkills, keepTechs, false, 0.0f);
    }

    public static void resetChar(EntityPlayer p, boolean keepSkills, boolean keepTechs, boolean keepMasteries, float perc) {
        int j;
        String nam = p.getCommandSenderName();
        String[] pw = new String[]{"NotSelected", "DBC", "NC", "SAO"};
        byte pwr = JRMCoreH.getByte(p, P);
        mod_JRMCore.logger.info("Character reset for " + nam);
        mod_JRMCore.logger.info("Power User: " + pw[pwr]);
        mod_JRMCore.logger.info("Alignment: " + JRMCoreH.getByte(p, Align));
        mod_JRMCore.logger.info("Race: " + Races[JRMCoreH.getByte(p, R)]);
        mod_JRMCore.logger.info("Class: " + JRMCoreH.cl(JRMCoreH.getByte(p, P))[JRMCoreH.getByte(p, Cl)]);
        for (int i = 0; i < attrNms[pwr].length; ++i) {
            mod_JRMCore.logger.info(JRMCoreH.attrNms(pwr, i) + ": " + JRMCoreH.getInt(p, AttrbtNbtI[i]));
        }
        String[] PlyrSkills = JRMCoreH.getString(p, SkillsNbt2).split(",");
        for (j = 0; j < PlyrSkills.length; j = (int)((byte)(j + 1))) {
            String skl = PlyrSkills[j];
            if (skl.length() <= 2) continue;
            mod_JRMCore.logger.info("Skill: " + JRMCoreH.SklName(skl, pwr == 1 ? DBCSkillsIDs : NCSkillIDs, pwr == 1 ? DBCSkillNames : NCSkillNames) + " lvl: " + (Integer.parseInt(skl.substring(2)) + 1));
        }
        if (!keepMasteries) {
            mod_JRMCore.logger.info("Form Masteries (Racial): " + JRMCoreH.getString(p, JRMCoreH.getNBTFormMasteryRacialKey(JRMCoreH.getByte(p, R))));
            mod_JRMCore.logger.info("Form Masteries (Non-Racial): " + JRMCoreH.getString(p, NBT_FormMasteryNonRacial));
        }
        JRMCoreH.setByte(67, p, Align);
        JRMCoreH.setInt(0, p, Karma);
        JRMCoreH.setByte(0, p, KllCG);
        JRMCoreH.setByte(0, p, KllCN);
        JRMCoreH.setByte(0, p, KllCE);
        JRMCoreH.setByte(0, p, DiedTimes);
        JRMCoreH.setByte(0, p, CurRelease);
        JRMCoreH.setByte(0, p, P);
        JRMCoreH.setByte(0, p, Cl);
        JRMCoreH.setInt(1, p, AttrbtNbtI[0]);
        JRMCoreH.setInt(1, p, AttrbtNbtI[1]);
        JRMCoreH.setInt(1, p, AttrbtNbtI[2]);
        JRMCoreH.setInt(1, p, AttrbtNbtI[3]);
        JRMCoreH.setInt(1, p, AttrbtNbtI[4]);
        JRMCoreH.setInt(1, p, AttrbtNbtI[5]);
        JRMCoreH.setByte(0, p, St);
        JRMCoreH.setByte(0, p, St2);
        JRMCoreH.setByte(0, p, TransSaiRgNbt);
        JRMCoreH.setByte(-1, p, Tm);
        JRMCoreH.setByte(0, p, Acc);
        JRMCoreH.setByte(0, p, Diff);
        JRMCoreH.setInt(99, p, SagaMainDBC);
        JRMCoreH.setString(" ", p, StE);
        JRMCoreH.setString(" ", p, plyrSttngs);
        JRMCoreH.setString(" ", p, MissionSyncData);
        JRMCoreH.setString(" ", p, MissionSyncDataVers);
        JRMCoreH.setString(" ", p, DNSAU);
        JRMCoreH.setInt(0, p, S4afgft);
        if (JRMCoreH.getShort(p, GTrnng) > 200) {
            JRMCoreH.setShort(200, p, GTrnng);
        }
        JRMCoreH.setString("pty", p, "jrmcSSltX");
        JRMCoreH.setString("pty", p, "jrmcSSltY");
        if (!keepSkills) {
            JRMCoreH.setString(",", p, SkillsNbt2);
        }
        if (!keepTechs) {
            for (j = 0; j < techNbt.length; j = (int)((byte)(j + 1))) {
                JRMCoreH.setString(" ", p, techNbt[j]);
            }
        }
        if (!keepMasteries) {
            JRMCoreH.setString(NBT_FormMasteryDefault, p, JRMCoreH.getNBTFormMasteryRacialKey(JRMCoreH.getByte(p, R)));
            JRMCoreH.setString(NBT_FormMasteryDefaultNonRacial, p, NBT_FormMasteryNonRacial);
        }
        JRMCoreH.setShort(0, p, GTrnng);
        JRMCoreH.setByte(0, p, NBT_UI_HighestStateReached);
        JRMCoreH.setByte(0, p, NBT_UI_WasInPain);
        JRMCoreH.setByte(0, p, NBT_UI_WasInPainDuration);
        JRMCoreH.setString("0;0", p, NBT_InstantTransmissionTimers);
        JRMCoreH.setInt(0, p, SAO_AP);
        JRMCoreH.setInt(0, p, SAO_COL);
        JRMCoreH.setInt(0, p, SAO_EXP);
        JRMCoreH.setInt(1, p, SAO_LVL);
    }

    public static void resetChar() {
        DBCresetted = true;
        int[] att = new int[]{0, 0, 0, 0, 0, 0};
        int[] stv = new int[]{0, 0, 0, 0, 0, 0};
        PlyrAttrbts = att;
        Race = 0;
        dns = "0";
        Pwrtyp = 0;
        Class = 0;
        State = 0;
        plyrsArnd = null;
        curBody = 0;
        curEnergy = 0;
        maxBody = 0;
        maxEnergy = 0;
        curRelease = 0;
        curTP = 0;
        curExp = 0;
        State2 = 0;
        Dffclty = 0;
        TlMd = 0;
        PtchVc = 0;
        GTrnngCB = 0;
        align = 0;
        karma = 0;
        WeightOn = 0.0f;
        GravZone = 1.0f;
        PlyrSettings = "";
        PlyrSkillX = "";
        PlyrSkillY = "";
        PlyrSkillZ = "";
        String[] str = new String[]{"", "", "", "", "", "", "", "", "", ""};
        PlyrSkills = str;
        tech1 = null;
        tech2 = null;
        tech3 = null;
        tech4 = null;
        techPM = null;
        data0 = null;
        data1 = null;
        data2 = null;
        data3 = null;
        data4 = null;
        data5 = null;
        data6 = null;
        data7 = null;
        data8 = null;
        data9 = null;
        dat10 = null;
        dat11 = null;
        dat12 = null;
        dat13 = null;
        dat14 = null;
        dat15 = null;
        dat16 = null;
        dat17 = null;
        dat18 = null;
        dat19 = null;
        dat20 = null;
        dat21 = null;
        dat22 = null;
        dat23 = null;
        dat24 = null;
        dat25 = null;
        dat26 = null;
        dat27 = null;
        dat28 = null;
        dat29 = null;
        dat30 = null;
        dat31 = null;
        dat32 = null;
        JRMCoreConfig.ssc = "empty";
        JRMCoreConfig.ssurl = "empty";
        JRMCoreConfig.ssurl2 = "empty";
        JRMCoreConfig.sfzns = JRMCoreConfig.csfzns;
        JRMCoreGuiScreen.CanRace = true;
        JRMCoreGuiScreen.CanGender = true;
        JRMCoreGuiScreen.CanHair = true;
        JRMCoreGuiScreen.CanColor = true;
        JRMCoreGuiScreen.CanSpecial = true;
        JRMCoreGuiScreen.CanPwr = true;
        JRMCoreGuiScreen.CanClass = true;
        JRMCoreGuiScreen.RaceSlcted = 0;
        JRMCoreGuiScreen.GenderSlcted = 0;
        JRMCoreGuiScreen.HairSlcted = 10;
        JRMCoreGuiScreen.ColorSlcted = 0;
        JRMCoreGuiScreen.BrghtSlcted = 0.8f;
        JRMCoreGuiScreen.BodyTypeSlcted = 0;
        JRMCoreGuiScreen.PwrtypSlcted = 0;
        JRMCoreGuiScreen.ClassSlcted = 0;
        JRMCoreGuiScreen.tail = true;
        JRMCoreM.missionsC = new HashMap();
        JRMCoreM.missionsCD = new HashMap();
        MSD = "";
        MSDV = "";
        hsp = "";
        jutsumode = 0;
        handsealfailed = 0;
        jutsu = 0;
        jutsuinfo = 0;
        ncDou = null;
        SagaProg = 0;
        SagaTimes = 0;
        SagaSideProg = 0;
        SagaSideTimes = null;
        GID = 0;
        GLID = " ";
        GIDs = null;
        GIDi = " ";
        GMN = 0;
        ServerPoints = 0;
        PtchVc = 0;
        if (JRMCoreH.JFC()) {
            // empty if block
        }
    }

    public static int jrmcEnergyDam(Entity Player, int dbcA, DamageSource s) {
        if (!Player.worldObj.isRemote && Player instanceof EntityPlayer) {
            int p;
            int d;
            EntityPlayer player = (EntityPlayer)Player;
            ExtendedPlayer props = ExtendedPlayer.get(player);
            boolean block = props.getBlocking() == 1;
            int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts(player);
            NBTTagCompound nbt = JRMCoreH.nbt((Entity)player, "pres");
            byte st = nbt.getByte(St);
            int t = JRMCoreH.SklLvl(4, player);
            byte rc = nbt.getByte(R);
            byte pwr = nbt.getByte(P);
            byte cls = nbt.getByte(Cl);
            byte rls = JRMCoreH.getByte(player, CurRelease);
            int def = (int)((float)JRMCoreH.stat((Entity)player, 1, pwr, 1, PlyrAttrbts[1], rc, cls, 0.0f) * 0.5f);
            def = block ? def : 0;
            int ta = 0;
            if (s != null && s.getEntity() instanceof EntityPlayer) {
                String[] ops = JRMCoreH.PlyrSkills((EntityPlayer)s.getEntity());
                ta = JRMCoreH.SklLvl(14, 1, ops);
            }
            dbcA = (dbcA = (int)((float)(dbcA - ((d = (int)((float)(def * rls) * 0.01f)) - (p = (int)((float)(d * ta) * 0.01f)))) * (1.0f - 0.03f * (float)t))) <= 0 ? 1 : dbcA;
            int curBody = JRMCoreH.getInt(player, CurEnergy);
            int all = curBody - dbcA;
            JRMCoreH.setInt(all < 0 ? 0 : all, player, CurEnergy);
        }
        return dbcA;
    }

    public static int jrmcDam(Entity Player, int dbcA, DamageSource s, byte t) {
        Random ran;
        int r;
        if (!Player.worldObj.isRemote && Player instanceof EntityPlayer && t == 2 && (r = (ran = new Random()).nextInt(4)) == 0) {
            Player.worldObj.playSoundAtEntity(Player, "jinryuudragonbc:DBC4.disckill", 1.0f, 1.0f);
            JRMCoreH.setByte((byte)4, (EntityPlayer)Player, Tm);
            byte state = JRMCoreH.getByte((EntityPlayer)Player, St);
            if (state == 7 || state == 8 || state == 14) {
                JRMCoreH.setByte(0, (EntityPlayer)Player, St);
            }
        }
        return JRMCoreH.jrmcDam(Player, dbcA, s);
    }

    public static int jrmcDam(Entity Player, int dbcA, DamageSource s) {
        if (!Player.worldObj.isRemote && Player instanceof EntityPlayer) {
            boolean dse;
            EntityPlayer player = (EntityPlayer)Player;
            boolean bl = dse = s != null && s.getEntity() != null && s.getEntity() instanceof EntityPlayer;
            if (!player.capabilities.isCreativeMode) {
                boolean friendlyFist;
                int curBody;
                int all;
                int set;
                boolean c;
                ExtendedPlayer props = ExtendedPlayer.get(player);
                boolean block = props.getBlocking() == 1;
                int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts(player);
                NBTTagCompound nbt = JRMCoreH.nbt((Entity)player, "pres");
                byte state = nbt.getByte(St);
                byte state2 = nbt.getByte(St2);
                String sklx = JRMCoreH.getString(player, "jrmcSSltX");
                int t = JRMCoreH.SklLvl(4, player);
                byte race = nbt.getByte(R);
                byte powerType = nbt.getByte(P);
                byte classID = nbt.getByte(Cl);
                byte release = JRMCoreH.getByte(player, CurRelease);
                int resrv = JRMCoreH.getInt(player, ArcRsrvNbt);
                String absorption = JRMCoreH.getString(player, NBT_MajinAbsorptionData);
                int currStamina = JRMCoreH.getInt(player, CurStamina);
                int currEnergy = JRMCoreH.getInt(player, CurEnergy);
                String ste = JRMCoreH.getString(player, StE);
                boolean mj = JRMCoreH.StusEfcts(12, ste);
                boolean lg = JRMCoreH.StusEfcts(14, ste);
                boolean mc = JRMCoreH.StusEfcts(13, ste);
                boolean kk = JRMCoreH.StusEfcts(5, ste);
                boolean mn = JRMCoreH.StusEfcts(19, ste);
                boolean gd = JRMCoreH.StusEfcts(20, ste);
                boolean lf = s != null && s == DamageSource.fall;
                int DEX = PlyrAttrbts[1];
                int CON = PlyrAttrbts[2];
                String[] ps = JRMCoreH.PlyrSkills(player);
                double per = 1.0;
                int def = 0;
                String x = JRMCoreH.getString(player, StE);
                boolean bl2 = c = JRMCoreH.StusEfcts(10, x) || JRMCoreH.StusEfcts(11, x);
                if (powerType != 3 && powerType > 0) {
                    DEX = JRMCoreH.getPlayerAttribute(player, PlyrAttrbts, 1, state, state2, race, sklx, release, resrv, lg, mj, kk, mc, mn, gd, powerType, ps, c, absorption);
                }
                int kiProtection = 0;
                int kiProtectionCost = 0;
                boolean kiProtectOn = false;
                if (JRMCoreH.pwr_ki(powerType)) {
                    int maxCON = JRMCoreH.getPlayerAttribute(player, PlyrAttrbts, 2, state, state2, race, sklx, release, resrv, lg, mj, kk, mc, mn, gd, powerType, ps, c, absorption);
                    per = (double)(maxCON > CON ? maxCON : CON) / ((double)CON * 1.0);
                    def = JRMCoreH.stat((Entity)player, 1, powerType, 1, DEX, race, classID, 0.0f);
                    int SPI = PlyrAttrbts[5];
                    int energyPool = JRMCoreH.stat((Entity)player, 5, powerType, 5, SPI, race, classID, JRMCoreH.SklLvl_KiBs(ps, (int)powerType));
                    def = (int)((double)def * (double)release * 0.01 * (double)JRMCoreH.weightPerc(1, player));
                    kiProtectOn = !JRMCoreH.PlyrSettingsB(player, 10);
                    int kiProtectLevel = JRMCoreH.SklLvl(11, ps);
                    if (kiProtectOn) {
                        kiProtection = (int)((double)kiProtectLevel * 0.005 * (double)energyPool * (double)release * 0.01);
                        if (kiProtection < 1) {
                            kiProtection = 1;
                        }
                        kiProtection = (int)((double)kiProtection * DBCConfig.cnfKDd);
                        float damage = (float)dbcA / 3.0f / (float)(dbcA + "").length();
                        if (damage < 1.0f) {
                            damage = 1.0f;
                        }
                        if ((kiProtectionCost = (int)((double)kiProtectLevel * (double)release * 0.01 * (double)damage)) < 1) {
                            kiProtectionCost = 1;
                        }
                        kiProtectionCost = (int)((double)kiProtectionCost * DBCConfig.cnfKDc);
                    }
                    def += kiProtection;
                } else if (JRMCoreH.pwr_cha(powerType)) {
                    String StE;
                    int ta = JRMCoreH.SklLvl(0, 2, ps);
                    int cj = JRMCoreH.SklLvlY(2, JRMCoreH.getString(player, "jrmcSSltY"));
                    def = JRMCoreH.stat((Entity)player, 1, powerType, 1, DEX, race, classID, (float)ta * 0.04f + (float)state * 0.25f);
                    def = (int)((double)(def * release) * 0.01);
                    if (classID == 2 && JRMCoreH.StusEfcts(16, StE = nbt.getString(StE))) {
                        int WIL = PlyrAttrbts[3];
                        int statWIL = JRMCoreH.stat((Entity)player, 3, powerType, 5, WIL, race, classID, 0.0f);
                        def += (int)((double)statWIL * 0.25 * (double)release * 0.01);
                    }
                } else {
                    def = JRMCoreH.pwr_sa(powerType) ? 0 : JRMCoreH.stat((Entity)player, 1, powerType, 1, DEX, race, classID, 0.0f);
                }
                int staminaCost = (int)((float)(def - kiProtection) * 0.05f);
                if (block && currStamina >= staminaCost) {
                    int id = (int)(Math.random() * 2.0) + 1;
                    player.worldObj.playSoundAtEntity((Entity)player, "jinryuudragonbc:DBC4.block" + id, 0.5f, 0.9f / (player.worldObj.rand.nextFloat() * 0.6f + 0.9f));
                    if (!JRMCoreH.isInCreativeMode((Entity)player)) {
                        JRMCoreH.setInt(currStamina - staminaCost < 0 ? 0 : currStamina - staminaCost, player, CurStamina);
                    }
                } else {
                    def = (int)((float)((def - kiProtection) * JRMCoreConfig.StatPasDef) * 0.01f) + kiProtection;
                }
                if (currEnergy >= kiProtectionCost) {
                    if (!JRMCoreH.isInCreativeMode((Entity)player)) {
                        JRMCoreH.setInt(currEnergy - kiProtectionCost < 0 ? 0 : currEnergy - kiProtectionCost, player, CurEnergy);
                    }
                } else {
                    def -= kiProtection;
                }
                if (JRMCoreConfig.DebugInfo || difp.length() > 0 && player.getCommandSenderName().equalsIgnoreCase(difp)) {
                    mod_JRMCore.logger.info(player.getCommandSenderName() + " receives Damage: Original=" + dbcA);
                }
                int defensePenetration = 0;
                if (s != null && dse) {
                    String[] ops = JRMCoreH.PlyrSkills((EntityPlayer)s.getEntity());
                    defensePenetration = JRMCoreH.SklLvl(14, 1, ops);
                } else if (s != null && s.getEntity() instanceof EntityLivingBase) {
                    defensePenetration = 10;
                }
                int dbcAO = dbcA;
                int defense = lf ? 0 : def;
                int defensePen2 = (int)((float)(defense * defensePenetration) * 0.01f);
                double e = 1.0f - 0.03f * (float)t;
                String ss = "A=" + defense + (defensePen2 > 0 ? "-" + defensePenetration + "%" : "") + ", SEM=" + (1.0f - 0.03f * (float)t);
                dbcA = (int)((double)(dbcA - (defense - defensePen2)) * e);
                int n = dbcA = dbcA < 1 ? 1 : dbcA;
                if ((double)((float)(dbcAO * defensePenetration) * 0.01f) * e > (double)dbcA) {
                    dbcA = (int)((double)((float)(dbcAO * defensePenetration) * 0.01f) * e);
                }
                dbcA = (int)((double)dbcA / per);
                if (JRMCoreConfig.DebugInfo || difp.length() > 0 && player.getCommandSenderName().equalsIgnoreCase(difp)) {
                    mod_JRMCore.logger.info(player.getCommandSenderName() + " DM: A=" + dbcA + ", DF Div:" + per + ", " + ss);
                }
                if (JRMCoreH.DBC()) {
                    ItemStack stackbody = ExtendedPlayer.get((EntityPlayer)player).inventory.getStackInSlot(1);
                    ItemStack stackhead = ExtendedPlayer.get((EntityPlayer)player).inventory.getStackInSlot(2);
                    if (stackbody != null) {
                        stackbody.damageItem(1, (EntityLivingBase)player);
                    }
                    if (stackhead != null) {
                        stackhead.damageItem(1, (EntityLivingBase)player);
                    }
                }
                int n2 = set = (all = (curBody = JRMCoreH.getInt(player, CurBody)) - dbcA) < 0 ? 0 : all;
                if (dse && (friendlyFist = JRMCoreH.PlyrSettingsB((EntityPlayer)s.getEntity(), 12)) && !s.getDamageType().equals("MajinAbsorption") && !s.getEntity().equals((Object)Player)) {
                    int ko = JRMCoreH.getInt(player, KO);
                    int n3 = set = all < 20 ? 20 : all;
                    if (ko <= 0 && set == 20) {
                        JRMCoreH.setInt(6, player, KO);
                        JRMCoreH.setByte(race == 4 ? (state < 4 ? state : (byte)4) : (byte)0, player, St);
                        JRMCoreH.setByte(0, player, St2);
                        JRMCoreH.setByte(0, player, CurRelease);
                        JRMCoreH.setInt(0, player, CurStamina);
                        JRMCoreH.StusEfcts(19, ste, player, false);
                    }
                    dbcA -= all;
                }
                if (!JRMCoreH.isInCreativeMode((Entity)player)) {
                    JRMCoreH.setInt(set, player, CurBody);
                }
            }
        }
        return dbcA;
    }

    public static void jrmcExp(Entity shootingEntity, int e) {
        JRMCoreH.jrmcExp(shootingEntity, e, -1);
    }

    public static void jrmcExp(Entity shootingEntity, int e, int expGainMode) {
        if (shootingEntity != null && !shootingEntity.worldObj.isRemote && shootingEntity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)shootingEntity;
            Random rand = new Random();
            MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
            int groundID = JRMCoreH.getInt(player, SagaGID);
            if (server.getAllUsernames() != null && server.getAllUsernames().length > 0) {
                int membersCount = 0;
                for (int pl = 0; pl < server.getAllUsernames().length; ++pl) {
                    EntityPlayerMP en = JRMCoreH.getPlayerForUsername(server, server.getAllUsernames()[pl]);
                    int egid = JRMCoreH.getInt((EntityPlayer)en, SagaGID);
                    if (egid != groundID) continue;
                    ++membersCount;
                }
                JGPlayerMP jgPlayer = new JGPlayerMP(player);
                jgPlayer.connectBaseNBT();
                byte race = jgPlayer.getRace();
                int tpGain = expGainMode == -1 ? JRMCoreConfig.tpgn : JRMCoreConfig.getTPGainEnergy(expGainMode);
                tpGain = (int)((float)tpGain * JRMCoreConfig.TPGainRace[race]);
                if (membersCount > 0 && e >= membersCount && groundID != 0) {
                    int ei = e / membersCount;
                    for (int pl = 0; pl < server.getAllUsernames().length; ++pl) {
                        byte release;
                        EntityPlayerMP en = JRMCoreH.getPlayerForUsername(server, server.getAllUsernames()[pl]);
                        int egid = JRMCoreH.getInt((EntityPlayer)en, SagaGID);
                        String elid = JRMCoreH.getString((EntityPlayer)en, SagaGLID);
                        if (egid != groundID || (release = JRMCoreH.getByte((EntityPlayer)en, CurRelease)) < 5) continue;
                        byte rc = JRMCoreH.getByte((EntityPlayer)en, R);
                        byte st = JRMCoreH.getByte((EntityPlayer)en, St);
                        int tp = JRMCoreH.getInt((EntityPlayer)en, TPint);
                        byte d = JRMCoreH.getByte((EntityPlayer)en, Diff);
                        int t = JRMCoreH.expgnrt(rc, st, d, (EntityPlayer)en);
                        t = (int)((float)t - (float)membersCount * 2.0f);
                        int randomInt = rand.nextInt(100);
                        if (randomInt < t) {
                            int result = tp + tpGain * e;
                            if (result > JRMCoreH.getMaxTP()) {
                                result = JRMCoreH.getMaxTP();
                            }
                            JRMCoreH.setInt(result, (EntityPlayer)en, TPint);
                        }
                        if (!elid.equalsIgnoreCase(en.getCommandSenderName())) continue;
                    }
                } else {
                    byte release = JRMCoreH.getByte(player, CurRelease);
                    if (release >= 5) {
                        byte rc = JRMCoreH.getByte(player, R);
                        byte st = JRMCoreH.getByte(player, St);
                        int tp = JRMCoreH.getInt(player, TPint);
                        byte d = JRMCoreH.getByte(player, Diff);
                        int t = JRMCoreH.expgnrt(rc, st, d, player);
                        int randomInt = rand.nextInt(100);
                        if (randomInt < t) {
                            int result = tp + tpGain * e;
                            if (result > JRMCoreH.getMaxTP()) {
                                result = JRMCoreH.getMaxTP();
                            }
                            JRMCoreH.setInt(result, player, TPint);
                        }
                    }
                }
            }
        }
    }

    public static int expgnrt(int rc, int st, int d, EntityPlayer p) {
        float w = 1.0f;
        if (JRMCoreH.DBC()) {
            Side side = FMLCommonHandler.instance().getEffectiveSide();
            if (side == Side.SERVER) {
                float lastGravity = JRMCoreH.getFloat(p, GravZoneForce);
                lastGravity = JRMCoreHDBC.gravity(p, lastGravity);
                int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts(p);
                float IWeight = JRMCoreH.weightExtra(PlyrAttrbts, lastGravity, p);
                w = JRMCoreH.weightPerc(PlyrAttrbts, 1, IWeight, p);
            } else {
                boolean c = JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11);
                w = JRMCoreH.weightPerc(PlyrAttrbts, 1, WeightOn, c);
            }
        }
        int rt = (rc == 0 || rc == 3 ? 25 : (rc == 4 && st < 4 ? (st + 1) * 4 : 20)) + d * 5;
        return (int)((float)rt + 32.0f * (1.0f - w) * 0.5f);
    }

    public static String techSnds(int t, int st, int sn) {
        String s;
        block28: {
            s = "";
            try {
                if (t == 0 || t == 1 || t == 5 || t == 4 || t == 6 || t == 7 || t == 8) {
                    if (st == 0) {
                        s = "DBC4." + techSndIncBeam[sn];
                    }
                    if (st == 1) {
                        s = "DBC4." + techSndFireBeam[sn];
                    }
                    if (st == 2) {
                        s = "DBC4." + techSndMoveBeam[sn];
                    }
                }
                if (t == 2) {
                    if (st == 0) {
                        s = "DBC4." + techSndIncDisk[sn];
                    }
                    if (st == 1) {
                        s = "DBC4." + techSndFireDisk[sn];
                    }
                    if (st == 2) {
                        s = "DBC4." + techSndMoveDisk[sn];
                    }
                }
                if (t == 3 && st == 1) {
                    s = "DBC4." + techSndFireLeser[sn];
                }
                if (t == 10) {
                    if (st == 0 && sn >= 0) {
                        s = techSndPMInc[sn];
                    }
                    if (st == 1 && sn >= 0) {
                        s = techSndPMFire[sn];
                    }
                    if (st == 2 && sn >= 0) {
                        s = techSndPMMove[sn];
                    }
                    if (st == 3 && sn >= 0) {
                        s = techSndPMIncFire[sn];
                    }
                }
            }
            catch (Exception e) {
                if (t == 0 || t == 1 || t == 5 || t == 4 || t == 6 || t == 7 || t == 8) {
                    if (st == 0) {
                        s = "DBC4." + techSndIncBeam[0];
                    }
                    if (st == 1) {
                        s = "DBC4." + techSndFireBeam[0];
                    }
                    if (st == 2) {
                        s = "DBC4." + techSndMoveBeam[0];
                    }
                }
                if (t == 2) {
                    if (st == 0) {
                        s = "DBC4." + techSndIncDisk[0];
                    }
                    if (st == 1) {
                        s = "DBC4." + techSndFireDisk[0];
                    }
                    if (st == 2) {
                        s = "DBC4." + techSndMoveDisk[0];
                    }
                }
                if (t == 3 && st == 1) {
                    s = "DBC4." + techSndFireLeser[0];
                }
                if (t != 10) break block28;
                if (st == 0 && sn >= 0) {
                    s = techSndPMInc[0];
                }
                if (st == 1 && sn >= 0) {
                    s = techSndPMFire[0];
                }
                if (st == 2 && sn >= 0) {
                    s = techSndPMMove[0];
                }
                if (st != 3 || sn < 0) break block28;
                s = techSndPMIncFire[0];
            }
        }
        return s;
    }

    public static void KAsounds(Entity m, int selc) {
        PD.sendToServer(new DBCPduo(selc + 1, m.getEntityId()));
    }

    public static void quad(int i, int j, int k, int l) {
        PD.sendToServer(new JRMCorePQuad(i, j, k, l));
    }

    public static void quadI(int i, int j, int k, int l) {
        PD.sendToServer(new JRMCorePQuadI((byte)i, j, k, l));
    }

    public static String numSep(long c2, char s) {
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setGroupingSeparator(s);
        DecimalFormat formatter = new DecimalFormat("###,###.##", symbols);
        return formatter.format(c2);
    }

    public static String numSep(long c2) {
        return JRMCoreH.numSep(c2, ',');
    }

    public static String createString(BigInteger number) {
        Map.Entry<BigInteger, String> entry = MAP.floorEntry(number);
        if (entry == null) {
            return "Nearly nothing";
        }
        BigInteger key = entry.getKey();
        BigInteger d = key.divide(THOUSAND);
        BigInteger m = number.divide(d);
        float f = m.floatValue() / 1000.0f;
        float rounded = (float)((int)((double)f * 100.0)) / 100.0f;
        if (rounded % 1.0f == 0.0f) {
            return (int)rounded + " " + entry.getValue();
        }
        return rounded + " " + entry.getValue();
    }

    public static void test(String numberString, String string) {
    }

    public static String numSepShort(long c2) {
        if (c2 > 100000000L) {
            BigInteger n = new BigInteger(c2 + "");
            return JRMCoreH.createString(n);
        }
        return JRMCoreH.numSep(c2);
    }

    public static String numSepShort2(long c2) {
        return String.format("%,8d", c2);
    }

    public static int txt(String s, String c, int i, boolean b, int l, int t, int c2) {
        return JRMCoreH.txt(s, c, i, b, l, t, c2, 0, 0);
    }

    public static int txt(String s, String c, int i, boolean b, int l, int t, int c2, int c3, int c4) {
        if (c2 == 0) {
            c2 = 245;
        }
        s = s.replaceAll("/n", "\n");
        FontRenderer var8 = JRMCoreClient.mc.fontRenderer;
        List lt = var8.listFormattedStringToWidth(s, c2);
        Iterator iterator = lt.iterator();
        int i2 = 0;
        int i3 = 0;
        int j = 10;
        while (iterator.hasNext()) {
            String s1 = (String)iterator.next();
            if (b && c3 <= i2 && lt.size() - c4 > i2) {
                if (i != 0 && i2 == 0) {
                    i3 = i;
                }
                var8.drawString(c + s1, l, t + i2 * j + i3, 0);
            }
            ++i2;
        }
        i2 = (int)((float)i2 + JRMCoreH.round((float)i * 0.1f, 0));
        return i2;
    }

    public static int txtH(String s, String c, int i, boolean b, int l, int t, int c2, List n) {
        return JRMCoreH.txtH(s, c, i, b, l, t, c2, 0, 0, n);
    }

    public static int txtH(String s, String c, int i, boolean b, int l, int t, int c2, int c3, int c4, List n) {
        if (c2 == 0) {
            c2 = 245;
        }
        s = s.replaceAll("/n", "\n");
        FontRenderer var8 = JRMCoreClient.mc.fontRenderer;
        List lt = var8.listFormattedStringToWidth(s, c2);
        Iterator iterator = lt.iterator();
        int i2 = 0;
        int i3 = 0;
        int j = 10;
        while (iterator.hasNext()) {
            String s1 = (String)iterator.next();
            if (b && c3 <= i2 && c4 > i2) {
                Matcher matcher;
                if (i != 0 && i2 == 0) {
                    i3 = i;
                }
                if ((matcher = JRMCoreHC.paturl.matcher(s1)).find()) {
                    int matchStart = matcher.start(1);
                    int matchEnd = matcher.end();
                    JRMCoreGuiScreen.urlToOpen = matcher.group();
                    String j2 = s1;
                    int jw = var8.getStringWidth(j2);
                    n.add(new JRMCoreGuiButtons01(198, l, t + i2 * j + i3, jw, j2, techCol[1]));
                }
                var8.drawString(c + s1, l, t + i2 * j + i3, 0);
            }
            ++i2;
        }
        i2 = (int)((float)i2 + JRMCoreH.round((float)i * 0.1f, 0));
        return i2;
    }

    public static void tpalgn(EntityPlayer Player, int tp, int algn) {
        MinecraftServer server1 = FMLCommonHandler.instance().getMinecraftServerInstance();
        int gid = JRMCoreH.getInt(Player, SagaGID);
        int saga = JRMCoreH.getInt(Player, SagaMainDBC);
        if (gid == 0) {
            JRMCoreH.setByte(algn, Player, Align);
            int tp1 = JRMCoreH.getInt(Player, TPint) + tp;
            JRMCoreH.setInt(tp1 > JRMCoreH.getMaxTP() ? JRMCoreH.getMaxTP() : tp1, Player, TPint);
        } else if (server1.getAllUsernames() != null && server1.getAllUsernames().length > 0) {
            int esaga;
            int egid;
            EntityPlayerMP en;
            int pl;
            int i = 0;
            for (pl = 0; pl < server1.getAllUsernames().length; ++pl) {
                en = JRMCoreH.getPlayerForUsername(server1, server1.getAllUsernames()[pl]);
                egid = JRMCoreH.getInt((EntityPlayer)en, SagaGID);
                esaga = JRMCoreH.getInt((EntityPlayer)en, SagaMainDBC);
                if (egid != gid || saga != esaga) continue;
                ++i;
                byte a = JRMCoreH.getByte((EntityPlayer)en, Align);
                if (algn > a) {
                    JRMCoreH.setByte(a + 5 > 100 ? 100 : a + 5, (EntityPlayer)en, Align);
                }
                if (algn < a) {
                    JRMCoreH.setByte(a - 5 < 0 ? 0 : a - 5, (EntityPlayer)en, Align);
                }
                if (algn != a) continue;
                JRMCoreH.setByte((int)a, (EntityPlayer)en, Align);
            }
            tp = tp / i == 0 ? 1 : tp / i;
            for (pl = 0; pl < server1.getAllUsernames().length; ++pl) {
                en = JRMCoreH.getPlayerForUsername(server1, server1.getAllUsernames()[pl]);
                egid = JRMCoreH.getInt((EntityPlayer)en, SagaGID);
                esaga = JRMCoreH.getInt((EntityPlayer)en, SagaMainDBC);
                if (egid != gid || saga != esaga) continue;
                int tp1 = JRMCoreH.getInt((EntityPlayer)en, TPint) + tp;
                JRMCoreH.setInt(tp1 > JRMCoreH.getMaxTP() ? JRMCoreH.getMaxTP() : tp1, (EntityPlayer)en, TPint);
            }
        }
    }

    public static int ctb(int num, int b) {
        int iResult = num % b;
        int iMultiplier = 10;
        while ((num /= b) > 0) {
            iResult = num % b * iMultiplier + iResult;
            iMultiplier *= 10;
        }
        return iResult;
    }

    public static int cfb(int s, int b) {
        int i = 0;
        int s2 = 0;
        while (s2 != s) {
            s2 = JRMCoreH.ctb(i, b);
            ++i;
        }
        return i - 1;
    }

    public static int letToNum(String s1, String s2) {
        int i1 = 0;
        int i2 = 0;
        int i = 0;
        for (int f = 0; f < ltnb.length; ++f) {
            if (s1.equals(ltnb[f])) {
                i1 = f;
            }
            if (!s2.equals(ltnb[f])) continue;
            i2 = f;
        }
        i = i1 * ltnb.length + i2;
        return i;
    }

    public static String numToLet(int i) {
        String s = "00";
        String s1 = "";
        String s2 = "";
        int i1 = i / ltnb.length;
        int i2 = i1 * ltnb.length;
        int i3 = i - i2;
        for (int f = 0; f < ltnb.length; ++f) {
            if (i1 == f) {
                s1 = ltnb[f];
            }
            if (i3 != f) continue;
            s2 = ltnb[f];
        }
        s = s1 + s2;
        return s;
    }

    public static int letToNum5(String s1, String s2, String s3, String s4, String s5) {
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i = 0;
        for (int f = 0; f < ltnb.length; ++f) {
            if (s1.equals(ltnb[f])) {
                i1 = f;
            }
            if (s2.equals(ltnb[f])) {
                i2 = f;
            }
            if (s3.equals(ltnb[f])) {
                i3 = f;
            }
            if (s4.equals(ltnb[f])) {
                i4 = f;
            }
            if (!s5.equals(ltnb[f])) continue;
            i5 = f;
        }
        i = (((i1 * ltnb.length + i2) * ltnb.length + i3) * ltnb.length + i4) * ltnb.length + i5;
        return i;
    }

    public static String numToLet5(int i) {
        String s = "00";
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        int i11 = i / ltnb.length;
        int i12 = i11 * ltnb.length;
        int i13 = i - i12;
        int i21 = i11 / ltnb.length;
        int i22 = i21 * ltnb.length;
        int i23 = i11 - i22;
        int i31 = i21 / ltnb.length;
        int i32 = i31 * ltnb.length;
        int i33 = i21 - i32;
        int i41 = i31 / ltnb.length;
        int i42 = i41 * ltnb.length;
        int i43 = i31 - i42;
        for (int f = 0; f < ltnb.length; ++f) {
            if (i41 == f) {
                s1 = ltnb[f];
            }
            if (i43 == f) {
                s2 = ltnb[f];
            }
            if (i33 == f) {
                s3 = ltnb[f];
            }
            if (i23 == f) {
                s4 = ltnb[f];
            }
            if (i13 != f) continue;
            s5 = ltnb[f];
        }
        s = s1 + s2 + s3 + s4 + s5;
        return s;
    }

    public static boolean isn(String i) {
        return i.matches(".*\\d+.*");
    }

    public static boolean smnmlt(String i) {
        return i.replaceAll("\\D+", "").length() == i.replaceAll("\\d", "").length();
    }

    public static void wld(String stringValue, String nbtID, String fileName, boolean delete) {
        try {
            File file = new File(JRMCore.configDir, fileName);
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            if (!file.exists()) {
                file.createNewFile();
            } else {
                nbttagcompound = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
            }
            if (delete) {
                nbttagcompound.removeTag(nbtID);
            } else {
                nbttagcompound.setString(nbtID, stringValue);
            }
            CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String rld(String id, String f) {
        String d = "";
        File file = new File(JRMCore.configDir, f);
        try {
            if (!file.exists()) {
                file.createNewFile();
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                NBTTagCompound nbttagcompound = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
                d = nbttagcompound.hasKey(id) ? nbttagcompound.getString(id) : "0";
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return d;
    }

    public static void wd(MinecraftServer server, String d, String id, String fd, String f, boolean b) {
        try {
            File file = new File(server.worldServerForDimension(0).getChunkSaveLocation() + fd, f);
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            if (!file.exists()) {
                file.createNewFile();
            } else {
                nbttagcompound = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
            }
            if (b) {
                nbttagcompound.removeTag(id);
            } else {
                nbttagcompound.setString(id, d);
            }
            CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void wd(MinecraftServer server, String fd, String f) {
        try {
            File file = new File(server.worldServerForDimension(0).getChunkSaveLocation() + fd, f);
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            if (!file.exists()) {
                file.createNewFile();
            }
            CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String rd(MinecraftServer server, String id, String fd, String f) {
        String d = "";
        if (server != null && server.worldServers.length > 0 && server.worldServerForDimension(0) != null && server.worldServerForDimension(0).getChunkSaveLocation() != null) {
            NBTTagCompound nbttagcompound;
            File file = new File(server.worldServerForDimension(0).getChunkSaveLocation() + fd, f);
            try {
                if (!file.exists()) {
                    file.createNewFile();
                    nbttagcompound = new NBTTagCompound();
                    CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
                }
            }
            catch (IOException nbttagcompound2) {
            }
            finally {
                try {
                    nbttagcompound = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
                    d = nbttagcompound.hasKey(id) ? nbttagcompound.getString(id) : "0";
                }
                catch (IOException nbttagcompound2) {}
            }
        }
        return d;
    }

    public static int lbs(String[] s, int i, FontRenderer fr, int gl, int gt) {
        return JRMCoreH.lbs(s, i, fr, gl, gt, 245, "\u00a70");
    }

    public static int lbs(String[] s, int i, FontRenderer fr, int gl, int gt, int w, String c) {
        for (int i1 = 0; i1 < s.length; ++i1) {
            for (String s1 : fr.listFormattedStringToWidth(s[i1], 245)) {
                fr.drawString(c + s1, gl + 6, gt + 5 + i * 10, 0);
                ++i;
            }
        }
        return i;
    }

    public static ExplosionJRMC newExpl(World worldObj, Entity entity, double par2, double par4, double par6, float par8, boolean par9, double dam, Entity origin, byte type) {
        ExplosionJRMC var10 = new ExplosionJRMC(worldObj, entity, par2, par4, par6, par8, JRMCoreConfig.expGriOff, dam, origin, type);
        var10.isFlaming = par9;
        var10.doExplosionA();
        var10.doExplosionB(true);
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.SERVER) {
            for (EntityPlayer var13 : worldObj.playerEntities) {
                if (!(var13.getDistanceSq(par2, par4, par6) < 4096.0)) continue;
                JRMCoreH.expCliPack((Entity)var13, par2, par4, par6, par8, var10.affectedBlockPositions, (Vec3)var10.func_77277_b().get((EntityPlayerMP)var13), JRMCoreConfig.expGriOff, dam, origin, type);
            }
        }
        return var10;
    }

    public static int F5CsTH(String l) {
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

    public static int rtXq4V(boolean n) {
        return JRMCoreH.checkLimit();
    }

    public static int checkLimit() {
        int b = JRMCoreConfig.tmx;
        String r = "64";
        String k = "3B9ACA00";
        return b > JRMCoreH.F5CsTH(k) ? JRMCoreH.F5CsTH(k) : (b < JRMCoreH.F5CsTH(r) ? 0 : b);
    }

    public static int etXq4V(int b) {
        String k = "3B9ACA00";
        return b > JRMCoreH.F5CsTH(k) ? JRMCoreH.F5CsTH(k) : b;
    }

    public static void expCliPack(Entity player, double par1, double par3, double par5, float par7, List par8List, Vec3 par9Vec3, boolean expGriOff, double dam, Entity origin, byte type) {
        explosionX = par1;
        explosionY = par3;
        explosionZ = par5;
        explosionSize = par7;
        JRMCoreConfig.expGriOff = expGriOff;
        expDam = dam;
        origin1 = origin;
        chunkPositionRecords = new ArrayList(par8List);
        if (par9Vec3 != null) {
            playerVelocityX = 0.0f;
            playerVelocityY = 0.0f;
            playerVelocityZ = 0.0f;
        }
        extype = type;
        if (player != null && origin != null) {
            PD.sendToDimension(new JRMCorePExpl(explosionX, explosionY, explosionZ, explosionSize, JRMCoreConfig.expGriOff, expDam, origin, chunkPositionRecords, playerVelocityX, playerVelocityY, playerVelocityZ, type), origin.dimension);
        }
    }

    public static String trlai(String s1, String s2) {
        s1 = modAssetIDs.get(s1);
        return s1 + s2;
    }

    public static String trlai(String s1) {
        return s1;
    }

    public static String trlws(String s1, String s2) {
        s1 = modAssetIDs.get(s1);
        return JRMCoreH.trl(s1 + s2);
    }

    public static String trl(String s1, String s2) {
        s1 = modAssetIDs.get(s1);
        return JRMCoreH.trl(s1 + s2);
    }

    public static String trl(String s1) {
        return StatCollector.translateToLocal((String)s1);
    }

    public static String trl(String s1, String s2, Object ... args) {
        return JRMCoreH.cct(JRMCoreH.trl(s1, s2), args);
    }

    public static String trl(String s1, Object ... args) {
        return JRMCoreH.cct(JRMCoreH.trl(s1), args);
    }

    public static String cct(String s1, Object ... args) {
        return new ChatComponentTranslation(s1, args).getUnformattedText();
    }

    public static EntityPlayerMP getPlayerForUsername(MinecraftServer server, String s) {
        return server.getConfigurationManager().func_152612_a(s);
    }

    public static Item getItemByText(String p_147179_1_) {
        Item item = (Item)Item.itemRegistry.getObject(p_147179_1_);
        if (item == null) {
            try {
                Item item1 = Item.getItemById((int)Integer.parseInt(p_147179_1_));
                if (item1 != null) {
                    ChatComponentTranslation chatcomponenttranslation = new ChatComponentTranslation("commands.generic.deprecatedId", new Object[]{Item.itemRegistry.getNameForObject((Object)item1)});
                    chatcomponenttranslation.getChatStyle().setColor(EnumChatFormatting.GRAY);
                }
                item = item1;
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return item;
    }

    public static int d(String s, int i) {
        return i == 3 ? JRMCoreH.ltn5(JRMCoreH.sa(s, 6), JRMCoreH.sa(s, 7), JRMCoreH.sa(s, 8), JRMCoreH.sa(s, 9), JRMCoreH.sa(s, 10)) : JRMCoreH.ltn(JRMCoreH.sa(s, i == 0 ? 0 : (i == 1 ? 2 : (i == 2 ? 4 : 11))), JRMCoreH.sa(s, i == 0 ? 1 : (i == 1 ? 3 : (i == 2 ? 5 : 12))));
    }

    public static String sa(String s1, int s2) {
        return s1.charAt(s2) + "";
    }

    public static int saI(String s1, int s2) {
        return Integer.parseInt(s1.charAt(s2) + "");
    }

    public static int ltn(String s1, String s2) {
        return JRMCoreH.letToNum(s1, s2);
    }

    public static int ltn5(String s1, String s2, String s3, String s4, String s5) {
        return JRMCoreH.letToNum5(s1, s2, s3, s4, s5);
    }

    private static String ntl(int i) {
        return JRMCoreH.numToLet(i);
    }

    private static String ntl5(int i) {
        return JRMCoreH.numToLet5(i);
    }

    public static int dnsRace(String s) {
        int i = 0;
        return s != null && s.length() > i ? JRMCoreH.ltn(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1)) : 0;
    }

    public static int dnsGender(String s) {
        int i = 2;
        return s != null && s.length() > i ? Integer.parseInt(JRMCoreH.sa(s, i)) : 0;
    }

    public static int dnsHairB(String s) {
        int i = 3;
        return s != null && s.length() > i ? JRMCoreH.ltn(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1)) : 10;
    }

    public static int dnsHairF(String s) {
        int i = 5;
        return s != null && s.length() > i ? JRMCoreH.ltn(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1)) : 0;
    }

    public static int dnsHairC(String s) {
        int i = 7;
        return s != null && s.length() > i ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 0;
    }

    public static int dnsBreast(String s) {
        int i = 12;
        return s != null && s.length() > i ? Integer.parseInt(JRMCoreH.sa(s, i)) : 0;
    }

    public static int dnsSkinT(String s) {
        int i = 13;
        return s != null && s.length() > i ? Integer.parseInt(JRMCoreH.sa(s, i)) : 0;
    }

    public static int dnsBodyT(String s) {
        int i = 14;
        return s != null && s.length() > i + 6 ? JRMCoreH.ltn(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1)) : 0;
    }

    public static int dnsBodyCM(String s) {
        int i = 16;
        return s != null && s.length() > i + 6 ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 0;
    }

    public static int dnsBodyC1(String s) {
        int i = 21;
        return s != null && s.length() > i + 6 ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 0;
    }

    public static int dnsBodyC2(String s) {
        int i = 26;
        return s != null && s.length() > i + 6 ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 0;
    }

    public static int dnsBodyC3(String s) {
        int i = 31;
        return s != null && s.length() > i + 6 ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 0;
    }

    public static int dnsFaceN(String s) {
        int i = 36;
        return s != null && s.length() > i ? JRMCoreH.ltn(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1)) : 0;
    }

    public static int dnsFaceM(String s) {
        int i = 38;
        return s != null && s.length() > i ? JRMCoreH.ltn(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1)) : 0;
    }

    public static int dnsEyes(String s) {
        int i = 40;
        return s != null && s.length() > i ? JRMCoreH.ltn(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1)) : 0;
    }

    public static int dnsEyeC1(String s) {
        int i = 42;
        return s != null && s.length() > i ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 0;
    }

    public static int dnsEyeC2(String s) {
        int i = 47;
        return s != null && s.length() > i ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 0;
    }

    public static int dnsBodyC1_0(String s) {
        int i = 14;
        return s != null && s.length() > i ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 0;
    }

    public static String dnsGenderSet(String s, String w) {
        int i = 2;
        return s != null && s.length() > i ? s.substring(0, i) + w + s.substring(i + 1) : "0";
    }

    public static String dnsHairBSet(String s, int w) {
        int i = 3;
        return s != null && s.length() > i ? s.substring(0, i) + JRMCoreH.ntl(w) + s.substring(i + 2) : "0";
    }

    public static String dnsHairFSet(String s, int w) {
        int i = 5;
        return s != null && s.length() > i ? s.substring(0, i) + JRMCoreH.ntl(w) + s.substring(i + 2) : "0";
    }

    public static String dnsHairCSet(String s, int w) {
        int i = 7;
        return s != null && s.length() > i ? s.substring(0, i) + JRMCoreH.ntl5(w) + s.substring(i + 5) : "0";
    }

    public static int dnsHair1(String s, int n) {
        if (s != null && s.length() > n - 1) {
            int value = 0;
            try {
                value = Integer.parseInt(JRMCoreH.sa(s, n));
            }
            catch (Exception exception) {
                // empty catch block
            }
            return value;
        }
        return 0;
    }

    public static int dnsHair2(String s, int n) {
        if (s != null && s.length() > n) {
            int value = 0;
            try {
                value = Integer.parseInt(JRMCoreH.sa(s, n) + JRMCoreH.sa(s, n + 1));
            }
            catch (Exception exception) {
                // empty catch block
            }
            return value;
        }
        return 0;
    }

    public static String dnsHair1set(String s, int n, String w) {
        return s != null && s.length() > n - 1 ? s.substring(0, n) + w + s.substring(n + 1) : "0";
    }

    public static String dnsHair2set(String s, int n, String w) {
        return s != null && s.length() > n ? s.substring(0, n) + w + s.substring(n + 2) : "0";
    }

    public static float dnsHairG(String s) {
        return (float)(s.length() == 786 ? Integer.parseInt(JRMCoreH.sa(s, 784) + JRMCoreH.sa(s, 785)) : (s.length() == 392 ? 10 : 0)) * 0.1f;
    }

    public static String dnsHairG1toG2(String s) {
        String g2 = "";
        if (s.length() == 392) {
            for (int face = 0; face < 56; ++face) {
                int l = JRMCoreH.dnsHair1(s, face * 7) * 11 - 10;
                l = l < 0 ? 0 : l;
                int X = JRMCoreH.dnsHair2(s, face * 7 + 1);
                int Y = JRMCoreH.dnsHair2(s, face * 7 + 3);
                int Z = JRMCoreH.dnsHair2(s, face * 7 + 5);
                String L = "" + (l < 10 ? "0" + l : Integer.valueOf(l));
                g2 = g2 + L + "" + X + "" + Y + "" + Z + "505000";
            }
            g2 = g2 + "20";
        } else {
            g2 = s.length() == 784 ? s + "20" : s;
        }
        return g2;
    }

    public static int dnsauCM(String s) {
        int i = 0;
        return s != null && s.length() > i + 4 ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 14208118;
    }

    public static int dnsauC1(String s) {
        int i = 5;
        return s != null && s.length() > i + 4 ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 10317733;
    }

    public static int dnsauC2(String s) {
        int i = 10;
        return s != null && s.length() > i + 4 ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 6966676;
    }

    public static int dnsauC3(String s) {
        int i = 15;
        return s != null && s.length() > i + 4 ? JRMCoreH.ltn5(JRMCoreH.sa(s, i), JRMCoreH.sa(s, i + 1), JRMCoreH.sa(s, i + 2), JRMCoreH.sa(s, i + 3), JRMCoreH.sa(s, i + 4)) : 11045420;
    }

    public static void wwi(MinecraftServer server, String d, String rid, boolean b) {
        String wd = "/data";
        JRMCoreH.wd(server, d, rid + "", wd, wi, b);
    }

    public static String rwi(MinecraftServer server, String id) {
        String wd = "/data";
        return JRMCoreH.rd(server, id + "", wd, wi);
    }

    public static void bswwi(MinecraftServer server, String d, boolean b) {
        JRMCoreH.wwi(server, d, bs, b);
    }

    public static String bsrwi(MinecraftServer server) {
        return JRMCoreH.rwi(server, bs);
    }

    public static void wwip(MinecraftServer server, String d, String rid, boolean b) {
        String wd = "/data";
        JRMCoreH.wd(server, d, rid + "", wd, wip, b);
    }

    public static String rwip(MinecraftServer server, String id) {
        String wd = "/data";
        return JRMCoreH.rd(server, id + "", wd, wip);
    }

    public static void init() {
        modAssetIDs.put("nc", tjnc + ".");
        modAssetIDs.put("dbc", tjdbc + ".");
        modAssetIDs.put("fc", tjfc + ".");
        modAssetIDs.put("yc", tjyc + ".");
        modAssetIDs.put("jrmc", tjrmc + ".");
        modAssetIDs.put("saoc", tjsaoc + ".");
        modAssetIDs.put("bc", tjbc + ".");
    }

    public static void addItemWeightStats(ItemStack p_92115_1_, Object ... args) {
        NBTTagList nbttaglist = JRMCoreH.ItemWeightStatsNBTTag(p_92115_1_);
        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
            if (nbttagcompound.getFloat("weight") != 0.0f) continue;
            return;
        }
        NBTTagCompound nbttagcompound1 = new NBTTagCompound();
        nbttagcompound1.setFloat("weight", Float.parseFloat("" + args[0]));
        nbttaglist.appendTag((NBTBase)nbttagcompound1);
        if (!p_92115_1_.hasTagCompound()) {
            p_92115_1_.setTagCompound(new NBTTagCompound());
        }
        p_92115_1_.getTagCompound().setTag("DBCItemWeightStats", (NBTBase)nbttaglist);
    }

    public static NBTTagList ItemWeightStatsNBTTag(ItemStack p_92110_1_) {
        return p_92110_1_.stackTagCompound != null && p_92110_1_.stackTagCompound.hasKey("DBCItemWeightStats") ? (NBTTagList)p_92110_1_.stackTagCompound.getTag("DBCItemWeightStats") : new NBTTagList();
    }

    public static float getItemWeight(ItemStack is) {
        int i;
        NBTTagList nbttaglist = JRMCoreH.ItemWeightStatsNBTTag(is);
        if (nbttaglist != null && (i = 0) < nbttaglist.tagCount()) {
            float weight = nbttaglist.getCompoundTagAt(i).getFloat("weight");
            return weight;
        }
        return 0.0f;
    }

    public static String ItemWeightOn(ItemStack itemStack) {
        if (itemStack != null && JRMCoreH.DBC()) {
            return JRMCoreHDBC.ItemWeightOn(itemStack) + "," + itemStack.getItemDamage();
        }
        return "-1,0";
    }

    public static void log(String d) {
        System.out.println(d);
    }

    public static void log(int d) {
        JRMCoreH.log("" + d);
    }

    public static void log(double d) {
        JRMCoreH.log("" + d);
    }

    public static void log(long d) {
        JRMCoreH.log("" + d);
    }

    public static void log(float d) {
        JRMCoreH.log("" + d);
    }

    public static void log(short d) {
        JRMCoreH.log("" + d);
    }

    public static void log(byte d) {
        JRMCoreH.log("" + d);
    }

    public static EntityPlayer getClosestPlayerToEntity(Entity p_72890_1_, double p_72890_2_) {
        return JRMCoreH.getClosestPlayer(p_72890_1_, p_72890_1_.posX, p_72890_1_.posY, p_72890_1_.posZ, p_72890_2_);
    }

    public static EntityPlayer getClosestPlayer(Entity p_72890_1_, double p_72977_1_, double p_72977_3_, double p_72977_5_, double p_72977_7_) {
        double d4 = -1.0;
        EntityPlayer entityplayer = null;
        for (int i = 0; i < p_72890_1_.worldObj.playerEntities.size(); ++i) {
            EntityPlayer entityplayer1 = (EntityPlayer)p_72890_1_.worldObj.playerEntities.get(i);
            if (p_72890_1_.equals((Object)entityplayer1)) continue;
            double d5 = entityplayer1.getDistanceSq(p_72977_1_, p_72977_3_, p_72977_5_);
            if (!(p_72977_7_ < 0.0) && !(d5 < p_72977_7_ * p_72977_7_) || d4 != -1.0 && !(d5 < d4)) continue;
            d4 = d5;
            entityplayer = entityplayer1;
        }
        return entityplayer;
    }

    public static String turihr(String u) {
        return turih.get(u) != null ? turih.get(u) : "";
    }

    public static void tur(final String u) {
        turih.put(u, "loading");
        Thread one = new Thread(){

            @Override
            public void run() {
                String rvf = u;
                String line = null;
                String lines = "";
                boolean empty = false;
                boolean count = false;
                StringBuilder content = new StringBuilder();
                try {
                    URL url = new URL(u);
                    InputStreamReader isr = new InputStreamReader(url.openStream());
                    BufferedReader reader = new BufferedReader(isr);
                    while ((line = reader.readLine()) != null) {
                        content.append(line);
                    }
                    turih.put(u, content.toString());
                    reader.close();
                    isr.close();
                }
                catch (Exception e) {
                    turih.put(u, "error");
                }
                this.interrupt();
            }
        };
        one.start();
    }

    public static boolean updateEveryXTick(int tick, int updateTick) {
        if (updateTick == 1) {
            return true;
        }
        int tickMod = tick / updateTick * updateTick;
        return tick == (tickMod == 0 ? updateTick : tickMod);
    }

    public static boolean isInCreativeMode(Entity player) {
        return player instanceof EntityPlayer ? ((EntityPlayer)player).capabilities.isCreativeMode : false;
    }

    public static void playerUsedInstantTransmission(EntityPlayer entity) {
        if (entity != null) {
            JRMCoreH.jrmctAll(50, entity.getEntityId() + ";" + entity.posX + ";" + entity.posY + ";" + entity.posZ);
        }
    }

    public static int getMajinFormID(int state, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        return isMysticOn ? 5 : (isUltraInstinctOn ? 6 : (isGoDOn ? 7 : state));
    }

    public static int getArcosianFormID(int state, boolean isMysticOn, boolean isUltraInstinctOn, boolean isGoDOn) {
        return isMysticOn ? 8 : (isUltraInstinctOn ? 9 : (isGoDOn ? 10 : state));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static void clearEmptyFamiliesNBTData(MinecraftServer server) {
        block21: {
            block22: {
                block23: {
                    File file;
                    block20: {
                        if (!JRMCoreH.JFC()) break block22;
                        if (familyCEmptyFamiliesCleared) break block23;
                        String emptyFamily = ",0!l,e!0";
                        String emptyFamilyNew = "EMPTY";
                        String f = FamilyCH.fif;
                        String fd = "/data";
                        if (server == null || server.worldServers.length <= 0 || server.worldServerForDimension(0) == null || server.worldServerForDimension(0).getChunkSaveLocation() == null) break block21;
                        file = new File(server.worldServerForDimension(0).getChunkSaveLocation() + "/data", f);
                        if (file.exists()) break block20;
                        file.createNewFile();
                        NBTTagCompound nbttagcompound = new NBTTagCompound();
                        CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
                    }
                    try {
                        int deletedFamilies = 0;
                        NBTTagCompound nbttagcompound = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
                        String content = nbttagcompound.toString().replace(":\"", "");
                        String[] families = content.split("\",");
                        if (families != null && families.length > 0) {
                            int length = families.length;
                            families[0] = families[0].substring(1);
                            families[length - 1] = families[length - 1].substring(families[length - 1].length()) + "";
                            for (int i = 0; i < length; ++i) {
                                boolean hasIt;
                                families[i] = families[i].replace(",0!l,e!0", ",EMPTY");
                                String[] familyValues = families[i].split(",");
                                boolean bl = hasIt = familyValues != null && familyValues.length > 2 && familyValues[2].equals("EMPTY") && nbttagcompound.hasKey(familyValues[0] + ",0");
                                if (!hasIt) continue;
                                nbttagcompound.removeTag(familyValues[0] + ",0");
                                ++deletedFamilies;
                            }
                        }
                        familyCEmptyFamiliesCleared = true;
                        previousServerFolder = server.getFolderName();
                        JRMCoreH.log("Family C Removed Empty Families: " + deletedFamilies);
                        if (deletedFamilies > 0) {
                            CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
                        }
                        break block21;
                    }
                    catch (IOException deletedFamilies) {}
                    break block21;
                    catch (IOException deletedFamilies) {
                        try {
                            int deletedFamilies2 = 0;
                            NBTTagCompound nbttagcompound = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
                            String content = nbttagcompound.toString().replace(":\"", "");
                            String[] families = content.split("\",");
                            if (families != null && families.length > 0) {
                                int length = families.length;
                                families[0] = families[0].substring(1);
                                families[length - 1] = families[length - 1].substring(families[length - 1].length()) + "";
                                for (int i = 0; i < length; ++i) {
                                    boolean hasIt;
                                    families[i] = families[i].replace(",0!l,e!0", ",EMPTY");
                                    String[] familyValues = families[i].split(",");
                                    boolean bl = hasIt = familyValues != null && familyValues.length > 2 && familyValues[2].equals("EMPTY") && nbttagcompound.hasKey(familyValues[0] + ",0");
                                    if (!hasIt) continue;
                                    nbttagcompound.removeTag(familyValues[0] + ",0");
                                    ++deletedFamilies2;
                                }
                            }
                            familyCEmptyFamiliesCleared = true;
                            previousServerFolder = server.getFolderName();
                            JRMCoreH.log("Family C Removed Empty Families: " + deletedFamilies2);
                            if (deletedFamilies2 > 0) {
                                CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
                            }
                            break block21;
                        }
                        catch (IOException iOException) {}
                        break block21;
                        catch (Throwable throwable) {
                            try {
                                int deletedFamilies3 = 0;
                                NBTTagCompound nbttagcompound = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
                                String content = nbttagcompound.toString().replace(":\"", "");
                                String[] families = content.split("\",");
                                if (families != null && families.length > 0) {
                                    int length = families.length;
                                    families[0] = families[0].substring(1);
                                    families[length - 1] = families[length - 1].substring(families[length - 1].length()) + "";
                                    for (int i = 0; i < length; ++i) {
                                        boolean hasIt;
                                        families[i] = families[i].replace(",0!l,e!0", ",EMPTY");
                                        String[] familyValues = families[i].split(",");
                                        boolean bl = hasIt = familyValues != null && familyValues.length > 2 && familyValues[2].equals("EMPTY") && nbttagcompound.hasKey(familyValues[0] + ",0");
                                        if (!hasIt) continue;
                                        nbttagcompound.removeTag(familyValues[0] + ",0");
                                        ++deletedFamilies3;
                                    }
                                }
                                familyCEmptyFamiliesCleared = true;
                                previousServerFolder = server.getFolderName();
                                JRMCoreH.log("Family C Removed Empty Families: " + deletedFamilies3);
                                if (deletedFamilies3 > 0) {
                                    CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
                                }
                            }
                            catch (IOException iOException) {
                                // empty catch block
                            }
                            throw throwable;
                        }
                    }
                }
                if (server != null && server.getFolderName() != null && !server.getFolderName().equals(previousServerFolder)) {
                    familyCEmptyFamiliesCleared = false;
                }
                break block21;
            }
            familyCEmptyFamiliesCleared = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static NBTTagCompound readNBTFile(MinecraftServer server, String fileDirectory, String fileName) {
        if (server != null && server.worldServers.length > 0 && server.worldServerForDimension(0) != null && server.worldServerForDimension(0).getChunkSaveLocation() != null) {
            NBTTagCompound nbttagcompound;
            File file = new File(server.worldServerForDimension(0).getChunkSaveLocation() + fileDirectory, fileName);
            try {
                if (!file.exists()) {
                    file.createNewFile();
                    nbttagcompound = new NBTTagCompound();
                    CompressedStreamTools.writeCompressed((NBTTagCompound)nbttagcompound, (OutputStream)new FileOutputStream(file));
                }
            }
            catch (IOException nbttagcompound2) {
            }
            finally {
                try {
                    nbttagcompound = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
                    return nbttagcompound;
                }
                catch (IOException nbttagcompound2) {}
            }
        }
        return null;
    }

    public static String getDataFromNBT(String id, NBTTagCompound nbttagcompound) {
        if (nbttagcompound.hasKey(id)) {
            return nbttagcompound.getString(id);
        }
        return "0";
    }

    /*
     * Opcode count of 15938 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    static {
        kiAmount = 0;
        kiMultip = 0.0;
        dbcHealthCur = 0;
        dbcBP = null;
        jrmcExp = 0;
        dbcEvilness = 0;
        dbcHealth = 0;
        dbcTrainPoint = 0;
        kiMax = 0;
        kiChargRa = 0;
        kiDash = 0;
        kiPunch = 0;
        kiJump = 0;
        kiFly = 0;
        kiAsclvl = 0;
        kiAscPow = 0;
        DSpeed = 0;
        minKi = 1;
        SEvil = "e.dbc";
        SHealth = "h.dbc";
        STrainPoint = "t.dbc";
        SkiMax = "m.dbc";
        SkiChargRa = "r.dbc";
        SkiDash = "d.dbc";
        SkiPunch = "p.dbc";
        SkiJump = "j.dbc";
        SkiFly = "f.dbc";
        SkiAsclvl = "l.dbc";
        SkiAscPow = "a.dbc";
        kiKaioKen = 0;
        kiInSuper = 0;
        KABigBang = 0;
        KABlast = 0;
        KABurningAtt = 0;
        KADeathBeam = 0;
        KADodon = 0;
        KAEnergyDisk = 0;
        KAFinalFlash = 0;
        KAFingerLaser = 0;
        KAGalicGun = 0;
        KAKameHame = 0;
        KAKameHame10x = 0;
        KAMakanko = 0;
        KAMasenko = 0;
        KAPlanetDest = 0;
        KASpiritBomb = 0;
        KTKaioken = 0;
        KASelected = 0;
        KACharge = 0;
        KAFired = 0;
        KAFireStop = 0;
        Senzu = 0;
        driF = false;
        driB = false;
        driU = false;
        driD = false;
        dbchalo = false;
        dbcLieDown = new String[]{"dbcLie", "dbcStand"};
        Har = "_A01";
        Col = "_C0";
        ChakraAmount = 0;
        ChakraMultip = 0.0;
        hsp = "";
        jutsumode = 0;
        handsealfailed = 0;
        jutsu = 0;
        jutsuinfo = 0;
        ncDou = null;
        ncBodyCur = 0;
        ncExp = 0;
        ncEvil = 0;
        ncBody = 0;
        ncTP = 0;
        ncChMax = 0;
        ncChRa = 0;
        ncSpe = 0;
        ncTai = 0;
        ncTaiJump = 0;
        ncNinj = 0;
        ncGenj = 0;
        ncPow = 0;
        Sbody = "h.dbc";
        Stp = "t.dbc";
        SchMax = "x.dbc";
        SchRa = "c.dbc";
        Sspe = "d.dbc";
        Stai = "p.dbc";
        StaiJump = "j.dbc";
        SNinj = "n.dbc";
        SGenj = "g.dbc";
        SPow = "a.dbc";
        plyrsArnd = null;
        AttrbtNbt = new String[]{"jrmcStr", "jrmcDex", "jrmcCns", "jrmcWil", "jrmcInt", "jrmcCnc"};
        AttrbtNbtI = new String[]{"jrmcStrI", "jrmcDexI", "jrmcCnsI", "jrmcWilI", "jrmcIntI", "jrmcCncI"};
        AttrbtNbtR = new String[]{"jrmcStrR", "jrmcDexR", "jrmcCnsR", "jrmcWilR", "jrmcIntR", "jrmcCncR"};
        SkillsNbt = new String[]{SklSlt0, SklSlt1, SklSlt2, SklSlt3, SklSlt4, SklSlt5, SklSlt6, SklSlt7, SklSlt8, SklSlt9};
        FAttrbtNbt = new String[]{"jrmcStrF", "jrmcDexF", "jrmcCnsF", "jrmcWilF", "jrmcIntF", "jrmcCncF"};
        FznDC = "";
        Master = 0;
        MSD = "";
        MSDV = "";
        SagaProg = 0;
        SagaTimes = 0;
        SagaSideProg = 0;
        SagaSideTimes = null;
        GID = 0;
        GLID = " ";
        GIDs = null;
        GIDi = " ";
        GMN = 0;
        nwl = new HashMap();
        ServerPoints = 0;
        trngTPlmt = 0;
        trngTPlmt2 = 0;
        revTmr = 0;
        revtpInit = "";
        wishes = 0;
        Race = 0;
        dns = "0";
        dnsau = "0";
        dnsH = "0";
        Pwrtyp = 0;
        Class = 0;
        Accepted = 0;
        State = 0;
        State2 = 0;
        Dffclty = 0;
        TlMd = 0;
        PtchVc = 0;
        GTrnngCB = 0;
        WeightOn = 0.0f;
        GravZone = 1.0f;
        s4ft = 0;
        age = 0.0f;
        curBody = 0;
        curEnergy = 0;
        curStamina = 0;
        maxBody = 0;
        maxEnergy = 0;
        maxStamina = 0;
        curRelease = 0;
        curTP = 0;
        curExp = 0;
        curn = 0;
        cura = 0;
        ko = 0;
        kob = false;
        pnp = 0;
        pnh = false;
        charged = 0;
        chrgPrc = 0;
        channel = 0;
        wave = 0;
        mrAtts = false;
        EnAtSlct = 0;
        curTech1CD = 0.0f;
        curTech2CD = 0.0f;
        curTech3CD = 0.0f;
        curTech4CD = 0.0f;
        curTech5CD = 0.0f;
        curTech6CD = 0.0f;
        curTech7CD = 0.0f;
        curTech8CD = 0.0f;
        isShtng = false;
        isChrgng = false;
        cast = 0.0f;
        align = 0;
        karma = 0;
        techniqueCooldowns = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        PlyrSettings = "";
        PlyrAttrbts = new int[]{0, 0, 0, 0, 0, 0};
        PlyrSkillX = "";
        PlyrSkillY = "";
        PlyrSkillZ = "";
        PlyrSkills = new String[10];
        StusEfcts = new String[]{"F", "R", "T", "B", "A", "K", "M", "S", "O", "D", "Z", "I", "J", "C", "L", "E", "U", "V", "P", "N", "G", "H"};
        PlyrSttngs = new String[]{"K", "R", "D", "G", "Z", "B", "M", "E", "O", "F", "P", "U", "I", "S", "A", "C", "H"};
        vlblRSkls = new String[]{"TR"};
        DBCRacialSkillTPCost = new int[Races.length][];
        cDBCRacialSkillTPCost = new int[Races.length][];
        DBCRacialSkillMindCost = new int[Races.length][];
        cDBCRacialSkillMindCost = new int[Races.length][];
        vlblRSklsNms = new String[]{"HiddenPotential", "SuperForm", "SuperForm", "PowerBoost", "Transformations", "Abilities"};
        vlblCSkls = new String[]{"HL"};
        vlblCSklsLvl = new int[][]{{10}};
        vlblCSklsNms = new String[]{"Heal"};
        DBCSkillsIDs = new String[]{"FZ", "JP", "DS", "FL", "EN", "OC", "KS", "MD", "KK", "GF", "OK", "KP", "KF", "KB", "DF", "KI", "UI", "IT", "GD"};
        vlblSklsUps = new int[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 1, 8, 8, 8, 8, 8, 8, -1, 8, -1};
        DBCSkillTPCost = new int[DBCSkillsIDs.length][];
        cDBCSkillTPCost = new int[DBCSkillsIDs.length][];
        DBCSkillMindCost = new int[DBCSkillsIDs.length][];
        cDBCSkillMindCost = new int[DBCSkillsIDs.length][];
        DBCSkillNames = new String[]{"Fusion", "Jump", "Dash", "Fly", "Endurance", "PotentialUnlock", "KiSense", "Meditation", trans_KAIOKEN, "GodForm", "OldKaiUnlock", "KiProtection", "KiFist", "KiBoost", "DefensePenetration", "KiInfuse", "UltraInstinct", "InstantTransmission", trans_GOD_OF_DESTRUCTION};
        inIll = null;
        ncRSkls = new String[]{""};
        ncRSklsLvl = new int[][]{{10, 25, 35, 30, 50, 100, 200, 500, 1000}};
        ncRSklsNms = new String[]{""};
        ncCSkls = new String[]{"", "BG", "SG"};
        NCRacialSkillAbilityNames = new String[]{"", "Byakugan", "Sharingan"};
        NCRacialSkillTPCost = new int[Clans.length][];
        cNCRacialSkillTPCost = new int[Clans.length][];
        NCRacialSkillMindCost = new int[Clans.length][];
        cNCRacialSkillMindCost = new int[Clans.length][];
        NCSkillIDs = new String[]{"TJ", "NJ", "GJ", "CC", "AF", "AD", "AL", "AE", "AW", "MN", "PU", "MD", "EG"};
        ncSklsUps = new int[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
        NCSkillTPCost = new int[NCSkillIDs.length][];
        cNCSkillTPCost = new int[NCSkillIDs.length][];
        NCSkillMindCost = new int[NCSkillIDs.length][];
        cNCSkillMindCost = new int[NCSkillIDs.length][];
        NCSkillNames = new String[]{"Taijutsu", "Ninjutsu", "Genjutsu", "ChakraControl", "AffinityFire", "AffinityWind", "AffinityLightning", "AffinityEarth", "AffinityWater", "IryoNinjutsu", "PotentialUnlock", "Meditation", "EightGates"};
        NCRankNames = new String[]{"", "Academy Student", "Genin", "Chunin", "Jonin", "Anbu", "Kage"};
        tech1 = null;
        tech2 = null;
        tech3 = null;
        tech4 = null;
        techPM = null;
        data0 = null;
        data1 = null;
        data2 = null;
        data3 = null;
        data4 = null;
        data5 = null;
        data6 = null;
        data7 = null;
        data8 = null;
        data9 = null;
        dat10 = null;
        dat11 = null;
        dat12 = null;
        dat13 = null;
        dat14 = null;
        dat15 = null;
        dat16 = null;
        dat17 = null;
        dat18 = null;
        dat19 = null;
        dat20 = null;
        dat21 = null;
        dat22 = null;
        dat23 = null;
        dat24 = null;
        dat25 = null;
        dat26 = null;
        dat27 = null;
        dat28 = null;
        dat29 = null;
        dat30 = null;
        dat31 = null;
        dat32 = null;
        dat32Segmented = null;
        tacx = new HashMap();
        techNbt = new String[]{"jrmcTech1", "jrmcTech2", "jrmcTech3", "jrmcTech4", "jrmcTech5", "jrmcTech6", "jrmcTech7", "jrmcTech8", "jrmcTech9"};
        ArcRsrvGrowth = new int[]{6, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0};
        ArcRsrvMaxSkll = new int[]{0, 500, 1000, 1000, 1500, 2000, 2500};
        ArcRsrvPowCst = new int[]{0, 0, 0, 0, 20, 30, 60, 90, 70, 100, 100};
        TransSaiCurRg = 0;
        TransSaiStBnP = new float[11][];
        TransSaiStBnPO = new float[11][];
        TransSaiStBnF = new int[][]{{0, 0, 0, 0, 0, 0}, {30, 30, 0, 30, 0, 0}, {50, 50, 0, 50, 0, 0}, {60, 45, 0, 60, 0, 0}, {45, 45, 0, 45, 0, 0}, {75, 75, 0, 75, 0, 0}, {100, 100, 0, 100, 0, 0}, {20, 20, 0, 20, 0, 0}, {50, 50, 0, 50, 0, 0}, {110, 110, 0, 110, 0, 0}, {150, 150, 0, 150, 0, 0}, {130, 130, 0, 130, 0, 0}, {80, 80, 0, 80, 0, 0}, {110, 110, 0, 110, 0, 0}, {115, 115, 0, 115, 0, 0}, {160, 160, 0, 160, 0, 0}};
        TransHalfSaiStBnP = new float[11][];
        TransHalfSaiStBnPO = new float[11][];
        TransHalfSaiStBnF = new int[][]{{0, 0, 0, 0, 0, 0}, {30, 30, 0, 30, 0, 0}, {50, 50, 0, 50, 0, 0}, {60, 45, 0, 60, 0, 0}, {45, 45, 0, 45, 0, 0}, {75, 75, 0, 75, 0, 0}, {100, 100, 0, 100, 0, 0}, {20, 20, 0, 20, 0, 0}, {50, 50, 0, 50, 0, 0}, {110, 110, 0, 110, 0, 0}, {150, 150, 0, 150, 0, 0}, {130, 130, 0, 130, 0, 0}, {80, 80, 0, 80, 0, 0}, {110, 110, 0, 110, 0, 0}, {115, 115, 0, 115, 0, 0}, {160, 160, 0, 160, 0, 0}};
        TransFrStBnP = new float[10][];
        TransFrStBnPO = new float[10][];
        TransFrStBnF = new int[][]{{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {150, 150, 0, 150, 0, 0}};
        TransHmStBnP = new float[10][];
        TransHmStBnPO = new float[10][];
        TransHmStBnF = new int[][]{{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {120, 120, 0, 120, 0, 0}};
        TransNaStBnP = new float[10][];
        TransNaStBnPO = new float[10][];
        TransNaStBnF = new int[][]{{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {120, 120, 0, 120, 0, 0}};
        TransMaStBnP = new float[10][];
        TransMaStBnPO = new float[10][];
        TransMaStBnF = new int[][]{{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {120, 120, 0, 120, 0, 0}};
        DoujutsuPowerBonusMulti = new float[][]{{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f}, {1.1f, 1.1f, 1.1f, 1.1f, 1.0f, 1.0f}, {1.2f, 1.2f, 1.2f, 1.2f, 1.0f, 1.0f}, {1.3f, 1.3f, 1.3f, 1.3f, 1.0f, 1.0f}, {1.4f, 1.4f, 1.4f, 1.4f, 1.0f, 1.0f}, {1.5f, 1.5f, 1.5f, 1.5f, 1.0f, 1.0f}, {1.6f, 1.6f, 1.6f, 1.6f, 1.0f, 1.0f}, {1.7f, 1.7f, 1.7f, 1.7f, 1.0f, 1.0f}, {1.8f, 1.8f, 1.8f, 1.8f, 1.0f, 1.0f}, {1.9f, 1.9f, 1.9f, 1.9f, 1.0f, 1.0f}};
        DoujutsuPowerBonusFlat = new int[][]{{1, 1, 0, 1, 0, 0}, {2, 3, 0, 2, 0, 0}, {3, 4, 0, 3, 0, 0}, {3, 5, 0, 3, 0, 0}, {4, 6, 0, 4, 0, 0}, {5, 8, 0, 5, 0, 0}, {6, 10, 0, 6, 0, 0}, {7, 11, 0, 7, 0, 0}, {8, 13, 0, 8, 0, 0}, {9, 15, 0, 9, 0, 0}};
        TransNms = new String[][]{{"Base", "HForm1", "HForm2", "HFormG"}, {"Base", "Super", "SuperG2", "SuperG3", "SuperFP", "Super2", "Super3", "Oozaru", "OozaruS", "SuperG", "SuperB", "SuperGR", "SuperL", "SuperLB", "Super4", "SuperBS"}, {"Base", "Super", "SuperG2", "SuperG3", "SuperFP", "Super2", "Super3", "Oozaru", "OozaruS", "SuperG", "SuperB", "SuperGR", "SuperL", "SuperLB", "Super4", "SuperBS"}, {"Base", "NForm1", "NForm2", "NFormG"}, {"Form0", "Form1", "Form2", "Form3", "Base", "Form5", "Form6", "FormG"}, {"Base", "MForm1", "MForm2", "MForm3", "MFormG"}};
        trans = new String[][]{{"Base", "Full", "Buffed", "God"}, {"Base", "SS", "SSG2", "SSG3", "SSFullPow", "SS2", "SS3", "Oozaru", "Golden", "SSGod", "SSB", "SSGodR", "LSS", "LSS2", "SS4", "SSBE"}, {"Base", "SS", "SSG2", "SSG3", "SSFullPow", "SS2", "SS3", "Oozaru", "Golden", "SSGod", "SSB", "SSGodR", "LSS", "LSS2", "SS4", "SSBE"}, {"Base", "Full", "Giant", "God"}, {"Form0", "Form1", "Form2", "Form3", "Base", "Form5", "Ultimate", "God"}, {"Base", "Evil", "Full", "Pure", "God"}};
        TransNmsM = new String[][]{{"Base", "Full", "Buffed", "God"}, {"Base", "SS", "SSG2", "SSG3", "SS", "SS2", "SS3", "Oozaru", "Golden", "SSGod", "SSB", "SSGodR", "SS", "SS2", "SS4", "SSBE"}, {"Base", "SS", "SSG2", "SSG3", "SS", "SS2", "SS3", "Oozaru", "Golden", "SSGod", "SSB", "SSGodR", "SS", "SS2", "SS4", "SSBE"}, {"Base", "Full", "Giant", "God"}, {"Form0", "Form1", "Form2", "Form3", "Base", "Form5", "Ultimate", "God"}, {"Base", "Evil", "Full", "Pure", "God"}};
        transformationDescendToFormID = new byte[][]{{0, 0, 0, 0}, {0, 0, 1, 2, 0, 4, 5, 0, 0, 0, 9, 0, 0, 0, 0, 10}, {0, 0, 1, 1, 0, 1, 5, 0, 0, 0, 9, 0, 0, 0, 0, 10}, {0, 0, 0, 0}, {0, 0, 1, 2, 3, 4, 4, 4}, {0, 0, 0, 0, 0}};
        majinRacialSkillNames = new String[]{"SuperRegeneration", "Evil", "Full", "Absorption", "Pure"};
        transNonRacial = new String[]{trans_KAIOKEN, trans_MYSTIC, trans_ULTRA_INSTINCT, trans_GOD_OF_DESTRUCTION};
        TransSaiUpNam = new String[]{"Need for Power", "Further Ascending Theory", "Not Enough", "Back to the Basics", "Even More Power", "The Real Power", "Everything Reached!"};
        TransSaiTre = new short[]{0, 1, 2, 3, 1, 2, 3, 1, 3, 1, 1, 3, 1, 1, 4, 2};
        TransSaiBlk = new float[]{1.0f, 1.05f, 1.1f, 1.2f, 1.05f, 1.05f, 1.05f, 1.05f, 1.05f, 0.95f, 0.95f, 0.95f, 1.1f, 1.2f, 1.05f, 1.05f};
        TransSaiSz = new float[]{1.0f, 1.02f, 1.1f, 1.2f, 1.02f, 1.04f, 1.06f, 3.0f, 3.0f, 1.0f, 1.0f, 1.0f, 1.1f, 1.2f, 1.04f, 1.02f};
        TransSaiRgnO = new float[]{1.0f, -0.2f, -0.3f, -0.4f, -0.05f, -0.2f, -1.0f, -0.5f, -2.0f, -0.5f, -0.5f, -0.5f, -0.2f, -0.2f, -0.2f, -0.5f};
        TransSaiRgn = new float[]{1.0f, -0.2f, -0.3f, -0.4f, -0.05f, -0.2f, -1.0f, -0.5f, -2.0f, -0.5f, -0.5f, -0.5f, -0.2f, -0.2f, -0.2f, -0.5f};
        TransHalfSaiRgnO = new float[]{1.0f, -0.2f, -0.3f, -0.4f, -0.05f, -0.2f, -1.0f, -0.5f, -2.0f, -0.5f, -0.5f, -0.5f, -0.2f, -0.2f, -0.2f, -0.5f};
        TransHalfSaiRgn = new float[]{1.0f, -0.2f, -0.3f, -0.4f, -0.05f, -0.2f, -1.0f, -0.5f, -2.0f, -0.5f, -0.5f, -0.5f, -0.2f, -0.2f, -0.2f, -0.5f};
        TransFrSkn = new short[]{0, 0, 0, 0, 1, 2, 3, 1};
        TransFrSkn2 = new short[]{0, 0, 0, 2, 1, 3, 1, 1};
        TransFrHrn = new short[]{0, 0, 1, 2, 3, 4, 3, 3};
        TransFrBlk = new float[]{1.0f, 1.0f, 1.0f, 1.1f, 1.0f, 1.1f, 1.05f, 0.95f};
        TransFrSz = new float[]{0.95f, 1.0f, 1.2f, 1.3f, 1.0f, 1.1f, 1.0f, 1.0f};
        TransFrRgnO = new float[]{3.0f, 2.5f, 2.0f, 1.5f, 1.0f, -0.5f, -1.0f, -0.5f};
        TransFrRgn = new float[]{3.0f, 2.5f, 2.0f, 1.5f, 1.0f, -0.5f, -1.0f, -0.5f};
        TransHmRgnO = new float[]{1.0f, -0.5f, -0.25f, -0.5f};
        TransHmRgn = new float[]{1.0f, -0.5f, -0.25f, -0.5f};
        TransHmBlk = new float[]{1.0f, 1.05f, 1.1f, 0.95f};
        TransHmSz = new float[]{1.0f, 1.05f, 1.2f, 1.0f};
        TransNaRgnO = new float[]{1.0f, -0.5f, -0.25f, -0.5f};
        TransNaRgn = new float[]{1.0f, -0.5f, -0.25f, -0.5f};
        TransNaBlk = new float[]{1.0f, 1.05f, 1.05f, 0.95f};
        TransNaSz = new float[]{1.0f, 1.05f, 3.0f, 1.0f};
        TransMaBulk = new float[]{1.0f, 0.95f, 1.02f, 1.0f, 0.95f};
        TransMaSize = new float[]{1.0f, 1.0f, 1.2f, 0.8f, 1.0f};
        TransMaRgnO = new float[]{1.0f, -0.5f, -0.25f, -0.5f};
        TransMaRgn = new float[]{1.0f, -0.5f, -0.25f, -0.5f};
        TransGtsNms = new String[]{"noGate", "Gate1", "Gate2", "Gate3", "Gate4", "Gate5", "Gate6", "Gate7", "Gate8"};
        TransGtsDmg = new float[]{1.0f, 1.2f, 1.4f, 1.6f, 1.8f, 2.0f, 2.25f, 2.5f, 3.0f};
        TransGtsDmgO = new float[]{1.0f, 1.2f, 1.4f, 1.6f, 1.8f, 2.0f, 2.25f, 2.5f, 3.0f};
        TransKaiNms = new String[]{"1", "x2", "x3", "x4", "x5", "x10", "x20"};
        TransKaiNmsO = TransKaiNms;
        TransKaiDmg = new float[TransKaiNms.length];
        TransKaiDmgO = new float[TransKaiNms.length];
        TransKaiDrainRace = new float[Races.length];
        TransKaiDrainORace = new float[Races.length];
        TransKaiDrainLevel = new float[TransKaiNms.length];
        TransKaiDrainOLevel = new float[TransKaiNms.length];
        TransMngDmg = new float[1];
        TransMngDmgO = new float[1];
        AlgnmntNms = new String[]{"Good", "Neutral", "Evil"};
        techCol = new int[]{0, 0xFFFFFF, 53999, 13801198, 14812441, 328965, 5695066, 16706880, 16625664, 15294875, 11482731, 16752576, 3135190, 1477514, 8974316, 0x505050, 0xAAAAAA, 20414, 7455999, 9385113, 14859007, 8389913, 16677498, 4230966, 9829013, 12233002, 16776101, 16368896, 16762000, 6565897, 13007647};
        techCol2 = new int[]{0, 0xFFFFFF, 12575487, 0xF7D7FF, 16736618, 328965, 0xA5FFA5, 16775651, 16633177, 16350129, 13059966, 16757714, 3135190, 2928043, 0xB4FFFF, 0x6C6C6C, 0xC2C2C2, 2063832, 9885951, 11094961, 15913983, 10032686, 16749714, 0x5AA558, 11730862, 14009926, 0xFFFFC4, 16766720, 16768171, 7750429, 13800511};
        techCol3 = new int[]{0, 0x7D7D7D, 2499671, 2559542, 4786450, 197379, 2505498, 3477505, 6170377, 10820956, 7539241, 15633325, 38807, 21844, 6077370, 0x262626, 0x828282, 10890, 4822478, 6753140, 12750553, 5308930, 13980735, 1206284, 6736224, 9793536, 15390586, 13146368, 13797206, 3739392, 9718786};
        techCol4 = new int[]{0, 0xCFCFCF, 38899, 9247404, 12851243, 328965, 2479675, 16437248, 15040768, 13128827, 10559571, 15633325, 1751735, 28782, 7394005, 0x3F3F3F, 0x969696, 15781, 6532069, 7806595, 14001385, 6816272, 15297119, 2848800, 8249721, 10915606, 15984268, 14725632, 15509107, 5315587, 11494929};
        techColName = new String[]{"AlignmentBased", "white", "blue", "purple", "red", "black", "green", "yellow", "orange", "pink", "magenta", "lightPink", "cyan", "darkCyan", "lightCyan", "darkGray", "gray", "darkBlue", "lightBlue", "darkPurple", "lightPurple", "darkRed", "lightRed", "darkGreen", "lime", "darkYellow", "lightYellow", "gold", "lightOrange", "darkBrown", "lightBrown"};
        techBase = new int[]{1, 0, 1, 1, 1, 10, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1};
        techMin = new int[]{1, 0, 1, 0, 0, 10, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1};
        techMax = new int[]{20, 1, 30, 8, 2, 100, 1, 0, 0, 0, 30, 3, 10, 10, 10, 100};
        techUpg = new int[]{0, 0, 0, 1, 1, 10, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        techNCBase = new int[]{1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1};
        techNCMin = new int[]{1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1};
        techNCMax = new int[]{20, 1, 30, 2, 2, 1, 4, 24, 24, 10, 8, 10, 10, 10, 10, 100};
        techNCUpg = new int[]{0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1};
        techDBCstatmods = new String[]{"SpeedInc", "DamageInc", "CostRed", "CastRed", "CoolRed", "DensityInc", "SizeInc"};
        tech_stats = new byte[]{10, 18, 25, 31, 36, 40, 43, 45, 46, 47, 48};
        techDBCName = new String[]{"TName", "TAcquired", "TOwner", "TType", "TSpeed", "TDamage", "TEffect", "TEnergyCost", "TCasttime", "TCooldown", "TColor", "TDensity", "TIncantation", "TFire", "TMove", "", "TExp", "TLvl", "TUpg", "TStats"};
        techDBCTypes = new String[]{"Wave", "Blast", "Disk", "Laser", "Spiral", "BigBlast", "Barrage", "Shield", "Explosion"};
        techDBCaddTYCost = new float[]{1.2f, 1.0f, 1.5f, 1.3f, 1.7f, 1.8f, 0.3f, 1.2f, 1.7f};
        techDBCct = new float[]{3.0f, 2.0f, 4.0f, 1.0f, 3.0f, 8.0f, 0.2f, 2.0f, 5.0f};
        techDBCcd = new float[]{20.0f, 10.0f, 5.0f, 3.0f, 15.0f, 60.0f, 0.2f, 15.0f, 45.0f};
        techDBCEffects = new String[]{"No", "Yes"};
        techDBCAcquired = new String[]{"Learned", "Selfmade"};
        techDBCSpeed = new String[]{"Slow", "Average", "Fast", "VeryFast"};
        techDBCaddSPCost = new float[]{0.9f, 1.0f, 1.2f, 1.4f};
        techDBCstatsDefault = new byte[]{0, 0, 0, 0, 0, 0, 0};
        techName = new String[]{"Name", "Acquired", "Owner", "Type", "Speed", "Damage", "Effect", "Energy Cost", "Casttime", "Cooldown", color, "Density", "Incantation", "Fire", "Move"};
        techTypes = new String[]{"Wave", "Blast", "Disk", "Laser", "Large", "Barrage", "Spiral", "Defensive Kiai", "Offensive Kiai"};
        techEffects = new String[]{"Single", "Explosive", "AOE"};
        techAcquired = new String[]{"Learned", "Selfmade"};
        techSpeed = new String[]{"Very Slow", "Slow", "Average", "Fast", "Very Fast", "Extreme Fast"};
        techSndIncBeam = new String[]{"cbeam1s", "cbeam2s", "cbeam3s", "cbeam4s", "cbeam5s", "cbeam6s", "cbeam7s"};
        techSndFireBeam = new String[]{"fbeam1s", "fbeam2s", "fbeam3s", "fbeam4s", "fbeam5s", "fbeam6s", "fbeam7s", "fbeam8s", "fbeam9s", "fbeam10s", "fbeam11s", "fbeam12s", "fbeam13s"};
        techSndMoveBeam = new String[]{"mbeam1s", "mbeam2s"};
        techSndIncDisk = new String[]{"cdisk1s", "cdisk2s"};
        techSndFireDisk = new String[]{"fdisk1s"};
        techSndMoveDisk = new String[]{"mdisk1s"};
        techSndFireLeser = new String[]{"fleser1s", "fleser2s"};
        techSndPMInc = new String[]{"DBC.hame", "DBC3.cspiritbomb", "DBC3.ckidisc", "DBC3.cspecialbeamcannon", "DBC3.cmasenko", "DBC3.cbigbang", "DBC2.finalflash_charge", "DBC3.cgallitgun", "DBC3.cburning", "DBC2.deathball_charge", "1610.pwbl"};
        techSndPMIncFire = new String[]{"DBC.ha", "DBC3.fspiritbomb", "DBC2.disc_fire", "DBC3.fspecialbeamcannon", "DBC3.fmasenko", "DBC2.bigbang_fire", "DBC3.ffinalflash", "DBC3.fgallitgun", "DBC3.fburning", "DBC2.deathball_fire"};
        techSndPMFire = new String[]{"DBC.hamehafire", "DBC2.blast", "DBC2.kiball_release", "DBC2.basicbeam_fire"};
        techSndPMMove = new String[]{"DBC4.mbeam1s", "DBC4.mbeam2s"};
        Masters = new String[]{"None", "General", "Master Roshi", "Master Shen", "Korin", "Kami", "King Kai", "Krillin", "Piccolo", "Vegeta", "Trunks", "Freiza", "Master Cell", "Son Goku", "Son Gohan", "Babidi", "Jin", "Guru", "Whis"};
        pmdbc = new String[][]{{"KAHame", "0", "2", "0", "1", "55", "0", "0", "0", "0", "2", "1", "1", "1", "1", "10"}, {"KABlast", "0", "1", "1", "1", "15", "0", "0", "0", "0", "0", "1", "0", "2", "0", "2"}, {"KASpiritbomb", "0", "6", "5", "0", "95", "1", "0", "0", "0", "1", "1", "2", "0", "0", "15"}, {"KAEnergyDisk", "0", "7", "2", "2", "45", "0", "0", "0", "0", "7", "1", "3", "0", "0", "6"}, {"KAMakanko", "0", "8", "4", "1", "75", "0", "0", "0", "0", "7", "1", "4", "0", "1", "12"}, {"KAMasenko", "0", "8", "0", "1", "55", "0", "0", "0", "0", "8", "1", "5", "0", "1", "7"}, {"KABigBang", "0", "9", "1", "2", "65", "1", "0", "0", "0", "1", "1", "6", "0", "0", "1"}, {"KAFinalFlash", "0", "9", "0", "1", "85", "0", "0", "0", "0", "7", "1", "7", "0", "1", "13"}, {"KAGalicGun", "0", "9", "0", "1", "55", "0", "0", "0", "0", "3", "1", "8", "0", "1", "9"}, {"KABurningAtt", "0", "10", "1", "2", "65", "1", "0", "0", "0", "7", "1", "9", "0", "1", "3"}, {"KAPlanetDest", "0", "11", "5", "0", "95", "1", "0", "0", "0", "4", "1", "10", "0", "0", "14"}, {"KAFakeMoon", "0", "9", "1", "0", "30", "0", "300", "0", "0", "0", "0", "11", "0", "0", "18"}};
        techNCName = new String[]{"Name", "Acquired", "Owner", "Type", "Speed", "Damage", "Effect", "Chakra", "Handseals", "Cooldown", color, "Density", "Incantation", "Fire", "Move"};
        techNCTypes = new String[]{"Wave", "Ball", "Disk", "Support", "Offensive", "Taijutsu"};
        techNCEffects = new String[]{"Fire", "Wind", "Lightning", "Earth", "Water", "Raw", "Yang", "Yin", "YinYang", "Nature"};
        techNCAcquired = new String[]{"Learned", "Selfmade"};
        techNCDam = new String[]{"Single", "Explosive"};
        techNCClassn = new String[]{"Ninjutsu", "Genjutsu", "Taijutsu", "Bunshinjutsu", "IryoNinjutsu", "Kinjutsu", "Hiden", "Fuinjutsu ", "BloodlineLimit", "BloodlineSelection", "Kuchiyose"};
        techNCSpeed = new String[]{"Slow", "Average", "Fast", "Very Fast"};
        techNCBunshintyp = new String[]{"Fire", "Wind", "Lightning", "Earth", "Water", "Raw", "Yang", "Shadow", "Yin-Yang", "Nature"};
        techNCSndIncAff = new String[]{"ka", "fuu", "rai", "do", "sui"};
        techNCSndIncTyp = new String[]{"wave", "ball", "disk"};
        techNCSndIncCls = new String[]{"pty", "", "gen", "", "bunshin"};
        techNCSndIncSpec = new String[]{"kai", "", "", "", "", "", "", "kagebunshin"};
        techNCSndIncBeam = new String[0];
        techNCSndIncDisk = new String[0];
        techNCSndFireBeam = new String[0];
        techNCSndFireDisk = new String[0];
        techNCSndMoveBeam = new String[0];
        techNCSndMoveDisk = new String[0];
        techNCSndIncPM = new String[]{"", "bunshin_say", "Chidori", "Katon_Gouk", "Katon_Hous", "Rasengan_Ready", "Fire", "Fuuton", "Lightning", "Earth", "Water", "Raw", "Yang", "Yin", "Yin-Yang", "Nature", "Earth_Wall", "Mud_Wall", "Water_Pistol"};
        techNCSndHitPM = new String[]{"", "bunshin", "Chidori_Hit", "Explosion", "Rasengan_Hit"};
        techNCSndFirePM = new String[]{"", "bunshin", "Hous_Shoot"};
        techNCCol = new int[]{16132352, 14745595, 0xF9F9FB, 11898202, 5029102, 12379372, 15855792, 2363398, 1908620, 7456823};
        techNCCostP = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85};
        techNCEffHS = new String[]{hsF, hsD, hsL, hsE, hsW, hsY, hsG, hsN, hsT, hsR, hsH};
        techNCCCHS = new String[]{"1", "2", "3", "12", "13", "21", "23", "31", "32", hsW, "122", "123", hsN, hsD, hsR, "211", hsT, hsL, hsG, hsH, "233", "311", hsE, hsY, "321", "322", hsF, "1211", "1212", "1213", "1231", "1232", "1233", "1311", "1312", "1313", "1321", "1322", "1323", "2121", "2122", "2123", "2131", "2132", "2133", "2311", "2312", "2313", "2321", "2322", "2323", "3121", "3122", "3123", "3131", "3132", "3133", "3211", "3212", "3213", "3231", "3232", "3233"};
        techNCPreMadeSeals = new String[]{"", "", ""};
        NarutoNPCnames = new String[]{"", "Sarutobi", "Hiashi", "Fugaku"};
        NarutoNPCclans = new int[]{0, 0, 1, 2};
        MastersNC = new String[]{"None", "General", "Basic", "YondaimeHokage", "Sasuke", "Uchihaclan", "NidaimeHokage", "BasicMedical", "Hyuugaclan"};
        pmj = new String[][]{{"Rasengan", "0", "3", "1", "1", "10", "5", "10", "13231", "100", "0", "1", "5", "0", "4"}, {"Chidori", "0", "4", "1", "1", "10", "2", "10", "21232", "100", "0", "1", "2", "0", "2"}, {"Housenka", "0", "5", "1", "1", "10", "0", "10", "32213", "100", "0", "1", "4", "0", "3"}, {"Bunshin", "0", "2", "3", "0", "1", "5", "2", "11322", "100", "0", "4", "1", "0", "1"}, {"IwaBunshin", "0", "1", "3", "0", "10", "3", "3", "11313", "100", "0", "4", "1", "0", "1"}, {"MizuBunshin", "0", "1", "3", "0", "10", "4", "3", "11312", "100", "0", "4", "1", "0", "1"}, {"KageBunshin", "0", "6", "3", "0", "20", "5", "5", "11323", "100", "0", "4", "1", "7", "1"}, {"Genjutsu", "0", "1", "3", "2", "5", "7", "5", "23121", "100", "0", "2", "1", "0", "1"}, {"Shousen", "0", "7", "3", "0", "10", "6", "10", "23211", "100", "0", "5", "2", "0", "2"}, {"Susanoo", "0", "5", "3", "0", "10", "6", "10", "0", "100", "0", "6", "2", "0", "2"}, {"Kaiten", "0", "8", "5", "0", "10", "6", "10", "0", "100", "0", "7", "2", "0", "2"}, {"EarthWall", "0", "2", "1", "0", "30", "3", "10", "32211", "100", "0", "1", "16", "0", "1"}, {"MudWall", "0", "2", "1", "0", "50", "3", "15", "32212", "100", "0", "1", "17", "0", "1"}, {"WaterPistol", "0", "2", "1", "2", "8", "4", "8", "31312", "100", "0", "1", "18", "0", "3"}};
        dmgMlTyps = new String[]{"Crushing", "Piercing", "Slashing"};
        statNames = new String[][]{{"Melee", "Defense", "Body"}, {"Melee", "Defense", "Body", "Stamina", "EnergyPower", "EnergyPool", "MaxSkills", "Speed", "RegenRateBody", "RegenRateStamina", "RegenRateEnergy", "FlySpeed"}, {"Melee", "Defense", "Body", "Stamina", "EnergyPower", "EnergyPool", "MaxSkills", "Speed", "RegenRateBody", "RegenRateStamina", "RegenRateEnergy"}, {"Melee", "Defense", "Body", "Stamina", "Speed", "RegenRateBody", "RegenRateStamina"}};
        attrInit = new String[][]{{"STR ", "DEX ", "CONS"}, {"STR ", "DEX ", "CONS", "WILL", "MIND", "SPI"}, {"STR ", "DEX ", "CONS", "WILL", "MIND", "SPI"}, {"STR", "AGI", "VIT"}};
        attrNms = new String[][]{{"Strength", "Dexterity", "Constitution"}, {"Strength", "Dexterity", "Constitution", "WillPower", "Mind", "Spirit"}, {"Strength", "Dexterity", "Constitution", "WillPower", "Mind", "Spirit"}, {"Strength", "Agility", "Vitality"}};
        attrDsc = new String[][]{{"StrMC", "DexMC", "ConMC"}, {"StrDB", "DexDB", "ConDB", "WilDB", "MndDB", "SpiDB"}, {"StrNC", "DexNC", "ConNC", "WilNC", "MndNC", "SpiNC"}, {"StrSA", "AgiSA", "VitSA"}};
        attrStat = new String[][]{{"mleMC", "DefMC", "heltMC"}, {"mleDB", "DefDB", "BdDB", "StDB", "EnPwDB", "EnPlDB", "MxSkDB", "SpDB", "RBDB", "RSDB", "REDB", "FSDB"}, {"mleNC", "DefNC", "BdNC", "StNC", "EnPwNC", "EnPlNC", "MxSkNC", "SpNC", "RBNC", "RSNC", "RENC"}, {"mleSA", "DefSA", "BdSA", "StSA"}};
        statInc = new float[][]{{0.3f, 1.0f, 2.0f}, {2.5f, 4.0f, 20.0f, 3.5f, 5.2f, 40.0f, 0.15f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f}, {2.5f, 4.0f, 20.0f, 3.5f, 5.2f, 40.0f, 0.15f, 1.0f, 1.0f, 1.0f, 1.0f}, {1.0f, 1.0f, 250.0f}};
        attrStart = new int[][][]{new int[][]{{10}, {10}, {10}}, new int[][]{{10, 15, 10, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 5, 5, 15, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 7, 15, 8, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 15, 15, 10, 10, 7, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 5, 10, 15, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 5, 5, 18, 15, 10, 10, 10, 10, 10, 10, 10, 10, 10}}, new int[][]{{10}, {10}, {10}, {10}, {10}, {10}}, new int[][]{{1}, {1}, {1}}};
        splitter = Splitter.on((char)',').omitEmptyStrings().trimResults();
        joiner = Joiner.on((char)',').skipNulls();
        attrCstH = null;
        statIncBonusRaceDBC = new int[][]{{0, 30, 15, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {30, 0, 15, 0, 10, 30, 0, 0, 0, 0, 0, 0, 0, 0}, {10, 20, 15, 30, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0}, {10, 0, 5, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {10, 0, 5, 0, 30, 10, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 10, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        statIncBonusClass = new int[][][]{new int[][]{{0, 10, -10}, {0, -10, 10}, {0, 0, 0}}, new int[][]{{0, -10, 10}, {0, 10, -10}, {0, -10, 10}, {0, -10, 10}, {0, 10, -10}, {0, 10, -10}, {0, 0, 0}, {0, 10, -10}, {0, -10, 10}, {0, -10, 10}, {0, 10, -10}, {0, 10, -10}}, new int[][]{{0, 5, 10}, {0, 5, 0}, {0, 5, -10}, {0, 5, 10}, {0, -5, 5}, {0, -10, -10}, {0, 0, 0}, {0, 5, 5}, {0, -10, -10}, {0, -10, -10}, {0, -10, -10}}, new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}};
        sao_skillSlot = null;
        sao_skills = null;
        sao_level = 1;
        sao_exp = 0;
        sao_ap = 0;
        sao_sp = 0;
        sao_col = 0;
        saoSkls = new HashMap();
        SAO_SkillMap_Cats = new String[]{"weapons", "armors"};
        SAO_SkillMap_Weapons = new String[]{"1sword", "1curved", "1dagger", "1rapier", "1axe", "1mace", "2sword", "2spear", "2axe", "2hammer", "2katana"};
        SAO_SkillMap_WeaponTypes = new String[]{"slash", "slash", "pierce", "pierce", "slash", "crash", "slash", "pierce", "slash", "crash", "slash"};
        SAO_Weapon_Cat_Sword = new String[]{"sword", "straight", "shortsword", "longsword"};
        SAO_Weapon_Cat_Curved = new String[]{"curved", "scimitar"};
        SAO_Weapon_Cat_Dagger = new String[]{"dagger", "knife"};
        SAO_Weapon_Cat_Rapier = new String[]{"rapier"};
        SAO_Weapon_Cat_Axe = new String[]{"axe"};
        SAO_Weapon_Cat_Spear = new String[]{"spear"};
        SAO_Weapon_Cat_BattleAxe = new String[]{"greataxe", "battleaxe"};
        SAO_Weapon_Cat_WarHammer = new String[]{"mace", "blunt", "club"};
        SAO_Weapon_Cat_Sword2 = new String[]{"sword", "greatsword", "twohandedsword", "zwei", "2sword", "twosword"};
        SAO_Weapon_Cat_Katana = new String[]{"katana"};
        SAO_SkillMap_Armors = new String[]{"leather", "lightmetal", "heavymetal", "lightshield", "heavyshield", "parry"};
        damInd = new HashMap();
        TrnngOptns = new String[]{"shadowdummy", "concentration", "BPswap", "airBoxing"};
        jfcData0 = null;
        jfcaa = null;
        jfcms = null;
        jfcmt = null;
        jfccp = null;
        jfccs = null;
        modsC = null;
        modsS = null;
        Perc10 = 0.9f;
        Perc15 = 0.85f;
        Perc20 = 0.8f;
        DBCresetted = true;
        NCresetted = true;
        difp = "";
        NAMES = new String[]{"Thousand", "Million", "Billion", "Trillion", "Quadrillion", "Quintillion", "Sextillion", "Septillion", "Octillion", "Nonillion", "Decillion", "Undecillion", "Duodecillion", "Tredecillion", "Quattuordecillion", "Quindecillion", "Sexdecillion", "Septendecillion", "Octodecillion", "Novemdecillion", "Vigintillion"};
        THOUSAND = BigInteger.valueOf(1000L);
        MAP = new TreeMap<BigInteger, String>();
        for (int i = 0; i < NAMES.length; ++i) {
            MAP.put(THOUSAND.pow(i + 1), NAMES[i]);
        }
        ltnb = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        cldb = "\u00a71";
        cldg = "\u00a72";
        cla = "\u00a73";
        cldr = "\u00a74";
        cldp = "\u00a75";
        clgd = "\u00a76";
        clgy = "\u00a77";
        cldgy = "\u00a78";
        clbe = "\u00a79";
        clb = "\u00a70";
        cllg = "\u00a7a";
        cllb = "\u00a7b";
        cllr = "\u00a7c";
        clpr = "\u00a7d";
        cly = "\u00a7e";
        clw = "\u00a7f";
        CHAT_STYLE_YELLOW = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
        wi = "wi.jrmc";
        bs = "BuildingSpawns";
        wip = "wip.jrmc";
        modAssetIDs = new HashMap();
        paused = false;
        turih = new HashMap();
        mem = 1000L;
        familyCEmptyFamiliesCleared = false;
        previousServerFolder = "";
    }

    public static class Log {
        public static final boolean DEBUG = true;

        public static void log(String message) {
            String fullClassName = Thread.currentThread().getStackTrace()[2].getClassName();
            String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
            String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.println(className + "." + methodName + ":" + lineNumber + ": " + message);
        }
    }
}

