package com.drblockheadmc.db.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import com.drblockheadmc.db.network.DbModVariables;

public class TimeLordSealItemIsCraftedsmeltedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!DbModVariables.MapVariables.get(world).timelordseal) {
			DbModVariables.MapVariables.get(world).timelordseal = true;
			DbModVariables.MapVariables.get(world).syncData(world);
		} else {
			(itemstack).shrink(1);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("[DocBlocks]: Time Lord Seal as already exists in this time zone."), (false));
		}
	}
}
