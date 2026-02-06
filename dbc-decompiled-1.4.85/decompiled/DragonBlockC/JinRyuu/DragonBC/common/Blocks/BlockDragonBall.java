/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Blocks.DBCMaterial;
import JinRyuu.DragonBC.common.mod_DragonBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockDragonBall
extends Block {
    protected int maxStackSize = 7;

    public BlockDragonBall setMaxStackSize(int par1) {
        this.maxStackSize = par1;
        return this;
    }

    public int getItemStackLimit() {
        return this.maxStackSize;
    }

    public BlockDragonBall() {
        super(DBCMaterial.dragonblock);
        this.setTickRandomly(true);
        this.setHardness(0.1f);
        float var4 = 0.2f;
        this.setBlockBounds(0.5f - var4, 0.2f - var4, 0.5f - var4, 0.5f + var4, 0.2f + var4, 0.5f + var4);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
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

