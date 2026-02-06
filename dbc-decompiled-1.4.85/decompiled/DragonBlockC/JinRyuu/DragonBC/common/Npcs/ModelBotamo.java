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

public class ModelBotamo
extends ModelBase {
    public ModelRenderer BodyBelly;
    public ModelRenderer LegR1;
    public ModelRenderer LegL1;
    public ModelRenderer Head;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer BodyBottom;
    public ModelRenderer BodyTorso;
    public ModelRenderer BodyTop;
    public ModelRenderer LegR2;
    public ModelRenderer LegR3;
    public ModelRenderer LegL2;
    public ModelRenderer LegL3;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;

    public ModelBotamo() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.LegR1 = new ModelRenderer((ModelBase)this, 77, 35);
        this.LegR1.setRotationPoint(-3.1f, 14.1f, 0.0f);
        this.LegR1.addBox(-1.4f, -0.6f, -1.5f, 3, 4, 3, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 71, 0);
        this.Head.setRotationPoint(0.0f, -5.6f, 0.0f);
        this.Head.addBox(-3.5f, -4.3f, -4.1f, 7, 5, 6, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 95, 18);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(-1.7f, 0.7f, -2.6f, 3, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmL2, 0.0f, 0.0f, -0.18203785f);
        this.BodyBelly = new ModelRenderer((ModelBase)this, 10, 27);
        this.BodyBelly.setRotationPoint(0.0f, -5.6f, 0.0f);
        this.BodyBelly.addBox(-8.5f, 7.5f, -8.0f, 17, 10, 14, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 75, 43);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-2.0f, 3.2f, -2.0f, 4, 5, 4, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 68, 0);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR.addBox(-4.3f, -4.3f, -1.3f, 1, 2, 2, 0.0f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 94, 10);
        this.ArmR1.setRotationPoint(-8.2f, -3.7f, 1.8f);
        this.ArmR1.addBox(-1.7f, -1.6f, -2.6f, 4, 3, 4, 0.0f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 94, 29);
        this.ArmR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR3.addBox(-2.9f, 6.4f, -2.6f, 4, 8, 4, 0.0f);
        this.setRotateAngle(this.ArmR3, 0.0f, 0.0f, -0.091106184f);
        this.EarL = new ModelRenderer((ModelBase)this, 68, 0);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL.addBox(3.3f, -4.3f, -1.3f, 1, 2, 2, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 75, 43);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-2.0f, 3.2f, -2.0f, 4, 5, 4, 0.0f);
        this.LegL1 = new ModelRenderer((ModelBase)this, 77, 35);
        this.LegL1.mirror = true;
        this.LegL1.setRotationPoint(3.3f, 14.2f, 0.0f);
        this.LegL1.addBox(-1.5f, -0.6f, -1.5f, 3, 4, 3, 0.0f);
        this.BodyBottom = new ModelRenderer((ModelBase)this, 19, 52);
        this.BodyBottom.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyBottom.addBox(-6.0f, 17.4f, -5.7f, 12, 2, 10, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 95, 18);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-1.7f, 0.7f, -2.6f, 3, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmR2, 0.0f, 0.0f, 0.18203785f);
        this.BodyTorso = new ModelRenderer((ModelBase)this, 17, 11);
        this.BodyTorso.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyTorso.addBox(-7.0f, 2.9f, -4.9f, 14, 5, 10, 0.0f);
        this.BodyTop = new ModelRenderer((ModelBase)this, 22, 0);
        this.BodyTop.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BodyTop.addBox(-6.0f, 0.2f, -2.6f, 12, 3, 7, 0.0f);
        this.LegL3 = new ModelRenderer((ModelBase)this, 72, 53);
        this.LegL3.mirror = true;
        this.LegL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL3.addBox(-2.5f, 8.0f, -3.9f, 5, 2, 6, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 94, 29);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL3.addBox(-1.4f, 6.4f, -2.6f, 4, 8, 4, 0.0f);
        this.setRotateAngle(this.ArmL3, 0.0f, 0.0f, 0.091106184f);
        this.LegR3 = new ModelRenderer((ModelBase)this, 72, 53);
        this.LegR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR3.addBox(-2.5f, 8.0f, -3.9f, 5, 2, 6, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 94, 10);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(8.5f, -3.7f, 1.8f);
        this.ArmL1.addBox(-2.7f, -1.6f, -2.6f, 4, 3, 4, 0.0f);
        this.ArmL1.addChild(this.ArmL2);
        this.LegL1.addChild(this.LegL2);
        this.Head.addChild(this.EarR);
        this.ArmR2.addChild(this.ArmR3);
        this.Head.addChild(this.EarL);
        this.LegR1.addChild(this.LegR2);
        this.BodyBelly.addChild(this.BodyBottom);
        this.ArmR1.addChild(this.ArmR2);
        this.BodyBottom.addChild(this.BodyTorso);
        this.BodyTorso.addChild(this.BodyTop);
        this.LegL2.addChild(this.LegL3);
        this.ArmL2.addChild(this.ArmL3);
        this.LegR2.addChild(this.LegR3);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL1.render(f5);
        this.Head.render(f5);
        this.ArmL1.render(f5);
        this.ArmR1.render(f5);
        this.BodyBelly.render(f5);
        this.LegR1.render(f5);
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
        this.LegR1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.ArmR1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.LegR1.rotateAngleY = 0.0f;
        this.LegL1.rotateAngleY = 0.0f;
        this.ArmR1.rotateAngleY = 0.0f;
        this.ArmL1.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

