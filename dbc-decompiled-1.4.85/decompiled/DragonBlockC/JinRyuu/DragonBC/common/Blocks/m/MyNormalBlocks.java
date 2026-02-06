/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 */
package JinRyuu.DragonBC.common.Blocks.m;

import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MyNormalBlocks
extends Block {
    protected MyNormalBlocks(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(JRMCoreH.tjdbcAssts + ":" + unlocalizedName);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
        this.setHardness(2.0f);
        this.setResistance(10.0f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(soundTypeStone);
    }
}

