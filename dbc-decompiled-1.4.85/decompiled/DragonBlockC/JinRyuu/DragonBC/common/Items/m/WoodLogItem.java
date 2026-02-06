/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.DragonBC.common.Items.m;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class WoodLogItem
extends ItemBlock {
    public static final String[] logs = new String[]{"Sakura", "Mahagony", "Maple"};

    public WoodLogItem(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if (i < 0 || i >= logs.length) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + logs[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}

