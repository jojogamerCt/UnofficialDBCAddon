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

public class ModelHit
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer NeckGuard1;
    public ModelRenderer Chest;
    public ModelRenderer LowerCoatSideL;
    public ModelRenderer LowerCoatBackL;
    public ModelRenderer LowerCoatSideR;
    public ModelRenderer LowerCoatBackR;

    public ModelHit() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.NeckGuard1 = new ModelRenderer((ModelBase)this, 34, 6);
        this.NeckGuard1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckGuard1.addBox(-3.5f, -0.8f, -2.6f, 7, 2, 6, 0.0f);
        this.setRotateAngle(this.NeckGuard1, 0.27314404f, 0.0f, 0.0f);
        this.LowerCoatBackR = new ModelRenderer((ModelBase)this, 23, 38);
        this.LowerCoatBackR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LowerCoatBackR.addBox(0.6f, -0.2f, 1.5f, 1, 7, 1, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -0.5f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.LowerCoatSideR = new ModelRenderer((ModelBase)this, 3, 33);
        this.LowerCoatSideR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LowerCoatSideR.addBox(-2.4f, -0.2f, -2.4f, 3, 9, 5, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 16, 16);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.LowerCoatBackL = new ModelRenderer((ModelBase)this, 23, 38);
        this.LowerCoatBackL.mirror = true;
        this.LowerCoatBackL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LowerCoatBackL.addBox(-1.4f, -0.2f, 1.5f, 1, 7, 1, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 40, 16);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 40, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LowerCoatSideL = new ModelRenderer((ModelBase)this, 3, 33);
        this.LowerCoatSideL.mirror = true;
        this.LowerCoatSideL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LowerCoatSideL.addBox(-0.5f, -0.2f, -2.4f, 3, 9, 5, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 19, 33);
        this.Chest.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chest.addBox(-3.5f, 1.1f, -2.5f, 7, 3, 1, 0.0f);
        this.Body.addChild(this.NeckGuard1);
        this.LegR.addChild(this.LowerCoatBackR);
        this.LegR.addChild(this.LowerCoatSideR);
        this.LegL.addChild(this.LowerCoatBackL);
        this.LegL.addChild(this.LowerCoatSideL);
        this.Body.addChild(this.Chest);
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
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

