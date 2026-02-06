/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreHJYC
 *  JinRyuu.JRMCore.entity.ModelBipedBody
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JBRA;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHJYC;
import JinRyuu.JRMCore.entity.ModelBipedBody;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class JRMC_GiTurtleMdl
extends ModelBipedBody {
    private final int VANITY_CRISTMAS_0 = 0;
    private final int VANITY_CRISTMAS_1 = 1;
    private final int VANITY_CRISTMAS_2 = 2;
    private final int VANITY_CRISTMAS_3 = 3;
    private final int VANITY_CRISTMAS_4 = 4;
    public int id = -1;
    public ModelRenderer Head;
    public ModelRenderer Head2;
    public ModelRenderer Head3;
    public ModelRenderer HeadTail1;
    public ModelRenderer HeadTail2;
    public ModelRenderer Larm_1;
    public ModelRenderer Rarm_1;
    public ModelRenderer Body_1;
    public ModelRenderer Larm2_1;
    public ModelRenderer Rarm2_1;
    public ModelRenderer Body2_1;
    public ModelRenderer Body3_1;
    public ModelRenderer Larm_2;
    public ModelRenderer Rarm_2;
    public ModelRenderer Body_2;
    public ModelRenderer Larm2_2;
    public ModelRenderer Rarm2_2;
    public ModelRenderer Body2_2;
    public ModelRenderer Body4_2;
    public ModelRenderer Body3_2;
    public ModelRenderer Lleg_3;
    public ModelRenderer RLeg_3;
    public ModelRenderer Body_3;
    public ModelRenderer Body2_3;
    public ModelRenderer Lleg_4;
    public ModelRenderer RLeg_4;
    public ModelRenderer Lleg2_4;
    public ModelRenderer RLeg2_4;
    private float size = 1.0f;

    public JRMC_GiTurtleMdl(int id) {
        super(0.1f);
        this.id = id;
        if (id == 0) {
            this.textureWidth = 64;
            this.textureHeight = 32;
            this.Head2 = new ModelRenderer((ModelBase)this, 0, 15);
            this.Head2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Head2.addBox(-4.5f, -6.4f, -5.0f, 9, 2, 9, 0.01f);
            this.setRotateAngle(this.Head2, -0.09773844f, 0.0f, 0.0f);
            this.HeadTail2 = new ModelRenderer((ModelBase)this, 51, 22);
            this.HeadTail2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.HeadTail2.addBox(-1.0f, -1.3f, 3.2f, 2, 2, 2, 0.01f);
            this.HeadTail1 = new ModelRenderer((ModelBase)this, 48, 15);
            this.HeadTail1.setRotationPoint(0.2f, -7.5f, 4.6f);
            this.HeadTail1.addBox(-1.5f, -0.7f, -0.8f, 3, 1, 4, 0.01f);
            this.setRotateAngle(this.HeadTail1, -0.7285004f, 0.0f, 0.0f);
            this.Head = new ModelRenderer((ModelBase)this, 0, 0);
            this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 3, 8, 0.03f);
            this.Head3 = new ModelRenderer((ModelBase)this, 35, 0);
            this.Head3.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Head3.addBox(-3.0f, -8.9f, -2.1f, 6, 2, 7, 0.01f);
            this.Head.addChild(this.Head2);
            this.HeadTail1.addChild(this.HeadTail2);
            this.Head3.addChild(this.HeadTail1);
            this.Head.addChild(this.Head3);
        } else if (id == 1) {
            this.textureWidth = 64;
            this.textureHeight = 32;
            this.Larm_1 = new ModelRenderer((ModelBase)this, 31, 4);
            this.Larm_1.mirror = true;
            this.Larm_1.setRotationPoint(5.0f, 2.0f, 0.0f);
            this.Larm_1.addBox(-1.0f, -2.0f, -2.0f, 4, 8, 4, 0.02f);
            this.Body_1 = new ModelRenderer((ModelBase)this, 0, 0);
            this.Body_1.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Body_1.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.02f);
            this.Body2_1 = new ModelRenderer((ModelBase)this, 0, 25);
            this.Body2_1.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Body2_1.addBox(-4.5f, 10.6f, -2.5f, 9, 2, 5, 0.01f);
            this.Rarm_1 = new ModelRenderer((ModelBase)this, 31, 4);
            this.Rarm_1.setRotationPoint(-5.0f, 2.0f, 0.0f);
            this.Rarm_1.addBox(-3.0f, -2.0f, -2.0f, 4, 8, 4, 0.02f);
            this.Body3_1 = new ModelRenderer((ModelBase)this, 0, 17);
            this.Body3_1.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Body3_1.addBox(-4.5f, -0.6f, -2.5f, 9, 2, 5, 0.01f);
            this.Rarm2_1 = new ModelRenderer((ModelBase)this, 30, 17);
            this.Rarm2_1.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Rarm2_1.addBox(-3.7f, 5.5f, -2.5f, 5, 2, 5, 0.01f);
            this.Larm2_1 = new ModelRenderer((ModelBase)this, 30, 17);
            this.Larm2_1.mirror = true;
            this.Larm2_1.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Larm2_1.addBox(-1.3f, 5.5f, -2.5f, 5, 2, 5, 0.01f);
            this.Body_1.addChild(this.Body2_1);
            this.Body_1.addChild(this.Body3_1);
            this.Rarm_1.addChild(this.Rarm2_1);
            this.Larm_1.addChild(this.Larm2_1);
        } else if (id == 2) {
            this.textureWidth = 64;
            this.textureHeight = 32;
            this.Larm2_2 = new ModelRenderer((ModelBase)this, 36, 21);
            this.Larm2_2.mirror = true;
            this.Larm2_2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Larm2_2.addBox(-1.3f, 5.5f, -2.5f, 5, 2, 5, 0.01f);
            this.Body2_2 = new ModelRenderer((ModelBase)this, 0, 16);
            this.Body2_2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Body2_2.addBox(-4.5f, 10.6f, -2.5f, 9, 2, 5, 0.01f);
            this.Rarm2_2 = new ModelRenderer((ModelBase)this, 36, 21);
            this.Rarm2_2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Rarm2_2.addBox(-3.7f, 5.5f, -2.5f, 5, 2, 5, 0.01f);
            this.Body4_2 = new ModelRenderer((ModelBase)this, 24, 0);
            this.Body4_2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Body4_2.addBox(-4.5f, -0.6f, -2.5f, 9, 2, 5, 0.01f);
            this.Body3_2 = new ModelRenderer((ModelBase)this, 0, 23);
            this.Body3_2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Body3_2.addBox(-5.0f, 11.8f, -3.0f, 10, 2, 6, 0.01f);
            this.Larm_2 = new ModelRenderer((ModelBase)this, 38, 8);
            this.Larm_2.mirror = true;
            this.Larm_2.setRotationPoint(5.0f, 2.0f, 0.0f);
            this.Larm_2.addBox(-1.0f, -2.0f, -2.0f, 4, 8, 4, 0.02f);
            this.Body_2 = new ModelRenderer((ModelBase)this, 0, 0);
            this.Body_2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Body_2.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.03f);
            this.Rarm_2 = new ModelRenderer((ModelBase)this, 38, 8);
            this.Rarm_2.setRotationPoint(-5.0f, 2.0f, 0.0f);
            this.Rarm_2.addBox(-3.0f, -2.0f, -2.0f, 4, 8, 4, 0.02f);
            this.Larm_2.addChild(this.Larm2_2);
            this.Body_2.addChild(this.Body2_2);
            this.Rarm_2.addChild(this.Rarm2_2);
            this.Body_2.addChild(this.Body4_2);
            this.Body2_2.addChild(this.Body3_2);
        } else if (id == 3) {
            this.textureWidth = 64;
            this.textureHeight = 32;
            this.Body_3 = new ModelRenderer((ModelBase)this, 0, 0);
            this.Body_3.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Body_3.addBox(-4.0f, 8.1f, -2.0f, 8, 4, 4, 0.01f);
            this.RLeg_3 = new ModelRenderer((ModelBase)this, 0, 16);
            this.RLeg_3.setRotationPoint(-1.9f, 12.0f, 0.0f);
            this.RLeg_3.addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4, 0.01f);
            this.Lleg_3 = new ModelRenderer((ModelBase)this, 0, 16);
            this.Lleg_3.mirror = true;
            this.Lleg_3.setRotationPoint(1.9f, 12.0f, 0.0f);
            this.Lleg_3.addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4, 0.01f);
            this.Body2_3 = new ModelRenderer((ModelBase)this, 0, 8);
            this.Body2_3.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Body2_3.addBox(-4.5f, 7.4f, -2.5f, 9, 2, 5, 0.01f);
            this.Body_3.addChild(this.Body2_3);
        } else if (id == 4) {
            this.textureWidth = 64;
            this.textureHeight = 32;
            this.Lleg2_4 = new ModelRenderer((ModelBase)this, 1, 1);
            this.Lleg2_4.mirror = true;
            this.Lleg2_4.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Lleg2_4.addBox(-2.3f, 6.4f, -2.5f, 5, 2, 5, 0.01f);
            this.RLeg2_4 = new ModelRenderer((ModelBase)this, 1, 1);
            this.RLeg2_4.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.RLeg2_4.addBox(-2.7f, 6.4f, -2.5f, 5, 2, 5, 0.01f);
            this.Lleg_4 = new ModelRenderer((ModelBase)this, 1, 10);
            this.Lleg_4.mirror = true;
            this.Lleg_4.setRotationPoint(1.9f, 12.0f, 0.0f);
            this.Lleg_4.addBox(-2.0f, 8.0f, -2.0f, 4, 4, 4, 0.02f);
            this.RLeg_4 = new ModelRenderer((ModelBase)this, 1, 10);
            this.RLeg_4.setRotationPoint(-1.9f, 12.0f, 0.0f);
            this.RLeg_4.addBox(-2.0f, 8.0f, -2.0f, 4, 4, 4, 0.02f);
            this.Lleg_4.addChild(this.Lleg2_4);
            this.RLeg_4.addChild(this.RLeg2_4);
        }
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float f6 = this.size;
        if (JRMCoreH.JYC()) {
            float age = JRMCoreHJYC.JYCAge((EntityPlayer)((EntityPlayer)entity));
            float childScl = JRMCoreHJYC.JYCsizeBasedOnAge((EntityPlayer)((EntityPlayer)entity));
            this.size = childScl = 3.0f - childScl * 2.0f;
        }
        if (this.id == 0) {
            GL11.glScalef((float)(0.5f + 0.5f / f6), (float)(0.5f + 0.5f / f6), (float)(0.5f + 0.5f / f6));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) / f6 * (2.0f - (f6 >= 1.5f && f6 <= 2.0f ? (2.0f - f6) / 2.5f : (f6 < 1.5f && f6 >= 1.0f ? (f6 * 2.0f - 2.0f) * 0.2f : 0.0f)))), (float)0.0f);
            GL11.glPushMatrix();
            GL11.glScalef((float)1.1f, (float)1.1f, (float)1.1f);
            this.Head.render(f5);
            GL11.glPopMatrix();
        } else if (this.id == 1) {
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            this.Larm_1.render(f5);
            this.Body_1.render(f5);
            this.Rarm_1.render(f5);
        } else if (this.id == 2) {
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            this.Larm_2.render(f5);
            this.Body_2.render(f5);
            this.Rarm_2.render(f5);
        } else if (this.id == 3) {
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            this.Body_3.render(f5);
            this.RLeg_3.render(f5);
            this.Lleg_3.render(f5);
        } else if (this.id == 4) {
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            this.Lleg_4.render(f5);
            this.RLeg_4.render(f5);
        }
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        if (this.id == 0) {
            this.Head.rotationPointZ = this.bipedHead.rotationPointZ;
            this.Head.rotationPointY = this.bipedHead.rotationPointY;
            this.Head.rotationPointX = this.bipedHead.rotationPointX;
            this.Head.rotateAngleZ = this.bipedHead.rotateAngleZ;
            this.Head.rotateAngleY = this.bipedHead.rotateAngleY;
            this.Head.rotateAngleX = this.bipedHead.rotateAngleX;
            float s = 0.0f;
            float s2 = MathHelper.cos((float)(par1 * 0.6662f)) * 1.0f * par2;
            float s3 = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.0f * par2;
            this.HeadTail1.rotateAngleX = (s3 + s > s ? s3 + s : (s2 + s > s ? s2 + s : s)) / 4.0f - 0.7285004f;
            this.HeadTail2.rotateAngleX = (s3 + s > s ? s3 + s : (s2 + s > s ? s2 + s : s)) / 4.0f;
        } else if (this.id == 1) {
            this.Larm_1.rotationPointZ = this.bipedLeftArm.rotationPointZ;
            this.Larm_1.rotationPointY = this.bipedLeftArm.rotationPointY;
            this.Larm_1.rotationPointX = this.bipedLeftArm.rotationPointX;
            this.Larm_1.rotateAngleZ = this.bipedLeftArm.rotateAngleZ;
            this.Larm_1.rotateAngleY = this.bipedLeftArm.rotateAngleY;
            this.Larm_1.rotateAngleX = this.bipedLeftArm.rotateAngleX;
            this.Rarm_1.rotationPointZ = this.bipedRightArm.rotationPointZ;
            this.Rarm_1.rotationPointY = this.bipedRightArm.rotationPointY;
            this.Rarm_1.rotationPointX = this.bipedRightArm.rotationPointX;
            this.Rarm_1.rotateAngleZ = this.bipedRightArm.rotateAngleZ;
            this.Rarm_1.rotateAngleY = this.bipedRightArm.rotateAngleY;
            this.Rarm_1.rotateAngleX = this.bipedRightArm.rotateAngleX;
            this.Body_1.rotationPointZ = this.bipedBody.rotationPointZ;
            this.Body_1.rotationPointY = this.bipedBody.rotationPointY;
            this.Body_1.rotationPointX = this.bipedBody.rotationPointX;
            this.Body_1.rotateAngleZ = this.bipedBody.rotateAngleZ;
            this.Body_1.rotateAngleY = this.bipedBody.rotateAngleY;
            this.Body_1.rotateAngleX = this.bipedBody.rotateAngleX;
        } else if (this.id == 2) {
            this.Larm_2.rotationPointZ = this.bipedLeftArm.rotationPointZ;
            this.Larm_2.rotationPointY = this.bipedLeftArm.rotationPointY;
            this.Larm_2.rotationPointX = this.bipedLeftArm.rotationPointX;
            this.Larm_2.rotateAngleZ = this.bipedLeftArm.rotateAngleZ;
            this.Larm_2.rotateAngleY = this.bipedLeftArm.rotateAngleY;
            this.Larm_2.rotateAngleX = this.bipedLeftArm.rotateAngleX;
            this.Rarm_2.rotationPointZ = this.bipedRightArm.rotationPointZ;
            this.Rarm_2.rotationPointY = this.bipedRightArm.rotationPointY;
            this.Rarm_2.rotationPointX = this.bipedRightArm.rotationPointX;
            this.Rarm_2.rotateAngleZ = this.bipedRightArm.rotateAngleZ;
            this.Rarm_2.rotateAngleY = this.bipedRightArm.rotateAngleY;
            this.Rarm_2.rotateAngleX = this.bipedRightArm.rotateAngleX;
            this.Body_2.rotationPointZ = this.bipedBody.rotationPointZ;
            this.Body_2.rotationPointY = this.bipedBody.rotationPointY;
            this.Body_2.rotationPointX = this.bipedBody.rotationPointX;
            this.Body_2.rotateAngleZ = this.bipedBody.rotateAngleZ;
            this.Body_2.rotateAngleY = this.bipedBody.rotateAngleY;
            this.Body_2.rotateAngleX = this.bipedBody.rotateAngleX;
        } else if (this.id == 3) {
            this.Body_3.rotationPointZ = this.bipedBody.rotationPointZ;
            this.Body_3.rotationPointY = this.bipedBody.rotationPointY;
            this.Body_3.rotationPointX = this.bipedBody.rotationPointX;
            this.Body_3.rotateAngleZ = this.bipedBody.rotateAngleZ;
            this.Body_3.rotateAngleY = this.bipedBody.rotateAngleY;
            this.Body_3.rotateAngleX = this.bipedBody.rotateAngleX;
            this.RLeg_3.rotationPointZ = this.bipedRightLeg.rotationPointZ;
            this.RLeg_3.rotationPointY = this.bipedRightLeg.rotationPointY;
            this.RLeg_3.rotationPointX = this.bipedRightLeg.rotationPointX;
            this.RLeg_3.rotateAngleZ = this.bipedRightLeg.rotateAngleZ;
            this.RLeg_3.rotateAngleY = this.bipedRightLeg.rotateAngleY;
            this.RLeg_3.rotateAngleX = this.bipedRightLeg.rotateAngleX;
            this.Lleg_3.rotationPointZ = this.bipedLeftLeg.rotationPointZ;
            this.Lleg_3.rotationPointY = this.bipedLeftLeg.rotationPointY;
            this.Lleg_3.rotationPointX = this.bipedLeftLeg.rotationPointX;
            this.Lleg_3.rotateAngleZ = this.bipedLeftLeg.rotateAngleZ;
            this.Lleg_3.rotateAngleY = this.bipedLeftLeg.rotateAngleY;
            this.Lleg_3.rotateAngleX = this.bipedLeftLeg.rotateAngleX;
        } else if (this.id == 4) {
            this.RLeg_4.rotationPointZ = this.bipedRightLeg.rotationPointZ;
            this.RLeg_4.rotationPointY = this.bipedRightLeg.rotationPointY;
            this.RLeg_4.rotationPointX = this.bipedRightLeg.rotationPointX;
            this.RLeg_4.rotateAngleZ = this.bipedRightLeg.rotateAngleZ;
            this.RLeg_4.rotateAngleY = this.bipedRightLeg.rotateAngleY;
            this.RLeg_4.rotateAngleX = this.bipedRightLeg.rotateAngleX;
            this.Lleg_4.rotationPointZ = this.bipedLeftLeg.rotationPointZ;
            this.Lleg_4.rotationPointY = this.bipedLeftLeg.rotationPointY;
            this.Lleg_4.rotationPointX = this.bipedLeftLeg.rotationPointX;
            this.Lleg_4.rotateAngleZ = this.bipedLeftLeg.rotateAngleZ;
            this.Lleg_4.rotateAngleY = this.bipedLeftLeg.rotateAngleY;
            this.Lleg_4.rotateAngleX = this.bipedLeftLeg.rotateAngleX;
        }
    }
}

