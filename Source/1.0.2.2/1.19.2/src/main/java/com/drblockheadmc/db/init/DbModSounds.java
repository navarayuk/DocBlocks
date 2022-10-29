
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.drblockheadmc.db.DbMod;

public class DbModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DbMod.MODID);
	public static final RegistryObject<SoundEvent> DONGLEDO = REGISTRY.register("dongledo",
			() -> new SoundEvent(new ResourceLocation("db", "dongledo")));
	public static final RegistryObject<SoundEvent> SONIC = REGISTRY.register("sonic", () -> new SoundEvent(new ResourceLocation("db", "sonic")));
	public static final RegistryObject<SoundEvent> LOG363 = REGISTRY.register("log363", () -> new SoundEvent(new ResourceLocation("db", "log363")));
	public static final RegistryObject<SoundEvent> BLUEBOXLAND = REGISTRY.register("blueboxland",
			() -> new SoundEvent(new ResourceLocation("db", "blueboxland")));
	public static final RegistryObject<SoundEvent> SUGER9_YES_MASTER = REGISTRY.register("suger9_yes_master",
			() -> new SoundEvent(new ResourceLocation("db", "suger9_yes_master")));
	public static final RegistryObject<SoundEvent> TILL = REGISTRY.register("till", () -> new SoundEvent(new ResourceLocation("db", "till")));
	public static final RegistryObject<SoundEvent> AIRLOCK = REGISTRY.register("airlock",
			() -> new SoundEvent(new ResourceLocation("db", "airlock")));
	public static final RegistryObject<SoundEvent> CORE = REGISTRY.register("core", () -> new SoundEvent(new ResourceLocation("db", "core")));
}
