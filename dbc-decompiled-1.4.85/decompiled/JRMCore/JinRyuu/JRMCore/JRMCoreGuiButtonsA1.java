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

public class JRMCoreGuiButtonsA1
extends GuiButton {
    private String string;
    public static boolean clicked;
    private boolean mainTexture;

    public JRMCoreGuiButtonsA1(int par1, int par2, int par3, String par6Str, boolean mainTexture) {
        super(par1, par2, par3, 15, 15, "");
        this.string = par6Str;
        clicked = false;
        this.mainTexture = mainTexture;
    }

    public JRMCoreGuiButtonsA1(int par1, int par2, int par3, String par6Str) {
        this(par1, par2, par3, par6Str, true);
    }

    public boolean mousePressed(Minecraft p_146116_1_, int p_146116_2_, int p_146116_3_) {
        clicked = true;
        return super.mousePressed(p_146116_1_, p_146116_2_, p_146116_3_);
    }

    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            FontRenderer var4 = par1Minecraft.fontRenderer;
            ResourceLocation txx = new ResourceLocation(this.mainTexture ? JRMCoreGuiScreen.button1 : JRMCoreGuiScreen.button2);
            par1Minecraft.getTextureManager().bindTexture(txx);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.field_146123_n = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int var5 = this.getHoverState(this.field_146123_n);
            int huv = 0;
            int vuv = 0 + var5 * 15;
            if (this.string.equals("<")) {
                huv = 0;
            } else if (this.string.equals(">")) {
                huv = 15;
            } else if (this.string.equals("x")) {
                huv = 120;
            } else if (this.string.equals("o")) {
                huv = 135;
            } else if (this.string.equals("v")) {
                huv = 135;
                vuv = 91 + var5 * 15;
            } else if (this.string.equals("i")) {
                huv = 120;
                vuv = 91 + var5 * 15;
            }
            this.drawTexturedModalRect(this.xPosition, this.yPosition, huv, vuv, this.width, this.height);
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

