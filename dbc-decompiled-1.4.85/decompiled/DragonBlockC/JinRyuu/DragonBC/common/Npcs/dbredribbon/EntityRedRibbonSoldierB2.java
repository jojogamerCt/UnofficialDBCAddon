/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.entity.EntityPrjtls_1
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs.dbredribbon;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbon2;
import JinRyuu.JRMCore.entity.EntityPrjtls_1;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityRedRibbonSoldierB2
extends EntityRedRibbon2 {
    public final int AttPow = 20;
    public final int HePo = 80;

    public EntityRedRibbonSoldierB2(World world) {
        super(world);
        this.setSize(0.6f, 2.0f);
        this.texture = "redribbon_soldierb2";
        this.setAttributes(DBCConfig.RRSoldier2DAM, DBCConfig.RRSoldier2HP, 20, 80);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote && !this.isDead && this.entityToAttack != null && this.entityToAttack.isEntityAlive() && this.entityToAttack.getDistanceToEntity((Entity)this) < 25.0f && this.ticksExisted % 50 < 12 && this.ticksExisted % 4 == 0) {
            EntityPrjtls_1 var8 = new EntityPrjtls_1(this.worldObj, (Entity)this, this.entityToAttack, 1.8f, 1.0f, 4);
            this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC5.gun_shot_single", 0.2f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
            this.worldObj.spawnEntityInWorld((Entity)var8);
        }
    }
}

