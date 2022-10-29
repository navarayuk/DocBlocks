
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import com.drblockheadmc.db.DbMod;

public class DbModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, DbMod.MODID);
	public static final RegistryObject<PaintingVariant> TARDIS_VIEW = REGISTRY.register("tardis_view", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> CANDY_SHOP_SIGN = REGISTRY.register("candy_shop_sign", () -> new PaintingVariant(48, 16));
}
