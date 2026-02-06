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

public class JRMCoreGuiButtonsA3
extends GuiButton {
    private String string;
    private int type;

    public JRMCoreGuiButtonsA3(int par1, int par2, int par3, int width, int type, boolean b) {
        this(par1, par2, par3, width, type);
        this.enabled = b;
    }

    public JRMCoreGuiButtonsA3(int par1, int par2, int par3, int width, int type) {
        super(par1, par2, par3, width, 10, "");
        this.width = width;
        this.string = "+";
        this.type = type;
    }

    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            FontRenderer var4 = par1Minecraft.fontRenderer;
            ResourceLocation txx = new ResourceLocation(JRMCoreGuiScreen.button1);
            par1Minecraft.getTextureManager().bindTexture(txx);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.field_146123_n = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int var5 = this.getHoverState(this.field_146123_n);
            this.drawTexturedModalRect(this.xPosition, this.yPosition, this.type == 3 ? 50 : (this.type == 2 ? 0 : 10 + (this.type == 0 ? 20 : 0)), 106 + (this.enabled ? var5 * 10 : 0), this.width, this.height);
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

