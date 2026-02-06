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

import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbon;
import JinRyuu.JRMCore.entity.EntityPrjtls_1;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityOfficerBlack3
extends EntityRedRibbon {
    public final int AttPow = 170;
    public final int HePo = 480;
    private int lastShot;
    private boolean shot;

    public EntityOfficerBlack3(World world) {
        super(world);
        this.texture = "officer_black_mecha";
        this.setSize(1.5f, 2.8f);
        this.lastShot = -1;
        this.shot = false;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(480.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(170.0);
    }

    @Override
    public long BattlePowerOld() {
        int BP = 16320000;
        int exp = this.experienceValue * 100;
        long BattlePower = BP + this.rand.nextInt((int)Math.pow(10.0, (BP + "").length() - 2));
        return BattlePower;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote && !this.isDead && this.entityToAttack != null && this.entityToAttack.isEntityAlive() && this.entityToAttack.getDistanceToEntity((Entity)this) < 25.0f) {
            if (this.lastShot == -1) {
                this.lastShot = new Random().nextInt(2);
            }
            if (this.lastShot == 0) {
                if ((this.ticksExisted + 200) % 400 < 15) {
                    EntityPrjtls_1 var8 = new EntityPrjtls_1(this.worldObj, (Entity)this, this.entityToAttack, 1.8f, 1.0f, 6);
                    this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC5.gun_shot_single", 0.2f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                    this.worldObj.spawnEntityInWorld((Entity)var8);
                    this.shot = true;
                } else if (this.shot) {
                    this.lastShot = -1;
                    this.shot = false;
                }
            } else if (this.ticksExisted % 100 == 0) {
                EntityPrjtls_1 var8 = new EntityPrjtls_1(this.worldObj, (Entity)this, this.entityToAttack, 1.8f, 1.0f, 2);
                this.worldObj.playSoundAtEntity((Entity)this, "jinryuudragonbc:DBC4.rocket_shot", 0.6f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
                this.worldObj.spawnEntityInWorld((Entity)var8);
                this.shot = true;
            } else if (this.shot) {
                this.lastShot = -1;
                this.shot = false;
            }
        }
    }
}

