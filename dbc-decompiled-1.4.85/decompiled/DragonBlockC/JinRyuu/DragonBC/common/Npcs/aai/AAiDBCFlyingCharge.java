/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.entity.aai.AAi
 *  JinRyuu.JRMCore.server.JGMathHelper
 */
package JinRyuu.DragonBC.common.Npcs.aai;

import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.JRMCore.entity.aai.AAi;
import JinRyuu.JRMCore.server.JGMathHelper;

public class AAiDBCFlyingCharge
extends AAi {
    private double multi;
    private double rate;
    private double limit;

    public AAiDBCFlyingCharge(double[] values) {
        this(values[0], values[1], values[2]);
    }

    public AAiDBCFlyingCharge(double multi, double rate, double limit) {
        this.multi = multi;
        this.rate = rate;
        this.limit = limit;
    }

    public void update() {
        EntityDBC entity = (EntityDBC)this.aaiSystem.entity;
        if (entity.isEntityAlive() && !entity.worldObj.isRemote && !entity.isLocked() && !entity.chargingKiAttack && entity.getTargetedEntity() != null && entity.canEntityBeSeen(entity.getTargetedEntity()) && this.checkChanceToUse(this.rate) && entity.canFly && !entity.onGround) {
            if (JGMathHelper.doubleSmallerThan((double)entity.motionX, (double)0.5)) {
                double xDiff;
                entity.motionX = xDiff = (entity.getTargetedEntity().posX - entity.posX) / 50.0 * this.multi;
                if (this.limit != -1.0) {
                    entity.motionX = JGMathHelper.doubleLimit((double)entity.motionX, (double)this.limit);
                }
            }
            if (JGMathHelper.doubleSmallerThan((double)entity.motionZ, (double)0.5)) {
                double zDiff;
                entity.motionZ = zDiff = (entity.getTargetedEntity().posZ - entity.posZ) / 50.0 * this.multi;
                if (this.limit != -1.0) {
                    entity.motionZ = JGMathHelper.doubleLimit((double)entity.motionZ, (double)this.limit);
                }
            }
        }
    }
}

