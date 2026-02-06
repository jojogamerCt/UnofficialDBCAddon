/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package JinRyuu.JRMCore.m;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class mEnergy3
extends ModelBiped {
    ModelRenderer bShape1;
    ModelRenderer bShape2;

    public mEnergy3() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.bShape1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bShape1.addBox(-10.0f, -10.0f, -10.0f, 20, 20, 20);
        this.bShape1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bShape1.setTextureSize(128, 128);
        this.setRotation(this.bShape1, 0.0f, 0.0f, 0.0f);
        this.bShape2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.bShape2.addBox(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.bShape2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bShape2.setTextureSize(128, 128);
        this.setRotation(this.bShape1, 0.0f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    }

    public void render(ModelRenderer a, Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        a.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        float par3;
        this.bShape1.rotateAngleZ = par3 = f2;
        this.bShape1.rotateAngleY = par3;
        this.bShape1.rotateAngleX = par3;
        this.bShape2.rotateAngleZ = par3;
        this.bShape2.rotateAngleY = par3;
        this.bShape2.rotateAngleX = par3;
    }

    public void renderModel(byte type, Entity entity, float par8, float par9, float f, float r, boolean b) {
        ModelRenderer render = null;
        if (type == 1) {
            render = this.bShape1;
        }
        if (type == 2) {
            render = this.bShape2;
        }
        if (render != null) {
            this.render(render, entity, 0.0f, 0.0f, r, par8, par9, f);
        }
    }
}

