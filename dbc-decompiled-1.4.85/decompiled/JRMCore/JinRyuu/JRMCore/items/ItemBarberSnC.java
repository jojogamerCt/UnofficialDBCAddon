/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.common.IShearable
 */
package JinRyuu.JRMCore.items;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHJFC;
import JinRyuu.JRMCore.mod_JRMCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class ItemBarberSnC
extends Item {
    public static Entity barberTarget;

    public ItemBarberSnC(int par2, float par3, boolean par4) {
        this.setMaxStackSize(1);
        this.setMaxDamage(10);
        this.setCreativeTab(mod_JRMCore.JRMCore);
    }

    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(JRMCoreH.trl("jrmc", "BarberSnC.line1"));
    }

    public String getTextureFile() {
        return JRMCoreH.tjjrmc + ":";
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(JRMCoreH.tjjrmc + ":" + this.getUnlocalizedName().substring(5));
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem((Item)this)) {
            // empty if block
        }
        if (par2World.isRemote) {
            barberTarget = null;
            par3EntityPlayer.openGui((Object)mod_JRMCore.instance, 8, par3EntityPlayer.worldObj, (int)par3EntityPlayer.posX, (int)par3EntityPlayer.posY, (int)par3EntityPlayer.posZ);
        }
        if (!par3EntityPlayer.capabilities.isCreativeMode) {
            par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityPlayer);
        }
        return par1ItemStack;
    }

    public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity) {
        if (entity.worldObj.isRemote) {
            if (JRMCoreH.JFC() && JRMCoreHJFC.isChildNPC((Entity)entity)) {
                itemstack.damageItem(1, entity);
                barberTarget = entity;
                player.openGui((Object)mod_JRMCore.instance, 8, player.worldObj, (int)player.posX, (int)player.posY, (int)player.posZ);
            }
            return true;
        }
        if (entity instanceof IShearable) {
            IShearable target = (IShearable)entity;
            if (target.isShearable(itemstack, (IBlockAccess)entity.worldObj, (int)entity.posX, (int)entity.posY, (int)entity.posZ)) {
                ArrayList drops = target.onSheared(itemstack, (IBlockAccess)entity.worldObj, (int)entity.posX, (int)entity.posY, (int)entity.posZ, EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fortune.effectId, (ItemStack)itemstack));
                Random rand = new Random();
                for (ItemStack stack : drops) {
                    EntityItem ent = entity.entityDropItem(stack, 1.0f);
                    ent.motionY += (double)(rand.nextFloat() * 0.05f);
                    ent.motionX += (double)((rand.nextFloat() - rand.nextFloat()) * 0.1f);
                    ent.motionZ += (double)((rand.nextFloat() - rand.nextFloat()) * 0.1f);
                }
                itemstack.damageItem(1, entity);
            }
            return true;
        }
        return false;
    }

    private boolean getChild() {
        return false;
    }
}

