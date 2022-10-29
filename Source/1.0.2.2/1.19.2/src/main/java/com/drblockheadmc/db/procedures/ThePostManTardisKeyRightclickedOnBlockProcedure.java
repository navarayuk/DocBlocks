package com.drblockheadmc.db.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import com.drblockheadmc.db.init.DbModItems;
import com.drblockheadmc.db.init.DbModBlocks;

public class ThePostManTardisKeyRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z)) && world.isEmptyBlock(new BlockPos(x, y + 2, z))) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y + 1, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:blueboxland")),
							SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, (y + 1), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("db:blueboxland")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			world.setBlock(new BlockPos(x, y + 1, z), DbModBlocks.THE_POST_MAN_TARDIS.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 2, z), DbModBlocks.THE_POST_MAN_TARDIS_FIX.get().defaultBlockState(), 3);
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(DbModItems.THE_POSTMAN_TARDIS_KEY_OPEN.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
