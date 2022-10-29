package com.drblockheadmc.db.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.Property;
import net.minecraft.block.BlockState;

import java.util.Map;

import com.drblockheadmc.db.block.TardisAirlockOpenedBlock;
import com.drblockheadmc.db.block.TardisAirlockDarkOpenedBlock;
import com.drblockheadmc.db.block.TardisAirlockDarkClosedBlock;
import com.drblockheadmc.db.block.TardisAirlockClosedBlock;
import com.drblockheadmc.db.block.AirlockTopBlock;
import com.drblockheadmc.db.DbMod;

public class TardisAirlockOpenedRedstoneOffProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure TardisAirlockOpenedRedstoneOff!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DbMod.LOGGER.warn("Failed to load dependency x for procedure TardisAirlockOpenedRedstoneOff!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DbMod.LOGGER.warn("Failed to load dependency y for procedure TardisAirlockOpenedRedstoneOff!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DbMod.LOGGER.warn("Failed to load dependency z for procedure TardisAirlockOpenedRedstoneOff!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (new Object() {
			public boolean getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "redstone")) {
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putBoolean("redstone", (false));
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == TardisAirlockDarkOpenedBlock.block) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = TardisAirlockDarkClosedBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos(x, y + 1, z);
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
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == TardisAirlockOpenedBlock.block) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
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
				{
					BlockPos _bp = new BlockPos(x, y + 1, z);
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
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:airlock")),
						SoundCategory.BLOCKS, (float) 2, (float) 2);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:airlock")),
						SoundCategory.BLOCKS, (float) 2, (float) 2, false);
			}
		}
	}
}
