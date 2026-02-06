/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.StatCollector
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Items;

import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ItemDinoMeat
extends ItemFood {
    private float l = 1.0f;

    public ItemDinoMeat(int par2, float f, float l) {
        super(par2, f, true);
        this.setMaxStackSize(16);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
        this.setAlwaysEdible();
        this.l = l;
    }

    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        String[] names = new String[]{"item.ItemDinoMeat", "item.ItemDinoMeatCooked", "item.ItemDinoMeatBig", "item.ItemDinoMeatCookedBig"};
        int[] values1 = new int[]{10, 20, 15, 30};
        int[] values2 = new int[]{500, 1000, 750, 1500};
        for (int i = 0; i < names.length; ++i) {
            if (!stack.getItem().getUnlocalizedName().equals(names[i])) continue;
            String text = StatCollector.translateToLocal((String)"dbc.ItemDinoMeat.line1");
            if (text.contains("%1$s")) {
                text = JRMCoreH.trl((String)"dbc.ItemDinoMeat.line1", (Object[])new Object[]{JRMCoreH.format_lz2((Object[])new Object[]{values2[i]})});
            } else if (i > 0) {
                text = text.replace("10", "" + values1[i]).replace("500", "" + values2[i]);
            }
            list.add(text);
            return;
        }
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
        par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.bone));
        return par1ItemStack;
    }

    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
        if (!par2World.isRemote) {
            int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts((EntityPlayer)player);
            byte pwr = JRMCoreH.getByte((EntityPlayer)player, (String)"jrmcPwrtyp");
            byte rce = JRMCoreH.getByte((EntityPlayer)player, (String)"jrmcRace");
            byte cls = JRMCoreH.getByte((EntityPlayer)player, (String)"jrmcClass");
            int maxBody = JRMCoreH.stat((Entity)player, (int)2, (int)pwr, (int)2, (int)PlyrAttrbts[2], (int)rce, (int)cls, (float)0.0f);
            int curBody = JRMCoreH.getInt((EntityPlayer)player, (String)"jrmcBdy");
            int maxEnergy = JRMCoreH.stat((Entity)player, (int)5, (int)pwr, (int)5, (int)PlyrAttrbts[5], (int)rce, (int)cls, (float)JRMCoreH.SklLvl_KiBs((EntityPlayer)player, (int)pwr));
            int curEnergy = JRMCoreH.getInt((EntityPlayer)player, (String)"jrmcEnrgy");
            int maxStam = JRMCoreH.stat((Entity)player, (int)2, (int)pwr, (int)3, (int)PlyrAttrbts[2], (int)rce, (int)cls, (float)0.0f);
            int curStam = JRMCoreH.getInt((EntityPlayer)player, (String)"jrmcStamina");
            int body = (int)((float)curBody + ((float)maxBody * 0.3f > 500.0f ? 500.0f : (float)maxBody * 0.3f) * this.l);
            JRMCoreH.setInt((int)(body > maxBody ? maxBody : body), (EntityPlayer)player, (String)"jrmcBdy");
            int en = (int)((float)curEnergy + ((float)maxEnergy * 0.2f > 500.0f ? 500.0f : (float)maxEnergy * 0.2f) * this.l);
            JRMCoreH.setInt((int)(en > maxEnergy ? maxEnergy : en), (EntityPlayer)player, (String)"jrmcEnrgy");
            int st = (int)((float)curStam + ((float)maxStam * 0.2f > 500.0f ? 500.0f : (float)maxStam * 0.2f) * this.l);
            JRMCoreH.setInt((int)(st > maxStam ? maxStam : st), (EntityPlayer)player, (String)"jrmcStamina");
        }
    }
}

