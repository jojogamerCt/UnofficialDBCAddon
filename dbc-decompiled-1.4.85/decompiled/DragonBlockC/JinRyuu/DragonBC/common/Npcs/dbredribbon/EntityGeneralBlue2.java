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

public class EntityGeneralBlue2
extends EntityRedRibbon {
    public final int AttPow = 110;
    public final int HePo = 350;

    public EntityGeneralBlue2(World world) {
        super(world);
        this.texture = "general_blue2";
        this.setSize(0.6f, 2.0f);
        this.setEasyDifficulty();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(350.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(110.0);
    }

    @Override
    public long BattlePowerOld() {
        int BP = 7700000;
        int exp = this.experienceValue * 100;
        long BattlePower = BP + this.rand.nextInt((int)Math.pow(10.0, (BP + "").length() - 2));
        return BattlePower;
    }
}

