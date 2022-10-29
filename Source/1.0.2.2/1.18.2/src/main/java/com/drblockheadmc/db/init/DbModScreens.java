
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.drblockheadmc.db.client.gui.BuilderLightGUIScreen;
import com.drblockheadmc.db.client.gui.BuilderLightDoorsGUIScreen;
import com.drblockheadmc.db.client.gui.BuilderLightBaseGUIScreen;
import com.drblockheadmc.db.client.gui.BuiderLightCorridorGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DbModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DbModMenus.BUILDER_LIGHT_GUI, BuilderLightGUIScreen::new);
			MenuScreens.register(DbModMenus.BUIDER_LIGHT_CORRIDOR_GUI, BuiderLightCorridorGUIScreen::new);
			MenuScreens.register(DbModMenus.BUILDER_LIGHT_BASE_GUI, BuilderLightBaseGUIScreen::new);
			MenuScreens.register(DbModMenus.BUILDER_LIGHT_DOORS_GUI, BuilderLightDoorsGUIScreen::new);
		});
	}
}
