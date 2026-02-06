/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.DBCKiAttacks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

@SideOnly(value=Side.CLIENT)
public class EntityAuraRingPur
extends Entity {
    public int randomSoundDelay = 0;
    public int tex = 1;
    private Entity mot;
    int Age;
    int MaxAge = 7;

    public EntityAuraRingPur(World par1World) {
        super(par1World);
    }

    public EntityAuraRingPur(World par1World, Entity other) {
        super(par1World);
        this.mot = other;
    }

    @SideOnly(value=Side.CLIENT)
    public float getShadowSize() {
        return 0.0f;
    }

    public void onUpdate() {
        if (this.mot != null) {
            this.motionX = this.mot.motionX;
            this.motionY = this.mot.motionY;
            this.motionZ = this.mot.motionZ;
        }
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.Age++ >= this.MaxAge) {
            this.setDead();
        }
        this.motionY += 0.0;
        if (this.posY == this.prevPosY) {
            this.motionX *= 1.0;
            this.motionZ *= 1.0;
        }
        if (!this.onGround) {
            this.motionX *= DBCKiAttacks.motX;
            this.motionZ *= DBCKiAttacks.motZ;
            this.motionY *= DBCKiAttacks.motY;
        }
        this.moveEntity(this.motionX * 2.0, this.motionY * 2.0, this.motionZ * 2.0);
    }

    public boolean getCanSpawnHere() {
        return !this.worldObj.checkNoEntityCollision(this.boundingBox);
    }

    public void onLivingUpdate() {
    }

    protected void entityInit() {
    }

    protected void readEntityFromNBT(NBTTagCompound var1) {
    }

    protected void writeEntityToNBT(NBTTagCompound var1) {
    }
}

