/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.Ds
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.i.ExtendedPlayer
 *  JinRyuu.JRMCore.items.ItemVanity
 *  JinRyuu.JRMCore.server.JGMathHelper
 *  JinRyuu.JRMCore.server.JGPlayerMP
 *  JinRyuu.JRMCore.server.config.dbc.JGConfigRaces
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
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Entitys;

import JinRyuu.JRMCore.Ds;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.items.ItemVanity;
import JinRyuu.JRMCore.server.JGMathHelper;
import JinRyuu.JRMCore.server.JGPlayerMP;
import JinRyuu.JRMCore.server.config.dbc.JGConfigRaces;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.common.registry.IThrowableEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EntityMajinAbsorption
extends Entity
implements IThrowableEntity,
IEntityAdditionalSpawnData,
IEntitySelector,
IProjectile {
    public static final float SOUND = 0.25f;
    public static final HashMap<Class, Boolean> absorptionListResults = new HashMap();
    public Entity shootingEntity;
    public Entity target;
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    private Block inTile;
    private int inData = 0;
    private boolean inGround = false;
    private int ticksInGround;
    private int ticksInAir = 0;
    private float speed;
    private float size = 2.0f;
    private boolean teleported = false;
    private byte mode = 0;
    private byte skillLevel = 1;
    private int bodyColor = 0;
    private float userAttack = 1.0f;
    private float userPower = 1.0f;
    private int stateID = 0;
    public float targetW = 0.0f;
    public float targetH = 0.0f;
    public double visualH = 0.0;
    public double visualW = 0.0;
    public double prevX = 0.0;
    public double prevY = 0.0;
    public double prevZ = 0.0;
    public int prevCount = 0;
    public String absorptionData = "0,0,0+0";

    public int getShrink() {
        return this.getDataWatcher().getWatchableObjectInt(20);
    }

    public float getSpe() {
        return this.speed;
    }

    public int getAirTicks() {
        return this.ticksInAir;
    }

    public void setAirTicks(int i) {
        this.ticksInAir = i;
    }

    public byte getSkillLevel() {
        return this.skillLevel;
    }

    public int getBodyColor() {
        return this.bodyColor;
    }

    public byte getMode() {
        return this.mode;
    }

    public EntityMajinAbsorption(World world) {
        super(world);
        this.setSize(this.size, this.size);
    }

    public EntityMajinAbsorption(EntityLivingBase userEntity, int skillLevel, int bodyColor, float userPower, float userAttack, int stateID) {
        super(userEntity.worldObj);
        this.setData(skillLevel, bodyColor, userPower, userAttack, stateID);
        this.speed = 1.0f * JGConfigRaces.CONFIG_MAJIN_ABSORPTON_SPEED_MULTI[stateID];
        this.size = 2.0f;
        this.shootingEntity = userEntity;
        this.renderDistanceWeight = 10.0;
        this.setSize(this.size, this.size);
        double d8 = userEntity.width + 1.0f;
        double d9 = userEntity.height + 0.5f + this.size * 0.5f;
        Vec3 vec3 = userEntity.getLookVec();
        double x = userEntity.posX + vec3.xCoord * d8;
        double y = userEntity.posY + vec3.yCoord * d8 + (double)(userEntity.height * 0.55f);
        double z = userEntity.posZ + vec3.zCoord * d8;
        this.yOffset = this.size * 0.5f;
        this.setLocationAndAngles(x, y, z, userEntity.getRotationYawHead(), userEntity.rotationPitch);
        this.motionX = -MathHelper.sin((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionZ = MathHelper.cos((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionY = -MathHelper.sin((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, this.speed, 1.0f);
        this.prevX = this.posX;
        this.prevY = this.posY;
        this.prevZ = this.posZ;
    }

    public void setData(int skillLevel, int bodyColor, float userPower, float userAttack, int stateID) {
        this.skillLevel = (byte)skillLevel;
        this.bodyColor = bodyColor;
        this.userPower = userPower;
        if (userPower < 1.0f) {
            userPower = 1.0f;
        }
        this.userAttack = userAttack;
        if (userAttack < 1.0f) {
            userAttack = 1.0f;
        }
        this.stateID = stateID;
    }

    protected void entityInit() {
        this.dataWatcher.addObject(20, (Object)0);
        this.dataWatcher.addObject(21, (Object)Float.valueOf(0.0f));
        this.dataWatcher.addObject(22, (Object)Float.valueOf(0.0f));
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
        }
        if (this.ticksExisted == 1) {
            this.setSize(this.size, this.size);
            this.yOffset = this.size * 0.5f;
        }
        super.onUpdate();
        if (!this.worldObj.isRemote && (this.ticksExisted >= JGConfigRaces.CONFIG_MAJIN_ABSORPTON_MAX_TICK_LIFE[this.stateID][0] || this.prevX == this.posX && this.prevY == this.posY && this.prevZ == this.posZ)) {
            ++this.prevCount;
            if (this.prevCount >= JGConfigRaces.CONFIG_MAJIN_ABSORPTON_MAX_TICK_LIFE[this.stateID][1]) {
                this.setDead();
            }
        } else {
            this.prevCount = 0;
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
        if (this.inGround) {
            int var19 = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
            if (block == this.inTile && var19 == this.inData) {
                ++this.ticksInGround;
                int t = this.ticksInGround / 10 * 10;
                if (this.ticksInGround == (t == 0 ? 10 : t)) {
                    this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC5.majin_bodypart", 0.4f, 1.0f);
                }
                if (this.ticksInGround >= 1) {
                    this.posX -= this.motionX;
                    this.posY -= this.motionY;
                    this.posZ -= this.motionZ;
                    this.motionX = 0.0;
                    this.motionY = 0.0;
                    this.motionZ = 0.0;
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
            Entity target;
            Entity var10;
            int var9;
            double var7;
            List var6;
            double HITBOX;
            Entity var5;
            int t;
            ++this.ticksInAir;
            Vec3 var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            Vec3 var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            MovingObjectPosition var4 = this.worldObj.func_147447_a(var17, var3, false, true, false);
            var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            if (!this.worldObj.isRemote && this.ticksInAir >= 2000 && this.target == null && this.getMode() != 2) {
                this.setDead();
            }
            if (this.ticksInAir == ((t = this.ticksInAir / 10 * 10) == 0 ? 10 : t)) {
                this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC5.majin_bodypart", 0.4f, 1.0f);
            }
            if (var4 != null) {
                var3 = Vec3.createVectorHelper((double)var4.hitVec.xCoord, (double)var4.hitVec.yCoord, (double)var4.hitVec.zCoord);
            }
            if (!this.worldObj.isRemote) {
                var5 = null;
                HITBOX = 2.0;
                var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(2.0, 2.0, 2.0));
                var7 = 0.0;
                for (var9 = 0; var9 < var6.size(); ++var9) {
                    double var14;
                    float var11;
                    AxisAlignedBB var12;
                    MovingObjectPosition var13;
                    var10 = (Entity)var6.get(var9);
                    if (!(var10 instanceof EntityLivingBase) || !var10.canBeCollidedWith() || var10 == this.shootingEntity && this.ticksInAir < 5 || (var13 = (var12 = var10.boundingBox.expand((double)(var11 = 0.0f), (double)var11, (double)var11)).calculateIntercept(var17, var3)) == null || !((var14 = var17.distanceTo(var13.hitVec)) < var7) && var7 != 0.0) continue;
                    var5 = var10;
                    var7 = var14;
                }
                if (var5 != null) {
                    var4 = new MovingObjectPosition(var5);
                }
            }
            if (!this.worldObj.isRemote && this.target == null) {
                var5 = null;
                HITBOX = 4.0;
                var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(4.0, 4.0, 4.0));
                var7 = 0.0;
                for (var9 = 0; var9 < var6.size(); ++var9) {
                    double dist2;
                    double distZ2;
                    double distY2;
                    double distZ;
                    double distY;
                    var10 = (Entity)var6.get(var9);
                    if (!(var10 instanceof EntityLivingBase) || var10 == null || !((EntityLivingBase)var10).isEntityAlive() || var10 == this.shootingEntity || !var10.canBeCollidedWith() || this.isEntityOnTheBlacklist(var10) || JRMCoreH.isFusionSpectator((Entity)var10) || JRMCoreH.isInCreativeMode((Entity)var10)) continue;
                    if (this.target == null) {
                        this.target = var10;
                        this.mode = 1;
                        this.getDataWatcher().updateObject(20, (Object)1);
                        this.getDataWatcher().updateObject(21, (Object)Float.valueOf(this.target.width));
                        this.getDataWatcher().updateObject(22, (Object)Float.valueOf(this.target.height));
                        break;
                    }
                    double distX = this.target.posX - this.posX;
                    if (distX < 0.0) {
                        distX *= -1.0;
                    }
                    if ((distY = this.target.posY + (double)(this.target.height / 2.0f) - this.posY) < 0.0) {
                        distY *= -1.0;
                    }
                    if ((distZ = this.target.posZ - this.posZ) < 0.0) {
                        distZ *= -1.0;
                    }
                    double dist = distX + distY + distZ;
                    double distX2 = var10.posX - this.posX;
                    if (distX2 < 0.0) {
                        distX2 *= -1.0;
                    }
                    if ((distY2 = var10.posY - this.posY) < 0.0) {
                        distY2 *= -1.0;
                    }
                    if ((distZ2 = var10.posZ - this.posZ) < 0.0) {
                        distZ2 *= -1.0;
                    }
                    if (!(dist < (dist2 = distX2 + distY2 + distZ2))) break;
                    this.target = var10;
                    this.mode = 1;
                    this.getDataWatcher().updateObject(20, (Object)1);
                    this.getDataWatcher().updateObject(21, (Object)Float.valueOf(this.target.width));
                    this.getDataWatcher().updateObject(22, (Object)Float.valueOf(this.target.height));
                    break;
                }
            }
            if (var4 != null && this.target == null && this.mode <= 0 && !this.worldObj.getBlock(var4.blockX, var4.blockY, var4.blockZ).getUnlocalizedName().equals("tile.bedrock")) {
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
            Object object = this.getMode() == 1 ? this.target : (target = this.getMode() == 2 ? this.shootingEntity : null);
            if (target != null) {
                double distX = target.posX - this.posX;
                double distY = target.posY + (double)(target.height / 2.0f) - this.posY;
                double distZ = target.posZ - this.posZ;
                double div = 20.0;
                double MIN_SPEED = 0.1;
                double HIT_DISTANCE = 0.3;
                this.motionX = distX / 20.0;
                if (JGMathHelper.doubleSmallerThan((double)this.motionX, (double)MIN_SPEED)) {
                    this.motionX = this.motionX < 0.0 ? -MIN_SPEED : MIN_SPEED;
                }
                this.motionY = distY / 20.0;
                if (JGMathHelper.doubleSmallerThan((double)this.motionY, (double)MIN_SPEED)) {
                    this.motionY = this.motionY < 0.0 ? -MIN_SPEED : MIN_SPEED;
                }
                this.motionZ = distZ / 20.0;
                if (JGMathHelper.doubleSmallerThan((double)this.motionZ, (double)MIN_SPEED)) {
                    this.motionZ = this.motionZ < 0.0 ? -MIN_SPEED : MIN_SPEED;
                }
                this.posX += this.motionX;
                this.posY += this.motionY;
                this.posZ += this.motionZ;
                if (!this.worldObj.isRemote) {
                    if (this.shootingEntity != null && this.shootingEntity.isEntityAlive()) {
                        if (JGMathHelper.doubleSmallerThan((double)distX, (double)HIT_DISTANCE) && JGMathHelper.doubleSmallerThan((double)distY, (double)HIT_DISTANCE) && JGMathHelper.doubleSmallerThan((double)distZ, (double)HIT_DISTANCE)) {
                            JGPlayerMP jgPlayer;
                            if (this.getMode() == 2) {
                                jgPlayer = new JGPlayerMP((EntityPlayer)this.shootingEntity);
                                jgPlayer.connectBaseNBT();
                                jgPlayer.setAbsorption(this.absorptionData);
                                this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC5.majin_absorption2", 0.4f, 1.0f);
                                this.setDead();
                            } else if (this.target != null && ((EntityLivingBase)this.target).isEntityAlive()) {
                                jgPlayer = new JGPlayerMP((EntityPlayer)this.shootingEntity);
                                jgPlayer.connectBaseNBT();
                                if (JRMCoreH.isPowerTypeKi((int)jgPlayer.getPowerType()) && JRMCoreH.isRaceMajin((int)jgPlayer.getRace())) {
                                    float powerTarget;
                                    float attackTarget = 1.0f;
                                    float healthTarget = 1.0f;
                                    float kiPowerTarget = 1.0f;
                                    if (this.target instanceof EntityPlayer) {
                                        JGPlayerMP jgPlayerTarget = new JGPlayerMP((EntityPlayer)this.target);
                                        jgPlayerTarget.connectBaseNBT();
                                        float release = (float)jgPlayerTarget.getRelease() / 100.0f;
                                        int strength = jgPlayerTarget.getAttribute(0);
                                        attackTarget = JRMCoreH.stat((int)0, (EntityPlayer)((EntityPlayer)this.target), (int)0, (int)strength, (float)0.0f);
                                        attackTarget = (int)(attackTarget * release);
                                        healthTarget = jgPlayerTarget.getHealth();
                                        kiPowerTarget = jgPlayerTarget.getEnergyPower();
                                        kiPowerTarget = (int)(kiPowerTarget * release);
                                    } else {
                                        if (((EntityLivingBase)this.target).getEntityAttribute(SharedMonsterAttributes.attackDamage) != null) {
                                            attackTarget = (float)((EntityLivingBase)this.target).getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
                                            kiPowerTarget = attackTarget / 2.0f;
                                        }
                                        healthTarget = ((EntityLivingBase)this.target).getHealth();
                                    }
                                    float targetHealthOG = healthTarget;
                                    attackTarget = (int)(attackTarget * JGConfigRaces.CONFIG_MAJIN_ABSORPTON_TARGET_POWER_MULTI[this.stateID][0]);
                                    healthTarget = (int)(healthTarget * JGConfigRaces.CONFIG_MAJIN_ABSORPTON_TARGET_POWER_MULTI[this.stateID][1]);
                                    kiPowerTarget = (int)(kiPowerTarget * JGConfigRaces.CONFIG_MAJIN_ABSORPTON_TARGET_POWER_MULTI[this.stateID][2]);
                                    if (attackTarget < 1.0f) {
                                        attackTarget = 1.0f;
                                    }
                                    if (healthTarget < 1.0f) {
                                        healthTarget = 1.0f;
                                    }
                                    if (kiPowerTarget < 1.0f) {
                                        kiPowerTarget = 1.0f;
                                    }
                                    if ((powerTarget = attackTarget + kiPowerTarget + healthTarget) <= this.userPower) {
                                        String[] prevAbs = jgPlayer.getAbsorption().split(",");
                                        this.absorptionData = "";
                                        boolean isTargetPlayer = this.target instanceof EntityPlayer;
                                        for (int i = 0; i < 3; ++i) {
                                            String data;
                                            if (prevAbs.length <= i) {
                                                data = i == 2 ? "0+0" : "0";
                                            } else {
                                                data = prevAbs[i];
                                                if (i == 0) {
                                                    int gain;
                                                    int prevValue = 0;
                                                    if (prevAbs[i].length() > 0) {
                                                        prevValue = Integer.parseInt(prevAbs[i]);
                                                    }
                                                    if ((gain = (int)(powerTarget / this.userPower * JGConfigRaces.CONFIG_MAJIN_ABSORPTON_GAIN_MULTI)) < JGConfigRaces.CONFIG_MAJIN_ABSORPTON_MIN_GAIN) {
                                                        gain = JGConfigRaces.CONFIG_MAJIN_ABSORPTON_MIN_GAIN;
                                                    }
                                                    prevValue = JGConfigRaces.CONFIG_MAJIN_ADD_GAIN_ENABLED ? (prevValue += gain) : gain;
                                                    if (prevValue > JGConfigRaces.CONFIG_MAJIN_ABSORPTON_MAX_LEVEL) {
                                                        prevValue = JGConfigRaces.CONFIG_MAJIN_ABSORPTON_MAX_LEVEL;
                                                    }
                                                    data = "" + prevValue;
                                                } else if (isTargetPlayer) {
                                                    if (i == 1) {
                                                        JGPlayerMP jgPlayerTarget = new JGPlayerMP((EntityPlayer)this.target);
                                                        jgPlayerTarget.connectBaseNBT();
                                                        data = "" + jgPlayerTarget.getRace();
                                                    } else if (i == 2) {
                                                        data = "";
                                                        ItemStack[] stack_vanities = new ItemStack[8];
                                                        for (int j = 0; j < 8; ++j) {
                                                            stack_vanities[j] = ExtendedPlayer.get((EntityPlayer)((EntityPlayer)this.target)).inventory.getStackInSlot(3 + j);
                                                            if (stack_vanities[j] == null || !(stack_vanities[j].getItem() instanceof ItemVanity)) continue;
                                                            data = data + (data.length() > 0 ? "-" : "") + Item.getIdFromItem((Item)stack_vanities[j].getItem()) + "+" + ((ItemVanity)stack_vanities[j].getItem()).getColor(stack_vanities[j]);
                                                        }
                                                        if (data.length() == 0) {
                                                            data = "0+0";
                                                        }
                                                    }
                                                } else {
                                                    data = i == 2 ? "0+0" : "0";
                                                }
                                            }
                                            this.absorptionData = this.absorptionData + data + (i + 1 < 3 ? "," : "");
                                        }
                                        this.mode = (byte)2;
                                        this.getDataWatcher().updateObject(20, (Object)2);
                                        ((EntityLivingBase)this.target).setHealth(1.0f);
                                        DamageSource damagesource = Ds.causeEntityMajinAbsorptionDamage((Entity)this, (Entity)this.shootingEntity);
                                        if (this.target.attackEntityFrom(damagesource, targetHealthOG)) {
                                            this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC5.majin_absorption", 0.3f, 1.0f);
                                        } else {
                                            this.setDead();
                                        }
                                    } else {
                                        this.setDead();
                                    }
                                } else {
                                    this.setDead();
                                }
                            } else {
                                this.setDead();
                            }
                        }
                    } else {
                        this.setDead();
                    }
                }
            } else {
                this.posX += this.motionX;
                this.posY += this.motionY;
                this.posZ += this.motionZ;
            }
            this.mode = (byte)this.getDataWatcher().getWatchableObjectInt(20);
            this.targetW = this.getDataWatcher().getWatchableObjectFloat(21);
            this.targetH = this.getDataWatcher().getWatchableObjectFloat(22);
            while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
                this.prevRotationPitch += 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
                this.prevRotationYaw -= 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
                this.prevRotationYaw += 360.0f;
            }
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
        data.writeInt(this.target == null ? 0 : this.target.getEntityId());
        data.writeFloat(this.speed);
        data.writeFloat(this.size);
        data.writeInt(this.bodyColor);
        data.writeByte((int)this.skillLevel);
        data.writeFloat(this.userPower);
        data.writeByte((int)this.mode);
        data.writeFloat(this.targetW);
        data.writeFloat(this.targetH);
    }

    public void readSpawnData(ByteBuf data) {
        int first = data.readInt();
        this.shootingEntity = first == 0 ? this.shootingEntity : this.worldObj.getEntityByID(first);
        int second = data.readInt();
        this.target = second == 0 ? this.target : this.worldObj.getEntityByID(second);
        this.speed = data.readFloat();
        this.size = data.readFloat();
        this.bodyColor = data.readInt();
        this.skillLevel = data.readByte();
        this.userPower = data.readFloat();
        this.mode = data.readByte();
        this.targetW = data.readFloat();
        this.targetH = data.readFloat();
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

    public float rad(float angle) {
        return angle * (float)Math.PI / 180.0f;
    }

    public NBTTagCompound nbt(EntityPlayer p, String s) {
        NBTTagCompound nbt;
        if (s.contains("pres")) {
            if (!p.getEntityData().hasKey("PlayerPersisted")) {
                nbt = new NBTTagCompound();
                p.getEntityData().setTag("PlayerPersisted", (NBTBase)nbt);
            } else {
                nbt = p.getEntityData().getCompoundTag("PlayerPersisted");
            }
        } else {
            nbt = p.getEntityData();
        }
        return nbt;
    }

    public boolean addInstance(Class cl, boolean b) {
        absorptionListResults.put(cl, b);
        return b;
    }

    public boolean instanceOf(Entity entity) {
        if (JGConfigRaces.CONFIG_MAJIN_ENTITY_BLACKLIST.size() == 0) {
            return false;
        }
        Class<?> entityClass = entity.getClass();
        if (absorptionListResults != null && absorptionListResults.size() > 0 && absorptionListResults.containsKey(entityClass)) {
            return absorptionListResults.get(entityClass);
        }
        String name = entityClass.toString();
        try {
            if (JGConfigRaces.CONFIG_MAJIN_ENTITY_BLACKLIST.containsKey(name)) {
                return this.addInstance(entityClass, true);
            }
            for (String key : JGConfigRaces.CONFIG_MAJIN_ENTITY_BLACKLIST.keySet()) {
                Class<?> cl;
                if (!JRMCoreH.DBC() && key.startsWith("JinRyuu.DragonBC") || !JRMCoreH.NC() && key.startsWith("JinRyuu.NarutoC") || !(cl = Class.forName(key)).isAssignableFrom(entityClass)) continue;
                return this.addInstance(entityClass, true);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return this.addInstance(entityClass, false);
    }

    public boolean isEntityOnTheBlacklist(Entity entity) {
        return this.instanceOf(entity);
    }
}

