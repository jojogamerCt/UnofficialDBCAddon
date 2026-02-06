/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.RenderGameOverlayEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreCliTicH;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;

public class JRMCoreGuiScreenE
extends GuiScreen {
    int guiWidth = 256;
    int guiHeight = 256;

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void hideHealth(RenderGameOverlayEvent e) {
        if (e != null) {
            if (e.type.equals((Object)RenderGameOverlayEvent.ElementType.ALL)) {
                // empty if block
            }
            if (e.type.equals((Object)RenderGameOverlayEvent.ElementType.HEALTH) && e.isCancelable() && (JRMCoreH.Pwrtyp == 1 || JRMCoreH.Pwrtyp == 2 || JRMCoreH.Pwrtyp == 3)) {
                e.setCanceled(true);
            }
            if (e.type == RenderGameOverlayEvent.ElementType.TEXT) {
                // empty if block
            }
            if (e.type == RenderGameOverlayEvent.ElementType.TEXT) {
                EntityLivingBase target = JRMCoreCliTicH.lockOn;
                if (target == null || !JRMCoreConfig.lockon) {
                    return;
                }
                Minecraft mc = JRMCoreClient.mc;
                EntityClientPlayerMP player = mc.thePlayer;
                float reduction = 4.0f;
                int screenWidth = e.resolution.getScaledWidth();
                int screenHeight = e.resolution.getScaledHeight();
                double distanceSq = player.getDistanceToEntity((Entity)target);
                float scale = (float)(10.0 / distanceSq);
                GL11.glPushMatrix();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glTranslatef((float)((float)(screenWidth / 2) - (float)(this.guiWidth / 2) * scale / reduction), (float)((float)(screenHeight / 2) - (float)(this.guiHeight / 2) * scale / reduction), (float)0.0f);
                GL11.glScalef((float)(scale / reduction), (float)(scale / reduction), (float)(scale / reduction));
                if (target != null) {
                    mc.renderEngine.bindTexture(new ResourceLocation(JRMCoreH.tjjrmc, "gui/lo/" + JGConfigClientSettings.get_hud_lockon() + ".png"));
                    this.drawTexturedModalRect(0, 0, 0, 0, this.guiWidth, this.guiHeight);
                }
                GL11.glDisable((int)3042);
                GL11.glPopMatrix();
            }
        }
    }
}

