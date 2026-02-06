/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.texture.ITextureObject
 *  net.minecraft.client.renderer.texture.TextureUtil
 *  net.minecraft.crash.CrashReport
 *  net.minecraft.crash.CrashReportCategory
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ReportedException
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCTexture;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreKeyHandler;
import JinRyuu.JRMCore.Version;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.mod_JRMCore;
import JinRyuu.JRMCore.p.DBC.DBCPacketHandlerClient;
import JinRyuu.JRMCore.p.JRMCorePTri;
import JinRyuu.JRMCore.p.PD;
import com.google.common.collect.Maps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ReportedException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class JRMCoreHC {
    public static boolean t1s = false;
    public static boolean t2s = false;
    public static boolean t5s = false;
    public static long BPC_ME = 1L;
    public static long BPC_ME2 = 1L;
    public static float smoothReleaseLevel = 0.0f;
    private static Map mto = Maps.newHashMap();
    public static Pattern paturl = Pattern.compile("(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)", 42);
    static int atv;
    static int attackTime;
    public static HashMap<String, String> kbx97f;

    public static void bt(String p_110577_1_) {
        Object object = (ITextureObject)mto.get(p_110577_1_);
        if (object == null) {
            object = new JRMCTexture(p_110577_1_);
            JRMCoreHC.lt(p_110577_1_, object);
        }
        JRMCoreHC.bt(object.getGlTextureId());
    }

    static void bt(int p_94277_0_) {
        GL11.glBindTexture((int)3553, (int)p_94277_0_);
    }

    public static boolean lt(String p_110579_1_, final ITextureObject p_110579_2_) {
        boolean flag = true;
        ITextureObject p_110579_2_2 = p_110579_2_;
        try {
            p_110579_2_.loadTexture(JRMCoreClient.mc.getResourceManager());
        }
        catch (IOException ioexception) {
            mod_JRMCore.logger.error("Failed to load texture: " + p_110579_1_);
            p_110579_2_2 = TextureUtil.missingTexture;
            mto.put(p_110579_1_, p_110579_2_2);
            flag = false;
        }
        catch (Throwable throwable) {
            CrashReport crashreport = CrashReport.makeCrashReport((Throwable)throwable, (String)"Registering texture");
            CrashReportCategory crashreportcategory = crashreport.makeCategory("Resource location being registered");
            crashreportcategory.addCrashSection("Resource location", (Object)p_110579_1_);
            crashreportcategory.addCrashSectionCallable("Texture object class", new Callable(){
                private static final String __OBFID = "CL_00001065";

                public String call() {
                    return p_110579_2_.getClass().getName();
                }
            });
            throw new ReportedException(crashreport);
        }
        mto.put(p_110579_1_, p_110579_2_2);
        return flag;
    }

    public static void dtm(float x, float y, int u, int v, float width, float height, float z) {
        float f = 0.00390625f;
        float f1 = 0.00390625f;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((double)x, (double)(y + 0.0f), (double)z, (double)((float)(u + 0) * f), (double)((float)(v + 0) * f1));
        tessellator.addVertexWithUV((double)x, (double)(y + height), (double)z, (double)((float)(u + 0) * f), (double)(((float)v + height) * f1));
        tessellator.addVertexWithUV((double)(x + width), (double)(y + height), (double)z, (double)(((float)u + width) * f), (double)(((float)v + height) * f1));
        tessellator.addVertexWithUV((double)(x + width), (double)(y + 0.0f), (double)z, (double)(((float)u + width) * f), (double)((float)(v + 0) * f1));
        tessellator.draw();
    }

    public static void dtr(float x, float y, int u, int v, float width, float height, float z) {
        float f = 1.0f / width;
        float f1 = 1.0f / height;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((double)x, (double)(y + 0.0f), (double)z, (double)((float)(u + 0) * f), (double)((float)(v + 0) * f1));
        tessellator.addVertexWithUV((double)x, (double)(y + height), (double)z, (double)((float)(u + 0) * f), (double)(((float)v + height) * f1));
        tessellator.addVertexWithUV((double)(x + width), (double)(y + height), (double)z, (double)(((float)u + width) * f), (double)(((float)v + height) * f1));
        tessellator.addVertexWithUV((double)(x + width), (double)(y + 0.0f), (double)z, (double)(((float)u + width) * f), (double)((float)(v + 0) * f1));
        tessellator.draw();
    }

    public static void Blocking() {
        boolean b;
        if (JRMCoreClient.mc.gameSettings.keyBindAttack.getIsKeyPressed()) {
            attackTime = 0;
        } else if (attackTime < atv) {
            ++attackTime;
        }
        EntityClientPlayerMP var4 = JRMCoreClient.mc.thePlayer;
        ItemStack var11 = var4.inventory.getCurrentItem();
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)var4);
        int mode = JRMCoreH.DBC() ? DBCPacketHandlerClient.getDBCPlayerBlockMode() : 1;
        boolean bl = b = !JRMCoreKeyHandler.Fn.getIsKeyPressed() && JRMCoreClient.mc.gameSettings.keyBindUseItem.getIsKeyPressed() || mode == 2;
        if (b && props.getBlocking() != mode && attackTime >= atv && var11 == null) {
            JRMCoreHC.triForce(2, mode, 0);
            props.setBlocking(mode);
        } else if (!(b && attackTime >= atv || props.getBlocking() == 0)) {
            JRMCoreHC.triForce(2, 0, 0);
            props.setBlocking(0);
        }
    }

    public static void triForce(int i, int j, int k) {
        PD.sendToServer(new JRMCorePTri((byte)i, (byte)j, (byte)k));
    }

    public static String getKey(int i) {
        String k = "";
        if (i >= 0) {
            k = Keyboard.getKeyName((int)i);
            if (k != null) {
                return k;
            }
        } else if (i >= -100 && (k = Mouse.getButtonName((int)(100 + i))) != null) {
            return "BUTTON " + (Integer.parseInt(k.replaceFirst("BUTTON", "")) + 1);
        }
        return "keycode" + i;
    }

    public void ay2MmU(String c) {
        Thread one = new Thread(){

            @Override
            public void run() {
                String rvf = "http://updateinfo.jingames.net/getLatestPost.php";
                String line = null;
                StringBuilder content = new StringBuilder();
                int empty = 0;
                int count = 0;
                try {
                    URL url = new URL("http://updateinfo.jingames.net/getLatestPost.php");
                    InputStreamReader isr = new InputStreamReader(url.openStream(), StandardCharsets.UTF_8);
                    BufferedReader reader = new BufferedReader(isr);
                    while ((line = reader.readLine()) != null) {
                        if (line.length() > 3) {
                            content.append(line.replaceAll("\u00a0", " ") + "/n");
                            ++count;
                            empty = 0;
                        } else {
                            if (empty < 1) {
                                content.append(line.replaceAll("\u00a0", " ") + "/n");
                                ++count;
                            }
                            ++empty;
                        }
                        if (count <= 18) continue;
                    }
                    Version.news = content.toString();
                    reader.close();
                    isr.close();
                }
                catch (Exception e) {
                    e.printStackTrace(System.err);
                }
                this.interrupt();
            }
        };
        one.start();
    }

    public static void ri(Tessellator p_78439_0_, float p_78439_1_, float p_78439_2_, float p_78439_3_, float p_78439_4_, int p_78439_5_, int p_78439_6_, float p_78439_7_) {
        float f9;
        float f8;
        float f7;
        int k;
        p_78439_0_.startDrawingQuads();
        p_78439_0_.setNormal(0.0f, 0.0f, 1.0f);
        p_78439_0_.addVertexWithUV(0.0, 0.0, 0.0, (double)p_78439_1_, (double)p_78439_4_);
        p_78439_0_.addVertexWithUV(1.0, 0.0, 0.0, (double)p_78439_3_, (double)p_78439_4_);
        p_78439_0_.addVertexWithUV(1.0, 1.0, 0.0, (double)p_78439_3_, (double)p_78439_2_);
        p_78439_0_.addVertexWithUV(0.0, 1.0, 0.0, (double)p_78439_1_, (double)p_78439_2_);
        p_78439_0_.draw();
        p_78439_0_.startDrawingQuads();
        p_78439_0_.setNormal(0.0f, 0.0f, -1.0f);
        p_78439_0_.addVertexWithUV(0.0, 1.0, (double)(0.0f - p_78439_7_), (double)p_78439_1_, (double)p_78439_2_);
        p_78439_0_.addVertexWithUV(1.0, 1.0, (double)(0.0f - p_78439_7_), (double)p_78439_3_, (double)p_78439_2_);
        p_78439_0_.addVertexWithUV(1.0, 0.0, (double)(0.0f - p_78439_7_), (double)p_78439_3_, (double)p_78439_4_);
        p_78439_0_.addVertexWithUV(0.0, 0.0, (double)(0.0f - p_78439_7_), (double)p_78439_1_, (double)p_78439_4_);
        p_78439_0_.draw();
        float f5 = 0.5f * (p_78439_1_ - p_78439_3_) / (float)p_78439_5_;
        float f6 = 0.5f * (p_78439_4_ - p_78439_2_) / (float)p_78439_6_;
        p_78439_0_.startDrawingQuads();
        p_78439_0_.setNormal(-1.0f, 0.0f, 0.0f);
        for (k = 0; k < p_78439_5_; ++k) {
            f7 = (float)k / (float)p_78439_5_;
            f8 = p_78439_1_ + (p_78439_3_ - p_78439_1_) * f7 - f5;
            p_78439_0_.addVertexWithUV((double)f7, 0.0, (double)(0.0f - p_78439_7_), (double)f8, (double)p_78439_4_);
            p_78439_0_.addVertexWithUV((double)f7, 0.0, 0.0, (double)f8, (double)p_78439_4_);
            p_78439_0_.addVertexWithUV((double)f7, 1.0, 0.0, (double)f8, (double)p_78439_2_);
            p_78439_0_.addVertexWithUV((double)f7, 1.0, (double)(0.0f - p_78439_7_), (double)f8, (double)p_78439_2_);
        }
        p_78439_0_.draw();
        p_78439_0_.startDrawingQuads();
        p_78439_0_.setNormal(1.0f, 0.0f, 0.0f);
        for (k = 0; k < p_78439_5_; ++k) {
            f7 = (float)k / (float)p_78439_5_;
            f8 = p_78439_1_ + (p_78439_3_ - p_78439_1_) * f7 - f5;
            f9 = f7 + 1.0f / (float)p_78439_5_;
            p_78439_0_.addVertexWithUV((double)f9, 1.0, (double)(0.0f - p_78439_7_), (double)f8, (double)p_78439_2_);
            p_78439_0_.addVertexWithUV((double)f9, 1.0, 0.0, (double)f8, (double)p_78439_2_);
            p_78439_0_.addVertexWithUV((double)f9, 0.0, 0.0, (double)f8, (double)p_78439_4_);
            p_78439_0_.addVertexWithUV((double)f9, 0.0, (double)(0.0f - p_78439_7_), (double)f8, (double)p_78439_4_);
        }
        p_78439_0_.draw();
        p_78439_0_.startDrawingQuads();
        p_78439_0_.setNormal(0.0f, 1.0f, 0.0f);
        for (k = 0; k < p_78439_6_; ++k) {
            f7 = (float)k / (float)p_78439_6_;
            f8 = p_78439_4_ + (p_78439_2_ - p_78439_4_) * f7 - f6;
            f9 = f7 + 1.0f / (float)p_78439_6_;
            p_78439_0_.addVertexWithUV(0.0, (double)f9, 0.0, (double)p_78439_1_, (double)f8);
            p_78439_0_.addVertexWithUV(1.0, (double)f9, 0.0, (double)p_78439_3_, (double)f8);
            p_78439_0_.addVertexWithUV(1.0, (double)f9, (double)(0.0f - p_78439_7_), (double)p_78439_3_, (double)f8);
            p_78439_0_.addVertexWithUV(0.0, (double)f9, (double)(0.0f - p_78439_7_), (double)p_78439_1_, (double)f8);
        }
        p_78439_0_.draw();
        p_78439_0_.startDrawingQuads();
        p_78439_0_.setNormal(0.0f, -1.0f, 0.0f);
        for (k = 0; k < p_78439_6_; ++k) {
            f7 = (float)k / (float)p_78439_6_;
            f8 = p_78439_4_ + (p_78439_2_ - p_78439_4_) * f7 - f6;
            p_78439_0_.addVertexWithUV(1.0, (double)f7, 0.0, (double)p_78439_3_, (double)f8);
            p_78439_0_.addVertexWithUV(0.0, (double)f7, 0.0, (double)p_78439_1_, (double)f8);
            p_78439_0_.addVertexWithUV(0.0, (double)f7, (double)(0.0f - p_78439_7_), (double)p_78439_1_, (double)f8);
            p_78439_0_.addVertexWithUV(1.0, (double)f7, (double)(0.0f - p_78439_7_), (double)p_78439_3_, (double)f8);
        }
        p_78439_0_.draw();
    }

    static {
        attackTime = atv = 16;
        kbx97f = new HashMap();
    }
}

