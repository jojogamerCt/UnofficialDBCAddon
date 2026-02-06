/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbtournament;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelManWolf
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Nose;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer MuttonchopsR;
    public ModelRenderer MuttonchopsL;

    public ModelManWolf() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmR1 = new ModelRenderer((ModelBase)this, 34, 16);
        this.ArmR1.setRotationPoint(-6.5f, 2.0f, 1.0f);
        this.ArmR1.addBox(-3.5f, -2.0f, -2.5f, 5, 12, 5, 0.0f);
        this.MuttonchopsR = new ModelRenderer((ModelBase)this, 55, 8);
        this.MuttonchopsR.setRotationPoint(-3.5f, -3.5f, -2.1f);
        this.MuttonchopsR.addBox(-2.0f, -0.4f, 0.0f, 2, 4, 0, 0.0f);
        this.setRotateAngle(this.MuttonchopsR, 0.0f, 0.6981317f, 0.08726646f);
        this.MuttonchopsL = new ModelRenderer((ModelBase)this, 55, 8);
        this.MuttonchopsL.mirror = true;
        this.MuttonchopsL.setRotationPoint(3.5f, -3.5f, -2.1f);
        this.MuttonchopsL.addBox(0.0f, -0.2f, 0.0f, 2, 4, 0, 0.0f);
        this.setRotateAngle(this.MuttonchopsL, 0.0f, -0.6981317f, -0.08726646f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Body1.setRotationPoint(0.0f, 0.0f, 1.0f);
        this.Body1.addBox(-5.0f, 0.0f, -3.0f, 10, 12, 6, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 47, 8);
        this.EarR.setRotationPoint(-3.6f, -4.0f, -1.0f);
        this.EarR.addBox(-2.5f, -3.0f, 0.0f, 3, 4, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.34906584f, -0.04363323f);
        this.LegL = new ModelRenderer((ModelBase)this, 1, 40);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.6f, 12.0f, 1.0f);
        this.LegL.addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5, 0.1f);
        this.EarL = new ModelRenderer((ModelBase)this, 47, 8);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.0f, -4.0f, -1.0f);
        this.EarL.addBox(0.0f, -3.0f, 0.0f, 3, 4, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.34906584f, 0.04363323f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.6f);
        this.Head.addBox(-4.0f, -6.0f, -4.0f, 8, 6, 8, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 34, 16);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(6.5f, 2.0f, 1.0f);
        this.ArmL1.addBox(-1.5f, -2.0f, -2.5f, 5, 12, 5, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 1, 40);
        this.LegR.setRotationPoint(-2.6f, 12.0f, 1.0f);
        this.LegR.addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5, 0.1f);
        this.Nose = new ModelRenderer((ModelBase)this, 46, 0);
        this.Nose.setRotationPoint(0.0f, -2.0f, -3.7f);
        this.Nose.addBox(-2.0f, -1.0f, -2.9f, 4, 3, 3, 0.0f);
        this.Head.addChild(this.MuttonchopsR);
        this.Head.addChild(this.MuttonchopsL);
        this.Head.addChild(this.EarR);
        this.Head.addChild(this.EarL);
        this.Head.addChild(this.Nose);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Head.render(f5);
        this.Body1.render(f5);
        this.ArmR1.render(f5);
        this.ArmL1.render(f5);
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
        this.ArmR1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR1.rotateAngleY = 0.0f;
        this.ArmL1.rotateAngleY = 0.0f;
    }
}

