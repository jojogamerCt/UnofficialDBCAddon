/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.blocks.BlocksJRMC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class JRMCTab
extends CreativeTabs {
    public JRMCTab(String label) {
        super(label);
    }

    public ItemStack getIconItemStack() {
        return new ItemStack(BlocksJRMC.BlockColoredStone);
    }

    @SideOnly(value=Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock((Block)BlocksJRMC.BlockColoredStone);
    }
}

