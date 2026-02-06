/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 */
package JinRyuu.JRMCore.items;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreH2;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;

public class ItemBodysuit
extends Item {
    private int defcol = JRMCoreH2.cols[15];
    private String Display = "Color1";

    public ItemBodysuit(int defcol) {
        this.defcol = defcol;
        this.setMaxDamage(320);
        this.setMaxStackSize(1);
    }

    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        if (this.hasColor(par1ItemStack)) {
            par3List.add(JRMCoreH.trl("jrmc", "BodysuitColor") + ": " + JRMCoreH.trl("jrmc", this.getColorReadable(par1ItemStack)));
        }
    }

    public String getColorReadable(ItemStack par1) {
        int i = this.getColor(par1);
        for (int j = 0; j < JRMCoreH2.cols.length; ++j) {
            if (JRMCoreH2.cols[j] != i) continue;
            return JRMCoreH2.colNams[j];
        }
        return JRMCoreH2.colNams[15];
    }

    public String getTextureFile() {
        return JRMCoreH.tjjrmc + ":";
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(JRMCoreH.tjjrmc + ":" + this.getUnlocalizedName().replaceAll("item.", ""));
    }

    public boolean hasColor(ItemStack p_82816_1_) {
        return !p_82816_1_.hasTagCompound() ? false : (!p_82816_1_.getTagCompound().hasKey(this.Display, 10) ? false : p_82816_1_.getTagCompound().getCompoundTag(this.Display).hasKey("color", 3));
    }

    public int getColor(ItemStack p_82814_1_) {
        NBTTagCompound nbttagcompound = p_82814_1_.getTagCompound();
        if (nbttagcompound == null) {
            return this.defcol;
        }
        NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag(this.Display);
        return nbttagcompound1 == null ? 10511680 : (nbttagcompound1.hasKey("color", 3) ? nbttagcompound1.getInteger("color") : this.defcol);
    }

    @SideOnly(value=Side.CLIENT)
    public int getColorFromItemStack(ItemStack item, int var) {
        return this.getColor(item);
    }

    public void removeColor(ItemStack p_82815_1_) {
        NBTTagCompound nbttagcompound1;
        NBTTagCompound nbttagcompound = p_82815_1_.getTagCompound();
        if (nbttagcompound != null && (nbttagcompound1 = nbttagcompound.getCompoundTag(this.Display)).hasKey("color")) {
            nbttagcompound1.removeTag("color");
        }
    }

    public ItemStack setColor(ItemStack p_82813_1_, int p_82813_2_) {
        NBTTagCompound nbttagcompound = p_82813_1_.getTagCompound();
        if (nbttagcompound == null) {
            nbttagcompound = new NBTTagCompound();
            p_82813_1_.setTagCompound(nbttagcompound);
        }
        NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag(this.Display);
        if (!nbttagcompound.hasKey(this.Display, 10)) {
            nbttagcompound.setTag(this.Display, (NBTBase)nbttagcompound1);
        }
        nbttagcompound1.setInteger("color", p_82813_2_);
        p_82813_1_.setTagCompound(nbttagcompound);
        return p_82813_1_;
    }
}

