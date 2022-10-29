
package com.drblockheadmc.db.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import com.drblockheadmc.db.procedures.CaneOfQuantumItemIsCraftedsmeltedProcedure;
import com.drblockheadmc.db.init.DbModTabs;
import com.drblockheadmc.db.init.DbModItems;

public class CaneOfDestinyItem extends SwordItem {
	public CaneOfDestinyItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DbModItems.PANDORAM_CANE_INGOT.get()));
			}
		}, 3, -2f, new Item.Properties().tab(DbModTabs.TAB_DB_WEAPONS).fireResistant());
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		CaneOfQuantumItemIsCraftedsmeltedProcedure.execute(itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
