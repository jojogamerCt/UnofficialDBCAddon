/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.item.EnumRarity
 *  net.minecraft.item.ItemRecord
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 */
package JinRyuu.DragonBC.common.Items;

import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemRec
extends ItemRecord {
    public ItemRec(String recordName) {
        super(recordName);
        this.maxStackSize = 1;
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(JRMCoreH.tjdbcAssts + ":" + this.getUnlocalizedName());
    }

    public EnumRarity getRarity(ItemStack itemStack) {
        return EnumRarity.rare;
    }

    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation(JRMCoreH.tjdbcAssts + ":" + name);
    }
}

