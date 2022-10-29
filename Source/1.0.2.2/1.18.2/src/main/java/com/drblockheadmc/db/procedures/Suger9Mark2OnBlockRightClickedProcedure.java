package com.drblockheadmc.db.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import com.drblockheadmc.db.network.DbModVariables;

public class Suger9Mark2OnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).s9spam) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:suger9_yes_master")),
							SoundSource.MASTER, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:suger9_yes_master")),
							SoundSource.MASTER, 1, 1, false);
				}
			}
			if (Math.random() < 0.3) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HEART, x, y, z, 5, 3, 3, 3, 1);
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION,
							(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.REGENERATION)
									? _livEnt.getEffect(MobEffects.REGENERATION).getDuration()
									: 0) + 120),
							0, (false), (false)));
			}
			{
				boolean _setval = true;
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.s9spam = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
