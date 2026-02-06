/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.entity.aai.AAi
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package JinRyuu.DragonBC.common.Npcs.aai;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.JRMCore.entity.aai.AAi;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class AAiDBCTeleport
extends AAi {
    private int timer = 0;
    private int rateMin;
    private int rateMax;
    private int rate;
    private String sound;

    public AAiDBCTeleport(int[] values) {
        this(values[0], values[1], "jinryuudragonbc:DBC2.tp");
    }

    public AAiDBCTeleport(int[] values, String sound) {
        this(values[0], values[1], sound);
    }

    public AAiDBCTeleport(int rateMin, int rateMax, String sound) {
        this.rateMin = rateMin;
        this.rateMax = rateMax < 1 ? 1 : rateMax;
        this.rate = this.generateRate();
        this.sound = sound;
    }

    public void update() {
        EntityDBC entity = (EntityDBC)this.aaiSystem.entity;
        boolean EnemyTeleportOutOfLock = DBCConfig.EnemyTeleportOutOfLock;
        if (!(!entity.isEntityAlive() || entity.worldObj.isRemote || !EnemyTeleportOutOfLock && entity.isLocked() || entity.chargingKiAttack)) {
            ++this.timer;
            List list = entity.worldObj.getEntitiesWithinAABB(EntityPlayer.class, entity.boundingBox.expand(16.0, 16.0, 16.0));
            if (!list.isEmpty()) {
                for (int i = 0; i < list.size(); ++i) {
                    Entity target = (Entity)list.get(i);
                    entity.becomeAngryAt2(target);
                    if (this.timer < this.rate) continue;
                    this.rate = this.generateRate();
                    this.timer = 0;
                    entity.setPositionAndUpdate(target.posX, target.posY + 1.0, target.posZ);
                    entity.worldObj.playSoundAtEntity((Entity)entity, this.sound, 0.5f, entity.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                }
            }
        }
    }

    public int generateRate() {
        return this.rateMin + new Random().nextInt(this.rateMax + 1);
    }
}

