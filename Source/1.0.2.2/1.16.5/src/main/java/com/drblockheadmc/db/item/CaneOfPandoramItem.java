
package com.drblockheadmc.db.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.drblockheadmc.db.itemgroup.DBWeaponsItemGroup;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class CaneOfPandoramItem extends DbModElements.ModElement {
	@ObjectHolder("db:cane_of_pandoram")
	public static final Item block = null;

	public CaneOfPandoramItem(DbModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 4100;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 7.6f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PandoramCaneIngotItem.block));
			}
		}, 3, -2.15f, new Item.Properties().group(DBWeaponsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("cane_of_pandoram"));
	}
}
