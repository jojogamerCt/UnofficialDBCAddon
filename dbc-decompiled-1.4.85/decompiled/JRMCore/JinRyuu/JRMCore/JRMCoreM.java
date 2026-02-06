/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  cpw.mods.fml.common.FMLCommonHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.world.WorldProvider
 *  net.minecraftforge.common.DimensionManager
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.lang3.math.NumberUtils
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreMm;
import JinRyuu.JRMCore.JRMCoreMsn;
import JinRyuu.JRMCore.JRMCoreMsnBundle;
import JinRyuu.JRMCore.p.JRMCorePData2;
import JinRyuu.JRMCore.p.PD;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import cpw.mods.fml.common.FMLCommonHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class JRMCoreM {
    public static HashMap<String, JRMCoreMsnBundle> missions = new HashMap();
    public static HashMap<String, JRMCoreMsn> missionsC = new HashMap();
    public static HashMap<String, ArrayList<String>> missionsCD = new HashMap();
    public static final int MISSION_INFO_SeID = 0;
    public static final int MISSION_INFO_Name = 1;
    public static final int MISSION_INFO_Desc = 2;
    public static final int MISSION_INFO_Auth = 3;
    public static final int MISSION_INFO_Vers = 4;
    public static final int MISSION_INFO_Mods = 5;
    public static final int MISSION_INFO_Rept = 6;
    public static final int MISSION_INFO_Unlo = 7;
    public static final String SERIES_DBC_MainID = "mainDBC";
    public static final String SERIES_DBC_DBSBrolyID = "dbcDBCBroly";
    public static final String SERIES_NC_MainID = "mainNC";
    public static final String MISSION_TYPE_Kill = "kill";
    public static final String MISSION_TYPE_KillMoreOfSamekind = "killsame";
    public static final String MISSION_TYPE_GoToBiome = "biome";
    public static final String MISSION_TYPE_GoToDim = "dim";
    public static final String MISSION_TYPE_ClickNext = "next";
    public static final String MISSION_TYPE_ClickStart = "start";
    public static final String MISSION_TYPE_ClickSkip = "skip";
    public static final String MISSION_TYPE_ClickRestart = "restart";
    public static final String MISSION_TYPE_GatherItem = "item";
    public static final String MISSION_TYPE_TalkTo = "talk";
    public static final String MISSION_TYPE_StateIn = "state";
    public static final String MISSION_TYPE_BeInBiome = "biome2";
    public static final String MISSION_TYPE_BeInDim = "dim2";
    public static final String MISSION_TYPE_Lvl = "lvl";
    public static final String MISSION_PROP_RandomReward = "randrew";
    public static final String REWARD_TYPE_NOTHING = "nothing";
    public static final String REWARD_TYPE_Item = "item";
    public static final String REWARD_TYPE_TP = "tp";
    public static final String REWARD_TYPE_Alignment = "align";
    public static final String REWARD_TYPE_Command = "com";
    public static final String REWARD_TYPE_TP_FIX = "fix";
    public static final String REWARD_TYPE_TP_ALIGN = "align";
    public static final String REWARD_TYPE_TP_LVL = "lvl";
    public static final String REWARD_TYPE_TP_LVLALIGN = "lvlalign";
    public static final Type JSN_TYPE_MSNbndl = new TypeToken<JRMCoreMsnBundle>(){}.getType();
    public static final Type JSN_TYPE_MSN = new TypeToken<JRMCoreMsn>(){}.getType();
    public static final int SYNC_DataVersion_ServerID = 0;
    public static final int SYNC_DataVersion_Version = 1;
    public static final int SYNC_DataVersion_Repeat = 2;
    public static final int SYNC_DataVersion_CompleteCounter = 3;
    public static final int SYNC_DataVersion_CompleteCounterLatestVersionOnly = 4;
    public static final int SYNC_COND_SeriesID = 0;
    public static final int SYNC_COND_MissionID = 1;
    public static final int SYNC_COND_Started = 2;
    public static final int SYNC_COND_data1 = 3;
    public static final int SYNC_COND_data2 = 4;
    public static final int SYNC_COND_data3 = 5;
    public static final int SYNC_COND_data4 = 6;
    public static final String MISSION_CONDS_TYPE = "0";
    public static final String MISSION_CONDS_Name = "N";
    public static final String MISSION_CONDS_Health = "H";
    public static final String MISSION_CONDS_Attack = "A";
    public static final String MISSION_CONDS_Amount = "M";
    public static final String MISSION_CONDS_MsgSpawn = "S";
    public static final String MISSION_CONDS_MsgDeath = "D";
    public static final String MISSION_CONDS_Message = "G";
    public static final String MISSION_CONDS_MsgBtn = "B";
    public static final String MISSION_CONDS_Protect = "P";
    public static final String MISSION_CONDS_NoSpawn = "W";
    public static final String MISSION_TalkTo_Series = "series";
    public static final String MISSION_TalkTo_translated = "translated";
    public static final String MISSION_CONDS_Transformations = "T";
    public static final String MISSION_CONDS_MsgSpawnSnd = "O";
    public static final String MISSION_CONDS_MsgDeathSnd = "U";

    public static void msnGenWrt(File dbcMain, Object mb) {
        try {
            dbcMain.getParentFile().mkdirs();
            dbcMain.createNewFile();
            FileWriter writer = new FileWriter(dbcMain);
            Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().create();
            gson.toJson(mb, JSN_TYPE_MSNbndl, (Appendable)writer);
            ((Writer)writer).flush();
            ((Writer)writer).close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JRMCoreMsnBundle rd(File file) {
        try {
            Gson gson = new Gson();
            JsonReader reader = new JsonReader((Reader)new FileReader(file));
            JRMCoreMsnBundle data = (JRMCoreMsnBundle)gson.fromJson(reader, JSN_TYPE_MSNbndl);
            return data;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void om(MinecraftServer s) {
        if (s != null && s.worldServers.length > 0 && s.worldServerForDimension(0) != null && s.worldServerForDimension(0).getChunkSaveLocation() != null) {
            String pnt = s.worldServerForDimension(0).getChunkSaveLocation() + "/data/missions";
            File entitylist = new File(pnt, "EntityList.txt");
            entitylist.delete();
            try {
                ArrayList ar = Lists.newArrayList();
                for (String n : EntityList.stringToClassMapping.keySet()) {
                    Class c = (Class)EntityList.stringToClassMapping.get(n);
                    if (!EntityLivingBase.class.isAssignableFrom(c)) continue;
                    ar.add(n);
                }
                Collections.sort(ar);
                String list = "";
                for (int i = 0; i < ar.size(); ++i) {
                    list = list + (String)ar.get(i) + "\n";
                }
                FileUtils.writeStringToFile((File)entitylist, (String)list);
            }
            catch (IOException e1) {
                e1.printStackTrace();
            }
            File dbcMain = new File(pnt, "mainDBC.json");
            JRMCoreMsnBundle msb = JRMCoreMm.msnGen();
            File dbcDBSBroly = new File(pnt, "dbcDBCBroly.json");
            JRMCoreMsnBundle missionSideDBSBroly = JRMCoreMm.missionSideDBSBroly();
            File ncMain = new File(pnt, "mainNC.json");
            JRMCoreMsnBundle msbNC = JRMCoreMm.msnGenNC();
            missions.clear();
            File dir = new File(pnt);
            File[] list = dir.listFiles();
            if (dir != null && list != null && list.length > 0) {
                JRMCoreMsnBundle rms;
                if (!dbcMain.exists()) {
                    JRMCoreM.msnGenWrt(dbcMain, msb);
                    missions.put(SERIES_DBC_MainID, msb);
                } else {
                    rms = JRMCoreM.rd(dbcMain);
                    missions.put(SERIES_DBC_MainID, msb.getVersion().equalsIgnoreCase(msb.getVersion()) ? rms : msb);
                }
                if (!dbcDBSBroly.exists()) {
                    JRMCoreM.msnGenWrt(dbcDBSBroly, missionSideDBSBroly);
                    missions.put(SERIES_DBC_DBSBrolyID, missionSideDBSBroly);
                } else {
                    rms = JRMCoreM.rd(dbcDBSBroly);
                    missions.put(SERIES_DBC_DBSBrolyID, missionSideDBSBroly.getVersion().equalsIgnoreCase(missionSideDBSBroly.getVersion()) ? rms : missionSideDBSBroly);
                }
                if (!ncMain.exists()) {
                    JRMCoreM.msnGenWrt(ncMain, msbNC);
                    missions.put(SERIES_NC_MainID, msbNC);
                } else {
                    rms = JRMCoreM.rd(ncMain);
                    missions.put(SERIES_NC_MainID, msbNC.getVersion().equalsIgnoreCase(msbNC.getVersion()) ? rms : msbNC);
                }
                for (int i = 0; i < list.length; ++i) {
                    String mss = list[i].getName();
                    if (!mss.endsWith(".json") || (mss = mss.replace(".json", "")).equalsIgnoreCase(SERIES_DBC_MainID) || mss.equalsIgnoreCase(SERIES_NC_MainID)) continue;
                    missions.put(mss, JRMCoreM.rd(list[i]));
                }
            } else {
                JRMCoreMsnBundle rms;
                if (!dbcMain.exists()) {
                    JRMCoreM.msnGenWrt(dbcMain, msb);
                    missions.put(SERIES_DBC_MainID, msb);
                } else {
                    rms = JRMCoreM.rd(dbcMain);
                    missions.put(SERIES_DBC_MainID, msb.getVersion().equalsIgnoreCase(msb.getVersion()) ? rms : msb);
                }
                if (!dbcDBSBroly.exists()) {
                    JRMCoreM.msnGenWrt(dbcDBSBroly, missionSideDBSBroly);
                    missions.put(SERIES_DBC_DBSBrolyID, missionSideDBSBroly);
                } else {
                    rms = JRMCoreM.rd(dbcDBSBroly);
                    missions.put(SERIES_DBC_DBSBrolyID, missionSideDBSBroly.getVersion().equalsIgnoreCase(missionSideDBSBroly.getVersion()) ? rms : missionSideDBSBroly);
                }
                if (!ncMain.exists()) {
                    JRMCoreM.msnGenWrt(ncMain, msbNC);
                    missions.put(SERIES_NC_MainID, msbNC);
                } else {
                    rms = JRMCoreM.rd(ncMain);
                    missions.put(SERIES_NC_MainID, msbNC.getVersion().equalsIgnoreCase(msbNC.getVersion()) ? rms : msbNC);
                }
            }
        }
    }

    public static String[] getSyda(String s) {
        return s.split(";");
    }

    public static String getSyda(String s, String sid) {
        String[] s1 = JRMCoreM.getSyda(s);
        for (int i = 0; i < s1.length; ++i) {
            String[] sd = s1[i].split(",");
            if (!sd[0].equalsIgnoreCase(sid)) continue;
            return s1[i];
        }
        return "";
    }

    public static int getSydaAmount(String s) {
        return JRMCoreM.getSyda(s).length;
    }

    public static int getSydaAmountFromData1(String s) {
        return JRMCoreM.getSyda(s).length - 3;
    }

    public static String[] getMda(String s, int i) {
        if (i >= 0) {
            return JRMCoreM.getSyda(s)[i].split(",");
        }
        String[] a = new String[]{"", "", ""};
        return a;
    }

    public static String[] getMda(String s, String i) {
        return JRMCoreM.getSyda(s, i).split(",");
    }

    public static String getMda_Con(String s, int i, int a) {
        String[] ar = JRMCoreM.getMda(s, i);
        if (ar.length > a) {
            return ar[a];
        }
        return "";
    }

    public static String getMda_Con(String[] ar, int a) {
        if (ar.length > a) {
            return ar[a];
        }
        return "";
    }

    public static String getMda_Series(String s, int i) {
        return JRMCoreM.getMda(s, i)[0];
    }

    public static int getMda_Mission(String s, int i) {
        return Integer.parseInt(JRMCoreM.getMda(s, i)[1]);
    }

    public static int getMda_Mission(String s, String i) {
        return Integer.parseInt(JRMCoreM.getMda(s, i)[1]);
    }

    public static boolean isUnlocked(String sidd, String MSD, String MSDV) {
        if (sidd.contains(":")) {
            String[] nm = sidd.split(":");
            String[] sydaV = JRMCoreM.getMda(MSDV, nm[0]);
            String ccv = JRMCoreM.getSydaV(sydaV, 4);
            int ps = JRMCoreM.getMda_Mission(MSD, nm[0]);
            return !ccv.equals(MISSION_CONDS_TYPE) || ccv.equals(MISSION_CONDS_TYPE) && ps > Integer.parseInt(nm[1]);
        }
        String[] sydaV = JRMCoreM.getMda(MSDV, sidd);
        String ccv = JRMCoreM.getSydaV(sydaV, 4);
        return !ccv.equals(MISSION_CONDS_TYPE);
    }

    public static String setSydaV(String msdv, String sid, String ver, String rep, String cc, String ccv) {
        String[] sda = JRMCoreM.getSyda(msdv);
        String tr = "";
        boolean hi = false;
        if (msdv.length() > 3) {
            for (int i = 0; i < sda.length; ++i) {
                String[] ds = sda[i].split(",");
                if (sid.equalsIgnoreCase(ds[0])) {
                    tr = tr + ";" + sid + "," + ver + "," + rep + "," + cc + "," + ccv;
                    hi = true;
                    continue;
                }
                tr = ds.length > 3 ? tr + ";" + ds[0] + "," + ds[1] + "," + ds[2] + "," + ds[3] + "," + ds[4] : tr + ";" + ds[0] + "," + ds[1] + "," + 0 + "," + 0 + "," + 0;
            }
        }
        if (!hi) {
            tr = tr + ";" + sid + "," + ver + "," + 0 + "," + 0 + "," + 0;
        }
        return tr.substring(1);
    }

    public static String setSyda(String msd, String sid, int mid, int sz, int dc, String ds) {
        int i;
        String[] ar = new String[sz];
        boolean mk = false;
        for (i = 0; i < ar.length; ++i) {
            int scd;
            String[] mda = JRMCoreM.getMda(msd, sid);
            if (mda.length <= (scd = JRMCoreM.SYNC_COND_data(i))) {
                mk = true;
                break;
            }
            ar[i] = i == dc ? ds : mda[scd];
        }
        if (mk) {
            ar = new String[sz];
            for (i = 0; i < sz; ++i) {
                ar[i] = MISSION_CONDS_TYPE;
            }
        }
        return JRMCoreM.setSyda(msd, sid, mid, ar);
    }

    public static String setSyda(String sd, String sid, int mid, String ... v) {
        String csid;
        int j;
        String d = "";
        String[] sda = JRMCoreM.getSyda(sd);
        int asid = 0;
        int i = -1;
        for (j = 0; j < sda.length; ++j) {
            csid = JRMCoreM.getMda_Series(sd, j);
            if (!csid.equals(sid) || ++asid != 1) continue;
            i = j;
        }
        for (j = 0; j < sda.length; ++j) {
            if (i == j) {
                d = d + ";" + JRMCoreM.parse_Mda(sid, mid, v);
                continue;
            }
            if (sda[j].length() <= 3) continue;
            d = d + ";" + sda[j];
        }
        if (i == -1) {
            d = d + ";" + JRMCoreM.parse_Mda(sid, mid, v);
        }
        String string = sd = d.length() > 3 ? d.substring(1, d.length()) : d;
        if (asid > 1) {
            d = "";
            sda = JRMCoreM.getSyda(sd);
            asid = 0;
            for (j = 0; j < sda.length; ++j) {
                csid = JRMCoreM.getMda_Series(sd, j);
                if (csid.equals(sid)) {
                    ++asid;
                }
                if (asid > 1 || sda[j].length() <= 3) continue;
                d = d + ";" + sda[j];
            }
            sd = d.length() > 3 ? d.substring(1, d.length()) : d;
        }
        return sd;
    }

    public static String parse_Mda(String sid, int mid, String ... v) {
        String r = sid + "," + mid;
        for (int i = 0; i < v.length; ++i) {
            r = r + "," + v[i];
        }
        return r;
    }

    public static int getMda_SeriesByID(String s, String i) {
        for (int j = 0; j < JRMCoreM.getSydaAmount(s); ++j) {
            if (!JRMCoreM.getMda(s, j)[0].equalsIgnoreCase(i)) continue;
            return j;
        }
        return -1;
    }

    public static int SYNC_COND_data(int c) {
        return 2 + c;
    }

    public static int SYNC_COND_data_REV(int c) {
        return c - 2;
    }

    public static int getSycoDaam(String s) {
        if (s.equalsIgnoreCase(MISSION_TYPE_Kill)) {
            return 1;
        }
        if (s.equalsIgnoreCase(MISSION_TYPE_KillMoreOfSamekind)) {
            return 1;
        }
        if (s.equalsIgnoreCase(MISSION_TYPE_GoToBiome)) {
            return 1;
        }
        if (s.equalsIgnoreCase(MISSION_TYPE_GoToDim)) {
            return 1;
        }
        if (s.equalsIgnoreCase("item")) {
            return 1;
        }
        return 1;
    }

    public static String[] getMCo_parse(String s) {
        return s.split(";");
    }

    public static String getMCo_type(String s) {
        String[] p = JRMCoreM.getMCo_parse(s);
        return p[0];
    }

    public static String getMCo_data(String s, String a) {
        String[] p = JRMCoreM.getMCo_parse(s);
        if (a.equals(MISSION_CONDS_TYPE)) {
            return p[0];
        }
        for (int i = 0; i < p.length; ++i) {
            if (!p[i].toUpperCase().startsWith(a)) continue;
            return p[i].substring(1);
        }
        return "";
    }

    public static int getMCo_dataI(String s, String a) {
        String n = JRMCoreM.getMCo_data(s, a);
        if (NumberUtils.isNumber((String)n)) {
            return Integer.parseInt(n);
        }
        return 0;
    }

    public static double getMCo_dataD(String s, String a) {
        String n = JRMCoreM.getMCo_data(s, a);
        if (NumberUtils.isNumber((String)n)) {
            return Double.parseDouble(JRMCoreM.getMCo_data(s, n));
        }
        return 0.0;
    }

    public static String[] getMCo_TranSplit(String s) {
        return s.split("\\|\\|");
    }

    public static String getBtn(String s) {
        if (s.equalsIgnoreCase(MISSION_TYPE_ClickNext)) {
            return JRMCoreH.trl("jrmc", "Next");
        }
        if (s.equalsIgnoreCase(MISSION_TYPE_ClickStart)) {
            return JRMCoreH.trl("jrmc", MISSION_TYPE_ClickStart);
        }
        if (s.equalsIgnoreCase(MISSION_TYPE_ClickSkip)) {
            return JRMCoreH.trl("jrmc", "Skip");
        }
        if (s.equalsIgnoreCase(MISSION_TYPE_ClickRestart)) {
            return JRMCoreH.trl("jrmc", "Restart");
        }
        return s;
    }

    public static boolean getMda_btn_Start(ArrayList<String> a, String[] s, int g) {
        int size = a.size();
        if (size == 1 && (a.get(0).equalsIgnoreCase(MISSION_TYPE_ClickNext) || a.get(0).equalsIgnoreCase(MISSION_TYPE_ClickStart))) {
            return s[2].equals(MISSION_CONDS_TYPE);
        }
        if (size == 1 && (a.get(0).equalsIgnoreCase(MISSION_TYPE_ClickSkip) || a.get(0).equalsIgnoreCase(MISSION_TYPE_ClickRestart))) {
            return true;
        }
        int inB = 0;
        int inD = 0;
        boolean all = false;
        boolean cont = true;
        int i = 1;
        for (int j = 1; j < a.size(); ++j) {
            String os = a.get(j);
            String t = JRMCoreM.getMCo_type(os);
            if (cont && t.equalsIgnoreCase(MISSION_TYPE_Kill)) {
                all = s[2].equals(MISSION_CONDS_TYPE) && s[JRMCoreM.SYNC_COND_data(i)].equals(MISSION_CONDS_TYPE);
                boolean spwn = JRMCoreM.getMCo_data(os, MISSION_CONDS_Protect).equalsIgnoreCase("spwn");
                if (spwn) {
                    return false;
                }
                if (all) {
                    return all;
                }
            } else if (cont && t.equalsIgnoreCase(MISSION_TYPE_KillMoreOfSamekind)) {
                int da = (int)((float)JRMCoreM.getMCo_dataI(os, MISSION_CONDS_Amount) * JRMCoreM.gm(g));
                all = s[2].equals(MISSION_CONDS_TYPE) && da > Integer.parseInt(s[JRMCoreM.SYNC_COND_data(i)]);
                boolean spwn = JRMCoreM.getMCo_data(os, MISSION_CONDS_Protect).equalsIgnoreCase("spwn");
                if (spwn) {
                    return false;
                }
                if (all) {
                    return all;
                }
            } else if (t.equalsIgnoreCase(MISSION_TYPE_BeInBiome)) {
                all = s[JRMCoreM.SYNC_COND_data(i)].equals("1");
                inB = all ? 1 : 2;
            } else if (t.equalsIgnoreCase(MISSION_TYPE_BeInDim)) {
                all = s[JRMCoreM.SYNC_COND_data(i)].equals("1");
                inD = all ? 1 : 2;
            }
            cont = !(inB != 0 && inB != 1 || inD != 0 && inD != 1);
            ++i;
        }
        return all;
    }

    public static String GetWorldNameFromCurDim(int i) {
        WorldProvider p = DimensionManager.createProviderFor((int)i);
        return p != null ? p.getDimensionName() : "Id " + i;
    }

    public static HashMap<String, String> getMda_Obj_TalkTo() {
        HashMap<String, String> h = null;
        String msd = JRMCoreH.MSD;
        for (String seriesID : missionsC.keySet()) {
            int MsnID = 0;
            if (msd.length() > 3) {
                MsnID = JRMCoreM.getMda_Mission(msd, seriesID);
            }
            JRMCoreMsn msn = missionsC.get(seriesID);
            boolean nr = false;
            if (msn == null || msn.getId() != MsnID) continue;
            ArrayList<String> a = msn.getObjectives(JRMCoreH.Pwrtyp, JRMCoreH.Race, JRMCoreH.Class);
            String btnN = a.get(0);
            String[] syncMda = JRMCoreM.getMda(msd, seriesID);
            if (syncMda.length <= 1) continue;
            int size = a.size();
            if (syncMda.length <= 3) continue;
            for (int i = 1; i < a.size(); ++i) {
                String os = a.get(i);
                String t = JRMCoreM.getMCo_type(os);
                if (os == null || !t.equalsIgnoreCase(MISSION_TYPE_TalkTo)) continue;
                if (syncMda[JRMCoreM.SYNC_COND_data(i)].equals("1")) {
                    return null;
                }
                h = new HashMap<String, String>();
                h.put(MISSION_CONDS_Name, JRMCoreM.getMCo_data(os, MISSION_CONDS_Name));
                h.put(MISSION_CONDS_Message, JRMCoreM.getMCo_data(os, MISSION_CONDS_Message));
                h.put(MISSION_CONDS_MsgBtn, JRMCoreM.getMCo_data(os, MISSION_CONDS_MsgBtn));
                h.put(MISSION_TalkTo_translated, "" + msn.isTranslated());
                h.put(MISSION_TalkTo_Series, seriesID);
                return h;
            }
        }
        return null;
    }

    public static float gm(int s) {
        return 1.0f + (s > 0 ? (float)s * 0.5f - 0.5f : 0.0f);
    }

    public static boolean getMda_ObjComp_all(ArrayList<String> a, String[] s, int g) {
        int size = a.size();
        if (size == 1 && (a.get(0).equalsIgnoreCase(MISSION_TYPE_ClickNext) || a.get(0).equalsIgnoreCase(MISSION_TYPE_ClickStart))) {
            return s[2].equals("1");
        }
        if (size == 1 && a.get(0).equalsIgnoreCase(MISSION_TYPE_ClickSkip)) {
            return true;
        }
        if (s.length > 3) {
            boolean all = true;
            for (int i = 1; i < a.size(); ++i) {
                String os = a.get(i);
                String t = JRMCoreM.getMCo_type(os);
                int scd = JRMCoreM.SYNC_COND_data(i);
                if (s.length <= scd) {
                    all = true;
                    break;
                }
                if (t.equalsIgnoreCase(MISSION_TYPE_Kill)) {
                    all = s[scd].equals("1");
                } else if (t.equalsIgnoreCase(MISSION_TYPE_KillMoreOfSamekind)) {
                    int d1 = (int)((float)JRMCoreM.getMCo_dataI(os, MISSION_CONDS_Amount) * JRMCoreM.gm(g));
                    all = Integer.parseInt(s[scd]) >= d1;
                } else if (t.equalsIgnoreCase("item")) {
                    int d1 = (int)((float)JRMCoreM.getMCo_dataI(os, MISSION_CONDS_Amount) * JRMCoreM.gm(g));
                    all = Integer.parseInt(s[scd]) >= d1;
                } else if (t.equalsIgnoreCase(MISSION_TYPE_GoToBiome)) {
                    all = s[scd].equals("1");
                } else if (t.equalsIgnoreCase(MISSION_TYPE_GoToDim)) {
                    all = s[scd].equals("1");
                } else if (t.equalsIgnoreCase(MISSION_TYPE_TalkTo)) {
                    all = s[scd].equals("1");
                } else if (t.equalsIgnoreCase(MISSION_TYPE_StateIn)) {
                    String d1 = JRMCoreM.getMCo_data(os, MISSION_CONDS_Name);
                    all = s[scd].equalsIgnoreCase(d1);
                } else if (t.equalsIgnoreCase(MISSION_TYPE_BeInBiome)) {
                    all = s[scd].equals("1");
                } else if (t.equalsIgnoreCase(MISSION_TYPE_BeInDim)) {
                    all = s[scd].equals("1");
                } else if (t.equalsIgnoreCase("lvl")) {
                    int d1 = JRMCoreM.getMCo_dataI(os, MISSION_CONDS_Amount);
                    all = Integer.parseInt(s[scd]) >= d1;
                } else if (t.equalsIgnoreCase(MISSION_TYPE_ClickSkip)) {
                    all = true;
                }
                if (!all) break;
            }
            return all;
        }
        return false;
    }

    public static String getMCo_readable(String os, String nss, int g) {
        String t = JRMCoreM.getMCo_type(os).toLowerCase();
        String nm = JRMCoreM.getMCo_data(os, MISSION_CONDS_Name);
        if (t.equalsIgnoreCase(MISSION_TYPE_Kill)) {
            String en;
            boolean any = JRMCoreM.getMCo_data(os, MISSION_CONDS_Protect).equalsIgnoreCase("no");
            boolean spwn = JRMCoreM.getMCo_data(os, MISSION_CONDS_Protect).equalsIgnoreCase("spwn");
            Entity e = EntityList.createEntityByName((String)nm, null);
            String string = en = e != null ? e.getCommandSenderName() : "ERROR";
            String kld = nss.equals("1") ? JRMCoreH.trl("jrmc", "missionObjType.defeated") : "" + (JRMCoreM.gm(g) > 1.0f ? " (x" + JRMCoreM.gm(g) + ")" : "");
            return JRMCoreH.trl("jrmc", "missionObjType." + t + (any ? "" : ""), en, kld) + (any || spwn ? JRMCoreH.trl("jrmc", "missionObjType.anywilldo") : "");
        }
        if (t.equalsIgnoreCase(MISSION_TYPE_KillMoreOfSamekind) && nss.length() > 0) {
            String en;
            boolean any = JRMCoreM.getMCo_data(os, MISSION_CONDS_Protect).equalsIgnoreCase("no");
            boolean spwn = JRMCoreM.getMCo_data(os, MISSION_CONDS_Protect).equalsIgnoreCase("spwn");
            int am = (int)((float)JRMCoreM.getMCo_dataI(os, MISSION_CONDS_Amount) * JRMCoreM.gm(g));
            Entity e = EntityList.createEntityByName((String)nm, null);
            String string = en = e != null ? e.getCommandSenderName() : "ERROR";
            String kld = Integer.parseInt(nss) >= am ? JRMCoreH.trl("jrmc", "missionObjType.completed") : " - " + nss + "/" + am + (JRMCoreM.gm(g) > 1.0f ? " (x" + JRMCoreM.gm(g) + ")" : "");
            return JRMCoreH.trl("jrmc", "missionObjType." + t, en, kld) + (any || spwn ? JRMCoreH.trl("jrmc", "missionObjType.anywilldo") : "");
        }
        if (t.equalsIgnoreCase("item") && nss.length() > 0) {
            String en;
            int am = (int)((float)JRMCoreM.getMCo_dataI(os, MISSION_CONDS_Amount) * JRMCoreM.gm(g));
            String[] nm2 = nm.split("::");
            Item i = JRMCoreH.getItemByText(nm2.length > 1 ? nm2[0] : nm);
            ItemStack is = i != null ? new ItemStack(i, 1, nm2.length > 1 ? Integer.parseInt(nm2[1]) : 0) : null;
            String string = en = i != null ? is.getUnlocalizedName() : "ERROR";
            String kld = Integer.parseInt(nss) >= am ? JRMCoreH.trl("jrmc", "missionObjType.completed") : " - " + nss + "/" + am + (JRMCoreM.gm(g) > 1.0f ? " (x" + JRMCoreM.gm(g) + ")" : "");
            return JRMCoreH.trl("jrmc", "missionObjType." + t, JRMCoreH.trl(en + ".name"), kld);
        }
        if (t.equalsIgnoreCase(MISSION_TYPE_GoToBiome)) {
            String kld = nss.equals("1") ? JRMCoreH.trl("jrmc", "missionObjType.completed") : "";
            return JRMCoreH.trl("jrmc", "missionObjType." + t, nm, kld);
        }
        if (t.equalsIgnoreCase(MISSION_TYPE_GoToDim)) {
            if (NumberUtils.isNumber((String)nm)) {
                nm = JRMCoreM.GetWorldNameFromCurDim(Integer.parseInt(nm));
            }
            String kld = nss.equals("1") ? JRMCoreH.trl("jrmc", "missionObjType.completed") : "";
            return JRMCoreH.trl("jrmc", "missionObjType." + t, nm, kld);
        }
        if (t.equalsIgnoreCase(MISSION_TYPE_TalkTo)) {
            String en = EntityList.createEntityByName((String)nm, null).getCommandSenderName();
            String kld = nss.equals("1") ? JRMCoreH.trl("jrmc", "missionObjType.completed") : "";
            return JRMCoreH.trl("jrmc", "missionObjType." + t, en, kld);
        }
        if (t.equalsIgnoreCase(MISSION_TYPE_StateIn)) {
            String kld = nss.equalsIgnoreCase(nm) ? JRMCoreH.trl("jrmc", "missionObjType.completed") : "";
            return JRMCoreH.trl("jrmc", "missionObjType." + t, nm, kld);
        }
        if (t.equalsIgnoreCase(MISSION_TYPE_BeInBiome)) {
            String kld = nss.equals("1") ? JRMCoreH.trl("jrmc", "missionObjType.completed") : "";
            return JRMCoreH.trl("jrmc", "missionObjType." + t, nm, kld);
        }
        if (t.equalsIgnoreCase(MISSION_TYPE_BeInDim)) {
            if (NumberUtils.isNumber((String)nm)) {
                nm = JRMCoreM.GetWorldNameFromCurDim(Integer.parseInt(nm));
            }
            String kld = nss.equals("1") ? JRMCoreH.trl("jrmc", "missionObjType.completed") : "";
            return JRMCoreH.trl("jrmc", "missionObjType." + t, nm, kld);
        }
        if (t.equalsIgnoreCase("lvl") && nss.length() > 0) {
            int am = JRMCoreM.getMCo_dataI(os, MISSION_CONDS_Amount);
            String kld = Integer.parseInt(nss) >= am ? JRMCoreH.trl("jrmc", "missionObjType.completed") : "";
            return JRMCoreH.trl("jrmc", "missionObjType." + t, am, kld);
        }
        return JRMCoreH.trl("jrmc", "missionObjType.nothing");
    }

    public static int getMAlgnmnt_Num(String s) {
        for (int i = 0; i < JRMCoreH.AlgnmntNms.length; ++i) {
            if (!JRMCoreH.AlgnmntNms[i].equalsIgnoreCase(s)) continue;
            return i;
        }
        return 1;
    }

    public static double getMultFor(Entity f, Entity t) {
        String mt = f.getEntityData().getString("jrmcSpawnInitiatedCMT");
        String[] amt = mt.split("\\|\\|");
        for (int i = 0; i < amt.length; ++i) {
            String[] aamt = amt[i].split("\\|");
            if (aamt.length <= 1 || !aamt[0].equalsIgnoreCase(EntityList.getEntityString((Entity)t))) continue;
            return Double.parseDouble(aamt[2]);
        }
        return 0.0;
    }

    public static String[] getMobTranNext(String cmt, EntityLivingBase e) {
        String es = EntityList.getEntityString((Entity)e);
        String[] amt = cmt.split("\\|\\|");
        int inTRLst = -1;
        for (int i = 0; i < amt.length; ++i) {
            String[] aamt = amt[i].split("\\|");
            if (aamt.length <= 1 || !aamt[0].equalsIgnoreCase(es)) continue;
            inTRLst = i;
            break;
        }
        if (cmt.length() > 2 && amt.length > inTRLst + 1) {
            return amt[inTRLst + 1].split("\\|");
        }
        return null;
    }

    public static String[] getMobTranDat(String cmt, EntityLivingBase e) {
        String es = EntityList.getEntityString((Entity)e);
        String[] amt = cmt.split("\\|\\|");
        int inTRLst = -1;
        for (int i = 0; i < amt.length; ++i) {
            String[] aamt = amt[i].split("\\|");
            if (aamt.length <= 1 || !aamt[0].equalsIgnoreCase(es)) continue;
            inTRLst = i;
            break;
        }
        if (cmt.length() > 2 && inTRLst >= 0 && amt.length > inTRLst) {
            return amt[inTRLst].split("\\|");
        }
        return null;
    }

    public static void prog(EntityPlayer Player, String sid, String v, String rp, String cc, String ccv) {
        MinecraftServer server1 = FMLCommonHandler.instance().getMinecraftServerInstance();
        int gid = JRMCoreH.getInt(Player, "JRMCGID");
        if (gid != 0 && server1.getConfigurationManager().playerEntityList != null && server1.getConfigurationManager().playerEntityList.size() > 0) {
            for (Object n : server1.getConfigurationManager().playerEntityList) {
                int egid;
                EntityPlayer en = (EntityPlayer)n;
                if (en == Player || (egid = JRMCoreH.getInt(en, "JRMCGID")) != gid) continue;
                NBTTagCompound nbt = JRMCoreH.nbt((Entity)en, "pres");
                String msdV = nbt.getString("JRMCmissionSyncVers");
                msdV = JRMCoreM.setSydaV(msdV, sid, v, rp, cc, ccv);
                nbt.setString("JRMCmissionSyncVers", msdV);
            }
        }
    }

    private static boolean prog(String msd, String sid, int mid) {
        if (msd.length() > 3) {
            for (int i = 0; i < JRMCoreM.getSydaAmount(msd); ++i) {
                String s = JRMCoreM.getMda_Series(msd, i);
                int m = JRMCoreM.getMda_Mission(msd, i);
                if (!s.equals(sid) || mid != m) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean prog(EntityPlayer en, String sid, int mid) {
        NBTTagCompound nbt = JRMCoreH.nbt((Entity)en, "pres");
        String msd = nbt.getString("JRMCmissionSync");
        if (msd.length() > 3) {
            for (int i = 0; i < JRMCoreM.getSydaAmount(msd); ++i) {
                String s = JRMCoreM.getMda_Series(msd, i);
                int m = JRMCoreM.getMda_Mission(msd, i);
                if (!s.equals(sid) || mid != m) continue;
                return true;
            }
        }
        return false;
    }

    public static void prog(EntityPlayer Player, JRMCoreMsnBundle M, JRMCoreMsn msn, String str, List<JRMCoreMsn> msnl, String sid, int pw, int rc, int cl) {
        MinecraftServer server1 = FMLCommonHandler.instance().getMinecraftServerInstance();
        int gid = JRMCoreH.getInt(Player, "JRMCGID");
        if (gid != 0 && server1.getConfigurationManager().playerEntityList != null && server1.getConfigurationManager().playerEntityList.size() > 0) {
            for (Object n : server1.getConfigurationManager().playerEntityList) {
                NBTTagCompound nbt;
                String msd;
                int egid;
                EntityPlayer en = (EntityPlayer)n;
                if (en == Player || (egid = JRMCoreH.getInt(en, "JRMCGID")) != gid || !JRMCoreM.prog(msd = (nbt = JRMCoreH.nbt((Entity)en, "pres")).getString("JRMCmissionSync"), sid, msn.getId())) continue;
                msd = JRMCoreM.setToNextMsn(msd, str, msnl, sid, pw, rc, cl);
                nbt.setString("JRMCmissionSync", msd);
                PD.sendTo(new JRMCorePData2(sid + ";" + M.getName() + ";" + M.getDesc() + ";" + M.getAuthor() + ";" + M.getVersion() + ";" + M.getMods() + ";" + M.settings.repeat + ";" + M.settings.unlock, new Gson().toJson((Object)msn, JSN_TYPE_MSN)), (EntityPlayerMP)en);
            }
        }
    }

    public static ArrayList<EntityPlayer> prog(EntityPlayer m, boolean b) {
        MinecraftServer server1 = FMLCommonHandler.instance().getMinecraftServerInstance();
        ArrayList<EntityPlayer> ns = new ArrayList<EntityPlayer>();
        int gid = JRMCoreH.getInt(m, "JRMCGID");
        if (gid != 0 && server1.getConfigurationManager().playerEntityList != null && server1.getConfigurationManager().playerEntityList.size() > 0) {
            for (Object n : server1.getConfigurationManager().playerEntityList) {
                EntityPlayer en = (EntityPlayer)n;
                int egid = JRMCoreH.getInt(en, "JRMCGID");
                if (egid != gid || !b && en == m) continue;
                ns.add(en);
            }
            return ns;
        }
        if (b) {
            ns.add(m);
        }
        return ns;
    }

    public static ArrayList<EntityPlayer> prog(EntityPlayer k, boolean b, String sid, int mid) {
        MinecraftServer server1 = FMLCommonHandler.instance().getMinecraftServerInstance();
        ArrayList<EntityPlayer> ns = new ArrayList<EntityPlayer>();
        int gid = JRMCoreH.getInt(k, "JRMCGID");
        if (gid != 0 && server1.getConfigurationManager().playerEntityList != null && server1.getConfigurationManager().playerEntityList.size() > 0) {
            for (Object n : server1.getConfigurationManager().playerEntityList) {
                EntityPlayer en = (EntityPlayer)n;
                int egid = JRMCoreH.getInt(en, "JRMCGID");
                if (egid != gid || !b && en == k || !JRMCoreM.prog(en, sid, mid)) continue;
                ns.add(en);
            }
            return ns;
        }
        if (b) {
            ns.add(k);
        }
        return ns;
    }

    public static void prog(EntityPlayer p, String sid, int mid, int sz, int dc, String ds) {
        for (EntityPlayer en : JRMCoreM.prog(p, false)) {
            NBTTagCompound nbt = JRMCoreH.nbt((Entity)en, "pres");
            String msd = nbt.getString("JRMCmissionSync");
            if (!JRMCoreM.prog(msd, sid, mid)) continue;
            msd = JRMCoreM.setSyda(msd, sid, mid, sz, dc, ds);
            nbt.setString("JRMCmissionSync", msd);
        }
    }

    public static String setToNextMsn(String msd, String str, List<JRMCoreMsn> msnl, String sid, int pw, int rc, int cl) {
        int nID = Integer.parseInt(str);
        boolean available = false;
        for (int n = 0; n < msnl.size(); ++n) {
            JRMCoreMsn msn2 = msnl.get(n);
            if (msn2.getId() != nID) continue;
            available = true;
            break;
        }
        if (!available) {
            nID = 0;
        }
        String[] ar = new String[]{MISSION_CONDS_TYPE};
        for (int j1 = 0; j1 < msnl.size(); ++j1) {
            JRMCoreMsn msn2 = msnl.get(j1);
            if (msn2.getId() != nID) continue;
            ArrayList<String> o2 = msn2.getObjectives(pw, rc, cl);
            int size2 = o2.size();
            ar = new String[size2];
            for (int i = 0; i < ar.length; ++i) {
                ar[i] = MISSION_CONDS_TYPE;
            }
        }
        return JRMCoreM.setSyda(msd, sid, nID, ar);
    }

    public static String getSydaV(String[] s, int i) {
        return s.length > 3 ? s[i] : MISSION_CONDS_TYPE;
    }

    public static boolean resetMsnBndl(boolean hasSyda, boolean reset, JRMCoreMsn msn, int msnToSendID, int pw, int rc, int cl, String msd, String msdV, String msdO, String msdVO, String seriesID, NBTTagCompound nbt, JRMCoreMsnBundle M, EntityPlayer p) {
        if (hasSyda && reset && msn.getId() == msnToSendID) {
            ArrayList<String> o = msn.getObjectives(pw, rc, cl);
            int size = o.size();
            String[] ar = new String[]{MISSION_CONDS_TYPE};
            ar = new String[size];
            for (int i = 0; i < size; ++i) {
                ar[i] = MISSION_CONDS_TYPE;
            }
            msd = JRMCoreM.setSyda(msd, seriesID, msnToSendID, ar);
            String[] sydaV = JRMCoreM.getMda(msdV, seriesID);
            msdV = JRMCoreM.setSydaV(msdV, seriesID, M.getVersion(), MISSION_CONDS_TYPE, JRMCoreM.getSydaV(sydaV, 3), MISSION_CONDS_TYPE);
            if (!msd.equals(msdO)) {
                nbt.setString("JRMCmissionSync", msd);
            }
            if (!msdV.equals(msdVO)) {
                nbt.setString("JRMCmissionSyncVers", msdV);
            }
            PD.sendTo(new JRMCorePData2(seriesID + ";" + M.getName() + ";" + M.getDesc() + ";" + M.getAuthor() + ";" + M.getVersion() + ";" + M.getMods() + ";" + M.settings.repeat + ";" + M.settings.unlock, new Gson().toJson((Object)msn, JSN_TYPE_MSN)), (EntityPlayerMP)p);
            return true;
        }
        return false;
    }
}

