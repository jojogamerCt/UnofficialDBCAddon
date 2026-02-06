/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.item.ItemBlockWithMetadata
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.DragonBC.common.Items.m;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class WoodSaplingItem
extends ItemBlockWithMetadata {
    public static final String[] saplings = new String[]{"Sakura", "Mahagony", "Maple"};

    public WoodSaplingItem(Block block) {
        super(block, block);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if (i < 0 || i >= saplings.length) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + saplings[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}

