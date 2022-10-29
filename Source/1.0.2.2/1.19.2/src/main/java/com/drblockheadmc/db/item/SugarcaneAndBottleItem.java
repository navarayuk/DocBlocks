
package com.drblockheadmc.db.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.drblockheadmc.db.init.DbModTabs;

public class SugarcaneAndBottleItem extends Item {
	public SugarcaneAndBottleItem() {
		super(new Item.Properties().tab(DbModTabs.TAB_DOC_BLOCKS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
