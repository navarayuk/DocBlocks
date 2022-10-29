
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import com.drblockheadmc.db.fluid.MoltenPandoramFluid;
import com.drblockheadmc.db.DbMod;

public class DbModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, DbMod.MODID);
	public static final RegistryObject<FlowingFluid> MOLTEN_PANDORAM = REGISTRY.register("molten_pandoram", () -> new MoltenPandoramFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PANDORAM = REGISTRY.register("flowing_molten_pandoram",
			() -> new MoltenPandoramFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MOLTEN_PANDORAM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLTEN_PANDORAM.get(), RenderType.translucent());
		}
	}
}
