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
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class JRMCoreGuiSlider02
extends GuiButton {
    public float sliderValue = 1.0f;
    public float sliderMaxValue = 1.0f;
    public boolean dragging = false;
    public String label;
    private int col;

    public JRMCoreGuiSlider02(int id, int x, int y, int sizex, int sizey, String label, float startingValue, float maxValue, int c) {
        this(id, x, y, sizex, sizey, label, startingValue, maxValue);
        this.col = c;
    }

    public JRMCoreGuiSlider02(int id, int x, int y, int sizex, int sizey, String label, float startingValue, float maxValue) {
        super(id, x, y, sizex, sizey, label);
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
            if (this.col != 0) {
                int j = this.col;
                float h2 = (float)(j >> 16 & 0xFF) / 255.0f;
                float h3 = (float)(j >> 8 & 0xFF) / 255.0f;
                float h4 = (float)(j & 0xFF) / 255.0f;
                float h1 = 1.0f;
                if (k == 2) {
                    int r = (int)(h2 * 254.0f);
                    int g = (int)(h3 * 254.0f);
                    int b = (int)(h4 * 254.0f);
                    float[] hsb = Color.RGBtoHSB(r, g, b, null);
                    float hue = hsb[0];
                    float saturation = 0.33f;
                    float brightness = hsb[2];
                    int rgb = Color.HSBtoRGB(hue, saturation, brightness);
                    h2 = (float)(rgb >> 16 & 0xFF) / 255.0f;
                    h3 = (float)(rgb >> 8 & 0xFF) / 255.0f;
                    h4 = (float)(rgb & 0xFF) / 255.0f;
                }
                GL11.glColor3f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4));
            }
            this.drawTexturedModalRect(this.xPosition, this.yPosition, 241, 159, this.width, this.height);
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
                this.sliderValue = (float)(par3 - this.yPosition) / (float)this.height;
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
            this.drawTexturedModalRect(this.xPosition, this.yPosition + (int)(this.sliderValue * (float)this.height), 241, 155, this.width / 2, 2);
            this.drawTexturedModalRect(this.xPosition + 2, this.yPosition + (int)(this.sliderValue * (float)this.height), 256 - (this.width - this.width / 2), 155, this.width - this.width / 2, 2);
        }
    }

    public boolean mousePressed(Minecraft par1Minecraft, int par2, int par3) {
        if (super.mousePressed(par1Minecraft, par2, par3)) {
            this.sliderValue = (float)(par3 - this.yPosition) / (float)this.height;
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

