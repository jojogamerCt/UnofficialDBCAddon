/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.BlockFence
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.blocks;

import JinRyuu.JRMCore.mod_JRMCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockJRMCFence
extends BlockFence {
    private String tex;

    public BlockJRMCFence(String tex) {
        super("", Material.iron);
        this.setBlockUnbreakable();
        this.setResistance(6000000.0f);
        this.setCreativeTab(mod_JRMCore.JRMCore);
        this.tex = tex;
    }

    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {
        boolean flag = this.canConnectFenceTo((IBlockAccess)par1World, par2, par3, par4 - 1);
        boolean flag1 = this.canConnectFenceTo((IBlockAccess)par1World, par2, par3, par4 + 1);
        boolean flag2 = this.canConnectFenceTo((IBlockAccess)par1World, par2 - 1, par3, par4);
        boolean flag3 = this.canConnectFenceTo((IBlockAccess)par1World, par2 + 1, par3, par4);
        float f = 0.375f;
        float f1 = 0.625f;
        float f2 = 0.375f;
        float f3 = 0.625f;
        if (flag) {
            f2 = 0.0f;
        }
        if (flag1) {
            f3 = 1.0f;
        }
        if (flag || flag1) {
            this.setBlockBounds(f, 0.0f, f2, f1, 1.5f, f3);
            super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }
        f2 = 0.375f;
        f3 = 0.625f;
        if (flag2) {
            f = 0.0f;
        }
        if (flag3) {
            f1 = 1.0f;
        }
        if (flag2 || flag3 || !flag && !flag1) {
            this.setBlockBounds(f, 0.0f, f2, f1, 1.5f, f3);
            super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }
        if (flag) {
            f2 = 0.0f;
        }
        if (flag1) {
            f3 = 1.0f;
        }
        this.setBlockBounds(f, 0.0f, f2, f1, 1.0f, f3);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        boolean flag = this.canConnectFenceTo(par1IBlockAccess, par2, par3, par4 - 1);
        boolean flag1 = this.canConnectFenceTo(par1IBlockAccess, par2, par3, par4 + 1);
        boolean flag2 = this.canConnectFenceTo(par1IBlockAccess, par2 - 1, par3, par4);
        boolean flag3 = this.canConnectFenceTo(par1IBlockAccess, par2 + 1, par3, par4);
        float f = 0.375f;
        float f1 = 0.625f;
        float f2 = 0.375f;
        float f3 = 0.625f;
        if (flag) {
            f2 = 0.0f;
        }
        if (flag1) {
            f3 = 1.0f;
        }
        if (flag2) {
            f = 0.0f;
        }
        if (flag3) {
            f1 = 1.0f;
        }
        this.setBlockBounds(f, 0.0f, f2, f1, 1.0f, f3);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean getBlocksMovement(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        return false;
    }

    public int getRenderType() {
        return 11;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuumodscore:" + this.tex);
    }

    public int quantityDropped(Random par1Random) {
        return 1;
    }

    @SideOnly(value=Side.CLIENT)
    public int getRenderBlockPass() {
        return 0;
    }
}

