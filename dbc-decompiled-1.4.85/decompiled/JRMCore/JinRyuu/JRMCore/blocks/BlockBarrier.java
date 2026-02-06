/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.ITileEntityProvider
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.blocks;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.blocks.BlockBarrierTileEntity;
import JinRyuu.JRMCore.mod_JRMCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBarrier
extends Block
implements ITileEntityProvider {
    Class TileEntity;

    public BlockBarrier() {
        super(Material.rock);
        this.setCreativeTab(mod_JRMCore.JRMCore);
        this.setHardness(-1.0f);
        this.setResistance(6000000.0f);
        this.TileEntity = BlockBarrierTileEntity.class;
    }

    public String getTextureFile() {
        return JRMCoreH.tjjrmc + ":";
    }

    @SideOnly(value=Side.CLIENT)
    public int getRenderBlockPass() {
        return 0;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean canCollideCheck(int par1, boolean par2) {
        return true;
    }

    public boolean isBlockSolid(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(JRMCoreH.tjjrmc + ":" + this.getUnlocalizedName());
    }

    public int idDropped(int par1, Random par2Random, int par3) {
        return 0;
    }

    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new BlockBarrierTileEntity();
    }

    public int quanityDropped(Random random) {
        return 1;
    }

    public int getRenderType() {
        return -1;
    }

    public int tickRate() {
        return 1;
    }
}

