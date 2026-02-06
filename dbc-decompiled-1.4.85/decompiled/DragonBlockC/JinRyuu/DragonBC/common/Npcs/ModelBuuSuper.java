/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBuuSuper
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Head2;
    public ModelRenderer Head3;
    public ModelRenderer Head4;
    public ModelRenderer Hips;
    public ModelRenderer Torso;
    public ModelRenderer ChestR;
    public ModelRenderer FootR;
    public ModelRenderer FootL;

    public ModelBuuSuper() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body = new ModelRenderer((ModelBase)this, 22, 29);
        this.Body.setRotationPoint(0.0f, -2.7f, 0.0f);
        this.Body.addBox(-3.5f, 2.6f, -1.9f, 7, 7, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 28);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 9.0f, 0.0f);
        this.LegL.addBox(-2.0f, 2.0f, -2.3f, 4, 7, 5, 0.3f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 28);
        this.LegR.setRotationPoint(-2.0f, 9.0f, 0.0f);
        this.LegR.addBox(-2.0f, 2.0f, -2.3f, 4, 7, 5, 0.3f);
        this.ChestR = new ModelRenderer((ModelBase)this, 0, 22);
        this.ChestR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ChestR.addBox(-4.1f, 1.1f, -1.8f, 8, 3, 2, 0.0f);
        this.setRotateAngle(this.ChestR, -0.077667154f, 0.0f, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 48, 19);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.4f, -1.4f, 0.3f);
        this.ArmL.addBox(-1.0f, -1.3f, -1.7f, 4, 12, 4, -0.1f);
        this.FootR = new ModelRenderer((ModelBase)this, 0, 43);
        this.FootR.mirror = true;
        this.FootR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootR.addBox(-2.0f, 0.0f, -2.3f, 4, 15, 5, 0.0f);
        this.FootL = new ModelRenderer((ModelBase)this, 0, 43);
        this.FootL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootL.addBox(-2.0f, 0.0f, -2.3f, 4, 15, 5, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 25, 0);
        this.Head2.setRotationPoint(0.0f, -6.9f, -1.8f);
        this.Head2.addBox(-1.0f, -3.4f, -1.4f, 2, 4, 3, 0.0f);
        this.setRotateAngle(this.Head2, -0.3635521f, 0.0f, 0.0f);
        this.Head4 = new ModelRenderer((ModelBase)this, 36, 0);
        this.Head4.setRotationPoint(0.0f, -0.1f, 2.4f);
        this.Head4.addBox(-0.5f, -0.5f, -0.3f, 1, 1, 3, 0.0f);
        this.setRotateAngle(this.Head4, -0.63739425f, 0.0f, 0.0f);
        this.Hips = new ModelRenderer((ModelBase)this, 19, 41);
        this.Hips.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hips.addBox(-4.0f, 8.8f, -2.3f, 8, 3, 5, 0.0f);
        this.Torso = new ModelRenderer((ModelBase)this, 21, 19);
        this.Torso.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Torso.addBox(-4.5f, 0.1f, -0.9f, 9, 5, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -2.5f, 0.2f);
        this.Head.addBox(-4.0f, -7.5f, -4.1f, 8, 8, 8, -0.6f);
        this.Head3 = new ModelRenderer((ModelBase)this, 36, 0);
        this.Head3.setRotationPoint(0.0f, -3.6f, 0.0f);
        this.Head3.addBox(-0.5f, -1.0f, -0.6f, 1, 2, 3, 0.0f);
        this.setRotateAngle(this.Head3, 1.1383038f, 0.0f, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 48, 19);
        this.ArmR.setRotationPoint(-5.4f, -1.4f, 0.3f);
        this.ArmR.addBox(-3.0f, -1.3f, -1.7f, 4, 12, 4, -0.1f);
        this.Torso.addChild(this.ChestR);
        this.LegR.addChild(this.FootR);
        this.LegL.addChild(this.FootL);
        this.Head.addChild(this.Head2);
        this.Head3.addChild(this.Head4);
        this.Body.addChild(this.Hips);
        this.Body.addChild(this.Torso);
        this.Head2.addChild(this.Head3);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Body.render(f5);
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
        this.LegL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

