package com.drblockheadmc.db.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import com.drblockheadmc.db.network.DbModVariables;

@Mod.EventBusSubscriber
public class BuildingBlockTrickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).PlaceN > 0) {
			if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).PlaceN == 1) {
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.NORTH) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "dongleonenb"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 3,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 3,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
											.setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.SOUTH) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "dongleonenb"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 3,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 3,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.EAST) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "dongleonenb"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 6,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 3),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 6,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 3),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.WEST) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "dongleonenb"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 3),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 3),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
			if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).PlaceN == 2) {
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.NORTH) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "dongletwoa"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 6,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 6,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.SOUTH) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "dongletwoa"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 6,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 6,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.EAST) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "dongletwoa"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 6),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 6),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
											.setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.WEST) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "dongletwoa"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 6),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 6),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
			if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).PlaceN == 3) {
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.NORTH) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "donglesonicd"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 7,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 18),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 7,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 18),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.EAST) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "donglesonicd"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 18,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 7),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 18,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 7),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.SOUTH) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "donglesonicd"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 7,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 18),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 7,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 18),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.WEST) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "donglesonicd"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 18,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 7),
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 18,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 7),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
											.setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
			{
				double _setval = 0;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlaceN = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlaceX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlaceY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlaceZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
