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

public class PlaceBaseBigBlankProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((entity.getDirection()) == Direction.EAST) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "lightbigblank"));
				if (template != null) {
					template.placeInWorld(
							_serverworld, new BlockPos(x, y - 10, z - 7), new BlockPos(x, y - 10, z - 7), new StructurePlaceSettings()
									.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.FRONT_BACK).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if ((entity.getDirection()) == Direction.WEST) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "lightbigblank"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x, y - 10, z + 7), new BlockPos(x, y - 10, z + 7),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.FRONT_BACK).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if ((entity.getDirection()) == Direction.NORTH) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "lightbigblank"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 7, y - 10, z), new BlockPos(x - 7, y - 10, z),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.FRONT_BACK).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if ((entity.getDirection()) == Direction.SOUTH) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "lightbigblank"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x + 7, y - 10, z), new BlockPos(x + 7, y - 10, z),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.FRONT_BACK).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
