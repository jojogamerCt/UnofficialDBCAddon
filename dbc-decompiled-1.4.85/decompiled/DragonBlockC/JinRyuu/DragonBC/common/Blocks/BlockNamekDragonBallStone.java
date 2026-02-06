/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.item.Item
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
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockNamekDragonBallStone
extends Block {
    private static int tickDragonBall = 0;

    public BlockNamekDragonBallStone() {
        super(DBCMaterial.dragonblock);
        this.setTickRandomly(true);
        this.setHardness(1.0f);
        float var4 = 0.4f;
        this.setBlockBounds(0.5f - var4, 0.0f, 0.5f - var4, 0.5f + var4, 0.4f + var4, 0.5f + var4);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock((Block)BlocksDBC.BlockNamekDragonBall);
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        if (!par1World.isRemote && par5Random.nextInt(5) == 0) {
            par1World.setBlock(par2, par3, par4, BlocksDBC.BlockNamekDragonBall, 0, 0);
        }
    }

    public int quantityDroppedWithBonus(int par1, Random par2Random) {
        return MathHelper.clamp_int((int)(this.quantityDropped(par2Random) + par2Random.nextInt(par1 + 1)), (int)1, (int)1);
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

