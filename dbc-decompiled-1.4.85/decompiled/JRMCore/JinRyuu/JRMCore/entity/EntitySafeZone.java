/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreEH;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreH2;
import JinRyuu.JRMCore.entity.EntityEnAttacks;
import JinRyuu.JRMCore.entity.EntityJRMC;
import JinRyuu.JRMCore.entity.EntityPunch;
import JinRyuu.JRMCore.server.JGMathHelper;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySafeZone
extends EntityJRMC
implements IEntityAdditionalSpawnData {
    public static final HashMap<Class, Boolean> safezoneListResults = new HashMap();
    public final float var1 = 8.0f;
    public final float maxDistanceForPlayer = 4.0f;
    protected Entity closestEntity;
    private int lookTime;
    private Class watchedClass;
    public int holdRotation = -1;
    private List playerList = new ArrayList();
    private int jumpTicks = 0;
    public int duplicatesRadius = 2;
    public int safezoneRadiusXZ = 60;
    public int safezoneRadiusY = 60;
    public String name = "";

    public EntitySafeZone(World world) {
        super(world);
        this.experienceValue = 0;
        this.setCustomNameTag("");
        this.setAlwaysRenderNameTag(false);
        int r2 = this.dimension == 22 ? 20 : (this.dimension == 24 ? -54 : 0);
        this.safezoneRadiusXZ += r2;
        this.safezoneRadiusY += r2;
    }

    public EntitySafeZone(World world, String name) {
        this(world);
        this.name = name;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10000.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0);
    }

    protected boolean isMovementCeased() {
        return true;
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    protected void updateAITasks() {
    }

    public void applyEntityCollision(Entity entity) {
    }

    public void addVelocity(double par1, double par3, double par5) {
        this.isAirBorne = false;
    }

    protected void setBeenAttacked() {
        this.velocityChanged = false;
    }

    public boolean canBePushed() {
        return false;
    }

    protected void collideWithEntity(Entity entity) {
    }

    @Override
    public boolean attackEntityFrom(DamageSource damageSource, float par2) {
        return false;
    }

    @Override
    public boolean attackEntityAsMob(Entity entity) {
        return false;
    }

    @Override
    public int MaxHealth() {
        return 2000;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuumodscore:npcs/TrainingShadowDummy.png";
    }

    public boolean interact(EntityPlayer player) {
        return super.interact(player);
    }

    public void shouldExecute() {
        if (this.holdRotation == -1) {
            ((Object)((Object)this)).getClass();
            this.closestEntity = this.worldObj.getClosestPlayerToEntity((Entity)this, 4.0);
            if (this.closestEntity != null) {
                this.watchedClass = EntityPlayer.class;
                this.getLookHelper().setLookPosition(this.closestEntity.posX, this.closestEntity.posY + 2.0, this.closestEntity.posZ, 10.0f, (float)this.getVerticalFaceSpeed());
            }
        }
    }

    public boolean addInstance(Class cl, boolean b) {
        safezoneListResults.put(cl, b);
        return b;
    }

    public boolean instanceOf(Entity entity) {
        if (JRMCoreConfig.SafeZoneEntityBlacklist.size() == 0) {
            return false;
        }
        Class<?> entityClass = entity.getClass();
        if (safezoneListResults != null && safezoneListResults.size() > 0 && safezoneListResults.containsKey(entityClass)) {
            return safezoneListResults.get(entityClass);
        }
        String name = entityClass.toString();
        try {
            Class<?> cl;
            if (JRMCoreConfig.SafeZoneEntityBlacklist.containsKey(name) && (JRMCoreConfig.SafeZoneEntityWhitelist.size() == 0 || !JRMCoreConfig.SafeZoneEntityWhitelist.containsKey(name))) {
                return this.addInstance(entityClass, true);
            }
            for (String key : JRMCoreConfig.SafeZoneEntityWhitelist.keySet()) {
                if (!JRMCoreH.DBC() && key.startsWith("JinRyuu.DragonBC") || !JRMCoreH.NC() && key.startsWith("JinRyuu.NarutoC") || !(cl = Class.forName(key)).isAssignableFrom(entityClass)) continue;
                return this.addInstance(entityClass, false);
            }
            for (String key : JRMCoreConfig.SafeZoneEntityBlacklist.keySet()) {
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

    public boolean isMostLikelyMe(Entity entity) {
        EntitySafeZone zone;
        return entity instanceof EntitySafeZone && ((Object)((Object)(zone = (EntitySafeZone)entity))).getClass().toString().equals(((Object)((Object)this)).getClass().toString()) && this.name.equals(zone.name) && this.duplicatesRadius == zone.duplicatesRadius && this.safezoneRadiusY == zone.safezoneRadiusY && this.safezoneRadiusXZ == zone.safezoneRadiusXZ && JGMathHelper.doubleSmallerThan(this.posX - zone.posX, 1.0) && JGMathHelper.doubleSmallerThan(this.posY - zone.posY, 1.0) && JGMathHelper.doubleSmallerThan(this.posZ - zone.posZ, 1.0);
    }

    @Override
    public void onUpdate() {
        int i;
        if (!this.worldObj.isRemote && this.isDead) {
            this.setDead();
            return;
        }
        if (this.ticksExisted / 20 == 0) {
            boolean add = true;
            int length = JRMCoreEH.allSafeZones.size();
            for (i = length - 1; i >= 0; --i) {
                EntitySafeZone safezone = (EntitySafeZone)((Object)JRMCoreEH.allSafeZones.get(i));
                if (safezone != null && this.isMostLikelyMe((Entity)JRMCoreEH.allSafeZones.get(i))) {
                    add = false;
                    continue;
                }
                if (safezone != null && !safezone.isDead) continue;
                JRMCoreEH.allSafeZones.remove(i);
            }
            if (add) {
                JRMCoreEH.allSafeZones.add(this);
            }
        }
        if (!this.worldObj.isRemote) {
            int r = this.duplicatesRadius;
            if (r > 0) {
                Entity entity;
                int i2;
                ArrayList<Entity> removeDuplicates = new ArrayList<Entity>();
                AxisAlignedBB ab = AxisAlignedBB.getBoundingBox((double)(this.posX - (double)r), (double)(this.posY - (double)r), (double)(this.posZ - (double)r), (double)(this.posX + (double)r), (double)(this.posY + (double)r), (double)(this.posZ + (double)r));
                List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this.attackingPlayer, ab);
                for (i2 = 0; list.size() > i2; ++i2) {
                    EntitySafeZone p;
                    entity = (Entity)list.get(i2);
                    if (!(entity instanceof EntitySafeZone) || removeDuplicates.contains((Object)(p = (EntitySafeZone)entity))) continue;
                    removeDuplicates.add(entity);
                }
                for (i2 = 0; removeDuplicates.size() > i2; ++i2) {
                    entity = (Entity)removeDuplicates.get(i2);
                    if (i2 <= 0) continue;
                    entity.setDead();
                    removeDuplicates.remove(entity);
                }
            }
            if (JRMCoreConfig.sfzns) {
                Entity entity;
                List list2 = this.createSafeZoneList();
                if (this.safezoneRadiusXZ != 0 && this.safezoneRadiusY != 0) {
                    for (i = 0; list2.size() > i; ++i) {
                        EntityPlayer p;
                        entity = (Entity)list2.get(i);
                        if (this.isEntityOnTheBlacklist(entity)) {
                            entity.setDead();
                        }
                        if (entity instanceof EntityEnAttacks) {
                            if (((EntityEnAttacks)entity).shootingEntity instanceof EntityPlayer) {
                                String t = JRMCoreH.trlai("jinryuujrmcore.entitymasters.nofightinsafe");
                                ((EntityPlayer)((EntityEnAttacks)entity).shootingEntity).addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
                            }
                            entity.setDead();
                        }
                        if (entity instanceof EntityPunch) {
                            if (((EntityPunch)entity).shootingEntity instanceof EntityPlayer) {
                                String t = JRMCoreH.trlai("jinryuujrmcore.entitymasters.nofightinsafe");
                                ((EntityPlayer)((EntityPunch)entity).shootingEntity).addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(JRMCoreH2.styl_ylw));
                            }
                            entity.setDead();
                        }
                        if (!(entity instanceof EntityPlayer) || this.playerList.contains(p = (EntityPlayer)entity)) continue;
                        if (this.name != null && this.name.length() > 0) {
                            this.playerList.add(entity);
                            p.addChatMessage((IChatComponent)new ChatComponentText("jinryuujrmcore.entitymasters.insafezone:" + this.name));
                            continue;
                        }
                        this.playerList.add(entity);
                        p.addChatMessage((IChatComponent)new ChatComponentText("jinryuujrmcore.entitymasters.insaafezone:" + this.name));
                    }
                }
                for (i = 0; this.playerList.size() > i; ++i) {
                    entity = (Entity)this.playerList.get(i);
                    boolean delete = true;
                    if (list2.contains(entity)) {
                        delete = false;
                    }
                    if (!delete) continue;
                    this.playerList.remove(entity);
                    EntityPlayer player = (EntityPlayer)entity;
                    if (this.name != null && this.name.length() > 0) {
                        player.addChatMessage((IChatComponent)new ChatComponentText("jinryuujrmcore.entitymasters.leftsafe:" + this.name));
                        continue;
                    }
                    player.addChatMessage((IChatComponent)new ChatComponentText("jinryuujrmcore.entitymasters.leftasafe:" + this.name));
                }
            } else if (this.playerList.size() > 0) {
                this.playerList.clear();
            }
        }
        super.onUpdate();
        this.shouldExecute();
    }

    public void setDead() {
        int length = JRMCoreEH.allSafeZones.size();
        for (int i = length - 1; i >= 0; --i) {
            EntitySafeZone safezone = (EntitySafeZone)((Object)JRMCoreEH.allSafeZones.get(i));
            if (safezone == null || !this.isMostLikelyMe((Entity)JRMCoreEH.allSafeZones.get(i))) continue;
            JRMCoreEH.allSafeZones.remove(i);
            break;
        }
        this.removeAllPlayers();
        super.setDead();
    }

    @Override
    public void onLivingUpdate() {
        this.motionY = 0.0;
        if (this.jumpTicks > 0) {
            --this.jumpTicks;
        }
        if (this.newPosRotationIncrements > 0) {
            double d0 = this.posX + (this.newPosX - this.posX) / (double)this.newPosRotationIncrements;
            double d1 = this.posY + (this.newPosY - this.posY) / (double)this.newPosRotationIncrements;
            double d2 = this.posZ + (this.newPosZ - this.posZ) / (double)this.newPosRotationIncrements;
            double d3 = MathHelper.wrapAngleTo180_double((double)(this.newRotationYaw - (double)this.rotationYaw));
            this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.newPosRotationIncrements);
            this.rotationPitch = (float)((double)this.rotationPitch + (this.newRotationPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
            --this.newPosRotationIncrements;
            this.setPosition(d0, d1, d2);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        } else if (!this.isClientWorld()) {
            this.motionX = 0.0;
            this.motionY = 0.0;
            this.motionZ = 0.0;
        }
        if (Math.abs(this.motionX) < 0.005) {
            this.motionX = 0.0;
        }
        if (Math.abs(this.motionY) < 0.005) {
            this.motionY = 0.0;
        }
        if (Math.abs(this.motionZ) < 0.005) {
            this.motionZ = 0.0;
        }
        this.worldObj.theProfiler.startSection("ai");
        if (this.isMovementBlocked()) {
            this.isJumping = false;
            this.moveStrafing = 0.0f;
            this.moveForward = 0.0f;
            this.randomYawVelocity = 0.0f;
        } else if (this.isClientWorld()) {
            if (this.isAIEnabled()) {
                this.worldObj.theProfiler.startSection("newAi");
                this.updateAITasks();
                this.worldObj.theProfiler.endSection();
            } else {
                this.worldObj.theProfiler.startSection("oldAi");
                this.worldObj.theProfiler.endSection();
                this.rotationYawHead = this.rotationYaw;
            }
        }
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection("jump");
        if (this.isJumping) {
            if (!this.isInWater() && !this.handleLavaMovement()) {
                if (this.onGround && this.jumpTicks == 0) {
                    this.jump();
                    this.jumpTicks = 10;
                }
            } else {
                this.motionY += (double)0.04f;
            }
        } else {
            this.jumpTicks = 0;
        }
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection("travel");
        this.moveStrafing *= 0.0f;
        this.moveForward *= 0.0f;
        this.randomYawVelocity *= 0.0f;
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection("push");
        if (!this.worldObj.isRemote) {
            this.collideWithNearbyEntities();
        }
        this.worldObj.theProfiler.endSection();
        EntityPlayer var2 = this.worldObj.getClosestPlayerToEntity((Entity)this, 8.0);
        if (var2 != null && this.holdRotation == -1) {
            this.closestEntity = var2;
            this.numTicksToChaseTarget = 10 + this.rand.nextInt(20);
        } else {
            this.randomYawVelocity = (this.rand.nextFloat() - 0.5f) * 20.0f;
        }
        if (this.closestEntity != null && this.holdRotation == -1) {
            this.faceEntity(this.closestEntity, 10.0f, this.getVerticalFaceSpeed());
            if (this.numTicksToChaseTarget-- <= 0 || this.closestEntity.isDead || this.closestEntity.getDistanceSqToEntity((Entity)this) > 64.0) {
                this.closestEntity = null;
            }
        }
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    public void faceEntity(Entity p_70625_1_, float p_70625_2_, float p_70625_3_) {
        double d1;
        double d0 = p_70625_1_.posX - this.posX;
        double d2 = p_70625_1_.posZ - this.posZ;
        if (p_70625_1_ instanceof EntityLivingBase) {
            EntityLivingBase entitylivingbase = (EntityLivingBase)p_70625_1_;
            d1 = entitylivingbase.posY + (double)(entitylivingbase.height * 0.85f) - (double)1.6f - (this.posY + (double)this.getEyeHeight());
        } else {
            d1 = (p_70625_1_.boundingBox.minY + p_70625_1_.boundingBox.maxY) / 2.0 - (this.posY + (double)this.getEyeHeight());
        }
        double d3 = MathHelper.sqrt_double((double)(d0 * d0 + d2 * d2));
        float f2 = (float)(Math.atan2(d2, d0) * 180.0 / Math.PI) - 90.0f;
        float f3 = (float)(-(Math.atan2(d1, d3) * 180.0 / Math.PI));
        this.rotationPitch = this.updateRotation(this.rotationPitch, f3, p_70625_3_);
        this.rotationYaw = this.updateRotation(this.rotationYaw, f2, p_70625_2_);
    }

    private float updateRotation(float currRot, float intendedRot, float maxIncrement) {
        float f3 = MathHelper.wrapAngleTo180_float((float)(intendedRot - currRot));
        if (f3 > maxIncrement) {
            f3 = maxIncrement;
        }
        if (f3 < -maxIncrement) {
            f3 = -maxIncrement;
        }
        return currRot + f3;
    }

    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeInt(this.holdRotation);
        buffer.writeInt(this.duplicatesRadius);
        buffer.writeInt(this.safezoneRadiusXZ);
        buffer.writeInt(this.safezoneRadiusY);
        ByteBufUtils.writeUTF8String((ByteBuf)buffer, (String)this.name);
    }

    public void readSpawnData(ByteBuf buffer) {
        this.holdRotation = buffer.readInt();
        this.duplicatesRadius = buffer.readInt();
        this.safezoneRadiusXZ = buffer.readInt();
        this.safezoneRadiusY = buffer.readInt();
        this.name = ByteBufUtils.readUTF8String((ByteBuf)buffer);
    }

    public void writeEntityToNBT(NBTTagCompound nbt) {
        super.writeEntityToNBT(nbt);
        nbt.setInteger("holdRotation", this.holdRotation);
        nbt.setInteger("duplicatesRadius", this.duplicatesRadius);
        nbt.setInteger("safezoneRadiusXZ", this.safezoneRadiusXZ);
        nbt.setInteger("safezoneRadiusY", this.safezoneRadiusY);
        nbt.setString("safezonename", this.name);
    }

    public void readEntityFromNBT(NBTTagCompound nbt) {
        super.readEntityFromNBT(nbt);
        if (nbt.hasKey("holdRotation")) {
            this.holdRotation = nbt.getInteger("holdRotation");
        }
        if (nbt.hasKey("duplicatesRadius")) {
            this.duplicatesRadius = nbt.getInteger("duplicatesRadius");
        }
        if (nbt.hasKey("safezoneRadiusXZ")) {
            this.safezoneRadiusXZ = nbt.getInteger("safezoneRadiusXZ");
        }
        if (nbt.hasKey("safezoneRadiusY")) {
            this.safezoneRadiusY = nbt.getInteger("safezoneRadiusY");
        }
        if (nbt.hasKey("safezonename")) {
            this.name = nbt.getString("safezonename");
        }
    }

    public AxisAlignedBB createSafeZoneHitBox() {
        int r2XZ = this.safezoneRadiusXZ;
        int r2Y = this.safezoneRadiusY;
        AxisAlignedBB ab2 = AxisAlignedBB.getBoundingBox((double)(this.posX - (double)r2XZ), (double)(this.posY - (double)r2Y), (double)(this.posZ - (double)r2XZ), (double)(this.posX + (double)r2XZ), (double)(this.posY + (double)r2Y), (double)(this.posZ + (double)r2XZ));
        return ab2;
    }

    public List createSafeZoneList() {
        AxisAlignedBB ab2 = this.createSafeZoneHitBox();
        List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, ab2);
        return list;
    }

    public void removeAllPlayers() {
        for (int i = 0; this.playerList.size() > i; ++i) {
            Entity entity = (Entity)this.playerList.get(i);
            EntityPlayer player = (EntityPlayer)entity;
            if (this.name != null && this.name.length() > 0) {
                player.addChatMessage((IChatComponent)new ChatComponentText("jinryuujrmcore.entitymasters.leftsafe:" + this.name));
                continue;
            }
            player.addChatMessage((IChatComponent)new ChatComponentText("jinryuujrmcore.entitymasters.leftasafe:" + this.name));
        }
        this.playerList.clear();
    }

    public Entity getClosestEntity() {
        return this.closestEntity;
    }
}

