/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings
 *  JinRyuu.JRMCore.entity.EntityCusPar
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Render.KintounBaseEntity;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntityCusPar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class KintounBlackEntity
extends KintounBaseEntity {
    private boolean isBoatEmpty = true;
    private double speedMultiplier = 0.08;
    private int boatPosRotationIncrements;
    private double boatX;
    private double boatY;
    private double boatZ;
    private double boatYaw;
    private double boatPitch;
    @SideOnly(value=Side.CLIENT)
    private double velocityX;
    @SideOnly(value=Side.CLIENT)
    private double velocityY;
    @SideOnly(value=Side.CLIENT)
    private double velocityZ;
    public String texture;
    private int dropcounter;
    private float dS;
    private float T = 0.05f;

    public KintounBlackEntity(World par1World) {
        super(par1World);
        this.preventEntitySpawning = true;
        this.setSize(1.5f, 1.5f);
        this.yOffset = this.height / 2.0f;
        this.setCloudColor(0x333333);
    }

    protected boolean canTriggerWalking() {
        return false;
    }

    @Override
    protected void entityInit() {
        this.dataWatcher.addObject(17, (Object)new Integer(0));
        this.dataWatcher.addObject(18, (Object)new Integer(1));
        this.dataWatcher.addObject(19, (Object)new Float(0.0f));
    }

    public AxisAlignedBB getCollisionBox(Entity par1Entity) {
        return par1Entity.boundingBox;
    }

    public AxisAlignedBB getBoundingBox() {
        return this.boundingBox;
    }

    public boolean canBePushed() {
        return true;
    }

    public KintounBlackEntity(World par1World, double par2, double par4, double par6) {
        this(par1World);
        this.setPosition(par2, par4 + (double)this.yOffset, par6);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.prevPosX = par2;
        this.prevPosY = par4;
        this.prevPosZ = par6;
    }

    public double getMountedYOffset() {
        return (double)this.height * 0.0 - (double)0.3f;
    }

    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
        if (this.isEntityInvulnerable()) {
            return false;
        }
        if (!this.worldObj.isRemote && !this.isDead) {
            boolean flag;
            this.setTimeSinceHit(10);
            this.setDamageTaken(this.getDamageTaken() + par2 * 10.0f);
            this.setBeenAttacked();
            boolean bl = flag = par1DamageSource.getEntity() instanceof EntityPlayer && ((EntityPlayer)par1DamageSource.getEntity()).capabilities.isCreativeMode;
            if (flag || this.getDamageTaken() > 1.0f) {
                if (this.riddenByEntity != null) {
                    this.riddenByEntity.mountEntity((Entity)this);
                }
                this.func_145778_a(ItemsDBC.KintounBlackItem, 1, 0.0f);
                if (!flag) {
                    // empty if block
                }
                this.setDead();
            }
            return true;
        }
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public void performHurtAnimation() {
        this.setTimeSinceHit(10);
        this.setDamageTaken(this.getDamageTaken() * 11.0f);
    }

    public boolean canBeCollidedWith() {
        return !this.isDead;
    }

    @SideOnly(value=Side.CLIENT)
    public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
        if (this.isBoatEmpty) {
            this.boatPosRotationIncrements = par9 + 5;
        } else {
            double d3 = par1 - this.posX;
            double d4 = par3 - this.posY;
            double d5 = par5 - this.posZ;
            double d6 = d3 * d3 + d4 * d4 + d5 * d5;
            if (d6 <= 1.0) {
                return;
            }
            this.boatPosRotationIncrements = 3;
        }
        this.boatX = par1;
        this.boatY = par3;
        this.boatZ = par5;
        this.boatYaw = par7;
        this.boatPitch = par8;
        this.motionX = this.velocityX;
        this.motionY = this.velocityY;
        this.motionZ = this.velocityZ;
    }

    @SideOnly(value=Side.CLIENT)
    public void setVelocity(double par1, double par3, double par5) {
        this.velocityX = this.motionX = par1;
        this.velocityY = this.motionY = par3;
        this.velocityZ = this.motionZ = par5;
    }

    public void onUpdate() {
        double d5;
        double d4;
        super.onUpdate();
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA11) {
            for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                if (this.motionX == 0.0 && this.motionZ == 0.0) continue;
                KintounBlackEntity pl = this;
                double x = 0.0;
                double y = -1.2f;
                double z = 0.0;
                EntityCusPar entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 1.0f, 1.0f, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0, 0.0, 0.0, 0.0f, 10, 11, 1, 32, false, 0.0f, false, 0.0f, 1, "", 15, 2, 0.05f, 0.001f, -0.0045f, 0, 27.0f, 66.0f, 142.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 1.0f, 0.0f, 0.0f, 0.0f, -0.001f, false, -1, false, null);
                entity.worldObj.spawnEntityInWorld((Entity)entity);
            }
        }
        if (this.getTimeSinceHit() > 0) {
            this.setTimeSinceHit(this.getTimeSinceHit() - 1);
        }
        if (this.getDamageTaken() > 0.0f) {
            this.setDamageTaken(this.getDamageTaken() - 1.0f);
        }
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        int b0 = 5;
        double d0 = 0.0;
        for (int i = 0; i < b0; ++i) {
            double d1 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (double)(i + 0) / (double)b0 - 0.125;
            double d2 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (double)(i + 1) / (double)b0 - 0.125;
            AxisAlignedBB axisAlignedBB = AxisAlignedBB.getBoundingBox((double)this.boundingBox.minX, (double)d1, (double)this.boundingBox.minZ, (double)this.boundingBox.maxX, (double)d2, (double)this.boundingBox.maxZ);
        }
        double d3 = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        if (d3 > 0.26249999999999996) {
            d4 = Math.cos((double)this.rotationYaw * Math.PI / 180.0);
            d5 = Math.sin((double)this.rotationYaw * Math.PI / 180.0);
            int j = 0;
            while ((double)j < 1.0 + d3 * 60.0) {
                double d6 = this.rand.nextFloat() * 2.0f - 1.0f;
                double d = (double)(this.rand.nextInt(2) * 2 - 1) * 0.7;
                ++j;
            }
        }
        if (this.worldObj.isRemote && this.isBoatEmpty) {
            if (this.boatPosRotationIncrements > 0) {
                d4 = this.posX + (this.boatX - this.posX) / (double)this.boatPosRotationIncrements;
                d5 = this.posY + (this.boatY - this.posY) / (double)this.boatPosRotationIncrements;
                double d11 = this.posZ + (this.boatZ - this.posZ) / (double)this.boatPosRotationIncrements;
                double d10 = MathHelper.wrapAngleTo180_double((double)(this.boatYaw - (double)this.rotationYaw));
                this.rotationYaw = (float)((double)this.rotationYaw + d10 / (double)this.boatPosRotationIncrements);
                this.rotationPitch = (float)((double)this.rotationPitch + (this.boatPitch - (double)this.rotationPitch) / (double)this.boatPosRotationIncrements);
                --this.boatPosRotationIncrements;
                this.setPosition(d4, d5, d11);
                this.setRotation(this.rotationYaw, this.rotationPitch);
            } else {
                d4 = this.posX + this.motionX;
                d5 = this.posY + this.motionY;
                double d11 = this.posZ + this.motionZ;
                this.setPosition(d4, d5, d11);
                this.motionX *= (double)0.99f;
                this.motionY *= (double)0.95f;
                this.motionZ *= (double)0.99f;
            }
        } else {
            double d12;
            double S = 0.0;
            if (this.riddenByEntity != null) {
                if (this.riddenByEntity instanceof EntityPlayer) {
                    NBTTagCompound tag = JRMCoreH.nbt((Entity)((EntityPlayer)this.riddenByEntity), (String)"");
                    if (tag.getInteger("DBCdriF") == 1) {
                        S = 0.55;
                        this.dS += this.T;
                        tag.setInteger("DBCdriF", 0);
                    } else if (tag.getInteger("DBCdriF") == 2) {
                        S = -0.55;
                        this.dS -= this.T;
                        tag.setInteger("DBCdriF", 0);
                    } else {
                        S = 0.0;
                        tag.setInteger("DBCdriF", 0);
                    }
                    if (tag.getInteger("DBCdriY") == 3) {
                        this.motionY += 0.5;
                        if (this.motionY > 0.5) {
                            this.motionY = 0.5;
                        }
                        tag.setInteger("DBCdriY", 0);
                    } else if (tag.getInteger("DBCdriY") == 4) {
                        if (this.worldObj.getBlock((int)this.posX + 0, (int)this.posY - 2, (int)this.posZ + 0).getMaterial() == Material.air) {
                            this.motionY -= 0.5;
                            if (this.motionY < -0.5) {
                                this.motionY = -0.5;
                            }
                            tag.setInteger("DBCdriY", 0);
                        }
                    } else {
                        this.motionY = 0.0;
                        tag.setInteger("DBCdriY", 0);
                    }
                    if (tag.getInteger("DBCdriS") == 5) {
                        this.rotationYaw -= 4.0f;
                        tag.setInteger("DBCdriS", 0);
                    } else if (tag.getInteger("DBCdriS") == 6) {
                        this.rotationYaw += 4.0f;
                        tag.setInteger("DBCdriS", 0);
                    } else {
                        tag.setInteger("DBCdriS", 0);
                    }
                }
                if (this.dS > 0.5f) {
                    this.dS = 0.5f;
                }
                if (this.dS < -0.5f) {
                    this.dS = -0.5f;
                }
                double e = Math.cos((double)this.rotationYaw * Math.PI / 180.0) * S;
                double r = Math.sin((double)this.rotationYaw * Math.PI / 180.0) * -S;
                this.motionZ = e;
                this.motionX = r;
                this.dropcounter = 0;
                this.riddenByEntity.fallDistance = 0.0f;
                this.fallDistance = 0.0f;
                if (this.ridingEntity != null) {
                    this.ridingEntity.fallDistance = 0.0f;
                }
                this.riddenByEntity.onGround = false;
                byte al = JRMCoreH.getByte((EntityPlayer)((EntityPlayer)this.riddenByEntity), (String)"jrmcAlign");
                if (al > 66) {
                    this.riddenByEntity.mountEntity(null);
                    this.mountEntity(null);
                    this.riddenByEntity = null;
                }
            } else {
                ++this.dropcounter;
                if (this.dropcounter == 100) {
                    this.dropcounter = 0;
                    this.func_145778_a(ItemsDBC.KintounBlackItem, 1, 0.0f);
                    this.setDead();
                }
                S = 0.0;
                this.dS = 0.0f;
            }
            this.fallDistance = 0.0f;
            if (this.riddenByEntity == null) {
                this.motionX *= 0.3900000095367432;
                this.motionZ *= 0.3900000095367432;
            }
            this.moveEntity(this.motionX * DBCConfig.cnfFlnmb, this.motionY * DBCConfig.cnfFlnmb, this.motionZ * DBCConfig.cnfFlnmb);
            if (this.isCollidedHorizontally && d3 > 0.2) {
                if (!this.worldObj.isRemote && !this.isDead) {
                    this.setDead();
                    this.func_145778_a(ItemsDBC.KintounBlackItem, 1, 0.0f);
                }
            } else if (this.riddenByEntity != null) {
                this.motionX *= 0.3900000095367432;
                this.motionY *= 0.349999988079071;
                this.motionZ *= 0.3900000095367432;
            }
            this.rotationPitch = 0.0f;
            d5 = this.rotationYaw;
            double d11 = this.prevPosX - this.posX;
            double d10 = this.prevPosZ - this.posZ;
            if (d11 * d11 + d10 * d10 > 0.001) {
                d5 = (float)(Math.atan2(d10, d11) * 180.0 / Math.PI);
            }
            if ((d12 = MathHelper.wrapAngleTo180_double((double)(d5 - (double)this.rotationYaw))) > 20.0) {
                d12 = 20.0;
            }
            if (d12 < -20.0) {
                d12 = -20.0;
            }
            this.setRotation(this.rotationYaw, this.rotationPitch);
            if (!this.worldObj.isRemote) {
                int l;
                List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand((double)0.2f, 0.0, (double)0.2f));
                if (list != null && !list.isEmpty()) {
                    for (l = 0; l < list.size(); ++l) {
                        Entity entity = (Entity)list.get(l);
                        if (entity == this.riddenByEntity || !entity.canBePushed() || !(entity instanceof KintounBlackEntity)) continue;
                        this.motionX = 0.0;
                        this.motionY = 0.0;
                        this.motionZ = 0.0;
                    }
                }
                for (l = 0; l < 4; ++l) {
                    int i1 = MathHelper.floor_double((double)(this.posX + ((double)(l % 2) - 0.5) * 0.8));
                    int j1 = MathHelper.floor_double((double)(this.posZ + ((double)(l / 2) - 0.5) * 0.8));
                    for (int k1 = 0; k1 < 2; ++k1) {
                        int l1 = MathHelper.floor_double((double)this.posY) + k1;
                        Block i2 = this.worldObj.getBlock(i1, l1, j1);
                        if (i2 == Blocks.snow) {
                            this.worldObj.setBlockToAir(i1, l1, j1);
                            continue;
                        }
                        if (i2 != Blocks.waterlily) continue;
                        this.worldObj.destroyBlockInWorldPartially(i1, l1, j1, 0, 0);
                    }
                }
                if (this.riddenByEntity != null && this.riddenByEntity.isDead) {
                    this.riddenByEntity = null;
                }
            }
        }
    }

    public void updateRiderPosition() {
        if (this.riddenByEntity != null) {
            double d0 = Math.cos((double)this.rotationYaw * Math.PI / 180.0) * 0.4;
            double d1 = Math.sin((double)this.rotationYaw * Math.PI / 180.0) * 0.4;
            this.riddenByEntity.setPosition(this.posX + d0, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ + d1);
        }
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    }

    @SideOnly(value=Side.CLIENT)
    public float getShadowSize() {
        return 0.0f;
    }

    public boolean interactFirst(EntityPlayer par1EntityPlayer) {
        return this.interact(par1EntityPlayer);
    }

    public boolean interact(EntityPlayer par1EntityPlayer) {
        if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != par1EntityPlayer) {
            return true;
        }
        if (!this.worldObj.isRemote) {
            par1EntityPlayer.mountEntity((Entity)this);
        }
        return true;
    }

    public void setDamageTaken(float par1) {
        this.dataWatcher.updateObject(19, (Object)Float.valueOf(par1));
    }

    public float getDamageTaken() {
        return this.dataWatcher.getWatchableObjectFloat(19);
    }

    public void setTimeSinceHit(int par1) {
        this.dataWatcher.updateObject(17, (Object)par1);
    }

    public int getTimeSinceHit() {
        return this.dataWatcher.getWatchableObjectInt(17);
    }

    public void setForwardDirection(int par1) {
        this.dataWatcher.updateObject(18, (Object)par1);
    }

    public int getForwardDirection() {
        return this.dataWatcher.getWatchableObjectInt(18);
    }

    @SideOnly(value=Side.CLIENT)
    public void setIsBoatEmpty(boolean par1) {
        this.isBoatEmpty = par1;
    }
}

