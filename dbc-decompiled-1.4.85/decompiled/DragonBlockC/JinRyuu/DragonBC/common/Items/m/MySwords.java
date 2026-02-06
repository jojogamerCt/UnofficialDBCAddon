/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemSword
 */
package JinRyuu.DragonBC.common.Items.m;

import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class MySwords
extends ItemSword {
    public MySwords(String unlocalizedName, Item.ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(JRMCoreH.tjdbcAssts + ":" + unlocalizedName);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }
}

