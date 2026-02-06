/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbbaba;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGrandpaGohan
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Beard;
    public ModelRenderer Head2;
    public ModelRenderer Halo;
    public ModelRenderer Mask;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmL2;
    public ModelRenderer FeetR;
    public ModelRenderer FeetL;

    public ModelGrandpaGohan() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head2.setRotationPoint(0.0f, -7.0f, 0.0f);
        this.Head2.addBox(-1.0f, -1.8f, -1.0f, 2, 2, 2, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 27, 38);
        this.ArmR2.setRotationPoint(-1.0f, 6.5f, 0.1f);
        this.ArmR2.addBox(-1.6f, 0.0f, -1.5f, 3, 2, 3, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 40);
        this.LegR.setRotationPoint(-1.9f, 14.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f);
        this.Beard = new ModelRenderer((ModelBase)this, 27, 2);
        this.Beard.setRotationPoint(0.0f, -2.0f, -3.4f);
        this.Beard.addBox(-3.0f, -1.1f, 0.0f, 6, 4, 0, 0.0f);
        this.Halo = new ModelRenderer((ModelBase)this, 38, 1);
        this.Halo.setRotationPoint(0.0f, -12.4f, 1.6f);
        this.Halo.addBox(-4.0f, 0.0f, -4.0f, 8, 0, 8, 0.0f);
        this.setRotateAngle(this.Halo, -0.4553564f, 0.0f, 0.0f);
        this.Mask = new ModelRenderer((ModelBase)this, 48, 11);
        this.Mask.setRotationPoint(0.0f, -5.0f, -3.5f);
        this.Mask.addBox(-3.5f, -4.6f, 0.0f, 7, 9, 0, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 27, 38);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(1.1f, 6.4f, 0.1f);
        this.ArmL2.addBox(-1.6f, 0.0f, -1.5f, 3, 2, 3, 0.0f);
        this.FeetL = new ModelRenderer((ModelBase)this, 1, 54);
        this.FeetL.mirror = true;
        this.FeetL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetL.addBox(-1.5f, 8.0f, -2.5f, 3, 2, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 27, 24);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.6f, 5.5f, 0.1f);
        this.ArmL.addBox(-1.0f, -1.7f, -2.0f, 4, 9, 4, -0.3f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 40);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 14.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 4.7f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, -0.7f);
        this.ArmR = new ModelRenderer((ModelBase)this, 27, 24);
        this.ArmR.setRotationPoint(-4.6f, 5.5f, 0.1f);
        this.ArmR.addBox(-3.0f, -1.7f, -2.0f, 4, 9, 4, -0.3f);
        this.FeetR = new ModelRenderer((ModelBase)this, 1, 54);
        this.FeetR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetR.addBox(-1.5f, 8.0f, -2.5f, 3, 2, 4, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 23);
        this.Body.setRotationPoint(0.0f, 4.0f, 0.1f);
        this.Body.addBox(-4.0f, 0.0f, -2.5f, 8, 11, 5, 0.0f);
        this.Head.addChild(this.Head2);
        this.ArmR.addChild(this.ArmR2);
        this.Head.addChild(this.Beard);
        this.Head.addChild(this.Halo);
        this.Head.addChild(this.Mask);
        this.ArmL.addChild(this.ArmL2);
        this.LegL.addChild(this.FeetL);
        this.LegR.addChild(this.FeetR);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Head.render(f5);
        this.Body.render(f5);
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

