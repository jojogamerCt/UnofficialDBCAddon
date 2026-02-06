/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Blocks.DBCMaterial;
import JinRyuu.DragonBC.common.mod_DragonBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockNamekDragonBall
extends Block {
    protected int maxStackSize = 7;

    public BlockNamekDragonBall setMaxStackSize(int par1) {
        this.maxStackSize = par1;
        return this;
    }

    public int getItemStackLimit() {
        return this.maxStackSize;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public BlockNamekDragonBall(int par1) {
        super(DBCMaterial.dragonblock);
        this.setTickRandomly(true);
        this.setHardness(0.1f);
        float var4 = 0.4f;
        this.setBlockBounds(0.5f - var4, 0.4f - var4, 0.5f - var4, 0.5f + var4, 0.4f + var4, 0.5f + var4);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t) {
        TileEntity tile_entity = world.getTileEntity(x, y, z);
        if (tile_entity == null || player.isSneaking()) {
            return false;
        }
        if (!world.isRemote) {
            World par1World = world;
            if (par1World.getBlock(x + 1, y, z) == this) {
                if (par1World.getBlock(x + 1, y, z + 1) == this && par1World.getBlock(x + 1, y, z - 1) == this && par1World.getBlock(x - 1, y, z) == this && par1World.getBlock(x - 1, y, z - 1) == this && par1World.getBlock(x - 1, y, z + 1) == this) {
                    par1World.setBlock(x, y, z, BlocksDBC.BlockDragonBallStone);
                }
            } else if (par1World.getBlock(x, y, z + 1) == this && par1World.getBlock(x + 1, y, z + 1) == this && par1World.getBlock(x + 1, y, z - 1) == this && par1World.getBlock(x, y, z - 1) == this && par1World.getBlock(x - 1, y, z - 1) == this && par1World.getBlock(x - 1, y, z + 1) == this) {
                par1World.setBlock(x, y, z, BlocksDBC.BlockDragonBallStone);
            }
        }
        return true;
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        if (!par1World.isRemote) {
            if (par1World.getBlock(par2 + 1, par3, par4) == this) {
                if (par1World.getBlock(par2 + 1, par3, par4 + 1) == this && par1World.getBlock(par2 + 1, par3, par4 - 1) == this && par1World.getBlock(par2 - 1, par3, par4) == this && par1World.getBlock(par2 - 1, par3, par4 - 1) == this && par1World.getBlock(par2 - 1, par3, par4 + 1) == this) {
                    par1World.setBlock(par2, par3, par4, BlocksDBC.BlockDragonBallStone);
                }
            } else if (par1World.getBlock(par2, par3, par4 + 1) == this && par1World.getBlock(par2 + 1, par3, par4 + 1) == this && par1World.getBlock(par2 + 1, par3, par4 - 1) == this && par1World.getBlock(par2, par3, par4 - 1) == this && par1World.getBlock(par2 - 1, par3, par4 - 1) == this && par1World.getBlock(par2 - 1, par3, par4 + 1) == this) {
                par1World.setBlock(par2, par3, par4, BlocksDBC.BlockDragonBallStone);
            }
        }
    }

    public void addCreativeItems(ArrayList itemList) {
        itemList.add(new ItemStack((Block)this, 1));
    }

    public int quantityDroppedWithBonus(int par1, Random par2Random) {
        return MathHelper.clamp_int((int)(this.quantityDropped(par2Random) + par2Random.nextInt(par1 + 1)), (int)1, (int)1);
    }

    public int quantityDropped(Random par1Random) {
        return 2 + par1Random.nextInt(3);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
        return null;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public int getRenderType() {
        return 0;
    }

    public boolean isOpaqueCube() {
        return false;
    }
}

