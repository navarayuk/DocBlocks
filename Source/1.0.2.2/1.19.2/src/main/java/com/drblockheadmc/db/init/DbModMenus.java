
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.drblockheadmc.db.world.inventory.BuilderLightGUIMenu;
import com.drblockheadmc.db.world.inventory.BuilderLightDoorsGUIMenu;
import com.drblockheadmc.db.world.inventory.BuilderLightBaseGUIMenu;
import com.drblockheadmc.db.world.inventory.BuiderLightCorridorGUIMenu;
import com.drblockheadmc.db.DbMod;

public class DbModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DbMod.MODID);
	public static final RegistryObject<MenuType<BuilderLightGUIMenu>> BUILDER_LIGHT_GUI = REGISTRY.register("builder_light_gui",
			() -> IForgeMenuType.create(BuilderLightGUIMenu::new));
	public static final RegistryObject<MenuType<BuiderLightCorridorGUIMenu>> BUIDER_LIGHT_CORRIDOR_GUI = REGISTRY
			.register("buider_light_corridor_gui", () -> IForgeMenuType.create(BuiderLightCorridorGUIMenu::new));
	public static final RegistryObject<MenuType<BuilderLightBaseGUIMenu>> BUILDER_LIGHT_BASE_GUI = REGISTRY.register("builder_light_base_gui",
			() -> IForgeMenuType.create(BuilderLightBaseGUIMenu::new));
	public static final RegistryObject<MenuType<BuilderLightDoorsGUIMenu>> BUILDER_LIGHT_DOORS_GUI = REGISTRY.register("builder_light_doors_gui",
			() -> IForgeMenuType.create(BuilderLightDoorsGUIMenu::new));
}
