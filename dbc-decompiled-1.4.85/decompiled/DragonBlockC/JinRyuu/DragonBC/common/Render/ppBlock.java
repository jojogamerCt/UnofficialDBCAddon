/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Render.ppTileEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ppBlock
extends BlockContainer {
    private final Random field_149933_a = new Random();
    private Class kfueb = ppTileEntity.class;

    public ppBlock() {
        super(Material.iron);
        this.setBlockUnbreakable();
        this.setResistance(6000000.0f);
        float var4 = 0.03125f;
        this.setBlockBounds(0.5f - var4, 0.0f, 0.5f - var4, 0.5f + var4, 1.0f, 0.5f + var4);
        this.setTickRandomly(true);
    }

    public int getRenderType() {
        return -1;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void onBlockAdded(World p_149726_1_, int x, int y, int z) {
        super.onBlockAdded(p_149726_1_, x, y, z);
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    }

    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        Item item = ItemsDBC.ItemPP;
        return new ItemStack(item, 1, 0);
    }

    @SideOnly(value=Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return ItemsDBC.ItemPP;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return null;
    }

    public int quantityDropped(int parMetadata, int parFortune, Random parRand) {
        return 0;
    }

    public int quantityDropped(Random p_149745_1_) {
        return 0;
    }

    public int tickRate(World par1World) {
        return 20;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t) {
        TileEntity tile_entity = world.getTileEntity(x, y, z);
        if (tile_entity == null || player.isSneaking()) {
            return false;
        }
        if (!world.isRemote) {
            int i1;
            player.inventory.addItemStackToInventory(new ItemStack(ItemsDBC.ItemPP, 1));
            player.inventory.inventoryChanged = true;
            for (i1 = 0; i1 < 255 && world.getBlock(x, y + i1, z) instanceof ppBlock; ++i1) {
                world.setBlockToAir(x, y + i1, z);
                world.removeTileEntity(x, y + i1, z);
            }
            for (i1 = -1; i1 > -255 && world.getBlock(x, y + i1, z) instanceof ppBlock; --i1) {
                world.setBlockToAir(x, y + i1, z);
                world.removeTileEntity(x, y + i1, z);
            }
        }
        return true;
    }

    public TileEntity createNewTileEntity(World world, int i) {
        return new ppTileEntity();
    }

    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
    }

    public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity) {
        return true;
    }

    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_) {
        TileEntity tile_entity = p_149695_1_.getTileEntity(p_149695_2_, p_149695_3_, p_149695_4_);
        if (tile_entity instanceof ppTileEntity && p_149695_1_.isAirBlock(p_149695_2_, p_149695_3_ - 1, p_149695_4_) && ((ppTileEntity)tile_entity).getF()) {
            float f = 0.7f;
            double d0 = (double)(p_149695_1_.rand.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            double d1 = (double)(p_149695_1_.rand.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            double d2 = (double)(p_149695_1_.rand.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            EntityItem entityitem = new EntityItem(p_149695_1_, (double)p_149695_2_ + d0, (double)p_149695_3_ + d1, (double)p_149695_4_ + d2, new ItemStack(ItemsDBC.ItemPP));
            entityitem.delayBeforeCanPickup = 10;
            p_149695_1_.spawnEntityInWorld((Entity)entityitem);
            for (int i1 = 0; i1 < 255 && p_149695_1_.getBlock(p_149695_2_, p_149695_3_ + i1, p_149695_4_) instanceof ppBlock; ++i1) {
                p_149695_1_.setBlockToAir(p_149695_2_, p_149695_3_ + i1, p_149695_4_);
                p_149695_1_.removeTileEntity(p_149695_2_, p_149695_3_ + i1, p_149695_4_);
            }
        }
    }
}

