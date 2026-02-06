/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.command.IEntitySelector
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.common.ForgeHooks
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.Ds;
import JinRyuu.JRMCore.JRMCEnAttacks;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.entity.EntityKiAttacksLight;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public class EntityPunch
extends EntityKiAttacksLight
implements IEntityAdditionalSpawnData,
IEntitySelector {
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    private Block inTile;
    private int inData = 0;
    private boolean inGround = false;
    public int canBePickedUp = 0;
    public int arrowShake = 0;
    public Entity shootingEntity;
    private int ticksInGround;
    private int ticksInAir = 0;
    private double damage = 0.0;
    private float size = 2.0f;
    private int knockbackStrength;
    private float explevel;
    private float prc;

    public EntityPunch(World par1World) {
        super(par1World);
        this.setSize(this.size, this.size);
    }

    public EntityPunch(World par1World, double par2, double par4, double par6) {
        super(par1World);
        this.setSize(this.size, this.size);
        this.setPosition(par2, par4, par6);
        this.yOffset = this.size / 2.0f;
    }

    public EntityPunch(World par1World, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase, float par4, float par5) {
        super(par1World);
        this.shootingEntity = par2EntityLivingBase;
        if (par2EntityLivingBase instanceof EntityPlayer) {
            this.canBePickedUp = 0;
        }
        this.posY = par2EntityLivingBase.posY + (double)par2EntityLivingBase.getEyeHeight() - (double)0.1f;
        double var6 = par3EntityLivingBase.posX - par2EntityLivingBase.posX;
        double var8 = par3EntityLivingBase.posY + (double)par3EntityLivingBase.getEyeHeight() - (double)0.7f - this.posY;
        double var10 = par3EntityLivingBase.posZ - par2EntityLivingBase.posZ;
        double var12 = MathHelper.sqrt_double((double)(var6 * var6 + var10 * var10));
        if (var12 >= 1.0E-7) {
            float var14 = (float)(Math.atan2(var10, var6) * 180.0 / Math.PI) - 90.0f;
            float var15 = (float)(-(Math.atan2(var8, var12) * 180.0 / Math.PI));
            double var16 = var6 / var12;
            double var18 = var10 / var12;
            this.setLocationAndAngles(par2EntityLivingBase.posX + var16, this.posY, par2EntityLivingBase.posZ + var18, var14, var15);
            this.yOffset = this.size / 2.0f;
            float var20 = (float)var12 * 0.2f;
            this.setThrowableHeading(var6, var8 + (double)var20, var10, par4, par5);
        }
    }

    public EntityPunch(World par1World, EntityLivingBase par2EntityLivingBase, float par3, float prc, double dam) {
        super(par1World);
        this.damage = dam;
        this.shootingEntity = par2EntityLivingBase;
        this.explevel = prc;
        this.prc = prc;
        if (par2EntityLivingBase instanceof EntityPlayer) {
            this.canBePickedUp = 0;
        }
        this.setSize(this.size, this.size);
        double d8 = par2EntityLivingBase.width;
        double d9 = par2EntityLivingBase.height;
        Vec3 vec3 = par2EntityLivingBase.getLook(1.0f);
        double x = par2EntityLivingBase.posX + vec3.xCoord * d8;
        double y = par2EntityLivingBase.posY + vec3.yCoord * d8 + (double)(par2EntityLivingBase.height * 0.55f);
        double z = par2EntityLivingBase.posZ + vec3.zCoord * d8;
        this.setLocationAndAngles(x, y, z, par2EntityLivingBase.rotationYaw, par2EntityLivingBase.rotationPitch);
        this.yOffset = this.size * 0.5f;
        this.motionX = -MathHelper.sin((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionZ = MathHelper.cos((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionY = -MathHelper.sin((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, par3 * 1.5f, 1.0f);
    }

    @Override
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
        super.onUpdate();
        if (this.ticksExisted == 1) {
            this.setSize(this.size, this.size);
            this.yOffset = this.size / 2.0f;
        }
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
        if (this.arrowShake > 0) {
            // empty if block
        }
        if (this.inGround) {
            int var19 = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
            if (block == this.inTile && var19 == this.inData) {
                ++this.ticksInGround;
                if (this.ticksInGround == 1) {
                    if (this.worldObj.isRemote || this.explevel == 2.0f) {
                        // empty if block
                    }
                    this.setDead();
                }
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
            ++this.ticksInAir;
            Vec3 var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            Vec3 var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            MovingObjectPosition var4 = this.worldObj.func_147447_a(var17, var3, false, true, false);
            var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            if (this.ticksInAir == 5) {
                this.setDead();
            }
            if (var4 != null) {
                var3 = Vec3.createVectorHelper((double)var4.hitVec.xCoord, (double)var4.hitVec.yCoord, (double)var4.hitVec.zCoord);
            }
            Entity var5 = null;
            List var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(0.5, 0.5, 0.5));
            double var7 = 0.0;
            for (int var9 = 0; var9 < var6.size(); ++var9) {
                double var14;
                AxisAlignedBB var12;
                MovingObjectPosition var13;
                Entity var10 = (Entity)var6.get(var9);
                if (!var10.canBeCollidedWith() || var10 == this.shootingEntity && this.ticksInAir < 5 || (var13 = (var12 = var10.boundingBox.expand((double)(var11 = 0.0f), (double)var11, (double)var11)).calculateIntercept(var17, var3)) == null || !((var14 = var17.distanceTo(var13.hitVec)) < var7) && var7 != 0.0) continue;
                var5 = var10;
                var7 = var14;
            }
            if (var5 != null) {
                var4 = new MovingObjectPosition(var5);
            }
            if (var4 != null) {
                if (!this.worldObj.isRemote) {
                    // empty if block
                }
                if (var4.entityHit != null && var4.entityHit instanceof EntityLivingBase && var4.entityHit != this.shootingEntity && var4.entityHit.isEntityAlive()) {
                    if (this.explevel == 2.0f) {
                        this.damage *= 2.0;
                    }
                    float var20 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ));
                    int var23 = (int)this.damage;
                    if (JRMCoreH.NC() && var4.entityHit instanceof EntityPlayer && JRMCoreH.clsTypOn((EntityPlayer)var4.entityHit) == 1 && JRMCoreH.getByte((EntityPlayer)var4.entityHit, "jrmcPwrtyp") == 2) {
                        JRMCoreH.jrmcEnergyDam(var4.entityHit, (int)(this.damage * (double)this.prc), null);
                    }
                    if (!(this.worldObj.isRemote || JRMCoreH.DBC() && !JRMCoreH.DGE(var4.entityHit) || this.shootingEntity == null)) {
                        JRMCoreH.jrmcExp(this.shootingEntity, 1);
                    }
                    DamageSource damagesource = null;
                    damagesource = this.shootingEntity == null ? Ds.causeEntityPunchDamage(this, this) : Ds.causeEntityPunchDamage(this, this.shootingEntity);
                    if (this.isBurning()) {
                        var4.entityHit.setFire(5);
                    }
                    if (var4.entityHit.attackEntityFrom(damagesource, (float)var23)) {
                        if (!this.worldObj.isRemote) {
                            this.worldObj.playSoundAtEntity((Entity)this, JRMCEnAttacks.PunchExplSound, 0.5f, 0.9f / (this.rand.nextFloat() * 0.4f + 0.8f));
                        }
                        if (var4.entityHit instanceof EntityLivingBase) {
                            float var25;
                            if (!this.worldObj.isRemote) {
                                EntityLivingBase var24 = (EntityLivingBase)var4.entityHit;
                                if (!this.worldObj.isRemote) {
                                    // empty if block
                                }
                            }
                            if (this.knockbackStrength > 0 && (var25 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionZ * this.motionZ))) > 0.0f) {
                                var4.entityHit.addVelocity(this.motionX * (double)this.knockbackStrength * (double)0.6f / (double)var25, 0.1, this.motionZ * (double)this.knockbackStrength * (double)0.6f / (double)var25);
                            }
                        }
                        this.setDead();
                    } else {
                        this.motionX *= (double)-0.1f;
                        this.motionY *= (double)-0.1f;
                        this.motionZ *= (double)-0.1f;
                        this.rotationYaw += 180.0f;
                        this.prevRotationYaw += 180.0f;
                        this.setDead();
                        this.ticksInAir = 0;
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
                    this.arrowShake = 0;
                    this.setIsCritical(false);
                    if (this.inTile.getMaterial() != Material.air) {
                        this.inTile.onEntityCollidedWithBlock(this.worldObj, this.xTile, this.yTile, this.zTile, (Entity)this);
                    }
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
            float var22 = 0.99f;
            var11 = 0.0f;
            if (this.isInWater()) {
                for (int var26 = 0; var26 < 4; ++var26) {
                    float var27 = 0.25f;
                    this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)var27, this.posY - this.motionY * (double)var27, this.posZ - this.motionZ * (double)var27, this.motionX, this.motionY, this.motionZ);
                }
                var22 = 0.8f;
            }
            this.motionX *= (double)var22;
            this.motionY *= (double)var22;
            this.motionZ *= (double)var22;
            this.motionY -= (double)var11;
            this.setPosition(this.posX, this.posY, this.posZ);
            this.doBlockCollisions();
        }
    }

    private void doBlockCollisions() {
        this.func_145775_I();
    }

    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2, EntityLivingBase e) {
        if (e.isEntityInvulnerable()) {
            return false;
        }
        if (e.worldObj.isRemote) {
            return false;
        }
        e.limbSwingAmount = 1.5f;
        boolean flag = true;
        e.prevHealth = e.getHealth();
        this.damageEntity(par1DamageSource, par2, e);
        e.attackedAtYaw = 0.0f;
        Entity entity = par1DamageSource.getEntity();
        if (entity != null && entity instanceof EntityLivingBase) {
            e.setRevengeTarget((EntityLivingBase)entity);
        }
        if (flag) {
            e.worldObj.setEntityState((Entity)this, (byte)2);
            if (entity != null) {
                double d0 = entity.posX - e.posX;
                double d1 = entity.posZ - e.posZ;
                while (d0 * d0 + d1 * d1 < 1.0E-4) {
                    d0 = (Math.random() - Math.random()) * 0.01;
                    d1 = (Math.random() - Math.random()) * 0.01;
                }
                e.attackedAtYaw = (float)(Math.atan2(d1, d0) * 180.0 / Math.PI) - e.rotationYaw;
                e.knockBack(entity, par2, d0, d1);
            } else {
                e.attackedAtYaw = (int)(Math.random() * 2.0) * 180;
            }
        }
        if (e.getHealth() <= 0.0f) {
            if (flag) {
                // empty if block
            }
            e.onDeath(par1DamageSource);
        } else if (flag) {
            // empty if block
        }
        return true;
    }

    protected void damageEntity(DamageSource par1DamageSource, float par2, EntityLivingBase e) {
        if (!this.isEntityInvulnerable()) {
            if ((par2 = ForgeHooks.onLivingHurt((EntityLivingBase)e, (DamageSource)par1DamageSource, (float)par2)) <= 0.0f) {
                return;
            }
            par2 = this.applyArmorCalculations(par1DamageSource, par2, e);
            float f1 = par2 = this.applyPotionDamageCalculations(par1DamageSource, par2, e);
            par2 = Math.max(par2 - e.getAbsorptionAmount(), 0.0f);
            e.setAbsorptionAmount(e.getAbsorptionAmount() - (f1 - par2));
            if (par2 != 0.0f) {
                float f2 = e.getHealth();
                e.setHealth(f2 - par2);
                e.func_110142_aN().func_94547_a(par1DamageSource, f2, par2);
                e.setAbsorptionAmount(e.getAbsorptionAmount() - par2);
            }
        }
    }

    protected float applyArmorCalculations(DamageSource par1DamageSource, float par2, EntityLivingBase e) {
        if (!par1DamageSource.isUnblockable()) {
            int i = 25 - e.getTotalArmorValue();
            float f1 = par2 * (float)i;
            this.damageArmor(par2, e);
            par2 = f1 / 25.0f;
        }
        return par2;
    }

    protected void damageArmor(float par1, EntityLivingBase e) {
        if (e instanceof EntityPlayer) {
            ((EntityPlayer)e).inventory.damageArmor(par1);
        }
    }

    protected float applyPotionDamageCalculations(DamageSource par1DamageSource, float par2, EntityLivingBase e) {
        if (e.isPotionActive(Potion.resistance) && par1DamageSource != DamageSource.outOfWorld) {
            int i = (e.getActivePotionEffect(Potion.resistance).getAmplifier() + 1) * 5;
            int j = 25 - i;
            float f1 = par2 * (float)j;
            par2 = f1 / 25.0f;
        }
        if (par2 <= 0.0f) {
            return 0.0f;
        }
        return par2;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        par1NBTTagCompound.setShort("xTile", (short)this.xTile);
        par1NBTTagCompound.setShort("yTile", (short)this.yTile);
        par1NBTTagCompound.setShort("zTile", (short)this.zTile);
        par1NBTTagCompound.setByte("inTile", (byte)Block.getIdFromBlock((Block)this.inTile));
        par1NBTTagCompound.setByte("inData", (byte)this.inData);
        par1NBTTagCompound.setByte("shake", (byte)this.arrowShake);
        par1NBTTagCompound.setByte("inGround", (byte)(this.inGround ? 1 : 0));
        par1NBTTagCompound.setByte("pickup", (byte)this.canBePickedUp);
        par1NBTTagCompound.setDouble("damage", this.damage);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
        this.xTile = par1NBTTagCompound.getShort("xTile");
        this.yTile = par1NBTTagCompound.getShort("yTile");
        this.zTile = par1NBTTagCompound.getShort("zTile");
        this.inTile = Block.getBlockById((int)(par1NBTTagCompound.getByte("inTile") & 0xFF));
        this.inData = par1NBTTagCompound.getByte("inData") & 0xFF;
        this.arrowShake = par1NBTTagCompound.getByte("shake") & 0xFF;
        boolean bl = this.inGround = par1NBTTagCompound.getByte("inGround") == 1;
        if (par1NBTTagCompound.hasKey("damage")) {
            this.damage = par1NBTTagCompound.getDouble("damage");
        }
        if (par1NBTTagCompound.hasKey("pickup")) {
            this.canBePickedUp = par1NBTTagCompound.getByte("pickup");
        } else if (par1NBTTagCompound.hasKey("player")) {
            this.canBePickedUp = par1NBTTagCompound.getBoolean("player") ? 1 : 0;
        }
    }

    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) {
        if (this.worldObj.isRemote || this.inGround) {
            // empty if block
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

    public boolean isEntityApplicable(Entity var1) {
        return false;
    }

    public void writeSpawnData(ByteBuf data) {
        data.writeInt(this.shootingEntity == null ? 0 : this.shootingEntity.getEntityId());
        data.writeDouble(this.damage);
        data.writeFloat(this.size);
    }

    public void readSpawnData(ByteBuf data) {
        int first = data.readInt();
        this.damage = data.readDouble();
        this.size = data.readFloat();
        this.shootingEntity = first == 0 ? this.shootingEntity : this.worldObj.getEntityByID(first);
    }
}

