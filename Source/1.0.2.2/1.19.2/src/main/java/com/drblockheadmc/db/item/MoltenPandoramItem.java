
package com.drblockheadmc.db.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import com.drblockheadmc.db.init.DbModTabs;
import com.drblockheadmc.db.init.DbModFluids;

public class MoltenPandoramItem extends BucketItem {
	public MoltenPandoramItem() {
		super(DbModFluids.MOLTEN_PANDORAM,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(DbModTabs.TAB_DOC_BLOCKS));
	}
}
