/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.Render.SpacePod01TileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class DBCContainer
extends Container {
    protected SpacePod01TileEntity tile_entity;

    public DBCContainer(SpacePod01TileEntity tile_entity, InventoryPlayer player_inventory) {
        this.tile_entity = tile_entity;
        int o = 0;
        for (int q = 0; q < 3; ++q) {
            for (int p = 0; p < 9; ++p) {
                this.addSlotToContainer(new Slot((IInventory)tile_entity, o, 9 + p * 18, 9 + q * 18));
                ++o;
            }
        }
        this.bindPlayerInventory(player_inventory);
    }

    public boolean canInteractWith(EntityPlayer player) {
        return this.tile_entity.isUseableByPlayer(player);
    }

    protected void bindPlayerInventory(InventoryPlayer player_inventory) {
        int i;
        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot((IInventory)player_inventory, j + i * 9 + 9, 9 + j * 18, 85 + i * 16));
            }
        }
        for (i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot((IInventory)player_inventory, i, 6 + i * 16, 142));
        }
    }

    public ItemStack putStackInSlot(int slot_index) {
        ItemStack stack = null;
        Slot slot_object = (Slot)this.inventorySlots.get(slot_index);
        if (slot_object != null && slot_object.getHasStack()) {
            ItemStack stack_in_slot = slot_object.getStack();
            stack = stack_in_slot.copy();
            if (slot_index == 0 ? !this.mergeItemStack(stack_in_slot, 1, this.inventorySlots.size(), true) : !this.mergeItemStack(stack_in_slot, 0, 1, false)) {
                return null;
            }
            if (stack_in_slot.stackSize == 0) {
                slot_object.putStack(null);
            } else {
                slot_object.onSlotChanged();
            }
        }
        return stack;
    }
}

