package com.drblockheadmc.db.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class PlaceMainCorridorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDirection()) == Direction.EAST) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "tardiscorry25"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x, y - 2, z - 3), new BlockPos(x, y - 2, z - 3),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if ((entity.getDirection()) == Direction.WEST) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "tardiscorry25"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x, y - 2, z + 3), new BlockPos(x, y - 2, z + 3),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if ((entity.getDirection()) == Direction.NORTH) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "tardiscorry25"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 2, z), new BlockPos(x - 3, y - 2, z),
							new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if ((entity.getDirection()) == Direction.SOUTH) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "tardiscorry25"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 2, z), new BlockPos(x + 3, y - 2, z),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
