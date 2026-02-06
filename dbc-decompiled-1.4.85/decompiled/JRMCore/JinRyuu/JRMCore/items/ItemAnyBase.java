/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.item.Item
 */
package JinRyuu.JRMCore.items;

import JinRyuu.JRMCore.mod_JRMCore;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemAnyBase
extends Item {
    public ItemAnyBase() {
        this.setCreativeTab(mod_JRMCore.JRMCore);
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("jinryuumodscore:" + this.getUnlocalizedName().replaceAll("item.", ""));
    }
}

