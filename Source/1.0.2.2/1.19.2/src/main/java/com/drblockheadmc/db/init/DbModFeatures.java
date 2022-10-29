
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import com.drblockheadmc.db.world.features.plants.PandoramFeature;
import com.drblockheadmc.db.DbMod;

@Mod.EventBusSubscriber
public class DbModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DbMod.MODID);
	public static final RegistryObject<Feature<?>> PANDORAM = REGISTRY.register("pandoram", PandoramFeature::feature);
}
