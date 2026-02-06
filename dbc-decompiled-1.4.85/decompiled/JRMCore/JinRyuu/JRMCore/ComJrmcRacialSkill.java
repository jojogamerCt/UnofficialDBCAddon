/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.command.WrongUsageException
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.server.MinecraftServer
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.server.JGRaceHelper;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;

public class ComJrmcRacialSkill
extends CommandBase {
    private final String[] MODES = new String[]{"set", "add"};
    private final String[] AMOUNT = new String[]{"0", "1", "10", "-1"};
    private final String[] BOOLEAN = new String[]{"true", "false"};
    final String name = "jrmcracialskill";
    final String desc = "Usage: '/jrmcracialskill (Set or Add) amount [playerName] [tpCostOn] [ignoreMindCostOn]' and the ADD amount can be negative too.";
    private byte result;
    private boolean doit;
    private int tp_current;
    private int tp_cost;
    private final byte SET = 0;
    private final byte ADD = 1;
    private final byte TAKE = (byte)2;
    private final byte NA = (byte)-1;

    public String getCommandName() {
        return "jrmcracialskill";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public String getCommandUsage(ICommandSender par1ICommandSender) {
        return "Usage: '/jrmcracialskill (Set or Add) amount [playerName] [tpCostOn] [ignoreMindCostOn]' and the ADD amount can be negative too.";
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] commandTags) {
        boolean nc;
        boolean neg;
        EntityPlayerMP entityplayermp;
        if (commandTags.length <= 0) {
            throw new WrongUsageException("Usage: '/jrmcracialskill (Set or Add) amount [playerName] [tpCostOn] [ignoreMindCostOn]' and the ADD amount can be negative too.", new Object[0]);
        }
        this.result = (byte)-1;
        this.doit = true;
        this.tp_current = 0;
        this.tp_cost = 0;
        boolean takeTP = false;
        boolean MindCost = false;
        if (commandTags.length > 2) {
            entityplayermp = ComJrmcRacialSkill.getPlayer((ICommandSender)par1ICommandSender, (String)commandTags[2]);
            if (commandTags.length > 3) {
                takeTP = Boolean.parseBoolean(commandTags[3]);
            }
            if (commandTags.length > 4) {
                MindCost = Boolean.parseBoolean(commandTags[4]);
            }
        } else {
            entityplayermp = ComJrmcRacialSkill.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        }
        String entitycommansender = "Console";
        try {
            EntityPlayerMP commansender = ComJrmcRacialSkill.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
            entitycommansender = commansender.getCommandSenderName();
        }
        catch (Exception commansender) {
            // empty catch block
        }
        boolean boo = entitycommansender.equals("Console") ? JRMCoreConfig.ComRSNAC : (entitycommansender.equals(entityplayermp.getCommandSenderName()) ? JRMCoreConfig.ComRSNAS : JRMCoreConfig.ComRSNAO);
        NBTTagCompound nbt = JRMCoreH.nbt((Entity)entityplayermp, "pres");
        String str = commandTags[0].toLowerCase();
        byte tpMode = str.equals("add") ? (byte)1 : (str.equals("set") ? (byte)0 : -1);
        String str2 = commandTags[1];
        int i = Byte.parseByte(str2);
        boolean bl = neg = i < 0;
        if (neg) {
            i = (byte)(i * -1);
        }
        boolean loop = true;
        boolean dbc = nbt.getByte("jrmcPwrtyp") == 1;
        boolean bl2 = nc = nbt.getByte("jrmcPwrtyp") == 2;
        if (dbc || nc) {
            String key;
            byte race = nbt.getByte("jrmcRace");
            byte startLevel = 0;
            byte currentLevel = 0;
            String string = key = dbc ? "jrmcSSltX" : "jrmcSSltY";
            if (nbt.hasKey(key) && !nbt.getString(key).contains("pty") && nbt.getString(key).length() > 1 && (!nc || !nbt.getString("jrmcSSltY").contains("Sai") && race != 1 && race != 2)) {
                boolean targetOverCurrent;
                byte max = JGRaceHelper.getMaxRacialSkillLevel(dbc, nc, race);
                currentLevel = Byte.parseByte(nbt.getString(key).substring(2));
                byte targetLevel = (byte)(tpMode == 0 ? i : (tpMode == 1 ? currentLevel + (neg ? -1 : 1) * i : -1));
                targetLevel = targetLevel < 0 ? (byte)0 : (targetLevel > max ? max : targetLevel);
                boolean bl3 = targetOverCurrent = currentLevel < targetLevel;
                byte setLevelTo = (byte)(tpMode == 0 ? (takeTP || MindCost ? 1 : i) : (tpMode == 1 ? 1 : 0));
                startLevel = Byte.parseByte(nbt.getString(key).substring(2));
                for (int foolProof = 15; loop && this.doit && targetLevel != -1 && currentLevel != targetLevel && foolProof > 0; --foolProof) {
                    currentLevel = Byte.parseByte(nbt.getString(key).substring(2));
                    if (takeTP && targetOverCurrent || MindCost) {
                        this.canAfford(dbc, nc, key, entityplayermp, nbt, race, max, takeTP, MindCost);
                    }
                    currentLevel = this.setValue(tpMode, neg, currentLevel, setLevelTo, max, takeTP, targetOverCurrent, MindCost);
                    if (!this.doit) continue;
                    nbt.setString(key, (dbc ? JRMCoreH.vlblRSkls[0] : JRMCoreH.ncCSkls[nbt.getByte("jrmcClass")]) + currentLevel);
                    if (!takeTP || !targetOverCurrent) continue;
                    if (takeTP) {
                        nbt.setInteger("jrmcTpint", this.tp_current - this.tp_cost);
                        continue;
                    }
                    loop = false;
                }
                if (boo && this.result != -1) {
                    String resultS = this.result == 0 ? "was set" : (this.result == 1 ? "lost " + i + " level(s)" : "received " + i + " level(s)") + " (" + (this.doit ? "Success" : "Fail") + ")";
                    currentLevel = Byte.parseByte(nbt.getString(key).substring(2));
                    this.notifyAdmins(par1ICommandSender, "Racial Skill " + resultS + " from: %s to: %s for %s", new Object[]{(int)startLevel, (int)currentLevel, entityplayermp.getCommandSenderName()});
                }
            }
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComJrmcRacialSkill.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public List addTabCompletionOptions(ICommandSender commandSender, String[] stringArray) {
        int length = stringArray.length;
        switch (length) {
            case 1: {
                return ComJrmcRacialSkill.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.MODES);
            }
            case 2: {
                return ComJrmcRacialSkill.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.AMOUNT);
            }
            case 3: {
                return ComJrmcRacialSkill.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.getListOfPlayers());
            }
            case 4: {
                return ComJrmcRacialSkill.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.BOOLEAN);
            }
            case 5: {
                return ComJrmcRacialSkill.getListOfStringsMatchingLastWord((String[])stringArray, (String[])this.BOOLEAN);
            }
        }
        return null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int par1) {
        return par1 == 0;
    }

    private void canAfford(boolean dbc, boolean nc, String key, EntityPlayerMP player, NBTTagCompound nbt, byte race, byte max, boolean takeTP, boolean MindCost) {
        int[][] sklsMR;
        String[] skls;
        int[][] cSklsLvl;
        String[] cSkls;
        int[][] rSklsLvl;
        int[][] rSklsMR = null;
        int[][] cSklsMR = null;
        if (dbc) {
            String[] rSkls = JRMCoreH.vlblRSkls;
            rSklsLvl = JRMCoreH.DBCRacialSkillTPCost;
            String[] rSklsNms = JRMCoreH.vlblRSklsNms;
            rSklsMR = JRMCoreH.DBCRacialSkillMindCost;
            cSkls = JRMCoreH.vlblCSkls;
            cSklsLvl = JRMCoreH.vlblCSklsLvl;
            String[] cSklsNms = JRMCoreH.vlblCSklsNms;
            skls = JRMCoreH.DBCSkillsIDs;
            int[] sklsUps = JRMCoreH.vlblSklsUps;
            int[][] sklsLvl = JRMCoreH.DBCSkillTPCost;
            String[] sklsNms = JRMCoreH.DBCSkillNames;
            sklsMR = JRMCoreH.DBCSkillMindCost;
            String mod = "dbc";
        } else {
            String[] rSkls = JRMCoreH.ncRSkls;
            rSklsLvl = JRMCoreH.ncRSklsLvl;
            String[] rSklsNms = JRMCoreH.ncRSklsNms;
            cSkls = JRMCoreH.ncCSkls;
            cSklsLvl = JRMCoreH.NCRacialSkillTPCost;
            String[] cSklsNms = JRMCoreH.NCRacialSkillAbilityNames;
            cSklsMR = JRMCoreH.NCRacialSkillMindCost;
            skls = JRMCoreH.NCSkillIDs;
            int[] sklsUps = JRMCoreH.ncSklsUps;
            int[][] sklsLvl = JRMCoreH.NCSkillTPCost;
            String[] sklsNms = JRMCoreH.NCSkillNames;
            sklsMR = JRMCoreH.NCSkillMindCost;
            String mod = "nc";
        }
        String PlyrSkillX = nbt.getString("jrmcSSltX");
        String PlyrSkillY = nbt.getString("jrmcSSltY");
        int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts((EntityPlayer)player);
        String[] PlyrSkills = nbt.getString("jrmcSSlts").split(",");
        int SkillLvls = JRMCoreH.skillSlot_SpentMindRequirement(PlyrSkills, skls, sklsMR) + JRMCoreH.skillSlot_SpentMindRequirement_X(PlyrSkillX, race, rSklsMR) + JRMCoreH.skillSlot_SpentMindRequirement(PlyrSkillY, cSkls, cSklsMR);
        boolean SklSlt = JRMCoreH.canAffordSkill(PlyrAttrbts[4], SkillLvls);
        String sklnm = nbt.getString(key);
        if (MindCost) {
            int mx;
            int mz;
            if (dbc) {
                mz = JRMCoreH.skillMindRequirement_X(sklnm, race, rSklsMR);
                mx = SkillLvls + mz;
                SklSlt = JRMCoreH.canAffordSkill(PlyrAttrbts[4], mx);
            } else {
                mz = JRMCoreH.skillMindRequirement(sklnm, cSkls, cSklsMR);
                mx = SkillLvls + mz;
                SklSlt = JRMCoreH.canAffordSkill(PlyrAttrbts[4], mx);
            }
        }
        int racialSkillLvl = Integer.parseInt(sklnm.substring(2)) + 1;
        int tpLevelCost = 0;
        tpLevelCost = dbc ? JRMCoreH.skillTPCost_X(PlyrSkillX, race, rSklsLvl) : JRMCoreH.skillTPCost_X(PlyrSkillY, race, cSklsLvl);
        if (takeTP) {
            this.tp_current = nbt.getInteger("jrmcTpint");
            if (JRMCoreH.rSai(race) && dbc) {
                this.tp_cost = tpLevelCost;
                racialSkillLvl = racialSkillLvl > 7 ? 7 : racialSkillLvl;
            } else if (race == 4 && dbc) {
                this.tp_cost = tpLevelCost;
                racialSkillLvl = racialSkillLvl > 6 ? 6 : racialSkillLvl;
            } else if (race != 4 && dbc) {
                this.tp_cost = tpLevelCost;
                racialSkillLvl = racialSkillLvl > 5 ? 5 : racialSkillLvl;
            }
        }
        this.doit = (!takeTP || this.tp_current >= this.tp_cost && this.tp_cost != -1) && (!MindCost || SklSlt);
    }

    private byte setValue(byte tpMode, boolean neg, byte n, byte i, byte max, boolean takeTP, boolean targetOverCurrent, boolean MindCost) {
        if (tpMode == 0) {
            if (!takeTP && !MindCost) {
                n = i;
                if (n < 0) {
                    n = 0;
                } else if (n > max) {
                    n = max;
                }
            } else if (!targetOverCurrent) {
                if ((n = (byte)(n - i)) < 0) {
                    n = 0;
                }
            } else if ((n = (byte)(n + i)) > max) {
                n = max;
            }
            this.result = 0;
        } else if (tpMode == 1) {
            if (neg) {
                if ((n = (byte)(n - i)) < 0) {
                    n = 0;
                }
                this.result = 1;
            } else {
                if ((n = (byte)(n + i)) > max) {
                    n = max;
                }
                this.result = (byte)2;
            }
        }
        return n;
    }
}

