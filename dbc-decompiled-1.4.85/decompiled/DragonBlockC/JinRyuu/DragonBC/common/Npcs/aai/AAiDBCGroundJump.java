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

public class AAiDBCGroundJump
extends AAi {
    private static final int STILL_JUMP_TIMER = 10;
    private double multi;
    private double rate;
    private double multi2;
    private double limit;
    private double limit2;
    private int stillStandingCountdown;
    private double xzDistLast;
    private double posXLast;
    private double posZLast;

    public AAiDBCGroundJump(double[] values) {
        this(values[0], values[1], values[2], values[3], values[4]);
    }

    public AAiDBCGroundJump(double multi, double rate, double multi2, double limit, double limit2) {
        this.multi = multi;
        this.rate = rate;
        this.multi2 = multi2;
        this.limit = limit;
        this.limit2 = limit2;
        this.stillStandingCountdown = 10;
        this.xzDistLast = 0.0;
        this.posXLast = 0.0;
        this.posZLast = 0.0;
    }

    public void update() {
        EntityDBC entity = (EntityDBC)this.aaiSystem.entity;
        if (entity.isEntityAlive() && !entity.worldObj.isRemote && !entity.isLocked() && entity.getTargetedEntity() != null && entity.getTargetedEntity().isEntityAlive() && entity.getTargetedEntity().getDistanceSqToEntity((Entity)entity) < 4096.0) {
            boolean attemptRandomJump;
            double xzDist = entity.getXZDistanceToEntity(entity.getTargetedEntity());
            double yDist = entity.getYDistanceToEntity(entity.getTargetedEntity());
            this.stillStandingCountdown = JGMathHelper.doubleSmallerThan((double)(xzDist - this.xzDistLast), (double)0.01) || JGMathHelper.doubleSmallerThan((double)(entity.posX - this.posXLast), (double)0.01) && JGMathHelper.doubleSmallerThan((double)(entity.posZ - this.posZLast), (double)0.01) ? --this.stillStandingCountdown : 10;
            this.xzDistLast = xzDist;
            this.posXLast = entity.posX;
            this.posZLast = entity.posZ;
            boolean bl = attemptRandomJump = entity.ticksExisted % 25 == 0 && xzDist > (double)entity.width + 2.5 ? this.checkChanceToUse(0.25) : false;
            if ((!entity.canFly || entity.getTargetedEntity().onGround || attemptRandomJump || this.isStandingStill()) && (attemptRandomJump || this.isStandingStill() || yDist > (double)(entity.height * 1.5f)) && (attemptRandomJump || this.isStandingStill() || entity.getTargetedEntity().posY - entity.posY > 0.0) && entity.onGround && !entity.isJumping() && this.checkChanceToUse(this.rate)) {
                entity.useJump();
                double jumpMulti = 1.0 + (this.isStandingStill() || attemptRandomJump ? 3.0 + yDist : yDist) / 5.0;
                entity.motionY *= jumpMulti * this.multi;
                if (this.limit2 != -1.0) {
                    entity.motionY = JGMathHelper.doubleLimit((double)entity.motionY, (double)this.limit2);
                }
                double xDiff = (entity.getTargetedEntity().posX - entity.posX) / 10.0 * this.multi2;
                double zDiff = (entity.getTargetedEntity().posZ - entity.posZ) / 10.0 * this.multi2;
                entity.motionX += xDiff;
                if (this.limit != -1.0) {
                    entity.motionX = JGMathHelper.doubleLimit((double)entity.motionX, (double)this.limit);
                }
                entity.motionZ += zDiff;
                if (this.limit != -1.0) {
                    entity.motionZ = JGMathHelper.doubleLimit((double)entity.motionZ, (double)this.limit);
                }
                this.stillStandingCountdown = 10;
            } else {
                entity.setJumping(false);
            }
        }
    }

    private boolean isStandingStill() {
        return this.stillStandingCountdown <= 0;
    }
}

