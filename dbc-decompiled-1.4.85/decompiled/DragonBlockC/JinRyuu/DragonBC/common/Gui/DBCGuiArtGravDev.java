/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.p.DBC.DBCPwish
 *  JinRyuu.JRMCore.p.PD
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.Gui.DBCGuiButtons01;
import JinRyuu.DragonBC.common.Render.ArtGravDevContainer;
import JinRyuu.DragonBC.common.Render.ArtGravDevTileEntity;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.p.DBC.DBCPwish;
import JinRyuu.JRMCore.p.PD;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DBCGuiArtGravDev
extends GuiContainer {
    private static final ResourceLocation furnaceGuiTextures = new ResourceLocation(JRMCoreH.tjdbcAssts, "gui/ArtGravDev.png");
    private ArtGravDevTileEntity tileFurnace;
    private String name = "";
    private int text = 0;
    protected GuiTextField inputField;
    private String defaultInputFieldText = "";
    private boolean updateTimerStopper = false;

    public DBCGuiArtGravDev(InventoryPlayer p_i1091_1_, ArtGravDevTileEntity p_i1091_2_) {
        super((Container)new ArtGravDevContainer(p_i1091_1_, p_i1091_2_));
        this.tileFurnace = p_i1091_2_;
    }

    public void actionPerformed(GuiButton button) {
        if ((this.name.matches("[0-9].+") || this.name.matches("[0-9]+")) && this.name.length() > 0) {
            boolean success = true;
            try {
                this.name = (Float.parseFloat(this.name) > 1000.0f ? 1000.0f : (Float.parseFloat(this.name) < 1.0f ? 1.0f : Float.parseFloat(this.name))) + "";
            }
            catch (Exception e) {
                success = false;
            }
            if (!success) {
                this.name = "1";
            }
            if (button.id == 210) {
                PD.sendToServer((IMessage)new DBCPwish(4, this.tileFurnace.xCoord + ";" + this.tileFurnace.yCoord + ";" + this.tileFurnace.zCoord + ";" + this.name));
                this.mc.thePlayer.closeScreen();
            }
        }
    }

    private void name(FontRenderer var8, int i, int j) {
        this.inputField = new GuiTextField(var8, i + 100, j + 15 + 0, 40, 12);
        this.inputField.setMaxStringLength(5);
        this.inputField.setEnableBackgroundDrawing(true);
        this.inputField.setFocused(true);
        this.inputField.setText(this.defaultInputFieldText);
        this.inputField.setCanLoseFocus(true);
    }

    public void updateScreen() {
        if (this.inputField != null) {
            this.inputField.updateCursorCounter();
        }
    }

    protected void keyTyped(char c, int i) {
        super.keyTyped(c, i);
        if (this.inputField != null) {
            this.inputField.textboxKeyTyped(c, i);
        }
    }

    protected void mouseClicked(int i, int j, int k) {
        super.mouseClicked(i, j, k);
        if (this.inputField != null) {
            this.inputField.mouseClicked(i, j, k);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        block3: {
            block2: {
                s = this.tileFurnace.hasCustomInventoryName() != false ? this.tileFurnace.getInventoryName() : I18n.format((String)this.tileFurnace.getInventoryName(), (Object[])new Object[0]);
                this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 0x404040);
                this.fontRendererObj.drawString(I18n.format((String)"container.inventory", (Object[])new Object[0]), 8, this.ySize - 96 + 2, 0x404040);
                posX = this.width / 2;
                posY = this.height / 2;
                guiLeft = (this.width - this.xSize) / 2;
                guiTop = (this.height - this.ySize) / 2;
                line = 1;
                ++line;
                v0 = new StringBuilder().append(JRMCoreH.trl((String)"dbc", (String)"Gravity")).append(": ");
                if (!this.tileFurnace.isBurning() || !(this.tileFurnace.getGravity() > 1.0f)) break block2;
                v1 = Float.valueOf(this.tileFurnace.getGravity());
                break block3;
            }
            v2 = new StringBuilder().append("1");
            if (this.tileFurnace.isBurning()) ** GOTO lbl-1000
            if (this.tileFurnace.getStackInSlot(0) != null) lbl-1000:
            // 2 sources

            {
                v3 = "";
            } else {
                v3 = " (" + JRMCoreH.trl((String)"dbc", (String)"OutOfFuel") + ")";
            }
            v1 = v2.append(v3).toString();
        }
        n = v0.append(v1).toString();
        nw = this.fontRendererObj.getStringWidth(n) + 8;
        this.fontRendererObj.drawString(n, 25, 10 + line * 11, 0);
        ++line;
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.mc.getTextureManager().bindTexture(furnaceGuiTextures);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int guiLeft = (this.width - this.xSize) / 2;
        int guiTop = (this.height - this.ySize) / 2;
        if (this.tileFurnace.isBurning()) {
            int i1 = this.tileFurnace.getBurnTimeRemainingScaled(13);
            this.drawTexturedModalRect(k + 5, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
        }
        int line = 1;
        String n = JRMCoreH.trl((String)"dbc", (String)"SetGravity") + ":";
        int nw = this.fontRendererObj.getStringWidth(n) + 8;
        ++this.text;
        if (this.text == 1) {
            this.name(this.fontRendererObj, guiLeft + 25 - 100 + nw, guiTop + 10 - 18 + line * 11);
            this.inputField.setText("1");
        } else {
            this.text = 2;
        }
        if (this.inputField != null) {
            this.inputField.drawTextBox();
            this.name = this.inputField.getText();
            this.fontRendererObj.drawString(n, guiLeft + 25, guiTop + 10 + line * 11, 0);
        }
        ++line;
    }

    public void drawScreen(int x, int y, float f) {
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.mc.fontRenderer;
        this.buttonList.clear();
        int posX = this.width / 2;
        int posY = this.height / 2;
        int line = 1;
        String n = JRMCoreH.trl((String)"jrmc", (String)"Update");
        int nw = this.fontRendererObj.getStringWidth(n) + 8;
        this.buttonList.add(new DBCGuiButtons01(210, this.guiLeft + 165 - nw, this.guiTop + 35 + line * 11, nw, 20, n));
        ++line;
        super.drawScreen(x, y, f);
    }
}

