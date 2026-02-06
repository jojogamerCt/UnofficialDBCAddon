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

public class ModelObni
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Hair;
    public ModelRenderer EarL;
    public ModelRenderer EarR;
    public ModelRenderer Nose;
    public ModelRenderer Body2;
    public ModelRenderer Chest;
    public ModelRenderer Body3;

    public ModelObni() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmR = new ModelRenderer((ModelBase)this, 45, 12);
        this.ArmR.setRotationPoint(-5.0f, -2.0f, 0.0f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 14, 4, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 51, 1);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(4.0f, -4.0f, 0.0f);
        this.EarL.addBox(0.0f, -2.0f, -1.6f, 1, 4, 3, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 43, 32);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 10.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 14, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 45, 12);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, -2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 14, 4, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 30);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, 7.0f, -2.0f, 7, 4, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 43, 32);
        this.LegR.setRotationPoint(-1.9f, 10.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 14, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -4.0f, 0.0f);
        this.Head.addBox(-4.0f, -9.0f, -4.0f, 8, 9, 8, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Body1.setRotationPoint(0.0f, -4.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -2.0f, 8, 7, 4, 0.0f);
        this.Nose = new ModelRenderer((ModelBase)this, 25, 2);
        this.Nose.setRotationPoint(0.0f, -3.3f, -3.4f);
        this.Nose.addBox(-1.0f, -0.5f, -1.0f, 2, 1, 2, 0.0f);
        this.setRotateAngle(this.Nose, -0.13665928f, 0.0f, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 39);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-4.0f, 11.0f, -2.0f, 8, 3, 4, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 51, 1);
        this.EarR.setRotationPoint(-4.0f, -4.0f, 0.0f);
        this.EarR.addBox(-1.0f, -2.0f, -1.6f, 1, 4, 3, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 26, 21);
        this.Chest.setRotationPoint(0.0f, 3.3f, -1.0f);
        this.Chest.addBox(-3.5f, -2.0f, -1.4f, 7, 4, 1, 0.0f);
        this.setRotateAngle(this.Chest, -0.06981317f, 0.0f, 0.0f);
        this.Hair = new ModelRenderer((ModelBase)this, 34, 2);
        this.Hair.setRotationPoint(0.0f, 0.0f, 4.0f);
        this.Hair.addBox(-4.0f, 0.0f, 0.0f, 8, 7, 0, 0.0f);
        this.Head.addChild(this.EarL);
        this.Body1.addChild(this.Body2);
        this.Head.addChild(this.Nose);
        this.Body2.addChild(this.Body3);
        this.Head.addChild(this.EarR);
        this.Body1.addChild(this.Chest);
        this.Head.addChild(this.Hair);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.ArmR.render(f5);
        this.LegL.render(f5);
        this.ArmL.render(f5);
        this.LegR.render(f5);
        this.Head.render(f5);
        this.Body1.render(f5);
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
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

