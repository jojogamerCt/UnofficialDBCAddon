/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jin_ryuu.SwordArtC.Main
 *  com.jin_ryuu.SwordArtC.items.ModItems
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.MathHelper
 *  net.minecraftforge.common.util.EnumHelper
 *  net.minecraftforge.event.entity.item.ItemEvent
 *  net.minecraftforge.event.entity.living.LivingDropsEvent
 *  net.minecraftforge.event.entity.player.ItemTooltipEvent
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreH;
import com.jin_ryuu.SwordArtC.Main;
import com.jin_ryuu.SwordArtC.items.ModItems;
import java.util.Random;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

public class JRMCoreHSAC {
    public static ItemArmor.ArmorMaterial GI = EnumHelper.addArmorMaterial((String)"GI", (int)15, (int[])new int[]{3, 5, 5, 5}, (int)20);
    public static ItemArmor.ArmorMaterial GI2 = EnumHelper.addArmorMaterial((String)"GI", (int)25, (int[])new int[]{3, 5, 5, 5}, (int)20);
    public static Item.ToolMaterial SWORDSHORT = EnumHelper.addToolMaterial((String)"SWORDSHORT", (int)1, (int)600, (float)6.0f, (float)1.0f, (int)20);
    public static Item.ToolMaterial SWORDLONG = EnumHelper.addToolMaterial((String)"SWORDLONG", (int)1, (int)750, (float)6.0f, (float)2.0f, (int)20);
    public static Item.ToolMaterial CURVED = EnumHelper.addToolMaterial((String)"CURVED", (int)1, (int)700, (float)6.0f, (float)1.0f, (int)20);
    public static Item.ToolMaterial DAGGER = EnumHelper.addToolMaterial((String)"DAGGER", (int)1, (int)500, (float)6.0f, (float)1.0f, (int)20);
    public static Item.ToolMaterial RAPIER = EnumHelper.addToolMaterial((String)"RAPIER", (int)1, (int)850, (float)6.0f, (float)1.0f, (int)20);
    public static Item.ToolMaterial AXE = EnumHelper.addToolMaterial((String)"AXE", (int)1, (int)500, (float)6.0f, (float)1.0f, (int)20);
    public static Item.ToolMaterial SPEAR = EnumHelper.addToolMaterial((String)"SPEAR", (int)1, (int)800, (float)6.0f, (float)2.0f, (int)20);
    public static Item.ToolMaterial BATTLEAXE = EnumHelper.addToolMaterial((String)"BATTLEAXE", (int)1, (int)950, (float)6.0f, (float)3.0f, (int)20);
    public static Item.ToolMaterial WARHAMMER = EnumHelper.addToolMaterial((String)"WARHAMMER", (int)1, (int)850, (float)6.0f, (float)3.0f, (int)20);
    public static Item.ToolMaterial SWORD2 = EnumHelper.addToolMaterial((String)"SWORD2", (int)1, (int)900, (float)6.0f, (float)2.0f, (int)20);
    public static Item.ToolMaterial KATANA = EnumHelper.addToolMaterial((String)"KATANA", (int)1, (int)1000, (float)6.0f, (float)2.0f, (int)20);
    public static final int ah_sword = 10;
    public static final int ah_spear = 11;
    public static final String[] bonusesCanBe = new String[]{"atr", "skill"};
    public static final int atr_STR = 0;
    public static final int atr_AGI = 1;
    public static final int atr_Skill = 2;
    public static final String lvlItem = "lvlItem";
    public static final String lvlUpgrade = "lvlUpgrade";
    public static final String attackMin = "attackMin";
    public static final String attackMax = "attackMax";
    public static final String requires = "requires";

    public static int ah(Item i, int d) {
        if (i instanceof ItemSword) {
            if (((ItemSword)i).getToolMaterialName().equals(SWORDSHORT.name())) {
                return 10;
            }
            if (((ItemSword)i).getToolMaterialName().equals(SPEAR.name())) {
                return 11;
            }
            return d;
        }
        return d;
    }

    public static void openGui(int id, EntityPlayer pl) {
        pl.openGui((Object)Main.instance, id, pl.worldObj, (int)pl.posX, (int)pl.posY, (int)pl.posZ);
    }

    public static void initGui() {
    }

    public static void actionPerformed(GuiButton button) {
    }

    public static void drawScreen(int x, int y, float f) {
    }

    public static void initSkls() {
    }

    public static int SAO_() {
        return 0;
    }

    public static int SAO_getDropLevelBasedOnCoord(Entity e) {
        double x = e.posX;
        double z = e.posZ;
        return (int)MathHelper.sqrt_double((double)(x * x + z * z));
    }

    public static int SAO_getLvlBasedOnDrop(Entity e) {
        int i = 1 + JRMCoreHSAC.SAO_getDropLevelBasedOnCoord(e) / 200;
        return i > 300 ? 300 : i;
    }

    public static String[] SAO_getRandomBonus(int requ) {
        String[] s = new String[]{"0", "0", ""};
        int ri = 1 + new Random().nextInt(3);
        ri = ri > 2 ? 2 : ri;
        int rmv = new Random().nextInt(requ * 2);
        for (int i = 0; i < ri; ++i) {
            int grmv = new Random().nextInt(rmv + 1);
            rmv -= grmv;
            s[i] = "" + grmv;
        }
        return s;
    }

    public static void addSAOWeaponStats(ItemStack p_92115_1_, Object ... args) {
        NBTTagList nbttaglist = JRMCoreHSAC.SAO_WeaponStatsNBTTag(p_92115_1_);
        boolean flag = true;
        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
            if (nbttagcompound.getString("category").length() <= 3) continue;
            return;
        }
        if (flag) {
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            nbttagcompound1.setString("name", "" + args[0]);
            nbttagcompound1.setString("category", "" + JRMCoreHSAC.weaponCategory(p_92115_1_.getUnlocalizedName()));
            nbttagcompound1.setInteger(lvlItem, Integer.parseInt("" + args[1]));
            nbttagcompound1.setInteger(lvlUpgrade, Integer.parseInt("" + args[2]));
            nbttagcompound1.setInteger(attackMin, Integer.parseInt("" + args[3]));
            nbttagcompound1.setInteger(attackMax, Integer.parseInt("" + args[4]));
            nbttagcompound1.setInteger(requires, Integer.parseInt("" + args[5]));
            nbttagcompound1.setString("bonuses", "" + args[6]);
            nbttaglist.appendTag((NBTBase)nbttagcompound1);
        }
        if (!p_92115_1_.hasTagCompound()) {
            p_92115_1_.setTagCompound(new NBTTagCompound());
        }
        p_92115_1_.getTagCompound().setTag("SAOWeaponStats", (NBTBase)nbttaglist);
    }

    public static NBTTagList SAO_WeaponStatsNBTTag(ItemStack p_92110_1_) {
        return p_92110_1_.stackTagCompound != null && p_92110_1_.stackTagCompound.hasKey("SAOWeaponStats") ? (NBTTagList)p_92110_1_.stackTagCompound.getTag("SAOWeaponStats") : new NBTTagList();
    }

    public static void onItemTooltipEvent(ItemTooltipEvent event) {
        NBTTagList nbttaglist;
        if (event.itemStack.getItem() instanceof ItemSword && (nbttaglist = JRMCoreHSAC.SAO_WeaponStatsNBTTag(event.itemStack)) != null) {
            for (int i = 0; i < nbttaglist.tagCount(); ++i) {
                String name = nbttaglist.getCompoundTagAt(i).getString("name");
                String category = nbttaglist.getCompoundTagAt(i).getString("category");
                int lvlItem = nbttaglist.getCompoundTagAt(i).getInteger(lvlItem);
                int lvlUpgrade = nbttaglist.getCompoundTagAt(i).getInteger(lvlUpgrade);
                int attackMin = nbttaglist.getCompoundTagAt(i).getInteger(attackMin);
                int attackMax = nbttaglist.getCompoundTagAt(i).getInteger(attackMax);
                int requires = nbttaglist.getCompoundTagAt(i).getInteger(requires);
                String[] bonuses = nbttaglist.getCompoundTagAt(i).getString("bonuses").split(";");
                name = "";
                event.toolTip.add(name + (lvlUpgrade > 0 ? " +" + lvlUpgrade : ""));
                event.toolTip.add(JRMCoreHSAC.weaponCatName(category));
                event.toolTip.add("Attack: " + attackMin + "-" + attackMax);
                event.toolTip.add("Type: " + JRMCoreHSAC.weaponTypes(category));
                event.toolTip.add("Durability: " + (event.itemStack.getMaxDamage() - event.itemStack.getItemDamageForDisplay()));
                event.toolTip.add("Requires: " + requires);
                String[] bonusNams = new String[]{"Strength", "Agility"};
                for (int j = 0; j < bonusNams.length; ++j) {
                    if (Integer.parseInt(bonuses[j]) <= 0) continue;
                    event.toolTip.add(bonusNams[j] + ": " + bonuses[j]);
                }
            }
        }
    }

    public static float getDamage(int dmg, int str, int dex) {
        return JRMCoreH.round((float)(dmg + str) + 0.3f * (float)dex, 0, 0);
    }

    public static int getWeaponDamage(ItemStack p_77624_1_, int STR) {
        int i;
        NBTTagList nbttaglist;
        if (p_77624_1_ != null && (nbttaglist = JRMCoreHSAC.SAO_WeaponStatsNBTTag(p_77624_1_)) != null && (i = 0) < nbttaglist.tagCount()) {
            int max = nbttaglist.getCompoundTagAt(i).getInteger(attackMax);
            int min = nbttaglist.getCompoundTagAt(i).getInteger(attackMin);
            int requ = nbttaglist.getCompoundTagAt(i).getInteger(requires);
            boolean b = requ <= STR;
            Random r = new Random();
            int dmg = min + (max - min <= 1 ? 1 : r.nextInt(max - min));
            return b ? dmg : 1;
        }
        return 1;
    }

    public static int getWeaponBonus(ItemStack p_77624_1_, int bonus) {
        int i;
        NBTTagList nbttaglist;
        if (p_77624_1_ != null && (nbttaglist = JRMCoreHSAC.SAO_WeaponStatsNBTTag(p_77624_1_)) != null && (i = 0) < nbttaglist.tagCount()) {
            String[] bonuses = nbttaglist.getCompoundTagAt(i).getString("bonuses").split(";");
            return Integer.parseInt(bonuses[bonus]);
        }
        return 0;
    }

    public static int getWeaponStatName(ItemStack p_77624_1_, String statname) {
        int i;
        NBTTagList nbttaglist;
        if (p_77624_1_ != null && (nbttaglist = JRMCoreHSAC.SAO_WeaponStatsNBTTag(p_77624_1_)) != null && (i = 0) < nbttaglist.tagCount()) {
            return nbttaglist.getCompoundTagAt(i).getInteger(statname);
        }
        return 0;
    }

    public static int getWeaponEquip(ItemStack p_77624_1_) {
        int i;
        NBTTagList nbttaglist;
        if (p_77624_1_ != null && (nbttaglist = JRMCoreHSAC.SAO_WeaponStatsNBTTag(p_77624_1_)) != null && (i = 0) < nbttaglist.tagCount()) {
            int attackMax = nbttaglist.getCompoundTagAt(i).getInteger(attackMax);
            return JRMCoreHSAC.getWeaponEquip(p_77624_1_, attackMax);
        }
        return 0;
    }

    public static String weaponTypes(String category) {
        String cat = JRMCoreH.SAO_SkillMap_WeaponTypes[0];
        for (int i = 0; i < JRMCoreH.SAO_SkillMap_Weapons.length; ++i) {
            if (!JRMCoreH.SAO_SkillMap_Weapons[i].equalsIgnoreCase(category)) continue;
            cat = JRMCoreH.SAO_SkillMap_WeaponTypes[i];
        }
        return cat;
    }

    public static String weaponCategory(String unLocName) {
        int i;
        String cat = JRMCoreH.SAO_SkillMap_Weapons[0];
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_Sword.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_Sword[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[0];
            return cat;
        }
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_Curved.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_Curved[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[1];
            return cat;
        }
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_Dagger.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_Dagger[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[2];
            return cat;
        }
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_Rapier.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_Rapier[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[3];
            return cat;
        }
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_Axe.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_Axe[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[4];
            return cat;
        }
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_Spear.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_Spear[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[7];
            return cat;
        }
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_BattleAxe.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_BattleAxe[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[8];
            return cat;
        }
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_WarHammer.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_WarHammer[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[9];
            return cat;
        }
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_Sword2.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_Sword2[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[6];
            return cat;
        }
        for (i = 0; i < JRMCoreH.SAO_Weapon_Cat_Katana.length; ++i) {
            if (!unLocName.contains(JRMCoreH.SAO_Weapon_Cat_Katana[i])) continue;
            cat = JRMCoreH.SAO_SkillMap_Weapons[10];
            return cat;
        }
        return cat;
    }

    public static String weaponCatName(String category) {
        return JRMCoreH.trl("saoc", "category." + category);
    }

    public static int getWeaponEquip(ItemStack is, int atkmax) {
        return (is.getMaxDamage() + atkmax) / 100;
    }

    public String getWeaponName(String name) {
        return JRMCoreH.trl("saoc", "weapon." + name);
    }

    public static void onEntityDrop(LivingDropsEvent event) {
        int rand;
        if (event.source.getDamageType().equals("player") && event.entity instanceof EntityMob && (rand = (int)(Math.random() * 100.0)) < 95) {
            Item item;
            int r = (int)(Math.random() * 100.0);
            Item wep = ModItems.ItemsOW[new Random().nextInt(ModItems.ItemsOW.length)];
            ItemStack stack = new ItemStack(wep, 1, 1);
            if (stack != null && (item = stack.getItem()) != null && item instanceof ItemSword) {
                int attackMax;
                String category = JRMCoreHSAC.weaponCategory(((ItemSword)wep).getToolMaterialName());
                int lvlItem = JRMCoreHSAC.SAO_getLvlBasedOnDrop((Entity)event.entityLiving);
                int attackMin = 1 + new Random().nextInt((int)((float)lvlItem * 8.0f));
                if (attackMin > (attackMax = 3 + new Random().nextInt((int)((float)lvlItem * 10.0f)))) {
                    attackMax = attackMin;
                    attackMin /= 2;
                }
                int requires = lvlItem;
                String[] b = JRMCoreHSAC.SAO_getRandomBonus(requires);
                String bonuses = "";
                for (int i = 0; i < b.length; ++i) {
                    bonuses = bonuses + b[i] + ";";
                }
                JRMCoreHSAC.addSAOWeaponStats(stack, "RandomName", "" + lvlItem, "0", "" + attackMin, "" + attackMax, "" + requires, bonuses);
                event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack));
            }
        }
    }

    public static void onItemEvent(ItemEvent event) {
        Item item;
        ItemStack stack;
        Entity p = event.entity;
        if (p != null && (stack = event.entityItem.getEntityItem()) != null && (item = stack.getItem()) != null && item instanceof ItemSword) {
            int attackMax;
            String category = JRMCoreHSAC.weaponCategory(stack.getUnlocalizedName());
            int lvlItem = JRMCoreHSAC.SAO_getLvlBasedOnDrop(p);
            int attackMin = 1 + new Random().nextInt((int)((float)lvlItem * 8.0f));
            if (attackMin > (attackMax = 3 + new Random().nextInt((int)((float)lvlItem * 10.0f)))) {
                attackMax = attackMin;
                attackMin /= 2;
            }
            int requires = lvlItem;
            String[] b = JRMCoreHSAC.SAO_getRandomBonus(requires);
            String bonuses = "";
            for (int i = 0; i < b.length; ++i) {
                bonuses = bonuses + b[i] + ";";
            }
            JRMCoreHSAC.addSAOWeaponStats(stack, "RandomName", "" + lvlItem, "0", "" + attackMin, "" + attackMax, "" + requires, bonuses);
        }
    }

    public static class skill {
    }
}

