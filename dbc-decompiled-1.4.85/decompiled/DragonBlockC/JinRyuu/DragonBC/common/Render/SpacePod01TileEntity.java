/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 */
package JinRyuu.DragonBC.common.Render;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class SpacePod01TileEntity
extends TileEntity
implements IInventory {
    private ItemStack[] inventory = new ItemStack[27];

    public int getSizeInventory() {
        return this.inventory.length;
    }

    public ItemStack getStackInSlot(int slotIndex) {
        return this.inventory[slotIndex];
    }

    public void setInventorySlotContents(int slot, ItemStack stack) {
        this.inventory[slot] = stack;
        if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
            stack.stackSize = this.getInventoryStackLimit();
        }
    }

    public ItemStack decrStackSize(int slotIndex, int amount) {
        ItemStack stack = this.getStackInSlot(slotIndex);
        if (stack != null) {
            if (stack.stackSize <= amount) {
                this.setInventorySlotContents(slotIndex, null);
            } else {
                stack = stack.splitStack(amount);
                if (stack.stackSize == 0) {
                    this.setInventorySlotContents(slotIndex, null);
                }
            }
        }
        return stack;
    }

    public ItemStack getStackInSlotOnClosing(int slotIndex) {
        ItemStack stack = this.getStackInSlot(slotIndex);
        if (stack != null) {
            this.setInventorySlotContents(slotIndex, null);
        }
        return stack;
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this && player.getDistanceSq((double)this.xCoord + 0.5, (double)this.yCoord + 0.5, (double)this.zCoord + 0.5) < 64.0;
    }

    public boolean isStackValidForSlot(int i, ItemStack itemstack) {
        return false;
    }

    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return false;
    }

    public boolean canUpdate() {
        return false;
    }

    public String getInventoryName() {
        return null;
    }

    public boolean hasCustomInventoryName() {
        return false;
    }

    public void openInventory() {
    }

    public void closeInventory() {
    }
}

