/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  cpw.mods.fml.common.registry.IThrowableEntity
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.command.IEntitySelector
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IProjectile
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Entitys;

import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.common.registry.IThrowableEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EntityEnergyFM
extends Entity
implements IThrowableEntity,
IEntityAdditionalSpawnData,
IEntitySelector,
IProjectile {
    public Entity shootingEntity;
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    private Block inTile;
    private int inData = 0;
    private boolean inGround = false;
    private int ticksInGround;
    private int ticksInAir = 0;
    private float Expl = 4.0f;
    private String ExplSound = "jinryuudragonbc:DBC.expl";
    private String AirSound = "jinryuudragonbc:DBC.hafire";
    private float strtX;
    private float strtY;
    private float strtZ;
    private float trgtX = 0.0f;
    private float trgtY = 0.0f;
    private float trgtZ = 0.0f;
    private byte speed;
    private boolean shrink = false;
    private byte relFired = (byte)100;
    private float size = 10.0f;
    private int cb = 50;
    private boolean kiClashed;
    private List kiClashedList = new ArrayList();

    public float strtX() {
        return this.strtX;
    }

    public float strtY() {
        return this.strtY;
    }

    public float strtZ() {
        return this.strtZ;
    }

    public float trgtX() {
        return this.trgtX;
    }

    public float trgtY() {
        return this.trgtY;
    }

    public float trgtZ() {
        return this.trgtZ;
    }

    public int getShrink() {
        return this.getDataWatcher().getWatchableObjectInt(20);
    }

    public byte getSpe() {
        return this.speed;
    }

    public int getAirTicks() {
        return this.ticksInAir;
    }

    public void setAirTicks(int i) {
        this.ticksInAir = i;
    }

    public EntityEnergyFM(World par1World) {
        super(par1World);
        this.setSize(this.size, this.size);
    }

    public EntityEnergyFM(EntityLivingBase par2EntityLivingBase) {
        super(par2EntityLivingBase.worldObj);
        this.speed = (byte)20;
        int sbh = (int)(this.posY > 65.0 ? this.posY - 65.0 : 1.0) * 4;
        this.size = 0.5f + (float)(sbh / 5 * 100) * 0.02f / 8.0f;
        if (this.size > 10.0f) {
            this.size = 10.0f;
        }
        this.shootingEntity = par2EntityLivingBase;
        this.renderDistanceWeight = 10.0;
        this.setSize(this.size, this.size);
        double d8 = par2EntityLivingBase.width + 1.0f;
        double d9 = par2EntityLivingBase.height + 0.5f + this.size * 0.5f;
        Vec3 vec3 = par2EntityLivingBase.getLook(1.0f);
        double x = par2EntityLivingBase.posX + vec3.xCoord * d8;
        double y = par2EntityLivingBase.posY + vec3.yCoord * d8 + (double)(par2EntityLivingBase.height * 0.55f);
        double z = par2EntityLivingBase.posZ + vec3.zCoord * d8;
        this.setLocationAndAngles(x, y, z, 0.0f, 0.0f);
        this.yOffset = this.size * 0.5f;
        this.motionX = 0.0;
        this.motionZ = 0.0;
        this.motionY = 1.0;
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, (float)this.speed * 0.05f, 1.0f);
        this.strtX = (float)x;
        this.strtY = (float)y;
        this.strtZ = (float)z;
    }

    protected void entityInit() {
        this.dataWatcher.addObject(20, (Object)0);
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
        if (!this.worldObj.isRemote && this.shootingEntity == null) {
            this.setDead();
        }
        if (this.posY >= 250.0) {
            this.motionY = 0.0;
        } else {
            int sbh = (int)(this.posY > 80.0 ? this.posY - 80.0 : 1.0) * 4;
            this.size = 0.5f + (float)(sbh / 5 * 100) * 0.02f / 8.0f;
            this.setSize(this.size, this.size);
        }
        this.motionX = 0.0;
        this.motionZ = 0.0;
        if (this.ticksExisted == 1) {
            this.setSize(this.size, this.size);
            this.yOffset = this.size * 0.5f;
        }
        super.onUpdate();
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
            int var19 = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
            if (block == this.inTile && var19 == this.inData) {
                ++this.ticksInGround;
                if (this.ticksInGround == 1) {
                    this.setDead();
                    if (!this.worldObj.isRemote) {
                        this.worldObj.playSoundAtEntity((Entity)this, this.AirSound, 1.0f, 1.0f);
                    }
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
            if (!this.worldObj.isRemote && this.ticksInAir >= 2000) {
                this.setDead();
            }
            for (int var6 = 1; var6 < 3; ++var6) {
            }
            int t = this.ticksInAir / 10 * 10;
            if (this.ticksInAir == (t == 0 ? 10 : t)) {
                this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:" + JRMCoreH.techSnds((int)0, (int)2, (int)0), 1.0f, 1.0f);
            }
            if (var4 != null) {
                var3 = Vec3.createVectorHelper((double)var4.hitVec.xCoord, (double)var4.hitVec.yCoord, (double)var4.hitVec.zCoord);
            }
            if (!this.worldObj.isRemote) {
                Entity var5 = null;
                List var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(0.5, 0.5, 0.5));
                double var7 = 0.0;
                for (int var9 = 0; var9 < var6.size(); ++var9) {
                    double var14;
                    AxisAlignedBB var12;
                    MovingObjectPosition var13;
                    Entity var10 = (Entity)var6.get(var9);
                    if (!(var10 instanceof EntityLivingBase) || !var10.canBeCollidedWith() || var10 == this.shootingEntity && this.ticksInAir < 5 || (var13 = (var12 = var10.boundingBox.expand((double)(var11 = 0.0f), (double)var11, (double)var11)).calculateIntercept(var17, var3)) == null || !((var14 = var17.distanceTo(var13.hitVec)) < var7) && var7 != 0.0) continue;
                    var5 = var10;
                    var7 = var14;
                }
                if (var5 != null) {
                    var4 = new MovingObjectPosition(var5);
                }
            }
            if (var4 != null) {
                if (!this.worldObj.isRemote) {
                    this.worldObj.playSoundAtEntity((Entity)this, this.ExplSound, 1.0f, 1.0f);
                }
                this.xTile = var4.blockX;
                this.yTile = var4.blockY;
                this.zTile = var4.blockZ;
                this.inTile = this.worldObj.getBlock(this.xTile, this.yTile, this.zTile);
                this.inData = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
                this.inGround = true;
                if (this.inTile.getMaterial() != Material.air) {
                    this.inTile.onEntityCollidedWithBlock(this.worldObj, this.xTile, this.yTile, this.zTile, (Entity)this);
                }
            }
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
                this.prevRotationPitch += 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
                this.prevRotationYaw -= 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
                this.prevRotationYaw += 360.0f;
            }
            float var22 = 1.0f;
            var11 = 0.0f;
            if (this.isInWater()) {
                for (int var26 = 0; var26 < 4; ++var26) {
                    float var27 = 0.25f;
                    this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)var27, this.posY - this.motionY * (double)var27, this.posZ - this.motionZ * (double)var27, this.motionX, this.motionY, this.motionZ);
                }
                var22 = 1.0f;
            }
            this.motionX *= (double)var22;
            this.motionY *= (double)var22;
            this.motionZ *= (double)var22;
            this.motionY -= (double)var11;
            this.setPosition(this.posX, this.posY, this.posZ);
        }
    }

    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        par1NBTTagCompound.setShort("xTile", (short)this.xTile);
        par1NBTTagCompound.setShort("yTile", (short)this.yTile);
        par1NBTTagCompound.setShort("zTile", (short)this.zTile);
        par1NBTTagCompound.setByte("inTile", (byte)Block.getIdFromBlock((Block)this.inTile));
        par1NBTTagCompound.setByte("inData", (byte)this.inData);
        par1NBTTagCompound.setByte("inGround", (byte)(this.inGround ? 1 : 0));
    }

    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
        this.xTile = par1NBTTagCompound.getShort("xTile");
        this.yTile = par1NBTTagCompound.getShort("yTile");
        this.zTile = par1NBTTagCompound.getShort("zTile");
        this.inTile = Block.getBlockById((int)(par1NBTTagCompound.getByte("inTile") & 0xFF));
        this.inData = par1NBTTagCompound.getByte("inData") & 0xFF;
        this.inGround = par1NBTTagCompound.getByte("inGround") == 1;
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

    public boolean canAttackWithItem() {
        return false;
    }

    public boolean isEntityApplicable(Entity var1) {
        return false;
    }

    public void writeSpawnData(ByteBuf data) {
        data.writeInt(this.shootingEntity == null ? 0 : this.shootingEntity.getEntityId());
        data.writeByte((int)this.speed);
        data.writeFloat(this.strtX);
        data.writeFloat(this.strtY);
        data.writeFloat(this.strtZ);
        data.writeFloat(this.size);
        data.writeFloat(this.trgtX);
        data.writeFloat(this.trgtY);
        data.writeFloat(this.trgtZ);
        data.writeByte(this.shrink ? 1 : 0);
    }

    public void readSpawnData(ByteBuf data) {
        int first = data.readInt();
        this.shootingEntity = first == 0 ? this.shootingEntity : this.worldObj.getEntityByID(first);
        this.speed = data.readByte();
        this.strtX = data.readFloat();
        this.strtY = data.readFloat();
        this.strtZ = data.readFloat();
        this.size = data.readFloat();
        this.trgtX = data.readFloat();
        this.trgtY = data.readFloat();
        this.trgtZ = data.readFloat();
        this.shrink = data.readByte() == 1;
    }

    public Entity getThrower() {
        return null;
    }

    public void setThrower(Entity entity) {
    }

    @SideOnly(value=Side.CLIENT)
    public boolean isInRangeToRenderVec3D(Vec3 par1Vec3) {
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public double getMaxRenderDistanceSquared() {
        return 65536.0;
    }

    public boolean isInRangeToRenderDist(double par1) {
        return true;
    }
}

