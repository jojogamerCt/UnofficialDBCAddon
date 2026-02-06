/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.blocks;

import JinRyuu.JRMCore.blocks.BlockBarrier;
import JinRyuu.JRMCore.blocks.BlockBorderTileEntity;
import JinRyuu.JRMCore.mod_JRMCore;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBorder
extends BlockBarrier {
    public BlockBorder() {
        this.setCreativeTab(mod_JRMCore.JRMCore);
        this.setHardness(-1.0f);
        this.setResistance(6000000.0f);
        this.TileEntity = BlockBorderTileEntity.class;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new BlockBorderTileEntity();
    }
}

