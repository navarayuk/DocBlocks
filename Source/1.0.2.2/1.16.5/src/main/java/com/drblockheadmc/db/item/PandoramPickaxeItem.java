
package com.drblockheadmc.db.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.drblockheadmc.db.itemgroup.DBToolsItemGroup;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class PandoramPickaxeItem extends DbModElements.ModElement {
	@ObjectHolder("db:pandoram_pickaxe")
	public static final Item block = null;

	public PandoramPickaxeItem(DbModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 5f;
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
		}, 1, -2.5f, new Item.Properties().group(DBToolsItemGroup.tab)) {
		}.setRegistryName("pandoram_pickaxe"));
	}
}
