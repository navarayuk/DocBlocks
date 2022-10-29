package com.drblockheadmc.db.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class CaneOfQuantumPickaxeItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.MENDING, 1);
		(itemstack).enchant(Enchantments.UNBREAKING, 4);
		(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 4);
		(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 6);
		(itemstack).enchant(Enchantments.KNOCKBACK, 3);
		(itemstack).enchant(Enchantments.MOB_LOOTING, 5);
	}
}
