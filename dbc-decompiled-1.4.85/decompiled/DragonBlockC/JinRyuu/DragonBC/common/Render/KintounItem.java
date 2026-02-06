/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Render.KintounEntity;
import JinRyuu.DragonBC.common.mod_DragonBC;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class KintounItem
extends Item {
    public KintounItem() {
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
        this.maxStackSize = 1;
    }

    public String getTextureFile() {
        return "jinryuudragonbc:dragonitems1.png";
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        if (par7 == 0) {
            --par5;
        }
        if (par7 == 1) {
            ++par5;
        }
        if (par7 == 2) {
            --par6;
        }
        if (par7 == 3) {
            ++par6;
        }
        if (par7 == 4) {
            --par4;
        }
        if (par7 == 5) {
            ++par4;
        }
        if (!player.canPlayerEdit(par4, par5, par6, par7, stack)) {
            return false;
        }
        if (!world.isRemote) {
            player.inventory.consumeInventoryItem((Item)this);
            player.inventory.inventoryChanged = true;
            player.inventory.inventoryChanged = false;
            KintounEntity KintounEntity2 = new KintounEntity(world);
            KintounEntity2.setLocationAndAngles(par4, par5 + 1, par6, player.rotationYaw, 0.0f);
            world.spawnEntityInWorld((Entity)KintounEntity2);
        }
        return true;
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            Vec3 vec = player.getLookVec();
            KintounEntity KintounEntity2 = new KintounEntity(world);
            KintounEntity2.setLocationAndAngles(player.posX + vec.xCoord * 1.5, player.posY + 1.0 + vec.yCoord * 1.5, player.posZ + vec.zCoord * 1.5, player.rotationYaw, 0.0f);
            world.spawnEntityInWorld((Entity)KintounEntity2);
            ItemStack[] inv = player.inventory.mainInventory;
            int id = 0;
            for (ItemStack invStack : inv) {
                if (invStack != null && invStack.equals(stack)) {
                    player.inventory.mainInventory[id] = null;
                    break;
                }
                ++id;
            }
        }
        return stack;
    }
}

