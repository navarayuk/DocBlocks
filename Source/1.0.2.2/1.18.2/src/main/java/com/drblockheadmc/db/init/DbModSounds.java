
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DbModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("db", "dongledo"), new SoundEvent(new ResourceLocation("db", "dongledo")));
		REGISTRY.put(new ResourceLocation("db", "sonic"), new SoundEvent(new ResourceLocation("db", "sonic")));
		REGISTRY.put(new ResourceLocation("db", "log363"), new SoundEvent(new ResourceLocation("db", "log363")));
		REGISTRY.put(new ResourceLocation("db", "blueboxland"), new SoundEvent(new ResourceLocation("db", "blueboxland")));
		REGISTRY.put(new ResourceLocation("db", "suger9_yes_master"), new SoundEvent(new ResourceLocation("db", "suger9_yes_master")));
		REGISTRY.put(new ResourceLocation("db", "till"), new SoundEvent(new ResourceLocation("db", "till")));
		REGISTRY.put(new ResourceLocation("db", "airlock"), new SoundEvent(new ResourceLocation("db", "airlock")));
		REGISTRY.put(new ResourceLocation("db", "core"), new SoundEvent(new ResourceLocation("db", "core")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
