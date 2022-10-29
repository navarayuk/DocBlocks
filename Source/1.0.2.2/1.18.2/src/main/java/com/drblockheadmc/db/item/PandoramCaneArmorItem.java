
package com.drblockheadmc.db.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.drblockheadmc.db.init.DbModTabs;
import com.drblockheadmc.db.init.DbModItems;

public abstract class PandoramCaneArmorItem extends ArmorItem {
	public PandoramCaneArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{8, 19, 14, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 30;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DbModItems.PANDORAM_CANE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "pandoram_cane_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PandoramCaneArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DbModTabs.TAB_DOC_BLOCKS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "db:textures/models/armor/doc_reed___layer_1.png";
		}
	}

	public static class Chestplate extends PandoramCaneArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DbModTabs.TAB_DOC_BLOCKS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "db:textures/models/armor/doc_reed___layer_1.png";
		}
	}

	public static class Leggings extends PandoramCaneArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(DbModTabs.TAB_DOC_BLOCKS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "db:textures/models/armor/doc_reed___layer_2.png";
		}
	}

	public static class Boots extends PandoramCaneArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DbModTabs.TAB_DOC_BLOCKS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "db:textures/models/armor/doc_reed___layer_1.png";
		}
	}
}
