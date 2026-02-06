/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.NarutoC.common.NCJutsus
 *  cpw.mods.fml.common.FMLCommonHandler
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
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.Ds;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntityCusPar;
import JinRyuu.JRMCore.entity.EntityEnAttacks;
import JinRyuu.JRMCore.entity.EntityEnergyAttJ2;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.server.JGMathHelper;
import JinRyuu.JRMCore.server.JGPlayerClientServerHelper;
import JinRyuu.NarutoC.common.NCJutsus;
import cpw.mods.fml.common.FMLCommonHandler;
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
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EntityEnergyAttJ
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
    private int ticksInAir = 0;
    private double damage = 1.0;
    private int knockbackStrength;
    private float explevel;
    private String DBCExplSound = "jinryuudragonbc:DBC.expl";
    private String NCExplSound = "jinryuunarutoc:NC1.Explosion";
    private float strtX;
    private float strtY;
    private float strtZ;
    private float trgtX = 0.0f;
    private float trgtY = 0.0f;
    private float trgtZ = 0.0f;
    private byte type;
    private byte speed;
    private int dam;
    private byte perc;
    private byte pmjID;
    private short effect;
    private int color;
    private byte density;
    private short sincantation;
    private short sfire;
    private short smove;
    private byte align;
    private float size;
    private int conn;
    private int waveCount = 20;
    private byte wave = 0;
    private Entity target;
    private int cost;
    private int costPerc;
    private int originDmg;
    public boolean shrink = false;
    private int pwrtyp = 0;
    private String nameJutsu;
    private boolean givenExp = false;
    public double motionXStart;
    public double motionYStart;
    public double motionZStart;
    public float minScale;
    public float maxScale;
    public float maxDamage;
    public boolean added = false;
    public int animation_speed = 0;
    public long animation_start = 0L;
    public int animation_id = 0;
    public int animation_id_Max = 0;
    public int animation_random_Max = 0;
    public ArrayList<Integer> animation_random = new ArrayList();
    public float render_scale = 0.0f;
    public float render_scale_max = 2.0f;
    public double dist = 0.0;
    public boolean shooterHolds;
    public boolean hadTarget = false;
    public boolean added2 = false;
    public long animation_start2 = 0L;
    public float waveScale = 1.0f;
    public double finalDist = 0.0;
    public int lastSegments = 0;
    private boolean run = true;
    public float startRotationPitch = 0.0f;
    public float startRotationYaw = 0.0f;

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

    public float getScale() {
        float damage = this.originDmg;
        byte perc = this.getPerc();
        byte den = this.getDen();
        float scale = JRMCoreH.calculateEnergyScale(damage, this.maxDamage, perc, null, den, this.minScale, this.maxScale);
        return scale;
    }

    public void setScales() {
        this.minScale = (float)JRMCoreConfig.JutsuSizeMin[this.getType()];
        this.maxScale = (float)JRMCoreConfig.JutsuSizeMax[this.getType()];
        this.maxDamage = JRMCoreH.getMaxEnergyDamage();
    }

    public float setScalesPost() {
        if (this.isWave()) {
            return 100.0f;
        }
        if (this.isBlast()) {
            return 5.0f;
        }
        if (this.isDisk()) {
            return 5.0f;
        }
        return 1.0f;
    }

    public float getSize() {
        return this.size;
    }

    private void shrinkWave() {
        JRMCoreH.setByte(0, (EntityPlayer)this.shootingEntity, "jrmcFrng");
        if (!this.shrink) {
            this.shrink();
        }
    }

    private void shrink() {
        this.shrink = true;
        this.getDataWatcher().updateObject(20, (Object)1);
    }

    public boolean isContinuesWave() {
        return this.getType() >= JRMCoreConfig.ContinuesJutsuAttacks.length ? false : JRMCoreConfig.ContinuesJutsuAttacks[this.getType()];
    }

    public int getShrink() {
        return this.getDataWatcher().getWatchableObjectInt(20);
    }

    public byte getType() {
        return this.type;
    }

    public int getCol() {
        return this.color;
    }

    public byte getSpe() {
        return this.speed;
    }

    public int getDam() {
        return this.dam;
    }

    public byte getDen() {
        return this.density;
    }

    public byte getPerc() {
        return this.perc;
    }

    public float getSizePerc() {
        return this.size;
    }

    public int getAirTicks() {
        return this.ticksInAir;
    }

    public short getEff() {
        return this.effect;
    }

    public void setAirTicks(int i) {
        this.ticksInAir = i;
    }

    public EntityEnergyAttJ(World par1World) {
        super(par1World);
        this.setSize(this.size, this.size);
    }

    public EntityEnergyAttJ(EntityLivingBase par2EntityLivingBase, byte type, float speed, int dam, byte effect, byte color, byte density, byte sincantation, byte sfire, byte smove, byte perc, int dam1, int cost, int costPerc) {
        super(par2EntityLivingBase.worldObj);
        Vec3 vec3;
        float size1;
        this.type = type;
        this.shooterHolds = this.isContinuesWave();
        this.speed = (byte)((speed + 1.0f) * 10.0f + (float)(type == 2 ? 10 : 0) + (float)(density == 2 ? 40 : 0));
        this.dam = dam;
        this.perc = (byte)50;
        this.effect = effect;
        this.color = JRMCoreH.techNCCol[effect];
        this.density = density;
        this.sincantation = sincantation;
        this.sfire = sfire;
        this.smove = smove;
        this.cost = cost;
        this.costPerc = costPerc;
        this.originDmg = dam1;
        this.pmjID = perc;
        if (this.pmjID != -1) {
            this.nameJutsu = JRMCoreH.trl("nc", JRMCoreH.pmj[this.pmjID][0]);
        }
        this.damage = (double)this.dam * (double)this.perc * (double)0.02f;
        if (this.getType() < 3) {
            this.setScales();
            size1 = this.getScale();
        } else {
            size1 = 1.0f;
        }
        this.size = 0.5f + size1;
        if (JRMCoreConfig.JutsuScalesWithUser) {
            this.size *= this.shootingEntity == null ? 1.0f : this.shootingEntity.height / 1.8f;
        }
        this.shootingEntity = par2EntityLivingBase;
        this.pwrtyp = 0;
        if (this.shootingEntity instanceof EntityPlayer) {
            this.pwrtyp = JRMCoreH.PlyrPwr((EntityPlayer)this.shootingEntity);
        }
        this.explevel = effect;
        this.renderDistanceWeight = 10.0;
        this.setSize(this.size, this.size);
        double d8 = par2EntityLivingBase.width + 1.0f + 0.3f;
        double d9 = ((EntityLivingBase)this.shootingEntity).height + ((EntityLivingBase)this.shootingEntity).height * 0.2f;
        if (this.shootingEntity instanceof EntityPlayer) {
            vec3 = this.shootingEntity.getLookVec();
        } else {
            float rotationYaw = this.shootingEntity.getRotationYawHead();
            float rotationPitch = this.shootingEntity.rotationPitch;
            float vx = -MathHelper.sin((float)this.rad(rotationYaw)) * MathHelper.cos((float)this.rad(rotationPitch));
            float vz = MathHelper.cos((float)this.rad(rotationYaw)) * MathHelper.cos((float)this.rad(rotationPitch));
            float vy = -MathHelper.sin((float)this.rad(rotationPitch));
            vec3 = Vec3.createVectorHelper((double)vx, (double)vy, (double)vz);
        }
        double x = par2EntityLivingBase.posX + vec3.xCoord * d8;
        double y = par2EntityLivingBase.posY + vec3.yCoord * d8 + (double)(par2EntityLivingBase.height * 0.7f);
        double z = par2EntityLivingBase.posZ + vec3.zCoord * d8;
        this.setLocationAndAngles(x, y, z, par2EntityLivingBase.rotationYaw, par2EntityLivingBase.rotationPitch);
        this.yOffset = this.size * 0.5f;
        this.motionX = -MathHelper.sin((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionZ = MathHelper.cos((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionY = -MathHelper.sin((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, (float)this.speed * 0.05f, 1.0f);
        this.strtX = (float)x;
        this.strtY = (float)y;
        this.strtZ = (float)z;
        this.motionXStart = this.motionX;
        this.motionYStart = this.motionY;
        this.motionZStart = this.motionZ;
    }

    @Override
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
        byte b;
        float DEAD_DIFFERENCE;
        double kulz;
        double kuly;
        double kulx;
        double kiZ;
        double kiY;
        double kiX;
        double y;
        if ((JGConfigClientSettings.configsChanged || this.run) && this.worldObj.isRemote && !this.isDead) {
            this.ignoreFrustumCheck = JGConfigClientSettings.renderEnergyOutsideView;
        }
        if (this.isContinuesWave() && this.shooterHolds) {
            this.generateParticles(this, this.shootingEntity, this.color, true);
        }
        this.generateParticles(this, this, this.color, false);
        if (!this.run) {
            if (this.rotationPitch != this.startRotationPitch) {
                this.rotationPitch = this.startRotationPitch;
            }
            if (this.rotationYaw != this.startRotationYaw) {
                this.rotationYaw = this.startRotationYaw;
            }
        }
        boolean ROTATION_RELATED = true;
        if (this.run) {
            this.startRotationPitch = this.rotationPitch;
            this.startRotationYaw = this.rotationYaw;
            this.shooterHolds = this.isContinuesWave();
            if (this.shootingEntity != null && this.shootingEntity instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer)this.shootingEntity;
                ExtendedPlayer.get(player).setAnimKiShootOn(0);
            }
            this.run = false;
        }
        if (!this.worldObj.isRemote && this.isContinuesWave() && this.target != null && !this.target.isDead && !this.shooterHolds && JGMathHelper.isMotionSmallerThanN(this, 0.001)) {
            this.setDead();
        }
        if (JRMCoreConfig.WavesShrinkOnceLetGo) {
            if (this.shootingEntity != null && this.shootingEntity instanceof EntityPlayer && this.isContinuesWave() && this.shooterHolds) {
                double kulz2;
                double kuly2;
                double kulx2;
                double kiZ2;
                double kiY2;
                double kiX2;
                double d8 = ((EntityLivingBase)this.shootingEntity).width + 1.0f + 0.3f;
                double d9 = ((EntityLivingBase)this.shootingEntity).height + ((EntityLivingBase)this.shootingEntity).height * 0.2f;
                Vec3 vec3 = this.shootingEntity.getLookVec();
                double x = this.shootingEntity.posX + vec3.xCoord * d8;
                double y2 = this.shootingEntity.posY + vec3.yCoord * d8 + (double)(this.shootingEntity.height * 0.7f) + (double)(this.worldObj.isRemote ? JGPlayerClientServerHelper.clientPlayerPositioner(this.shootingEntity) : 0.0f);
                double z = this.shootingEntity.posZ + vec3.zCoord * d8;
                if (x < 0.0) {
                    x *= -1.0;
                }
                if (y2 < 0.0) {
                    y2 *= -1.0;
                }
                if (z < 0.0) {
                    z *= -1.0;
                }
                if ((kiX2 = (double)this.strtX) < 0.0) {
                    kiX2 *= -1.0;
                }
                if ((kiY2 = (double)this.strtY) < 0.0) {
                    kiY2 *= -1.0;
                }
                if ((kiZ2 = (double)this.strtZ) < 0.0) {
                    kiZ2 *= -1.0;
                }
                if ((kulx2 = x - kiX2) < 0.0) {
                    kulx2 *= -1.0;
                }
                if ((kuly2 = y2 - kiY2) < 0.0) {
                    kuly2 *= -1.0;
                }
                if ((kulz2 = z - kiZ2) < 0.0) {
                    kulz2 *= -1.0;
                }
                float DEAD_DIFFERENCE2 = 0.2f;
                float DEAD_DIFFERENCE22 = 1.0f;
                if (kulx2 > (double)0.2f || kuly2 > 1.0 || kulz2 > (double)0.2f) {
                    this.shooterHolds = false;
                    EntityPlayer player = (EntityPlayer)this.shootingEntity;
                    ExtendedPlayer.get(player).setAnimKiShoot(0);
                    if (!this.worldObj.isRemote) {
                        JRMCoreH.setByte(0, (EntityPlayer)this.shootingEntity, "jrmcFrng");
                        this.shrinkWave();
                    } else {
                        JRMCoreH.isShtng = false;
                    }
                }
            }
        } else if (this.shootingEntity != null && this.shootingEntity instanceof EntityPlayer && this.isContinuesWave() && this.shooterHolds) {
            double x = this.strtX;
            y = this.strtY;
            double z = this.strtZ;
            if (x < 0.0) {
                x *= -1.0;
            }
            if (y < 0.0) {
                y *= -1.0;
            }
            if (z < 0.0) {
                z *= -1.0;
            }
            if ((kiX = this.shootingEntity.posX) < 0.0) {
                kiX *= -1.0;
            }
            if ((kiY = this.shootingEntity.posY + (double)(this.worldObj.isRemote ? JGPlayerClientServerHelper.clientPlayerPositioner(this.shootingEntity) : 0.0f)) < 0.0) {
                kiY *= -1.0;
            }
            if ((kiZ = this.shootingEntity.posZ) < 0.0) {
                kiZ *= -1.0;
            }
            if ((kulx = x - kiX) < 0.0) {
                kulx *= -1.0;
            }
            if ((kuly = y - kiY) < 0.0) {
                kuly *= -1.0;
            }
            if ((kulz = z - kiZ) < 0.0) {
                kulz *= -1.0;
            }
            DEAD_DIFFERENCE = 3.0f;
            if (kulx > 3.0 || kuly > 3.0 || kulz > 3.0) {
                this.shooterHolds = false;
                EntityPlayer player = (EntityPlayer)this.shootingEntity;
                ExtendedPlayer.get(player).setAnimKiShoot(0);
                if (!this.worldObj.isRemote) {
                    JRMCoreH.setByte(0, (EntityPlayer)this.shootingEntity, "jrmcFrng");
                } else {
                    JRMCoreH.isShtng = false;
                }
            }
        }
        if (!this.worldObj.isRemote && this.isContinuesWave() && JRMCoreConfig.ContinuesEnergyAttackEnemyLock && this.target != null && !this.target.isDead && this.shooterHolds) {
            double x = this.posX;
            y = this.posY;
            double z = this.posZ;
            if (x < 0.0) {
                x *= -1.0;
            }
            if (y < 0.0) {
                y *= -1.0;
            }
            if (z < 0.0) {
                z *= -1.0;
            }
            if ((kiX = this.target.posX) < 0.0) {
                kiX *= -1.0;
            }
            if ((kiY = this.target.posY) < 0.0) {
                kiY *= -1.0;
            }
            if ((kiZ = this.target.posZ) < 0.0) {
                kiZ *= -1.0;
            }
            if ((kulx = x - kiX) < 0.0) {
                kulx *= -1.0;
            }
            if ((kuly = y - kiY) < 0.0) {
                kuly *= -1.0;
            }
            if ((kulz = z - kiZ) < 0.0) {
                kulz *= -1.0;
            }
            DEAD_DIFFERENCE = 0.5f;
            if (kulx > 0.5 || kuly > 0.5 || kulz > 0.5) {
                this.target.posX = x;
                this.target.posY = y;
                this.target.posZ = z;
                this.target.posX = this.posX;
                this.target.posY = this.posY;
                this.target.posZ = this.posZ;
                this.target.motionX = this.motionX;
                this.target.motionY = this.motionY;
                this.target.motionZ = this.motionZ;
            }
        }
        if (!this.worldObj.isRemote && this.isContinuesWave() && JRMCoreConfig.ContinuesEnergyAttackTargetSlowdown && JRMCoreConfig.ContinuesEnergyAttackMoveOnLostTarget && this.target != null && !this.target.isDead && this.shooterHolds && JGMathHelper.isMotionSmallerThanN(this, 0.001)) {
            double x = this.posX;
            y = this.posY;
            double z = this.posZ;
            if (x < 0.0) {
                x *= -1.0;
            }
            if (y < 0.0) {
                y *= -1.0;
            }
            if (z < 0.0) {
                z *= -1.0;
            }
            if ((kiX = this.target.posX) < 0.0) {
                kiX *= -1.0;
            }
            if ((kiY = this.target.posY) < 0.0) {
                kiY *= -1.0;
            }
            if ((kiZ = this.target.posZ) < 0.0) {
                kiZ *= -1.0;
            }
            if ((kulx = x - kiX) < 0.0) {
                kulx *= -1.0;
            }
            if ((kuly = y - kiY) < 0.0) {
                kuly *= -1.0;
            }
            if ((kulz = z - kiZ) < 0.0) {
                kulz *= -1.0;
            }
            if (kulx > (double)(DEAD_DIFFERENCE = this.size + 1.0f) || kuly > (double)DEAD_DIFFERENCE || kulz > (double)DEAD_DIFFERENCE) {
                this.target = null;
                this.hadTarget = false;
                this.motionX = this.motionXStart;
                this.motionY = this.motionYStart;
                this.motionZ = this.motionZStart;
            }
        }
        if (!this.worldObj.isRemote && JRMCoreConfig.WavesDieWhenTargetAway && this.shootingEntity != null && this.target != null && this.shootingEntity instanceof EntityPlayer && this.isContinuesWave()) {
            double x = this.posX;
            y = this.posY;
            double z = this.posZ;
            if (x < 0.0) {
                x *= -1.0;
            }
            if (y < 0.0) {
                y *= -1.0;
            }
            if (z < 0.0) {
                z *= -1.0;
            }
            if ((kiX = this.target.posX) < 0.0) {
                kiX *= -1.0;
            }
            if ((kiY = this.target.posY) < 0.0) {
                kiY *= -1.0;
            }
            if ((kiZ = this.target.posZ) < 0.0) {
                kiZ *= -1.0;
            }
            if ((kulx = x - kiX) < 0.0) {
                kulx *= -1.0;
            }
            if ((kuly = y - kiY) < 0.0) {
                kuly *= -1.0;
            }
            if ((kulz = z - kiZ) < 0.0) {
                kulz *= -1.0;
            }
            if (kulx > (double)(DEAD_DIFFERENCE = this.size + 1.0f) || kuly > (double)DEAD_DIFFERENCE || kulz > (double)DEAD_DIFFERENCE) {
                if (this.type >= 0 && this.type < 2) {
                    if (this.height > 1.5f) {
                        this.createExplosion(0);
                    }
                    this.worldObj.playSoundAtEntity((Entity)this, this.pwrtyp == 1 ? this.DBCExplSound : (this.pwrtyp == 2 ? this.NCExplSound : ""), 1.0f, 1.0f);
                }
                this.setDead();
            }
        }
        if (!this.worldObj.isRemote && this.shootingEntity == null) {
            this.setDead();
        }
        if (!this.worldObj.isRemote && this.shootingEntity == null) {
            this.setDead();
        }
        if (!this.worldObj.isRemote && this.isContinuesWave() && this.shootingEntity != null && this.shootingEntity instanceof EntityPlayer && (b = JRMCoreH.getByte((EntityPlayer)this.shootingEntity, "jrmcFrng")) == 0 && !this.shrink && JRMCoreConfig.WavesShrinkOnceLetGo) {
            this.shrink();
        }
        if (!this.worldObj.isRemote && this.isContinuesWave() && this.hadTarget && (this.target == null || this.target.isDead)) {
            this.setDead();
        }
        if (this.isContinuesWave() && this.target != null) {
            if (JRMCoreConfig.ContinuesEnergyAttackTargetSlowdown) {
                this.motionX *= (double)0.05f;
                this.motionY *= (double)0.05f;
                this.motionZ *= (double)0.05f;
                this.target.motionX *= (double)0.05f;
                this.target.motionY *= (double)0.05f;
                this.target.motionZ *= (double)0.05f;
            } else {
                this.target.motionX = this.motionX;
                this.target.motionY = this.motionY;
                this.target.motionZ = this.motionZ;
                this.target.posX = this.posX;
                this.target.posY = this.posY;
                this.target.posZ = this.posZ;
            }
        }
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
                        if (this.type >= 0 && this.type < 2) {
                            if (this.height > 1.5f) {
                                this.createExplosion(0);
                            }
                            this.worldObj.playSoundAtEntity((Entity)this, this.pwrtyp == 1 ? this.DBCExplSound : (this.pwrtyp == 2 ? this.NCExplSound : ""), 1.0f, 1.0f);
                        }
                        if (this.density == 2) {
                            EntityPlayer shtr = (EntityPlayer)this.shootingEntity;
                            shtr.addChatMessage((IChatComponent)new ChatComponentText(JRMCoreH.cly + this.nameJutsu + " failed!"));
                        }
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
            int test;
            ++this.ticksInAir;
            Vec3 var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            Vec3 var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            MovingObjectPosition var4 = this.worldObj.func_147447_a(var17, var3, false, true, false);
            var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            if (!this.worldObj.isRemote && ((float)this.ticksInAir >= (float)JRMCoreConfig.EnergyAttackMaxLifeTickPercMulti * ((float)this.perc * 0.02f) || this.ticksInAir >= JRMCoreConfig.EnergyAttackMaxLifeTick)) {
                this.setDead();
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
                    float var11;
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
            }
            if (this.motionX <= 0.01 && this.motionY <= 0.01 && this.motionZ <= 0.01 && this.motionX >= -0.01 && this.motionY >= -0.01 && this.motionZ >= -0.01 && !this.shrink && !this.isContinuesWave()) {
                this.shrink();
            }
            if (!this.worldObj.isRemote) {
                Object var5 = null;
                AxisAlignedBB aabb = this.boundingBox.copy();
                List var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, aabb);
                for (int var9 = 0; var9 < var6.size(); ++var9) {
                    int td;
                    float res;
                    float calc;
                    float power;
                    float spet;
                    float den;
                    Entity var10 = (Entity)var6.get(var9);
                    if (var10 == this.shootingEntity) continue;
                    if (this.isContinuesWave() && var10 instanceof EntityLivingBase) {
                        if (var4 == null) {
                            var4 = new MovingObjectPosition(var10);
                        }
                        if (this.target != null) continue;
                        this.target = var10;
                        continue;
                    }
                    if (this.isContinuesWave() && this.wave > 0 && this.shootingEntity instanceof EntityPlayer) {
                        this.shrinkWave();
                        continue;
                    }
                    if (!(var10 instanceof EntityEnAttacks) && var10 != this.shootingEntity) {
                        if (this.type < 0 || this.type >= 2 || !(this.height > 1.5f)) continue;
                        this.createExplosion(0);
                        this.setDead();
                        continue;
                    }
                    if (var10 instanceof EntityEnergyAttJ) {
                        int td2;
                        EntityEnergyAttJ t = (EntityEnergyAttJ)var10;
                        int d = (int)t.getDamage();
                        short eff = t.getEff();
                        int ad = JRMCoreH.cbadmg(this.effect, this.dam, eff, d);
                        if (ad == (td2 = JRMCoreH.cbtdmg(this.effect, this.dam, eff, d))) {
                            this.setDead();
                        }
                        if (td2 == 0) {
                            t.setDead();
                        } else {
                            t.setDamage(td2);
                        }
                        float dam = (float)(t.getDamage() / 2.0);
                        float spe = (float)t.getSpe() * 2.0f;
                        den = (float)t.getDen() * 10.0f;
                        float damt = (float)(this.damage / 2.0);
                        spet = (float)this.speed * 2.0f;
                        float dent = (float)this.density * 10.0f;
                        power = damt - dam + (spe - spet) + (dent - den);
                        calc = 1.0f - power * 0.01f;
                        if (this.conn == 0) {
                            ++this.conn;
                        }
                        if (this.conn != 1) continue;
                        if (power > 0.0f) {
                            int exp;
                            res = ((damt - dam) / damt + (spe - spet) / spe + (dent - den) / dent) / 3.0f;
                            this.motionX *= (double)res;
                            this.motionY *= (double)res;
                            this.motionZ *= (double)res;
                            t.motionX = this.motionX;
                            t.motionY = this.motionY;
                            t.motionZ = this.motionZ;
                            int n = exp = t.getAirTicks() < this.ticksInAir ? t.getAirTicks() : this.ticksInAir;
                            if (t.getAirTicks() < this.ticksInAir) {
                                this.ticksInAir = t.getAirTicks();
                            }
                        }
                        this.conn = 2;
                        continue;
                    }
                    if (!(var10 instanceof EntityEnergyAttJ2)) continue;
                    EntityEnergyAttJ2 t = (EntityEnergyAttJ2)var10;
                    int d = (int)t.getDamage();
                    short eff = t.getEff();
                    int ad = JRMCoreH.cbadmg(this.effect, this.dam, eff, d);
                    if (ad == (td = JRMCoreH.cbtdmg(this.effect, this.dam, eff, d))) {
                        this.setDead();
                    }
                    if (td == 0) {
                        t.setDead();
                    } else {
                        t.setDamage(td);
                    }
                    float dam = (float)(t.getDamage() / 2.0);
                    float spe = t.getSpe() * 2.0f;
                    den = (float)t.getDen() * 10.0f;
                    float damt = (float)(this.damage / 2.0);
                    spet = (float)this.speed * 2.0f;
                    float dent = (float)this.density * 10.0f;
                    power = damt - dam + (spe - spet) + (dent - den);
                    calc = 1.0f - power * 0.01f;
                    if (this.conn == 0) {
                        ++this.conn;
                    }
                    if (this.conn != 1) continue;
                    if (power > 0.0f) {
                        int exp;
                        res = ((damt - dam) / damt + (spe - spet) / spe + (dent - den) / dent) / 3.0f;
                        this.motionX *= (double)res;
                        this.motionY *= (double)res;
                        this.motionZ *= (double)res;
                        t.motionX = this.motionX;
                        t.motionY = this.motionY;
                        t.motionZ = this.motionZ;
                        int n = exp = t.getAirTicks() < this.ticksInAir ? t.getAirTicks() : this.ticksInAir;
                        if (t.getAirTicks() < this.ticksInAir) {
                            this.ticksInAir = t.getAirTicks();
                        }
                    }
                    this.conn = 2;
                }
            }
            if (var4 != null && var4.entityHit != this.shootingEntity) {
                if (var4.entityHit != null && (this.shootingEntity instanceof EntityPlayer || var4.entityHit instanceof EntityPlayer) && this.isContinuesWave() && this.shooterHolds) {
                    if (this.shootingEntity instanceof EntityPlayer) {
                        this.trgtX = (float)this.posX;
                        this.trgtY = (float)this.posY;
                        this.trgtZ = (float)this.posZ;
                        byte b2 = JRMCoreH.getByte((EntityPlayer)this.shootingEntity, "jrmcFrng");
                        if (b2 == 1) {
                            if (this.target != null) {
                                if (this.waveCount == 20) {
                                    this.wave = (byte)(this.wave + 1);
                                    if (JRMCoreConfig.ContinuesEnergyAttackTimer == 0 && this.wave > 2) {
                                        this.wave = (byte)2;
                                    }
                                    if (!this.worldObj.isRemote) {
                                        float cost2;
                                        EntityPlayer Player = (EntityPlayer)this.shootingEntity;
                                        byte curRel = JRMCoreH.getByte(Player, "jrmcRelease");
                                        int curEn = JRMCoreH.getInt(Player, "jrmcEnrgy");
                                        if (!((float)curEn - (cost2 = (float)((double)this.cost * (double)curRel * (double)0.01f * (double)((float)this.perc * 0.02f))) > 0.0f)) {
                                            this.setDead();
                                        }
                                        if (cost2 < (float)curEn) {
                                            if (!JRMCoreH.isInCreativeMode(this.shootingEntity)) {
                                                JRMCoreH.setInt((float)curEn - cost2, Player, "jrmcEnrgy");
                                            }
                                            this.damage = (double)this.originDmg * (double)curRel * (double)0.01f * (double)this.perc * (double)0.02f * JRMCoreConfig.dat5696[this.type][1];
                                        } else {
                                            this.setDead();
                                        }
                                    }
                                    int var23 = (int)this.damage;
                                    DamageSource damagesource = Ds.causeEntityEnergyAttDamage(this, this.shootingEntity);
                                    if (this.target.attackEntityFrom(damagesource, (float)var23)) {
                                        // empty if block
                                    }
                                    if (JRMCoreConfig.ContinuesEnergyAttackTargetSlowdown) {
                                        this.motionX *= (double)0.05f;
                                        this.motionY *= (double)0.05f;
                                        this.motionZ *= (double)0.05f;
                                        this.target.motionX *= (double)0.05f;
                                        this.target.motionY *= (double)0.05f;
                                        this.target.motionZ *= (double)0.05f;
                                    } else {
                                        this.target.motionX = this.motionX;
                                        this.target.motionY = this.motionY;
                                        this.target.motionZ = this.motionZ;
                                        this.target.posX = this.posX;
                                        this.target.posY = this.posY;
                                        this.target.posZ = this.posZ;
                                    }
                                }
                                this.target.motionX = this.motionX;
                                this.target.motionY = this.motionY;
                                this.target.motionZ = this.motionZ;
                            }
                            --this.waveCount;
                            if (this.waveCount <= 0) {
                                this.waveCount = 20;
                            }
                            if (JRMCoreConfig.ContinuesEnergyAttackTimer > 0 && this.wave >= JRMCoreConfig.ContinuesEnergyAttackTimer) {
                                this.setDead();
                            }
                        } else {
                            this.shrinkWave();
                        }
                    }
                    if (var4.entityHit instanceof EntityLivingBase) {
                        this.setTarget(var4.entityHit);
                    } else {
                        this.shrinkWave();
                    }
                } else if (var4.entityHit != null && this.isContinuesWave()) {
                    if (var4.entityHit instanceof EntityLivingBase) {
                        this.target = var4.entityHit;
                    } else {
                        this.shrinkWave();
                    }
                } else if (var4.entityHit != null) {
                    float var20 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ));
                    int var23 = (int)this.damage;
                    if (this.density == 2 && this.shootingEntity != null) {
                        var23 = 0;
                        if (!this.worldObj.isRemote && var4.entityHit instanceof EntityPlayer) {
                            MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
                            EntityPlayer Player = (EntityPlayer)var4.entityHit;
                            int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts(Player);
                            String[] PlyrSkills = JRMCoreH.getString(Player, "jrmcSSlts").split(",");
                            int t = this.dam;
                            int t2 = t > 30 ? 30 : (t < 1 ? 1 : t);
                            NCJutsus.wgi((MinecraftServer)server, (String)("1;" + this.pmjID + ";" + this.dam + ";" + t2 + ";" + t2), (String)Player.getCommandSenderName(), (boolean)false);
                            EntityPlayer shtr = (EntityPlayer)this.shootingEntity;
                            shtr.addChatMessage((IChatComponent)new ChatComponentText(JRMCoreH.cly + "Target " + Player.getCommandSenderName() + " under the effect of " + this.nameJutsu));
                        }
                    } else if (this.density == 2) {
                        this.setDead();
                    }
                    if (JRMCoreH.DGE(var4.entityHit) && !this.givenExp) {
                        JRMCoreH.jrmcExp(this.shootingEntity, 1, this.getType());
                        this.givenExp = true;
                    }
                    DamageSource damagesource = null;
                    if (this.shootingEntity == null) {
                        this.setDead();
                    } else {
                        damagesource = Ds.causeEntityEnergyAttDamage(this, this.shootingEntity);
                    }
                    if (this.isBurning()) {
                        var4.entityHit.setFire(5);
                    }
                    if (this.density != 2 && var4.entityHit.attackEntityFrom(damagesource, (float)var23)) {
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
                        if (this.type >= 0 && this.type <= 2 && this.height > 1.5f) {
                            this.createExplosion(0);
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
                    float var20 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ));
                    this.posX -= this.motionX / (double)var20 * (double)0.05f;
                    this.posY -= this.motionY / (double)var20 * (double)0.05f;
                    this.posZ -= this.motionZ / (double)var20 * (double)0.05f;
                    this.inGround = true;
                    if (this.inTile.getMaterial() != Material.air) {
                        this.inTile.onEntityCollidedWithBlock(this.worldObj, this.xTile, this.yTile, this.zTile, (Entity)this);
                    }
                }
            }
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            for (test = 0; this.rotationPitch - this.prevRotationPitch >= 180.0f && test < 20; ++test) {
                this.prevRotationPitch += 360.0f;
            }
            for (test = 0; this.rotationYaw - this.prevRotationYaw < -180.0f && test < 20; ++test) {
                this.prevRotationYaw -= 360.0f;
            }
            for (test = 0; this.rotationYaw - this.prevRotationYaw >= 180.0f && test < 20; ++test) {
                this.prevRotationYaw += 360.0f;
            }
            float var22 = 1.0f;
            float var11 = 0.0f;
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
            this.doBlockCollisions();
        }
        if (this.worldObj.isRemote && this.isDead && this.shootingEntity != null && this.shootingEntity instanceof EntityPlayer && this.shooterHolds) {
            EntityPlayer player = (EntityPlayer)this.shootingEntity;
            ExtendedPlayer.get(player).setAnimKiShoot(0);
            this.shrinkWave();
        }
    }

    public void setDead() {
        super.setDead();
        if (this.worldObj.isRemote && this.worldObj.isRemote && this.isDead && this.shootingEntity != null && this.shootingEntity instanceof EntityPlayer && this.shooterHolds) {
            EntityPlayer player = (EntityPlayer)this.shootingEntity;
            ExtendedPlayer.get(player).setAnimKiShoot(0);
            this.shrinkWave();
            JRMCoreH.isShtng = false;
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
    public void writeEntityToNBT(NBTTagCompound nbt) {
        nbt.setShort("xTile", (short)this.xTile);
        nbt.setShort("yTile", (short)this.yTile);
        nbt.setShort("zTile", (short)this.zTile);
        nbt.setByte("inTile", (byte)Block.getIdFromBlock((Block)this.inTile));
        nbt.setByte("inData", (byte)this.inData);
        nbt.setByte("inGround", (byte)(this.inGround ? 1 : 0));
        nbt.setDouble("damage", this.damage);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbt) {
        this.xTile = nbt.getShort("xTile");
        this.yTile = nbt.getShort("yTile");
        this.zTile = nbt.getShort("zTile");
        this.inTile = Block.getBlockById((int)(nbt.getByte("inTile") & 0xFF));
        this.inData = nbt.getByte("inData") & 0xFF;
        boolean bl = this.inGround = nbt.getByte("inGround") == 1;
        if (nbt.hasKey("damage")) {
            this.damage = nbt.getDouble("damage");
        }
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

    public boolean isEntityApplicable(Entity var1) {
        return false;
    }

    public void writeSpawnData(ByteBuf data) {
        data.writeInt(this.shootingEntity == null ? 0 : this.shootingEntity.getEntityId());
        data.writeInt(this.target == null ? 0 : this.target.getEntityId());
        data.writeByte((int)this.perc);
        data.writeByte((int)this.type);
        data.writeInt(this.color);
        data.writeInt(this.dam);
        data.writeByte((int)this.density);
        data.writeShort((int)this.sincantation);
        data.writeShort((int)this.sfire);
        data.writeShort((int)this.smove);
        data.writeFloat(this.strtX);
        data.writeFloat(this.strtY);
        data.writeFloat(this.strtZ);
        data.writeFloat(this.size);
        data.writeFloat(this.trgtX);
        data.writeFloat(this.trgtY);
        data.writeFloat(this.trgtZ);
        data.writeByte(this.shrink ? 1 : 0);
        data.writeShort((int)this.effect);
        data.writeDouble(this.damage);
    }

    public void readSpawnData(ByteBuf data) {
        int first = data.readInt();
        this.shootingEntity = first == 0 ? this.shootingEntity : this.worldObj.getEntityByID(first);
        int second = data.readInt();
        this.target = first == 0 ? this.target : this.worldObj.getEntityByID(second);
        this.perc = data.readByte();
        this.type = data.readByte();
        this.color = data.readInt();
        this.dam = data.readInt();
        this.density = data.readByte();
        this.sincantation = data.readShort();
        this.sfire = data.readShort();
        this.smove = data.readShort();
        this.strtX = data.readFloat();
        this.strtY = data.readFloat();
        this.strtZ = data.readFloat();
        this.size = data.readFloat();
        this.trgtX = data.readFloat();
        this.trgtY = data.readFloat();
        this.trgtZ = data.readFloat();
        this.shrink = data.readByte() == 1;
        this.effect = data.readShort();
        this.damage = data.readDouble();
    }

    public boolean isWave() {
        return this.getType() == 0;
    }

    public boolean isBlast() {
        return this.getType() == 1;
    }

    public boolean isDisk() {
        return this.getType() == 2;
    }

    public boolean isFireElement() {
        return this.getEff() == 0;
    }

    public boolean isWindElement() {
        return this.getEff() == 1;
    }

    public boolean isLightningElement() {
        return this.getEff() == 2;
    }

    public boolean isEarthElement() {
        return this.getEff() == 3;
    }

    public boolean isWaterElement() {
        return this.getEff() == 4;
    }

    private void createExplosion(int type) {
        JRMCoreH.newExpl(this.worldObj, this, this.posX, this.posY, this.posZ, this.size, false, this.damage, this.shootingEntity, (byte)type);
    }

    private void setTarget(Entity entity) {
        this.target = entity;
        this.hadTarget = true;
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

    public void generateParticles(EntityEnergyAttJ entityBlast, Entity entity, int color, boolean startSpawn) {
        if (entityBlast != null && entity != null && entityBlast.worldObj.isRemote) {
            for (int i = 0; i < 3; ++i) {
                for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                    double z2;
                    double y2;
                    double x2;
                    float green2;
                    float blue2;
                    float colorFixer = 0.7f;
                    float red = (float)(color >> 16 & 0xFF) / 255.0f;
                    float green = (float)(color >> 8 & 0xFF) / 255.0f;
                    float blue = (float)(color & 0xFF) / 255.0f;
                    red *= 0.7f;
                    green *= 0.7f;
                    blue *= 0.7f;
                    float red2 = red * 2.0f;
                    if (red2 > 1.0f) {
                        red2 = 1.0f;
                    }
                    if ((blue2 = blue * 2.0f) > 1.0f) {
                        blue2 = 1.0f;
                    }
                    if ((green2 = green * 2.0f) > 1.0f) {
                        green2 = 1.0f;
                    }
                    float alpha = 1.0f;
                    float out = 1.0f;
                    float in = 1.5f;
                    float life = 0.4f * entity.height;
                    float extra_scale = 0.3f;
                    int dea = 30;
                    float target_fullsize_one1 = 0.32f;
                    float targetsizeMin = entity.height * (8.0f / target_fullsize_one1) * 0.01f;
                    float target_fullsize_one2 = 0.32f;
                    float targetsizeMax = entity.height * (26.0f / target_fullsize_one2) * 0.01f;
                    double x = (Math.random() * (double)(entity.height * 2.0f) - (double)entity.height) * (double)0.8f;
                    double y = (Math.random() * (double)(entity.height * 2.0f) - (double)entity.height) * (double)0.8f;
                    double z = (Math.random() * (double)(entity.height * 2.0f) - (double)entity.height) * (double)0.8f;
                    Vec3 vec3 = entity.getLookVec();
                    double d8 = entity.width + (startSpawn ? 0.0f : 1.5f);
                    double d9 = entity.height;
                    if (startSpawn) {
                        x2 = entityBlast.strtX();
                        y2 = entityBlast.strtY();
                        z2 = entityBlast.strtZ();
                        x2 += vec3.xCoord * d8;
                        y2 += vec3.yCoord * d9 + (double)(entity.height * 0.4f);
                        z2 += vec3.zCoord * d8;
                    } else {
                        x2 = entityBlast.posX;
                        y2 = entityBlast.posY;
                        z2 = entityBlast.posZ;
                    }
                    x2 += x;
                    y2 += y;
                    z2 += z;
                    float rotationYaw = -entityBlast.rotationYaw;
                    float rotationPitch = -entityBlast.rotationPitch;
                    double motionX = -MathHelper.sin((float)(rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(rotationPitch / 180.0f * (float)Math.PI));
                    double motionZ = MathHelper.cos((float)(rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(rotationPitch / 180.0f * (float)Math.PI));
                    double motionY = -MathHelper.sin((float)(rotationPitch / 180.0f * (float)Math.PI));
                    if (startSpawn) {
                        x2 += -motionX * 3.0;
                        y2 += -motionY * 3.0;
                        y2 -= (double)entityBlast.height * 0.25;
                        z2 += -motionZ * 3.0;
                    }
                    motionX *= 0.5;
                    motionY *= 0.5;
                    motionY += (double)((float)(Math.random() * (double)0.1f) - 0.05f);
                    motionZ *= 0.5;
                    if (startSpawn) {
                        motionX *= -1.0;
                        motionY *= -1.0;
                        motionZ *= -1.0;
                    }
                    float scaleStart = ((float)(Math.random() * (double)0.02f) + 0.02f) * life * 0.3f;
                    float scaleEnd = ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.3f;
                    float scaleSpeed = 0.2f * life * 0.3f;
                    int textureID = (int)(Math.random() * 3.0) + 8;
                    EntityCusPar particle = new EntityCusPar("jinryuumodscore:bens_particles.png", entity.worldObj, 0.2f, 0.2f, x2, y2, z2, 0.0, 0.0, 0.0, -motionX, -motionY, -motionZ, 0.0f, textureID, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 30, 2, scaleStart, scaleEnd, scaleStart, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.6f, 0.0f, 0.9f, 0.95f, 0.06f, false, -1, true, null);
                    entity.worldObj.spawnEntityInWorld((Entity)particle);
                    EntityCusPar particle2 = new EntityCusPar("jinryuumodscore:bens_particles.png", entity.worldObj, 0.2f, 0.2f, x2, y2, z2, 0.0, 0.0, 0.0, -motionX, -motionY, -motionZ, 0.0f, textureID, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 30, 2, scaleStart * 0.8f, scaleEnd * 0.8f, scaleStart * 0.8f, 0, red2, green2, blue2, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.6f, 0.0f, 0.9f, 0.95f, 0.06f, false, -1, true, null);
                    entity.worldObj.spawnEntityInWorld((Entity)particle2);
                }
            }
        }
    }

    public float rad(float angle) {
        return angle * (float)Math.PI / 180.0f;
    }
}

