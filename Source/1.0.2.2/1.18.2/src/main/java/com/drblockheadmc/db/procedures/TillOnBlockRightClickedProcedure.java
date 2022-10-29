package com.drblockheadmc.db.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

import com.drblockheadmc.db.DbMod;

public class TillOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Direction dd = Direction.NORTH;
		double power = 0;
		double bx = 0;
		double bz = 0;
		double by = 0;
		boolean done = false;
		power = 0;
		done = false;
		if (world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos(x, y, z)) : false) {
			power = Math.round(world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y + 1, z), Direction.UP) : 0);
			if (power >= 1 && !done) {
				dd = Direction.UP;
				bx = x;
				by = y + 1;
				bz = z;
				done = true;
			}
			power = Math.round(world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y - 1, z), Direction.DOWN) : 0);
			if (power >= 1 && !done) {
				dd = Direction.DOWN;
				bx = x;
				by = y - 1;
				bz = z;
				done = true;
			}
			power = Math.round(world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y, z + 1), Direction.SOUTH) : 0);
			if (power >= 1 && !done) {
				dd = Direction.SOUTH;
				bx = x;
				by = y;
				bz = z + 1;
				done = true;
			}
			power = Math.round(world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y, z - 1), Direction.NORTH) : 0);
			if (power >= 1 && !done) {
				dd = Direction.NORTH;
				bx = x;
				by = y;
				bz = z - 1;
				done = true;
			}
			power = Math.round(world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x + 1, y, z), Direction.EAST) : 0);
			if (power >= 1 && !done) {
				dd = Direction.EAST;
				bx = x + 1;
				by = y;
				bz = z;
				done = true;
			}
			power = Math.round(world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x - 1, y, z), Direction.WEST) : 0);
			if (power >= 1 && !done) {
				dd = Direction.WEST;
				bx = x - 1;
				by = y;
				bz = z;
				done = true;
			}
		}
		if (power > 0) {
			class TillOnBlockRightClickedWait7 {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					this.world = world;
					MinecraftForge.EVENT_BUS.register(TillOnBlockRightClickedWait7.this);
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						TillOnBlockRightClickedWait7.this.ticks += 1;
						if (TillOnBlockRightClickedWait7.this.ticks >= TillOnBlockRightClickedWait7.this.waitTicks)
							run();
					}
				}

				private void run() {
					MinecraftForge.EVENT_BUS.unregister(TillOnBlockRightClickedWait7.this);
					DbMod.LOGGER.info("");
				}
			}
			new TillOnBlockRightClickedWait7().start(world, 2);
			if (power == (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(bx, by, bz), dd) : 0)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:till")),
								SoundSource.BLOCKS, 3, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:till")), SoundSource.BLOCKS, 3,
								1, false);
					}
				}
			}
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(("Power: " + power + ", "
						+ (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y + 1, z), Direction.UP) : 0) + " up, "
						+ (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y - 1, z), Direction.DOWN) : 0)
						+ " down, "
						+ (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y, z - 1), Direction.NORTH) : 0)
						+ " north, "
						+ (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y, z + 1), Direction.SOUTH) : 0)
						+ " south, "
						+ (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x + 1, y, z), Direction.EAST) : 0)
						+ " east, "
						+ (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x - 1, y, z), Direction.WEST) : 0)
						+ " west.")), ChatType.SYSTEM, Util.NIL_UUID);
		}
	}
}
