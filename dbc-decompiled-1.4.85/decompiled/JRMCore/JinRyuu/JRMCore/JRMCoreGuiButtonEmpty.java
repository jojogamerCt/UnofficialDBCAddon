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

import JinRyuu.JRMCore.JRMCoreH;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class JRMCoreGuiButtonEmpty
extends GuiButton {
    private boolean categoryIcon;
    private int col;
    private int icon;
    private int mode;
    private int state;
    private float alpha;

    public JRMCoreGuiButtonEmpty(boolean categoryIcon, int mode, int icon, int state, int x, int y, int par3, int par4, int par5, String text, int col) {
        super(x, y, par3, par4, par5, text);
        this.categoryIcon = categoryIcon;
        this.col = col;
        this.icon = icon;
        this.mode = mode;
        this.state = state;
        this.alpha = 1.0f;
    }

    public JRMCoreGuiButtonEmpty(int x, int y, int par3, int par4, int par5, String text) {
        this(false, 0, 0, 0, x, y, par3, par4, par5, text, 0);
    }

    public void drawButton(Minecraft minecraft, int par2, int par3) {
        if (this.visible) {
            FontRenderer var4 = minecraft.fontRenderer;
            boolean select = this.icon == 0;
            this.field_146123_n = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int hoverState = this.getHoverState(this.field_146123_n);
            int idY = 0;
            int idX = 0;
            ResourceLocation txx = new ResourceLocation(JRMCoreH.tjjrmc + ":" + (select ? "note_select.png" : "note_category_icons.png"));
            minecraft.getTextureManager().bindTexture(txx);
            this.alpha = !select && this.mode == 0 && hoverState != 2 ? 0.6f : 1.0f;
            GL11.glColor4f((float)(1.0f * this.alpha), (float)(1.0f * this.alpha), (float)(1.0f * this.alpha), (float)1.0f);
            if (this.icon != 0) {
                int TEXTURE_SIZE = 16;
                idY = (this.icon - 1) * 16 / 256;
                idX = (this.icon - 1) * 16 - idY * 256;
                idY *= 16;
            }
            if (select) {
                hoverState = this.getHoverState(this.field_146123_n);
                this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, 0 + hoverState * this.height, this.width, this.height);
            } else {
                this.drawTexturedModalRect(this.xPosition - 2, this.yPosition - 2, 20, 196 + hoverState * (this.height + 4), this.width + 4, this.height + 4);
                if (this.categoryIcon) {
                    this.setColor(hoverState);
                }
                this.drawTexturedModalRect(this.xPosition, this.yPosition, idX, idY, this.width, this.height);
                if (this.categoryIcon) {
                    GL11.glColor4f((float)(1.0f * this.alpha), (float)(1.0f * this.alpha), (float)(1.0f * this.alpha), (float)1.0f);
                } else {
                    this.setColor(hoverState);
                }
                if (this.state > 0) {
                    this.drawTexturedModalRect(this.xPosition, this.yPosition, 0 + (this.state - 1) * 16, idY + 16, this.width, this.height);
                }
                if (this.mode != 0) {
                    this.drawTexturedModalRect(this.xPosition - 2, this.yPosition - 2, 0, 196 + 2 * (this.height + 4), this.width + 4, this.height + 4);
                }
            }
            this.mouseDragged(minecraft, par2, par3);
            int var6 = 0xE0E0E0;
            if (!this.enabled) {
                var6 = -6250336;
            } else if (this.field_146123_n) {
                var6 = 0xFFFFA0;
            }
            if (this.displayString.length() > 0) {
                this.drawCenteredString(var4, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, var6);
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    private void setColor(int hoverState) {
        if (this.col != 0) {
            float h2 = (float)(this.col >> 16 & 0xFF) / 255.0f;
            float h3 = (float)(this.col >> 8 & 0xFF) / 255.0f;
            float h4 = (float)(this.col & 0xFF) / 255.0f;
            float h1 = 1.0f * this.alpha;
            if (hoverState == 2) {
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
    }
}

