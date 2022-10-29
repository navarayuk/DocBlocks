
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.drblockheadmc.db.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.drblockheadmc.db.block.entity.TardisAirlockOpenedBlockEntity;
import com.drblockheadmc.db.block.entity.TardisAirlockDarkOpenedBlockEntity;
import com.drblockheadmc.db.DbMod;

public class DbModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DbMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TARDIS_AIRLOCK_OPENED = register("tardis_airlock_opened",
			DbModBlocks.TARDIS_AIRLOCK_OPENED, TardisAirlockOpenedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TARDIS_AIRLOCK_DARK_OPENED = register("tardis_airlock_dark_opened",
			DbModBlocks.TARDIS_AIRLOCK_DARK_OPENED, TardisAirlockDarkOpenedBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
