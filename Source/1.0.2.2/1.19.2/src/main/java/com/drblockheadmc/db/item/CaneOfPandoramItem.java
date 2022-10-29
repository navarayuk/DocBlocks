
package com.drblockheadmc.db.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.drblockheadmc.db.init.DbModTabs;
import com.drblockheadmc.db.init.DbModItems;

public class CaneOfPandoramItem extends SwordItem {
	public CaneOfPandoramItem() {
		super(new Tier() {
			public int getUses() {
				return 4100;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 7.6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DbModItems.PANDORAM_CANE_INGOT.get()));
			}
		}, 3, -2.15f, new Item.Properties().tab(DbModTabs.TAB_DB_WEAPONS).fireResistant());
	}
}
