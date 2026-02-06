/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.RenderLiving
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.Npcs.EntityPorunga;
import JinRyuu.DragonBC.common.Npcs.ModelPorunga;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class RenderPorunga
extends RenderLiving {
    private ModelPorunga aModel = new ModelPorunga();
    private static final ResourceLocation endermanTextures = new ResourceLocation("jinryuudragonbc:npcs/Porunga.png");

    public RenderPorunga() {
        super((ModelBase)new ModelPorunga(), 0.5f);
        this.aModel.whis_granted = false;
    }

    public void renderPorunga(EntityPorunga par1Entity, double par2, double par4, double par6, float par8, float par9) {
        GL11.glPushMatrix();
        float var13 = this.handleRotationFloat((EntityLivingBase)par1Entity, par9);
        float size = this.handleSizeFloat((Entity)par1Entity, par9);
        Random rand = new Random();
        float randfloat = (float)((double)rand.nextInt(5) * 0.1);
        float var20 = size;
        GL11.glTranslatef((float)((float)par2 + 0.0f), (float)((float)par4 + 3.5f), (float)((float)par6 + 0.0f));
        GL11.glRotatef((float)(-(par1Entity.prevRotationYaw + (par1Entity.rotationYaw - par1Entity.prevRotationYaw) * par9 - 180.0f)), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        ResourceLocation txx = new ResourceLocation("jinryuudragonbc:npcs/Porunga.png");
        this.renderManager.renderEngine.bindTexture(txx);
        GL11.glEnable((int)2977);
        GL11.glPushMatrix();
        GL11.glScalef((float)var20, (float)var20, (float)var20);
        this.aModel.renderModel((Entity)par1Entity, 0.0625f);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    protected float handleRotationFloat(Entity par1Entity, float par2) {
        return (float)par1Entity.ticksExisted + par2;
    }

    protected float handleSizeFloat(Entity par1Entity, float par2) {
        float ticksExsisted = (float)par1Entity.ticksExisted * 0.05f;
        if (ticksExsisted > 3.0f) {
            ticksExsisted = 3.0f;
        }
        return ticksExsisted;
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        this.renderPorunga((EntityPorunga)par1Entity, par2, par4, par6, par8, par9);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return endermanTextures;
    }
}

