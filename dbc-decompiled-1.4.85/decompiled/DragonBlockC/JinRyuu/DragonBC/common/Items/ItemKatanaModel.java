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
public class ItemKatanaModel
extends ModelBase {
    ModelRenderer sw;
    ModelRenderer grip;
    ModelRenderer pummel;
    ModelRenderer guard;
    ModelRenderer edge;
    ModelRenderer kat;
    ModelRenderer kgrip;
    ModelRenderer kguard;
    ModelRenderer kedge;

    public ItemKatanaModel() {
        this(0.0f);
    }

    public ItemKatanaModel(float par1) {
        this(par1, 0.0f, 64, 32);
    }

    public ItemKatanaModel(float par1, float par2, int par3, int par4) {
        this.textureWidth = par3;
        this.textureHeight = par4;
        this.sw = new ModelRenderer((ModelBase)this, 0, 0);
        this.sw.addBox(-0.0f, -0.0f, -0.0f, 0, 0, 0, 0.02f);
        this.sw.setRotationPoint(0.0f, 0.0f + par2, 0.0f);
        this.grip = new ModelRenderer((ModelBase)this, 0, 0);
        this.grip.addBox(0.0f, 13.96667f, 0.0f, 1, 7, 1);
        this.grip.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.grip, 0.0f, 0.0f, 0.0f);
        this.guard = new ModelRenderer((ModelBase)this, 0, 26);
        this.guard.addBox(-2.0f, 9.9f, -10.0f, 5, 1, 1);
        this.guard.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.guard, 0.7853982f, 0.0f, 0.0f);
        this.edge = new ModelRenderer((ModelBase)this, 4, 0);
        this.edge.addBox(-1.0f, -10.1f, 0.5f, 3, 24, 0);
        this.edge.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.edge, 0.0f, 0.0f, 0.0f);
        this.pummel = new ModelRenderer((ModelBase)this, 0, 28);
        this.pummel.addBox(-0.5f, 20.1f, -0.5f, 2, 2, 2);
        this.pummel.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.pummel, 0.0f, 0.0f, 0.0f);
        this.sw.addChild(this.grip);
        this.sw.addChild(this.pummel);
        this.sw.addChild(this.guard);
        this.sw.addChild(this.edge);
        this.kat = new ModelRenderer((ModelBase)this, 0, 0);
        this.kat.addBox(-0.0f, -0.0f, -0.0f, 0, 0, 0, 0.02f);
        this.kat.setRotationPoint(0.0f, 0.0f + par2, 0.0f);
        this.kgrip = new ModelRenderer((ModelBase)this, 0, 0);
        this.kgrip.addBox(0.0f, 13.96667f, 0.0f, 1, 7, 1);
        this.kgrip.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.kgrip, 0.0f, 0.0f, 0.0f);
        this.kguard = new ModelRenderer((ModelBase)this, 0, 29);
        this.kguard.addBox(-1.0f, 13.9f, -1.0f, 3, 0, 3);
        this.kguard.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.kguard, 0.0f, 0.0f, 0.0f);
        this.kedge = new ModelRenderer((ModelBase)this, 4, 0);
        this.kedge.addBox(-1.0f, -10.1f, 0.5f, 3, 24, 0);
        this.kedge.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.kedge, 0.0f, 0.0f, 0.0f);
        this.kat.addChild(this.kgrip);
        this.kat.addChild(this.kguard);
        this.kat.addChild(this.kedge);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void render(String s) {
        float par1 = 0.0625f;
        if (s.contains("S") || s.contains("Z")) {
            this.sw.render(par1);
        }
        if (s.contains("K")) {
            this.kat.render(par1);
        }
    }
}

