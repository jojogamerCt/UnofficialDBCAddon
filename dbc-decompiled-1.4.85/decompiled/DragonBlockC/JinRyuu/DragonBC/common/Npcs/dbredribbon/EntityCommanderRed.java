/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs.dbredribbon;

import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbon;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCommanderRed
extends EntityRedRibbon {
    public final int AttPow = 5;
    public final int HePo = 20;

    public EntityCommanderRed(World world) {
        super(world);
        this.texture = "commander_red";
        this.setSize(0.6f, 1.7f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0);
    }

    @Override
    public long BattlePowerOld() {
        int BP = 20000;
        int exp = this.experienceValue * 100;
        long BattlePower = BP + this.rand.nextInt((int)Math.pow(10.0, (BP + "").length() - 2));
        return BattlePower;
    }
}

