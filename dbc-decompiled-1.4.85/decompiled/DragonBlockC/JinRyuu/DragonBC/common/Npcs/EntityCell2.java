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

public class EntityCell2
extends EntityCyborgsInf {
    public int randomSoundDelay = 0;
    public String tex;
    private int target = 0;
    public final int AttPow = 1600;
    public final int HePo = 16000;

    public EntityCell2(World par1World) {
        super(par1World);
        this.experienceValue = 200;
        this.tex = "cell2";
        this.setData1(1);
        this.setData2(4);
        this.setMediumDifficulty();
        this.addAAiTeleport();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1600.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/" + this.tex + ".png";
    }

    public void target(int i) {
        this.target = i;
    }

    @Override
    public void onLivingUpdate() {
        if (this.doBlst()) {
            int r = (int)(Math.random() * 4.0);
            if (r == 0) {
                this.setData1(1);
                this.setData2(4);
            } else if (r == 1) {
                this.setData1(3);
                this.setData2(0);
            } else if (r == 2) {
                this.setData1(4);
                this.setData2(7);
            } else {
                this.setData1(2);
                this.setData2(7);
            }
        }
        if (!this.worldObj.isRemote) {
            // empty if block
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

