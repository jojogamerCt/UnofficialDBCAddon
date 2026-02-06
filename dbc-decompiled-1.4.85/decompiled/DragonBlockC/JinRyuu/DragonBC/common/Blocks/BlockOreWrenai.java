/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.item.Item
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.mod_DragonBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

public class BlockOreWrenai
extends Block {
    public BlockOreWrenai() {
        super(Material.rock);
        this.setTickRandomly(true);
        this.setHardness(3.0f);
        this.setResistance(5.0f);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public int quantityDroppedWithBonus(int par1, Random par2Random) {
        return MathHelper.clamp_int((int)(this.quantityDropped(par2Random) + par2Random.nextInt(par1 + 1)), (int)1, (int)1);
    }

    public int quantityDropped(Random par1Random) {
        return 2 + par1Random.nextInt(3);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return ItemsDBC.ItemWarenai;
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }
}

