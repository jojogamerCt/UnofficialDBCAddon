/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntityChest
 */
package JinRyuu.DragonBC.common.Render;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityChest;

public class DragonBlockNamek01TileEntity
extends TileEntityChest {
    private int cb = 100;
    private int cb2 = 100;

    public boolean canUpdate() {
        return true;
    }

    public void writeToNBT(NBTTagCompound par1) {
        super.writeToNBT(par1);
    }

    public void readFromNBT(NBTTagCompound par1) {
        super.readFromNBT(par1);
    }

    public boolean shouldRenderInPass(int pass) {
        return pass == 0;
    }

    public int getcb2() {
        return this.cb2;
    }

    public void updateEntity() {
        this.updateSound();
        super.updateEntity();
    }

    private void updateSound() {
        --this.cb;
        if (this.cb <= 0) {
            this.cb = 100;
            int par2 = this.xCoord;
            int par3 = this.yCoord;
            int par4 = this.zCoord;
            Block bi = this.worldObj.getBlock(par2, par3, par4);
            if (!this.worldObj.isRemote) {
                if (this.worldObj.getBlock(par2 + 1, par3, par4) == bi) {
                    if (this.worldObj.getBlock(par2 + 1, par3, par4 + 1) == bi && this.worldObj.getBlock(par2 + 1, par3, par4 - 1) == bi && this.worldObj.getBlock(par2 - 1, par3, par4) == bi && this.worldObj.getBlock(par2 - 1, par3, par4 - 1) == bi && this.worldObj.getBlock(par2 - 1, par3, par4 + 1) == bi) {
                        this.worldObj.playSoundEffect((double)par2, (double)par3, (double)par4, "jinryuudragonbc:dragon.glow", 1.0f, 1.0f);
                    }
                } else if (this.worldObj.getBlock(par2, par3, par4 + 1) == bi && this.worldObj.getBlock(par2 + 1, par3, par4 + 1) == bi && this.worldObj.getBlock(par2 + 1, par3, par4 - 1) == bi && this.worldObj.getBlock(par2, par3, par4 - 1) == bi && this.worldObj.getBlock(par2 - 1, par3, par4 - 1) == bi && this.worldObj.getBlock(par2 - 1, par3, par4 + 1) == bi) {
                    this.worldObj.playSoundEffect((double)par2, (double)par3, (double)par4, "jinryuudragonbc:dragon.glow", 1.0f, 1.0f);
                }
            }
        }
    }
}

