package com.drblockheadmc.db.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import com.drblockheadmc.db.init.DbModBlocks;

public class PandoramPlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean done = false;
		done = false;
		if (!(world instanceof Level _lvl && _lvl.isDay()) || (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == DbModBlocks.PANDORAM.get().asItem()) {
			if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DbModBlocks.PANDORAM
								.get().asItem()) {
					if (world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.setBlock(new BlockPos(x, y + 1, z), DbModBlocks.PANDORAM.get().defaultBlockState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
						}
						done = true;
					}
					if (world.isEmptyBlock(new BlockPos(x, y + 2, z)) && !done) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.setBlock(new BlockPos(x, y + 2, z), DbModBlocks.PANDORAM.get().defaultBlockState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
						}
						done = true;
					}
					if (world.isEmptyBlock(new BlockPos(x, y + 3, z)) && !done) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.setBlock(new BlockPos(x, y + 3, z), DbModBlocks.PANDORAM.get().defaultBlockState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
						}
						done = true;
					}
					if (world.isEmptyBlock(new BlockPos(x, y + 4, z)) && !done) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.setBlock(new BlockPos(x, y + 4, z), DbModBlocks.PANDORAM.get().defaultBlockState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
						}
						done = true;
					}
					if (world.isEmptyBlock(new BlockPos(x, y + 5, z)) && !done) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.setBlock(new BlockPos(x, y + 5, z), DbModBlocks.PANDORAM.get().defaultBlockState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
						}
						done = true;
					}
					if (world.isEmptyBlock(new BlockPos(x, y + 6, z)) && !done) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.setBlock(new BlockPos(x, y + 6, z), DbModBlocks.PANDORAM.get().defaultBlockState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
						}
						done = true;
					}
					if (world.isEmptyBlock(new BlockPos(x, y + 7, z)) && !done) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.setBlock(new BlockPos(x, y + 7, z), DbModBlocks.PANDORAM.get().defaultBlockState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
						}
						done = true;
					}
					if (world.isEmptyBlock(new BlockPos(x, y + 8, z)) && !done) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.setBlock(new BlockPos(x, y + 8, z), DbModBlocks.PANDORAM.get().defaultBlockState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
													.getGameMode() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
						}
						done = true;
					}
				}
			}
		}
	}
}
