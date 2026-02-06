/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Render;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class block01dbcEntity
extends Entity {
    public double bx;
    public double by;
    public double bz;

    public block01dbcEntity(World p_i1582_1_) {
        super(p_i1582_1_);
        this.setSize(0.01f, 0.01f);
    }

    public block01dbcEntity(World p_i1582_1_, double bx, double by, double bz) {
        super(p_i1582_1_);
        this.bx = bx;
        this.by = by;
        this.bz = bz;
        this.setPosition(bx + 0.5, by, bz + 0.5);
        this.height = 0.01f;
        this.width = 0.01f;
        this.setSize(this.width, this.height);
    }

    public int getX() {
        return (int)this.bx;
    }

    public int getY() {
        return (int)this.by;
    }

    public int getZ() {
        return (int)this.bz;
    }

    public void onEntityUpdate() {
        if (this.riddenByEntity == null || this.worldObj.isAirBlock((int)this.bx, (int)this.by, (int)this.bz)) {
            this.setDead();
        }
    }

    protected boolean shouldSetPosAfterLoading() {
        return false;
    }

    public double getMountedYOffset() {
        return (double)this.height - 0.2;
    }

    protected void entityInit() {
    }

    protected void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    }

    protected void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    }
}

