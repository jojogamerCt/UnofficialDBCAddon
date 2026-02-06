/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.AxisAlignedBB
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.JRMCore.JRMCoreH;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityHealingPods
extends TileEntity {
    private int timer = 100;

    public void updateEntity() {
        if (!this.worldObj.isRemote) {
            --this.timer;
            if (this.timer <= 0) {
                float n = 1.0f;
                AxisAlignedBB aabb = this.getRenderBoundingBox();
                List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                for (int i = 0; i < list.size(); ++i) {
                    EntityPlayer player = (EntityPlayer)list.get(i);
                    int[] PlyrAttrbts = JRMCoreH.PlyrAttrbts((EntityPlayer)player);
                    byte pwr = JRMCoreH.getByte((EntityPlayer)player, (String)"jrmcPwrtyp");
                    byte rce = JRMCoreH.getByte((EntityPlayer)player, (String)"jrmcRace");
                    byte cls = JRMCoreH.getByte((EntityPlayer)player, (String)"jrmcClass");
                    int maxBody = JRMCoreH.stat((Entity)player, (int)2, (int)pwr, (int)2, (int)PlyrAttrbts[2], (int)rce, (int)cls, (float)0.0f);
                    int curBody = JRMCoreH.getInt((EntityPlayer)player, (String)"jrmcBdy");
                    int maxEnergy = JRMCoreH.stat((Entity)player, (int)5, (int)pwr, (int)5, (int)PlyrAttrbts[5], (int)rce, (int)cls, (float)JRMCoreH.SklLvl_KiBs((EntityPlayer)player, (int)pwr));
                    int curEnergy = JRMCoreH.getInt((EntityPlayer)player, (String)"jrmcEnrgy");
                    int maxStam = JRMCoreH.stat((Entity)player, (int)2, (int)pwr, (int)3, (int)PlyrAttrbts[2], (int)rce, (int)cls, (float)0.0f);
                    int curStam = JRMCoreH.getInt((EntityPlayer)player, (String)"jrmcStamina");
                    float damage = 20.0f - player.getHealth();
                    if ((float)curBody - damage > 0.0f) {
                        player.setHealth(player.getHealth() + damage);
                    }
                    if (curBody < maxBody) {
                        float body = curBody + DBCConfig.healingpodhealingrate;
                        JRMCoreH.setInt((float)(body > (float)maxBody ? (float)maxBody : body), (EntityPlayer)player, (String)"jrmcBdy");
                    }
                    if (curEnergy < maxEnergy) {
                        float energy = curEnergy + DBCConfig.healingpodhealingrate;
                        JRMCoreH.setInt((float)(energy > (float)maxEnergy ? (float)maxEnergy : energy), (EntityPlayer)player, (String)"jrmcEnrgy");
                    }
                    if (curStam < maxStam) {
                        float stam = curStam + DBCConfig.healingpodhealingrate;
                        JRMCoreH.setInt((float)(stam > (float)maxStam ? (float)maxStam : stam), (EntityPlayer)player, (String)"jrmcStamina");
                    }
                    if (!player.getFoodStats().needFood()) continue;
                    player.getFoodStats().addStats(1, 0.5f);
                }
                this.timer = 100;
            }
        }
        super.updateEntity();
    }

    public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
    }
}

