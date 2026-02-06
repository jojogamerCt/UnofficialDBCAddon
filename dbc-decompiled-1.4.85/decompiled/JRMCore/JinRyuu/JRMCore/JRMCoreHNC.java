/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.NarutoC.common.NCH
 *  JinRyuu.NarutoC.common.Npcs.EntityNC
 *  JinRyuu.NarutoC.common.Npcs.EntityNCKami
 *  JinRyuu.NarutoC.common.Npcs.f.EntityKonohaFugaku
 *  JinRyuu.NarutoC.common.Npcs.f.EntityKonohaHiashi
 *  JinRyuu.NarutoC.common.Npcs.f.EntityKonohaSarutobi
 *  JinRyuu.NarutoC.common.Villages.Konoha
 *  JinRyuu.NarutoC.common.Villages.builds
 *  JinRyuu.NarutoC.common.mod_NarutoC
 *  com.google.common.collect.Lists
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$Action
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreA;
import JinRyuu.JRMCore.JRMCoreComTickH;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreEH;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntitySafeZone;
import JinRyuu.NarutoC.common.NCH;
import JinRyuu.NarutoC.common.Npcs.EntityNC;
import JinRyuu.NarutoC.common.Npcs.EntityNCKami;
import JinRyuu.NarutoC.common.Npcs.f.EntityKonohaFugaku;
import JinRyuu.NarutoC.common.Npcs.f.EntityKonohaHiashi;
import JinRyuu.NarutoC.common.Npcs.f.EntityKonohaSarutobi;
import JinRyuu.NarutoC.common.Villages.Konoha;
import JinRyuu.NarutoC.common.Villages.builds;
import JinRyuu.NarutoC.common.mod_NarutoC;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class JRMCoreHNC {
    public static final int Action_EightGates = 1;
    public static builds[] NCbuilds = new builds[]{new Konoha()};
    public static int[] NCbuildsdim = new int[]{0};
    public static boolean checked = false;
    public static boolean renderHyuuga;

    public static int getSpecJutsu(int k) {
        block4: for (int i = 0; i < 4; i = (int)((byte)(i + 1))) {
            if (JRMCoreH.techsPM(i) < 0) continue;
            String[] j = JRMCoreH.pmj[JRMCoreH.techsPM(i)];
            int den = Integer.parseInt(j[11]);
            switch (den) {
                case 7: {
                    if (k != 4) continue block4;
                    return 4 + i + 1;
                }
                case 6: {
                    if (k != 3) continue block4;
                    return 4 + i + 1;
                }
            }
        }
        return -1;
    }

    public static int iconInList() {
        ArrayList<Integer> a;
        return a.get(JRMCoreH.EnAtSlct < (a = JRMCoreHNC.iconList()).size() ? JRMCoreH.EnAtSlct : a.size() - 1);
    }

    public static ArrayList<Integer> iconList() {
        ArrayList al = Lists.newArrayList();
        if (JRMCoreH.PlyrSettingsB(7)) {
            al.add(5);
            return al;
        }
        switch (JRMCoreH.Class) {
            case 1: {
                al.add(1);
                break;
            }
            case 0: {
                al.add(0);
                break;
            }
            case 2: {
                al.add(2);
                break;
            }
        }
        block9: for (int i = 0; i < 4; i = (int)((byte)(i + 1))) {
            if (JRMCoreH.techsPM(i) < 0 || JRMCoreH.pmj.length <= JRMCoreH.techsPM(i)) continue;
            String[] j = JRMCoreH.pmj[JRMCoreH.techsPM(i)];
            int den = Integer.parseInt(j[11]);
            switch (den) {
                case 7: {
                    al.add(4);
                    continue block9;
                }
                case 6: {
                    al.add(3);
                    continue block9;
                }
            }
        }
        return al;
    }

    public static void actionInit() {
        JRMCoreA.actionsNC.put(0, 1);
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
        boolean lf = JRMCoreH.StusEfctsMe(14);
        switch (d) {
            case 1: {
                String nm = JRMCoreH.trl("nc", JRMCoreH.SklName(JRMCoreH.NCSkillIDs[12], JRMCoreH.NCSkillIDs, JRMCoreH.NCSkillNames));
                int skl = JRMCoreH.SklLvl(12, JRMCoreH.Pwrtyp);
                boolean ps = JRMCoreH.PlyrSettingsB(7);
                if (lf || skl <= 0) break;
                if (action) {
                    if (ps) {
                        JRMCoreH.Skll((byte)6, (byte)7, (byte)1);
                        JRMCoreH.jrmct(3);
                        break;
                    }
                    JRMCoreH.Skll((byte)6, (byte)7, (byte)0);
                    JRMCoreH.jrmct(3);
                    break;
                }
                String enable = JRMCoreH.trl("jrmc", opt1);
                String disable = JRMCoreH.trl("jrmc", opt2);
                return nm + ": " + (ps ? (black ? "" : "\u00a72") + disable : (black ? "" : "\u00a74") + enable);
            }
        }
        return "";
    }

    public static void openGui(int id, EntityPlayer pl) {
        pl.openGui((Object)mod_NarutoC.instance, id, pl.worldObj, (int)pl.posX, (int)pl.posY, (int)pl.posZ);
    }

    public static boolean NCgetEntityNC(Entity shootingEntity) {
        return shootingEntity instanceof EntityNC;
    }

    public static void NCCommonTickHandlerNPCSpawnCheck(EntityPlayerMP player) {
        if (JRMCoreConfig.NPCSpawnCheck) {
            int[] Khvln1 = new int[3];
            if (NCH.genKnvl.contains(";")) {
                for (int i = 0; i < 3; ++i) {
                    Khvln1[i] = Integer.parseInt(NCH.genKnvl.split(";")[i]) + NCH.genKnvlN1[i];
                }
            }
            int[] Khvln2 = new int[3];
            if (NCH.genKnvl.contains(";")) {
                for (int i = 0; i < 3; ++i) {
                    Khvln2[i] = Integer.parseInt(NCH.genKnvl.split(";")[i]) + NCH.genKnvlN2[i];
                }
            }
            int[] Khvln3 = new int[3];
            if (NCH.genKnvl.contains(";")) {
                for (int i = 0; i < 3; ++i) {
                    Khvln3[i] = Integer.parseInt(NCH.genKnvl.split(";")[i]) + NCH.genKnvlN3[i];
                }
            }
            int[][] ps = new int[][]{Khvln1, Khvln2, Khvln3};
            EntityNCKami[] ent = new EntityNCKami[]{new EntityKonohaSarutobi(player.worldObj), new EntityKonohaHiashi(player.worldObj), new EntityKonohaFugaku(player.worldObj)};
            Class[] entclss = new Class[]{EntityKonohaSarutobi.class, EntityKonohaHiashi.class, EntityKonohaFugaku.class};
            int[] dims = new int[]{0, 0, 0};
            boolean[] spawn = new boolean[]{NCH.genKnvl.contains(";"), NCH.genKnvl.contains(";"), NCH.genKnvl.contains(";")};
            for (int i = 0; i < ps.length; ++i) {
                int a;
                AxisAlignedBB ab;
                List enma;
                int[] npc = ps[i];
                if (dims[i] != player.dimension || npc.length <= 2 || !(enma = player.worldObj.getEntitiesWithinAABB(entclss[i], ab = AxisAlignedBB.getBoundingBox((double)(npc[0] - (a = 2)), (double)(npc[1] - a), (double)(npc[2] - a), (double)(npc[0] + a), (double)(npc[1] + a), (double)(npc[2] + a)))).isEmpty() || !spawn[i]) continue;
                EntityNCKami en = ent[i];
                en.setLocationAndAngles((double)npc[0] + 0.5, (double)npc[1], (double)npc[2] + 0.5, 0.0f, 0.0f);
                player.worldObj.spawnEntityInWorld((Entity)en);
            }
        }
    }

    public static String NCbuildsNams(int i) {
        if (i == 0) {
            return "nc.com.loc.Konoha";
        }
        return "";
    }

    public static void spawnBuilds(MinecraftServer server) {
        int[] Knvl = new int[3];
        if (NCH.genKnvl.contains(";")) {
            for (int i = 0; i < 3; ++i) {
                Knvl[i] = Integer.parseInt(NCH.genKnvl.split(";")[i]);
            }
        }
        int[][] ps = new int[][]{Knvl};
        for (int i = 0; i < ps.length; ++i) {
            int[] npc = ps[i];
            if (server.worldServerForDimension((int)0).isRemote || npc.length <= 2) continue;
            builds v = NCbuilds[i];
            WorldServer w = server.worldServerForDimension(NCbuildsdim[i]);
            v.setWorld((World)w);
            if (npc[0] == 0 && npc[1] == 0 && npc[2] == 0 || JRMCoreComTickH.bs.contains(JRMCoreHNC.NCbuildsNams(i))) continue;
            v.generate((World)w, w.rand, npc[0], npc[1], npc[2]);
        }
    }

    public static void NCCommonTickHandlerWorldGenBuildingsResetted(MinecraftServer server) {
        if (JRMCoreH.NCresetted) {
            JRMCoreH.NCresetted = false;
            JRMCoreHNC.WorldGenBuildingsSpawnCheck(server);
        }
    }

    public static void WorldGenBuildingsSpawnCheck(MinecraftServer server) {
        NCH.genKnvl = NCH.kvrwi((MinecraftServer)server);
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
}

