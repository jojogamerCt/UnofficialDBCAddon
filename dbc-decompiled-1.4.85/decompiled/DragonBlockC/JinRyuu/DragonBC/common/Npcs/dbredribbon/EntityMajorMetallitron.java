/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.entity.EntityPrjtls_1
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs.dbredribbon;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbon2;
import JinRyuu.JRMCore.entity.EntityPrjtls_1;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityMajorMetallitron
extends EntityRedRibbon2 {
    public final int AttPow = 50;
    public final int HePo = 200;
    private byte damageCategory;

    public EntityMajorMetallitron(World world) {
        super(world);
        this.setSize(1.2f, 5.0f);
        this.texture = "major_metallitron";
        this.setAttributes(DBCConfig.RRMajorDAM, DBCConfig.RRMajorHP, 50, 200);
        this.damageCategory = 0;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/major_metallitron" + (this.damageCategory > 0 ? Integer.valueOf(this.damageCategory + 1) : "") + ".png";
    }

    @Override
    public void writeSpawnData(ByteBuf additionalData) {
        additionalData.writeByte((int)this.damageCategory);
    }

    @Override
    public void readSpawnData(ByteBuf additionalData) {
        this.damageCategory = additionalData.readByte();
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        par1NBTTagCompound.setByte("damageCategory", this.damageCategory);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
        this.damageCategory = (byte)(par1NBTTagCompound.getByte("damageCategory") & 0xFF);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        int currentHealth = (int)this.getHealth();
        int maxHealth = (int)this.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue();
        this.damageCategory = (byte)((maxHealth - currentHealth) / (maxHealth / 3));
        if (this.damageCategory < 0) {
            this.damageCategory = 0;
        } else if (this.damageCategory > 2) {
            this.damageCategory = (byte)2;
        }
        if (!this.worldObj.isRemote && !this.isDead && this.entityToAttack != null && this.entityToAttack.isEntityAlive() && this.entityToAttack.getDistanceToEntity((Entity)this) < 25.0f && (this.ticksExisted + 200) % 400 < 30) {
            EntityPrjtls_1 var8 = new EntityPrjtls_1(this.worldObj, (Entity)this, this.entityToAttack, 1.8f, 1.0f, 6);
            this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC5.gun_shot_single", 0.2f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
            this.worldObj.spawnEntityInWorld((Entity)var8);
        }
    }
}

