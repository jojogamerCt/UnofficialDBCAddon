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

public class ModelBerryblue
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer BodyLower;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Skirt;
    public ModelRenderer UpperBody;
    public ModelRenderer Neck;
    public ModelRenderer GrannyBoobs;
    public ModelRenderer ShoulderL;
    public ModelRenderer ShoulderR;

    public ModelBerryblue() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Skirt = new ModelRenderer((ModelBase)this, 3, 37);
        this.Skirt.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Skirt.addBox(-4.5f, 6.0f, -3.5f, 9, 7, 7, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 4, 52);
        this.LegR.setRotationPoint(-1.9f, 15.0f, 0.0f);
        this.LegR.addBox(-1.5f, 0.0f, -1.5f, 3, 9, 3, 0.0f);
        this.ShoulderR = new ModelRenderer((ModelBase)this, 33, 9);
        this.ShoulderR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderR.addBox(-3.6f, -1.2f, -2.0f, 4, 2, 4, 0.0f);
        this.setRotateAngle(this.ShoulderR, 0.0f, 0.0f, -0.10471976f);
        this.LegL = new ModelRenderer((ModelBase)this, 4, 52);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 15.0f, 0.0f);
        this.LegL.addBox(-1.5f, 0.0f, -1.5f, 3, 9, 3, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 46, 21);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.6f, 9.2f, 0.8f);
        this.ArmL.addBox(-0.6f, -0.9f, -1.5f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.ArmL, 0.0f, 0.0f, -0.1308997f);
        this.Neck = new ModelRenderer((ModelBase)this, 6, 14);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-2.0f, -0.5f, -1.3f, 4, 1, 3, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 8.0f, 0.0f);
        this.Head.addBox(-4.0f, -6.1f, -3.5f, 8, 6, 7, 0.0f);
        this.BodyLower = new ModelRenderer((ModelBase)this, 1, 27);
        this.BodyLower.setRotationPoint(0.0f, 8.0f, 0.0f);
        this.BodyLower.addBox(-4.0f, 3.0f, -3.0f, 8, 3, 6, 0.0f);
        this.GrannyBoobs = new ModelRenderer((ModelBase)this, 24, 24);
        this.GrannyBoobs.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.GrannyBoobs.addBox(-3.5f, 0.9f, -0.8f, 7, 4, 3, 0.0f);
        this.setRotateAngle(this.GrannyBoobs, -0.7740535f, 0.0f, 0.0f);
        this.UpperBody = new ModelRenderer((ModelBase)this, 3, 19);
        this.UpperBody.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.UpperBody.addBox(-4.0f, 0.0f, -1.2f, 8, 3, 4, 0.0f);
        this.ShoulderL = new ModelRenderer((ModelBase)this, 33, 9);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderL.addBox(-0.6f, -1.2f, -2.0f, 4, 2, 4, 0.0f);
        this.setRotateAngle(this.ShoulderL, 0.0f, 0.0f, 0.10471976f);
        this.ArmR = new ModelRenderer((ModelBase)this, 46, 21);
        this.ArmR.setRotationPoint(-4.4f, 9.2f, 0.8f);
        this.ArmR.addBox(-1.5f, -0.9f, -1.5f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.ArmR, 0.0f, 0.0f, 0.1308997f);
        this.BodyLower.addChild(this.Skirt);
        this.ArmR.addChild(this.ShoulderR);
        this.UpperBody.addChild(this.Neck);
        this.UpperBody.addChild(this.GrannyBoobs);
        this.BodyLower.addChild(this.UpperBody);
        this.ArmL.addChild(this.ShoulderL);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.BodyLower.render(f5);
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

