package com.drblockheadmc.db.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.block.Blocks;

import java.util.Map;

import com.drblockheadmc.db.DbModVariables;
import com.drblockheadmc.db.DbMod;

public class TardisLoadStoneEntityWalksOnTheBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure TardisLoadStoneEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DbMod.LOGGER.warn("Failed to load dependency x for procedure TardisLoadStoneEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DbMod.LOGGER.warn("Failed to load dependency y for procedure TardisLoadStoneEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DbMod.LOGGER.warn("Failed to load dependency z for procedure TardisLoadStoneEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure TardisLoadStoneEntityWalksOnTheBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean unable = false;
		unable = (false);
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:pressure_plates"))
				.contains((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock())
				|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.CAVE_AIR) {
			{
				double _setval = (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(z)) - 0.5);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(x)) + 0.5);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			unable = (true);
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:pressure_plates"))
				.contains((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock())
				|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.CAVE_AIR) {
			{
				double _setval = (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(z)) + 1.5);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(x)) + 0.5);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			unable = (true);
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:pressure_plates"))
				.contains((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock())
				|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
			{
				double _setval = (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(x)) - 0.5);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(z)) + 0.5);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			unable = (true);
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:pressure_plates"))
				.contains((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock())
				|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
			{
				double _setval = (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(x)) + 1.5);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(z)) + 0.5);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			unable = (true);
		}
		{
			double _setval = (new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new java.text.DecimalFormat("##").format(y)) + 1);
			entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.LoadStoneY = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (unable) {
			{
				boolean _setval = (new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayerEntity) {
							return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
						} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
							NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
									.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
							return _npi != null && _npi.getGameType() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity));
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.GameModeC = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 9999, (int) 5, (false), (false)));
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.SPECTATOR);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
					RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("db:tardis"));
					ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
					if (nextWorld != null) {
						((ServerPlayerEntity) _ent).connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
						((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
								nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
						((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
						for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
							((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
						}
						((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[DocBlocks]: Path blocked, TARDIS failed to lock on."), (false));
			}
		}
	}
}
