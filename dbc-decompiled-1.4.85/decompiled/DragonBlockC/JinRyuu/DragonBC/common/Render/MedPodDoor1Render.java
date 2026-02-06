/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Render.MedPodDoor1Block;
import JinRyuu.DragonBC.common.Render.MedPodDoor1Model;
import JinRyuu.DragonBC.common.Render.MedPodDoor1TileEntity;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class MedPodDoor1Render
extends TileEntitySpecialRenderer {
    private int moving = 0;
    private MedPodDoor1Model aModel = new MedPodDoor1Model();

    public void renderAModelAt(MedPodDoor1TileEntity tileentity, double d, double d1, double d2, float f) {
        String renderMode = "";
        boolean hasAbove = tileentity.getWorldObj().getBlock(tileentity.xCoord, tileentity.yCoord + 1, tileentity.zCoord) instanceof MedPodDoor1Block;
        boolean hasBelow = tileentity.getWorldObj().getBlock(tileentity.xCoord, tileentity.yCoord - 1, tileentity.zCoord) instanceof MedPodDoor1Block;
        if (hasAbove && hasBelow) {
            renderMode = "d";
        } else if (hasAbove) {
            renderMode = "c";
        } else if (hasBelow) {
            renderMode = "b";
        }
        GL11.glPushMatrix();
        Block b = tileentity.getBlockType();
        int meta = tileentity.getBlockMetadata();
        if (meta == 3 || meta == 7) {
            GL11.glTranslatef((float)((float)d + 0.375f), (float)((float)d1 + 1.0f), (float)((float)d2 + 0.5f));
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        } else if (meta == 1 || meta == 5) {
            GL11.glTranslatef((float)((float)d + 0.625f), (float)((float)d1 + 1.0f), (float)((float)d2 + 0.5f));
            GL11.glRotatef((float)270.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        } else if (meta == 0 || meta == 4) {
            GL11.glTranslatef((float)((float)d + 0.5f), (float)((float)d1 + 1.0f), (float)((float)d2 + 0.375f));
            GL11.glRotatef((float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        } else if (meta == 2 || meta == 6) {
            GL11.glTranslatef((float)((float)d + 0.5f), (float)((float)d1 + 1.0f), (float)((float)d2 + 0.625f));
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        ResourceLocation tx = new ResourceLocation("jinryuudragonbc:textures/blockmodels/MedPodDoor1" + renderMode + ".png");
        this.bindTexture(tx);
        GL11.glEnable((int)2977);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glPushMatrix();
        this.aModel.renderModel(tileentity.getCb(), meta, 0.0625f);
        GL11.glPopMatrix();
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) {
        this.renderAModelAt((MedPodDoor1TileEntity)tileentity, d, d1, d2, f);
    }
}

