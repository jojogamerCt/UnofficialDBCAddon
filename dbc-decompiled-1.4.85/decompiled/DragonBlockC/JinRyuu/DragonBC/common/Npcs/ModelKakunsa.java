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

public class ModelKakunsa
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer tail1;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer Hair;
    public ModelRenderer Head2;
    public ModelRenderer Body2;
    public ModelRenderer Boobs;
    public ModelRenderer Body3;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer tail4;
    public ModelRenderer tail5;

    public ModelKakunsa() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmL = new ModelRenderer((ModelBase)this, 32, 35);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.3f, 3.0f, 0.0f);
        this.ArmL.addBox(-1.3f, -1.5f, -1.8f, 3, 11, 4, -0.1f);
        this.setRotateAngle(this.ArmL, 0.0f, 0.0f, -0.06981317f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 1.5f, 0.0f);
        this.Head.addBox(-4.0f, -7.5f, -4.0f, 8, 8, 8, -0.5f);
        this.tail1 = new ModelRenderer((ModelBase)this, 42, 19);
        this.tail1.setRotationPoint(0.0f, 11.4f, 1.6f);
        this.tail1.addBox(-0.5f, -0.3f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail1, 1.0011208f, 0.0f, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 32, 0);
        this.Head2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head2.addBox(-4.0f, -7.5f, -4.0f, 8, 8, 8, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 32, 35);
        this.ArmR.setRotationPoint(-4.3f, 3.0f, 0.0f);
        this.ArmR.addBox(-1.7f, -1.5f, -1.8f, 3, 11, 4, -0.1f);
        this.setRotateAngle(this.ArmR, 0.0f, 0.0f, 0.06981317f);
        this.tail4 = new ModelRenderer((ModelBase)this, 42, 19);
        this.tail4.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail4.addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail4, 0.20507619f, 0.0f, 0.0f);
        this.tail3 = new ModelRenderer((ModelBase)this, 42, 19);
        this.tail3.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail3.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail3, -0.18203785f, 0.0f, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 38);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-3.5f, 8.8f, -2.0f, 7, 2, 4, 0.0f);
        this.Boobs = new ModelRenderer((ModelBase)this, 19, 31);
        this.Boobs.setRotationPoint(0.0f, -0.3f, 0.0f);
        this.Boobs.addBox(-3.0f, 2.0f, -0.7f, 6, 3, 2, 0.0f);
        this.setRotateAngle(this.Boobs, -0.59864795f, 0.0f, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 28, 1);
        this.EarR.setRotationPoint(-3.0f, -3.4f, -0.5f);
        this.EarR.addBox(-5.0f, -2.0f, -0.3f, 5, 5, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.6981317f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 46);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, -0.1f);
        this.EarL = new ModelRenderer((ModelBase)this, 28, 1);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.0f, -3.4f, -0.5f);
        this.EarL.addBox(0.0f, -2.0f, -0.3f, 5, 5, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.6981317f, 0.0f);
        this.tail2 = new ModelRenderer((ModelBase)this, 42, 19);
        this.tail2.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail2.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail2, -0.18203785f, 0.0f, 0.0f);
        this.Hair = new ModelRenderer((ModelBase)this, 25, 17);
        this.Hair.setRotationPoint(0.0f, -0.1f, 3.95f);
        this.Hair.addBox(-3.5f, -0.3f, 0.0f, 7, 7, 0, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 30);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.0f, 5.8f, -1.6f, 6, 3, 3, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Body1.setRotationPoint(0.0f, 1.3f, 0.0f);
        this.Body1.addBox(-3.5f, 0.0f, -2.0f, 7, 6, 4, -0.2f);
        this.tail5 = new ModelRenderer((ModelBase)this, 42, 19);
        this.tail5.setRotationPoint(0.0f, 3.1f, 0.0f);
        this.tail5.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail5, 0.27314404f, 0.0f, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 46);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, -0.1f);
        this.Head.addChild(this.Head2);
        this.tail3.addChild(this.tail4);
        this.tail2.addChild(this.tail3);
        this.Body2.addChild(this.Body3);
        this.Body1.addChild(this.Boobs);
        this.Head.addChild(this.EarR);
        this.Head.addChild(this.EarL);
        this.tail1.addChild(this.tail2);
        this.Head.addChild(this.Hair);
        this.Body1.addChild(this.Body2);
        this.tail4.addChild(this.tail5);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Body1.render(f5);
        this.ArmR.render(f5);
        this.ArmL.render(f5);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.LegR.render(f5);
        this.tail1.render(f5);
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
        this.tail2.rotateAngleX = 0.2f;
        this.tail2.rotateAngleX += r4 / 2.0f;
        this.tail3.rotateAngleX = 0.2f;
        this.tail3.rotateAngleX += r4 / 2.0f;
        this.tail4.rotateAngleX = 0.2f;
        this.tail4.rotateAngleX += r4 / 2.0f;
        this.tail5.rotateAngleY = 0.2f;
        this.tail5.rotateAngleY += r4;
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

