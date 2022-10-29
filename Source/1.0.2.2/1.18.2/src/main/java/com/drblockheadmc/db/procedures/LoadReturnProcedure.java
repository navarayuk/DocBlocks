package com.drblockheadmc.db.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;

import javax.annotation.Nullable;

import com.drblockheadmc.db.network.DbModVariables;

@Mod.EventBusSubscriber
public class LoadReturnProcedure {
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
		if ((entity.level.dimension()) == (Level.OVERWORLD)
				&& (entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).wastardis) {
			{
				boolean _setval = false;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.wastardis = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			class LoadReturnWait5 {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					this.world = world;
					MinecraftForge.EVENT_BUS.register(LoadReturnWait5.this);
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						LoadReturnWait5.this.ticks += 1;
						if (LoadReturnWait5.this.ticks >= LoadReturnWait5.this.waitTicks)
							run();
					}
				}

				private void run() {
					MinecraftForge.EVENT_BUS.unregister(LoadReturnWait5.this);
					{
						Entity _ent = entity;
						_ent.teleportTo(
								((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbModVariables.PlayerVariables())).LoadStoneX),
								((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbModVariables.PlayerVariables())).LoadStoneY),
								((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DbModVariables.PlayerVariables())).LoadStoneZ));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(
									((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbModVariables.PlayerVariables())).LoadStoneX),
									((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbModVariables.PlayerVariables())).LoadStoneY),
									((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DbModVariables.PlayerVariables())).LoadStoneZ),
									_ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.BLINDNESS);
				}
			}
			new LoadReturnWait5().start(world, 6);
		}
	}
}
