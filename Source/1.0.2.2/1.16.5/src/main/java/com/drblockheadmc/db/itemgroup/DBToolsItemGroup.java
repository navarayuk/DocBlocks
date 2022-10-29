
package com.drblockheadmc.db.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.drblockheadmc.db.item.CaneOfQuantumPickaxeItem;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class DBToolsItemGroup extends DbModElements.ModElement {
	public DBToolsItemGroup(DbModElements instance) {
		super(instance, 201);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdb_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CaneOfQuantumPickaxeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
