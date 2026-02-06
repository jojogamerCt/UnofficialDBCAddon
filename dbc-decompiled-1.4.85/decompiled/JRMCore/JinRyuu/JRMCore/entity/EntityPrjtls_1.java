/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.DBCConfig
 *  JinRyuu.DragonBC.common.Npcs.EntityRRMecha
 *  JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbon
 *  JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbon2
 *  JinRyuu.DragonBC.common.mod_DragonBC
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IProjectile
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.projectile.EntityArrow
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.EntityRRMecha;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbon;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbon2;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.entity.EntityCusPars;
import JinRyuu.JRMCore.mod_JRMCore;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EntityPrjtls_1
extends EntityArrow
implements IEntityAdditionalSpawnData,
IProjectile {
    public static final int MECHA_ROCKET1 = 0;
    public static final int MECHA_ROCKET2 = 1;
    public static final int MECHA_ROCKET3 = 2;
    public static final int GUN_SHOT1 = 3;
    public static final int GUN_SHOT2 = 4;
    public static final int BAZOOKA = 5;
    public static final int GUN_MAJOR = 6;
    public int[] damages = null;
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    private Block inTile;
    private int inData = 0;
    private boolean inGround = false;
    public Entity shootingEntity;
    private int ticksInGround;
    private int ticksInAir = 0;
    public double damage = 0.0;
    private int knockbackStrength;
    private float explevel;
    public int wpnTyp = -1;

    public int getTicksInGround() {
        return this.ticksInGround;
    }

    public int getWpnTyp() {
        return this.wpnTyp;
    }

    public EntityPrjtls_1(World world) {
        super(world);
        this.setSize(0.5f, 0.5f);
    }

    public EntityPrjtls_1(World world, double par2, double par4, double par6) {
        super(world);
        this.setSize(0.5f, 0.5f);
        this.setPosition(par2, par4, par6);
        this.yOffset = 0.0f;
    }

    public EntityPrjtls_1(World world, Entity shootingEntity, Entity target, float par4, float par5, int id) {
        super(world);
        this.setSize(0.5f, 0.5f);
        this.wpnTyp = id;
        this.shootingEntity = shootingEntity;
        this.canBePickedUp = 0;
        this.posY = shootingEntity.posY + (double)shootingEntity.getEyeHeight() - (double)0.1f - 1.0;
        double var6 = target.posX - shootingEntity.posX;
        double var8 = target.posY + (double)target.getEyeHeight() - (double)0.7f - this.posY;
        double var10 = target.posZ - shootingEntity.posZ;
        double var12 = (double)MathHelper.sqrt_double((double)(var6 * var6 + var10 * var10)) * (shootingEntity instanceof EntityRRMecha ? 1.0 : 2.0);
        if (var12 >= 1.0E-7) {
            float var14 = (float)(Math.atan2(var10, var6) * 180.0 / Math.PI) - 90.0f;
            float var15 = (float)(-(Math.atan2(var8, var12) * 180.0 / Math.PI));
            double var16 = var6 / var12;
            double var18 = var10 / var12;
            this.setLocationAndAngles(shootingEntity.posX + var16, this.posY, shootingEntity.posZ + var18, var14, var15);
            this.yOffset = 0.0f;
            float var20 = (float)var12 * 0.2f;
            this.setThrowableHeading(var6, var8, var10, par4, par5);
        }
        if (this.damages == null) {
            this.damages = new int[]{DBCConfig.NPC_RRMech1_Dam, DBCConfig.NPC_RRMech2_Dam, DBCConfig.NPC_RRMech3_Dam, DBCConfig.RRSoldierDAM, DBCConfig.RRSoldier2DAM, DBCConfig.RRSoldier3DAM, DBCConfig.RRMajorDAM};
        }
        this.damage = this.damages[id] / 2;
    }

    public EntityPrjtls_1(World world, EntityLivingBase shootingEntity, EntityLivingBase target, float par4, float par5) {
        super(world);
        this.shootingEntity = shootingEntity;
        this.canBePickedUp = 0;
        this.posY = shootingEntity.posY + (double)shootingEntity.getEyeHeight() - (double)0.1f;
        double var6 = target.posX - shootingEntity.posX;
        double var8 = target.posY + (double)target.getEyeHeight() - (double)0.7f - this.posY;
        double var10 = target.posZ - shootingEntity.posZ;
        double var12 = MathHelper.sqrt_double((double)(var6 * var6 + var10 * var10));
        if (var12 >= 1.0E-7) {
            float var14 = (float)(Math.atan2(var10, var6) * 180.0 / Math.PI) - 90.0f;
            float var15 = (float)(-(Math.atan2(var8, var12) * 180.0 / Math.PI));
            double var16 = var6 / var12;
            double var18 = var10 / var12;
            this.setLocationAndAngles(shootingEntity.posX + var16, this.posY, shootingEntity.posZ + var18, var14, var15);
            this.yOffset = 0.0f;
            float var20 = (float)var12 * 0.2f;
            this.setThrowableHeading(var6, var8 + (double)var20, var10, par4, par5);
        }
    }

    protected void entityInit() {
        this.dataWatcher.addObject(16, (Object)0);
    }

    public void setThrowableHeading(double par1, double par3, double par5, float par7, float par8) {
        float var9 = MathHelper.sqrt_double((double)(par1 * par1 + par3 * par3 + par5 * par5));
        par1 /= (double)var9;
        par3 /= (double)var9;
        par5 /= (double)var9;
        par1 += this.rand.nextGaussian() * (double)0.0075f * (double)par8;
        par3 += this.rand.nextGaussian() * (double)0.0075f * (double)par8;
        par5 += this.rand.nextGaussian() * (double)0.0075f * (double)par8;
        this.motionX = par1 *= (double)par7;
        this.motionY = par3 *= (double)par7;
        this.motionZ = par5 *= (double)par7;
        float var10 = MathHelper.sqrt_double((double)(par1 * par1 + par5 * par5));
        this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(par1, par5) * 180.0 / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(par3, var10) * 180.0 / Math.PI);
        this.ticksInGround = 0;
    }

    @SideOnly(value=Side.CLIENT)
    public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
        this.setPosition(par1, par3, par5);
        this.setRotation(par7, par8);
    }

    @SideOnly(value=Side.CLIENT)
    public void setVelocity(double par1, double par3, double par5) {
        this.motionX = par1;
        this.motionY = par3;
        this.motionZ = par5;
        if (this.prevRotationPitch == 0.0f && this.prevRotationYaw == 0.0f) {
            float var7 = MathHelper.sqrt_double((double)(par1 * par1 + par5 * par5));
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(par1, par5) * 180.0 / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(par3, var7) * 180.0 / Math.PI);
            this.prevRotationPitch = this.rotationPitch;
            this.prevRotationYaw = this.rotationYaw;
            this.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.ticksInGround = 0;
        }
    }

    public void onUpdate() {
        Block block;
        boolean isRocket;
        if (this.ticksExisted >= 400) {
            this.setDead();
        }
        boolean bl = isRocket = this.wpnTyp != 3 && this.wpnTyp != 4 && this.wpnTyp != 6;
        if (isRocket && !this.worldObj.isRemote && (this.ticksExisted == 1 || this.ticksExisted % 5 == 0)) {
            this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC4.rocket_travel", 0.3f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
        }
        if (this.worldObj.isRemote) {
            float sizeMulti = isRocket ? 1.0f : 0.5f;
            for (int i = 0; i < (isRocket ? 5 : 2); ++i) {
                mod_JRMCore.proxy.func_gcp((Entity)this, EntityCusPars.PART5, Math.random() * 0.5 - 0.25, 0.0 - (double)(this.height / 2.0f), Math.random() * 0.5 - 0.25, Math.random() * 0.05 - 0.025, Math.random() * 0.1 + 0.05, Math.random() * 0.05 - 0.025, 0.05f * sizeMulti, 0.05f * sizeMulti, 0.05f * sizeMulti);
            }
        }
        this.onEntityUpdate();
        if (this.prevRotationPitch == 0.0f && this.prevRotationYaw == 0.0f) {
            float var1 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionZ * this.motionZ));
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0 / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(this.motionY, var1) * 180.0 / Math.PI);
        }
        if ((block = this.worldObj.getBlock(this.xTile, this.yTile, this.zTile)).getMaterial() != Material.air) {
            block.setBlockBoundsBasedOnState((IBlockAccess)this.worldObj, this.xTile, this.yTile, this.zTile);
            AxisAlignedBB axisalignedbb = block.getCollisionBoundingBoxFromPool(this.worldObj, this.xTile, this.yTile, this.zTile);
            if (axisalignedbb != null && axisalignedbb.isVecInside(Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ))) {
                this.inGround = true;
            }
        }
        if (this.inGround) {
            if (isRocket) {
                JRMCoreH.newExpl(this.worldObj, (Entity)this, this.posX, this.posY, this.posZ, this.explevel, false, this.damage, this.shootingEntity, (byte)5);
            }
            this.setDead();
            int var19 = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
            if (block == this.inTile && var19 == this.inData) {
                ++this.ticksInGround;
            } else {
                this.inGround = false;
                this.motionX *= (double)(this.rand.nextFloat() * 0.2f);
                this.motionY *= (double)(this.rand.nextFloat() * 0.2f);
                this.motionZ *= (double)(this.rand.nextFloat() * 0.2f);
                this.ticksInGround = 0;
                this.ticksInAir = 0;
            }
        } else {
            float var11;
            int var9;
            ++this.ticksInAir;
            Vec3 var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            Vec3 var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            MovingObjectPosition var4 = this.worldObj.func_147447_a(var17, var3, false, true, false);
            var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            if (var4 != null) {
                var3 = Vec3.createVectorHelper((double)var4.hitVec.xCoord, (double)var4.hitVec.yCoord, (double)var4.hitVec.zCoord);
            }
            if (!this.worldObj.isRemote) {
                Entity var5 = null;
                List var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0, 1.0, 1.0));
                double var7 = 0.0;
                for (var9 = 0; var9 < var6.size(); ++var9) {
                    double var14;
                    AxisAlignedBB var12;
                    MovingObjectPosition var13;
                    Entity var10 = (Entity)var6.get(var9);
                    if (!var10.canBeCollidedWith() || var10 == this.shootingEntity && this.ticksInAir < 5 || (var13 = (var12 = var10.boundingBox.expand((double)(var11 = 0.3f), (double)var11, (double)var11)).calculateIntercept(var17, var3)) == null || !this.isNotRedRibbon(var10) || !((var14 = var17.distanceTo(var13.hitVec)) < var7) && var7 != 0.0) continue;
                    var5 = var10;
                    var7 = var14;
                }
                if (var5 != null) {
                    var4 = new MovingObjectPosition(var5);
                }
            }
            if (var4 != null) {
                if (var4.entityHit != null && this.isNotRedRibbon(var4.entityHit)) {
                    float var20 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ));
                    int var23 = MathHelper.ceiling_double_int((double)((double)var20 * this.damage));
                    if (this.getIsCritical()) {
                        var23 += this.rand.nextInt(var23 / 2 + 2);
                    }
                    DamageSource damagesource = null;
                    damagesource = this.shootingEntity == null ? mod_DragonBC.causePrjctlsDamage((EntityPrjtls_1)this, (Entity)this) : mod_DragonBC.causePrjctlsDamage((EntityPrjtls_1)this, (Entity)this.shootingEntity);
                    if (this.isBurning()) {
                        var4.entityHit.setFire(5);
                    }
                    if (var4.entityHit.attackEntityFrom(damagesource, (float)var23)) {
                        float var25;
                        if (var4.entityHit instanceof EntityLivingBase && this.knockbackStrength > 0 && (var25 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionZ * this.motionZ))) > 0.0f) {
                            var4.entityHit.addVelocity(this.motionX * (double)this.knockbackStrength * (double)0.6f / (double)var25, 0.1, this.motionZ * (double)this.knockbackStrength * (double)0.6f / (double)var25);
                        }
                        if (isRocket) {
                            JRMCoreH.newExpl(this.worldObj, (Entity)this, this.posX, this.posY, this.posZ, this.explevel, false, this.damage, this.shootingEntity, (byte)5);
                        }
                        this.setDead();
                    }
                } else {
                    this.xTile = var4.blockX;
                    this.yTile = var4.blockY;
                    this.zTile = var4.blockZ;
                    this.inTile = this.worldObj.getBlock(this.xTile, this.yTile, this.zTile);
                    this.inData = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
                    this.motionX = (float)(var4.hitVec.xCoord - this.posX);
                    this.motionY = (float)(var4.hitVec.yCoord - this.posY);
                    this.motionZ = (float)(var4.hitVec.zCoord - this.posZ);
                    float var20 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ));
                    this.posX -= this.motionX / (double)var20 * (double)0.05f;
                    this.posY -= this.motionY / (double)var20 * (double)0.05f;
                    this.posZ -= this.motionZ / (double)var20 * (double)0.05f;
                    this.inGround = true;
                    this.setIsCritical(false);
                    if (this.inTile.getMaterial() != Material.air) {
                        this.inTile.onEntityCollidedWithBlock(this.worldObj, this.xTile, this.yTile, this.zTile, (Entity)this);
                    }
                }
            }
            if (this.getIsCritical()) {
                for (var9 = 0; var9 < 4; ++var9) {
                    this.worldObj.spawnParticle("crit", this.posX + this.motionX * (double)var9 / 4.0, this.posY + this.motionY * (double)var9 / 4.0, this.posZ + this.motionZ * (double)var9 / 4.0, -this.motionX, -this.motionY + 0.2, -this.motionZ);
                }
            }
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            float var20 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionZ * this.motionZ));
            this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0 / Math.PI);
            this.rotationPitch = (float)(Math.atan2(this.motionY, var20) * 180.0 / Math.PI);
            while (this.rotationPitch - this.prevRotationPitch < -180.0f) {
                this.prevRotationPitch -= 360.0f;
            }
            while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
                this.prevRotationPitch += 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
                this.prevRotationYaw -= 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
                this.prevRotationYaw += 360.0f;
            }
            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
            float var22 = 0.99f;
            var11 = 0.05f;
            if (this.isInWater()) {
                for (int var26 = 0; var26 < 4; ++var26) {
                    float var27 = 0.25f;
                    this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)var27, this.posY - this.motionY * (double)var27, this.posZ - this.motionZ * (double)var27, this.motionX, this.motionY, this.motionZ);
                }
                var22 = 0.8f;
            }
            this.setPosition(this.posX, this.posY, this.posZ);
            this.doBlockCollisions();
        }
    }

    private boolean isNotRedRibbon(Entity entity) {
        return !(entity instanceof EntityRRMecha) && !(entity instanceof EntityRedRibbon) && !(entity instanceof EntityRedRibbon2);
    }

    private void doBlockCollisions() {
        this.func_145775_I();
    }

    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        par1NBTTagCompound.setShort("xTile", (short)this.xTile);
        par1NBTTagCompound.setShort("yTile", (short)this.yTile);
        par1NBTTagCompound.setShort("zTile", (short)this.zTile);
        par1NBTTagCompound.setByte("inTile", (byte)Block.getIdFromBlock((Block)this.inTile));
        par1NBTTagCompound.setByte("inData", (byte)this.inData);
        par1NBTTagCompound.setByte("inGround", (byte)(this.inGround ? 1 : 0));
        par1NBTTagCompound.setDouble("damage", this.damage);
        par1NBTTagCompound.setInteger("wpnTyp", this.wpnTyp);
    }

    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
        this.xTile = par1NBTTagCompound.getShort("xTile");
        this.yTile = par1NBTTagCompound.getShort("yTile");
        this.zTile = par1NBTTagCompound.getShort("zTile");
        this.inTile = Block.getBlockById((int)(par1NBTTagCompound.getByte("inTile") & 0xFF));
        this.inData = par1NBTTagCompound.getByte("inData") & 0xFF;
        boolean bl = this.inGround = par1NBTTagCompound.getByte("inGround") == 1;
        if (par1NBTTagCompound.hasKey("damage")) {
            this.damage = par1NBTTagCompound.getDouble("damage");
        }
        this.wpnTyp = par1NBTTagCompound.getInteger("wpnTyp");
    }

    public void writeSpawnData(ByteBuf data) {
        data.writeInt(this.shootingEntity == null ? 0 : this.shootingEntity.getEntityId());
        data.writeDouble((double)((int)this.damage));
        data.writeInt(this.wpnTyp);
    }

    public void readSpawnData(ByteBuf data) {
        int first = data.readInt();
        this.shootingEntity = first == 0 ? this.shootingEntity : this.worldObj.getEntityByID(first);
        this.damage = data.readDouble();
        this.wpnTyp = data.readInt();
    }

    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) {
        if (!this.worldObj.isRemote && this.inGround) {
            this.setDead();
        }
    }

    protected boolean canTriggerWalking() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public float getShadowSize() {
        return 0.0f;
    }

    public void setDamage(double par1) {
        this.damage = par1;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setKnockbackStrength(int par1) {
        this.knockbackStrength = par1;
    }

    public boolean canAttackWithItem() {
        return false;
    }

    public void setIsCritical(boolean par1) {
        byte var2 = this.dataWatcher.getWatchableObjectByte(16);
        if (par1) {
            this.dataWatcher.updateObject(16, (Object)((byte)(var2 | 1)));
        } else {
            this.dataWatcher.updateObject(16, (Object)((byte)(var2 & 0xFFFFFFFE)));
        }
    }

    public boolean getIsCritical() {
        byte var1 = this.dataWatcher.getWatchableObjectByte(16);
        return (var1 & 1) != 0;
    }

    private void explode() {
        float var1 = 2.0f;
        this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, var1, this.inGround);
    }

    protected void onImpact(MovingObjectPosition var4) {
    }
}

