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

public class EntityZamasu_Fused2
extends EntityDBCEvil {
    public int randomSoundDelay = 0;
    public String tex;
    public final int AttPow = 28000;
    public final int HePo = 128000;
    private int target;

    public EntityZamasu_Fused2(World par1World) {
        super(par1World);
        this.experienceValue = 200;
        this.tex = "zamasu_fused2";
        this.setSize(0.6f, 2.0f);
        this.setHardDifficulty();
        this.addAAiTeleport("jinryuudragonbc:DBC4.blacktp");
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(128000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(28000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/" + this.tex + ".png";
    }

    public long BattlePowerOld() {
        int BP = -459538432;
        int exp = this.experienceValue * 100;
        long BattlePower = BP + this.rand.nextInt((int)Math.pow(10.0, (BP + "").length() - 2));
        return BattlePower;
    }

    @Override
    public void onLivingUpdate() {
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8) {
            for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                double z;
                double y;
                double x;
                float red = 186.0f;
                float green = 37.0f;
                float blue = 197.0f;
                float red2 = 140.0f;
                float green2 = 8.0f;
                float blue2 = 62.0f;
                float out = 1.6f;
                float in = 1.0f;
                float life = 0.8f * this.height;
                float extra_scale = 0.5f;
                int dea = 50;
                EntityZamasu_Fused2 pl = this;
                for (int gh2 = 0; gh2 < 2; ++gh2) {
                    x = Math.random() * (double)out - (double)(out / 2.0f);
                    y = Math.random() * (double)this.height - 0.5;
                    z = Math.random() * (double)out - (double)(out / 2.0f);
                    EntityCusPar entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 186.0f, 37.0f, 197.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)pl);
                    x = Math.random() * (double)out - (double)(out / 2.0f);
                    y = Math.random() * (double)this.height - 0.5;
                    z = Math.random() * (double)out - (double)(out / 2.0f);
                    entity.worldObj.spawnEntityInWorld((Entity)entity);
                    EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 186.0f, 37.0f, 197.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)pl);
                    entity.worldObj.spawnEntityInWorld((Entity)entity2);
                }
                x = Math.random() * (double)(out *= 1.4f) - (double)(out / 2.0f);
                y = Math.random() * (double)this.height - 0.5;
                z = Math.random() * (double)out - (double)(out / 2.0f);
                EntityCusPar entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 140.0f, 8.0f, 62.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)pl);
                x = Math.random() * (double)out - (double)(out / 2.0f);
                y = Math.random() * (double)this.height - 0.5;
                z = Math.random() * (double)out - (double)(out / 2.0f);
                entity.worldObj.spawnEntityInWorld((Entity)entity);
                EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 140.0f, 8.0f, 62.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)pl);
                entity.worldObj.spawnEntityInWorld((Entity)entity2);
                x = Math.random() * (double)in - (double)(in / 2.0f);
                y = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                z = Math.random() * (double)in - (double)(in / 2.0f);
                entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 184.0f, 147.0f, 241.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)pl);
                x = Math.random() * (double)in - (double)(in / 2.0f);
                y = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                z = Math.random() * (double)in - (double)(in / 2.0f);
                entity.worldObj.spawnEntityInWorld((Entity)entity);
                entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 184.0f, 147.0f, 241.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)pl);
                entity.worldObj.spawnEntityInWorld((Entity)entity2);
                x = Math.random() * (double)(in *= 1.2f) - (double)(in / 2.0f);
                y = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                z = Math.random() * (double)in - (double)(in / 2.0f);
                entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 93.0f, 3.0f, 177.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)pl);
                x = Math.random() * (double)in - (double)(in / 2.0f);
                y = (Math.random() * (double)this.height - 0.5) * (double)0.8f;
                z = Math.random() * (double)in - (double)(in / 2.0f);
                entity.worldObj.spawnEntityInWorld((Entity)entity);
                entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, ((Entity)pl).posX, ((Entity)pl).posY, ((Entity)pl).posZ, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 93.0f, 3.0f, 177.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f, 0.45f, 0.015f, false, -1, false, (Entity)pl);
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

