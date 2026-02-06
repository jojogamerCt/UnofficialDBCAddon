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
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IIcon
 *  net.minecraft.util.ResourceLocation
 */
package JinRyuu.JRMCore.items;

import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHJBRA;
import JinRyuu.JRMCore.JRMCoreHJFC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

public class GiTurtleBase
extends ItemArmor {
    public String modid;
    public String na;
    public ItemArmor.ArmorMaterial rl;
    @SideOnly(value=Side.CLIENT)
    public IIcon field_94604_cx1;
    private IIcon overlayIcon;
    private IIcon emptySlotIcon;
    private static final String[] CLOTH_OVERLAY_NAMES = new String[]{"leather_helmet_overlay", "leather_chestplate_overlay", "leather_leggings_overlay", "leather_boots_overlay"};

    public GiTurtleBase(ItemArmor.ArmorMaterial par2ArmorMaterial, int par3, int par4, String armornamePrefix) {
        super(par2ArmorMaterial, par3, par4);
        this.rl = par2ArmorMaterial;
        this.setMaxDamage(par2ArmorMaterial.getDurability(par4));
        this.maxStackSize = 1;
        this.na = armornamePrefix;
        this.modid = JRMCoreH.tjjrmc;
    }

    @SideOnly(value=Side.CLIENT)
    public ModelBiped giMdl(int slt, EntityLivingBase e) {
        switch (slt) {
            case 0: {
                return this.wear(e) ? JRMCoreHJBRA.GiTurtleMdl1 : JRMCoreClient.armor1;
            }
            case 1: {
                return this.wear(e) ? JRMCoreHJBRA.GiTurtleMdl1 : JRMCoreClient.armor1;
            }
            case 3: {
                return this.wear(e) ? JRMCoreHJBRA.GiTurtleMdl1 : JRMCoreClient.armor1;
            }
        }
        return this.wear(e) ? JRMCoreHJBRA.GiTurtleMdl2 : JRMCoreClient.armor2;
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

    @SideOnly(value=Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(this.modid + ":" + this.getUnlocalizedName().replaceAll("Scoutera", "Scouter").replaceAll("Scouterb", "Scouter"));
        this.field_94604_cx1 = par1IconRegister.registerIcon(EMPTY_SLOT_NAMES[this.armorType]);
        if (this.rl == ItemArmor.ArmorMaterial.CLOTH) {
            this.overlayIcon = par1IconRegister.registerIcon(CLOTH_OVERLAY_NAMES[this.armorType]);
        }
        this.emptySlotIcon = par1IconRegister.registerIcon(EMPTY_SLOT_NAMES[this.armorType]);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        String r = "";
        String s = "";
        String j = "";
        if (stack.getItemDamageForDisplay() > stack.getMaxDamage() / 2) {
            s = "_dam";
        }
        j = "jbra";
        r = stack.toString().contains("leg") || stack.toString().contains("Leg") ? this.modid + ":armor/" + this.na + "_2" + j + s + ".png" : this.modid + ":armor/" + this.na + "_1" + j + s + ".png";
        if (new ResourceLocation(this.modid, r) != null) {
            return r;
        }
        return r.replaceAll(s, "");
    }
}

