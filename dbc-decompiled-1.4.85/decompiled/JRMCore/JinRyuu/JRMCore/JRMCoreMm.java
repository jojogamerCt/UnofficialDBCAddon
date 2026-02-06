/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreMsn;
import JinRyuu.JRMCore.JRMCoreMsnBundle;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashMap;

public class JRMCoreMm {
    public static final int MISSION_TP_REWARD_ID_MULTI = 15;
    public static final int MISSION_TP_REWARD_LEVEL_MULTI = 10;
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
    public static final String MISSION_TalkTo_Series = "series";
    public static final String MISSION_TalkTo_translated = "translated";
    public static final String MISSION_CONDS_Transformations = "T";
    public static final String MISSION_CONDS_MsgSpawnSnd = "O";
    public static final String MISSION_CONDS_MsgDeathSnd = "U";
    public static final int MISSION_INFO_SeID = 0;
    public static final int MISSION_INFO_Name = 1;
    public static final int MISSION_INFO_Desc = 2;
    public static final int MISSION_INFO_Auth = 3;
    public static final int MISSION_INFO_Vers = 4;
    public static final int MISSION_INFO_Mods = 5;
    public static final int MISSION_INFO_Rept = 6;
    public static final int MISSION_INFO_Unlo = 7;
    public static final String MISSION_PROP_Default = "default";
    public static final String MISSION_PROP_RandomReward = "randrew";
    public static final String SERIES_DBC_MainID = "mainDBC";
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
    public static final String REWARD_TYPE_NOTHING = "nothing";
    public static final String REWARD_TYPE_Item = "item";
    public static final String REWARD_TYPE_TP = "tp";
    public static final String REWARD_TYPE_Alignment = "align";
    public static final String REWARD_TYPE_Command = "com";
    public static final String REWARD_TYPE_TP_FIX = "fix";
    public static final String REWARD_TYPE_TP_ALIGN = "align";
    public static final String REWARD_TYPE_TP_LVL = "lvl";
    public static final String REWARD_TYPE_TP_LVLALIGN = "lvlalign";
    static final float POWER_MULTI = 1.5f;
    static int allMsn = 0;
    static HashMap<Integer, ArrayList<String>> DBCmainSagaObjs;
    static HashMap<Integer, ArrayList<String>> DBCmainSagaRwrds;
    static HashMap<Integer, ArrayList<String>> DBCmainSagaObjs1;
    static HashMap<Integer, ArrayList<String>> DBCmainSagaRwrds1;
    static HashMap<Integer, ArrayList<String>> DBCmainSagaObjs2;
    static HashMap<Integer, ArrayList<String>> DBCmainSagaRwrds2;
    static int allMissionsDBSBroly;
    static HashMap<Integer, ArrayList<String>> DBCDBSBrolyObjs;
    static HashMap<Integer, ArrayList<String>> DBCDBSBrolyRwrds;
    static HashMap<Integer, ArrayList<String>> DBCDBSBrolyObjs1;
    static HashMap<Integer, ArrayList<String>> DBCDBSBrolyRwrds1;
    static HashMap<Integer, ArrayList<String>> DBCDBSBrolyObjs2;
    static HashMap<Integer, ArrayList<String>> DBCDBSBrolyRwrds2;
    static int allMsnNC;
    static HashMap<Integer, ArrayList<String>> NCmainSagaObjs;
    static HashMap<Integer, ArrayList<String>> NCmainSagaRwrds;
    static HashMap<Integer, String> NCmainSagaProps;
    static HashMap<Integer, String> NCmainSagaArcs;
    static HashMap<Integer, ArrayList<String>> NCmainSagaObjs1;
    static HashMap<Integer, ArrayList<String>> NCmainSagaRwrds1;
    static HashMap<Integer, ArrayList<String>> NCmainSagaObjs2;
    static HashMap<Integer, ArrayList<String>> NCmainSagaRwrds2;
    static final int DB_END = 47;

    public static ArrayList<String> missionReset() {
        return Lists.newArrayList();
    }

    public static void missionRestart(ArrayList<String> l) {
        l.add(MISSION_TYPE_ClickRestart);
    }

    public static void missionClickNext(ArrayList<String> l) {
        l.add(MISSION_TYPE_ClickNext);
    }

    public static void missionClickStart(ArrayList<String> l) {
        l.add(MISSION_TYPE_ClickStart);
    }

    public static void missionKill(ArrayList<String> l, String enemy, float damage, float health, String startLine, String endLine) {
        l.add("kill;N" + enemy + ";" + MISSION_CONDS_Health + (int)health + ";" + MISSION_CONDS_Attack + (int)damage + ";" + MISSION_CONDS_MsgSpawn + startLine + ";" + MISSION_CONDS_MsgDeath + endLine);
    }

    public static void missionKillMoreOfSame(ArrayList<String> l, String enemy, int count, float damage, float health) {
        l.add("killsame;N" + enemy + ";" + MISSION_CONDS_Amount + count + ";" + MISSION_CONDS_Health + (int)damage + ";" + MISSION_CONDS_Attack + (int)health);
    }

    public static int missionRewardNothingRestart(ArrayList<String> l, int i) {
        l.add("nothing;jinryuujrmcore.Restart;" + ++i);
        return i;
    }

    public static int missionRewardNothingSkip(ArrayList<String> l, int i) {
        l.add("nothing;jinryuujrmcore.Skip;" + ++i);
        return i;
    }

    public static int missionRewardNothing(ArrayList<String> l, int i) {
        l.add("nothing;jinryuujrmcore.Next;" + ++i);
        return i;
    }

    public static int missionRewardTPLevelAligned(ArrayList<String> l, int i) {
        return JRMCoreMm.missionRewardTPLevelAligned2(l, i, 10.0);
    }

    public static int missionRewardTPLevelAligned2(ArrayList<String> l, int i, double multi) {
        l.add("tp!lvlalign!" + multi + "||" + "align" + "!+10;jinryuujrmcore.missionSys.Protect;" + (i + 1));
        l.add("tp!lvlalign!" + multi + "||" + "align" + "!0;jinryuujrmcore.missionSys.Myself;" + (i + 1));
        l.add("tp!lvlalign!" + multi + "||" + "align" + "!-10;jinryuujrmcore.missionSys.Evil;" + (i + 1));
        return i + 1;
    }

    public static int missionRewardTP(ArrayList<String> l, int i) {
        return JRMCoreMm.missionRewardTP2(l, i, 15);
    }

    public static int missionRewardTP2(ArrayList<String> l, int i, int multi) {
        l.add("tp!fix!" + multi * i + "||" + "align" + "!+10;jinryuujrmcore.missionSys.Protect;" + (i + 1));
        l.add("tp!fix!" + multi * i + "||" + "align" + "!0;jinryuujrmcore.missionSys.Myself;" + (i + 1));
        l.add("tp!fix!" + multi * i + "||" + "align" + "!-10;jinryuujrmcore.missionSys.Evil;" + (i + 1));
        return i + 1;
    }

    public static int missionRewardTP(ArrayList<String> l, int i, int tpReward) {
        l.add("tp!fix!" + tpReward + "||" + "align" + "!+10;jinryuujrmcore.missionSys.Protect;" + (i + 1));
        l.add("tp!fix!" + tpReward + "||" + "align" + "!0;jinryuujrmcore.missionSys.Myself;" + (i + 1));
        l.add("tp!fix!" + tpReward + "||" + "align" + "!-10;jinryuujrmcore.missionSys.Evil;" + (i + 1));
        return i + 1;
    }

    public static int missionRewardItem(ArrayList<String> l, int i, String item, int itemCount) {
        return JRMCoreMm.missionRewardItem(l, i, item, itemCount, 15);
    }

    public static int missionRewardItem(ArrayList<String> l, int i, String item, int itemCount, int multi) {
        l.add("item!" + item + "," + itemCount + "||" + REWARD_TYPE_TP + "!" + REWARD_TYPE_TP_FIX + "!" + multi * i + "||" + "align" + "!+10;jinryuujrmcore.missionSys.Protect;" + (i + 1));
        l.add("item!" + item + "," + itemCount + "||" + REWARD_TYPE_TP + "!" + REWARD_TYPE_TP_FIX + "!" + multi * i + "||" + "align" + "!0;jinryuujrmcore.missionSys.Myself;" + (i + 1));
        l.add("item!" + item + "," + itemCount + "||" + REWARD_TYPE_TP + "!" + REWARD_TYPE_TP_FIX + "!" + multi * i + "||" + "align" + "!-10;jinryuujrmcore.missionSys.Evil;" + (i + 1));
        return i + 1;
    }

    public static int missionRewardItems(ArrayList<String> l, int i, String[] items, int[] itemCounts) {
        return JRMCoreMm.missionRewardItems(l, i, items, itemCounts, 15);
    }

    public static int missionRewardItems(ArrayList<String> l, int i, String[] items, int[] itemCounts, int multi) {
        String result = "";
        int id = 0;
        for (String item : items) {
            result = result + "item!" + item + "," + itemCounts[id] + "||";
            ++id;
        }
        l.add(result + REWARD_TYPE_TP + "!" + REWARD_TYPE_TP_FIX + "!" + 10 * i + "||" + "align" + "!+10;jinryuujrmcore.missionSys.Protect;" + (i + 1));
        l.add(result + REWARD_TYPE_TP + "!" + REWARD_TYPE_TP_FIX + "!" + 10 * i + "||" + "align" + "!0;jinryuujrmcore.missionSys.Myself;" + (i + 1));
        l.add(result + REWARD_TYPE_TP + "!" + REWARD_TYPE_TP_FIX + "!" + 10 * i + "||" + "align" + "!-10;jinryuujrmcore.missionSys.Evil;" + (i + 1));
        return i + 1;
    }

    public static int missionRewardItem(ArrayList<String> l, int i, String itemGood, String itemNeutral, String itemEvil, int itemCount) {
        return JRMCoreMm.missionRewardItem(l, i, itemGood, itemNeutral, itemEvil, itemCount, 15);
    }

    public static int missionRewardItem(ArrayList<String> l, int i, String itemGood, String itemNeutral, String itemEvil, int itemCount, int multi) {
        l.add("item!" + itemGood + "," + itemCount + "||" + REWARD_TYPE_TP + "!" + REWARD_TYPE_TP_FIX + "!" + multi * i + "||" + "align" + "!+10;jinryuujrmcore.missionSys.Protect;" + (i + 1));
        l.add("item!" + itemNeutral + "," + itemCount + "||" + REWARD_TYPE_TP + "!" + REWARD_TYPE_TP_FIX + "!" + multi * i + "||" + "align" + "!0;jinryuujrmcore.missionSys.Myself;" + (i + 1));
        l.add("item!" + itemEvil + "," + itemCount + "||" + REWARD_TYPE_TP + "!" + REWARD_TYPE_TP_FIX + "!" + multi * i + "||" + "align" + "!-10;jinryuujrmcore.missionSys.Evil;" + (i + 1));
        return i + 1;
    }

    public static void missionGoToDimension(ArrayList<String> l, String dimension) {
        l.add("dim;N" + dimension);
    }

    public static void missionBeInDimension(ArrayList<String> l, String dimension) {
        l.add("dim2;N" + dimension);
    }

    public static void missionBeInBiome(ArrayList<String> l, String biome) {
        l.add("biome2;N" + biome);
    }

    public static void missionGatherItem(ArrayList<String> l, String item, int count) {
        l.add("item;N" + item + ";" + MISSION_CONDS_Amount + count);
    }

    public static void missionTalkTo(ArrayList<String> l, String master, String text, String text2) {
        l.add("talk;N" + master + ";" + MISSION_CONDS_Message + text + ";" + MISSION_CONDS_MsgBtn + text2);
    }

    public static void init() {
        DBCmainSagaObjs = new HashMap();
        DBCmainSagaRwrds = new HashMap();
        DBCmainSagaObjs1 = new HashMap();
        DBCmainSagaRwrds1 = new HashMap();
        DBCmainSagaObjs2 = new HashMap();
        DBCmainSagaRwrds2 = new HashMap();
        ArrayList<String> l = Lists.newArrayList();
        int i = 0;
        JRMCoreMm.missionClickNext(l);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        JRMCoreMm.missionTalkTo(l, "jinryuudragonblockc.roshi", "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:KintounItem", "jinryuudragonblockc:KintounItem", "jinryuudragonblockc:KintounBlackItem", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Yamcha", 45.0f, 150.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBMai", 15.0f, 45.0f, "dbc.sagasdb." + i + ".3", "dbc.sagasdb." + i + ".d3");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBShu", 7.5f, 45.0f, "dbc.sagasdb." + i + ".2", "dbc.sagasdb." + i + ".d2");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBPilaf", 7.5f, 30.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBMaiMecha", 45.0f, 165.0f, "dbc.sagasdb." + i + ".3", "dbc.sagasdb." + i + ".d3");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBShuMecha", 45.0f, 150.0f, "dbc.sagasdb." + i + ".2", "dbc.sagasdb." + i + ".d2");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBPilafMecha", 30.0f, 120.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBPilafMechaCombined", 60.0f, 225.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardItems(l, i, new String[]{"jinryuudragonblockc:ItemDragonBlock", "jinryuudragonblockc:GiFighterTorso1", "jinryuudragonblockc:GiFighterLeg1", "jinryuudragonblockc:GiFighterBoots1"}, new int[]{1, 1, 1, 1});
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Bacterian", 22.5f, 150.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Yamcha2", 75.0f, 255.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.JackieChun", 105.0f, 270.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.JackieChun2", 135.0f, 300.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.ColonelSilver", 45.0f, 225.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.MajorMetallitron", 75.0f, 300.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.NinjaMurasaki", 45.0f, 300.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemKatana", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Android8", 75.0f, 300.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Buyon", 135.0f, 450.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.GeneralWhite", 45.0f, 300.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemDragonBlock", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.GeneralBlue", 165.0f, 525.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.MercenaryTao", 225.0f, 675.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        int count = 2;
        JRMCoreMm.missionKillMoreOfSame(l, "jinryuudragonblockc.RedRibbonSoldier", 2, 22.5f, 120.0f);
        JRMCoreMm.missionKillMoreOfSame(l, "jinryuudragonblockc.RedRibbonSoldier2", 2, 30.0f, 120.0f);
        JRMCoreMm.missionKillMoreOfSame(l, "jinryuudragonblockc.RedRibbonSoldier3", 2, 60.0f, 120.0f);
        JRMCoreMm.missionKillMoreOfSame(l, "jinryuudragonblockc.RedRibbonSoldierB", 2, 22.5f, 120.0f);
        JRMCoreMm.missionKillMoreOfSame(l, "jinryuudragonblockc.RedRibbonSoldierB2", 2, 30.0f, 120.0f);
        JRMCoreMm.missionKillMoreOfSame(l, "jinryuudragonblockc.RedRibbonSoldierB3", 2, 60.0f, 120.0f);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.OfficerBlack3", 255.0f, 720.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemDragonBlock", 2);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.FangsTheVampire", 165.0f, 525.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.SeeThroughTheInvisibleMan", 165.0f, 525.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.BandagesTheMummy", 225.0f, 675.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.SpikeTheDevil", 255.0f, 720.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.GrandpaGohan2", 270.0f, 825.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemPP", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Yamcha3", 255.0f, 525.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Chiaotzu", 75.0f, 225.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Krillin", 300.0f, 675.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.TienShinhan", 375.0f, 1050.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Tambourine", 420.0f, 1110.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Cymbal", 120.0f, 450.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Tambourine", 435.0f, 1170.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemDragonBlock", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.KingPiccolo", 450.0f, 1260.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Drum", 405.0f, 1200.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.KingPiccolo2", 495.0f, 1500.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemDragonBlock", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        JRMCoreMm.missionTalkTo(l, "jinryuudragonblockc.kami", "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.MercenaryTao2", 420.0f, 1125.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.TienShinhan3", 525.0f, 1800.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Piccolo", 600.0f, 2250.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Piccolo2", 750.0f, 2400.0f, "dbc.sagasdb." + i + ".1", "dbc.sagasdb." + i + ".d");
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        DBCmainSagaObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("killsame;Njinryuudragonblockc.Saibaiman;M6;H1500;A300");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Raditz;H3000;A900;Sdbc.itemSaiySagaRad.line1;Ddbc.itemSaiySagaRad.d.line1");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("biome2;NDirty Stony");
        l.add("item;Njinryuudragonblockc:ItemDinoMeatCooked;M10");
        l.add("killsame;Njinryuudragonblockc.Saibaiman;M12;H1500;A300");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("biome2;NDirty Stony");
        l.add("kill;Njinryuudragonblockc.Nappa;H3750;A975;Sdbc.itemSaiySagaVeg.line1;Ddbc.itemSaiySagaVeg.d.line2");
        l.add("kill;Njinryuudragonblockc.Vegeta;H4500;A1050;Sdbc.itemSaiySagaVeg.line2;Ddbc.itemSaiySagaVeg.d.line1");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:SpacePod01Item", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim;NNamek");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNamek");
        l.add("killsame;Njinryuudragonblockc.FreezaSoldier1;M3;H2250;A450");
        l.add("killsame;Njinryuudragonblockc.FreezaSoldier2;M3;H2250;A450");
        l.add("killsame;Njinryuudragonblockc.FreezaSoldier3;M3;H2250;A450");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNamek");
        l.add("kill;Njinryuudragonblockc.Kiwi;H4800;A1095");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNamek");
        l.add("kill;Njinryuudragonblockc.Dodoria;H5250;A1125");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemNamekDragonBlock", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNamek");
        l.add("kill;Njinryuudragonblockc.Zarbon;H5700;A1200");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemDragonRadar", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNamek");
        l.add("kill;Njinryuudragonblockc.Guldo;H2250;A900;Sdbc.itemFreeSagaGin.4.line1");
        l.add("kill;Njinryuudragonblockc.Recoome;H7200;A1500;Sdbc.itemFreeSagaGin.1.line1;Ddbc.itemFreeSagaGin.d.1.line1");
        l.add("kill;Njinryuudragonblockc.Barta;H6300;A1275;Sdbc.itemFreeSagaGin.2.line1");
        l.add("kill;Njinryuudragonblockc.Jeice;H6300;A1350;Sdbc.itemFreeSagaGin.3.line1");
        l.add("kill;Njinryuudragonblockc.Ginyu;H7800;A1800;Sdbc.itemFreeSagaGin.5.line1;Ddbc.itemFreeSagaGin.d.5.line1");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemNamekDragonBlock", 2);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNamek");
        l.add("kill;Njinryuudragonblockc.Freeza1;H9000;A2250;Tjinryuudragonblockc.Freeza2|300|1.1||jinryuudragonblockc.Freeza3|300|1.1||jinryuudragonblockc.Freeza4|300|1.1||jinryuudragonblockc.Freeza5|300|1.1||jinryuudragonblockc.Freeza6|600|1.2");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemNamekDragonBlock", 2);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim;NOverworld");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("biome;NPlains");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("killsame;Njinryuudragonblockc.FreezaSoldier1;M3;H2700;A525");
        l.add("killsame;Njinryuudragonblockc.FreezaSoldier2;M3;H2700;A525");
        l.add("killsame;Njinryuudragonblockc.FreezaSoldier3;M3;H2700;A525");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.MechaFreeza;H15000;A4500");
        l.add("kill;Njinryuudragonblockc.KingCold;H12000;A3000");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickSkip);
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothingSkip(l, i);
        DBCmainSagaRwrds.put(i, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickNext);
        l.add("state;NSS");
        DBCmainSagaObjs1.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds1.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickNext);
        l.add("talk;Njinryuudragonblockc.kami;Gdbc.MainSaga.17.m;Bdbc.MainSaga.17.b");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("biome;NDirty Stony");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Cyborg19;H18000;A4950");
        l.add("kill;Njinryuudragonblockc.Cyborg20;H19500;A5250");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim;NTimeChamber");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("biome;NPlains");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Cyborg18;H21750;A5700");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Cell1;H24000;A6300;Tjinryuudragonblockc.Cell2|400|1.1");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("biome;NDirty Stony");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Cyborg16;H27000;A6900");
        l.add("kill;Njinryuudragonblockc.Cyborg17;H25500;A6450");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Cell2;H27000;A7200;Tjinryuudragonblockc.Cell3|300|1.1");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickSkip);
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothingSkip(l, i);
        DBCmainSagaRwrds.put(i, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickNext);
        l.add("state;NSS2");
        DBCmainSagaObjs1.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds1.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("biome;NPlains");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("killsame;Njinryuudragonblockc.CellJr;M7;H10500;A2250;");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Cell3;H33000;A7350;Tjinryuudragonblockc.Cell4|400|1.2");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickNext);
        l.add("talk;Njinryuudragonblockc.masterbabidi;Gdbc.MainSaga." + (i - 47) + ".m;" + MISSION_CONDS_MsgBtn + "dbc.MainSaga." + (i - 47) + ".b");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Puipui;H22500;A1500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Yakon;H27000;A4500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Darbura;H27000;A5250;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardItem(l, i, "jinryuudragonblockc:ItemEvilSpear", 1);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.BuuFat;H39000;A7500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickSkip);
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothingSkip(l, i);
        DBCmainSagaRwrds.put(i, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("state;NSS3");
        DBCmainSagaObjs1.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds1.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.BuuFat;H48000;A7950;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("biome;NPlains");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.BuuSuper;H51000;A8250;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.BuuFusion;H57000;A9000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.BuuPiccolo;H52500;A8250;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.BuuUltimate;H63000;A9750;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.BuuKid;H67500;A11250;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("biome;NPlains");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("biome;NPlains");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Beerus;H75000;A12000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickSkip);
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothingSkip(l, i);
        DBCmainSagaRwrds.put(i, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("state;NSSGod");
        DBCmainSagaObjs1.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds1.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Beerus;H78000;A12450;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Whis;H82500;A12750;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("killsame;Njinryuudragonblockc.FreezaSoldier1;M10;H7500;A2700");
        l.add("killsame;Njinryuudragonblockc.FreezaSoldier2;M10;H7500;A2700");
        l.add("killsame;Njinryuudragonblockc.FreezaSoldier3;M10;H7500;A2700");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Shisami;H18000;A4500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Tagoma;H45000;A9000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Freeza6;H87000;A13500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickSkip);
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothingSkip(l, i);
        DBCmainSagaRwrds.put(i, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("state;NSSB");
        DBCmainSagaObjs1.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds1.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.FreezaGolden;H93000;A14250;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("biome;NPlains");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Botamo;H33000;A1500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Frost1;H30000;A7500;Tjinryuudragonblockc.Frost3|150|1.1||jinryuudragonblockc.Frost4|150|1.1");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Magetta;H97500;A13500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Cabba;H30000;A9000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.CabbaSSJ;H42000;A10500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Hit;H105000;A14250;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("biome;NPlains");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.BeerusMonaka;H112500;A14700;Tjinryuudragonblockc.BeerusMonaka2|3000|1.2||jinryuudragonblockc.BeerusMonaka3|3000|1.2");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.VegetaCopy;H115500;A15000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.VegetaCopyBlue;H120000;A18000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("biome;NPlains");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.GokuBlack;H121500;A18750;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Zamasu;H45000;A6750;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.GokuBlack;H123000;A19200;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.GokuBlackRose;H126000;A19500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Zamasu;H45000;A6750;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        l.add("kill;Njinryuudragonblockc.GokuBlackRose;H126000;A19500;Sdbc.MainSaga." + (i - 47) + ".2;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".2d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Zamasu_fused;H129000;A22500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Zamasu_fused2;H130500;A23250;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Zamasu_fused3;H132000;A24000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Hit;H105000;A25500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Basil;H97500;A21000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Lavender;H99000;A22500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Bergamo;H112500;A27000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Toppo;H135000;A30000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Gohan_enemy2_1;H120000;A33000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NOverworld");
        l.add("kill;Njinryuudragonblockc.Krillin;H67500;A24000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Basil;H97500;A21000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        l.add("kill;Njinryuudragonblockc.Lavender;H99000;A22500;Sdbc.MainSaga." + (i - 47) + ".2;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".2d");
        l.add("kill;Njinryuudragonblockc.Bergamo;H112500;A27000;Sdbc.MainSaga." + (i - 47) + ".3;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".3d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Caulifla;H117000;A27750;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        l.add("kill;Njinryuudragonblockc.Kale;H97500;A25500;Sdbc.MainSaga." + (i - 47) + ".2;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".2d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Caulifla2;H127500;A36000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Kale2;H142500;A45000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Brianne;H97500;A30000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Dyspo;H165000;A48000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Toppo;H210000;A51000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Jiren;H240000;A54000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Kefla;H270000;A57000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Kefla2;H330000;A60000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Toppo2;H360000;A64500;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Jiren;H405000;A69000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        l.add("kill;Njinryuudragonblockc.Jiren2;H480000;A75000;Sdbc.MainSaga." + (i - 47) + ".1;" + MISSION_CONDS_MsgDeath + "dbc.MainSaga." + (i - 47) + ".d");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardTP(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickStart);
        l.add("dim2;NNull Realm");
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        l.add(MISSION_TYPE_ClickRestart);
        DBCmainSagaObjs.put(i, l);
        l = Lists.newArrayList();
        JRMCoreMm.missionRewardNothingRestart(l, i);
        DBCmainSagaRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        allMsn = i + 1;
    }

    public static void initDBCDBSBroly() {
        DBCDBSBrolyObjs = new HashMap();
        DBCDBSBrolyRwrds = new HashMap();
        DBCDBSBrolyObjs1 = new HashMap();
        DBCDBSBrolyRwrds1 = new HashMap();
        DBCDBSBrolyObjs2 = new HashMap();
        DBCDBSBrolyRwrds2 = new HashMap();
        ArrayList<String> l = Lists.newArrayList();
        int i = 0;
        JRMCoreMm.missionClickNext(l);
        DBCDBSBrolyObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCDBSBrolyRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Vegeta_enemy", 28500.0f, 285000.0f, "dbc.sagadbsbroly." + i + ".1", "dbc.sagadbsbroly." + i + ".d");
        DBCDBSBrolyObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTPLevelAligned(l, i);
        DBCDBSBrolyRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.Goku_enemy", 30000.0f, 300000.0f, "dbc.sagadbsbroly." + i + ".1", "dbc.sagadbsbroly." + i + ".d");
        DBCDBSBrolyObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTPLevelAligned(l, i);
        DBCDBSBrolyRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBSBroly4", 15000.0f, 225000.0f, "dbc.sagadbsbroly." + i + ".1", "dbc.sagadbsbroly." + i + ".d");
        DBCDBSBrolyObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTPLevelAligned(l, i);
        DBCDBSBrolyRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBSBrolyBuff", 45000.0f, 375000.0f, "dbc.sagadbsbroly." + i + ".1", "dbc.sagadbsbroly." + i + ".d");
        DBCDBSBrolyObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTPLevelAligned(l, i);
        DBCDBSBrolyRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBSBrolyBuffSSJ", 90000.0f, 825000.0f, "dbc.sagadbsbroly." + i + ".1", "dbc.sagadbsbroly." + i + ".d");
        DBCDBSBrolyObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTPLevelAligned(l, i);
        DBCDBSBrolyRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickStart(l);
        JRMCoreMm.missionBeInDimension(l, "Overworld");
        JRMCoreMm.missionKill(l, "jinryuudragonblockc.DBSBrolyLegendary", 105000.0f, 975000.0f, "dbc.sagadbsbroly." + i + ".1", "dbc.sagadbsbroly." + i + ".d");
        DBCDBSBrolyObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardTPLevelAligned(l, i);
        DBCDBSBrolyRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionClickNext(l);
        DBCDBSBrolyObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothing(l, i);
        DBCDBSBrolyRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRestart(l);
        DBCDBSBrolyObjs.put(i, l);
        l = JRMCoreMm.missionReset();
        JRMCoreMm.missionRewardNothingRestart(l, i);
        DBCDBSBrolyRwrds.put(i++, l);
        l = JRMCoreMm.missionReset();
        allMissionsDBSBroly = i + 1;
    }

    public static void initNC() {
        NCmainSagaObjs = new HashMap();
        NCmainSagaRwrds = new HashMap();
        NCmainSagaProps = new HashMap();
        NCmainSagaArcs = new HashMap();
        NCmainSagaObjs1 = new HashMap();
        NCmainSagaRwrds1 = new HashMap();
        NCmainSagaObjs2 = new HashMap();
        NCmainSagaRwrds2 = new HashMap();
        String arc = "nc.sagasystem.about";
        int id = 0;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart);
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.Next", id + 1, JRMCoreMm.r(REWARD_TYPE_NOTHING)));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        arc = "nc.sagasystem.prologue";
        id = 1;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilIruka", "H400", "A100"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 2;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NRoofed Forest"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilMizuki1", "H600", "A120"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 3;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickNext);
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.Next", id + 1, JRMCoreMm.r("item", JRMCoreH.tjnc + ":ItemScrollOfSeals,1")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 4;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickNext);
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.Next", id + 1, JRMCoreMm.r(REWARD_TYPE_NOTHING)));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 5;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_KillMoreOfSamekind, "NOzelot", "M6", "H100", "A20"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 6;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickNext, JRMCoreMm.obj("item", "Nwheat_seeds", "M48"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 7;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickNext, JRMCoreMm.obj("item", "Nyellow_flower", "M10"), JRMCoreMm.obj("item", "Nred_flower", "M12"), JRMCoreMm.obj("item", "Nred_flower::1", "M4"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 8;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NRoofed Forest"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.Next", id + 1, JRMCoreMm.r(REWARD_TYPE_NOTHING)));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 9;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NRoofed Forest"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilZabuza1", "H1200", "A240"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilHaku1", "H1000", "A200"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 10;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NRoofed Forest"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilZabuza2", "H1600", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 11;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickNext);
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.Next", id + 1, JRMCoreMm.r(REWARD_TYPE_NOTHING)));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        arc = "nc.sagasystem.chuuninexams";
        id = 12;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickNext);
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.Next", id + 1, JRMCoreMm.r(REWARD_TYPE_NOTHING)));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 13;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NNinja Forest"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilShiroe", "H1800", "A320"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 14;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickNext, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.Continue", 14, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 15, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 16, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 17, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 18, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 19, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 20, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 21, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 22, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 23, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 24, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 25, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 26, JRMCoreMm.r(REWARD_TYPE_NOTHING)), JRMCoreMm.rew("emty", 27, JRMCoreMm.r(REWARD_TYPE_NOTHING)));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_RandomReward);
        id = 15;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilSasuke1", "H2400", "A350"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 16;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilSakura1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 17;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilIno1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 18;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilShika1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 19;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilChoji1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 20;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilHinata1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 21;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilKiba1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 22;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilShino1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 23;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilNeji1", "H2500", "A360"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 24;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilTenten1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 25;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilLee1", "H2500", "A360"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 26;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilTemari1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 27;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilKankuro1", "H2000", "A300"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", 28, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 28;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickNext, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.Next", id + 1, JRMCoreMm.r(REWARD_TYPE_NOTHING)));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 29;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilNaruto1", "H2200", "A280"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 30;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilNaruto2", "H3000", "A400"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 31;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilGaara1", "H3000", "A500"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 32;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickStart, JRMCoreMm.obj(MISSION_TYPE_BeInBiome, "NPlains"), JRMCoreMm.obj(MISSION_TYPE_Kill, "Njinryuunarutoc.EntityNCEvilShukaku", "H5000", "A1000"));
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Protect", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "+10")), JRMCoreMm.rew("jinryuujrmcore.missionSys.Myself", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", MISSION_CONDS_TYPE)), JRMCoreMm.rew("jinryuujrmcore.missionSys.Evil", id + 1, JRMCoreMm.r(REWARD_TYPE_TP, REWARD_TYPE_TP_FIX, "" + 10 * id), JRMCoreMm.r("align", "-10")));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        id = 33;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickNext);
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.Next", id + 1, JRMCoreMm.r(REWARD_TYPE_NOTHING)));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        arc = "nc.sagasystem.credits";
        id = 34;
        JRMCoreMm.objs(id, MISSION_TYPE_ClickRestart);
        JRMCoreMm.rews(id, JRMCoreMm.rew("jinryuujrmcore.missionSys.Next", id + 1, JRMCoreMm.r(REWARD_TYPE_NOTHING)));
        JRMCoreMm.othrs(id, arc, MISSION_PROP_Default);
        allMsnNC = id + 1;
    }

    public static String obj(String ... arg) {
        int m;
        int k = 4;
        int n = m = 6;
        m = k;
        k = n + m - k;
        String s = "";
        for (int i = 0; i < arg.length; ++i) {
            s = s + ";" + arg[i];
        }
        return s.substring(1);
    }

    public static void objs(int id, String ... o) {
        ArrayList l = Lists.newArrayList();
        for (int i = 0; i < o.length; ++i) {
            l.add(o[i]);
            NCmainSagaObjs.put(id, l);
        }
    }

    public static void othrs(int id, String a, String p) {
        NCmainSagaArcs.put(id, a);
        NCmainSagaProps.put(id, p);
    }

    public static void rews(int id, String ... o) {
        ArrayList l = Lists.newArrayList();
        for (int i = 0; i < o.length; ++i) {
            l.add(o[i]);
            NCmainSagaRwrds.put(id, l);
        }
    }

    public static String rew(String buttonName, int nextMissionID, String ... reward) {
        String s = "";
        for (int i = 0; i < reward.length; ++i) {
            s = s + "||" + reward[i];
        }
        return (s.length() > 2 ? s.substring(2) : s) + ";" + buttonName + ";" + nextMissionID;
    }

    public static String r(String ... r) {
        if (r.length == 3 && r[0].equalsIgnoreCase(REWARD_TYPE_TP)) {
            return r[0] + "!" + r[1] + "!" + r[2];
        }
        if (r.length == 1 && r[0].equalsIgnoreCase(REWARD_TYPE_NOTHING)) {
            return r[0];
        }
        return r[0] + "!" + r[1];
    }

    public static String sagaTitle(int i) {
        if (i <= 5) {
            return "dbc.sagasystem.emperorpilaf";
        }
        if (i <= 10) {
            return "dbc.sagasystem.dbtournament";
        }
        if (i <= 21) {
            return "dbc.sagasystem.redribbon";
        }
        if (i <= 27) {
            return "dbc.sagasystem.fortunetellerbaba";
        }
        if (i <= 32) {
            return "dbc.sagasystem.tienshinhan";
        }
        if (i <= 40) {
            return "dbc.sagasystem.kingpiccolo";
        }
        if (i <= 47) {
            return "dbc.sagasystem.piccolojr";
        }
        if (i <= 52) {
            return "dbc.sagasystem.saiyan";
        }
        if (i <= 59) {
            return "dbc.sagasystem.freeza";
        }
        if (i <= 77) {
            return "dbc.sagasystem.android";
        }
        if (i <= 91) {
            return "dbc.sagasystem.buu";
        }
        if (i <= 95) {
            return "dbc.sagasystem.beerus";
        }
        if (i <= 102) {
            return "dbc.sagasystem.gfreeza";
        }
        if (i <= 110) {
            return "dbc.sagasystem.universe6";
        }
        if (i <= 113) {
            return "dbc.sagasystem.cvegeta";
        }
        if (i <= 128) {
            return "dbc.sagasystem.dbsftrunks";
        }
        if (i <= 151) {
            return "dbc.sagasystem.dbsuniversesurvival";
        }
        return "dbc.sagasystem.credits";
    }

    public static ArrayList<String> al(String ... s) {
        ArrayList l = Lists.newArrayList();
        for (int i = 0; i < s.length; ++i) {
            l.add(s[i]);
        }
        return l;
    }

    public static ArrayList<ArrayList<String>> al(ArrayList<String> ... s) {
        ArrayList l = Lists.newArrayList();
        for (int i = 0; i < s.length; ++i) {
            l.add(s[i]);
        }
        return l;
    }

    public static JRMCoreMsnBundle msnGen() {
        JRMCoreMm.init();
        int DBCmainSagaLength = allMsn;
        JRMCoreMsnBundle mb = new JRMCoreMsnBundle();
        mb.setName("Dragon Block C Main Saga");
        mb.setDesc("An alternate story for the DBC mod based off on the Dragon Ball series.");
        mb.setAuthor("JinRyuu, Ben");
        mb.setVersion("1.4");
        mb.setMods("DBC");
        mb.settings.repeat = MISSION_CONDS_TYPE;
        mb.settings.unlock = "";
        mb.settings.vars = "";
        ArrayList<JRMCoreMsn> ml = new ArrayList<JRMCoreMsn>();
        JRMCoreMsn m = new JRMCoreMsn();
        for (int i = 0; i < DBCmainSagaLength; ++i) {
            int keyID;
            m = new JRMCoreMsn();
            m.setId(i);
            m.setTranslated(true);
            ArrayList l = Lists.newArrayList();
            String key = i > 47 ? "dbc.sagasystem." : "dbc.sagasdb.";
            int n = keyID = i > 47 ? i - 47 : i;
            if (i == 63 || i == 74 || i == 83 || i == 94 || i == 101) {
                m.setProps(JRMCoreMm.al(MISSION_PROP_Default, "saiyan"));
                m.setAlign(JRMCoreMm.al("neutral", "neutral"));
                m.setTitle(JRMCoreMm.al(JRMCoreMm.sagaTitle(i), JRMCoreMm.sagaTitle(i)));
                m.setSubtitle(JRMCoreMm.al(key + keyID + ".title", key + keyID + ".title"));
                m.setDescription(JRMCoreMm.al(key + keyID + ".desc", key + keyID + ".desc"));
                m.setObjectives(JRMCoreMm.al(DBCmainSagaObjs.get(i), DBCmainSagaObjs1.get(i)));
                m.setRewards(JRMCoreMm.al(DBCmainSagaRwrds.get(i), DBCmainSagaRwrds1.get(i)));
            } else {
                m.setProps(JRMCoreMm.al(MISSION_PROP_Default));
                m.setAlign(JRMCoreMm.al("neutral"));
                m.setTitle(JRMCoreMm.al(JRMCoreMm.sagaTitle(i)));
                m.setSubtitle(JRMCoreMm.al(key + keyID + ".title"));
                m.setDescription(JRMCoreMm.al(key + keyID + ".desc"));
                m.setObjectives(JRMCoreMm.al(DBCmainSagaObjs.get(i)));
                m.setRewards(JRMCoreMm.al(DBCmainSagaRwrds.get(i)));
            }
            ml.add(m);
        }
        mb.setMissions(ml);
        return mb;
    }

    public static JRMCoreMsnBundle msnGenNC() {
        JRMCoreMm.initNC();
        int NCmainSagaLength = allMsnNC;
        JRMCoreMsnBundle mb = new JRMCoreMsnBundle();
        mb.setName("Naruto C Main Saga");
        mb.setDesc("An alternate story for the Naruto C mod based off on the Naruto series.");
        mb.setAuthor("JinRyuu, Ben");
        mb.setVersion("0.5");
        mb.setMods("NC");
        mb.settings.repeat = MISSION_CONDS_TYPE;
        mb.settings.unlock = "";
        mb.settings.vars = "";
        ArrayList<JRMCoreMsn> ml = new ArrayList<JRMCoreMsn>();
        JRMCoreMsn m = new JRMCoreMsn();
        for (int i = 0; i < NCmainSagaLength; ++i) {
            m = new JRMCoreMsn();
            m.setId(i);
            m.setTranslated(true);
            ArrayList l = Lists.newArrayList();
            m.setProps(JRMCoreMm.al(NCmainSagaProps.get(i)));
            m.setAlign(JRMCoreMm.al("neutral"));
            m.setTitle(JRMCoreMm.al(NCmainSagaArcs.get(i)));
            m.setSubtitle(JRMCoreMm.al("nc.sagasystem." + i + ".title"));
            m.setDescription(JRMCoreMm.al("nc.sagasystem." + i + ".desc"));
            m.setObjectives(JRMCoreMm.al(NCmainSagaObjs.get(i)));
            m.setRewards(JRMCoreMm.al(NCmainSagaRwrds.get(i)));
            ml.add(m);
        }
        mb.setMissions(ml);
        return mb;
    }

    public static JRMCoreMsnBundle missionSideDBSBroly() {
        JRMCoreMm.initDBCDBSBroly();
        int missionsLength = allMissionsDBSBroly;
        JRMCoreMsnBundle mb = new JRMCoreMsnBundle();
        mb.setName("Dragon Block C - DBS Broly Movie");
        mb.setDesc("An alternate story for the DBC mod based off on the Dragon Ball Super Broly movie.");
        mb.setAuthor("Ben");
        mb.setVersion("1.0");
        mb.setMods("DBC");
        mb.settings.repeat = MISSION_CONDS_TYPE;
        mb.settings.unlock = "";
        mb.settings.vars = "";
        ArrayList<JRMCoreMsn> ml = new ArrayList<JRMCoreMsn>();
        JRMCoreMsn m = new JRMCoreMsn();
        for (int i = 0; i < missionsLength; ++i) {
            m = new JRMCoreMsn();
            m.setId(i);
            m.setTranslated(true);
            m.setProps(JRMCoreMm.al(MISSION_PROP_Default));
            m.setAlign(JRMCoreMm.al("neutral"));
            m.setTitle(JRMCoreMm.al("dbc.sagadbsbroly.dbsbroly"));
            m.setSubtitle(JRMCoreMm.al("dbc.sagadbsbroly." + i + ".title"));
            m.setDescription(JRMCoreMm.al("dbc.sagadbsbroly." + i + ".desc"));
            m.setObjectives(JRMCoreMm.al(DBCDBSBrolyObjs.get(i)));
            m.setRewards(JRMCoreMm.al(DBCDBSBrolyRwrds.get(i)));
            ml.add(m);
        }
        mb.setMissions(ml);
        return mb;
    }

    static {
        allMissionsDBSBroly = 0;
        allMsnNC = 0;
    }
}

