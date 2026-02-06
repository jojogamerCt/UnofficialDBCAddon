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

public class ModelLavender
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer Tail1;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Snout;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer EarR2;
    public ModelRenderer EarL2;
    public ModelRenderer Body2;
    public ModelRenderer Chest;
    public ModelRenderer Fur;
    public ModelRenderer Body3;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer Tail5;
    public ModelRenderer LegR2;
    public ModelRenderer LegR2_1;

    public ModelLavender() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmL = new ModelRenderer((ModelBase)this, 0, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, -0.5f, -1.4f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 16, 4, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 20, 29);
        this.Body2.setRotationPoint(0.0f, 7.5f, 0.0f);
        this.Body2.addBox(-3.5f, -0.7f, -1.5f, 7, 4, 4, 0.0f);
        this.setRotateAngle(this.Body2, -0.2617994f, 0.0f, 0.0f);
        this.Tail4 = new ModelRenderer((ModelBase)this, 52, 32);
        this.Tail4.setRotationPoint(0.0f, 0.0f, 5.8f);
        this.Tail4.addBox(-1.5f, -1.5f, 0.0f, 3, 3, 3, 0.0f);
        this.setRotateAngle(this.Tail4, 0.27314404f, 0.0f, 0.0f);
        this.Tail1 = new ModelRenderer((ModelBase)this, 54, 9);
        this.Tail1.setRotationPoint(0.0f, 9.2f, 1.0f);
        this.Tail1.addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3, 0.0f);
        this.setRotateAngle(this.Tail1, -0.4098033f, 0.0f, 0.0f);
        this.LegR2_1 = new ModelRenderer((ModelBase)this, 0, 50);
        this.LegR2_1.setRotationPoint(0.1f, 6.0f, 1.3f);
        this.LegR2_1.addBox(-2.0f, -1.5f, -0.6f, 4, 9, 4, 0.0f);
        this.setRotateAngle(this.LegR2_1, 0.4886922f, 0.0f, 0.0f);
        this.Tail5 = new ModelRenderer((ModelBase)this, 54, 38);
        this.Tail5.setRotationPoint(0.0f, 0.0f, 2.9f);
        this.Tail5.addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3, 0.0f);
        this.setRotateAngle(this.Tail5, 0.13665928f, 0.0f, 0.0f);
        this.EarL2 = new ModelRenderer((ModelBase)this, 49, 2);
        this.EarL2.mirror = true;
        this.EarL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL2.addBox(-1.7f, -3.2f, 0.05f, 3, 4, 0, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 0, 50);
        this.LegR2.setRotationPoint(-0.1f, 6.0f, 1.3f);
        this.LegR2.addBox(-2.0f, -1.5f, -0.6f, 4, 9, 4, 0.0f);
        this.setRotateAngle(this.LegR2, 0.4886922f, 0.0f, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 20, 16);
        this.Body1.setRotationPoint(0.0f, -3.0f, -1.9f);
        this.Body1.addBox(-4.0f, 0.0f, -1.4f, 8, 8, 4, 0.0f);
        this.setRotateAngle(this.Body1, 0.17453292f, 0.0f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 39);
        this.LegL.setRotationPoint(2.6f, 10.6f, -1.6f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 7, 4, 0.0f);
        this.setRotateAngle(this.LegL, -0.4886922f, 0.0f, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 39);
        this.LegR.setRotationPoint(-2.5f, 10.6f, -1.6f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 7, 4, 0.0f);
        this.setRotateAngle(this.LegR, -0.4886922f, 0.0f, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 27, 2);
        this.EarR.setRotationPoint(-3.0f, -5.3f, -1.1f);
        this.EarR.addBox(-2.0f, -4.0f, 0.0f, 4, 6, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.27925268f, -0.6981317f);
        this.ArmR = new ModelRenderer((ModelBase)this, 0, 16);
        this.ArmR.setRotationPoint(-5.0f, -0.5f, -1.4f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 16, 4, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 27, 2);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.1f, -5.3f, -1.1f);
        this.EarL.addBox(-2.0f, -4.0f, 0.0f, 4, 6, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.27925268f, 0.6981317f);
        this.Tail2 = new ModelRenderer((ModelBase)this, 48, 14);
        this.Tail2.setRotationPoint(0.0f, 0.0f, 2.3f);
        this.Tail2.addBox(-1.5f, -1.5f, 0.0f, 3, 3, 5, 0.0f);
        this.setRotateAngle(this.Tail2, -0.59184116f, 0.0f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -1.6f, -3.0f);
        this.Head.addBox(-4.0f, -5.8f, -4.9f, 8, 7, 8, 0.0f);
        this.setRotateAngle(this.Head, 0.045553092f, 0.0f, 0.0f);
        this.EarR2 = new ModelRenderer((ModelBase)this, 49, 2);
        this.EarR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR2.addBox(-1.3f, -3.2f, 0.05f, 3, 4, 0, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 19, 40);
        this.Body3.setRotationPoint(0.0f, 3.1f, 0.4f);
        this.Body3.addBox(-4.0f, 0.2f, -2.0f, 8, 3, 4, 0.0f);
        this.setRotateAngle(this.Body3, 0.08726646f, 0.0f, 0.0f);
        this.Snout = new ModelRenderer((ModelBase)this, 36, 1);
        this.Snout.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Snout.addBox(-2.0f, -2.5f, -6.9f, 4, 3, 2, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 33, 9);
        this.Chest.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chest.addBox(-4.0f, 2.1f, -2.5f, 8, 4, 1, 0.0f);
        this.Fur = new ModelRenderer((ModelBase)this, 45, 44);
        this.Fur.setRotationPoint(0.0f, 0.9f, -3.0f);
        this.Fur.addBox(-2.5f, 0.2f, -0.5f, 5, 4, 2, 0.0f);
        this.Tail3 = new ModelRenderer((ModelBase)this, 44, 22);
        this.Tail3.setRotationPoint(0.0f, 0.0f, 4.4f);
        this.Tail3.addBox(-2.0f, -2.0f, 0.0f, 4, 4, 6, 0.0f);
        this.setRotateAngle(this.Tail3, 0.4553564f, 0.0f, 0.0f);
        this.Body1.addChild(this.Body2);
        this.Tail3.addChild(this.Tail4);
        this.LegR.addChild(this.LegR2_1);
        this.Tail4.addChild(this.Tail5);
        this.EarL.addChild(this.EarL2);
        this.LegL.addChild(this.LegR2);
        this.Head.addChild(this.EarR);
        this.Head.addChild(this.EarL);
        this.Tail1.addChild(this.Tail2);
        this.EarR.addChild(this.EarR2);
        this.Body2.addChild(this.Body3);
        this.Head.addChild(this.Snout);
        this.Body1.addChild(this.Chest);
        this.Body1.addChild(this.Fur);
        this.Tail2.addChild(this.Tail3);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Body1.render(f5);
        this.LegR.render(f5);
        this.Tail1.render(f5);
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
        this.Tail1.rotateAngleX = 0.2f;
        this.Tail1.rotateAngleX += r4 / 2.0f;
        this.Tail2.rotateAngleX = 0.2f;
        this.Tail2.rotateAngleX += r4 / 2.0f;
        this.Tail3.rotateAngleX = 0.2f;
        this.Tail3.rotateAngleX += r4 / 2.0f;
        this.Tail4.rotateAngleX = 0.2f;
        this.Tail4.rotateAngleX += r4 / 2.0f;
        this.Tail5.rotateAngleY = 0.2f;
        this.Tail5.rotateAngleY += r4;
        this.LegR.rotateAngleX = -0.4f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.4f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

