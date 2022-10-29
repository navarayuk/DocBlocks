package com.drblockheadmc.db.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.drblockheadmc.db.DbModVariables;
import com.drblockheadmc.db.DbMod;

public class TimeLordSealItemIsCraftedsmeltedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure TimeLordSealItemIsCraftedsmelted!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure TimeLordSealItemIsCraftedsmelted!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				DbMod.LOGGER.warn("Failed to load dependency itemstack for procedure TimeLordSealItemIsCraftedsmelted!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (!DbModVariables.MapVariables.get(world).timelordseal) {
			DbModVariables.MapVariables.get(world).timelordseal = (true);
			DbModVariables.MapVariables.get(world).syncData(world);
		} else {
			(itemstack).shrink((int) 1);
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[DocBlocks]: Time Lord Seal as already exists in this time zone."),
						(false));
			}
		}
	}
}
