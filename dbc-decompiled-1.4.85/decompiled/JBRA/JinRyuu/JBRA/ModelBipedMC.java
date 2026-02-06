/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JBRA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class ModelBipedMC
extends ModelBiped {
    public ModelRenderer bipedHead;
    public ModelRenderer bipedHeadwear;
    public ModelRenderer bipedBody;
    public ModelRenderer bipedRightArm;
    public ModelRenderer bipedLeftArm;
    public ModelRenderer bipedRightLeg;
    public ModelRenderer bipedLeftLeg;
    public ModelRenderer bipedEars;
    public ModelRenderer bipedCloak;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer Brightarm;
    ModelRenderer Bleftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer skirt1;
    ModelRenderer skirt2;
    ModelRenderer hip;
    ModelRenderer waist;
    ModelRenderer Bbreast;
    ModelRenderer breast;
    ModelRenderer bottom;
    ModelRenderer hip2;
    ModelRenderer breast2;
    ModelRenderer bottom2;
    ModelRenderer Bbreast2;
    public int heldItemLeft = 0;
    public int heldItemRight = 0;
    public boolean isSneak = false;
    public boolean aimedBow = false;
    public static float f = 1.0f;
    public static int g = 1;
    public static int y = 1;
    public static int p = 0;
    ModelRenderer RA;
    ModelRenderer LA;
    ModelRenderer RL;
    ModelRenderer LL;
    ModelRenderer B;
    ModelRenderer B1;
    ModelRenderer B2;
    ModelRenderer B3;
    ModelRenderer B4;
    ModelRenderer B5;
    ModelRenderer B7;
    ModelRenderer B9;
    public int b = 0;

    public ModelBipedMC() {
        this(0.0f);
    }

    public ModelBipedMC(float par1) {
        this(par1, 0.0f, 64, 32);
    }

    public ModelBipedMC(float par1, float par2, int par3, int par4) {
        this.textureWidth = par3;
        this.textureHeight = par4;
        this.bipedCloak = new ModelRenderer((ModelBase)this, 0, 0);
        this.bipedCloak.addBox(-5.0f, 0.0f, -1.0f, 10, 16, 1, par1);
        this.bipedEars = new ModelRenderer((ModelBase)this, 24, 0);
        this.bipedEars.addBox(-3.0f, -6.0f, -1.0f, 6, 6, 1, par1);
        this.bipedHead = new ModelRenderer((ModelBase)this, 0, 0);
        this.bipedHead.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, par1);
        this.bipedHead.setRotationPoint(0.0f, 0.0f + par2, 0.0f);
        this.bipedHeadwear = new ModelRenderer((ModelBase)this, 32, 0);
        this.bipedHeadwear.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, par1 + 0.5f);
        this.bipedHeadwear.setRotationPoint(0.0f, 0.0f + par2, 0.0f);
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
        this.rightarm.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, par1 * 0.1f);
        this.rightarm.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.rightarm, 0.0f, 0.0f, 0.122173f);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.leftarm.mirror = true;
        this.leftarm.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, par1 * 0.1f);
        this.leftarm.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.leftarm, 0.0f, 0.0f, -0.122173f);
        this.Brightarm = new ModelRenderer((ModelBase)this, 0, 0);
        this.Brightarm.addBox(-3.0f, -2.0f, -2.0f, 0, 0, 0, par1 * 0.1f);
        this.Brightarm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.Bleftarm = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bleftarm.mirror = true;
        this.Bleftarm.addBox(-1.0f, -2.0f, -2.0f, 0, 0, 0, par1 * 0.1f);
        this.Bleftarm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1 * 0.1f);
        this.rightleg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg.mirror = true;
        this.leftleg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1 * 0.1f);
        this.leftleg.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
        this.skirt1 = new ModelRenderer((ModelBase)this, 16, 18);
        this.skirt1.addBox(-4.0f, 9.0f, -2.0f, 8, 2, 4, par1 * 0.1f);
        this.skirt1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.skirt1, 0.0f, 0.0f, 0.0f);
        this.skirt2 = new ModelRenderer((ModelBase)this, 16, 20);
        this.skirt2.addBox(-4.0f, 11.0f, -2.0f, 8, 1, 4, par1 * 0.1f);
        this.skirt2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.skirt2, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 16, 16);
        this.body.addBox(-4.0f, 0.0f, -2.0f, 8, 4, 4, par1 * 0.1f);
        this.body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.hip2 = new ModelRenderer((ModelBase)this, 16, 16);
        this.hip2.addBox(-4.0f, 7.0f, -2.0f, 8, 2, 4);
        this.hip2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.hip2, 0.0f, 0.0f, 0.0f);
        this.hip = new ModelRenderer((ModelBase)this, 16, 23);
        this.hip.addBox(-4.0f, 7.0f, -2.0f, 8, 2, 4, par1 * 0.1f);
        this.hip.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.hip, 0.0f, 0.0f, 0.0f);
        this.waist = new ModelRenderer((ModelBase)this, 16, 20);
        this.waist.addBox(-4.0f, 4.0f, -2.0f, 8, 3, 4, par1 * 0.1f);
        this.waist.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.waist, 0.0f, 0.0f, 0.0f);
        this.Bbreast = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bbreast.addBox(-4.0f, 2.266667f, -1.0f, 0, 0, 0);
        this.Bbreast.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.breast = new ModelRenderer((ModelBase)this, 17, 18);
        this.breast.addBox(-4.0f, 2.266667f, -1.0f, 8, 3, 3);
        this.breast.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.breast, -0.5235988f, 0.0f, 0.0f);
        this.Bbreast2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Bbreast2.addBox(-4.0f, 2.266667f, -1.0f, 0, 0, 0);
        this.Bbreast2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.breast2 = new ModelRenderer((ModelBase)this, 9, 23);
        this.breast2.mirror = true;
        this.breast2.addBox(-4.0f, 2.266667f, -2.0f, 8, 3, 3);
        this.breast2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.breast2, 0.5235988f, 3.141593f, 0.0f);
        this.bottom2 = new ModelRenderer((ModelBase)this, 16, 16);
        this.bottom2.addBox(-4.0f, 9.0f, -2.0f, 8, 3, 4);
        this.bottom2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.bottom2, 0.0f, 0.0f, 0.0f);
        this.bottom = new ModelRenderer((ModelBase)this, 16, 25);
        this.bottom.addBox(-4.0f, 9.0f, -2.0f, 8, 3, 4, par1 * 0.1f);
        this.bottom.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.bottom, 0.0f, 0.0f, 0.0f);
        this.Bbreast.addChild(this.breast);
        this.Bbreast2.addChild(this.breast2);
        this.Bleftarm.addChild(this.leftarm);
        this.Brightarm.addChild(this.rightarm);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        if (g <= 1) {
            if (this.isChild) {
                float f6 = 2.0f;
                GL11.glPushMatrix();
                GL11.glScalef((float)(1.5f / f6), (float)(1.5f / f6), (float)(1.5f / f6));
                GL11.glTranslatef((float)0.0f, (float)(16.0f * par7), (float)0.0f);
                this.bipedHead.render(par7);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
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
            float f5 = par7;
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
            float scale = (float)this.b * 0.03f;
            float br = 0.4235988f + scale;
            float bs = 0.8f + scale;
            float bsY = 0.85f + scale * 0.5f;
            float bt = 0.1f * scale;
            boolean bl = bounce = par1Entity.onGround || par1Entity.isInWater();
            float bspeed = par1Entity.isSprinting() ? 1.5f : (par1Entity.isSneaking() ? 0.5f : 1.0f);
            float bbY = (bounce ? MathHelper.sin((float)(par2 * 0.6662f * bspeed * 1.5f + (float)Math.PI)) * par3 * 0.03f : 0.0f) * ((float)this.b * 0.1119f);
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f + bbY), (float)(0.015f + bt));
            GL11.glScalef((float)1.0f, (float)bsY, (float)bs);
            this.setRotation(this.breast, -br, 0.0f, 0.0f);
            this.setRotation(this.breast2, br, 3.141593f, 0.0f);
            if (bounce) {
                this.breast.rotateAngleX += -MathHelper.cos((float)(par2 * 0.6662f * bspeed + (float)Math.PI)) * par3 * 0.05f * ((float)this.b * 0.1119f);
                this.breast.rotateAngleY += MathHelper.cos((float)(par2 * 0.6662f * bspeed + (float)Math.PI)) * par3 * 0.02f * ((float)this.b * 0.1119f);
                this.breast2.rotateAngleX += MathHelper.cos((float)(par2 * 0.6662f * bspeed + (float)Math.PI)) * par3 * 0.05f * ((float)this.b * 0.1119f);
                this.breast2.rotateAngleY += MathHelper.cos((float)(par2 * 0.6662f * bspeed + (float)Math.PI)) * par3 * 0.02f * ((float)this.b * 0.1119f);
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
            if (p >= 30) {
                // empty if block
            }
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

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        float f7;
        float f6;
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
        this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
        if (y == 1) {
            this.RA.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 2.0f * par2 * 0.5f;
            this.LA.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 2.0f * par2 * 0.5f;
        } else {
            this.RA.rotateAngleX = 0.0f;
            this.LA.rotateAngleX = 0.0f;
        }
        this.RA.rotateAngleZ = 0.0f;
        this.LA.rotateAngleZ = 0.0f;
        if (y == 1) {
            this.RL.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
            this.LL.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
        } else {
            this.RL.rotateAngleX = 0.0f;
            this.LL.rotateAngleX = 0.0f;
        }
        this.RL.rotateAngleY = 0.0f;
        this.LL.rotateAngleY = 0.0f;
        if (this.isRiding) {
            this.RA.rotateAngleX += -0.62831855f;
            this.LA.rotateAngleX += -0.62831855f;
            this.RL.rotateAngleX = -1.2566371f;
            this.LL.rotateAngleX = -1.2566371f;
            this.RL.rotateAngleY = 0.31415927f;
            this.LL.rotateAngleY = -0.31415927f;
        }
        if (this.heldItemLeft != 0) {
            this.LA.rotateAngleX = this.LA.rotateAngleX * 0.5f - 0.31415927f * (float)this.heldItemLeft;
        }
        if (this.heldItemRight != 0) {
            this.RA.rotateAngleX = this.RA.rotateAngleX * 0.5f - 0.31415927f * (float)this.heldItemRight;
        }
        this.RA.rotateAngleY = 0.0f;
        this.LA.rotateAngleY = 0.0f;
        if (this.onGround > -9990.0f) {
            f6 = this.onGround;
            this.B7.rotateAngleY = this.B9.rotateAngleY = (this.B.rotateAngleY = MathHelper.sin((float)(MathHelper.sqrt_float((float)f6) * (float)Math.PI * 2.0f)) * 0.2f);
            this.B5.rotateAngleY = this.B9.rotateAngleY;
            this.B4.rotateAngleY = this.B9.rotateAngleY;
            this.B3.rotateAngleY = this.B9.rotateAngleY;
            this.B2.rotateAngleY = this.B9.rotateAngleY;
            this.B1.rotateAngleY = this.B9.rotateAngleY;
            this.RA.rotationPointZ = MathHelper.sin((float)this.B.rotateAngleY) * 5.0f;
            this.RA.rotationPointX = -MathHelper.cos((float)this.B.rotateAngleY) * 5.0f;
            this.LA.rotationPointZ = -MathHelper.sin((float)this.B.rotateAngleY) * 5.0f;
            this.LA.rotationPointX = MathHelper.cos((float)this.B.rotateAngleY) * 5.0f;
            this.RA.rotateAngleY += this.B.rotateAngleY;
            this.LA.rotateAngleY += this.B.rotateAngleY;
            this.LA.rotateAngleX += this.B.rotateAngleY;
            f6 = 1.0f - this.onGround;
            f6 *= f6;
            f6 *= f6;
            f6 = 1.0f - f6;
            f7 = MathHelper.sin((float)(f6 * (float)Math.PI));
            float f8 = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -(this.bipedHead.rotateAngleX - 0.7f) * 0.75f;
            this.RA.rotateAngleX = (float)((double)this.RA.rotateAngleX - ((double)f7 * 1.2 + (double)f8));
            this.RA.rotateAngleY += this.B.rotateAngleY * 2.0f;
            this.RA.rotateAngleZ = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -0.4f;
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
            this.bipedHead.rotationPointY = 1.0f;
            this.bipedHeadwear.rotationPointY = 1.0f;
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
            this.bipedHead.rotationPointY = 0.0f;
            this.bipedHeadwear.rotationPointY = 0.0f;
        }
        this.RA.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
        this.LA.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
        this.RA.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        this.LA.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        if (this.aimedBow) {
            f6 = 0.0f;
            f7 = 0.0f;
            this.RA.rotateAngleZ = 0.0f;
            this.LA.rotateAngleZ = 0.0f;
            this.RA.rotateAngleY = -(0.1f - f6 * 0.6f) + this.bipedHead.rotateAngleY;
            this.LA.rotateAngleY = 0.1f - f6 * 0.6f + this.bipedHead.rotateAngleY + 0.4f;
            this.RA.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
            this.LA.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
            this.RA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
            this.LA.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
            this.RA.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.LA.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
            this.RA.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
            this.LA.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        }
        this.aimedBow = false;
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
}

