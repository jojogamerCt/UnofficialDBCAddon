/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.items.ItemBodysuit
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.DragonBC.common.Items;

import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.items.ItemBodysuit;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemGiDBC
extends ItemBodysuit {
    public String armorNamePrefix;

    public ItemGiDBC(int defcol, String armornamePrefix) {
        super(defcol);
        this.armorNamePrefix = armornamePrefix;
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    public String getTextureFile() {
        return JRMCoreH.tjdbcAssts + ":";
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(JRMCoreH.tjdbcAssts + ":" + this.getUnlocalizedName().replaceAll("item.", ""));
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        String armor = "";
        armor = "jinryuudragonbc:armor/" + this.armorNamePrefix + ".png";
        return armor;
    }
}

