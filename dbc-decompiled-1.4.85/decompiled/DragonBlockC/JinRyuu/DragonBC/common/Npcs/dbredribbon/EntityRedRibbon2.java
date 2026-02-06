/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
package JinRyuu.DragonBC.common.Npcs.dbredribbon;

import JinRyuu.DragonBC.common.Npcs.EntityDBCWildlifeA;
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

public class EntityRedRibbon2
extends EntityDBCWildlifeA
implements IMob,
IEntityAdditionalSpawnData {
    public final int AttPow = 5;
    public final int HePo = 20;
    public String texture;

    public EntityRedRibbon2(World world) {
        super(world);
        this.experienceValue = 10;
        this.setSize(0.6f, 2.0f);
        this.texture = "";
        this.canFly = false;
        this.canFireKiAttacks = false;
    }

    public void setAttributes(int damage, int health) {
        if (damage != 5 || health != 20) {
            this.getEntityData().setDouble("jrmcSpawnInitiatedCAT", (double)damage);
            this.getEntityData().setDouble("jrmcSpawnInitiatedCHP", (double)health);
        }
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/" + this.texture + ".png";
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    protected void dropFewItems(boolean par1, int par2) {
    }

    public boolean interact(EntityPlayer par1EntityPlayer) {
        return false;
    }

    @Override
    protected boolean canDespawn() {
        return true;
    }

    public void writeSpawnData(ByteBuf additionalData) {
    }

    public void readSpawnData(ByteBuf additionalData) {
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    }
}

