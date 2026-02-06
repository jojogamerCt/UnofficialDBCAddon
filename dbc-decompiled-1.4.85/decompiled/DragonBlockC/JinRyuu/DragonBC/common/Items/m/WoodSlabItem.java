/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.item.ItemSlab
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.DragonBC.common.Items.m;

import JinRyuu.DragonBC.common.Blocks.m.ModdedBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

public class WoodSlabItem
extends ItemSlab {
    public static final String[] slabs = new String[]{"Sakura", "Mahagony", "Maple"};

    public WoodSlabItem(Block block) {
        super(block, ModdedBlocks.SakuraSlabsSingle, ModdedBlocks.SakuraSlabsDouble, block == ModdedBlocks.SakuraSlabsDouble);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if (i < 0 || i >= slabs.length) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + slabs[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}

