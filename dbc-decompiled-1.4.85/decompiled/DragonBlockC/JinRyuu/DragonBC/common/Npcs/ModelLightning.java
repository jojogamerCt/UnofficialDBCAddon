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

public class ModelLightning
extends ModelBiped {
    ModelRenderer Shape1;
    ModelRenderer Shape2;

    public ModelLightning() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape1.addBox(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        this.Shape1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape1.setTextureSize(64, 32);
        this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
        this.Shape2 = new ModelRenderer((ModelBase)this, 0, 42);
        this.Shape2.addBox(-15.0f, -15.0f, -15.0f, 30, 30, 30);
        this.Shape2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape2.setTextureSize(64, 32);
        this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        float par3 = f2;
        float par31 = 1.0f;
        this.Shape1.rotationPointY = 3.0f;
        this.Shape1.rotateAngleY = par3 * 2.0f;
        this.Shape2.rotationPointY = 3.0f;
        this.Shape2.rotateAngleY = -par3 * 2.0f;
        this.Shape2.rotateAngleX = -par3 / 3.0f;
        this.Shape2.rotateAngleZ = -par3 / 3.0f;
        this.Shape1.rotateAngleX = -par3 / 3.0f;
        this.Shape1.rotateAngleZ = -par3 / 3.0f;
    }

    public void renderModel(Entity entity, float par8, float par9, float f, float r) {
        this.render(entity, 0.0f, 0.0f, r, par8, par9, f);
    }
}

