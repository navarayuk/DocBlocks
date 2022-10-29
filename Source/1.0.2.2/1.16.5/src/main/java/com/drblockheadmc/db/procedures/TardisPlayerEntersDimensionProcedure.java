package com.drblockheadmc.db.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.potion.Effects;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;
import java.util.Collections;

import com.drblockheadmc.db.block.EndPortalNulledBlock;
import com.drblockheadmc.db.DbModVariables;
import com.drblockheadmc.db.DbMod;

public class TardisPlayerEntersDimensionProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure TardisPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure TardisPlayerEntersDimension!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (!((world.getBlockState(new BlockPos(2, 1, 2))).getBlock() == EndPortalNulledBlock.block)) {
			world.setBlockState(new BlockPos(1, 1, 1), EndPortalNulledBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(1, 1, 2), EndPortalNulledBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(1, 1, 3), EndPortalNulledBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(2, 1, 1), EndPortalNulledBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(2, 1, 2), EndPortalNulledBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(2, 1, 3), Blocks.BLACK_CONCRETE.getDefaultState(), 3);
			world.setBlockState(new BlockPos(3, 1, 1), EndPortalNulledBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(3, 1, 2), EndPortalNulledBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(3, 1, 3), EndPortalNulledBlock.block.getDefaultState(), 3);
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("db", "db_tardis"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos(-13, 52, 4), new PlacementSettings().setRotation(Rotation.CLOCKWISE_180)
							.setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false), ((World) world).rand);
				}
			}
		}
		if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).GameModeC) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.CREATIVE);
		} else {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.SURVIVAL);
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
					_ent.setPositionAndUpdate(2.5, 3, 2.5);
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(2.5, 3, 2.5, _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
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
						entity.rotationYaw = (float) ((-180));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entity.rotationPitch = (float) ((-1));
						{
							Entity _ent = entity;
							_ent.setPositionAndUpdate((-28.5), 62, 0.5);
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((-28.5), 62, 0.5, _ent.rotationYaw, _ent.rotationPitch,
										Collections.emptySet());
							}
						}
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).removePotionEffect(Effects.BLINDNESS);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 6);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 6);
	}
}
