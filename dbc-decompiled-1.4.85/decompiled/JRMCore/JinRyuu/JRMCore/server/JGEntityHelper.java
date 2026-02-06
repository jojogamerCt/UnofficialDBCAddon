/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.server;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.JRMCoreM;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class JGEntityHelper {
    public static void spawcha(EntityPlayer p, World w, String n, String h, String a, String m, String pr, double x, double y, double z, int g) {
        EntityLivingBase e = (EntityLivingBase)EntityList.createEntityByName((String)n, (World)w);
        if (e != null) {
            e.setLocationAndAngles(x, y, z, 0.0f, 0.0f);
            JGEntityHelper.setAttributes(e, h, a, m, pr, g);
            if (JRMCoreH.DBC()) {
                JRMCoreHDBC.ifEvilDBCnpcs((Entity)e, p);
            }
            w.spawnEntityInWorld((Entity)e);
        }
    }

    public static void setAttributes(EntityLivingBase e, String health, String damage, String multi, String pr, int groupMulti) {
        if (e != null) {
            NBTTagCompound nbt = JRMCoreH.nbt((Entity)e);
            if (!pr.equals("") && pr.length() > 0) {
                nbt.setString("jrmcSpawnInitiatedIMP", pr);
            }
            if (!damage.equals("") && damage.length() > 0) {
                double newDamage = Double.parseDouble(damage) * (double)JRMCoreM.gm(groupMulti);
                nbt.setDouble("jrmcSpawnInitiatedCAT", newDamage);
            }
            if (!health.equals("") && health.length() > 0) {
                double newHealth = Double.parseDouble(health) * (double)JRMCoreM.gm(groupMulti);
                nbt.setDouble("jrmcSpawnInitiatedCHP", newHealth);
            }
            if (!multi.equals("") && multi.length() > 0) {
                nbt.setString("jrmcSpawnInitiatedCMT", multi);
            }
        }
    }
}

