/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.crafting.CraftingManager
 *  net.minecraft.item.crafting.IRecipe
 *  net.minecraft.item.crafting.ShapedRecipes
 *  net.minecraft.item.crafting.ShapelessRecipes
 */
package JinRyuu.JRMCore.client;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.JGRecipesDBC;
import JinRyuu.JRMCore.client.JGRecipesNC;
import JinRyuu.JRMCore.client.JGRecipesYC;
import JinRyuu.JRMCore.items.ItemsJRMC;
import java.util.HashMap;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

public class JGRecipeHandler {
    public static final String[] recipelistmods = new String[]{"JRMCore", "Dragon Block C", "Naruto C", "Years C"};
    public static HashMap<String, ItemStack> recipelist = new HashMap();
    public static final String[] recipelistcategories = new String[]{"Blocks", "Items", "Armors", "Weapons", "Tools", "Vanities"};
    public static int[][] recipelistitems = new int[recipelistmods.length][recipelistcategories.length];

    public static void registerRecipes() {
        for (int i = 0; i < recipelistmods.length; ++i) {
            for (int j = 0; j < recipelistcategories.length; ++j) {
                JGRecipeHandler.recipelistitems[i][j] = 0;
            }
        }
        String mod = "JRMCore";
        String category = "Tools";
        JGRecipeHandler.addRecipe(mod, category, ItemsJRMC.ItemBarberSnC);
        category = "Items";
        JGRecipeHandler.addRecipe(mod, category, ItemsJRMC.Custom_fabric);
        category = "Vanities";
        JGRecipeHandler.addRecipe(mod, category, ItemsJRMC.Costume_creeper);
        JGRecipeHandler.addRecipe(mod, category, ItemsJRMC.Costume_ender);
        for (int i = 0; i < ItemsJRMC.ItemVanity3.length; ++i) {
            JGRecipeHandler.addRecipe(mod, category, ItemsJRMC.ItemsVanity[i]);
        }
        if (JRMCoreH.DBC()) {
            JGRecipesDBC.registerRecipes(mod, category);
        }
        if (JRMCoreH.NC()) {
            JGRecipesNC.registerRecipes(mod, category);
        }
        if (JRMCoreH.JYC()) {
            JGRecipesYC.registerRecipes(mod, category);
        }
    }

    public static void addRecipe(String mod, String category, ItemStack stack) {
        int id = 0;
        block0: for (int i = 0; i < recipelistmods.length; ++i) {
            for (int j = 0; j < recipelistcategories.length; ++j) {
                if (!recipelistmods[i].equals(mod) || !recipelistcategories[j].equals(category)) continue;
                id = recipelistitems[i][j];
                int[] nArray = recipelistitems[i];
                int n = j;
                nArray[n] = nArray[n] + 1;
                continue block0;
            }
        }
        recipelist.put(mod + "." + category + id, stack);
    }

    public static void addRecipe(String mod, String category, Item stack) {
        JGRecipeHandler.addRecipe(mod, category, new ItemStack(stack));
    }

    public static void addRecipe(String mod, String category, Block stack) {
        JGRecipeHandler.addRecipe(mod, category, new ItemStack(stack));
    }

    public static int getRecipeCount(int mod, int category) {
        return recipelistitems[mod][category];
    }

    public static boolean hasRecipes(int mod, int category) {
        return recipelistitems[mod][category] > 0;
    }

    public static int getFirstRecipeCategory(int mod) {
        for (int i = 0; i < recipelistcategories.length; ++i) {
            if (!JGRecipeHandler.hasRecipes(mod, i)) continue;
            return i;
        }
        return -1;
    }

    public static IRecipe getRecipe(Item item) {
        List recipes = CraftingManager.getInstance().getRecipeList();
        for (Object obj : recipes) {
            ShapedRecipes recipe;
            ItemStack output;
            if (!(obj instanceof ShapedRecipes ? (output = (recipe = (ShapedRecipes)obj).getRecipeOutput()).getItem().equals(item) : obj instanceof ShapelessRecipes && (output = (recipe = (ShapelessRecipes)obj).getRecipeOutput()).getItem().equals(item))) continue;
            return recipe;
        }
        return null;
    }

    public static ItemStack colorFix(ItemStack recept, ItemStack receptName) {
        ItemStack item = recept;
        if (item != null && (item.getItem().getUnlocalizedName().equals("tile.cloth") || item.getItem().getUnlocalizedName().equals("item.dyePowder"))) {
            if (receptName.getItem().getDamage(receptName) == Short.MAX_VALUE) {
                item = item.getItem().getUnlocalizedName().equals("tile.cloth") ? new ItemStack(Blocks.wool) : new ItemStack(Items.dye);
                item.getItem().setDamage(item, 15);
            } else {
                item = item.getItem().getUnlocalizedName().equals("tile.cloth") ? new ItemStack(Blocks.wool, 1, receptName.getItem().getDamage(receptName)) : new ItemStack(Items.dye, 1, receptName.getItem().getDamage(receptName));
            }
        }
        return item;
    }

    public static ShapedRecipes getShapedRecipe(Object obj, Item item) {
        ShapedRecipes recipe = (ShapedRecipes)obj;
        ItemStack output = recipe.getRecipeOutput();
        if (output.getItem().equals(item)) {
            return recipe;
        }
        return null;
    }

    public static ShapelessRecipes getShapelessRecipe(Object obj, Item item) {
        ShapelessRecipes recipe = (ShapelessRecipes)obj;
        ItemStack output = recipe.getRecipeOutput();
        if (output.getItem().equals(item)) {
            return recipe;
        }
        return null;
    }
}

