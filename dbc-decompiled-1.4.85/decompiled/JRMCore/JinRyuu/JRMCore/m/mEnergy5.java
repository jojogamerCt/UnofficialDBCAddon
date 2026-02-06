/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package JinRyuu.JRMCore.m;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class mEnergy5
extends ModelBase {
    public ModelRenderer Base1;
    public ModelRenderer Base1Front;
    public ModelRenderer Base1Back;
    public ModelRenderer Base1Side_Ball;
    public ModelRenderer Base1Side_Jobb;
    public ModelRenderer Base1Top;
    public ModelRenderer Base1Bottom;
    public ModelRenderer Base1Front2;
    public ModelRenderer Base1Back2;
    public ModelRenderer Base1Side_Ball2;
    public ModelRenderer Base1Side_Jobb2;
    public ModelRenderer Base1Top2;
    public ModelRenderer Base1Bottom2;

    public mEnergy5() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Base1Bottom = new ModelRenderer((ModelBase)this, 38, 36);
        this.Base1Bottom.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Bottom.addBox(-3.0f, 3.0f, -3.0f, 6, 2, 6, 0.0f);
        this.Base1Side_Jobb2 = new ModelRenderer((ModelBase)this, 19, 45);
        this.Base1Side_Jobb2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Side_Jobb2.addBox(-2.0f, -2.0f, 3.5f, 4, 4, 2, 0.0f);
        this.Base1Side_Ball = new ModelRenderer((ModelBase)this, 19, 20);
        this.Base1Side_Ball.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Side_Ball.addBox(-3.0f, -3.0f, -5.0f, 6, 6, 2, 0.0f);
        this.Base1Side_Ball2 = new ModelRenderer((ModelBase)this, 19, 29);
        this.Base1Side_Ball2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Side_Ball2.addBox(-2.0f, -2.0f, -5.5f, 4, 4, 2, 0.0f);
        this.Base1Front2 = new ModelRenderer((ModelBase)this, 0, 30);
        this.Base1Front2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Front2.addBox(-5.5f, -2.0f, -2.0f, 2, 4, 4, 0.0f);
        this.setRotateAngle(this.Base1Front2, 0.0f, -0.008901179f, 0.0f);
        this.Base1Front = new ModelRenderer((ModelBase)this, 0, 17);
        this.Base1Front.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Front.addBox(-5.0f, -3.0f, -3.0f, 2, 6, 6, 0.0f);
        this.Base1Side_Jobb = new ModelRenderer((ModelBase)this, 19, 36);
        this.Base1Side_Jobb.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Side_Jobb.addBox(-3.0f, -3.0f, 3.0f, 6, 6, 2, 0.0f);
        this.Base1Bottom2 = new ModelRenderer((ModelBase)this, 38, 45);
        this.Base1Bottom2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Bottom2.addBox(-2.0f, 3.5f, -2.0f, 4, 2, 4, 0.0f);
        this.Base1Back2 = new ModelRenderer((ModelBase)this, 0, 52);
        this.Base1Back2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Back2.addBox(3.5f, -2.0f, -2.0f, 2, 4, 4, 0.0f);
        this.Base1Top2 = new ModelRenderer((ModelBase)this, 38, 29);
        this.Base1Top2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Top2.addBox(-2.0f, -5.5f, -2.0f, 4, 2, 4, 0.0f);
        this.Base1Top = new ModelRenderer((ModelBase)this, 38, 20);
        this.Base1Top.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Top.addBox(-3.0f, -5.0f, -3.0f, 6, 2, 6, 0.0f);
        this.Base1Back = new ModelRenderer((ModelBase)this, 0, 39);
        this.Base1Back.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1Back.addBox(3.0f, -3.0f, -3.0f, 2, 6, 6, 0.0f);
        this.Base1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Base1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base1.addBox(-4.0f, -4.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Base1.addChild(this.Base1Bottom);
        this.Base1Side_Jobb.addChild(this.Base1Side_Jobb2);
        this.Base1.addChild(this.Base1Side_Ball);
        this.Base1Side_Ball.addChild(this.Base1Side_Ball2);
        this.Base1Front.addChild(this.Base1Front2);
        this.Base1.addChild(this.Base1Front);
        this.Base1.addChild(this.Base1Side_Jobb);
        this.Base1Bottom.addChild(this.Base1Bottom2);
        this.Base1Back.addChild(this.Base1Back2);
        this.Base1Top.addChild(this.Base1Top2);
        this.Base1.addChild(this.Base1Top);
        this.Base1.addChild(this.Base1Back);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Base1.render(f5);
    }

    public void render() {
        float f5 = 0.0625f;
        this.Base1.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        float par3 = f2;
        float par31 = 1.0f;
        this.Base1.rotateAngleZ = par3;
        this.Base1.rotateAngleY = par3;
        this.Base1.rotateAngleX = par3;
    }

    public void renderModel(Entity entity, float par8, float par9, float f, float r) {
        this.render(entity, 0.0f, 0.0f, r, par8, par9, f);
    }
}

