
package com.drblockheadmc.db.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.drblockheadmc.db.block.TardisAirlockClosedBlock;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class DBLightItemGroup extends DbModElements.ModElement {
	public DBLightItemGroup(DbModElements instance) {
		super(instance, 197);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdb_light") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TardisAirlockClosedBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
