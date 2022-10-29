package com.drblockheadmc.db.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class SugarCaneJuicePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
					(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SPEED)
							? _livEnt.getEffect(MobEffects.MOVEMENT_SPEED).getDuration()
							: 0) + 120),
					1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.JUMP,
					(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.JUMP)
							? _livEnt.getEffect(MobEffects.JUMP).getDuration()
							: 0) + 120),
					1, (false), (false)));
	}
}
