/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.Npcs.EntityDBCEvil
 *  JinRyuu.DragonBC.common.Npcs.EntityDBCKami
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.world.WorldServer
 */
package JinRyuu.JRMCore;

import JinRyuu.DragonBC.common.Npcs.EntityDBCEvil;
import JinRyuu.DragonBC.common.Npcs.EntityDBCKami;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.entity.EntityEnergyAtt;
import JinRyuu.JRMCore.entity.EntityPunch;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.WorldServer;

public class JRMCoreModDBC {
    public static void safeOut(MinecraftServer server) {
        WorldServer dim0 = server.worldServerForDimension(0);
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)56.0, (double)10.0, (double)20.0, (double)116.0, (double)240.0, (double)80.0);
        if (JRMCoreH.DBC() && JRMCoreConfig.sfzns) {
            List ep;
            List eea;
            List dem;
            List mobs;
            List enma = dim0.getEntitiesWithinAABB(EntityDBCKami.class, aabb);
            if (enma.isEmpty()) {
                // empty if block
            }
            if (enma.size() > 1) {
                for (int i = 1; enma.size() > i; ++i) {
                    Entity m = (Entity)enma.get(i);
                    m.setDead();
                }
            }
            if ((mobs = dim0.getEntitiesWithinAABB(EntityMob.class, aabb)).size() > 0) {
                for (int i = 0; mobs.size() > i; ++i) {
                    Entity m = (Entity)mobs.get(i);
                    m.setDead();
                }
            }
            if ((dem = dim0.getEntitiesWithinAABB(EntityDBCEvil.class, aabb)).size() > 0) {
                for (int i = 0; dem.size() > i; ++i) {
                    Entity m = (Entity)dem.get(i);
                    m.setDead();
                }
            }
            if ((eea = dim0.getEntitiesWithinAABB(EntityEnergyAtt.class, aabb)).size() > 0) {
                for (int i = 0; eea.size() > i; ++i) {
                    Entity m = (Entity)eea.get(i);
                    m.setDead();
                }
            }
            if ((ep = dim0.getEntitiesWithinAABB(EntityPunch.class, aabb)).size() > 0) {
                for (int i = 0; ep.size() > i; ++i) {
                    Entity m = (Entity)ep.get(i);
                    m.setDead();
                }
            }
        }
    }
}

