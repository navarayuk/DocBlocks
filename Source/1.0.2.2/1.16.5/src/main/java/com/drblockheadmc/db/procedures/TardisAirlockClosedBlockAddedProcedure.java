package com.drblockheadmc.db.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.Property;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import java.util.Map;

import com.drblockheadmc.db.block.AirlockTopBlock;
import com.drblockheadmc.db.DbMod;

public class TardisAirlockClosedBlockAddedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure TardisAirlockClosedBlockAdded!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DbMod.LOGGER.warn("Failed to load dependency x for procedure TardisAirlockClosedBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DbMod.LOGGER.warn("Failed to load dependency y for procedure TardisAirlockClosedBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DbMod.LOGGER.warn("Failed to load dependency z for procedure TardisAirlockClosedBlockAdded!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlockState(new BlockPos(x, y + 1, z), AirlockTopBlock.block.getDefaultState(), 3);
			try {
				BlockState _bs = world.getBlockState(new BlockPos(x, y + 1, z));
				DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
				if (_property != null) {
					world.setBlockState(new BlockPos(x, y + 1, z), _bs.with(_property, (new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateContainer().getProperty("facing");
							if (_prop instanceof DirectionProperty)
								return _bs.get((DirectionProperty) _prop);
							_prop = _bs.getBlock().getStateContainer().getProperty("axis");
							return _prop instanceof EnumProperty && _prop.getAllowedValues().toArray()[0] instanceof Direction.Axis
									? Direction.getFacingFromAxisDirection(_bs.get((EnumProperty<Direction.Axis>) _prop),
											Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(new BlockPos(x, y, z)))))), 3);
				} else {
					world.setBlockState(new BlockPos(x, y + 1, z),
							_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
								public Direction getDirection(BlockState _bs) {
									Property<?> _prop = _bs.getBlock().getStateContainer().getProperty("facing");
									if (_prop instanceof DirectionProperty)
										return _bs.get((DirectionProperty) _prop);
									_prop = _bs.getBlock().getStateContainer().getProperty("axis");
									return _prop instanceof EnumProperty && _prop.getAllowedValues().toArray()[0] instanceof Direction.Axis
											? Direction.getFacingFromAxisDirection(_bs.get((EnumProperty<Direction.Axis>) _prop),
													Direction.AxisDirection.POSITIVE)
											: Direction.NORTH;
								}
							}.getDirection((world.getBlockState(new BlockPos(x, y, z))))).getAxis()), 3);
				}
			} catch (Exception e) {
			}
		}
	}
}
