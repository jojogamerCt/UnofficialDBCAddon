/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIWatchClosest2
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.Npcs.EntityDragon2;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityDragon
extends EntityCreature {
    public int randomSoundDelay = 0;
    private int time = 0;
    public int timeBack = 0;
    private boolean granted = false;
    protected Entity closestEntity;
    float var1 = 8.0f;
    private float maxDistanceForPlayer = 4.0f;
    private int lookTime;
    private Class watchedClass;
    private int jumpTicks = 0;

    public EntityDragon(World par1World) {
        super(par1World);
        this.experienceValue = 0;
        this.setAlwaysRenderNameTag(false);
        this.setSize(2.0f, 25.0f);
        this.width = 2.0f;
        this.height = 25.0f;
        this.boundingBox.maxX = this.boundingBox.minX + (double)this.width;
        this.boundingBox.maxZ = this.boundingBox.minZ + (double)this.width;
        this.boundingBox.maxY = this.boundingBox.minY + (double)this.height;
        this.tasks.addTask(0, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(8, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(0, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
    }

    public boolean interact(EntityPlayer par1EntityPlayer) {
        boolean var3;
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
        boolean bl = var3 = var2 != null;
        if (this.isEntityAlive()) {
            if (!this.worldObj.isRemote) {
                if (!this.granted) {
                    this.granted = true;
                    JRMCoreH.setInt((int)1, (EntityPlayer)par1EntityPlayer, (String)"jrmcWishes");
                    JRMCoreH.setInt((int)0, (EntityPlayer)par1EntityPlayer, (String)"jrmcDrgn");
                }
            } else if (!this.granted) {
                this.granted = true;
                par1EntityPlayer.openGui((Object)mod_DragonBC.instance, 2, par1EntityPlayer.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ);
            }
            if (!par1EntityPlayer.worldObj.isRemote) {
                EntityDragon2 Dragon2 = new EntityDragon2(par1EntityPlayer.worldObj);
                Dragon2.setLocationAndAngles((int)this.posX, (int)this.posY, (int)this.posZ, this.rotationYaw, 0.0f);
                Dragon2.timeBack = this.timeBack;
                par1EntityPlayer.worldObj.spawnEntityInWorld((Entity)Dragon2);
            }
            this.setDead();
            return true;
        }
        return super.interact(par1EntityPlayer);
    }

    protected void updateAITasks() {
    }

    public void shouldExecute() {
        this.closestEntity = this.worldObj.getClosestPlayerToEntity((Entity)this, (double)this.maxDistanceForPlayer);
        if (this.closestEntity != null) {
            this.watchedClass = EntityPlayer.class;
            this.getLookHelper().setLookPosition(this.closestEntity.posX, this.closestEntity.posY + 2.0, this.closestEntity.posZ, 10.0f, (float)this.getVerticalFaceSpeed());
        }
    }

    public void onUpdate() {
        float r;
        AxisAlignedBB aabb;
        List list;
        if (this.randomSoundDelay <= 0 || --this.randomSoundDelay == 0) {
            // empty if block
        }
        ++this.time;
        if (this.time == 1) {
            mod_DragonBC.logger.info("Shenron is Summoned!");
        }
        if (this.worldObj.isRemote) {
            DBCH.dragonSum((Entity)this);
        }
        if ((list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb = AxisAlignedBB.getBoundingBox((double)(this.posX - (double)(r = 30.0f)), (double)(this.posY - (double)r), (double)(this.posZ - (double)r), (double)(this.posX + (double)r), (double)(this.posY + (double)r), (double)(this.posZ + (double)r)))).size() == 0) {
            this.setDead();
        }
        super.onUpdate();
        this.shouldExecute();
    }

    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/Dragon.png";
    }

    public boolean getCanSpawnHere() {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    public void onLivingUpdate() {
        if (this.jumpTicks > 0) {
            --this.jumpTicks;
        }
        if (this.newPosRotationIncrements > 0) {
            double d0 = this.posX + (this.newPosX - this.posX) / (double)this.newPosRotationIncrements;
            double d1 = this.posY + (this.newPosY - this.posY) / (double)this.newPosRotationIncrements;
            double d2 = this.posZ + (this.newPosZ - this.posZ) / (double)this.newPosRotationIncrements;
            double d3 = MathHelper.wrapAngleTo180_double((double)(this.newRotationYaw - (double)this.rotationYaw));
            this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.newPosRotationIncrements);
            this.rotationPitch = (float)((double)this.rotationPitch + (this.newRotationPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
            --this.newPosRotationIncrements;
            this.setPosition(d0, d1, d2);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        } else if (!this.isClientWorld()) {
            this.motionX *= 0.98;
            this.motionY *= 0.98;
            this.motionZ *= 0.98;
        }
        if (Math.abs(this.motionX) < 0.005) {
            this.motionX = 0.0;
        }
        if (Math.abs(this.motionY) < 0.005) {
            this.motionY = 0.0;
        }
        if (Math.abs(this.motionZ) < 0.005) {
            this.motionZ = 0.0;
        }
        this.worldObj.theProfiler.startSection("ai");
        if (this.isMovementBlocked()) {
            this.isJumping = false;
            this.moveStrafing = 0.0f;
            this.moveForward = 0.0f;
            this.randomYawVelocity = 0.0f;
        } else if (this.isClientWorld()) {
            if (this.isAIEnabled()) {
                this.worldObj.theProfiler.startSection("newAi");
                this.updateAITasks();
                this.worldObj.theProfiler.endSection();
            } else {
                this.worldObj.theProfiler.startSection("oldAi");
                this.worldObj.theProfiler.endSection();
                this.rotationYawHead = this.rotationYaw;
            }
        }
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection("jump");
        if (this.isJumping) {
            if (!this.isInWater() && !this.handleLavaMovement()) {
                if (this.onGround && this.jumpTicks == 0) {
                    this.jump();
                    this.jumpTicks = 10;
                }
            } else {
                this.motionY += (double)0.04f;
            }
        } else {
            this.jumpTicks = 0;
        }
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection("travel");
        this.moveStrafing *= 0.98f;
        this.moveForward *= 0.98f;
        this.randomYawVelocity *= 0.9f;
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection("push");
        if (!this.worldObj.isRemote) {
            this.collideWithNearbyEntities();
        }
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection("looting");
        if (this.worldObj.isRemote || !this.canPickUpLoot() || this.dead || this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing")) {
            // empty if block
        }
        this.worldObj.theProfiler.endSection();
        EntityPlayer var2 = this.worldObj.getClosestPlayerToEntity((Entity)this, (double)this.var1);
        if (var2 != null) {
            this.closestEntity = var2;
            this.numTicksToChaseTarget = 10 + this.rand.nextInt(20);
        } else {
            this.randomYawVelocity = (this.rand.nextFloat() - 0.5f) * 20.0f;
        }
        if (this.closestEntity != null) {
            this.faceEntity(this.closestEntity, 10.0f, this.getVerticalFaceSpeed());
            if (this.numTicksToChaseTarget-- <= 0 || this.closestEntity.isDead || this.closestEntity.getDistanceSqToEntity((Entity)this) > (double)(this.var1 * this.var1)) {
                this.closestEntity = null;
            }
        }
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10000.0);
    }
}

