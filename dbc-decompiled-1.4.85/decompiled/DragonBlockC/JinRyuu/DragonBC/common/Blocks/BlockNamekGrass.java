/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.mod_DragonBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNamekGrass
extends Block {
    @SideOnly(value=Side.CLIENT)
    private IIcon iconGrassTop;
    @SideOnly(value=Side.CLIENT)
    private IIcon iconSnowSide;
    @SideOnly(value=Side.CLIENT)
    private IIcon iconGrassSideOverlay;

    public BlockNamekGrass() {
        super(Material.grass);
        this.setTickRandomly(true);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
        this.setHarvestLevel("shovel", 0);
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    public void addCreativeItems(ArrayList itemList) {
        itemList.add(new ItemStack((Block)this, 1));
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        return par1 == 1 ? this.iconGrassTop : (par1 == 0 ? BlocksDBC.BlockNamekDirt.getBlockTextureFromSide(par1) : this.blockIcon);
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        if (par5 == 1) {
            return this.iconGrassTop;
        }
        if (par5 == 0) {
            return BlocksDBC.BlockNamekDirt.getBlockTextureFromSide(par5);
        }
        return this.blockIcon;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName() + "Side");
        this.iconGrassTop = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName() + "Top");
    }

    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
        if (!p_149674_1_.isRemote) {
            if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) < 4 && p_149674_1_.getBlockLightOpacity(p_149674_2_, p_149674_3_ + 1, p_149674_4_) > 2) {
                p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, BlocksDBC.BlockNamekDirt);
            } else if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 9) {
                for (int l = 0; l < 4; ++l) {
                    int i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
                    int j1 = p_149674_3_ + p_149674_5_.nextInt(5) - 3;
                    int k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;
                    Block block = p_149674_1_.getBlock(i1, j1 + 1, k1);
                    if (p_149674_1_.getBlock(i1, j1, k1) != BlocksDBC.BlockNamekDirt && p_149674_1_.getBlock(i1, j1, k1) != Blocks.dirt || p_149674_1_.getBlockMetadata(i1, j1, k1) != 0 || p_149674_1_.getBlockLightValue(i1, j1 + 1, k1) < 4 || p_149674_1_.getBlockLightOpacity(i1, j1 + 1, k1) > 2) continue;
                    p_149674_1_.setBlock(i1, j1, k1, BlocksDBC.BlockNamekGrass);
                }
            }
        }
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return BlocksDBC.BlockNamekDirt.getItemDropped(0, p_149650_2_, p_149650_3_);
    }
}

