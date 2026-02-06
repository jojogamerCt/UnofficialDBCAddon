/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterBabidi
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterCell
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterEnma
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterFreeza
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterGohan
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterGoku
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterGuru
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterJin
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterKaio
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterKami
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterKarin
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterPiccolo
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterRoshi
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterTrunksFuture
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterVegeta
 *  JinRyuu.DragonBC.common.Npcs.EntityMasterWhis
 *  net.minecraft.entity.player.EntityPlayerMP
 */
package JinRyuu.JRMCore.manager;

import JinRyuu.DragonBC.common.Npcs.EntityMasterBabidi;
import JinRyuu.DragonBC.common.Npcs.EntityMasterCell;
import JinRyuu.DragonBC.common.Npcs.EntityMasterEnma;
import JinRyuu.DragonBC.common.Npcs.EntityMasterFreeza;
import JinRyuu.DragonBC.common.Npcs.EntityMasterGohan;
import JinRyuu.DragonBC.common.Npcs.EntityMasterGoku;
import JinRyuu.DragonBC.common.Npcs.EntityMasterGuru;
import JinRyuu.DragonBC.common.Npcs.EntityMasterJin;
import JinRyuu.DragonBC.common.Npcs.EntityMasterKaio;
import JinRyuu.DragonBC.common.Npcs.EntityMasterKami;
import JinRyuu.DragonBC.common.Npcs.EntityMasterKarin;
import JinRyuu.DragonBC.common.Npcs.EntityMasterPiccolo;
import JinRyuu.DragonBC.common.Npcs.EntityMasterRoshi;
import JinRyuu.DragonBC.common.Npcs.EntityMasterTrunksFuture;
import JinRyuu.DragonBC.common.Npcs.EntityMasterVegeta;
import JinRyuu.DragonBC.common.Npcs.EntityMasterWhis;
import JinRyuu.JRMCore.entity.EntitySafeZone;
import net.minecraft.entity.player.EntityPlayerMP;

public class JRMCoreManagerDBC {
    public static String[] getMasterNames() {
        String[] entityNames = new String[]{"Jin", "Babidi", "Cell", "Enma", "Freeza", "Gohan", "Goku", "Guru", "Kaio", "Kami", "Karin", "Piccolo", "Roshi", "Vegeta", "Trunks", "Whis"};
        return entityNames;
    }

    public static EntitySafeZone[] getMasters(EntityPlayerMP entityplayermp) {
        EntitySafeZone[] entities = new EntitySafeZone[]{new EntityMasterJin(entityplayermp.worldObj), new EntityMasterBabidi(entityplayermp.worldObj), new EntityMasterCell(entityplayermp.worldObj), new EntityMasterEnma(entityplayermp.worldObj), new EntityMasterFreeza(entityplayermp.worldObj), new EntityMasterGohan(entityplayermp.worldObj), new EntityMasterGoku(entityplayermp.worldObj), new EntityMasterGuru(entityplayermp.worldObj), new EntityMasterKaio(entityplayermp.worldObj), new EntityMasterKami(entityplayermp.worldObj), new EntityMasterKarin(entityplayermp.worldObj), new EntityMasterPiccolo(entityplayermp.worldObj), new EntityMasterRoshi(entityplayermp.worldObj), new EntityMasterVegeta(entityplayermp.worldObj), new EntityMasterTrunksFuture(entityplayermp.worldObj), new EntityMasterWhis(entityplayermp.worldObj)};
        return entities;
    }
}

