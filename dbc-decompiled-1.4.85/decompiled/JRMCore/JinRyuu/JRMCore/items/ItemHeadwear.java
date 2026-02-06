/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.item.Item
 */
package JinRyuu.JRMCore.items;

import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemHeadwear
extends Item {
    public String modid;
    private String armorNamePrefix;
    private String tier;

    public String getTier() {
        return this.tier;
    }

    public ItemHeadwear(String armornamePrefix, String tier, int maxDam) {
        this.armorNamePrefix = armornamePrefix;
        this.tier = tier;
        this.setMaxDamage(maxDam);
        this.setMaxStackSize(1);
        this.modid = JRMCoreH.tjjrmc;
    }

    public String getTextureFile() {
        return this.modid + ":";
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(this.modid + ":" + this.getUnlocalizedName().replaceAll("item.", "").replaceAll("Scoutera", "Scouter").replaceAll("Scouterb", "Scouter"));
    }
}

