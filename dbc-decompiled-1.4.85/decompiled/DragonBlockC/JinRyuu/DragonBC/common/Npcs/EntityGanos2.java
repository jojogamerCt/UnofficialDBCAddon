/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.Npcs.EntityDBCBasicEvil;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGanos2
extends EntityDBCBasicEvil {
    public final int AttPow = 8000;
    public final int HePo = 40000;

    public EntityGanos2(World world) {
        super(world);
        this.tex = "ganos_true_form";
        this.setSize(0.6f, 2.2f);
        this.setHardDifficulty();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8000.0);
    }

    public long BattlePowerOld() {
        int BP = -424509440;
        int exp = this.experienceValue * 100;
        long BattlePower = BP + this.rand.nextInt((int)Math.pow(10.0, (BP + "").length() - 2));
        return BattlePower;
    }
}

