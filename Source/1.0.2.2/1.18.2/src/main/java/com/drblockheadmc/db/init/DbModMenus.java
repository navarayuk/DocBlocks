
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import com.drblockheadmc.db.world.inventory.BuilderLightGUIMenu;
import com.drblockheadmc.db.world.inventory.BuilderLightDoorsGUIMenu;
import com.drblockheadmc.db.world.inventory.BuilderLightBaseGUIMenu;
import com.drblockheadmc.db.world.inventory.BuiderLightCorridorGUIMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DbModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<BuilderLightGUIMenu> BUILDER_LIGHT_GUI = register("builder_light_gui",
			(id, inv, extraData) -> new BuilderLightGUIMenu(id, inv, extraData));
	public static final MenuType<BuiderLightCorridorGUIMenu> BUIDER_LIGHT_CORRIDOR_GUI = register("buider_light_corridor_gui",
			(id, inv, extraData) -> new BuiderLightCorridorGUIMenu(id, inv, extraData));
	public static final MenuType<BuilderLightBaseGUIMenu> BUILDER_LIGHT_BASE_GUI = register("builder_light_base_gui",
			(id, inv, extraData) -> new BuilderLightBaseGUIMenu(id, inv, extraData));
	public static final MenuType<BuilderLightDoorsGUIMenu> BUILDER_LIGHT_DOORS_GUI = register("builder_light_doors_gui",
			(id, inv, extraData) -> new BuilderLightDoorsGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
