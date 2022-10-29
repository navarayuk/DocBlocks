package com.drblockheadmc.db.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import com.drblockheadmc.db.init.DbModBlocks;

public class AirlockTopBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DbModBlocks.TARDIS_AIRLOCK_DARK_OPENED.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DbModBlocks.TARDIS_AIRLOCK_DARK_CLOSED.get()) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, (y - 1.5), z, new ItemStack(DbModBlocks.TARDIS_AIRLOCK_DARK_CLOSED.get()));
				entityToSpawn.setPickUpDelay(5);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DbModBlocks.TARDIS_AIRLOCK_OPENED.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DbModBlocks.TARDIS_AIRLOCK_CLOSED.get()) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, (y - 1.5), z, new ItemStack(DbModBlocks.TARDIS_AIRLOCK_CLOSED.get()));
				entityToSpawn.setPickUpDelay(5);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
