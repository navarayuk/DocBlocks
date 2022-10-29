package com.drblockheadmc.db.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import java.util.Map;

import com.drblockheadmc.db.DbMod;

public class CaneOfQuantumItemIsCraftedsmeltedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				DbMod.LOGGER.warn("Failed to load dependency itemstack for procedure CaneOfQuantumItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).addEnchantment(Enchantments.MENDING, (int) 1);
		(itemstack).addEnchantment(Enchantments.LOOTING, (int) 3);
		(itemstack).addEnchantment(Enchantments.KNOCKBACK, (int) 3);
		(itemstack).addEnchantment(Enchantments.SHARPNESS, (int) 5);
		(itemstack).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 3);
		(itemstack).addEnchantment(Enchantments.UNBREAKING, (int) 3);
		(itemstack).addEnchantment(Enchantments.FORTUNE, (int) 3);
	}
}
