/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.ItemSign
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 */
package JinRyuu.JRMCore.i;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemSign;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class InventoryCustomPlayer
implements IInventory {
    private final String name = "ExtraSlots";
    private final String tagName = "dbcExtraInvTag";
    public static final int INV_SIZE = 11;
    private ItemStack[] inventory = new ItemStack[11];

    public void copy(InventoryCustomPlayer inv) {
        for (int i = 0; i < inv.getSizeInventory(); ++i) {
            ItemStack stack = inv.getStackInSlot(i);
            this.inventory[i] = stack == null ? null : stack.copy();
        }
        this.markDirty();
    }

    public int getSizeInventory() {
        return this.inventory.length;
    }

    public ItemStack getStackInSlot(int slot) {
        return this.inventory[slot];
    }

    public ItemStack decrStackSize(int slot, int amount) {
        ItemStack stack = this.getStackInSlot(slot);
        if (stack != null) {
            if (stack.stackSize > amount) {
                stack = stack.splitStack(amount);
                this.markDirty();
            } else {
                this.setInventorySlotContents(slot, null);
            }
        }
        return stack;
    }

    public ItemStack getStackInSlotOnClosing(int slot) {
        ItemStack stack = this.getStackInSlot(slot);
        this.setInventorySlotContents(slot, null);
        return stack;
    }

    public void setInventorySlotContents(int slot, ItemStack stack) {
        this.inventory[slot] = stack;
        if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
            stack.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }

    public String getInventoryName() {
        return "ExtraSlots";
    }

    public boolean hasCustomInventoryName() {
        return "ExtraSlots".length() > 0;
    }

    public int getInventoryStackLimit() {
        return 1;
    }

    public void markDirty() {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i) == null || this.getStackInSlot((int)i).stackSize != 0) continue;
            this.inventory[i] = null;
        }
    }

    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }

    public void openInventory() {
    }

    public void closeInventory() {
    }

    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return stack.getItem() instanceof ItemSign;
    }

    public void writeToNBT(NBTTagCompound compound) {
        NBTTagList items = new NBTTagList();
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i) == null) continue;
            NBTTagCompound item = new NBTTagCompound();
            item.setByte("Slot", (byte)i);
            this.getStackInSlot(i).writeToNBT(item);
            items.appendTag((NBTBase)item);
        }
        compound.setTag("dbcExtraInvTag", (NBTBase)items);
    }

    public void readFromNBT(NBTTagCompound compound) {
        NBTTagList items = compound.getTagList("dbcExtraInvTag", (int)compound.getId());
        for (int i = 0; i < items.tagCount(); ++i) {
            NBTTagCompound item = items.getCompoundTagAt(i);
            byte slot = item.getByte("Slot");
            if (slot < 0 || slot >= this.getSizeInventory()) continue;
            this.inventory[slot] = ItemStack.loadItemStackFromNBT((NBTTagCompound)item);
        }
    }
}

