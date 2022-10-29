
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import com.drblockheadmc.db.world.biome.EmptyBiome;
import com.drblockheadmc.db.DbMod;

public class DbModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, DbMod.MODID);
	public static final RegistryObject<Biome> EMPTY = REGISTRY.register("empty", () -> EmptyBiome.createBiome());
}
