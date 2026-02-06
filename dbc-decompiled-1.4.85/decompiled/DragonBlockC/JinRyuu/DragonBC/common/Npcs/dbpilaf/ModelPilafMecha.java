/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbpilaf;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPilafMecha
extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
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
    public ModelRenderer PlateR;
    public ModelRenderer PlateL;
    public ModelRenderer Head2;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer ArmR4;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;
    public ModelRenderer ArmL4;
    public ModelRenderer Leg2L;
    public ModelRenderer Leg3L;
    public ModelRenderer KneeL;
    public ModelRenderer FootL;
    public ModelRenderer Leg2R;
    public ModelRenderer Leg3R;
    public ModelRenderer KneeR;
    public ModelRenderer FootR;

    public ModelPilafMecha() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head2 = new ModelRenderer((ModelBase)this, 78, 26);
        this.Head2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head2.addBox(-4.0f, -10.5f, -10.0f, 8, 12, 11, 0.0f);
        this.FootR = new ModelRenderer((ModelBase)this, 1, 91);
        this.FootR.setRotationPoint(0.0f, 9.0f, 0.0f);
        this.FootR.addBox(-2.0f, -0.1f, -6.0f, 4, 2, 11, 0.0f);
        this.Back = new ModelRenderer((ModelBase)this, 82, 62);
        this.Back.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back.addBox(-4.0f, -8.5f, 4.7f, 8, 11, 6, 0.0f);
        this.BodyL = new ModelRenderer((ModelBase)this, 44, 29);
        this.BodyL.mirror = true;
        this.BodyL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyL.addBox(7.5f, -6.5f, -6.0f, 2, 10, 11, 0.0f);
        this.KneeR = new ModelRenderer((ModelBase)this, 20, 79);
        this.KneeR.setRotationPoint(0.1f, 1.6f, 0.0f);
        this.KneeR.addBox(-1.0f, -2.7f, -3.0f, 2, 3, 2, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 43, 71);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(-0.6f, -0.4f, -1.2f, 2, 7, 2, 0.0f);
        this.setRotateAngle(this.ArmL2, 0.0f, 0.0f, -0.6981317f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 43, 71);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-1.3f, -0.4f, -1.1f, 2, 7, 2, 0.0f);
        this.setRotateAngle(this.ArmR2, 0.0f, 0.0f, 0.6981317f);
        this.BodyR = new ModelRenderer((ModelBase)this, 44, 29);
        this.BodyR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyR.addBox(-9.5f, -6.5f, -6.0f, 2, 10, 11, 0.0f);
        this.Leg2L = new ModelRenderer((ModelBase)this, 20, 68);
        this.Leg2L.mirror = true;
        this.Leg2L.setRotationPoint(0.0f, 1.6f, 0.0f);
        this.Leg2L.addBox(-1.0f, -0.1f, -1.0f, 2, 6, 2, 0.0f);
        this.setRotateAngle(this.Leg2L, -0.31415927f, -0.06981317f, -0.6370452f);
        this.PlateR = new ModelRenderer((ModelBase)this, 44, 52);
        this.PlateR.setRotationPoint(-10.0f, -5.0f, 0.0f);
        this.PlateR.addBox(-1.0f, -0.4f, -3.5f, 1, 8, 7, 0.0f);
        this.setRotateAngle(this.PlateR, 0.0f, 0.0f, 1.7453293f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 44, 82);
        this.ArmR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR3.addBox(-2.5f, 5.8f, 1.5f, 4, 7, 3, 0.0f);
        this.setRotateAngle(this.ArmR3, -0.4553564f, 0.0f, 0.0f);
        this.Leg1R = new ModelRenderer((ModelBase)this, 3, 68);
        this.Leg1R.setRotationPoint(-5.5f, 7.4f, 1.5f);
        this.Leg1R.addBox(-1.5f, -1.5f, -1.5f, 3, 3, 3, 0.0f);
        this.FootL = new ModelRenderer((ModelBase)this, 1, 91);
        this.FootL.mirror = true;
        this.FootL.setRotationPoint(0.0f, 9.0f, 0.0f);
        this.FootL.addBox(-2.0f, -0.1f, -6.0f, 4, 2, 11, 0.0f);
        this.PlateL = new ModelRenderer((ModelBase)this, 44, 52);
        this.PlateL.mirror = true;
        this.PlateL.setRotationPoint(10.0f, -5.0f, 0.0f);
        this.PlateL.addBox(0.0f, -0.4f, -3.5f, 1, 8, 7, 0.0f);
        this.setRotateAngle(this.PlateL, 0.0f, 0.0f, -1.7453293f);
        this.BodyTop = new ModelRenderer((ModelBase)this, 0, 34);
        this.BodyTop.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyTop.addBox(-5.5f, -9.6f, -5.0f, 11, 2, 10, 0.0f);
        this.Leg3L = new ModelRenderer((ModelBase)this, 1, 76);
        this.Leg3L.mirror = true;
        this.Leg3L.setRotationPoint(0.0f, 5.3f, -0.1f);
        this.Leg3L.addBox(-2.0f, -0.1f, -2.0f, 4, 9, 4, 0.0f);
        this.setRotateAngle(this.Leg3L, 0.31415927f, -0.14486232f, 0.6161012f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmR1.setRotationPoint(-9.0f, 1.0f, 0.0f);
        this.ArmR1.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 0);
        this.Body.setRotationPoint(0.0f, 4.0f, 0.0f);
        this.Body.addBox(-7.5f, -8.0f, -7.0f, 15, 13, 13, 0.0f);
        this.Head1 = new ModelRenderer((ModelBase)this, 72, 0);
        this.Head1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head1.addBox(-5.0f, -10.0f, -9.6f, 10, 12, 12, 0.0f);
        this.ArmR4 = new ModelRenderer((ModelBase)this, 44, 93);
        this.ArmR4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR4.addBox(-2.4f, 12.6f, 1.0f, 3, 4, 4, 0.0f);
        this.setRotateAngle(this.ArmR4, -0.4553564f, -0.1829105f, 0.0f);
        this.BodyFront = new ModelRenderer((ModelBase)this, 1, 51);
        this.BodyFront.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyFront.addBox(-6.0f, -6.5f, -9.0f, 12, 10, 2, 0.0f);
        this.setRotateAngle(this.BodyFront, 0.0f, -0.014486233f, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 44, 82);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL3.addBox(-1.4f, 5.8f, 1.5f, 4, 7, 3, 0.0f);
        this.setRotateAngle(this.ArmL3, -0.4553564f, 0.0f, 0.0f);
        this.ArmL4 = new ModelRenderer((ModelBase)this, 44, 93);
        this.ArmL4.mirror = true;
        this.ArmL4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL4.addBox(-0.6f, 12.6f, 1.0f, 3, 4, 4, 0.0f);
        this.setRotateAngle(this.ArmL4, -0.4553564f, 0.16475908f, 0.0f);
        this.Leg2R = new ModelRenderer((ModelBase)this, 20, 68);
        this.Leg2R.setRotationPoint(0.0f, 1.6f, 0.0f);
        this.Leg2R.addBox(-1.0f, -0.1f, -1.0f, 2, 6, 2, 0.0f);
        this.setRotateAngle(this.Leg2R, -0.31415927f, 0.06981317f, 0.6370452f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmL1.setRotationPoint(9.0f, 1.0f, 0.0f);
        this.ArmL1.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.Leg3R = new ModelRenderer((ModelBase)this, 1, 76);
        this.Leg3R.setRotationPoint(0.0f, 5.3f, -0.1f);
        this.Leg3R.addBox(-2.0f, -0.1f, -2.0f, 4, 9, 4, 0.0f);
        this.setRotateAngle(this.Leg3R, 0.31415927f, 0.14486232f, -0.6161012f);
        this.BodyBottom = new ModelRenderer((ModelBase)this, 0, 34);
        this.BodyBottom.setRotationPoint(0.0f, -2.5f, 0.0f);
        this.BodyBottom.addBox(-5.5f, 7.5f, -5.0f, 11, 2, 10, 0.0f);
        this.Leg1L = new ModelRenderer((ModelBase)this, 3, 68);
        this.Leg1L.setRotationPoint(5.5f, 7.4f, 1.5f);
        this.Leg1L.addBox(-1.5f, -1.5f, -1.5f, 3, 3, 3, 0.0f);
        this.KneeL = new ModelRenderer((ModelBase)this, 20, 79);
        this.KneeL.mirror = true;
        this.KneeL.setRotationPoint(0.1f, 1.6f, 0.0f);
        this.KneeL.addBox(-1.0f, -2.7f, -3.0f, 2, 3, 2, 0.0f);
        this.BodyBack = new ModelRenderer((ModelBase)this, 1, 51);
        this.BodyBack.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyBack.addBox(-6.0f, -6.5f, 6.0f, 12, 10, 2, 0.0f);
        this.Head1.addChild(this.Head2);
        this.Leg3R.addChild(this.FootR);
        this.BodyBack.addChild(this.Back);
        this.Body.addChild(this.BodyL);
        this.Leg3R.addChild(this.KneeR);
        this.ArmL1.addChild(this.ArmL2);
        this.ArmR1.addChild(this.ArmR2);
        this.Body.addChild(this.BodyR);
        this.Leg1L.addChild(this.Leg2L);
        this.BodyR.addChild(this.PlateR);
        this.ArmR2.addChild(this.ArmR3);
        this.Leg3L.addChild(this.FootL);
        this.BodyL.addChild(this.PlateL);
        this.Body.addChild(this.BodyTop);
        this.Leg2L.addChild(this.Leg3L);
        this.Body.addChild(this.Head1);
        this.ArmR2.addChild(this.ArmR4);
        this.Body.addChild(this.BodyFront);
        this.ArmL2.addChild(this.ArmL3);
        this.ArmL2.addChild(this.ArmL4);
        this.Leg1R.addChild(this.Leg2R);
        this.Leg2R.addChild(this.Leg3R);
        this.Body.addChild(this.BodyBottom);
        this.Leg3L.addChild(this.KneeL);
        this.Body.addChild(this.BodyBack);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Body.render(f5);
        this.ArmR1.render(f5);
        this.ArmL1.render(f5);
        this.Leg1L.render(f5);
        this.Leg1R.render(f5);
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

