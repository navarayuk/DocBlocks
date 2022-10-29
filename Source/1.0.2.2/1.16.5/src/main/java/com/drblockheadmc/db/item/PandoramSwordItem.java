
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
public class PandoramSwordItem extends DbModElements.ModElement {
	@ObjectHolder("db:pandoram_sword")
	public static final Item block = null;

	public PandoramSwordItem(DbModElements instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 4.95f;
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
		}, 3, -2.3f, new Item.Properties().group(DBWeaponsItemGroup.tab)) {
		}.setRegistryName("pandoram_sword"));
	}
}
