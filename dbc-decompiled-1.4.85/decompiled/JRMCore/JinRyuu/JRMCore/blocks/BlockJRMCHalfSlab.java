/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.blocks;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class BlockJRMCHalfSlab
extends Block {
    protected final boolean isDoubleSlab;

    public BlockJRMCHalfSlab(boolean par2, Material par3Material) {
        super(par3Material);
        this.isDoubleSlab = par2;
        if (!par2) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        if (this.isDoubleSlab) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            boolean flag;
            boolean bl = flag = (par1IBlockAccess.getBlockMetadata(par2, par3, par4) & 8) != 0;
            if (flag) {
                this.setBlockBounds(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
            } else {
                this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
            }
        }
    }

    public void setBlockBoundsForItemRender() {
        if (this.isDoubleSlab) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {
        this.setBlockBoundsBasedOnState((IBlockAccess)par1World, par2, par3, par4);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    }

    public boolean isOpaqueCube() {
        return this.isDoubleSlab;
    }

    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9) {
        return this.isDoubleSlab ? par9 : (par5 != 0 && (par5 == 1 || (double)par7 <= 0.5) ? par9 : par9 | 8);
    }

    public int quantityDropped(Random par1Random) {
        return this.isDoubleSlab ? 2 : 1;
    }

    public int damageDropped(int par1) {
        return par1;
    }

    public boolean renderAsNormalBlock() {
        return this.isDoubleSlab;
    }

    public abstract String getFullSlabName(int var1);

    public int getDamageValue(World par1World, int par2, int par3, int par4) {
        return super.getDamageValue(par1World, par2, par3, par4) & 7;
    }
}

