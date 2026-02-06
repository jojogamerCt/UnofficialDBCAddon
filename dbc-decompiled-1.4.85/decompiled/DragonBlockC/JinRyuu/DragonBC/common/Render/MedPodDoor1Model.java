/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class MedPodDoor1Model
extends ModelBase {
    ModelRenderer Shape1;
    ModelRenderer Shape2;

    public MedPodDoor1Model() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape1.addBox(0.0f, 0.0f, 0.0f, 8, 16, 4);
        this.Shape1.setRotationPoint(-8.0f, 0.0f, 0.0f);
        this.Shape1.setTextureSize(64, 32);
        this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
        this.Shape2 = new ModelRenderer((ModelBase)this, 24, 0);
        this.Shape2.addBox(0.0f, 0.0f, 0.0f, 8, 16, 4);
        this.Shape2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.render2(entity, f, f1, f2, f3, f4, f5);
    }

    private void render2(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        int meta = (int)f4;
        int moving = (int)f3;
        if (meta == 3 || meta == 7) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(0.0f - (float)moving * 0.02f), (float)0.0f, (float)0.0f);
            this.Shape1.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(0.0f + (float)moving * 0.02f), (float)0.0f, (float)0.0f);
            this.Shape2.render(f5);
            GL11.glPopMatrix();
        } else if (meta == 1 || meta == 5) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(0.0f - (float)moving * 0.02f), (float)0.0f, (float)0.0f);
            this.Shape1.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(0.0f + (float)moving * 0.02f), (float)0.0f, (float)0.0f);
            this.Shape2.render(f5);
            GL11.glPopMatrix();
        } else if (meta == 0 || meta == 4) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(0.0f - (float)moving * 0.02f), (float)0.0f, (float)0.0f);
            this.Shape1.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(0.0f + (float)moving * 0.02f), (float)0.0f, (float)0.0f);
            this.Shape2.render(f5);
            GL11.glPopMatrix();
        } else if (meta == 2 || meta == 6) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(0.0f - (float)moving * 0.02f), (float)0.0f, (float)0.0f);
            this.Shape1.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(0.0f + (float)moving * 0.02f), (float)0.0f, (float)0.0f);
            this.Shape2.render(f5);
            GL11.glPopMatrix();
        }
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity) {
    }

    public void renderModel(int v, int m, float f) {
        this.render(null, 0.0f, 0.0f, 0.0f, v, m, f);
    }
}

