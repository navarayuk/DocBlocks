package com.drblockheadmc.db.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import com.drblockheadmc.db.network.DbModVariables;

public class TardisLoadStoneEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean unable = false;
		unable = false;
		if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:pressure_plates")))
				|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.CAVE_AIR) {
			{
				double _setval = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(z)) - 0.5;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(x)) + 0.5;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			unable = true;
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:pressure_plates")))
				|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.CAVE_AIR) {
			{
				double _setval = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(z)) + 1.5;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(x)) + 0.5;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			unable = true;
		}
		if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:pressure_plates")))
				|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
			{
				double _setval = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(x)) - 0.5;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(z)) + 0.5;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			unable = true;
		}
		if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:pressure_plates")))
				|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
			{
				double _setval = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(x)) + 1.5;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(z)) + 0.5;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LoadStoneZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			unable = true;
		}
		{
			double _setval = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new java.text.DecimalFormat("##").format(y)) + 1;
			entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.LoadStoneY = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (unable) {
			{
				boolean _setval = new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
									.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.GameModeC = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 9999, 5, (false), (false)));
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SPECTATOR);
			if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
				ResourceKey<Level> destinationType = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("db:tardis"));
				if (_player.level.dimension() == destinationType)
					return;
				ServerLevel nextLevel = _player.server.getLevel(destinationType);
				if (nextLevel != null) {
					_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
					_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
					_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
					for (MobEffectInstance _effectinstance : _player.getActiveEffects())
						_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
					_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("[DocBlocks]: Path blocked, TARDIS failed to lock on."), (false));
		}
	}
}
