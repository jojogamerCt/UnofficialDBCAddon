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

public class EntityRoasie
extends EntityDBCBasicEvil {
    public final int AttPow = 7000;
    public final int HePo = 40000;

    public EntityRoasie(World world) {
        super(world);
        this.tex = "roasie";
        this.setHardDifficulty();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7000.0);
    }

    public long BattlePowerOld() {
        int BP = 165425152;
        int exp = this.experienceValue * 100;
        long BattlePower = BP + this.rand.nextInt((int)Math.pow(10.0, (BP + "").length() - 2));
        return BattlePower;
    }
}

