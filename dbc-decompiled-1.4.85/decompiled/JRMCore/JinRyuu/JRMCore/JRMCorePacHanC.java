/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.DBCConfig
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.JRMCore.FamilyCH;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreComTickH;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.JRMCoreHJFC;
import JinRyuu.JRMCore.JRMCoreHJYC;
import JinRyuu.JRMCore.JRMCoreM;
import JinRyuu.JRMCore.JRMCoreMsn;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.client.notification.JGNotification;
import JinRyuu.JRMCore.client.notification.JGNotificationGUI;
import JinRyuu.JRMCore.client.notification.JGNotificationHandlerC;
import JinRyuu.JRMCore.entity.EntityCusPar;
import JinRyuu.JRMCore.entity.EntityJRMCexpl;
import JinRyuu.JRMCore.entity.ExplosionJRMC;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.mod_JRMCore;
import JinRyuu.JRMCore.server.config.core.JGConfigMiniGameAirBoxing;
import JinRyuu.JRMCore.server.config.core.JGConfigMiniGameConcentration;
import JinRyuu.JRMCore.server.config.core.JGConfigSkills;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCAAiDifficulty;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCFormMastery;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCGoD;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCInstantTransmission;
import JinRyuu.JRMCore.server.config.dbc.JGConfigRaces;
import JinRyuu.JRMCore.server.config.dbc.JGConfigUltraInstinct;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class JRMCorePacHanC {
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
    public byte type;

    public void handleExpl(double explosionX, double explosionY, double explosionZ, float explosionSize, boolean expGriOff, double expDam, Entity origin, List chunkPositionRecords, float playerVelocityX, float playerVelocityY, float playerVelocityZ, EntityPlayer p, byte type) {
        this.explosionX = explosionX;
        this.explosionY = explosionY;
        this.explosionZ = explosionZ;
        this.explosionSize = explosionSize;
        this.expGriOff = expGriOff;
        this.expDam = expDam;
        this.chunkPositionRecords = chunkPositionRecords;
        int var3 = (int)this.explosionX;
        int var4 = (int)this.explosionY;
        int var5 = (int)this.explosionZ;
        this.playerVelocityX = playerVelocityX;
        this.playerVelocityY = playerVelocityY;
        this.playerVelocityZ = playerVelocityZ;
        this.type = type;
        this.origin = origin;
        if (p != null && this.origin != null && p.dimension == this.origin.dimension) {
            this.handleExplosion();
        }
    }

    public void handleExplosion() {
        ExplosionJRMC var2 = new ExplosionJRMC((World)JRMCoreClient.mc.theWorld, null, this.explosionX, this.explosionY, this.explosionZ, this.explosionSize, this.expGriOff, this.expDam, this.origin, this.type);
        var2.affectedBlockPositions = this.chunkPositionRecords;
        var2.doExplosionB(false);
        JRMCoreClient.mc.thePlayer.motionX += (double)this.playerVelocityX;
        JRMCoreClient.mc.thePlayer.motionY += (double)this.playerVelocityY;
        JRMCoreClient.mc.thePlayer.motionZ += (double)this.playerVelocityZ;
        EntityJRMCexpl aura = new EntityJRMCexpl((World)JRMCoreClient.mc.theWorld, this.type);
        if (aura != null) {
            aura.setLocationAndAngles(this.explosionX, this.explosionY, this.explosionZ, 0.0f, 0.0f);
            aura.explsiz = this.explosionSize;
            JRMCoreClient.mc.theWorld.spawnEntityInWorld((Entity)aura);
        }
    }

    public void handleQuadI(byte b1, int b2, int b3, int b4) {
    }

    public void handleQuad(int b1, int b2, int b3, int b4, EntityPlayer p) {
        if (b1 == 10) {
            if (b2 == 1 && b3 == 0) {
                JRMCoreH.trngTPlmt = b4;
            } else if (b2 == 2 && b3 == 1) {
                JRMCoreH.trngTPlmt2 = b4;
            }
        }
    }

    public void handleData(int dataID, String d, EntityPlayer p) {
        int i;
        if (dataID == 80) {
            String o = d.isEmpty() || d.equalsIgnoreCase("error") ? "0" : d;
            JRMCoreH.ServerPoints = i = Integer.parseInt(o);
        }
        if (dataID == 1) {
            JRMCoreH.plyrsArnd = d == "::" ? null : d.toString().replaceAll("::", "").split(":");
        }
        if (dataID >= -1 && dataID <= 40) {
            if (dataID != 32) {
                JRMCoreH.rdc(d.toString().replaceAll("::", "").split(":"), dataID);
            } else if (d.startsWith("::")) {
                JRMCoreH.dat32 = null;
                String[] data = d.toString().substring(2).split("::");
                String[] segmentsS = data[0].split("/");
                int segmentID = Integer.parseInt(segmentsS[0]);
                int segments = Integer.parseInt(segmentsS[1]);
                int players = Integer.parseInt(segmentsS[2]);
                int startID = Integer.parseInt(segmentsS[3]);
                if (segmentID == 0) {
                    JRMCoreH.dat32Segmented = new String[players];
                }
                String[] dataFinal = data[1].replaceAll("::", "").split(":");
                for (int i2 = 0; i2 < dataFinal.length; ++i2) {
                    JRMCoreH.dat32Segmented[startID + i2] = dataFinal[i2];
                }
                if (segmentID == segments - 1) {
                    JRMCoreH.dat32 = JRMCoreH.dat32Segmented;
                }
            } else {
                JRMCoreH.rdc(d.toString().replaceAll("::", "").split(":"), dataID);
            }
        }
        if (dataID == -1) {
            JRMCoreH.plyrs = d.replaceAll("::", "").split(":");
        }
        if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && JRMCoreClient.mc.thePlayer != null) {
            if (dataID == 1) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String[] s = JRMCoreH.data1[pl].split(";");
                    JRMCoreH.Race = Byte.parseByte(s[0]);
                    JRMCoreH.dns = s[1];
                    JRMCoreH.Pwrtyp = Byte.parseByte(s[2]);
                    JRMCoreH.Class = Byte.parseByte(s[3]);
                    JRMCoreH.Accepted = Byte.parseByte(s[4]);
                    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)JRMCoreClient.mc.thePlayer);
                    JRMCoreH.dnsH = props.getHairCode();
                    break;
                }
            }
            if (dataID == 2) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String[] s = JRMCoreH.data2[pl].split(";");
                    JRMCoreH.State = Byte.parseByte(s[0]);
                    JRMCoreH.State2 = Byte.parseByte(s[1]);
                    break;
                }
            }
            if (dataID == 7) {
                String s = JRMCoreH.data7[0];
                if (JRMCoreH.Pwrtyp == 3 && JRMCoreH.Accepted == 1) {
                    JRMCoreH.sao_col = Integer.parseInt(s);
                } else {
                    String[] s3;
                    String[] stringArray = s3 = s.contains(";;") ? s.toString().split(";;") : null;
                    if (s3 != null) {
                        block9: for (int i3 = 0; i3 < s3.length; ++i3) {
                            String[] s2 = s3[i3].contains(";") ? s3[i3].toString().split(";") : null;
                            switch (i3) {
                                case 0: {
                                    JRMCoreH.tech1 = s2;
                                    continue block9;
                                }
                                case 1: {
                                    JRMCoreH.tech2 = s2;
                                    continue block9;
                                }
                                case 2: {
                                    JRMCoreH.tech3 = s2;
                                    continue block9;
                                }
                                case 3: {
                                    JRMCoreH.tech4 = s2;
                                    continue block9;
                                }
                            }
                        }
                    } else {
                        JRMCoreH.tech4 = null;
                        JRMCoreH.tech3 = null;
                        JRMCoreH.tech2 = null;
                        JRMCoreH.tech1 = null;
                    }
                }
            }
            if (dataID == 15) {
                String s = JRMCoreH.dat15[0];
                if (JRMCoreH.Pwrtyp == 3 && JRMCoreH.Accepted == 1) {
                    JRMCoreH.sao_exp = Integer.parseInt(s);
                }
            }
            if (dataID == 6) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName()) || JRMCoreH.data6.length < JRMCoreH.plyrs.length) continue;
                    String[] s = JRMCoreH.data6[pl].split(";");
                    JRMCoreH.PlyrSkillX = s[1];
                    JRMCoreH.PlyrSkillY = s[2];
                    JRMCoreH.PlyrSkillZ = s[3];
                    String[] PlyrSkills = s[0].split(",");
                    JRMCoreH.PlyrSkills = PlyrSkills;
                    String[] si = s[4].split(",");
                    int[] i4 = new int[si.length];
                    for (int a = 0; a < si.length; ++a) {
                        i4[a] = si[a].length() > 0 && !si[a].equals(" ") ? Integer.parseInt(si[a]) : -1;
                    }
                    JRMCoreH.techPM = i4;
                    break;
                }
            }
            if (dataID == 8) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String s = JRMCoreH.data8[pl];
                    JRMCoreH.curBody = Integer.parseInt(s);
                    break;
                }
            }
            if (dataID == 9) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String s = JRMCoreH.data9[pl];
                    JRMCoreH.curEnergy = Integer.parseInt(s);
                    break;
                }
            }
            if (dataID == 10) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String[] s = JRMCoreH.dat10[pl].split(";");
                    JRMCoreH.curRelease = Byte.parseByte(s[0]);
                    JRMCoreH.curStamina = Integer.parseInt(s[1]);
                    break;
                }
            }
            if (dataID == 4) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String[] s = JRMCoreH.data4[pl].split(";");
                    JRMCoreH.TransSaiCurRg = Byte.parseByte(s[0]);
                    JRMCoreH.cura = Integer.parseInt(s[1]);
                    break;
                }
            }
            if (dataID == 5) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String[] s = JRMCoreH.data5[pl].split(";");
                    JRMCoreH.align = Byte.parseByte(s[0]);
                    break;
                }
            }
            if (dataID == 11) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String[] s = JRMCoreH.data1[pl].split(";");
                    byte pwr = Byte.parseByte(s[2]);
                    byte acc = Byte.parseByte(s[4]);
                    if (pwr == 3 && acc == 1) {
                        s = JRMCoreH.dat11[pl].split(";");
                        JRMCoreH.sao_level = Integer.parseInt(s[0]);
                        JRMCoreH.sao_ap = Integer.parseInt(s[1]);
                        break;
                    }
                    String st = JRMCoreH.dat11[pl];
                    JRMCoreH.curTP = Integer.parseInt(st);
                    break;
                }
            }
            if (dataID == 12) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String s1 = JRMCoreH.dat12[pl];
                    JRMCoreH.curExp = Integer.parseInt(s1);
                    break;
                }
            }
            if (dataID == 14) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String[] s = JRMCoreH.dat14[pl].split(",");
                    int[] PlyrAttrbts = new int[JRMCoreH.PlyrAttrbts.length];
                    for (int i5 = 0; i5 < PlyrAttrbts.length; ++i5) {
                        PlyrAttrbts[i5] = Integer.parseInt(s[i5]);
                    }
                    JRMCoreH.PlyrAttrbts = PlyrAttrbts;
                    byte pwr = JRMCoreH.Pwrtyp;
                    byte rce = JRMCoreH.Race;
                    byte cls = JRMCoreH.Class;
                    JRMCoreH.maxBody = JRMCoreH.stat((Entity)p, 2, pwr, 2, JRMCoreH.PlyrAttrbts[2], rce, cls, 0.0f);
                    JRMCoreH.maxEnergy = JRMCoreH.stat((Entity)p, 5, pwr, 5, JRMCoreH.PlyrAttrbts[5], rce, cls, JRMCoreH.SklLvl_KiBs(pwr));
                    JRMCoreH.maxStamina = JRMCoreH.stat((Entity)p, 2, pwr, 3, JRMCoreH.PlyrAttrbts[2], rce, cls, 0.0f);
                    break;
                }
            }
            if (dataID == 18) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String s = JRMCoreH.dat18[pl];
                    String[] a = s.split(";");
                    JRMCoreH.Dffclty = Byte.parseByte(a[0]);
                    JRMCoreH.PtchVc = Byte.parseByte(a[1]);
                    JRMCoreH.FznDC = a[2];
                    break;
                }
            }
            if (dataID == 19) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String[] s = JRMCoreH.dat19[pl].split(";");
                    JRMCoreH.TlMd = Byte.parseByte(s[0]);
                    break;
                }
            }
            if (dataID == 20) {
                String[] s = JRMCoreH.dat20[0].split(";");
                JRMCoreH.GTrnngCB = Integer.parseInt(s[0]);
                if (s.length > 1) {
                    JRMCoreH.PlyrSettings = s[1];
                }
                JRMCoreH.GravZone = Float.parseFloat(s[2]);
                JRMCoreH.WeightOn = Float.parseFloat(s[3]);
                if (s.length > 7) {
                    JRMCoreH.s4ft = Integer.parseInt(s[7]);
                }
                if (s.length > 8) {
                    JRMCoreH.pnp = Integer.parseInt(s[8]);
                }
                if (s.length > 9) {
                    JRMCoreH.ko = Integer.parseInt(s[9]);
                }
                JRMCoreH.kob = JRMCoreH.ko > 0;
                boolean bl = JRMCoreH.pnh = JRMCoreH.pnp > 0;
            }
            if (dataID == 21) {
                JRMCoreH.MSDV = JRMCoreH.dat21[0];
            }
            if (dataID == 22) {
                JRMCoreH.MSD = JRMCoreH.dat22[0];
            }
            if (dataID == 23) {
                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                    String s = JRMCoreH.dat23[pl];
                    JRMCoreH.GID = Integer.parseInt(s);
                    break;
                }
                int[] j = new int[JRMCoreH.dat23.length];
                for (i = 0; i < JRMCoreH.dat23.length; ++i) {
                    j[i] = Integer.parseInt(JRMCoreH.dat23[i]);
                }
                JRMCoreH.GIDs = j;
                JRMCoreH.GMN = 0;
                if (JRMCoreH.GID > 0) {
                    for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                        if (JRMCoreH.GIDs[pl] != JRMCoreH.GID) continue;
                        ++JRMCoreH.GMN;
                    }
                }
            }
            if (dataID == 24) {
                String[] s = JRMCoreH.dat24[0].split(";");
                JRMCoreH.GLID = s[0];
                JRMCoreH.GIDi = s[1];
            }
            if (dataID == 25) {
                String s;
                JRMCoreH.GIDi = s = JRMCoreH.dat25[0];
            }
            if (JRMCoreH.JFC()) {
                if (dataID == 26) {
                    String[] j = new String[JRMCoreH.dat26.length];
                    for (i = 0; i < JRMCoreH.dat26.length; ++i) {
                        j[i] = JRMCoreH.dat26[i];
                    }
                    FamilyCH.famNams = j;
                }
                if (dataID == 27) {
                    String s = JRMCoreH.dat27[0];
                    s = s.replaceAll("\\+", ":");
                    String[] s1 = new String[]{s};
                    String[] s2 = s.contains(";") ? s.split(";") : s1;
                    FamilyCH.famMem = s2;
                }
                if (dataID == 28) {
                    String[] s2;
                    String s = JRMCoreH.dat28[0];
                    String[] stringArray = s2 = s.contains(";") ? s.toString().split(";") : null;
                    if (s2 != null) {
                        String[] s3 = s2[0].length() < 2 ? null : s2[0].split(",");
                        FamilyCH.FamP = s3 != null ? s3[1] : "";
                        FamilyCH.FamID = s2[0].length() < 2 ? 0 : 1;
                        FamilyCH.prop = s2.length >= 2 ? s2[1] : "";
                        String string = FamilyCH.adop = s2.length >= 3 ? s2[2] : "";
                    }
                }
                if (dataID == 29) {
                    String s;
                    JRMCoreH.proc = s = JRMCoreH.dat29[0];
                }
                if (dataID == 30) {
                    String[] k = new String[JRMCoreH.dat30.length];
                    for (int i6 = 0; i6 < JRMCoreH.dat30.length; ++i6) {
                        k[i6] = JRMCoreH.dat30[i6];
                    }
                    JRMCoreH.preg = k;
                }
            }
            if (dataID == 31 && JRMCoreConfig.JRMCABonusOn) {
                JRMCoreH.bonusAttributes = d;
            }
        }
    }

    public void handleData2(String c, String d, EntityPlayer p) {
        String[] r = c.split(";");
        ArrayList a = Lists.newArrayList();
        for (int i = 0; i < r.length; ++i) {
            a.add(r[i]);
        }
        JRMCoreM.missionsC.put(r[0], (JRMCoreMsn)new Gson().fromJson(d, JRMCoreM.JSN_TYPE_MSN));
        JRMCoreM.missionsCD.put(r[0], a);
    }

    public void handleTri(ByteBuf buffer) {
        boolean aai29;
        boolean ShadowDummyScaleToTarget;
        boolean JRMCABonusOn;
        int i;
        boolean dPnlty = false;
        int maxTrnExp = 0;
        boolean plntVegeta = false;
        boolean flyAnyLvl = false;
        boolean expGriOff = false;
        boolean DeathSystemOff = false;
        boolean DBSpawnEnabled = false;
        String DBSpawnTime = "";
        boolean SagaSystemOn = false;
        boolean SagaSysSpawnPods = false;
        boolean NPCSpawnCheck = false;
        boolean BuildingSpawnCheck = false;
        int buildingSpawnAreaSize = 0;
        int pgut = 0;
        int pt = 0;
        int SklMedCat = 0;
        float SklMedRate = 0.0f;
        int senzuCool = 0;
        float Reinc = 0.0f;
        boolean GodForm = false;
        boolean FreeRev = false;
        int TechExpNeed = 0;
        int TechCostMod = 0;
        String ncCSklsLvlO = "";
        String ncSklsLvlO = "";
        String TransGtsDmgO = "";
        boolean TPGainOn = true;
        float TPlimitIncreasesWithPlayerLevel = 0.5f;
        float TPMultiplier = 0.01f;
        int TPDailyLimit = 100;
        float ComboTimer = 3.0f;
        boolean ConstantClickOn = true;
        int RandomMovementSpeed = 1;
        boolean TPGainOn2 = true;
        float TPlimitIncreasesWithPlayerLevel2 = 0.5f;
        float TPMultiplier2 = 0.01f;
        int TPDailyLimit2 = 100;
        int StartLife = 40;
        float[] KeySpawnSpeed = new float[4];
        float[] KeySpeed = new float[4];
        int[] KeyLifeTaken = new int[4];
        int count = 0;
        int[][] KeyTypeIDs = new int[4][];
        int StatPasDef = 20;
        int mjn = 10;
        int lgnd = 10;
        String lgndb = "";
        double atcm = 1.6;
        int AttributeUpgradeCost_StartMinus = 140;
        int AttributeUpgradeCost_Min = 16;
        float[] AttributeUpgradeCost_AttributeMulti = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
        String s1 = "";
        String s2 = "";
        String s3 = "";
        boolean dat5711 = false;
        String mods = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        HashMap dataH = new HashMap();
        JRMCoreH.modsC = (HashMap)new Gson().fromJson(mods, dataH.getClass());
        JRMCoreComTickH.tna3fu = buffer.readBoolean();
        if (JRMCoreH.DBC()) {
            maxTrnExp = buffer.readInt();
            plntVegeta = buffer.readBoolean();
            flyAnyLvl = buffer.readBoolean();
            DeathSystemOff = buffer.readBoolean();
            DBSpawnEnabled = buffer.readBoolean();
            DBSpawnTime = ByteBufUtils.readUTF8String((ByteBuf)buffer);
            SagaSystemOn = buffer.readBoolean();
            SagaSysSpawnPods = buffer.readBoolean();
            senzuCool = buffer.readInt();
            Reinc = buffer.readFloat();
            GodForm = buffer.readBoolean();
            FreeRev = buffer.readBoolean();
            TechExpNeed = buffer.readInt();
            TechCostMod = buffer.readInt();
        }
        if (JRMCoreH.JYC()) {
            pgut = buffer.readInt();
        }
        if (JRMCoreH.JFC()) {
            pt = buffer.readInt();
        }
        if (JRMCoreH.NC()) {
            ncCSklsLvlO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
            ncSklsLvlO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
            TransGtsDmgO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        }
        String vlblRSklsLvlO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String vlblSklsLvlO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransKaiDmgO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransKaiDrainOLevel = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransKaiDrainORace = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransMngDmgO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransKaiNmsO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransSaiStBnPO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransHalfSaiStBnPO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransFrStBnPO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransHmStBnPO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransNaStBnPO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String TransMaStBnPO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String vlblRSklsMRO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String vlblSklsMRO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String ncCSklsMRO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String ncSklsMRO = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        boolean OverAtrLimitO = buffer.readBoolean();
        String MysticDamMulti = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String ArcoPP = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String ArcoPP2 = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String ArcoPP3 = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String ArcoPP4 = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String ArcoPP5 = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String AttrBonusPerRacialSkill = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        int ArcoPP6 = buffer.readInt();
        String tpGainRate = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String tpGain = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        expGriOff = buffer.readBoolean();
        SklMedCat = buffer.readInt();
        SklMedRate = buffer.readFloat();
        boolean SklMedStop = buffer.readBoolean();
        boolean regen = buffer.readBoolean();
        boolean release = buffer.readBoolean();
        int tpgn = buffer.readInt();
        int attrMx = buffer.readInt();
        String regenRate = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String hRegenRate = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        boolean sizes = buffer.readBoolean();
        String ssurl = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String ssurl2 = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        String ssc = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        boolean sfzns = buffer.readBoolean();
        NPCSpawnCheck = buffer.readBoolean();
        BuildingSpawnCheck = buffer.readBoolean();
        buildingSpawnAreaSize = buffer.readInt();
        TPGainOn = buffer.readBoolean();
        TPlimitIncreasesWithPlayerLevel = buffer.readFloat();
        TPMultiplier = buffer.readFloat();
        TPDailyLimit = buffer.readInt();
        ComboTimer = buffer.readFloat();
        ConstantClickOn = buffer.readBoolean();
        RandomMovementSpeed = buffer.readInt();
        TPGainOn2 = buffer.readBoolean();
        TPlimitIncreasesWithPlayerLevel2 = buffer.readFloat();
        TPMultiplier2 = buffer.readFloat();
        TPDailyLimit2 = buffer.readInt();
        StartLife = buffer.readInt();
        for (i = 0; i < 4; ++i) {
            KeySpawnSpeed[i] = buffer.readFloat();
            KeySpeed[i] = buffer.readFloat();
            KeyLifeTaken[i] = buffer.readInt();
            count = buffer.readInt();
            KeyTypeIDs[i] = new int[count];
            for (int j = 0; j < count; ++j) {
                KeyTypeIDs[i][j] = buffer.readInt();
            }
        }
        StatPasDef = buffer.readInt();
        mjn = buffer.readInt();
        atcm = buffer.readDouble();
        AttributeUpgradeCost_StartMinus = buffer.readInt();
        AttributeUpgradeCost_Min = buffer.readInt();
        for (i = 0; i < JRMCoreConfig.AttributeUpgradeCost_AttributeMulti.length; ++i) {
            AttributeUpgradeCost_AttributeMulti[i] = (float)buffer.readDouble();
        }
        lgnd = buffer.readInt();
        lgndb = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        boolean lockon = buffer.readBoolean();
        double Flngspd = buffer.readDouble();
        if (JRMCoreH.DBC()) {
            s1 = ByteBufUtils.readUTF8String((ByteBuf)buffer);
            s2 = ByteBufUtils.readUTF8String((ByteBuf)buffer);
            s3 = ByteBufUtils.readUTF8String((ByteBuf)buffer);
        }
        if (JRMCoreH.DBC() || JRMCoreH.NC()) {
            dat5711 = buffer.readBoolean();
        }
        if (JRMCoreH.DBC()) {
            JRMCoreHDBC.DBCsetConfigmaxTrnExp(maxTrnExp);
            JRMCoreHDBC.DBCsetConfigplntVegeta(plntVegeta);
            JRMCoreHDBC.DBCsetConfigflyAnyLvl(flyAnyLvl);
            JRMCoreHDBC.DBCsetConfigDeathSystemOff(DeathSystemOff);
            JRMCoreHDBC.DBCsetConfigDBSpawnEnabled(DBSpawnEnabled);
            JRMCoreHDBC.DBCsetConfigDBSpawnTime(DBSpawnTime);
            JRMCoreHDBC.DBCsetConfigDBSagaSystemOn(SagaSystemOn);
            JRMCoreHDBC.DBCsetConfigDBSagaSysSpawnPods(SagaSysSpawnPods);
            JRMCoreHDBC.DBCsetConfigsenzuCool(senzuCool);
            JRMCoreHDBC.DBCsetConfigReinc(Reinc);
            JRMCoreHDBC.DBCsetConfigGodform(GodForm);
            JRMCoreHDBC.FreeRevSet(FreeRev);
            JRMCoreHDBC.DBCsetConfigTechExpNeed(TechExpNeed);
            JRMCoreHDBC.DBCsetConfigTechCostMod(TechCostMod);
        }
        if (JRMCoreH.JYC()) {
            JRMCoreHJYC.JYCsetConfigpgut(pgut);
        }
        if (JRMCoreH.JFC()) {
            JRMCoreHJFC.setConfigpt(pt);
        }
        int[][] data = new int[20][];
        float[] dataF = new float[80];
        float[][] dataFMatrix = new float[6][17];
        int[] dataI = new int[40];
        String[] dataS = new String[20];
        float[][] dataFF = new float[20][];
        double[][] dataDD = new double[20][];
        if (JRMCoreH.NC()) {
            JRMCoreH.NCRacialSkillTPCost = (int[][])new Gson().fromJson(ncCSklsLvlO, data.getClass());
            JRMCoreH.NCSkillTPCost = (int[][])new Gson().fromJson(ncSklsLvlO, data.getClass());
            JRMCoreH.TransGtsDmg = (float[])new Gson().fromJson(TransGtsDmgO, dataF.getClass());
        }
        JRMCoreH.DBCRacialSkillTPCost = (int[][])new Gson().fromJson(vlblRSklsLvlO, data.getClass());
        JRMCoreH.DBCSkillTPCost = (int[][])new Gson().fromJson(vlblSklsLvlO, data.getClass());
        JRMCoreH.TransMngDmg = (float[])new Gson().fromJson(TransMngDmgO, dataF.getClass());
        JRMCoreH.TransKaiDmg = (float[])new Gson().fromJson(TransKaiDmgO, dataF.getClass());
        JRMCoreH.TransKaiDrainLevel = (float[])new Gson().fromJson(TransKaiDrainOLevel, dataF.getClass());
        JRMCoreH.TransKaiDrainRace = (float[])new Gson().fromJson(TransKaiDrainORace, dataF.getClass());
        JRMCoreH.TransKaiNms = (String[])new Gson().fromJson(TransKaiNmsO, dataS.getClass());
        JRMCoreH.TransSaiStBnP = (float[][])new Gson().fromJson(TransSaiStBnPO, dataFF.getClass());
        JRMCoreH.TransHalfSaiStBnP = (float[][])new Gson().fromJson(TransHalfSaiStBnPO, dataFF.getClass());
        JRMCoreH.TransFrStBnP = (float[][])new Gson().fromJson(TransFrStBnPO, dataFF.getClass());
        JRMCoreH.TransHmStBnP = (float[][])new Gson().fromJson(TransHmStBnPO, dataFF.getClass());
        JRMCoreH.TransNaStBnP = (float[][])new Gson().fromJson(TransNaStBnPO, dataFF.getClass());
        JRMCoreH.TransMaStBnP = (float[][])new Gson().fromJson(TransMaStBnPO, dataFF.getClass());
        JRMCoreH.DBCRacialSkillMindCost = (int[][])new Gson().fromJson(vlblRSklsMRO, data.getClass());
        JRMCoreH.DBCSkillMindCost = (int[][])new Gson().fromJson(vlblSklsMRO, data.getClass());
        JRMCoreH.NCRacialSkillMindCost = (int[][])new Gson().fromJson(ncCSklsMRO, data.getClass());
        JRMCoreH.NCSkillMindCost = (int[][])new Gson().fromJson(ncSklsMRO, data.getClass());
        JRMCoreConfig.OverAtrLimit = OverAtrLimitO;
        JRMCoreConfig.MysticDamMulti = (float[])new Gson().fromJson(MysticDamMulti, dataF.getClass());
        JRMCoreConfig.ArcosianPPMax = (int[])new Gson().fromJson(ArcoPP, dataI.getClass());
        JRMCoreConfig.ArcosianPPGrowth = (int[])new Gson().fromJson(ArcoPP2, dataI.getClass());
        JRMCoreConfig.ArcosianPPCost = (int[])new Gson().fromJson(ArcoPP3, dataI.getClass());
        JRMCoreConfig.ArcosianPPDamMulti = (float[])new Gson().fromJson(ArcoPP4, dataF.getClass());
        JRMCoreConfig.ArcosianPPDamMultiPoint = (float[])new Gson().fromJson(ArcoPP5, dataF.getClass());
        JRMCoreConfig.AttibuteBonusPerRacialSkill = (float[][])new Gson().fromJson(AttrBonusPerRacialSkill, dataFMatrix.getClass());
        JRMCoreConfig.ArcosianPPDamMultiHighest = ArcoPP6;
        JRMCoreConfig.TPGainRateRace = (float[])new Gson().fromJson(tpGainRate, dataF.getClass());
        JRMCoreConfig.TPGainRace = (float[])new Gson().fromJson(tpGain, dataF.getClass());
        JRMCoreConfig.expGriOff = expGriOff;
        JRMCoreConfig.SklMedCat = SklMedCat;
        JRMCoreConfig.SklMedRate = SklMedRate;
        JRMCoreConfig.releaseStop = SklMedStop;
        JRMCoreConfig.regen = regen;
        JRMCoreConfig.release = release;
        JRMCoreConfig.tpgn = tpgn;
        JRMCoreConfig.tmx = JRMCorePacHanC.nQp65G(attrMx);
        JRMCoreConfig.regenRate = regenRate;
        JRMCoreConfig.hRegenRate = hRegenRate;
        JRMCoreConfig.sizes = sizes;
        JRMCoreConfig.ssurl = ssurl;
        JRMCoreConfig.ssurl2 = ssurl2;
        JRMCoreConfig.ssc = ssc;
        JRMCoreConfig.sfzns = sfzns;
        JRMCoreConfig.NPCSpawnCheck = NPCSpawnCheck;
        JRMCoreConfig.BuildingSpawnCheck = BuildingSpawnCheck;
        JRMCoreConfig.buildingSpawnAreaSize = buildingSpawnAreaSize;
        JGConfigMiniGameConcentration.TPGainOn = TPGainOn;
        JGConfigMiniGameConcentration.TPlimitIncreasesWithPlayerLevel = TPlimitIncreasesWithPlayerLevel;
        JGConfigMiniGameConcentration.TPMultiplier = TPMultiplier;
        JGConfigMiniGameConcentration.TPDailyLimit = TPDailyLimit;
        JGConfigMiniGameConcentration.ComboTimer = ComboTimer;
        JGConfigMiniGameConcentration.ConstantClickOn = ConstantClickOn;
        JGConfigMiniGameConcentration.RandomMovementSpeed = RandomMovementSpeed;
        JGConfigMiniGameAirBoxing.TPGainOn = TPGainOn2;
        JGConfigMiniGameAirBoxing.TPlimitIncreasesWithPlayerLevel = TPlimitIncreasesWithPlayerLevel2;
        JGConfigMiniGameAirBoxing.TPMultiplier = TPMultiplier2;
        JGConfigMiniGameAirBoxing.TPDailyLimit = TPDailyLimit2;
        JGConfigMiniGameAirBoxing.StartLife = StartLife;
        JGConfigMiniGameAirBoxing.KeySpawnSpeed = KeySpawnSpeed;
        JGConfigMiniGameAirBoxing.KeySpeed = KeySpeed;
        JGConfigMiniGameAirBoxing.KeyLifeTaken = KeyLifeTaken;
        JGConfigMiniGameAirBoxing.KeyTypeIDs = KeyTypeIDs;
        JRMCoreConfig.StatPasDef = StatPasDef;
        JRMCoreConfig.mjn = mjn;
        JRMCoreConfig.atcm = atcm;
        JRMCoreConfig.AttributeUpgradeCost_StartMinus = AttributeUpgradeCost_StartMinus;
        JRMCoreConfig.AttributeUpgradeCost_Min = AttributeUpgradeCost_Min;
        JRMCoreConfig.AttributeUpgradeCost_AttributeMulti = AttributeUpgradeCost_AttributeMulti;
        JRMCoreConfig.lgnd = lgnd;
        JRMCoreConfig.lgndb = lgndb;
        JRMCoreConfig.lockon = lockon;
        JRMCoreConfig.Flngspd = Flngspd;
        if (JRMCoreH.DBC()) {
            int i2;
            String[] str = s1.split(" ");
            for (int i3 = 0; i3 < JRMCoreConfig.dat5695.length; ++i3) {
                JRMCoreConfig.dat5695[i3] = Boolean.parseBoolean(str[i3]);
            }
            String[] str2 = s2.split(";");
            for (i2 = 0; i2 < JRMCoreConfig.dat5696.length; ++i2) {
                str = str2[i2].split(" ");
                for (int j = 0; j < JRMCoreConfig.dat5696[j].length; ++j) {
                    JRMCoreConfig.dat5696[i2][j] = Double.parseDouble(str[j]);
                }
            }
            str = s3.split(" ");
            for (i2 = 0; i2 < JRMCoreConfig.dat5709.length; ++i2) {
                JRMCoreConfig.dat5709[i2] = Boolean.parseBoolean(str[i2]);
            }
        }
        if (JRMCoreH.DBC() || JRMCoreH.NC()) {
            JRMCoreConfig.dat5711 = dat5711;
        }
        if (JRMCoreH.DBC()) {
            byte levels;
            JGConfigUltraInstinct.CONFIG_UI_LEVELS = levels = buffer.readByte();
            JGConfigUltraInstinct.CONFIG_UI_HEAT_DURATION = new int[JGConfigUltraInstinct.CONFIG_UI_LEVELS];
            JGConfigUltraInstinct.CONFIG_UI_HAIR_WHITE = new boolean[JGConfigUltraInstinct.CONFIG_UI_LEVELS];
            JGConfigUltraInstinct.CONFIG_UI_ATTRIBUTE_MULTI = new int[JGConfigUltraInstinct.CONFIG_UI_LEVELS];
            JGConfigUltraInstinct.CONFIG_UI_ATTRIBUTE_MULTI_RACE = new float[JGConfigUltraInstinct.CONFIG_UI_LEVELS][JRMCoreH.Races.length];
            JGConfigUltraInstinct.CONFIG_UI_DODGE_RATE = new byte[JGConfigUltraInstinct.CONFIG_UI_LEVELS][2];
            JGConfigUltraInstinct.CONFIG_UI_ATTACK_RATE = new byte[JGConfigUltraInstinct.CONFIG_UI_LEVELS][2];
            for (int i4 = 0; i4 < JGConfigUltraInstinct.CONFIG_UI_LEVELS; ++i4) {
                int j;
                int attribute_multi;
                boolean hair_white;
                int heat;
                JGConfigUltraInstinct.CONFIG_UI_HEAT_DURATION[i4] = heat = buffer.readInt();
                JGConfigUltraInstinct.CONFIG_UI_HAIR_WHITE[i4] = hair_white = buffer.readBoolean();
                JGConfigUltraInstinct.CONFIG_UI_ATTRIBUTE_MULTI[i4] = attribute_multi = buffer.readInt();
                for (j = 0; j < JRMCoreH.Races.length; ++j) {
                    float attribute_multi2;
                    JGConfigUltraInstinct.CONFIG_UI_ATTRIBUTE_MULTI_RACE[i4][j] = attribute_multi2 = buffer.readFloat();
                }
                for (j = 0; j < 2; ++j) {
                    byte attack_rate;
                    byte dodge_rate;
                    JGConfigUltraInstinct.CONFIG_UI_DODGE_RATE[i4][j] = dodge_rate = buffer.readByte();
                    JGConfigUltraInstinct.CONFIG_UI_ATTACK_RATE[i4][j] = attack_rate = buffer.readByte();
                }
            }
        }
        byte extendedPlayerBlock = buffer.readByte();
        byte extendedPlayerOther = buffer.readByte();
        byte extendedPlayerHair = buffer.readByte();
        JRMCoreConfig.ExtendedPlayerBlockID = extendedPlayerBlock;
        JRMCoreConfig.ExtendedPlayerOtherID = extendedPlayerOther;
        JRMCoreConfig.ExtendedPlayerHairID = extendedPlayerHair;
        if (JRMCoreH.DBC()) {
            boolean scaleW;
            float GuruScale;
            float EnmaScale;
            boolean canWhisTP;
            DBCConfig.CanWhisTeleport = canWhisTP = buffer.readBoolean();
            DBCConfig.EnmaScale = EnmaScale = buffer.readFloat();
            DBCConfig.GuruScale = GuruScale = buffer.readFloat();
            for (int i5 = 0; i5 < JRMCoreConfig.ContinuesKiAttacks.length; ++i5) {
                boolean continues;
                JRMCoreConfig.ContinuesKiAttacks[i5] = continues = buffer.readBoolean();
            }
            JRMCoreConfig.KiAttackScalesWithUser = scaleW = buffer.readBoolean();
        }
        if (JRMCoreH.NC()) {
            boolean scaleW;
            for (int i6 = 0; i6 < JRMCoreConfig.ContinuesJutsuAttacks.length; ++i6) {
                boolean continues;
                JRMCoreConfig.ContinuesJutsuAttacks[i6] = continues = buffer.readBoolean();
            }
            JRMCoreConfig.JutsuScalesWithUser = scaleW = buffer.readBoolean();
        }
        if (JRMCoreH.DBC() || JRMCoreH.NC()) {
            int energyTimer;
            boolean targetSlow;
            boolean letgo;
            JRMCoreConfig.WavesShrinkOnceLetGo = letgo = buffer.readBoolean();
            JRMCoreConfig.ContinuesEnergyAttackTargetSlowdown = targetSlow = buffer.readBoolean();
            JRMCoreConfig.ContinuesEnergyAttackTimer = energyTimer = buffer.readInt();
        }
        int ceaesl = buffer.readInt();
        float cealbm = buffer.readFloat();
        JRMCoreConfig.eaesl = ceaesl;
        JRMCoreConfig.ealbm = cealbm;
        if (JRMCoreH.DBC()) {
            boolean PlayerFlyingDragDownOn;
            boolean NullRealmBGColorNodeGreen;
            int nullRealmMin;
            DBCConfig.NullRealmMinimumHeight = nullRealmMin = buffer.readInt();
            for (int i7 = 0; i7 < 9; ++i7) {
                double ContinuesCost;
                JRMCoreConfig.dat5696[i7][2] = ContinuesCost = buffer.readDouble();
            }
            DBCConfig.NullRealmBGColorNodeGreen = NullRealmBGColorNodeGreen = buffer.readBoolean();
            JRMCoreConfig.PlayerFlyingDragDownOn = PlayerFlyingDragDownOn = buffer.readBoolean();
        }
        if (JRMCoreH.DBC()) {
            boolean configValue6;
            boolean configValue5;
            boolean configValue2;
            boolean configValue;
            for (int k = 0; k < JRMCoreH.Races.length; ++k) {
                for (int i8 = 0; i8 < JRMCoreH.ClassesDBC.length; ++i8) {
                    int j;
                    for (j = 0; j < JRMCoreH.attrInit[1].length; ++j) {
                        int configValue22;
                        double configValue3;
                        JGConfigRaces.CONFIG_RACES_ATTRIBUTE_MULTI[k][i8][j] = configValue3 = buffer.readDouble();
                        JGConfigRaces.CONFIG_RACES_ATTRIBUTE_START[k][i8][j] = configValue22 = buffer.readInt();
                    }
                    for (j = 0; j < JRMCoreH.statNames[1].length; ++j) {
                        int configValue23;
                        float configValue4;
                        JGConfigRaces.CONFIG_RACES_STATS_MULTI[k][i8][j] = configValue4 = buffer.readFloat();
                        JGConfigRaces.CONFIG_RACES_STAT_BONUS[k][i8][j] = configValue23 = buffer.readInt();
                    }
                }
            }
            JGConfigRaces.CONFIG_MAJIN_ENABLED = configValue = buffer.readBoolean();
            JGConfigRaces.CONFIG_MAJIN_ABSORPTION_ENABLED = configValue2 = buffer.readBoolean();
            JGConfigRaces.CONFIG_MAJIN_PURE_PINK_SKIN = configValue5 = buffer.readBoolean();
            JGConfigRaces.CONFIG_MAJIN_ABSORPTON_MULTIPLIES_BONUS_ATTRIBUTE_MULTIPLIERS = configValue6 = buffer.readBoolean();
            for (int i9 = 0; i9 < JRMCoreH.TransNms[5].length + 3; ++i9) {
                float configValue4;
                float configValue3;
                JGConfigRaces.CONFIG_MAJIN_ABSORPTON_ATTRIBUTE_MULTI[i9] = configValue3 = buffer.readFloat();
                JGConfigRaces.CONFIG_MAJIN_ABSORPTON_SPEED_MULTI[i9] = configValue4 = buffer.readFloat();
            }
        }
        JRMCoreConfig.JRMCABonusOn = JRMCABonusOn = buffer.readBoolean();
        JRMCoreConfig.ShadowDummyScaleToTarget = ShadowDummyScaleToTarget = buffer.readBoolean();
        if (JRMCoreH.DBC()) {
            boolean b;
            float f;
            int j;
            boolean CONFIG_GOD_IGNORE_BASE_CONFIG;
            boolean CONFIG_UI_IGNORE_BASE_CONFIG;
            JGConfigUltraInstinct.CONFIG_UI_IGNORE_BASE_CONFIG = CONFIG_UI_IGNORE_BASE_CONFIG = buffer.readBoolean();
            JGConfigDBCGoD.CONFIG_GOD_IGNORE_BASE_CONFIG = CONFIG_GOD_IGNORE_BASE_CONFIG = buffer.readBoolean();
            int i10 = buffer.readInt();
            JGConfigDBCGoD.CONFIG_GOD_IGNORED_DAMAGE_SOURCES = new String[i10];
            for (j = 0; j < i10; ++j) {
                String s;
                JGConfigDBCGoD.CONFIG_GOD_IGNORED_DAMAGE_SOURCES[j] = s = ByteBufUtils.readUTF8String((ByteBuf)buffer);
            }
            i10 = buffer.readInt();
            JGConfigDBCGoD.CONFIG_GOD_IGNORED_ENTITIES = new String[i10];
            for (j = 0; j < i10; ++j) {
                String s;
                JGConfigDBCGoD.CONFIG_GOD_IGNORED_ENTITIES[j] = s = ByteBufUtils.readUTF8String((ByteBuf)buffer);
            }
            JGConfigDBCGoD.CONFIG_GOD_IGNORE_DAMAGE_MULTI = f = buffer.readFloat();
            JGConfigDBCGoD.CONFIG_GOD_IGNORE_PROJECTILES_ENABLED = b = buffer.readBoolean();
            JGConfigDBCGoD.CONFIG_GOD_ENABLED = b = buffer.readBoolean();
            JGConfigDBCGoD.CONFIG_GOD_AURA_ENABLED = b = buffer.readBoolean();
            JGConfigDBCGoD.CONFIG_GOD_AURA_ENABLED_WITH_AURA = b = buffer.readBoolean();
            JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED = b = buffer.readBoolean();
            JGConfigDBCGoD.CONFIG_GOD_ENERGY_DAMAGE_MULTI = f = buffer.readFloat();
            JGConfigDBCGoD.CONFIG_GOD_ATTRIBUTE_MULTI = f = buffer.readFloat();
            for (int j2 = 0; j2 < JRMCoreH.Races.length; ++j2) {
                JGConfigDBCGoD.CONFIG_GOD_ATTRIBUTE_MULTI_RACE[j2] = f = buffer.readFloat();
            }
        }
        JRMCoreConfig.BuildingBlocksRenderAsNormalBlock = buffer.readBoolean();
        JGConfigSkills.GlobalSkillTPMultiplier = buffer.readFloat();
        JGConfigSkills.GlobalSkillMindMultiplier = buffer.readFloat();
        JGConfigSkills.GlobalSkillTPMultiplierFirst = buffer.readFloat();
        JGConfigSkills.GlobalSkillMindMultiplierFirst = buffer.readFloat();
        JGConfigSkills.GlobalSkillTPMultiplierWithLevel = buffer.readBoolean();
        JGConfigSkills.GlobalSkillMindMultiplierWithLevel = buffer.readBoolean();
        if (JRMCoreH.NC()) {
            JRMCoreConfig.NCExplosionTagTickTimer = buffer.readInt();
        }
        if (JRMCoreH.DBC()) {
            int i11;
            boolean aai27;
            boolean aai12;
            boolean aai11;
            boolean aai10;
            boolean aai8;
            boolean aai7;
            boolean aai6;
            double aai5;
            int aai4;
            int aai3;
            boolean aai2;
            int aai1;
            DBCConfig.AaiForceDifficulty = aai1 = buffer.readInt();
            DBCConfig.AaiDisabled = aai2 = buffer.readBoolean();
            DBCConfig.EnemyDefaultAttackTimer = aai3 = buffer.readInt();
            DBCConfig.EnemyDefaultShortRangeAttackTimer = aai4 = buffer.readInt();
            DBCConfig.EnemyDefaultMoveSpeed = aai5 = buffer.readDouble();
            DBCConfig.KiAttackGoThroughInvulnerableEnemies = aai6 = buffer.readBoolean();
            DBCConfig.InstantTransformOn = aai7 = buffer.readBoolean();
            DBCConfig.SingleFormDescendOn = aai8 = buffer.readBoolean();
            for (int i12 = 0; i12 < DBCConfig.IsInstantTransformEnabled.length; ++i12) {
                boolean aai9;
                DBCConfig.IsInstantTransformEnabled[i12] = aai9 = buffer.readBoolean();
            }
            DBCConfig.KaiokenSingleFormDescendOn = aai10 = buffer.readBoolean();
            DBCConfig.MoveWhileTransforming = aai11 = buffer.readBoolean();
            DBCConfig.MoveWhileInstantTransforming = aai12 = buffer.readBoolean();
            for (int i13 = 0; i13 < JGConfigDBCAAiDifficulty.DIFFICULTIES.length; ++i13) {
                double aai26;
                int aai25;
                int aai24;
                double aai23;
                double aai22;
                double aai21;
                double aai20;
                double aai272;
                double aai19;
                double aai18;
                double aai17;
                double aai16;
                double aai15;
                double aai14;
                double aai13;
                JGConfigDBCAAiDifficulty.GroundDashSpeedMulti[i13] = aai13 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.GroundDashSpeedMulti2[i13] = aai14 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.GroundDashLimit[i13] = aai15 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.JumpMulti[i13] = aai16 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.JumpMulti2[i13] = aai17 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.JumpLimit[i13] = aai18 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.JumpLimit2[i13] = aai19 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.JumpRate[i13] = aai272 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.FlyingDashMulti[i13] = aai20 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.FlyingDashLimit[i13] = aai21 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.KiAttackChargeMulti[i13] = aai22 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.KiAttackChargeLimit[i13] = aai23 = buffer.readDouble();
                JGConfigDBCAAiDifficulty.TeleportRateMin[i13] = aai24 = buffer.readInt();
                JGConfigDBCAAiDifficulty.TeleportRateMax[i13] = aai25 = buffer.readInt();
                JGConfigDBCAAiDifficulty.SpeedMulti[i13] = aai26 = buffer.readDouble();
            }
            DBCConfig.MysticKaiokenOn = aai27 = buffer.readBoolean();
            for (i11 = 0; i11 < JRMCoreH.Races.length; ++i11) {
                for (int j = 0; j < JRMCoreConfig.KaiokenFormHealthCost[i11].length; ++j) {
                    float aai292;
                    JRMCoreConfig.KaiokenFormHealthCost[i11][j] = aai292 = buffer.readFloat();
                }
            }
            for (i11 = 0; i11 < 2; ++i11) {
                boolean aai293;
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED[i11] = aai293 = buffer.readBoolean();
            }
        }
        JGConfigDBCFormMastery.FM_Enabled = aai29 = buffer.readBoolean();
        for (int raceID = 0; raceID < JRMCoreH.Races.length; ++raceID) {
            int racials = JRMCoreH.trans[raceID].length;
            for (int formID = 0; formID < JGConfigDBCFormMastery.FormMasteries[raceID].length; ++formID) {
                String form;
                boolean racial = formID < racials;
                String string = form = racial ? JRMCoreH.trans[raceID][formID] : JRMCoreH.transNonRacial[formID - racials];
                if (racial && JRMCoreH.isRaceSaiyan(raceID) && (form.equals(JRMCoreH.trans[raceID][12]) || form.equals(JRMCoreH.trans[raceID][13]))) continue;
                for (int j = 0; j < 3; ++j) {
                    double aai30 = buffer.readDouble();
                    JGConfigDBCFormMastery.FormMasteries[raceID][formID].data.get((int)JGConfigDBCFormMastery.DATA_ID_DAMAGE_MULTI)[j] = aai30 + "";
                }
            }
        }
    }

    public void handleFall(byte b, EntityPlayer p) {
    }

    public void handleRls(byte b, EntityPlayer p) {
    }

    public void handleTech(byte b, String s, EntityPlayer p) {
        if (b >= 0 && b <= 3) {
            String[] s2;
            String[] stringArray = s2 = s.contains(";") ? s.toString().split(";") : null;
            if (b == 0) {
                JRMCoreH.tech1 = s2;
            }
            if (b == 1) {
                JRMCoreH.tech2 = s2;
            }
            if (b == 2) {
                JRMCoreH.tech3 = s2;
            }
            if (b == 3) {
                JRMCoreH.tech4 = s2;
            }
        }
    }

    public void handleAttck(byte b, EntityPlayer p) {
    }

    public void handleCost(short s, EntityPlayer p) {
    }

    public void handleStats2(int curTP, int curExp, byte align, int[] plyrAttrbts, EntityPlayer p) {
        JRMCoreH.curTP = curTP;
        JRMCoreH.curExp = curExp;
        JRMCoreH.align = align;
        JRMCoreH.PlyrAttrbts = plyrAttrbts;
        byte pwr = JRMCoreH.Pwrtyp;
        byte rce = JRMCoreH.Race;
        byte cls = JRMCoreH.Class;
        JRMCoreH.maxBody = JRMCoreH.stat((Entity)p, 2, pwr, 2, JRMCoreH.PlyrAttrbts[2], rce, cls, 0.0f);
        JRMCoreH.maxEnergy = JRMCoreH.stat((Entity)p, 5, pwr, 5, JRMCoreH.PlyrAttrbts[5], rce, cls, JRMCoreH.SklLvl_KiBs(pwr));
        JRMCoreH.maxStamina = JRMCoreH.stat((Entity)p, 2, pwr, 3, JRMCoreH.PlyrAttrbts[2], rce, cls, 0.0f);
    }

    public static int aqMWr(String l) {
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

    public static int nQp65G(int b) {
        String r = "64";
        String k = "3B9ACA00";
        return b > JRMCorePacHanC.aqMWr(k) ? JRMCorePacHanC.aqMWr(k) : (b < JRMCorePacHanC.aqMWr(r) ? 0 : b);
    }

    public void handleStats3(String PlyrSkills, String x, String y, String z, EntityPlayer p) {
        JRMCoreH.PlyrSkillX = x;
        JRMCoreH.PlyrSkillY = y;
        JRMCoreH.PlyrSkillZ = z;
        JRMCoreH.PlyrSkills = PlyrSkills.split(",");
    }

    public void handleStats(int curBody, int curEnergy, int curStamina, byte curRelease, byte b) {
        JRMCoreH.curBody = curBody;
        JRMCoreH.curEnergy = curEnergy;
        JRMCoreH.curStamina = curStamina;
        JRMCoreH.curRelease = curRelease;
        JRMCoreH.TransSaiCurRg = b;
    }

    public void handleUpgrade(byte b, EntityPlayer p) {
    }

    public void handleCol(int i, byte b, EntityPlayer p) {
    }

    public void handleChar(byte b, int b2, EntityPlayer p) {
    }

    public void handleTick(int jrmcpg, String jrmcp, EntityPlayer p) {
        if (jrmcpg == 4) {
            Entity e;
            String[] s = jrmcp.split(";");
            if (s.length > 2 && (e = p.worldObj.getEntityByID(Integer.parseInt(s[0]))) != null) {
                if (JGConfigClientSettings.CLIENT_DA15) {
                    float a = 1.0f;
                    float h1 = 1.0f;
                    float scale = (float)e.ticksExisted * (e.height / 100.0f);
                    Entity pl = e;
                    double x = 0.0;
                    double y = pl.height * 0.6f;
                    double z = 0.0;
                    EntityCusPar entity7 = new EntityCusPar("jinryuumodscore:bens_particles.png", e.worldObj, 0.4f, 0.4f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, 0.0, 0.0, 0.0f, (int)(Math.random() * 4.0) + 12, 12, 4, 32, true, (float)(Math.random() * (double)0.3f) + 0.3f, false, 0.0f, 1, "", 35, 1, (float)(Math.random() * (double)0.02f) + 0.04f, (float)(Math.random() * (double)0.03f) + 0.06f, (float)(Math.random() * (double)0.003f) + 0.001f, 0, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 1.0f, 0.0f, 0.0f, 0.0f, -0.05f, false, -1, false, null);
                    entity7.setdata39((int)(Math.random() * 360.0));
                    e.worldObj.spawnEntityInWorld((Entity)entity7);
                    int num = (int)(Math.random() * 4.0) + 1;
                    for (int i = 0; i < num; ++i) {
                        EntityCusPar entity72 = new EntityCusPar("jinryuumodscore:bens_particles.png", e.worldObj, 0.4f, 0.4f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, 0.0, 0.0, 0.0f, (int)(Math.random() * 4.0) + 4, 4, 4, 64, true, (float)(Math.random() * (double)0.4f) + 0.4f, false, 0.0f, 1, "", 22, 1, (float)(Math.random() * (double)0.02f) + 0.03f, (float)(Math.random() * (double)0.03f) + 0.05f, (float)(Math.random() * (double)0.002f) + 0.001f, 0, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 1.0f, 0.0f, 0.0f, 0.0f, -0.05f, false, -1, false, null);
                        entity72.setdata39((int)(Math.random() * 360.0));
                        e.worldObj.spawnEntityInWorld((Entity)entity72);
                    }
                }
                JRMCoreH.damInd.put(e.posX + ":" + (e.posY + (double)e.height) + ":" + e.posZ, s[2] + ":100");
            }
        } else if (jrmcpg == 50) {
            Entity e;
            String[] s;
            if (JGConfigClientSettings.instantTransmissionParticles && (s = jrmcp.split(";")).length > 3 && (e = p.worldObj.getEntityByID(Integer.parseInt(s[0]))) != null) {
                float scale = 0.025f * e.height;
                float a = 0.25f;
                Entity pl = e;
                double x = 0.0;
                double y = pl.height * 0.5f;
                double z = 0.0;
                double x2 = Double.parseDouble(s[1]);
                double y2 = Double.parseDouble(s[2]);
                double z2 = Double.parseDouble(s[3]);
                EntityCusPar entity = new EntityCusPar("jinryuudragonbc:bens_particles2.png", e.worldObj, 0.4f, 0.4f, x2, y2, z2, x, y, z, 0.0, 0.0, 0.0, 0.0f, (int)(Math.random() * 3.0), 0, 0, 64, false, 0.0f, false, 0.0f, 1, "", 10, 1, scale, scale / 50.0f, -scale / 20.0f, 0, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, a, 0.0f, 0.0f, 0.0f, a / 5.0f, false, -1, false, null);
                e.worldObj.spawnEntityInWorld((Entity)entity);
            }
        } else if (jrmcpg != 5) {
            if (jrmcpg == 20) {
                p.openGui((Object)mod_JRMCore.instance, 2, p.worldObj, (int)p.posX, (int)p.posY, (int)p.posZ);
                JRMCoreH.ask = jrmcp;
            } else if (jrmcpg == 22) {
                p.openGui((Object)mod_JRMCore.instance, 3, p.worldObj, (int)p.posX, (int)p.posY, (int)p.posZ);
                JRMCoreH.ask = jrmcp;
            } else if (jrmcpg == 1) {
                JRMCoreH.plyrsArnd = jrmcp == "::" ? null : jrmcp.toString().replaceAll("::", "").split(":");
            }
        }
    }

    public void handleNotification(EntityPlayer p, String title, String description, byte category, byte icon, byte renderLocation, int iconColor) {
        this.handleNotification(title, description, category, icon, renderLocation, iconColor);
    }

    public void handleNotification(String title, String description, byte category, byte icon, byte renderLocation, int iconColor) {
        if (JGNotificationGUI.categoryState[category] != 2 && JGNotificationGUI.categoryState[0] != 2) {
            JGNotificationHandlerC.addNotification(new JGNotification(title, description, category, icon, renderLocation, iconColor));
        }
    }
}

