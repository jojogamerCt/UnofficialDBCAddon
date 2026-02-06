/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreGuiScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class JRMCoreGuiSlider01
extends GuiButton {
    public float sliderValue = 0.5f;
    public float sliderMaxValue = 1.0f;
    public boolean dragging = false;
    public String label;

    public JRMCoreGuiSlider01(int id, int x, int y, int sizex, int sizey, String label, float startingValue, float maxValue) {
        super(id, x, y, sizex, sizey, label);
        this.width = sizex > 200 ? 200 : sizex;
        this.height = sizey > 15 ? 15 : sizey;
        this.label = label;
        this.sliderValue = startingValue;
        this.sliderMaxValue = maxValue;
    }

    public int getHoverState(boolean par1) {
        return 0;
    }

    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            FontRenderer fontrenderer = par1Minecraft.fontRenderer;
            ResourceLocation txx = new ResourceLocation(JRMCoreGuiScreen.button1);
            par1Minecraft.getTextureManager().bindTexture(txx);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.field_146123_n = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int k = this.getHoverState(this.field_146123_n);
            this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, 0, this.width, this.height);
            this.mouseDragged(par1Minecraft, par2, par3);
            int l = 0xE0E0E0;
            if (!this.enabled) {
                l = -6250336;
            } else if (this.field_146123_n) {
                l = 0xFFFFA0;
            }
            this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, l);
        }
    }

    protected void mouseDragged(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            if (this.dragging) {
                this.sliderValue = (float)(par2 - this.xPosition) / (float)this.width;
                if (this.sliderValue < 0.0f) {
                    this.sliderValue = 0.0f;
                }
                if (this.sliderValue > 1.0f) {
                    this.sliderValue = 1.0f;
                }
            }
            ResourceLocation txx = new ResourceLocation(JRMCoreGuiScreen.button1);
            par1Minecraft.getTextureManager().bindTexture(txx);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.drawTexturedModalRect(this.xPosition + (int)(this.sliderValue * (float)(this.width + 2)), this.yPosition, 200, 0, 2, this.height);
            this.drawTexturedModalRect(this.xPosition + (int)(this.sliderValue * (float)(this.width + 2)) + 2, this.yPosition, 202, 0, 2, this.height);
        }
    }

    public boolean mousePressed(Minecraft par1Minecraft, int par2, int par3) {
        if (super.mousePressed(par1Minecraft, par2, par3)) {
            this.sliderValue = (float)(par2 - this.xPosition) / (float)this.width;
            if (this.sliderValue < 0.0f) {
                this.sliderValue = 0.0f;
            }
            if (this.sliderValue > 1.0f) {
                this.sliderValue = 1.0f;
            }
            this.dragging = true;
            return true;
        }
        return false;
    }

    public void mouseReleased(int par1, int par2) {
        this.dragging = false;
    }
}

