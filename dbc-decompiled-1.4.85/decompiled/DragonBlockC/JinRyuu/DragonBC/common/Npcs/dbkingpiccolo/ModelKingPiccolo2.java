/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbkingpiccolo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelKingPiccolo2
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Head2;
    public ModelRenderer TentacleL;
    public ModelRenderer TentacleR;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer FeetL;
    public ModelRenderer FeetR;

    public ModelKingPiccolo2() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.TentacleL = new ModelRenderer((ModelBase)this, 25, -1);
        this.TentacleL.mirror = true;
        this.TentacleL.setRotationPoint(1.5f, -5.5f, -4.0f);
        this.TentacleL.addBox(0.0f, -2.0f, -4.0f, 0, 4, 4, 0.0f);
        this.setRotateAngle(this.TentacleL, 0.0f, -0.6981317f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -7.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.TentacleR = new ModelRenderer((ModelBase)this, 25, -1);
        this.TentacleR.setRotationPoint(-1.5f, -5.5f, -4.0f);
        this.TentacleR.addBox(0.0f, -2.0f, -4.0f, 0, 4, 4, 0.0f);
        this.setRotateAngle(this.TentacleR, 0.0f, 0.6981317f, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 1, 41);
        this.Body2.setRotationPoint(0.0f, 9.5f, 0.0f);
        this.Body2.addBox(-4.5f, -0.5f, -2.5f, 9, 2, 5, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 40, 40);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.5f, 8.0f, 0.0f);
        this.LegL.addBox(-2.5f, 0.0f, -3.0f, 5, 14, 6, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 40, 40);
        this.LegR.setRotationPoint(-2.5f, 8.0f, 0.0f);
        this.LegR.addBox(-2.5f, 0.0f, -3.0f, 5, 14, 6, 0.0f);
        this.FeetR = new ModelRenderer((ModelBase)this, 64, 41);
        this.FeetR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetR.addBox(-2.0f, 14.0f, -3.3f, 4, 2, 5, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 34, 1);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.8f, -4.5f, -1.0f);
        this.EarL.addBox(0.0f, -3.5f, 0.0f, 3, 6, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.87266463f, 0.04363323f);
        this.Body3 = new ModelRenderer((ModelBase)this, 1, 50);
        this.Body3.setRotationPoint(0.0f, 11.0f, 0.0f);
        this.Body3.addBox(-5.0f, 0.0f, -3.0f, 10, 4, 6, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 41, 19);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.8f, -5.1f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.5f, 5, 15, 5, -0.1f);
        this.Head2 = new ModelRenderer((ModelBase)this, 33, 1);
        this.Head2.setRotationPoint(0.0f, -5.6f, 1.7f);
        this.Head2.addBox(-3.5f, -3.0f, -5.0f, 7, 8, 8, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 34, 1);
        this.EarR.setRotationPoint(-3.5f, -4.5f, -1.0f);
        this.EarR.addBox(-3.5f, -3.5f, 0.0f, 3, 6, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.87266463f, -0.04363323f);
        this.ArmR = new ModelRenderer((ModelBase)this, 41, 19);
        this.ArmR.setRotationPoint(-5.8f, -5.1f, 0.0f);
        this.ArmR.addBox(-4.0f, -2.0f, -2.5f, 5, 15, 5, -0.1f);
        this.FeetL = new ModelRenderer((ModelBase)this, 64, 41);
        this.FeetL.mirror = true;
        this.FeetL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetL.addBox(-2.0f, 14.0f, -3.3f, 4, 2, 5, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 1, 24);
        this.Body.setRotationPoint(0.0f, -7.0f, 0.0f);
        this.Body.addBox(-5.0f, 0.0f, -3.0f, 10, 9, 6, 0.0f);
        this.Head.addChild(this.TentacleL);
        this.Head.addChild(this.TentacleR);
        this.Body.addChild(this.Body2);
        this.LegR.addChild(this.FeetR);
        this.Head.addChild(this.EarL);
        this.Body.addChild(this.Body3);
        this.Head.addChild(this.Head2);
        this.Head.addChild(this.EarR);
        this.LegL.addChild(this.FeetL);
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
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

