/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.particle.EntityAuraFX
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreGuiScreen;
import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class JRMCoreDamInd
extends EntityAuraFX {
    private static final ResourceLocation particleTextures = new ResourceLocation("textures/particle/particles.png");
    private double amount = 0.0;
    private double timeleft = 0.0;

    public JRMCoreDamInd(double amount, float timeleft, World parWorld, double parX, double parY, double parZ, double parMotionX, double parMotionY, double parMotionZ) {
        super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
        this.setParticleTextureIndex(82);
        this.particleScale = 1.0f;
        this.setRBGColorF(136.0f, 0.0f, 136.0f);
        this.amount = amount;
        this.timeleft = timeleft;
        this.particleMaxAge = 50;
    }

    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.99;
        this.motionY *= 0.99;
        this.motionZ *= 0.99;
        this.motionY += 0.00125;
        if (this.particleMaxAge-- <= 0) {
            this.setDead();
        }
    }

    public void renderParticle(Tessellator p_70539_1_, float p_70539_2_, float p_70539_3_, float p_70539_4_, float p_70539_5_, float p_70539_6_, float p_70539_7_) {
        float f11 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)p_70539_2_ - interpPosX);
        float f12 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)p_70539_2_ - interpPosY);
        float f13 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)p_70539_2_ - interpPosZ);
        p_70539_1_.setColorRGBA_F(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);
        FontRenderer fontrenderer = JRMCoreClient.mc.fontRenderer;
        GL11.glPushMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glTranslatef((float)(f11 + 0.0f), (float)(f12 - 0.75f + 1.75f), (float)f13);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        boolean ro = JRMCoreClient.mc.gameSettings.thirdPersonView == 2;
        GL11.glRotatef((float)(-RenderManager.instance.playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)RenderManager.instance.playerViewX, (float)(1.0f * (float)(ro ? -1 : 1)), (float)0.0f, (float)0.0f);
        float f1 = 0.0516f;
        GL11.glScalef((float)(-f1), (float)(-f1), (float)f1);
        GL11.glTranslatef((float)0.0f, (float)(0.25f / f1), (float)0.0f);
        String text = "" + JRMCoreH.numSep((int)this.amount);
        int textWidth = fontrenderer.getStringWidth(text);
        JRMCoreGuiScreen.drawStringWithBorder(fontrenderer, text, -textWidth / 2, -2, JRMCoreH.techCol[4]);
        JRMCoreClient.mc.renderEngine.bindTexture(particleTextures);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }
}

