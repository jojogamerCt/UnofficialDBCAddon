/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntity
 */
package JinRyuu.DragonBC.common.Render;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class MedPodDoor1TileEntity
extends TileEntity {
    private int cb = 0;

    public boolean canUpdate() {
        return true;
    }

    public void writeToNBT(NBTTagCompound par1) {
        super.writeToNBT(par1);
        par1.setInteger("cb", this.cb);
    }

    public void readFromNBT(NBTTagCompound par1) {
        super.readFromNBT(par1);
        this.cb = par1.getInteger("cb");
    }

    public int getCb() {
        return this.cb;
    }

    public void setCb(int cb) {
        this.cb = cb;
    }

    public boolean shouldRenderInPass(int pass) {
        return pass == 1;
    }

    public void updateEntity() {
        this.updateSound();
        super.updateEntity();
    }

    private void updateSound() {
        int meta = this.getBlockMetadata();
        if (meta > 3 && this.cb <= 20) {
            ++this.cb;
        }
        if (meta < 4 && this.cb > 0) {
            --this.cb;
        }
    }
}

