
package com.drblockheadmc.db.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import com.drblockheadmc.db.procedures.CaneOfQuantumPickaxeItemIsCraftedsmeltedProcedure;
import com.drblockheadmc.db.init.DbModTabs;
import com.drblockheadmc.db.init.DbModItems;

public class CaneOfQuantumPickaxeItem extends PickaxeItem {
	public CaneOfQuantumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 7f;
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
		}, 1, -2f, new Item.Properties().tab(DbModTabs.TAB_DB_TOOLS).fireResistant());
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		CaneOfQuantumPickaxeItemIsCraftedsmeltedProcedure.execute(itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
