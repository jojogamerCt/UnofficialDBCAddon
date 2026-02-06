/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.JRMCore.i;

import JinRyuu.JRMCore.i.InventoryCustomPlayer;
import JinRyuu.JRMCore.i.SlotArmor;
import JinRyuu.JRMCore.i.SlotCustom;
import JinRyuu.JRMCore.items.ItemBodysuit;
import JinRyuu.JRMCore.items.ItemHeadwear;
import JinRyuu.JRMCore.items.ItemVanity;
import JinRyuu.JRMCore.items.ItemWeight;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ContainerCustomPlayer
extends Container {
    private static final int ARMOR_START = 11;
    private static final int ARMOR_END = 14;
    private static final int INV_START = 15;
    private static final int INV_END = 41;
    private static final int HOTBAR_START = 42;
    private static final int HOTBAR_END = 50;

    public ContainerCustomPlayer(EntityPlayer player, InventoryPlayer inventoryPlayer, InventoryCustomPlayer inventoryCustom) {
        int i;
        int i2;
        this.addSlotToContainer(new SlotCustom(inventoryCustom, 0, 80, 62));
        this.addSlotToContainer(new SlotCustom(inventoryCustom, 1, 80, 44));
        this.addSlotToContainer(new SlotCustom(inventoryCustom, 2, 80, 26));
        for (i2 = 0; i2 < 4; ++i2) {
            this.addSlotToContainer(new SlotCustom(inventoryCustom, i2 + 3, 136, 62 - i2 * 18));
        }
        for (i2 = 4; i2 < 8; ++i2) {
            this.addSlotToContainer(new SlotCustom(inventoryCustom, i2 + 3, 154, 62 - (i2 - 4) * 18));
        }
        for (i = 0; i < 4; ++i) {
            this.addSlotToContainer(new SlotArmor(player, (IInventory)inventoryPlayer, inventoryPlayer.getSizeInventory() - 1 - i, 8, 8 + i * 18, i));
        }
        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot((IInventory)inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot((IInventory)inventoryPlayer, i, 8 + i * 18, 142));
        }
    }

    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }

    public ItemStack transferStackInSlot(EntityPlayer player, int par2) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);
        if (slot != null && slot.getHasStack()) {
            int type;
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if (par2 < 15) {
                if (!this.mergeItemStack(itemstack1, 15, 51, true)) {
                    return null;
                }
                slot.onSlotChange(itemstack1, itemstack);
            } else if (itemstack1.getItem() instanceof ItemWeight ? !this.mergeItemStack(itemstack1, 0, 11, false) : (itemstack1.getItem() instanceof ItemBodysuit ? !this.mergeItemStack(itemstack1, 1, 11, false) : (itemstack1.getItem() instanceof ItemHeadwear ? !this.mergeItemStack(itemstack1, 2, 11, false) : (itemstack1.getItem() instanceof ItemVanity ? !this.mergeItemStack(itemstack1, 3, 11, false) : (itemstack1.getItem() instanceof ItemArmor ? !this.mergeItemStack(itemstack1, 11 + (type = ((ItemArmor)itemstack1.getItem()).armorType), 11 + type + 1, false) : (par2 >= 15 && par2 < 42 ? !this.mergeItemStack(itemstack1, 42, 43, false) : par2 >= 42 && par2 < 51 && !this.mergeItemStack(itemstack1, 15, 42, false))))))) {
                return null;
            }
            if (itemstack1.stackSize == 0) {
                slot.putStack((ItemStack)null);
            } else {
                slot.onSlotChanged();
            }
            if (itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }
            slot.onPickupFromSlot(player, itemstack1);
        }
        return itemstack;
    }
}

