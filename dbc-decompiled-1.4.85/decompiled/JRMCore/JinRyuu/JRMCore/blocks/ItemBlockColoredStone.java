/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemDye
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.JRMCore.blocks;

import JinRyuu.JRMCore.blocks.BlockColoredStone;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

public class ItemBlockColoredStone
extends ItemBlock {
    public ItemBlockColoredStone(Block par1) {
        super(par1);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int getMetadata(int par1) {
        return par1;
    }

    public String getUnlocalizedName(ItemStack par1ItemStack) {
        int i = BlockColoredStone.getBlockFromDye(par1ItemStack.getItemDamage());
        return super.getUnlocalizedName() + "." + ItemDye.field_150923_a[i];
    }
}

