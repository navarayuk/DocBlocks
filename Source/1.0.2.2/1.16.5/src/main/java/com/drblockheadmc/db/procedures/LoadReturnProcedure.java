package com.drblockheadmc.db.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

import com.drblockheadmc.db.DbModVariables;
import com.drblockheadmc.db.DbMod;

public class LoadReturnProcedure {
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
				DbMod.LOGGER.warn("Failed to load dependency world for procedure LoadReturn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure LoadReturn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.world.getDimensionKey()) == (World.OVERWORLD)
				&& (entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).wastardis) {
			{
				boolean _setval = (false);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.wastardis = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
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
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate(
								((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbModVariables.PlayerVariables())).LoadStoneX),
								((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbModVariables.PlayerVariables())).LoadStoneY),
								((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbModVariables.PlayerVariables())).LoadStoneZ));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbModVariables.PlayerVariables())).LoadStoneX),
									((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbModVariables.PlayerVariables())).LoadStoneY),
									((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbModVariables.PlayerVariables())).LoadStoneZ),
									_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(Effects.BLINDNESS);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 6);
		}
	}
}
