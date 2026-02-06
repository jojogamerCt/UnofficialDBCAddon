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

public class ModelRedRibbonSoldierBazooka
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer Bazooka1;
    public ModelRenderer Bazooka2;
    public ModelRenderer Bazooka3;
    public ModelRenderer Bazooka4;
    public ModelRenderer Bazooka5;
    public ModelRenderer Bazooka6;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;
    public ModelRenderer Ribbon;

    public ModelRedRibbonSoldierBazooka() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Bazooka4 = new ModelRenderer((ModelBase)this, 49, 45);
        this.Bazooka4.setRotationPoint(0.0f, 0.0f, 2.0f);
        this.Bazooka4.addBox(-2.5f, -2.5f, 0.0f, 5, 5, 2, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 0, 32);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-3.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmR2, -1.0871656f, -0.3642502f, 0.0f);
        this.Bazooka3 = new ModelRenderer((ModelBase)this, 49, 53);
        this.Bazooka3.setRotationPoint(0.0f, -1.2f, 3.9f);
        this.Bazooka3.addBox(-2.0f, -2.0f, 0.0f, 4, 4, 2, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 16, 16);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.Bazooka2 = new ModelRenderer((ModelBase)this, 34, 55);
        this.Bazooka2.setRotationPoint(0.0f, 1.1f, 0.8f);
        this.Bazooka2.addBox(-0.9f, 0.4f, 0.0f, 2, 3, 1, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 0, 43);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(-1.2f, 0.0f, 0.0f);
        this.ArmL2.addBox(-1.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmL2, -1.2292354f, 0.91053826f, 0.3642502f);
        this.ArmL = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 17, 32);
        this.ArmR3.setRotationPoint(-1.0f, 4.0f, 0.0f);
        this.ArmR3.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmR3, -1.1124729f, 0.091106184f, 0.0f);
        this.Ribbon = new ModelRenderer((ModelBase)this, 41, 20);
        this.Ribbon.setRotationPoint(2.8f, 0.9f, 0.0f);
        this.Ribbon.addBox(0.0f, -1.9f, 0.0f, 6, 5, 0, 0.0f);
        this.setRotateAngle(this.Ribbon, 0.0f, -0.95609134f, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Bazooka6 = new ModelRenderer((ModelBase)this, 51, 33);
        this.Bazooka6.setRotationPoint(0.0f, 0.0f, 1.9f);
        this.Bazooka6.addBox(-1.0f, -1.0f, 0.0f, 2, 2, 2, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 17, 43);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(1.0f, 4.0f, 0.0f);
        this.ArmL3.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.0f);
        this.Bazooka5 = new ModelRenderer((ModelBase)this, 49, 38);
        this.Bazooka5.setRotationPoint(0.0f, 0.0f, 1.9f);
        this.Bazooka5.addBox(-2.0f, -2.0f, 0.0f, 4, 4, 2, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Bazooka1 = new ModelRenderer((ModelBase)this, 27, 45);
        this.Bazooka1.setRotationPoint(-0.2f, 4.1f, -2.0f);
        this.Bazooka1.addBox(-1.5f, -1.5f, -10.2f, 3, 3, 15, 0.0f);
        this.setRotateAngle(this.Bazooka1, -0.9822713f, -0.22759093f, 0.18203785f);
        this.Bazooka3.addChild(this.Bazooka4);
        this.ArmR.addChild(this.ArmR2);
        this.Bazooka2.addChild(this.Bazooka3);
        this.Bazooka1.addChild(this.Bazooka2);
        this.ArmL.addChild(this.ArmL2);
        this.ArmR2.addChild(this.ArmR3);
        this.ArmL2.addChild(this.Ribbon);
        this.Bazooka5.addChild(this.Bazooka6);
        this.ArmL2.addChild(this.ArmL3);
        this.Bazooka4.addChild(this.Bazooka5);
        this.ArmR3.addChild(this.Bazooka1);
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
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
    }
}

