
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import com.drblockheadmc.db.fluid.types.MoltenPandoramFluidType;
import com.drblockheadmc.db.DbMod;

public class DbModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, DbMod.MODID);
	public static final RegistryObject<FluidType> MOLTEN_PANDORAM_TYPE = REGISTRY.register("molten_pandoram", () -> new MoltenPandoramFluidType());
}
