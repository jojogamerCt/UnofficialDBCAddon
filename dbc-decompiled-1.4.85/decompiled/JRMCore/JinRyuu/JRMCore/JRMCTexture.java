/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.renderer.texture.AbstractTexture
 *  net.minecraft.client.renderer.texture.TextureUtil
 *  net.minecraft.client.resources.IResourceManager
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package JinRyuu.JRMCore;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SideOnly(value=Side.CLIENT)
public class JRMCTexture
extends AbstractTexture {
    private static final Logger logger = LogManager.getLogger();
    protected final String textureLocation;

    public JRMCTexture(String p_i1275_1_) {
        this.textureLocation = p_i1275_1_;
    }

    public void loadTexture(IResourceManager p_110551_1_) throws IOException {
        this.deleteGlTexture();
        BufferedImage bufferedimage = ImageIO.read(new URL(this.textureLocation));
        boolean flag = false;
        boolean flag1 = false;
        TextureUtil.uploadTextureImageAllocate((int)this.getGlTextureId(), (BufferedImage)bufferedimage, (boolean)flag, (boolean)flag1);
    }
}

