/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.p.DBC.DBCPspacepod1
 *  JinRyuu.JRMCore.p.PD
 *  cpw.mods.fml.common.network.IGuiHandler
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.Gui.DBCGuiArtGravDev;
import JinRyuu.DragonBC.common.Gui.DBCGuiSpacePod01;
import JinRyuu.DragonBC.common.Gui.DBCKiGui;
import JinRyuu.DragonBC.common.Gui.DBCSAAGui;
import JinRyuu.DragonBC.common.Gui.DBCTalkGui;
import JinRyuu.DragonBC.common.Gui.DBCWishGui;
import JinRyuu.DragonBC.common.Render.ArtGravDevContainer;
import JinRyuu.DragonBC.common.Render.ArtGravDevTileEntity;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.p.DBC.DBCPspacepod1;
import JinRyuu.JRMCore.p.PD;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class DBCGuiHandler
implements IGuiHandler {
    public static final int ArtGravDevGui = 5;

    public Object getServerGuiElement(int id, EntityPlayer p, World world, int x, int y, int z) {
        if (id == 5) {
            TileEntity tile_entity = world.getTileEntity(x, y, z);
            return new ArtGravDevContainer(p.inventory, (ArtGravDevTileEntity)tile_entity);
        }
        if (id == 13) {
            PD.sendTo((IMessage)new DBCPspacepod1(JRMCoreH.getInt((EntityPlayer)p, (String)"DBCSenzu")), (EntityPlayerMP)((EntityPlayerMP)p));
        }
        return null;
    }

    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(x, y, z);
        Object Gui2 = null;
        if (id == 0) {
            Gui2 = new DBCGuiSpacePod01(x, y, z);
        }
        if (id == 1) {
            Gui2 = new DBCKiGui(player.getEntityData().getInteger("DBCKiCharge"));
        }
        if (id == 2) {
            Gui2 = new DBCWishGui(1);
        }
        if (id == 3) {
            Gui2 = new DBCWishGui(2);
        }
        if (id == 5) {
            Gui2 = new DBCGuiArtGravDev(player.inventory, (ArtGravDevTileEntity)te);
        }
        if (id == 6) {
            Gui2 = new DBCSAAGui(1);
        }
        if (id == 7) {
            Gui2 = new DBCSAAGui(5);
        }
        if (id >= 10) {
            Gui2 = new DBCTalkGui(id, world, x, y, z);
        }
        return Gui2;
    }
}

