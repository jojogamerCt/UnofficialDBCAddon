/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package JinRyuu.JRMCore.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAura
extends ModelBiped {
    ModelRenderer auro;
    public float inc = 1.6f;
    public float inc2 = 0.0f;
    public float[] offY = new float[]{-12.0f, -17.0f, -22.0f, -27.0f, -33.0f, -38.0f, -41.0f, -44.0f};
    public float[] offZ = new float[]{-8.0f, -5.5f, -3.0f, -1.5f, 0.0f, 3.0f, 5.0f, 8.0f};

    public ModelAura() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.auro = new ModelRenderer((ModelBase)this, 0, 0);
        this.auro.addBox(-10.0f, -17.0f, -8.0f, 20, 20, 0);
        this.auro.setRotationPoint(0.0f, 20.0f, 0.0f);
        this.setRotation(this.auro, 0.0f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.auro.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        float par3 = f2;
        if (par3 > f) {
            par3 -= f;
        }
        float maxageperc = 100.0f / f;
        float curperc = par3 * maxageperc;
        par3 = curperc * 0.01f * 20.0f;
        this.auro.rotationPointY = 55.0f + par3;
        this.auro.offsetY = -par3 * 0.2f;
        this.auro.offsetZ = par3 < 8.0f ? 0.4f - par3 * 0.1f : -0.3f + (par3 - 7.0f) * 0.053f;
        float ff = par3 * this.inc / 3.2f;
        this.auro.rotateAngleX = 0.8726646f - curperc * 0.01f - f1;
    }

    public void renderModel(Entity entity, float f, float r, float w, float s) {
        this.render(entity, s, w, r, 0.0f, 0.0f, f);
    }

    public int func_78104_a() {
        return 8;
    }
}

