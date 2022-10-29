
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.drblockheadmc.db.block.TillBlock;
import com.drblockheadmc.db.block.ThePostManTardisFixBlock;
import com.drblockheadmc.db.block.ThePostManTardisBlock;
import com.drblockheadmc.db.block.TardisWirePanelBlock;
import com.drblockheadmc.db.block.TardisWallLightTrapdoorBlock;
import com.drblockheadmc.db.block.TardisWallLightStairsBlock;
import com.drblockheadmc.db.block.TardisWallLightSmallWallBlock;
import com.drblockheadmc.db.block.TardisWallLightSlabBlock;
import com.drblockheadmc.db.block.TardisWallLightPillerBrickBlock;
import com.drblockheadmc.db.block.TardisWallLightMossyBricksBlock;
import com.drblockheadmc.db.block.TardisWallLightFourBrickBlock;
import com.drblockheadmc.db.block.TardisWallLightChiseledPillerBlock;
import com.drblockheadmc.db.block.TardisWallLightChiseledBricksBlock;
import com.drblockheadmc.db.block.TardisWallLightChiseledBlock;
import com.drblockheadmc.db.block.TardisWallLightBricksBlock;
import com.drblockheadmc.db.block.TardisWallLightBookshelfBlock;
import com.drblockheadmc.db.block.TardisWallLightBlock;
import com.drblockheadmc.db.block.TardisWallDarkTrapdoorBlock;
import com.drblockheadmc.db.block.TardisWallDarkStairsBlock;
import com.drblockheadmc.db.block.TardisWallDarkSmallWallBlock;
import com.drblockheadmc.db.block.TardisWallDarkSlabBlock;
import com.drblockheadmc.db.block.TardisWallDarkPressurePlateBlock;
import com.drblockheadmc.db.block.TardisWallDarkBlock;
import com.drblockheadmc.db.block.TardisPlaqueBlock;
import com.drblockheadmc.db.block.TardisMonitorPanelBlock;
import com.drblockheadmc.db.block.TardisMobScannerBlock;
import com.drblockheadmc.db.block.TardisLoadStoneBlock;
import com.drblockheadmc.db.block.TardisLightPressureplateBlock;
import com.drblockheadmc.db.block.TardisEggLightBlock;
import com.drblockheadmc.db.block.TardisCoreBlock;
import com.drblockheadmc.db.block.TardisAudioPanelBlock;
import com.drblockheadmc.db.block.TardisAirlockOpenedBlock;
import com.drblockheadmc.db.block.TardisAirlockDarkOpenedBlock;
import com.drblockheadmc.db.block.TardisAirlockDarkClosedBlock;
import com.drblockheadmc.db.block.TardisAirlockClosedBlock;
import com.drblockheadmc.db.block.Suger9Mark2Block;
import com.drblockheadmc.db.block.SugarCaneBailBlock;
import com.drblockheadmc.db.block.SmoothWallLightSlabBlock;
import com.drblockheadmc.db.block.SmoothTardisWallTrapdoorBlock;
import com.drblockheadmc.db.block.SmoothTardisWallLightTrapdoorBlock;
import com.drblockheadmc.db.block.SmoothTardisWallLightStairsBlock;
import com.drblockheadmc.db.block.SmoothTardisWallLightSmallWallBlock;
import com.drblockheadmc.db.block.SmoothTardisWallLightBlock;
import com.drblockheadmc.db.block.SmoothTardisWallDarkStairsBlock;
import com.drblockheadmc.db.block.SmoothTardisWallDarkSlabBlock;
import com.drblockheadmc.db.block.SmoothTardisWallDarkBlock;
import com.drblockheadmc.db.block.SmoothTardisSmallWallDarkBlock;
import com.drblockheadmc.db.block.QuantumCrystalBlockBlock;
import com.drblockheadmc.db.block.PandoramInfusedCobblestoneBlock;
import com.drblockheadmc.db.block.PandoramCaneIngotWallBlock;
import com.drblockheadmc.db.block.PandoramCaneIngotTrapdoorBlock;
import com.drblockheadmc.db.block.PandoramCaneIngotSlabsBlock;
import com.drblockheadmc.db.block.PandoramCaneIngotDoorBlock;
import com.drblockheadmc.db.block.PandoramCaneIngotBlockBlock;
import com.drblockheadmc.db.block.PandoramCaneIngontStepsBlock;
import com.drblockheadmc.db.block.PandoramBlock;
import com.drblockheadmc.db.block.PandoramBailBlock;
import com.drblockheadmc.db.block.MoltenPandoramBlock;
import com.drblockheadmc.db.block.EndPortalNulledBlock;
import com.drblockheadmc.db.block.CardboardTrapdoorBlock;
import com.drblockheadmc.db.block.CardboardFullBlock;
import com.drblockheadmc.db.block.CardboardDoorBlock;
import com.drblockheadmc.db.block.CardboardBlock;
import com.drblockheadmc.db.block.CarboardBoxStarterBoxBlock;
import com.drblockheadmc.db.block.CandyShelfBlock;
import com.drblockheadmc.db.block.BuilderTardisWallLightBlock;
import com.drblockheadmc.db.block.BuilderTardisWallDarkBlock;
import com.drblockheadmc.db.block.BuilderSmoothTardisWellDarkBlock;
import com.drblockheadmc.db.block.BuilderSmoothTardisWallLightBlock;
import com.drblockheadmc.db.block.AirlockTopOpenBlock;
import com.drblockheadmc.db.block.AirlockTopBlock;
import com.drblockheadmc.db.DbMod;

public class DbModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DbMod.MODID);
	public static final RegistryObject<Block> PANDORAM = REGISTRY.register("pandoram", () -> new PandoramBlock());
	public static final RegistryObject<Block> CARBOARD_BOX_STARTER_BOX = REGISTRY.register("carboard_box_starter_box",
			() -> new CarboardBoxStarterBoxBlock());
	public static final RegistryObject<Block> SUGAR_CANE_BAIL = REGISTRY.register("sugar_cane_bail", () -> new SugarCaneBailBlock());
	public static final RegistryObject<Block> CARDBOARD = REGISTRY.register("cardboard", () -> new CardboardBlock());
	public static final RegistryObject<Block> PANDORAM_BAIL = REGISTRY.register("pandoram_bail", () -> new PandoramBailBlock());
	public static final RegistryObject<Block> MOLTEN_PANDORAM = REGISTRY.register("molten_pandoram", () -> new MoltenPandoramBlock());
	public static final RegistryObject<Block> SUGER_9_MARK_2 = REGISTRY.register("suger_9_mark_2", () -> new Suger9Mark2Block());
	public static final RegistryObject<Block> PANDORAM_CANE_INGOT_BLOCK = REGISTRY.register("pandoram_cane_ingot_block",
			() -> new PandoramCaneIngotBlockBlock());
	public static final RegistryObject<Block> PANDORAM_CANE_INGONT_STEPS = REGISTRY.register("pandoram_cane_ingont_steps",
			() -> new PandoramCaneIngontStepsBlock());
	public static final RegistryObject<Block> PANDORAM_CANE_INGOT_TRAPDOOR = REGISTRY.register("pandoram_cane_ingot_trapdoor",
			() -> new PandoramCaneIngotTrapdoorBlock());
	public static final RegistryObject<Block> PANDORAM_CANE_INGOT_SLABS = REGISTRY.register("pandoram_cane_ingot_slabs",
			() -> new PandoramCaneIngotSlabsBlock());
	public static final RegistryObject<Block> PANDORAM_CANE_INGOT_DOOR = REGISTRY.register("pandoram_cane_ingot_door",
			() -> new PandoramCaneIngotDoorBlock());
	public static final RegistryObject<Block> QUANTUM_CRYSTAL_BLOCK = REGISTRY.register("quantum_crystal_block",
			() -> new QuantumCrystalBlockBlock());
	public static final RegistryObject<Block> PANDORAM_CANE_INGOT_WALL = REGISTRY.register("pandoram_cane_ingot_wall",
			() -> new PandoramCaneIngotWallBlock());
	public static final RegistryObject<Block> CANDY_SHELF = REGISTRY.register("candy_shelf", () -> new CandyShelfBlock());
	public static final RegistryObject<Block> TILL = REGISTRY.register("till", () -> new TillBlock());
	public static final RegistryObject<Block> TARDIS_EGG_LIGHT = REGISTRY.register("tardis_egg_light", () -> new TardisEggLightBlock());
	public static final RegistryObject<Block> TARDIS_AUDIO_PANEL = REGISTRY.register("tardis_audio_panel", () -> new TardisAudioPanelBlock());
	public static final RegistryObject<Block> TARDIS_WIRE_PANEL = REGISTRY.register("tardis_wire_panel", () -> new TardisWirePanelBlock());
	public static final RegistryObject<Block> TARDIS_LOAD_STONE = REGISTRY.register("tardis_load_stone", () -> new TardisLoadStoneBlock());
	public static final RegistryObject<Block> TARDIS_MONITOR_PANEL = REGISTRY.register("tardis_monitor_panel", () -> new TardisMonitorPanelBlock());
	public static final RegistryObject<Block> END_PORTAL_NULLED = REGISTRY.register("end_portal_nulled", () -> new EndPortalNulledBlock());
	public static final RegistryObject<Block> CARDBOARD_TRAPDOOR = REGISTRY.register("cardboard_trapdoor", () -> new CardboardTrapdoorBlock());
	public static final RegistryObject<Block> CARDBOARD_DOOR = REGISTRY.register("cardboard_door", () -> new CardboardDoorBlock());
	public static final RegistryObject<Block> TARDIS_CORE = REGISTRY.register("tardis_core", () -> new TardisCoreBlock());
	public static final RegistryObject<Block> TARDIS_MOB_SCANNER = REGISTRY.register("tardis_mob_scanner", () -> new TardisMobScannerBlock());
	public static final RegistryObject<Block> CARDBOARD_FULL = REGISTRY.register("cardboard_full", () -> new CardboardFullBlock());
	public static final RegistryObject<Block> PANDORAM_INFUSED_COBBLESTONE = REGISTRY.register("pandoram_infused_cobblestone",
			() -> new PandoramInfusedCobblestoneBlock());
	public static final RegistryObject<Block> TARDIS_AIRLOCK_DARK_CLOSED = REGISTRY.register("tardis_airlock_dark_closed",
			() -> new TardisAirlockDarkClosedBlock());
	public static final RegistryObject<Block> TARDIS_WALL_DARK = REGISTRY.register("tardis_wall_dark", () -> new TardisWallDarkBlock());
	public static final RegistryObject<Block> BUILDER_TARDIS_WALL_DARK = REGISTRY.register("builder_tardis_wall_dark",
			() -> new BuilderTardisWallDarkBlock());
	public static final RegistryObject<Block> TARDIS_WALL_DARK_STAIRS = REGISTRY.register("tardis_wall_dark_stairs",
			() -> new TardisWallDarkStairsBlock());
	public static final RegistryObject<Block> TARDIS_WALL_DARK_SMALL_WALL = REGISTRY.register("tardis_wall_dark_small_wall",
			() -> new TardisWallDarkSmallWallBlock());
	public static final RegistryObject<Block> TARDIS_WALL_DARK_SLAB = REGISTRY.register("tardis_wall_dark_slab", () -> new TardisWallDarkSlabBlock());
	public static final RegistryObject<Block> TARDIS_WALL_DARK_TRAPDOOR = REGISTRY.register("tardis_wall_dark_trapdoor",
			() -> new TardisWallDarkTrapdoorBlock());
	public static final RegistryObject<Block> SMOOTH_TARDIS_WALL_DARK = REGISTRY.register("smooth_tardis_wall_dark",
			() -> new SmoothTardisWallDarkBlock());
	public static final RegistryObject<Block> BUILDER_SMOOTH_TARDIS_WELL_DARK = REGISTRY.register("builder_smooth_tardis_well_dark",
			() -> new BuilderSmoothTardisWellDarkBlock());
	public static final RegistryObject<Block> SMOOTH_TARDIS_WALL_DARK_STAIRS = REGISTRY.register("smooth_tardis_wall_dark_stairs",
			() -> new SmoothTardisWallDarkStairsBlock());
	public static final RegistryObject<Block> SMOOTH_TARDIS_SMALL_WALL_DARK = REGISTRY.register("smooth_tardis_small_wall_dark",
			() -> new SmoothTardisSmallWallDarkBlock());
	public static final RegistryObject<Block> SMOOTH_TARDIS_WALL_DARK_SLAB = REGISTRY.register("smooth_tardis_wall_dark_slab",
			() -> new SmoothTardisWallDarkSlabBlock());
	public static final RegistryObject<Block> SMOOTH_TARDIS_WALL_TRAPDOOR = REGISTRY.register("smooth_tardis_wall_trapdoor",
			() -> new SmoothTardisWallTrapdoorBlock());
	public static final RegistryObject<Block> TARDIS_WALL_DARK_PRESSURE_PLATE = REGISTRY.register("tardis_wall_dark_pressure_plate",
			() -> new TardisWallDarkPressurePlateBlock());
	public static final RegistryObject<Block> TARDIS_AIRLOCK_CLOSED = REGISTRY.register("tardis_airlock_closed",
			() -> new TardisAirlockClosedBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT = REGISTRY.register("tardis_wall_light", () -> new TardisWallLightBlock());
	public static final RegistryObject<Block> BUILDER_TARDIS_WALL_LIGHT = REGISTRY.register("builder_tardis_wall_light",
			() -> new BuilderTardisWallLightBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_STAIRS = REGISTRY.register("tardis_wall_light_stairs",
			() -> new TardisWallLightStairsBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_SMALL_WALL = REGISTRY.register("tardis_wall_light_small_wall",
			() -> new TardisWallLightSmallWallBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_SLAB = REGISTRY.register("tardis_wall_light_slab",
			() -> new TardisWallLightSlabBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_TRAPDOOR = REGISTRY.register("tardis_wall_light_trapdoor",
			() -> new TardisWallLightTrapdoorBlock());
	public static final RegistryObject<Block> SMOOTH_TARDIS_WALL_LIGHT = REGISTRY.register("smooth_tardis_wall_light",
			() -> new SmoothTardisWallLightBlock());
	public static final RegistryObject<Block> BUILDER_SMOOTH_TARDIS_WALL_LIGHT = REGISTRY.register("builder_smooth_tardis_wall_light",
			() -> new BuilderSmoothTardisWallLightBlock());
	public static final RegistryObject<Block> SMOOTH_TARDIS_WALL_LIGHT_STAIRS = REGISTRY.register("smooth_tardis_wall_light_stairs",
			() -> new SmoothTardisWallLightStairsBlock());
	public static final RegistryObject<Block> SMOOTH_TARDIS_WALL_LIGHT_SMALL_WALL = REGISTRY.register("smooth_tardis_wall_light_small_wall",
			() -> new SmoothTardisWallLightSmallWallBlock());
	public static final RegistryObject<Block> SMOOTH_WALL_LIGHT_SLAB = REGISTRY.register("smooth_wall_light_slab",
			() -> new SmoothWallLightSlabBlock());
	public static final RegistryObject<Block> SMOOTH_TARDIS_WALL_LIGHT_TRAPDOOR = REGISTRY.register("smooth_tardis_wall_light_trapdoor",
			() -> new SmoothTardisWallLightTrapdoorBlock());
	public static final RegistryObject<Block> TARDIS_LIGHT_PRESSUREPLATE = REGISTRY.register("tardis_light_pressureplate",
			() -> new TardisLightPressureplateBlock());
	public static final RegistryObject<Block> THE_POST_MAN_TARDIS = REGISTRY.register("the_post_man_tardis", () -> new ThePostManTardisBlock());
	public static final RegistryObject<Block> THE_POST_MAN_TARDIS_FIX = REGISTRY.register("the_post_man_tardis_fix",
			() -> new ThePostManTardisFixBlock());
	public static final RegistryObject<Block> TARDIS_AIRLOCK_OPENED = REGISTRY.register("tardis_airlock_opened",
			() -> new TardisAirlockOpenedBlock());
	public static final RegistryObject<Block> AIRLOCK_TOP = REGISTRY.register("airlock_top", () -> new AirlockTopBlock());
	public static final RegistryObject<Block> AIRLOCK_TOP_OPEN = REGISTRY.register("airlock_top_open", () -> new AirlockTopOpenBlock());
	public static final RegistryObject<Block> TARDIS_AIRLOCK_DARK_OPENED = REGISTRY.register("tardis_airlock_dark_opened",
			() -> new TardisAirlockDarkOpenedBlock());
	public static final RegistryObject<Block> TARDIS_PLAQUE = REGISTRY.register("tardis_plaque", () -> new TardisPlaqueBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_FOUR_BRICK = REGISTRY.register("tardis_wall_light_four_brick",
			() -> new TardisWallLightFourBrickBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_PILLER_BRICK = REGISTRY.register("tardis_wall_light_piller_brick",
			() -> new TardisWallLightPillerBrickBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_BRICKS = REGISTRY.register("tardis_wall_light_bricks",
			() -> new TardisWallLightBricksBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_MOSSY_BRICKS = REGISTRY.register("tardis_wall_light_mossy_bricks",
			() -> new TardisWallLightMossyBricksBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_CHISELED = REGISTRY.register("tardis_wall_light_chiseled",
			() -> new TardisWallLightChiseledBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_CHISELED_BRICKS = REGISTRY.register("tardis_wall_light_chiseled_bricks",
			() -> new TardisWallLightChiseledBricksBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_CHISELED_PILLER = REGISTRY.register("tardis_wall_light_chiseled_piller",
			() -> new TardisWallLightChiseledPillerBlock());
	public static final RegistryObject<Block> TARDIS_WALL_LIGHT_BOOKSHELF = REGISTRY.register("tardis_wall_light_bookshelf",
			() -> new TardisWallLightBookshelfBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PandoramBlock.registerRenderLayer();
			CardboardBlock.registerRenderLayer();
			Suger9Mark2Block.registerRenderLayer();
			CandyShelfBlock.registerRenderLayer();
			TillBlock.registerRenderLayer();
			TardisEggLightBlock.registerRenderLayer();
			TardisAudioPanelBlock.registerRenderLayer();
			TardisWirePanelBlock.registerRenderLayer();
			TardisMonitorPanelBlock.registerRenderLayer();
			TardisCoreBlock.registerRenderLayer();
			TardisMobScannerBlock.registerRenderLayer();
			CardboardFullBlock.registerRenderLayer();
			TardisAirlockDarkClosedBlock.registerRenderLayer();
			TardisAirlockClosedBlock.registerRenderLayer();
			ThePostManTardisBlock.registerRenderLayer();
			ThePostManTardisFixBlock.registerRenderLayer();
			TardisAirlockOpenedBlock.registerRenderLayer();
			AirlockTopBlock.registerRenderLayer();
			AirlockTopOpenBlock.registerRenderLayer();
			TardisAirlockDarkOpenedBlock.registerRenderLayer();
			TardisPlaqueBlock.registerRenderLayer();
		}
	}
}
