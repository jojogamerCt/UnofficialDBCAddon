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

public class ModelGanos
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Hat1;
    public ModelRenderer Hair;
    public ModelRenderer Hat2;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer LegL2;
    public ModelRenderer LegR2;

    public ModelGanos() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Hat1 = new ModelRenderer((ModelBase)this, 32, 0);
        this.Hat1.setRotationPoint(0.0f, -5.3f, 0.0f);
        this.Hat1.addBox(-4.0f, -3.0f, -4.0f, 8, 3, 8, 0.0f);
        this.setRotateAngle(this.Hat1, -0.09128072f, 0.0f, 0.0f);
        this.Hair = new ModelRenderer((ModelBase)this, 39, 24);
        this.Hair.setRotationPoint(0.0f, -4.0f, 3.5f);
        this.Hair.addBox(-6.0f, -0.3f, 0.0f, 12, 7, 0, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 1, 17);
        this.Body1.setRotationPoint(0.0f, 2.0f, 0.0f);
        this.Body1.addBox(-3.5f, 0.0f, -2.0f, 7, 6, 4, 0.0f);
        this.Hat2 = new ModelRenderer((ModelBase)this, 33, 12);
        this.Hat2.setRotationPoint(0.0f, 0.0f, -3.5f);
        this.Hat2.addBox(-3.5f, -0.8f, -0.7f, 7, 2, 8, 0.0f);
        this.setRotateAngle(this.Hat2, 0.036651913f, 0.0f, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 23, 24);
        this.ArmR.setRotationPoint(-4.3f, 3.3f, 0.0f);
        this.ArmR.addBox(-2.2f, -1.3f, -1.8f, 3, 10, 4, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 1, 35);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-3.5f, 8.0f, -2.0f, 7, 2, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 23, 24);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.3f, 3.3f, 0.0f);
        this.ArmL.addBox(-0.8f, -1.3f, -1.8f, 3, 10, 4, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 3, 29);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.0f, 6.0f, -1.6f, 6, 2, 3, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 18, 53);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-1.5f, 5.0f, -1.4f, 3, 7, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 53);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 5, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 2.3f, 0.0f);
        this.Head.addBox(-4.0f, -7.5f, -4.0f, 8, 8, 8, -0.7f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 18, 53);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-1.5f, 5.0f, -1.4f, 3, 7, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 53);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 5, 4, 0.0f);
        this.Head.addChild(this.Hat1);
        this.Head.addChild(this.Hair);
        this.Hat1.addChild(this.Hat2);
        this.Body2.addChild(this.Body3);
        this.Body1.addChild(this.Body2);
        this.LegR.addChild(this.LegR2);
        this.LegL.addChild(this.LegL2);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Body1.render(f5);
        this.ArmR.render(f5);
        this.ArmL.render(f5);
        this.LegL.render(f5);
        this.Head.render(f5);
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

