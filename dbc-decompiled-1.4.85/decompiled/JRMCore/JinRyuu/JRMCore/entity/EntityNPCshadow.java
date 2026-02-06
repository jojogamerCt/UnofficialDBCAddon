/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.entity.EntityNPC;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import java.util.List;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityNPCshadow
extends EntityNPC
implements IEntityAdditionalSpawnData {
    public int randomSoundDelay = 0;
    public int angerLevel = 0;
    private EntityPlayer summoner = null;
    private EntityLivingBase target = null;
    private int maxHealth = 1;
    private int pmje = 0;
    private int wait = 0;
    private int m = 1;
    private int age = 0;
    private String dnsSum;
    public String expValue;
    private int gen;
    private int breast;
    private float f;

    public EntityPlayer getsummoner() {
        return this.summoner;
    }

    public int getSFire() {
        return this.pmje;
    }

    public int getDam() {
        return this.dam;
    }

    public String getdnsSum() {
        return this.dnsSum;
    }

    public int getGen() {
        return this.gen;
    }

    public float getF() {
        return this.f;
    }

    public EntityNPCshadow(World world) {
        super(world);
        this.toString();
        this.expValue = String.valueOf(this.BattlePower());
        this.gen = 1;
        this.breast = 0;
        this.f = 1.0f;
        this.experienceValue = 30;
    }

    public EntityNPCshadow(World world, EntityPlayer summoner, int body, int dam, EntityLivingBase target) {
        super(world);
        this.toString();
        this.expValue = String.valueOf(this.BattlePower());
        this.gen = 1;
        this.breast = 0;
        this.f = 1.0f;
        this.experienceValue = 1;
        this.summoner = summoner;
        this.dam = dam;
        this.target = target;
        this.maxHealth = body * 2;
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.maxHealth);
    }

    @Override
    public int BattlePower() {
        int exp = this.experienceValue * 100;
        int BattlePower = 1200 + this.rand.nextInt(100);
        return BattlePower;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuunarutoc:npcs/ninja01.png";
    }

    @Override
    public ResourceLocation getResource() {
        return this.summoner != null && this.summoner instanceof AbstractClientPlayer ? ((AbstractClientPlayer)this.summoner).getLocationSkin() : new ResourceLocation("jinryuunarutoc:npcs/ninja01.png");
    }

    public EntityPlayer getSummoner() {
        return this.summoner;
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    @Override
    protected Entity findPlayerToAttack() {
        int n = 8;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(this.posX - (double)n), (double)(this.posY - (double)n), (double)(this.posZ - (double)n), (double)(this.posX + (double)n), (double)(this.posY + (double)n), (double)(this.posZ + (double)n));
        Entity entity = this.worldObj.findNearestEntityWithinAABB(EntityCreature.class, aabb, (Entity)this);
        EntityPlayer entityplayer = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 16.0);
        EntityLivingBase target = this.target;
        return target != null ? target : (entityplayer != null && entityplayer != this.summoner ? entityplayer : (entity != null && entity != this.summoner && entity != this ? entity : null));
    }

    @Override
    public void onLivingUpdate() {
        String[] pmj = JRMCoreH.pmj[Integer.parseInt(this.type)];
        this.pmje = Integer.parseInt(pmj[13]);
        if (!(this.worldObj.isRemote || this.summoner != null && this.summoner instanceof EntityPlayer && this.age <= 6000)) {
            this.setDead();
            return;
        }
        double r = 10.0;
        AxisAlignedBB ab = AxisAlignedBB.getBoundingBox((double)(this.posX - r), (double)(this.posY - r), (double)(this.posZ - r), (double)(this.posX + r), (double)(this.posY + r), (double)(this.posZ + r));
        List entityList = this.worldObj.getEntitiesWithinAABB(((Object)((Object)this)).getClass(), ab);
        if (entityList.size() > 5) {
            this.setDead();
            return;
        }
        ++this.age;
        if (this.age == 1) {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.maxHealth);
            this.heal(this.maxHealth);
        }
        this.teleportAndUpdate();
        super.onLivingUpdate();
    }

    @Override
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
        if (this.isEntityInvulnerable()) {
            return false;
        }
        Entity var3 = par1DamageSource.getEntity();
        if (var3 instanceof EntityPlayer) {
            List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand(32.0, 32.0, 32.0));
            for (int var5 = 0; var5 < var4.size(); ++var5) {
                Entity var6 = (Entity)var4.get(var5);
                if (!(var6 instanceof EntityNPCshadow)) continue;
                EntityNPCshadow var7 = (EntityNPCshadow)var6;
                var7.becomeAngryAt(var3);
            }
            this.becomeAngryAt(var3);
        }
        return super.attackEntityFrom(par1DamageSource, par2);
    }

    private void becomeAngryAt(Entity par1Entity) {
        this.entityToAttack = par1Entity;
        this.angerLevel = 400 + this.rand.nextInt(400);
        this.randomSoundDelay = this.rand.nextInt(40);
    }

    protected void dropFewItems(boolean par1, int par2) {
    }

    public boolean interact(EntityPlayer par1EntityPlayer) {
        return false;
    }

    @Override
    public int getAttackStrength(Entity par1Entity) {
        int dbcA = this.dam;
        return dbcA;
    }

    @Override
    public boolean attackEntityAsMob(Entity par1Entity) {
        boolean var4;
        int var2 = this.getAttackStrength(par1Entity);
        if (this.isPotionActive(Potion.damageBoost)) {
            var2 += 3 << this.getActivePotionEffect(Potion.damageBoost).getAmplifier();
        }
        if (this.isPotionActive(Potion.weakness)) {
            var2 -= 2 << this.getActivePotionEffect(Potion.weakness).getAmplifier();
        }
        int var3 = 0;
        if (par1Entity instanceof EntityLiving) {
            var2 = (int)((float)var2 + EnchantmentHelper.getEnchantmentModifierLiving((EntityLivingBase)this, (EntityLivingBase)((EntityLiving)par1Entity)));
            var3 += EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this, (EntityLivingBase)((EntityLiving)par1Entity));
        }
        if (var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), (float)var2)) {
            int var5;
            if (var3 > 0) {
                par1Entity.addVelocity((double)(-MathHelper.sin((float)(this.rotationYaw * (float)Math.PI / 180.0f)) * (float)var3 * 0.5f), 0.1, (double)(MathHelper.cos((float)(this.rotationYaw * (float)Math.PI / 180.0f)) * (float)var3 * 0.5f));
                this.motionX *= 0.6;
                this.motionZ *= 0.6;
            }
            if ((var5 = EnchantmentHelper.getFireAspectModifier((EntityLivingBase)this)) > 0) {
                par1Entity.setFire(var5 * 4);
            }
        }
        return var4;
    }

    @Override
    public void onDeath(DamageSource par1DamageSource) {
        Entity var3 = par1DamageSource.getEntity();
        this.worldObj.playSoundAtEntity((Entity)this, "jinryuunarutoc:NC1." + JRMCoreH.techNCSndHitPM[0], 1.0f, 1.0f);
        super.onDeath(par1DamageSource);
    }

    @Override
    protected void attackEntity(Entity par1Entity, float par2) {
        if (this.attackTime <= 0 && par2 < 2.0f && par1Entity.boundingBox.maxY > this.boundingBox.minY && par1Entity.boundingBox.minY < this.boundingBox.maxY) {
            this.attackTime = 20;
            this.attackEntityAsMob(par1Entity);
        }
    }

    public void writeSpawnData(ByteBuf data) {
        data.writeInt(this.dam);
        data.writeInt(this.maxHealth);
        ByteBufUtils.writeUTF8String((ByteBuf)data, (String)(this.summoner != null ? this.summoner.getCommandSenderName() : ""));
    }

    public void readSpawnData(ByteBuf data) {
        this.dam = data.readInt();
        this.maxHealth = data.readInt();
        this.summoner = this.worldObj.getPlayerEntityByName(ByteBufUtils.readUTF8String((ByteBuf)data));
    }

    public void writeEntityToNBT(NBTTagCompound nbtCompound) {
        super.writeEntityToNBT(nbtCompound);
        nbtCompound.setInteger("NPCdam", this.dam);
        nbtCompound.setInteger("maxHealth", this.maxHealth);
        nbtCompound.setString("NPCsummoner", this.summoner != null ? this.summoner.getCommandSenderName() : "");
    }

    public void readEntityFromNBT(NBTTagCompound nbtCompound) {
        super.readEntityFromNBT(nbtCompound);
        this.dam = nbtCompound.getInteger("NPCdam");
        this.maxHealth = nbtCompound.getInteger("maxHealth");
        this.summoner = this.worldObj.getPlayerEntityByName(nbtCompound.getString("NPCsummoner"));
    }

    private NBTTagCompound nbt(EntityPlayer p, String s) {
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

    private void teleportAndUpdate() {
        if (this.summoner != null) {
            int R = 32;
            ++this.wait;
            List entityList2 = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand((double)R, (double)R, (double)R));
            if (!entityList2.isEmpty()) {
                for (int var5 = 0; var5 < entityList2.size(); ++var5) {
                    EntityPlayer var6 = (EntityPlayer)entityList2.get(var5);
                    if (!var6.getCommandSenderName().equals(this.summoner.getCommandSenderName())) continue;
                    this.becomeAngryAt((Entity)var6);
                    if (this.wait != 150 * this.m) continue;
                    boolean calculateSize = JRMCoreConfig.ShadowDummyScaleToTarget;
                    if (calculateSize) {
                        float height = this.height;
                        float width = this.width;
                        float heightTarget = this.summoner.height;
                        float widthTarget = this.summoner.width;
                        if (height != heightTarget || width != widthTarget) {
                            this.setSize(widthTarget, heightTarget);
                        }
                    }
                    ++this.m;
                    if (this.worldObj.isRemote) continue;
                    this.setPositionAndUpdate(var6.posX, var6.posY + 1.5, var6.posZ);
                    this.worldObj.playSoundAtEntity((Entity)this, JRMCoreH.TeleportSound(JRMCoreH.getByte(var6, "jrmcPwrtyp")), 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                }
            }
        }
    }
}

