/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.client.JGRenderHelper
 *  JinRyuu.JRMCore.entity.EntityEnergyAtt
 *  JinRyuu.JRMCore.entity.aai.AAi
 *  JinRyuu.JRMCore.entity.aai.AAiSystem
 *  JinRyuu.JRMCore.server.config.dbc.JGConfigDBCAAiDifficulty
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.monster.IMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.EntityDBCWildlife;
import JinRyuu.DragonBC.common.Npcs.aai.AAiDBCFlyingCharge;
import JinRyuu.DragonBC.common.Npcs.aai.AAiDBCGroundDash;
import JinRyuu.DragonBC.common.Npcs.aai.AAiDBCGroundJump;
import JinRyuu.DragonBC.common.Npcs.aai.AAiDBCKiAttackCharge;
import JinRyuu.DragonBC.common.Npcs.aai.AAiDBCTeleport;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.JGRenderHelper;
import JinRyuu.JRMCore.entity.EntityEnergyAtt;
import JinRyuu.JRMCore.entity.aai.AAi;
import JinRyuu.JRMCore.entity.aai.AAiSystem;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCAAiDifficulty;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class EntityDBC
extends EntityCreature
implements IMob {
    public static final double DISTANCE_LENGTH_MAX = 64.0;
    public static final double DISTANCE_LENGTH_MIN = 4.0;
    protected String texture;
    private double moveSpeed = DBCConfig.EnemyDefaultMoveSpeed;
    private int rang = 0;
    private boolean updtd = false;
    public int angerLevel = 0;
    private int aggroCooldown = 0;
    public int prevAttackCounter = 0;
    public int attackCounter = 0;
    private Entity targetedEntity = null;
    private byte data1 = 1;
    private byte data2 = 0;
    private byte data3 = 0;
    private byte data4 = 0;
    private boolean blst = false;
    public boolean canFly = true;
    public boolean canFireKiAttacks = true;
    public boolean kiBarrageType0 = true;
    public int kiAttackTimer = 80;
    public int kiAttackTimerMin = 5;
    public boolean chargingKiAttack = false;
    public int chargingKiAttackTimer = 0;
    public int chargingKiAttackTimerMax = 0;
    public AAiSystem aaiSystem;
    public boolean hasAAiKiChargeSystem = false;
    public Entity lockedBy = null;
    public int difficultyID = 0;
    public boolean aggressive = true;
    public static final int STYLE_EASY = 0;
    public static final int STYLE_MEDIUM = 1;
    public static final int STYLE_HARD = 2;
    public static final int STYLE_INSANE = 3;

    public void setData1(int data) {
        this.data1 = (byte)data;
    }

    public void setData2(int data) {
        this.data2 = (byte)data;
    }

    public void setData3(int data) {
        this.data3 = (byte)data;
    }

    public void setData4(int data) {
        this.data4 = (byte)data;
    }

    public boolean doBlst() {
        if (this.blst) {
            this.blst = false;
            return true;
        }
        return false;
    }

    public EntityDBC(World par1World) {
        super(par1World);
        this.experienceValue = 5;
        this.setCustomNameTag("");
        this.setAlwaysRenderNameTag(false);
        this.moveSpeed = DBCConfig.EnemyDefaultMoveSpeed;
    }

    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return this.texture;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
    }

    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(23, (Object)new Integer(0));
    }

    protected boolean isAIEnabled() {
        return false;
    }

    protected boolean canDespawn() {
        return false;
    }

    public void onDeath(DamageSource par1DamageSource) {
        Entity var3 = par1DamageSource.getEntity();
        if (var3 instanceof EntityPlayer) {
            int e = 1;
            if (var3 instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer)var3;
                JRMCoreH.expPls((EntityPlayer)player, (int)e);
            }
        }
        super.onDeath(par1DamageSource);
    }

    public int getAttackStrength(Entity par1Entity, int AttPow) {
        ItemStack var2 = this.getHeldItem();
        boolean var3 = false;
        int value = (int)((float)(AttPow + 1) * 0.5f);
        int dbcA = AttPow - this.rand.nextInt(value);
        if (dbcA < 0) {
            dbcA = 0;
        }
        return dbcA;
    }

    protected void updateEntityActionState() {
        boolean doSuperActionUpdate = true;
        if (!(this instanceof EntityDBCWildlife) && this.angerLevel > 0) {
            doSuperActionUpdate = false;
            this.fallDistance = 0.0f;
            this.prevAttackCounter = this.attackCounter;
            if (this.targetedEntity != null && this.targetedEntity.isDead) {
                this.targetedEntity = null;
                this.dataWatcher.updateObject(23, (Object)0);
                super.updateEntityActionState();
            }
            if (this.targetedEntity == null || this.aggroCooldown-- <= 0) {
                this.targetedEntity = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 100.0);
                super.updateEntityActionState();
                if (this.targetedEntity != null) {
                    this.dataWatcher.updateObject(23, (Object)this.targetedEntity.getEntityId());
                    this.aggroCooldown = 20;
                }
            }
            float r = this.width / 2.0f + 3.5f;
            if (this.entityToAttack != null && this.entityToAttack.isEntityAlive() && this.entityToAttack.getDistanceToEntity((Entity)this) < r) {
                AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(this.posX - (double)r), (double)(this.posY - (double)r), (double)(this.posZ - (double)r), (double)(this.posX + (double)r), (double)(this.posY + (double)r), (double)(this.posZ + (double)r));
                List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                double distance = this.getXZDistanceToEntity(this.targetedEntity);
                if (this.attackTime - (!DBCConfig.AaiDisabled && distance < 0.5 ? DBCConfig.EnemyDefaultAttackTimer - DBCConfig.EnemyDefaultShortRangeAttackTimer : 0) <= 0) {
                    for (int i = 0; i < list.size(); ++i) {
                        EntityPlayer player = (EntityPlayer)list.get(i);
                        this.attackEntityAsMob((Entity)player);
                    }
                    this.attackTime = DBCConfig.EnemyDefaultAttackTimer;
                    this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC3.force", 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                }
            }
            if (this.targetedEntity != null && this.targetedEntity.isEntityAlive() && this.targetedEntity.getDistanceSqToEntity((Entity)this) < 4096.0) {
                double distanceMulti;
                double ogTimer = this.kiAttackTimer >= 10 ? this.kiAttackTimer : 80;
                int fireAttackRate = (int)(ogTimer / (distanceMulti = this.targetedEntity.getDistanceSqToEntity((Entity)this) / 50.0 * 0.1 + 1.0));
                if (fireAttackRate < this.kiAttackTimerMin) {
                    fireAttackRate = this.kiAttackTimerMin;
                }
                double d5 = this.targetedEntity.posX - this.posX;
                double d6 = this.targetedEntity.boundingBox.minY + (double)(this.targetedEntity.height / 2.0f) - (this.posY + (double)(this.height / 2.0f));
                double d7 = this.targetedEntity.posZ - this.posZ;
                this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0f / (float)Math.PI;
                if (this.canFireKiAttacks && this.canEntityBeSeen(this.targetedEntity)) {
                    if (!this.hasAAiKiChargeSystem || this.chargingKiAttack) {
                        ++this.attackCounter;
                        if (this.attackCounter >= fireAttackRate) {
                            this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC2.basicbeam_fire", 0.5f, 1.0f);
                            byte type = this.data1;
                            byte speed = 1;
                            byte effect = 1;
                            byte color = this.data2;
                            byte density = 1;
                            byte sincantation = 0;
                            byte sfire = 0;
                            byte smove = 0;
                            byte[] sts = JRMCoreH.techDBCstatsDefault;
                            int dmg = (int)(50.0f / (this.data1 == 6 ? 5.0f : 1.0f));
                            int f = (int)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
                            int dmg1 = (int)((float)f * 1.2f / (this.data1 == 6 ? 5.0f : 1.0f));
                            int cst = dmg1 / 2;
                            EntityEnergyAtt kiAttack = this.data3 == 0 ? new EntityEnergyAtt((EntityLivingBase)this, type, speed, dmg, effect, color, density, sincantation, sfire, smove, 50, dmg1, cst, sts, 0) : new EntityEnergyAtt((EntityLivingBase)this, type, speed, dmg, effect, color, this.data4, density, sincantation, sfire, smove, 50, dmg1, cst, sts, 0);
                            double d8 = (double)this.width + 0.5;
                            Vec3 vec3 = this.getLook(1.0f);
                            kiAttack.posX = this.posX + vec3.xCoord * d8;
                            kiAttack.posY = this.posY + (double)(this.height / 2.0f) + 0.5;
                            kiAttack.posZ = this.posZ + vec3.zCoord * d8;
                            this.worldObj.spawnEntityInWorld((Entity)kiAttack);
                            if (this.data1 != 6 || (int)(Math.random() * 8.0) == 0) {
                                this.attackCounter = -40;
                                this.blst = true;
                            } else {
                                this.attackCounter = this.kiBarrageType0 ? fireAttackRate - 10 : fireAttackRate;
                                this.blst = false;
                            }
                        }
                    }
                } else if (this.attackCounter > 0) {
                    --this.attackCounter;
                }
            } else if (this.attackCounter > 0) {
                --this.attackCounter;
            }
        }
        if (doSuperActionUpdate) {
            super.updateEntityActionState();
        }
    }

    public void lookForTarget() {
        if (this.angerLevel <= 0 && (this.targetedEntity == null || this.aggroCooldown-- <= 0)) {
            this.targetedEntity = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 100.0);
            super.updateEntityActionState();
            if (this.targetedEntity != null) {
                this.dataWatcher.updateObject(23, (Object)this.targetedEntity.getEntityId());
                this.aggroCooldown = 20;
                this.becomeAngryAt(this.targetedEntity);
            }
        }
    }

    public int updateDataInt(int i) {
        return this.dataWatcher.getWatchableObjectInt(i);
    }

    public void onLivingUpdate() {
        this.updateArmSwingProgress();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        super.onLivingUpdate();
    }

    public void onUpdate() {
        if (this.worldObj.isRemote) {
            ++this.rang;
        }
        if (this.worldObj.isRemote && this.rang > 100) {
            this.rang = 0;
            int i = this.updateDataInt(23);
            Entity entity = this.targetedEntity = i > 0 ? this.worldObj.getEntityByID(i) : null;
        }
        if (!this.worldObj.isRemote && !this.updtd) {
            this.updtd = true;
        }
        if (!(this instanceof EntityDBCWildlife) && this.targetedEntity != null && this.canEntityBeSeen(this.targetedEntity) && this.canFly) {
            boolean client = this.targetedEntity.worldObj.isRemote;
            double posYTarget = this.targetedEntity.posY - (client ? (JGRenderHelper.isClientPlayer((Entity)this.targetedEntity) ? 1.6 : 0.0) : 0.0);
            if (!(!(posYTarget - this.posY > 5.0) && this.targetedEntity.onGround || this.isJumping)) {
                double yDistance = 0.0;
                double posY = this.posY - (client ? (JGRenderHelper.isClientPlayer((Entity)this) ? 1.6 : 0.0) : 0.0);
                double d1 = posYTarget - posY;
                if (d1 < 0.0) {
                    d1 *= -1.0;
                }
                yDistance = d1;
                double clientPlayerPosDiff = this.worldObj.isRemote ? (JGRenderHelper.isClientPlayer((Entity)this.targetedEntity) ? 1.6f : 0.0f) : 0.0f;
                double targetPos = this.targetedEntity.posY - clientPlayerPosDiff;
                this.fallDistance = 0.0f;
                if (yDistance > 0.5) {
                    if (targetPos > this.posY - 0.5) {
                        this.motionY += yDistance > 0.1 ? 0.1 : (yDistance < -0.01 ? -0.01 : yDistance);
                    }
                } else {
                    this.motionY = 0.01;
                }
            }
        }
        if (this.aaiSystem != null) {
            this.aaiSystem.update();
        }
        if (this.lockedBy != null && !this.lockedBy.isEntityAlive()) {
            this.lockedBy = null;
        }
        super.onUpdate();
    }

    protected Entity findPlayerToAttack() {
        EntityPlayer entityplayer = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 16.0);
        return entityplayer != null && this.canEntityBeSeen((Entity)entityplayer) ? entityplayer : null;
    }

    public boolean attackEntityAsMob(Entity entity) {
        if (!(entity instanceof EntityDBC)) {
            boolean flag;
            int f = (int)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
            f = this.getAttackStrength(entity, f);
            int i = 0;
            if (entity instanceof EntityLivingBase) {
                f = (int)((float)f + EnchantmentHelper.getEnchantmentModifierLiving((EntityLivingBase)this, (EntityLivingBase)((EntityLivingBase)entity)));
                i += EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this, (EntityLivingBase)((EntityLivingBase)entity));
            }
            if (flag = entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), (float)f)) {
                int j;
                if (i > 0) {
                    entity.addVelocity((double)(-MathHelper.sin((float)(this.rotationYaw * (float)Math.PI / 180.0f)) * (float)i * 0.5f), 0.1, (double)(MathHelper.cos((float)(this.rotationYaw * (float)Math.PI / 180.0f)) * (float)i * 0.5f));
                    this.motionX *= 0.6;
                    this.motionZ *= 0.6;
                }
                if ((j = EnchantmentHelper.getFireAspectModifier((EntityLivingBase)this)) > 0) {
                    entity.setFire(j * 4);
                }
                if (entity instanceof EntityLivingBase) {
                    EnchantmentHelper.func_151384_a((EntityLivingBase)((EntityLivingBase)entity), (Entity)this);
                }
                EnchantmentHelper.func_151385_b((EntityLivingBase)this, (Entity)entity);
            }
            return flag;
        }
        return false;
    }

    protected void attackEntity(Entity par1Entity, float par2) {
        if (this.attackTime <= 0 && par2 < this.width / 2.0f + 2.5f && par1Entity.boundingBox.maxY > this.boundingBox.minY && par1Entity.boundingBox.minY < this.boundingBox.maxY) {
            this.attackTime = DBCConfig.EnemyDefaultAttackTimer;
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

    public Entity getTargetedEntity() {
        return this.targetedEntity;
    }

    public boolean getupdtd() {
        return this.updtd;
    }

    public void becomeAngryAtAPlayer() {
        List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(16.0, 16.0, 16.0));
        if (!list.isEmpty()) {
            Entity entity = (Entity)list.get(0);
            this.becomeAngryAt(entity);
        }
    }

    public void becomeAngryAtAllPlayer() {
        List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(16.0, 16.0, 16.0));
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                Entity entity = (Entity)list.get(i);
                this.becomeAngryAt(entity);
            }
        }
    }

    public void becomeAngryAtClosestPlayer() {
        List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(16.0, 16.0, 16.0));
        if (!list.isEmpty()) {
            Entity entityClosest = null;
            int rangeClosest = -1;
            for (int i = 0; i < list.size(); ++i) {
                Entity entity = (Entity)list.get(i);
                int range = (int)(entity != null && entity.isEntityAlive() ? entity.getDistanceToEntity((Entity)this) : 0.0f);
                if (range <= rangeClosest) continue;
                entityClosest = entity;
                rangeClosest = range;
            }
            if (entityClosest != null) {
                this.becomeAngryAt(entityClosest);
            }
        }
    }

    private void becomeAngryAt(Entity entity) {
        this.entityToAttack = entity;
        this.angerLevel = 400 + this.rand.nextInt(400);
    }

    public void becomeAngryAt2(Entity entity) {
        this.becomeAngryAt(entity);
    }

    public void setAttributes(int damage, int health, int AttPow, int HePo) {
        if (damage != AttPow || health != HePo) {
            this.getEntityData().setDouble("jrmcSpawnInitiatedCAT", (double)damage);
            this.getEntityData().setDouble("jrmcSpawnInitiatedCHP", (double)health);
        }
    }

    public double getXZDistanceToEntity(Entity targetEntity) {
        double d2;
        double d0 = targetEntity.posX - this.posX;
        if (d0 < 0.0) {
            d0 *= -1.0;
        }
        if ((d2 = targetEntity.posZ - this.posZ) < 0.0) {
            d2 *= -1.0;
        }
        return d0 + d2;
    }

    public double getYDistanceToEntity(Entity targetEntity) {
        double d1 = targetEntity.posY - this.posY;
        if (d1 < 0.0) {
            d1 *= -1.0;
        }
        return d1;
    }

    public double getYDistanceToEntityWithClientDiff(Entity targetEntity) {
        boolean client = targetEntity.worldObj.isRemote;
        double posYTarget = targetEntity.posY - (client ? (JGRenderHelper.isClientPlayer((Entity)targetEntity) ? 1.6 : 0.0) : 0.0);
        double posY = this.posY - (client ? (JGRenderHelper.isClientPlayer((Entity)this) ? 1.6 : 0.0) : 0.0);
        double d1 = posYTarget - posY;
        if (d1 < 0.0) {
            d1 *= -1.0;
        }
        return d1;
    }

    public boolean isJumping() {
        return this.isJumping;
    }

    public void useJump() {
        this.jump();
    }

    public static double[] values(double ... values) {
        return values;
    }

    public void setBattleStyle(double movementSpeed, double[] highJump, double[] dash, double[] flyingDash, double[] backawayKiCharge) {
        if (!DBCConfig.AaiDisabled) {
            if (movementSpeed != -1.0) {
                this.moveSpeed *= movementSpeed;
            }
            this.aaiSystem = new AAiSystem((Entity)this, new AAi[0]);
            if (highJump != null) {
                this.aaiSystem.addAAi((AAi)new AAiDBCGroundJump(highJump));
            }
            if (dash != null) {
                this.aaiSystem.addAAi((AAi)new AAiDBCGroundDash(dash));
            }
            if (flyingDash != null && this.canFly) {
                this.aaiSystem.addAAi((AAi)new AAiDBCFlyingCharge(flyingDash));
            }
            if (backawayKiCharge != null && this.canFireKiAttacks) {
                this.aaiSystem.addAAi((AAi)new AAiDBCKiAttackCharge(backawayKiCharge));
                this.hasAAiKiChargeSystem = true;
            }
        }
    }

    public void setEasyDifficulty() {
        this.setDifficulty(0);
    }

    public void setMediumDifficulty() {
        this.setDifficulty(1);
    }

    public void setHardDifficulty() {
        this.setDifficulty(2);
    }

    public void setInsaneDifficulty() {
        this.setDifficulty(3);
    }

    public void setDifficulty(int difficulty) {
        if (this.aaiSystem != null) {
            this.aaiSystem.aais.clear();
        } else {
            this.aaiSystem = new AAiSystem((Entity)this, new AAi[0]);
        }
        if (DBCConfig.AaiForceDifficulty != -1) {
            difficulty = DBCConfig.AaiForceDifficulty;
        }
        this.difficultyID = difficulty;
        this.setBattleStyle(JGConfigDBCAAiDifficulty.SpeedMulti[this.difficultyID], EntityDBC.values(JGConfigDBCAAiDifficulty.JumpMulti[this.difficultyID], JGConfigDBCAAiDifficulty.JumpRate[this.difficultyID], JGConfigDBCAAiDifficulty.JumpMulti2[this.difficultyID], JGConfigDBCAAiDifficulty.JumpLimit[this.difficultyID], JGConfigDBCAAiDifficulty.JumpLimit2[this.difficultyID]), EntityDBC.values(JGConfigDBCAAiDifficulty.GroundDashSpeedMulti[this.difficultyID], 1.0, JGConfigDBCAAiDifficulty.GroundDashSpeedMulti2[this.difficultyID], JGConfigDBCAAiDifficulty.GroundDashLimit[this.difficultyID]), EntityDBC.values(JGConfigDBCAAiDifficulty.FlyingDashMulti[this.difficultyID], 1.0, JGConfigDBCAAiDifficulty.FlyingDashLimit[this.difficultyID]), EntityDBC.values(JGConfigDBCAAiDifficulty.KiAttackChargeMulti[this.difficultyID], 0.1, JGConfigDBCAAiDifficulty.KiAttackChargeLimit[this.difficultyID]));
    }

    public void setKiUsage(boolean canFly, boolean canFireKiAttacks) {
        this.canFly = canFly;
        this.canFireKiAttacks = canFireKiAttacks;
    }

    public void setKiUsageAndDifficulty(boolean canFly, boolean canFireKiAttacks) {
        this.setKiUsageAndDifficulty(canFly, canFireKiAttacks, -1);
    }

    public void setKiUsageAndDifficulty(boolean canFly, boolean canFireKiAttacks, int difficulty) {
        this.setKiUsage(canFly, canFireKiAttacks);
        if (difficulty != -1) {
            this.setDifficulty(difficulty);
        }
    }

    public boolean isLocked() {
        return this.lockedBy != null;
    }

    public void addAAiTeleport(int rateMin, int rateMax, String sound) {
        if (this.aaiSystem == null) {
            this.aaiSystem = new AAiSystem((Entity)this, new AAi[0]);
        }
        this.aaiSystem.addAAi((AAi)new AAiDBCTeleport(rateMin, rateMax, sound));
    }

    public void addAAiTeleport(int rateMin, int rateMax) {
        if (this.aaiSystem == null) {
            this.aaiSystem = new AAiSystem((Entity)this, new AAi[0]);
        }
        this.aaiSystem.addAAi((AAi)new AAiDBCTeleport(new int[]{rateMin, rateMax}));
    }

    public void addAAiTeleport() {
        if (this.aaiSystem == null) {
            this.aaiSystem = new AAiSystem((Entity)this, new AAi[0]);
        }
        this.aaiSystem.addAAi((AAi)new AAiDBCTeleport(new int[]{JGConfigDBCAAiDifficulty.TeleportRateMin[this.difficultyID], JGConfigDBCAAiDifficulty.TeleportRateMax[this.difficultyID]}));
    }

    public void addAAiTeleport(String sound) {
        if (this.aaiSystem == null) {
            this.aaiSystem = new AAiSystem((Entity)this, new AAi[0]);
        }
        this.aaiSystem.addAAi((AAi)new AAiDBCTeleport(JGConfigDBCAAiDifficulty.TeleportRateMin[this.difficultyID], JGConfigDBCAAiDifficulty.TeleportRateMax[this.difficultyID], sound));
    }

    public boolean attackEntityFrom(DamageSource ds, float f) {
        boolean ret = super.attackEntityFrom(ds, f);
        Entity target = ds.getEntity();
        if (target != null && target.isEntityAlive() && this.targetedEntity == null) {
            this.lookForTarget();
        }
        return ret;
    }
}

