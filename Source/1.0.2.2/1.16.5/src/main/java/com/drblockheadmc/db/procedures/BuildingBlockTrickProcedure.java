package com.drblockheadmc.db.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

import com.drblockheadmc.db.DbModVariables;
import com.drblockheadmc.db.DbMod;

public class BuildingBlockTrickProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure BuildingBlockTrick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure BuildingBlockTrick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).PlaceN > 0) {
			if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).PlaceN == 1) {
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.NORTH) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "dongleonenb"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 3,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new PlacementSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null)
											.setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.SOUTH) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "dongleonenb"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 3,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.EAST) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "dongleonenb"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 6,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 3),
									new PlacementSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null)
											.setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.WEST) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "dongleonenb"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 3),
									new PlacementSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setChunk(null)
											.setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
			}
			if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).PlaceN == 2) {
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.NORTH) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "dongletwoa"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 6,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new PlacementSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setChunk(null)
											.setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.SOUTH) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "dongletwoa"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 6,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.EAST) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "dongletwoa"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 6),
									new PlacementSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null)
											.setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.WEST) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "dongletwoa"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 6),
									new PlacementSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null)
											.setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
			}
			if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).PlaceN == 3) {
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.NORTH) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "donglesonicd"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 7,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 18),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.EAST) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "donglesonicd"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 18,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ - 7),
									new PlacementSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null)
											.setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.SOUTH) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "donglesonicd"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX + 7,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 18),
									new PlacementSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setChunk(null)
											.setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DbModVariables.PlayerVariables())).PlaceD) == Direction.WEST) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("db", "donglesonicd"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceX - 18,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceY - 9,
											(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new DbModVariables.PlayerVariables())).PlaceZ + 7),
									new PlacementSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setChunk(null)
											.setIgnoreEntities(false),
									((World) world).rand);
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
