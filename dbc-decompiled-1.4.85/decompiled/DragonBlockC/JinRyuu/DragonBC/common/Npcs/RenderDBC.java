/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.entity.EntityJRMC
 *  cpw.mods.fml.common.eventhandler.Event
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.entity.RendererLivingEntity
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.RenderLivingEvent$Specials$Post
 *  net.minecraftforge.client.event.RenderLivingEvent$Specials$Pre
 *  net.minecraftforge.common.MinecraftForge
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDragon;
import JinRyuu.DragonBC.common.Npcs.EntityDragon2;
import JinRyuu.DragonBC.common.Npcs.EntityNamekFrog;
import JinRyuu.DragonBC.common.Npcs.EntityNamekian03;
import JinRyuu.JRMCore.entity.EntityJRMC;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class RenderDBC
extends RendererLivingEntity {
    boolean b = false;

    public RenderDBC(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
        this.mainModel = par1ModelBase;
        this.shadowSize = par2;
    }

    public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) {
        this.doRender((EntityLivingBase)entity, d0, d1, d2, f, f1);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        if (entity instanceof EntityNamekian03) {
            return new ResourceLocation(((EntityNamekian03)entity).getTexture());
        }
        if (entity instanceof EntityDBC) {
            return new ResourceLocation(((EntityDBC)entity).getTexture());
        }
        if (entity instanceof EntityJRMC) {
            return new ResourceLocation(((EntityJRMC)entity).getTexture());
        }
        if (entity instanceof EntityDragon) {
            return new ResourceLocation(((EntityDragon)entity).getTexture());
        }
        if (entity instanceof EntityDragon2) {
            return new ResourceLocation(((EntityDragon2)entity).getTexture());
        }
        if (entity instanceof EntityNamekFrog) {
            return new ResourceLocation(((EntityNamekFrog)entity).getTexture());
        }
        return new ResourceLocation("jinryuudragonbc:npcs/" + entity.getCommandSenderName().replaceAll("entity.jinryuudragonblockc.", "").replaceAll(".name", "") + ".png");
    }

    protected void passSpecialRender(EntityLivingBase par1EntityLivingBase, double par2, double par4, double par6) {
        if (MinecraftForge.EVENT_BUS.post((Event)new RenderLivingEvent.Specials.Pre(par1EntityLivingBase, (RendererLivingEntity)this, par2, par4, par6))) {
            return;
        }
        if (this.b) {
            float f2;
            float f = 1.6f;
            float f1 = 0.016666668f * f;
            double d3 = par1EntityLivingBase.getDistanceSqToEntity((Entity)this.renderManager.livingPlayer);
            float f3 = f2 = par1EntityLivingBase.isSneaking() ? NAME_TAG_RANGE_SNEAK : NAME_TAG_RANGE;
            if (d3 < (double)(f2 * f2)) {
                String s = par1EntityLivingBase.getCommandSenderName();
                if (par1EntityLivingBase.isSneaking()) {
                    FontRenderer fontrenderer = this.getFontRendererFromRenderManager();
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)((float)par2 + 0.0f), (float)((float)par4 + par1EntityLivingBase.height + 0.5f), (float)((float)par6));
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-this.renderManager.playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)this.renderManager.playerViewX, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glScalef((float)(-f1), (float)(-f1), (float)f1);
                    GL11.glDisable((int)2896);
                    GL11.glTranslatef((float)0.0f, (float)(0.25f / f1), (float)0.0f);
                    GL11.glDepthMask((boolean)false);
                    GL11.glEnable((int)3042);
                    GL11.glBlendFunc((int)770, (int)771);
                    Tessellator tessellator = Tessellator.instance;
                    GL11.glDisable((int)3553);
                    tessellator.startDrawingQuads();
                    int i = fontrenderer.getStringWidth(s) / 2;
                    tessellator.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.25f);
                    tessellator.addVertex((double)(-i - 1), -1.0, 0.0);
                    tessellator.addVertex((double)(-i - 1), 8.0, 0.0);
                    tessellator.addVertex((double)(i + 1), 8.0, 0.0);
                    tessellator.addVertex((double)(i + 1), -1.0, 0.0);
                    tessellator.draw();
                    GL11.glEnable((int)3553);
                    GL11.glDepthMask((boolean)true);
                    fontrenderer.drawString(s, -fontrenderer.getStringWidth(s) / 2, 0, 0x20FFFFFF);
                    GL11.glEnable((int)2896);
                    GL11.glDisable((int)3042);
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL11.glPopMatrix();
                } else {
                    this.func_96449_a(par1EntityLivingBase, par2, par4, par6, s, f1, d3);
                }
            }
        }
        MinecraftForge.EVENT_BUS.post((Event)new RenderLivingEvent.Specials.Post(par1EntityLivingBase, (RendererLivingEntity)this, par2, par4, par6));
    }
}

