package com.drblockheadmc.db.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

import com.drblockheadmc.db.DbModVariables;
import com.drblockheadmc.db.DbMod;

public class Sugar9PlayertickProcedure {
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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure Sugar9Playertick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).s9spam) {
			if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).s9tick >= 60) {
				{
					boolean _setval = (false);
					entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.s9spam = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.s9tick = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DbModVariables.PlayerVariables())).s9tick + 1);
					entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.s9tick = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
