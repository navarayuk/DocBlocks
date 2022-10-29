package com.drblockheadmc.db.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.Property;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import java.util.Map;

import com.drblockheadmc.db.block.TardisAirlockClosedBlock;
import com.drblockheadmc.db.block.AirlockTopBlock;
import com.drblockheadmc.db.DbMod;

public class PlaceLightAirlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure PlaceLightAirlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DbMod.LOGGER.warn("Failed to load dependency x for procedure PlaceLightAirlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DbMod.LOGGER.warn("Failed to load dependency y for procedure PlaceLightAirlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DbMod.LOGGER.warn("Failed to load dependency z for procedure PlaceLightAirlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure PlaceLightAirlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		{
			BlockPos _bp = new BlockPos(x, y, z);
			BlockState _bs = AirlockTopBlock.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_property != null && _bs.get(_property) != null)
					try {
						_bs = _bs.with(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos(x, y - 1, z);
			BlockState _bs = TardisAirlockClosedBlock.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_property != null && _bs.get(_property) != null)
					try {
						_bs = _bs.with(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlockState(_bp, _bs, 3);
		}
		try {
			BlockState _bs = world.getBlockState(new BlockPos(x, y, z));
			DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
			if (_property != null) {
				world.setBlockState(new BlockPos(x, y, z), _bs.with(_property, (entity.getHorizontalFacing())), 3);
			} else {
				world.setBlockState(new BlockPos(x, y, z),
						_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"),
								(entity.getHorizontalFacing()).getAxis()),
						3);
			}
		} catch (Exception e) {
		}
		try {
			BlockState _bs = world.getBlockState(new BlockPos(x, y - 1, z));
			DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
			if (_property != null) {
				world.setBlockState(new BlockPos(x, y - 1, z), _bs.with(_property, (entity.getHorizontalFacing())), 3);
			} else {
				world.setBlockState(new BlockPos(x, y - 1, z),
						_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"),
								(entity.getHorizontalFacing()).getAxis()),
						3);
			}
		} catch (Exception e) {
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
