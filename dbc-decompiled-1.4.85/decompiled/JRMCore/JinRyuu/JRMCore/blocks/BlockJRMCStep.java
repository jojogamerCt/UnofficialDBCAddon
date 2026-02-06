/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.util.IIcon
 */
package JinRyuu.JRMCore.blocks;

import JinRyuu.JRMCore.blocks.BlockJRMCHalfSlab;
import JinRyuu.JRMCore.mod_JRMCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockJRMCStep
extends BlockJRMCHalfSlab {
    @SideOnly(value=Side.CLIENT)
    private IIcon theIcon;
    private String tex;
    private String tex2;

    public BlockJRMCStep(boolean par2, String tex, String tex2) {
        super(par2, Material.rock);
        this.setHardness(50.0f);
        this.setResistance(2000.0f);
        this.setCreativeTab(mod_JRMCore.JRMCore);
        this.tex = tex;
        this.tex2 = tex2;
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        return par1 == 1 ? this.blockIcon : (par1 == 0 ? this.blockIcon : (par1 != 2 && par1 != 4 ? this.blockIcon : this.theIcon));
    }

    public int getRenderBlockPass() {
        return 0;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuumodscore:" + this.tex);
        this.theIcon = par1IconRegister.registerIcon("jinryuumodscore:" + this.tex2);
    }

    @Override
    public String getFullSlabName(int par1) {
        return super.getUnlocalizedName();
    }
}

