
package com.drblockheadmc.db.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.drblockheadmc.db.init.DbModTabs;
import com.drblockheadmc.db.init.DbModItems;

public class PandoramCaneIngotShovelItem extends ShovelItem {
	public PandoramCaneIngotShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 4000;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 4.2f;
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
		}, 1, -2.4f, new Item.Properties().tab(DbModTabs.TAB_DB_TOOLS));
	}
}
