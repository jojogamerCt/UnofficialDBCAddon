/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.IFuelHandler
 *  net.minecraft.block.Block
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.DragonBC.common;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Blocks.m.ModdedBlocks;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Items.m.ModdedItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DBCHandlerFuel
implements IFuelHandler {
    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == ModdedItems.SakuraStick) {
            return 150;
        }
        if (fuel.getItem() == ModdedItems.MahagonyStick) {
            return 150;
        }
        if (fuel.getItem() == ModdedItems.MapleStick) {
            return 150;
        }
        if (fuel.getItem() == ModdedItems.SakuraBranch) {
            return 200;
        }
        if (fuel.getItem() == ModdedItems.MahagonyBranch) {
            return 200;
        }
        if (fuel.getItem() == ModdedItems.SakuraHammer) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.SakuraSword) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.SakuraAxe) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.SakuraPickaxe) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.SakuraHoe) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.SakuraShovel) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MahagonySword) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MahagonyAxe) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MahagonyPickaxe) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MahagonyHoe) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MahagonyShovel) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MapleSword) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MapleAxe) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MaplePickaxe) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MapleHoe) {
            return 250;
        }
        if (fuel.getItem() == ModdedItems.MapleShovel) {
            return 250;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.PaperWallSakura)) {
            return 150;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.PaperWallMahagony)) {
            return 150;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.SakuraLogs)) {
            return 400;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.SakuraPlank)) {
            return 400;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.SakuraSaplings)) {
            return 150;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.SakuraStairs)) {
            return 200;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.MahagonyStairs)) {
            return 200;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.MapleStairs)) {
            return 200;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.SakuraFence)) {
            return 200;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.MahagonyFence)) {
            return 200;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.MapleFence)) {
            return 200;
        }
        if (fuel.getItem() == Item.getItemFromBlock((Block)ModdedBlocks.SakuraSlabsSingle)) {
            return 200;
        }
        Item item = fuel.getItem();
        if (item == ItemsDBC.ItemsOW[3]) {
            return 1500;
        }
        if (item == Item.getItemFromBlock((Block)BlocksDBC.BlockOW[0])) {
            return 15000;
        }
        return 0;
    }
}

