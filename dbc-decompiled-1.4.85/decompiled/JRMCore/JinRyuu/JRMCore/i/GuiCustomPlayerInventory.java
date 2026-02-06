/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore.i;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreKeyHandler;
import JinRyuu.JRMCore.i.ContainerCustomPlayer;
import JinRyuu.JRMCore.i.InventoryCustomPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class GuiCustomPlayerInventory
extends GuiContainer {
    private float xSize_lo;
    private float ySize_lo;
    private static final ResourceLocation iconLocation = new ResourceLocation("jinryuumodscore:gui/ci.png");
    private final InventoryCustomPlayer inventory;

    public GuiCustomPlayerInventory(EntityPlayer player, InventoryPlayer inventoryPlayer, InventoryCustomPlayer inventoryCustom) {
        super((Container)new ContainerCustomPlayer(player, inventoryPlayer, inventoryCustom));
        this.inventory = inventoryCustom;
    }

    protected void keyTyped(char c, int keyCode) {
        super.keyTyped(c, keyCode);
        if (keyCode == JRMCoreKeyHandler.Sagasys.getKeyCode()) {
            this.mc.thePlayer.closeScreen();
        }
    }

    public void drawScreen(int mouseX, int mouseY, float f) {
        super.drawScreen(mouseX, mouseY, f);
        this.xSize_lo = mouseX;
        this.ySize_lo = mouseY;
    }

    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = this.inventory.hasCustomInventoryName() ? JRMCoreH.trl("jrmc", this.inventory.getInventoryName()) : I18n.format((String)this.inventory.getInventoryName(), (Object[])new Object[0]);
        this.fontRendererObj.drawString(s, 82, 12, 0x404040);
        this.fontRendererObj.drawString(JRMCoreH.trl("jrmc", "WeightSlot"), 100, 66, 0x404040);
        this.fontRendererObj.drawString(JRMCoreH.trl("jrmc", "BodySlot"), 100, 48, 0x404040);
        this.fontRendererObj.drawString(JRMCoreH.trl("jrmc", "HeadSlot"), 100, 30, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int mouseX, int mouseY) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.mc.getTextureManager().bindTexture(iconLocation);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        this.drawEntityOnScreen(this.guiLeft + 51, this.guiTop + 75, 30, (float)(this.guiLeft + 51) - this.xSize_lo, (float)(this.guiTop + 25) - this.ySize_lo, this.mc.thePlayer);
    }

    private void drawEntityOnScreen(int i, int j, int k, float f, float g, EntityClientPlayerMP thePlayer) {
        GuiInventory.func_147046_a((int)(this.guiLeft + 51), (int)(this.guiTop + 75), (int)30, (float)((float)(this.guiLeft + 51) - this.xSize_lo), (float)((float)(this.guiTop + 25) - this.ySize_lo), (EntityLivingBase)this.mc.thePlayer);
    }
}

