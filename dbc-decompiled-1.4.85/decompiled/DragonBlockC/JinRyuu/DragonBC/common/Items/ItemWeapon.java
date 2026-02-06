/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Items;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Render.ppTileEntity;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ItemWeapon
extends ItemSword {
    private int ticker = 0;

    public ItemWeapon(Item.ToolMaterial tm) {
        super(tm);
        this.maxStackSize = 1;
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    @SideOnly(value=Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(JRMCoreH.tjdbcAssts + ":" + this.getUnlocalizedName());
    }

    public void onCreated(ItemStack p_77622_1_, World p_77622_2_, EntityPlayer p_77622_3_) {
        super.onCreated(p_77622_1_, p_77622_2_, p_77622_3_);
    }

    public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
        super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
        if (!p_77663_2_.isRemote && this.ticker > 0) {
            --this.ticker;
        }
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer p, World world, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        if (world.getBlock(x, y, z) != null) {
            if (!world.isRemote && this.ticker == 0 && world.getBlock(x, y, z).canPlaceBlockAt(world, x, y + 1, z)) {
                world.setBlock(x, y + 1, z, BlocksDBC.ppBlock);
                for (int i = 2; i < 100 && world.isAirBlock(x, y + i, z); ++i) {
                    world.setBlock(x, y + i, z, BlocksDBC.ppBlock);
                }
                TileEntity tile_entity = world.getTileEntity(x, y + 1, z);
                if (tile_entity instanceof ppTileEntity) {
                    ((ppTileEntity)tile_entity).setF();
                }
                this.ticker = 20;
                p.inventory.consumeInventoryItem((Item)this);
                stack.stackSize = 0;
                return true;
            }
            return false;
        }
        return false;
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
        return p_77659_1_;
    }
}

