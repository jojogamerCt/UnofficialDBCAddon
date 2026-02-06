/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntityCusPar;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import java.util.ArrayList;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityEng
extends Entity {
    private String mot;
    private int type;
    private int color;
    private int color2;
    private float size;
    private byte partid;
    public boolean destroyer = false;
    public float minScale;
    public float maxScale;
    public float maxDamage;
    public boolean added = false;
    public int animation_speed = 0;
    public long animation_start = 0L;
    public int animation_id = 0;
    public int animation_id_Max = 0;
    public int animation_random_Max = 0;
    public ArrayList<Integer> animation_random = new ArrayList();
    public float render_scale = 0.0f;
    public float render_scale_max = 2.0f;
    public EntityPlayer user;

    public String getmot() {
        return this.mot;
    }

    public int getType() {
        return this.type - 1;
    }

    public int getColor() {
        return this.color;
    }

    public int getColor2() {
        return this.color2;
    }

    public float getSize() {
        return this.size;
    }

    public byte getPartid() {
        return this.partid;
    }

    public void setScales() {
        this.minScale = (float)JRMCoreConfig.KiSizeMin[this.getType()];
        this.maxScale = (float)JRMCoreConfig.KiSizeMax[this.getType()];
        this.maxDamage = JRMCoreH.getMaxEnergyDamage();
    }

    public float setScalesPost() {
        if (this.isWave()) {
            return 100.0f;
        }
        if (this.isBlast()) {
            return 5.0f;
        }
        if (this.isDisk()) {
            return 5.0f;
        }
        if (this.isLaser()) {
            return 5.0f;
        }
        if (this.isLargeBlast()) {
            return 10000.0f;
        }
        if (this.isSpiral()) {
            return 5.0f;
        }
        if (this.isBarrage()) {
            return 5.0f;
        }
        if (this.isShield()) {
            return 5.0f;
        }
        if (this.isExplosion()) {
            return 20.0f;
        }
        return 1.0f;
    }

    public EntityEng(World w, double poX, double poY, double poZ, String mot, int type, int color, float size, int partid) {
        super(w);
        this.setSize(2.0f, 5.0f);
        this.posX = poX;
        this.posY = poY;
        this.posZ = poZ;
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.type = type;
        this.color = color;
        this.color2 = -1;
        if (!this.isShield() && !this.isExplosion()) {
            this.setScales();
            float size1 = size;
            this.size = 0.5f + size1;
            if (JRMCoreConfig.eaesl > 0 && size > (float)JRMCoreConfig.eaesl) {
                this.size = JRMCoreConfig.eaesl;
            }
            if (this.isLargeBlast()) {
                this.size *= JRMCoreConfig.ealbm;
            }
        }
        this.partid = (byte)partid;
        this.mot = mot;
        this.setPosition(this.posX, this.posY, this.posZ);
        this.moveToUser();
        if (JRMCoreConfig.KiAttackScalesWithUser) {
            this.size *= this.user == null ? 1.0f : this.user.height / 1.8f;
        }
        if (this.user != null && (this.isShield() || this.isExplosion())) {
            this.size = this.user.height * 3.0f * (!this.isExplosion() ? 1.0f : 2.0f);
        }
    }

    protected void entityInit() {
    }

    protected void readEntityFromNBT(NBTTagCompound nbt) {
    }

    protected void writeEntityToNBT(NBTTagCompound nbt) {
    }

    public boolean isWave() {
        return this.getType() == 0;
    }

    public boolean isBlast() {
        return this.getType() == 1;
    }

    public boolean isDisk() {
        return this.getType() == 2;
    }

    public boolean isLaser() {
        return this.getType() == 3;
    }

    public boolean isLargeBlast() {
        return this.getType() == 5;
    }

    public boolean isSpiral() {
        return this.getType() == 4;
    }

    public boolean isBarrage() {
        return this.getType() == 6;
    }

    public boolean isShield() {
        return this.getType() == 7;
    }

    public boolean isExplosion() {
        return this.getType() == 8;
    }

    public void onUpdate() {
        if (this.worldObj.isRemote && !JRMCoreClient.mc.isGamePaused()) {
            if (this.user == null) {
                this.moveToUser();
            }
            if (this.user != null) {
                this.createParticles();
            }
            if (this.user != null && !this.user.isDead) {
                ExtendedPlayer props = ExtendedPlayer.get(this.user);
                if (props.getAnimKiShoot() == 0 || props.getAnimKiShootOn() == 0) {
                    this.setDead();
                } else {
                    this.setPositionAndRotation(this.user.posX, this.user.posY + (double)(this.user instanceof EntityPlayerSP ? -1.6f : 0.0f), this.user.posZ, 0.0f, 0.0f);
                }
            } else {
                this.setDead();
            }
        }
    }

    private void moveToUser() {
        if (this.mot.length() > 1) {
            this.user = this.worldObj.getPlayerEntityByName(this.mot);
            if (this.user != null) {
                this.setPositionAndRotation(this.user.posX, this.user.posY + (double)(this.user instanceof EntityPlayerSP ? -1.6f : 0.0f), this.user.posZ, 0.0f, 0.0f);
            } else {
                this.setDead();
            }
        } else {
            this.setDead();
        }
    }

    private void createParticles() {
        if (this.user != null && this.user.worldObj.isRemote && (this.isWave() || this.isBlast() || this.isLargeBlast() || this.isLaser() || this.isSpiral())) {
            int coloring = JRMCoreH.techCol[this.getColor()];
            int coloring2 = JRMCoreH.techCol2[this.getColor()];
            this.generateParticles(this, (Entity)this.user, coloring, coloring2);
        }
        if (JGConfigClientSettings.CLIENT_DA16) {
            for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                EntityCusPar entity;
                float scalem;
                float h1;
                double z;
                double y;
                double x;
                float scale;
                if (this.getPartid() == 1) {
                    float h12 = 1.0f;
                    float pl_scale = 2.0f;
                    pl_scale = this.user.height;
                    scale = (float)this.ticksExisted * (this.size / 100.0f);
                    if (scale > this.size) {
                        scale = this.size;
                    }
                    float spe2 = 4.0f * scale + 2.0f + pl_scale / 2.0f;
                    x = Math.random() * (double)spe2 - (double)(spe2 / 2.0f);
                    y = -1.05f;
                    z = Math.random() * (double)spe2 - (double)(spe2 / 2.0f);
                    double motx = -x / 50.0 / (double)(pl_scale / 2.0f);
                    double motz = -z / 50.0 / (double)(pl_scale / 2.0f);
                    float h2 = (float)(JRMCoreH.techCol[this.color] >> 16 & 0xFF) / 255.0f;
                    float h3 = (float)(JRMCoreH.techCol[this.color] >> 8 & 0xFF) / 255.0f;
                    float h4 = (float)(JRMCoreH.techCol[this.color] & 0xFF) / 255.0f;
                    float red = h12 * h2;
                    float green = h12 * h3;
                    float blue = h12 * h4;
                    EntityCusPar entity7 = new EntityCusPar("jinryuudragonbc:bens_particles_attack.png", this.worldObj, 0.2f, 0.2f, this.user.posX, this.user.posY, this.user.posZ, x, y, z, motx, 0.1 + Math.random() * (double)0.025f, motz, 0.0f, (int)(Math.random() * 3.0) + 56, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", (27 + (int)spe2) * ((int)(pl_scale / 3.0f) + 1), 0, 0.001f + (float)(Math.random() * (double)0.002f), 0.0f, 0.0f, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.05f, false, -1, true, (Entity)this.user);
                    entity7.worldObj.spawnEntityInWorld((Entity)entity7);
                    continue;
                }
                if (this.getPartid() == 4) {
                    if (this.ticksExisted % 2 == 0) {
                        float a = 1.0f;
                        h1 = 1.0f;
                        scale = (float)this.ticksExisted * (this.height / 100.0f);
                        float pl_s = 1.0f;
                        x = 0.0;
                        y = this.user.height * 0.7f - 1.0f;
                        pl_s = this.user.height / 2.0f;
                        z = 0.0;
                        int num = (int)(Math.random() * 4.0) + 1;
                        for (int i = 0; i < num; ++i) {
                            int id = (int)(Math.random() * 3.0) + 4;
                            float rot = (float)(Math.random() * (double)0.02f) + 0.01f;
                            float scalem2 = ((float)(Math.random() * (double)0.15f) + 0.155f) * pl_s;
                            float scales = scalem2 * 0.01f;
                            boolean forg = (int)(Math.random() * 2.0) == 0;
                            float h2 = (float)(JRMCoreH.techCol[this.color] >> 16 & 0xFF) / 255.0f;
                            float h3 = (float)(JRMCoreH.techCol[this.color] >> 8 & 0xFF) / 255.0f;
                            float h4 = (float)(JRMCoreH.techCol[this.color] & 0xFF) / 255.0f;
                            float red = h1 * h2;
                            float green = h1 * h3;
                            float blue = h1 * h4;
                            EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles_attack.png", this.worldObj, 2.0f, 2.0f, this.user.posX, this.user.posY + (double)(this.user instanceof EntityPlayerSP ? -1.6f : 0.0f), this.user.posZ, x, y, z, 0.0, 0.0, 0.0, 0.0f, id, 4, 4, 64, forg, rot, false, 0.0f, 1, "", 5, 1, 0.145f * pl_s, scalem2, scales, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, 0.0f, 0.0f, 0.75f, 0.78f, 0.3f, false, -1, true, (Entity)this.user);
                            entity2.setdata39((int)(Math.random() * 360.0));
                            entity2.worldObj.spawnEntityInWorld((Entity)entity2);
                        }
                    }
                    if (this.ticksExisted % 3 != 0) continue;
                    float a = 1.0f;
                    h1 = 1.0f;
                    scale = (float)this.ticksExisted * (this.height / 100.0f);
                    float pl_s = 1.0f;
                    x = 0.0;
                    y = this.user.height * 0.7f - 1.0f;
                    pl_s = this.user.height / 2.0f;
                    z = 0.0;
                    pl_s = this.user.height / 2.0f;
                    int num = 4;
                    boolean forg = (int)(Math.random() * 2.0) == 0;
                    float rot = (float)(Math.random() * (double)0.02f) + 0.01f;
                    for (int i = 0; i < num; ++i) {
                        int id = 7;
                        scalem = ((float)(Math.random() * (double)0.03f) + 0.13f) * pl_s;
                        float scales = scalem * 0.1f;
                        float rota = 360.0f / (float)num * (float)i + (float)((int)(Math.random() * (double)(360 / num)));
                        float h2 = (float)(JRMCoreH.techCol[this.color] >> 16 & 0xFF) / 255.0f;
                        float h3 = (float)(JRMCoreH.techCol[this.color] >> 8 & 0xFF) / 255.0f;
                        float h4 = (float)(JRMCoreH.techCol[this.color] & 0xFF) / 255.0f;
                        float red = h1 * h2;
                        float green = h1 * h3;
                        float blue = h1 * h4;
                        int life = 30;
                        float transp_sp = 0.18f;
                        float transp_min = 0.75f;
                        float transp_max = 0.78f;
                        entity = new EntityCusPar("jinryuudragonbc:bens_particles_attack.png", this.worldObj, 2.0f, 2.0f, this.user.posX, this.user.posY + (double)(this.user instanceof EntityPlayerSP ? -1.6f : 0.0f), this.user.posZ, x, y, z, 0.0, 0.0, 0.0, 0.0f, id, 4, 4, 64, forg, rot, false, 0.0f, 1, "", 30, 1, 0.12f * pl_s, scalem, scales, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, 0.0f, 0.0f, 0.75f, 0.78f, 0.18f, false, -1, true, (Entity)this.user);
                        entity.setdata39(rota);
                        entity.worldObj.spawnEntityInWorld((Entity)entity);
                        h2 = (float)(JRMCoreH.techCol2[this.color] >> 16 & 0xFF) / 255.0f;
                        h3 = (float)(JRMCoreH.techCol2[this.color] >> 8 & 0xFF) / 255.0f;
                        h4 = (float)(JRMCoreH.techCol2[this.color] & 0xFF) / 255.0f;
                        red = h1 * h2;
                        green = h1 * h3;
                        blue = h1 * h4;
                        EntityCusPar entity2 = new EntityCusPar("jinryuudragonbc:bens_particles_attack.png", this.worldObj, 2.0f, 2.0f, this.user.posX, this.user.posY + (double)(this.user instanceof EntityPlayerSP ? -1.6f : 0.0f), this.user.posZ, x, y, z, 0.0, 0.0, 0.0, 0.0f, id, 4, 4, 64, true, rot, false, 0.0f, 1, "", 30, 1, 0.096f * pl_s, scalem * 0.8f, scales * 0.8f, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, 0.0f, 0.0f, 0.75f, 0.78f, 0.18f, false, -1, true, (Entity)this.user);
                        entity2.setdata39(rota);
                        entity2.worldObj.spawnEntityInWorld((Entity)entity2);
                    }
                    continue;
                }
                if (this.getPartid() == 2) {
                    if (this.ticksExisted % 5 != 0) continue;
                    float a = 1.0f;
                    h1 = 1.0f;
                    scale = (float)this.ticksExisted * (this.height / 100.0f);
                    float pl_s = 1.0f;
                    x = 0.0;
                    y = this.user.height * 0.7f - 1.5f;
                    y = this.user.height * 0.7f - 1.0f;
                    pl_s = this.user.height / 2.0f;
                    z = 0.0;
                    int num = (int)(Math.random() * 4.0) + 1;
                    for (int i = 0; i < num; ++i) {
                        int id = (int)(Math.random() * 4.0);
                        float rota = (float)(Math.random() * (double)0.4f) + 0.4f;
                        float rota4 = (float)(Math.random() * (double)0.4f) + 0.4f;
                        scalem = ((float)(Math.random() * (double)0.02f) + 0.04f) * pl_s;
                        float scales = ((float)(Math.random() * (double)0.002f) + 0.001f) * pl_s;
                        int rota1 = (int)(Math.random() * 360.0);
                        int rota2 = (int)(Math.random() * 360.0);
                        int rota3 = (int)(Math.random() * 360.0);
                        boolean rot = (int)(Math.random() * 2.0) == 0;
                        float rotsp = (float)(Math.random() * (double)rota) + 0.001f;
                        float h2 = (float)(JRMCoreH.techCol2[this.color] >> 16 & 0xFF) / 255.0f;
                        float h3 = (float)(JRMCoreH.techCol2[this.color] >> 8 & 0xFF) / 255.0f;
                        float h4 = (float)(JRMCoreH.techCol2[this.color] & 0xFF) / 255.0f;
                        float red = h1 * h2;
                        float green = h1 * h3;
                        float blue = h1 * h4;
                        entity = new EntityCusPar("jinryuudragonbc:bens_particles_attack.png", this.worldObj, 2.0f, 2.0f, this.user.posX, this.user.posY + (double)(this.user instanceof EntityPlayerSP ? -1.6f : 0.0f), this.user.posZ, x, y, z, 0.0, 0.0, 0.0, 0.0f, id, 4, 4, 64, true, 0.0f, true, 0.0f, 1, "", 25, 0, 0.1f, scalem, scales, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, 0.0f, 0.0f, 0.95f, 0.98f, 0.2f, false, -1, true, (Entity)this.user);
                        entity.setdata39(rota1);
                        entity.setdata40(rota2);
                        entity.setdata41(rota3);
                        entity.setdata42(3);
                        entity.setdata45(1.5f);
                        entity.setRotate(rot);
                        entity.setRotation_Sp(rotsp);
                        entity.worldObj.spawnEntityInWorld((Entity)entity);
                    }
                    continue;
                }
                if (this.getPartid() != 3 || this.ticksExisted % 2 != 0) continue;
                float life = 0.8f * this.user.height;
                float extra_scale = 1.0f + (this.user.height > 2.1f ? this.user.height / 2.0f : 0.0f) / 5.0f;
                float width = this.user.width * 3.0f;
                double x2 = (Math.random() * 1.0 - 0.5) * (double)(width * 0.8f);
                double y2 = Math.random() * (double)(this.height * 0.8f) - (double)0.6f;
                double z2 = (Math.random() * 1.0 - 0.5) * (double)(width * 0.8f);
                double motx = Math.random() * (double)0.05f - (double)0.03f;
                double moty = (Math.random() * (double)0.1f + (double)0.1f) * ((double)(life * extra_scale) * 0.18);
                double motz = Math.random() * (double)0.05f - (double)0.03f;
                float red = 255.0f;
                float green = 217.0f;
                float blue = 25.0f;
                EntityCusPar entity3 = new EntityCusPar("jinryuudragonbc:bens_particles_attack.png", this.user.worldObj, 0.2f, 0.2f, this.user.posX, this.user.posY + (double)(this.user instanceof EntityPlayerSP ? -1.6f : 0.0f), this.user.posZ, x2, y2, z2, motx, moty, motz, (float)(Math.random() * (double)0.01f) - 0.005f, (int)(Math.random() * 3.0) + 59, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", (int)(30.0f * life * 1.6f), 2, ((float)(Math.random() * (double)0.01f) + 0.01f) * life * extra_scale, ((float)(Math.random() * (double)0.005f) + 0.005f) * life * extra_scale, 0.03f * life * extra_scale, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2, 0.0f, 0.0f, 0.3f, 0.35f, 0.02f, false, -1, false, null);
                this.user.worldObj.spawnEntityInWorld((Entity)entity3);
            }
        }
    }

    public void generateParticles(EntityEng entityBlast, Entity entity, int color, int color2) {
        if (entityBlast != null && entity != null && entityBlast.worldObj.isRemote) {
            EntityPlayer user = entityBlast.user;
            int ticksExisted = entityBlast.ticksExisted;
            float scale = (float)ticksExisted * (entityBlast.getSize() / 100.0f);
            if (scale > entityBlast.getSize()) {
                scale = entityBlast.getSize();
            }
            int i = 0;
            while ((float)i < 1.0f + scale) {
                for (int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                    double d9;
                    float colorFixer = 0.7f;
                    float red = (float)(color >> 16 & 0xFF) / 255.0f;
                    float green = (float)(color >> 8 & 0xFF) / 255.0f;
                    float blue = (float)(color & 0xFF) / 255.0f;
                    red *= 0.7f;
                    green *= 0.7f;
                    blue *= 0.7f;
                    float red2 = (float)(color2 >> 16 & 0xFF) / 255.0f;
                    float green2 = (float)(color2 >> 8 & 0xFF) / 255.0f;
                    float blue2 = (float)(color2 & 0xFF) / 255.0f;
                    float alpha = scale / 2.0f < 1.0f ? scale / 2.0f : 1.0f;
                    float out = 1.5f * scale;
                    float in = 1.5f;
                    float life = 0.4f * entity.height;
                    float extra_scale = 0.2f;
                    int dea = 30;
                    float target_fullsize_one1 = 0.32f;
                    float targetsizeMin = entity.height * (8.0f / target_fullsize_one1) * 0.01f;
                    float target_fullsize_one2 = 0.32f;
                    float targetsizeMax = entity.height * (26.0f / target_fullsize_one2) * 0.01f;
                    double x = Math.random() * (double)out - (double)(out / 2.0f);
                    double y = Math.random() * (double)out - (double)(out / 2.0f);
                    double z = Math.random() * (double)out - (double)(out / 2.0f);
                    double x2 = 0.0;
                    double y2 = 0.0;
                    double z2 = 0.0;
                    x2 = entity.posX;
                    y2 = entity.posY;
                    z2 = entity.posZ;
                    y2 += (double)(entity instanceof EntityPlayerSP ? -1.6f : 0.0f);
                    double motionX = 0.0;
                    double motionZ = 0.0;
                    double motionY = 0.0;
                    float height = user.height;
                    float height2 = height * 0.8f;
                    float width = user.width;
                    float width2 = width * 0.8f;
                    if (entityBlast.isWave()) {
                        Vec3 vec3 = entity.getLookVec();
                        double kiX = 0.0;
                        double kiY = 0.0;
                        kiX = 1.0;
                        kiY = -1.0;
                        double d8 = (double)entity.width + kiX;
                        d9 = entity.height;
                        x2 += vec3.xCoord * d8;
                        y2 += vec3.yCoord * d8 + (double)(height2 * 0.92f);
                        z2 += vec3.zCoord * d8;
                    } else if (entityBlast.isBlast() || entityBlast.isSpiral() || entityBlast.isLaser()) {
                        Vec3 vec3 = entity.getLookVec();
                        double kiX = 0.0;
                        double kiY = 0.0;
                        kiX = 1.0;
                        kiY = -1.0;
                        double d8 = (double)entity.width + kiX;
                        d9 = entity.height;
                        x2 += vec3.xCoord * d8;
                        y2 += vec3.yCoord * d8 + (double)(height2 * 0.92f);
                        z2 += vec3.zCoord * d8;
                    } else if (!entityBlast.isDisk()) {
                        if (entityBlast.isLargeBlast()) {
                            double kiX = 0.0;
                            double kiY = 0.0;
                            kiX = 1.0;
                            kiY = -1.0;
                            y2 += (double)(entity.height + 1.0f + scale / 2.0f);
                        } else if (entityBlast.isShield() || entityBlast.isExplosion()) {
                            // empty if block
                        }
                    }
                    x2 += x;
                    y2 += y;
                    z2 += z;
                    motionX = x * 0.02;
                    motionY = y * 0.02;
                    motionZ = z * 0.02;
                    float scaleStart = ((float)(Math.random() * (double)0.02f) + 0.02f) * life * 0.2f;
                    float scaleEnd = ((float)(Math.random() * (double)0.01f) + 0.02f) * life * 0.2f;
                    float scaleSpeed = 0.2f * life * 0.2f;
                    int textureID = (int)(Math.random() * 3.0) + 8;
                    EntityCusPar particle = new EntityCusPar("jinryuumodscore:bens_particles.png", entity.worldObj, 0.2f, 0.2f, x2, y2, z2, 0.0, 0.0, 0.0, -motionX, -motionY, -motionZ, 0.0f, textureID, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 30, 2, scaleStart, scaleEnd, scaleStart, 0, red, green, blue, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.6f * alpha, 0.0f * alpha, 0.9f * alpha, 0.95f * alpha, 0.06f * alpha, false, -1, true, null);
                    entity.worldObj.spawnEntityInWorld((Entity)particle);
                    EntityCusPar particle2 = new EntityCusPar("jinryuumodscore:bens_particles.png", entity.worldObj, 0.2f, 0.2f, x2, y2, z2, 0.0, 0.0, 0.0, -motionX, -motionY, -motionZ, 0.0f, textureID, 8, 3, 32, false, 0.0f, false, 0.0f, 1, "", 30, 2, scaleStart * 0.8f, scaleEnd * 0.8f, scaleStart * 0.8f, 0, red2, green2, blue2, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 2, 0.6f * alpha, 0.0f * alpha, 0.9f * alpha, 0.95f * alpha, 0.06f * alpha, false, -1, true, null);
                    entity.worldObj.spawnEntityInWorld((Entity)particle2);
                    if (!entityBlast.isWave() && !entityBlast.isBlast() && !entityBlast.isSpiral() && !entityBlast.isLaser() && !entityBlast.isDisk() && !entityBlast.isLargeBlast() && !entityBlast.isShield() && !entityBlast.isExplosion()) continue;
                }
                ++i;
            }
        }
    }

    public float rad(float angle) {
        return angle * (float)Math.PI / 180.0f;
    }

    public boolean isInRangeToRenderDist(double par1) {
        if (JGConfigClientSettings.renderdistanceMultiplierKiAttackCharge == 10000) {
            return true;
        }
        double d1 = this.boundingBox.getAverageEdgeLength();
        return par1 < (d1 *= 64.0 * this.renderDistanceWeight) * d1 * ((double)JGConfigClientSettings.renderdistanceMultiplierKiAttackCharge / 100.0);
    }
}

