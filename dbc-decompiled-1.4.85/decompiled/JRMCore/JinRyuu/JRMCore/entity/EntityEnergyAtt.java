/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.DBCClientTickHandler
 *  JinRyuu.DragonBC.common.DBCConfig
 *  JinRyuu.DragonBC.common.Npcs.EntityDBC
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  cpw.mods.fml.common.registry.IThrowableEntity
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.command.IEntitySelector
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IProjectile
 *  net.minecraft.entity.player.EntityPlayer
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

import JinRyuu.DragonBC.common.DBCClientTickHandler;
import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.JRMCore.Ds;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntityCusPar;
import JinRyuu.JRMCore.entity.EntityEnAttacks;
import JinRyuu.JRMCore.entity.EntityEnergyAttJ3;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.server.JGMathHelper;
import JinRyuu.JRMCore.server.JGPlayerClientServerHelper;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCGoD;
import cpw.mods.fml.common.network.ByteBufUtils;
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
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EntityEnergyAtt
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
    private double damageOriginal = 1.0;
    private int damageTaken = 1;
    private int knockbackStrength;
    private float explevel;
    private float Expl = 4.0f;
    private String ExplSound = "jinryuudragonbc:DBC.expl";
    private String AirSound = "jinryuudragonbc:DBC.hafire";
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
    private short effect;
    private int color;
    private int color2;
    private byte density;
    private short sincantation;
    private short sfire;
    private short smove;
    private byte[] sts;
    private byte technum;
    private byte align;
    private float size;
    private int conn;
    private int waveCount = 20;
    private byte wave = 0;
    private Entity target;
    private int cost;
    private int originDmg;
    private boolean shrink = false;
    private byte relFired = (byte)100;
    public boolean givenExp = false;
    public double motionXStart;
    public double motionYStart;
    public double motionZStart;
    public boolean givenTP = false;
    public boolean destroyer = false;
    public float DAMAGE_REDUCTION = JGConfigDBCGoD.CONFIG_GOD_ENERGY_DAMAGE_MULTI;
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
    public float minScale;
    public float maxScale;
    public float maxDamage;
    private boolean run = true;
    private int cb = 50;
    private boolean kiClashed;
    private List kiClashedList = new ArrayList();
    public float startRotationPitch = 0.0f;
    public float startRotationYaw = 0.0f;
    private final byte REACTION_DEAD = 1;
    private final byte REACTION_KILL = (byte)2;
    private final byte REACTION_KILL_EFFECT = (byte)3;
    private final byte REACTION_DAMAGE = (byte)4;
    private final byte REACTION_DAMAGE_EFFECT = (byte)5;

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

    public byte getType() {
        return this.type;
    }

    public int getCol() {
        return this.color;
    }

    public int getCol2() {
        return this.color2;
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

    public int getAirTicks() {
        return this.ticksInAir;
    }

    public byte[] getSts() {
        return this.sts;
    }

    public void setAirTicks(int i) {
        this.ticksInAir = i;
    }

    public short getEff() {
        return this.effect;
    }

    public float getSize() {
        return this.size;
    }

    public float getScale() {
        float damage = this.originDmg;
        byte perc = this.getPerc();
        byte[] sts = this.getSts();
        byte den = this.getDen();
        float scale = JRMCoreH.calculateEnergyScale(damage, this.maxDamage, perc, sts, den, this.minScale, this.maxScale);
        return scale;
    }

    public void setScales() {
        this.minScale = (float)JRMCoreConfig.KiSizeMin[this.getType()];
        this.maxScale = (float)JRMCoreConfig.KiSizeMax[this.getType()];
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
        if (this.isLaser()) {
            return 5.0f;
        }
        if (this.isLargeBlast()) {
            return 10000.0f;
        }
        if (this.isSpiral()) {
            return 5.0f;
        }
        if (this.isBarrage()) {
            return 5.0f;
        }
        if (this.isShield()) {
            return 5.0f;
        }
        if (this.isExplosion()) {
            return 20.0f;
        }
        return 1.0f;
    }

    public EntityEnergyAtt(World par1World) {
        super(par1World);
        this.setSize(this.size, this.size);
    }

    public EntityEnergyAtt(EntityLivingBase entityLiving, byte type, byte speed, int dam, byte effect, byte color, byte density, byte sincantation, byte sfire, byte smove, byte perc, int dam1, int cost, byte[] sts, byte technum) {
        this(entityLiving, type, speed, dam, effect, color, density, sincantation, sfire, smove, perc, dam1, cost, sts, technum, -100, -100);
    }

    public EntityEnergyAtt(EntityLivingBase entityLiving, byte type, byte speed, int dam, byte effect, byte color, byte density, byte sincantation, byte sfire, byte smove, byte perc, int dam1, int cost, byte[] sts, byte technum, byte release, byte align) {
        super(entityLiving.worldObj);
        double z;
        double y;
        double x;
        this.type = type;
        this.shooterHolds = this.isContinuesWave();
        this.speed = (byte)((float)((speed + 1) * 10 + (type == 2 ? 10 : 0) + (density == 2 ? 40 : 0)) * (1.0f + JRMCoreH.tech_statmod(sts, 0)));
        this.dam = dam;
        this.perc = perc;
        this.effect = effect;
        this.color = color;
        this.color2 = -1;
        this.density = (byte)(sts[5] + 1);
        this.sincantation = sincantation;
        this.sfire = sfire;
        this.smove = smove;
        this.sts = sts;
        this.technum = technum;
        this.cost = cost;
        this.originDmg = dam1;
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)entityLiving;
            this.relFired = release != -100 ? release : JRMCoreH.getByte(player, "jrmcRelease");
            byte by = this.align = align != -100 ? align : JRMCoreH.getByte(player, "jrmcAlign");
            if (color == 0) {
                if (this.align > 66) {
                    this.color = 2;
                } else if (this.align <= 66 && this.align >= 33) {
                    this.color = 3;
                } else if (this.align < 33) {
                    this.color = 4;
                }
            }
        } else if (color == 0) {
            this.color = 3;
        }
        this.damageOriginal = this.damage = (double)dam1 * (double)this.relFired * (double)0.01f * (double)perc * (double)0.02f * JRMCoreConfig.dat5696[type][1];
        if (!this.isShield() && !this.isExplosion()) {
            this.setScales();
            float size1 = this.getScale();
            this.size = 0.5f + size1;
        } else {
            this.minScale = 0.001f;
            this.maxScale = 0.1f;
            this.maxDamage = JRMCoreH.getMaxEnergyDamage();
        }
        this.shootingEntity = entityLiving;
        this.explevel = !this.isShield() && !this.isExplosion() ? this.size * (float)JRMCoreConfig.eaes : 0.0f;
        this.renderDistanceWeight = 10.0;
        if (JRMCoreConfig.eaesl > 0 && this.size > (float)JRMCoreConfig.eaesl) {
            this.size = JRMCoreConfig.eaesl;
        }
        if (JRMCoreConfig.ExplosionSizeLimit > 0.0 && (double)this.explevel > JRMCoreConfig.ExplosionSizeLimit) {
            this.explevel = (float)JRMCoreConfig.ExplosionSizeLimit;
        }
        if (this.isLargeBlast()) {
            this.size *= JRMCoreConfig.ealbm;
            this.explevel *= JRMCoreConfig.ealbm;
        }
        if (JRMCoreConfig.KiAttackScalesWithUser) {
            float extraScale = this.shootingEntity == null ? 1.0f : this.shootingEntity.height / 1.8f;
            this.size *= extraScale;
            this.explevel *= extraScale;
        }
        this.setSize(this.size, this.size);
        if (!this.isShield() && !this.isExplosion()) {
            Vec3 vec3;
            double d8 = entityLiving.width + 1.0f + 1.0f;
            double d9 = entityLiving.height + 0.2f;
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
            x = entityLiving.posX + vec3.xCoord * d8;
            y = entityLiving.posY + vec3.yCoord * d8 + (double)(entityLiving.height * 0.7f);
            z = entityLiving.posZ + vec3.zCoord * d8;
            this.setLocationAndAngles(x, y, z, entityLiving.getRotationYawHead(), entityLiving.rotationPitch);
            this.yOffset = this.size * 0.5f;
            this.motionX = -MathHelper.sin((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
            this.motionZ = MathHelper.cos((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
            this.motionY = -MathHelper.sin((float)(this.rotationPitch / 180.0f * (float)Math.PI));
            this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, (float)((double)((float)this.speed * 0.05f) * JRMCoreConfig.dat5696[type][0]), 1.0f);
        } else {
            this.size = this.shootingEntity.height * 3.0f * (!this.isExplosion() ? 1.0f : 2.0f);
            this.setSize(this.size, this.size);
            x = entityLiving.posX;
            y = entityLiving.posY + (double)(entityLiving.height * 0.55f);
            z = entityLiving.posZ;
            this.setLocationAndAngles(x, y, z, entityLiving.rotationYaw, entityLiving.rotationPitch);
            this.yOffset = this.size * 0.5f;
            this.motionX = 0.0;
            this.motionZ = 0.0;
            this.motionY = 0.0;
        }
        this.strtX = (float)x;
        this.strtY = (float)y;
        this.strtZ = (float)z;
        this.motionXStart = this.motionX;
        this.motionYStart = this.motionY;
        this.motionZStart = this.motionZ;
    }

    public EntityEnergyAtt(EntityLivingBase entityLiving, byte type, byte speed, int dam, byte effect, byte color, byte color2, byte density, byte sincantation, byte sfire, byte smove, byte perc, int dam1, int cost, byte[] sts, byte technum) {
        this(entityLiving, type, speed, dam, effect, color, color2, density, sincantation, sfire, smove, perc, dam1, cost, sts, technum, -100, -100);
    }

    public EntityEnergyAtt(EntityLivingBase entityLiving, byte type, byte speed, int dam, byte effect, byte color, byte color2, byte density, byte sincantation, byte sfire, byte smove, byte perc, int dam1, int cost, byte[] sts, byte technum, byte release, byte align) {
        super(entityLiving.worldObj);
        double z;
        double y;
        double x;
        this.type = type;
        this.shooterHolds = this.isContinuesWave();
        this.speed = (byte)((float)((speed + 1) * 10 + (type == 2 ? 10 : 0) + (density == 2 ? 40 : 0)) * (1.0f + JRMCoreH.tech_statmod(sts, 0)));
        this.dam = dam;
        this.perc = perc;
        this.effect = effect;
        this.color = color;
        this.color2 = color2;
        this.density = (byte)(sts[5] + 1);
        this.sincantation = sincantation;
        this.sfire = sfire;
        this.smove = smove;
        this.sts = sts;
        this.technum = technum;
        this.cost = cost;
        this.originDmg = dam1;
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)entityLiving;
            this.relFired = release != -100 ? release : JRMCoreH.getByte(player, "jrmcRelease");
            byte by = this.align = align != -100 ? align : JRMCoreH.getByte(player, "jrmcAlign");
            if (color == 0) {
                if (this.align > 66) {
                    this.color = 2;
                } else if (this.align <= 66 && this.align >= 33) {
                    this.color = 3;
                } else if (this.align < 33) {
                    this.color = 4;
                }
            }
            if (color2 == 0) {
                if (this.align > 66) {
                    this.color2 = 2;
                } else if (this.align <= 66 && this.align >= 33) {
                    this.color2 = 3;
                } else if (this.align < 33) {
                    this.color2 = 4;
                }
            }
        } else {
            if (color == 0) {
                this.color = 3;
            }
            if (color2 == 0) {
                this.color2 = 3;
            }
        }
        this.damageOriginal = this.damage = (double)dam1 * (double)this.relFired * (double)0.01f * (double)perc * (double)0.02f * JRMCoreConfig.dat5696[type][1];
        if (!this.isShield() && !this.isExplosion()) {
            this.setScales();
            float size1 = this.getScale();
            this.size = 0.5f + size1;
        } else {
            this.minScale = 0.001f;
            this.maxScale = 0.1f;
            this.maxDamage = JRMCoreH.getMaxEnergyDamage();
        }
        this.shootingEntity = entityLiving;
        this.explevel = !this.isShield() && !this.isExplosion() ? this.size * (float)JRMCoreConfig.eaes : 0.0f;
        this.renderDistanceWeight = 10.0;
        if (JRMCoreConfig.eaesl > 0 && this.size > (float)JRMCoreConfig.eaesl) {
            this.size = JRMCoreConfig.eaesl;
        }
        if (JRMCoreConfig.ExplosionSizeLimit > 0.0 && (double)this.explevel > JRMCoreConfig.ExplosionSizeLimit) {
            this.explevel = (float)JRMCoreConfig.ExplosionSizeLimit;
        }
        if (this.isLargeBlast()) {
            this.size *= JRMCoreConfig.ealbm;
            this.explevel *= JRMCoreConfig.ealbm;
        }
        if (JRMCoreConfig.KiAttackScalesWithUser) {
            float extraScale = this.shootingEntity == null ? 1.0f : this.shootingEntity.height / 1.8f;
            this.size *= extraScale;
            this.explevel *= extraScale;
        }
        this.setSize(this.size, this.size);
        if (!this.isShield() && !this.isExplosion()) {
            Vec3 vec3;
            double d8 = entityLiving.width + 1.0f + 1.0f;
            double d9 = entityLiving.height + 0.2f;
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
            x = entityLiving.posX + vec3.xCoord * d8;
            y = entityLiving.posY + vec3.yCoord * d8 + (double)(entityLiving.height * 0.7f);
            z = entityLiving.posZ + vec3.zCoord * d8;
            this.setLocationAndAngles(x, y, z, entityLiving.getRotationYawHead(), entityLiving.rotationPitch);
            this.yOffset = this.size * 0.5f;
            this.motionX = -MathHelper.sin((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
            this.motionZ = MathHelper.cos((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
            this.motionY = -MathHelper.sin((float)(this.rotationPitch / 180.0f * (float)Math.PI));
            this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, (float)((double)((float)this.speed * 0.05f) * JRMCoreConfig.dat5696[type][0]), 1.0f);
        } else {
            this.size = this.shootingEntity.height * 3.0f * (!this.isExplosion() ? 1.0f : 2.0f);
            this.setSize(this.size, this.size);
            x = entityLiving.posX;
            y = entityLiving.posY + (double)(entityLiving.height * 0.55f);
            z = entityLiving.posZ;
            this.setLocationAndAngles(x, y, z, entityLiving.rotationYaw, entityLiving.rotationPitch);
            this.yOffset = this.size * 0.5f;
            this.motionX = 0.0;
            this.motionZ = 0.0;
            this.motionY = 0.0;
        }
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

    public boolean isContinuesWave() {
        return this.getType() >= JRMCoreConfig.ContinuesKiAttacks.length ? false : JRMCoreConfig.ContinuesKiAttacks[this.getType()];
    }

    public void onUpdate() {
        Block block;
        byte b;
        int curBody;
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
        if (!this.isShield() && !this.isExplosion()) {
            int color2;
            int color = JRMCoreH.techCol[this.getCol()];
            int n = color2 = this.getCol2() == -1 ? JRMCoreH.techCol2[this.getCol()] : JRMCoreH.techCol3[this.getCol2()];
            if (this.isContinuesWave() && this.shooterHolds) {
                this.generateParticles(this, this.shootingEntity, color, color2, true);
            }
            this.generateParticles(this, this, color, color2, false);
        }
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
            if (!(this.worldObj.isRemote || JRMCoreConfig.dat5695[this.type] || this.isDead)) {
                this.setDead();
            }
            if (!this.worldObj.isRemote && !JRMCoreConfig.dat5709[this.type] && this.hasEffect()) {
                this.effect = 0;
            }
            this.run = false;
        }
        if (!(this.worldObj.isRemote || !this.isContinuesWave() || this.isShield() || this.isExplosion() || this.target == null || this.target.isDead || this.shooterHolds || !JGMathHelper.isMotionSmallerThanN(this, 0.001))) {
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
                double d8 = ((EntityLivingBase)this.shootingEntity).width + 1.0f + 1.0f;
                double d9 = ((EntityLivingBase)this.shootingEntity).height + 0.2f;
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
                        DBCClientTickHandler.nuller();
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
                    DBCClientTickHandler.nuller();
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
            if (JRMCoreH.DBC() && this.target instanceof EntityDBC) {
                ((EntityDBC)this.target).lockedBy = this;
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
                if (this.hasEffect() && !this.isShield() && !this.isExplosion()) {
                    this.createExplosion(2);
                }
                this.setDead();
            }
        }
        if (this.shootingEntity != null && this.isExplosion() && this.hasEffect()) {
            double kulz3;
            double kuly3;
            double kulx3 = this.shootingEntity.posX - this.posX;
            if (kulx3 < 0.0) {
                kulx3 *= -1.0;
            }
            if ((kuly3 = this.shootingEntity.posY - this.posY) < 0.0) {
                kuly3 *= -1.0;
            }
            if ((kulz3 = this.shootingEntity.posZ - this.posZ) < 0.0) {
                kulz3 *= -1.0;
            }
            if (kulx3 > 1.0 || kuly3 > 1.0 || kulz3 > 1.0) {
                this.shootingEntity.setPosition(this.posX, this.posY + 1.0, this.posZ);
            }
        }
        if (!this.worldObj.isRemote && this.shootingEntity == null) {
            this.setDead();
        }
        if (!this.worldObj.isRemote && this.shootingEntity != null && !this.isDead) {
            if (this.isShield()) {
                if (JRMCoreConfig.ShieldsMoveWithUser) {
                    this.posX = this.shootingEntity.posX;
                    this.posY = this.shootingEntity.posY + (double)(this.shootingEntity.height * 0.55f);
                    this.posZ = this.shootingEntity.posZ;
                } else {
                    int diff;
                    if ((diff *= (diff = (int)(this.posX - this.shootingEntity.posX)) > 0 ? 1 : -1) > 3) {
                        this.setDead();
                    }
                    if ((diff *= (diff = (int)(this.posY - this.shootingEntity.posY)) > 0 ? 1 : -1) > 3) {
                        this.setDead();
                    }
                    if ((diff *= (diff = (int)(this.posZ - this.shootingEntity.posZ)) > 0 ? 1 : -1) > 3) {
                        this.setDead();
                    }
                }
            } else if (this.isExplosion() && JRMCoreConfig.ExplosionsMoveWithUser) {
                this.posX = this.shootingEntity.posX;
                this.posY = this.shootingEntity.posY + (double)(this.shootingEntity.height * 0.55f);
                this.posZ = this.shootingEntity.posZ;
            }
        }
        if (!this.worldObj.isRemote && this.shootingEntity != null && JRMCoreConfig.dat5710 && (this.isShield() || this.isExplosion()) && (curBody = Integer.parseInt(JRMCoreH.data(this.shootingEntity.getCommandSenderName(), 8, "200"))) == 0) {
            this.setDead();
        }
        if (!this.worldObj.isRemote && this.isContinuesWave() && this.shootingEntity != null && this.shootingEntity instanceof EntityPlayer && (b = JRMCoreH.getByte((EntityPlayer)this.shootingEntity, "jrmcFrng")) == 0 && !this.shrink && JRMCoreConfig.WavesShrinkOnceLetGo) {
            this.shrink();
        }
        if (!this.worldObj.isRemote && this.isContinuesWave() && this.hadTarget && (this.target == null || this.target.isDead)) {
            this.setDead();
        }
        if (!this.worldObj.isRemote && this.isExplosion() && this.ticksExisted >= JRMCoreConfig.dat5697) {
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
        if (this.inGround && !this.isShield() && !this.isExplosion()) {
            int var19 = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
            if (!this.worldObj.isRemote) {
                if (block == this.inTile && var19 == this.inData) {
                    ++this.ticksInGround;
                    if (this.ticksInGround == 1) {
                        this.setDead();
                        if (!this.worldObj.isRemote) {
                            if (this.hasEffect()) {
                                this.createExplosion(1);
                            }
                            this.playSoundAtEntity(this, JGConfigDBCGoD.CONFIG_GOD_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && this.destroyer ? "jinryuudragonbc:DBC5.hakai" : this.ExplSound, 1.0f, 1.0f);
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
            }
        } else {
            int t;
            ++this.ticksInAir;
            Vec3 var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            Vec3 var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            MovingObjectPosition movingObject = this.worldObj.func_147447_a(var17, var3, false, true, false);
            var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            if (!this.worldObj.isRemote && ((float)this.ticksInAir >= (float)JRMCoreConfig.EnergyAttackMaxLifeTickPercMulti * ((float)this.perc * 0.02f) || this.ticksInAir >= JRMCoreConfig.EnergyAttackMaxLifeTick)) {
                this.setDead();
            }
            if (this.ticksInAir == ((t = this.ticksInAir / 10 * 10) == 0 ? 10 : t)) {
                this.playSoundAtEntity(this, "jinryuudragonbc:" + JRMCoreH.techSnds(this.type, 2, this.smove), this.isBarrage() ? 0.5f : 1.0f, 1.0f);
            }
            if (movingObject != null) {
                var3 = Vec3.createVectorHelper((double)movingObject.hitVec.xCoord, (double)movingObject.hitVec.yCoord, (double)movingObject.hitVec.zCoord);
            }
            if (!this.worldObj.isRemote) {
                List entityList;
                Entity lastEntity = null;
                boolean MODE_OLD = false;
                boolean MODE_ONE = true;
                int MODE_TWO = 2;
                int MODE_THREE = 3;
                int MODE_FOUR = 4;
                int MODE_OFF = 5;
                byte mode = JRMCoreConfig.KiClosestEntityCheckSize;
                if (mode == 4) {
                    AxisAlignedBB aabb = this.boundingBox.copy();
                    entityList = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, aabb);
                } else if (mode == 3) {
                    AxisAlignedBB aabb = this.boundingBox.copy();
                    entityList = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, aabb.addCoord(this.motionX, this.motionY, this.motionZ));
                } else if (mode == 2) {
                    AxisAlignedBB aabb = this.boundingBox.copy();
                    entityList = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, aabb.expand(0.5, 0.5, 0.5));
                } else {
                    entityList = mode == 1 ? this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ)) : this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(0.5, 0.5, 0.5));
                }
                if (mode != 5) {
                    double lastDistance = 0.0;
                    for (int n = 0; n < entityList.size(); ++n) {
                        double distance;
                        float var11;
                        AxisAlignedBB entityHitbox;
                        MovingObjectPosition movingObject2;
                        Entity entity = (Entity)entityList.get(n);
                        if (!(entity instanceof EntityLivingBase) || !entity.canBeCollidedWith() || entity == this.shootingEntity && this.ticksInAir < 5 || (movingObject2 = (entityHitbox = entity.boundingBox.expand((double)(var11 = 0.0f), (double)var11, (double)var11)).calculateIntercept(var17, var3)) == null || !((distance = var17.distanceTo(movingObject2.hitVec)) < lastDistance) && lastDistance != 0.0) continue;
                        lastEntity = entity;
                        lastDistance = distance;
                    }
                    if (lastEntity != null) {
                        movingObject = new MovingObjectPosition(lastEntity);
                    }
                }
            }
            if (this.motionX <= 0.01 && this.motionY <= 0.01 && this.motionZ <= 0.01 && this.motionX >= -0.01 && this.motionY >= -0.01 && this.motionZ >= -0.01 && !this.shrink && !this.isContinuesWave()) {
                this.shrink();
            }
            if (!this.worldObj.isRemote) {
                int n;
                List entityList = this.checkForEntitiesInside();
                for (n = 0; n < entityList.size(); ++n) {
                    Entity entity = (Entity)entityList.get(n);
                    if (entity == null || entity == this.shootingEntity || entity.isDead) continue;
                    if (entity instanceof EntityEnergyAtt) {
                        EntityEnergyAtt entityKi = (EntityEnergyAtt)entity;
                        if (!entityKi.isShield() && !entityKi.isExplosion()) continue;
                        this.handleKiaiClash(entityKi);
                        continue;
                    }
                    if (!JRMCoreH.NC() || !(entity instanceof EntityEnergyAttJ3)) continue;
                    EntityEnergyAttJ3 entityShield = (EntityEnergyAttJ3)entity;
                    this.handleJutsuWallClash(entityShield);
                }
                for (n = 0; n < entityList.size(); ++n) {
                    float var25;
                    Entity entity = (Entity)entityList.get(n);
                    if (entity != this.shootingEntity) {
                        byte reaction = this.checkReaction(entity, true);
                        EntityEnergyAtt entityKi = null;
                        if (entity != null) {
                            if (entity instanceof EntityEnergyAtt) {
                                entityKi = (EntityEnergyAtt)entity;
                            }
                            if (entity instanceof EntityLivingBase) {
                                if (movingObject == null) {
                                    movingObject = new MovingObjectPosition(entity);
                                }
                                if (this.target == null && !JRMCoreH.isFusionSpectator(entity)) {
                                    this.setTarget(entity);
                                }
                            } else if (this.isContinuesWave() && this.wave > 0 && this.shootingEntity instanceof EntityPlayer) {
                                this.shrinkWave();
                            } else if (!(entity instanceof EntityEnAttacks || entity == this.shootingEntity || this.isShield() || this.isExplosion())) {
                                if (this.hasEffect() && (reaction <= 0 || reaction >= 6) && entity instanceof EntityLivingBase) {
                                    this.createExplosion(2);
                                }
                            } else if (entityKi != null && !(entityKi.shootingEntity instanceof EntityDBC) && !this.kiClashedList.contains(entity)) {
                                if (!this.isShield() && !this.isExplosion()) {
                                    boolean doit = true;
                                    byte result = 0;
                                    if (JGConfigDBCGoD.CONFIG_GOD_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && this.destroyer && this.damage * (double)this.DAMAGE_REDUCTION / 2.0 > entityKi.damage / 2.0) {
                                        entityKi.setDead();
                                        continue;
                                    }
                                    if (!(JRMCoreConfig.dat5705 == 1.0 || entityKi.isShield() || entityKi.isExplosion() || this.isDead || entityKi.isDead)) {
                                        result = this.killWeakerAttack(this, entityKi);
                                    }
                                    if (result == 0) {
                                        if (entityKi != null && !entityKi.isDead && (entityKi.isShield() || entityKi.isExplosion())) {
                                            doit = false;
                                        }
                                        if (entityKi != null && !entityKi.isDead && !this.isDead) {
                                            this.kiClashed = true;
                                            this.kiClashedList.add(entity);
                                            if (doit && entityKi.shootingEntity != this.shootingEntity) {
                                                float dam = (float)(((EntityEnergyAtt)entity).getDamage() / 2.0);
                                                float spe = (float)((EntityEnergyAtt)entity).getSpe() * 2.0f;
                                                float den = (float)((EntityEnergyAtt)entity).getDen() * 10.0f;
                                                float damt = (float)(this.damage / 2.0);
                                                float spet = (float)this.speed * 2.0f;
                                                float dent = (float)this.density * 10.0f;
                                                long power = this.getPower(entityKi);
                                                if (power >= 0L) {
                                                    float res = ((damt - dam) / damt + (spe - spet) / spe + (dent - den) / dent) / 3.0f;
                                                    this.motionX *= (double)res;
                                                    this.motionY *= (double)res;
                                                    this.motionZ *= (double)res;
                                                    if (JGConfigDBCGoD.CONFIG_GOD_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && ((EntityEnergyAtt)entity).destroyer && !(((EntityEnergyAtt)entity).damage * (double)this.DAMAGE_REDUCTION / 2.0 > this.damage / 2.0)) {
                                                        ((EntityEnergyAtt)entity).motionX = this.motionX;
                                                        ((EntityEnergyAtt)entity).motionY = this.motionY;
                                                        ((EntityEnergyAtt)entity).motionZ = this.motionZ;
                                                    }
                                                    if (((EntityEnergyAtt)entity).getAirTicks() < this.ticksInAir) {
                                                        this.ticksInAir = ((EntityEnergyAtt)entity).getAirTicks();
                                                    }
                                                }
                                                this.conn = 2;
                                            }
                                        }
                                    }
                                } else if (this.isShield() && !this.worldObj.isRemote) {
                                    boolean doit = true;
                                    if ((int)(Math.random() * 3.0) == 0) {
                                        doit = false;
                                    }
                                    if (doit && this.shootingEntity instanceof EntityPlayer) {
                                        boolean qckmth;
                                        boolean bl = qckmth = !entityKi.isShield() && !entityKi.isExplosion();
                                        if (qckmth) {
                                            String s2 = JRMCoreH.getString((EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                                            JRMCoreH.setString(JRMCoreH.tech_expgiv(s2, JRMCoreH.DBC() ? JRMCoreHDBC.DBCgetConfigTechExpRate() : 1), (EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!this.isExplosion() || !this.hasEffect() && entity.equals((Object)this.shootingEntity)) continue;
                    EntityEnergyAtt energyEntity = null;
                    if (entity instanceof EntityEnergyAtt) {
                        energyEntity = (EntityEnergyAtt)entity;
                    }
                    if (entity instanceof EntityLivingBase) {
                        if (movingObject == null) {
                            movingObject = new MovingObjectPosition(entity);
                        }
                        if (this.target == null && JRMCoreH.isFusionSpectator(movingObject == null ? null : movingObject.entityHit)) {
                            this.target = entity;
                        }
                    }
                    if (energyEntity != null && !(energyEntity.shootingEntity instanceof EntityDBC) && !this.kiClashedList.contains(entity) || entity == null) continue;
                    float var20 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ));
                    int var23 = (int)(this.damage * (double)(this.hasEffect() ? 3.0f : 1.0f) * (entity.equals((Object)this.shootingEntity) ? JRMCoreConfig.dat5701 / 100.0 : 1.0));
                    this.giveExperience(entity, 1);
                    DamageSource damagesource = null;
                    if (this.shootingEntity == null || this.shootingEntity instanceof EntityDBC && entity instanceof EntityDBC) {
                        this.setDead();
                        return;
                    }
                    damagesource = Ds.causeEntityEnergyAttDamage(this, this.shootingEntity);
                    if (this.isBurning()) {
                        entity.setFire(5);
                    }
                    double motX = entity.motionX;
                    double motY = entity.motionY;
                    double motZ = entity.motionZ;
                    if (JRMCoreH.isFusionSpectator(movingObject == null ? null : movingObject.entityHit) || !entity.attackEntityFrom(damagesource, (float)var23)) continue;
                    if (this.type < 7 && JRMCoreConfig.dat5706[this.type]) {
                        entity.motionX = motX;
                        entity.motionY = motY;
                        entity.motionZ = motZ;
                    }
                    if (!(entity instanceof EntityLivingBase)) continue;
                    if (!this.worldObj.isRemote && this.shootingEntity instanceof EntityPlayer) {
                        String s2 = JRMCoreH.getString((EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                        JRMCoreH.setString(JRMCoreH.tech_expgiv(s2, JRMCoreH.DBC() ? JRMCoreHDBC.DBCgetConfigTechExpRate() : 1), (EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                    }
                    if (this.knockbackStrength <= 0 || entity.equals((Object)this.shootingEntity) || this.type < 7 && !JRMCoreConfig.dat5706[this.type] || !((var25 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionZ * this.motionZ))) > 0.0f)) continue;
                    entity.addVelocity(this.motionX * (double)this.knockbackStrength * (double)0.6f / (double)var25, 0.1, this.motionZ * (double)this.knockbackStrength * (double)0.6f / (double)var25);
                }
            }
            if (!this.isShield()) {
                if (movingObject != null && movingObject.entityHit != this.shootingEntity) {
                    if (!this.worldObj.isRemote && !this.isExplosion() && !JRMCoreH.isFusionSpectator(movingObject == null ? null : movingObject.entityHit) && this.canSpiralNotGoThrough()) {
                        this.playSoundAtEntity(this, JGConfigDBCGoD.CONFIG_GOD_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && this.destroyer ? "jinryuudragonbc:DBC5.hakai" : this.ExplSound, 1.0f, 1.0f);
                    }
                    if (movingObject.entityHit != null && (this.shootingEntity instanceof EntityPlayer || movingObject.entityHit instanceof EntityPlayer) && this.isContinuesWave() && this.shooterHolds) {
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
                                            if (!((float)curEn - (cost2 = (float)((double)this.cost * (double)curRel * (double)0.01f * (double)((float)this.perc * 0.02f) * JRMCoreConfig.dat5696[this.type][2])) > 0.0f)) {
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
                                        if (this.wave == 1 && movingObject.entityHit instanceof EntityLivingBase && !this.worldObj.isRemote) {
                                            EntityLivingBase var24 = (EntityLivingBase)movingObject.entityHit;
                                            if (this.shootingEntity instanceof EntityPlayer) {
                                                String s2 = JRMCoreH.getString((EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                                                JRMCoreH.setString(JRMCoreH.tech_expgiv(s2, JRMCoreH.DBC() ? JRMCoreHDBC.DBCgetConfigTechExpRate() : 1), (EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                                            }
                                        }
                                        int var23 = (int)this.damage;
                                        DamageSource damagesource = Ds.causeEntityEnergyAttDamage(this, this.shootingEntity);
                                        if (!JRMCoreH.isFusionSpectator(movingObject == null ? null : movingObject.entityHit) && this.target.attackEntityFrom(damagesource, (float)var23)) {
                                            this.weakenSpiral();
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
                                    if (this.hasEffect() && !this.isShield() && !this.isExplosion()) {
                                        this.createExplosion(2);
                                    }
                                    this.setDead();
                                }
                            } else {
                                this.shrinkWave();
                            }
                        }
                        if (movingObject.entityHit instanceof EntityLivingBase) {
                            if (!JRMCoreH.isFusionSpectator(movingObject == null ? null : movingObject.entityHit)) {
                                this.setTarget(movingObject.entityHit);
                            }
                        } else {
                            this.shrinkWave();
                        }
                    } else if (movingObject.entityHit != null && (this.shootingEntity instanceof EntityPlayer || movingObject.entityHit instanceof EntityPlayer)) {
                        float var20 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ));
                        int var23 = (int)this.damage;
                        this.giveExperience(movingObject.entityHit, 1);
                        DamageSource damagesource = null;
                        if (this.shootingEntity == null || this.shootingEntity instanceof EntityDBC && movingObject.entityHit instanceof EntityDBC) {
                            this.setDead();
                            return;
                        }
                        damagesource = Ds.causeEntityEnergyAttDamage(this, this.shootingEntity);
                        if (this.isBurning()) {
                            movingObject.entityHit.setFire(5);
                        }
                        double motX = movingObject.entityHit.motionX;
                        double motY = movingObject.entityHit.motionY;
                        double motZ = movingObject.entityHit.motionZ;
                        if (!JRMCoreH.isFusionSpectator(movingObject == null ? null : movingObject.entityHit)) {
                            if (movingObject.entityHit.attackEntityFrom(damagesource, (float)var23)) {
                                this.weakenSpiral();
                                if (this.type < 7 && !JRMCoreConfig.dat5706[this.type]) {
                                    movingObject.entityHit.motionX = motX;
                                    movingObject.entityHit.motionY = motY;
                                    movingObject.entityHit.motionZ = motZ;
                                }
                                if (movingObject.entityHit instanceof EntityLivingBase) {
                                    float var25;
                                    if (!this.worldObj.isRemote && this.shootingEntity instanceof EntityPlayer) {
                                        boolean doit = true;
                                        if ((this.isBarrage() || this.isExplosion()) && (int)(Math.random() * 6.0) == 0) {
                                            doit = false;
                                        }
                                        if (doit) {
                                            String s2 = JRMCoreH.getString((EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                                            JRMCoreH.setString(JRMCoreH.tech_expgiv(s2, JRMCoreH.DBC() ? JRMCoreHDBC.DBCgetConfigTechExpRate() : 1), (EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                                        }
                                    }
                                    if (this.knockbackStrength > 0 && (this.type >= 7 || JRMCoreConfig.dat5706[this.type]) && (var25 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionZ * this.motionZ))) > 0.0f) {
                                        movingObject.entityHit.addVelocity(this.motionX * (double)this.knockbackStrength * (double)0.6f / (double)var25, 0.1, this.motionZ * (double)this.knockbackStrength * (double)0.6f / (double)var25);
                                    }
                                }
                                if (this.canSpiralNotGoThrough() && !this.isShield() && !this.isExplosion()) {
                                    if (this.hasEffect()) {
                                        this.createExplosion(2);
                                    }
                                    this.setDead();
                                }
                            } else if (movingObject.entityHit.isEntityAlive() && !DBCConfig.KiAttackGoThroughInvulnerableEnemies && !this.isShield() && !this.isExplosion() && this.canSpiralNotGoThrough()) {
                                this.motionX *= (double)-0.1f;
                                this.motionY *= (double)-0.1f;
                                this.motionZ *= (double)-0.1f;
                                this.rotationYaw += 180.0f;
                                this.prevRotationYaw += 180.0f;
                                this.setDead();
                                this.ticksInAir = 0;
                            }
                        }
                    } else {
                        this.xTile = movingObject.blockX;
                        this.yTile = movingObject.blockY;
                        this.zTile = movingObject.blockZ;
                        this.inTile = this.worldObj.getBlock(this.xTile, this.yTile, this.zTile);
                        this.inData = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
                        this.inGround = true;
                        if (this.inTile.getMaterial() != Material.air) {
                            this.inTile.onEntityCollidedWithBlock(this.worldObj, this.xTile, this.yTile, this.zTile, (Entity)this);
                        }
                        if (movingObject.entityHit != null && this.shootingEntity != null) {
                            float var20 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ));
                            int var23 = (int)this.damage;
                            DamageSource damagesource = null;
                            if (this.shootingEntity == null || this.shootingEntity instanceof EntityDBC && movingObject.entityHit instanceof EntityDBC) {
                                this.setDead();
                                return;
                            }
                            damagesource = Ds.causeEntityEnergyAttDamage(this, this.shootingEntity);
                            if (this.isBurning()) {
                                movingObject.entityHit.setFire(5);
                            }
                            double motX = movingObject.entityHit.motionX;
                            double motY = movingObject.entityHit.motionY;
                            double motZ = movingObject.entityHit.motionZ;
                            if (!JRMCoreH.isFusionSpectator(movingObject == null ? null : movingObject.entityHit)) {
                                if (movingObject.entityHit.attackEntityFrom(damagesource, (float)var23)) {
                                    float var25;
                                    this.weakenSpiral();
                                    if (this.type < 7 && !JRMCoreConfig.dat5706[this.type]) {
                                        movingObject.entityHit.motionX = motX;
                                        movingObject.entityHit.motionY = motY;
                                        movingObject.entityHit.motionZ = motZ;
                                    }
                                    if (movingObject.entityHit instanceof EntityLivingBase && this.knockbackStrength > 0 && (this.type >= 7 || JRMCoreConfig.dat5706[this.type]) && (var25 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionZ * this.motionZ))) > 0.0f) {
                                        movingObject.entityHit.addVelocity(this.motionX * (double)this.knockbackStrength * (double)0.6f / (double)var25, 0.1, this.motionZ * (double)this.knockbackStrength * (double)0.6f / (double)var25);
                                    }
                                    if (this.hasEffect() && !this.isShield() && !this.isExplosion()) {
                                        this.createExplosion(2);
                                    }
                                    this.setDead();
                                } else if (!this.isShield() && !this.isExplosion()) {
                                    this.motionX *= (double)-0.1f;
                                    this.motionY *= (double)-0.1f;
                                    this.motionZ *= (double)-0.1f;
                                    this.rotationYaw += 180.0f;
                                    this.prevRotationYaw += 180.0f;
                                    this.setDead();
                                    this.ticksInAir = 0;
                                }
                            }
                        }
                    }
                } else if ((this.wave > 0 || this.waveCount < 20) && this.target != null && this.target.isDead) {
                    this.shrinkWave();
                }
            }
            if (!this.isShield() && !this.isExplosion()) {
                this.posX += this.motionX;
                this.posY += this.motionY;
                this.posZ += this.motionZ;
            }
            this.ShieldPushAwayEntities();
            if ((double)(this.rotationPitch - this.prevRotationPitch) >= 180.0) {
                this.prevRotationPitch += 360.0f;
            }
            if (this.rotationYaw - this.prevRotationYaw < -180.0f) {
                this.prevRotationYaw -= 360.0f;
            }
            if (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
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
            if (!this.isShield() && !this.isExplosion()) {
                this.motionX *= (double)var22;
                this.motionY *= (double)var22;
                this.motionZ *= (double)var22;
                this.motionY -= (double)var11;
            }
            this.setPosition(this.posX, this.posY, this.posZ);
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
            DBCClientTickHandler.nuller();
            JRMCoreH.isShtng = false;
        }
    }

    private byte checkReaction(Entity entity, boolean react) {
        String nev = EntityList.getEntityString((Entity)entity);
        if (JRMCoreConfig.dat5704) {
            JRMCoreH.log("[JRMC CONSOLE] Name of Entity that was hit by a Ki Blast: " + nev + " | (Can be used for Reaction Config!)");
        }
        byte data = 0;
        if (entity instanceof EntityEnergyAtt) {
            nev = nev + "!" + ((EntityEnergyAtt)entity).getType();
        }
        if (JRMCoreConfig.dat5702.get(nev) != null) {
            data = JRMCoreConfig.dat5702.get(nev);
            if (react) {
                this.checkReacts(entity, data);
            }
        }
        if (JRMCoreConfig.dat5703.get(this.getType() + "." + nev) != null) {
            data = JRMCoreConfig.dat5703.get(this.getType() + "." + nev);
            if (react) {
                this.checkReacts(entity, data);
            }
        }
        return data;
    }

    private void checkReacts(Entity entity, byte data) {
        switch (data) {
            case 1: {
                this.setDead();
                break;
            }
            case 2: {
                if (entity.isDead) break;
                entity.setDead();
                break;
            }
            case 3: {
                if (this.effect != 1 || entity.isDead) break;
                entity.setDead();
                break;
            }
            case 4: {
                int var23 = (int)this.damage;
                DamageSource damagesource = Ds.causeEntityEnergyAttDamage(this, this.shootingEntity);
                double motX = entity.motionX;
                double motY = entity.motionY;
                double motZ = entity.motionZ;
                if (JRMCoreH.isFusionSpectator(entity) || !entity.attackEntityFrom(damagesource, (float)var23)) break;
                this.weakenSpiral();
                if (this.type >= 7 || JRMCoreConfig.dat5706[this.type]) break;
                entity.motionX = motX;
                entity.motionY = motY;
                entity.motionZ = motZ;
                break;
            }
            case 5: {
                if (this.effect != 1) break;
                int var23 = (int)this.damage;
                DamageSource damagesource = Ds.causeEntityEnergyAttDamage(this, this.shootingEntity);
                double motX = entity.motionX;
                double motY = entity.motionY;
                double motZ = entity.motionZ;
                if (JRMCoreH.isFusionSpectator(entity) || !entity.attackEntityFrom(damagesource, (float)var23)) break;
                this.weakenSpiral();
                if (this.type >= 7 || JRMCoreConfig.dat5706[this.type]) break;
                entity.motionX = motX;
                entity.motionY = motY;
                entity.motionZ = motZ;
                break;
            }
        }
    }

    @Override
    public long getPower(Entity entity) {
        String powerFormula = JRMCoreConfig.KiAttackPowerFormula;
        long Power = 0L;
        long damage = (long)((EntityEnergyAtt)entity).getDamage();
        long speed = ((EntityEnergyAtt)entity).getSpe();
        long density = ((EntityEnergyAtt)entity).getDen();
        String[] Formula = powerFormula.toLowerCase().replace(" ", "").replace("(", "").replace("damage", damage + "").replace("speed", speed + "").replace("density", density + "").split("\\)");
        for (int i = 0; i < Formula.length; ++i) {
            String formulaSegment;
            String string = formulaSegment = i == 0 ? Formula[i] : Formula[i].substring(1);
            String method = formulaSegment.contains("+") ? "+" : (formulaSegment.contains("-") ? "-" : (formulaSegment.contains("*") ? "*" : (formulaSegment.contains("/") ? "/" : (formulaSegment.contains("%") ? "%" : "null"))));
            long value1 = Long.parseLong(formulaSegment.split("\\" + method)[0]);
            long value2 = 1L;
            long result = value1;
            if (!method.equals("null")) {
                value2 = Long.parseLong(formulaSegment.split("\\" + method)[1]);
                result = JGMathHelper.StringMethod(method, value1, value2);
            }
            if (i > 0) {
                String method2 = Formula[i].substring(0, 1);
                Power = JGMathHelper.StringMethod(method2, Power, result);
                continue;
            }
            Power = result;
        }
        return Power;
    }

    private boolean canSpiralNotGoThrough() {
        return this.isSpiral() ? !JRMCoreConfig.dat5708[this.effect] : true;
    }

    private void createExplosion(int type) {
        if (JGConfigDBCGoD.CONFIG_GOD_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && this.destroyer) {
            type = 10;
        }
        JRMCoreH.newExpl(this.worldObj, this, this.posX, this.posY, this.posZ, this.explevel, false, this.damage, this.shootingEntity, (byte)type);
    }

    private List checkForEntitiesInside() {
        AxisAlignedBB aabb = this.boundingBox.copy();
        List entityList = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, aabb);
        return entityList;
    }

    private void giveExperience(Entity entity, int amount) {
        if (JRMCoreH.DGE(entity) && !this.givenExp) {
            JRMCoreH.jrmcExp(this.shootingEntity, amount, this.getType());
            this.givenExp = true;
        }
    }

    private void playSoundAtEntity(Entity entity, String s, float f, float f1) {
        this.worldObj.playSoundAtEntity(entity, s, f, f1);
        if (this.isWave() && this.shooterHolds) {
            this.worldObj.playSoundEffect((double)this.strtX(), (double)this.strtY(), (double)this.strtZ(), s, f, f1);
        }
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

    private void setTarget(Entity entity) {
        this.target = entity;
        this.hadTarget = true;
    }

    private byte killWeakerAttack(EntityEnergyAtt attack1, EntityEnergyAtt attack2) {
        long power2;
        boolean amIStronger;
        long power1 = this.getPower(attack1);
        boolean bl = amIStronger = power1 > (power2 = this.getPower(attack2));
        if (power1 != power2) {
            if (amIStronger) {
                if ((double)power1 / JRMCoreConfig.dat5705 >= (double)power2) {
                    return 2;
                }
            } else if ((double)power2 / JRMCoreConfig.dat5705 >= (double)power1) {
                this.setDead();
                return 1;
            }
        }
        return 0;
    }

    private void handleJutsuWallClash(EntityEnergyAttJ3 shield) {
        if (JRMCoreH.NC() && shield != this.shootingEntity && shield instanceof EntityEnAttacks) {
            long shieldPower = shield.getPower(shield);
            long kiPower = this.getPower(this);
            double kiDamage = this.getDamage();
            if (JGConfigDBCGoD.CONFIG_GOD_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && this.destroyer && kiPower > shieldPower) {
                shield.setDead();
                return;
            }
            if (kiPower > shieldPower) {
                this.setDamage((float)this.getDamage() - (float)shield.getDamage());
                shield.setDead();
            } else if (kiPower < shieldPower) {
                shield.setDamage((float)shield.getDamage() - (float)kiDamage);
                this.setDead();
            } else {
                shield.setDead();
                this.setDead();
            }
            shield.motionX = 0.0;
            shield.motionY = 0.0;
            shield.motionZ = 0.0;
        }
    }

    private void handleKiaiClash(EntityEnergyAtt attack) {
        float dam = (float)attack.getDamage();
        if (JGConfigDBCGoD.CONFIG_GOD_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && this.destroyer && this.damage * (double)this.DAMAGE_REDUCTION / 2.0 > (double)dam) {
            attack.setDead();
            String s2 = JRMCoreH.getString((EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
            JRMCoreH.setString(JRMCoreH.tech_expgiv(s2, JRMCoreH.DBC() ? JRMCoreHDBC.DBCgetConfigTechExpRate() : 1), (EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
            return;
        }
        if (this.damage / 2.0 > (double)dam) {
            this.setDamage(this.getDamage() - (double)dam);
            attack.setDead();
        } else if (this.damage / 2.0 < (double)dam) {
            attack.setDamage((double)dam - this.damage / 2.0);
            if (this.shootingEntity instanceof EntityPlayer) {
                boolean doit2 = false;
                if (JRMCoreConfig.dat5707 != 0 && (int)(Math.random() * 100.0) < JRMCoreConfig.dat5707) {
                    doit2 = true;
                }
                if (doit2) {
                    String s2 = JRMCoreH.getString((EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                    JRMCoreH.setString(JRMCoreH.tech_expgiv(s2, JRMCoreH.DBC() ? JRMCoreHDBC.DBCgetConfigTechExpRate() : 1), (EntityPlayer)this.shootingEntity, JRMCoreH.techNbt[this.technum]);
                }
            }
            this.setDead();
        } else {
            this.setDead();
            attack.setDead();
        }
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

    public boolean isLaser() {
        return this.getType() == 3;
    }

    public boolean isLargeBlast() {
        return this.getType() == 5;
    }

    public boolean isSpiral() {
        return this.getType() == 4;
    }

    public boolean isBarrage() {
        return this.getType() == 6;
    }

    public boolean isShield() {
        return this.getType() == 7;
    }

    public boolean isExplosion() {
        return this.getType() == 8;
    }

    private boolean hasEffect() {
        return this.effect == 1;
    }

    private void ShieldPushAwayEntities() {
        if (!this.worldObj.isRemote && this.isShield() && this.hasEffect()) {
            Entity var5 = null;
            List var6 = this.checkForEntitiesInside();
            for (int var9 = 0; var9 < var6.size(); ++var9) {
                var5 = (Entity)var6.get(var9);
                if (var5.equals((Object)this.shootingEntity) || !(var5 instanceof EntityLivingBase)) continue;
                float res = 0.5f;
                var5.motionX = ((double)res - (var5.posX - this.posX)) * -1.0;
                var5.motionY = ((double)res - (var5.posY - this.posY)) * -1.0;
                var5.motionZ = ((double)res - (var5.posZ - this.posZ)) * -1.0;
                var5.velocityChanged = true;
            }
        }
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
        nbt.setFloat("size", this.size);
        nbt.setBoolean("destroyer", this.destroyer);
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
        if (nbt.hasKey("size")) {
            this.size = nbt.getFloat("size");
        }
        if (nbt.hasKey("destroyer")) {
            this.destroyer = nbt.getBoolean("destroyer");
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
        return this.damage * (double)(JGConfigDBCGoD.CONFIG_GOD_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && this.destroyer ? this.DAMAGE_REDUCTION : 1.0f);
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
        data.writeByte((int)this.speed);
        data.writeByte((int)this.perc);
        data.writeByte((int)this.effect);
        data.writeInt(this.color);
        data.writeInt(this.dam);
        data.writeByte((int)this.density);
        data.writeShort((int)this.sincantation);
        String se = "";
        if (this.sts != null) {
            for (int i = 0; i < this.sts.length; ++i) {
                se = se + "," + this.sts[i];
            }
            se = se.substring(1);
        }
        ByteBufUtils.writeUTF8String((ByteBuf)data, (String)se);
        data.writeByte((int)this.technum);
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
        data.writeFloat(this.explevel);
        data.writeInt(this.color2);
        data.writeDouble(this.damage);
        data.writeDouble(this.damageOriginal);
        data.writeInt(this.damageTaken);
        data.writeBoolean(this.destroyer);
    }

    public void readSpawnData(ByteBuf data) {
        int first = data.readInt();
        this.shootingEntity = first == 0 ? this.shootingEntity : this.worldObj.getEntityByID(first);
        int second = data.readInt();
        this.target = first == 0 ? this.target : this.worldObj.getEntityByID(second);
        this.perc = data.readByte();
        this.type = data.readByte();
        this.speed = data.readByte();
        this.perc = data.readByte();
        this.effect = data.readByte();
        this.color = data.readInt();
        this.dam = data.readInt();
        this.density = data.readByte();
        this.sincantation = data.readShort();
        String[] se = ByteBufUtils.readUTF8String((ByteBuf)data).split(",");
        if (se.length < 3) {
            byte[] sts2 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.sts = sts2;
        } else {
            byte[] sts2 = new byte[se.length];
            for (int i = 0; i < se.length; ++i) {
                sts2[i] = Byte.parseByte(se[i]);
            }
            this.sts = sts2;
        }
        this.technum = data.readByte();
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
        this.explevel = data.readFloat();
        this.color2 = data.readInt();
        this.damage = data.readDouble();
        this.damageOriginal = data.readDouble();
        this.damageTaken = data.readInt();
        this.destroyer = data.readBoolean();
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

    public void generateParticles(EntityEnergyAtt entityBlast, Entity entity, int color, int color2, boolean startSpawn) {
        if (entityBlast != null && entity != null && entityBlast.worldObj.isRemote) {
            for (int i = 0; i < 3; ++i) {
                for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                    double z2;
                    double y2;
                    double x2;
                    float colorFixer = 0.7f;
                    float red = (float)(color >> 16 & 0xFF) / 255.0f;
                    float green = (float)(color >> 8 & 0xFF) / 255.0f;
                    float blue = (float)(color & 0xFF) / 255.0f;
                    red *= 0.7f;
                    green *= 0.7f;
                    blue *= 0.7f;
                    float red2 = (float)(color2 >> 16 & 0xFF) / 255.0f;
                    float green2 = (float)(color2 >> 8 & 0xFF) / 255.0f;
                    float blue2 = (float)(color2 & 0xFF) / 255.0f;
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

    public void weakenSpiral() {
        if (this.isSpiral() && !this.canSpiralNotGoThrough() && JRMCoreConfig.SpiralWeakensAfterHit > 0) {
            double minusDamage = (double)JRMCoreConfig.SpiralWeakensAfterHit / 100.0;
            if (JRMCoreConfig.SpiralWeakensBasedOnStartDamage) {
                if ((1.0 - minusDamage) * (double)this.damageTaken > this.damage || this.damage <= 0.0) {
                    this.setDead();
                } else {
                    this.damage = this.damageOriginal * (1.0 - minusDamage * (double)this.damageTaken);
                }
                ++this.damageTaken;
            } else if (this.damage <= 0.0) {
                this.setDead();
            } else {
                this.damage *= minusDamage;
            }
            if (this.damage < 0.0) {
                this.damage = 0.0;
                this.setDead();
            }
        }
    }

    public float rad(float angle) {
        return angle * (float)Math.PI / 180.0f;
    }
}

