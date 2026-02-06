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

public class ModelVampire
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer Hair;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;

    public ModelVampire() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body = new ModelRenderer((ModelBase)this, 17, 16);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 6, 4, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 0, 54);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(-1.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmL2, -0.6981317f, 0.12217305f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 19);
        this.LegR.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Hair = new ModelRenderer((ModelBase)this, 32, 0);
        this.Hair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addBox(-4.0f, -12.0f, -4.0f, 8, 4, 8, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 0, 43);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-3.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmR2, -0.6981317f, -0.12217305f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 19);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 17, 54);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(1.0f, 4.0f, -1.5f);
        this.ArmL3.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmL3, -1.6580628f, (float)Math.PI / 90, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 17, 35);
        this.Body3.setRotationPoint(0.0f, 3.0f, 0.0f);
        this.Body3.addBox(-4.0f, 0.0f, -2.0f, 8, 3, 4, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 1, 2);
        this.EarR.setRotationPoint(-3.8f, -4.4f, -1.5f);
        this.EarR.addBox(-3.0f, -3.7f, 0.0f, 3, 5, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.87266463f, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 18, 27);
        this.Body2.setRotationPoint(0.0f, 6.0f, 0.0f);
        this.Body2.addBox(-3.5f, 0.0f, -2.0f, 7, 3, 4, 0.0f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 17, 43);
        this.ArmR3.setRotationPoint(-1.0f, 4.0f, -1.5f);
        this.ArmR3.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmR3, -1.6580628f, (float)(-Math.PI) / 90, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 1, 2);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.8f, -4.4f, -1.5f);
        this.EarL.addBox(0.0f, -3.7f, 0.0f, 3, 5, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.87266463f, 0.0f);
        this.ArmL.addChild(this.ArmL2);
        this.Head.addChild(this.Hair);
        this.ArmR.addChild(this.ArmR2);
        this.ArmL2.addChild(this.ArmL3);
        this.Body2.addChild(this.Body3);
        this.Head.addChild(this.EarR);
        this.Body.addChild(this.Body2);
        this.ArmR2.addChild(this.ArmR3);
        this.Head.addChild(this.EarL);
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

