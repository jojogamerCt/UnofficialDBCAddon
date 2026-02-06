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
 *  net.minecraft.entity.monster.IMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class EntityJRMC
extends EntityCreature
implements IMob {
    protected String texture;
    private double moveSpeed = 0.699;
    public int rang = 0;
    public int angerLevel = 0;
    private int aggroCooldown = 0;
    public int prevAttackCounter = 0;
    public int attackCounter = 0;
    private Entity targetedEntity = null;
    public String expValue;

    public EntityJRMC(World par1World) {
        super(par1World);
        this.toString();
        this.expValue = String.valueOf(this.BattlePower());
        this.experienceValue = 5;
        this.setCustomNameTag("");
        this.setAlwaysRenderNameTag(false);
    }

    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return this.texture;
    }

    public long BattlePower() {
        long BattlePower = this.experienceValue;
        return BattlePower;
    }

    public int getExperiencePoints(EntityPlayer Player) {
        return this.experienceValue;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.MaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
    }

    protected void entityInit() {
        super.entityInit();
    }

    protected boolean isAIEnabled() {
        return false;
    }

    protected boolean canDespawn() {
        return false;
    }

    public void onDeath(DamageSource par1DamageSource) {
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
        super.updateEntityActionState();
    }

    public void onLivingUpdate() {
        this.updateArmSwingProgress();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        super.onLivingUpdate();
    }

    public void onUpdate() {
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
        float i = this.getAttackStrength(par1Entity);
        int j = 0;
        if (par1Entity instanceof EntityLiving) {
            i += EnchantmentHelper.getEnchantmentModifierLiving((EntityLivingBase)this, (EntityLivingBase)((EntityLiving)par1Entity));
            j += EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this, (EntityLivingBase)((EntityLiving)par1Entity));
        }
        if (flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i)) {
            int k;
            if (j > 0) {
                par1Entity.addVelocity((double)(-MathHelper.sin((float)(this.rotationYaw * (float)Math.PI / 180.0f)) * (float)j * 0.5f), 0.1, (double)(MathHelper.cos((float)(this.rotationYaw * (float)Math.PI / 180.0f)) * (float)j * 0.5f));
                this.motionX *= 0.6;
                this.motionZ *= 0.6;
            }
            if ((k = EnchantmentHelper.getFireAspectModifier((EntityLivingBase)this)) > 0) {
                par1Entity.setFire(k * 4);
            }
            if (par1Entity instanceof EntityLiving) {
                // empty if block
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

