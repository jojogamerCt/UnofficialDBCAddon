/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings
 *  JinRyuu.JRMCore.entity.EntityCusPar
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.Npcs.EntityDBCEvil;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntityCusPar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityGokuBlack
extends EntityDBCEvil {
    public int randomSoundDelay = 0;
    public String tex;
    public final int AttPow = 12000;
    public final int HePo = 90000;
    private int target;

    public EntityGokuBlack(World par1World) {
        super(par1World);
        this.experienceValue = 200;
        this.tex = "gokublack";
        this.setSize(0.6f, 2.0f);
        this.setHardDifficulty();
        this.addAAiTeleport("jinryuudragonbc:DBC4.blacktp");
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(90000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(12000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/" + this.tex + ".png";
    }

    public long BattlePowerOld() {
        int BP = 1251635200;
        int exp = this.experienceValue * 100;
        long BattlePower = BP + this.rand.nextInt((int)Math.pow(10.0, (BP + "").length() - 2));
        return BattlePower;
    }

    @Override
    public void onLivingUpdate() {
        if (this.doBlst()) {
            int r = (int)(Math.random() * 3.0);
            if (r == 0) {
                this.setData1(1);
                this.setData2(7);
            } else if (r == 1) {
                this.setData1(1);
                this.setData2(0);
            } else {
                this.setData1(5);
                this.setData2(0);
            }
        }
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8) {
            for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                for (int i = 0; i < 5; ++i) {
                    EntityGokuBlack pl = this;
                    double x = Math.random() * 1.0 - 0.5;
                    double y = Math.random() * (double)this.height - 0.5;
                    double z = Math.random() * 1.0 - 0.5;
                    EntityCusPar entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 30, 2, (float)(Math.random() * (double)0.03f), (float)(Math.random() * (double)0.03f) + 0.05f, 0.1f, 0, 213.0f, 118.0f, 241.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 3, 0.5f, 0.0f, 0.0f, 0.0f, -0.1f, false, -1, false, (Entity)this);
                    x = Math.random() * 1.0 - 0.5;
                    y = Math.random() * (double)this.height - 0.5;
                    z = Math.random() * 1.0 - 0.5;
                    entity.worldObj.spawnEntityInWorld((Entity)entity);
                    EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 30, 2, (float)(Math.random() * (double)0.03f), (float)(Math.random() * (double)0.03f) + 0.05f, 0.1f, 0, 213.0f, 118.0f, 241.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 3, 0.5f, 0.0f, 0.0f, 0.0f, -0.1f, false, -1, false, (Entity)this);
                    entity.worldObj.spawnEntityInWorld((Entity)entity2);
                }
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

