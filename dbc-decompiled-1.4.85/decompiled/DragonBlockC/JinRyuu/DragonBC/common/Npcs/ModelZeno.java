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

public class ModelZeno
extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Head;
    public ModelRenderer Body2;
    public ModelRenderer ShoulderR;
    public ModelRenderer ShoulderL;
    public ModelRenderer EarR;
    public ModelRenderer EarL;

    public ModelZeno() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 8.2f, 0.0f);
        this.Head.addBox(-4.0f, -5.6f, -3.6f, 8, 6, 7, -0.2f);
        this.LegR = new ModelRenderer((ModelBase)this, 30, 22);
        this.LegR.setRotationPoint(-1.9f, 17.0f, 0.0f);
        this.LegR.addBox(-1.1f, 0.0f, -1.5f, 2, 7, 3, 0.0f);
        this.ShoulderL = new ModelRenderer((ModelBase)this, 27, 13);
        this.ShoulderL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderL.addBox(3.1f, 1.0f, -1.9f, 3, 2, 4, 0.0f);
        this.setRotateAngle(this.ShoulderL, 0.0f, 0.0f, -0.13665928f);
        this.EarL = new ModelRenderer((ModelBase)this, 0, 0);
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL.addBox(3.7f, -3.1f, -1.0f, 1, 2, 2, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 37, 0);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-4.0f, 4.1f, -2.4f, 8, 7, 5, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 0, 0);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR.addBox(-4.7f, -3.1f, -1.0f, 1, 2, 2, 0.0f);
        this.ShoulderR = new ModelRenderer((ModelBase)this, 27, 13);
        this.ShoulderR.mirror = true;
        this.ShoulderR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderR.addBox(-6.2f, 1.0f, -1.9f, 3, 2, 4, 0.0f);
        this.setRotateAngle(this.ShoulderR, 0.0f, 0.0f, 0.13665928f);
        this.ArmL = new ModelRenderer((ModelBase)this, 42, 22);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.2f, 9.5f, 0.1f);
        this.ArmL.addBox(-0.6f, -0.6f, -1.6f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.ArmL, 0.0f, 0.0f, -0.15358898f);
        this.LegL = new ModelRenderer((ModelBase)this, 30, 22);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 17.0f, 0.0f);
        this.LegL.addBox(-1.1f, 0.0f, -1.5f, 2, 7, 3, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 14);
        this.Body1.setRotationPoint(0.0f, 8.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.3f, -2.4f, 8, 4, 5, -0.1f);
        this.ArmR = new ModelRenderer((ModelBase)this, 42, 22);
        this.ArmR.setRotationPoint(-4.1f, 9.5f, 0.1f);
        this.ArmR.addBox(-1.5f, -0.6f, -1.4f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.ArmR, 0.0f, 0.0f, 0.15358898f);
        this.Body1.addChild(this.ShoulderL);
        this.Head.addChild(this.EarL);
        this.Body1.addChild(this.Body2);
        this.Head.addChild(this.EarR);
        this.Body1.addChild(this.ShoulderR);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Body1.render(f5);
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

