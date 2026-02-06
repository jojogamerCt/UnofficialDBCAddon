/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.items.GiTurtleBase
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 */
package JinRyuu.DragonBC.common.Items;

import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.items.GiTurtleBase;
import net.minecraft.item.ItemArmor;

public class GiTurtle
extends GiTurtleBase {
    public GiTurtle(ItemArmor.ArmorMaterial par2ArmorMaterial, int par3, int par4, String armornamePrefix) {
        super(par2ArmorMaterial, par3, par4, armornamePrefix);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
        this.modid = "jinryuudragonbc";
    }
}

