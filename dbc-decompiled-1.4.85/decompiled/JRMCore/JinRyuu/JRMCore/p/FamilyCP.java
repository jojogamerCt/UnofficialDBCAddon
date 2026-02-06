/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.FamilyC.EntityNPC
 *  JinRyuu.FamilyC.FamilyCCharGui
 *  JinRyuu.FamilyC.FamilyCConfig
 *  cpw.mods.fml.common.FMLCommonHandler
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  cpw.mods.fml.common.network.simpleimpl.MessageContext
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.EnumChatFormatting
 */
package JinRyuu.JRMCore.p;

import JinRyuu.FamilyC.EntityNPC;
import JinRyuu.FamilyC.FamilyCCharGui;
import JinRyuu.FamilyC.FamilyCConfig;
import JinRyuu.JRMCore.FamilyCH;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;

public class FamilyCP
implements IMessage {
    public static final int FORM_FAMILY = 0;
    public static final int PROPOSE_INVITE = 1;
    public static final int ADOPT_INVITE = 2;
    public static final int ACCEPT_PROPOSE = 3;
    public static final int ACCEPT_ADOPT = 4;
    public static final int DECLINE_BOTH_ADOPT_AND_PROPOSE = 5;
    public static final int LEAVE_DIVORCE = 6;
    public static final int DISINHERIT_FORCE_DIVORCE_UNADOPT_CHILD = 7;
    public static final int ACCEPT_PROCREATION = 8;
    public static final int DECLINE_PROCREATION = 9;
    public static final int OFFER_PROCREATION = 10;
    public static final int NPC_CHANGE_DATA = 20;
    public static final int PLAYER_PARENT_AND_CHILD_DATA_WHEN_GUI_OPENED = 21;
    public static final int NPC_CHANGE_NAME = 22;
    public static final int NPC_CHANGE_DNS = 23;
    int id;
    String txt;

    public FamilyCP() {
    }

    public FamilyCP(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.id);
        ByteBufUtils.writeUTF8String((ByteBuf)buffer, (String)this.txt);
    }

    public void fromBytes(ByteBuf buffer) {
        this.id = buffer.readInt();
        this.txt = ByteBufUtils.readUTF8String((ByteBuf)buffer);
    }

    public static class Handler
    extends BAmh<FamilyCP> {
        private static int dnsRaceSlcted;
        private static int dnsGenderSlcted;
        private static int dnsHairSlcted;
        private static int dnsHair2Slcted;
        private static int dnsColorSlcted;
        private static int dnsBreastSizeSlcted;
        private static int dnsBodyTypeSlcted;
        private static int dnsBodyColMainSlcted;
        private static int dnsBodyColSub1Slcted;
        private static int dnsBodyColSub2Slcted;
        private static int dnsBodyColSub3Slcted;
        private static int dnsFaceNoseSlcted;
        private static int dnsFaceMouthSlcted;
        private static int dnsEyesSlcted;
        private static int dnsEyeCol1Slcted;
        private static int dnsEyeCol2Slcted;
        private static String dns;

        @Override
        public IMessage handleClientMessage(EntityPlayer p, FamilyCP msg, MessageContext ctx) {
            int n;
            Entity pl;
            int id = msg.id;
            String txt = msg.txt;
            if (id == 20) {
                String[] dat = txt.split(":");
                int eid = Integer.parseInt(dat[0]);
                String follow = dat[1];
                String aggro = dat[2];
                String fid = dat[3];
                String d = dat[4];
                String m = dat[5];
                int cn = Integer.parseInt(dat[6]);
                Entity pl2 = p.worldObj.getEntityByID(eid);
                if (pl2 instanceof EntityNPC && pl2 != null) {
                    FamilyCCharGui.dtcf = follow;
                    FamilyCCharGui.dtca = aggro;
                    FamilyCCharGui.dtcft = fid;
                    FamilyCCharGui.dtcdad = d;
                    FamilyCCharGui.dtcmom = m;
                    int n2 = FamilyCCharGui.inv = cn == 1 ? -1 : 0;
                }
            }
            if (id == 21) {
                FamilyCCharGui.children = txt;
            }
            if (id == 23 && (pl = p.worldObj.getEntityByID(n = Integer.parseInt(txt))) != null && pl instanceof EntityNPC) {
                EntityNPC npl = (EntityNPC)pl;
                npl.setNamUpdt(true);
            }
            return null;
        }

        @Override
        public IMessage handleServerMessage(EntityPlayer p, FamilyCP m, MessageContext ctx) {
            String prid;
            String[] fh2;
            String fh;
            String cd;
            boolean nnf;
            String nf;
            int fc;
            String[] fm;
            String fn;
            String[] famD;
            String fd;
            String[] fida;
            String fidp;
            String pfid;
            EntityPlayerMP pi;
            String fn2;
            String[] s;
            String n;
            String fid;
            String fid2;
            ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
            int id = m.id;
            String txt = m.txt;
            MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
            String y = JRMCoreH.cly;
            String g = JRMCoreH.clgd;
            String dns = JRMCoreH.getString(p, "jrmcDNS");
            if (id == 0) {
                String[] s2 = txt.split(",");
                String rid = s2[0] + ",0";
                String d = txt + "!" + p.getCommandSenderName() + ",e!0";
                fid2 = JRMCoreH.getString(p, FamilyCH.FID);
                if (FamilyCH.rfi(server, s2[0] + ",0").equals("0") && fid2.length() < 2) {
                    FamilyCH.wfi(server, d, rid, false);
                    JRMCoreH.setString(rid, p, FamilyCH.FID);
                    p.addChatMessage(new ChatComponentText(y + g + s2[0] + y + " Family has been created!").setChatStyle(color));
                } else {
                    p.addChatMessage(new ChatComponentText(y + "Family already exists, can't create another family!").setChatStyle(color));
                }
            }
            if (id == 1) {
                fid = JRMCoreH.getString(p, FamilyCH.FID);
                n = p.getCommandSenderName();
                s = fid.split(",");
                fn2 = s[0];
                pi = JRMCoreH.getPlayerForUsername(server, txt);
                if (pi != null && (pfid = JRMCoreH.getString((EntityPlayer)pi, FamilyCH.FID)).length() < 2) {
                    JRMCoreH.setString("", (EntityPlayer)pi, FamilyCH.FIDa);
                    JRMCoreH.setString(p.getCommandSenderName(), (EntityPlayer)pi, FamilyCH.FIDi);
                    pi.addChatMessage(new ChatComponentText(y + "" + g + n + y + " sent you a proposal" + (fn2.length() > 1 ? " from the " + g + fn2 + y + " family" : "") + "!").setChatStyle(color));
                }
            }
            if (id == 2) {
                fid = JRMCoreH.getString(p, FamilyCH.FID);
                n = p.getCommandSenderName();
                s = fid.split(",");
                fn2 = s[0];
                pi = JRMCoreH.getPlayerForUsername(server, txt);
                if (pi != null && (pfid = JRMCoreH.getString((EntityPlayer)pi, FamilyCH.FID)).length() < 2) {
                    JRMCoreH.setString("", (EntityPlayer)pi, FamilyCH.FIDi);
                    JRMCoreH.setString(p.getCommandSenderName(), (EntityPlayer)pi, FamilyCH.FIDa);
                    String[] fns = fn2.split(",");
                    pi.addChatMessage(new ChatComponentText(y + "" + g + p.getCommandSenderName() + y + " wants to adopt you" + (fn2.length() > 1 ? ". So you'd be apart of the " + g + fns[0] + y + " family" : "") + "!").setChatStyle(color));
                }
            }
            if (id == 3) {
                String prf = JRMCoreH.getString(p, FamilyCH.FIDi);
                EntityPlayerMP prfn = JRMCoreH.getPlayerForUsername(server, prf);
                fidp = JRMCoreH.getString(p, FamilyCH.FID);
                if (prfn != null && fidp.length() < 2) {
                    String fD;
                    int i;
                    fid2 = JRMCoreH.getString((EntityPlayer)prfn, FamilyCH.FID);
                    fida = fid2.split(",");
                    int ffd = Integer.parseInt(fida[1]);
                    fd = FamilyCH.rfi(server, fid2);
                    famD = fd.split("!");
                    fn = ffd == 0 ? famD[0] : "";
                    fm = ffd == 0 ? famD[1].split(",") : famD[0].split(",");
                    fc = ffd == 0 ? Integer.parseInt(famD[2]) : 0;
                    nf = "";
                    nnf = false;
                    cd = "";
                    for (i = 0; i < fm.length; ++i) {
                        fh = fm[i];
                        fh2 = fh.split(":");
                        if (i <= 1 || !fh2[0].equalsIgnoreCase(prf)) continue;
                        nnf = true;
                        cd = fh2[1];
                    }
                    if (nnf) {
                        fD = prf + "," + p.getCommandSenderName();
                        String ff = fida[0] + "," + cd;
                        JRMCoreH.setString(fid2, (EntityPlayer)prfn, FamilyCH.FIDo);
                        JRMCoreH.setString(ff, (EntityPlayer)prfn, FamilyCH.FID);
                        JRMCoreH.setString(ff, p, FamilyCH.FID);
                        FamilyCH.wfi(server, fD, ff, false);
                    } else {
                        for (i = 0; i < fm.length; ++i) {
                            fh = fm[i];
                            if (fh.length() < 2 && !fh.equalsIgnoreCase(prf) && i < 2) {
                                nf = nf + "," + p.getCommandSenderName();
                                JRMCoreH.setString(fid2, p, FamilyCH.FID);
                                JRMCoreH.setString("", p, FamilyCH.FIDi);
                                JRMCoreH.setString("", p, FamilyCH.FIDa);
                                continue;
                            }
                            nf = nf + "," + fh;
                        }
                        nf = nf.substring(1);
                        fD = ffd == 0 ? fn + "!" + nf + "!" + fc : nf;
                        FamilyCH.wfi(server, fD, fid2, false);
                    }
                    String[] fns = fn.split(",");
                    prfn.addChatMessage(new ChatComponentText(y + "Proposal was accepted! You were married to " + g + p.getCommandSenderName() + y + " and " + y + "joined the " + g + fns[0] + y + " family!").setChatStyle(color));
                    p.addChatMessage(new ChatComponentText(y + "You have married " + g + prfn.getCommandSenderName() + y + " and so you joined the " + g + fns[0] + y + " family!").setChatStyle(color));
                } else {
                    p.addChatMessage(new ChatComponentText(y + "Marriage failed because " + g + prf + y + " was not found!").setChatStyle(color));
                }
                JRMCoreH.setString("", p, FamilyCH.FIDi);
                JRMCoreH.setString("", p, FamilyCH.FIDa);
            }
            if (id == 4) {
                String arf = JRMCoreH.getString(p, FamilyCH.FIDa);
                EntityPlayerMP arfn = JRMCoreH.getPlayerForUsername(server, arf);
                fidp = JRMCoreH.getString(p, FamilyCH.FID);
                if (arfn != null && fidp.length() < 2) {
                    String fD;
                    fid2 = JRMCoreH.getString((EntityPlayer)arfn, FamilyCH.FID);
                    fida = fid2.split(",");
                    int ffd = Integer.parseInt(fida[1]);
                    fd = FamilyCH.rfi(server, fid2);
                    famD = fd.split("!");
                    fn = ffd == 0 ? famD[0] : "";
                    fm = ffd == 0 ? famD[1].split(",") : famD[0].split(",");
                    fc = ffd == 0 ? Integer.parseInt(famD[2]) : 0;
                    nf = "";
                    nnf = false;
                    cd = "";
                    for (int i = 0; i < fm.length; ++i) {
                        fh = fm[i];
                        fh2 = fh.split(":");
                        if (i <= 1 || !fh2[0].equalsIgnoreCase(arf)) continue;
                        nnf = true;
                        cd = fh2[1];
                    }
                    String fid22 = fida[0] + ",0";
                    String fd2 = FamilyCH.rfi(server, fid22);
                    String[] famD2 = fd2.split("!");
                    fc = Integer.parseInt(famD2[2]);
                    ++fc;
                    if (nnf) {
                        nf = arf + ",e," + p.getCommandSenderName() + ":" + fc;
                        String fnd = fida[0] + "," + cd;
                        JRMCoreH.setString(fid2, (EntityPlayer)arfn, FamilyCH.FIDo);
                        JRMCoreH.setString(fnd, (EntityPlayer)arfn, FamilyCH.FID);
                        JRMCoreH.setString(fnd, p, FamilyCH.FID);
                        fD = nf;
                        FamilyCH.wfi(server, fD, fnd, false);
                    } else {
                        String fmwa = ffd == 0 ? famD[1] : famD[0];
                        nf = fmwa + "," + p.getCommandSenderName() + ":" + fc;
                        fD = ffd == 0 ? fn + "!" + nf + "!" + fc : nf;
                        JRMCoreH.setString(fid2, p, FamilyCH.FID);
                        FamilyCH.wfi(server, fD, fid2, false);
                    }
                    if (ffd != 0) {
                        fid2 = fida[0] + ",0";
                        fd = FamilyCH.rfi(server, fid2);
                        famD = fd.split("!");
                        fn = famD[0];
                        String fms = famD[1];
                        fD = fn + "!" + fms + "!" + fc;
                        FamilyCH.wfi(server, fD, fid2, false);
                    }
                    arfn.addChatMessage(new ChatComponentText(y + "Adoption offer was accepted! " + g + p.getCommandSenderName() + y + " is now part of the " + g + fida[0] + y + " family!").setChatStyle(color));
                    p.addChatMessage(new ChatComponentText(y + "You have been adopted by " + g + arfn.getCommandSenderName() + y + " and you are now part of the " + g + fida[0] + y + " family!").setChatStyle(color));
                } else {
                    p.addChatMessage(new ChatComponentText(y + "Adoption failed because " + g + arf + y + " was not found!").setChatStyle(color));
                }
                JRMCoreH.setString("", p, FamilyCH.FIDa);
                JRMCoreH.setString("", p, FamilyCH.FIDi);
            }
            if (id == 5) {
                JRMCoreH.setString("", p, FamilyCH.FIDi);
                JRMCoreH.setString("", p, FamilyCH.FIDa);
            }
            if (id == 6) {
                fid = JRMCoreH.getString(p, FamilyCH.FID);
                n = p.getCommandSenderName();
                if (fid.length() > 2) {
                    String[] fida2 = fid.split(",");
                    int ffd = Integer.parseInt(fida2[1]);
                    String fd2 = FamilyCH.rfi(server, fid);
                    String[] famD2 = fd2.split("!");
                    String fn3 = ffd == 0 ? famD2[0] : "";
                    String[] fm2 = ffd == 0 ? famD2[1].split(",") : famD2[0].split(",");
                    int fc2 = ffd == 0 ? Integer.parseInt(famD2[2]) : 0;
                    String nf2 = "";
                    for (int i = 0; i < fm2.length; ++i) {
                        String fh3 = fm2[i];
                        String[] fh22 = fh3.split(":");
                        nf2 = fh22[0].equalsIgnoreCase(p.getCommandSenderName()) ? nf2 + (i < 2 ? ",l" : "") : nf2 + "," + fh3;
                    }
                    nf2 = nf2.substring(1);
                    String fD = ffd == 0 ? fn3 + "!" + nf2 + "!" + fc2 : nf2;
                    FamilyCH.wfi(server, fD, fid, false);
                    String fido = JRMCoreH.getString(p, FamilyCH.FIDo);
                    if (fido.length() > 2) {
                        fida2 = fido.split(",");
                        ffd = Integer.parseInt(fida2[1]);
                        String fdo = FamilyCH.rfi(server, fido);
                        famD2 = fdo.split("!");
                        fn3 = ffd == 0 ? famD2[0] : "";
                        fm2 = ffd == 0 ? famD2[1].split(",") : famD2[0].split(",");
                        fc2 = ffd == 0 ? Integer.parseInt(famD2[2]) : 0;
                        nf2 = "";
                        for (int i = 0; i < fm2.length; ++i) {
                            String fh4 = fm2[i];
                            String[] fh23 = fh4.split(":");
                            if (fh23[0].equalsIgnoreCase(p.getCommandSenderName())) {
                                nf2 = nf2 + (i < 2 ? ",l" : "");
                                JRMCoreH.setString("0", p, FamilyCH.FIDo);
                                continue;
                            }
                            nf2 = nf2 + "," + fh4;
                        }
                        nf2 = nf2.substring(1);
                        fD = ffd == 0 ? fn3 + "!" + nf2 + "!" + fc2 : nf2;
                        FamilyCH.wfi(server, fD, fido, false);
                    }
                    String[] fns = fn3.split(",");
                    p.addChatMessage(new ChatComponentText(y + "You have left the " + g + fns[0] + y + " family!").setChatStyle(color));
                }
            }
            if (id == 7) {
                fid = JRMCoreH.getString(p, FamilyCH.FID);
                n = txt;
                EntityPlayerMP pud = JRMCoreH.getPlayerForUsername(server, n);
                if (fid.length() > 2 && n.length() > 1) {
                    String[] fida3 = fid.split(",");
                    String fnam = fida3[0];
                    int ffd = Integer.parseInt(fida3[1]);
                    String mfd = FamilyCH.rfi(server, fnam + ",0");
                    if (mfd.contains("!")) {
                        String[] mfD = mfd.split("!");
                        int mfDi = Integer.parseInt(mfD[2]);
                        for (int i = 0; i <= ffd; ++i) {
                            String fid23 = fnam + "," + i;
                            String afm = FamilyCH.rfi(server, fid23);
                            if (afm.length() <= 3) continue;
                            String[] famDa = afm.split("!");
                            String fn4 = i == 0 ? famDa[0] : "";
                            String[] fma = i == 0 ? famDa[1].split(",") : famDa[0].split(",");
                            int fc3 = i == 0 ? Integer.parseInt(famDa[2]) : 0;
                            String nf3 = "";
                            for (int i2 = 0; i2 < fma.length; ++i2) {
                                String fh5 = fma[i2];
                                String[] fh24 = fh5.split(":");
                                if (fh24[0].equalsIgnoreCase(n)) {
                                    nf3 = nf3 + (i2 < 2 ? ",k" : "");
                                    FamilyCH.wfmd(server, "1", n, false);
                                    continue;
                                }
                                nf3 = nf3 + "," + fh5;
                            }
                            nf3 = nf3.substring(1);
                            String fD = i == 0 ? fn4 + "!" + nf3 + "!" + fc3 : nf3;
                            FamilyCH.wfi(server, fD, fid23, false);
                        }
                    }
                    if (pud != null) {
                        pud.addChatMessage(new ChatComponentText(y + "You have been removed from the " + g + fnam + y + " family by " + g + p.getCommandSenderName() + y + "!").setChatStyle(color));
                    }
                    p.addChatMessage(new ChatComponentText(y + "You have removed " + g + n + y + " from the " + g + fnam + y + " family!").setChatStyle(color));
                } else {
                    p.addChatMessage(new ChatComponentText(y + "Removing " + g + n + y + " failed!").setChatStyle(color));
                }
            }
            if (id == 8) {
                prid = JRMCoreH.getString(p, FamilyCH.prID);
                EntityPlayerMP pt = JRMCoreH.getPlayerForUsername(server, prid.length() > 2 && !prid.contains(";") ? prid : "");
                if (pt != null && p != null) {
                    String dnsTar = JRMCoreH.getString((EntityPlayer)pt, "jrmcDNS");
                    byte pa = Handler.gb(p, "jrmcAccept");
                    byte pta = Handler.gb((EntityPlayer)pt, "jrmcAccept");
                    int pg = JRMCoreH.dnsGender(dns);
                    int ptg = JRMCoreH.dnsGender(dnsTar);
                    if ((pg == 0 && ptg == 1 || pg == 1 && ptg == 0) && pa == 1 && pta == 1) {
                        byte R1 = Handler.gb(p, "jrmcRace");
                        int G1 = pg;
                        int H1B = JRMCoreH.dnsHairB(dns);
                        int H1F = JRMCoreH.dnsHairF(dns);
                        int H1C = JRMCoreH.dnsHairC(dns);
                        int B1 = JRMCoreH.dnsBreast(dns);
                        int S1T = JRMCoreH.dnsSkinT(dns);
                        int B1T = JRMCoreH.dnsBodyT(dns);
                        int B1CM = JRMCoreH.dnsBodyCM(dns);
                        int B1C1 = JRMCoreH.dnsBodyC1(dns);
                        int B1C2 = JRMCoreH.dnsBodyC2(dns);
                        int B1C3 = JRMCoreH.dnsBodyC3(dns);
                        int F1N = JRMCoreH.dnsFaceN(dns);
                        int F1M = JRMCoreH.dnsFaceM(dns);
                        int E1 = JRMCoreH.dnsEyes(dns);
                        int E1C1 = JRMCoreH.dnsEyeC1(dns);
                        int E1C2 = JRMCoreH.dnsEyeC2(dns);
                        String dnsH = JRMCoreH.getString(p, "jrmcDNSH");
                        byte R2 = Handler.gb((EntityPlayer)pt, "jrmcRace");
                        int G2 = ptg;
                        int H2B = JRMCoreH.dnsHairB(dnsTar);
                        int H2F = JRMCoreH.dnsHairF(dnsTar);
                        int H2C = JRMCoreH.dnsHairC(dnsTar);
                        int B2 = JRMCoreH.dnsBreast(dnsTar);
                        int S2T = JRMCoreH.dnsSkinT(dnsTar);
                        int B2T = JRMCoreH.dnsBodyT(dnsTar);
                        int B2CM = JRMCoreH.dnsBodyCM(dnsTar);
                        int B2C1 = JRMCoreH.dnsBodyC1(dnsTar);
                        int B2C2 = JRMCoreH.dnsBodyC2(dnsTar);
                        int B2C3 = JRMCoreH.dnsBodyC3(dnsTar);
                        int F2N = JRMCoreH.dnsFaceN(dnsTar);
                        int F2M = JRMCoreH.dnsFaceM(dnsTar);
                        int E2 = JRMCoreH.dnsEyes(dnsTar);
                        int E2C1 = JRMCoreH.dnsEyeC1(dnsTar);
                        int E2C2 = JRMCoreH.dnsEyeC2(dnsTar);
                        String dnsH2 = JRMCoreH.getString((EntityPlayer)pt, "jrmcDNSH");
                        if (FamilyCH.procWith(R1, R2)) {
                            EntityPlayerMP e;
                            String dnsHc;
                            byte r = (byte)FamilyCH.procTR(R1, R2);
                            Random ran = new Random();
                            dnsRaceSlcted = r;
                            dnsGenderSlcted = ran.nextInt(2);
                            int rid = ran.nextInt(3);
                            dnsHairSlcted = rid == 0 ? H1B : (rid == 1 ? H2B : ran.nextInt(JRMCoreH.Hairs.length));
                            dnsHair2Slcted = H1F;
                            rid = ran.nextInt(3);
                            dnsColorSlcted = rid == 0 ? H1C : (rid == 1 ? H2C : ran.nextInt(0xFFFF28));
                            dnsBreastSizeSlcted = ran.nextInt(9);
                            boolean p1p2 = false;
                            boolean p1 = false;
                            boolean p2 = false;
                            rid = ran.nextInt(3);
                            if (S1T == 1 && S2T == 1) {
                                p1p2 = true;
                                rid = rid == 0 ? B1T : (rid == 1 ? B2T : ran.nextInt(JRMCoreH.customSknLimits[r][0]));
                            } else if (S1T == 1) {
                                p1 = true;
                                rid = rid == 0 || rid == 1 ? B1T : ran.nextInt(JRMCoreH.customSknLimits[r][0]);
                            } else if (S2T == 1) {
                                p2 = true;
                                rid = rid == 0 || rid == 1 ? B2T : ran.nextInt(JRMCoreH.customSknLimits[r][0]);
                            } else {
                                rid = ran.nextInt(JRMCoreH.customSknLimits[r][0]);
                            }
                            dnsBodyTypeSlcted = rid;
                            rid = ran.nextInt(JRMCoreH.customSknLimitsBCP[r]);
                            int cls = JRMCoreH.defbodycols[rid][r].length;
                            rid = ran.nextInt(4);
                            dnsBodyColMainSlcted = cls >= 1 ? (rid == 0 && (p1p2 || p1) ? B1CM : ((rid == 1 || rid == 0 && !p1) && (p1p2 || p2) ? B2CM : (rid == 2 || rid < 2 && !p1p2 && !p1 && !p2 ? JRMCoreH.defbodycols[ran.nextInt(JRMCoreH.customSknLimitsBCP[r])][r][0] : ran.nextInt(0xFFFF28)))) : 0;
                            rid = ran.nextInt(4);
                            dnsBodyColSub1Slcted = cls >= 2 ? (rid == 0 && (p1p2 || p1) ? B1C1 : ((rid == 1 || rid == 0 && !p1) && (p1p2 || p2) ? B2C1 : (rid == 2 || rid < 2 && !p1p2 && !p1 && !p2 ? JRMCoreH.defbodycols[ran.nextInt(JRMCoreH.customSknLimitsBCP[r])][r][1] : ran.nextInt(0xFFFF28)))) : 0;
                            rid = ran.nextInt(4);
                            dnsBodyColSub2Slcted = cls >= 3 ? (rid == 0 && (p1p2 || p1) ? B1C2 : ((rid == 1 || rid == 0 && !p1) && (p1p2 || p2) ? B2C2 : (rid == 2 || rid < 2 && !p1p2 && !p1 && !p2 ? JRMCoreH.defbodycols[ran.nextInt(JRMCoreH.customSknLimitsBCP[r])][r][2] : ran.nextInt(0xFFFF28)))) : 0;
                            rid = ran.nextInt(4);
                            dnsBodyColSub3Slcted = cls >= 4 ? (rid == 0 && (p1p2 || p1) ? B1C3 : ((rid == 1 || rid == 0 && !p1) && (p1p2 || p2) ? B2C3 : (rid == 2 || rid < 2 && !p1p2 && !p1 && !p2 ? JRMCoreH.defbodycols[ran.nextInt(JRMCoreH.customSknLimitsBCP[r])][r][3] : ran.nextInt(0xFFFF28)))) : 0;
                            rid = ran.nextInt(3);
                            dnsFaceNoseSlcted = rid == 0 && (p1p2 || p1) ? F1N : ((rid == 1 || rid == 0 && !p1) && (p1p2 || p2) ? F2N : ran.nextInt(JRMCoreH.customSknLimits[r][2]));
                            rid = ran.nextInt(3);
                            dnsFaceMouthSlcted = rid == 0 && (p1p2 || p1) ? F1M : ((rid == 1 || rid == 0 && !p1) && (p1p2 || p2) ? F2M : ran.nextInt(JRMCoreH.customSknLimits[r][3]));
                            rid = ran.nextInt(3);
                            dnsEyesSlcted = rid == 0 && (p1p2 || p1) ? E1 : ((rid == 1 || rid == 0 && !p1) && (p1p2 || p2) ? E2 : ran.nextInt(JRMCoreH.customSknLimits[r][4]));
                            rid = ran.nextInt(4);
                            int rid2 = ran.nextInt(5);
                            dnsEyeCol1Slcted = rid == 0 && (p1p2 || p1) ? E1C1 : ((rid == 1 || rid == 0 && !p1) && (p1p2 || p2) ? E2C1 : (rid == 2 || rid < 2 && !p1p2 && !p1 && !p2 ? JRMCoreH.defeyecols[ran.nextInt(JRMCoreH.defeyecols.length)][r] : ran.nextInt(0xFFFF28)));
                            rid = ran.nextInt(4);
                            dnsEyeCol2Slcted = rid2 != 0 ? dnsEyeCol1Slcted : (rid == 0 && (p1p2 || p1) ? E1C1 : ((rid == 1 || rid == 0 && !p1) && (p1p2 || p2) ? E2C1 : (rid == 2 || rid < 2 && !p1p2 && !p1 && !p2 ? JRMCoreH.defeyecols[ran.nextInt(JRMCoreH.defeyecols.length)][r] : ran.nextInt(0xFFFF28))));
                            Handler.setdns();
                            String dnsHdef = JRMCoreH.defHairPrsts[ran.nextInt(JRMCoreH.defHairPrsts.length)];
                            rid = ran.nextInt(2);
                            String string = dnsHairSlcted != 12 ? "0" : (H1B == 12 && H2B == 12 ? (rid == 0 ? dnsH : dnsH2) : (H1B == 12 ? dnsH : (dnsHc = H2B == 12 ? dnsH2 : dnsHdef)));
                            EntityPlayerMP entityPlayerMP = ptg == 1 ? pt : (e = pg == 1 ? p : p);
                            EntityPlayerMP e2 = ptg == 0 ? pt : (pg == 0 ? p : pt);
                            JRMCoreH.setString(Handler.dns + ";" + e.getCommandSenderName() + ";" + e2.getCommandSenderName() + ";" + txt + ";" + FamilyCConfig.pt * 120 + ";" + dnsHc, (EntityPlayer)e, FamilyCH.prID);
                            JRMCoreH.setString("f", (EntityPlayer)e2, FamilyCH.prID);
                            e2.addChatMessage(new ChatComponentText(y + "" + g + e.getCommandSenderName() + y + " is now pregnant, thanks to you!").setChatStyle(color));
                            e.addChatMessage(new ChatComponentText(y + "You've become pregnant! The father is " + g + e2.getCommandSenderName() + y + ".").setChatStyle(color));
                        }
                    }
                } else {
                    JRMCoreH.setString("n", p, FamilyCH.prID);
                }
            }
            if (id == 9) {
                prid = JRMCoreH.getString(p, FamilyCH.prID);
                EntityPlayerMP po = JRMCoreH.getPlayerForUsername(server, prid);
                if (po != null) {
                    po.addChatMessage(new ChatComponentText(y + "" + p.getCommandSenderName() + " has declined your procreation offer!").setChatStyle(color));
                }
                JRMCoreH.setString("d", p, FamilyCH.prID);
            }
            if (id == 10) {
                EntityPlayerMP po = JRMCoreH.getPlayerForUsername(server, txt);
                String dnsTar = JRMCoreH.getString((EntityPlayer)po, "jrmcDNS");
                int pg = JRMCoreH.dnsGender(dns);
                int pog = JRMCoreH.dnsGender(dnsTar);
                byte R1 = Handler.gb(p, "jrmcRace");
                byte R2 = Handler.gb((EntityPlayer)po, "jrmcRace");
                if (FamilyCConfig.mc == 0 || FamilyCConfig.dcr) {
                    p.addChatMessage(new ChatComponentText(y + "Procreation is disabled by the server!").setChatStyle(color));
                } else if (FamilyCH.procWith(R1, R2) && po != null && (pg == 0 && pog == 1 || pg == 1 && pog == 0)) {
                    boolean allow = true;
                    String p1 = FamilyCH.rpfd(server, txt);
                    if (p1.contains(";")) {
                        String[] p1d = p1.split(";");
                        if (p1d.length >= FamilyCConfig.mc) {
                            p.addChatMessage(new ChatComponentText(y + "" + g + txt + y + " has already " + FamilyCConfig.mc + " children!").setChatStyle(color));
                            allow = false;
                        } else {
                            String[] p2d;
                            String p2 = FamilyCH.rpfd(server, p.getCommandSenderName());
                            if (p2.contains(";") && (p2d = p2.split(";")).length >= FamilyCConfig.mc) {
                                p.addChatMessage(new ChatComponentText(y + "" + g + p.getCommandSenderName() + y + " has already " + FamilyCConfig.mc + " children!").setChatStyle(color));
                                allow = false;
                            }
                        }
                    }
                    if (allow) {
                        String prid2 = JRMCoreH.getString((EntityPlayer)(pg == 1 ? p : po), FamilyCH.prID);
                        if (!prid2.contains(";") || prid2.equals("") || prid2 == "") {
                            JRMCoreH.setString(p.getCommandSenderName(), (EntityPlayer)po, FamilyCH.prID);
                            p.addChatMessage(new ChatComponentText(y + "A procreation offer has been sent!").setChatStyle(color));
                            po.addChatMessage(new ChatComponentText(y + "You've recived a procreation offer from " + g + p.getCommandSenderName() + y + "!").setChatStyle(color));
                        } else {
                            p.addChatMessage(new ChatComponentText(y + (pg == 1 ? "You are" : g + txt + y + " is") + " already pregnant!").setChatStyle(color));
                        }
                    }
                }
            }
            if (id == 20) {
                String[] dat = txt.split(":");
                int eid = Integer.parseInt(dat[0]);
                int follow = Integer.parseInt(dat[1]);
                boolean aggro = Integer.parseInt(dat[2]) == 1;
                int fid3 = Integer.parseInt(dat[3]);
                int drp = Integer.parseInt(dat[4]);
                Entity pl = p.worldObj.getEntityByID(eid);
                if (pl != null && pl instanceof EntityNPC) {
                    EntityNPC npl = (EntityNPC)pl;
                    if (p.getCommandSenderName().equalsIgnoreCase(npl.getDad()) || p.getCommandSenderName().equalsIgnoreCase(npl.getMom())) {
                        npl.setFollow(follow);
                        npl.setAggr(aggro);
                        npl.setFollowTarget(fid3);
                        if (drp == 1) {
                            ((EntityNPC)pl).dropEquipment(true, 0);
                        }
                    }
                }
            }
            if (id == 21) {
                boolean allow = true;
                String p1 = FamilyCH.rpfd(server, p.getCommandSenderName());
                String[] p1d = p1.split(";");
                String c = "";
                for (int i = 0; i < p1d.length; ++i) {
                    String[] d = p1d[i].split(":");
                    c = c + ";" + FamilyCH.rcfd(server, d[0]) + ":" + FamilyCH.rcpd(server, d[0]);
                }
                if ((c = c.substring(1)).length() > 2) {
                    FamilyCH.jfcd(21, c, p);
                }
            }
            if (id == 22) {
                String[] dat = txt.split(":");
                int eid = Integer.parseInt(dat[0]);
                String n2 = dat[1];
                Entity pl = p.worldObj.getEntityByID(eid);
                if (pl != null && pl instanceof EntityNPC) {
                    EntityNPC entityNPC = (EntityNPC)pl;
                    if (p.getCommandSenderName().equalsIgnoreCase(entityNPC.getDad()) || p.getCommandSenderName().equalsIgnoreCase(entityNPC.getMom())) {
                        entityNPC.setCnam((byte)0);
                        entityNPC.setNam(n2);
                        entityNPC.setNamUpdt(true);
                        String d = FamilyCH.rcfd(server, entityNPC.getCid() + "");
                        String[] prt = d.split(":");
                        FamilyCH.wcfd(server, prt[1] + ":" + prt[2] + ":" + n2, entityNPC.getCid(), false);
                        FamilyCH.jfcd(23, entityNPC.getEntityId() + "", p);
                    }
                }
            }
            if (id == 23) {
                String[] dat = txt.split(":");
                int eid = Integer.parseInt(dat[0]);
                String type = dat[1];
                String dnsNPC = dat[2];
                Entity entity = p.worldObj.getEntityByID(eid);
                if (entity != null && entity instanceof EntityNPC) {
                    EntityNPC entityNPC = (EntityNPC)entity;
                    if (p.getCommandSenderName().equalsIgnoreCase(entityNPC.getDad()) || p.getCommandSenderName().equalsIgnoreCase(entityNPC.getMom())) {
                        if (type.equals("dns")) {
                            entityNPC.setDNS(dnsNPC);
                        }
                        if (type.equals("dnsH")) {
                            entityNPC.setDNSH(dnsNPC);
                        }
                    }
                }
            }
            return null;
        }

        private static String ntl(int i) {
            return JRMCoreH.numToLet(i);
        }

        private static String ntl5(int i) {
            return JRMCoreH.numToLet5(i);
        }

        private static byte gb(EntityPlayer p, String s) {
            return JRMCoreH.getByte(p, s);
        }

        private static int gi(EntityPlayer p, String s) {
            return JRMCoreH.getInt(p, s);
        }

        public static void setdns() {
            String R = Handler.ntl(dnsRaceSlcted);
            String G = dnsGenderSlcted + "";
            String H1 = Handler.ntl(dnsHairSlcted);
            String H2 = Handler.ntl(dnsHair2Slcted);
            String HC = Handler.ntl5(dnsColorSlcted);
            String BS = dnsBreastSizeSlcted + "";
            String ST = "1";
            String BT = Handler.ntl(dnsBodyTypeSlcted);
            String BCM = Handler.ntl5(dnsBodyColMainSlcted);
            String BC1 = Handler.ntl5(dnsBodyColSub1Slcted);
            String BC2 = Handler.ntl5(dnsBodyColSub2Slcted);
            String BC3 = Handler.ntl5(dnsBodyColSub3Slcted);
            String FN = Handler.ntl(dnsFaceNoseSlcted);
            String FM = Handler.ntl(dnsFaceMouthSlcted);
            String ET = Handler.ntl(dnsEyesSlcted);
            String EC1 = Handler.ntl5(dnsEyeCol1Slcted);
            String EC2 = Handler.ntl5(dnsEyeCol2Slcted);
            dns = R + G + H1 + H2 + HC + BS + ST + BT + BCM + BC1 + BC2 + BC3 + FN + FM + ET + EC1 + EC2;
        }
    }
}

