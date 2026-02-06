/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.entity.EntityEnAttacks;
import JinRyuu.JRMCore.entity.EntityEnergyAttJ;
import JinRyuu.JRMCore.entity.EntityEnergyAttJ2;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.common.registry.IThrowableEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
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
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EntityEnergyAttJ3
extends EntityEnAttacks
implements IThrowableEntity,
IEntityAdditionalSpawnData,
IEntitySelector,
IProjectile {
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    private Block inTile;
    private int inData = 0;
    private boolean inGround = false;
    private int ticksInGround;
    private double damage = 1.0;
    private String DBCExplSound = "jinryuudragonbc:DBC.expl";
    private String NCExplSound = "jinryuunarutoc:NC1.Explosion";
    private byte type;
    private int dam;
    private byte perc;
    private byte pmjID;
    private int cost;
    private int costPerc;
    private int originDmg;
    private int pwrtyp = 0;
    private String nameJutsu;
    public float size = 1.7f;
    private boolean used = false;
    private int health;
    private byte jtsre;
    private float rota;

    public byte getType() {
        return this.type;
    }

    public int getDam() {
        return this.dam;
    }

    public byte getPerc() {
        return this.perc;
    }

    public float getSizePerc() {
        return this.size;
    }

    public byte getjtsre() {
        return this.jtsre;
    }

    public float getrota() {
        return this.rota;
    }

    public EntityEnergyAttJ3(World par1World) {
        super(par1World);
        this.setSize(this.size, this.size);
    }

    public EntityEnergyAttJ3(byte jtsre, EntityLivingBase entity, byte type, int dam, byte perc, int dam1, int cost, int costPerc) {
        super(entity.worldObj);
        this.jtsre = jtsre;
        this.type = type;
        this.dam = dam;
        this.perc = (byte)50;
        this.cost = cost;
        this.costPerc = costPerc;
        this.originDmg = dam1;
        this.pmjID = perc;
        if (this.pmjID != -1) {
            this.nameJutsu = JRMCoreH.trl("nc", JRMCoreH.pmj[this.pmjID][0]);
        }
        this.damage = (double)this.dam * (double)this.perc * (double)0.02f;
        this.shootingEntity = entity;
        this.pwrtyp = 0;
        if (this.shootingEntity instanceof EntityPlayer) {
            this.pwrtyp = JRMCoreH.PlyrPwr((EntityPlayer)this.shootingEntity);
        }
        this.renderDistanceWeight = 10.0;
        this.setSize(this.size, this.size);
        double d8 = entity.width + 1.0f;
        double d9 = entity.height;
        Vec3 vec3 = entity.getLook(1.0f);
        double x = entity.posX + vec3.xCoord * d8;
        double y = entity.posY + vec3.yCoord * d8 + (double)(entity.height * 0.55f);
        double z = entity.posZ + vec3.zCoord * d8;
        int spot = -1;
        int checked = 0;
        int i = (int)y;
        while (spot == -1 && checked < 3) {
            if (!entity.worldObj.getBlock((int)x, i, (int)z).getUnlocalizedName().toLowerCase().contains("air")) {
                spot = i + 1;
                y = spot;
                break;
            }
            ++checked;
            --i;
        }
        this.setLocationAndAngles(x, y, z, entity.rotationYaw, entity.rotationPitch);
        this.rota = entity.rotationYaw;
    }

    @Override
    protected void entityInit() {
        this.dataWatcher.addObject(16, (Object)0);
    }

    public void setThrowableHeading(double par1, double par3, double par5, float par7, float par8) {
    }

    @SideOnly(value=Side.CLIENT)
    public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
        this.setPosition(par1, par3, par5);
        this.setRotation(par7, par8);
    }

    @SideOnly(value=Side.CLIENT)
    public void setVelocity(double par1, double par3, double par5) {
    }

    public void onUpdate() {
        Block block;
        if (!this.worldObj.isRemote && this.shootingEntity == null) {
            this.setDead();
        }
        if (this.ticksExisted == 1) {
            this.setSize(this.size, this.size);
        }
        if (this.ticksExisted > 500) {
            this.setDead();
        }
        super.onUpdate();
        if (!this.worldObj.isRemote && this.getDamage() <= 0.0) {
            this.setDead();
        }
        if ((block = this.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ)).getMaterial() != Material.air) {
            block.setBlockBoundsBasedOnState((IBlockAccess)this.worldObj, this.xTile, this.yTile, this.zTile);
            AxisAlignedBB axisalignedbb = block.getCollisionBoundingBoxFromPool(this.worldObj, this.xTile, this.yTile, this.zTile);
            if (axisalignedbb != null && axisalignedbb.isVecInside(Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ))) {
                this.inGround = true;
            }
        }
        if (this.inGround) {
            int var19 = this.worldObj.getBlockMetadata((int)this.posX, (int)this.posY, (int)this.posZ);
            if (block.getMaterial() != Material.air && !block.getUnlocalizedName().toLowerCase().contains("air")) {
                ++this.ticksInGround;
                this.posY += (double)0.1f;
            } else {
                this.inGround = false;
                this.ticksInGround = 0;
            }
            this.func_chins();
        } else {
            this.func_chins();
            this.setPosition(this.posX, this.posY, this.posZ);
            this.doBlockCollisions();
        }
    }

    @Override
    public long getPower(Entity entity) {
        return (long)(this.getDamage() / 2.0);
    }

    private void doBlockCollisions() {
        this.func_145775_I();
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        par1NBTTagCompound.setShort("xTile", (short)this.xTile);
        par1NBTTagCompound.setShort("yTile", (short)this.yTile);
        par1NBTTagCompound.setShort("zTile", (short)this.zTile);
        par1NBTTagCompound.setByte("inTile", (byte)Block.getIdFromBlock((Block)this.inTile));
        par1NBTTagCompound.setByte("inData", (byte)this.inData);
        par1NBTTagCompound.setByte("inGround", (byte)(this.inGround ? 1 : 0));
        par1NBTTagCompound.setDouble("damage", this.damage);
    }

    @Override
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
    }

    public void onCollideWithPlayer(EntityPlayer e) {
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
    }

    public boolean isEntityApplicable(Entity var1) {
        return false;
    }

    public void writeSpawnData(ByteBuf data) {
        data.writeInt(this.shootingEntity == null ? 0 : this.shootingEntity.getEntityId());
        data.writeByte((int)this.perc);
        data.writeByte((int)this.type);
        data.writeByte((int)this.jtsre);
        data.writeInt(this.dam);
        data.writeFloat(this.size);
        data.writeFloat(this.rota);
    }

    public void readSpawnData(ByteBuf data) {
        int first = data.readInt();
        this.shootingEntity = first == 0 ? this.shootingEntity : this.worldObj.getEntityByID(first);
        this.perc = data.readByte();
        this.type = data.readByte();
        this.jtsre = data.readByte();
        this.dam = data.readInt();
        this.size = data.readFloat();
        this.rota = data.readFloat();
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

    public void setJutsuName(String name) {
        this.nameJutsu = name;
    }

    public boolean canBeCollidedWith() {
        return true;
    }

    public float getCollisionBorderSize() {
        return 0.1f;
    }

    public AxisAlignedBB getCollisionBox(Entity p_70114_1_) {
        return this.getBoundingBox();
    }

    public AxisAlignedBB getBoundingBox() {
        return this.boundingBox;
    }

    private void func_chins() {
        List entityList;
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
            entityList = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(0.5, 0.5, 0.5));
            double var7 = 0.0;
            for (int n = 0; n < entityList.size(); ++n) {
                double var14;
                float var11;
                AxisAlignedBB var12;
                MovingObjectPosition var13;
                Entity entity = (Entity)entityList.get(n);
                if (!entity.canBeCollidedWith() || entity == this.shootingEntity || (var13 = (var12 = entity.boundingBox.expand((double)(var11 = 0.0f), (double)var11, (double)var11)).calculateIntercept(var17, var3)) == null || !((var14 = var17.distanceTo(var13.hitVec)) < var7) && var7 != 0.0) continue;
                var5 = entity;
                var7 = var14;
            }
            if (var5 != null) {
                var4 = new MovingObjectPosition(var5);
            }
        }
        if (!this.worldObj.isRemote) {
            AxisAlignedBB aabb = this.boundingBox.copy();
            entityList = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, aabb);
            for (int n = 0; n < entityList.size(); ++n) {
                Entity entity = (Entity)entityList.get(n);
                if (entity == this.shootingEntity || !(entity instanceof EntityEnAttacks)) continue;
                long shieldPower = this.getPower(this);
                long targetPower = 0L;
                double targetDamage = 0.0;
                if (entity instanceof EntityEnergyAttJ) {
                    targetPower = ((EntityEnergyAttJ)entity).getPower(entity);
                    targetDamage = ((EntityEnergyAttJ)entity).getDamage();
                } else if (entity instanceof EntityEnergyAttJ2) {
                    targetPower = ((EntityEnergyAttJ2)entity).getPower(entity);
                    targetDamage = ((EntityEnergyAttJ2)entity).getDamage();
                }
                if (targetPower > shieldPower) {
                    if (entity instanceof EntityEnergyAttJ) {
                        ((EntityEnergyAttJ)entity).setDamage((float)targetDamage - (float)this.getDamage());
                    } else if (entity instanceof EntityEnergyAttJ2) {
                        ((EntityEnergyAttJ2)entity).setDamage((float)targetDamage - (float)this.getDamage());
                    }
                    this.setDead();
                } else if (targetPower < shieldPower) {
                    this.setDamage((float)this.getDamage() - (float)targetDamage);
                    entity.setDead();
                } else {
                    entity.setDead();
                    this.setDead();
                }
                this.motionX = 0.0;
                this.motionY = 0.0;
                this.motionZ = 0.0;
            }
        }
    }

    public boolean canAttackWithItem() {
        return false;
    }
}

