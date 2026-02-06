/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.item.Item
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.mod_DragonBC;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockAlienStone
extends Block {
    public BlockAlienStone() {
        super(Material.rock);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
        this.setHardness(1.5f);
        this.setResistance(10.0f);
        this.setStepSound(soundTypeStone);
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock((Block)BlocksDBC.BlockAlienCobbleStone);
    }
}

