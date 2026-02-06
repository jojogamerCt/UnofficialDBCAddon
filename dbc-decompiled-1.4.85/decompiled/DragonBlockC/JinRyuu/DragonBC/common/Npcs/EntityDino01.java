/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.monster.IMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDBCWildlifeA;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityDino01
extends EntityDBCWildlifeA
implements IMob {
    public int randomSoundDelay = 0;
    public final int AttPow = 120;
    public final int HePo = 1000;

    public EntityDino01(World par1World) {
        super(par1World);
        this.experienceValue = 50;
        this.yOffset *= 4.0f;
        this.setSize(8.0f, 12.0f);
        if (DBCConfig.NPC_Dino1_Dam != 120 || DBCConfig.NPC_Dino1_HP != 1000) {
            this.getEntityData().setDouble("jrmcSpawnInitiatedCAT", (double)DBCConfig.NPC_Dino1_Dam);
            this.getEntityData().setDouble("jrmcSpawnInitiatedCHP", (double)DBCConfig.NPC_Dino1_HP);
        }
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(120.0);
    }

    @Override
    public void onUpdate() {
        if (this.randomSoundDelay <= 0 || --this.randomSoundDelay == 0) {
            // empty if block
        }
        super.onUpdate();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/Paozusaurus.png";
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
        this.dropItem(ItemsDBC.ItemDinoMeatBig, 1);
    }

    public boolean interact(EntityPlayer par1EntityPlayer) {
        return false;
    }

    @Override
    protected boolean canDespawn() {
        return true;
    }
}

