/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.entity.EntityPrjtls_1
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.monster.IMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDBCWildlifeA;
import JinRyuu.JRMCore.entity.EntityPrjtls_1;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityRRMecha
extends EntityDBCWildlifeA
implements IMob,
IEntityAdditionalSpawnData {
    public final int AttPow = 20;
    public final int HePo = 200;
    private byte type;

    public int getType() {
        return this.type;
    }

    protected void fall(float f) {
    }

    public EntityRRMecha(World par1World) {
        super(par1World);
        int hp;
        int dam;
        float[] sizes = new float[]{0.0f, 0.5f, 1.0f};
        this.experienceValue = 50;
        this.type = (byte)(Math.random() * 3.0);
        this.setSize(3.0f * (sizes[this.type] + 1.0f), 4.0f * (sizes[this.type] + 1.0f));
        int n = this.type == 0 ? DBCConfig.NPC_RRMech1_Dam : (dam = this.type == 1 ? DBCConfig.NPC_RRMech2_Dam : DBCConfig.NPC_RRMech3_Dam);
        int n2 = this.type == 0 ? DBCConfig.NPC_RRMech1_HP : (hp = this.type == 1 ? DBCConfig.NPC_RRMech2_HP : DBCConfig.NPC_RRMech3_HP);
        if (dam != 20 || hp != 200) {
            this.getEntityData().setDouble("jrmcSpawnInitiatedCAT", (double)dam);
            this.getEntityData().setDouble("jrmcSpawnInitiatedCHP", (double)hp);
        }
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        float range = 25 * (this.type + 1);
        if (!this.worldObj.isRemote && this.entityToAttack != null && this.entityToAttack.isEntityAlive() && this.entityToAttack.getDistanceToEntity((Entity)this) < range) {
            if (this.type == 0) {
                if (this.ticksExisted % 100 < 31 && this.ticksExisted % 15 == 0) {
                    EntityPrjtls_1 var8 = new EntityPrjtls_1(this.worldObj, (Entity)this, this.entityToAttack, 1.8f, 1.0f, 0);
                    this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC4.rocket_shot", 0.6f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                    this.worldObj.spawnEntityInWorld((Entity)var8);
                }
            } else if (this.type == 1) {
                if (this.ticksExisted % 100 == 0 && (int)(Math.random() * (double)(6 / (this.type + 1))) == 0) {
                    EntityPrjtls_1 var8 = new EntityPrjtls_1(this.worldObj, (Entity)this, this.entityToAttack, 1.5f, 1.0f, 1);
                    this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC4.rocket_shot", 0.6f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                    this.worldObj.spawnEntityInWorld((Entity)var8);
                }
            } else if (this.type == 2 && this.ticksExisted % 100 == 0 && (int)(Math.random() * 2.0) == 0) {
                EntityPrjtls_1 var8 = new EntityPrjtls_1(this.worldObj, (Entity)this, this.entityToAttack, 1.8f, 1.0f, 2);
                this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC4.rocket_shot", 0.6f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                this.worldObj.spawnEntityInWorld((Entity)var8);
            }
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/rrmecha" + this.type + ".png";
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    @Override
    protected Entity findPlayerToAttack() {
        return super.findPlayerToAttack();
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }

    protected void dropFewItems(boolean par1, int par2) {
        if (this.type == 2) {
            float[] chance = new float[]{12.0f, 5.0f, 3.0f};
            int drop_chance = (int)(Math.random() * 101.0);
            if ((float)drop_chance <= chance[2]) {
                this.dropItem(ItemsDBC.ItemChipTier3, 1);
            } else if ((float)drop_chance <= chance[1]) {
                this.dropItem(ItemsDBC.ItemChipTier2, 1);
            } else if ((float)drop_chance <= chance[0]) {
                this.dropItem(ItemsDBC.ItemAlienTechChipTier1, 1);
            }
        } else if (this.type == 1) {
            float[] chance = new float[]{8.0f, 4.0f};
            int drop_chance = (int)(Math.random() * 101.0);
            if ((float)drop_chance <= chance[1]) {
                this.dropItem(ItemsDBC.ItemChipTier2, 1);
            } else if ((float)drop_chance <= chance[0]) {
                this.dropItem(ItemsDBC.ItemAlienTechChipTier1, 1);
            }
        } else if (this.type == 0) {
            float[] chance = new float[]{7.0f};
            int drop_chance = (int)(Math.random() * 101.0);
            if ((float)drop_chance <= chance[0]) {
                this.dropItem(ItemsDBC.ItemAlienTechChipTier1, 1);
            }
        }
    }

    public boolean interact(EntityPlayer par1EntityPlayer) {
        return false;
    }

    @Override
    protected boolean canDespawn() {
        return true;
    }

    public void writeSpawnData(ByteBuf additionalData) {
        additionalData.writeByte((int)this.type);
    }

    public void readSpawnData(ByteBuf additionalData) {
        this.type = additionalData.readByte();
        float[] sizes = new float[]{0.0f, 0.5f, 1.0f};
        this.setSize(3.0f * (sizes[this.type] + 1.0f), 4.0f * (sizes[this.type] + 1.0f));
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        par1NBTTagCompound.setByte("type", this.type);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
        this.type = (byte)(par1NBTTagCompound.getByte("type") & 0xFF);
        float[] sizes = new float[]{0.0f, 0.5f, 1.0f};
        this.setSize(3.0f * (sizes[this.type] + 1.0f), 4.0f * (sizes[this.type] + 1.0f));
    }
}

