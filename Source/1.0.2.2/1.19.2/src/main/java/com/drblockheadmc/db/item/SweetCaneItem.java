
package com.drblockheadmc.db.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import com.drblockheadmc.db.init.DbModTabs;

public class SweetCaneItem extends Item {
	public SweetCaneItem() {
		super(new Item.Properties().tab(DbModTabs.TAB_DOC_BLOCKS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(2f).alwaysEat().meat().build()));
	}
}
