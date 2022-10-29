package com.drblockheadmc.db.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Util;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.server.MinecraftServer;

import java.util.Map;

import com.drblockheadmc.db.DbMod;

public class TillOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure TillOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DbMod.LOGGER.warn("Failed to load dependency x for procedure TillOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DbMod.LOGGER.warn("Failed to load dependency y for procedure TillOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DbMod.LOGGER.warn("Failed to load dependency z for procedure TillOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Direction dd = Direction.NORTH;
		double power = 0;
		double bx = 0;
		double bz = 0;
		double by = 0;
		boolean done = false;
		power = 0;
		done = (false);
		if ((world instanceof World) ? ((World) world).isBlockPowered(new BlockPos(x, y, z)) : false) {
			power = Math.round((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x, y + 1, z), Direction.UP) : 0);
			if (power >= 1 && !done) {
				dd = Direction.UP;
				bx = x;
				by = (y + 1);
				bz = z;
				done = (true);
			}
			power = Math.round((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x, y - 1, z), Direction.DOWN) : 0);
			if (power >= 1 && !done) {
				dd = Direction.DOWN;
				bx = x;
				by = (y - 1);
				bz = z;
				done = (true);
			}
			power = Math.round((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x, y, z + 1), Direction.SOUTH) : 0);
			if (power >= 1 && !done) {
				dd = Direction.SOUTH;
				bx = x;
				by = y;
				bz = (z + 1);
				done = (true);
			}
			power = Math.round((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x, y, z - 1), Direction.NORTH) : 0);
			if (power >= 1 && !done) {
				dd = Direction.NORTH;
				bx = x;
				by = y;
				bz = (z - 1);
				done = (true);
			}
			power = Math.round((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x + 1, y, z), Direction.EAST) : 0);
			if (power >= 1 && !done) {
				dd = Direction.EAST;
				bx = (x + 1);
				by = y;
				bz = z;
				done = (true);
			}
			power = Math.round((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x - 1, y, z), Direction.WEST) : 0);
			if (power >= 1 && !done) {
				dd = Direction.WEST;
				bx = (x - 1);
				by = y;
				bz = z;
				done = (true);
			}
		}
		if (power > 0) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;

				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					System.out.println("");
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 2);
			if (power == ((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(bx, by, bz), dd) : 0)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:till")),
							SoundCategory.BLOCKS, (float) 3, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:till")),
							SoundCategory.BLOCKS, (float) 3, (float) 1, false);
				}
			}
		}
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent(("Power: " + power + ", "
						+ ((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x, y + 1, z), Direction.UP) : 0) + " up, "
						+ ((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x, y - 1, z), Direction.DOWN) : 0) + " down, "
						+ ((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x, y, z - 1), Direction.NORTH) : 0) + " north, "
						+ ((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x, y, z + 1), Direction.SOUTH) : 0) + " south, "
						+ ((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x + 1, y, z), Direction.EAST) : 0) + " east, "
						+ ((world instanceof World) ? ((World) world).getRedstonePower(new BlockPos(x - 1, y, z), Direction.WEST) : 0) + " west.")),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
