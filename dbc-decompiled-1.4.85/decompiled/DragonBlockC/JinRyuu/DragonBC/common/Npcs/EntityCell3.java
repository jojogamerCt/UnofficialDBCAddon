/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.Npcs.EntityCyborgsInf;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityCell3
extends EntityCyborgsInf {
    public int randomSoundDelay = 0;
    public String tex;
    public final int AttPow = 2000;
    public final int HePo = 20000;
    private int target;

    public EntityCell3(World par1World) {
        super(par1World);
        this.experienceValue = 200;
        this.tex = "cell3";
        this.setMediumDifficulty();
        this.addAAiTeleport();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/" + this.tex + ".png";
    }

    public long BattlePowerOld() {
        long BP = 1000000000000L;
        int exp = this.experienceValue * 100;
        long BattlePower = BP + (long)this.rand.nextInt(100);
        return BattlePower;
    }

    public void target(int i) {
        this.target = i;
    }

    @Override
    public void onLivingUpdate() {
        if (this.doBlst()) {
            int r = (int)(Math.random() * 5.0);
            if (r == 0) {
                this.setData1(1);
                this.setData2(0);
            } else if (r == 1) {
                this.setData1(3);
                this.setData2(0);
            } else if (r == 2) {
                this.setData1(4);
                this.setData2(7);
            } else if (r == 3) {
                this.setData1(6);
                this.setData2(2);
            } else {
                this.setData1(2);
                this.setData2(7);
            }
        }
        super.onLivingUpdate();
    }

    @Override
    public void onDeath(DamageSource par1DamageSource) {
        Entity var3 = par1DamageSource.getEntity();
        if (var3 instanceof EntityPlayer) {
            this.becomeAngryAt(var3);
        }
        super.onDeath(par1DamageSource);
    }

    private void becomeAngryAt(Entity par1Entity) {
        this.entityToAttack = par1Entity;
        this.angerLevel = 400 + this.rand.nextInt(400);
        this.randomSoundDelay = this.rand.nextInt(40);
    }
}

