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

public class ModelRoshi_super
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer UpperBody;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Beard1;
    public ModelRenderer Beard2;
    public ModelRenderer Belt;
    public ModelRenderer Lowerbody;
    public ModelRenderer Neck;
    public ModelRenderer Belt2;
    public ModelRenderer Belt3;
    public ModelRenderer Belt4;
    public ModelRenderer FeetR;
    public ModelRenderer FeetL;

    public ModelRoshi_super() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmR = new ModelRenderer((ModelBase)this, 30, 26);
        this.ArmR.setRotationPoint(-3.9f, 5.6f, 0.1f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 11, 4, -0.6f);
        this.FeetL = new ModelRenderer((ModelBase)this, 17, 53);
        this.FeetL.mirror = true;
        this.FeetL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetL.addBox(-1.5f, 8.0f, -2.5f, 3, 2, 4, 0.0f);
        this.UpperBody = new ModelRenderer((ModelBase)this, 3, 23);
        this.UpperBody.setRotationPoint(0.0f, 4.0f, 0.1f);
        this.UpperBody.addBox(-3.5f, 0.0f, -2.0f, 7, 6, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 49);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 14.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f);
        this.Belt4 = new ModelRenderer((ModelBase)this, 2, 36);
        this.Belt4.setRotationPoint(0.6f, 0.5f, 0.0f);
        this.Belt4.addBox(-0.5f, 0.0f, -0.1f, 1, 5, 0, 0.0f);
        this.setRotateAngle(this.Belt4, -0.045553092f, -1.1838568f, -0.091106184f);
        this.Belt = new ModelRenderer((ModelBase)this, 6, 35);
        this.Belt.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Belt.addBox(-3.1f, 5.2f, -1.5f, 6, 2, 3, 0.0f);
        this.Belt3 = new ModelRenderer((ModelBase)this, 2, 36);
        this.Belt3.setRotationPoint(0.0f, 0.6f, 0.0f);
        this.Belt3.addBox(-0.4f, 0.0f, -0.5f, 1, 5, 0, 0.0f);
        this.setRotateAngle(this.Belt3, -0.14660765f, -0.31869712f, -0.0418879f);
        this.FeetR = new ModelRenderer((ModelBase)this, 17, 53);
        this.FeetR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetR.addBox(-1.5f, 8.0f, -2.5f, 3, 2, 4, 0.0f);
        this.Lowerbody = new ModelRenderer((ModelBase)this, 4, 41);
        this.Lowerbody.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Lowerbody.addBox(-3.5f, 7.0f, -2.0f, 7, 3, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 49);
        this.LegR.setRotationPoint(-1.9f, 14.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f);
        this.Beard2 = new ModelRenderer((ModelBase)this, 35, 10);
        this.Beard2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Beard2.addBox(-1.5f, -1.8f, -3.7f, 3, 4, 1, 0.0f);
        this.Belt2 = new ModelRenderer((ModelBase)this, 0, 33);
        this.Belt2.setRotationPoint(3.0f, 6.8f, -1.7f);
        this.Belt2.addBox(-1.4f, 0.0f, -0.4f, 2, 1, 2, 0.0f);
        this.Neck = new ModelRenderer((ModelBase)this, 7, 17);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-2.0f, -1.2f, -1.2f, 4, 2, 3, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 30, 26);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(3.9f, 5.6f, 0.1f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 11, 4, -0.6f);
        this.Beard1 = new ModelRenderer((ModelBase)this, 35, 6);
        this.Beard1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Beard1.addBox(-1.9f, -2.4f, -4.0f, 4, 2, 1, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 4.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, -0.7f);
        this.LegL.addChild(this.FeetL);
        this.Belt2.addChild(this.Belt4);
        this.UpperBody.addChild(this.Belt);
        this.Belt2.addChild(this.Belt3);
        this.LegR.addChild(this.FeetR);
        this.UpperBody.addChild(this.Lowerbody);
        this.Beard1.addChild(this.Beard2);
        this.Belt.addChild(this.Belt2);
        this.UpperBody.addChild(this.Neck);
        this.Head.addChild(this.Beard1);
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
        r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        r4 = MathHelper.cos((float)(ex / 8.0f)) / 3.0f - 0.2f;
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

