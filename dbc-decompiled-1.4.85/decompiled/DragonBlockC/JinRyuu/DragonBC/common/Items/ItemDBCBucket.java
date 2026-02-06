/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemBucket
 */
package JinRyuu.DragonBC.common.Items;

import JinRyuu.DragonBC.common.mod_DragonBC;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

public class ItemDBCBucket
extends ItemBucket {
    public ItemDBCBucket(Block fluidblock) {
        super(fluidblock);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
        this.setContainerItem(Items.bucket);
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName().replaceAll("item.", ""));
    }
}

