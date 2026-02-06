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
package JinRyuu.DragonBC.common.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class KintounModel
extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer FrontL;
    public ModelRenderer FrontR;
    public ModelRenderer SideL1;
    public ModelRenderer SideR;
    public ModelRenderer BackR1;
    public ModelRenderer BackL1;
    public ModelRenderer Bottom;
    public ModelRenderer SideL2;
    public ModelRenderer BackR2;
    public ModelRenderer Tail1;
    public ModelRenderer Tail2;

    public KintounModel() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.SideL2 = new ModelRenderer((ModelBase)this, 48, 11);
        this.SideL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SideL2.addBox(4.4f, -2.1f, -10.1f, 5, 4, 6, 0.0f);
        this.Base = new ModelRenderer((ModelBase)this, 0, 0);
        this.Base.setRotationPoint(0.0f, -9.7f, 0.0f);
        this.Base.addBox(-5.0f, -5.1f, -5.2f, 10, 10, 11, 0.0f);
        this.Tail1 = new ModelRenderer((ModelBase)this, 20, 48);
        this.Tail1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Tail1.addBox(-1.5f, -3.4f, 12.7f, 5, 4, 6, 0.0f);
        this.Bottom = new ModelRenderer((ModelBase)this, 43, 0);
        this.Bottom.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Bottom.addBox(-2.8f, 4.0f, -3.8f, 6, 2, 9, 0.0f);
        this.BackR1 = new ModelRenderer((ModelBase)this, 60, 41);
        this.BackR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BackR1.addBox(-7.3f, -5.5f, 2.9f, 7, 8, 10, 0.0f);
        this.Tail2 = new ModelRenderer((ModelBase)this, 0, 50);
        this.Tail2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Tail2.addBox(-3.9f, -2.4f, 12.4f, 5, 4, 9, 0.0f);
        this.BackL1 = new ModelRenderer((ModelBase)this, 94, 41);
        this.BackL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BackL1.addBox(-0.5f, -3.7f, 4.8f, 7, 8, 10, 0.0f);
        this.SideL1 = new ModelRenderer((ModelBase)this, 60, 11);
        this.SideL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SideL1.addBox(3.1f, -4.2f, -4.9f, 7, 8, 10, 0.0f);
        this.FrontL = new ModelRenderer((ModelBase)this, 0, 22);
        this.FrontL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FrontL.addBox(-0.4f, -5.5f, -12.7f, 7, 8, 10, 0.0f);
        this.FrontR = new ModelRenderer((ModelBase)this, 35, 22);
        this.FrontR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FrontR.addBox(-6.4f, -4.1f, -11.3f, 7, 8, 10, 0.0f);
        this.SideR = new ModelRenderer((ModelBase)this, 94, 11);
        this.SideR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SideR.addBox(-9.5f, -4.8f, -6.4f, 7, 8, 10, 0.0f);
        this.BackR2 = new ModelRenderer((ModelBase)this, 48, 41);
        this.BackR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BackR2.addBox(-4.6f, 1.2f, 4.1f, 5, 4, 6, 0.0f);
        this.SideL1.addChild(this.SideL2);
        this.BackL1.addChild(this.Tail1);
        this.Base.addChild(this.Bottom);
        this.Base.addChild(this.BackR1);
        this.Tail1.addChild(this.Tail2);
        this.Base.addChild(this.BackL1);
        this.Base.addChild(this.SideL1);
        this.Base.addChild(this.FrontL);
        this.Base.addChild(this.FrontR);
        this.Base.addChild(this.SideR);
        this.BackR1.addChild(this.BackR2);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        GL11.glRotatef((float)90.0f, (float)0.0f, (float)-1.0f, (float)0.0f);
        GL11.glTranslatef((float)0.2f, (float)0.5f, (float)0.0f);
        float ex = entity.ticksExisted;
        float cosi = MathHelper.cos((float)(ex * 0.2f)) * 0.02f;
        float cosi2 = MathHelper.cos((float)(ex * 0.2f)) * 0.01f * -1.0f;
        GL11.glTranslatef((float)cosi, (float)cosi, (float)0.0f);
        this.Base.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderModel(float f5) {
        this.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity) {
        float ex = par7Entity.ticksExisted;
        float cosi = MathHelper.cos((float)(ex * 0.5f)) * 0.2f;
        float cosi2 = MathHelper.cos((float)(ex * 0.5f)) * 0.1f;
        this.FrontL.rotateAngleX = -cosi * f2 * -1.0f;
        this.FrontL.rotateAngleY = -cosi * f2 * -1.0f;
        this.FrontR.rotateAngleX = -cosi2 * f2;
        this.FrontR.rotateAngleY = -cosi2 * f2;
        this.SideL1.rotateAngleX = -cosi * f2 * -1.0f;
        this.SideL1.rotateAngleY = -cosi * f2 * -1.0f;
        this.SideR.rotateAngleX = -cosi2 * f2;
        this.SideR.rotateAngleY = -cosi2 * f2;
        this.BackR1.rotateAngleX = -cosi * f2 * -1.0f;
        this.BackR1.rotateAngleY = -cosi * f2 * -1.0f;
        this.BackL1.rotateAngleX = -cosi2 * f2;
        this.BackL1.rotateAngleY = -cosi2 * f2;
        this.Bottom.rotateAngleX = -cosi * f2 * -1.0f;
        this.Bottom.rotateAngleY = -cosi * f2 * -1.0f;
        this.SideL2.rotateAngleX = -cosi2 * f2;
        this.SideL2.rotateAngleY = -cosi2 * f2;
        this.BackR2.rotateAngleX = -cosi * f2 * -1.0f;
        this.BackR2.rotateAngleY = -cosi * f2 * -1.0f;
        this.Tail1.rotateAngleX = -cosi2 * f2;
        this.Tail1.rotateAngleY = -cosi2 * f2;
        this.Tail2.rotateAngleX = -cosi * f2 * -1.0f;
        this.Tail2.rotateAngleY = -cosi * f2 * -1.0f;
    }
}

