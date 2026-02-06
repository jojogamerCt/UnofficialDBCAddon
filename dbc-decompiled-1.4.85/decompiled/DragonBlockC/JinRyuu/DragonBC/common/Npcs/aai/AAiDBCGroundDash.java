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
import net.minecraft.entity.Entity;

public class AAiDBCGroundDash
extends AAi {
    private double multi;
    private double rate;
    private double multi2;
    private double limit;

    public AAiDBCGroundDash(double[] values) {
        this(values[0], values[1], values[2], values[3]);
    }

    public AAiDBCGroundDash(double multi, double rate, double multi2, double limit) {
        this.multi = multi;
        this.rate = rate;
        this.multi2 = multi2;
        this.limit = limit;
    }

    public void update() {
        EntityDBC entity = (EntityDBC)this.aaiSystem.entity;
        if (entity.isEntityAlive() && !entity.worldObj.isRemote && !entity.isLocked() && entity.getTargetedEntity() != null && entity.getTargetedEntity().isEntityAlive() && entity.getTargetedEntity().getDistanceSqToEntity((Entity)entity) < 4096.0) {
            double xzDist = entity.getXZDistanceToEntity(entity.getTargetedEntity());
            if (this.checkChanceToUse(this.rate) && !entity.chargingKiAttack && xzDist >= 6.0 && entity.onGround && !entity.isJumping()) {
                entity.motionX *= this.multi;
                entity.motionZ *= this.multi;
                double xDiff = (entity.getTargetedEntity().posX - entity.posX) / 50.0 * this.multi2;
                double zDiff = (entity.getTargetedEntity().posZ - entity.posZ) / 50.0 * this.multi2;
                entity.motionX += xDiff;
                if (this.limit != -1.0) {
                    entity.motionX = JGMathHelper.doubleLimit((double)entity.motionX, (double)this.limit);
                }
                entity.motionZ += zDiff;
                if (this.limit != -1.0) {
                    entity.motionZ = JGMathHelper.doubleLimit((double)entity.motionZ, (double)this.limit);
                }
            }
        }
    }
}

