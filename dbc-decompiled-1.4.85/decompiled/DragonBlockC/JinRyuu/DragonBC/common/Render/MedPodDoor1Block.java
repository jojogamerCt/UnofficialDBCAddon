/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Blocks.DBCMaterial;
import JinRyuu.DragonBC.common.Render.MedPodDoor1TileEntity;
import JinRyuu.DragonBC.common.mod_DragonBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class MedPodDoor1Block
extends BlockContainer {
    private Class MedPodDoor1TileEntity;

    public MedPodDoor1Block() {
        super(DBCMaterial.dragonblock);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
        this.MedPodDoor1TileEntity = MedPodDoor1TileEntity.class;
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    public void registerIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        int l = p_149668_1_.getBlockMetadata(p_149668_2_, p_149668_3_, p_149668_4_);
        return MedPodDoor1Block.isFenceGateOpen(l) ? null : (l != 2 && l != 0 ? AxisAlignedBB.getBoundingBox((double)((float)p_149668_2_ + 0.375f), (double)p_149668_3_, (double)p_149668_4_, (double)((float)p_149668_2_ + 0.625f), (double)((float)p_149668_3_ + 1.5f), (double)(p_149668_4_ + 1)) : AxisAlignedBB.getBoundingBox((double)p_149668_2_, (double)p_149668_3_, (double)((float)p_149668_4_ + 0.375f), (double)(p_149668_2_ + 1), (double)((float)p_149668_3_ + 1.5f), (double)((float)p_149668_4_ + 0.625f)));
    }

    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_) {
        int l = this.getDirection(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_));
        if (l != 2 && l != 0) {
            this.setBlockBounds(0.375f, 0.0f, 0.0f, 0.625f, 1.0f, 1.0f);
        } else {
            this.setBlockBounds(0.0f, 0.0f, 0.375f, 1.0f, 1.0f, 0.625f);
        }
    }

    public boolean getBlocksMovement(IBlockAccess p_149655_1_, int p_149655_2_, int p_149655_3_, int p_149655_4_) {
        return MedPodDoor1Block.isFenceGateOpen(p_149655_1_.getBlockMetadata(p_149655_2_, p_149655_3_, p_149655_4_));
    }

    public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
        int l = (MathHelper.floor_double((double)((double)(p_149689_5_.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) % 4;
        p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);
    }

    public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer plyer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        Block block;
        int i;
        TileEntity tile_entity = w.getTileEntity(x, y, z);
        if (tile_entity == null || plyer.isSneaking()) {
            return false;
        }
        int i1 = w.getBlockMetadata(x, y, z);
        boolean open = MedPodDoor1Block.isFenceGateOpen(i1);
        w.playSoundEffect((double)x + 0.5, (double)y + 0.5, (double)z + 0.5, "jinryuudragonbc:150724.MedPodDoor1", 1.0f, w.rand.nextFloat() * 0.1f + (open ? 0.8f : 0.9f));
        int r = i1 + 4 * (open ? -1 : 1);
        w.setBlockMetadataWithNotify(x, y, z, r, 2);
        for (i = 0; i < 5 && (block = w.getBlock(x, y + (i + 1), z)) == this; ++i) {
            w.setBlockMetadataWithNotify(x, y + (i + 1), z, r, 2);
        }
        for (i = 0; i < 5 && (block = w.getBlock(x, y - (i + 1), z)) == this; ++i) {
            w.setBlockMetadataWithNotify(x, y - (i + 1), z, r, 2);
        }
        return true;
    }

    public int getDirection(int p_149895_0_) {
        return p_149895_0_ & 3;
    }

    public void onNeighborBlockChange(World w, int x, int y, int z, Block neighbor) {
        if (!w.isRemote) {
            boolean flag;
            int l = w.getBlockMetadata(x, y, z);
            boolean bl = flag = w.isBlockIndirectlyGettingPowered(x, y, z) || w.isBlockIndirectlyGettingPowered(x, y + 1, z) || w.isBlockIndirectlyGettingPowered(x, y - 1, z);
            if (flag || neighbor.canProvidePower()) {
                Block block2 = w.getBlock(x, y + 1, z);
                Block block3 = w.getBlock(x, y - 1, z);
                int i1 = w.getBlockMetadata(x, y, z);
                if (flag && !MedPodDoor1Block.isFenceGateOpen(l)) {
                    w.playSoundEffect((double)x + 0.5, (double)y + 0.5, (double)z + 0.5, "jinryuudragonbc:150724.MedPodDoor1", 1.0f, w.rand.nextFloat() * 0.1f + 0.9f);
                    int r = i1 + 4;
                    w.setBlockMetadataWithNotify(x, y, z, r, 2);
                    if (block2 == this) {
                        w.setBlockMetadataWithNotify(x, y + 1, z, r, 2);
                    }
                    if (block3 == this) {
                        w.setBlockMetadataWithNotify(x, y - 1, z, r, 2);
                    }
                } else if (!flag && MedPodDoor1Block.isFenceGateOpen(l)) {
                    w.playSoundEffect((double)x + 0.5, (double)y + 0.5, (double)z + 0.5, "jinryuudragonbc:150724.MedPodDoor1", 1.0f, w.rand.nextFloat() * 0.1f + 0.8f);
                    int r = i1 - 4;
                    w.setBlockMetadataWithNotify(x, y, z, r, 2);
                    TileEntity te = w.getTileEntity(x, y, z);
                    if (te instanceof MedPodDoor1TileEntity) {
                        ((MedPodDoor1TileEntity)te).setCb(21);
                    }
                    if (block2 == this) {
                        w.setBlockMetadataWithNotify(x, y + 1, z, r, 2);
                        te = w.getTileEntity(x, y + 1, z);
                        if (te instanceof MedPodDoor1TileEntity) {
                            ((MedPodDoor1TileEntity)te).setCb(21);
                        }
                    }
                    if (block3 == this) {
                        w.setBlockMetadataWithNotify(x, y - 1, z, r, 2);
                        te = w.getTileEntity(x, y - 1, z);
                        if (te instanceof MedPodDoor1TileEntity) {
                            ((MedPodDoor1TileEntity)te).setCb(21);
                        }
                    }
                }
            }
        }
    }

    public static boolean isFenceGateOpen(int p_149896_0_) {
        return (p_149896_0_ & 4) != 0;
    }

    public int quanityDropped(Random random) {
        return 1;
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

    public void breakBlock(World world, int x, int y, int z, Block i, int j) {
        super.breakBlock(world, x, y, z, i, j);
    }

    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new MedPodDoor1TileEntity();
    }

    @SideOnly(value=Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_) {
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }
}

