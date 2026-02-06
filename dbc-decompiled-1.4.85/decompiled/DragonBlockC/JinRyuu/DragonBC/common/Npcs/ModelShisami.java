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

public class ModelShisami
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Chest;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer rhorn;
    public ModelRenderer lhorn;
    public ModelRenderer earL;
    public ModelRenderer earR;
    public ModelRenderer rhorn2;
    public ModelRenderer rhorn3;
    public ModelRenderer rhorn4;
    public ModelRenderer lhorn2;
    public ModelRenderer lhorn3;
    public ModelRenderer lhorn4;
    public ModelRenderer Belly;
    public ModelRenderer Neck;
    public ModelRenderer ShoulderR;
    public ModelRenderer ShoulderL;

    public ModelShisami() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.earL = new ModelRenderer((ModelBase)this, 33, 8);
        this.earL.mirror = true;
        this.earL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.earL.addBox(2.7f, -5.8f, -3.2f, 4, 3, 0, 0.0f);
        this.setRotateAngle(this.earL, 0.0f, -0.4098033f, 0.0f);
        this.lhorn4 = new ModelRenderer((ModelBase)this, 58, 1);
        this.lhorn4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.lhorn4.addBox(7.9f, -11.9f, -3.4f, 1, 1, 2, 0.0f);
        this.ShoulderR = new ModelRenderer((ModelBase)this, 42, 15);
        this.ShoulderR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderR.addBox(-5.0f, -1.7f, -2.4f, 6, 3, 5, 0.0f);
        this.ShoulderL = new ModelRenderer((ModelBase)this, 42, 15);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderL.addBox(-1.1f, -1.7f, -2.4f, 6, 3, 5, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 46, 24);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(6.8f, -3.4f, 0.8f);
        this.ArmL.addBox(-1.0f, -1.6f, -2.0f, 5, 14, 4, 0.0f);
        this.lhorn3 = new ModelRenderer((ModelBase)this, 51, 3);
        this.lhorn3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.lhorn3.addBox(6.7f, -11.4f, -2.8f, 2, 2, 2, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 43);
        this.LegR.setRotationPoint(-3.0f, 8.8f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 5, 15, 5, 0.0f);
        this.lhorn2 = new ModelRenderer((ModelBase)this, 40, 1);
        this.lhorn2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.lhorn2.addBox(6.2f, -9.9f, -2.3f, 2, 3, 3, 0.0f);
        this.Belly = new ModelRenderer((ModelBase)this, 21, 42);
        this.Belly.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Belly.addBox(-5.0f, 4.8f, -2.0f, 10, 9, 5, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -5.2f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.lhorn = new ModelRenderer((ModelBase)this, 25, 1);
        this.lhorn.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.lhorn.addBox(3.5f, -8.7f, -2.0f, 4, 3, 3, 0.0f);
        this.Neck = new ModelRenderer((ModelBase)this, 22, 20);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-3.0f, -0.5f, -1.2f, 6, 1, 4, 0.0f);
        this.rhorn4 = new ModelRenderer((ModelBase)this, 58, 1);
        this.rhorn4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rhorn4.addBox(-8.7f, -11.9f, -3.4f, 1, 1, 2, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 9, 29);
        this.Chest.setRotationPoint(0.0f, -5.0f, 0.0f);
        this.Chest.addBox(-6.0f, 0.0f, -2.3f, 12, 5, 6, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 46, 24);
        this.ArmR.setRotationPoint(-6.9f, -3.4f, 0.8f);
        this.ArmR.addBox(-4.1f, -1.6f, -2.0f, 5, 14, 4, 0.0f);
        this.rhorn2 = new ModelRenderer((ModelBase)this, 40, 1);
        this.rhorn2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rhorn2.addBox(-8.2f, -9.9f, -2.3f, 2, 3, 3, 0.0f);
        this.rhorn3 = new ModelRenderer((ModelBase)this, 51, 3);
        this.rhorn3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rhorn3.addBox(-8.6f, -11.4f, -2.8f, 2, 2, 2, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 43);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 8.8f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 5, 15, 5, 0.0f);
        this.rhorn = new ModelRenderer((ModelBase)this, 25, 1);
        this.rhorn.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rhorn.addBox(-7.5f, -8.7f, -2.0f, 4, 3, 3, 0.0f);
        this.earR = new ModelRenderer((ModelBase)this, 33, 8);
        this.earR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.earR.addBox(-6.5f, -5.8f, -3.2f, 4, 3, 0, 0.0f);
        this.setRotateAngle(this.earR, 0.0f, 0.4098033f, 0.0f);
        this.Head.addChild(this.earL);
        this.lhorn3.addChild(this.lhorn4);
        this.ArmR.addChild(this.ShoulderR);
        this.ArmL.addChild(this.ShoulderL);
        this.lhorn2.addChild(this.lhorn3);
        this.lhorn.addChild(this.lhorn2);
        this.Chest.addChild(this.Belly);
        this.Head.addChild(this.lhorn);
        this.Chest.addChild(this.Neck);
        this.rhorn3.addChild(this.rhorn4);
        this.rhorn.addChild(this.rhorn2);
        this.rhorn2.addChild(this.rhorn3);
        this.Head.addChild(this.rhorn);
        this.Head.addChild(this.earR);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Chest.render(f5);
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

