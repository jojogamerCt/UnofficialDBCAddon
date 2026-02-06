/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.ICrafting
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Render.ArtGravDevTileEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ArtGravDevContainer
extends Container {
    private static int INV_START = 1;
    private static int INV_END = INV_START + 26;
    private static int HOTBAR_START = INV_END + 1;
    private static int HOTBAR_END = HOTBAR_START + 8;
    private ArtGravDevTileEntity tileFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ArtGravDevContainer(InventoryPlayer p_i1812_1_, ArtGravDevTileEntity p_i1812_2_) {
        int i;
        this.tileFurnace = p_i1812_2_;
        this.addSlotToContainer(new Slot((IInventory)p_i1812_2_, 0, 5, 53));
        INV_END = INV_START = 1;
        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot((IInventory)p_i1812_1_, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
                ++INV_END;
            }
        }
        HOTBAR_END = HOTBAR_START = --INV_END + 1;
        for (i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot((IInventory)p_i1812_1_, i, 8 + i * 18, 142));
            ++HOTBAR_END;
        }
        --HOTBAR_END;
    }

    public void addCraftingToCrafters(ICrafting p_75132_1_) {
        super.addCraftingToCrafters(p_75132_1_);
        p_75132_1_.sendProgressBarUpdate((Container)this, 1, this.tileFurnace.furnaceBurnTime);
        p_75132_1_.sendProgressBarUpdate((Container)this, 2, this.tileFurnace.currentItemBurnTime);
    }

    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        for (int i = 0; i < this.crafters.size(); ++i) {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);
            if (this.lastBurnTime != this.tileFurnace.furnaceBurnTime) {
                icrafting.sendProgressBarUpdate((Container)this, 1, this.tileFurnace.furnaceBurnTime);
            }
            if (this.lastItemBurnTime == this.tileFurnace.currentItemBurnTime) continue;
            icrafting.sendProgressBarUpdate((Container)this, 2, this.tileFurnace.currentItemBurnTime);
        }
        this.lastBurnTime = this.tileFurnace.furnaceBurnTime;
        this.lastItemBurnTime = this.tileFurnace.currentItemBurnTime;
    }

    @SideOnly(value=Side.CLIENT)
    public void updateProgressBar(int p_75137_1_, int p_75137_2_) {
        if (p_75137_1_ == 1) {
            this.tileFurnace.furnaceBurnTime = p_75137_2_;
        }
        if (p_75137_1_ == 2) {
            this.tileFurnace.currentItemBurnTime = p_75137_2_;
        }
    }

    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return this.tileFurnace.isUseableByPlayer(p_75145_1_);
    }

    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);
        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if (p_82846_2_ != 0 ? (ArtGravDevTileEntity.isItemFuel(itemstack1) ? !this.mergeItemStack(itemstack1, 0, INV_START, false) : (p_82846_2_ >= INV_START && p_82846_2_ < HOTBAR_START ? !this.mergeItemStack(itemstack1, HOTBAR_START, HOTBAR_END + 1, false) : p_82846_2_ >= HOTBAR_START && p_82846_2_ < HOTBAR_END + 1 && !this.mergeItemStack(itemstack1, INV_START, INV_END + 1, false))) : !this.mergeItemStack(itemstack1, INV_START, HOTBAR_END + 1, false)) {
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
            slot.onPickupFromSlot(p_82846_1_, itemstack1);
        }
        return itemstack;
    }
}

