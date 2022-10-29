package com.drblockheadmc.db.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import com.drblockheadmc.db.network.DbModVariables;
import com.drblockheadmc.db.init.DbModBlocks;

public class TardisPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(new BlockPos(2, 1, 2))).getBlock() == DbModBlocks.END_PORTAL_NULLED.get())) {
			world.setBlock(new BlockPos(1, 1, 1), DbModBlocks.END_PORTAL_NULLED.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(1, 1, 2), DbModBlocks.END_PORTAL_NULLED.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(1, 1, 3), DbModBlocks.END_PORTAL_NULLED.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(2, 1, 1), DbModBlocks.END_PORTAL_NULLED.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(2, 1, 2), DbModBlocks.END_PORTAL_NULLED.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(2, 1, 3), Blocks.BLACK_CONCRETE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(3, 1, 1), DbModBlocks.END_PORTAL_NULLED.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(3, 1, 2), DbModBlocks.END_PORTAL_NULLED.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(3, 1, 3), DbModBlocks.END_PORTAL_NULLED.get().defaultBlockState(), 3);
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "db_tardis"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(-13, 52, 4), new BlockPos(-13, 52, 4),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if ((entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).GameModeC) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.CREATIVE);
		} else {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
		}
		class TardisPlayerEntersDimensionWait19 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(TardisPlayerEntersDimensionWait19.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					TardisPlayerEntersDimensionWait19.this.ticks += 1;
					if (TardisPlayerEntersDimensionWait19.this.ticks >= TardisPlayerEntersDimensionWait19.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(TardisPlayerEntersDimensionWait19.this);
				{
					Entity _ent = entity;
					_ent.teleportTo(2.5, 3, 2.5);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(2.5, 3, 2.5, _ent.getYRot(), _ent.getXRot());
				}
				class TardisPlayerEntersDimensionWait18 {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						this.world = world;
						MinecraftForge.EVENT_BUS.register(TardisPlayerEntersDimensionWait18.this);
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							TardisPlayerEntersDimensionWait18.this.ticks += 1;
							if (TardisPlayerEntersDimensionWait18.this.ticks >= TardisPlayerEntersDimensionWait18.this.waitTicks)
								run();
						}
					}

					private void run() {
						MinecraftForge.EVENT_BUS.unregister(TardisPlayerEntersDimensionWait18.this);
						{
							Entity _ent = entity;
							_ent.setYRot(-180);
							_ent.setXRot(-1);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
						{
							Entity _ent = entity;
							_ent.teleportTo((-28.5), 62, 0.5);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((-28.5), 62, 0.5, _ent.getYRot(), _ent.getXRot());
						}
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.BLINDNESS);
					}
				}
				new TardisPlayerEntersDimensionWait18().start(world, 6);
			}
		}
		new TardisPlayerEntersDimensionWait19().start(world, 6);
	}
}
