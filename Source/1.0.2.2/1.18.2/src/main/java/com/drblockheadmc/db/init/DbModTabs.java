
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DbModTabs {
	public static CreativeModeTab TAB_DOC_BLOCKS;
	public static CreativeModeTab TAB_DB_LIGHT;
	public static CreativeModeTab TAB_DB_DARK;
	public static CreativeModeTab TAB_DB_WEAPONS;
	public static CreativeModeTab TAB_DB_TOOLS;

	public static void load() {
		TAB_DOC_BLOCKS = new CreativeModeTab("tabdoc_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DbModItems.CREATIVE_ICON.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_DB_LIGHT = new CreativeModeTab("tabdb_light") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DbModBlocks.TARDIS_AIRLOCK_CLOSED.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_DB_DARK = new CreativeModeTab("tabdb_dark") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DbModBlocks.TARDIS_AIRLOCK_DARK_CLOSED.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_DB_WEAPONS = new CreativeModeTab("tabdb_weapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DbModItems.CANE_OF_DESTINY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_DB_TOOLS = new CreativeModeTab("tabdb_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DbModItems.CANE_OF_QUANTUM_PICKAXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
