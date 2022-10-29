
package com.drblockheadmc.db.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.drblockheadmc.db.itemgroup.DBToolsItemGroup;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class PandoramCaneShovelItem extends DbModElements.ModElement {
	@ObjectHolder("db:pandoram_cane_shovel")
	public static final Item block = null;

	public PandoramCaneShovelItem(DbModElements instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 4100;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 5.9f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PandoramCaneIngotItem.block));
			}
		}, 1, -2.1f, new Item.Properties().group(DBToolsItemGroup.tab)) {
		}.setRegistryName("pandoram_cane_shovel"));
	}
}
