
package com.drblockheadmc.db.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.drblockheadmc.db.item.CreativeIconItem;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class DocBlocksItemGroup extends DbModElements.ModElement {
	public DocBlocksItemGroup(DbModElements instance) {
		super(instance, 87);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdoc_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CreativeIconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
