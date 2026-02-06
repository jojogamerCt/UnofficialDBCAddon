/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.mod_DragonBC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAlienCobbleStone
extends Block {
    public BlockAlienCobbleStone() {
        super(Material.rock);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
        this.setHardness(2.0f);
        this.setResistance(10.0f);
        this.setStepSound(soundTypeStone);
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }
}

