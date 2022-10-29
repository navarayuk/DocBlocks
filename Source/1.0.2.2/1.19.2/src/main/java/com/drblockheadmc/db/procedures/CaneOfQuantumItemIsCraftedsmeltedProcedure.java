package com.drblockheadmc.db.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class CaneOfQuantumItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.MENDING, 1);
		(itemstack).enchant(Enchantments.MOB_LOOTING, 3);
		(itemstack).enchant(Enchantments.KNOCKBACK, 3);
		(itemstack).enchant(Enchantments.SHARPNESS, 5);
		(itemstack).enchant(Enchantments.BLAST_PROTECTION, 3);
		(itemstack).enchant(Enchantments.UNBREAKING, 3);
		(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 3);
	}
}
