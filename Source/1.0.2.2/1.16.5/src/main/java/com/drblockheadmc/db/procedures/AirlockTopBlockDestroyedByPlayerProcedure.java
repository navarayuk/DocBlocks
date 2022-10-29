package com.drblockheadmc.db.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import java.util.Map;

import com.drblockheadmc.db.block.TardisAirlockOpenedBlock;
import com.drblockheadmc.db.block.TardisAirlockDarkOpenedBlock;
import com.drblockheadmc.db.block.TardisAirlockDarkClosedBlock;
import com.drblockheadmc.db.block.TardisAirlockClosedBlock;
import com.drblockheadmc.db.DbMod;

public class AirlockTopBlockDestroyedByPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure AirlockTopBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DbMod.LOGGER.warn("Failed to load dependency x for procedure AirlockTopBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DbMod.LOGGER.warn("Failed to load dependency y for procedure AirlockTopBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DbMod.LOGGER.warn("Failed to load dependency z for procedure AirlockTopBlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == TardisAirlockDarkOpenedBlock.block
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == TardisAirlockDarkClosedBlock.block) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1.5), z, new ItemStack(TardisAirlockDarkClosedBlock.block));
				entityToSpawn.setPickupDelay((int) 5);
				world.addEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == TardisAirlockOpenedBlock.block
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == TardisAirlockClosedBlock.block) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1.5), z, new ItemStack(TardisAirlockClosedBlock.block));
				entityToSpawn.setPickupDelay((int) 5);
				world.addEntity(entityToSpawn);
			}
		}
		world.setBlockState(new BlockPos(x, y - 1, z), Blocks.AIR.getDefaultState(), 3);
	}
}
