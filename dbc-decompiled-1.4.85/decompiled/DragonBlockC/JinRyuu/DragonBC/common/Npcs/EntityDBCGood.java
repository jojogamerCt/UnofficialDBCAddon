/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreH2
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreH2;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityDBCGood
extends EntityDBC {
    public EntityDBCGood(World par1World) {
        super(par1World);
    }

    @Override
    public void onDeath(DamageSource par1DamageSource) {
        Entity var3 = par1DamageSource.getEntity();
        if (var3 instanceof EntityPlayer) {
            int al = JRMCoreH.getByte((EntityPlayer)((EntityPlayer)var3), (String)"jrmcAlign");
            al = (al -= 20) < 0 ? 0 : al;
            JRMCoreH.setByte((int)al, (EntityPlayer)((EntityPlayer)var3), (String)"jrmcAlign");
            int kr = JRMCoreH.getInt((EntityPlayer)((EntityPlayer)var3), (String)"jrmcKarma");
            JRMCoreH.setInt((int)(kr + 1), (EntityPlayer)((EntityPlayer)var3), (String)"jrmcKarma");
            ((EntityPlayer)var3).addChatMessage(new ChatComponentTranslation(JRMCoreH.trlai((String)"dbc.moreevil.line1"), new Object[0]).setChatStyle(JRMCoreH2.styl_wht));
        }
        super.onDeath(par1DamageSource);
    }
}

