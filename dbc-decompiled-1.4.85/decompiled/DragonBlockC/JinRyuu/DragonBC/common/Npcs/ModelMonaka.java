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

public class ModelMonaka
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer UpperBody;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer earR;
    public ModelRenderer earL;
    public ModelRenderer Lowerbody;
    public ModelRenderer Neck;
    public ModelRenderer FeetR;
    public ModelRenderer FeetL;

    public ModelMonaka() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Neck = new ModelRenderer((ModelBase)this, 7, 17);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-1.5f, -0.8f, -0.8f, 3, 2, 2, 0.0f);
        this.UpperBody = new ModelRenderer((ModelBase)this, 3, 23);
        this.UpperBody.setRotationPoint(0.0f, 4.0f, 0.0f);
        this.UpperBody.addBox(-3.5f, 0.0f, -1.4f, 7, 7, 3, 0.0f);
        this.earR = new ModelRenderer((ModelBase)this, 33, 8);
        this.earR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.earR.addBox(-5.4f, -4.5f, -2.7f, 3, 2, 1, 0.0f);
        this.setRotateAngle(this.earR, 0.0f, 0.4098033f, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 30, 26);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(3.7f, 5.2f, 0.1f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, -0.8f);
        this.ArmR = new ModelRenderer((ModelBase)this, 30, 26);
        this.ArmR.setRotationPoint(-3.7f, 5.1f, 0.1f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, -0.8f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 49);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 13.7f, 0.0f);
        this.LegL.addBox(-2.0f, -0.8f, -2.0f, 4, 10, 4, -0.8f);
        this.earL = new ModelRenderer((ModelBase)this, 33, 8);
        this.earL.mirror = true;
        this.earL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.earL.addBox(2.3f, -4.6f, -2.7f, 3, 2, 1, 0.0f);
        this.setRotateAngle(this.earL, 0.0f, -0.4098033f, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 49);
        this.LegR.setRotationPoint(-1.9f, 13.7f, 0.0f);
        this.LegR.addBox(-2.0f, -0.8f, -2.0f, 4, 10, 4, -0.8f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 1);
        this.Head.setRotationPoint(0.0f, 4.3f, 0.0f);
        this.Head.addBox(-4.0f, -7.1f, -4.2f, 8, 7, 8, -0.6f);
        this.FeetR = new ModelRenderer((ModelBase)this, 17, 53);
        this.FeetR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetR.addBox(-1.5f, 8.3f, -2.5f, 3, 2, 4, 0.0f);
        this.FeetL = new ModelRenderer((ModelBase)this, 17, 53);
        this.FeetL.mirror = true;
        this.FeetL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetL.addBox(-1.5f, 8.3f, -2.5f, 3, 2, 4, 0.0f);
        this.Lowerbody = new ModelRenderer((ModelBase)this, 4, 36);
        this.Lowerbody.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Lowerbody.addBox(-3.5f, 6.8f, -2.0f, 7, 3, 4, 0.0f);
        this.UpperBody.addChild(this.Neck);
        this.Head.addChild(this.earR);
        this.Head.addChild(this.earL);
        this.LegR.addChild(this.FeetR);
        this.LegL.addChild(this.FeetL);
        this.UpperBody.addChild(this.Lowerbody);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.UpperBody.render(f5);
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

