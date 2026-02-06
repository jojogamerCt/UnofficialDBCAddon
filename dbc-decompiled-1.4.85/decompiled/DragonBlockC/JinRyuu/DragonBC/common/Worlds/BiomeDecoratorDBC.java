/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.Event
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockFlower
 *  net.minecraft.block.material.Material
 *  net.minecraft.init.Blocks
 *  net.minecraft.world.World
 *  net.minecraft.world.biome.BiomeDecorator
 *  net.minecraft.world.biome.BiomeGenBase
 *  net.minecraft.world.gen.feature.WorldGenFlowers
 *  net.minecraft.world.gen.feature.WorldGenerator
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType
 *  net.minecraftforge.event.terraingen.DecorateBiomeEvent$Post
 *  net.minecraftforge.event.terraingen.DecorateBiomeEvent$Pre
 *  net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType
 *  net.minecraftforge.event.terraingen.OreGenEvent$Post
 *  net.minecraftforge.event.terraingen.OreGenEvent$Pre
 *  net.minecraftforge.event.terraingen.TerrainGen
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Villages.ChkInSt;
import JinRyuu.DragonBC.common.Villages.NamekianHouse1;
import JinRyuu.DragonBC.common.Worlds.WorldGenNamekMedMoss;
import JinRyuu.DragonBC.common.Worlds.WorldGenNamekTrees;
import JinRyuu.DragonBC.common.Worlds.WorldGenOWTrees;
import JinRyuu.DragonBC.common.Worlds.WorldGenOre;
import JinRyuu.DragonBC.common.m.WorldGenMahagonyTree;
import JinRyuu.DragonBC.common.m.WorldGenMapleTree;
import JinRyuu.DragonBC.common.m.WorldGenSakuraTree;
import cpw.mods.fml.common.eventhandler.Event;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BiomeDecoratorDBC
extends BiomeDecorator {
    protected int grassPerChunk;
    protected int treesPerChunk;
    protected int WarenaiOrePerChunk;
    protected int NamekMedMossPerChunk;
    protected int NamekTreePerChunk;
    protected int NamekianHouseChunk;
    protected int NamekFreezaSoldiersChunk;
    protected int ChkInStChunk;
    protected int OWtri1PerChunk;
    protected int OWtri2PerChunk;
    protected int OWtri3PerChunk;
    protected int yellowFlowersPerChunk;
    protected int OWtri4PerChunk;
    protected int roseBushPerChunk;
    protected WorldGenerator NamekTreeGen;
    protected WorldGenerator NamekMedMossGen;
    protected WorldGenerator WarenaiOreGen = new WorldGenOre(BlocksDBC.BlockOreWrenai, 5, Blocks.stone);
    protected WorldGenerator NamekianHouse;
    protected WorldGenerator ChkInSt;

    public BiomeDecoratorDBC() {
        this.NamekTreeGen = new WorldGenNamekTrees(true);
        this.NamekianHouse = new NamekianHouse1();
        this.NamekMedMossGen = new WorldGenNamekMedMoss(false);
        this.ChkInSt = new ChkInSt();
        this.yellowFlowerGen = new WorldGenFlowers((Block)Blocks.yellow_flower);
    }

    public void decorateChunk(World p_150512_1_, Random p_150512_2_, BiomeGenBase p_150512_3_, int p_150512_4_, int p_150512_5_) {
        if (this.currentWorld != null) {
            throw new RuntimeException("Already decorating!!");
        }
        this.currentWorld = p_150512_1_;
        this.randomGenerator = p_150512_2_;
        this.chunk_X = p_150512_4_;
        this.chunk_Z = p_150512_5_;
        this.genDecorations(p_150512_3_);
        this.currentWorld = null;
        this.randomGenerator = null;
    }

    protected void genDecorations(BiomeGenBase p_150513_1_) {
        int var7;
        int var4;
        int var2;
        int i1;
        int l;
        int k;
        int var72;
        int var42;
        int var3;
        int j;
        MinecraftForge.EVENT_BUS.post((Event)new DecorateBiomeEvent.Pre(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));
        this.generateOres();
        boolean doGen = TerrainGen.decorate((World)this.currentWorld, (Random)this.randomGenerator, (int)this.chunk_X, (int)this.chunk_Z, (DecorateBiomeEvent.Decorate.EventType)DecorateBiomeEvent.Decorate.EventType.TREE);
        for (j = 0; doGen && j < this.OWtri1PerChunk; ++j) {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var42 = this.randomGenerator.nextInt(50);
            var72 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            new WorldGenOWTrees(false).generate(this.currentWorld, this.randomGenerator, var3, var42, var72);
        }
        for (j = 0; doGen && j < this.OWtri2PerChunk; ++j) {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var42 = this.randomGenerator.nextInt(50);
            var72 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            new WorldGenMahagonyTree().generate(this.currentWorld, this.randomGenerator, var3, var42, var72);
        }
        for (j = 0; doGen && j < this.OWtri3PerChunk; ++j) {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var42 = this.randomGenerator.nextInt(50);
            var72 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            new WorldGenSakuraTree().generate(this.currentWorld, this.randomGenerator, var3, var42, var72);
        }
        for (j = 0; doGen && j < this.OWtri4PerChunk; ++j) {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var42 = this.randomGenerator.nextInt(50);
            var72 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            new WorldGenMapleTree().generate(this.currentWorld, this.randomGenerator, var3, var42, var72);
        }
        doGen = TerrainGen.decorate((World)this.currentWorld, (Random)this.randomGenerator, (int)this.chunk_X, (int)this.chunk_Z, (DecorateBiomeEvent.Decorate.EventType)DecorateBiomeEvent.Decorate.EventType.FLOWERS);
        for (j = 0; doGen && j < this.yellowFlowersPerChunk; ++j) {
            k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            l = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            i1 = this.randomGenerator.nextInt(50);
            String s = "dandelion";
            BlockFlower blockflower = BlockFlower.func_149857_e((String)s);
            if (blockflower.getMaterial() == Material.air) continue;
            this.yellowFlowerGen.func_150550_a((Block)blockflower, BlockFlower.func_149856_f((String)s));
            this.yellowFlowerGen.generate(this.currentWorld, this.randomGenerator, k, i1, l);
        }
        doGen = TerrainGen.decorate((World)this.currentWorld, (Random)this.randomGenerator, (int)this.chunk_X, (int)this.chunk_Z, (DecorateBiomeEvent.Decorate.EventType)DecorateBiomeEvent.Decorate.EventType.FLOWERS);
        for (j = 0; doGen && j < this.roseBushPerChunk; ++j) {
            k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            l = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            i1 = this.randomGenerator.nextInt(50);
            String s = "tulipRed";
            BlockFlower blockflower = BlockFlower.func_149857_e((String)s);
            if (blockflower.getMaterial() == Material.air) continue;
            this.yellowFlowerGen.func_150550_a((Block)blockflower, BlockFlower.func_149856_f((String)s));
            this.yellowFlowerGen.generate(this.currentWorld, this.randomGenerator, k, i1, l);
        }
        for (var2 = 0; doGen && var2 < this.NamekMedMossPerChunk; ++var2) {
            int var32 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = 65 + this.randomGenerator.nextInt(50);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.NamekMedMossGen.generate(this.currentWorld, this.randomGenerator, var32, var4, var7);
        }
        doGen = TerrainGen.decorate((World)this.currentWorld, (Random)this.randomGenerator, (int)this.chunk_X, (int)this.chunk_Z, (DecorateBiomeEvent.Decorate.EventType)DecorateBiomeEvent.Decorate.EventType.TREE);
        for (var2 = 0; doGen && var2 < this.NamekTreePerChunk; ++var2) {
            int var33 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = 65 + this.randomGenerator.nextInt(50);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.NamekTreeGen.generate(this.currentWorld, this.randomGenerator, var33, var4, var7);
        }
        doGen = TerrainGen.decorate((World)this.currentWorld, (Random)this.randomGenerator, (int)this.chunk_X, (int)this.chunk_Z, (DecorateBiomeEvent.Decorate.EventType)DecorateBiomeEvent.Decorate.EventType.CUSTOM);
        for (var2 = 0; doGen && var2 < this.WarenaiOrePerChunk; ++var2) {
            int var34 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = 32 + this.randomGenerator.nextInt(128);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.WarenaiOreGen.generate(this.currentWorld, this.randomGenerator, var34, var4, var7);
        }
        for (var2 = 0; doGen && var2 < this.NamekianHouseChunk; ++var2) {
            int var35 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = 65 + this.randomGenerator.nextInt(20);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.NamekianHouse.generate(this.currentWorld, this.randomGenerator, var35, var4, var7);
        }
        MinecraftForge.EVENT_BUS.post((Event)new DecorateBiomeEvent.Post(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));
    }

    protected void generateOres() {
        MinecraftForge.ORE_GEN_BUS.post((Event)new OreGenEvent.Pre(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));
        if (TerrainGen.generateOre((World)this.currentWorld, (Random)this.randomGenerator, (WorldGenerator)this.dirtGen, (int)this.chunk_X, (int)this.chunk_Z, (OreGenEvent.GenerateMinable.EventType)OreGenEvent.GenerateMinable.EventType.DIRT)) {
            this.genStandardOre1(20, this.dirtGen, 0, 256);
        }
        if (TerrainGen.generateOre((World)this.currentWorld, (Random)this.randomGenerator, (WorldGenerator)this.ironGen, (int)this.chunk_X, (int)this.chunk_Z, (OreGenEvent.GenerateMinable.EventType)OreGenEvent.GenerateMinable.EventType.IRON)) {
            this.genStandardOre1(20, this.ironGen, 0, 64);
        }
        if (TerrainGen.generateOre((World)this.currentWorld, (Random)this.randomGenerator, (WorldGenerator)this.goldGen, (int)this.chunk_X, (int)this.chunk_Z, (OreGenEvent.GenerateMinable.EventType)OreGenEvent.GenerateMinable.EventType.GOLD)) {
            this.genStandardOre1(2, this.goldGen, 0, 32);
        }
        MinecraftForge.ORE_GEN_BUS.post((Event)new OreGenEvent.Post(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));
    }

    private int nextInt(int i) {
        if (i <= 1) {
            return 0;
        }
        return this.randomGenerator.nextInt(i);
    }
}

