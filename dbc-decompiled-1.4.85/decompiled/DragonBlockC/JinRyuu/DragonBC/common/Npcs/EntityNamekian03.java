/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreH2
 *  cpw.mods.fml.common.registry.VillagerRegistry
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityAgeable
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.IMerchant
 *  net.minecraft.entity.INpc
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIAvoidEntity
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIFollowGolem
 *  net.minecraft.entity.ai.EntityAILookAtTradePlayer
 *  net.minecraft.entity.ai.EntityAIMoveIndoors
 *  net.minecraft.entity.ai.EntityAIOpenDoor
 *  net.minecraft.entity.ai.EntityAIPlay
 *  net.minecraft.entity.ai.EntityAIRestrictOpenDoor
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.ai.EntityAITradePlayer
 *  net.minecraft.entity.ai.EntityAIVillagerMate
 *  net.minecraft.entity.ai.EntityAIWander
 *  net.minecraft.entity.ai.EntityAIWatchClosest
 *  net.minecraft.entity.ai.EntityAIWatchClosest2
 *  net.minecraft.entity.monster.EntityZombie
 *  net.minecraft.entity.monster.IMob
 *  net.minecraft.entity.passive.EntityVillager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.ChunkCoordinates
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Tuple
 *  net.minecraft.village.MerchantRecipe
 *  net.minecraft.village.MerchantRecipeList
 *  net.minecraft.village.Village
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.Npcs.EntityNamekian01;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreH2;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFollowGolem;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIVillagerMate;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.Village;
import net.minecraft.world.World;

public class EntityNamekian03
extends EntityVillager
implements INpc,
IMerchant {
    public final int AttPow = 30;
    public final int HePo = 300;
    private int randomTickDivider = 0;
    private boolean isMating = false;
    private boolean isPlaying = false;
    Village villageObj = null;
    private EntityPlayer buyingPlayer;
    private MerchantRecipeList buyingList;
    private int timeUntilReset;
    private boolean needsInitilization;
    private int wealth;
    private String lastBuyingPlayer;
    private boolean isLookingForHome;
    private float field_82191_bN;
    public static final Map villagerStockList = new HashMap();
    public static final Map blacksmithSellingList = new HashMap();

    public EntityNamekian03(World par1World) {
        this(par1World, 0);
    }

    public EntityNamekian03(World par1World, int par2) {
        super(par1World);
        this.setProfession(par2);
        this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityZombie.class, 8.0f, (double)0.3f, (double)0.35f));
        this.tasks.addTask(1, (EntityAIBase)new EntityAITradePlayer((EntityVillager)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAILookAtTradePlayer((EntityVillager)this));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIRestrictOpenDoor((EntityCreature)this));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIVillagerMate((EntityVillager)this));
        this.tasks.addTask(7, (EntityAIBase)new EntityAIFollowGolem((EntityVillager)this));
        this.tasks.addTask(8, (EntityAIBase)new EntityAIPlay((EntityVillager)this, (double)0.32f));
        this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityVillager.class, 5.0f, 0.02f));
        this.tasks.addTask(9, (EntityAIBase)new EntityAIWander((EntityCreature)this, (double)0.3f));
        this.tasks.addTask(10, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0f));
    }

    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
        if (this.isEntityInvulnerable()) {
            return false;
        }
        Entity var3 = par1DamageSource.getEntity();
        if (var3 instanceof EntityPlayer) {
            List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand(32.0, 32.0, 32.0));
            for (int var5 = 0; var5 < var4.size(); ++var5) {
                Entity var6 = (Entity)var4.get(var5);
                if (!(var6 instanceof EntityNamekian01)) continue;
                EntityNamekian01 var7 = (EntityNamekian01)var6;
                var7.becomeAngryAt(var3);
            }
        }
        return super.attackEntityFrom(par1DamageSource, par2);
    }

    public boolean isAIEnabled() {
        return true;
    }

    protected void updateAITick() {
        if (--this.randomTickDivider <= 0) {
            this.worldObj.villageCollectionObj.addVillagerPosition(MathHelper.floor_double((double)this.posX), MathHelper.floor_double((double)this.posY), MathHelper.floor_double((double)this.posZ));
            this.randomTickDivider = 70 + this.rand.nextInt(50);
            this.villageObj = this.worldObj.villageCollectionObj.findNearestVillage(MathHelper.floor_double((double)this.posX), MathHelper.floor_double((double)this.posY), MathHelper.floor_double((double)this.posZ), 32);
            if (this.villageObj != null) {
                ChunkCoordinates var1 = this.villageObj.getCenter();
                if (this.isLookingForHome) {
                    this.isLookingForHome = false;
                }
            }
        }
        if (!this.isTrading() && this.timeUntilReset > 0) {
            --this.timeUntilReset;
            if (this.timeUntilReset <= 0) {
                if (this.needsInitilization) {
                    if (this.buyingList.size() > 1) {
                        for (MerchantRecipe merchantRecipe : this.buyingList) {
                        }
                    }
                    this.addDefaultEquipmentAndRecipies(1);
                    this.needsInitilization = false;
                    if (this.villageObj != null && this.lastBuyingPlayer != null) {
                        this.worldObj.setEntityState((Entity)this, (byte)14);
                        this.villageObj.setReputationForPlayer(this.lastBuyingPlayer, 1);
                    }
                }
                this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
            }
        }
        super.updateAITick();
    }

    public boolean interact(EntityPlayer par1EntityPlayer) {
        return true;
    }

    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(20, (Object)0);
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0);
    }

    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("Profession", this.getProfession());
        par1NBTTagCompound.setInteger("Riches", this.wealth);
        if (this.buyingList != null) {
            par1NBTTagCompound.setTag("Offers", (NBTBase)this.buyingList.getRecipiesAsTags());
        }
    }

    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.setProfession(par1NBTTagCompound.getInteger("Profession"));
        this.wealth = par1NBTTagCompound.getInteger("Riches");
        if (par1NBTTagCompound.hasKey("Offers")) {
            NBTTagCompound var2 = par1NBTTagCompound.getCompoundTag("Offers");
            this.buyingList = new MerchantRecipeList(var2);
        }
    }

    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/namek02.png";
    }

    protected boolean canDespawn() {
        return false;
    }

    public void setProfession(int par1) {
        this.dataWatcher.updateObject(16, (Object)par1);
    }

    public int getProfession() {
        return this.dataWatcher.getWatchableObjectInt(16);
    }

    public boolean isMating() {
        return this.isMating;
    }

    public void setMating(boolean par1) {
        this.isMating = par1;
    }

    public void setPlaying(boolean par1) {
        this.isPlaying = par1;
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    public void onDeath(DamageSource par1DamageSource) {
        if (this.villageObj != null) {
            EntityPlayer var3;
            Entity var2 = par1DamageSource.getEntity();
            if (var2 != null) {
                if (var2 instanceof EntityPlayer) {
                    int al = JRMCoreH.getByte((EntityPlayer)((EntityPlayer)var2), (String)"jrmcAlign");
                    al = (al -= 20) < 0 ? 0 : al;
                    JRMCoreH.setByte((int)al, (EntityPlayer)((EntityPlayer)var2), (String)"jrmcAlign");
                    int kr = JRMCoreH.getInt((EntityPlayer)((EntityPlayer)var2), (String)"jrmcKarma");
                    JRMCoreH.setInt((int)(kr + 1), (EntityPlayer)((EntityPlayer)var2), (String)"jrmcKarma");
                    ((EntityPlayer)var2).addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai((String)"dbc.moreevil.line1"), new Object[0]).setChatStyle(JRMCoreH2.styl_wht));
                    this.villageObj.setReputationForPlayer(((EntityPlayer)var2).getCommandSenderName(), -2);
                } else if (var2 instanceof IMob) {
                    this.villageObj.endMatingSeason();
                }
            } else if (var2 == null && (var3 = this.worldObj.getClosestPlayerToEntity((Entity)this, 16.0)) != null) {
                this.villageObj.endMatingSeason();
            }
        }
        super.onDeath(par1DamageSource);
    }

    public void setCustomer(EntityPlayer par1EntityPlayer) {
        this.buyingPlayer = par1EntityPlayer;
    }

    public EntityPlayer getCustomer() {
        return this.buyingPlayer;
    }

    public boolean isTrading() {
        return this.buyingPlayer != null;
    }

    public void useRecipe(MerchantRecipe par1MerchantRecipe) {
        par1MerchantRecipe.incrementToolUses();
        if (par1MerchantRecipe.hasSameIDsAs((MerchantRecipe)this.buyingList.get(this.buyingList.size() - 1))) {
            this.timeUntilReset = 40;
            this.needsInitilization = true;
            this.lastBuyingPlayer = this.buyingPlayer != null ? this.buyingPlayer.getCommandSenderName() : null;
        }
    }

    public MerchantRecipeList getRecipes(EntityPlayer par1EntityPlayer) {
        if (this.buyingList == null) {
            this.addDefaultEquipmentAndRecipies(1);
        }
        return this.buyingList;
    }

    private float adjustProbability(float par1) {
        float var2 = par1 + this.field_82191_bN;
        return var2 > 0.9f ? 0.9f - (var2 - 0.9f) : var2;
    }

    private void addDefaultEquipmentAndRecipies(int par1) {
        this.field_82191_bN = this.buyingList != null ? MathHelper.sqrt_float((float)this.buyingList.size()) * 0.2f : 0.0f;
        MerchantRecipeList var2 = new MerchantRecipeList();
        VillagerRegistry.manageVillagerTrades((MerchantRecipeList)var2, (EntityVillager)this, (int)this.getProfession(), (Random)this.rand);
        if (var2.isEmpty()) {
            // empty if block
        }
        Collections.shuffle(var2);
        if (this.buyingList == null) {
            this.buyingList = new MerchantRecipeList();
        }
        for (int var9 = 0; var9 < par1 && var9 < var2.size(); ++var9) {
            this.buyingList.addToListWithCheck((MerchantRecipe)var2.get(var9));
        }
    }

    private static int getRandomCountForItem(int par0, Random par1Random) {
        Tuple var2 = (Tuple)villagerStockList.get(par0);
        return var2 == null ? 1 : ((Integer)var2.getFirst() >= (Integer)var2.getSecond() ? (Integer)var2.getFirst() : (Integer)var2.getFirst() + par1Random.nextInt((Integer)var2.getSecond() - (Integer)var2.getFirst()));
    }

    private static int getRandomCountForBlacksmithItem(int par0, Random par1Random) {
        Tuple var2 = (Tuple)blacksmithSellingList.get(par0);
        return var2 == null ? 1 : ((Integer)var2.getFirst() >= (Integer)var2.getSecond() ? (Integer)var2.getFirst() : (Integer)var2.getFirst() + par1Random.nextInt((Integer)var2.getSecond() - (Integer)var2.getFirst()));
    }

    @SideOnly(value=Side.CLIENT)
    public void handleHealthUpdate(byte par1) {
        if (par1 == 12) {
            this.generateRandomParticles("heart");
        } else if (par1 == 13) {
            this.generateRandomParticles("angryVillager");
        } else if (par1 == 14) {
            this.generateRandomParticles("happyVillager");
        } else {
            super.handleHealthUpdate(par1);
        }
    }

    @SideOnly(value=Side.CLIENT)
    private void generateRandomParticles(String par1Str) {
        for (int var2 = 0; var2 < 5; ++var2) {
            double var3 = this.rand.nextGaussian() * 0.02;
            double var5 = this.rand.nextGaussian() * 0.02;
            double var7 = this.rand.nextGaussian() * 0.02;
            this.worldObj.spawnParticle(par1Str, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, this.posY + 1.0 + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, var3, var5, var7);
        }
    }

    public void initCreature() {
        VillagerRegistry.applyRandomTrade((EntityVillager)this, (Random)this.worldObj.rand);
    }

    public void setLookingForHome() {
        this.isLookingForHome = true;
    }

    public EntityVillager func_90012_b(EntityAgeable par1EntityAgeable) {
        EntityVillager var2 = new EntityVillager(this.worldObj);
        return var2;
    }
}

