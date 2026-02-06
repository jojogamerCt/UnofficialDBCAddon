/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreHDBC
 *  JinRyuu.JRMCore.p.DBC.DBCPduo
 *  JinRyuu.JRMCore.p.PD
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.living.LivingDropsEvent
 */
package JinRyuu.DragonBC.common;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.DBCClient;
import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Npcs.EntityBuuFat;
import JinRyuu.DragonBC.common.Npcs.EntityBuuSuper;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg16;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg17;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg18;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg19;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg20;
import JinRyuu.DragonBC.common.Npcs.EntityDarbura;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.p.DBC.DBCPduo;
import JinRyuu.JRMCore.p.PD;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class DBCH {
    public static String genKH = "";
    public static String genCA = "";
    public static String genGH = "";
    public static String genFS = "";
    public static String genGuru = "";
    public static String genBS = "";
    public static int[] genKHnpc1 = new int[]{-5, 0, -18};
    public static int[] genCAnpc1 = new int[]{2, 2, 10};
    public static int[] genGHnpc1 = new int[]{8, 1, 31};
    public static int[] genGHnpc2 = new int[]{10, 1, 8};
    public static int[] genFSnpc1 = new int[]{2, 1, 15};
    public static int[] genBSnpc1 = new int[]{14, 1, 20};
    public static int[] genGurunpc1 = new int[]{9, 5, 10};
    public static String wi = "wi.dbc";
    public static String kh = "KameHouse";
    public static String khn1 = "KameHouseNPC1";
    public static String ca = "CellArena";
    public static String can1 = "CellArenaNPC1";
    public static String gh = "GokuHouse";
    public static String ghn1 = "GokuHouseNPC1";
    public static String fs = "FreizaShip";
    public static String fsn1 = "FreizaShipNPC1";
    public static String bs = "BabidiShip";
    public static String guruh = "GuruHouse";
    public static boolean HTCtrain = false;
    public static int KPminX = 75;
    public static int KPminY = 110;
    public static int KPminZ = -3757;
    public static int KPmaxX = 132;
    public static int KPmaxY = 150;
    public static int KPmaxZ = -3702;
    public static int[] Kami = new int[]{86, 217, 50, 0};
    public static int[] Karn = new int[]{80, 133, 40, 0};
    public static int[] Enma = new int[]{75, 91, 53, 0};
    public static int[] KaiO = new int[]{107, 116, -3719, 0};
    public static int[] TrnksF = new int[]{72, 217, 27, 0};
    public static int[] Jin = new int[]{107, 116, -3722, 0};
    public static int[] Whis1 = new int[]{69, 217, 60, 0};
    public static int[] Whis2 = new int[]{6, 135, 70, 0};
    public static float RotYaw = 0.0f;
    public static float RotPic = 0.0f;
    public static int cbge = 0;
    public static int planetEarth = 0;
    public static int planetNamek = 20;
    public static int planetVegeta = 21;
    public static int otherWorld = 22;
    public static int dimTimeChamber = 23;
    public static int dimNullRealm = 24;
    public static HashMap<Integer, String> plntNms = new HashMap();
    public static ArrayList<String> wishS = new ArrayList();
    public static ArrayList<String> wishP = new ArrayList();
    public static int mult = 1;

    public static void wwi(MinecraftServer server, String d, String rid, boolean b) {
        String wd = "/data";
        JRMCoreH.wd((MinecraftServer)server, (String)d, (String)(rid + ""), (String)wd, (String)wi, (boolean)b);
    }

    public static String rwi(MinecraftServer server, String id) {
        String wd = "/data";
        return JRMCoreH.rd((MinecraftServer)server, (String)(id + ""), (String)wd, (String)wi);
    }

    public static void khwwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, kh, b);
    }

    public static String khrwi(MinecraftServer server) {
        return DBCH.rwi(server, kh);
    }

    public static void khn1wwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, khn1, b);
    }

    public static String khn1rwi(MinecraftServer server) {
        return DBCH.rwi(server, khn1);
    }

    public static void cawwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, ca, b);
    }

    public static String carwi(MinecraftServer server) {
        return DBCH.rwi(server, ca);
    }

    public static void can1wwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, can1, b);
    }

    public static String can1rwi(MinecraftServer server) {
        return DBCH.rwi(server, can1);
    }

    public static void ghwwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, gh, b);
    }

    public static String ghrwi(MinecraftServer server) {
        return DBCH.rwi(server, gh);
    }

    public static void ghn1wwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, ghn1, b);
    }

    public static String ghn1rwi(MinecraftServer server) {
        return DBCH.rwi(server, ghn1);
    }

    public static void fswwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, fs, b);
    }

    public static String fsrwi(MinecraftServer server) {
        return DBCH.rwi(server, fs);
    }

    public static void fsn1wwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, fsn1, b);
    }

    public static String fsn1rwi(MinecraftServer server) {
        return DBCH.rwi(server, fsn1);
    }

    public static void bswwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, bs, b);
    }

    public static String bsrwi(MinecraftServer server) {
        return DBCH.rwi(server, bs);
    }

    public static void guruhwwi(MinecraftServer server, String d, boolean b) {
        DBCH.wwi(server, d, guruh, b);
    }

    public static String guruhrwi(MinecraftServer server) {
        return DBCH.rwi(server, guruh);
    }

    public static boolean mvng() {
        float p = DBCClient.mc.thePlayer.rotationPitch < 0.0f ? (float)((int)DBCClient.mc.thePlayer.rotationPitch * -1) : (float)((int)DBCClient.mc.thePlayer.rotationPitch);
        float y = DBCClient.mc.thePlayer.rotationYaw < 0.0f ? (float)((int)DBCClient.mc.thePlayer.rotationYaw * -1) : (float)((int)DBCClient.mc.thePlayer.rotationYaw);
        boolean rotat = p > RotPic && p > RotPic + 0.1f || p < RotPic && p < RotPic - 0.1f || y > RotYaw && y > RotYaw + 0.1f || y < RotYaw && y < RotYaw - 0.1f;
        return DBCClient.mc.thePlayer.motionX > 0.005 || DBCClient.mc.thePlayer.motionZ > 0.005 || DBCClient.mc.thePlayer.motionX < -0.005 || DBCClient.mc.thePlayer.motionZ < -0.005 || DBCClient.mc.thePlayer.motionY > 0.005;
    }

    public static boolean lkng() {
        float p = DBCClient.mc.thePlayer.rotationPitch < 0.0f ? (float)((int)DBCClient.mc.thePlayer.rotationPitch * -1) : (float)((int)DBCClient.mc.thePlayer.rotationPitch);
        float y = DBCClient.mc.thePlayer.rotationYaw < 0.0f ? (float)((int)DBCClient.mc.thePlayer.rotationYaw * -1) : (float)((int)DBCClient.mc.thePlayer.rotationYaw);
        boolean rotat = p > RotPic && p > RotPic + 0.1f || p < RotPic && p < RotPic - 0.1f || y > RotYaw && y > RotYaw + 0.1f || y < RotYaw && y < RotYaw - 0.1f;
        return rotat;
    }

    public static void dbcWish(int id, EntityPlayer p) {
    }

    public static void DBCDeath(EntityPlayer Player) {
        byte a;
        if (!mod_DragonBC.DeathSystemOff && (a = JRMCoreH.getByte((EntityPlayer)Player, (String)"jrmcAlv")) != 1) {
            JRMCoreH.setByte((int)1, (EntityPlayer)Player, (String)"jrmcAlv");
            JRMCoreH.setInt((int)DBCConfig.RevTm, (EntityPlayer)Player, (String)"jrmcReviveTmer");
        }
        if (Player != null) {
            JRMCoreH.setInt((int)0, (EntityPlayer)Player, (String)"jrmcAlCntr");
            mod_DragonBC.logger.info(Player.getCommandSenderName() + " has died");
            int d = JRMCoreH.getByte((EntityPlayer)Player, (String)"jrmcDiff");
            byte pwr = JRMCoreH.getByte((EntityPlayer)Player, (String)"jrmcPwrtyp");
            byte rc = JRMCoreH.getByte((EntityPlayer)Player, (String)"jrmcRace");
            byte cl = JRMCoreH.getByte((EntityPlayer)Player, (String)"jrmcClass");
            byte st = JRMCoreH.getByte((EntityPlayer)Player, (String)"jrmcState");
            JRMCoreH.setByte((byte)(rc == 4 ? (st > 4 ? (byte)4 : (byte)st) : (byte)0), (EntityPlayer)Player, (String)"jrmcState");
            JRMCoreH.setByte((int)0, (EntityPlayer)Player, (String)"jrmcState2");
            String ste = JRMCoreH.getString((EntityPlayer)Player, (String)"jrmcStatusEff");
            if (JRMCoreH.StusEfcts((int)9, (String)ste) || JRMCoreH.StusEfcts((int)2, (String)ste) || JRMCoreH.StusEfcts((int)6, (String)ste) || JRMCoreH.StusEfcts((int)21, (String)ste)) {
                String s = "";
                JRMCoreH.StusEfcts((int)9, (String)s, (EntityPlayer)Player, (boolean)JRMCoreH.StusEfcts((int)9, (String)ste));
                JRMCoreH.StusEfcts((int)2, (String)s, (EntityPlayer)Player, (boolean)JRMCoreH.StusEfcts((int)2, (String)ste));
                JRMCoreH.StusEfcts((int)6, (String)s, (EntityPlayer)Player, (boolean)JRMCoreH.StusEfcts((int)6, (String)ste));
                JRMCoreH.StusEfcts((int)21, (String)s, (EntityPlayer)Player, (boolean)JRMCoreH.StusEfcts((int)21, (String)ste));
            } else {
                JRMCoreH.setString((String)" ", (EntityPlayer)Player, (String)"jrmcStatusEff");
            }
            JRMCoreH.setInt((int)0, (EntityPlayer)Player, (String)"jrmcHar4va");
            JRMCoreH.setString((String)"0,0,0+0", (EntityPlayer)Player, (String)"jrmcMajinAbsorptionData");
            if (d > 0 && pwr == 1) {
                for (int i1 = 0; i1 < d; ++i1) {
                    for (int i = 0; i < 2; ++i) {
                        for (int j = 0; j < 20; ++j) {
                            int atrs;
                            int r = new Random().nextInt(6);
                            int atr = JRMCoreH.getInt((EntityPlayer)Player, (String)JRMCoreH.AttrbtNbtI[r]);
                            if (atr <= (atrs = JRMCoreH.attributeStart((int)pwr, (int)r, (int)rc, (int)cl))) continue;
                            mod_DragonBC.logger.info("Because of death, " + Player.getCommandSenderName() + " also lost a " + JRMCoreH.attrNms((int)pwr, (int)r) + " point.");
                            break;
                        }
                        for (int r = 0; r < 6; ++r) {
                            int atrs;
                            int atr = JRMCoreH.getInt((EntityPlayer)Player, (String)JRMCoreH.AttrbtNbtI[r]);
                            if (atr >= (atrs = JRMCoreH.attributeStart((int)pwr, (int)r, (int)rc, (int)cl))) continue;
                            JRMCoreH.setInt((int)atrs, (EntityPlayer)Player, (String)JRMCoreH.AttrbtNbtI[r]);
                        }
                    }
                }
            }
        }
    }

    public static void DBCUpdate(EntityPlayer Player) {
    }

    public static void dragonSum(Entity e) {
        double x = e.posX;
        int r = 100;
        double y = e.posY;
        double z = e.posZ;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(x - (double)r), (double)(y - (double)r), (double)(z - (double)r), (double)(x + (double)r), (double)(y + (double)r), (double)(z + (double)r));
        List lst = e.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
        if (!lst.isEmpty()) {
            JRMCoreHDBC.dragonSum = 100;
        }
    }

    public static String NpcSpawnLoc(int x, int y, int z, World w) {
        int k = 0;
        block0: for (int i = 3; i < 6; ++i) {
            for (int j2 = 0; j2 < 6; ++j2) {
                for (int j = y + 5; j > 1; --j) {
                    if (!w.isAirBlock(x + i, j, z + j2) || w.isAirBlock(x + i, j - 1, z + j2)) continue;
                    x += i;
                    y = j;
                    z += j2;
                    ++k;
                    break block0;
                }
            }
        }
        double X = (double)x + 0.5;
        double Z = (double)z + 0.5;
        return X + ";" + y + ";" + Z;
    }

    public static void DBSpawn(EntityPlayer player, long wt) {
        if (mod_DragonBC.DBSpawnEnabled) {
            int did;
            int rate;
            Random ran;
            int r;
            int t;
            int m = 48;
            int n = DBCH.DBTime("morning") ? 1 : (t = DBCH.DBTime("evening") ? 11996 : 6001);
            if (wt == (long)t && (r = (ran = new Random()).nextInt(rate = (did = player.dimension) == DBCConfig.planetEarth ? DBCConfig.eDBrate : (did == DBCConfig.planetNamek ? DBCConfig.nDBrate : 10))) == 0) {
                Block dbs;
                Object object = did == DBCConfig.planetEarth ? BlocksDBC.BlockDragonBallStone : (dbs = did == DBCConfig.planetNamek ? BlocksDBC.BlockNamekDragonBallStone : null);
                Block db = did == DBCConfig.planetEarth ? BlocksDBC.BlockDragonBall : (did == DBCConfig.planetNamek ? BlocksDBC.BlockNamekDragonBall : null);
                Object blockID = null;
                int dbnum = 0;
                int l1 = MathHelper.floor_double((double)player.posX);
                int i11 = MathHelper.floor_double((double)player.posZ);
                for (int j11 = l1 - m; j11 <= l1 + m; ++j11) {
                    for (int j2 = i11 - m; j2 <= i11 + m; ++j2) {
                        for (int k2 = 109; k2 >= 64; --k2) {
                            if (player.worldObj.getBlock(j11, k2, j2) == db) {
                                ++dbnum;
                            }
                            if (player.worldObj.getBlock(j11, k2, j2) != dbs) continue;
                            ++dbnum;
                        }
                    }
                }
                int i = MathHelper.floor_double((double)(player.posX + (double)player.worldObj.rand.nextInt(m) + (double)(player.worldObj.rand.nextInt(m) * -1)));
                int k = MathHelper.floor_double((double)(player.posZ + (double)player.worldObj.rand.nextInt(m) + (double)(player.worldObj.rand.nextInt(m) * -1)));
                for (int j = 109; j >= 64; --j) {
                    if (player.worldObj.isAirBlock(i, j, k) || player.worldObj.getBlock(i, j, k) == dbs || player.worldObj.getBlock(i, j, k) == db || player.worldObj.getBlock(i, j, k) != Blocks.grass && player.worldObj.getBlock(i, j, k) != Blocks.sand && player.worldObj.getBlock(i, j, k) != BlocksDBC.BlockNamekGrass) continue;
                    if (dbnum >= mod_DragonBC.DBSpawnChance) continue;
                    player.worldObj.setBlock(i, j + 1, k, dbs, 0, 3);
                    break;
                }
            }
        }
    }

    private static boolean DBTime(String s) {
        return mod_DragonBC.DBSpawnTime.contains(s);
    }

    public static void packDuo(int t, int i) {
        PD.sendToServer((IMessage)new DBCPduo(t, i));
    }

    public static void plntNmsInit() {
        plntNms.put(DBCConfig.planetEarth, "Earth");
        plntNms.put(DBCConfig.planetNamek, "Namek");
        plntNms.put(DBCConfig.planetVegeta, "Vegeta");
        plntNms.put(DBCConfig.otherWorld, "OtherWorld");
        plntNms.put(DBCConfig.dimTimeChamber, "TimeChamber");
        plntNms.put(DBCConfig.dimNullRealm, "Null Realm");
    }

    public static void wishInit() {
        wishS.add("minecraft:diamond;+;" + 3 * mult + ";+;0");
        wishS.add("jinryuudragonblockc:ItemAlienTechChipTier1;+;" + 3 * mult + ";+;0");
        wishS.add("jinryuudragonblockc:ItemWarenai;+;" + 5 * mult + ";+;0");
        wishS.add("jinryuudragonblockc:ItemSenzu;+;" + 3 * mult + ";+;0");
        wishS.add("jinryuudragonblockc:ItemKatchin;+;" + 1 * mult + ";+;0");
        wishS.add("revive");
        wishS.add("reviventp");
        wishS.add("reviveall");
        wishS.add("kicolor");
        wishS.add("arcultformcolor");
        if (JRMCoreH.JYC()) {
            wishS.add("young");
            wishS.add("child");
            wishS.add("old");
        }
        wishS.add("jinryuudragonblockc:ItemJanembaEssence;+;" + 5 * mult + ";+;0");
        wishS.add("jinryuudragonblockc:ItemSmallClub;+;" + 1 * mult + ";+;0");
        wishP.add("jinryuudragonblockc:ItemEvilSpear;+;" + 1 * mult + ";+;0");
        wishS.add("jinryuudragonblockc:ItemPP;+;" + 1 * mult + ";+;0");
        wishP.add("minecraft:diamond;+;" + 3 * mult + ";+;0");
        wishP.add("jinryuudragonblockc:ItemAlienTechChipTier1;+;" + 3 * mult + ";+;0");
        wishP.add("jinryuudragonblockc:ItemWarenai;+;" + 5 * mult + ";+;0");
        wishP.add("jinryuudragonblockc:ItemSenzu;+;" + 3 * mult + ";+;0");
        wishP.add("jinryuudragonblockc:ItemKatchin;+;" + 1 * mult + ";+;0");
        wishP.add("revive");
        wishP.add("reviventp");
        wishP.add("kicolor");
        wishP.add("arcultformcolor");
        if (JRMCoreH.JYC()) {
            wishP.add("young");
            wishP.add("child");
            wishP.add("old");
        }
        wishP.add("jinryuudragonblockc:ItemJanembaEssence;+;" + 5 * mult + ";+;0");
        wishP.add("jinryuudragonblockc:ItemSmallClub;+;" + 1 * mult + ";+;0");
    }

    public static void toDrop(int o, LivingDropsEvent e) {
        EntityLivingBase mob = e.entityLiving;
        int r = e.entityLiving.worldObj.rand.nextInt(100);
        Item[] i = r < 5 ? ItemsDBC.ItemsOutfit1 : (r < 10 ? ItemsDBC.ItemsOutfit2 : (r < 15 ? ItemsDBC.ItemsOutfit3 : ItemsDBC.ItemsOutfit0));
        ItemStack stack = new ItemStack(i[o], 1, 1);
        if (r < 20 && stack != null && stack.stackSize != 0 && stack.getItem() != null) {
            EntityItem entityitem = new EntityItem(mob.worldObj, mob.posX, mob.posY, mob.posZ, stack);
            entityitem.delayBeforeCanPickup = 10;
            e.drops.add(entityitem);
        }
    }

    public static void onEventDrop(LivingDropsEvent e) {
        if (e.entityLiving instanceof EntityCyborg16) {
            DBCH.toDrop(0, e);
        }
        if (e.entityLiving instanceof EntityCyborg17) {
            DBCH.toDrop(1, e);
        }
        if (e.entityLiving instanceof EntityCyborg18) {
            DBCH.toDrop(2, e);
        }
        if (e.entityLiving instanceof EntityCyborg19) {
            DBCH.toDrop(3, e);
        }
        if (e.entityLiving instanceof EntityCyborg20) {
            DBCH.toDrop(4, e);
        }
        if (e.entityLiving instanceof EntityDarbura) {
            DBCH.toDrop(5, e);
        }
        if (e.entityLiving instanceof EntityBuuFat) {
            DBCH.toDrop(6, e);
        }
        if (e.entityLiving instanceof EntityBuuSuper) {
            DBCH.toDrop(7, e);
        }
    }
}

