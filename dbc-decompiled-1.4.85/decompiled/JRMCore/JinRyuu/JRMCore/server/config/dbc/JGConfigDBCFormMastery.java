/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.common.config.Property
 */
package JinRyuu.JRMCore.server.config.dbc;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.server.config.JGConfigBase;
import JinRyuu.JRMCore.server.config.dbc.FormMastery;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class JGConfigDBCFormMastery
extends JGConfigBase {
    public static final String CATEGORY_FORM_MASTERIES_SERVERSIDED = "Form Masteries";
    public static int DATA_ID_MAX_LEVEL = 0;
    public static int DATA_ID_INSTANT_TRANSFORM_UNLOCK = 1;
    public static int DATA_ID_AUTO_LEARN_ON_LEVEL = 2;
    public static int DATA_ID_REQUIRED_MASTERIES = 3;
    public static int DATA_ID_GAIN_TO_OTHER_MASTERIES = 4;
    public static int DATA_ID_DAMAGE_MULTI = 5;
    public static int DATA_ID_GAIN_PASSIVE = 6;
    public static int DATA_ID_GAIN_ATTACK = 7;
    public static int DATA_ID_GAIN_DAMAGE_TAKEN = 8;
    public static int DATA_ID_FIRE_KI = 9;
    public static int DATA_ID_COST_MULTI = 10;
    public static int DATA_ID_COST_MULTI2 = 11;
    public static int DATA_ID_KI_COST_MULTI = 10;
    public static int DATA_ID_ARCOSIAN_PP_COST_MULTI = 11;
    public static int DATA_ID_GOD_RITUAL_TIMER_MULTI = 11;
    public static int DATA_ID_GOD_RITUAL_STRAIN_COST_MULTI = 12;
    public static int DATA_ID_KAIOKEN_HEALTH_COST_MULTI = 10;
    public static int DATA_ID_KAIOKEN_STRAIN_TEMP_MULTI = 11;
    public static int DATA_ID_KAIOKEN_STRAIN_ACTIVE_MULTI = 12;
    public static int DATA_ID_UI_HEAT_MULTI = 10;
    public static int DATA_ID_UI_PAIN_MULTI = 11;
    public static int DATA_ID_UI_HEALTH_REQ_MULTI = 12;
    public static int DATA_ID_GOD_AURA_COST_MULTI = 10;
    public static int DATA_ID_MYSTIC_TIMER_MULTI = 10;
    public static int DATA_ID_GAIN_MULTI_DIV_PLUS = 1;
    public static boolean cFM_Enabled;
    public static boolean FM_Enabled;
    public static int FM_Data_Separation_Per_Player;
    public static double FM_LevelMax;
    public static double FM_GainMultiDivPlus;
    public static double FM_InstantTransformUnlockLevel;
    public static String FM_AutoLearnOnLevel;
    public static String FM_RequiredMastery;
    public static String FM_AddGainsToOtherMastery;
    public static double FM_DamageMultiFlat;
    public static double FM_DamageMultiPerLevel;
    public static double FM_DamageMultiMax;
    public static double FM_GainPassive;
    public static double FM_GainDamageDealt;
    public static double FM_GainDamageTaken;
    public static double FM_GainKiFire;
    public static double FM_GainPassiveForm;
    public static double FM_GainDamageDealtForm;
    public static double FM_GainDamageTakenForm;
    public static double FM_GainKiFireForm;
    public static final int FM_GainPassiveID = 0;
    public static final int FM_GainDamageDealtID = 1;
    public static final int FM_GainDamageTakenID = 2;
    public static final int FM_GainKiFireID = 3;
    public static double FM_MindGainMultiFlat;
    public static double FM_MindGainMultiPerMind;
    public static double FM_MindGainMultiMax;
    public static double FM_CostMultiFlat;
    public static double FM_CostMultiPerLevel;
    public static double FM_CostMultiMin;
    public static double FM_CostMultiFlat2;
    public static double FM_CostMultiPerLevel2;
    public static double FM_CostMultiMax2;
    public static FormMastery[][] FormMasteries;
    public static FormMastery[][] cFormMasteries;

    public static int getDataID_ArcosianPPCostMulti(int race, int formID) {
        boolean isRacial = formID < JRMCoreH.trans[race].length;
        int formIDRace = formID - (isRacial ? JRMCoreH.trans[race].length : 0);
        if (!isRacial && formIDRace == 2) {
            return DATA_ID_ARCOSIAN_PP_COST_MULTI + 2;
        }
        return DATA_ID_ARCOSIAN_PP_COST_MULTI;
    }

    public static double getMultipliedGain(double level, double gain, int gainID, int race, int formID) {
        double FM_GainMultiDivPlus = JGConfigDBCFormMastery.getDouble(race, formID, gainID, DATA_ID_GAIN_MULTI_DIV_PLUS);
        if (FM_GainMultiDivPlus == 0.0 || gain == 0.0) {
            return gain;
        }
        double lossFromLevel = level / (level + FM_GainMultiDivPlus);
        double multipliedGain = gain - gain * lossFromLevel;
        return multipliedGain;
    }

    public static double getMindGainMulti(int id, int mind, int gainMultiID, int race, int formID) {
        int gainID = DATA_ID_GAIN_PASSIVE + gainMultiID;
        double max = JGConfigDBCFormMastery.getDouble(race, formID, gainID, 4);
        if (max <= 0.0) {
            return max;
        }
        double flat = JGConfigDBCFormMastery.getDouble(race, formID, gainID, 2);
        double perMind = JGConfigDBCFormMastery.getDouble(race, formID, gainID, 3);
        double mindGainMulti = (double)mind * perMind + flat;
        if (mindGainMulti > max) {
            mindGainMulti = max;
        }
        return mindGainMulti;
    }

    public static double getCostMulti(double masteryLevel, int race, int formID, int dataID) {
        boolean downwards;
        double FM_CostMultiFlat = JGConfigDBCFormMastery.getDouble(race, formID, dataID, 0);
        double FM_CostMultiPerLevel = JGConfigDBCFormMastery.getDouble(race, formID, dataID, 1);
        double FM_CostMultiMinMax = JGConfigDBCFormMastery.getDouble(race, formID, dataID, 2);
        double costMulti = masteryLevel * FM_CostMultiPerLevel + FM_CostMultiFlat;
        boolean bl = downwards = FM_CostMultiPerLevel < 0.0;
        if (downwards ? costMulti < FM_CostMultiMinMax : costMulti > FM_CostMultiMinMax) {
            costMulti = FM_CostMultiMinMax;
        }
        return costMulti;
    }

    public static double getCostMulti(double masteryLevel, int race, int formID, int dataID, boolean downwards) {
        double FM_CostMultiFlat = JGConfigDBCFormMastery.getDouble(race, formID, dataID, 0);
        double FM_CostMultiPerLevel = JGConfigDBCFormMastery.getDouble(race, formID, dataID, 1);
        double FM_CostMultiMinMax = JGConfigDBCFormMastery.getDouble(race, formID, dataID, 2);
        double costMulti = masteryLevel * FM_CostMultiPerLevel + FM_CostMultiFlat;
        if (downwards ? costMulti < FM_CostMultiMinMax : costMulti > FM_CostMultiMinMax) {
            costMulti = FM_CostMultiMinMax;
        }
        return costMulti;
    }

    public static String getString(int race, int form, int dataID, int arrayID) {
        if (FormMasteries.length > race && FormMasteries[race].length > form) {
            return FormMasteries[race][form].getString(dataID, arrayID);
        }
        return "";
    }

    public static String getString(int race, int form, int dataID) {
        return JGConfigDBCFormMastery.getString(race, form, dataID, 0);
    }

    public static double getDouble(int race, int form, int dataID, int arrayID) {
        if (FormMasteries.length > race && FormMasteries[race].length > form) {
            return FormMasteries[race][form].getDouble(dataID, arrayID);
        }
        return 0.0;
    }

    public static double getDouble(int race, int form, int dataID) {
        return JGConfigDBCFormMastery.getDouble(race, form, dataID, 0);
    }

    public static void initMain(Configuration config) {
        config.load();
        JGConfigDBCFormMastery.init_formMasteryMain(config);
        config.save();
    }

    private static void init_formMasteryMain(Configuration config) {
        String CATEGORY = CATEGORY_FORM_MASTERIES_SERVERSIDED;
        String server = "Server Sided!";
        String title = "Form Mastery Enabled";
        String desc = "(Form Mastery configs can be found in: config/jingames/dbc/races/RACE_NAME/form_mastery.cfg) (true = Enabled, false = Disabled) (Default: true)";
        Property property = config.get(CATEGORY, title, true);
        property.comment = "Server Sided! " + desc;
        FM_Enabled = cFM_Enabled = property.getBoolean();
        boolean min = true;
        int max = 200;
        int def = 40;
        title = "Form Mastery Data Separation Per Player";
        desc = "Separates the Form Mastery Server Packet when Player count is above this config's value.\nHigh numbers can cause Errors, which blocks Form Mastery from sending Data (Packets) to Clients and Small numbers can cause more lag for Sending and Receiving Form Mastery Data.\nUsing the Default value is Recommended, unless if you encounter an 'The string is too long for this encoding' server SimpleChannelHandlerWrapper exception Error!\n(From 1 to 200) (Default: " + def + ")";
        property = config.get(CATEGORY, title, def);
        property.comment = "Server Sided! " + desc;
        FM_Data_Separation_Per_Player = property.getInt();
    }

    public static void init(Configuration config, int race) {
        config.load();
        JGConfigDBCFormMastery.init_formMastery(config, race);
        config.save();
    }

    private static void init_formMastery(Configuration config, int raceID) {
        String percentage = " (Percentage)";
        String warning = " Change only to your own responsibility! Having too high multiplier will cause glitches!";
        String server = "Server Sided!";
        String race = JRMCoreH.Races[raceID];
        int racials = JRMCoreH.trans[raceID].length;
        JGConfigDBCFormMastery.FormMasteries[raceID] = new FormMastery[racials + JRMCoreH.transNonRacial.length];
        JGConfigDBCFormMastery.cFormMasteries[raceID] = new FormMastery[racials + JRMCoreH.transNonRacial.length];
        int formID = 0;
        for (String form : JRMCoreH.trans[raceID]) {
            JGConfigDBCFormMastery.FormMasteries[raceID][formID] = new FormMastery();
            JGConfigDBCFormMastery.cFormMasteries[raceID][formID] = new FormMastery();
            ++formID;
        }
        for (String form : JRMCoreH.transNonRacial) {
            JGConfigDBCFormMastery.FormMasteries[raceID][formID] = new FormMastery();
            JGConfigDBCFormMastery.cFormMasteries[raceID][formID] = new FormMastery();
            ++formID;
        }
        int length = FormMasteries[raceID].length;
        for (formID = 0; formID < length; ++formID) {
            int j;
            String CATEGORY;
            boolean isRacial = formID < racials;
            String form = isRacial ? JRMCoreH.trans[raceID][formID] : JRMCoreH.transNonRacial[formID - racials];
            FormMastery formMastery = FormMasteries[raceID][formID];
            FormMastery cformMastery = cFormMasteries[raceID][formID];
            String string = CATEGORY = isRacial ? "racial" : "non_racial";
            if (isRacial && JRMCoreH.isRaceSaiyan(raceID) && (form.equals(JRMCoreH.trans[raceID][12]) || form.equals(JRMCoreH.trans[raceID][13]))) continue;
            int min = -2000000000;
            int max = 2000000000;
            int configs = 11;
            if (race.equals("Arcosian") && (isRacial || !form.equals("Kaioken"))) {
                ++configs;
            } else if ((race.equals("Saiyan") || race.equals("Half-Saiyan")) && form.equals(JRMCoreH.trans[raceID][11])) {
                configs += 2;
            }
            if (form.equals("Kaioken")) {
                configs += 2;
            } else if (form.equals("UltraInstict")) {
                configs += 2;
            }
            boolean formConfig = !form.equals("Base") && !form.equals("Mystic");
            String[] defaultList = new String[configs];
            String name = "";
            boolean minMode = true;
            boolean racialKiCostMinMode = true;
            if (isRacial) {
                if (form.equals("Base")) {
                    racialKiCostMinMode = false;
                } else if (race.equals("Arcosian")) {
                    if (formID < 4) {
                        racialKiCostMinMode = false;
                    }
                } else if (race.equals("Majin") && formID > 0 && formID < 4) {
                    racialKiCostMinMode = false;
                }
            }
            block19: for (j = 0; j < defaultList.length; ++j) {
                switch (j) {
                    case 0: {
                        defaultList[j] = "(MaxLevel) " + FM_LevelMax;
                        continue block19;
                    }
                    case 1: {
                        defaultList[j] = "(Instant_Transform_Unlock_Level) " + FM_InstantTransformUnlockLevel;
                        continue block19;
                    }
                    case 2: {
                        defaultList[j] = "(Auto_Learn_On_Level) " + FM_AutoLearnOnLevel;
                        continue block19;
                    }
                    case 3: {
                        defaultList[j] = "(Required_Masteries) " + FM_RequiredMastery;
                        continue block19;
                    }
                    case 4: {
                        name = FM_AddGainsToOtherMastery;
                        if (form.equals("UltraInstict") || form.equals("GodOfDestruction")) {
                            name = "Base,1.0";
                        } else if (race.equals("Saiyan") || race.equals("Half-Saiyan")) {
                            if (form.equals(JRMCoreH.trans[raceID][1])) {
                                name = JRMCoreH.trans[raceID][4] + ",1.0";
                            } else if (form.equals(JRMCoreH.trans[raceID][4])) {
                                name = JRMCoreH.trans[raceID][1] + ",1.0";
                            }
                        }
                        defaultList[j] = "(Add_Gains_To_Other_Masteries) " + name;
                        continue block19;
                    }
                    case 5: {
                        defaultList[j] = "(Attribute_Multi_Flat) " + FM_DamageMultiFlat + " (Attribute_Multi_PerLevel) " + FM_DamageMultiPerLevel + " (Attribute_Multi_Max) " + FM_DamageMultiMax;
                        continue block19;
                    }
                    case 6: {
                        defaultList[j] = "(Gain_On_Update) " + (formConfig ? FM_GainPassiveForm : FM_GainPassive) + " (Gain_Multi_Div_Plus) " + FM_GainMultiDivPlus + " (MindBonus_Flat) " + FM_MindGainMultiFlat + " (MindBonus_PerMind) " + FM_MindGainMultiPerMind + " (MindBonus_Max) " + FM_MindGainMultiMax;
                        continue block19;
                    }
                    case 7: {
                        defaultList[j] = "(Gain_On_Attack) " + (formConfig ? FM_GainDamageDealtForm : FM_GainDamageDealt) + " (Gain_Multi_Div_Plus) " + FM_GainMultiDivPlus + " (MindBonus_Flat) " + FM_MindGainMultiFlat + " (MindBonus_PerMind) " + FM_MindGainMultiPerMind + " (MindBonus_Max) " + FM_MindGainMultiMax;
                        continue block19;
                    }
                    case 8: {
                        defaultList[j] = "(Gain_On_Damage_Taken) " + (formConfig ? FM_GainDamageTakenForm : FM_GainDamageTaken) + " (Gain_Multi_Div_Plus) " + FM_GainMultiDivPlus + " (MindBonus_Flat) " + FM_MindGainMultiFlat + " (MindBonus_PerMind) " + FM_MindGainMultiPerMind + " (MindBonus_Max) " + FM_MindGainMultiMax;
                        continue block19;
                    }
                    case 9: {
                        defaultList[j] = "(Gain_On_Fire_Ki) " + (formConfig ? FM_GainKiFireForm : FM_GainKiFire) + " (Gain_Multi_Div_Plus) " + FM_GainMultiDivPlus + " (MindBonus_Flat) " + FM_MindGainMultiFlat + " MindBonus_PerMind) " + FM_MindGainMultiPerMind + " MindBonus_Max) " + FM_MindGainMultiMax;
                        continue block19;
                    }
                    case 10: {
                        if (form.equals("Kaioken")) {
                            name = "Health_Cost_Multi_";
                            minMode = true;
                        } else if (form.equals("Mystic")) {
                            name = "Mystic_Level_Loss_Timer_Multi_";
                            minMode = false;
                        } else if (form.equals("UltraInstict")) {
                            name = "Heat_Gain_Multi_";
                            minMode = true;
                        } else if (form.equals("GodOfDestruction")) {
                            name = "Destroyer_Aura_Ki_Cost_Multi_";
                            minMode = true;
                        } else {
                            name = "Ki_Cost_Multi_";
                            minMode = racialKiCostMinMode;
                        }
                        defaultList[j] = "(" + name + "Flat) " + (minMode ? FM_CostMultiFlat : FM_CostMultiFlat2) + " (" + name + "PerLevel) " + (minMode ? FM_CostMultiPerLevel : FM_CostMultiPerLevel2) + " (" + name + "MinOrMax" + ") " + (minMode ? FM_CostMultiMin : FM_CostMultiMax2);
                        continue block19;
                    }
                    case 11: {
                        if ((race.equals("Saiyan") || race.equals("Half-Saiyan")) && form.equals(JRMCoreH.trans[raceID][11])) {
                            name = "Timer_Multi_";
                            minMode = false;
                        } else if (form.equals("Kaioken")) {
                            name = "Strain_Timer_Temporary_Multi_";
                            minMode = true;
                        } else if (form.equals("UltraInstict")) {
                            name = "Pain_Timer_Multi_";
                            minMode = true;
                        } else if (race.equals("Arcosian")) {
                            name = "Power_Point_Cost_Multi_";
                            minMode = true;
                        } else {
                            name = "Ki_Cost_Multi_";
                            minMode = racialKiCostMinMode;
                        }
                        defaultList[j] = "(" + name + "Flat) " + (minMode ? FM_CostMultiFlat : FM_CostMultiFlat2) + " (" + name + "PerLevel) " + (minMode ? FM_CostMultiPerLevel : FM_CostMultiPerLevel2) + " (" + name + "MinOrMax" + ") " + (minMode ? FM_CostMultiMin : FM_CostMultiMax2);
                        continue block19;
                    }
                    case 12: {
                        if ((race.equals("Saiyan") || race.equals("Half-Saiyan")) && form.equals(JRMCoreH.trans[raceID][11])) {
                            name = "Strain_Timer_Multi_";
                            minMode = true;
                        } else if (form.equals("Kaioken")) {
                            name = "Strain_Timer_Active_Multi_";
                            minMode = false;
                        } else if (form.equals("UltraInstict")) {
                            name = "Health_Requirement_Multi_";
                            minMode = false;
                        } else {
                            name = "Ki_Cost_Multi_";
                            minMode = racialKiCostMinMode;
                        }
                        defaultList[j] = "(" + name + "Flat) " + (minMode ? FM_CostMultiFlat : FM_CostMultiFlat2) + " (" + name + "PerLevel) " + (minMode ? FM_CostMultiPerLevel : FM_CostMultiPerLevel2) + " (" + name + "MinOrMax" + ") " + (minMode ? FM_CostMultiMin : FM_CostMultiMax2);
                        continue block19;
                    }
                    case 13: {
                        if (form.equals("Kaioken") && race.equals("Arcosian")) {
                            name = "Power_Point_Cost_Multi_";
                            minMode = true;
                        } else if (form.equals("UltraInstict") && race.equals("Arcosian")) {
                            name = "Power_Point_Cost_Multi_";
                            minMode = true;
                        } else {
                            name = "Ki_Cost_Multi_";
                            minMode = racialKiCostMinMode;
                        }
                        defaultList[j] = "(" + name + "Flat) " + (minMode ? FM_CostMultiFlat : FM_CostMultiFlat2) + " (" + name + "PerLevel) " + (minMode ? FM_CostMultiPerLevel : FM_CostMultiPerLevel2) + " (" + name + "MinOrMax" + ") " + (minMode ? FM_CostMultiMin : FM_CostMultiMax2);
                    }
                }
            }
            String title = form;
            String desc = "Values for the Form's Mastery:";
            Property property = config.get(CATEGORY, title, defaultList, "Server Sided! " + desc);
            String[] list = property.getStringList();
            for (j = 0; j < list.length; ++j) {
                String line = list[j];
                if (line == null || line.length() == 0) {
                    line = defaultList[j];
                }
                boolean isString = j == DATA_ID_AUTO_LEARN_ON_LEVEL || j == DATA_ID_REQUIRED_MASTERIES || j == DATA_ID_GAIN_TO_OTHER_MASTERIES;
                String[] data = line.split(" ");
                if (isString) {
                    formMastery.addData(data.length > 1 ? data[1] : null);
                    continue;
                }
                int valueCount = 0;
                for (int k = 1; k < data.length; k += 2) {
                    ++valueCount;
                }
                Object[] values = new String[valueCount];
                valueCount = 0;
                for (int k = 1; k < data.length; k += 2) {
                    double value = Double.parseDouble(data[k]);
                    if (value < (double)min) {
                        value = min;
                    } else if (value > (double)max) {
                        value = max;
                    }
                    values[valueCount] = value + "";
                    ++valueCount;
                }
                if (j == DATA_ID_DAMAGE_MULTI) {
                    Object[] values2 = new String[valueCount];
                    valueCount = 0;
                    Object[] objectArray = values;
                    int n = objectArray.length;
                    for (int i = 0; i < n; ++i) {
                        Object o;
                        values2[valueCount] = o = objectArray[i];
                        ++valueCount;
                    }
                    cformMastery.addData(values2);
                }
                formMastery.addData(values);
            }
        }
    }

    static {
        FM_Data_Separation_Per_Player = 40;
        FM_LevelMax = 50.0;
        FM_GainMultiDivPlus = 100.0;
        FM_InstantTransformUnlockLevel = 0.0;
        FM_AutoLearnOnLevel = "";
        FM_RequiredMastery = "";
        FM_AddGainsToOtherMastery = "";
        FM_DamageMultiFlat = 1.0;
        FM_DamageMultiPerLevel = 0.01;
        FM_DamageMultiMax = 1.5;
        FM_GainPassive = 0.00375;
        FM_GainDamageDealt = 0.0015;
        FM_GainDamageTaken = 0.0015;
        FM_GainKiFire = 0.0015;
        FM_GainPassiveForm = 0.01;
        FM_GainDamageDealtForm = 0.003;
        FM_GainDamageTakenForm = 0.003;
        FM_GainKiFireForm = 0.003;
        FM_MindGainMultiFlat = 1.0;
        FM_MindGainMultiPerMind = 0.001;
        FM_MindGainMultiMax = 1.5;
        FM_CostMultiFlat = 1.0;
        FM_CostMultiPerLevel = -0.01;
        FM_CostMultiMin = 0.5;
        FM_CostMultiFlat2 = 1.0;
        FM_CostMultiPerLevel2 = 0.01;
        FM_CostMultiMax2 = 1.5;
        FormMasteries = new FormMastery[JRMCoreH.Races.length][];
        cFormMasteries = new FormMastery[JRMCoreH.Races.length][];
    }
}

