/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreCliTicH
 *  JinRyuu.JRMCore.JRMCoreH
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.EntityRenderer
 */
package JinRyuu.JBRA;

import JinRyuu.JRMCore.JRMCoreCliTicH;
import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;

public class JBRAEnRen
extends EntityRenderer {
    private final Minecraft mc;
    private static double lastpos;

    public JBRAEnRen(Minecraft mc) {
        super(mc, mc.getResourceManager());
        this.mc = mc;
    }

    public void renderWorld(float par1, long par2) {
        super.renderWorld(par1, par2);
    }

    public void updateCameraAndRender(float partialTick) {
        if (this.mc.thePlayer == null || this.mc.thePlayer.isPlayerSleeping()) {
            super.updateCameraAndRender(partialTick);
            return;
        }
        if (this.mc.thePlayer.isEntityInsideOpaqueBlock()) {
            this.mc.thePlayer.eyeHeight = this.mc.thePlayer.getDefaultEyeHeight() + JRMCoreCliTicH.clientHght * 0.9f - 1.7f;
        }
        this.mc.thePlayer.yOffset -= JRMCoreCliTicH.offsetY;
        super.updateCameraAndRender(partialTick);
        if (this.mc.thePlayer != null) {
            this.mc.thePlayer.eyeHeight = this.mc.thePlayer.getDefaultEyeHeight();
            this.mc.thePlayer.yOffset = 1.62f;
        }
    }

    public void enableLightmap(double par1) {
        this.mc.thePlayer.yOffset = 1.62f;
        if (JRMCoreH.NC() && this.mc.inGameHasFocus && JRMCoreH.State == 1 && JRMCoreH.Pwrtyp == 2 && JRMCoreH.Class == 1) {
            super.enableLightmap(par1);
            super.disableLightmap(par1);
        } else {
            super.enableLightmap(par1);
        }
    }

    public void disableLightmap(double par1) {
        super.disableLightmap(par1);
    }

    public void getMouseOver(float partialTick) {
        if (this.mc.thePlayer == null || this.mc.thePlayer.isPlayerSleeping()) {
            super.getMouseOver(partialTick);
            return;
        }
        this.mc.thePlayer.posY += (double)JRMCoreCliTicH.offsetY;
        this.mc.thePlayer.prevPosY += (double)JRMCoreCliTicH.offsetY;
        this.mc.thePlayer.lastTickPosY += (double)JRMCoreCliTicH.offsetY;
        super.getMouseOver(partialTick);
        this.mc.thePlayer.posY -= (double)JRMCoreCliTicH.offsetY;
        this.mc.thePlayer.prevPosY -= (double)JRMCoreCliTicH.offsetY;
        this.mc.thePlayer.lastTickPosY -= (double)JRMCoreCliTicH.offsetY;
    }
}

