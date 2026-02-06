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

public class JRMCoreGuiButtonsA2
extends GuiButton {
    private String string;

    public JRMCoreGuiButtonsA2(int par1, int par2, int par3, String par6Str) {
        super(par1, par2, par3, 10, 10, "");
        this.string = par6Str;
    }

    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            FontRenderer var4 = par1Minecraft.fontRenderer;
            ResourceLocation txx = new ResourceLocation(JRMCoreGuiScreen.button1);
            par1Minecraft.getTextureManager().bindTexture(txx);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.field_146123_n = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int var5 = this.getHoverState(this.field_146123_n);
            int s = 0;
            if (this.string.equals("<<")) {
                s = 70;
            } else if (this.string.equals(">>")) {
                s = 80;
            } else if (this.string.equals("|<")) {
                s = 90;
            } else if (this.string.equals(">|")) {
                s = 100;
            } else if (this.string.equals("<")) {
                s = 30;
            } else if (this.string.equals(">")) {
                s = 40;
            } else if (this.string.equals("^")) {
                s = 50;
            } else if (this.string.equals("v")) {
                s = 60;
            } else if (this.string.equals("x")) {
                s = 150;
            } else if (this.string.equals("o")) {
                s = 160;
            } else if (this.string.equals("(|)")) {
                s = 170;
            } else if (this.string.equals("(||)")) {
                s = 180;
            }
            this.drawTexturedModalRect(this.xPosition, this.yPosition, s, 5 + var5 * 10, this.width, this.height);
            this.mouseDragged(par1Minecraft, par2, par3);
            int var6 = 0xE0E0E0;
            if (!this.enabled) {
                var6 = -6250336;
            } else if (this.field_146123_n) {
                var6 = 0xFFFFA0;
            }
        }
    }
}

