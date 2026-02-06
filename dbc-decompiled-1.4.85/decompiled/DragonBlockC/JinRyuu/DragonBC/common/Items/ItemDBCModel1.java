/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 */
package JinRyuu.DragonBC.common.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

@SideOnly(value=Side.CLIENT)
public class ItemDBCModel1
extends ModelBase {
    public ModelRenderer Handle;
    public ModelRenderer Handle2;
    public ModelRenderer Handle3;
    public ModelRenderer Handle4;
    public ModelRenderer Handle5;
    public ModelRenderer Handle7;
    public ModelRenderer Blade1;
    public ModelRenderer Handle6;
    public ModelRenderer Handle8;
    public ModelRenderer Blade2;
    public ModelRenderer Blade3;

    public ItemDBCModel1() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Handle = new ModelRenderer((ModelBase)this, 0, 0);
        this.Handle.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Handle.addBox(0.0f, 0.0f, 0.0f, 3, 20, 3, 0.0f);
        this.Handle8 = new ModelRenderer((ModelBase)this, 112, 6);
        this.Handle8.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Handle8.addBox(-2.0f, -2.5f, 0.0f, 3, 6, 4, 0.0f);
        this.setRotateAngle(this.Handle8, 0.0f, 0.0f, -0.40578905f);
        this.Handle4 = new ModelRenderer((ModelBase)this, 32, 0);
        this.Handle4.setRotationPoint(1.5f, -8.0f, -0.5f);
        this.Handle4.addBox(0.0f, 0.0f, 0.0f, 3, 3, 4, 0.0f);
        this.setRotateAngle(this.Handle4, 0.0f, 0.0f, 0.7853982f);
        this.Handle7 = new ModelRenderer((ModelBase)this, 66, 0);
        this.Handle7.setRotationPoint(9.5f, -4.0f, 3.5f);
        this.Handle7.addBox(0.0f, 0.0f, 0.0f, 6, 3, 4, 0.0f);
        this.setRotateAngle(this.Handle7, 0.0f, (float)(-Math.PI), 0.0f);
        this.Blade3 = new ModelRenderer((ModelBase)this, 54, 7);
        this.Blade3.setRotationPoint(-11.1f, 0.8f, 0.0f);
        this.Blade3.addBox(-50.0f, -70.0f, 0.0f, 6, 6, 2, 0.0f);
        this.setRotateAngle(this.Blade3, 0.0f, 0.0f, 0.7853982f);
        this.Handle3 = new ModelRenderer((ModelBase)this, 16, 0);
        this.Handle3.setRotationPoint(-0.5f, -6.0f, -0.5f);
        this.Handle3.addBox(0.0f, 0.0f, 0.0f, 4, 6, 4, 0.0f);
        this.Handle2 = new ModelRenderer((ModelBase)this, 12, 0);
        this.Handle2.setRotationPoint(0.5f, 20.0f, 0.5f);
        this.Handle2.addBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f);
        this.Blade2 = new ModelRenderer((ModelBase)this, 32, 7);
        this.Blade2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Blade2.addBox(-1.5f, -80.0f, 0.0f, 9, 80, 2, 0.0f);
        this.Blade1 = new ModelRenderer((ModelBase)this, 86, 0);
        this.Blade1.setRotationPoint(-1.5f, -11.0f, 0.5f);
        this.Blade1.addBox(0.0f, 0.0f, 0.0f, 6, 7, 2, 0.0f);
        this.Handle5 = new ModelRenderer((ModelBase)this, 46, 0);
        this.Handle5.setRotationPoint(-6.5f, -4.0f, -0.5f);
        this.Handle5.addBox(0.0f, 0.0f, 0.0f, 6, 3, 4, 0.0f);
        this.Handle6 = new ModelRenderer((ModelBase)this, 102, 0);
        this.Handle6.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Handle6.addBox(-2.0f, -2.5f, 0.0f, 3, 6, 4, 0.0f);
        this.setRotateAngle(this.Handle6, 0.0f, 0.0f, -0.40578905f);
        this.Handle7.addChild(this.Handle8);
        this.Handle.addChild(this.Handle4);
        this.Handle.addChild(this.Handle7);
        this.Blade1.addChild(this.Blade3);
        this.Handle.addChild(this.Handle3);
        this.Handle.addChild(this.Handle2);
        this.Blade1.addChild(this.Blade2);
        this.Handle.addChild(this.Blade1);
        this.Handle.addChild(this.Handle5);
        this.Handle5.addChild(this.Handle6);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void render() {
        float par1 = 0.0625f;
        this.Handle.render(par1);
    }
}

