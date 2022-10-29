
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
public class CaneOfQuantumItem extends DbModElements.ModElement {
	@ObjectHolder("db:cane_of_quantum")
	public static final Item block = null;

	public CaneOfQuantumItem(DbModElements instance) {
		super(instance, 84);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 4500;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PandoramCaneIngotItem.block));
			}
		}, 3, -2f, new Item.Properties().group(DBWeaponsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("cane_of_quantum"));
	}
}
