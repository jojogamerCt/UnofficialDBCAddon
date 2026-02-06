/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbtournament;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPamput
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Hair;
    public ModelRenderer HairFront;
    public ModelRenderer HairBack;
    public ModelRenderer HairTop;
    public ModelRenderer HairSides;
    public ModelRenderer HairBack2;
    public ModelRenderer HairTop2;
    public ModelRenderer HairSides2;
    public ModelRenderer HairSides3;

    public ModelPamput() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.HairSides = new ModelRenderer((ModelBase)this, 90, 25);
        this.HairSides.setRotationPoint(0.0f, -0.4f, 1.2f);
        this.HairSides.addBox(-5.0f, -3.0f, -0.9f, 10, 6, 4, 0.0f);
        this.HairTop = new ModelRenderer((ModelBase)this, 94, 2);
        this.HairTop.setRotationPoint(0.0f, 0.3f, 0.0f);
        this.HairTop.addBox(-3.5f, -5.0f, -4.0f, 7, 2, 8, 0.0f);
        this.HairBack = new ModelRenderer((ModelBase)this, 68, 16);
        this.HairBack.setRotationPoint(0.0f, 0.0f, 4.9f);
        this.HairBack.addBox(-3.5f, -3.0f, -0.2f, 7, 6, 1, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 26, 19);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 26, 19);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Hair = new ModelRenderer((ModelBase)this, 65, 1);
        this.Hair.setRotationPoint(0.0f, -4.7f, 0.0f);
        this.Hair.addBox(-4.5f, -4.0f, 0.0f, 9, 8, 5, 0.0f);
        this.HairBack2 = new ModelRenderer((ModelBase)this, 68, 24);
        this.HairBack2.setRotationPoint(0.0f, 0.0f, 1.0f);
        this.HairBack2.addBox(-2.5f, -2.0f, -0.7f, 5, 4, 1, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 35);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 17);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.HairFront = new ModelRenderer((ModelBase)this, 34, 3);
        this.HairFront.setRotationPoint(0.0f, -0.8f, -2.6f);
        this.HairFront.addBox(-4.5f, -3.0f, -2.4f, 9, 4, 5, 0.0f);
        this.HairSides3 = new ModelRenderer((ModelBase)this, 91, 44);
        this.HairSides3.setRotationPoint(0.0f, 1.0f, 0.4f);
        this.HairSides3.addBox(-5.5f, -3.0f, -0.9f, 11, 4, 3, 0.0f);
        this.HairSides2 = new ModelRenderer((ModelBase)this, 90, 36);
        this.HairSides2.setRotationPoint(0.0f, 0.0f, -1.7f);
        this.HairSides2.addBox(-5.0f, -3.0f, -4.2f, 10, 2, 5, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 35);
        this.LegR.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.HairTop2 = new ModelRenderer((ModelBase)this, 95, 14);
        this.HairTop2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairTop2.addBox(-2.0f, -5.5f, -2.5f, 4, 2, 5, 0.0f);
        this.Hair.addChild(this.HairSides);
        this.Hair.addChild(this.HairTop);
        this.Hair.addChild(this.HairBack);
        this.Head.addChild(this.Hair);
        this.HairBack.addChild(this.HairBack2);
        this.Hair.addChild(this.HairFront);
        this.HairSides.addChild(this.HairSides3);
        this.HairSides.addChild(this.HairSides2);
        this.HairTop.addChild(this.HairTop2);
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

