/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.p.DBC.DBCPacketHandlerServer
 *  JinRyuu.JRMCore.server.JGPlayerMP
 *  JinRyuu.JRMCore.server.config.dbc.JGConfigDBCInstantTransmission
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
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Entitys;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.p.DBC.DBCPacketHandlerServer;
import JinRyuu.JRMCore.server.JGPlayerMP;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCInstantTransmission;
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
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EntityInstantTransmission
extends Entity
implements IThrowableEntity,
IEntityAdditionalSpawnData,
IEntitySelector,
IProjectile {
    public static final float SOUND = 0.25f;
    public Entity shootingEntity;
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    private Block inTile;
    private int inData = 0;
    private boolean inGround = false;
    private int ticksInGround;
    private int ticksInAir = 0;
    private byte speed;
    private float size = 10.0f;
    private boolean teleported = false;
    private byte mode = 0;
    private byte skillLevel = 1;
    private byte shortTPMode = 0;
    private byte surroundMode = 0;

    public int getShrink() {
        return this.getDataWatcher().getWatchableObjectInt(20);
    }

    public byte getSpe() {
        return this.speed;
    }

    public int getAirTicks() {
        return this.ticksInAir;
    }

    public void setAirTicks(int i) {
        this.ticksInAir = i;
    }

    public EntityInstantTransmission(World world) {
        super(world);
        this.setSize(this.size, this.size);
    }

    public EntityInstantTransmission(EntityLivingBase userEntity) {
        super(userEntity.worldObj);
        this.speed = (byte)20;
        this.size = 0.5f;
        this.shootingEntity = userEntity;
        this.renderDistanceWeight = 10.0;
        this.setSize(this.size, this.size);
        double d10 = 2.0;
        double d8 = userEntity.width + 1.0f;
        double d9 = userEntity.height + 0.5f + this.size * 0.5f;
        Vec3 vec3 = userEntity.getLookVec();
        double x = userEntity.posX + vec3.xCoord * d8 - vec3.xCoord * 2.0;
        double y = userEntity.posY + vec3.yCoord * d8 + (double)(userEntity.height * 0.55f) - vec3.yCoord * 2.0;
        double z = userEntity.posZ + vec3.zCoord * d8 - vec3.zCoord * 2.0;
        this.yOffset = this.size * 0.5f;
        this.setLocationAndAngles(x, y, z, userEntity.getRotationYawHead(), userEntity.rotationPitch);
        this.motionX = -MathHelper.sin((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionZ = MathHelper.cos((float)(this.rotationYaw / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.motionY = -MathHelper.sin((float)(this.rotationPitch / 180.0f * (float)Math.PI));
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, (float)this.speed * 0.05f, 1.0f);
    }

    public void setData(int mode, int skillLevel, int shortTPMode, int surroundMode) {
        this.mode = (byte)mode;
        this.skillLevel = (byte)skillLevel;
        this.shortTPMode = (byte)shortTPMode;
        this.surroundMode = (byte)surroundMode;
    }

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
        if (!this.worldObj.isRemote && !JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED[0]) {
            this.setDead();
            return;
        }
        this.onLand();
        if (!this.worldObj.isRemote && this.shootingEntity == null) {
            this.setDead();
        }
        if (this.posY >= 250.0) {
            this.motionY = 0.0;
        } else {
            this.size = 0.5f;
            this.setSize(this.size, this.size);
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
                    // empty if block
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
            int t;
            ++this.ticksInAir;
            Vec3 var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            Vec3 var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            MovingObjectPosition var4 = this.worldObj.func_147447_a(var17, var3, false, true, false);
            var17 = Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ);
            var3 = Vec3.createVectorHelper((double)(this.posX + this.motionX), (double)(this.posY + this.motionY), (double)(this.posZ + this.motionZ));
            if (!this.worldObj.isRemote && this.ticksInAir >= 2000) {
                this.setDead();
            }
            if (this.ticksInAir == ((t = this.ticksInAir / 10 * 10) == 0 ? 10 : t)) {
                this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:" + JRMCoreH.techSnds((int)0, (int)2, (int)0), 1.0f, 1.0f);
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
                    if (!(var10 instanceof EntityLivingBase) || !var10.canBeCollidedWith() || var10 == this.shootingEntity && this.ticksInAir < 5 || (var13 = (var12 = var10.boundingBox.expand((double)(var11 = 0.0f), (double)var11, (double)var11)).calculateIntercept(var17, var3)) == null || !((var14 = var17.distanceTo(var13.hitVec)) < var7) && var7 != 0.0) continue;
                    var5 = var10;
                    var7 = var14;
                }
                if (var5 != null) {
                    var4 = new MovingObjectPosition(var5);
                }
            }
            if (var4 != null) {
                if (!this.worldObj.isRemote) {
                    // empty if block
                }
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
        data.writeByte((int)this.speed);
        data.writeFloat(this.size);
    }

    public void readSpawnData(ByteBuf data) {
        int first = data.readInt();
        this.shootingEntity = first == 0 ? this.shootingEntity : this.worldObj.getEntityByID(first);
        this.speed = data.readByte();
        this.size = data.readFloat();
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

    public void onLand() {
        if (this.shootingEntity != null && !this.teleported && !this.worldObj.isRemote) {
            for (int j = 0; j < JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SHORT_MAX_RANGE[this.skillLevel - 1]; ++j) {
                Block block;
                this.posX += this.motionX;
                this.posY += this.motionY;
                this.posZ += this.motionZ;
                this.setPosition(this.posX, this.posY, this.posZ);
                if (!JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SHORT_GO_THROUGH_BLOCKS_ENABLED && (block = this.shootingEntity.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ)).getMaterial() != Material.air) {
                    block.setBlockBoundsBasedOnState((IBlockAccess)this.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ);
                    AxisAlignedBB axisalignedbb = block.getCollisionBoundingBoxFromPool(this.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ);
                    if (axisalignedbb != null && axisalignedbb.isVecInside(Vec3.createVectorHelper((double)this.posX, (double)this.posY, (double)this.posZ))) {
                        String message = "Instant Transmission Failed! A block was in the way";
                        ((EntityPlayer)this.shootingEntity).addChatMessage(new ChatComponentText(message).setChatStyle(DBCPacketHandlerServer.styleRed));
                        this.setDead();
                        return;
                    }
                }
                double r = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SHORT_TARGET_FINDER_RANGE;
                AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(this.posX - r), (double)(this.posY - r), (double)(this.posZ - r), (double)(this.posX + r), (double)(this.posY + r), (double)(this.posZ + r));
                List entityList = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, aabb);
                for (int i = 0; i < entityList.size(); ++i) {
                    NBTTagCompound nbt2;
                    String fusionMembers2;
                    String[] fusionParticipants2;
                    EntityPlayer fusedPlayerPartner;
                    boolean isController;
                    String[] fusionParticipants;
                    String fusionMembers;
                    float value;
                    Block block2;
                    int k;
                    double z;
                    double y;
                    double x;
                    Entity targetEntity = (Entity)entityList.get(i);
                    if (targetEntity == null || !(targetEntity instanceof EntityLivingBase) || !targetEntity.isEntityAlive() || targetEntity.equals((Object)this.shootingEntity) || JRMCoreH.isFusionSpectator((Entity)targetEntity)) continue;
                    if (targetEntity instanceof EntityPlayer && JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_RELEASE_SENSE_REQUIRED_ENABLED[0]) {
                        boolean targetCanBeSensed;
                        JGPlayerMP targetMP = new JGPlayerMP((EntityPlayer)targetEntity);
                        NBTTagCompound nbt22 = this.nbt((EntityPlayer)targetEntity, "pres");
                        targetMP.setNBT(nbt22);
                        byte targetRelease = targetMP.getRelease();
                        boolean bl = targetCanBeSensed = targetRelease > 0;
                        if (!targetCanBeSensed) {
                            String message = "Instant Transmission Failed! Target can not be sensed at 0% Release Level.";
                            ((EntityPlayer)this.shootingEntity).addChatMessage(new ChatComponentText(message).setChatStyle(DBCPacketHandlerServer.styleRed));
                            this.setDead();
                            return;
                        }
                    }
                    EntityPlayer pl = (EntityPlayer)this.shootingEntity;
                    int groupID = JRMCoreH.getInt((EntityPlayer)pl, (String)"JRMCGID");
                    ArrayList<EntityPlayer> teleportedEntities = new ArrayList<EntityPlayer>();
                    teleportedEntities.add(pl);
                    if (this.surroundMode != -1) {
                        int surroundPlayerLimit = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_PLAYER_LIMIT_SKILL_LEVEL[0][this.skillLevel - 1];
                        double r2 = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_TARGET_FINDER_RANGE;
                        double r2Y = 1.0;
                        AxisAlignedBB aabb2 = AxisAlignedBB.getBoundingBox((double)(pl.posX - r2), (double)(pl.posY - 1.0), (double)(pl.posZ - r2), (double)(pl.posX + r2), (double)(pl.posY + 1.0), (double)(pl.posZ + r2));
                        List entityList2 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, aabb2);
                        for (int k2 = 0; k2 < entityList2.size(); ++k2) {
                            boolean groupOnly;
                            Entity nearbyEntity = (Entity)entityList2.get(k2);
                            if (nearbyEntity == null || !(nearbyEntity instanceof EntityPlayer) || ((EntityPlayer)nearbyEntity).equals((Object)targetEntity) || ((EntityPlayer)nearbyEntity).equals((Object)pl) || !nearbyEntity.isEntityAlive()) continue;
                            if (surroundPlayerLimit != -1 && teleportedEntities.size() - 1 > surroundPlayerLimit) break;
                            boolean bl = groupOnly = this.surroundMode == 0;
                            if (groupOnly) {
                                int egid = JRMCoreH.getInt((EntityPlayer)((EntityPlayer)nearbyEntity), (String)"JRMCGID");
                                if (egid != groupID || groupID == 0) continue;
                                teleportedEntities.add((EntityPlayer)nearbyEntity);
                                continue;
                            }
                            teleportedEntities.add((EntityPlayer)nearbyEntity);
                        }
                    }
                    JGPlayerMP jgPlayer = new JGPlayerMP(pl);
                    NBTTagCompound nbt = this.nbt(pl, "pres");
                    jgPlayer.setNBT(nbt);
                    String ste = jgPlayer.getStatusEffects();
                    boolean divine = JRMCoreH.StusEfcts((int)17, (String)ste);
                    boolean creativeMode = JRMCoreH.isInCreativeMode((Entity)pl);
                    if (!creativeMode) {
                        int[] playerAttributes = jgPlayer.getAttributes();
                        byte race = jgPlayer.getRace();
                        byte classID = jgPlayer.getClassID();
                        byte powerType = jgPlayer.getPowerType();
                        int curEnergy = jgPlayer.getEnergy();
                        int maxEnergy = jgPlayer.getEnergyMax(race, classID, powerType, playerAttributes, JRMCoreH.SklLvl_KiBs((EntityPlayer)pl, (int)powerType));
                        double FLAT_COST = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[0][0][this.skillLevel - 1];
                        double PERCENTAGE_COST = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[0][1][this.skillLevel - 1];
                        double costMulti = PERCENTAGE_COST / 100.0;
                        double energyCost = (double)maxEnergy * costMulti + FLAT_COST;
                        if (teleportedEntities.size() > 1) {
                            double costPerPlayerFlat = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[0][this.skillLevel - 1];
                            double costPerPlayerPerc = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[1][this.skillLevel - 1];
                            double costMultiPerPlayer = costPerPlayerPerc / 100.0;
                            double energyCostDim = (double)maxEnergy * costMultiPerPlayer + costPerPlayerFlat;
                            energyCost += energyCostDim * (double)(teleportedEntities.size() - 1);
                        }
                        if ((double)curEnergy < energyCost) {
                            String message = "Instant Transmission Failed! Not Enough Ki: " + (int)energyCost;
                            pl.addChatMessage(new ChatComponentText(message).setChatStyle(DBCPacketHandlerServer.styleRed));
                            this.setDead();
                            return;
                        }
                        int remainingEnergy = curEnergy - (int)energyCost;
                        JRMCoreH.setInt((int)remainingEnergy, (EntityPlayer)pl, (String)"jrmcEnrgy");
                    }
                    pl.worldObj.playSoundAtEntity((Entity)pl, divine ? "jinryuudragonbc:DBC4.blacktp" : "jinryuudragonbc:DBC5.instant_transmission", 0.25f, pl.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                    if (this.shortTPMode == -1) {
                        x = targetEntity.posX;
                        y = targetEntity.posY;
                        z = targetEntity.posZ;
                        Block block3 = this.shootingEntity.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ);
                        if (block3.getMaterial() != Material.air) {
                            y += 1.0;
                        }
                    } else if (this.shortTPMode == 0) {
                        x = targetEntity.posX - this.motionX * 2.0;
                        y = targetEntity.posY - this.motionY * 2.0;
                        z = targetEntity.posZ - this.motionZ * 2.0;
                        block3: for (k = 0; k < 3; ++k) {
                            boolean found = false;
                            block2 = this.shootingEntity.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ);
                            for (int l = 0; l < 3; ++l) {
                                block2 = this.shootingEntity.worldObj.getBlock((int)this.posX, (int)this.posY + l, (int)this.posZ);
                                if (block2.getMaterial() == Material.air) continue;
                                if (k == 2) {
                                    y += 1.0;
                                    continue block3;
                                }
                                value = k == 0 ? 1.0f : 0.0f;
                                x = targetEntity.posX - this.motionX * (double)value;
                                y = targetEntity.posY - this.motionY * (double)value;
                                z = targetEntity.posZ - this.motionZ * (double)value;
                                continue block3;
                            }
                        }
                    } else {
                        x = targetEntity.posX + this.motionX * 2.0;
                        y = targetEntity.posY + this.motionY * 2.0;
                        z = targetEntity.posZ + this.motionZ * 2.0;
                        block5: for (k = 0; k < 3; ++k) {
                            boolean found = false;
                            block2 = this.shootingEntity.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ);
                            for (int l = 0; l < 3; ++l) {
                                block2 = this.shootingEntity.worldObj.getBlock((int)this.posX, (int)this.posY + l, (int)this.posZ);
                                if (block2.getMaterial() == Material.air) continue;
                                if (k == 2) {
                                    y += 1.0;
                                    continue block5;
                                }
                                value = k == 0 ? 1.0f : 0.0f;
                                x = targetEntity.posX + this.motionX * (double)value;
                                y = targetEntity.posY + this.motionY * (double)value;
                                z = targetEntity.posZ + this.motionZ * (double)value;
                                continue block5;
                            }
                        }
                    }
                    JRMCoreH.playerUsedInstantTransmission((EntityPlayer)pl);
                    for (int k3 = teleportedEntities.size() - 1; k3 >= 0; --k3) {
                        EntityPlayer entity = (EntityPlayer)teleportedEntities.get(k3);
                        double x2 = entity.posX - pl.posX;
                        double y2 = 0.0;
                        double z2 = entity.posZ - pl.posZ;
                        ((EntityPlayerMP)entity).setPositionAndRotation(x + x2, y + y2 + 1.0, z + z2, entity.rotationYaw - (float)(this.shortTPMode == 1 ? 180 : 0), entity.rotationPitch * (float)(this.shortTPMode == 1 ? -1 : 1));
                        ((EntityPlayerMP)entity).playerNetServerHandler.setPlayerLocation(x + x2, y + y2 + 1.0, z + z2, entity.rotationYaw, entity.rotationPitch);
                        entity.addExperience(1);
                    }
                    if (JRMCoreH.isFused((Entity)pl) && (fusionMembers = nbt.getString("jrmcFuzion")).length() > 0 && !fusionMembers.equals(" ") && (fusionParticipants = fusionMembers.split(",")).length == 3 && (isController = fusionParticipants[0].equalsIgnoreCase(pl.getCommandSenderName())) && (fusedPlayerPartner = pl.worldObj.getPlayerEntityByName(fusionParticipants[1])) != null && (fusionParticipants2 = (fusionMembers2 = (nbt2 = this.nbt(fusedPlayerPartner, "pres")).getString("jrmcFuzion")).split(",")).length == 3) {
                        ((EntityPlayerMP)fusedPlayerPartner).playerNetServerHandler.setPlayerLocation(x, y + 1.5, z, fusedPlayerPartner.rotationYaw, fusedPlayerPartner.rotationPitch);
                        fusedPlayerPartner.addExperience(1);
                    }
                    JRMCoreH.playerUsedInstantTransmission((EntityPlayer)pl);
                    this.teleported = true;
                    this.motionX = 0.0;
                    this.motionY = 0.0;
                    this.motionZ = 0.0;
                    pl.worldObj.playSoundAtEntity((Entity)pl, divine ? "jinryuudragonbc:DBC4.blacktp" : "jinryuudragonbc:DBC5.instant_transmission", 0.25f, pl.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                    if (nbt.hasKey("jrmcInstantTransmissionTimers")) {
                        String instantTransmissionTimers = nbt.getString("jrmcInstantTransmissionTimers");
                        String[] values = instantTransmissionTimers.split(";");
                        int tpShort = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COOLDOWN[0][this.skillLevel - 1];
                        int tpLong = Integer.parseInt(values[1]);
                        JRMCoreH.setString((String)(tpShort + ";" + tpLong), (EntityPlayer)pl, (String)"jrmcInstantTransmissionTimers");
                    } else {
                        String instantTransmissionTimers = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COOLDOWN[0][this.skillLevel - 1] + ";0";
                        JRMCoreH.setString((String)instantTransmissionTimers, (EntityPlayer)pl, (String)"jrmcInstantTransmissionTimers");
                    }
                    this.setDead();
                    return;
                }
            }
            if (!this.isDead) {
                String message = "Instant Transmission didn't find any targets!";
                ((EntityPlayerMP)this.shootingEntity).addChatMessage(new ChatComponentText(message).setChatStyle(DBCPacketHandlerServer.styleRed));
                this.setDead();
                return;
            }
        }
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
}

