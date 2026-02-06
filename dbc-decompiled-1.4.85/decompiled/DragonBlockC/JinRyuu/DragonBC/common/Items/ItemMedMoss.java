/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.items.ItemJRMCSeedFood
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.init.Blocks
 */
package JinRyuu.DragonBC.common.Items;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.items.ItemJRMCSeedFood;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;

public class ItemMedMoss
extends ItemJRMCSeedFood {
    public ItemMedMoss(int f, float g) {
        super(f, g, BlocksDBC.BlockCropMedMoss, Blocks.farmland);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName().replaceAll("item.", ""));
    }
}

