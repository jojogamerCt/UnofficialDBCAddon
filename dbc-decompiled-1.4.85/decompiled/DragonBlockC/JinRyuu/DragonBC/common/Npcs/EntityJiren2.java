/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings
 *  JinRyuu.JRMCore.entity.EntityCusPar
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.entity.EntityPlayerSP
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
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityJiren2
extends EntityDBCEvil {
    public int randomSoundDelay = 0;
    public String tex;
    public final int AttPow = 40000;
    public final int HePo = 180000;
    private int target;

    public EntityJiren2(World par1World) {
        super(par1World);
        this.experienceValue = 200;
        this.tex = "jiren_full_power";
        this.setSize(0.7f, 2.8f);
        this.setData1(1);
        this.setData2(8);
        this.setHardDifficulty();
        this.addAAiTeleport();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(180000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(40000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/" + this.tex + ".png";
    }

    public long BattlePowerOld() {
        int BP = 1185955840;
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
                this.setData2(8);
            } else if (r == 1) {
                this.setData1(1);
                this.setData2(4);
            } else {
                this.setData1(5);
                this.setData2(4);
            }
        }
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8) {
            for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                EntityCusPar entity;
                double z;
                double x;
                double y;
                int repeat2;
                float blue3;
                float green3;
                float red3;
                float blue2;
                float green2;
                float red2;
                float blue;
                float green;
                float red;
                boolean bol4a = true;
                boolean bol4 = true;
                EntityJiren2 other = this;
                double posXOth = ((Entity)other).posX;
                double posYOth = ((Entity)other).posY + (double)(other instanceof EntityPlayerSP ? -1.6f : 0.0f);
                double posZOth = ((Entity)other).posZ;
                if (bol4a) {
                    red = 189.0f;
                    green = 26.0f;
                    blue = 47.0f;
                    red2 = 189.0f;
                    green2 = 26.0f;
                    blue2 = 47.0f;
                    red3 = 248.0f;
                    green3 = 231.0f;
                    blue3 = 236.0f;
                } else {
                    red = 141.0f;
                    green = 158.0f;
                    blue = 210.0f;
                    red2 = 215.0f;
                    green2 = 152.0f;
                    blue2 = 219.0f;
                    red3 = 243.0f;
                    green3 = 247.0f;
                    blue3 = 250.0f;
                }
                float out = 1.6f;
                float in = 1.5f;
                float life = 0.8f * ((Entity)other).height;
                float extra_scale = 0.5f;
                int dea = 50;
                float outNew = 1.6f;
                float target_fullsize_one1 = 0.32f;
                float targetsizeMin = ((Entity)other).height * (8.0f / target_fullsize_one1) * 0.01f;
                float target_fullsize_one2 = 0.32f;
                float targetsizeMax = ((Entity)other).height * (26.0f / target_fullsize_one2) * 0.01f;
                float alpha = 0.6f;
                for (repeat2 = 0; repeat2 < 4; ++repeat2) {
                    outNew = 1.7600001f;
                    y = (Math.random() * (double)((Entity)other).height - 0.5) * (double)0.8f;
                    x = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                    z = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                    entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.18f, 0.21000001f, 0.006f, false, -1, true, (Entity)other);
                    entity.worldObj.spawnEntityInWorld((Entity)entity);
                }
                for (repeat2 = 0; repeat2 < 4; ++repeat2) {
                    outNew = 1.7600001f;
                    y = (Math.random() * (double)((Entity)other).height - 0.5) * (double)0.8f;
                    x = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                    z = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                    entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.18f, 0.21000001f, 0.006f, false, -1, true, (Entity)other);
                    entity.worldObj.spawnEntityInWorld((Entity)entity);
                }
                if (this.ticksExisted % 4 == 0) {
                    x = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                    y = Math.random() * (double)((Entity)other).height - 0.5;
                    z = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                    EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f * 0.5f, 0.2f * life * 0.5f * 0.5f, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.24000001f, 0.27f, 0.009000001f, false, -1, true, (Entity)other);
                    entity2.worldObj.spawnEntityInWorld((Entity)entity2);
                }
                if (bol4) {
                    if (bol4a) {
                        outNew = 1.8000001f;
                        y = (Math.random() * (double)((Entity)other).height - 0.5) * (double)0.8f;
                        x = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                        z = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                        EntityCusPar entity2 = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red2, green2, blue2, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.24000001f, 0.27f, 0.009000001f, false, -1, true, (Entity)other);
                        entity2.worldObj.spawnEntityInWorld((Entity)entity2);
                        for (int repeat22 = 0; repeat22 < 1 + (bol4a ? 1 : 0); ++repeat22) {
                            y = Math.random() * (double)(targetsizeMax - targetsizeMin) + (double)targetsizeMin;
                            outNew = 1.9499999f;
                            x = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                            z = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                            EntityCusPar entity1 = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y -= (double)0.3f, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red2, green2, blue2, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.24000001f, 0.27f, 0.009000001f, false, -1, true, (Entity)other);
                            entity1.worldObj.spawnEntityInWorld((Entity)entity1);
                        }
                    }
                    if (this.ticksExisted % (bol4a ? 1 : 4) == 0) {
                        x = Math.random() * 1.5 - 0.75;
                        y = (Math.random() * (double)((Entity)other).height - 0.5) * (double)0.8f;
                        z = Math.random() * 1.5 - 0.75;
                        EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y, z, 0.0, Math.random() * (double)0.05f, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.02f) + 0.02f) * life * 0.5f * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f * 0.5f, 0.2f * life * 0.5f * 0.5f, 0, red2, green2, blue2, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.4f * (bol4a ? 1.2f : 1.0f) * 0.6f, 0.45f * (bol4a ? 1.2f : 1.0f) * 0.6f, 0.015f * (bol4a ? 1.2f : 1.0f) * 0.6f, false, -1, true, (Entity)other);
                        entity2.worldObj.spawnEntityInWorld((Entity)entity2);
                    }
                }
                float in2 = 0.6f;
                for (int repeat = 0; repeat < 3; ++repeat) {
                    outNew = 0.6f;
                    x = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                    y = (Math.random() * (double)((Entity)other).height - 0.5) * (double)0.8f * (double)0.6f - (double)0.3f;
                    z = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                    EntityCusPar entity3 = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y, z, 0.0, Math.random() * (double)0.04f + 0.01, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, 243.0f, 247.0f, 250.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.120000005f, 0.15f, 0.003f, false, -1, true, (Entity)other);
                    entity3.worldObj.spawnEntityInWorld((Entity)entity3);
                    for (int repeat23 = 0; repeat23 < 2; ++repeat23) {
                        y = Math.random() * (double)(targetsizeMax - targetsizeMin) + (double)targetsizeMin;
                        outNew = 1.26f;
                        x = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                        z = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                        EntityCusPar entity1 = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y -= (double)0.3f, z, 0.0, Math.random() * (double)0.04f + 0.01, 0.0, 0.0f, (int)(Math.random() * 3.0) + 8, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 32, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f, 0.2f * life * 0.5f, 0, red3, green3, blue3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.18f, 0.21000001f, 0.012f, false, -1, true, (Entity)other);
                        entity1.worldObj.spawnEntityInWorld((Entity)entity1);
                    }
                }
                if (this.ticksExisted % 4 != 0) continue;
                x = Math.random() * (double)0.6f - (double)0.3f;
                y = (Math.random() * (double)((Entity)other).height - 0.5) * (double)0.8f;
                z = Math.random() * (double)0.6f - (double)0.3f;
                EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y, z, 0.0, Math.random() * (double)0.03f + 0.01, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.03f) + 0.03f) * life * 0.5f * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f * 0.5f, 0.2f * life * 0.5f * 0.5f, 0, red3, green3, blue3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.24000001f, 0.27f, 0.009000001f, false, -1, true, (Entity)other);
                entity2.worldObj.spawnEntityInWorld((Entity)entity2);
                y = Math.random() * (double)(targetsizeMax - targetsizeMin) + (double)targetsizeMin;
                outNew = 1.26f;
                x = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                z = Math.random() * (double)outNew - (double)(outNew / 2.0f);
                EntityCusPar entity3 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2f, 0.2f, posXOth, posYOth, posZOth, x, y -= (double)0.3f, z, 0.0, Math.random() * (double)0.03f + 0.01, 0.0, 0.0f, (int)(Math.random() * 8.0) + 32, 32, 8, 32, false, 0.0f, false, 0.0f, 1, "", 50, 2, ((float)(Math.random() * (double)0.02f) + 0.02f) * life * 0.5f * 0.5f, ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.5f * 0.5f, 0.2f * life * 0.5f * 0.5f, 0, red3, green3, blue3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.0f, 0.0f, 0.24000001f, 0.27f, 0.009000001f, false, -1, true, (Entity)other);
                entity3.worldObj.spawnEntityInWorld((Entity)entity3);
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

