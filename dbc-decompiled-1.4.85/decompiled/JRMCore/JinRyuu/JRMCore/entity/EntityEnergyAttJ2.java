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
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntityCusPar;
import JinRyuu.JRMCore.entity.EntityCusPars;
import JinRyuu.JRMCore.entity.EntityEnAttacks;
import JinRyuu.JRMCore.entity.EntityEnergyAttJ;
import JinRyuu.JRMCore.mod_JRMCore;
import JinRyuu.NarutoC.common.NCJutsus;
import cpw.mods.fml.common.FMLCommonHandler;
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

public class EntityEnergyAttJ2
extends EntityEnAttacks
implements IThrowableEntity,
IEntityAdditionalSpawnData,
IEntitySelector,
IProjectile {
    private final byte[] explosion_id = new byte[]{3, 4, 0, -1, -1, -1, -1};
    private final byte[] explosion_size = new byte[]{0, 0, 0, 0, 1, -1, -1};
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
    private float speed;
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
    private int conn;
    private int waveCount = 20;
    private byte wave = 0;
    private Entity target;
    private int cost;
    private int costPerc;
    private int originDmg;
    private boolean shrink = false;
    private int pwrtyp = 0;
    private String nameJutsu;
    public final float[] maxSizeGrowth = new float[]{1.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f};
    public final float[] maxSizeGrowthSpeed = new float[]{0.3f, 0.3f, 1.2f, 0.0f, 0.0f, 1.0f};
    public float size = 0.0f;
    private boolean s_a = false;
    private boolean s_d = false;
    private final int s_wait = 3;
    private long s_start = 0L;
    public boolean chakra_trail = true;
    private int health;
    private byte jtsre;
    private Vec3 fir_vec3;
    private double fir_d8;
    private double fir_d9;

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

    public boolean getShrink() {
        return this.shrink;
    }

    public byte getType() {
        return this.type;
    }

    public int getCol() {
        return this.color;
    }

    public float getSpe() {
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

    public float get_maxSizeGrowth() {
        return this.maxSizeGrowth[this.jtsre - 1];
    }

    public float get_maxSizeGrowthSpeed() {
        return this.maxSizeGrowthSpeed[this.jtsre - 1];
    }

    public byte getjtsre() {
        return this.jtsre;
    }

    public EntityEnergyAttJ2(World par1World) {
        super(par1World);
        this.setSize(this.size, this.size);
    }

    public EntityEnergyAttJ2(byte var1, EntityLivingBase par2EntityLivingBase, byte type, float speed, int dam, byte effect, byte color, byte density, byte sincantation, byte sfire, byte smove, byte perc, int dam1, int cost, int costPerc) {
        super(par2EntityLivingBase.worldObj);
        this.jtsre = var1;
        this.type = type;
        this.speed = speed;
        this.dam = dam;
        this.perc = (byte)50;
        this.effect = effect;
        this.color = JRMCoreH.techNCCol[5];
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
        this.size = 0.0f;
        this.shootingEntity = par2EntityLivingBase;
        this.pwrtyp = 0;
        if (this.shootingEntity instanceof EntityPlayer) {
            this.pwrtyp = JRMCoreH.PlyrPwr((EntityPlayer)this.shootingEntity);
        }
        this.explevel = effect;
        this.renderDistanceWeight = 10.0;
        this.setSize(this.size, this.size);
        double d8 = par2EntityLivingBase.width + 1.0f;
        double d9 = par2EntityLivingBase.height;
        Vec3 vec3 = par2EntityLivingBase.getLook(1.0f);
        double x = par2EntityLivingBase.posX + vec3.xCoord * d8;
        double y = par2EntityLivingBase.posY + vec3.yCoord * d8 + (double)(par2EntityLivingBase.height * 0.55f);
        double z = par2EntityLivingBase.posZ + vec3.zCoord * d8;
        this.setLocationAndAngles(x, y, z, par2EntityLivingBase.rotationYaw, par2EntityLivingBase.rotationPitch);
        this.motionX = -MathHelper.sin((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionZ = MathHelper.cos((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionY = -MathHelper.sin((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, this.speed * (this.getjtsre() == 6 ? 0.8f : 0.7f), 1.0f);
        this.strtX = (float)x;
        this.strtY = (float)y;
        this.strtZ = (float)z;
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
        if (this.worldObj.isRemote && !JRMCoreClient.mc.isGamePaused() && this.getjtsre() == 3 && JGConfigClientSettings.CLIENT_GR3) {
            mod_JRMCore.proxy.func_gcp(this, EntityCusPars.PART1, Math.random() * 4.0 - 2.0, 0.0 + Math.random() * (double)(this.height * 0.25f) + (double)(this.height / 2.0f) - (double)(this.height * 0.25f), Math.random() * 4.0 - 2.0, Math.random() * 0.05 - 0.025, Math.random() * 0.1 + 0.05, Math.random() * 0.05 - 0.025, 0.3f + this.size / 10.0f, 0.3f + this.size / 10.0f, 0.3f + this.size / 10.0f);
            mod_JRMCore.proxy.func_gcp(this, EntityCusPars.PART4, Math.random() * 4.0 - 2.0, 0.0 + (double)(this.height / 2.0f), Math.random() * 4.0 - 2.0, Math.random() * 1.2 - 0.6, Math.random() * 0.2 + 0.1, Math.random() * 1.2 - 0.6, 0.05f, 0.01f, 0.1f);
        }
        if (this.worldObj.isRemote && !this.s_d) {
            if (!this.s_a) {
                this.setSize(this.size, this.size);
                this.size += this.get_maxSizeGrowthSpeed();
                this.s_start = System.nanoTime() / 100000000L;
                this.s_a = true;
            }
            if (this.size >= this.get_maxSizeGrowth()) {
                this.s_d = true;
            }
            if (System.nanoTime() / 100000000L - this.s_start > 3L) {
                this.s_a = false;
            }
        }
        if (!this.worldObj.isRemote && this.shootingEntity == null) {
            this.setDead();
        }
        if (this.type == 0 && !this.worldObj.isRemote && this.shootingEntity != null && this.shootingEntity instanceof EntityPlayer) {
            byte b = JRMCoreH.getByte((EntityPlayer)this.shootingEntity, "jrmcFrng");
            if (b == 0) {
                this.shrink = true;
            }
            if (this.shrink) {
                this.setDead();
            }
        }
        if (this.ticksExisted == 1) {
            this.setSize(this.size, this.size);
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
        if (this.inGround && this.getjtsre() > 2) {
            int var19 = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
            if (block == this.inTile && var19 == this.inData) {
                ++this.ticksInGround;
                if (this.ticksInGround == 1) {
                    this.setDead();
                }
            } else {
                this.inGround = false;
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
            if (!this.worldObj.isRemote && (float)this.ticksInAir == 500.0f * ((float)this.perc * 0.02f)) {
                this.setDead();
            }
            if (var4 != null) {
                var3 = Vec3.createVectorHelper((double)var4.hitVec.xCoord, (double)var4.hitVec.yCoord, (double)var4.hitVec.zCoord);
            }
            if (!this.worldObj.isRemote) {
                Entity var5 = null;
                List var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(0.5, 0.5, 0.5));
                double var7 = 0.0;
                for (var9 = 0; var9 < var6.size(); ++var9) {
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
            }
            if (!this.worldObj.isRemote) {
                List var6;
                double e = 1.0;
                if (e < 1.0) {
                    e = 1.0;
                }
                Object var5 = null;
                if (this.getjtsre() < 3) {
                    var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0, 1.0, 1.0));
                } else {
                    AxisAlignedBB aabb = this.boundingBox.copy();
                    var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, aabb);
                }
                for (var9 = 0; var9 < var6.size(); ++var9) {
                    int exp;
                    float res;
                    float calc;
                    float power;
                    float dent;
                    float spet;
                    float damt;
                    float den;
                    float spe;
                    float dam;
                    int td;
                    int ad;
                    short eff;
                    int d;
                    EntityEnAttacks t;
                    Entity var10 = (Entity)var6.get(var9);
                    if (var10 == this.shootingEntity) continue;
                    if (var10 instanceof EntityLivingBase) {
                        if (var4 == null) {
                            var4 = new MovingObjectPosition(var10);
                        }
                        if (this.target != null) continue;
                        this.setDead();
                        JRMCoreH.newExpl(this.worldObj, this, this.posX, this.posY, this.posZ, 1.0f, false, this.damage, this.shootingEntity, this.explosion_id[this.getjtsre() - 1]);
                        this.target = var10;
                        continue;
                    }
                    if (this.type == 0 && this.wave > 0 && this.shootingEntity instanceof EntityPlayer) {
                        JRMCoreH.setByte(0, (EntityPlayer)this.shootingEntity, "jrmcFrng");
                        this.shrink = true;
                        continue;
                    }
                    if (!(var10 instanceof EntityEnAttacks) && var10 != this.shootingEntity && !(var10 instanceof EntityCusPar)) {
                        if (this.type < 0 || this.type >= 2 || !(this.height > 1.5f)) continue;
                        JRMCoreH.newExpl(this.worldObj, this, this.posX, this.posY, this.posZ, 1.0f, false, this.damage, this.shootingEntity, this.explosion_id[this.getjtsre() - 1]);
                        this.setDead();
                        continue;
                    }
                    if (var10 instanceof EntityEnergyAttJ) {
                        t = (EntityEnergyAttJ)var10;
                        d = (int)((EntityEnergyAttJ)t).getDamage();
                        eff = ((EntityEnergyAttJ)t).getEff();
                        ad = JRMCoreH.cbadmg(this.effect, this.dam, eff, d);
                        if (ad == (td = JRMCoreH.cbtdmg(this.effect, this.dam, eff, d))) {
                            this.setDead();
                        }
                        if (td == 0) {
                            ((EntityEnergyAttJ)t).setDead();
                        } else {
                            ((EntityEnergyAttJ)t).setDamage(td);
                        }
                        dam = (float)(((EntityEnergyAttJ)t).getDamage() / 2.0);
                        spe = (float)((EntityEnergyAttJ)t).getSpe() * 2.0f;
                        den = (float)((EntityEnergyAttJ)t).getDen() * 10.0f;
                        damt = (float)(this.damage / 2.0);
                        spet = this.speed * 2.0f;
                        dent = (float)this.density * 10.0f;
                        power = damt - dam + (spe - spet) + (dent - den);
                        calc = 1.0f - power * 0.01f;
                        if (this.conn == 0) {
                            ++this.conn;
                        }
                        if (this.conn != 1) continue;
                        if (power > 0.0f) {
                            res = ((damt - dam) / damt + (spe - spet) / spe + (dent - den) / dent) / 3.0f;
                            this.motionX *= (double)res;
                            this.motionY *= (double)res;
                            this.motionZ *= (double)res;
                            ((EntityEnergyAttJ)t).motionX = this.motionX;
                            ((EntityEnergyAttJ)t).motionY = this.motionY;
                            ((EntityEnergyAttJ)t).motionZ = this.motionZ;
                            int n = exp = ((EntityEnergyAttJ)t).getAirTicks() < this.ticksInAir ? ((EntityEnergyAttJ)t).getAirTicks() : this.ticksInAir;
                            if (((EntityEnergyAttJ)t).getAirTicks() < this.ticksInAir) {
                                this.ticksInAir = ((EntityEnergyAttJ)t).getAirTicks();
                            }
                        }
                        this.conn = 2;
                        continue;
                    }
                    if (!(var10 instanceof EntityEnergyAttJ2)) continue;
                    t = (EntityEnergyAttJ2)var10;
                    d = (int)((EntityEnergyAttJ2)t).getDamage();
                    eff = ((EntityEnergyAttJ2)t).getEff();
                    ad = JRMCoreH.cbadmg(this.effect, this.dam, eff, d);
                    if (ad == (td = JRMCoreH.cbtdmg(this.effect, this.dam, eff, d))) {
                        this.setDead();
                    }
                    if (td == 0) {
                        ((EntityEnergyAttJ2)t).setDead();
                    } else {
                        ((EntityEnergyAttJ2)t).setDamage(td);
                    }
                    dam = (float)(((EntityEnergyAttJ2)t).getDamage() / 2.0);
                    spe = ((EntityEnergyAttJ2)t).getSpe() * 2.0f;
                    den = (float)((EntityEnergyAttJ2)t).getDen() * 10.0f;
                    damt = (float)(this.damage / 2.0);
                    spet = this.speed * 2.0f;
                    dent = (float)this.density * 10.0f;
                    power = damt - dam + (spe - spet) + (dent - den);
                    calc = 1.0f - power * 0.01f;
                    if (this.conn == 0) {
                        ++this.conn;
                    }
                    if (this.conn != 1) continue;
                    if (power > 0.0f) {
                        res = ((damt - dam) / damt + (spe - spet) / spe + (dent - den) / dent) / 3.0f;
                        this.motionX *= (double)res;
                        this.motionY *= (double)res;
                        this.motionZ *= (double)res;
                        ((EntityEnergyAttJ2)t).motionX = this.motionX;
                        ((EntityEnergyAttJ2)t).motionY = this.motionY;
                        ((EntityEnergyAttJ2)t).motionZ = this.motionZ;
                        int n = exp = ((EntityEnergyAttJ2)t).getAirTicks() < this.ticksInAir ? ((EntityEnergyAttJ2)t).getAirTicks() : this.ticksInAir;
                        if (((EntityEnergyAttJ2)t).getAirTicks() < this.ticksInAir) {
                            this.ticksInAir = ((EntityEnergyAttJ2)t).getAirTicks();
                        }
                    }
                    this.conn = 2;
                }
            }
            if (var4 != null) {
                if (this.target != null && this.shootingEntity instanceof EntityPlayer) {
                    this.trgtX = (float)this.posX;
                    this.trgtY = (float)this.posY;
                    this.trgtZ = (float)this.posZ;
                    byte b = JRMCoreH.getByte((EntityPlayer)this.shootingEntity, "jrmcFrng");
                    if (b == 1) {
                        if (this.waveCount == 20) {
                            this.wave = (byte)(this.wave + 1);
                            if (!this.worldObj.isRemote) {
                                float cost2;
                                EntityPlayer Player = (EntityPlayer)this.shootingEntity;
                                byte curRel = JRMCoreH.getByte(Player, "jrmcRelease");
                                int curEn = JRMCoreH.getInt(Player, "jrmcEnrgy");
                                if (!((float)curEn - (cost2 = (float)(this.cost * curRel) * 0.02f) * ((float)this.perc * 0.02f) > 0.0f)) {
                                    this.setDead();
                                }
                                if (cost2 < 32000.0f) {
                                    if (!JRMCoreH.isInCreativeMode(this.shootingEntity)) {
                                        JRMCoreH.setInt((float)curEn - cost2 * ((float)this.perc * 0.02f), Player, "jrmcEnrgy");
                                    }
                                    this.damage = (float)(this.originDmg * curRel) * 0.02f;
                                } else {
                                    this.setDead();
                                }
                            }
                            int var23 = (int)this.damage;
                            DamageSource damagesource = Ds.causeEntityEnergyAttDamage(this, this.shootingEntity);
                            if (this.target.attackEntityFrom(damagesource, (float)var23)) {
                                // empty if block
                            }
                            this.motionX *= (double)0.05f;
                            this.motionY *= (double)0.05f;
                            this.motionZ *= (double)0.05f;
                            this.target.motionX *= (double)0.05f;
                            this.target.motionY *= (double)0.05f;
                            this.target.motionZ *= (double)0.05f;
                        }
                        this.target.motionX = this.motionX;
                        this.target.motionY = this.motionY;
                        this.target.motionZ = this.motionZ;
                        --this.waveCount;
                        if (this.waveCount <= 0) {
                            this.waveCount = 20;
                        }
                        if (this.wave >= 5) {
                            this.setDead();
                        }
                    } else {
                        JRMCoreH.setByte(0, (EntityPlayer)this.shootingEntity, "jrmcFrng");
                        this.shrink = true;
                    }
                } else if (var4.entityHit != null && this.type == 0) {
                    if (var4.entityHit instanceof EntityLivingBase) {
                        this.target = var4.entityHit;
                    } else {
                        JRMCoreH.setByte(0, (EntityPlayer)this.shootingEntity, "jrmcFrng");
                        this.shrink = true;
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
                    if (JRMCoreH.DGE(var4.entityHit)) {
                        JRMCoreH.jrmcExp(this.shootingEntity, 1, this.getType());
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
                        float var25;
                        if (var4.entityHit instanceof EntityLivingBase && this.knockbackStrength > 0 && (var25 = MathHelper.sqrt_double((double)(this.motionX * this.motionX + this.motionZ * this.motionZ))) > 0.0f) {
                            var4.entityHit.addVelocity(this.motionX * (double)this.knockbackStrength * (double)0.6f / (double)var25, 0.1, this.motionZ * (double)this.knockbackStrength * (double)0.6f / (double)var25);
                        }
                        if (this.type >= 0 && this.type <= 2 && this.height > 1.5f) {
                            JRMCoreH.newExpl(this.worldObj, this, this.posX, this.posY, this.posZ, 1.0f, false, this.damage, this.shootingEntity, this.explosion_id[this.getjtsre() - 1]);
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
            while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
                this.prevRotationPitch += 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
                this.prevRotationYaw -= 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
                this.prevRotationYaw += 360.0f;
            }
            var11 = 0.0f;
            if (this.isInWater()) {
                for (int var26 = 0; var26 < 4; ++var26) {
                    float var27 = 0.25f;
                    this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)var27, this.posY - this.motionY * (double)var27, this.posZ - this.motionZ * (double)var27, this.motionX, this.motionY, this.motionZ);
                }
            }
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
        par1NBTTagCompound.setByte("jtsre", this.jtsre);
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
        this.jtsre = par1NBTTagCompound.getByte("jtsre");
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

    public boolean isEntityApplicable(Entity var1) {
        return false;
    }

    public void writeSpawnData(ByteBuf data) {
        data.writeInt(this.shootingEntity == null ? 0 : this.shootingEntity.getEntityId());
        data.writeInt(this.target == null ? 0 : this.target.getEntityId());
        data.writeByte((int)this.perc);
        data.writeByte((int)this.type);
        data.writeByte((int)this.jtsre);
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
    }

    public void readSpawnData(ByteBuf data) {
        int first = data.readInt();
        this.shootingEntity = first == 0 ? this.shootingEntity : this.worldObj.getEntityByID(first);
        int second = data.readInt();
        this.target = first == 0 ? this.target : this.worldObj.getEntityByID(second);
        this.perc = data.readByte();
        this.type = data.readByte();
        this.jtsre = data.readByte();
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

    public void setDead() {
        this.isDead = true;
    }
}

