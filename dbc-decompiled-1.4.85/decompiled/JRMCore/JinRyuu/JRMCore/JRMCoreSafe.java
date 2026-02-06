/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreSafeUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class JRMCoreSafe {
    public File dataDir;
    public File saveDir;
    public File playersDir;
    public World world;
    public File NamekDir;
    public File NamDataDir;
    public File OWDir;
    public File OWDataDir;

    public JRMCoreSafe(World worldObj) {
        this.world = worldObj;
        if (!this.world.isRemote) {
            this.saveDir = JRMCoreSafeUtil.getWorldSaveDir(this.world);
        }
        if (!this.world.isRemote) {
            this.dataDir = new File(this.saveDir, "data");
            if (!this.dataDir.exists()) {
                this.dataDir.mkdir();
            }
            this.playersDir = new File(this.saveDir, "players");
            if (!this.playersDir.exists()) {
                this.playersDir.mkdir();
            }
        }
        if (!this.world.isRemote) {
            this.NamekDir = new File(this.saveDir, "Namek");
            if (!this.NamekDir.exists()) {
                this.NamekDir.mkdir();
            }
            this.NamDataDir = new File(this.NamekDir, "data");
            if (!this.NamDataDir.exists()) {
                this.NamDataDir.mkdir();
            }
        }
        if (!this.world.isRemote) {
            this.OWDir = new File(this.saveDir, "OtherWorld");
            if (!this.OWDir.exists()) {
                this.OWDir.mkdir();
            }
            this.OWDataDir = new File(this.OWDir, "data");
            if (!this.OWDataDir.exists()) {
                this.OWDataDir.mkdir();
            }
        }
    }

    public void saveSpawnList(String string, File dataDir, String dataName) {
        if (this.world.isRemote) {
            return;
        }
        File spawnLog = new File(dataDir, dataName);
        try {
            BufferedWriter writer = JRMCoreSafeUtil.getWriter(spawnLog);
            writer.write(string + "");
            writer.flush();
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    public void SAAUW(int n, String un, String saa) {
        JRMCoreH.nbt((Entity)this.world.getPlayerEntityByName(un), "pres").setInteger(saa, n);
    }

    public int SAAUR(EntityPlayer un, String saa) {
        if (un != null && !un.isDead && JRMCoreH.nbt((Entity)un, "pres").getInteger(saa) == 0) {
            if (saa == JRMCoreH.SEvil) {
                JRMCoreH.nbt((Entity)un, "pres").setInteger(saa, 67);
            } else if (saa == JRMCoreH.SHealth) {
                JRMCoreH.nbt((Entity)un, "pres").setInteger(saa, 20);
            } else if (saa == JRMCoreH.SkiMax) {
                JRMCoreH.nbt((Entity)un, "pres").setInteger(saa, 10);
            } else if (saa == JRMCoreH.Sbody) {
                JRMCoreH.nbt((Entity)un, "pres").setInteger(saa, 20);
            } else if (saa == JRMCoreH.SchMax) {
                JRMCoreH.nbt((Entity)un, "pres").setInteger(saa, 10);
            } else {
                JRMCoreH.nbt((Entity)un, "pres").setInteger(saa, 1);
            }
        }
        return JRMCoreH.nbt((Entity)un, "pres").getInteger(saa);
    }

    public void SAAUW_OLD(int n, String un, String saa) {
        if (this.world.isRemote) {
            return;
        }
        File uf = new File(this.playersDir, un);
        File ud = new File(uf, saa);
        try {
            BufferedWriter writer = JRMCoreSafeUtil.getWriter(ud);
            writer.write(Integer.toString(n));
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    public int SAAUR_OLD(String un, String saa) {
        File ud;
        File uf = new File(this.playersDir, un);
        if (!uf.exists() && !uf.exists()) {
            uf.mkdir();
        }
        if (!(ud = new File(uf, saa)).exists()) {
            if (saa == JRMCoreH.SEvil) {
                this.saveSpawnList("67", uf, saa);
            } else if (saa == JRMCoreH.SHealth) {
                this.saveSpawnList("20", uf, saa);
            } else if (saa == JRMCoreH.SkiMax) {
                this.saveSpawnList("10", uf, saa);
            } else if (saa == JRMCoreH.Sbody) {
                this.saveSpawnList("20", uf, saa);
            } else if (saa == JRMCoreH.SchMax) {
                this.saveSpawnList("10", uf, saa);
            } else {
                this.saveSpawnList("1", uf, saa);
            }
        }
        String line = null;
        try {
            BufferedReader reader = JRMCoreSafeUtil.getReader(ud);
            line = reader.readLine();
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        if (line == null) {
            line = "0";
        }
        return Integer.parseInt(line);
    }

    public boolean isSpawn(String emp, int colu, File dataDir, String dataName) {
        File spawnLog = new File(dataDir, dataName);
        if (!spawnLog.exists()) {
            this.saveSpawnList(emp + " ", dataDir, dataName);
        }
        String line = null;
        try {
            BufferedReader reader = JRMCoreSafeUtil.getReader(spawnLog);
            line = reader.readLine();
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        if (line == null) {
            line = " ";
        }
        String[] col = line.split(" ");
        boolean gen = true;
        if (col[colu].compareTo(emp) == 0) {
            gen = false;
        }
        return gen;
    }

    public boolean isSpawn(String emp, String dont, int colu, File dataDir, String dataName) {
        File spawnLog = new File(dataDir, dataName);
        if (!spawnLog.exists()) {
            this.saveSpawnList(emp, dataDir, dataName);
        }
        String line = null;
        try {
            BufferedReader reader = JRMCoreSafeUtil.getReader(spawnLog);
            line = reader.readLine();
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        if (line == null) {
            line = " ";
        }
        String[] col = line.split(" ");
        boolean gen = true;
        if (col[colu].compareTo(dont) == 0) {
            gen = false;
        }
        return gen;
    }
}

