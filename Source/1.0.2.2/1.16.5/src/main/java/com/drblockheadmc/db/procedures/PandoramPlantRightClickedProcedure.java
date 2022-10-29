package com.drblockheadmc.db.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import java.util.Map;

import com.drblockheadmc.db.block.PandoramBlock;
import com.drblockheadmc.db.DbMod;

public class PandoramPlantRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure PandoramPlantRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DbMod.LOGGER.warn("Failed to load dependency x for procedure PandoramPlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DbMod.LOGGER.warn("Failed to load dependency y for procedure PandoramPlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DbMod.LOGGER.warn("Failed to load dependency z for procedure PandoramPlantRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure PandoramPlantRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean done = false;
		done = (false);
		if (!((world instanceof World) ? ((World) world).isDaytime() : false)
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == PandoramBlock.block.asItem()) {
			if (world.canBlockSeeSky(new BlockPos(x, y, z))) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
						|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == PandoramBlock.block.asItem()) {
					if (world.isAirBlock(new BlockPos(x, y + 1, z))) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						world.setBlockState(new BlockPos(x, y + 1, z), PandoramBlock.block.getDefaultState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
						}
						done = (true);
					}
					if (world.isAirBlock(new BlockPos(x, y + 2, z)) && !done) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						world.setBlockState(new BlockPos(x, y + 2, z), PandoramBlock.block.getDefaultState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
						}
						done = (true);
					}
					if (world.isAirBlock(new BlockPos(x, y + 3, z)) && !done) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						world.setBlockState(new BlockPos(x, y + 3, z), PandoramBlock.block.getDefaultState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
						}
						done = (true);
					}
					if (world.isAirBlock(new BlockPos(x, y + 4, z)) && !done) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						world.setBlockState(new BlockPos(x, y + 4, z), PandoramBlock.block.getDefaultState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
						}
						done = (true);
					}
					if (world.isAirBlock(new BlockPos(x, y + 5, z)) && !done) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						world.setBlockState(new BlockPos(x, y + 5, z), PandoramBlock.block.getDefaultState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
						}
						done = (true);
					}
					if (world.isAirBlock(new BlockPos(x, y + 6, z)) && !done) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						world.setBlockState(new BlockPos(x, y + 6, z), PandoramBlock.block.getDefaultState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
						}
						done = (true);
					}
					if (world.isAirBlock(new BlockPos(x, y + 7, z)) && !done) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						world.setBlockState(new BlockPos(x, y + 7, z), PandoramBlock.block.getDefaultState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
						}
						done = (true);
					}
					if (world.isAirBlock(new BlockPos(x, y + 8, z)) && !done) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						world.setBlockState(new BlockPos(x, y + 8, z), PandoramBlock.block.getDefaultState(), 3);
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayerEntity) {
									return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
								} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
									NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
											.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
									return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
						}
						done = (true);
					}
				}
			}
		}
	}
}
