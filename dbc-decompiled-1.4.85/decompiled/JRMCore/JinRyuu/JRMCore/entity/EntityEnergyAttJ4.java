/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.entity.EntityEnAttacks;
import net.minecraft.world.World;

public class EntityEnergyAttJ4
extends EntityEnAttacks {
    private float size;
    private byte type;
    public final int number_of_lightVerts = 10;
    public long[] lightVert = new long[10];
    private int lightLivingTime;

    public float getSize() {
        return this.size;
    }

    public byte getType() {
        return this.type;
    }

    public int getLightLivingTime() {
        return this.lightLivingTime;
    }

    public EntityEnergyAttJ4(World w, byte type, double x, double y, double z) {
        super(w);
        this.type = type;
        this.size = 1.0f;
        this.setSize(this.size, this.size);
        this.posX = x;
        this.posY = y;
        this.posZ = z;
    }

    public void onUpdate() {
        if (this.worldObj.isRemote) {
            if (this.ticksExisted == 1) {
                this.setSize(this.size, this.size);
            }
            if (this.ticksExisted > 20) {
                this.setDead();
            }
            this.setPosition(this.posX, this.posY, this.posZ);
        }
    }
}

