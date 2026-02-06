/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import org.lwjgl.opengl.GL11;

public class JRMCoreGuiButtons01
extends GuiButton {
    public int col;
    private boolean shadow = true;

    public Object setShadow(boolean b) {
        this.shadow = b;
        return this;
    }

    public JRMCoreGuiButtons01(int par1, int par2, int par3, int par4, String par6Str, int c) {
        super(par1, par2, par3, par4, 10, par6Str);
        this.height = 10;
        this.col = c;
    }

    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            int width;
            FontRenderer var4 = par1Minecraft.fontRenderer;
            this.width = width = var4.getStringWidth(this.displayString);
            this.field_146123_n = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int var5 = this.getHoverState(this.field_146123_n);
            int j = this.col == 0 ? 0xE0E0E0 : this.col;
            float h2 = (float)(j >> 16 & 0xFF) / 255.0f;
            float h3 = (float)(j >> 8 & 0xFF) / 255.0f;
            float h4 = (float)(j & 0xFF) / 255.0f;
            float h1 = 1.0f;
            if (var5 == 2) {
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
            this.mouseDragged(par1Minecraft, par2, par3);
            int var6 = j;
            if (!this.enabled) {
                var6 = -6250336;
            } else if (this.field_146123_n) {
                var6 = 0xFFFFA0;
            }
            if (this.shadow) {
                this.drawString(var4, this.displayString, this.xPosition, this.yPosition, var6);
            } else {
                var4.drawString(this.displayString, this.xPosition, this.yPosition, var6, false);
            }
        }
    }
}

