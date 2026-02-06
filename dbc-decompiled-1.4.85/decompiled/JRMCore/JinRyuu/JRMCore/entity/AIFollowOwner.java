/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.FamilyC.EntityNPC
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.FamilyC.EntityNPC;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class AIFollowOwner
extends EntityAIBase {
    private EntityNPC thePet;
    private EntityLivingBase mom;
    private EntityLivingBase dad;
    private EntityLivingBase theOwner;
    World theWorld;
    private double field_75336_f;
    private PathNavigate petPathfinder;
    private int field_75343_h;
    float maxDist;
    float minDist;
    private boolean field_75344_i;

    public AIFollowOwner(EntityNPC par1EntityTameable, double par2, float par4, float par5) {
        this.thePet = par1EntityTameable;
        this.theWorld = par1EntityTameable.worldObj;
        this.field_75336_f = par2;
        this.petPathfinder = par1EntityTameable.getNavigator();
        this.minDist = par4;
        this.maxDist = par5;
        this.setMutexBits(3);
    }

    public boolean shouldExecute() {
        EntityPlayer entitylivingbase = this.thePet.worldObj.getPlayerEntityByName(this.thePet.getDad());
        EntityPlayer mom = this.thePet.worldObj.getPlayerEntityByName(this.thePet.getMom());
        Entity flwtrgt = this.thePet.worldObj.getEntityByID(this.thePet.getFollowTarget());
        int flw = this.thePet.getFollow();
        if (flw == 2 && mom != null) {
            entitylivingbase = mom;
        }
        if (flw == 3 && flwtrgt != null && flwtrgt instanceof EntityPlayer) {
            entitylivingbase = (EntityLivingBase)flwtrgt;
        }
        if (entitylivingbase == null) {
            this.thePet.setFollow(0);
            return false;
        }
        if (this.thePet.stopMoving()) {
            return false;
        }
        if (this.thePet.getDistanceSqToEntity((Entity)entitylivingbase) < (double)(this.minDist * this.minDist)) {
            return false;
        }
        this.theOwner = entitylivingbase;
        return true;
    }

    public boolean continueExecuting() {
        return !this.petPathfinder.noPath() && this.thePet.getDistanceSqToEntity((Entity)this.theOwner) > (double)(this.maxDist * this.maxDist) && !this.thePet.stopMoving();
    }

    public void startExecuting() {
        this.field_75343_h = 0;
        this.field_75344_i = this.thePet.getNavigator().getAvoidsWater();
        this.thePet.getNavigator().setAvoidsWater(false);
    }

    public void resetTask() {
        this.theOwner = null;
        this.petPathfinder.clearPathEntity();
        this.thePet.getNavigator().setAvoidsWater(this.field_75344_i);
    }

    public void updateTask() {
        this.thePet.getLookHelper().setLookPositionWithEntity((Entity)this.theOwner, 10.0f, (float)this.thePet.getVerticalFaceSpeed());
        if (!this.thePet.stopMoving() && --this.field_75343_h <= 0) {
            this.field_75343_h = 10;
            if (!this.petPathfinder.tryMoveToEntityLiving((Entity)this.theOwner, this.field_75336_f) && !this.thePet.getLeashed() && this.thePet.getDistanceSqToEntity((Entity)this.theOwner) >= 144.0) {
                int i = MathHelper.floor_double((double)this.theOwner.posX) - 2;
                int j = MathHelper.floor_double((double)this.theOwner.posZ) - 2;
                int k = MathHelper.floor_double((double)this.theOwner.boundingBox.minY);
                for (int l = 0; l <= 4; ++l) {
                    for (int i1 = 0; i1 <= 4; ++i1) {
                        if (l >= 1 && i1 >= 1 && l <= 3 && i1 <= 3) continue;
                        if (!World.doesBlockHaveSolidTopSurface((IBlockAccess)this.theWorld, (int)(i + l), (int)(k - 1), (int)(j + i1)) || this.theWorld.isBlockNormalCubeDefault(i + l, k, j + i1, false) || this.theWorld.isBlockNormalCubeDefault(i + l, k + 1, j + i1, false)) continue;
                        this.thePet.setLocationAndAngles((double)((float)(i + l) + 0.5f), (double)k, (double)((float)(j + i1) + 0.5f), this.thePet.rotationYaw, this.thePet.rotationPitch);
                        this.petPathfinder.clearPathEntity();
                        return;
                    }
                }
            }
        }
    }
}

