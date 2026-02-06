/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDino02
extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightLeg;
    public ModelRenderer Tail;
    public ModelRenderer Neck2;
    public ModelRenderer Neck3;
    public ModelRenderer Neck4;
    public ModelRenderer Neck5;
    public ModelRenderer Head;
    public ModelRenderer L;
    public ModelRenderer R;
    public ModelRenderer T;
    public ModelRenderer Mouth;
    public ModelRenderer T2;
    public ModelRenderer LeftLeg2;
    public ModelRenderer LeftLeg3;
    public ModelRenderer lf1;
    public ModelRenderer lf2;
    public ModelRenderer lf3;
    public ModelRenderer lf4;
    public ModelRenderer RightLeg2;
    public ModelRenderer RightLeg3;
    public ModelRenderer rf1;
    public ModelRenderer rf2;
    public ModelRenderer rf3;
    public ModelRenderer lf4_1;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer Tail5;
    public ModelRenderer Tail6;

    public ModelDino02() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.rf3 = new ModelRenderer((ModelBase)this, 67, 76);
        this.rf3.setRotationPoint(-1.1f, 10.0f, 0.8f);
        this.rf3.addBox(-0.5f, 0.0f, -0.8f, 1, 5, 1, 0.0f);
        this.setRotation(this.rf3, -1.0471976f, 0.4098033f, 0.0f);
        this.lf3 = new ModelRenderer((ModelBase)this, 67, 76);
        this.lf3.mirror = true;
        this.lf3.setRotationPoint(-1.1f, 10.0f, 0.8f);
        this.lf3.addBox(-0.5f, 0.0f, -0.8f, 1, 5, 1, 0.0f);
        this.setRotation(this.lf3, -1.0471976f, 0.4098033f, 0.0f);
        this.lf4 = new ModelRenderer((ModelBase)this, 67, 76);
        this.lf4.mirror = true;
        this.lf4.setRotationPoint(0.0f, 9.9f, 3.4f);
        this.lf4.addBox(-1.0f, 0.0f, -0.5f, 2, 4, 1, 0.0f);
        this.setRotation(this.lf4, 1.3203416f, 0.0f, 0.0f);
        this.R = new ModelRenderer((ModelBase)this, 35, 0);
        this.R.setRotationPoint(0.0f, 0.0f, -5.7f);
        this.R.addBox(-4.0f, -2.5f, 0.0f, 4, 5, 6, 0.0f);
        this.setRotation(this.R, 0.0f, -0.59184116f, 0.0f);
        this.RightLeg2 = new ModelRenderer((ModelBase)this, 73, 54);
        this.RightLeg2.setRotationPoint(-3.0f, 10.1f, -2.8f);
        this.RightLeg2.addBox(-3.0f, 0.0f, -4.4f, 6, 11, 5, 0.0f);
        this.setRotation(this.RightLeg2, 1.5934856f, 0.0f, 0.0f);
        this.Tail2 = new ModelRenderer((ModelBase)this, 0, 89);
        this.Tail2.setRotationPoint(0.5f, 0.5f, 10.9f);
        this.Tail2.addBox(-5.0f, -5.0f, 0.0f, 9, 9, 13, 0.0f);
        this.setRotation(this.Tail2, -0.27314404f, 0.0f, 0.0f);
        this.LeftLeg = new ModelRenderer((ModelBase)this, 73, 32);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(7.9f, 7.8f, 8.5f);
        this.LeftLeg.addBox(0.4f, -0.8f, -3.5f, 7, 11, 7, 0.0f);
        this.setRotation(this.LeftLeg, -0.5009095f, 0.0f, 0.0f);
        this.lf2 = new ModelRenderer((ModelBase)this, 67, 76);
        this.lf2.mirror = true;
        this.lf2.setRotationPoint(0.0f, 10.0f, 0.8f);
        this.lf2.addBox(-0.5f, 0.0f, -0.8f, 1, 5, 1, 0.0f);
        this.setRotation(this.lf2, -1.0471976f, 0.0f, 0.091106184f);
        this.lf4_1 = new ModelRenderer((ModelBase)this, 67, 76);
        this.lf4_1.setRotationPoint(0.0f, 9.9f, 3.4f);
        this.lf4_1.addBox(-1.0f, 0.0f, -0.5f, 2, 4, 1, 0.0f);
        this.setRotation(this.lf4_1, 1.3203416f, 0.0f, 0.0f);
        this.Tail6 = new ModelRenderer((ModelBase)this, 81, 101);
        this.Tail6.setRotationPoint(-0.5f, 0.0f, 9.7f);
        this.Tail6.addBox(-3.0f, -3.0f, 0.0f, 6, 6, 13, 0.0f);
        this.RightLeg = new ModelRenderer((ModelBase)this, 73, 32);
        this.RightLeg.setRotationPoint(-7.9f, 7.8f, 8.5f);
        this.RightLeg.addBox(-6.5f, -0.8f, -3.5f, 7, 11, 7, 0.0f);
        this.setRotation(this.RightLeg, -0.5009095f, 0.0f, 0.0f);
        this.T2 = new ModelRenderer((ModelBase)this, 59, 0);
        this.T2.setRotationPoint(0.0f, -5.0f, 0.1f);
        this.T2.addBox(-1.0f, -6.0f, -2.5f, 2, 6, 3, 0.0f);
        this.setRotation(this.T2, -0.31869712f, 0.0f, 0.0f);
        this.Tail3 = new ModelRenderer((ModelBase)this, 34, 101);
        this.Tail3.setRotationPoint(-0.5f, -1.0f, 9.7f);
        this.Tail3.addBox(-4.0f, -4.0f, 0.0f, 8, 8, 13, 0.0f);
        this.setRotation(this.Tail3, -0.27314404f, 0.0f, 0.0f);
        this.RightLeg3 = new ModelRenderer((ModelBase)this, 73, 71);
        this.RightLeg3.setRotationPoint(0.0f, 9.8f, -0.5f);
        this.RightLeg3.addBox(-2.0f, -0.7f, 0.0f, 4, 11, 4, 0.0f);
        this.setRotation(this.RightLeg3, -1.2747885f, 0.0f, 0.0f);
        this.Tail5 = new ModelRenderer((ModelBase)this, 34, 101);
        this.Tail5.setRotationPoint(-0.5f, 0.0f, 9.7f);
        this.Tail5.addBox(-4.0f, -4.0f, 0.0f, 8, 8, 13, 0.0f);
        this.setRotation(this.Tail5, 0.27314404f, 0.0f, 0.0f);
        this.rf2 = new ModelRenderer((ModelBase)this, 67, 76);
        this.rf2.setRotationPoint(0.0f, 10.0f, 0.8f);
        this.rf2.addBox(-0.5f, 0.0f, -0.8f, 1, 5, 1, 0.0f);
        this.setRotation(this.rf2, -1.0471976f, 0.0f, 0.091106184f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, -7.0f);
        this.Head.addBox(-4.0f, -3.5f, -8.0f, 8, 7, 8, 0.0f);
        this.setRotation(this.Head, 0.31869712f, 0.0f, 0.0f);
        this.T = new ModelRenderer((ModelBase)this, 59, 11);
        this.T.setRotationPoint(0.0f, -1.9f, -5.4f);
        this.T.addBox(-1.5f, -6.0f, -2.5f, 3, 6, 5, 0.0f);
        this.setRotation(this.T, -0.5009095f, 0.0f, 0.0f);
        this.Neck4 = new ModelRenderer((ModelBase)this, 80, 0);
        this.Neck4.setRotationPoint(0.0f, 0.0f, -7.0f);
        this.Neck4.addBox(-4.0f, -3.0f, -8.0f, 8, 6, 8, 0.0f);
        this.Tail4 = new ModelRenderer((ModelBase)this, 34, 101);
        this.Tail4.setRotationPoint(-0.5f, 0.0f, 9.7f);
        this.Tail4.addBox(-4.0f, -4.0f, 0.0f, 8, 8, 13, 0.0f);
        this.rf1 = new ModelRenderer((ModelBase)this, 67, 76);
        this.rf1.setRotationPoint(1.1f, 10.0f, 0.8f);
        this.rf1.addBox(-0.5f, 0.0f, -0.8f, 1, 5, 1, 0.0f);
        this.setRotation(this.rf1, -1.0471976f, -0.4098033f, 0.0f);
        this.lf1 = new ModelRenderer((ModelBase)this, 67, 76);
        this.lf1.mirror = true;
        this.lf1.setRotationPoint(1.1f, 10.0f, 0.8f);
        this.lf1.addBox(-0.5f, 0.0f, -0.8f, 1, 5, 1, 0.0f);
        this.setRotation(this.lf1, -1.0471976f, -0.4098033f, 0.0f);
        this.Neck5 = new ModelRenderer((ModelBase)this, 80, 0);
        this.Neck5.setRotationPoint(0.0f, -0.5f, -6.2f);
        this.Neck5.addBox(-4.0f, -3.0f, -8.0f, 8, 6, 8, 0.0f);
        this.setRotation(this.Neck5, 0.67945665f, 0.0f, 0.0f);
        this.Neck2 = new ModelRenderer((ModelBase)this, 80, 0);
        this.Neck2.setRotationPoint(0.0f, 0.0f, -7.0f);
        this.Neck2.addBox(-4.0f, -3.0f, -8.0f, 8, 6, 8, 0.0f);
        this.setRotation(this.Neck2, -0.22759093f, 0.0f, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 30);
        this.Body.setRotationPoint(0.0f, -7.0f, 0.0f);
        this.Body.addBox(-8.0f, -2.0f, -1.8f, 16, 13, 19, 0.0f);
        this.Tail = new ModelRenderer((ModelBase)this, 0, 65);
        this.Tail.setRotationPoint(0.0f, 4.1f, 13.6f);
        this.Tail.addBox(-5.0f, -5.0f, 0.0f, 10, 10, 13, 0.0f);
        this.LeftLeg3 = new ModelRenderer((ModelBase)this, 73, 71);
        this.LeftLeg3.mirror = true;
        this.LeftLeg3.setRotationPoint(0.0f, 9.8f, -0.5f);
        this.LeftLeg3.addBox(-2.0f, -0.7f, 0.0f, 4, 11, 4, 0.0f);
        this.setRotation(this.LeftLeg3, -1.2747885f, 0.0f, 0.0f);
        this.Neck = new ModelRenderer((ModelBase)this, 80, 0);
        this.Neck.setRotationPoint(0.0f, 1.6f, 1.8f);
        this.Neck.addBox(-4.0f, -3.0f, -8.0f, 8, 6, 8, 0.0f);
        this.setRotation(this.Neck, 0.18203785f, 0.0f, 0.0f);
        this.Mouth = new ModelRenderer((ModelBase)this, 0, 16);
        this.Mouth.setRotationPoint(0.0f, 1.2f, -7.5f);
        this.Mouth.addBox(-2.5f, -2.0f, -7.0f, 5, 4, 7, 0.0f);
        this.Neck3 = new ModelRenderer((ModelBase)this, 80, 0);
        this.Neck3.setRotationPoint(0.0f, 0.5f, -6.4f);
        this.Neck3.addBox(-4.0f, -3.0f, -8.0f, 8, 6, 8, 0.0f);
        this.setRotation(this.Neck3, -0.7285004f, 0.0f, 0.0f);
        this.LeftLeg2 = new ModelRenderer((ModelBase)this, 73, 54);
        this.LeftLeg2.mirror = true;
        this.LeftLeg2.setRotationPoint(4.0f, 10.1f, -2.8f);
        this.LeftLeg2.addBox(-3.0f, 0.0f, -4.4f, 6, 11, 5, 0.0f);
        this.setRotation(this.LeftLeg2, 1.5934856f, 0.0f, 0.0f);
        this.L = new ModelRenderer((ModelBase)this, 35, 0);
        this.L.mirror = true;
        this.L.setRotationPoint(0.0f, 0.0f, -5.0f);
        this.L.addBox(0.0f, -2.5f, 0.0f, 4, 5, 6, 0.0f);
        this.setRotation(this.L, 0.0f, 0.59184116f, 0.0f);
        this.RightLeg3.addChild(this.rf3);
        this.LeftLeg3.addChild(this.lf3);
        this.LeftLeg3.addChild(this.lf4);
        this.Head.addChild(this.R);
        this.RightLeg.addChild(this.RightLeg2);
        this.Tail.addChild(this.Tail2);
        this.Body.addChild(this.LeftLeg);
        this.LeftLeg3.addChild(this.lf2);
        this.RightLeg3.addChild(this.lf4_1);
        this.Tail5.addChild(this.Tail6);
        this.Body.addChild(this.RightLeg);
        this.T.addChild(this.T2);
        this.Tail2.addChild(this.Tail3);
        this.RightLeg2.addChild(this.RightLeg3);
        this.Tail4.addChild(this.Tail5);
        this.RightLeg3.addChild(this.rf2);
        this.Neck5.addChild(this.Head);
        this.Head.addChild(this.T);
        this.Neck3.addChild(this.Neck4);
        this.Tail3.addChild(this.Tail4);
        this.RightLeg3.addChild(this.rf1);
        this.LeftLeg3.addChild(this.lf1);
        this.Neck4.addChild(this.Neck5);
        this.Neck.addChild(this.Neck2);
        this.Body.addChild(this.Tail);
        this.LeftLeg2.addChild(this.LeftLeg3);
        this.Body.addChild(this.Neck);
        this.Head.addChild(this.Mouth);
        this.Neck2.addChild(this.Neck3);
        this.LeftLeg.addChild(this.LeftLeg2);
        this.Head.addChild(this.L);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        this.Body.render(f5);
        GL11.glPopMatrix();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        float r2 = 180.0f;
        float r = 360.0f;
        float n4 = (par4 + r2) % r;
        float f = n4 = n4 > 0.0f ? n4 - r2 : n4 + r2;
        n4 = n4 > r2 ? r2 : (n4 < -r2 ? -r2 : n4);
        float n5 = par5;
        float p = 5.0f;
        this.Head.rotateAngleY = n4 / (r2 / (float)Math.PI) / p;
        this.Head.rotateAngleX = n5 / (r2 / (float)Math.PI) / p;
        this.Neck.rotateAngleY = n4 / (r2 / (float)Math.PI) / p;
        this.Neck.rotateAngleX = n5 / (r2 / (float)Math.PI) / p;
        this.Neck2.rotateAngleY = n4 / (r2 / (float)Math.PI) / p;
        this.Neck2.rotateAngleX = n5 / (r2 / (float)Math.PI) / p;
        this.Neck3.rotateAngleY = n4 / (r2 / (float)Math.PI) / p;
        this.Neck3.rotateAngleX = n5 / (r2 / (float)Math.PI) / p;
        this.Neck4.rotateAngleY = n4 / (r2 / (float)Math.PI) / p;
        this.Neck4.rotateAngleX = n5 / (r2 / (float)Math.PI) / p;
        this.Neck5.rotateAngleY = n4 / (r2 / (float)Math.PI) / p;
        this.Neck5.rotateAngleX = n5 / (r2 / (float)Math.PI) / p;
        this.RightLeg.rotateAngleX = -0.5f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LeftLeg.rotateAngleX = -0.5f + MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.RightLeg.rotateAngleY = 0.0f;
        this.LeftLeg.rotateAngleY = 0.0f;
        float ex = par7Entity.ticksExisted;
        float r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        float r4 = MathHelper.cos((float)(ex / 8.0f)) / 4.0f - 0.2f;
        this.Tail.rotateAngleY = 0.2f;
        this.Tail.rotateAngleY += r4;
        this.Tail2.rotateAngleY = 0.2f;
        this.Tail2.rotateAngleY += r4;
        this.Tail3.rotateAngleY = 0.2f;
        this.Tail3.rotateAngleY += r4;
        this.Tail4.rotateAngleY = 0.2f;
        this.Tail4.rotateAngleY += r4;
        this.Tail5.rotateAngleY = 0.2f;
        this.Tail5.rotateAngleY += r4;
        this.Tail6.rotateAngleY = 0.2f;
        this.Tail6.rotateAngleY += r4;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

