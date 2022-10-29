
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.drblockheadmc.db.item.TimeLordSealItem;
import com.drblockheadmc.db.item.ThePostmanTardisKeyOpenItem;
import com.drblockheadmc.db.item.ThePostManTardisKeyItem;
import com.drblockheadmc.db.item.SweetCaneItem;
import com.drblockheadmc.db.item.SugarcaneAndBottleItem;
import com.drblockheadmc.db.item.SugarCubeItem;
import com.drblockheadmc.db.item.SugarCaneJuiceItem;
import com.drblockheadmc.db.item.SugarCaneDonglePlusItem;
import com.drblockheadmc.db.item.SugarCaneDongleItem;
import com.drblockheadmc.db.item.QuantumSonicDongleItem;
import com.drblockheadmc.db.item.QuantumShardItem;
import com.drblockheadmc.db.item.QuantumNuggetItem;
import com.drblockheadmc.db.item.QuantumKeyBladeItem;
import com.drblockheadmc.db.item.QuantumCrystalItem;
import com.drblockheadmc.db.item.PandoramSwordItem;
import com.drblockheadmc.db.item.PandoramPickaxeItem;
import com.drblockheadmc.db.item.PandoramNuggetItem;
import com.drblockheadmc.db.item.PandoramCaneShovelItem;
import com.drblockheadmc.db.item.PandoramCanePickaxeItem;
import com.drblockheadmc.db.item.PandoramCaneIngotShovelItem;
import com.drblockheadmc.db.item.PandoramCaneIngotItem;
import com.drblockheadmc.db.item.PandoramCaneAxeItem;
import com.drblockheadmc.db.item.PandoramCaneArmorItem;
import com.drblockheadmc.db.item.PandoramAxeItem;
import com.drblockheadmc.db.item.MoltenPandoramItem;
import com.drblockheadmc.db.item.HeartOfCaneItem;
import com.drblockheadmc.db.item.GoldenSugarCaneJuiceItem;
import com.drblockheadmc.db.item.CreativeIconItem;
import com.drblockheadmc.db.item.CaneOfQuantumPickaxeItem;
import com.drblockheadmc.db.item.CaneOfQuantumItem;
import com.drblockheadmc.db.item.CaneOfPandoramItem;
import com.drblockheadmc.db.item.CaneOfDestinyItem;
import com.drblockheadmc.db.DbMod;

public class DbModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DbMod.MODID);
	public static final RegistryObject<Item> PANDORAM_NUGGET = REGISTRY.register("pandoram_nugget", () -> new PandoramNuggetItem());
	public static final RegistryObject<Item> PANDORAM = block(DbModBlocks.PANDORAM, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> PANDORAM_CANE_INGOT = REGISTRY.register("pandoram_cane_ingot", () -> new PandoramCaneIngotItem());
	public static final RegistryObject<Item> CARBOARD_BOX_STARTER_BOX = block(DbModBlocks.CARBOARD_BOX_STARTER_BOX, null);
	public static final RegistryObject<Item> QUANTUM_SHARD = REGISTRY.register("quantum_shard", () -> new QuantumShardItem());
	public static final RegistryObject<Item> QUANTUM_NUGGET = REGISTRY.register("quantum_nugget", () -> new QuantumNuggetItem());
	public static final RegistryObject<Item> QUANTUM_CRYSTAL = REGISTRY.register("quantum_crystal", () -> new QuantumCrystalItem());
	public static final RegistryObject<Item> SWEET_CANE = REGISTRY.register("sweet_cane", () -> new SweetCaneItem());
	public static final RegistryObject<Item> SUGAR_CANE_BAIL = block(DbModBlocks.SUGAR_CANE_BAIL, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> SUGAR_CANE_JUICE = REGISTRY.register("sugar_cane_juice", () -> new SugarCaneJuiceItem());
	public static final RegistryObject<Item> GOLDEN_SUGAR_CANE_JUICE = REGISTRY.register("golden_sugar_cane_juice",
			() -> new GoldenSugarCaneJuiceItem());
	public static final RegistryObject<Item> THE_POST_MAN_TARDIS_KEY = REGISTRY.register("the_post_man_tardis_key",
			() -> new ThePostManTardisKeyItem());
	public static final RegistryObject<Item> CARDBOARD = block(DbModBlocks.CARDBOARD, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> SUGAR_CUBE = REGISTRY.register("sugar_cube", () -> new SugarCubeItem());
	public static final RegistryObject<Item> PANDORAM_BAIL = block(DbModBlocks.PANDORAM_BAIL, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> MOLTEN_PANDORAM_BUCKET = REGISTRY.register("molten_pandoram_bucket", () -> new MoltenPandoramItem());
	public static final RegistryObject<Item> SUGER_9_MARK_2 = block(DbModBlocks.SUGER_9_MARK_2, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> PANDORAM_CANE_INGOT_BLOCK = block(DbModBlocks.PANDORAM_CANE_INGOT_BLOCK, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> HEART_OF_CANE = REGISTRY.register("heart_of_cane", () -> new HeartOfCaneItem());
	public static final RegistryObject<Item> PANDORAM_CANE_ARMOR_HELMET = REGISTRY.register("pandoram_cane_armor_helmet",
			() -> new PandoramCaneArmorItem.Helmet());
	public static final RegistryObject<Item> PANDORAM_CANE_ARMOR_CHESTPLATE = REGISTRY.register("pandoram_cane_armor_chestplate",
			() -> new PandoramCaneArmorItem.Chestplate());
	public static final RegistryObject<Item> PANDORAM_CANE_ARMOR_LEGGINGS = REGISTRY.register("pandoram_cane_armor_leggings",
			() -> new PandoramCaneArmorItem.Leggings());
	public static final RegistryObject<Item> PANDORAM_CANE_ARMOR_BOOTS = REGISTRY.register("pandoram_cane_armor_boots",
			() -> new PandoramCaneArmorItem.Boots());
	public static final RegistryObject<Item> PANDORAM_CANE_INGONT_STEPS = block(DbModBlocks.PANDORAM_CANE_INGONT_STEPS, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> PANDORAM_CANE_INGOT_TRAPDOOR = block(DbModBlocks.PANDORAM_CANE_INGOT_TRAPDOOR, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> PANDORAM_CANE_INGOT_SLABS = block(DbModBlocks.PANDORAM_CANE_INGOT_SLABS, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> PANDORAM_CANE_INGOT_DOOR = doubleBlock(DbModBlocks.PANDORAM_CANE_INGOT_DOOR, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> QUANTUM_CRYSTAL_BLOCK = block(DbModBlocks.QUANTUM_CRYSTAL_BLOCK, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> PANDORAM_CANE_INGOT_WALL = block(DbModBlocks.PANDORAM_CANE_INGOT_WALL, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> SUGARCANE_AND_BOTTLE = REGISTRY.register("sugarcane_and_bottle", () -> new SugarcaneAndBottleItem());
	public static final RegistryObject<Item> CANDY_SHELF = block(DbModBlocks.CANDY_SHELF, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TILL = block(DbModBlocks.TILL, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TARDIS_EGG_LIGHT = block(DbModBlocks.TARDIS_EGG_LIGHT, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TARDIS_AUDIO_PANEL = block(DbModBlocks.TARDIS_AUDIO_PANEL, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TARDIS_WIRE_PANEL = block(DbModBlocks.TARDIS_WIRE_PANEL, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TARDIS_LOAD_STONE = block(DbModBlocks.TARDIS_LOAD_STONE, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TARDIS_MONITOR_PANEL = block(DbModBlocks.TARDIS_MONITOR_PANEL, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> END_PORTAL_NULLED = block(DbModBlocks.END_PORTAL_NULLED, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> CARDBOARD_TRAPDOOR = block(DbModBlocks.CARDBOARD_TRAPDOOR, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> CARDBOARD_DOOR = doubleBlock(DbModBlocks.CARDBOARD_DOOR, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TARDIS_CORE = block(DbModBlocks.TARDIS_CORE, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TARDIS_MOB_SCANNER = block(DbModBlocks.TARDIS_MOB_SCANNER, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> CARDBOARD_FULL = block(DbModBlocks.CARDBOARD_FULL, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TIME_LORD_SEAL = REGISTRY.register("time_lord_seal", () -> new TimeLordSealItem());
	public static final RegistryObject<Item> PANDORAM_INFUSED_COBBLESTONE = block(DbModBlocks.PANDORAM_INFUSED_COBBLESTONE, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TARDIS_AIRLOCK_DARK_CLOSED = block(DbModBlocks.TARDIS_AIRLOCK_DARK_CLOSED, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> TARDIS_WALL_DARK = block(DbModBlocks.TARDIS_WALL_DARK, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> BUILDER_TARDIS_WALL_DARK = block(DbModBlocks.BUILDER_TARDIS_WALL_DARK, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> TARDIS_WALL_DARK_STAIRS = block(DbModBlocks.TARDIS_WALL_DARK_STAIRS, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> TARDIS_WALL_DARK_SMALL_WALL = block(DbModBlocks.TARDIS_WALL_DARK_SMALL_WALL, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> TARDIS_WALL_DARK_SLAB = block(DbModBlocks.TARDIS_WALL_DARK_SLAB, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> TARDIS_WALL_DARK_TRAPDOOR = block(DbModBlocks.TARDIS_WALL_DARK_TRAPDOOR, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> SMOOTH_TARDIS_WALL_DARK = block(DbModBlocks.SMOOTH_TARDIS_WALL_DARK, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> BUILDER_SMOOTH_TARDIS_WELL_DARK = block(DbModBlocks.BUILDER_SMOOTH_TARDIS_WELL_DARK,
			DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> SMOOTH_TARDIS_WALL_DARK_STAIRS = block(DbModBlocks.SMOOTH_TARDIS_WALL_DARK_STAIRS,
			DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> SMOOTH_TARDIS_SMALL_WALL_DARK = block(DbModBlocks.SMOOTH_TARDIS_SMALL_WALL_DARK, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> SMOOTH_TARDIS_WALL_DARK_SLAB = block(DbModBlocks.SMOOTH_TARDIS_WALL_DARK_SLAB, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> SMOOTH_TARDIS_WALL_TRAPDOOR = block(DbModBlocks.SMOOTH_TARDIS_WALL_TRAPDOOR, DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> TARDIS_WALL_DARK_PRESSURE_PLATE = block(DbModBlocks.TARDIS_WALL_DARK_PRESSURE_PLATE,
			DbModTabs.TAB_DB_DARK);
	public static final RegistryObject<Item> TARDIS_AIRLOCK_CLOSED = block(DbModBlocks.TARDIS_AIRLOCK_CLOSED, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT = block(DbModBlocks.TARDIS_WALL_LIGHT, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> BUILDER_TARDIS_WALL_LIGHT = block(DbModBlocks.BUILDER_TARDIS_WALL_LIGHT, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_STAIRS = block(DbModBlocks.TARDIS_WALL_LIGHT_STAIRS, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_SMALL_WALL = block(DbModBlocks.TARDIS_WALL_LIGHT_SMALL_WALL, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_SLAB = block(DbModBlocks.TARDIS_WALL_LIGHT_SLAB, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_TRAPDOOR = block(DbModBlocks.TARDIS_WALL_LIGHT_TRAPDOOR, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> SMOOTH_TARDIS_WALL_LIGHT = block(DbModBlocks.SMOOTH_TARDIS_WALL_LIGHT, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> BUILDER_SMOOTH_TARDIS_WALL_LIGHT = block(DbModBlocks.BUILDER_SMOOTH_TARDIS_WALL_LIGHT,
			DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> SMOOTH_TARDIS_WALL_LIGHT_STAIRS = block(DbModBlocks.SMOOTH_TARDIS_WALL_LIGHT_STAIRS,
			DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> SMOOTH_TARDIS_WALL_LIGHT_SMALL_WALL = block(DbModBlocks.SMOOTH_TARDIS_WALL_LIGHT_SMALL_WALL,
			DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> SMOOTH_WALL_LIGHT_SLAB = block(DbModBlocks.SMOOTH_WALL_LIGHT_SLAB, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> SMOOTH_TARDIS_WALL_LIGHT_TRAPDOOR = block(DbModBlocks.SMOOTH_TARDIS_WALL_LIGHT_TRAPDOOR,
			DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_LIGHT_PRESSUREPLATE = block(DbModBlocks.TARDIS_LIGHT_PRESSUREPLATE, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> PANDORAM_PICKAXE = REGISTRY.register("pandoram_pickaxe", () -> new PandoramPickaxeItem());
	public static final RegistryObject<Item> PANDORAM_AXE = REGISTRY.register("pandoram_axe", () -> new PandoramAxeItem());
	public static final RegistryObject<Item> PANDORAM_CANE_INGOT_SHOVEL = REGISTRY.register("pandoram_cane_ingot_shovel",
			() -> new PandoramCaneIngotShovelItem());
	public static final RegistryObject<Item> PANDORAM_CANE_PICKAXE = REGISTRY.register("pandoram_cane_pickaxe", () -> new PandoramCanePickaxeItem());
	public static final RegistryObject<Item> PANDORAM_CANE_AXE = REGISTRY.register("pandoram_cane_axe", () -> new PandoramCaneAxeItem());
	public static final RegistryObject<Item> PANDORAM_CANE_SHOVEL = REGISTRY.register("pandoram_cane_shovel", () -> new PandoramCaneShovelItem());
	public static final RegistryObject<Item> CANE_OF_QUANTUM_PICKAXE = REGISTRY.register("cane_of_quantum_pickaxe",
			() -> new CaneOfQuantumPickaxeItem());
	public static final RegistryObject<Item> SUGAR_CANE_DONGLE = REGISTRY.register("sugar_cane_dongle", () -> new SugarCaneDongleItem());
	public static final RegistryObject<Item> SUGAR_CANE_DONGLE_PLUS = REGISTRY.register("sugar_cane_dongle_plus",
			() -> new SugarCaneDonglePlusItem());
	public static final RegistryObject<Item> QUANTUM_SONIC_DONGLE = REGISTRY.register("quantum_sonic_dongle", () -> new QuantumSonicDongleItem());
	public static final RegistryObject<Item> PANDORAM_SWORD = REGISTRY.register("pandoram_sword", () -> new PandoramSwordItem());
	public static final RegistryObject<Item> CANE_OF_PANDORAM = REGISTRY.register("cane_of_pandoram", () -> new CaneOfPandoramItem());
	public static final RegistryObject<Item> CANE_OF_QUANTUM = REGISTRY.register("cane_of_quantum", () -> new CaneOfQuantumItem());
	public static final RegistryObject<Item> CANE_OF_DESTINY = REGISTRY.register("cane_of_destiny", () -> new CaneOfDestinyItem());
	public static final RegistryObject<Item> QUANTUM_KEY_BLADE = REGISTRY.register("quantum_key_blade", () -> new QuantumKeyBladeItem());
	public static final RegistryObject<Item> CREATIVE_ICON = REGISTRY.register("creative_icon", () -> new CreativeIconItem());
	public static final RegistryObject<Item> THE_POST_MAN_TARDIS = block(DbModBlocks.THE_POST_MAN_TARDIS, null);
	public static final RegistryObject<Item> THE_POSTMAN_TARDIS_KEY_OPEN = REGISTRY.register("the_postman_tardis_key_open",
			() -> new ThePostmanTardisKeyOpenItem());
	public static final RegistryObject<Item> THE_POST_MAN_TARDIS_FIX = block(DbModBlocks.THE_POST_MAN_TARDIS_FIX, null);
	public static final RegistryObject<Item> TARDIS_AIRLOCK_OPENED = block(DbModBlocks.TARDIS_AIRLOCK_OPENED, null);
	public static final RegistryObject<Item> AIRLOCK_TOP = block(DbModBlocks.AIRLOCK_TOP, null);
	public static final RegistryObject<Item> AIRLOCK_TOP_OPEN = block(DbModBlocks.AIRLOCK_TOP_OPEN, null);
	public static final RegistryObject<Item> TARDIS_AIRLOCK_DARK_OPENED = block(DbModBlocks.TARDIS_AIRLOCK_DARK_OPENED, null);
	public static final RegistryObject<Item> TARDIS_PLAQUE = block(DbModBlocks.TARDIS_PLAQUE, DbModTabs.TAB_DOC_BLOCKS);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_FOUR_BRICK = block(DbModBlocks.TARDIS_WALL_LIGHT_FOUR_BRICK, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_PILLER_BRICK = block(DbModBlocks.TARDIS_WALL_LIGHT_PILLER_BRICK,
			DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_BRICKS = block(DbModBlocks.TARDIS_WALL_LIGHT_BRICKS, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_MOSSY_BRICKS = block(DbModBlocks.TARDIS_WALL_LIGHT_MOSSY_BRICKS,
			DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_CHISELED = block(DbModBlocks.TARDIS_WALL_LIGHT_CHISELED, DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_CHISELED_BRICKS = block(DbModBlocks.TARDIS_WALL_LIGHT_CHISELED_BRICKS,
			DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_CHISELED_PILLER = block(DbModBlocks.TARDIS_WALL_LIGHT_CHISELED_PILLER,
			DbModTabs.TAB_DB_LIGHT);
	public static final RegistryObject<Item> TARDIS_WALL_LIGHT_BOOKSHELF = block(DbModBlocks.TARDIS_WALL_LIGHT_BOOKSHELF, DbModTabs.TAB_DOC_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
