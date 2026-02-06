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

public class ModelKiAuraRing
extends ModelBiped {
    ModelRenderer low;
    ModelRenderer lowm1;
    ModelRenderer lowm2;
    ModelRenderer lowm3;
    ModelRenderer lowm4;
    ModelRenderer lowm5;
    ModelRenderer lowm6;
    ModelRenderer lowm7;
    ModelRenderer lowm8;

    public ModelKiAuraRing() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.low = new ModelRenderer((ModelBase)this, 32, 0);
        this.low.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.low.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.setRotation(this.low, 0.0f, 0.0f, 0.0f);
        this.lowm1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.lowm1.addBox(-5.0f, -12.0f, -8.0f, 10, 10, 0);
        this.lowm1.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.lowm1.setTextureSize(64, 32);
        this.setRotation(this.lowm1, 0.8726646f, 1.570796f, 0.0f);
        this.lowm2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.lowm2.addBox(-5.0f, -12.0f, -8.0f, 10, 10, 0);
        this.lowm2.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.lowm2.setTextureSize(64, 32);
        this.setRotation(this.lowm2, 0.8726646f, 0.0f, 0.0f);
        this.lowm3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.lowm3.addBox(-5.0f, -12.0f, -8.0f, 10, 10, 0);
        this.lowm3.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.lowm3.setTextureSize(64, 32);
        this.setRotation(this.lowm3, 0.8726646f, -0.7853982f, 0.0f);
        this.lowm4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.lowm4.addBox(-5.0f, -12.0f, -8.0f, 10, 10, 0);
        this.lowm4.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.lowm4.setTextureSize(64, 32);
        this.setRotation(this.lowm4, 0.8726646f, 3.141593f, 0.0f);
        this.lowm5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.lowm5.addBox(-5.0f, -12.0f, -8.0f, 10, 10, 0);
        this.lowm5.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.lowm5.setTextureSize(64, 32);
        this.setRotation(this.lowm5, 0.8726646f, -1.570796f, 0.0f);
        this.lowm6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.lowm6.addBox(-5.0f, -12.0f, -8.0f, 10, 10, 0);
        this.lowm6.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.lowm6.setTextureSize(64, 32);
        this.setRotation(this.lowm6, 0.8726646f, -2.373648f, 0.0f);
        this.lowm7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.lowm7.addBox(-5.0f, -12.0f, -8.0f, 10, 10, 0);
        this.lowm7.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.lowm7.setTextureSize(64, 32);
        this.setRotation(this.lowm7, 0.8726646f, 2.373648f, 0.0f);
        this.lowm8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.lowm8.addBox(-5.0f, -12.0f, -8.0f, 10, 10, 0);
        this.lowm8.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.lowm8.setTextureSize(64, 32);
        this.setRotation(this.lowm8, 0.8726646f, 0.7853982f, 0.0f);
        this.low.addChild(this.lowm1);
        this.low.addChild(this.lowm2);
        this.low.addChild(this.lowm3);
        this.low.addChild(this.lowm4);
        this.low.addChild(this.lowm5);
        this.low.addChild(this.lowm6);
        this.low.addChild(this.lowm7);
        this.low.addChild(this.lowm8);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.low.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        float par3 = f2;
        float par31 = 1.0f;
        this.low.rotationPointY = 28.0f;
        this.low.rotateAngleY = -par3 / 5.0f;
    }

    public void renderModel(Entity entity, float par8, float par9, float f, float r) {
        this.render(entity, 0.0f, 0.0f, r, par8, par9, f);
    }
}

