package com.drblockheadmc.db.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

import com.drblockheadmc.db.DbModVariables;
import com.drblockheadmc.db.DbMod;

public class Suger9Mark2OnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure Suger9Mark2OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DbMod.LOGGER.warn("Failed to load dependency x for procedure Suger9Mark2OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DbMod.LOGGER.warn("Failed to load dependency y for procedure Suger9Mark2OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DbMod.LOGGER.warn("Failed to load dependency z for procedure Suger9Mark2OnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure Suger9Mark2OnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (!(entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DbModVariables.PlayerVariables())).s9spam) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:suger9_yes_master")),
						SoundCategory.MASTER, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:suger9_yes_master")),
						SoundCategory.MASTER, (float) 1, (float) 1, false);
			}
			if (Math.random() < 0.3) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.HEART, x, y, z, (int) 5, 3, 3, 3, 1);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) (new Object() {
						int check(Entity _entity) {
							if (_entity instanceof LivingEntity) {
								Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
								for (EffectInstance effect : effects) {
									if (effect.getPotion() == Effects.REGENERATION)
										return effect.getDuration();
								}
							}
							return 0;
						}
					}.check(entity) + 120), (int) 0, (false), (false)));
			}
			{
				boolean _setval = (true);
				entity.getCapability(DbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.s9spam = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
