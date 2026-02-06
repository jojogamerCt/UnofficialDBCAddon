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

public class ModelChampa
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer EarL;
    public ModelRenderer EarR;
    public ModelRenderer Snout1;
    public ModelRenderer EarL_1;
    public ModelRenderer Snout2;
    public ModelRenderer SnoutSideR;
    public ModelRenderer SnoutSideL;
    public ModelRenderer Cloth1;
    public ModelRenderer tail1;
    public ModelRenderer tail2;

    public ModelChampa() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.LegR = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.3f, 0.0f, -2.0f, 4, 12, 4, 0.2f);
        this.ArmL = new ModelRenderer((ModelBase)this, 40, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 1.7f, 0.1f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 3, 12, 4, 0.0f);
        this.tail2 = new ModelRenderer((ModelBase)this, 42, 1);
        this.tail2.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail2.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail2, 0.4553564f, 0.0f, 0.0f);
        this.SnoutSideL = new ModelRenderer((ModelBase)this, 47, 7);
        this.SnoutSideL.mirror = true;
        this.SnoutSideL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SnoutSideL.addBox(-1.7f, -2.8f, -5.0f, 2, 2, 1, 0.0f);
        this.setRotateAngle(this.SnoutSideL, 0.0f, -0.5934119f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-1.7f, 0.0f, -2.0f, 4, 12, 4, 0.2f);
        this.SnoutSideR = new ModelRenderer((ModelBase)this, 47, 7);
        this.SnoutSideR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SnoutSideR.addBox(-0.2f, -2.8f, -5.0f, 2, 2, 1, 0.0f);
        this.setRotateAngle(this.SnoutSideR, 0.0f, 0.5934119f, 0.0f);
        this.Cloth1 = new ModelRenderer((ModelBase)this, 54, 1);
        this.Cloth1.setRotationPoint(0.0f, 11.2f, -2.4f);
        this.Cloth1.addBox(-2.5f, 0.1f, 0.0f, 5, 8, 0, 0.0f);
        this.setRotateAngle(this.Cloth1, -0.057595864f, 0.0f, 0.0f);
        this.Snout2 = new ModelRenderer((ModelBase)this, 43, 7);
        this.Snout2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Snout2.addBox(-0.5f, 1.7f, -5.2f, 1, 2, 1, 0.0f);
        this.setRotateAngle(this.Snout2, -1.0927507f, 0.0f, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 32, 0);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL.addBox(0.8f, -14.9f, 1.9f, 4, 10, 1, 0.0f);
        this.setRotateAngle(this.EarL, 0.10995574f, 0.0f, 0.0f);
        this.Snout1 = new ModelRenderer((ModelBase)this, 41, 10);
        this.Snout1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Snout1.addBox(-1.5f, -3.0f, -5.9f, 3, 3, 2, 0.0f);
        this.tail1 = new ModelRenderer((ModelBase)this, 42, 1);
        this.tail1.setRotationPoint(0.0f, 11.9f, 2.3f);
        this.tail1.addBox(-0.5f, -0.3f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail1, 1.0011208f, 0.0f, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 32, 0);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR.addBox(-4.8f, -14.9f, 1.9f, 4, 10, 1, 0.0f);
        this.setRotateAngle(this.EarR, 0.10995574f, 0.0f, 0.0f);
        this.EarL_1 = new ModelRenderer((ModelBase)this, 0, 1);
        this.EarL_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL_1.addBox(-5.1f, -11.8f, 1.4f, 1, 1, 2, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 16, 16);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.4f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -0.6f, 0.0f);
        this.Head.addBox(-4.0f, -7.6f, -4.0f, 8, 8, 8, -0.2f);
        this.ArmR = new ModelRenderer((ModelBase)this, 40, 16);
        this.ArmR.setRotationPoint(-5.0f, 1.7f, 0.1f);
        this.ArmR.addBox(-2.0f, -2.0f, -2.0f, 3, 12, 4, 0.0f);
        this.tail1.addChild(this.tail2);
        this.Snout1.addChild(this.SnoutSideL);
        this.Snout1.addChild(this.SnoutSideR);
        this.Body.addChild(this.Cloth1);
        this.Snout1.addChild(this.Snout2);
        this.Head.addChild(this.EarL);
        this.Head.addChild(this.Snout1);
        this.Body.addChild(this.tail1);
        this.Head.addChild(this.EarR);
        this.EarL.addChild(this.EarL_1);
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
        this.LegR.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        this.Cloth1.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

