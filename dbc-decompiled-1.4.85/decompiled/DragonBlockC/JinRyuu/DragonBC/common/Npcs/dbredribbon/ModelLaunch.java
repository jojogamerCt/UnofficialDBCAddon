/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbredribbon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelLaunch
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer HairBack1;
    public ModelRenderer Hair;
    public ModelRenderer Ribbon;
    public ModelRenderer HairBack2;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Hair5;
    public ModelRenderer Hair6;
    public ModelRenderer Hair7;
    public ModelRenderer HairFront;
    public ModelRenderer Body2;
    public ModelRenderer Boobs;
    public ModelRenderer Body3;

    public ModelLaunch() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 30);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.0f, 5.8f, -1.6f, 6, 3, 3, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 46);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, -0.1f);
        this.Hair6 = new ModelRenderer((ModelBase)this, 49, 7);
        this.Hair6.setRotationPoint(0.0f, -6.6f, -0.2f);
        this.Hair6.addBox(-1.1f, -3.4f, -0.9f, 2, 4, 3, 0.0f);
        this.setRotateAngle(this.Hair6, -0.091106184f, -0.091106184f, -0.7285004f);
        this.HairBack2 = new ModelRenderer((ModelBase)this, 47, 33);
        this.HairBack2.setRotationPoint(0.0f, 3.9f, 0.3f);
        this.HairBack2.addBox(-2.9f, 0.0f, -0.5f, 6, 3, 1, 0.0f);
        this.setRotateAngle(this.HairBack2, 0.091106184f, 0.0f, 0.0f);
        this.HairFront = new ModelRenderer((ModelBase)this, 41, 15);
        this.HairFront.setRotationPoint(0.2f, -6.7f, -3.6f);
        this.HairFront.addBox(-6.1f, -1.0f, 0.0f, 11, 7, 0, 0.0f);
        this.Hair3 = new ModelRenderer((ModelBase)this, 39, 0);
        this.Hair3.setRotationPoint(-2.5f, -2.0f, 2.0f);
        this.Hair3.addBox(-1.1f, 0.0f, -0.7f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair3, 0.0f, 0.0f, 0.6953392f);
        this.Hair = new ModelRenderer((ModelBase)this, 0, 0);
        this.Hair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addBox(-0.5f, -3.0f, 0.0f, 1, 1, 1, 0.0f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 37, 6);
        this.Hair2.setRotationPoint(-1.1f, -6.2f, 1.7f);
        this.Hair2.addBox(-3.8f, -1.6f, -0.8f, 3, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair2, 0.0f, -0.47403142f, 0.043284167f);
        this.Boobs = new ModelRenderer((ModelBase)this, 19, 31);
        this.Boobs.setRotationPoint(0.0f, -0.5f, 0.0f);
        this.Boobs.addBox(-3.0f, 1.8f, -0.4f, 6, 3, 2, 0.0f);
        this.setRotateAngle(this.Boobs, -0.59864795f, 0.0f, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 18, 47);
        this.ArmR.setRotationPoint(-4.3f, 3.0f, 0.0f);
        this.ArmR.addBox(-1.9f, -1.5f, -1.8f, 3, 11, 4, -0.1f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 38);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-3.5f, 8.8f, -2.0f, 7, 2, 4, 0.0f);
        this.Ribbon = new ModelRenderer((ModelBase)this, 24, 18);
        this.Ribbon.setRotationPoint(3.5f, -6.0f, -2.1f);
        this.Ribbon.addBox(0.0f, -2.8f, 0.0f, 6, 7, 0, 0.0f);
        this.setRotateAngle(this.Ribbon, 0.0f, -0.4098033f, 0.0f);
        this.Hair4 = new ModelRenderer((ModelBase)this, 39, 0);
        this.Hair4.setRotationPoint(0.3f, -5.6f, 1.1f);
        this.Hair4.addBox(-1.0f, -2.6f, -0.8f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.Hair4, -0.22968534f, -0.2375393f, -0.091106184f);
        this.Hair7 = new ModelRenderer((ModelBase)this, 49, 0);
        this.Hair7.setRotationPoint(1.3f, -6.0f, -0.2f);
        this.Hair7.addBox(-1.0f, -2.6f, -0.8f, 3, 3, 3, 0.0f);
        this.setRotateAngle(this.Hair7, 0.0f, 0.0f, 1.1383038f);
        this.HairBack1 = new ModelRenderer((ModelBase)this, 39, 26);
        this.HairBack1.setRotationPoint(0.0f, -0.4f, 2.3f);
        this.HairBack1.addBox(-4.5f, 0.0f, -0.5f, 9, 4, 2, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 46);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, -0.1f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 18);
        this.Body.setRotationPoint(0.0f, 1.3f, 0.0f);
        this.Body.addBox(-3.5f, 0.0f, -2.0f, 7, 6, 4, -0.2f);
        this.Hair1 = new ModelRenderer((ModelBase)this, 39, 0);
        this.Hair1.setRotationPoint(-2.0f, -6.8f, -1.5f);
        this.Hair1.addBox(-1.0f, -2.6f, -0.8f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair1, -0.22759093f, -0.091106184f, -1.2292354f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 1.5f, 0.0f);
        this.Head.addBox(-4.0f, -7.5f, -4.0f, 8, 8, 8, -0.5f);
        this.ArmL = new ModelRenderer((ModelBase)this, 18, 47);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.3f, 3.0f, 0.0f);
        this.ArmL.addBox(-1.1f, -1.5f, -1.8f, 3, 11, 4, -0.1f);
        this.Hair5 = new ModelRenderer((ModelBase)this, 39, 0);
        this.Hair5.setRotationPoint(2.4f, -2.1f, 2.0f);
        this.Hair5.addBox(-1.0f, -0.2f, -0.8f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair5, 0.0f, 0.011913514f, -0.7876671f);
        this.Body.addChild(this.Body2);
        this.Hair.addChild(this.Hair6);
        this.HairBack1.addChild(this.HairBack2);
        this.Hair.addChild(this.HairFront);
        this.Hair.addChild(this.Hair3);
        this.Head.addChild(this.Hair);
        this.Hair.addChild(this.Hair2);
        this.Body.addChild(this.Boobs);
        this.Body2.addChild(this.Body3);
        this.Head.addChild(this.Ribbon);
        this.Hair.addChild(this.Hair4);
        this.Hair.addChild(this.Hair7);
        this.Head.addChild(this.HairBack1);
        this.Hair.addChild(this.Hair1);
        this.Hair.addChild(this.Hair5);
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

