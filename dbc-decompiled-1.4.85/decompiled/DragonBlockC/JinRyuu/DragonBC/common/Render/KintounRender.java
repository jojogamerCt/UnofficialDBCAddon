/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Render.KintounBaseEntity;
import JinRyuu.DragonBC.common.Render.KintounModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class KintounRender
extends Render {
    private final String[] texture = new String[]{"Flying_Nimbus", "Dark_Nimbus"};
    private int type = 0;
    private ModelBase aModel;
    private static final ResourceLocation shearedSheepTextures = new ResourceLocation("jinryuudragonbc:armor/halo.png");

    public KintounRender() {
        this.aModel = new KintounModel();
        this.shadowSize = 0.5f;
    }

    public KintounRender(int id) {
        this.type = id;
        this.aModel = new KintounModel();
        this.shadowSize = 0.5f;
    }

    public void renderAModelAt(KintounBaseEntity entity, double d, double d1, double d2, float f, float par9) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d1 - 0.7f), (float)((float)d2));
        GL11.glRotatef((float)(90.0f - f), (float)0.0f, (float)1.0f, (float)0.0f);
        ResourceLocation tx = new ResourceLocation("jinryuudragonbc:npcs/" + this.texture[this.type] + ".png");
        this.renderManager.renderEngine.bindTexture(tx);
        GL11.glEnable((int)2977);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        this.aModel.render((Entity)entity, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        this.renderAModelAt((KintounBaseEntity)par1Entity, par2, par4, par6, par8, par9);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return shearedSheepTextures;
    }
}

