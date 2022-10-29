
package com.drblockheadmc.db.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.drblockheadmc.db.procedures.CaneOfQuantumItemIsCraftedsmeltedProcedure;
import com.drblockheadmc.db.init.DbModTabs;
import com.drblockheadmc.db.init.DbModItems;

public class QuantumKeyBladeItem extends SwordItem {
	public QuantumKeyBladeItem() {
		super(new Tier() {
			public int getUses() {
				return 10000;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DbModItems.QUANTUM_CRYSTAL.get()));
			}
		}, 3, -1.8f, new Item.Properties().tab(DbModTabs.TAB_DB_WEAPONS).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("The Shopkeeper is a"));
		list.add(Component.literal("big kingdom of"));
		list.add(Component.literal("hearts fan"));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		CaneOfQuantumItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}
