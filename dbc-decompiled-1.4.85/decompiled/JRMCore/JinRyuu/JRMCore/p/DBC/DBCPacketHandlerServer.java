/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.DBCConfig
 *  JinRyuu.DragonBC.common.DBCH
 *  JinRyuu.DragonBC.common.Entitys.EntityEnergyFM
 *  JinRyuu.DragonBC.common.Entitys.EntityInstantTransmission
 *  JinRyuu.DragonBC.common.Entitys.EntityMajinAbsorption
 *  JinRyuu.DragonBC.common.Items.ItemsDBC
 *  JinRyuu.DragonBC.common.Npcs.EntityDBCKami
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterGohan
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterGoku
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterTrunksFuture
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterVegeta
 *  JinRyuu.DragonBC.common.Render.ArtGravDevTileEntity
 *  JinRyuu.DragonBC.common.Worlds.WorldTeleporterDBCSpacePod01
 *  JinRyuu.DragonBC.common.Worlds.WorldTeleporterDBCTelep
 *  JinRyuu.DragonBC.common.mod_DragonBC
 *  cpw.mods.fml.common.FMLCommonHandler
 *  cpw.mods.fml.relauncher.Side
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.Teleporter
 */
package JinRyuu.JRMCore.p.DBC;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.Entitys.EntityEnergyFM;
import JinRyuu.DragonBC.common.Entitys.EntityInstantTransmission;
import JinRyuu.DragonBC.common.Entitys.EntityMajinAbsorption;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDBCKami;
import JinRyuu.DragonBC.common.Npcs.EntityMasterGohan;
import JinRyuu.DragonBC.common.Npcs.EntityMasterGoku;
import JinRyuu.DragonBC.common.Npcs.EntityMasterTrunksFuture;
import JinRyuu.DragonBC.common.Npcs.EntityMasterVegeta;
import JinRyuu.DragonBC.common.Render.ArtGravDevTileEntity;
import JinRyuu.DragonBC.common.Worlds.WorldTeleporterDBCSpacePod01;
import JinRyuu.DragonBC.common.Worlds.WorldTeleporterDBCTelep;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.entity.EntityEnergyAtt;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.p.DBC.DBCPascendsound;
import JinRyuu.JRMCore.p.DBC.DBCPchargepart;
import JinRyuu.JRMCore.p.DBC.DBCPdescendsound;
import JinRyuu.JRMCore.p.DBC.DBCPduo;
import JinRyuu.JRMCore.p.DBC.DBCPscouter1;
import JinRyuu.JRMCore.p.DBC.DBCPscouter2;
import JinRyuu.JRMCore.p.DBC.DBCPscouter3;
import JinRyuu.JRMCore.p.DBC.DBCPscouter4;
import JinRyuu.JRMCore.p.DBC.DBCPspacepod1;
import JinRyuu.JRMCore.p.DBC.DBCPtick;
import JinRyuu.JRMCore.p.DBC.DBCPwish;
import JinRyuu.JRMCore.p.PD;
import JinRyuu.JRMCore.server.JGPlayerMP;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCFormMastery;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCGoD;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCInstantTransmission;
import JinRyuu.JRMCore.server.config.dbc.JGConfigRaces;
import JinRyuu.JRMCore.server.config.dbc.JGConfigUltraInstinct;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;

public class DBCPacketHandlerServer {
    public static final int SHENL = 0;
    public static final int PORUN = 1;
    public static final int DRAGON_WISH = 0;
    public static final int MASTER_ENMA_REVIVE = 1;
    public static final int GIVE_WEIGHT_ITEM = 2;
    public static final int PLAYER_DEAD_LIST = 3;
    public static final int CHANGE_GRAVITY_FOR_GRAV_DEVICE = 4;
    public static final int ASKING_FOR_MAJIN_STATUS_EFFECT = 5;
    public static final int WHIS_TELEPORT = 6;
    public static final int TOP_ARENA_RINGOUT = 7;
    public static final int KAIOKEN = 26;
    public static final int SCOUTER_EXPLOSION = -2;
    public static final int GRAVITY_TP_GAIN = -3;
    public static final int TIME_CHAMBER_KICK_TOO_LONG = -6;
    public static final int PLANET_NAMEK = 1;
    public static final int PLANET_VEGETA = 2;
    public static final int PLANET_EARTH = 3;
    public static final ChatStyle styleYellow = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
    public static final ChatStyle styleGold = new ChatStyle().setColor(EnumChatFormatting.GOLD);
    public static final ChatStyle styleRed = new ChatStyle().setColor(EnumChatFormatting.RED);
    public static byte WAVE_FIRING = (byte)10;
    public static byte WAVE_STOP = (byte)11;
    public static byte INSTANT_TRANSMISSION = (byte)12;
    public static byte INSTANT_TRANSMISSION_GROUP = (byte)13;
    public static byte MAJIN_ABSORPTION = (byte)14;
    public double explosionX;
    public double explosionY;
    public double explosionZ;
    public float explosionSize;
    public List chunkPositionRecords;
    public float playerVelocityX;
    public float playerVelocityY;
    public float playerVelocityZ;
    public boolean expGriOff;
    public double expDam;
    public Entity origin;

    /*
     * Enabled aggressive block sorting
     */
    public void handleDBCenergy(byte b, byte p, EntityPlayer pl) {
        NBTTagCompound nbt2;
        String fusionMembers2;
        String[] fusionParticipants2;
        EntityPlayer fusedPlayerPartner;
        boolean isController;
        String[] fusionParticipants;
        String fusionMembers;
        ArrayList<EntityPlayer> teleportedEntities;
        boolean isFused;
        EntityPlayerMP targetEntity;
        byte skillLevel;
        NBTTagCompound nbt;
        JGPlayerMP jgPlayer;
        int modeID;
        block67: {
            List entityList2;
            int surroundPlayerLimit;
            int groupID;
            int surroundMode;
            block68: {
                block66: {
                    if (b == WAVE_FIRING) {
                        JRMCoreH.setByte(1, pl, "jrmcFrng");
                        return;
                    }
                    if (b == WAVE_STOP) {
                        JRMCoreH.setByte(0, pl, "jrmcFrng");
                        return;
                    }
                    if (b == INSTANT_TRANSMISSION || b == INSTANT_TRANSMISSION_GROUP) {
                        boolean isShortRange = b == INSTANT_TRANSMISSION;
                        modeID = isShortRange ? 0 : 1;
                        boolean isEnabled = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED[modeID];
                        if (isEnabled && pl != null && pl.ridingEntity == null && pl.riddenByEntity == null) {
                            String instantTransmissionTimers;
                            String[] values;
                            int cd;
                            jgPlayer = new JGPlayerMP(pl);
                            nbt = this.nbt(pl, "pres");
                            jgPlayer.setNBT(nbt);
                            byte currentRelease = jgPlayer.getRelease();
                            int mode = p;
                            if (currentRelease <= 0) return;
                            skillLevel = (byte)JRMCoreH.SklLvl(17, pl);
                            byte requiredLevel = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_UNLOCK_SKILL_LEVEL[modeID];
                            if (skillLevel <= 0) return;
                            if (skillLevel < requiredLevel) {
                                String message = "Instant Transmission Failed! " + JGConfigDBCInstantTransmission.TP_MODES[modeID] + " Requires Instant Transmission Skill Level " + requiredLevel + " to be used!";
                                pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                                return;
                            }
                            byte kiSenseLevelRequirement = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_KI_SENSE_REQUIREMENT[modeID];
                            byte kiSenseSkillLevel = (byte)JRMCoreH.SklLvl(6, pl);
                            if (kiSenseLevelRequirement > kiSenseSkillLevel) {
                                String message = "Instant Transmission Failed! " + JGConfigDBCInstantTransmission.TP_MODES[modeID] + " Requires Ki Sense Level " + kiSenseLevelRequirement + " to be used!";
                                pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                                return;
                            }
                            surroundMode = JRMCoreH.PlyrSettings(pl, 15);
                            if (!JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED_SURROUND[surroundMode + 1]) {
                                String message = "Instant Transmission Failed! Surround Teleportation Mode " + JGConfigDBCInstantTransmission.SURROUND_MODES[surroundMode + 1] + " is Disabled!";
                                pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                                return;
                            }
                            if (nbt.hasKey("jrmcInstantTransmissionTimers") && (cd = Integer.parseInt((values = (instantTransmissionTimers = nbt.getString("jrmcInstantTransmissionTimers")).split(";"))[modeID])) > 0) {
                                String message = "Instant Transmission Failed! " + JGConfigDBCInstantTransmission.TP_MODES[modeID] + " teleportation is in Cooldown! " + cd * 5 + "s Remaining!";
                                pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                                return;
                            }
                            if (isShortRange) {
                                int shortTPMode = JRMCoreH.PlyrSettings(pl, 14);
                                if (!JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED_SHORT[shortTPMode + 1]) {
                                    String message = "Instant Transmission Failed! Short Teleportation Mode " + JGConfigDBCInstantTransmission.SHORT_MODES[shortTPMode + 1] + " is Disabled!";
                                    pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                                    return;
                                }
                                EntityInstantTransmission technique = new EntityInstantTransmission((EntityLivingBase)pl);
                                technique.setData(mode, (int)skillLevel, shortTPMode, surroundMode);
                                pl.worldObj.spawnEntityInWorld((Entity)technique);
                                return;
                            }
                            break block66;
                        } else {
                            if (isEnabled) return;
                            String message = (isShortRange ? "Short" : "Long") + " Distance Instant Transmission Failed! It is Disabled on this Server!";
                            pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                            return;
                        }
                    }
                    if (b == MAJIN_ABSORPTION) {
                        if (!JGConfigRaces.CONFIG_MAJIN_ENABLED) return;
                        if (!JGConfigRaces.CONFIG_MAJIN_ABSORPTION_ENABLED) return;
                        JGPlayerMP jgPlayer2 = new JGPlayerMP(pl);
                        NBTTagCompound nbt3 = this.nbt(pl, "pres");
                        jgPlayer2.setNBT(nbt3);
                        byte race = jgPlayer2.getRace();
                        float release = (float)jgPlayer2.getRelease() / 100.0f;
                        if (!JRMCoreH.isRaceMajin(race)) return;
                        if (jgPlayer2.getTransformationMeter() < 100) return;
                        if (!(release > 0.0f)) return;
                        boolean isCreative = JRMCoreH.isInCreativeMode((Entity)pl);
                        int remainingLife = 0;
                        int lifeCost = 0;
                        int cooldown = 0;
                        byte state = jgPlayer2.getState();
                        String statusEffects = jgPlayer2.getStatusEffects();
                        boolean isMysticOn = JRMCoreH.StusEfcts(13, statusEffects);
                        boolean isUltraInstinctOn = JRMCoreH.StusEfcts(19, statusEffects);
                        boolean isGoDOn = JRMCoreH.StusEfcts(20, statusEffects);
                        int stateID = JRMCoreH.getMajinFormID(state, isMysticOn, isUltraInstinctOn, isGoDOn);
                        boolean canUse = true;
                        boolean isOnCooldown = false;
                        if (!isCreative) {
                            cooldown = jgPlayer2.getNBT().getInteger("jrmcMajinAbsorptionTimer");
                            boolean bl = isOnCooldown = cooldown > 0;
                            if (isOnCooldown) {
                                canUse = false;
                            } else {
                                byte classID = jgPlayer2.getClassID();
                                byte powerType = jgPlayer2.getPowerType();
                                int[] playerAttributes = jgPlayer2.getAttributes();
                                int curBody = jgPlayer2.getHealth();
                                int maxBody = jgPlayer2.getHealthMax(race, classID, powerType, playerAttributes);
                                lifeCost = (int)((float)maxBody * JGConfigRaces.CONFIG_MAJIN_ABSORPTON_HEALTH_COST[stateID][1] + JGConfigRaces.CONFIG_MAJIN_ABSORPTON_HEALTH_COST[stateID][0]);
                                boolean hasEnoughHealth = isCreative ? true : curBody > lifeCost;
                                remainingLife = curBody - lifeCost;
                                canUse = hasEnoughHealth;
                            }
                        }
                        if (canUse) {
                            if (!isCreative) {
                                JRMCoreH.setInt(remainingLife, pl, "jrmcBdy");
                                cooldown = JGConfigRaces.CONFIG_MAJIN_ABSORPTON_CD_TIMER[stateID];
                                jgPlayer2.getNBT().setInteger("jrmcMajinAbsorptionTimer", cooldown);
                            }
                            String dns = nbt3.getString("jrmcDNS");
                            float userPower = 0.0f;
                            float attackUser = 0.0f;
                            float healthUser = 0.0f;
                            float kiPowerUser = 0.0f;
                            int strength = jgPlayer2.getAttribute(0);
                            attackUser = JRMCoreH.stat(0, pl, 0, strength, 0.0f);
                            attackUser = (int)(attackUser * release);
                            healthUser = jgPlayer2.getHealth();
                            kiPowerUser = jgPlayer2.getEnergyPower();
                            kiPowerUser = (int)(kiPowerUser * release);
                            attackUser = (int)(attackUser * JGConfigRaces.CONFIG_MAJIN_ABSORPTON_USER_POWER_MULTI[stateID][0]);
                            healthUser = (int)(healthUser * JGConfigRaces.CONFIG_MAJIN_ABSORPTON_USER_POWER_MULTI[stateID][1]);
                            kiPowerUser = (int)(kiPowerUser * JGConfigRaces.CONFIG_MAJIN_ABSORPTON_USER_POWER_MULTI[stateID][2]);
                            if (attackUser < 1.0f) {
                                attackUser = 1.0f;
                            }
                            if (healthUser < 1.0f) {
                                healthUser = 1.0f;
                            }
                            if (kiPowerUser < 1.0f) {
                                kiPowerUser = 1.0f;
                            }
                            userPower = attackUser + kiPowerUser + healthUser;
                            EntityMajinAbsorption technique = new EntityMajinAbsorption((EntityLivingBase)pl, 0, state == 1 ? 12561588 : (state == 3 ? 16757199 : JRMCoreH.dnsBodyCM(dns)), userPower, attackUser + kiPowerUser, stateID);
                            pl.worldObj.spawnEntityInWorld((Entity)technique);
                        } else {
                            String text = "";
                            text = isOnCooldown ? "Unable to use Absorption! Cooldown: " + cooldown * 5 + "s" : "Unable to use Absorption! Health Cost: " + lifeCost;
                            pl.addChatMessage(new ChatComponentText(text).setChatStyle(styleRed));
                        }
                        jgPlayer2.setTransformationMeter(0);
                        return;
                    }
                    String s2 = JRMCoreH.getString(pl, JRMCoreH.techNbt[b]);
                    boolean isAKiAttack = b >= 0 && b <= 7;
                    if (!isAKiAttack) return;
                    byte curRel = JRMCoreH.getByte(pl, "jrmcRelease");
                    if (curRel <= 0) return;
                    int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts(pl);
                    String[] PlyrSkills = JRMCoreH.getString(pl, "jrmcSSlts").split(",");
                    byte pwr = JRMCoreH.getByte(pl, "jrmcPwrtyp");
                    byte rc = JRMCoreH.getByte(pl, "jrmcRace");
                    byte cls = JRMCoreH.getByte(pl, "jrmcClass");
                    int curEn = JRMCoreH.getInt(pl, "jrmcEnrgy");
                    int curBo = JRMCoreH.getInt(pl, "jrmcBdy");
                    byte align = JRMCoreH.getByte(pl, "jrmcAlign");
                    byte state = JRMCoreH.getByte(pl, "jrmcState");
                    byte state2 = JRMCoreH.getByte(pl, "jrmcState2");
                    String sklx = JRMCoreH.getString(pl, "jrmcSSltX");
                    int resrv = JRMCoreH.getInt(pl, "jrmcArcRsrv");
                    String absorption = JRMCoreH.getString(pl, "jrmcMajinAbsorptionData");
                    byte trans = (byte)(state + 1);
                    String ste = JRMCoreH.getString(pl, "jrmcStatusEff");
                    boolean mj = JRMCoreH.StusEfcts(12, ste);
                    boolean lg = JRMCoreH.StusEfcts(14, ste);
                    boolean kk = JRMCoreH.StusEfcts(5, ste);
                    boolean mc = JRMCoreH.StusEfcts(13, ste);
                    boolean mn = JRMCoreH.StusEfcts(19, ste);
                    boolean gd = JRMCoreH.StusEfcts(20, ste);
                    boolean v = JRMCoreH.StusEfcts(10, ste) || JRMCoreH.StusEfcts(11, ste);
                    byte release = JRMCoreH.getByte(pl, "jrmcRelease");
                    int WIL = JRMCoreH.getPlayerAttribute(pl, PlyrAttrbts, 3, state, state2, rc, sklx, curRel, resrv, lg, mj, kk, mc, mn, gd, pwr, PlyrSkills, v, absorption);
                    int WIL2 = JRMCoreH.getPlayerAttribute(pl, PlyrAttrbts, 3, 0, 0, rc, sklx, curRel, resrv, lg, mj, false, false, false, false, pwr, PlyrSkills, v, absorption);
                    int stat = JRMCoreH.stat((Entity)pl, 3, pwr, 4, WIL, rc, cls, 0.0f);
                    int stat2 = JRMCoreH.stat((Entity)pl, 3, pwr, 4, WIL2, rc, cls, 0.0f);
                    Object var8 = null;
                    boolean isCustomAttack = b >= 0 && b < 4 && s2 != null && s2.length() > 0;
                    boolean isFixedAttack = b >= 4 && b < 8 && s2 != null && s2.length() > 0;
                    float RELEASE_MULTI = 0.01f;
                    if (isCustomAttack) {
                        String[] tech = s2.toString().split(";");
                        if (tech == null) return;
                        if (tech.length <= 9) return;
                        byte type = Byte.parseByte(tech[3]);
                        byte speed = Byte.parseByte(tech[4]);
                        short dam = Short.parseShort(tech[5]);
                        byte effect = Byte.parseByte(tech[6]);
                        byte color = Byte.parseByte(tech[10]);
                        byte density = Byte.parseByte(tech[11]);
                        byte sincantation = 0;
                        byte sfire = 0;
                        byte smove = 0;
                        if (tech.length > 12) {
                            sincantation = Byte.parseByte(tech[12]);
                            sfire = Byte.parseByte(tech[13]);
                            smove = Byte.parseByte(tech[14]);
                        }
                        int exp = 0;
                        int lvl = 0;
                        int upg = 0;
                        byte[] sts = new byte[]{0, 0, 0, 0, 0, 0, 0};
                        if (tech.length > 16) {
                            exp = Integer.parseInt(tech[16]);
                            lvl = Integer.parseInt(tech[17]);
                            upg = Integer.parseInt(tech[18]);
                            sts = JRMCoreH.tech_statmods(tech[19]);
                        }
                        int dam1 = JRMCoreH.techDBCdmg(tech, stat, sts);
                        int cost1 = JRMCoreH.techDBCkic(tech, stat2, sts);
                        int cost2 = (int)((double)cost1 * (double)curRel * (double)0.01f * (double)((float)p * 0.02f) * JRMCoreConfig.dat5696[type][2]);
                        dam1 = dam1 < 1 ? 1 : dam1;
                        cost2 = cost2 < 2 ? 2 : cost2;
                        int costBo = cost2 > curEn ? curBo - (cost2 - curEn) : 0;
                        boolean canAffordKiCost = cost2 <= curEn;
                        boolean lifeAboveZero = costBo > 0;
                        if (!JRMCoreConfig.dat5695[type]) return;
                        if (!canAffordKiCost) {
                            if (!lifeAboveZero) return;
                        }
                        if (!JRMCoreH.isInCreativeMode((Entity)pl)) {
                            int energy = curEn - cost2 < 0 ? 0 : curEn - cost2;
                            JRMCoreH.setInt(energy, pl, "jrmcEnrgy");
                            if (energy == 0) {
                                JRMCoreH.setByte(0, pl, "jrmcRelease");
                            }
                            if (costBo > 0) {
                                JRMCoreH.setInt(costBo, pl, "jrmcBdy");
                            }
                        }
                        pl.worldObj.playSoundAtEntity((Entity)pl, "jinryuudragonbc:" + JRMCoreH.techSnds(type, 1, sfire), type == 6 ? 0.2f : 1.0f, 1.0f);
                        NBTTagCompound nbt4 = JRMCoreH.nbt((Entity)pl, "pres");
                        String StE = nbt4.getString("jrmcStatusEff");
                        boolean setGoDOn = JRMCoreH.StusEfcts(20, StE);
                        var8 = new EntityEnergyAtt((EntityLivingBase)pl, type, speed, dam, effect, color, density, sincantation, sfire, smove, (byte)p, dam1, cost1, sts, b, release, align);
                        if (setGoDOn && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENABLED) {
                            ((EntityEnergyAtt)((Object)var8)).destroyer = setGoDOn;
                        }
                        if (JGConfigDBCFormMastery.FM_Enabled && release > 0) {
                            JRMCoreH.addToFormMasteriesValue(pl, JGConfigDBCFormMastery.FM_GainKiFire, JGConfigDBCFormMastery.FM_GainKiFire, rc, state, state2, kk, mc, mn, gd, 3);
                        }
                        pl.worldObj.spawnEntityInWorld((Entity)var8);
                        JRMCoreH.a1t3(pl);
                        return;
                    }
                    if (!isFixedAttack) return;
                    int tn = Integer.parseInt(s2);
                    String[] tech = JRMCoreH.pmdbc[tn];
                    if (tech[0].equals("KAFakeMoon")) {
                        int kicost = Integer.parseInt(tech[7]);
                        if (curEn < kicost) return;
                        if (!JRMCoreH.isInCreativeMode((Entity)pl)) {
                            int energy = curEn - kicost < 0 ? 0 : curEn - kicost;
                            JRMCoreH.setInt(energy, pl, "jrmcEnrgy");
                            if (energy == 0) {
                                JRMCoreH.setByte(0, pl, "jrmcRelease");
                            }
                        }
                        var8 = new EntityEnergyFM((EntityLivingBase)pl);
                        pl.worldObj.spawnEntityInWorld((Entity)var8);
                        return;
                    }
                    if (tech == null) return;
                    if (tech.length <= 9) return;
                    byte type = Byte.parseByte(tech[3]);
                    byte speed = Byte.parseByte(tech[4]);
                    short dam = Short.parseShort(tech[5]);
                    byte cast = Byte.parseByte(tech[8]);
                    byte effect = Byte.parseByte(tech[6]);
                    byte color = Byte.parseByte(tech[10]);
                    byte density = Byte.parseByte(tech[11]);
                    byte sincantation = Byte.parseByte(tech[12]);
                    byte sfire = Byte.parseByte(tech[13]);
                    byte smove = Byte.parseByte(tech[14]);
                    if (tech.length > 12) {
                        sincantation = Byte.parseByte(tech[12]);
                        sfire = Byte.parseByte(tech[13]);
                        smove = Byte.parseByte(tech[14]);
                    }
                    int exp = 0;
                    int lvl = 0;
                    int upg = 0;
                    byte[] sts = new byte[]{0, 0, 0, 0, 0, 0, 0};
                    if (tech.length > 16) {
                        exp = Integer.parseInt(tech[16]);
                        lvl = Integer.parseInt(tech[17]);
                        upg = Integer.parseInt(tech[18]);
                        sts = JRMCoreH.tech_statmods(tech[19]);
                    }
                    int dam1 = JRMCoreH.techDBCdmg(tech, stat, sts);
                    int cost1 = JRMCoreH.techDBCkic(tech, stat2, sts);
                    int dam2 = (int)((double)dam1 * (double)curRel * (double)0.01f);
                    int cost2 = (int)((double)cost1 * (double)curRel * (double)0.01f * (double)((float)p * 0.02f) * JRMCoreConfig.dat5696[type][2]);
                    dam1 = dam1 < 1 ? 1 : dam1;
                    dam2 = dam2 < 1 ? 1 : dam2;
                    cost2 = cost2 < 2 ? 2 : cost2;
                    int costBo = cost2 > curEn ? curBo - (cost2 - curEn) : 0;
                    boolean canAffordKiCost = cost2 <= curEn;
                    boolean lifeAboveZero = costBo > 0;
                    if (!JRMCoreConfig.dat5695[type]) return;
                    if (!canAffordKiCost) {
                        if (!lifeAboveZero) return;
                    }
                    if (sfire > 0) {
                        pl.worldObj.playSoundAtEntity((Entity)pl, "jinryuudragonbc:" + JRMCoreH.techSnds(10, 1, (short)(sfire - 1)), 1.0f, 1.0f);
                        if (cast > 0) {
                            pl.worldObj.playSoundAtEntity((Entity)pl, "jinryuudragonbc:" + JRMCoreH.techSnds(10, 3, (short)(cast - 1)), 1.0f, 1.0f);
                        }
                    }
                    if (sincantation > 0) {
                        pl.worldObj.playSoundAtEntity((Entity)pl, "jinryuudragonbc:" + JRMCoreH.techSnds(10, 3, (short)(sincantation - 1)), 1.0f, 1.0f);
                    }
                    if (!JRMCoreH.isInCreativeMode((Entity)pl)) {
                        int energy = curEn - cost2 < 0 ? 0 : curEn - cost2;
                        JRMCoreH.setInt(energy, pl, "jrmcEnrgy");
                        if (energy == 0) {
                            JRMCoreH.setByte(0, pl, "jrmcRelease");
                        }
                        if (costBo > 0) {
                            JRMCoreH.setInt(costBo, pl, "jrmcBdy");
                        }
                    }
                    var8 = new EntityEnergyAtt((EntityLivingBase)pl, type, speed, dam2, effect, color, density, sincantation, sfire, smove, (byte)p, dam1, cost1, sts, b, release, align);
                    if (JGConfigDBCFormMastery.FM_Enabled && release > 0) {
                        JRMCoreH.addToFormMasteriesValue(pl, JGConfigDBCFormMastery.FM_GainKiFire, JGConfigDBCFormMastery.FM_GainKiFire, rc, state, state2, kk, mc, mn, gd, 3);
                    }
                    pl.worldObj.spawnEntityInWorld((Entity)var8);
                    JRMCoreH.a1t3(pl);
                    return;
                }
                MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
                groupID = JRMCoreH.getInt(pl, "JRMCGID");
                int playerID = 0;
                while (playerID < server.getAllUsernames().length) {
                    int selectedMember = p;
                    if (playerID == selectedMember) {
                        targetEntity = JRMCoreH.getPlayerForUsername(server, server.getAllUsernames()[playerID]);
                        int egid = JRMCoreH.getInt((EntityPlayer)targetEntity, "JRMCGID");
                        if (JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_RELEASE_SENSE_REQUIRED_ENABLED[modeID]) {
                            boolean targetCanBeSensed;
                            JGPlayerMP targetMP = new JGPlayerMP(targetEntity);
                            NBTTagCompound nbt22 = this.nbt((EntityPlayer)targetEntity, "pres");
                            targetMP.setNBT(nbt22);
                            byte targetRelease = targetMP.getRelease();
                            boolean bl = targetCanBeSensed = targetRelease > 0;
                            if (!targetCanBeSensed) {
                                String message = "Instant Transmission Failed! Target can not be sensed at 0% Release Level.";
                                pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                                return;
                            }
                        }
                        if (egid == groupID && targetEntity != null && !targetEntity.equals((Object)pl)) {
                            boolean isOneInOtherworld;
                            boolean bl = isOneInOtherworld = pl.dimension == DBCConfig.otherWorld && targetEntity.dimension != DBCConfig.otherWorld || pl.dimension != DBCConfig.otherWorld && targetEntity.dimension == DBCConfig.otherWorld;
                            if (isOneInOtherworld) {
                                String message = "Instant Transmission Failed! You can't " + (pl.dimension == DBCConfig.otherWorld && targetEntity.dimension != DBCConfig.otherWorld ? "Leave" : "Enter") + " the Otherworld!";
                                pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                                return;
                            }
                            isFused = JRMCoreH.isFused((Entity)pl);
                            if (pl.dimension != targetEntity.dimension) {
                                if (!JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_TP_ENABLED || JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSION_BLACKLIST.containsKey(targetEntity.dimension)) {
                                    String message = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_TP_ENABLED ? "Instant Transmission Failed! Dimensional Teleportation is Disabled!" : "Instant Transmission Failed! Target Dimension for Teleportation is Blacklisted!";
                                    pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                                    return;
                                }
                                if (isFused) {
                                    String message = "Unable to dimensional teleport while fused.";
                                    pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                                    return;
                                }
                            }
                            teleportedEntities = new ArrayList<EntityPlayer>();
                            teleportedEntities.add(pl);
                            if (surroundMode == -1) break block67;
                            surroundPlayerLimit = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_PLAYER_LIMIT_SKILL_LEVEL[modeID][skillLevel - 1];
                            double r2 = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_TARGET_FINDER_RANGE;
                            double r2Y = 1.0;
                            AxisAlignedBB aabb2 = AxisAlignedBB.getBoundingBox((double)(pl.posX - r2), (double)(pl.posY - 1.0), (double)(pl.posZ - r2), (double)(pl.posX + r2), (double)(pl.posY + 1.0), (double)(pl.posZ + r2));
                            entityList2 = pl.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)pl, aabb2);
                            break block68;
                        }
                        ++selectedMember;
                    }
                    ++playerID;
                }
                return;
            }
            for (int k = 0; k < entityList2.size(); ++k) {
                boolean groupOnly;
                Entity nearbyEntity = (Entity)entityList2.get(k);
                if (nearbyEntity == null || !(nearbyEntity instanceof EntityPlayer) || ((EntityPlayer)nearbyEntity).equals((Object)targetEntity) || ((EntityPlayer)nearbyEntity).equals((Object)pl) || !nearbyEntity.isEntityAlive()) continue;
                if (surroundPlayerLimit != -1 && teleportedEntities.size() - 1 > surroundPlayerLimit) break;
                boolean bl = groupOnly = surroundMode == 0;
                if (groupOnly) {
                    int egid2 = JRMCoreH.getInt((EntityPlayer)nearbyEntity, "JRMCGID");
                    if (egid2 != groupID || groupID == 0) continue;
                    teleportedEntities.add((EntityPlayer)nearbyEntity);
                    continue;
                }
                teleportedEntities.add((EntityPlayer)nearbyEntity);
            }
        }
        String ste = jgPlayer.getStatusEffects();
        boolean divine = JRMCoreH.StusEfcts(17, ste);
        boolean creativeMode = JRMCoreH.isInCreativeMode((Entity)pl);
        if (!creativeMode) {
            double energyCostDim;
            int[] playerAttributes = jgPlayer.getAttributes();
            byte race = jgPlayer.getRace();
            byte classID = jgPlayer.getClassID();
            byte powerType = jgPlayer.getPowerType();
            int curEnergy = jgPlayer.getEnergy();
            int maxEnergy = jgPlayer.getEnergyMax(race, classID, powerType, playerAttributes, JRMCoreH.SklLvl_KiBs(pl, (int)powerType));
            double FLAT_COST = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[modeID][0][skillLevel - 1];
            double PERCENTAGE_COST = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[modeID][1][skillLevel - 1];
            double costMulti = PERCENTAGE_COST / 100.0;
            double energyCost = (double)maxEnergy * costMulti + FLAT_COST;
            if (pl.dimension != targetEntity.dimension) {
                double DIMENSIONAL_FLAT_COST = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[0][skillLevel - 1];
                double DIMENSIONAL_PERCENTAGE_COST = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[1][skillLevel - 1];
                double costMultiDim = DIMENSIONAL_PERCENTAGE_COST / 100.0;
                energyCostDim = (double)maxEnergy * costMultiDim + DIMENSIONAL_FLAT_COST;
                energyCost += energyCostDim;
            }
            if (teleportedEntities.size() > 1) {
                double costPerPlayerFlat = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[0][skillLevel - 1];
                double costPerPlayerPerc = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[1][skillLevel - 1];
                double costMultiPerPlayer = costPerPlayerPerc / 100.0;
                energyCostDim = (double)maxEnergy * costMultiPerPlayer + costPerPlayerFlat;
                energyCost += energyCostDim * (double)(teleportedEntities.size() - 1);
            }
            if ((double)curEnergy < energyCost) {
                String message = "Instant Transmission Failed! Not Enough Ki: " + (int)energyCost;
                pl.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                return;
            }
            int remainingEnergy = curEnergy - (int)energyCost;
            JRMCoreH.setInt(remainingEnergy, pl, "jrmcEnrgy");
        }
        pl.worldObj.playSoundAtEntity((Entity)pl, divine ? "jinryuudragonbc:DBC4.blacktp" : "jinryuudragonbc:DBC5.instant_transmission", 0.25f, pl.worldObj.rand.nextFloat() * 0.1f + 0.9f);
        double x = targetEntity.posX;
        double y = targetEntity.posY;
        double z = targetEntity.posZ;
        JRMCoreH.playerUsedInstantTransmission(pl);
        for (int i = teleportedEntities.size() - 1; i >= 0; --i) {
            EntityPlayer entity = (EntityPlayer)teleportedEntities.get(i);
            double x2 = entity.posX - pl.posX;
            double z2 = entity.posZ - pl.posZ;
            boolean dimensional = ((EntityPlayerMP)entity).dimension != targetEntity.dimension;
            boolean nether = ((EntityPlayerMP)entity).dimension == -1 && dimensional;
            boolean theEnd = ((EntityPlayerMP)entity).dimension == 1 && dimensional;
            boolean netherTarget = targetEntity.dimension == -1 && dimensional;
            boolean theEndTarget = targetEntity.dimension == 1 && dimensional;
            boolean overworldTarget = targetEntity.dimension == 0 && dimensional;
            double x3 = x + x2;
            double y3 = y + 1.0;
            double z3 = z + z2;
            if (((EntityPlayerMP)entity).dimension != targetEntity.dimension) {
                if (netherTarget || theEndTarget || theEnd) {
                    ((EntityPlayerMP)pl).mcServer.getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)pl, targetEntity.dimension);
                }
                if (!theEndTarget) {
                    FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)entity, targetEntity.dimension, (Teleporter)new WorldTeleporterDBCTelep(FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(targetEntity.dimension)));
                }
            }
            ((EntityPlayerMP)entity).playerNetServerHandler.setPlayerLocation(x3, y3, z3, entity.rotationYaw, entity.rotationPitch);
            ((EntityPlayerMP)entity).setPositionAndUpdate(x3, y3, z3);
            entity.addExperience(1);
        }
        if (isFused && (fusionMembers = jgPlayer.getNBT().getString("jrmcFuzion")).length() > 0 && !fusionMembers.equals(" ") && (fusionParticipants = fusionMembers.split(",")).length == 3 && (isController = fusionParticipants[0].equalsIgnoreCase(pl.getCommandSenderName())) && (fusedPlayerPartner = pl.worldObj.getPlayerEntityByName(fusionParticipants[1])) != null && (fusionParticipants2 = (fusionMembers2 = (nbt2 = this.nbt(fusedPlayerPartner, "pres")).getString("jrmcFuzion")).split(",")).length == 3) {
            ((EntityPlayerMP)fusedPlayerPartner).playerNetServerHandler.setPlayerLocation(x, y + 1.5, z, fusedPlayerPartner.rotationYaw, fusedPlayerPartner.rotationPitch);
            ((EntityPlayerMP)fusedPlayerPartner).setPositionAndUpdate(x, y + 1.5, z);
            fusedPlayerPartner.addExperience(1);
        }
        JRMCoreH.playerUsedInstantTransmission(pl);
        if (JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_NOTIFY_SERVER_ENABLED) {
            mod_DragonBC.logger.info(pl.getCommandSenderName() + " used Long Distance Teleportation to " + targetEntity.getCommandSenderName() + " with " + (teleportedEntities.size() - 1) + " Surrounding Players to the DimensionID: " + targetEntity.dimension);
        }
        if (nbt.hasKey("jrmcInstantTransmissionTimers")) {
            String instantTransmissionTimers = nbt.getString("jrmcInstantTransmissionTimers");
            String[] values = instantTransmissionTimers.split(";");
            int tpShort = Integer.parseInt(values[0]);
            int tpLong = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COOLDOWN[1][skillLevel - 1];
            JRMCoreH.setString(tpShort + ";" + tpLong, pl, "jrmcInstantTransmissionTimers");
        } else {
            String instantTransmissionTimers = "0;" + JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COOLDOWN[1][skillLevel - 1];
            JRMCoreH.setString(instantTransmissionTimers, pl, "jrmcInstantTransmissionTimers");
        }
        pl.worldObj.playSoundAtEntity((Entity)pl, divine ? "jinryuudragonbc:DBC4.blacktp" : "jinryuudragonbc:DBC5.instant_transmission", 0.25f, pl.worldObj.rand.nextFloat() * 0.1f + 0.9f);
    }

    public void handleDBCdri(int dri, EntityPlayer p) {
        NBTTagCompound tag = this.nbt(p, "");
        if (dri == 5 || dri == 6) {
            tag.setInteger("DBCdriS", dri);
        }
        if (dri == 1 || dri == 2) {
            tag.setInteger("DBCdriF", dri);
        }
        if (dri == 3 || dri == 4) {
            tag.setInteger("DBCdriY", dri);
        }
        if (dri >= 100) {
            ChatStyle styl = new ChatStyle().setColor(EnumChatFormatting.WHITE);
            if (JRMCoreConfig.DebugInfo) {
                String info = "DBC has found Potential hacking at ID:06 by player: %";
                mod_DragonBC.logger.info(String.format(info, p.getCommandSenderName()));
            }
        }
    }

    public void send(EntityPlayerMP Player) {
        Player.addChatMessage((IChatComponent)new ChatComponentText(JRMCoreH.trl("jrmc", "notenoughtp")));
    }

    public void handleDBCwish(int id, String s, EntityPlayer p) {
        MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        if (id == 0) {
            String[] sa = s.split(";");
            int wish = Integer.parseInt(sa[0]);
            EntityPlayer target2 = null;
            if (sa.length > 1) {
                for (int i = 0; i < server.worldServers.length; ++i) {
                    int d = server.worldServers[i].provider.dimensionId;
                    if (d != DBCConfig.otherWorld) continue;
                    target2 = server.worldServers[i].getPlayerEntityByName(sa[1]);
                }
            }
            if (wish < 100) {
                ArrayList wl;
                int wsh = JRMCoreH.getInt(p, "jrmcWishes");
                int dragon = JRMCoreH.getInt(p, "jrmcDrgn");
                ArrayList arrayList = wl = dragon == 0 ? DBCH.wishS : DBCH.wishP;
                if (wsh > 0) {
                    String d;
                    p.worldObj.playSoundEffect(p.posX, p.posY, p.posZ, "jinryuudragonbc:dragon.grant", 1.0f, 1.0f);
                    if (((String)wl.get(wish)).contains(";+;")) {
                        String[] ia = ((String)wl.get(wish)).replace(";+;", ";+").split(";+");
                        String in = ia[0];
                        int iz = Integer.parseInt(ia[1]);
                        int im = Integer.parseInt(ia[2]);
                        Item item = JRMCoreH.getItemByText(in);
                        if (item != null) {
                            ItemStack is = new ItemStack(item, iz, im);
                            p.inventory.addItemStackToInventory(is);
                            p.inventory.inventoryChanged = true;
                            this.closeInventoryChange(p);
                        }
                    } else if (((String)wl.get(wish)).equals("revive") && target2 != null) {
                        byte alive = JRMCoreH.getByte(target2, "jrmcAlv");
                        if (alive == 1 && target2 != null && p.dimension != DBCConfig.otherWorld && target2.dimension == DBCConfig.otherWorld) {
                            JRMCoreH.setInt(0, target2, "jrmcReviveTmer");
                            String t = JRMCoreH.trlai("dbc", "canrevivenow");
                            ChatStyle styl = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                            target2.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(styl));
                        }
                    } else if (((String)wl.get(wish)).equals("reviventp") && target2 != null) {
                        byte alive = JRMCoreH.getByte(target2, "jrmcAlv");
                        if (alive == 1 && target2 != null && p.dimension != DBCConfig.otherWorld && target2.dimension == DBCConfig.otherWorld) {
                            JRMCoreH.setString(p.getCommandSenderName() + ";" + p.dimension + ";" + (int)p.posX + ";" + (int)p.posY + ";" + (int)p.posZ, target2, "jrmcRevtpInit");
                            String t = JRMCoreH.trlai("dbc", "reviveoffered");
                            ChatStyle styl = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                            target2.addChatMessage(new ChatComponentTranslation(t, new Object[]{p.getCommandSenderName(), new ChatComponentTranslation(JRMCoreH.trlai("dbc", (String)DBCH.plntNms.get(p.dimension)), new Object[0]), (int)p.posX + ", " + (int)p.posY + ", " + (int)p.posZ}).setChatStyle(styl));
                        }
                    } else if (((String)wl.get(wish)).equals("reviveall")) {
                        if (p.dimension != DBCConfig.otherWorld) {
                            int al = JRMCoreH.Algnmnt(JRMCoreH.getByte(p, "jrmcAlign"));
                            for (int i = 0; i < server.worldServers.length; ++i) {
                                int d2 = server.worldServers[i].provider.dimensionId;
                                if (d2 != DBCConfig.otherWorld) continue;
                                for (EntityPlayer target2 : server.worldServers[i].playerEntities) {
                                    int tal;
                                    byte alive = JRMCoreH.getByte(target2, "jrmcAlv");
                                    if (alive != 1 || target2 == null || target2.dimension != DBCConfig.otherWorld || al != (tal = JRMCoreH.Algnmnt(JRMCoreH.getByte(target2, "jrmcAlign")))) continue;
                                    JRMCoreH.setInt(0, target2, "jrmcReviveTmer");
                                    String t = JRMCoreH.trlai("dbc", "canrevivenow");
                                    ChatStyle styl = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                                    target2.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(styl));
                                }
                            }
                        }
                    } else if (((String)wl.get(wish)).equals("young")) {
                        JRMCoreH.setFloat(90, p, "JRYCAge");
                    } else if (((String)wl.get(wish)).equals("child")) {
                        JRMCoreH.setFloat(25, p, "JRYCAge");
                    } else if (((String)wl.get(wish)).equals("old")) {
                        JRMCoreH.setFloat(300, p, "JRYCAge");
                    } else if (((String)wl.get(wish)).equals("kicolor")) {
                        JRMCoreH.setInt(Integer.parseInt(sa[1]), p, "jrmcAuraColor");
                    } else if (((String)wl.get(wish)).equals("arcultformcolor") && (d = JRMCoreH.getString(p, "jrmcDNSAU")).contains(";")) {
                        JRMCoreH.setString(d.substring(1), p, "jrmcDNSAU");
                    }
                }
                JRMCoreH.setInt(--wsh, p, "jrmcWishes");
            }
        } else if (id == 1) {
            int RevTmr;
            int wish = Integer.parseInt(s);
            if (wish == 100 && p.dimension == DBCConfig.otherWorld && p != null && p.ridingEntity == null && p.riddenByEntity == null && (RevTmr = JRMCoreH.getInt(p, "jrmcReviveTmer")) <= 0) {
                if (JRMCoreHDBC.DBCgetConfigDeadInv() && p.worldObj.getGameRules().getGameRuleBooleanValue("keepInventory") && !p.capabilities.isCreativeMode && JRMCoreHDBC.hasHalo(p)) {
                    JRMCoreH.nbt(p).setTag("InventoryDead", (NBTBase)p.inventory.writeToNBT(new NBTTagList()));
                    p.inventory.readFromNBT(JRMCoreH.nbt(p).getTagList("InventoryLiving", 10));
                    p.getEntityData().setTag("Inventory", (NBTBase)p.inventory.writeToNBT(new NBTTagList()));
                }
                byte by = (byte)JRMCoreH.Algnmnt(JRMCoreH.getByte(p, "jrmcAlign"));
                JRMCoreH.setByte(0, p, "jrmcAlv");
                FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)p, DBCConfig.RevDim[by], (Teleporter)new WorldTeleporterDBCTelep(FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(DBCConfig.planetEarth)));
                p.addExperience(1);
                double[] d = new double[]{50.0, 220.0, 50.0};
                switch (by) {
                    case 0: {
                        d = DBCConfig.RevLocG;
                        break;
                    }
                    case 1: {
                        d = DBCConfig.RevLocN;
                        break;
                    }
                    case 2: {
                        d = DBCConfig.RevLocE;
                    }
                }
                ((EntityPlayerMP)p).playerNetServerHandler.setPlayerLocation(d[0], d[1], d[2], (float)DBCConfig.RevAng[by][0], (float)DBCConfig.RevAng[by][1]);
                ((EntityPlayerMP)p).playerNetServerHandler.setPlayerLocation(d[0], d[1] + 1.0, d[2], (float)DBCConfig.RevAng[by][0], (float)DBCConfig.RevAng[by][1]);
                mod_DragonBC.logger.info(p.getCommandSenderName() + " revived!");
            }
            if (wish == 102) {
                // empty if block
            }
            if (wish == 101) {
                JRMCoreHDBC.reincarnate(p);
                mod_DragonBC.logger.info(p.getCommandSenderName() + " choose to Reincarnate!");
            }
            if (wish == 199 && this.nbt(p, "pres").getInteger("DBCSenzu") == 0) {
                this.nbt(p, "pres").setInteger("DBCSenzu", 1);
                p.inventory.addItemStackToInventory(new ItemStack(ItemsDBC.ItemSenzu, DBCConfig.senzuFromKarin));
                p.inventory.inventoryChanged = true;
                this.closeInventoryChange(p);
            }
            if (wish == 202) {
                p.inventory.addItemStackToInventory(new ItemStack(ItemsDBC.KintounItem, 1));
                p.inventory.inventoryChanged = true;
                this.closeInventoryChange(p);
            }
            if (wish == 203) {
                p.inventory.addItemStackToInventory(new ItemStack(ItemsDBC.KintounBlackItem, 1));
                p.inventory.inventoryChanged = true;
                this.closeInventoryChange(p);
            }
        } else if (id == 2) {
            String[] s2 = s.split(";");
            int i = Integer.parseInt(s2[0]);
            float a = Float.parseFloat(s2[1]);
            ItemStack stack = new ItemStack(i == 0 ? ItemsDBC.ItemWeightHandLeg : (i == 1 ? ItemsDBC.ItemWeightShell : (i == 2 ? ItemsDBC.ItemWeightShirt : (i == 3 ? ItemsDBC.ItemWeightCape : ItemsDBC.ItemWeightHeavySuit))), 1, 1);
            if (stack != null) {
                JRMCoreH.addItemWeightStats(stack, Float.valueOf(a));
                stack.setItemDamage(0);
                p.inventory.addItemStackToInventory(stack);
                p.inventory.inventoryChanged = true;
                this.closeInventoryChange(p);
            }
        } else if (id == 3) {
            String list = ";";
            for (int i = 0; i < server.worldServers.length; ++i) {
                int d = server.worldServers[i].provider.dimensionId;
                if (d == DBCConfig.otherWorld) {
                    for (EntityPlayer target : server.worldServers[i].playerEntities) {
                        byte alive;
                        if (target == null || target.dimension != DBCConfig.otherWorld || (alive = JRMCoreH.getByte(target, "jrmcAlv")) != 1) continue;
                        list = list + ";" + target.getCommandSenderName();
                    }
                }
                PD.sendTo(new DBCPwish(id, list), (EntityPlayerMP)p);
            }
        } else if (id == 4) {
            String[] s2 = s.split(";");
            int x = Integer.parseInt(s2[0]);
            int y = Integer.parseInt(s2[1]);
            int z = Integer.parseInt(s2[2]);
            TileEntity te = p.worldObj.getTileEntity(x, y, z);
            float g = Float.parseFloat(s2[3]);
            if (te instanceof ArtGravDevTileEntity) {
                ((ArtGravDevTileEntity)te).setGravity(g);
                p.worldObj.markBlockForUpdate(x, y, z);
                te.markDirty();
            }
        } else if (id == 5) {
            JRMCoreH.StusEfcts(12, p, s.equals("1"));
        } else if (id == 6) {
            if (DBCConfig.CanWhisTeleport && p != null && p.ridingEntity == null && p.riddenByEntity == null) {
                if (!JRMCoreH.isFused((Entity)p)) {
                    boolean earth = p.dimension == DBCConfig.dimNullRealm;
                    p.addExperience(1);
                    double[] d = earth ? DBCConfig.WhisTeleportLocationBack : DBCConfig.WhisTeleportLocationNull;
                    FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)p, earth ? DBCConfig.planetEarth : DBCConfig.dimNullRealm, (Teleporter)new WorldTeleporterDBCTelep(FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(DBCConfig.planetEarth)));
                    ((EntityPlayerMP)p).playerNetServerHandler.setPlayerLocation(d[0], d[1], d[2], 0.0f, 0.0f);
                    ((EntityPlayerMP)p).playerNetServerHandler.setPlayerLocation(d[0], d[1] + 1.0, d[2], 0.0f, 0.0f);
                    mod_DragonBC.logger.info(p.getCommandSenderName() + " was Teleported by Master Whis!");
                } else {
                    p.addChatMessage(new ChatComponentText("Unable to teleport while fused").setChatStyle(styleRed));
                }
            }
        } else if (id == 7) {
            double[] d = DBCConfig.WhisTeleportLocationNull;
            ((EntityPlayerMP)p).playerNetServerHandler.setPlayerLocation(d[0], d[1], d[2], 0.0f, 0.0f);
            ((EntityPlayerMP)p).playerNetServerHandler.setPlayerLocation(d[0], d[1] + 1.0, d[2], 0.0f, 0.0f);
            mod_DragonBC.logger.info(p.getCommandSenderName() + " has fallen down in the Null Realm!");
        }
    }

    public void handleDBCtick(int dbctick, EntityPlayer Player) {
        if (dbctick != 0 && dbctick != 26 && (dbctick < 10 || dbctick > 25)) {
            if (dbctick == -2) {
                if (ExtendedPlayer.get((EntityPlayer)Player).inventory.getStackInSlot(2) != null) {
                    ExtendedPlayer.get((EntityPlayer)Player).inventory.setInventorySlotContents(2, null);
                    this.soundPowerUp(Player, "jinryuudragonbc:scouter.expl");
                }
            } else if (dbctick == -3) {
                short GTrnng = JRMCoreH.getShort(Player, "jrmcGTrnng");
                int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts(Player);
                byte pwr = JRMCoreH.getByte(Player, "jrmcPwrtyp");
                byte rc = JRMCoreH.getByte(Player, "jrmcRace");
                byte cls = JRMCoreH.getByte(Player, "jrmcClass");
                int maxBody = JRMCoreH.stat((Entity)Player, 2, pwr, 2, PlyrAttrbts[2], rc, cls, 0.0f);
                int curBody = JRMCoreH.getInt(Player, "jrmcBdy");
                int maxEnergy = JRMCoreH.stat((Entity)Player, 5, pwr, 5, PlyrAttrbts[5], rc, cls, JRMCoreH.SklLvl_KiBs(Player, (int)pwr));
                int curEnergy = JRMCoreH.getInt(Player, "jrmcEnrgy");
                if (GTrnng < DBCConfig.maxTrnExp && curBody > maxBody / 2 && curEnergy > maxEnergy / 2) {
                    int all = curBody - 50;
                    int alle = curEnergy - 50;
                    if (all < 0) {
                        Player.setHealth(Player.getHealth() / 2.0f);
                        JRMCoreH.setInt(0, Player, "jrmcBdy");
                    } else {
                        JRMCoreH.setInt(all, Player, "jrmcBdy");
                    }
                    if (alle < 0) {
                        alle = 0;
                        JRMCoreH.setByte(0, Player, "jrmcRelease");
                    }
                    if (!JRMCoreH.isInCreativeMode((Entity)Player)) {
                        JRMCoreH.setInt(alle, Player, "jrmcEnrgy");
                    }
                    JRMCoreH.setShort(GTrnng + 1, Player, "jrmcGTrnng");
                    JRMCoreH.expPls(Player, 1);
                }
            } else if (dbctick == -6) {
                FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)Player, DBCConfig.planetEarth, (Teleporter)new WorldTeleporterDBCTelep(FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(DBCConfig.planetEarth)));
                ((EntityPlayerMP)Player).playerNetServerHandler.setPlayerLocation(77.5, 217.0, 10.5, 0.0f, 0.0f);
                Player.addExperience(1);
                JRMCoreH.setShort(2400, Player, "jrmcHTCTmO");
                String t = "dbc.timechamber.mustwaitaday";
                ChatStyle styl = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                Player.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(styl));
            } else if (dbctick == -100) {
                int dbcnum = this.nbt(Player, "pres").getInteger("DBCSenzu");
                PD.sendTo(new DBCPspacepod1(dbcnum), (EntityPlayerMP)Player);
            } else if (dbctick == -101) {
                int dbcnum = this.nbt(Player, "pres").getInteger("jrmcMaster");
                if (dbcnum == 0) {
                    this.nbt(Player, "pres").setInteger("jrmcMaster", 1);
                }
                PD.sendTo(new DBCPtick(dbcnum + 2), (EntityPlayerMP)Player);
            }
        }
    }

    public void handleDBCspacepod1(int planetID, EntityPlayer p) {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.SERVER) {
            Entity entity = null;
            if (planetID == 1) {
                if (p.ridingEntity != null) {
                    entity = p.ridingEntity;
                    entity.setDead();
                }
                FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)p, DBCConfig.planetNamek, (Teleporter)new WorldTeleporterDBCSpacePod01(FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(DBCConfig.planetNamek), entity));
                p.addExperience(1);
            }
            if (planetID == 2) {
                if (p.ridingEntity != null) {
                    entity = p.ridingEntity;
                    entity.setDead();
                }
                int plnt = DBCConfig.planetVegeta;
                if (!DBCConfig.plntVegeta) {
                    plnt = DBCConfig.planetEarth;
                }
                FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)p, plnt, (Teleporter)new WorldTeleporterDBCSpacePod01(FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(plnt), entity));
                p.addExperience(1);
            }
            if (planetID == 3) {
                if (p.ridingEntity != null) {
                    entity = p.ridingEntity;
                    entity.setDead();
                }
                FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)p, DBCConfig.planetEarth, (Teleporter)new WorldTeleporterDBCSpacePod01(FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(DBCConfig.planetEarth), entity));
                p.addExperience(1);
            }
        }
    }

    public void handleDBCchargepart(byte dbcchargepart, String dbcCharger, EntityPlayer p) {
        PD.sendToDimension(new DBCPchargepart(dbcchargepart, dbcCharger), p.dimension);
    }

    public void ki(NBTTagCompound tag, int e) {
        if (e == 2) {
            tag.setInteger("DBCKiCharge", tag.getInteger("DBCKiCharge") * e);
        }
        if (e == 3) {
            tag.setInteger("DBCKiCharge", tag.getInteger("DBCKiCharge") + tag.getInteger("DBCKiCharge") / (e - 1));
        }
        if (e == 4) {
            tag.setInteger("DBCKiCharge", tag.getInteger("DBCKiCharge") + tag.getInteger("DBCKiCharge") / (e - 1));
        }
        if (e == -4) {
            tag.setInteger("DBCKiCharge", tag.getInteger("DBCKiCharge") / 4);
        }
        if (e == -3) {
            tag.setInteger("DBCKiCharge", tag.getInteger("DBCKiCharge") / 3);
        }
        if (e == -2) {
            tag.setInteger("DBCKiCharge", tag.getInteger("DBCKiCharge") / 2);
        }
    }

    private boolean hasInstantTransformUnlocked(EntityPlayer p, boolean isRacial, int formID, int race) {
        double hasUnlocked = 0.0;
        if (JGConfigDBCFormMastery.FM_Enabled) {
            double masteryLevel;
            double unlockLevel = JGConfigDBCFormMastery.getDouble(race, formID + (isRacial ? 0 : JRMCoreH.trans[race].length), JGConfigDBCFormMastery.DATA_ID_INSTANT_TRANSFORM_UNLOCK);
            String message = "";
            if (unlockLevel <= -1.0) {
                hasUnlocked = -1.0;
                message = "Instant Transformation is not available for this Form!";
            } else if (unlockLevel > 0.0 && (masteryLevel = JRMCoreH.getFormMasteryValue(p, formID + (isRacial ? 0 : JRMCoreH.trans[race].length))) < unlockLevel) {
                hasUnlocked = unlockLevel;
                String formName = isRacial ? JRMCoreH.trans[race][formID] : JRMCoreH.transNonRacial[formID];
                message = "Failed to Instant Transform! Required " + formName + " Mastery Level: " + hasUnlocked + " to be unlocked!";
            }
            if (hasUnlocked != 0.0) {
                p.addChatMessage(new ChatComponentText(message).setChatStyle(styleRed));
                return false;
            }
        }
        return true;
    }

    public void handleDBCascend(byte dbcascend, EntityPlayer p) {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.SERVER) {
            boolean isParticipentCommandSender;
            String[] fusionParticipants;
            NBTTagCompound nbt2;
            boolean hasGodForm;
            boolean isKaiokenAvailable;
            JGPlayerMP jgPlayer = new JGPlayerMP(p);
            NBTTagCompound nbt = this.nbt(p, "pres");
            jgPlayer.setNBT(nbt);
            boolean quickTransform = dbcascend == -1;
            int transformationMeter = quickTransform ? 100 : jgPlayer.getTransformationMeter();
            String StE = jgPlayer.getStatusEffects();
            boolean statusKaiokenOn = JRMCoreH.StusEfcts(13, StE);
            boolean statusMysticOn = JRMCoreH.StusEfcts(13, StE);
            boolean statusUltraInstinctOn = JRMCoreH.StusEfcts(19, StE);
            boolean statusGodOfDestructionOn = JRMCoreH.StusEfcts(20, StE);
            int kaiokenSkillLevel = JRMCoreH.SklLvl(8, p);
            boolean bl = isKaiokenAvailable = JRMCoreH.PlyrSettingsB(nbt, 0) && kaiokenSkillLevel > 0 && (DBCConfig.MysticKaiokenOn || !statusMysticOn) && !statusUltraInstinctOn && !statusGodOfDestructionOn;
            if (transformationMeter < 100 && !isKaiokenAvailable) {
                return;
            }
            jgPlayer.setTransformationMeter(0);
            int[] playerAttributes = jgPlayer.getAttributes();
            byte race = jgPlayer.getRace();
            byte classID = jgPlayer.getClassID();
            byte powerType = jgPlayer.getPowerType();
            int quickTransformKiLoss = -1;
            int st = jgPlayer.getState();
            byte st2 = jgPlayer.getState2();
            if (quickTransform) {
                int curEnergy = jgPlayer.getEnergy();
                int maxEnergy = jgPlayer.getEnergyMax(race, classID, powerType, playerAttributes, JRMCoreH.SklLvl_KiBs(p, (int)powerType));
                boolean costPercentage = true;
                double costMulti = (double)DBCConfig.InstantTransformKiPercentageCost / 100.0;
                double energyCost = (double)maxEnergy * costMulti + (double)DBCConfig.InstantTransformKiCost;
                if ((double)curEnergy >= energyCost && DBCConfig.InstantTransformOn) {
                    int remainingEnergy;
                    quickTransformKiLoss = remainingEnergy = curEnergy - (int)energyCost;
                } else {
                    p.addChatMessage(new ChatComponentText("Not Enough Ki to Transform Instantly! Cost: " + energyCost).setChatStyle(styleRed));
                    return;
                }
            }
            int align = jgPlayer.getAlignment();
            int level = jgPlayer.getLevel(playerAttributes);
            String s1 = nbt.getString("jrmcSSltX");
            String s2 = nbt.getString("jrmcSSltY");
            int stUp = st;
            boolean isPainZero = nbt.getInteger("jrmcGyJ7dp") <= 0;
            int godSkillLevel = JRMCoreH.SklLvl(9, p);
            int mysticSkillLevel = JRMCoreH.SklLvl(10, p);
            int ultraInstinctSkillLevel = JRMCoreH.SklLvl(16, p);
            int godOfDestructionSkillLevel = JRMCoreH.SklLvl(18, p);
            boolean isMysticAvailable = JRMCoreH.PlyrSettingsB(nbt, 6) && mysticSkillLevel > 0;
            boolean isUIAvailable = JRMCoreH.PlyrSettingsB(nbt, 11) && ultraInstinctSkillLevel > 0 && JGConfigUltraInstinct.CONFIG_UI_LEVELS > 0;
            boolean isGoDAvailable = JRMCoreH.PlyrSettingsB(nbt, 16) && godOfDestructionSkillLevel > 0;
            boolean playerAscendNormal = JRMCoreH.PlyrSettingsI(p, 1, 0);
            boolean playerAscendGod = JRMCoreH.PlyrSettingsI(p, 1, 1);
            boolean playerAscendBlue = JRMCoreH.PlyrSettingsI(p, 1, 2);
            boolean playerAscendSS4 = JRMCoreH.PlyrSettingsI(p, 1, 3);
            boolean transformToOozaru = false;
            boolean tailMode = false;
            if (JRMCoreH.isRaceSaiyan(race)) {
                int n = 200;
                AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 200.0), (double)200.0, (double)(p.posZ - 200.0), (double)(p.posX + 200.0), (double)255.0, (double)(p.posZ + 200.0));
                List l = p.worldObj.getEntitiesWithinAABB(EntityEnergyFM.class, aabb);
                boolean pwbl = !l.isEmpty();
                tailMode = JRMCoreH.tailHas(JRMCoreH.getByte(p, "jrmcTlmd"));
                boolean night = JRMCoreH.StusEfcts(8, StE) || pwbl;
                boolean lookup = p.rotationPitch <= -90.0f;
                transformToOozaru = night && lookup && tailMode && st == 0;
            }
            boolean isNotFused = !JRMCoreH.isFused((Entity)p);
            boolean isFusionSelectedAvailable = JRMCoreH.PlyrSettingsB(nbt, 4) && isNotFused;
            String fusionMembers = nbt.getString("jrmcFuzion");
            boolean tryToUseUltraInstinct = false;
            int baseStateID = race == 4 ? 4 : 0;
            boolean isInBaseForm = st == baseStateID;
            boolean bl2 = hasGodForm = godSkillLevel > (JRMCoreH.isRaceSaiyan(race) ? 1 : 0);
            if (!statusUltraInstinctOn) {
                if (!statusMysticOn && isMysticAvailable && mysticSkillLevel > 0 && !transformToOozaru) {
                    boolean canUseMystic;
                    boolean bl3 = isInBaseForm && DBCConfig.MysticKaiokenOn ? !statusUltraInstinctOn : (canUseMystic = st2 == 0);
                    if (canUseMystic) {
                        if (quickTransformKiLoss != -1 && !DBCConfig.IsInstantTransformEnabled[2]) {
                            return;
                        }
                        if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, false, 1, race)) {
                            return;
                        }
                        if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, "Mystic")) {
                            return;
                        }
                        StE = JRMCoreH.StusEfcts(13, StE, nbt, true);
                        stUp = race == 4 ? 4 : 0;
                        jgPlayer.setStateAndTransformationMeter(stUp, 0);
                        JRMCoreH.PlyrSettingsRem(nbt, 6);
                    } else {
                        p.addChatMessage(new ChatComponentText("Unable to use Mystic form in your current state!").setChatStyle(styleRed));
                    }
                } else if (!statusGodOfDestructionOn && isGoDAvailable && !transformToOozaru) {
                    boolean canUseGoD;
                    boolean bl4 = canUseGoD = isInBaseForm && st2 == 0 && hasGodForm && align <= JGConfigDBCGoD.CONFIG_GOD_MAX_ALIGNMENT && JGConfigDBCGoD.CONFIG_GOD_ENABLED;
                    if (canUseGoD) {
                        if (quickTransformKiLoss != -1 && !DBCConfig.IsInstantTransformEnabled[3]) {
                            return;
                        }
                        if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, false, 3, race)) {
                            return;
                        }
                        if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, "GodOfDestruction")) {
                            return;
                        }
                        int levelRequirement = JGConfigDBCGoD.CONFIG_GOD_LEVEL_REQUIREMENT;
                        if (level > levelRequirement || (byte)new Random().nextInt(100) <= JGConfigDBCGoD.CONFIG_GOD_REGARDLESS_LEVEL_REQUIREMENT) {
                            StE = JRMCoreH.StusEfcts(20, StE, nbt, true);
                            stUp = baseStateID;
                            jgPlayer.setStateAndTransformationMeter(stUp, 0);
                            JRMCoreH.PlyrSettingsRem(nbt, 16);
                        } else {
                            p.addChatMessage(new ChatComponentText("Your level was not enough to use God of Destruction (" + level + "/" + levelRequirement + ") (Failed secondary " + JGConfigDBCGoD.CONFIG_GOD_REGARDLESS_LEVEL_REQUIREMENT + "% success chance)").setChatStyle(styleRed));
                        }
                    } else {
                        String message = !JGConfigDBCGoD.CONFIG_GOD_ENABLED ? "God of Destruction form is Disabled!" : (align > JGConfigDBCGoD.CONFIG_GOD_MAX_ALIGNMENT ? "Your Alignment is too high to use God of Destruction! Max Alignment: " + JGConfigDBCGoD.CONFIG_GOD_MAX_ALIGNMENT : "Unable to use God of Destruction form in your current state!");
                        p.addChatMessage(new ChatComponentText(message).setChatStyle(styleYellow));
                    }
                } else if (!statusMysticOn && isUIAvailable && isInBaseForm && !transformToOozaru && st2 < JGConfigUltraInstinct.CONFIG_UI_LEVELS && hasGodForm) {
                    if (quickTransformKiLoss != -1 && !DBCConfig.IsInstantTransformEnabled[1]) {
                        return;
                    }
                    if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, false, 2, race)) {
                        return;
                    }
                    if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, "UltraInstict")) {
                        return;
                    }
                    tryToUseUltraInstinct = true;
                } else if (!statusMysticOn && isFusionSelectedAvailable && !JRMCoreConfig.fuzn) {
                    if (quickTransformKiLoss != -1) {
                        return;
                    }
                    String t = JRMCoreH.trlai("jrmc", "specskilldisabled");
                    p.addChatMessage(new ChatComponentTranslation(t, new Object[]{JRMCoreH.DBCSkillNames[0]}).setChatStyle(styleYellow));
                } else if (!statusMysticOn && isFusionSelectedAvailable && JRMCoreConfig.fuzn) {
                    if (quickTransformKiLoss != -1) {
                        return;
                    }
                    if (statusMysticOn) {
                        StE = JRMCoreH.StusEfcts(13, StE, nbt, false);
                    }
                    if (fusionMembers.equals(" ")) {
                        jgPlayer.setTransformationMeter(0);
                        int n = 3;
                        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 3.0), (double)(p.posY - 3.0), (double)(p.posZ - 3.0), (double)(p.posX + 3.0), (double)(p.posY + 3.0), (double)(p.posZ + 3.0));
                        List entityList = p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                        if (!entityList.isEmpty()) {
                            for (int i = 0; i < entityList.size(); ++i) {
                                byte rc2;
                                EntityPlayer pl2 = (EntityPlayer)entityList.get(i);
                                if (pl2.getCommandSenderName().equals(p.getCommandSenderName()) || !JRMCoreH.race_match(race, rc2 = (nbt2 = this.nbt(pl2, "pres")).getByte("jrmcRace"))) continue;
                                boolean isNotFused2 = !JRMCoreH.isFused((Entity)pl2);
                                boolean f2 = JRMCoreH.PlyrSettingsB(nbt2, 4) && isNotFused2;
                                String StE2 = nbt2.getString("jrmcStatusEff");
                                boolean pl2HasAura = JRMCoreH.StusEfcts(4, StE2);
                                Random rand = new Random();
                                int random = rand.nextInt(100);
                                int fusionLevel1 = JRMCoreH.SklLvl(0, p);
                                int fusionLevel2 = JRMCoreH.SklLvl(0, pl2);
                                if (!pl2HasAura) continue;
                                if (30 + fusionLevel1 * 3 + fusionLevel2 * 3 < random) {
                                    JRMCoreH.PlyrSettingsRem(nbt2, 4);
                                    JRMCoreH.PlyrSettingsRem(nbt, 4);
                                    String t = JRMCoreH.trlai("dbc", "playersFuseFaild");
                                    p.addChatMessage(new ChatComponentTranslation(t, new Object[]{p.getCommandSenderName(), pl2.getCommandSenderName()}).setChatStyle(styleYellow));
                                    pl2.addChatMessage(new ChatComponentTranslation(t, new Object[]{p.getCommandSenderName(), pl2.getCommandSenderName()}).setChatStyle(styleYellow));
                                    mod_DragonBC.logger.info(p.getCommandSenderName() + " and " + pl2.getCommandSenderName() + " fusion failed!");
                                    nbt.setString("jrmcFuzion", "" + JRMCoreConfig.FznOverTime);
                                    nbt2.setString("jrmcFuzion", "" + JRMCoreConfig.FznOverTime);
                                    JRMCoreH.StusEfcts(10, nbt, false);
                                    JRMCoreH.StusEfcts(11, nbt, false);
                                    JRMCoreH.StusEfcts(10, nbt2, false);
                                    JRMCoreH.StusEfcts(11, nbt2, false);
                                } else {
                                    if (!f2) continue;
                                    JRMCoreH.PlyrSettingsRem(nbt2, 4);
                                    JRMCoreH.PlyrSettingsRem(nbt, 4);
                                    StE = JRMCoreH.StusEfcts(10, StE, nbt, true);
                                    StE2 = JRMCoreH.StusEfcts(11, StE2, nbt2, true);
                                    String fznn = JRMCoreHDBC.f_namgen(p.getCommandSenderName(), pl2.getCommandSenderName());
                                    int FznTime = JRMCoreConfig.FznTime - (JRMCoreH.isRaceArcosian(race) && stUp > 4 ? (stUp - 4) * 5 : (JRMCoreH.isRaceHumanOrNamekian(race) ? stUp * 5 : stUp * 2));
                                    nbt2.setString("jrmcFuzion", p.getCommandSenderName() + "," + pl2.getCommandSenderName() + "," + FznTime);
                                    nbt.setString("jrmcFuzion", p.getCommandSenderName() + "," + pl2.getCommandSenderName() + "," + FznTime);
                                    mod_DragonBC.logger.info(p.getCommandSenderName() + " and " + pl2.getCommandSenderName() + " fused to " + fznn + "!");
                                    String t = JRMCoreH.trlai("dbc", "playersFused");
                                    p.addChatMessage(new ChatComponentTranslation(t, new Object[]{p.getCommandSenderName(), pl2.getCommandSenderName(), fznn}).setChatStyle(styleYellow));
                                    pl2.addChatMessage(new ChatComponentTranslation(t, new Object[]{p.getCommandSenderName(), pl2.getCommandSenderName(), fznn}).setChatStyle(styleYellow));
                                    this.soundPowerUp(p, "jinryuudragonbc:DBC.fusefin");
                                    StE = JRMCoreH.StusEfcts(3, StE, nbt, false);
                                    StE = JRMCoreH.StusEfcts(5, StE, nbt, false);
                                    StE = JRMCoreH.StusEfcts(4, StE, nbt, false);
                                    StE2 = JRMCoreH.StusEfcts(3, StE2, nbt2, false);
                                    StE2 = JRMCoreH.StusEfcts(5, StE2, nbt2, false);
                                    StE2 = JRMCoreH.StusEfcts(4, StE2, nbt2, false);
                                    nbt.setByte("jrmcState2", (byte)0);
                                    nbt2.setByte("jrmcState2", (byte)0);
                                    String[] PlyrSkills = JRMCoreH.PlyrSkills(p);
                                    byte pwr = nbt.getByte("jrmcPwrtyp");
                                    byte rce = nbt.getByte("jrmcRace");
                                    byte cls = nbt.getByte("jrmcClass");
                                    int maxBody = JRMCoreH.stat((Entity)p, 2, pwr, 2, playerAttributes[2], rce, cls, 0.0f);
                                    int ki = JRMCoreH.stat((Entity)p, 5, pwr, 5, playerAttributes[5], rce, cls, JRMCoreH.SklLvl_KiBs(PlyrSkills, (int)pwr));
                                    playerAttributes = JRMCoreH.PlyrAttrbts(pl2);
                                    PlyrSkills = JRMCoreH.PlyrSkills(pl2);
                                    int maxBodyF = JRMCoreH.stat((Entity)pl2, 2, pwr, 2, playerAttributes[2], rce, cls, 0.0f);
                                    int kiF = JRMCoreH.stat((Entity)pl2, 5, pwr, 5, playerAttributes[5], rce, cls, JRMCoreH.SklLvl_KiBs(PlyrSkills, (int)pwr));
                                    double curBody = nbt.getInteger("jrmcBdy");
                                    double curEn = nbt.getInteger("jrmcEnrgy");
                                    nbt.setInteger("jrmcBdy", (int)(curBody / (double)maxBody * (double)maxBodyF));
                                    nbt.setInteger("jrmcEnrgy", (int)(curEn / (double)ki * (double)kiF));
                                }
                                break;
                            }
                        }
                    }
                } else if (!(statusMysticOn || s1 == null || isKaiokenAvailable && !transformToOozaru)) {
                    if (statusMysticOn) {
                        StE = JRMCoreH.StusEfcts(13, StE, nbt, false);
                    }
                    if (statusGodOfDestructionOn) {
                        StE = JRMCoreH.StusEfcts(20, StE, nbt, false);
                    }
                    if (statusUltraInstinctOn) {
                        StE = JRMCoreH.StusEfcts(19, StE, nbt, false);
                    }
                    int racialSkillLevel = JRMCoreH.SklLvlX(1, s1);
                    if (JRMCoreH.isRaceSaiyan(race)) {
                        List listMasters;
                        boolean state;
                        int s4ft = JRMCoreH.getInt(p, "jrmcAfGFtStFT");
                        int ssgHelp = 0;
                        int n = 3;
                        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 3.0), (double)(p.posY - 3.0), (double)(p.posZ - 3.0), (double)(p.posX + 3.0), (double)(p.posY + 3.0), (double)(p.posZ + 3.0));
                        List list = p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                        if (!list.isEmpty()) {
                            for (int i = 0; i < list.size(); ++i) {
                                EntityPlayer pl = (EntityPlayer)list.get(i);
                                if (pl.getCommandSenderName().equals(p.getCommandSenderName())) continue;
                                String StE2 = JRMCoreH.getString(pl, "jrmcStatusEff");
                                byte align2 = JRMCoreH.getByte(pl, "jrmcAlign");
                                boolean a = JRMCoreH.StusEfcts(4, StE2);
                                int sg = JRMCoreH.getInt(pl, "jrmcGodStrain");
                                byte s = JRMCoreH.getByte(pl, "jrmcState");
                                byte rcpl = JRMCoreH.getByte(pl, "jrmcRace");
                                boolean bl5 = state = s == 1 || s == 4 || s == 0;
                                if (!state || !a || sg > 0 || JRMCoreH.Algnmnt(align2) != 0 || !JRMCoreH.isRaceSaiyan(rcpl)) continue;
                                ++ssgHelp;
                            }
                        }
                        if (ssgHelp == 0 && !(listMasters = p.worldObj.getEntitiesWithinAABB(EntityDBCKami.class, aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 3.0), (double)(p.posY - 3.0), (double)(p.posZ - 3.0), (double)(p.posX + 3.0), (double)(p.posY + 3.0), (double)(p.posZ + 3.0)))).isEmpty()) {
                            for (int i = 0; i < listMasters.size(); ++i) {
                                EntityDBCKami entity = (EntityDBCKami)listMasters.get(i);
                                if (!(entity instanceof EntityMasterGoku) && !(entity instanceof EntityMasterGohan) && !(entity instanceof EntityMasterTrunksFuture) && !(entity instanceof EntityMasterVegeta)) continue;
                                ++ssgHelp;
                            }
                        }
                        if (transformToOozaru) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 7, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][7])) {
                                return;
                            }
                            stUp = 7;
                            jgPlayer.setStateAndTransformationMeter(7, 0);
                        } else if (racialSkillLevel >= 2 && st == 7) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 8, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][8])) {
                                return;
                            }
                            stUp = 8;
                            jgPlayer.setStateAndTransformationMeter(8, 0);
                        } else if (racialSkillLevel >= 8 && st == 8 && tailMode && DBCConfig.DBGT) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 14, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][14])) {
                                return;
                            }
                            stUp = 14;
                            jgPlayer.setStateAndTransformationMeter(14, 0);
                            JRMCoreH.setInt(1, p, "jrmcAfGFtStFT");
                        } else if (JRMCoreHDBC.DBCgetConfigGodform() && st == 0 && ssgHelp >= DBCConfig.SSGHelp && JRMCoreH.Algnmnt(align) == 0) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 11, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][11])) {
                                return;
                            }
                            stUp = 11;
                            jgPlayer.setStateAndTransformationMeter(11, 0);
                            int gplvl = JRMCoreH.getPlayerLevel(playerAttributes);
                            int gp = 0;
                            if (!list.isEmpty()) {
                                int hlprs = 0;
                                for (int i = 0; i < list.size(); ++i) {
                                    EntityPlayer pl = (EntityPlayer)list.get(i);
                                    if (pl.getCommandSenderName().equals(p.getCommandSenderName())) continue;
                                    byte align2 = JRMCoreH.getByte(pl, "jrmcAlign");
                                    int sg = JRMCoreH.getInt(pl, "jrmcGodStrain");
                                    byte s = JRMCoreH.getByte(pl, "jrmcState");
                                    state = s == 1 || s == 4 || s == 0;
                                    byte rcpl = JRMCoreH.getByte(pl, "jrmcRace");
                                    if (!state || sg > 0 || JRMCoreH.Algnmnt(align2) != 0 || !JRMCoreH.isRaceSaiyan(rcpl)) continue;
                                    gp += JRMCoreH.getPlayerLevel(JRMCoreH.PlyrAttrbts(pl));
                                    double reqMulti = 1.0;
                                    if (JGConfigDBCFormMastery.FM_Enabled) {
                                        int formID = JRMCoreH.getFormID(JRMCoreH.trans[race][11], race);
                                        double masteryLevel = JRMCoreH.getFormMasteryValue(pl, formID);
                                        reqMulti = (float)JGConfigDBCFormMastery.getCostMulti(masteryLevel, race, formID, JGConfigDBCFormMastery.DATA_ID_GOD_RITUAL_STRAIN_COST_MULTI);
                                    }
                                    JRMCoreH.setInt((int)((double)DBCConfig.StrainGod * reqMulti), pl, "jrmcGodStrain");
                                    JRMCoreH.setInt(0, pl, "jrmcEnrgy");
                                    ++hlprs;
                                }
                                gp = (hlprs == 0 ? gplvl : gp) / DBCConfig.SSGHelp;
                                float gpf = (float)gp / (float)gplvl;
                                gpf = gpf > 2.0f ? 2.0f : (gpf < 0.2f ? 0.2f : gpf);
                                double reqMulti = 1.0;
                                if (JGConfigDBCFormMastery.FM_Enabled) {
                                    int formID = JRMCoreH.getFormID(JRMCoreH.trans[race][11], race);
                                    double masteryLevel = JRMCoreH.getFormMasteryValue(p, formID);
                                    reqMulti = (float)JGConfigDBCFormMastery.getCostMulti(masteryLevel, race, formID, JGConfigDBCFormMastery.DATA_ID_GOD_RITUAL_TIMER_MULTI);
                                }
                                gp = (int)((double)(120.0f * gpf) * reqMulti);
                            }
                            JRMCoreH.setInt(gp, p, "jrmcGodPwr");
                        } else if (JRMCoreHDBC.DBCgetConfigGodform() && JRMCoreHDBC.godformslr(racialSkillLevel) && (st == 0 || st == 9) && godSkillLevel > 1 && playerAscendBlue) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 10, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][10])) {
                                return;
                            }
                            stUp = 10;
                            jgPlayer.setStateAndTransformationMeter(10, 0);
                        } else if (racialSkillLevel >= 6 && JRMCoreHDBC.DBCgetConfigGodform() && JRMCoreHDBC.godformslr(racialSkillLevel) && godSkillLevel > 2 && (playerAscendBlue || playerAscendGod) && st == 10) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 15, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][15])) {
                                return;
                            }
                            stUp = 15;
                            jgPlayer.setStateAndTransformationMeter(15, 0);
                        } else if (JRMCoreHDBC.DBCgetConfigGodform() && JRMCoreHDBC.godformslr(racialSkillLevel) && godSkillLevel > 0 && playerAscendGod && st == 0) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 9, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][9])) {
                                return;
                            }
                            stUp = 9;
                            jgPlayer.setStateAndTransformationMeter(9, 0);
                        } else if (JRMCoreHDBC.DBCgetConfigGodform() && JRMCoreHDBC.godformslr(racialSkillLevel) && godSkillLevel > 1 && playerAscendGod && st == 9) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 10, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][10])) {
                                return;
                            }
                            stUp = 10;
                            jgPlayer.setStateAndTransformationMeter(10, 0);
                        } else if (racialSkillLevel >= 8 && st == 0 && playerAscendSS4 && s4ft > 0 && tailMode && DBCConfig.DBGT) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 14, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][14])) {
                                return;
                            }
                            stUp = 14;
                            jgPlayer.setStateAndTransformationMeter(14, 0);
                        } else if (racialSkillLevel >= 5 && st == 0) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 4, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][4])) {
                                return;
                            }
                            stUp = 4;
                            jgPlayer.setStateAndTransformationMeter(4, 0);
                        } else if (racialSkillLevel >= 2 && st == 0) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 1, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][1])) {
                                return;
                            }
                            stUp = 1;
                            jgPlayer.setStateAndTransformationMeter(1, 0);
                        } else if (racialSkillLevel >= 6 && st == 4 && playerAscendNormal) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 5, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][5])) {
                                return;
                            }
                            stUp = 5;
                            jgPlayer.setStateAndTransformationMeter(5, 0);
                        } else if (racialSkillLevel >= 3 && (st == 1 || st == 4)) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 2, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][2])) {
                                return;
                            }
                            stUp = 2;
                            jgPlayer.setStateAndTransformationMeter(2, 0);
                        } else if (racialSkillLevel >= 4 && st == 2) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 3, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][3])) {
                                return;
                            }
                            stUp = 3;
                            jgPlayer.setStateAndTransformationMeter(3, 0);
                        } else if (racialSkillLevel >= 7 && st == 5) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 6, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][6])) {
                                return;
                            }
                            stUp = 6;
                            jgPlayer.setStateAndTransformationMeter(6, 0);
                        } else {
                            quickTransformKiLoss = -1;
                        }
                    } else if (JRMCoreH.isRaceArcosian(race)) {
                        String bns = JRMCoreH.StusEfcts[6];
                        if (StE.contains(bns)) {
                            nbt.setString("jrmcStatusEff", StE.replace(bns, ""));
                        }
                        nbt.setByte("jrmcTlmd", (byte)0);
                        if (racialSkillLevel >= 1 && st == 0) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 1, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][1])) {
                                return;
                            }
                            stUp = 1;
                            jgPlayer.setStateAndTransformationMeter(1, 0);
                        } else if (racialSkillLevel >= 1 && st == 1) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 2, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][2])) {
                                return;
                            }
                            stUp = 2;
                            jgPlayer.setStateAndTransformationMeter(2, 0);
                        } else if (racialSkillLevel >= 1 && st == 2) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 3, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][3])) {
                                return;
                            }
                            stUp = 3;
                            jgPlayer.setStateAndTransformationMeter(3, 0);
                        } else if (racialSkillLevel >= 1 && st == 3) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 4, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][4])) {
                                return;
                            }
                            stUp = 4;
                            jgPlayer.setStateAndTransformationMeter(4, 0);
                        } else if (racialSkillLevel >= 7 && st == 4 && godSkillLevel > 0 && playerAscendGod) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 7, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][7])) {
                                return;
                            }
                            stUp = 7;
                            jgPlayer.setStateAndTransformationMeter(7, 0);
                        } else if (racialSkillLevel >= 7 && st == 4 && playerAscendNormal) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 6, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][6])) {
                                return;
                            }
                            stUp = 6;
                            jgPlayer.setStateAndTransformationMeter(6, 0);
                        } else if (racialSkillLevel >= 4 && st == 4) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 5, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][5])) {
                                return;
                            }
                            stUp = 5;
                            jgPlayer.setStateAndTransformationMeter(5, 0);
                        } else {
                            quickTransformKiLoss = -1;
                        }
                    } else if (JRMCoreH.isRaceMajin(race)) {
                        if (JRMCoreHDBC.DBCgetConfigGodform() && JRMCoreHDBC.hasMajinGodRacialRequirement(racialSkillLevel) && st == 0 && godSkillLevel > 0 && playerAscendGod) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 4, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][4])) {
                                return;
                            }
                            stUp = 4;
                            jgPlayer.setStateAndTransformationMeter(4, 0);
                        } else if (racialSkillLevel >= 6 && st == 0 && playerAscendNormal) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 3, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][3])) {
                                return;
                            }
                            stUp = 3;
                            jgPlayer.setStateAndTransformationMeter(3, 0);
                        } else if (racialSkillLevel >= 3 && st == 0) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 1, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][1])) {
                                return;
                            }
                            stUp = 1;
                            jgPlayer.setStateAndTransformationMeter(1, 0);
                        } else if (racialSkillLevel >= 4 && st == 1) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 2, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][2])) {
                                return;
                            }
                            stUp = 2;
                            jgPlayer.setStateAndTransformationMeter(2, 0);
                        } else {
                            quickTransformKiLoss = -1;
                        }
                    } else if (JRMCoreH.isRaceHumanOrNamekian(race)) {
                        if (JRMCoreHDBC.DBCgetConfigGodform() && JRMCoreHDBC.godformslrHN(racialSkillLevel) && st == 0 && godSkillLevel > 0 && playerAscendGod) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 3, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][3])) {
                                return;
                            }
                            stUp = 3;
                            jgPlayer.setStateAndTransformationMeter(3, 0);
                        } else if (racialSkillLevel >= 3 && st == 0 && playerAscendNormal) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 1, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][1])) {
                                return;
                            }
                            stUp = 1;
                            jgPlayer.setStateAndTransformationMeter(1, 0);
                        } else if (racialSkillLevel >= 2 && st == 0) {
                            if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, true, 2, race)) {
                                return;
                            }
                            if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, JRMCoreH.trans[race][2])) {
                                return;
                            }
                            stUp = 2;
                            jgPlayer.setStateAndTransformationMeter(2, 0);
                        } else {
                            quickTransformKiLoss = -1;
                        }
                    }
                } else if (isKaiokenAvailable && kaiokenSkillLevel > st2) {
                    if (quickTransformKiLoss != -1 && !DBCConfig.IsInstantTransformEnabled[0]) {
                        return;
                    }
                    if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, false, 0, race)) {
                        return;
                    }
                    if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, "Kaioken")) {
                        return;
                    }
                    if (JRMCoreH.TransKaiDmg.length - 1 > st2) {
                        nbt.setByte("jrmcState2", (byte)(st2 + 1));
                        p.addChatMessage(new ChatComponentText("Kaioken " + JRMCoreH.TransKaiNms[st2 + 1]).setChatStyle(styleGold));
                    }
                }
            } else if (isUIAvailable && st == (race == 4 ? 4 : 0) && !transformToOozaru && st2 < JGConfigUltraInstinct.CONFIG_UI_LEVELS && godSkillLevel > (JRMCoreH.isRaceSaiyan(race) ? 1 : 0)) {
                if (quickTransformKiLoss != -1 && !DBCConfig.IsInstantTransformEnabled[1]) {
                    return;
                }
                if (DBCConfig.InstantTransformOn && quickTransform && !this.hasInstantTransformUnlocked(p, false, 2, race)) {
                    return;
                }
                if (JGConfigDBCFormMastery.FM_Enabled && !JRMCoreH.hasRequiredFormMasteries(p, JRMCoreH.getFormMasteryData(p), (int)race, "UltraInstict")) {
                    return;
                }
                tryToUseUltraInstinct = true;
            }
            if (tryToUseUltraInstinct) {
                if (quickTransformKiLoss != -1 && !DBCConfig.IsInstantTransformEnabled[1]) {
                    return;
                }
                if (isPainZero) {
                    byte random;
                    boolean uiCheckEachLevel = JGConfigUltraInstinct.CONFIG_UI_CHECK_SKIP_REQUIREMENT_EACH_LEVEL == 0;
                    byte experiencePainMode = JGConfigUltraInstinct.CONFIG_UI_EXPERIENCE_PAIN_MODE;
                    boolean canIgnorePain = experiencePainMode <= 0 ? true : nbt.getByte("jrmcUIWasInPain") > 0;
                    stUp = JRMCoreH.getBaseForm(race);
                    jgPlayer.setStateAndTransformationMeter(stUp, 0);
                    boolean succeded = false;
                    boolean skippable = true;
                    Random rand = new Random();
                    byte randomLast = random = (byte)rand.nextInt(100);
                    int curBody = jgPlayer.getHealth();
                    int maxBody = jgPlayer.getHealthMax(race, classID, powerType, playerAttributes);
                    int[] levelRequirement = JGConfigUltraInstinct.CONFIG_UI_LEVEL_REQUIREMENT;
                    byte[] healthPercentage = JGConfigUltraInstinct.CONFIG_UI_HEALTH_PERCENTAGE;
                    double reqMulti = 1.0;
                    if (JGConfigDBCFormMastery.FM_Enabled) {
                        int formID = JRMCoreH.getFormID("UltraInstict", race);
                        double masteryLevel = JRMCoreH.getFormMasteryValue(p, formID);
                        reqMulti = JGConfigDBCFormMastery.getCostMulti(masteryLevel, race, formID, JGConfigDBCFormMastery.DATA_ID_UI_HEALTH_REQ_MULTI);
                    }
                    if (uiCheckEachLevel) {
                        while (!(st2 >= JGConfigUltraInstinct.CONFIG_UI_LEVELS || ultraInstinctSkillLevel <= st2 || !skippable || level <= levelRequirement[st2] && random > JGConfigUltraInstinct.CONFIG_UI_REGARDLESS_LEVEL_REQUIREMENT[st2] || (int)((double)healthPercentage[st2] * reqMulti) < 100 && curBody / (maxBody / 100) > (int)((double)healthPercentage[st2] * reqMulti) || JGConfigUltraInstinct.CONFIG_UI_HAIR_WHITE[st2] && !canIgnorePain)) {
                            if (JGConfigUltraInstinct.CONFIG_UI_HAIR_WHITE[st2] && experiencePainMode == 2) {
                                nbt.setByte("jrmcUIWasInPain", (byte)0);
                            }
                            succeded = true;
                            randomLast = random;
                            random = (byte)rand.nextInt(100);
                            skippable = JGConfigUltraInstinct.CONFIG_UI_SKIP[st2];
                            byte UI_HighestStateReached = nbt.getByte("jrmcUIStateReach");
                            if ((st2 = (byte)(st2 + 1)) <= UI_HighestStateReached) continue;
                            nbt.setByte("jrmcUIStateReach", st2);
                        }
                    } else {
                        boolean[] conditionsMet = new boolean[JGConfigUltraInstinct.CONFIG_UI_LEVELS];
                        for (int i = 0; i < conditionsMet.length; ++i) {
                            conditionsMet[i] = false;
                        }
                        while (st2 < JGConfigUltraInstinct.CONFIG_UI_LEVELS && ultraInstinctSkillLevel > st2 && skippable) {
                            skippable = JGConfigUltraInstinct.CONFIG_UI_SKIP[st2];
                            conditionsMet[st2] = !(st2 >= JGConfigUltraInstinct.CONFIG_UI_LEVELS || ultraInstinctSkillLevel <= st2 || level <= levelRequirement[st2] && random > JGConfigUltraInstinct.CONFIG_UI_REGARDLESS_LEVEL_REQUIREMENT[st2] || (int)((double)healthPercentage[st2] * reqMulti) < 100 && curBody / (maxBody / 100) > (int)((double)healthPercentage[st2] * reqMulti) || JGConfigUltraInstinct.CONFIG_UI_HAIR_WHITE[st2] && !canIgnorePain);
                            randomLast = random;
                            random = (byte)rand.nextInt(100);
                            st2 = (byte)(st2 + 1);
                        }
                        int conditionCount = conditionsMet.length;
                        for (int i = conditionCount - 1; i >= 0; --i) {
                            if (!conditionsMet[i]) continue;
                            st2 = (byte)i;
                            if (JGConfigUltraInstinct.CONFIG_UI_HAIR_WHITE[st2] && experiencePainMode == 2) {
                                nbt.setByte("jrmcUIWasInPain", (byte)0);
                            }
                            succeded = true;
                            skippable = JGConfigUltraInstinct.CONFIG_UI_SKIP[st2];
                            byte UI_HighestStateReached = nbt.getByte("jrmcUIStateReach");
                            if ((st2 = (byte)(st2 + 1)) <= UI_HighestStateReached) break;
                            nbt.setByte("jrmcUIStateReach", st2);
                            break;
                        }
                    }
                    if (succeded) {
                        StE = JRMCoreH.StusEfcts(19, StE, nbt, true);
                        jgPlayer.setState2(st2);
                        p.addChatMessage(new ChatComponentText(JGConfigUltraInstinct.CONFIG_UI_CHAT_SUCCEED[st2 - 1].replace("@p", p.getDisplayName())).setChatStyle(styleYellow));
                    }
                    if (st2 <= JGConfigUltraInstinct.CONFIG_UI_LEVELS) {
                        if (st2 == JGConfigUltraInstinct.CONFIG_UI_LEVELS) {
                            st2 = (byte)(st2 - 1);
                        }
                        if (ultraInstinctSkillLevel > st2) {
                            if (level <= levelRequirement[st2] && randomLast > JGConfigUltraInstinct.CONFIG_UI_REGARDLESS_LEVEL_REQUIREMENT[st2]) {
                                p.addChatMessage(new ChatComponentText("Your level was not enough to use an Ultra Instinct Lvl (" + level + "/" + levelRequirement[st2] + ") (Failed secondary " + JGConfigUltraInstinct.CONFIG_UI_REGARDLESS_LEVEL_REQUIREMENT[st2] + "% success chance)").setChatStyle(styleRed));
                            } else if ((int)((double)healthPercentage[st2] * reqMulti) < 100 && curBody / (maxBody / 100) > (int)((double)healthPercentage[st2] * reqMulti)) {
                                p.addChatMessage(new ChatComponentText("Your health was not low enough to use an Ultra Instinct Level (" + (int)((double)healthPercentage[st2] * reqMulti) + "% or below)").setChatStyle(styleRed));
                            } else if (JGConfigUltraInstinct.CONFIG_UI_HAIR_WHITE[st2] && !canIgnorePain) {
                                p.addChatMessage(new ChatComponentText("You must experience 'Pain' Status Effect before using Complete Ultra Instinct").setChatStyle(styleRed));
                            }
                        }
                        if (st2 == JGConfigUltraInstinct.CONFIG_UI_LEVELS) {
                            st2 = (byte)(st2 + 1);
                        }
                    }
                } else {
                    p.addChatMessage(new ChatComponentText("You can't use Ultra Instinct while in Pain").setChatStyle(styleRed));
                }
            }
            if (!fusionMembers.equals(" ") && !isKaiokenAvailable && (fusionParticipants = fusionMembers.split(",")).length == 3 && (isParticipentCommandSender = fusionParticipants[0].equalsIgnoreCase(p.getCommandSenderName()))) {
                EntityPlayer pl2 = p.worldObj.getPlayerEntityByName(fusionParticipants[1]);
                boolean isPlayer2Null = pl2 == null;
                int fusionTime = Integer.parseInt(fusionParticipants[2]) - (JRMCoreH.isRaceArcosian(race) && stUp > 4 ? (stUp - 4) * 5 : (JRMCoreH.isRaceHumanOrNamekian(race) ? stUp * 5 : stUp * 2));
                if (!isPlayer2Null) {
                    nbt2 = JRMCoreH.nbt(pl2);
                    fusionMembers = fusionParticipants[0] + "," + fusionParticipants[1] + "," + fusionTime;
                    nbt.setString("jrmcFuzion", fusionMembers);
                    fusionMembers = fusionParticipants[0] + "," + fusionParticipants[1] + "," + fusionTime;
                    nbt2.setString("jrmcFuzion", fusionMembers);
                }
            }
            if ((st2 = nbt.getByte("jrmcState2")) > 0 && isKaiokenAvailable) {
                if (quickTransformKiLoss != -1 && !DBCConfig.IsInstantTransformEnabled[0]) {
                    return;
                }
                int skl = JRMCoreH.SklLvlX(1, JRMCoreH.getString(p, "jrmcSSltX"));
                int strn = JRMCoreH.getInt(p, "jrmcStrain");
                int strnTmp = nbt.getInteger("jrmcStrainTemp");
                int strnAct = nbt.getInteger("jrmcStrainActv");
                int curBody = jgPlayer.getHealth();
                int maxBody = jgPlayer.getHealthMax(race, classID, powerType, playerAttributes);
                double kaiokenCost = JRMCoreH.KaiKCost(p) * (double)maxBody;
                int ske = JRMCoreH.SklLvl(4, p);
                int r = new Random().nextInt(100);
                float rd = 0.5f + 0.05f * (float)(10 - ske);
                if (kaiokenSkillLevel * 3 > r) {
                    kaiokenCost = 0.0;
                } else if (kaiokenSkillLevel * 5 > r) {
                    kaiokenCost *= (double)rd;
                }
                int curen = (int)((double)curBody - kaiokenCost < 1.0 ? 1.0 : (double)curBody - kaiokenCost);
                if (!JRMCoreH.isInCreativeMode((Entity)p)) {
                    JRMCoreH.setInt(curen, p, "jrmcBdy");
                }
                float strainMulti = 1.0f;
                float strainMulti2 = 1.0f;
                if (JGConfigDBCFormMastery.FM_Enabled) {
                    int kkID = JRMCoreH.getFormID("Kaioken", race);
                    double kkMasteryLevel = JRMCoreH.getFormMasteryValue(p, kkID);
                    strainMulti = (float)JGConfigDBCFormMastery.getCostMulti(kkMasteryLevel, race, kkID, JGConfigDBCFormMastery.DATA_ID_KAIOKEN_STRAIN_TEMP_MULTI);
                    strainMulti2 = (float)JGConfigDBCFormMastery.getCostMulti(kkMasteryLevel, race, kkID, JGConfigDBCFormMastery.DATA_ID_KAIOKEN_STRAIN_ACTIVE_MULTI);
                }
                if (!JRMCoreConfig.sskai) {
                    int strainTemp = (JRMCoreH.isRaceSaiyan(race) && stUp == 0 ? 1 : (race == 4 && stUp <= 4 ? 1 : (JRMCoreH.isRaceHumanOrNamekian(race) && stUp <= 1 ? 1 : 12))) + (20 - kaiokenSkillLevel);
                    strainTemp = (int)((float)strainTemp * strainMulti);
                    JRMCoreH.setInt(strainTemp += strnTmp, p, "jrmcStrainTemp");
                }
                if ((float)curen <= (float)maxBody * 0.1f && !JRMCoreH.isInCreativeMode((Entity)p)) {
                    jgPlayer.setState(JRMCoreH.getBaseForm(race));
                    jgPlayer.setState2(0);
                    JRMCoreH.setInt(curen, p, "jrmcBdy");
                }
                if (!JRMCoreConfig.sskai) {
                    if (strnAct <= 0) {
                        int sa = 100 + kaiokenSkillLevel * 6 - MathHelper.ceiling_float_int((float)JRMCoreH.KaiKFBal(race, st, st2, skl, strn)) * 2 - st2 * 2;
                        sa = (int)((float)sa * strainMulti);
                        JRMCoreH.setInt(sa, p, "jrmcStrainActv");
                    } else {
                        strnAct = (int)((float)strnAct - strainMulti2 * (float)(MathHelper.ceiling_float_int((float)JRMCoreH.KaiKFBal(race, st, st2, skl, strn)) * 2 - st2 * 2));
                        JRMCoreH.setInt(strnAct, p, "jrmcStrainActv");
                    }
                }
            }
            if (quickTransformKiLoss != -1 && !JRMCoreH.isInCreativeMode((Entity)p)) {
                JRMCoreH.setInt(quickTransformKiLoss, p, "jrmcEnrgy");
            }
        }
    }

    public void handleDBCdescend(byte dbcdescend, EntityPlayer p) {
        boolean lowerState2;
        int baseState;
        NBTTagCompound nbt = this.nbt(p, "pres");
        byte race = nbt.getByte("jrmcRace");
        int state = nbt.getByte("jrmcState");
        int state2 = nbt.getByte("jrmcState2");
        String StE = nbt.getString("jrmcStatusEff");
        boolean statusMysticOn = JRMCoreH.StusEfcts(13, StE);
        boolean statusGoDOn = JRMCoreH.StusEfcts(20, StE);
        boolean isKaiokenSelected = JRMCoreH.PlyrSettingsB(nbt, 0);
        int n = baseState = JRMCoreH.isRaceArcosian(race) && state >= 4 ? 4 : 0;
        boolean bl = state > baseState ? (isKaiokenSelected ? state2 > 0 : false) : (isKaiokenSelected ? state2 > 0 : (lowerState2 = !statusGoDOn && !statusMysticOn && state2 > 0));
        if (lowerState2) {
            boolean isKaiokenOn = JRMCoreH.StusEfcts(5, StE);
            boolean kaiokenTurnedOff = true;
            if (DBCConfig.KaiokenSingleFormDescendOn && dbcdescend == -1 && isKaiokenOn) {
                if (state2 > 0) {
                    --state2;
                }
                if (state2 > 0) {
                    kaiokenTurnedOff = false;
                    p.addChatMessage((IChatComponent)new ChatComponentText(JRMCoreH.clgd + "Kaioken " + JRMCoreH.TransKaiNms[state2]));
                }
                nbt.setByte("jrmcState2", (byte)(state2 > 0 ? state2 : 0));
            } else {
                nbt.setByte("jrmcState2", (byte)0);
            }
            if (isKaiokenOn) {
                if (kaiokenTurnedOff) {
                    int strnTmp = nbt.getInteger("jrmcStrainTemp");
                    int strnAct = nbt.getInteger("jrmcStrainActv");
                    int strn = nbt.getInteger("jrmcStrain");
                    JRMCoreH.KaiKStrainAct(p, nbt, state2, strn, strnTmp, strnAct);
                }
            } else {
                StE = JRMCoreH.StusEfcts(19, nbt, false);
            }
        } else {
            if (statusMysticOn) {
                StE = JRMCoreH.StusEfcts(13, StE, nbt, false);
            }
            if (statusGoDOn) {
                StE = JRMCoreH.StusEfcts(20, StE, nbt, false);
            }
            int newState = baseState;
            if (dbcdescend == -1 && DBCConfig.SingleFormDescendOn && JRMCoreH.isRaceSaiyan(race)) {
                if (JRMCoreH.isInState(state, 15)) {
                    newState = 10;
                } else if (JRMCoreH.isInState(state, 10)) {
                    newState = 9;
                } else if (JRMCoreH.isInState(state, 2)) {
                    String s1 = nbt.getString("jrmcSSltX");
                    int racialSkillLevel = JRMCoreH.SklLvlX(1, s1);
                    newState = racialSkillLevel - 1 >= 4 ? 4 : 1;
                } else if (JRMCoreH.isInState(state, 3)) {
                    newState = 2;
                } else if (JRMCoreH.isInState(state, 5)) {
                    String s1 = nbt.getString("jrmcSSltX");
                    int racialSkillLevel = JRMCoreH.SklLvlX(1, s1);
                    newState = racialSkillLevel - 1 >= 4 ? 4 : 1;
                } else if (JRMCoreH.isInState(state, 6)) {
                    newState = 5;
                }
            }
            nbt.setByte("jrmcState", (byte)newState);
        }
        if (dbcdescend == 3) {
            if (statusMysticOn) {
                StE = JRMCoreH.StusEfcts(13, StE, nbt, false);
            }
            if (statusGoDOn) {
                StE = JRMCoreH.StusEfcts(20, StE, nbt, false);
            }
            nbt.setByte("jrmcState", (byte)(JRMCoreH.isRaceArcosian(race) && state >= 4 ? 4 : 0));
        }
        if (dbcdescend == 4) {
            if (statusMysticOn) {
                StE = JRMCoreH.StusEfcts(13, StE, nbt, false);
            }
            if (statusGoDOn) {
                StE = JRMCoreH.StusEfcts(20, StE, nbt, false);
            }
            nbt.setByte("jrmcState", (byte)0);
        }
    }

    public void handleDBCchargesound(int c, String s, EntityPlayer p) {
        this.soundPowerUp(p, s);
    }

    public void handleDBCjumpsound(int dbcjumpsound, int dbcp, EntityPlayer p) {
        if (dbcjumpsound == -2) {
            PD.sendTo(new DBCPduo(dbcjumpsound, JRMCoreH.getInt(p, "jrmcWishes")), (EntityPlayerMP)p);
        }
        if (dbcjumpsound == -1) {
            PD.sendTo(new DBCPduo(dbcjumpsound, JRMCoreH.getInt(p, "jrmcReviveTmer")), (EntityPlayerMP)p);
        }
        if (dbcjumpsound < 999 && dbcjumpsound >= 0) {
            int n = 16;
            AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 16.0), (double)(p.posY - 16.0), (double)(p.posZ - 16.0), (double)(p.posX + 16.0), (double)(p.posY + 16.0), (double)(p.posZ + 16.0));
            List l = p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
            for (int i = 0; i < l.size(); ++i) {
                EntityPlayer entity2 = (EntityPlayer)l.get(i);
                PD.sendTo(new DBCPduo(dbcjumpsound, dbcp), (EntityPlayerMP)entity2);
            }
        } else if (dbcjumpsound == 1000 && p.worldObj.getEntityByID(dbcp) != null) {
            p.worldObj.getEntityByID(dbcp).setDead();
        }
    }

    public void handleDBCascendsound(int c, EntityPlayer p) {
        int n = 16;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 16.0), (double)(p.posY - 16.0), (double)(p.posZ - 16.0), (double)(p.posX + 16.0), (double)(p.posY + 16.0), (double)(p.posZ + 16.0));
        List l = p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
        for (int i = 0; i < l.size(); ++i) {
            EntityPlayer entity2 = (EntityPlayer)l.get(i);
            PD.sendTo(new DBCPascendsound(c), (EntityPlayerMP)entity2);
        }
    }

    public void handleDBCdescendsound(int c, EntityPlayer p) {
        int n = 16;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 16.0), (double)(p.posY - 16.0), (double)(p.posZ - 16.0), (double)(p.posX + 16.0), (double)(p.posY + 16.0), (double)(p.posZ + 16.0));
        List l = p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
        for (int i = 0; i < l.size(); ++i) {
            EntityPlayer entity2 = (EntityPlayer)l.get(i);
            PD.sendTo(new DBCPdescendsound(c), (EntityPlayerMP)entity2);
        }
    }

    public void handleDBCscouter1(int c, EntityPlayer p) {
        int n = 16;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 16.0), (double)(p.posY - 16.0), (double)(p.posZ - 16.0), (double)(p.posX + 16.0), (double)(p.posY + 16.0), (double)(p.posZ + 16.0));
        List l = p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
        for (int i = 0; i < l.size(); ++i) {
            EntityPlayer entity2 = (EntityPlayer)l.get(i);
            PD.sendTo(new DBCPscouter1(c), (EntityPlayerMP)entity2);
        }
    }

    public void handleDBCscouter2(int c, EntityPlayer p) {
        int n = 16;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 16.0), (double)(p.posY - 16.0), (double)(p.posZ - 16.0), (double)(p.posX + 16.0), (double)(p.posY + 16.0), (double)(p.posZ + 16.0));
        List l = p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
        for (int i = 0; i < l.size(); ++i) {
            EntityPlayer entity2 = (EntityPlayer)l.get(i);
            PD.sendTo(new DBCPscouter2(c), (EntityPlayerMP)entity2);
        }
    }

    public void handleDBCscouter3(int c, EntityPlayer p) {
        int n = 16;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 16.0), (double)(p.posY - 16.0), (double)(p.posZ - 16.0), (double)(p.posX + 16.0), (double)(p.posY + 16.0), (double)(p.posZ + 16.0));
        List l = p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
        for (int i = 0; i < l.size(); ++i) {
            EntityPlayer entity2 = (EntityPlayer)l.get(i);
            PD.sendTo(new DBCPscouter3(c), (EntityPlayerMP)entity2);
        }
    }

    public void handleDBCscouter4(int c, EntityPlayer p) {
        int n = 16;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(p.posX - 16.0), (double)(p.posY - 16.0), (double)(p.posZ - 16.0), (double)(p.posX + 16.0), (double)(p.posY + 16.0), (double)(p.posZ + 16.0));
        List l = p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
        for (int i = 0; i < l.size(); ++i) {
            EntityPlayer entity2 = (EntityPlayer)l.get(i);
            PD.sendTo(new DBCPscouter4(c), (EntityPlayerMP)entity2);
        }
    }

    public void soundPowerUp(EntityPlayer var4, String var2) {
        var4.worldObj.playSoundAtEntity((Entity)var4, var2, 0.15f, 1.0f);
    }

    public NBTTagCompound nbt(EntityPlayer p, String s) {
        NBTTagCompound nbt;
        if (s.contains("pres")) {
            if (!p.getEntityData().hasKey("PlayerPersisted")) {
                nbt = new NBTTagCompound();
                p.getEntityData().setTag("PlayerPersisted", (NBTBase)nbt);
            } else {
                nbt = p.getEntityData().getCompoundTag("PlayerPersisted");
            }
        } else {
            nbt = p.getEntityData();
        }
        return nbt;
    }

    public void closeInventoryChange(EntityPlayer p) {
        p.inventory.inventoryChanged = false;
    }
}

