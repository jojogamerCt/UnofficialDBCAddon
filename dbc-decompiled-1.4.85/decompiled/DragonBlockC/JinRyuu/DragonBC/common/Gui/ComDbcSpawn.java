/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.server.JGEntityHelper
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.command.WrongUsageException
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.server.MinecraftServer
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.Npcs.EntityAngelAwamo;
import JinRyuu.DragonBC.common.Npcs.EntityAngelCamparri;
import JinRyuu.DragonBC.common.Npcs.EntityAngelCognac;
import JinRyuu.DragonBC.common.Npcs.EntityAngelCukatail;
import JinRyuu.DragonBC.common.Npcs.EntityAngelKorn;
import JinRyuu.DragonBC.common.Npcs.EntityAngelKusu;
import JinRyuu.DragonBC.common.Npcs.EntityAngelMarcarita;
import JinRyuu.DragonBC.common.Npcs.EntityAngelMartinu;
import JinRyuu.DragonBC.common.Npcs.EntityAngelMohito;
import JinRyuu.DragonBC.common.Npcs.EntityAngelSour;
import JinRyuu.DragonBC.common.Npcs.EntityAniraza;
import JinRyuu.DragonBC.common.Npcs.EntityBarta;
import JinRyuu.DragonBC.common.Npcs.EntityBasil;
import JinRyuu.DragonBC.common.Npcs.EntityBeerus;
import JinRyuu.DragonBC.common.Npcs.EntityBeerusMonaka;
import JinRyuu.DragonBC.common.Npcs.EntityBeerusMonaka2;
import JinRyuu.DragonBC.common.Npcs.EntityBeerusMonaka3;
import JinRyuu.DragonBC.common.Npcs.EntityBergamo;
import JinRyuu.DragonBC.common.Npcs.EntityBerryblue;
import JinRyuu.DragonBC.common.Npcs.EntityBiarra;
import JinRyuu.DragonBC.common.Npcs.EntityBorareta;
import JinRyuu.DragonBC.common.Npcs.EntityBotamo;
import JinRyuu.DragonBC.common.Npcs.EntityBrianne;
import JinRyuu.DragonBC.common.Npcs.EntityBuuBuffed;
import JinRyuu.DragonBC.common.Npcs.EntityBuuEvil;
import JinRyuu.DragonBC.common.Npcs.EntityBuuFat;
import JinRyuu.DragonBC.common.Npcs.EntityBuuFusion;
import JinRyuu.DragonBC.common.Npcs.EntityBuuKid;
import JinRyuu.DragonBC.common.Npcs.EntityBuuPiccolo;
import JinRyuu.DragonBC.common.Npcs.EntityBuuSuper;
import JinRyuu.DragonBC.common.Npcs.EntityBuuUltimate;
import JinRyuu.DragonBC.common.Npcs.EntityCabba;
import JinRyuu.DragonBC.common.Npcs.EntityCabbaSSJ;
import JinRyuu.DragonBC.common.Npcs.EntityCaulifla;
import JinRyuu.DragonBC.common.Npcs.EntityCaulifla2;
import JinRyuu.DragonBC.common.Npcs.EntityCell1;
import JinRyuu.DragonBC.common.Npcs.EntityCell2;
import JinRyuu.DragonBC.common.Npcs.EntityCell3;
import JinRyuu.DragonBC.common.Npcs.EntityCell4;
import JinRyuu.DragonBC.common.Npcs.EntityCellJr;
import JinRyuu.DragonBC.common.Npcs.EntityChampa;
import JinRyuu.DragonBC.common.Npcs.EntityCocotte;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg16;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg17;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg18;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg19;
import JinRyuu.DragonBC.common.Npcs.EntityCyborg20;
import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDBCEvil;
import JinRyuu.DragonBC.common.Npcs.EntityDarbura;
import JinRyuu.DragonBC.common.Npcs.EntityDercori;
import JinRyuu.DragonBC.common.Npcs.EntityDino01;
import JinRyuu.DragonBC.common.Npcs.EntityDino02;
import JinRyuu.DragonBC.common.Npcs.EntityDino03;
import JinRyuu.DragonBC.common.Npcs.EntityDodoria;
import JinRyuu.DragonBC.common.Npcs.EntityDyspo;
import JinRyuu.DragonBC.common.Npcs.EntityFreeza1;
import JinRyuu.DragonBC.common.Npcs.EntityFreeza2;
import JinRyuu.DragonBC.common.Npcs.EntityFreeza3;
import JinRyuu.DragonBC.common.Npcs.EntityFreeza4;
import JinRyuu.DragonBC.common.Npcs.EntityFreeza5;
import JinRyuu.DragonBC.common.Npcs.EntityFreeza6;
import JinRyuu.DragonBC.common.Npcs.EntityFreeza7;
import JinRyuu.DragonBC.common.Npcs.EntityFreezaFather;
import JinRyuu.DragonBC.common.Npcs.EntityFreezaMecha;
import JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldier1;
import JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldier2;
import JinRyuu.DragonBC.common.Npcs.EntityFreezaSoldier3;
import JinRyuu.DragonBC.common.Npcs.EntityFrost1;
import JinRyuu.DragonBC.common.Npcs.EntityFrost2;
import JinRyuu.DragonBC.common.Npcs.EntityFrost3;
import JinRyuu.DragonBC.common.Npcs.EntityFrost4;
import JinRyuu.DragonBC.common.Npcs.EntityFrost5;
import JinRyuu.DragonBC.common.Npcs.EntityFrost6;
import JinRyuu.DragonBC.common.Npcs.EntityGanos;
import JinRyuu.DragonBC.common.Npcs.EntityGanos2;
import JinRyuu.DragonBC.common.Npcs.EntityGinyu;
import JinRyuu.DragonBC.common.Npcs.EntityGodArak;
import JinRyuu.DragonBC.common.Npcs.EntityGodBelmod;
import JinRyuu.DragonBC.common.Npcs.EntityGodGiin;
import JinRyuu.DragonBC.common.Npcs.EntityGodHeles;
import JinRyuu.DragonBC.common.Npcs.EntityGodIwan;
import JinRyuu.DragonBC.common.Npcs.EntityGodLiquiir;
import JinRyuu.DragonBC.common.Npcs.EntityGodMosco;
import JinRyuu.DragonBC.common.Npcs.EntityGodQuitela;
import JinRyuu.DragonBC.common.Npcs.EntityGodRumsshi;
import JinRyuu.DragonBC.common.Npcs.EntityGodSidra;
import JinRyuu.DragonBC.common.Npcs.EntityGohan;
import JinRyuu.DragonBC.common.Npcs.EntityGohan2;
import JinRyuu.DragonBC.common.Npcs.EntityGohan_orange;
import JinRyuu.DragonBC.common.Npcs.EntityGohan_orange2;
import JinRyuu.DragonBC.common.Npcs.EntityGoku;
import JinRyuu.DragonBC.common.Npcs.EntityGoku2;
import JinRyuu.DragonBC.common.Npcs.EntityGoku3;
import JinRyuu.DragonBC.common.Npcs.EntityGoku4;
import JinRyuu.DragonBC.common.Npcs.EntityGokuBlack;
import JinRyuu.DragonBC.common.Npcs.EntityGokuBlackRose;
import JinRyuu.DragonBC.common.Npcs.EntityGuldo;
import JinRyuu.DragonBC.common.Npcs.EntityHell01;
import JinRyuu.DragonBC.common.Npcs.EntityHell02;
import JinRyuu.DragonBC.common.Npcs.EntityHit;
import JinRyuu.DragonBC.common.Npcs.EntityHop;
import JinRyuu.DragonBC.common.Npcs.EntityJeice;
import JinRyuu.DragonBC.common.Npcs.EntityJiren;
import JinRyuu.DragonBC.common.Npcs.EntityJiren2;
import JinRyuu.DragonBC.common.Npcs.EntityKahseral;
import JinRyuu.DragonBC.common.Npcs.EntityKakunsa;
import JinRyuu.DragonBC.common.Npcs.EntityKale;
import JinRyuu.DragonBC.common.Npcs.EntityKale2;
import JinRyuu.DragonBC.common.Npcs.EntityKatopesla;
import JinRyuu.DragonBC.common.Npcs.EntityKatopesla2;
import JinRyuu.DragonBC.common.Npcs.EntityKatopesla3;
import JinRyuu.DragonBC.common.Npcs.EntityKatopesla4;
import JinRyuu.DragonBC.common.Npcs.EntityKefla;
import JinRyuu.DragonBC.common.Npcs.EntityKefla2;
import JinRyuu.DragonBC.common.Npcs.EntityKiwi;
import JinRyuu.DragonBC.common.Npcs.EntityKoichiarator;
import JinRyuu.DragonBC.common.Npcs.EntityKoitsukai;
import JinRyuu.DragonBC.common.Npcs.EntityKrillin;
import JinRyuu.DragonBC.common.Npcs.EntityKunshi;
import JinRyuu.DragonBC.common.Npcs.EntityLavender;
import JinRyuu.DragonBC.common.Npcs.EntityMagetta;
import JinRyuu.DragonBC.common.Npcs.EntityMajora;
import JinRyuu.DragonBC.common.Npcs.EntityMonaka;
import JinRyuu.DragonBC.common.Npcs.EntityMurichim;
import JinRyuu.DragonBC.common.Npcs.EntityNamekian01;
import JinRyuu.DragonBC.common.Npcs.EntityNapapa;
import JinRyuu.DragonBC.common.Npcs.EntityNarirama;
import JinRyuu.DragonBC.common.Npcs.EntityObni;
import JinRyuu.DragonBC.common.Npcs.EntityPanchia;
import JinRyuu.DragonBC.common.Npcs.EntityPaparoni;
import JinRyuu.DragonBC.common.Npcs.EntityPiccolo;
import JinRyuu.DragonBC.common.Npcs.EntityPiccolo2;
import JinRyuu.DragonBC.common.Npcs.EntityPuipui;
import JinRyuu.DragonBC.common.Npcs.EntityRRMecha;
import JinRyuu.DragonBC.common.Npcs.EntityRecoome;
import JinRyuu.DragonBC.common.Npcs.EntityRoasie;
import JinRyuu.DragonBC.common.Npcs.EntityRoshi_super;
import JinRyuu.DragonBC.common.Npcs.EntityRylibeu;
import JinRyuu.DragonBC.common.Npcs.EntitySabertooth;
import JinRyuu.DragonBC.common.Npcs.EntitySaibaiman;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyan01;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyan02;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyanNappa;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyanRaditz;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyanVegeta;
import JinRyuu.DragonBC.common.Npcs.EntityShisami;
import JinRyuu.DragonBC.common.Npcs.EntityShosa;
import JinRyuu.DragonBC.common.Npcs.EntitySorbet;
import JinRyuu.DragonBC.common.Npcs.EntitySorrel;
import JinRyuu.DragonBC.common.Npcs.EntityTagoma;
import JinRyuu.DragonBC.common.Npcs.EntityToppo;
import JinRyuu.DragonBC.common.Npcs.EntityToppo2;
import JinRyuu.DragonBC.common.Npcs.EntityTrunks;
import JinRyuu.DragonBC.common.Npcs.EntityTrunks2;
import JinRyuu.DragonBC.common.Npcs.EntityTrunks_dbs;
import JinRyuu.DragonBC.common.Npcs.EntityTrunks_dbs2;
import JinRyuu.DragonBC.common.Npcs.EntityVados;
import JinRyuu.DragonBC.common.Npcs.EntityVegeta;
import JinRyuu.DragonBC.common.Npcs.EntityVegeta2;
import JinRyuu.DragonBC.common.Npcs.EntityVegeta3;
import JinRyuu.DragonBC.common.Npcs.EntityVegeta4;
import JinRyuu.DragonBC.common.Npcs.EntityVegetaCopy;
import JinRyuu.DragonBC.common.Npcs.EntityVegetaCopyBlue;
import JinRyuu.DragonBC.common.Npcs.EntityWhis;
import JinRyuu.DragonBC.common.Npcs.EntityYakon;
import JinRyuu.DragonBC.common.Npcs.EntityZamasu;
import JinRyuu.DragonBC.common.Npcs.EntityZamasu_Fused;
import JinRyuu.DragonBC.common.Npcs.EntityZamasu_Fused2;
import JinRyuu.DragonBC.common.Npcs.EntityZamasu_Fused3;
import JinRyuu.DragonBC.common.Npcs.EntityZarbon;
import JinRyuu.DragonBC.common.Npcs.EntityZarbon2;
import JinRyuu.DragonBC.common.Npcs.EntityZeno;
import JinRyuu.DragonBC.common.Npcs.db.EntityBearThief;
import JinRyuu.DragonBC.common.Npcs.db.EntityBora;
import JinRyuu.DragonBC.common.Npcs.db.EntityDBMasterRoshi;
import JinRyuu.DragonBC.common.Npcs.db.EntityDBMasterRoshi2;
import JinRyuu.DragonBC.common.Npcs.db.EntityDBMasterRoshi3;
import JinRyuu.DragonBC.common.Npcs.db.EntityOolong;
import JinRyuu.DragonBC.common.Npcs.db.EntityPuar;
import JinRyuu.DragonBC.common.Npcs.db.EntityTigerBandit;
import JinRyuu.DragonBC.common.Npcs.db.EntityUpa;
import JinRyuu.DragonBC.common.Npcs.db.EntityYajirobe;
import JinRyuu.DragonBC.common.Npcs.db.EntityYamcha;
import JinRyuu.DragonBC.common.Npcs.db.EntityYamcha2;
import JinRyuu.DragonBC.common.Npcs.db.EntityYamcha3;
import JinRyuu.DragonBC.common.Npcs.db.EntityYamcha4;
import JinRyuu.DragonBC.common.Npcs.db.EntityYamcha5;
import JinRyuu.DragonBC.common.Npcs.dbbaba.EntityDevil;
import JinRyuu.DragonBC.common.Npcs.dbbaba.EntityFortunetellerBaba;
import JinRyuu.DragonBC.common.Npcs.dbbaba.EntityGrandpaGohan;
import JinRyuu.DragonBC.common.Npcs.dbbaba.EntityGrandpaGohan2;
import JinRyuu.DragonBC.common.Npcs.dbbaba.EntityInvisibleMan;
import JinRyuu.DragonBC.common.Npcs.dbbaba.EntityMummy;
import JinRyuu.DragonBC.common.Npcs.dbbaba.EntityVampire;
import JinRyuu.DragonBC.common.Npcs.dbkingpiccolo.EntityCymbal;
import JinRyuu.DragonBC.common.Npcs.dbkingpiccolo.EntityDrum;
import JinRyuu.DragonBC.common.Npcs.dbkingpiccolo.EntityKingPiccolo;
import JinRyuu.DragonBC.common.Npcs.dbkingpiccolo.EntityKingPiccolo2;
import JinRyuu.DragonBC.common.Npcs.dbkingpiccolo.EntityPiano;
import JinRyuu.DragonBC.common.Npcs.dbkingpiccolo.EntityTambourine;
import JinRyuu.DragonBC.common.Npcs.dbpilaf.EntityMai;
import JinRyuu.DragonBC.common.Npcs.dbpilaf.EntityMaiMecha;
import JinRyuu.DragonBC.common.Npcs.dbpilaf.EntityPilaf;
import JinRyuu.DragonBC.common.Npcs.dbpilaf.EntityPilafMecha;
import JinRyuu.DragonBC.common.Npcs.dbpilaf.EntityPilafMechaCombined;
import JinRyuu.DragonBC.common.Npcs.dbpilaf.EntityShu;
import JinRyuu.DragonBC.common.Npcs.dbpilaf.EntityShuMecha;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityAndroid8;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityBuyon;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityColonelSilver;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityColonelViolet;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityCommanderRed;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityGeneralBlue;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityGeneralBlue2;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityGeneralWhite;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityGeneralWhite2;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityLaunch;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityLaunch2;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityMajorMetallitron;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityMajorMetallitron1;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityMajorMetallitron2;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityMajorMetallitron3;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityMercenaryTao;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityMercenaryTao2;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityMercenaryTao3;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityNinjaMurasaki;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityOfficerBlack;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityOfficerBlack2;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityOfficerBlack3;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbonSoldier;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbonSoldier2;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbonSoldier3;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbonSoldierB;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbonSoldierB2;
import JinRyuu.DragonBC.common.Npcs.dbredribbon.EntityRedRibbonSoldierB3;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityCheelai;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityCheelai2;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityDBSBroly1;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityDBSBroly2;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityDBSBroly3;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityDBSBroly4;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityDBSBrolyBuff;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityDBSBrolyBuffSSJ;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityDBSBrolyLegendary;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityDBSParagus;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityDBSParagus2;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.EntityLemo;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityBacterian;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityChiaotzu;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityChiaotzu2;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityChiaotzu3;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityChiaotzu4;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityGiran;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityJackieChun;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityJackieChun2;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityJackieChun3;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityKingChappa;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityManWolf;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityMasterShen;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityNam;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityPamput;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityTien;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityTien2;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityTien3;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityTien4;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityTien5;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityTien6;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityTien7;
import JinRyuu.DragonBC.common.Npcs.dbtournament.EntityTournamentAnnouncer;
import JinRyuu.DragonBC.common.Npcs.dbz.EntityOfficeOgre;
import JinRyuu.DragonBC.common.Npcs.dbz.EntityOfficeOgre2;
import JinRyuu.DragonBC.common.Npcs.dbz.EntityOfficeOgre3;
import JinRyuu.DragonBC.common.Npcs.dbz.EntityOfficeOgre4;
import JinRyuu.DragonBC.common.Npcs.dbz.EntityOfficeOgre5;
import JinRyuu.DragonBC.common.Npcs.dbz.EntitySpirit;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.server.JGEntityHelper;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;

public class ComDbcSpawn
extends CommandBase {
    public String getCommandName() {
        return "dbcspawn";
    }

    public String getCommandUsage(ICommandSender icommandsender) {
        return "Use '/dbcspawn (DBCmobName) or /dbcspawn (DBCmobName) (Health)' to spawn the DBC mobs or /dbcspawn (DBCmobName) (Health) (Damage)' to spawn the DBC mobs.";
    }

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public boolean canCommandSenderUseCommand(ICommandSender par1ICommandSender) {
        return MinecraftServer.getServer().isSinglePlayer() || super.canCommandSenderUseCommand(par1ICommandSender);
    }

    private NBTTagCompound nbt(EntityPlayer p, String s) {
        return JRMCoreH.nbt((Entity)p, (String)s);
    }

    public void processCommand(ICommandSender commandSender, String[] stringArray) {
        if (stringArray.length <= 0) {
            throw new WrongUsageException("Use '/dbcspawn (DBCmobName) or /dbcspawn (DBCmobName) (Health)' to spawn the DBC mobs or /dbcspawn (DBCmobName) (Health) (Damage)' to spawn the DBC mobs.", new Object[0]);
        }
        if (stringArray.length <= 1) {
            EntityPlayerMP entityplayermp = ComDbcSpawn.getCommandSenderAsPlayer((ICommandSender)commandSender);
            EntityDBC[] ent = this.getEntityList(entityplayermp);
            String[] entnams = this.getEntityNameList();
            String s2 = stringArray[0].toLowerCase();
            EntityDBC entity = null;
            boolean spawned = false;
            for (int i1 = 0; i1 < entnams.length; ++i1) {
                if (!entnams[i1].toLowerCase().contains(s2)) continue;
                entity = ent[i1];
                entity.setWorld(entityplayermp.worldObj);
                String[] v = DBCH.NpcSpawnLoc((int)entityplayermp.posX, (int)entityplayermp.posY, (int)entityplayermp.posZ, entityplayermp.worldObj).split(";");
                entity.setLocationAndAngles(Double.parseDouble(v[0]), Double.parseDouble(v[1]), Double.parseDouble(v[2]), 0.0f, 0.0f);
                if (entity instanceof EntityDBCEvil) {
                    ((EntityDBCEvil)entity).setSpwner((Entity)entityplayermp);
                }
                entityplayermp.worldObj.spawnEntityInWorld((Entity)entity);
                this.notifyAdmins(commandSender, "%s spawned %s!", new Object[]{entityplayermp.getCommandSenderName(), entnams[i1]});
                spawned = true;
                break;
            }
            if (!spawned) {
                this.notifyAdmins(commandSender, "%s couldn't spawn %s!", new Object[]{entityplayermp.getCommandSenderName(), s2});
            }
        } else if (stringArray.length <= 4) {
            EntityPlayerMP entityplayermp = stringArray.length > 3 ? ComDbcSpawn.getPlayer((ICommandSender)commandSender, (String)stringArray[3]) : ComDbcSpawn.getCommandSenderAsPlayer((ICommandSender)commandSender);
            String s = stringArray[0];
            String stringHealth = "";
            String stringDamage = "";
            if (stringArray.length >= 2) {
                stringHealth = stringArray[1];
                if (stringArray.length == 3) {
                    stringDamage = stringArray[2];
                }
            }
            EntityDBC[] ent = this.getEntityList(entityplayermp);
            String[] entnams = this.getEntityNameList();
            String s2 = s.toLowerCase();
            EntityDBC entity = null;
            boolean spawned = false;
            for (int i1 = 0; i1 < entnams.length; ++i1) {
                if (!entnams[i1].toLowerCase().contains(s2)) continue;
                entity = ent[i1];
                entity.setWorld(entityplayermp.worldObj);
                String[] v = DBCH.NpcSpawnLoc((int)entityplayermp.posX, (int)entityplayermp.posY, (int)entityplayermp.posZ, entityplayermp.worldObj).split(";");
                entity.setLocationAndAngles(Double.parseDouble(v[0]), Double.parseDouble(v[1]), Double.parseDouble(v[2]), 0.0f, 0.0f);
                if (entity instanceof EntityDBCEvil) {
                    ((EntityDBCEvil)entity).setSpwner((Entity)entityplayermp);
                }
                NBTTagCompound nbt = JRMCoreH.nbt((Entity)entity);
                JGEntityHelper.setAttributes((EntityLivingBase)entity, (String)stringHealth, (String)stringDamage, (String)"", (String)"", (int)1);
                entityplayermp.worldObj.spawnEntityInWorld((Entity)entity);
                this.notifyAdmins(commandSender, "%s spawned %s!", new Object[]{entityplayermp.getCommandSenderName(), entnams[i1]});
                spawned = true;
                break;
            }
            if (!spawned) {
                this.notifyAdmins(commandSender, "%s couldn't spawn %s!", new Object[]{entityplayermp.getCommandSenderName(), s2});
            }
        }
    }

    private void notifyAdmins(ICommandSender commandSender, String string, Object[] objects) {
        ComDbcSpawn.func_152373_a((ICommandSender)commandSender, (ICommand)this, (String)string, (Object[])objects);
    }

    private String[] getEntityNameList() {
        String[] entityNames = new String[]{"Nam", "Piccolo", "Piccolo2", "Raditz", "Nappa", "Vegeta", "Saibaiman", "Saiyan01", "Saiyan02", "Ogre1", "Ogre2", "Kiwi", "Dodoria", "Zarbon", "Zarbon2", "Guldo", "Recoome", "Barta", "Jeice", "Ginyu", "FreezaSoldier1", "FreezaSoldier2", "FreezaSoldier3", "Freeza1", "Freeza2", "Freeza3", "Freeza4", "Freeza5", "Freeza6", "FreezaGolden", "KingCold", "MechaFreeza", "Cyborg16", "Cyborg17", "Cyborg18", "Cyborg19", "Cyborg20", "Cell1", "Cell2", "Cell3", "Cell4", "Namekian01", "PuiPui", "Yakon", "Dabura", "BuuFat", "BuuSuper", "Dino01", "Beerus", "Dino02", "Dino03", "RRMecha1", "Sabertooth", "CellJr", "BuuEvil", "BuuFusion", "BuuPiccolo", "BuuUltimate", "BuuBuffed", "BuuKid", "Monaka", "BeerusMonaka", "BeerusMonaka2", "BeerusMonaka3", "Berryblue", "Botamo", "Champa", "Frost1", "Frost2", "Frost3", "Frost4", "Frost5", "Frost6", "Hit", "Krillin", "Magetta", "Roshi_super", "Shisami", "Sorbet", "Tagoma", "Vados", "Whis", "GokuBlack", "GokuBlackRose", "VegetaCopy", "VegetaCopyBlue", "Cabba", "CabbaSSJ", "Zamasu", "Zamasu_fused", "Zamasu_fused2", "Zamasu_fused3", "Zeno", "Goku_enemy", "Goku_enemy2", "Goku_enemy3", "Goku_enemy4", "Vegeta_enemy", "Vegeta_enemy2", "Vegeta_enemy3", "Vegeta_enemy4", "Gohan_enemy", "Gohan_enemy2", "Gohan_enemy2_1", "Gohan_enemy2_2", "Trunks_enemy", "Trunks_enemy2", "Trunks_enemy2_1", "Trunks_enemy2_2", "Awamo", "Camparri", "Cognac", "Cuktail", "Korn", "Kusu", "Marcarita", "Martinu", "Mohito", "Sour", "Arak", "Belmod", "Giin", "Heles", "Iwan", "Liquiir", "Mosco", "Quitela", "Rumsshi", "Sidra", "Basil", "Bergamo", "Lavender", "Brianne", "Caulifla", "Caulifla2", "Dyspo", "Jiren", "Jiren2", "Kale", "Kale2", "Kefla", "Kefla2", "Toppo", "Toppo2", "Aniraza", "Biarra", "Cocotte", "Dercori", "Ganos", "Ganos2", "Hop", "Kahseral", "Kakunsa", "Kunshi", "Majora", "Murichim", "Napapa", "Narirama", "Obni", "Paparoni", "Roasie", "Rylibeu", "Shosa", "Sorrel", "Borareta", "Koichiarator", "Koitsukai", "Panchia", "Katopesla", "Katopesla2", "Katopesla3", "Katopesla4", "DBSBroly", "DBSBroly2", "DBSBroly3", "DBSBroly4", "DBSBrolyBuff", "DBSBrolyBuffSSJ", "DBSBrolyLegendary", "DBSParagus", "DBSParagusOld", "Cheelai", "Cheelai2", "Lemo", "FortunetellerBaba", "BandagesTheMummy", "SeeThroughTheInvisibleMan", "FangsTheVampire", "SpikeTheDevil", "GrandpaGohan", "GrandpaGohan2", "Cymbal", "Drum", "KingPiccolo", "KingPiccolo2", "Piano", "Tambourine", "DBMasterRoshi", "DBMasterRoshi2", "DBMasterRoshi3", "BearThief", "TigerBandit", "Puar", "Yamcha", "Yamcha2", "Yamcha3", "Yamcha4", "Yamcha5", "DBMai", "DBPilaf", "DBShu", "DBMaiMecha", "DBPilafMecha", "DBShuMecha", "DBPilafMechaCombined", "Bacterian", "Giran", "JackieChun", "JackieChun2", "JackieChun3", "TournamentAnnouncer", "KingChappa", "ManWolf", "MasterShen", "Pamput", "TienShinhan", "TienShinhan2", "TienShinhan3", "Android8", "Buyon", "ColonelSilver", "ColonelViolet", "CommanderRed", "GeneralBlue", "GeneralBlue2", "GeneralWhite", "GeneralWhite2", "LaunchGood", "LaunchBad", "MajorMetallitron", "MajorMetallitron1", "MajorMetallitron2", "MajorMetallitron3", "MercenaryTao", "NinjaMurasaki", "RedRibbonSoldier", "RedRibbonSoldier2", "RedRibbonSoldier3", "RedRibbonSoldierB", "RedRibbonSoldierB2", "RedRibbonSoldierB3", "DBBora", "DBUpa", "Oolong", "Yajirobe", "MercenaryTao2", "MercenaryTao3", "OfficerBlack", "OfficerBlack2", "OfficerBlack3", "OfficeOgre", "OfficeOgre2", "OfficeOgre3", "OfficeOgre4", "OfficeOgre5", "DBZSpirit", "Chiaotzu", "Chiaotzu2", "Chiaotzu3", "Chiaotzu4", "TienShinhan4", "TienShinhan5", "TienShinhan6", "TienShinhan7"};
        return entityNames;
    }

    private EntityDBC[] getEntityList(EntityPlayerMP entityplayermp) {
        EntityDBC[] entities = new EntityDBC[]{new EntityNam(entityplayermp.worldObj), new EntityPiccolo(entityplayermp.worldObj), new EntityPiccolo2(entityplayermp.worldObj), new EntitySaiyanRaditz(entityplayermp.worldObj), new EntitySaiyanNappa(entityplayermp.worldObj), new EntitySaiyanVegeta(entityplayermp.worldObj), new EntitySaibaiman(entityplayermp.worldObj), new EntitySaiyan01(entityplayermp.worldObj), new EntitySaiyan02(entityplayermp.worldObj), new EntityHell01(entityplayermp.worldObj), new EntityHell02(entityplayermp.worldObj), new EntityKiwi(entityplayermp.worldObj), new EntityDodoria(entityplayermp.worldObj), new EntityZarbon(entityplayermp.worldObj), new EntityZarbon2(entityplayermp.worldObj), new EntityGuldo(entityplayermp.worldObj), new EntityRecoome(entityplayermp.worldObj), new EntityBarta(entityplayermp.worldObj), new EntityJeice(entityplayermp.worldObj), new EntityGinyu(entityplayermp.worldObj), new EntityFreezaSoldier1(entityplayermp.worldObj), new EntityFreezaSoldier2(entityplayermp.worldObj), new EntityFreezaSoldier3(entityplayermp.worldObj), new EntityFreeza1(entityplayermp.worldObj), new EntityFreeza2(entityplayermp.worldObj), new EntityFreeza3(entityplayermp.worldObj), new EntityFreeza4(entityplayermp.worldObj), new EntityFreeza5(entityplayermp.worldObj), new EntityFreeza6(entityplayermp.worldObj), new EntityFreeza7(entityplayermp.worldObj), new EntityFreezaFather(entityplayermp.worldObj), new EntityFreezaMecha(entityplayermp.worldObj), new EntityCyborg16(entityplayermp.worldObj), new EntityCyborg17(entityplayermp.worldObj), new EntityCyborg18(entityplayermp.worldObj), new EntityCyborg19(entityplayermp.worldObj), new EntityCyborg20(entityplayermp.worldObj), new EntityCell1(entityplayermp.worldObj), new EntityCell2(entityplayermp.worldObj), new EntityCell3(entityplayermp.worldObj), new EntityCell4(entityplayermp.worldObj), new EntityNamekian01(entityplayermp.worldObj), new EntityPuipui(entityplayermp.worldObj), new EntityYakon(entityplayermp.worldObj), new EntityDarbura(entityplayermp.worldObj), new EntityBuuFat(entityplayermp.worldObj), new EntityBuuSuper(entityplayermp.worldObj), new EntityDino01(entityplayermp.worldObj), new EntityBeerus(entityplayermp.worldObj), new EntityDino02(entityplayermp.worldObj), new EntityDino03(entityplayermp.worldObj), new EntityRRMecha(entityplayermp.worldObj), new EntitySabertooth(entityplayermp.worldObj), new EntityCellJr(entityplayermp.worldObj), new EntityBuuEvil(entityplayermp.worldObj), new EntityBuuFusion(entityplayermp.worldObj), new EntityBuuPiccolo(entityplayermp.worldObj), new EntityBuuUltimate(entityplayermp.worldObj), new EntityBuuBuffed(entityplayermp.worldObj), new EntityBuuKid(entityplayermp.worldObj), new EntityMonaka(entityplayermp.worldObj), new EntityBeerusMonaka(entityplayermp.worldObj), new EntityBeerusMonaka2(entityplayermp.worldObj), new EntityBeerusMonaka3(entityplayermp.worldObj), new EntityBerryblue(entityplayermp.worldObj), new EntityBotamo(entityplayermp.worldObj), new EntityChampa(entityplayermp.worldObj), new EntityFrost1(entityplayermp.worldObj), new EntityFrost2(entityplayermp.worldObj), new EntityFrost3(entityplayermp.worldObj), new EntityFrost4(entityplayermp.worldObj), new EntityFrost5(entityplayermp.worldObj), new EntityFrost6(entityplayermp.worldObj), new EntityHit(entityplayermp.worldObj), new EntityKrillin(entityplayermp.worldObj), new EntityMagetta(entityplayermp.worldObj), new EntityRoshi_super(entityplayermp.worldObj), new EntityShisami(entityplayermp.worldObj), new EntitySorbet(entityplayermp.worldObj), new EntityTagoma(entityplayermp.worldObj), new EntityVados(entityplayermp.worldObj), new EntityWhis(entityplayermp.worldObj), new EntityGokuBlack(entityplayermp.worldObj), new EntityGokuBlackRose(entityplayermp.worldObj), new EntityVegetaCopy(entityplayermp.worldObj), new EntityVegetaCopyBlue(entityplayermp.worldObj), new EntityCabba(entityplayermp.worldObj), new EntityCabbaSSJ(entityplayermp.worldObj), new EntityZamasu(entityplayermp.worldObj), new EntityZamasu_Fused(entityplayermp.worldObj), new EntityZamasu_Fused2(entityplayermp.worldObj), new EntityZamasu_Fused3(entityplayermp.worldObj), new EntityZeno(entityplayermp.worldObj), new EntityGoku(entityplayermp.worldObj), new EntityGoku2(entityplayermp.worldObj), new EntityGoku3(entityplayermp.worldObj), new EntityGoku4(entityplayermp.worldObj), new EntityVegeta(entityplayermp.worldObj), new EntityVegeta2(entityplayermp.worldObj), new EntityVegeta3(entityplayermp.worldObj), new EntityVegeta4(entityplayermp.worldObj), new EntityGohan(entityplayermp.worldObj), new EntityGohan2(entityplayermp.worldObj), new EntityGohan_orange(entityplayermp.worldObj), new EntityGohan_orange2(entityplayermp.worldObj), new EntityTrunks(entityplayermp.worldObj), new EntityTrunks2(entityplayermp.worldObj), new EntityTrunks_dbs(entityplayermp.worldObj), new EntityTrunks_dbs2(entityplayermp.worldObj), new EntityAngelAwamo(entityplayermp.worldObj), new EntityAngelCamparri(entityplayermp.worldObj), new EntityAngelCognac(entityplayermp.worldObj), new EntityAngelCukatail(entityplayermp.worldObj), new EntityAngelKorn(entityplayermp.worldObj), new EntityAngelKusu(entityplayermp.worldObj), new EntityAngelMarcarita(entityplayermp.worldObj), new EntityAngelMartinu(entityplayermp.worldObj), new EntityAngelMohito(entityplayermp.worldObj), new EntityAngelSour(entityplayermp.worldObj), new EntityGodArak(entityplayermp.worldObj), new EntityGodBelmod(entityplayermp.worldObj), new EntityGodGiin(entityplayermp.worldObj), new EntityGodHeles(entityplayermp.worldObj), new EntityGodIwan(entityplayermp.worldObj), new EntityGodLiquiir(entityplayermp.worldObj), new EntityGodMosco(entityplayermp.worldObj), new EntityGodQuitela(entityplayermp.worldObj), new EntityGodRumsshi(entityplayermp.worldObj), new EntityGodSidra(entityplayermp.worldObj), new EntityBasil(entityplayermp.worldObj), new EntityBergamo(entityplayermp.worldObj), new EntityLavender(entityplayermp.worldObj), new EntityBrianne(entityplayermp.worldObj), new EntityCaulifla(entityplayermp.worldObj), new EntityCaulifla2(entityplayermp.worldObj), new EntityDyspo(entityplayermp.worldObj), new EntityJiren(entityplayermp.worldObj), new EntityJiren2(entityplayermp.worldObj), new EntityKale(entityplayermp.worldObj), new EntityKale2(entityplayermp.worldObj), new EntityKefla(entityplayermp.worldObj), new EntityKefla2(entityplayermp.worldObj), new EntityToppo(entityplayermp.worldObj), new EntityToppo2(entityplayermp.worldObj), new EntityAniraza(entityplayermp.worldObj), new EntityBiarra(entityplayermp.worldObj), new EntityCocotte(entityplayermp.worldObj), new EntityDercori(entityplayermp.worldObj), new EntityGanos(entityplayermp.worldObj), new EntityGanos2(entityplayermp.worldObj), new EntityHop(entityplayermp.worldObj), new EntityKahseral(entityplayermp.worldObj), new EntityKakunsa(entityplayermp.worldObj), new EntityKunshi(entityplayermp.worldObj), new EntityMajora(entityplayermp.worldObj), new EntityMurichim(entityplayermp.worldObj), new EntityNapapa(entityplayermp.worldObj), new EntityNarirama(entityplayermp.worldObj), new EntityObni(entityplayermp.worldObj), new EntityPaparoni(entityplayermp.worldObj), new EntityRoasie(entityplayermp.worldObj), new EntityRylibeu(entityplayermp.worldObj), new EntityShosa(entityplayermp.worldObj), new EntitySorrel(entityplayermp.worldObj), new EntityBorareta(entityplayermp.worldObj), new EntityKoichiarator(entityplayermp.worldObj), new EntityKoitsukai(entityplayermp.worldObj), new EntityPanchia(entityplayermp.worldObj), new EntityKatopesla(entityplayermp.worldObj), new EntityKatopesla2(entityplayermp.worldObj), new EntityKatopesla3(entityplayermp.worldObj), new EntityKatopesla4(entityplayermp.worldObj), new EntityDBSBroly1(entityplayermp.worldObj), new EntityDBSBroly2(entityplayermp.worldObj), new EntityDBSBroly3(entityplayermp.worldObj), new EntityDBSBroly4(entityplayermp.worldObj), new EntityDBSBrolyBuff(entityplayermp.worldObj), new EntityDBSBrolyBuffSSJ(entityplayermp.worldObj), new EntityDBSBrolyLegendary(entityplayermp.worldObj), new EntityDBSParagus(entityplayermp.worldObj), new EntityDBSParagus2(entityplayermp.worldObj), new EntityCheelai(entityplayermp.worldObj), new EntityCheelai2(entityplayermp.worldObj), new EntityLemo(entityplayermp.worldObj), new EntityFortunetellerBaba(entityplayermp.worldObj), new EntityMummy(entityplayermp.worldObj), new EntityInvisibleMan(entityplayermp.worldObj), new EntityVampire(entityplayermp.worldObj), new EntityDevil(entityplayermp.worldObj), new EntityGrandpaGohan(entityplayermp.worldObj), new EntityGrandpaGohan2(entityplayermp.worldObj), new EntityCymbal(entityplayermp.worldObj), new EntityDrum(entityplayermp.worldObj), new EntityKingPiccolo(entityplayermp.worldObj), new EntityKingPiccolo2(entityplayermp.worldObj), new EntityPiano(entityplayermp.worldObj), new EntityTambourine(entityplayermp.worldObj), new EntityDBMasterRoshi(entityplayermp.worldObj), new EntityDBMasterRoshi2(entityplayermp.worldObj), new EntityDBMasterRoshi3(entityplayermp.worldObj), new EntityBearThief(entityplayermp.worldObj), new EntityTigerBandit(entityplayermp.worldObj), new EntityPuar(entityplayermp.worldObj), new EntityYamcha(entityplayermp.worldObj), new EntityYamcha2(entityplayermp.worldObj), new EntityYamcha3(entityplayermp.worldObj), new EntityYamcha4(entityplayermp.worldObj), new EntityYamcha5(entityplayermp.worldObj), new EntityMai(entityplayermp.worldObj), new EntityPilaf(entityplayermp.worldObj), new EntityShu(entityplayermp.worldObj), new EntityMaiMecha(entityplayermp.worldObj), new EntityPilafMecha(entityplayermp.worldObj), new EntityShuMecha(entityplayermp.worldObj), new EntityPilafMechaCombined(entityplayermp.worldObj), new EntityBacterian(entityplayermp.worldObj), new EntityGiran(entityplayermp.worldObj), new EntityJackieChun(entityplayermp.worldObj), new EntityJackieChun2(entityplayermp.worldObj), new EntityJackieChun3(entityplayermp.worldObj), new EntityTournamentAnnouncer(entityplayermp.worldObj), new EntityKingChappa(entityplayermp.worldObj), new EntityManWolf(entityplayermp.worldObj), new EntityMasterShen(entityplayermp.worldObj), new EntityPamput(entityplayermp.worldObj), new EntityTien(entityplayermp.worldObj), new EntityTien2(entityplayermp.worldObj), new EntityTien3(entityplayermp.worldObj), new EntityAndroid8(entityplayermp.worldObj), new EntityBuyon(entityplayermp.worldObj), new EntityColonelSilver(entityplayermp.worldObj), new EntityColonelViolet(entityplayermp.worldObj), new EntityCommanderRed(entityplayermp.worldObj), new EntityGeneralBlue(entityplayermp.worldObj), new EntityGeneralBlue2(entityplayermp.worldObj), new EntityGeneralWhite(entityplayermp.worldObj), new EntityGeneralWhite2(entityplayermp.worldObj), new EntityLaunch(entityplayermp.worldObj), new EntityLaunch2(entityplayermp.worldObj), new EntityMajorMetallitron(entityplayermp.worldObj), new EntityMajorMetallitron1(entityplayermp.worldObj), new EntityMajorMetallitron2(entityplayermp.worldObj), new EntityMajorMetallitron3(entityplayermp.worldObj), new EntityMercenaryTao(entityplayermp.worldObj), new EntityNinjaMurasaki(entityplayermp.worldObj), new EntityRedRibbonSoldier(entityplayermp.worldObj), new EntityRedRibbonSoldier2(entityplayermp.worldObj), new EntityRedRibbonSoldier3(entityplayermp.worldObj), new EntityRedRibbonSoldierB(entityplayermp.worldObj), new EntityRedRibbonSoldierB2(entityplayermp.worldObj), new EntityRedRibbonSoldierB3(entityplayermp.worldObj), new EntityBora(entityplayermp.worldObj), new EntityUpa(entityplayermp.worldObj), new EntityOolong(entityplayermp.worldObj), new EntityYajirobe(entityplayermp.worldObj), new EntityMercenaryTao2(entityplayermp.worldObj), new EntityMercenaryTao3(entityplayermp.worldObj), new EntityOfficerBlack(entityplayermp.worldObj), new EntityOfficerBlack2(entityplayermp.worldObj), new EntityOfficerBlack3(entityplayermp.worldObj), new EntityOfficeOgre(entityplayermp.worldObj), new EntityOfficeOgre2(entityplayermp.worldObj), new EntityOfficeOgre3(entityplayermp.worldObj), new EntityOfficeOgre4(entityplayermp.worldObj), new EntityOfficeOgre5(entityplayermp.worldObj), new EntitySpirit(entityplayermp.worldObj), new EntityChiaotzu(entityplayermp.worldObj), new EntityChiaotzu2(entityplayermp.worldObj), new EntityChiaotzu3(entityplayermp.worldObj), new EntityChiaotzu4(entityplayermp.worldObj), new EntityTien4(entityplayermp.worldObj), new EntityTien5(entityplayermp.worldObj), new EntityTien6(entityplayermp.worldObj), new EntityTien7(entityplayermp.worldObj)};
        return entities;
    }

    public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] arrayString) {
        int length = arrayString.length;
        switch (length) {
            case 1: {
                return ComDbcSpawn.getListOfStringsMatchingLastWord((String[])arrayString, (String[])this.getEntityNameList());
            }
            case 2: {
                return ComDbcSpawn.getListOfStringsMatchingLastWord((String[])arrayString, (String[])new String[]{"1000"});
            }
            case 3: {
                return ComDbcSpawn.getListOfStringsMatchingLastWord((String[])arrayString, (String[])new String[]{"1000"});
            }
            case 4: {
                return ComDbcSpawn.getListOfStringsMatchingLastWord((String[])arrayString, (String[])this.getListOfPlayers());
            }
        }
        return null;
    }

    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    public boolean isUsernameIndex(int id) {
        return id == 3;
    }
}

