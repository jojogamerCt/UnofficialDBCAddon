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

public class ComJrmctp
extends CommandBase {
    private final String usage = "Usage: '/jrmctp amount [playerName]' OR '/jrmctp amount [playerName] [(nbtdata)]' and the amount can be negative too. Maximum TP is 1 000 000 000";

    public String getCommandName() {
        return "jrmctp";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public String getCommandUsage(ICommandSender par1ICommandSender) {
        return "Usage: '/jrmctp amount [playerName]' OR '/jrmctp amount [playerName] [(nbtdata)]' and the amount can be negative too. Maximum TP is 1 000 000 000";
    }

    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        EntityPlayerMP entityplayermp;
        boolean flag1;
        if (par2ArrayOfStr.length <= 0) {
            throw new WrongUsageException("Usage: '/jrmctp amount [playerName]' OR '/jrmctp amount [playerName] [(nbtdata)]' and the amount can be negative too. Maximum TP is 1 000 000 000", new Object[0]);
        }
        boolean hasTag = false;
        String s = par2ArrayOfStr[0];
        String s2 = "";
        long i = Long.parseLong(s);
        if (i > (long)JRMCoreH.getMaxTP()) {
            i = JRMCoreH.getMaxTP();
        }
        if (i < (long)(-JRMCoreH.getMaxTP())) {
            i = -JRMCoreH.getMaxTP();
        }
        boolean bl = flag1 = i < 0L;
        if (par2ArrayOfStr.length > 2 && par2ArrayOfStr[2].contains("[") && par2ArrayOfStr[2].contains("]")) {
            s2 = par2ArrayOfStr[2];
            entityplayermp = ComJrmctp.getPlayer((ICommandSender)par1ICommandSender, (String)par2ArrayOfStr[1]);
            hasTag = true;
        } else {
            entityplayermp = par2ArrayOfStr.length > 1 ? ComJrmctp.getPlayer((ICommandSender)par1ICommandSender, (String)par2ArrayOfStr[1]) : ComJrmctp.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
        }
        if (flag1 && !hasTag) {
            i *= -1L;
        }
        String entitycommansender = "Console";
        try {
            EntityPlayerMP commansender = ComJrmctp.getCommandSenderAsPlayer((ICommandSender)par1ICommandSender);
            entitycommansender = commansender.getCommandSenderName();
        }
        catch (Exception commansender) {
            // empty catch block
        }
        boolean n = entitycommansender.equals("Console") ? JRMCoreConfig.ComTPNAC : (entitycommansender.equals(entityplayermp.getCommandSenderName()) ? JRMCoreConfig.ComTPNAS : JRMCoreConfig.ComTPNAO);
        NBTTagCompound nbt = JRMCoreH.nbt((Entity)entityplayermp, "pres");
        if (hasTag) {
            String datas = s2.replace("[", "").replace(")]", "").replace("(", "|");
            String[] nbtArray = datas.split("\\)");
            for (int j = 0; j < nbtArray.length; ++j) {
                String[] datas3 = nbtArray[j].split("\\|");
                if (!nbt.hasKey(datas3[1])) continue;
                byte methods = (byte)(datas3.length / 2);
                String NBTdataS = "";
                boolean doit = true;
                String NBTdataSat = nbt.getString(datas3[1]);
                boolean numberFound = false;
                for (int k = 0; k < NBTdataSat.length(); ++k) {
                    String value = NBTdataSat.substring(k, k + 1);
                    try {
                        int d = Integer.parseInt(value);
                        doit = true;
                        NBTdataS = NBTdataS + d;
                        continue;
                    }
                    catch (Exception e) {
                        if (k == NBTdataSat.length() - 1) continue;
                        doit = false;
                    }
                }
                if (NBTdataS.equals("")) {
                    doit = false;
                }
                if (doit) {
                    double NBTdata = Double.parseDouble(NBTdataS);
                    i = this.returnMathL(i, NBTdata, methods, datas3[0], methods > 1 ? datas3[3] : "", methods > 1 ? Double.parseDouble(datas3[2]) : 0.0, methods > 2 ? datas3[4] : "", methods > 2 ? Double.parseDouble(datas3[5]) : 0.0);
                }
                if (i > (long)JRMCoreH.getMaxTP()) {
                    i = JRMCoreH.getMaxTP();
                }
                if (i >= (long)(-JRMCoreH.getMaxTP())) continue;
                i = -JRMCoreH.getMaxTP();
            }
            if (flag1) {
                i *= -1L;
            }
        }
        if (nbt.getByte("jrmcPwrtyp") == 3) {
            JRMCoreH.sao_expgain((int)i, (EntityPlayer)entityplayermp);
            if (n) {
                this.notifyAdmins(par1ICommandSender, "Exp given %s success %s", new Object[]{(int)i, entityplayermp.getCommandSenderName()});
            }
        } else if (flag1) {
            int tp = nbt.getInteger("jrmcTpint");
            int added = (int)((long)tp - i);
            boolean b = false;
            if (added < 0) {
                added = 0;
                b = true;
            }
            nbt.setInteger("jrmcTpint", added);
            if (n) {
                this.notifyAdmins(par1ICommandSender, "TP take away %s success %s", new Object[]{(int)(b ? i + ((long)tp - i) : i), entityplayermp.getCommandSenderName()});
            }
        } else {
            int tp = nbt.getInteger("jrmcTpint");
            long result = (long)tp + i;
            if (result > (long)JRMCoreH.getMaxTP()) {
                result = JRMCoreH.getMaxTP();
            }
            int added = (int)result;
            boolean b = false;
            if (added > JRMCoreH.getMaxTP()) {
                added = JRMCoreH.getMaxTP();
                b = true;
            }
            nbt.setInteger("jrmcTpint", added);
            if (n) {
                this.notifyAdmins(par1ICommandSender, "TP adding %s success for %s", new Object[]{(int)(b ? i - ((long)tp + i - (long)JRMCoreH.getMaxTP()) : i), entityplayermp.getCommandSenderName()});
            }
        }
    }

    private void notifyAdmins(ICommandSender par1iCommandSender, String string, Object[] objects) {
        ComJrmctp.func_152373_a((ICommandSender)par1iCommandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2ArrayOfStr) {
        return par2ArrayOfStr.length == 2 ? ComJrmctp.getListOfStringsMatchingLastWord((String[])par2ArrayOfStr, (String[])this.getListOfPlayers()) : null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int par1) {
        return par1 == 0;
    }

    private long returnMathL(long tp, double NBT, byte methods, String methodMain, String method1, double n1, String method2, double n2) {
        switch (methods) {
            case 3: {
                NBT = this.methodD(method2, NBT, n2);
            }
            case 2: {
                NBT = this.methodD(method1, n1, NBT);
                break;
            }
        }
        if (methodMain.equals("+")) {
            tp = (long)((double)tp + NBT);
        } else if (methodMain.equals("-")) {
            tp = (long)((double)tp - NBT);
        } else if (methodMain.equals("*")) {
            tp = (long)((double)tp * NBT);
        } else if (methodMain.equals("/")) {
            tp = (long)((double)tp / NBT);
        } else if (methodMain.equals("%")) {
            tp = (long)((double)tp % NBT);
        }
        return tp;
    }

    private double methodD(String method, double n1, double n2) {
        if (method.equals("+")) {
            n1 += n2;
        } else if (method.equals("-")) {
            n1 -= n2;
        } else if (method.equals("*")) {
            n1 *= n2;
        } else if (method.equals("/")) {
            n1 /= n2;
        } else if (method.equals("%")) {
            n1 %= n2;
        }
        return n1;
    }
}

