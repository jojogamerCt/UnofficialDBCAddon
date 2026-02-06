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

import JinRyuu.DragonBC.common.Items.Itemm;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

@SideOnly(value=Side.CLIENT)
public class Itemppm
extends Itemm {
    ModelRenderer sw;

    public Itemppm() {
        this(0.0f);
    }

    public Itemppm(float par1) {
        this(par1, 0.0f, 64, 32);
    }

    public Itemppm(float par1, float par2, int par3, int par4) {
        this.textureWidth = par3;
        this.textureHeight = par4;
        this.sw = new ModelRenderer((ModelBase)this, 0, 0);
        this.sw.addBox(-0.5f, -10.0f, -0.5f, 1, 18, 1);
        this.sw.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.sw.setTextureSize(64, 32);
        this.setRotation(this.sw, 0.0f, 0.0f, 0.0f);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void render(String s) {
        float par1 = 0.0625f;
        this.sw.rotateAngleY = 0.5f;
        this.sw.render(par1);
    }
}

