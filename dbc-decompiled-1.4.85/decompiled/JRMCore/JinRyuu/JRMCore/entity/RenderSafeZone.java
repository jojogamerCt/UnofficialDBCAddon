/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.entity.EntitySafeZone;
import JinRyuu.JRMCore.entity.ModelNPCNormalScaled;
import JinRyuu.JRMCore.entity.RenderJRMC;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderSafeZone
extends RenderJRMC {
    public RenderSafeZone() {
        super((ModelBase)new ModelNPCNormalScaled(), 0.5f);
    }

    public void renderAura(EntitySafeZone entity, double parX, double parY, double parZ, float par8, float par9) {
        if (JRMCoreClient.mc.playerController.isInCreativeMode()) {
            float f5 = 0.0625f;
            this.shadowSize = 0.0f;
            GL11.glPushMatrix();
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)((float)(-parX)), (float)((float)(-parY) - entity.height), (float)((float)parZ));
            GL11.glRotatef((float)(entity.ticksExisted * 2), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glDisable((int)2896);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glAlphaFunc((int)516, (float)0.003921569f);
            GL11.glDepthMask((boolean)false);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.5f);
            ResourceLocation tx = new ResourceLocation(entity.getTexture());
            this.renderManager.renderEngine.bindTexture(tx);
            this.mainModel.render((Entity)entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f5);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2896);
            GL11.glDepthMask((boolean)true);
            GL11.glPopMatrix();
            GL11.glPopMatrix();
        }
    }

    @Override
    public void doRender(Entity entity, double par2, double par4, double par6, float par8, float par9) {
        this.renderAura((EntitySafeZone)entity, par2, par4, par6, par8, par9);
    }
}

