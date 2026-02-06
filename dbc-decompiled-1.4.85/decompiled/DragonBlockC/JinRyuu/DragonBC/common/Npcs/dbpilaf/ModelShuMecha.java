/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.client.JGRenderHelper
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs.dbpilaf;

import JinRyuu.JRMCore.client.JGRenderHelper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelShuMecha
extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer ArmL1;
    public ModelRenderer ArmR1;
    public ModelRenderer Leg1L;
    public ModelRenderer Leg1R;
    public ModelRenderer BodyBack;
    public ModelRenderer BodyFront;
    public ModelRenderer BodyR;
    public ModelRenderer BodyL;
    public ModelRenderer BodyBottom;
    public ModelRenderer BodyTop;
    public ModelRenderer Head1;
    public ModelRenderer Back;
    public ModelRenderer Tail1;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer Bottom;
    public ModelRenderer PlateR;
    public ModelRenderer PlateL;
    public ModelRenderer Bottom_1;
    public ModelRenderer Head2;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;
    public ModelRenderer ArmGunR1;
    public ModelRenderer ArmGunR2;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer ArmGunR1_1;
    public ModelRenderer ArmGunR2_1;
    public ModelRenderer Leg2L;
    public ModelRenderer Leg3L;
    public ModelRenderer KneeL;
    public ModelRenderer FootL;
    public ModelRenderer Leg2R;
    public ModelRenderer Leg3R;
    public ModelRenderer KneeR;
    public ModelRenderer FootR;

    public ModelShuMecha() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.Head1 = new ModelRenderer((ModelBase)this, 72, 0);
        this.Head1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head1.addBox(-6.0f, -4.6f, -10.0f, 12, 15, 14, 0.0f);
        this.Leg3L = new ModelRenderer((ModelBase)this, 1, 87);
        this.Leg3L.mirror = true;
        this.Leg3L.setRotationPoint(0.0f, 10.7f, -0.1f);
        this.Leg3L.addBox(-3.0f, -0.1f, -2.5f, 6, 18, 5, 0.0f);
        this.setRotateAngle(this.Leg3L, 0.31415927f, 0.0f, 0.0f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 46, 101);
        this.ArmR3.setRotationPoint(0.0f, 6.5f, 0.0f);
        this.ArmR3.addBox(-2.5f, 0.0f, -2.0f, 4, 7, 5, 0.0f);
        this.setRotateAngle(this.ArmR3, -1.2217305f, 0.0f, 0.0f);
        this.KneeR = new ModelRenderer((ModelBase)this, 25, 91);
        this.KneeR.setRotationPoint(0.0f, 1.6f, 0.0f);
        this.KneeR.addBox(-1.5f, -2.7f, -3.0f, 3, 4, 1, 0.0f);
        this.Bottom_1 = new ModelRenderer((ModelBase)this, 115, 47);
        this.Bottom_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Bottom_1.addBox(-3.0f, 9.3f, -8.1f, 6, 6, 14, 0.0f);
        this.Bottom = new ModelRenderer((ModelBase)this, 152, 29);
        this.Bottom.setRotationPoint(0.0f, -9.3f, 0.0f);
        this.Bottom.addBox(-2.0f, -6.2f, -2.0f, 4, 7, 4, 0.0f);
        this.setRotateAngle(this.Bottom, 0.3642502f, 0.0f, 0.0f);
        this.BodyTop = new ModelRenderer((ModelBase)this, 0, 34);
        this.BodyTop.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyTop.addBox(-7.0f, -9.6f, -6.0f, 14, 2, 13, 0.0f);
        this.ArmGunR1_1 = new ModelRenderer((ModelBase)this, 46, 114);
        this.ArmGunR1_1.setRotationPoint(-0.5f, 7.0f, -0.7f);
        this.ArmGunR1_1.addBox(-1.0f, 0.0f, -1.0f, 2, 3, 2, 0.0f);
        this.BodyBack = new ModelRenderer((ModelBase)this, 0, 54);
        this.BodyBack.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyBack.addBox(-7.0f, -6.5f, 8.3f, 14, 13, 2, 0.0f);
        this.BodyR = new ModelRenderer((ModelBase)this, 44, 42);
        this.BodyR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyR.addBox(-10.5f, -6.5f, -6.5f, 2, 13, 14, 0.0f);
        this.KneeL = new ModelRenderer((ModelBase)this, 25, 91);
        this.KneeL.mirror = true;
        this.KneeL.setRotationPoint(0.0f, 1.6f, 0.0f);
        this.KneeL.addBox(-1.5f, -2.7f, -3.0f, 3, 4, 1, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 46, 101);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(0.0f, 6.5f, 0.0f);
        this.ArmL3.addBox(-1.4f, 0.0f, -2.0f, 4, 7, 5, 0.0f);
        this.setRotateAngle(this.ArmL3, -1.2217305f, 0.0f, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 46, 91);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-1.3f, -0.4f, -1.1f, 2, 7, 2, 0.0f);
        this.setRotateAngle(this.ArmR2, 0.0f, 0.0f, 1.0471976f);
        this.ArmGunR1 = new ModelRenderer((ModelBase)this, 46, 114);
        this.ArmGunR1.setRotationPoint(0.5f, 7.0f, -0.7f);
        this.ArmGunR1.addBox(-1.0f, 0.0f, -1.0f, 2, 3, 2, 0.0f);
        this.FootL = new ModelRenderer((ModelBase)this, 1, 113);
        this.FootL.mirror = true;
        this.FootL.setRotationPoint(0.0f, 17.0f, 0.0f);
        this.FootL.addBox(-2.0f, 0.0f, -6.0f, 4, 2, 11, 0.0f);
        this.Tail3 = new ModelRenderer((ModelBase)this, 141, 29);
        this.Tail3.setRotationPoint(0.0f, -8.6f, 0.0f);
        this.Tail3.addBox(-1.0f, -9.0f, -1.0f, 2, 9, 2, 0.0f);
        this.setRotateAngle(this.Tail3, 0.5235988f, 0.0f, 0.0f);
        this.Leg2R = new ModelRenderer((ModelBase)this, 26, 73);
        this.Leg2R.setRotationPoint(0.0f, 4.6f, 0.0f);
        this.Leg2R.addBox(-1.5f, 0.0f, -1.5f, 3, 11, 3, 0.0f);
        this.setRotateAngle(this.Leg2R, -0.31415927f, 0.0f, 0.0f);
        this.Leg3R = new ModelRenderer((ModelBase)this, 1, 87);
        this.Leg3R.setRotationPoint(0.0f, 10.7f, -0.1f);
        this.Leg3R.addBox(-3.0f, -0.1f, -2.5f, 6, 18, 5, 0.0f);
        this.setRotateAngle(this.Leg3R, 0.31415927f, 0.0f, 0.0f);
        this.Leg2L = new ModelRenderer((ModelBase)this, 26, 73);
        this.Leg2L.mirror = true;
        this.Leg2L.setRotationPoint(0.0f, 4.6f, 0.0f);
        this.Leg2L.addBox(-1.5f, 0.0f, -1.5f, 3, 11, 3, 0.0f);
        this.setRotateAngle(this.Leg2L, -0.31415927f, 0.0f, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 78, 30);
        this.Head2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head2.addBox(-5.0f, -3.0f, -10.7f, 10, 14, 13, 0.0f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmR1.setRotationPoint(-10.0f, -18.0f, 0.0f);
        this.ArmR1.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 0);
        this.Body.setRotationPoint(0.0f, -17.0f, 0.0f);
        this.Body.addBox(-9.0f, -8.0f, -7.4f, 18, 16, 16, 0.0f);
        this.Tail2 = new ModelRenderer((ModelBase)this, 127, 28);
        this.Tail2.setRotationPoint(0.0f, -8.7f, 0.0f);
        this.Tail2.addBox(-1.5f, -9.0f, -1.5f, 3, 9, 3, 0.0f);
        this.setRotateAngle(this.Tail2, 0.6981317f, 0.0f, 0.0f);
        this.PlateR = new ModelRenderer((ModelBase)this, 44, 72);
        this.PlateR.setRotationPoint(-10.5f, -5.0f, 0.5f);
        this.PlateR.addBox(-1.0f, -0.4f, -3.5f, 1, 10, 7, 0.0f);
        this.setRotateAngle(this.PlateR, 0.0f, 0.0f, 1.7453293f);
        this.BodyBottom = new ModelRenderer((ModelBase)this, 0, 34);
        this.BodyBottom.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyBottom.addBox(-7.0f, 7.8f, -6.0f, 14, 2, 13, 0.0f);
        this.ArmGunR2_1 = new ModelRenderer((ModelBase)this, 46, 114);
        this.ArmGunR2_1.setRotationPoint(-0.5f, 7.0f, 1.7f);
        this.ArmGunR2_1.addBox(-1.0f, 0.0f, -1.0f, 2, 3, 2, 0.0f);
        this.Back = new ModelRenderer((ModelBase)this, 82, 62);
        this.Back.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back.addBox(-4.5f, -5.4f, 6.5f, 9, 14, 6, 0.0f);
        this.Leg1L = new ModelRenderer((ModelBase)this, 1, 71);
        this.Leg1L.setRotationPoint(10.7f, -9.5f, 1.5f);
        this.Leg1L.addBox(-3.0f, -2.0f, -3.0f, 5, 7, 6, 0.0f);
        this.Tail1 = new ModelRenderer((ModelBase)this, 127, 28);
        this.Tail1.setRotationPoint(0.0f, -4.6f, 11.0f);
        this.Tail1.addBox(-1.5f, -9.0f, -1.5f, 3, 9, 3, 0.0f);
        this.setRotateAngle(this.Tail1, -0.3642502f, 0.0f, 0.0f);
        this.FootR = new ModelRenderer((ModelBase)this, 1, 113);
        this.FootR.setRotationPoint(0.0f, 17.0f, 0.0f);
        this.FootR.addBox(-2.0f, 0.0f, -6.0f, 4, 2, 11, 0.0f);
        this.BodyFront = new ModelRenderer((ModelBase)this, 0, 54);
        this.BodyFront.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyFront.addBox(-7.0f, -6.5f, -8.9f, 14, 13, 2, 0.0f);
        this.Leg1R = new ModelRenderer((ModelBase)this, 1, 71);
        this.Leg1R.setRotationPoint(-10.7f, -9.5f, 1.5f);
        this.Leg1R.addBox(-2.0f, -2.0f, -3.0f, 5, 7, 6, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 46, 91);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(-0.6f, -0.4f, -1.2f, 2, 7, 2, 0.0f);
        this.setRotateAngle(this.ArmL2, 0.0f, 0.0f, -1.0471976f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmL1.setRotationPoint(10.0f, -18.0f, 0.0f);
        this.ArmL1.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.PlateL = new ModelRenderer((ModelBase)this, 44, 72);
        this.PlateL.mirror = true;
        this.PlateL.setRotationPoint(10.5f, -5.0f, 0.5f);
        this.PlateL.addBox(0.0f, -0.4f, -3.5f, 1, 10, 7, 0.0f);
        this.setRotateAngle(this.PlateL, 0.0f, 0.0f, -1.7453293f);
        this.ArmGunR2 = new ModelRenderer((ModelBase)this, 46, 114);
        this.ArmGunR2.setRotationPoint(0.5f, 7.0f, 1.7f);
        this.ArmGunR2.addBox(-1.0f, 0.0f, -1.0f, 2, 3, 2, 0.0f);
        this.Tail4 = new ModelRenderer((ModelBase)this, 141, 29);
        this.Tail4.setRotationPoint(0.0f, -8.6f, 0.0f);
        this.Tail4.addBox(-1.0f, -9.0f, -1.0f, 2, 9, 2, 0.0f);
        this.setRotateAngle(this.Tail4, 0.5235988f, 0.0f, 0.0f);
        this.BodyL = new ModelRenderer((ModelBase)this, 44, 42);
        this.BodyL.mirror = true;
        this.BodyL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyL.addBox(8.5f, -6.5f, -6.5f, 2, 13, 14, 0.0f);
        this.Body.addChild(this.Head1);
        this.Leg2L.addChild(this.Leg3L);
        this.ArmR2.addChild(this.ArmR3);
        this.Leg3R.addChild(this.KneeR);
        this.BodyBottom.addChild(this.Bottom_1);
        this.Tail4.addChild(this.Bottom);
        this.Body.addChild(this.BodyTop);
        this.ArmR3.addChild(this.ArmGunR1_1);
        this.Body.addChild(this.BodyBack);
        this.Body.addChild(this.BodyR);
        this.Leg3L.addChild(this.KneeL);
        this.ArmL2.addChild(this.ArmL3);
        this.ArmR1.addChild(this.ArmR2);
        this.ArmL3.addChild(this.ArmGunR1);
        this.Leg3L.addChild(this.FootL);
        this.Tail2.addChild(this.Tail3);
        this.Leg1R.addChild(this.Leg2R);
        this.Leg2R.addChild(this.Leg3R);
        this.Leg1L.addChild(this.Leg2L);
        this.Head1.addChild(this.Head2);
        this.Tail1.addChild(this.Tail2);
        this.BodyR.addChild(this.PlateR);
        this.Body.addChild(this.BodyBottom);
        this.ArmR3.addChild(this.ArmGunR2_1);
        this.BodyBack.addChild(this.Back);
        this.Back.addChild(this.Tail1);
        this.Leg3R.addChild(this.FootR);
        this.Body.addChild(this.BodyFront);
        this.ArmL1.addChild(this.ArmL2);
        this.BodyL.addChild(this.PlateL);
        this.ArmL3.addChild(this.ArmGunR2);
        this.Tail3.addChild(this.Tail4);
        this.Body.addChild(this.BodyL);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float F = 1.4f;
        JGRenderHelper.modelScalePositionHelper((float)1.4f);
        this.Body.render(f5);
        this.ArmR1.render(f5);
        this.ArmL1.render(f5);
        this.Leg1L.render(f5);
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
        float ex = par7Entity.ticksExisted;
        float r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        float r4 = MathHelper.cos((float)(ex / 8.0f)) / 5.0f + 0.1f;
        r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        r4 = MathHelper.cos((float)(ex / 8.0f)) / 3.0f - 0.2f;
        this.Leg1R.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.Leg1L.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.Leg1R.rotateAngleY = 0.0f;
        this.Leg1L.rotateAngleY = 0.0f;
        this.ArmR1.rotateAngleY = 0.0f;
        this.ArmL1.rotateAngleY = 0.0f;
    }
}

