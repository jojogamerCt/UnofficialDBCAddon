/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPorungaOld
extends ModelBiped {
    ModelRenderer dragon1;
    ModelRenderer dragon2;
    ModelRenderer dragon3;
    ModelRenderer dragon4;
    ModelRenderer dragon5;
    ModelRenderer dragon8;
    ModelRenderer dragon10;
    ModelRenderer dragon12;
    ModelRenderer dragon13;
    ModelRenderer dragon14;
    ModelRenderer dragon15;
    ModelRenderer dragon16;
    ModelRenderer dragon17;
    ModelRenderer dragon18;
    ModelRenderer dragon19;
    ModelRenderer dragon20;
    ModelRenderer dragon22;
    ModelRenderer dragon23;
    ModelRenderer dragon24;

    public ModelPorungaOld() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.dragon1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.dragon1.addBox(-4.0f, -4.0f, -4.0f, 8, 16, 8);
        this.dragon1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon1.setTextureSize(256, 128);
        this.dragon1.mirror = true;
        this.dragon2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.dragon2.addBox(-4.0f, -18.0f, -3.0f, 8, 16, 8);
        this.dragon2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon2.setTextureSize(256, 128);
        this.setRotation(this.dragon2, 0.4537856f, 0.0174533f, 0.0f);
        this.dragon3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.dragon3.addBox(-4.0f, -25.0f, -16.0f, 8, 16, 8);
        this.dragon3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon3.setTextureSize(256, 128);
        this.setRotation(this.dragon3, -0.4363323f, 0.0f, 0.0f);
        this.dragon4 = new ModelRenderer((ModelBase)this, 40, 37);
        this.dragon4.addBox(-3.0f, -91.0f, 11.0f, 11, 4, 4);
        this.dragon4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon4.setTextureSize(256, 128);
        this.setRotation(this.dragon4, 0.2443461f, -0.3839724f, 0.0f);
        this.dragon5 = new ModelRenderer((ModelBase)this, 0, 47);
        this.dragon5.addBox(-5.0f, -80.0f, 44.0f, 10, 10, 10);
        this.dragon5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon5.setTextureSize(256, 128);
        this.setRotation(this.dragon5, 0.6806784f, 0.0f, 0.0f);
        this.dragon8 = new ModelRenderer((ModelBase)this, 152, 0);
        this.dragon8.addBox(-17.0f, -85.0f, 13.0f, 36, 20, 16);
        this.dragon8.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon8.setTextureSize(256, 128);
        this.setRotation(this.dragon8, 0.2443461f, 0.0174533f, 0.0f);
        this.dragon10 = new ModelRenderer((ModelBase)this, 40, 37);
        this.dragon10.addBox(-8.0f, -91.0f, 11.0f, 11, 4, 4);
        this.dragon10.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon10.setTextureSize(256, 128);
        this.setRotation(this.dragon10, 0.2443461f, 0.3839724f, 0.0f);
        this.dragon12 = new ModelRenderer((ModelBase)this, 0, 24);
        this.dragon12.addBox(-3.0f, 7.0f, -6.0f, 6, 16, 6);
        this.dragon12.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon12.setTextureSize(256, 128);
        this.setRotation(this.dragon12, 0.2617994f, 0.0f, 0.0f);
        this.dragon13 = new ModelRenderer((ModelBase)this, 40, 45);
        this.dragon13.addBox(3.0f, -61.0f, 71.0f, 4, 4, 12);
        this.dragon13.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon13.setTextureSize(256, 128);
        this.setRotation(this.dragon13, 0.9773844f, 0.2094395f, 0.0f);
        this.dragon14 = new ModelRenderer((ModelBase)this, 40, 45);
        this.dragon14.addBox(-7.0f, -61.0f, 71.0f, 4, 4, 12);
        this.dragon14.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon14.setTextureSize(256, 128);
        this.setRotation(this.dragon14, 0.9773844f, -0.2094395f, 0.0f);
        this.dragon15 = new ModelRenderer((ModelBase)this, 80, 0);
        this.dragon15.addBox(-12.0f, -76.0f, -8.0f, 24, 24, 12);
        this.dragon15.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon15.setTextureSize(256, 128);
        this.setRotation(this.dragon15, -0.0872665f, 0.0f, 0.0f);
        this.dragon16 = new ModelRenderer((ModelBase)this, 32, 0);
        this.dragon16.addBox(-7.0f, -53.0f, -9.0f, 14, 27, 10);
        this.dragon16.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon16.setTextureSize(256, 128);
        this.setRotation(this.dragon16, -0.122173f, 0.0f, 0.0f);
        this.dragon17 = new ModelRenderer((ModelBase)this, 0, 90);
        this.dragon17.addBox(-43.0f, -58.0f, -19.0f, 13, 26, 12);
        this.dragon17.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon17.setTextureSize(256, 128);
        this.setRotation(this.dragon17, -0.2617994f, -0.0174533f, 0.1745329f);
        this.dragon18 = new ModelRenderer((ModelBase)this, 50, 90);
        this.dragon18.addBox(-43.0f, -84.0f, -4.0f, 13, 26, 12);
        this.dragon18.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon18.setTextureSize(256, 128);
        this.setRotation(this.dragon18, 0.0f, 0.0f, 0.1745329f);
        this.dragon19 = new ModelRenderer((ModelBase)this, 50, 90);
        this.dragon19.mirror = true;
        this.dragon19.addBox(32.0f, -84.0f, -4.0f, 13, 26, 12);
        this.dragon19.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon19.setTextureSize(256, 128);
        this.setRotation(this.dragon19, 0.0f, 0.0f, -0.1745329f);
        this.dragon20 = new ModelRenderer((ModelBase)this, 0, 90);
        this.dragon20.mirror = true;
        this.dragon20.addBox(32.0f, -58.0f, -19.0f, 13, 26, 12);
        this.dragon20.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon20.setTextureSize(256, 128);
        this.setRotation(this.dragon20, -0.2617994f, 0.0174533f, -0.1745329f);
        this.dragon22 = new ModelRenderer((ModelBase)this, 116, 88);
        this.dragon22.addBox(0.0f, -92.0f, 22.0f, 0, 27, 13);
        this.dragon22.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon22.setTextureSize(256, 128);
        this.setRotation(this.dragon22, 0.2443461f, 0.0174533f, 0.0f);
        this.dragon23 = new ModelRenderer((ModelBase)this, 100, 73);
        this.dragon23.addBox(0.0f, -74.0f, -9.0f, 0, 47, 8);
        this.dragon23.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon23.setTextureSize(256, 128);
        this.setRotation(this.dragon23, -0.2617994f, 0.0f, 0.0f);
        this.dragon24 = new ModelRenderer((ModelBase)this, 1, 52);
        this.dragon24.addBox(-4.0f, -75.1f, 43.0f, 8, 5, 10);
        this.dragon24.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.dragon24.setTextureSize(256, 128);
        this.setRotation(this.dragon24, 0.6806784f, 0.0f, 0.0f);
        this.dragon1.addChild(this.dragon2);
        this.dragon1.addChild(this.dragon3);
        this.dragon1.addChild(this.dragon4);
        this.dragon1.addChild(this.dragon5);
        this.dragon1.addChild(this.dragon8);
        this.dragon1.addChild(this.dragon10);
        this.dragon1.addChild(this.dragon12);
        this.dragon1.addChild(this.dragon13);
        this.dragon1.addChild(this.dragon14);
        this.dragon1.addChild(this.dragon15);
        this.dragon1.addChild(this.dragon16);
        this.dragon1.addChild(this.dragon17);
        this.dragon1.addChild(this.dragon18);
        this.dragon1.addChild(this.dragon19);
        this.dragon1.addChild(this.dragon20);
        this.dragon1.addChild(this.dragon22);
        this.dragon1.addChild(this.dragon23);
        this.dragon1.addChild(this.dragon24);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.dragon1.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    }

    public void renderModel(Entity entity, float f) {
        this.render(entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f);
    }
}

