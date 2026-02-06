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

public class EntityVegeta4
extends EntityDBCEvil {
    public int randomSoundDelay = 0;
    public String tex;
    public final int AttPow = 18000;
    public final int HePo = 108000;
    private int target;

    public EntityVegeta4(World par1World) {
        super(par1World);
        this.experienceValue = 200;
        this.tex = "vegeta2_blue";
        this.setSize(0.6f, 2.0f);
        this.setData2(2);
        this.setHardDifficulty();
        this.addAAiTeleport();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(108000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(18000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/" + this.tex + ".png";
    }

    public long BattlePowerOld() {
        int BP = -2042023936;
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
                this.setData2(2);
            } else if (r == 1) {
                this.setData1(6);
                this.setData2(7);
            } else {
                this.setData1(5);
                this.setData2(2);
            }
        }
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8) {
            float red = 48.0f;
            float green = 208.0f;
            float blue = 232.0f;
            float out = 1.6f;
            float in = 1.0f;
            float life = 0.8f * this.height;
            float extra_scale = 0.5f;
            int dea = 50;
            for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                double z;
                double y;
                double x;
                EntityVegeta4 pl;
                int i;
                for (i = 0; i < 2; ++i) {
                    pl = this;
                    float spe2 = 1.3f;
                    x = Math.random() * (double)spe2 - (double)(spe2 / 2.0f);
                    y = -0.3f;
                    z = Math.random() * (double)spe2 - (double)(spe2 / 2.0f);
                    EntityCusPar entity = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, 0.05 + Math.random() * (double)0.1f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 48, 48, 8, 32, false, 0.0f, false, 0.0f, 1, "", 25, 0, 0.003f + (float)(Math.random() * (double)0.006f), 0.0f, 0.0f, 0, 160.0f, 220.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, 0.8f, 0.0f, 0.9f, 0.95f, 0.02f, false, -1, false, (Entity)this);
                    entity.worldObj.spawnEntityInWorld((Entity)entity);
                }
                for (i = 0; i < 2; ++i) {
                    pl = this;
                    x = Math.random() * (double)1.6f - (double)0.8f;
                    y = Math.random() * (double)this.height - 0.5;
                    z = Math.random() * (double)1.6f - (double)0.8f;
                    EntityCusPar entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 48.0f, 208.0f, 232.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)this);
                    x = Math.random() * (double)1.6f - (double)0.8f;
                    y = Math.random() * (double)this.height - 0.5;
                    z = Math.random() * (double)1.6f - (double)0.8f;
                    entity.worldObj.spawnEntityInWorld((Entity)entity);
                    EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 48.0f, 208.0f, 232.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)this);
                    entity.worldObj.spawnEntityInWorld((Entity)entity2);
                }
                EntityVegeta4 pl2 = this;
                double x2 = Math.random() * 1.0 - 0.5;
                double y2 = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                double z2 = Math.random() * 1.0 - 0.5;
                EntityCusPar entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl2).posX, ((Entity)pl2).posY, ((Entity)pl2).posZ, x2, y2, z2, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 160.0f, 220.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)this);
                x2 = Math.random() * 1.0 - 0.5;
                y2 = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                z2 = Math.random() * 1.0 - 0.5;
                entity.worldObj.spawnEntityInWorld((Entity)entity);
                EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl2).posX, ((Entity)pl2).posY, ((Entity)pl2).posZ, x2, y2, z2, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 160.0f, 220.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)this);
                entity.worldObj.spawnEntityInWorld((Entity)entity2);
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

