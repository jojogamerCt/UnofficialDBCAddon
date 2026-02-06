/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbredribbon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelColonelViolet
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Body2;
    public ModelRenderer Boobs;
    public ModelRenderer Googles;
    public ModelRenderer Body3;
    public ModelRenderer Holster;

    public ModelColonelViolet() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Googles = new ModelRenderer((ModelBase)this, 26, 2);
        this.Googles.setRotationPoint(0.0f, 0.7f, -1.7f);
        this.Googles.addBox(-3.0f, 0.0f, 0.0f, 6, 3, 0, 0.0f);
        this.setRotateAngle(this.Googles, -0.5691519f, 0.0f, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 38);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-3.5f, 8.8f, -2.0f, 7, 2, 4, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 18, 47);
        this.ArmR.setRotationPoint(-4.3f, 3.0f, 0.0f);
        this.ArmR.addBox(-1.9f, -1.5f, -1.8f, 3, 11, 4, -0.1f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 30);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.0f, 5.8f, -1.6f, 6, 3, 3, 0.0f);
        this.Boobs = new ModelRenderer((ModelBase)this, 19, 31);
        this.Boobs.setRotationPoint(0.0f, -0.5f, 0.0f);
        this.Boobs.addBox(-3.0f, 2.0f, -0.6f, 6, 3, 2, 0.0f);
        this.setRotateAngle(this.Boobs, -0.59864795f, 0.0f, 0.0f);
        this.Holster = new ModelRenderer((ModelBase)this, 34, 7);
        this.Holster.setRotationPoint(-2.4f, 8.5f, -0.4f);
        this.Holster.addBox(-1.5f, -1.6f, -1.3f, 1, 5, 3, 0.0f);
        this.setRotateAngle(this.Holster, 0.5462881f, 0.0f, 0.22759093f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 1.5f, 0.0f);
        this.Head.addBox(-4.0f, -7.5f, -4.0f, 8, 8, 8, -0.5f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Body1.setRotationPoint(0.0f, 1.3f, 0.0f);
        this.Body1.addBox(-3.5f, 0.0f, -2.0f, 7, 6, 4, -0.2f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 46);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, -0.1f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 46);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, -0.1f);
        this.ArmL = new ModelRenderer((ModelBase)this, 18, 47);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.3f, 3.0f, 0.0f);
        this.ArmL.addBox(-1.1f, -1.5f, -1.8f, 3, 11, 4, -0.1f);
        this.Body1.addChild(this.Googles);
        this.Body2.addChild(this.Body3);
        this.Body1.addChild(this.Body2);
        this.Body1.addChild(this.Boobs);
        this.Body3.addChild(this.Holster);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Head.render(f5);
        this.Body1.render(f5);
        this.ArmR.render(f5);
        this.ArmL.render(f5);
        this.LegL.render(f5);
        this.LegR.render(f5);
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
        this.Head.rotateAngleY = n4 / (r2 / (float)Math.PI);
        this.Head.rotateAngleX = n5 / (r2 / (float)Math.PI);
        float ex = par7Entity.ticksExisted;
        float r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        float r4 = MathHelper.cos((float)(ex / 8.0f)) / 5.0f + 0.1f;
        r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        r4 = MathHelper.cos((float)(ex / 8.0f)) / 3.0f - 0.2f;
        this.LegR.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
    }
}

