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

public class JRMCoreGuiButtonC
extends GuiButton {
    private int bgCol;
    private int defCol = 0;

    public int getBgCol() {
        return this.bgCol;
    }

    public JRMCoreGuiButtonC(int par1, int par2, int par3, int par4, int par5, String par6Str) {
        super(par1, par2, par3, par4, par5, par6Str);
    }

    public JRMCoreGuiButtonC(int par1, int par2, int par3, int par4, int par5, String par6Str, int par7) {
        super(par1, par2, par3, par4, par5, par6Str);
        this.bgCol = par7;
    }

    public JRMCoreGuiButtonC(int par1, int par2, int par3, int par4, int par5, String par6Str, int par7, int par8) {
        this(par1, par2, par3, par4, par5, par6Str, par7);
        this.defCol = par8;
    }

    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            FontRenderer var4 = par1Minecraft.fontRenderer;
            ResourceLocation txx = new ResourceLocation(JRMCoreGuiScreen.button1);
            par1Minecraft.getTextureManager().bindTexture(txx);
            int col = this.defCol == 0 ? this.bgCol : this.defCol;
            float h2 = (float)(col >> 16 & 0xFF) / 255.0f;
            float h3 = (float)(col >> 8 & 0xFF) / 255.0f;
            float h4 = (float)(col & 0xFF) / 255.0f;
            float h1 = 1.0f;
            GL11.glColor3f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4));
            this.field_146123_n = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int var5 = this.getHoverState(this.field_146123_n);
            this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, 0 + var5 * 1, this.width, this.height);
            this.mouseDragged(par1Minecraft, par2, par3);
            int var6 = 0xE0E0E0;
            if (!this.enabled) {
                var6 = -6250336;
            } else if (this.field_146123_n) {
                var6 = 0xFFFFA0;
            }
            this.drawCenteredString(var4, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, var6);
        }
    }
}

