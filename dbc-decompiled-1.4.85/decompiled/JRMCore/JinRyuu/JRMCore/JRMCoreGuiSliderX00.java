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

public class JRMCoreGuiSliderX00
extends GuiButton {
    public static float sliderValue = 1.0f;
    public float sliderMaxValue = 1.0f;
    public boolean dragging = false;
    public String label = "";
    private boolean mc0;
    private boolean mainTexture;

    public JRMCoreGuiSliderX00(int id, int x, int y, boolean mc0, float startingValue, float maxValue, boolean mainTexture) {
        super(id, x, y, 15, 115, "");
        sliderValue = startingValue;
        this.sliderMaxValue = maxValue;
        this.mc0 = mc0;
        this.mainTexture = mainTexture;
    }

    public JRMCoreGuiSliderX00(int id, int x, int y, boolean mc0, float startingValue, float maxValue) {
        this(id, x, y, mc0, startingValue, maxValue, true);
    }

    public int getHoverState(boolean par1) {
        return 0;
    }

    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            FontRenderer fontrenderer = par1Minecraft.fontRenderer;
            ResourceLocation txx = new ResourceLocation(this.mainTexture ? JRMCoreGuiScreen.button1 : JRMCoreGuiScreen.button2);
            par1Minecraft.getTextureManager().bindTexture(txx);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.field_146123_n = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int k = this.getHoverState(this.field_146123_n);
            this.drawTexturedModalRect(this.xPosition, this.yPosition, 216 - k * 20, 128, this.width, this.height);
            this.mouseDragged(par1Minecraft, par2, par3);
            int l = 0xE0E0E0;
            if (!this.enabled) {
                l = -6250336;
            } else if (this.field_146123_n) {
                l = 0xFFFFA0;
            }
            this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, l);
            if (this.mc0 && super.mousePressed(par1Minecraft, par2, par3)) {
                sliderValue = (float)(par3 - (this.yPosition + 4)) / (float)(this.height - 8);
                if (sliderValue < 0.0f) {
                    sliderValue = 0.0f;
                }
                if (sliderValue > 1.0f) {
                    sliderValue = 1.0f;
                }
            }
        }
    }

    protected void mouseDragged(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            if (this.dragging) {
                sliderValue = (float)(par3 - (this.yPosition + 4)) / (float)(this.height - 8);
                if (sliderValue < 0.0f) {
                    sliderValue = 0.0f;
                }
                if (sliderValue > 1.0f) {
                    sliderValue = 1.0f;
                }
            }
            ResourceLocation txx = new ResourceLocation(this.mainTexture ? JRMCoreGuiScreen.button1 : JRMCoreGuiScreen.button2);
            par1Minecraft.getTextureManager().bindTexture(txx);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.drawTexturedModalRect(this.xPosition, this.yPosition + (int)(sliderValue * (float)(this.height - 4)), 241, 155, 15, 2);
            this.drawTexturedModalRect(this.xPosition, this.yPosition + (int)(sliderValue * (float)(this.height - 4)) + 2, 241, 157, 15, 2);
        }
    }

    public boolean mousePressed(Minecraft par1Minecraft, int par2, int par3) {
        return false;
    }

    public void mouseReleased(int par1, int par2) {
    }
}

