/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityOwnable
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.attributes.IAttributeInstance
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.pathfinding.PathEntity
 *  net.minecraft.pathfinding.PathPoint
 *  net.minecraft.util.MathHelper
 *  org.apache.commons.lang3.StringUtils
 */
package JinRyuu.JRMCore.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityOwnable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.MathHelper;
import org.apache.commons.lang3.StringUtils;

public abstract class AITarget
extends EntityAIBase {
    protected EntityCreature taskOwner;
    protected boolean shouldCheckSight;
    private boolean nearbyOnly;
    private int targetSearchStatus;
    private int targetSearchDelay;
    private int field_75298_g;

    public AITarget(EntityCreature par1EntityCreature, boolean par2) {
        this(par1EntityCreature, par2, false);
    }

    public AITarget(EntityCreature par1EntityCreature, boolean par2, boolean par3) {
        this.taskOwner = par1EntityCreature;
        this.shouldCheckSight = par2;
        this.nearbyOnly = par3;
    }

    public boolean continueExecuting() {
        EntityLivingBase entitylivingbase = this.taskOwner.getAttackTarget();
        if (entitylivingbase == null) {
            return false;
        }
        if (!entitylivingbase.isEntityAlive()) {
            return false;
        }
        double d0 = this.getTargetDistance();
        if (this.taskOwner.getDistanceSqToEntity((Entity)entitylivingbase) > d0 * d0) {
            return false;
        }
        if (this.shouldCheckSight) {
            if (this.taskOwner.getEntitySenses().canSee((Entity)entitylivingbase)) {
                this.field_75298_g = 0;
            } else if (++this.field_75298_g > 60) {
                return false;
            }
        }
        return true;
    }

    protected double getTargetDistance() {
        IAttributeInstance attributeinstance = this.taskOwner.getEntityAttribute(SharedMonsterAttributes.followRange);
        return attributeinstance == null ? 16.0 : attributeinstance.getAttributeValue();
    }

    public void startExecuting() {
        this.targetSearchStatus = 0;
        this.targetSearchDelay = 0;
        this.field_75298_g = 0;
    }

    public void resetTask() {
        this.taskOwner.setAttackTarget((EntityLivingBase)null);
    }

    protected boolean isSuitableTarget(EntityLivingBase par1EntityLivingBase, boolean par2) {
        if (par1EntityLivingBase == null) {
            return false;
        }
        if (par1EntityLivingBase == this.taskOwner) {
            return false;
        }
        if (!par1EntityLivingBase.isEntityAlive()) {
            return false;
        }
        if (!this.taskOwner.canAttackClass(par1EntityLivingBase.getClass())) {
            return false;
        }
        if (this.taskOwner instanceof IEntityOwnable && StringUtils.isNotEmpty((CharSequence)((IEntityOwnable)this.taskOwner).func_152113_b())) {
            if (par1EntityLivingBase instanceof IEntityOwnable && ((IEntityOwnable)this.taskOwner).func_152113_b().equals(((IEntityOwnable)par1EntityLivingBase).func_152113_b())) {
                return false;
            }
            if (par1EntityLivingBase == ((IEntityOwnable)this.taskOwner).getOwner()) {
                return false;
            }
        } else if (par1EntityLivingBase instanceof EntityPlayer && !par2 && ((EntityPlayer)par1EntityLivingBase).capabilities.disableDamage) {
            return false;
        }
        if (!this.taskOwner.isWithinHomeDistance(MathHelper.floor_double((double)par1EntityLivingBase.posX), MathHelper.floor_double((double)par1EntityLivingBase.posY), MathHelper.floor_double((double)par1EntityLivingBase.posZ))) {
            return false;
        }
        if (this.shouldCheckSight && !this.taskOwner.getEntitySenses().canSee((Entity)par1EntityLivingBase)) {
            return false;
        }
        if (this.nearbyOnly) {
            if (--this.targetSearchDelay <= 0) {
                this.targetSearchStatus = 0;
            }
            if (this.targetSearchStatus == 0) {
                int n = this.targetSearchStatus = this.canEasilyReach(par1EntityLivingBase) ? 1 : 2;
            }
            if (this.targetSearchStatus == 2) {
                return false;
            }
        }
        return true;
    }

    private boolean canEasilyReach(EntityLivingBase par1EntityLivingBase) {
        int j;
        this.targetSearchDelay = 10 + this.taskOwner.getRNG().nextInt(5);
        PathEntity pathentity = this.taskOwner.getNavigator().getPathToEntityLiving((Entity)par1EntityLivingBase);
        if (pathentity == null) {
            return false;
        }
        PathPoint pathpoint = pathentity.getFinalPathPoint();
        if (pathpoint == null) {
            return false;
        }
        int i = pathpoint.xCoord - MathHelper.floor_double((double)par1EntityLivingBase.posX);
        return (double)(i * i + (j = pathpoint.zCoord - MathHelper.floor_double((double)par1EntityLivingBase.posZ)) * j) <= 2.25;
    }
}

