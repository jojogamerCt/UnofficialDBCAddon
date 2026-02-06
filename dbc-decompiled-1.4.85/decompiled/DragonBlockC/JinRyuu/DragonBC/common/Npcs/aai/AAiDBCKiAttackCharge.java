/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.entity.aai.AAi
 *  JinRyuu.JRMCore.server.JGMathHelper
 *  net.minecraft.entity.Entity
 */
package JinRyuu.DragonBC.common.Npcs.aai;

import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.JRMCore.entity.aai.AAi;
import JinRyuu.JRMCore.server.JGMathHelper;
import java.util.Random;
import net.minecraft.entity.Entity;

public class AAiDBCKiAttackCharge
extends AAi {
    private double multi;
    private double rate;
    private double limit;

    public AAiDBCKiAttackCharge(double[] values) {
        this(values[0], values[1], values[2]);
    }

    public AAiDBCKiAttackCharge(double multi, double rate, double limit) {
        this.multi = multi;
        this.rate = rate;
        this.limit = limit;
    }

    public void update() {
        EntityDBC entity = (EntityDBC)this.aaiSystem.entity;
        if (entity.isEntityAlive() && entity.canFireKiAttacks && !entity.isLocked() && !entity.worldObj.isRemote && entity.getTargetedEntity() != null && entity.getTargetedEntity().isEntityAlive() && entity.getTargetedEntity().getDistanceSqToEntity((Entity)entity) < 4096.0) {
            int chargeTimerMax = 25;
            int KI_ATTACK_DISTANCE = 10;
            double xzDist = entity.getXZDistanceToEntity(entity.getTargetedEntity());
            double yDist = entity.getYDistanceToEntity(entity.getTargetedEntity());
            if (!entity.chargingKiAttack && entity.ticksExisted % 25 == 0 && this.checkChanceToUse(this.rate)) {
                entity.chargingKiAttack = true;
                entity.chargingKiAttackTimer = 0;
                entity.chargingKiAttackTimerMax = (byte)(35 + new Random().nextInt(25));
            }
            if (entity.chargingKiAttack) {
                ++entity.chargingKiAttackTimer;
                if (entity.chargingKiAttackTimer >= entity.chargingKiAttackTimerMax) {
                    entity.chargingKiAttack = false;
                    entity.chargingKiAttackTimer = 0;
                }
                if (xzDist < 10.0) {
                    double xDiff = (entity.getTargetedEntity().posX - entity.posX) / 10.0 * this.multi;
                    double zDiff = (entity.getTargetedEntity().posZ - entity.posZ) / 10.0 * this.multi;
                    entity.motionX = -xDiff;
                    entity.motionX = JGMathHelper.doubleLimit((double)entity.motionX, (double)this.limit);
                    entity.motionZ = -zDiff;
                    entity.motionZ = JGMathHelper.doubleLimit((double)entity.motionZ, (double)this.limit);
                }
            }
        }
    }
}

