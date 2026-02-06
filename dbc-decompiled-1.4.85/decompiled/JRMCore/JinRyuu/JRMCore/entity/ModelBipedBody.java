/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JBRA.ModelRendererJBRA
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JBRA.ModelRendererJBRA;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class ModelBipedBody
extends ModelBiped {
    public ModelRenderer bipedHead;
    public ModelRenderer bipedBody;
    public ModelRenderer bipedRightArm;
    public ModelRenderer bipedLeftArm;
    public ModelRenderer bipedRightLeg;
    public ModelRenderer bipedLeftLeg;
    public ModelRenderer body;
    public ModelRenderer rightarm;
    public ModelRenderer leftarm;
    public ModelRenderer Brightarm;
    public ModelRenderer Bleftarm;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer skirt1;
    public ModelRenderer skirt2;
    public ModelRenderer hip;
    public ModelRenderer waist;
    public ModelRenderer Bbreast;
    public ModelRenderer breast;
    public ModelRenderer bottom;
    public ModelRenderer hip2;
    public ModelRenderer breast2;
    public ModelRenderer bottom2;
    public ModelRenderer Bbreast2;
    public int heldItemLeft = 0;
    public int heldItemRight = 0;
    public boolean isSneak = false;
    public boolean aimedBow = false;
    public float rot1;
    public float rot4;
    public float rot3;
    public float rot2;
    public float rot5;
    public float rot6;
    public Entity Entity;
    public static float f = 1.0f;
    public static int g = 1;
    public static int y = 1;
    public static int animation = 0;
    public static int p = 0;
    public ModelRenderer RA;
    public ModelRenderer LA;
    public ModelRenderer RL;
    public ModelRenderer LL;
    public ModelRenderer B;
    public ModelRenderer B1;
    public ModelRenderer B2;
    public ModelRenderer B3;
    public ModelRenderer B4;
    public ModelRenderer B5;
    public ModelRenderer B7;
    public ModelRenderer B9;
    public int b;
    public boolean blk = false;
    public boolean instantTransmission = false;
    public int KiAttack = 0;
    public static final int y_isFlying = 2;
    public static final int y_notFlying = 1;
    public static final int y_isKO = 3;
    public static final int y_isDodging1 = 4;
    public static final int y_isDodging2 = 5;
    public static final int y_isAttacking1 = 6;
    public static final int y_isAttacking2 = 7;

    public ModelBipedBody() {
        this(0.0f);
    }

    public ModelBipedBody(float par1) {
        this(par1, 0.0f, 64, 32);
    }

    public ModelBipedBody(float par1, float par2, int par3, int par4) {
        this.textureWidth = par3;
        this.textureHeight = par4;
        this.bipedHead = new ModelRenderer((ModelBase)this, 0, 0);
        this.bipedHead.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, par1);
        this.bipedHead.setRotationPoint(0.0f, 0.0f + par2, 0.0f);
        this.bipedBody = new ModelRenderer((ModelBase)this, 16, 16);
        this.bipedBody.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, par1);
        this.bipedBody.setRotationPoint(0.0f, 0.0f + par2, 0.0f);
        this.bipedRightArm = new ModelRenderer((ModelBase)this, 40, 16);
        this.bipedRightArm.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, par1);
        this.bipedRightArm.setRotationPoint(-5.0f, 2.0f + par2, 0.0f);
        this.bipedLeftArm = new ModelRenderer((ModelBase)this, 40, 16);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, par1);
        this.bipedLeftArm.setRotationPoint(5.0f, 2.0f + par2, 0.0f);
        this.bipedRightLeg = new ModelRenderer((ModelBase)this, 0, 16);
        this.bipedRightLeg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1);
        this.bipedRightLeg.setRotationPoint(-1.9f, 12.0f + par2, 0.0f);
        this.bipedLeftLeg = new ModelRenderer((ModelBase)this, 0, 16);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1);
        this.bipedLeftLeg.setRotationPoint(1.9f, 12.0f + par2, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.rightarm.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, par1 * 0.5f);
        this.rightarm.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.rightarm, 0.0f, 0.0f, 0.122173f);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.leftarm.mirror = true;
        this.leftarm.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, par1 * 0.5f);
        this.leftarm.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.leftarm, 0.0f, 0.0f, -0.122173f);
        this.Brightarm = new ModelRenderer((ModelBase)this, 0, 0);
        this.Brightarm.addBox(-3.0f, -2.0f, -2.0f, 0, 0, 0, par1 * 0.5f);
        this.Brightarm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.Bleftarm = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bleftarm.mirror = true;
        this.Bleftarm.addBox(-1.0f, -2.0f, -2.0f, 0, 0, 0, par1 * 0.5f);
        this.Bleftarm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1 * 0.5f);
        this.rightleg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg.mirror = true;
        this.leftleg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1 * 0.5f);
        this.leftleg.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
        this.skirt1 = new ModelRenderer((ModelBase)this, 16, 18);
        this.skirt1.addBox(-4.0f, 9.0f, -2.0f, 8, 2, 4, par1 * 0.5f);
        this.skirt1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.skirt1, 0.0f, 0.0f, 0.0f);
        this.skirt2 = new ModelRenderer((ModelBase)this, 16, 20);
        this.skirt2.addBox(-4.0f, 11.0f, -2.0f, 8, 1, 4, par1 * 0.5f);
        this.skirt2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.skirt2, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 16, 16);
        this.body.addBox(-4.0f, 0.0f, -2.0f, 8, 4, 4, par1 * 0.5f);
        this.body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.hip2 = new ModelRenderer((ModelBase)this, 16, 16);
        this.hip2.addBox(-4.0f, 7.0f, -2.0f, 8, 2, 4);
        this.hip2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.hip2, 0.0f, 0.0f, 0.0f);
        this.hip = new ModelRenderer((ModelBase)this, 16, 23);
        this.hip.addBox(-4.0f, 7.0f, -2.0f, 8, 2, 4, par1 * 0.5f);
        this.hip.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.hip, 0.0f, 0.0f, 0.0f);
        this.waist = new ModelRenderer((ModelBase)this, 16, 20);
        this.waist.addBox(-4.0f, 4.0f, -2.0f, 8, 3, 4, par1 * 0.5f);
        this.waist.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.waist, 0.0f, 0.0f, 0.0f);
        this.Bbreast = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bbreast.addBox(-4.0f, 2.266667f, -1.0f, 0, 0, 0, par1 * 0.5f);
        this.Bbreast.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.breast = new ModelRenderer((ModelBase)this, 17, 18);
        this.breast.addBox(-4.0f, 2.266667f, -1.0f, 8, 3, 3, par1 * 0.5f);
        this.breast.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.breast, -0.5235988f, 0.0f, 0.0f);
        this.Bbreast2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bbreast2.addBox(-4.0f, 2.266667f, -1.0f, 0, 0, 0, par1 * 0.5f);
        this.Bbreast2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.breast2 = new ModelRenderer((ModelBase)this, 9, 23);
        this.breast2.mirror = true;
        this.breast2.addBox(-4.0f, 2.266667f, -2.0f, 8, 3, 3, par1 * 0.5f);
        this.breast2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.breast2, 0.5235988f, 3.141593f, 0.0f);
        this.bottom2 = new ModelRenderer((ModelBase)this, 16, 16);
        this.bottom2.addBox(-4.0f, 9.0f, -2.0f, 8, 3, 4, par1 * 0.5f);
        this.bottom2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.bottom2, 0.0f, 0.0f, 0.0f);
        this.bottom = new ModelRenderer((ModelBase)this, 16, 25);
        this.bottom.addBox(-4.0f, 9.0f, -2.0f, 8, 3, 4, par1 * 0.5f);
        this.bottom.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.bottom, 0.0f, 0.0f, 0.0f);
        this.Bbreast.addChild(this.breast);
        this.Bbreast2.addChild(this.breast2);
        this.Bleftarm.addChild(this.leftarm);
        this.Brightarm.addChild(this.rightarm);
    }

    public void rot(ModelRenderer var7, ModelRenderer var1) {
        var7.rotateAngleX = var1.rotateAngleX;
        var7.rotateAngleY = var1.rotateAngleY;
        var7.rotateAngleZ = var1.rotateAngleZ;
    }

    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
        this.rot1 = par2;
        this.rot2 = par3;
        this.rot3 = par4;
        this.rot4 = par5;
        this.rot5 = par6;
        this.rot6 = par7;
        this.Entity = par1Entity;
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        this.renderBody(par7);
    }

    public void renderBody(float par7) {
        float f5 = par7;
        if (g <= 1) {
            if (this.isChild) {
                float var8 = 2.0f;
                GL11.glPushMatrix();
                GL11.glScalef((float)(1.5f / var8), (float)(1.5f / var8), (float)(1.5f / var8));
                GL11.glTranslatef((float)0.0f, (float)(16.0f * par7), (float)0.0f);
                this.bipedHead.render(par7);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef((float)(1.0f / var8), (float)(1.0f / var8), (float)(1.0f / var8));
                GL11.glTranslatef((float)0.0f, (float)(24.0f * par7), (float)0.0f);
                this.bipedBody.render(par7);
                this.bipedRightArm.render(par7);
                this.bipedLeftArm.render(par7);
                this.bipedRightLeg.render(par7);
                this.bipedLeftLeg.render(par7);
                GL11.glPopMatrix();
            } else {
                float f6 = f;
                GL11.glPushMatrix();
                GL11.glScalef((float)(0.5f + 0.5f / f6), (float)(0.5f + 0.5f / f6), (float)(0.5f + 0.5f / f6));
                GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) / f6 * (2.0f - (f6 >= 1.5f && f6 <= 2.0f ? (2.0f - f6) / 2.5f : (f6 < 1.5f && f6 >= 1.0f ? (f6 * 2.0f - 2.0f) * 0.2f : 0.0f)))), (float)0.0f);
                this.bipedHead.render(par7);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
                GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
                this.bipedBody.render(par7);
                this.bipedRightArm.render(par7);
                this.bipedLeftArm.render(par7);
                this.bipedRightLeg.render(par7);
                this.bipedLeftLeg.render(par7);
                GL11.glPopMatrix();
            }
        } else {
            boolean bounce;
            float f6 = f;
            GL11.glPushMatrix();
            GL11.glScalef((float)((0.5f + 0.5f / f6) * (g <= 1 ? 1.0f : 0.85f)), (float)(0.5f + 0.5f / f6), (float)((0.5f + 0.5f / f6) * (g <= 1 ? 1.0f : 0.85f)));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) / f6 * (2.0f - (f6 >= 1.5f && f6 <= 2.0f ? (2.0f - f6) / 2.5f : (f6 < 1.5f && f6 >= 1.0f ? (f6 * 2.0f - 2.0f) * 0.2f : 0.0f)))), (float)0.0f);
            this.bipedHead.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.7f)), (float)(1.0f / f6), (float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.7f)));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            this.Brightarm.render(f5);
            this.Bleftarm.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.85f)), (float)(1.0f / f6), (float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.775f)));
            if (this.isSneak) {
                GL11.glTranslatef((float)-0.015f, (float)((f6 - 1.0f) * 1.5f), (float)-0.0f);
            } else {
                GL11.glTranslatef((float)-0.015f, (float)((f6 - 1.0f) * 1.5f), (float)-0.015f);
            }
            this.rightleg.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.85f)), (float)(1.0f / f6), (float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.775f)));
            if (this.isSneak) {
                GL11.glTranslatef((float)0.015f, (float)((f6 - 1.0f) * 1.5f), (float)-0.0f);
            } else {
                GL11.glTranslatef((float)0.015f, (float)((f6 - 1.0f) * 1.5f), (float)-0.015f);
            }
            this.leftleg.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.675f)), (float)(1.0f / f6), (float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.8f)));
            int b = 6;
            String[] s = JRMCoreH.data(this.Entity.getCommandSenderName(), 1, "0;0;0;0;0;0;0;0;0").split(";");
            String dns = s[1];
            b = JRMCoreH.dnsBreast(dns);
            float scale = (float)b * 0.03f;
            float br = 0.4235988f + scale;
            float bs = 0.8f + scale;
            float bsY = 0.85f + scale * 0.5f;
            float bt = 0.1f * scale;
            boolean bl = bounce = this.Entity.onGround || this.Entity.isInWater();
            float bspeed = this.Entity.isSprinting() ? 1.5f : (this.Entity.isSneaking() ? 0.5f : 1.0f);
            float bbY = (bounce ? MathHelper.sin((float)(this.rot1 * 0.6662f * bspeed * 1.5f + (float)Math.PI)) * this.rot2 * 0.03f : 0.0f) * ((float)b * 0.1119f);
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f + bbY), (float)(0.015f + bt));
            GL11.glScalef((float)1.0f, (float)bsY, (float)bs);
            this.setRotation(this.breast, -br, 0.0f, 0.0f);
            this.setRotation(this.breast2, br, 3.141593f, 0.0f);
            if (bounce) {
                this.breast.rotateAngleX += -MathHelper.cos((float)(this.rot1 * 0.6662f * bspeed + (float)Math.PI)) * this.rot2 * 0.05f * ((float)b * 0.1119f);
                this.breast.rotateAngleY += MathHelper.cos((float)(this.rot1 * 0.6662f * bspeed + (float)Math.PI)) * this.rot2 * 0.02f * ((float)b * 0.1119f);
                this.breast2.rotateAngleX += MathHelper.cos((float)(this.rot1 * 0.6662f * bspeed + (float)Math.PI)) * this.rot2 * 0.05f * ((float)b * 0.1119f);
                this.breast2.rotateAngleY += MathHelper.cos((float)(this.rot1 * 0.6662f * bspeed + (float)Math.PI)) * this.rot2 * 0.02f * ((float)b * 0.1119f);
            }
            this.Bbreast.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.7f)), (float)(1.0f / f6), (float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.7f)));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            this.body.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.75f)), (float)(1.0f / f6), (float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.75f) * (1.0f + 0.005f * (float)p)));
            if (this.isSneak) {
                GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)(-0.02f - 5.0E-4f * (float)p));
            }
            this.hip.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.65f)), (float)(1.0f / f6), (float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.65f) * (1.0f + 0.001f * (float)p)));
            if (this.isSneak) {
                GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            } else {
                GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)(-0.04f - 1.0E-4f * (float)p));
            }
            this.waist.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.85f)), (float)(1.0f / f6), (float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.85f) * (1.0f + 0.005f * (float)p)));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)(0.0f - 5.0E-4f * (float)p));
            this.bottom.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.675f) - 0.001f), (float)(1.0f / f6), (float)(1.0f / f6 * (g <= 1 ? 1.0f : 0.8f) - 0.001f));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f + 0.001f + bbY), (float)(0.015f + bt));
            GL11.glScalef((float)1.0f, (float)bsY, (float)bs);
            this.Bbreast2.render(f5);
            GL11.glPopMatrix();
        }
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        boolean isClientPlayerInFPSView;
        EntityPlayer p = null;
        if (par7Entity instanceof EntityPlayer) {
            p = (EntityPlayer)par7Entity;
            if (par7Entity != JRMCoreClient.mc.thePlayer || par7Entity == JRMCoreClient.mc.thePlayer && JRMCoreClient.mc.gameSettings.thirdPersonView != 0) {
                ExtendedPlayer props = ExtendedPlayer.get(p);
                boolean block = props.getBlocking() == 1;
                boolean instantTransmissionOn = props.getBlocking() == 2;
                int kishoot = props.getAnimKiShoot();
                this.blk = block;
                this.instantTransmission = instantTransmissionOn;
                this.KiAttack = kishoot;
            } else {
                this.blk = false;
                this.instantTransmission = false;
                this.KiAttack = 0;
            }
        }
        int pwr = 0;
        if (p != null && JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && !p.isInvisible() && JRMCoreH.dnn(1)) {
            for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                if (!JRMCoreH.plyrs[pl].equals(p.getCommandSenderName()) || JRMCoreH.data1.length < JRMCoreH.plyrs.length) continue;
                String[] s = JRMCoreH.data1[pl].split(";");
                pwr = Integer.parseInt(s[2]);
                break;
            }
        }
        if (g >= 2) {
            this.RA = this.Brightarm;
            this.LA = this.Bleftarm;
            this.RL = this.rightleg;
            this.LL = this.leftleg;
            this.B = this.Bbreast;
            this.B1 = this.body;
            this.B2 = this.hip;
            this.B3 = this.waist;
            this.B4 = this.bottom;
            this.B5 = this.Bbreast2;
            this.B7 = this.hip2;
            this.B9 = this.bottom2;
        } else {
            this.RA = this.bipedRightArm;
            this.LA = this.bipedLeftArm;
            this.RL = this.bipedRightLeg;
            this.LL = this.bipedLeftLeg;
            this.B7 = this.B9 = this.bipedBody;
            this.B5 = this.B9;
            this.B4 = this.B9;
            this.B3 = this.B9;
            this.B2 = this.B9;
            this.B1 = this.B9;
            this.B = this.B9;
        }
        this.bipedHead.rotateAngleY = par4 / 57.295776f;
        this.bipedHead.rotateAngleX = par5 / 57.295776f;
        if (y == 3) {
            p.renderYawOffset = 0.0f;
            this.bipedHead.rotateAngleX = -0.17453294f;
            this.bipedHead.rotateAngleY = -0.17453294f;
        }
        this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
        if (y == 4 || y == 5) {
            this.bipedHead.rotateAngleY = this.bipedHead.rotateAngleY + (y == 4 ? 0.8f : -0.8f);
            this.RA.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 2.0f * par2 * 0.5f;
            this.LA.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 2.0f * par2 * 0.5f;
        } else if (y == 6 || y == 7) {
            this.bipedHead.rotateAngleY = this.bipedHead.rotateAngleY + (y == 6 ? 0.7f : -0.7f);
            float animation_helper = -0.7f + (50.0f - (float)animation) * 0.025f;
            float animation_extra = 0.4f - animation_helper;
            this.RA.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 2.0f * par2 * 0.5f;
            this.LA.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 2.0f * par2 * 0.5f - (y == 6 ? animation_extra : animation_extra + 0.3f);
        } else if (y == 3) {
            this.RA.rotateAngleX = 0.0f;
            this.LA.rotateAngleX = 0.0f;
            this.RA.rotateAngleZ = 0.2f;
            this.LA.rotateAngleZ = -0.2f;
        } else if (y == 1) {
            this.bipedHead.rotateAngleX = par5 / 57.295776f;
            if (pwr == 2 && par2 > 0.9f) {
                this.RA.rotateAngleX = 0.7f;
                this.LA.rotateAngleX = 0.7f;
            } else {
                this.RA.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 2.0f * par2 * 0.5f;
                this.LA.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 2.0f * par2 * 0.5f;
            }
        } else {
            this.bipedHead.rotateAngleX = -1.0471976f;
            this.RA.rotateAngleX = 0.0f;
            this.LA.rotateAngleX = 0.0f;
            this.RA.rotateAngleZ = 0.2f;
            this.LA.rotateAngleZ = -0.2f;
        }
        this.RA.rotateAngleZ = 0.0f;
        this.LA.rotateAngleZ = 0.0f;
        if (y == 4 || y == 5) {
            this.RL.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
            this.LL.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
            this.RL.rotateAngleZ = 0.0f;
            this.LL.rotateAngleZ = 0.0f;
        } else if (y == 6 || y == 7) {
            this.RL.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
            this.LL.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
            this.RL.rotateAngleZ = 0.2f;
            this.LL.rotateAngleZ = -0.2f;
        } else if (y == 3) {
            this.RL.rotateAngleX = MathHelper.cos((float)0.0f) * 1.4f * par2;
            this.LL.rotateAngleX = MathHelper.cos((float)3.8077927f) * 1.4f * par2;
            this.RL.rotateAngleZ = 0.1f;
            this.LL.rotateAngleZ = -0.2f;
        } else if (y == 1) {
            this.RL.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
            this.LL.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
            this.RL.rotateAngleZ = 0.0f;
            this.LL.rotateAngleZ = 0.0f;
        } else {
            this.RL.rotateAngleX = 0.0f;
            this.LL.rotateAngleX = 0.0f;
            this.RL.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.LL.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.RL.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
            this.LL.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
            this.RL.rotateAngleZ = 0.2f;
            this.LL.rotateAngleZ = -0.2f;
        }
        this.RL.rotateAngleY = 0.0f;
        this.LL.rotateAngleY = 0.0f;
        boolean bl = isClientPlayerInFPSView = par7Entity.getCommandSenderName().equals(JRMCoreClient.mc.thePlayer.getCommandSenderName()) && JRMCoreClient.mc.gameSettings.thirdPersonView == 0;
        if (this.isRiding) {
            if (!isClientPlayerInFPSView) {
                this.RA.rotateAngleX += -0.62831855f;
                this.LA.rotateAngleX += -0.62831855f;
            }
            this.RL.rotateAngleX = -1.2566371f;
            this.LL.rotateAngleX = -1.2566371f;
            this.RL.rotateAngleY = 0.31415927f;
            this.LL.rotateAngleY = -0.31415927f;
        }
        if (this.heldItemLeft != 0) {
            this.LA.rotateAngleX = this.LA.rotateAngleX * 0.5f - 0.31415927f * (float)this.heldItemLeft;
        }
        if (!(this.heldItemRight == 0 || pwr == 2 && par2 > 0.9f)) {
            this.RA.rotateAngleX = this.RA.rotateAngleX * 0.5f - 0.31415927f * (float)this.heldItemRight;
        }
        this.RA.rotateAngleY = 0.0f;
        this.LA.rotateAngleY = 0.0f;
        if (this.onGround > -9990.0f) {
            float var8 = this.onGround;
            if (pwr != 3 || this.heldItemRight <= 9) {
                this.B7.rotateAngleY = this.B9.rotateAngleY = (this.B.rotateAngleY = MathHelper.sin((float)(MathHelper.sqrt_float((float)var8) * (float)Math.PI * 2.0f)) * 0.2f);
                this.B5.rotateAngleY = this.B9.rotateAngleY;
                this.B4.rotateAngleY = this.B9.rotateAngleY;
                this.B3.rotateAngleY = this.B9.rotateAngleY;
                this.B2.rotateAngleY = this.B9.rotateAngleY;
                this.B1.rotateAngleY = this.B9.rotateAngleY;
            }
            this.RA.rotationPointZ = MathHelper.sin((float)this.B.rotateAngleY) * 5.0f;
            this.RA.rotationPointX = -MathHelper.cos((float)this.B.rotateAngleY) * 5.0f;
            this.LA.rotationPointZ = -MathHelper.sin((float)this.B.rotateAngleY) * 5.0f;
            this.LA.rotationPointX = MathHelper.cos((float)this.B.rotateAngleY) * 5.0f;
            this.RA.rotateAngleY += this.B.rotateAngleY;
            this.LA.rotateAngleY += this.B.rotateAngleY;
            var8 = 1.0f - this.onGround;
            var8 *= var8;
            var8 *= var8;
            var8 = 1.0f - var8;
            float var9 = MathHelper.sin((float)(var8 * (float)Math.PI));
            float var10 = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -(this.bipedHead.rotateAngleX - 0.7f) * 0.75f;
            if (pwr == 2 && par2 > 0.9f && var9 != 0.0f) {
                this.RA.rotateAngleX = 0.0f;
                this.RA.rotateAngleX = (float)((double)this.RA.rotateAngleX - ((double)var9 * 1.2 + (double)var10));
                this.RA.rotateAngleY += this.B.rotateAngleY * 2.0f;
                this.RA.rotateAngleZ = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -0.4f;
            } else {
                this.RA.rotateAngleX = (float)((double)this.RA.rotateAngleX - ((double)var9 * 1.2 + (double)var10));
                this.RA.rotateAngleY += this.B.rotateAngleY * 2.0f;
                if (y == 3) {
                    this.RA.rotateAngleX = 0.0f;
                    this.LA.rotateAngleX = 0.0f;
                    this.RA.rotateAngleZ = 0.5f;
                    this.LA.rotateAngleZ = -0.9f;
                } else if (y == 1) {
                    this.RA.rotateAngleZ = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -0.4f;
                } else if (!isClientPlayerInFPSView) {
                    this.RA.rotateAngleZ = 0.2f;
                    this.LA.rotateAngleZ = -0.2f;
                }
            }
        }
        if (this.isSneak) {
            this.B7.rotateAngleX = this.B9.rotateAngleX = (this.B.rotateAngleX = 0.5f);
            this.B5.rotateAngleX = this.B9.rotateAngleX;
            this.B4.rotateAngleX = this.B9.rotateAngleX;
            this.B3.rotateAngleX = this.B9.rotateAngleX;
            this.B2.rotateAngleX = this.B9.rotateAngleX;
            this.B1.rotateAngleX = this.B9.rotateAngleX;
            this.RA.rotateAngleX += 0.4f;
            this.LA.rotateAngleX += 0.4f;
            this.RL.rotationPointZ = 4.0f;
            this.LL.rotationPointZ = 4.0f;
            this.RL.rotationPointY = 9.0f;
            this.LL.rotationPointY = 9.0f;
            this.bipedHeadwear.rotationPointY = this.bipedHead.rotationPointY = 1.0f;
        } else if (pwr == 2 && par2 > 0.9f) {
            this.B7.rotateAngleX = this.B9.rotateAngleX = (this.B.rotateAngleX = 0.5f);
            this.B5.rotateAngleX = this.B9.rotateAngleX;
            this.B4.rotateAngleX = this.B9.rotateAngleX;
            this.B3.rotateAngleX = this.B9.rotateAngleX;
            this.B2.rotateAngleX = this.B9.rotateAngleX;
            this.B1.rotateAngleX = this.B9.rotateAngleX;
            this.RA.rotateAngleX += 0.4f;
            this.LA.rotateAngleX += 0.4f;
            this.RL.rotationPointZ = 4.0f;
            this.LL.rotationPointZ = 4.0f;
            this.RL.rotationPointY = 9.0f;
            this.LL.rotationPointY = 9.0f;
            this.bipedHeadwear.rotationPointY = this.bipedHead.rotationPointY = 1.0f;
        } else {
            this.B7.rotateAngleX = this.B9.rotateAngleX = (this.B.rotateAngleX = 0.0f);
            this.B5.rotateAngleX = this.B9.rotateAngleX;
            this.B4.rotateAngleX = this.B9.rotateAngleX;
            this.B3.rotateAngleX = this.B9.rotateAngleX;
            this.B2.rotateAngleX = this.B9.rotateAngleX;
            this.B1.rotateAngleX = this.B9.rotateAngleX;
            this.RL.rotationPointZ = 0.1f;
            this.LL.rotationPointZ = 0.1f;
            this.RL.rotationPointY = 12.0f;
            this.LL.rotationPointY = 12.0f;
            this.bipedHeadwear.rotationPointY = this.bipedHead.rotationPointY = 0.0f;
        }
        this.isSneak = false;
        if (y != 3) {
            this.RA.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.LA.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.RA.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
            this.LA.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        }
        if (this.aimedBow) {
            float var8 = 0.0f;
            float var9 = 0.0f;
            this.RA.rotateAngleZ = 0.0f;
            this.LA.rotateAngleZ = 0.0f;
            this.RA.rotateAngleY = -(0.1f - var8 * 0.6f) + this.bipedHead.rotateAngleY;
            this.LA.rotateAngleY = 0.1f - var8 * 0.6f + this.bipedHead.rotateAngleY + 0.4f;
            this.RA.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
            this.LA.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
            this.RA.rotateAngleX -= var8 * 1.2f - var9 * 0.4f;
            this.LA.rotateAngleX -= var8 * 1.2f - var9 * 0.4f;
            this.RA.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.LA.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.RA.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
            this.LA.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        }
        this.aimedBow = false;
        float f6 = 0.0f;
        float f7 = 0.0f;
        if (pwr == 3 && this.heldItemRight > 9) {
            float var8 = this.onGround;
            float var10 = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * 0.7f * 0.75f;
            var8 = MathHelper.sin((float)(MathHelper.sqrt_float((float)var8) * (float)Math.PI * 2.0f));
            if (this.heldItemRight == 10) {
                this.RA.rotateAngleZ = 0.0f;
                this.LA.rotateAngleZ = 0.0f;
                this.RA.rotateAngleY = -0.2f;
                this.LA.rotateAngleY = 0.0f;
                this.RA.rotateAngleX = -0.5f + (var10 != 0.0f ? -0.5f - var8 : 0.0f);
                this.RA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
                this.LA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
                this.RA.rotateAngleZ -= 0.15f;
                this.LA.rotateAngleZ -= 0.25f;
            } else if (this.heldItemRight == 11) {
                this.B7.rotateAngleY = this.B9.rotateAngleY = (this.B.rotateAngleY = -0.2f);
                this.B5.rotateAngleY = this.B9.rotateAngleY;
                this.B4.rotateAngleY = this.B9.rotateAngleY;
                this.B3.rotateAngleY = this.B9.rotateAngleY;
                this.B2.rotateAngleY = this.B9.rotateAngleY;
                this.B1.rotateAngleY = this.B9.rotateAngleY;
                this.RA.rotateAngleZ = 0.0f;
                this.LA.rotateAngleZ = -0.3f;
                this.RA.rotateAngleY = 0.2f;
                this.LA.rotateAngleY = 0.5f;
                this.RA.rotateAngleX = -0.9f + (var10 != 0.0f ? var8 : 0.0f);
                this.LA.rotateAngleX = -0.5f + (var10 != 0.0f ? var8 : 0.0f);
                this.RA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
                this.LA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
                this.RA.rotateAngleZ -= 0.85f;
                this.LA.rotateAngleZ -= -0.15f;
            }
            if (this.onGround > -9990.0f) {
                this.RA.rotateAngleY += this.B.rotateAngleY * 2.0f;
            }
        }
        if (this.heldItemRight == 0) {
            if (this.blk) {
                this.RA.rotateAngleZ = 0.0f;
                this.LA.rotateAngleZ = 0.0f;
                this.RA.rotateAngleY = -(0.1f - f6 * 0.6f) + (this.bipedHead.rotateAngleY < -0.2f ? -0.2f : this.bipedHead.rotateAngleY) - 0.8f;
                this.LA.rotateAngleY = 0.1f - f6 * 0.6f + (this.bipedHead.rotateAngleY > 0.2f ? 0.2f : this.bipedHead.rotateAngleY) + 0.8f;
                this.RA.rotateAngleX = -1.5707964f + (this.bipedHead.rotateAngleX < -0.5f ? -0.5f : (this.bipedHead.rotateAngleX > 0.5f ? 0.5f : this.bipedHead.rotateAngleX));
                this.LA.rotateAngleX = -1.5707964f + (this.bipedHead.rotateAngleX < -0.5f ? -0.5f : (this.bipedHead.rotateAngleX > 0.5f ? 0.5f : this.bipedHead.rotateAngleX));
                this.RA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
                this.LA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
                this.RA.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.45f;
                this.LA.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f - 0.55f;
                this.RA.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
                this.LA.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
            } else if (this.instantTransmission) {
                this.RA.rotateAngleZ = 0.45f;
                this.RA.rotateAngleY = -0.2f + (this.bipedHead.rotateAngleX > 0.0f ? -this.bipedHead.rotateAngleX * 0.3f : 0.0f);
                this.RA.rotateAngleX = -2.5f + (this.bipedHead.rotateAngleX < -0.5f ? -0.5f : (this.bipedHead.rotateAngleX > 0.9f ? 0.9f : this.bipedHead.rotateAngleX));
            }
        }
        if ((this.KiAttack == 1 || this.KiAttack == 8 || this.KiAttack == 9) && this.heldItemRight == 0) {
            f6 = 0.0f;
            f7 = 0.0f;
            this.RA.rotateAngleZ = 0.0f;
            this.LA.rotateAngleZ = 0.0f;
            this.RA.rotateAngleY = -(0.1f - f6 * 0.6f) + (this.bipedHead.rotateAngleY < -0.2f ? -0.2f : this.bipedHead.rotateAngleY) - 0.5f;
            this.LA.rotateAngleY = 0.1f - f6 * 0.6f + (this.bipedHead.rotateAngleY > 0.2f ? 0.2f : this.bipedHead.rotateAngleY) + 0.5f;
            this.RA.rotateAngleX = -1.5707964f + (this.bipedHead.rotateAngleX < -0.5f ? -0.5f : (this.bipedHead.rotateAngleX > 0.5f ? 0.5f : this.bipedHead.rotateAngleX));
            this.LA.rotateAngleX = -1.5707964f + (this.bipedHead.rotateAngleX < -0.5f ? -0.5f : (this.bipedHead.rotateAngleX > 0.5f ? 0.5f : this.bipedHead.rotateAngleX));
            this.RA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
            this.LA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
            this.RA.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.LA.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.RA.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
            this.LA.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        }
        if ((this.KiAttack == 2 || this.KiAttack == 5 || this.KiAttack == 4 || this.KiAttack == 7) && this.heldItemRight == 0) {
            f6 = 0.0f;
            f7 = 0.0f;
            this.RA.rotateAngleZ = 0.0f;
            this.RA.rotateAngleY = -(0.1f - f6 * 0.6f) + (this.bipedHead.rotateAngleY < -0.2f ? -0.2f : this.bipedHead.rotateAngleY) - 0.1f;
            this.RA.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
            this.RA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
            this.RA.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.RA.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        }
        if (this.KiAttack == 3 && this.heldItemRight == 0) {
            f6 = 0.0f;
            f7 = 0.0f;
            this.RA.rotateAngleZ = -0.3f;
            this.RA.rotateAngleX = -3.0f;
            this.RA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
            this.RA.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.RA.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        }
        if (this.KiAttack == 6 && this.heldItemRight == 0) {
            f6 = 0.0f;
            f7 = 0.0f;
            this.RA.rotateAngleZ = -0.3f;
            this.RA.rotateAngleX = -3.0f;
            this.RA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
            this.LA.rotateAngleZ = 0.3f;
            this.LA.rotateAngleX = -3.0f;
            this.LA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
            this.RA.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.RA.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
            this.LA.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.LA.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        }
    }

    public void renderEars(float par1) {
        this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
        this.bipedEars.rotationPointX = 0.0f;
        this.bipedEars.rotationPointY = 0.0f;
        this.bipedEars.render(par1);
    }

    public void renderCloak(float par1) {
        this.bipedCloak.render(par1);
    }

    public void renderHairs(float par1, String hair) {
        float f6 = f;
        GL11.glPushMatrix();
        GL11.glScalef((float)((0.5f + 0.5f / f6) * (g <= 1 ? 1.0f : 0.85f)), (float)(0.5f + 0.5f / f6), (float)((0.5f + 0.5f / f6) * (g <= 1 ? 1.0f : 0.85f)));
        GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) / f6 * (2.0f - (f6 >= 1.5f && f6 <= 2.0f ? (2.0f - f6) / 2.5f : (f6 < 1.5f && f6 >= 1.0f ? (f6 * 2.0f - 2.0f) * 0.2f : 0.0f)))), (float)0.0f);
        if (hair.contains("SC")) {
            this.bipedHead.rotateAngleY = this.bipedHead.rotateAngleY;
            this.bipedHead.rotateAngleX = this.bipedHead.rotateAngleX;
            this.bipedHead.rotationPointX = this.bipedHead.rotationPointX;
            this.bipedHead.rotationPointY = this.bipedHead.rotationPointY;
            this.bipedHead.render(par1);
        }
        GL11.glPopMatrix();
    }

    public ModelRendererJBRA getRandomModelBox2(Random p_85181_1_) {
        return (ModelRendererJBRA)this.boxList.get(p_85181_1_.nextInt(this.boxList.size()));
    }
}

