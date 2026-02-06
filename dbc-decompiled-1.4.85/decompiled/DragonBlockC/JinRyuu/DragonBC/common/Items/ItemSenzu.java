/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreConfig
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.server.JGPlayerMP
 *  cpw.mods.fml.common.eventhandler.Event
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.StatCollector
 *  net.minecraft.world.World
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.entity.player.ArrowLooseEvent
 *  net.minecraftforge.event.entity.player.ArrowNockEvent
 */
package JinRyuu.DragonBC.common.Items;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.server.JGPlayerMP;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemSenzu
extends Item {
    private boolean alwaysEdible;

    public ItemSenzu(int par2, float par3, boolean par4) {
        this.setHasSubtypes(true);
        this.maxStackSize = 5;
        this.setMaxDamage(1);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(StatCollector.translateToLocal((String)"dbc.itemSenzu.line1"));
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer entityPlayer, int par4) {
        int j = this.getMaxItemUseDuration(itemStack) - par4;
        ArrowLooseEvent event = new ArrowLooseEvent(entityPlayer, itemStack, j);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (event.isCanceled()) {
            return;
        }
        j = event.charge;
        if (!world.isRemote) {
            EntityPlayer player = entityPlayer;
            int currentTime = (int)(System.currentTimeMillis() / 1000L);
            int senzuCool = JRMCoreH.getInt((EntityPlayer)player, (String)"jrmcSenzuCC");
            if (senzuCool > currentTime) {
                player.addChatMessage(new ChatComponentText("Senzu can be used again after " + (senzuCool - currentTime) + " seconds!").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.GOLD)));
                return;
            }
            JGPlayerMP jgPlayer = new JGPlayerMP(player);
            jgPlayer.connectBaseNBT();
            if (!JRMCoreConfig.CanUseSenzuWhileKOd && jgPlayer.getNBT().getInteger("jrmcHar4va") > 0) {
                return;
            }
            int[] playerAttributes = jgPlayer.getAttributes();
            byte powerType = jgPlayer.getPowerType();
            byte race = jgPlayer.getRace();
            byte classID = jgPlayer.getClassID();
            int maxBody = jgPlayer.getHealthMax(race, classID, powerType, playerAttributes);
            int maxEnergy = jgPlayer.getEnergyMax(race, classID, powerType, playerAttributes, JRMCoreH.SklLvl_KiBs((EntityPlayer)player, (int)powerType));
            int maxStam = jgPlayer.getStaminaMax(race, classID, powerType, playerAttributes);
            JRMCoreH.setInt((int)maxBody, (EntityPlayer)player, (String)"jrmcBdy");
            JRMCoreH.setInt((int)maxEnergy, (EntityPlayer)player, (String)"jrmcEnrgy");
            JRMCoreH.setInt((int)maxStam, (EntityPlayer)player, (String)"jrmcStamina");
            JRMCoreH.setInt((int)(currentTime + DBCConfig.senzuCool), (EntityPlayer)player, (String)"jrmcSenzuCC");
            entityPlayer.setHealth(entityPlayer.getMaxHealth());
            world.playSoundAtEntity((Entity)entityPlayer, "jinryuudragonbc:DBC2.sensu", 0.5f, world.rand.nextFloat() * 0.1f + 0.9f);
            entityPlayer.getFoodStats().addStats(20, 0.9f);
            if (!entityPlayer.capabilities.isCreativeMode) {
                entityPlayer.inventory.consumeInventoryItem((Item)this);
            }
        }
    }

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        return par1ItemStack;
    }

    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 72000;
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (event.isCanceled()) {
            return event.result;
        }
        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem((Item)this)) {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }
        return par1ItemStack;
    }

    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.block;
    }
}

