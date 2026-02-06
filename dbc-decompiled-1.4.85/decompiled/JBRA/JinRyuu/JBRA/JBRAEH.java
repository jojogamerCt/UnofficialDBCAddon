/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreClient
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreHJBRA
 *  JinRyuu.JRMCore.JRMCoreHNC
 *  JinRyuu.JRMCore.entity.ModelBipedBody
 *  JinRyuu.JRMCore.i.ExtendedPlayer
 *  JinRyuu.JRMCore.items.ItemBodysuit
 *  JinRyuu.JRMCore.items.ItemHeadwear
 *  JinRyuu.JRMCore.items.ItemVanity
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.renderer.entity.RenderBiped
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.ForgeHooksClient
 *  net.minecraftforge.client.event.RenderPlayerEvent$SetArmorModel
 *  net.minecraftforge.client.event.RenderPlayerEvent$Specials$Post
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JBRA;

import JinRyuu.JBRA.ModelBipedDBC;
import JinRyuu.JBRA.RenderPlayerJBRA;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHJBRA;
import JinRyuu.JRMCore.JRMCoreHNC;
import JinRyuu.JRMCore.entity.ModelBipedBody;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.items.ItemBodysuit;
import JinRyuu.JRMCore.items.ItemHeadwear;
import JinRyuu.JRMCore.items.ItemVanity;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.lwjgl.opengl.GL11;

public class JBRAEH {
    public ModelBiped armrMdl = JRMCoreHJBRA.ModelBipedBody((float)1.0f);
    public ModelBiped armrMdl2 = JRMCoreHJBRA.ModelBipedBody((float)0.5f);
    @SideOnly(value=Side.CLIENT)
    public static final ModelBipedDBC body = new ModelBipedDBC(0.0f);

    @SubscribeEvent
    public void onRenderLivingEvent(RenderPlayerEvent.Specials.Post event) {
        if (event.renderer instanceof RenderPlayerJBRA) {
            byte clientState;
            int i;
            ItemStack stackhead;
            boolean v;
            String[] s;
            int pwr;
            RenderPlayerJBRA r = (RenderPlayerJBRA)event.renderer;
            EntityPlayer pl = event.entityPlayer;
            ModelBipedDBC mdl = r.modelMain;
            if (JRMCoreH.NC()) {
                float f;
                float childScl;
                float gen;
                float fm;
                int idd = ExtendedPlayer.get((EntityPlayer)pl).getHandEffect();
                int idd2 = ExtendedPlayer.get((EntityPlayer)pl).getEffect_used();
                if (idd == 1) {
                    GL11.glPushMatrix();
                    fm = 0.0f;
                    gen = r.genGet();
                    childScl = r.childSclGet();
                    if (gen <= 1.0f) {
                        GL11.glScalef((float)(1.0f / childScl), (float)(1.0f / childScl), (float)(1.0f / childScl));
                        GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                        mdl.RA.postRender(0.0625f);
                        fm = 0.0f;
                    }
                    if (gen >= 2.0f) {
                        GL11.glScalef((float)(1.0f / childScl * (gen <= 1.0f ? 1.0f : 0.7f)), (float)(1.0f / childScl), (float)(1.0f / childScl * (gen <= 1.0f ? 1.0f : 0.7f)));
                        GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                        mdl.RA.postRender(0.0625f);
                        fm = 0.1f;
                    }
                    f = childScl;
                    GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)-0.29f, (float)0.15f, (float)0.0f);
                    r.chakra((Entity)pl, idd2);
                    RenderPlayerJBRA.hndff((Entity)pl, false, idd, idd2);
                    GL11.glPopMatrix();
                }
                if (idd == 2) {
                    GL11.glPushMatrix();
                    fm = 0.0f;
                    gen = r.genGet();
                    childScl = r.childSclGet();
                    if (gen <= 1.0f) {
                        GL11.glScalef((float)(1.0f / childScl), (float)(1.0f / childScl), (float)(1.0f / childScl));
                        GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                        mdl.RA.postRender(0.0625f);
                        fm = 0.0f;
                    }
                    if (gen >= 2.0f) {
                        GL11.glScalef((float)(1.0f / childScl * (gen <= 1.0f ? 1.0f : 0.7f)), (float)(1.0f / childScl), (float)(1.0f / childScl * (gen <= 1.0f ? 1.0f : 0.7f)));
                        GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                        mdl.RA.postRender(0.0625f);
                        fm = 0.1f;
                    }
                    f = childScl;
                    GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)-0.29f, (float)0.15f, (float)0.0f);
                    r.lightning((Entity)pl, idd2);
                    RenderPlayerJBRA.hndff((Entity)pl, false, idd, idd2);
                    GL11.glPopMatrix();
                }
            }
            if (JRMCoreH.DBC() && (pwr = Integer.parseInt((s = JRMCoreH.data((String)event.entity.getCommandSenderName(), (int)1, (String)"0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0").split(";"))[2])) == 1) {
                boolean v2;
                int skf;
                String datas = JRMCoreH.data((String)event.entity.getCommandSenderName(), (int)6, (String)"0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0");
                int sklkf = datas.contains("KF") ? 1 : 0;
                int n = skf = datas.contains("KI") ? 1 : 0;
                if (sklkf > 0 && skf > 0) {
                    String datas2 = datas.split(";")[0];
                    int lngth = datas2.split(",").length;
                    for (int i2 = 0; i2 < lngth; ++i2) {
                        String dt;
                        String datas3 = datas2.split(",")[i2];
                        if (datas3.contains("KF")) {
                            dt = datas3.replace("KF", "");
                            sklkf = Integer.parseInt(dt);
                            ++sklkf;
                            continue;
                        }
                        if (!datas3.contains("KI")) continue;
                        dt = datas3.replace("KI", "");
                        skf = Integer.parseInt(dt);
                        ++skf;
                    }
                }
                GL11.glPushMatrix();
                String ss = s[17];
                boolean bl = v2 = JRMCoreH.DBC() && !ss.equals("-1");
                if (v2 && sklkf > 0 && skf > 0) {
                    float fm = 0.0f;
                    float gen = r.genGet();
                    float childScl = r.childSclGet();
                    if (gen <= 1.0f) {
                        GL11.glScalef((float)(1.0f / childScl), (float)(1.0f / childScl), (float)(1.0f / childScl));
                        GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                        mdl.RA.postRender(0.0625f);
                        fm = 0.0f;
                    }
                    if (gen >= 2.0f) {
                        GL11.glScalef((float)(1.0f / childScl * (gen <= 1.0f ? 1.0f : 0.7f)), (float)(1.0f / childScl), (float)(1.0f / childScl * (gen <= 1.0f ? 1.0f : 0.7f)));
                        GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                        mdl.RA.postRender(0.0625f);
                        fm = 0.1f;
                    }
                    float f = childScl;
                    RenderPlayerJBRA.kss(event.entity, false, Integer.parseInt(ss), sklkf, skf);
                }
                GL11.glPopMatrix();
            }
            GL11.glPushMatrix();
            s = JRMCoreH.data((String)event.entity.getCommandSenderName(), (int)1, (String)"0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0").split(";")[16];
            boolean bl = v = JRMCoreH.JYC() && !s.equals("-1");
            if (v) {
                float fm = 0.0f;
                float gen = r.genGet();
                float childScl = r.childSclGet();
                if (gen <= 1.0f) {
                    GL11.glScalef((float)(1.0f / childScl), (float)(1.0f / childScl), (float)(1.0f / childScl));
                    GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                    mdl.RA.postRender(0.0625f);
                    fm = 0.0f;
                }
                if (gen >= 2.0f) {
                    GL11.glScalef((float)(1.0f / childScl * (gen <= 1.0f ? 1.0f : 0.7f)), (float)(1.0f / childScl), (float)(1.0f / childScl * (gen <= 1.0f ? 1.0f : 0.7f)));
                    GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                    mdl.RA.postRender(0.0625f);
                    fm = 0.1f;
                }
                float f = childScl;
                RenderPlayerJBRA.ow(false);
            }
            GL11.glPopMatrix();
            s = JRMCoreH.data((String)event.entity.getCommandSenderName(), (int)1, (String)"0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0").split(";");
            String[] sw = s[5].split(",");
            int weight = Integer.parseInt(sw[0]);
            String[] slotbody = s[6].split(",");
            int body = Integer.parseInt(slotbody[0]);
            int head = Integer.parseInt(s[7]);
            if (body > 0) {
                ItemStack stackbody = new ItemStack(Item.getItemById((int)body));
                int bodycol = Integer.parseInt(slotbody[1]);
                if (stackbody != null && stackbody.getItem() instanceof ItemBodysuit) {
                    ((ItemBodysuit)stackbody.getItem()).setColor(stackbody, bodycol);
                    int j = ((ItemBodysuit)stackbody.getItem()).getColor(stackbody);
                    if (j != -1) {
                        float f1 = (float)(j >> 16 & 0xFF) / 255.0f;
                        float f2 = (float)(j >> 8 & 0xFF) / 255.0f;
                        float f3 = (float)(j & 0xFF) / 255.0f;
                        GL11.glColor3f((float)f1, (float)f2, (float)f3);
                    }
                    ResourceLocation rl = new ResourceLocation(((ItemBodysuit)stackbody.getItem()).getArmorTexture(stackbody, (Entity)pl, 0, ""));
                    JRMCoreClient.mc.getTextureManager().bindTexture(rl);
                    GL11.glEnable((int)3042);
                    GL11.glBlendFunc((int)770, (int)771);
                    ModelBipedBody m = (ModelBipedBody)JRMCoreHJBRA.GiTurtleMdl3;
                    m = (ModelBipedBody)JRMCoreHJBRA.showModel((ModelBiped)m, (EntityLivingBase)pl, (ItemStack)stackbody, (int)4);
                    m.onGround = pl.getSwingProgress(event.partialRenderTick);
                    m.isRiding = pl.isRiding();
                    m.isChild = pl.isChild();
                    m.isSneak = pl.isSneaking();
                    ModelBipedBody.y = ModelBipedDBC.y;
                    m.render((Entity)pl, mdl.rot1, mdl.rot2, mdl.rot3, mdl.rot4, mdl.rot5, mdl.rot6);
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                }
            }
            if (head > 0 && (stackhead = new ItemStack(Item.getItemById((int)head))) != null && stackhead.getItem() instanceof ItemHeadwear) {
                ResourceLocation rl = new ResourceLocation(((ItemHeadwear)stackhead.getItem()).getArmorTexture(stackhead, (Entity)pl, 0, ""));
                JRMCoreClient.mc.getTextureManager().bindTexture(rl);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                ModelBipedBody m = (ModelBipedBody)JRMCoreHJBRA.GiTurtleMdl2;
                m = (ModelBipedBody)JRMCoreHJBRA.showModel((ModelBiped)m, (EntityLivingBase)pl, (ItemStack)stackhead, (int)0);
                m.onGround = pl.getSwingProgress(event.partialRenderTick);
                m.isRiding = pl.isRiding();
                m.isChild = pl.isChild();
                m.isSneak = pl.isSneaking();
                m.render((Entity)pl, mdl.rot1, mdl.rot2, mdl.rot3, mdl.rot4, mdl.rot5, mdl.rot6);
            }
            if (weight == 2) {
                String armor = "";
                String d = "";
                int wd = Integer.parseInt(sw[1]);
                if (wd > 50) {
                    d = "_d";
                }
                armor = "armor/weightshirt" + d + ".png";
                JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation(JRMCoreH.tjdbcAssts, armor));
                GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                ModelBipedBody m = (ModelBipedBody)JRMCoreHJBRA.GiTurtleMdl4;
                m = (ModelBipedBody)JRMCoreHJBRA.showModel((ModelBiped)m, (EntityLivingBase)pl, null, (int)4);
                m.onGround = pl.getSwingProgress(event.partialRenderTick);
                m.isRiding = pl.isRiding();
                m.isChild = pl.isChild();
                m.isSneak = pl.isSneaking();
                ModelBipedBody.y = ModelBipedDBC.y;
                m.render((Entity)pl, mdl.rot1, mdl.rot2, mdl.rot3, mdl.rot4, mdl.rot5, mdl.rot6);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
            if (weight == 3) {
                String armor = "";
                String d = "";
                int wd = Integer.parseInt(sw[1]);
                if (wd > 50) {
                    d = "_d";
                }
                armor = "armor/weightcape" + d + ".png";
                JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation(JRMCoreH.tjdbcAssts, armor));
                GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                ModelBipedBody m = (ModelBipedBody)JRMCoreHJBRA.GiTurtleMdl1;
                m = (ModelBipedBody)JRMCoreHJBRA.showModel((ModelBiped)m, (EntityLivingBase)pl, null, (int)4);
                m.onGround = pl.getSwingProgress(event.partialRenderTick);
                m.isRiding = pl.isRiding();
                m.isChild = pl.isChild();
                m.isSneak = pl.isSneaking();
                ModelBipedBody.y = ModelBipedDBC.y;
                m.render((Entity)pl, mdl.rot1, mdl.rot2, mdl.rot3, mdl.rot4, mdl.rot5, mdl.rot6);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
            if (weight == 4) {
                String armor = "";
                String d = "";
                int wd = Integer.parseInt(sw[1]);
                if (wd > 50) {
                    d = "_d";
                }
                armor = "armor/weightheavysuit" + d + ".png";
                JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation(JRMCoreH.tjdbcAssts, armor));
                GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                ModelBipedBody m = (ModelBipedBody)JRMCoreHJBRA.GiTurtleMdl1;
                m = (ModelBipedBody)JRMCoreHJBRA.showModel((ModelBiped)m, (EntityLivingBase)pl, null, (int)4);
                m.onGround = pl.getSwingProgress(event.partialRenderTick);
                m.isRiding = pl.isRiding();
                m.isChild = pl.isChild();
                m.isSneak = pl.isSneaking();
                ModelBipedBody.y = ModelBipedDBC.y;
                m.render((Entity)pl, mdl.rot1, mdl.rot2, mdl.rot3, mdl.rot4, mdl.rot5, mdl.rot6);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
            s = JRMCoreH.data((String)event.entity.getCommandSenderName(), (int)1, (String)"0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0").split(";");
            String[][] slot_vanity_num = new String[8][];
            int[] slot_van = new int[8];
            for (i = 0; i < 8; ++i) {
                slot_vanity_num[i] = s[8 + i].split(",");
                slot_van[i] = Integer.parseInt(slot_vanity_num[i][0]);
            }
            for (i = 0; i < 8; ++i) {
                if (slot_van[i] <= 0) continue;
                ItemStack itemstack = new ItemStack(Item.getItemById((int)slot_van[i]));
                int bodycol = Integer.parseInt(slot_vanity_num[i][1]);
                if (itemstack == null || !(itemstack.getItem() instanceof ItemVanity)) continue;
                ((ItemVanity)itemstack.getItem()).setColor(itemstack, bodycol);
                int j = ((ItemVanity)itemstack.getItem()).getColor(itemstack);
                if (j != -1) {
                    float f1 = (float)(j >> 16 & 0xFF) / 255.0f;
                    float f2 = (float)(j >> 8 & 0xFF) / 255.0f;
                    float f3 = (float)(j & 0xFF) / 255.0f;
                    GL11.glColor3f((float)f1, (float)f2, (float)f3);
                }
                ResourceLocation rl = new ResourceLocation(((ItemVanity)itemstack.getItem()).getArmorTexture(itemstack, (Entity)pl, 0, ""));
                JRMCoreClient.mc.getTextureManager().bindTexture(rl);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                ModelBipedBody m = (ModelBipedBody)((ItemVanity)itemstack.getItem()).giMdl(((ItemVanity)itemstack.getItem()).armorType, (EntityLivingBase)pl);
                if (m == null) continue;
                m = (ModelBipedBody)JRMCoreHJBRA.showModel((ModelBiped)m, (EntityLivingBase)pl, (ItemStack)itemstack, (int)((ItemVanity)itemstack.getItem()).armorType);
                m.onGround = pl.getSwingProgress(event.partialRenderTick);
                m.isRiding = pl.isRiding();
                m.isChild = pl.isChild();
                m.isSneak = pl.isSneaking();
                ModelBipedBody.y = ModelBipedDBC.y;
                m.render((Entity)pl, mdl.rot1, mdl.rot2, mdl.rot3, mdl.rot4, mdl.rot5, mdl.rot6);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
            int race = Integer.parseInt(s[0]);
            if (JRMCoreH.isRaceMajin((int)race)) {
                slot_vanity_num = new String[8][];
                slot_van = new int[8];
                String[] absorptionData = JRMCoreH.data((String)pl.getCommandSenderName(), (int)13, (String)"0;0;0;0,0,0+0").split(";")[3].split(",")[2].split("-");
                if (absorptionData.length > 0) {
                    int i3;
                    for (i3 = 0; i3 < absorptionData.length; ++i3) {
                        if (!absorptionData[i3].contains("+")) continue;
                        slot_vanity_num[i3] = absorptionData[i3].split("\\+");
                        slot_van[i3] = Integer.parseInt(slot_vanity_num[i3][0]);
                    }
                    for (i3 = 0; i3 < absorptionData.length; ++i3) {
                        if (slot_van[i3] <= 0) continue;
                        ItemStack itemstack = new ItemStack(Item.getItemById((int)slot_van[i3]));
                        int bodycol = Integer.parseInt(slot_vanity_num[i3][1]);
                        if (itemstack == null || !(itemstack.getItem() instanceof ItemVanity)) continue;
                        ((ItemVanity)itemstack.getItem()).setColor(itemstack, bodycol);
                        int j = ((ItemVanity)itemstack.getItem()).getColor(itemstack);
                        if (j != -1) {
                            float f1 = (float)(j >> 16 & 0xFF) / 255.0f;
                            float f2 = (float)(j >> 8 & 0xFF) / 255.0f;
                            float f3 = (float)(j & 0xFF) / 255.0f;
                            GL11.glColor3f((float)f1, (float)f2, (float)f3);
                        }
                        ResourceLocation rl = new ResourceLocation(((ItemVanity)itemstack.getItem()).getArmorTexture(itemstack, (Entity)pl, 0, ""));
                        JRMCoreClient.mc.getTextureManager().bindTexture(rl);
                        GL11.glEnable((int)3042);
                        GL11.glBlendFunc((int)770, (int)771);
                        ModelBipedBody m = (ModelBipedBody)((ItemVanity)itemstack.getItem()).giMdl(((ItemVanity)itemstack.getItem()).armorType, (EntityLivingBase)pl);
                        if (m == null) continue;
                        m = (ModelBipedBody)JRMCoreHJBRA.showModel((ModelBiped)m, (EntityLivingBase)pl, (ItemStack)itemstack, (int)((ItemVanity)itemstack.getItem()).armorType);
                        m.onGround = pl.getSwingProgress(event.partialRenderTick);
                        m.isRiding = pl.isRiding();
                        m.isChild = pl.isChild();
                        m.isSneak = pl.isSneaking();
                        ModelBipedBody.y = ModelBipedDBC.y;
                        m.render((Entity)pl, mdl.rot1, mdl.rot2, mdl.rot3, mdl.rot4, mdl.rot5, mdl.rot6);
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    }
                }
            }
            if (JRMCoreH.NC() && (clientState = JRMCoreH.State) == 1 && JRMCoreH.isPowerTypeChakra() && JRMCoreH.Class == 1 && JRMCoreHNC.renderHyuuga && JRMCoreH.isPowerTypeChakra((int)JRMCoreH.PlyrPwr((EntityPlayer)pl)) && JRMCoreH.dnn((int)14) && JRMCoreH.dnn((int)8) && JRMCoreH.dnn((int)9) && JRMCoreH.dnn((int)1) && JRMCoreH.dnn((int)5)) {
                EntityPlayer player = (EntityPlayer)event.entity;
                int hp = Integer.parseInt(JRMCoreH.data((String)event.entity.getCommandSenderName(), (int)8, (String)"200"));
                int ki = Integer.parseInt(JRMCoreH.data((String)event.entity.getCommandSenderName(), (int)9, (String)"200"));
                int[] atr = JRMCoreH.PlyrAttrbtsC((EntityPlayer)((EntityPlayer)event.entity));
                int pwr2 = Integer.parseInt(s[2]);
                int cls = Integer.parseInt(s[3]);
                int maxhp = JRMCoreH.stat((Entity)player, (int)2, (int)pwr2, (int)2, (int)atr[2], (int)race, (int)cls, (float)0.0f);
                int maxki = JRMCoreH.stat((Entity)player, (int)5, (int)pwr2, (int)5, (int)atr[5], (int)race, (int)cls, (float)0.0f);
                int align = JRMCoreH.Algnmnt((int)Integer.parseInt(JRMCoreH.data((String)event.entity.getCommandSenderName(), (int)5, (String)"50;0").split(";")[0]));
                float mC = maxki;
                float cC = ki;
                float c = cC / mC;
                JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation(JRMCoreH.tjnc, "misc/cha.png"));
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)c);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)1);
                GL11.glPushMatrix();
                ModelBipedBody ml = (ModelBipedBody)JRMCoreHJBRA.GiTurtleMdl5;
                ml = (ModelBipedBody)JRMCoreHJBRA.showModel((ModelBiped)ml, (EntityLivingBase)pl, null, (int)4);
                ml.onGround = pl.getSwingProgress(event.partialRenderTick);
                ml.isRiding = pl.isRiding();
                ml.isChild = pl.isChild();
                ml.isSneak = pl.isSneaking();
                ModelBipedBody.y = ModelBipedDBC.y;
                ml.render((Entity)pl, mdl.rot1, mdl.rot2, mdl.rot3, mdl.rot4, mdl.rot5, mdl.rot6);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glPopMatrix();
                GL11.glDisable((int)3042);
            }
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void onEvent(RenderPlayerEvent.SetArmorModel event) {
        Item item;
        ItemStack itemstack = event.stack;
        EntityPlayer player = event.entityPlayer;
        int p_77032_2_ = 3 - event.slot;
        RenderPlayer rend = event.renderer;
        if (itemstack != null && (item = itemstack.getItem()) instanceof ItemArmor) {
            ItemArmor itemarmor = (ItemArmor)item;
            JRMCoreClient.mc.getTextureManager().bindTexture(RenderBiped.getArmorResource((Entity)player, (ItemStack)itemstack, (int)p_77032_2_, null));
            rend.modelArmor = this.armrMdl2;
            rend.modelArmorChestplate = this.armrMdl;
            ModelBiped modelbiped = p_77032_2_ == 2 ? rend.modelArmor : rend.modelArmorChestplate;
            modelbiped = JRMCoreHJBRA.showModel((ModelBiped)modelbiped, (EntityLivingBase)player, (ItemStack)itemstack, (int)p_77032_2_);
            if (event.renderer instanceof RenderPlayerJBRA) {
                RenderPlayerJBRA r = (RenderPlayerJBRA)event.renderer;
                ModelBipedDBC mdl = r.modelMain;
                if (modelbiped instanceof ModelBipedBody) {
                    ModelBipedBody cfr_ignored_0 = (ModelBipedBody)modelbiped;
                    ModelBipedBody.y = ModelBipedDBC.y;
                }
            }
            modelbiped = ForgeHooksClient.getArmorModel((EntityLivingBase)player, (ItemStack)itemstack, (int)p_77032_2_, (ModelBiped)modelbiped);
            rend.setRenderPassModel((ModelBase)modelbiped);
            modelbiped.onGround = player.getSwingProgress(event.partialRenderTick);
            modelbiped.isRiding = player.isRiding();
            modelbiped.isChild = player.isChild();
            modelbiped.isSneak = player.isSneaking();
            int j = itemarmor.getColor(itemstack);
            if (j != -1) {
                float f1 = (float)(j >> 16 & 0xFF) / 255.0f;
                float f2 = (float)(j >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(j & 0xFF) / 255.0f;
                GL11.glColor3f((float)f1, (float)f2, (float)f3);
                if (itemstack.isItemEnchanted()) {
                    event.result = 31;
                    return;
                }
                event.result = 16;
                return;
            }
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
            if (itemstack.isItemEnchanted()) {
                event.result = 15;
                return;
            }
            event.result = 1;
            return;
        }
    }
}

