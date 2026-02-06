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

public class ModelGodGiin
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer Neck;
    public ModelRenderer Body2;
    public ModelRenderer Cloth1;
    public ModelRenderer Body3;
    public ModelRenderer LegR2;
    public ModelRenderer LegL2;

    public ModelGodGiin() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Neck = new ModelRenderer((ModelBase)this, 33, 10);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-2.5f, -0.9f, -1.2f, 5, 2, 3, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 33, 2);
        this.EarL.setRotationPoint(3.5f, -4.0f, -1.2f);
        this.EarL.addBox(0.0f, -3.0f, 0.0f, 4, 5, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.7853982f, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 20, 18);
        this.Body1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -2.5f, 8, 5, 5, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 48, 16);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.3f);
        this.ArmR.addBox(-3.0f, -2.0f, -1.8f, 4, 12, 4, 0.0f);
        this.Cloth1 = new ModelRenderer((ModelBase)this, 27, 48);
        this.Cloth1.setRotationPoint(0.0f, 10.0f, -1.5f);
        this.Cloth1.addBox(-2.5f, 0.0f, -0.5f, 5, 10, 0, 0.0f);
        this.setRotateAngle(this.Cloth1, -0.090757124f, 0.0f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 3, 36);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-1.7f, 2.1f, -2.0f, 4, 5, 4, 0.3f);
        this.Body3 = new ModelRenderer((ModelBase)this, 20, 38);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-4.0f, 8.0f, -2.0f, 8, 4, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 48, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.3f);
        this.ArmL.addBox(-1.0f, -2.0f, -1.8f, 4, 12, 4, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 3, 46);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-1.9f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -0.3f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, -0.3f);
        this.Body2 = new ModelRenderer((ModelBase)this, 23, 29);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, 4.0f, -2.3f, 7, 4, 4, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 3, 46);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-2.1f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 3, 36);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.4f, 2.1f, -2.0f, 4, 5, 4, 0.3f);
        this.EarR = new ModelRenderer((ModelBase)this, 33, 2);
        this.EarR.mirror = true;
        this.EarR.setRotationPoint(-3.5f, -4.0f, -1.2f);
        this.EarR.addBox(-4.0f, -3.0f, 0.0f, 4, 5, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.7853982f, 0.0f);
        this.Body1.addChild(this.Neck);
        this.Head.addChild(this.EarL);
        this.Body1.addChild(this.Cloth1);
        this.Body2.addChild(this.Body3);
        this.LegL.addChild(this.LegL2);
        this.Body1.addChild(this.Body2);
        this.LegR.addChild(this.LegR2);
        this.Head.addChild(this.EarR);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Body1.render(f5);
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
        this.Cloth1.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

