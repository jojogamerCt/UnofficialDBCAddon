/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

@SideOnly(value=Side.CLIENT)
public class EntityAura
extends Entity {
    public int randomSoundDelay = 0;
    public long lightVert;
    private int lightLivingTime;
    private String mot = "";
    private boolean rot = false;
    private int Age;
    private int color = 0xFFFFFF;
    private int colorl2 = 0xFFFFFF;
    private float state = 0.0f;
    private float state2 = 0.0f;
    private int crel = 0;
    private float yaw = 0.0f;
    private float pitch = 0.0f;
    private float alpha = 0.1f;
    private String tex = "aura";
    private String texl2 = "";
    private int speed = 20;
    private boolean inner = true;
    private int rendpass = 1;

    public int getLightLivingTime() {
        return this.lightLivingTime;
    }

    public EntityAura(World par1World) {
        super(par1World);
    }

    public EntityAura(World par1World, String dbcCharger, int c, float s, float s2, int cr, boolean b, float a) {
        this(par1World, dbcCharger, c, s, s2, cr, b);
        this.alpha = a;
    }

    public EntityAura(World par1World, String dbcCharger, int c, float s, float s2, int cr, boolean b) {
        this(par1World, dbcCharger, c, s, s2, cr);
        this.rot = b;
    }

    public EntityAura(World par1World, String dbcCharger, int c, float s, float s2, int cr) {
        super(par1World);
        this.mot = dbcCharger;
        this.color = c;
        this.state = s;
        this.state2 = s2;
        this.crel = cr;
        this.lightVert = this.rand.nextLong();
        this.lightLivingTime = this.rand.nextInt(4) + 0;
    }

    public boolean shouldRenderInPass(int pass) {
        return pass == this.rendpass;
    }

    @SideOnly(value=Side.CLIENT)
    public float getShadowSize() {
        return 0.0f;
    }

    public boolean getRot() {
        return this.rot;
    }

    public float getYaw() {
        return this.yaw;
    }

    public float getPitch() {
        return this.pitch;
    }

    public int getAge() {
        return this.Age;
    }

    public float getState() {
        return this.state;
    }

    public float getState2() {
        return this.state2;
    }

    public float getCRel() {
        return this.crel;
    }

    public int getCol() {
        return this.color;
    }

    public void setCol(int c) {
        this.color = c;
    }

    public int getColL2() {
        return this.colorl2;
    }

    public void setColL2(int c) {
        this.colorl2 = c;
    }

    public float getAlp() {
        return this.alpha;
    }

    public void setAlp(float f) {
        this.alpha = f;
    }

    public String getTex() {
        return this.tex;
    }

    public void setTex(String s) {
        this.tex = s;
    }

    public String getTexL2() {
        return this.texl2;
    }

    public void setTexL2(String s) {
        this.texl2 = s;
    }

    public int getSpd() {
        return this.speed;
    }

    public void setSpd(int s) {
        this.speed = s;
    }

    public boolean getInner() {
        return this.inner;
    }

    public void setInner(boolean s) {
        this.inner = s;
    }

    public void setRendPass(int s) {
        this.rendpass = s;
    }

    public String getmot() {
        return this.mot;
    }

    public void onUpdate() {
        if (this.mot.length() > 1) {
            EntityPlayer other = this.worldObj.getPlayerEntityByName(this.mot);
            if (other != null) {
                if (this.rot) {
                    this.yaw = other.rotationYaw;
                    this.pitch = other.rotationPitch;
                }
                this.setLocationAndAngles(other.posX, other.posY + (double)(other instanceof EntityPlayerSP ? -1.6f : 0.0f), other.posZ, other.rotationYaw, other.rotationPitch);
                if (this.getAge() < this.getLightLivingTime() && this.getState() > 4.0f && this.getState() < 7.0f && this.getAge() == 2) {
                    other.playSound("jinryuudragonbc:1610.spark", 0.0375f, 0.85f + (float)this.lightLivingTime * 0.05f);
                }
            } else {
                this.setDead();
            }
        }
        if (this.Age++ >= this.speed) {
            this.setDead();
        }
    }

    public boolean getCanSpawnHere() {
        return !this.worldObj.checkNoEntityCollision(this.boundingBox);
    }

    public void onLivingUpdate() {
    }

    protected void readEntityFromNBT(NBTTagCompound var1) {
    }

    protected void writeEntityToNBT(NBTTagCompound var1) {
    }

    protected void entityInit() {
    }
}

