
package com.drblockheadmc.db.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.drblockheadmc.db.item.CaneOfDestinyItem;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class DBWeaponsItemGroup extends DbModElements.ModElement {
	public DBWeaponsItemGroup(DbModElements instance) {
		super(instance, 200);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdb_weapons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CaneOfDestinyItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
