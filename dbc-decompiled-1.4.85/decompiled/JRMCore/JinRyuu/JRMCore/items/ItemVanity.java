/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.ResourceLocation
 */
package JinRyuu.JRMCore.items;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreH2;
import JinRyuu.JRMCore.JRMCoreHJBRA;
import JinRyuu.JRMCore.JRMCoreHJFC;
import JinRyuu.JRMCore.items.ItemsJRMC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

public class ItemVanity
extends Item {
    private int defcol = JRMCoreH2.cols[15];
    private String Display = "Color1";
    public String armorNamePrefix;
    public String modid;
    public String na;
    public ItemArmor.ArmorMaterial rl;
    public int id = -1;
    public final int armorType;

    public ItemVanity(int defcol, int armorType, String armornamePrefix) {
        this.defcol = defcol;
        this.armorType = armorType;
        this.na = armornamePrefix;
        this.setMaxDamage(320);
        this.setMaxStackSize(1);
        this.id = -1;
    }

    public ItemVanity(int defcol, int armorType, String armornamePrefix, int id) {
        this.defcol = defcol;
        this.armorType = armorType;
        this.na = armornamePrefix;
        this.setMaxDamage(320);
        this.setMaxStackSize(1);
        this.id = id;
    }

    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(JRMCoreH.trl("jrmc", "Vanity"));
        par3List.add(JRMCoreH.trl("jrmc", "descvanityColorable1"));
        par3List.add(JRMCoreH.trl("jrmc", "descvanityColorable2"));
        if (this.hasColor(par1ItemStack)) {
            par3List.add(JRMCoreH.trl("jrmc", "BodysuitColor") + ": " + JRMCoreH.trl("jrmc", this.getColorReadable(par1ItemStack)));
        }
    }

    @SideOnly(value=Side.CLIENT)
    public ModelBiped giMdl(int slt, EntityLivingBase e) {
        if (this.wear(e)) {
            boolean has = false;
            for (int i = 0; i < ItemsJRMC.ItemsVanityNum.length; ++i) {
                if (ItemsJRMC.ItemVanity3[i] <= -1 || this.id != ItemsJRMC.ItemVanity3[i]) continue;
                has = true;
                return JRMCoreHJBRA.JRMC_GiTurtleMdl2[this.id];
            }
            if (!has) {
                if (slt != 5) {
                    if (this.getUnlocalizedName().contains("Head")) {
                        return JRMCoreHJBRA.GiTurtleMdl2;
                    }
                    return JRMCoreHJBRA.GiTurtleMdl3;
                }
                return JRMCoreHJBRA.GiTurtleMdl2;
            }
        }
        return null;
    }

    public boolean wear(EntityLivingBase e) {
        return JRMCoreH.JBRA() && (e instanceof EntityPlayer || JRMCoreH.JFC() && JRMCoreHJFC.isChildNPC((Entity)e));
    }

    @SideOnly(value=Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int par3) {
        ModelBiped modelbiped = this.giMdl(par3, entityLiving);
        if (this.wear(entityLiving)) {
            modelbiped = JRMCoreHJBRA.showModel(modelbiped, entityLiving, itemStack, par3);
        } else {
            ItemStack var11;
            modelbiped.bipedHead.showModel = par3 == 0;
            modelbiped.bipedHeadwear.showModel = false;
            modelbiped.bipedBody.showModel = par3 == 1 || par3 == 2;
            modelbiped.bipedRightArm.showModel = par3 == 1;
            modelbiped.bipedLeftArm.showModel = par3 == 1;
            modelbiped.bipedRightLeg.showModel = par3 == 2 || par3 == 3;
            boolean bl = modelbiped.bipedLeftLeg.showModel = par3 == 2 || par3 == 3;
            if (entityLiving instanceof EntityMob) {
                modelbiped.bipedRightArm.showModel = false;
                modelbiped.bipedLeftArm.showModel = false;
            }
            int n = modelbiped.heldItemRight = (var11 = entityLiving.getHeldItem()) != null ? 1 : 0;
            if (var11 != null && entityLiving instanceof EntityPlayer && ((EntityPlayer)entityLiving).getItemInUseCount() > 0) {
                EnumAction var12 = var11.getItemUseAction();
                if (var12 == EnumAction.block) {
                    modelbiped.heldItemRight = 3;
                } else if (var12 == EnumAction.bow) {
                    modelbiped.aimedBow = true;
                }
            }
            modelbiped.isSneak = entityLiving.isSneaking();
            modelbiped.isRiding = entityLiving.isRiding();
            modelbiped.isChild = entityLiving.isChild();
        }
        return modelbiped;
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
        return this.modid + ":";
    }

    @SideOnly(value=Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(this.modid + ":" + this.getUnlocalizedName().replaceAll("item.", ""));
    }

    @SideOnly(value=Side.CLIENT)
    public int getColorFromItemStack(ItemStack item, int var) {
        return this.getColor(item);
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

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        String r = "";
        String s = "";
        String j = "";
        if (stack.getItemDamageForDisplay() > stack.getMaxDamage() / 2) {
            s = "_dam";
        }
        j = "jbra";
        r = stack.toString().contains("leg") || stack.toString().contains("Leg") ? this.modid + ":armor/" + this.na + "_2" + j + s + ".png" : (stack.toString().contains("boot") || stack.toString().contains("Boot") ? this.modid + ":armor/" + this.na + "_3" + j + s + ".png" : (stack.toString().contains("head") || stack.toString().contains("Head") ? this.modid + ":armor/" + this.na + "_4" + j + s + ".png" : this.modid + ":armor/" + this.na + "_1" + j + s + ".png"));
        if (new ResourceLocation(this.modid, r) != null) {
            return r;
        }
        return r.replaceAll(s, "");
    }
}

