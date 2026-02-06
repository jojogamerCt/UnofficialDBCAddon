/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelMagetta
extends ModelBase {
    public ModelRenderer BodyBase;
    public ModelRenderer HeadBottom;
    public ModelRenderer Leg1R;
    public ModelRenderer Arm1L;
    public ModelRenderer Arm1R;
    public ModelRenderer Leg1L;
    public ModelRenderer BodyTopSideR;
    public ModelRenderer BodyTopsideL;
    public ModelRenderer BodyBottom1;
    public ModelRenderer BodySideL;
    public ModelRenderer BodyMid;
    public ModelRenderer BodySideR;
    public ModelRenderer BodyBottom2;
    public ModelRenderer Head;
    public ModelRenderer HeadTop1;
    public ModelRenderer HeadSideL;
    public ModelRenderer HeadSideR;
    public ModelRenderer HeadTop2;
    public ModelRenderer Leg2;
    public ModelRenderer Leg3;
    public ModelRenderer Leg4;
    public ModelRenderer LegGuardR;
    public ModelRenderer Leg5;
    public ModelRenderer Leg6;
    public ModelRenderer Arm2L;
    public ModelRenderer Arm3L;
    public ModelRenderer Arm4L;
    public ModelRenderer ArmGuardL;
    public ModelRenderer Arm5L;
    public ModelRenderer Arm6L;
    public ModelRenderer Arm2R;
    public ModelRenderer Arm3R;
    public ModelRenderer Arm4R;
    public ModelRenderer ArmGuardR;
    public ModelRenderer Arm5R;
    public ModelRenderer Arm6R;
    public ModelRenderer Leg2_1;
    public ModelRenderer Leg3_1;
    public ModelRenderer Leg4_1;
    public ModelRenderer LegGuardL;
    public ModelRenderer Leg5_1;
    public ModelRenderer Leg6_1;

    public ModelMagetta() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Head = new ModelRenderer((ModelBase)this, 59, 5);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-3.0f, -4.9f, -2.5f, 6, 4, 5, 0.0f);
        this.Arm1R = new ModelRenderer((ModelBase)this, 111, 7);
        this.Arm1R.setRotationPoint(-9.3f, -6.4f, 0.0f);
        this.Arm1R.addBox(-2.0f, -1.8f, -2.0f, 4, 4, 4, 0.0f);
        this.Arm2R = new ModelRenderer((ModelBase)this, 117, 16);
        this.Arm2R.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm2R.addBox(-1.3f, 2.2f, -0.5f, 1, 4, 1, 0.0f);
        this.setRotateAngle(this.Arm2R, 0.0f, 0.0f, 0.28012535f);
        this.Arm1L = new ModelRenderer((ModelBase)this, 111, 7);
        this.Arm1L.mirror = true;
        this.Arm1L.setRotationPoint(9.3f, -6.4f, 0.0f);
        this.Arm1L.addBox(-2.0f, -1.8f, -2.0f, 4, 4, 4, 0.0f);
        this.BodyBottom1 = new ModelRenderer((ModelBase)this, 4, 34);
        this.BodyBottom1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyBottom1.addBox(-4.0f, 12.7f, -3.5f, 8, 3, 7, 0.0f);
        this.Arm4L = new ModelRenderer((ModelBase)this, 103, 28);
        this.Arm4L.mirror = true;
        this.Arm4L.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm4L.addBox(-1.9f, 6.8f, -3.0f, 6, 3, 6, 0.0f);
        this.BodySideR = new ModelRenderer((ModelBase)this, 1, 23);
        this.BodySideR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodySideR.addBox(-5.5f, 7.5f, -3.5f, 3, 3, 7, 0.0f);
        this.Leg2_1 = new ModelRenderer((ModelBase)this, 36, 54);
        this.Leg2_1.mirror = true;
        this.Leg2_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg2_1.addBox(0.3f, 2.2f, -0.5f, 1, 4, 1, 0.0f);
        this.setRotateAngle(this.Leg2_1, 0.0f, 0.0f, -0.27314404f);
        this.Leg3_1 = new ModelRenderer((ModelBase)this, 60, 26);
        this.Leg3_1.mirror = true;
        this.Leg3_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg3_1.addBox(0.8f, 5.5f, -1.5f, 3, 1, 3, 0.0f);
        this.setRotateAngle(this.Leg3_1, 0.0f, 0.0f, 0.25743607f);
        this.Arm5L = new ModelRenderer((ModelBase)this, 99, 38);
        this.Arm5L.mirror = true;
        this.Arm5L.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm5L.addBox(-2.3f, 9.7f, -3.5f, 7, 5, 7, 0.0f);
        this.Arm2L = new ModelRenderer((ModelBase)this, 117, 16);
        this.Arm2L.mirror = true;
        this.Arm2L.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm2L.addBox(-0.2f, 2.2f, -0.5f, 1, 4, 1, 0.0f);
        this.setRotateAngle(this.Arm2L, 0.0f, 0.0f, -0.28012535f);
        this.Leg1R = new ModelRenderer((ModelBase)this, 26, 45);
        this.Leg1R.setRotationPoint(-3.5f, 6.4f, 0.0f);
        this.Leg1R.addBox(-2.0f, -1.8f, -2.0f, 4, 4, 4, 0.0f);
        this.LegGuardL = new ModelRenderer((ModelBase)this, 73, 27);
        this.LegGuardL.mirror = true;
        this.LegGuardL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegGuardL.addBox(-0.2f, 5.3f, -3.0f, 5, 2, 1, 0.0f);
        this.Leg5 = new ModelRenderer((ModelBase)this, 47, 41);
        this.Leg5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg5.addBox(-6.1f, 9.3f, -3.6f, 7, 6, 7, 0.0f);
        this.BodyTopSideR = new ModelRenderer((ModelBase)this, 90, 1);
        this.BodyTopSideR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyTopSideR.addBox(-9.0f, 0.3f, -4.0f, 2, 6, 8, 0.0f);
        this.HeadTop1 = new ModelRenderer((ModelBase)this, 82, 18);
        this.HeadTop1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadTop1.addBox(-1.0f, -5.8f, -1.0f, 2, 1, 2, 0.0f);
        this.ArmGuardR = new ModelRenderer((ModelBase)this, 100, 20);
        this.ArmGuardR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmGuardR.addBox(-4.9f, 5.3f, -2.4f, 1, 2, 5, 0.0f);
        this.BodyBase = new ModelRenderer((ModelBase)this, 6, 0);
        this.BodyBase.setRotationPoint(0.0f, -9.6f, 0.0f);
        this.BodyBase.addBox(-7.0f, 0.0f, -4.9f, 14, 8, 10, 0.0f);
        this.LegGuardR = new ModelRenderer((ModelBase)this, 73, 27);
        this.LegGuardR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegGuardR.addBox(-5.1f, 5.3f, -3.0f, 5, 2, 1, 0.0f);
        this.Leg4 = new ModelRenderer((ModelBase)this, 52, 31);
        this.Leg4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg4.addBox(-5.5f, 6.4f, -3.2f, 6, 3, 6, 0.0f);
        this.HeadBottom = new ModelRenderer((ModelBase)this, 55, 15);
        this.HeadBottom.setRotationPoint(0.0f, -9.7f, 0.0f);
        this.HeadBottom.addBox(-4.1f, -1.6f, -3.5f, 8, 2, 7, 0.0f);
        this.Leg2 = new ModelRenderer((ModelBase)this, 36, 54);
        this.Leg2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg2.addBox(-1.3f, 2.2f, -0.5f, 1, 4, 1, 0.0f);
        this.setRotateAngle(this.Leg2, 0.0f, 0.0f, 0.27314404f);
        this.ArmGuardL = new ModelRenderer((ModelBase)this, 100, 20);
        this.ArmGuardL.mirror = true;
        this.ArmGuardL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmGuardL.addBox(2.9f, 5.3f, -2.5f, 1, 2, 5, 0.0f);
        this.Leg4_1 = new ModelRenderer((ModelBase)this, 52, 31);
        this.Leg4_1.mirror = true;
        this.Leg4_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg4_1.addBox(-0.7f, 6.4f, -3.2f, 6, 3, 6, 0.0f);
        this.BodyMid = new ModelRenderer((ModelBase)this, 15, 19);
        this.BodyMid.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyMid.addBox(-3.0f, 7.9f, -2.5f, 6, 5, 5, 0.0f);
        this.Arm3L = new ModelRenderer((ModelBase)this, 113, 22);
        this.Arm3L.mirror = true;
        this.Arm3L.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm3L.addBox(-0.5f, 6.0f, -1.5f, 3, 1, 3, 0.0f);
        this.setRotateAngle(this.Arm3L, 0.0f, 0.0f, 0.13665928f);
        this.HeadSideR = new ModelRenderer((ModelBase)this, 55, 15);
        this.HeadSideR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadSideR.addBox(-3.9f, -3.1f, -1.0f, 1, 2, 2, 0.0f);
        this.BodyTopsideL = new ModelRenderer((ModelBase)this, 90, 1);
        this.BodyTopsideL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyTopsideL.addBox(7.0f, 0.3f, -4.0f, 2, 6, 8, 0.0f);
        this.Leg3 = new ModelRenderer((ModelBase)this, 60, 26);
        this.Leg3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg3.addBox(-3.9f, 5.5f, -1.5f, 3, 1, 3, 0.0f);
        this.setRotateAngle(this.Leg3, 0.0f, 0.0f, -0.25743607f);
        this.Arm6R = new ModelRenderer((ModelBase)this, 103, 51);
        this.Arm6R.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm6R.addBox(-5.2f, 14.7f, -2.8f, 6, 3, 6, 0.0f);
        this.BodySideL = new ModelRenderer((ModelBase)this, 31, 23);
        this.BodySideL.mirror = true;
        this.BodySideL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodySideL.addBox(2.5f, 7.5f, -3.5f, 3, 3, 7, 0.0f);
        this.Leg5_1 = new ModelRenderer((ModelBase)this, 47, 41);
        this.Leg5_1.mirror = true;
        this.Leg5_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg5_1.addBox(-1.2f, 9.3f, -3.6f, 7, 6, 7, 0.0f);
        this.Leg1L = new ModelRenderer((ModelBase)this, 26, 45);
        this.Leg1L.mirror = true;
        this.Leg1L.setRotationPoint(3.1f, 6.4f, 0.0f);
        this.Leg1L.addBox(-2.0f, -1.8f, -2.0f, 4, 4, 4, 0.0f);
        this.Leg6_1 = new ModelRenderer((ModelBase)this, 66, 50);
        this.Leg6_1.mirror = true;
        this.Leg6_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg6_1.addBox(-1.6f, 14.8f, -5.7f, 8, 3, 10, 0.0f);
        this.Arm5R = new ModelRenderer((ModelBase)this, 99, 38);
        this.Arm5R.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm5R.addBox(-5.7f, 9.7f, -3.3f, 7, 5, 7, 0.0f);
        this.HeadTop2 = new ModelRenderer((ModelBase)this, 84, 14);
        this.HeadTop2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadTop2.addBox(-0.5f, -7.8f, -0.5f, 1, 2, 1, 0.0f);
        this.BodyBottom2 = new ModelRenderer((ModelBase)this, 4, 45);
        this.BodyBottom2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyBottom2.addBox(-2.0f, 15.6f, -3.0f, 4, 3, 6, 0.0f);
        this.Arm6L = new ModelRenderer((ModelBase)this, 103, 51);
        this.Arm6L.mirror = true;
        this.Arm6L.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm6L.addBox(-1.8f, 14.7f, -3.0f, 6, 3, 6, 0.0f);
        this.Arm4R = new ModelRenderer((ModelBase)this, 103, 28);
        this.Arm4R.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm4R.addBox(-5.1f, 6.8f, -2.8f, 6, 3, 6, 0.0f);
        this.Arm3R = new ModelRenderer((ModelBase)this, 113, 22);
        this.Arm3R.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Arm3R.addBox(-3.4f, 5.8f, -1.5f, 3, 1, 3, 0.0f);
        this.setRotateAngle(this.Arm3R, 0.0f, 0.0f, -0.13665928f);
        this.HeadSideL = new ModelRenderer((ModelBase)this, 55, 15);
        this.HeadSideL.mirror = true;
        this.HeadSideL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadSideL.addBox(2.7f, -3.1f, -1.0f, 1, 2, 2, 0.0f);
        this.Leg6 = new ModelRenderer((ModelBase)this, 66, 50);
        this.Leg6.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Leg6.addBox(-6.5f, 14.8f, -5.7f, 8, 3, 10, 0.0f);
        this.HeadBottom.addChild(this.Head);
        this.Arm1R.addChild(this.Arm2R);
        this.BodyBase.addChild(this.BodyBottom1);
        this.Arm3L.addChild(this.Arm4L);
        this.BodyBase.addChild(this.BodySideR);
        this.Leg1L.addChild(this.Leg2_1);
        this.Leg2_1.addChild(this.Leg3_1);
        this.Arm4L.addChild(this.Arm5L);
        this.Arm1L.addChild(this.Arm2L);
        this.Leg3_1.addChild(this.LegGuardL);
        this.Leg4.addChild(this.Leg5);
        this.BodyBase.addChild(this.BodyTopSideR);
        this.Head.addChild(this.HeadTop1);
        this.Arm3R.addChild(this.ArmGuardR);
        this.Leg3.addChild(this.LegGuardR);
        this.Leg3.addChild(this.Leg4);
        this.Leg1R.addChild(this.Leg2);
        this.Arm3L.addChild(this.ArmGuardL);
        this.Leg3_1.addChild(this.Leg4_1);
        this.BodyBase.addChild(this.BodyMid);
        this.Arm2L.addChild(this.Arm3L);
        this.Head.addChild(this.HeadSideR);
        this.BodyBase.addChild(this.BodyTopsideL);
        this.Leg2.addChild(this.Leg3);
        this.Arm5R.addChild(this.Arm6R);
        this.BodyBase.addChild(this.BodySideL);
        this.Leg4_1.addChild(this.Leg5_1);
        this.Leg5_1.addChild(this.Leg6_1);
        this.Arm4R.addChild(this.Arm5R);
        this.HeadTop1.addChild(this.HeadTop2);
        this.BodyBottom1.addChild(this.BodyBottom2);
        this.Arm5L.addChild(this.Arm6L);
        this.Arm3R.addChild(this.Arm4R);
        this.Arm2R.addChild(this.Arm3R);
        this.Head.addChild(this.HeadSideL);
        this.Leg5.addChild(this.Leg6);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float sc = 1.5f;
        GL11.glScalef((float)sc, (float)sc, (float)sc);
        GL11.glTranslatef((float)0.0f, (float)(-sc * 0.35f), (float)0.0f);
        this.Leg1L.render(f5);
        this.HeadBottom.render(f5);
        this.Arm1L.render(f5);
        this.Arm1R.render(f5);
        this.BodyBase.render(f5);
        this.Leg1R.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        int calc = par7Entity.ticksExisted;
        if (calc > 100) {
            calc -= 100;
        }
        float r = 360.0f;
        float r2 = 180.0f;
        float n4 = par4;
        float n5 = par5;
        this.Head.rotateAngleY = n4 / (r2 / (float)Math.PI);
        this.Head.rotateAngleX = n5 / (r2 / (float)Math.PI);
        float ex = par7Entity.ticksExisted;
        float r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        float r4 = MathHelper.cos((float)(ex / 8.0f)) / 5.0f + 0.1f;
        this.Leg1R.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.Leg1L.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.Arm1R.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.Arm1L.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.Leg1R.rotateAngleY = 0.0f;
        this.Leg1L.rotateAngleY = 0.0f;
        this.Arm1R.rotateAngleY = 0.0f;
        this.Arm1L.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

