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

public class ModelKiMakanko
extends ModelBiped {
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;

    public ModelKiMakanko() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Shape1 = new ModelRenderer((ModelBase)this, 0, 8);
        this.Shape1.addBox(-3.0f, -3.0f, -7.0f, 6, 6, 14);
        this.Shape1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape1.setTextureSize(128, 128);
        this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
        this.Shape2 = new ModelRenderer((ModelBase)this, 0, 8);
        this.Shape2.addBox(-2.0f, -2.0f, -8.0f, 4, 4, 16);
        this.Shape2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape2.setTextureSize(128, 128);
        this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
        this.Shape3 = new ModelRenderer((ModelBase)this, 0, 8);
        this.Shape3.addBox(-2.0f, -4.0f, -6.0f, 4, 8, 12);
        this.Shape3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape3.setTextureSize(128, 128);
        this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
        this.Shape4 = new ModelRenderer((ModelBase)this, 0, 8);
        this.Shape4.addBox(-4.0f, -2.0f, -6.0f, 8, 4, 12);
        this.Shape4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape4.setTextureSize(128, 128);
        this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
        this.Shape5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape5.addBox(6.0f, -3.0f, -5.0f, 1, 6, 1);
        this.Shape5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape5.setTextureSize(128, 128);
        this.setRotation(this.Shape5, -0.3490659f, 0.0f, 0.0f);
        this.Shape6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape6.addBox(7.0f, -3.0f, -3.0f, 1, 6, 1);
        this.Shape6.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape6.setTextureSize(128, 128);
        this.setRotation(this.Shape6, -0.3490659f, 0.0f, -0.7853982f);
        this.Shape7 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape7.addBox(-3.533333f, -8.2f, -0.5333334f, 7, 1, 1);
        this.Shape7.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape7.setTextureSize(128, 128);
        this.setRotation(this.Shape7, 0.0f, 0.4537856f, 0.0f);
        this.Shape8 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape8.addBox(-3.0f, -8.0f, -0.4666667f, 6, 1, 1);
        this.Shape8.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape8.setTextureSize(128, 128);
        this.setRotation(this.Shape8, 0.0f, 0.4014257f, -0.7853982f);
        this.Shape9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape9.addBox(-7.0f, -3.0f, 3.0f, 1, 6, 1);
        this.Shape9.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape9.setTextureSize(128, 128);
        this.setRotation(this.Shape9, 0.3490659f, 0.0f, 0.0f);
        this.Shape1.addChild(this.Shape2);
        this.Shape1.addChild(this.Shape3);
        this.Shape1.addChild(this.Shape4);
        this.Shape7.addChild(this.Shape5);
        this.Shape7.addChild(this.Shape6);
        this.Shape7.addChild(this.Shape8);
        this.Shape7.addChild(this.Shape9);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Shape1.render(f5);
        this.Shape7.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        float par3 = f2;
        float par31 = 1.0f;
        this.Shape1.rotateAngleZ = par3;
        this.Shape7.rotateAngleZ = -par3;
    }

    public void renderModel(Entity entity, float par8, float par9, float f, float r) {
        this.render(entity, 0.0f, 0.0f, r, par8, par9, f);
    }
}

