/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.entity.EntityEnergyAttJ;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class EntityNPC
extends EntityCreature {
    protected String texture;
    protected String type = "6";
    protected int dam = 0;
    public String expValue;
    public int angerLevel;
    private int aggroCooldown;
    public int prevAttackCounter;
    public int attackCounter;
    private Entity targetedEntity;

    public EntityNPC(World par1World) {
        super(par1World);
        this.toString();
        this.expValue = String.valueOf(this.BattlePower());
        this.angerLevel = 0;
        this.aggroCooldown = 0;
        this.prevAttackCounter = 0;
        this.attackCounter = 0;
        this.targetedEntity = null;
        this.experienceValue = 5;
    }

    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return this.texture;
    }

    public ResourceLocation getResource() {
        return null;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.MaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
    }

    public int BattlePower() {
        int BattlePower = this.experienceValue;
        return BattlePower;
    }

    public int getExperiencePoints(EntityPlayer par1EntityPlayer) {
        return this.experienceValue;
    }

    protected boolean canDespawn() {
        return true;
    }

    public void onDeath(DamageSource par1DamageSource) {
        Entity var3 = par1DamageSource.getEntity();
        if (var3 instanceof EntityPlayer) {
            int e = 1;
            if (var3 instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer)var3;
                JRMCoreH.expPls(player, e);
            }
        }
        super.onDeath(par1DamageSource);
    }

    public int getAttackStrength(Entity par1Entity) {
        ItemStack var2 = this.getHeldItem();
        int var3 = 5;
        return var3;
    }

    public int MaxHealth() {
        return 20;
    }

    protected void updateEntityActionState() {
        if (this.angerLevel > 0) {
            this.fallDistance = 0.0f;
            this.prevAttackCounter = this.attackCounter;
            if (this.targetedEntity != null && this.targetedEntity.isDead) {
                this.targetedEntity = null;
                super.updateEntityActionState();
            }
            if (this.targetedEntity == null || this.aggroCooldown-- <= 0) {
                this.targetedEntity = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 100.0);
                super.updateEntityActionState();
                if (this.targetedEntity != null) {
                    this.aggroCooldown = 20;
                }
            }
            double d4 = 64.0;
            if (this.targetedEntity != null && this.targetedEntity.getDistanceSqToEntity((Entity)this) < d4 * d4) {
                double d5 = this.targetedEntity.posX - this.posX;
                double d6 = this.targetedEntity.boundingBox.minY + (double)(this.targetedEntity.height / 2.0f) - (this.posY + (double)(this.height / 2.0f));
                double d7 = this.targetedEntity.posZ - this.posZ;
                this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0f / (float)Math.PI;
                if (this.canEntityBeSeen(this.targetedEntity)) {
                    int t;
                    ++this.attackCounter;
                    if (this.attackCounter == 80 && (t = Integer.parseInt(this.type)) == 6) {
                        byte type = 1;
                        boolean speed = true;
                        byte effect = 0;
                        byte color = 0;
                        byte density = 1;
                        byte sincantation = 4;
                        byte sfire = 0;
                        byte smove = 3;
                        int dmg1 = this.dam;
                        int cst = this.dam / 2;
                        EntityEnergyAttJ entityball = new EntityEnergyAttJ((EntityLivingBase)this, type, (float)speed, this.dam, effect, color, density, sincantation, sfire, smove, -1, dmg1, cst, 5);
                        double d8 = 0.5;
                        Vec3 vec3 = this.getLook(1.0f);
                        entityball.posX = this.posX + vec3.xCoord * d8;
                        entityball.posY = this.posY + (double)(this.height / 2.0f) + 0.5;
                        entityball.posZ = this.posZ + vec3.zCoord * d8;
                        this.worldObj.spawnEntityInWorld((Entity)entityball);
                        this.attackCounter = -40;
                    }
                } else if (this.attackCounter > 0) {
                    --this.attackCounter;
                }
            } else if (this.attackCounter > 0) {
                --this.attackCounter;
            }
        } else {
            super.updateEntityActionState();
        }
    }

    public void onLivingUpdate() {
        this.updateArmSwingProgress();
        super.onLivingUpdate();
    }

    public void onUpdate() {
        if (this.targetedEntity == null || this.canEntityBeSeen(this.targetedEntity)) {
            // empty if block
        }
        super.onUpdate();
    }

    protected Entity findPlayerToAttack() {
        EntityPlayer entityplayer = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 16.0);
        return entityplayer != null && this.canEntityBeSeen((Entity)entityplayer) ? entityplayer : null;
    }

    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
        if (this.isEntityInvulnerable()) {
            return false;
        }
        if (super.attackEntityFrom(par1DamageSource, par2)) {
            Entity entity = par1DamageSource.getEntity();
            if (this.riddenByEntity != entity && this.ridingEntity != entity) {
                if (entity != this) {
                    this.entityToAttack = entity;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public int getDBCAttack(Entity par1Entity) {
        ItemStack var2 = this.getHeldItem();
        int var3 = 10;
        return var3;
    }

    public boolean attackEntityAsMob(Entity par1Entity) {
        boolean flag;
        int i = this.getAttackStrength(par1Entity);
        if (this.isPotionActive(Potion.damageBoost)) {
            i += 3 << this.getActivePotionEffect(Potion.damageBoost).getAmplifier();
        }
        if (this.isPotionActive(Potion.weakness)) {
            i -= 2 << this.getActivePotionEffect(Potion.weakness).getAmplifier();
        }
        int j = 0;
        if (par1Entity instanceof EntityLiving) {
            i = (int)((float)i + EnchantmentHelper.getEnchantmentModifierLiving((EntityLivingBase)this, (EntityLivingBase)((EntityLiving)par1Entity)));
            j += EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this, (EntityLivingBase)((EntityLiving)par1Entity));
        }
        if (flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), (float)i)) {
            int k;
            if (j > 0) {
                par1Entity.addVelocity((double)(-MathHelper.sin((float)(this.rotationYaw * (float)Math.PI / 180.0f)) * (float)j * 0.5f), 0.1, (double)(MathHelper.cos((float)(this.rotationYaw * (float)Math.PI / 180.0f)) * (float)j * 0.5f));
                this.motionX *= 0.6;
                this.motionZ *= 0.6;
            }
            if ((k = EnchantmentHelper.getFireAspectModifier((EntityLivingBase)this)) > 0) {
                par1Entity.setFire(k * 4);
            }
        }
        return flag;
    }

    protected void attackEntity(Entity par1Entity, float par2) {
        if (this.attackTime <= 0 && par2 < 2.0f && par1Entity.boundingBox.maxY > this.boundingBox.minY && par1Entity.boundingBox.minY < this.boundingBox.maxY) {
            this.attackTime = 20;
            this.attackEntityAsMob(par1Entity);
        }
    }

    public float getBlockPathWeight(int par1, int par2, int par3) {
        return 0.5f - this.worldObj.getLightBrightness(par1, par2, par3);
    }

    protected boolean isValidLightLevel() {
        int k;
        int j;
        int i = MathHelper.floor_double((double)this.posX);
        if (this.worldObj.getSavedLightValue(EnumSkyBlock.Sky, i, j = MathHelper.floor_double((double)this.boundingBox.minY), k = MathHelper.floor_double((double)this.posZ)) > this.rand.nextInt(32)) {
            return false;
        }
        int l = this.worldObj.getBlockLightValue(i, j, k);
        if (this.worldObj.isThundering()) {
            int i1 = this.worldObj.skylightSubtracted;
            this.worldObj.skylightSubtracted = 10;
            l = this.worldObj.getBlockLightValue(i, j, k);
            this.worldObj.skylightSubtracted = i1;
        }
        return l <= this.rand.nextInt(8);
    }

    public boolean getCanSpawnHere() {
        return true;
    }
}

