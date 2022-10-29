
package com.drblockheadmc.db.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.drblockheadmc.db.procedures.CaneOfQuantumItemIsCraftedsmeltedProcedure;
import com.drblockheadmc.db.itemgroup.DBWeaponsItemGroup;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class CaneOfDestinyItem extends DbModElements.ModElement {
	@ObjectHolder("db:cane_of_destiny")
	public static final Item block = null;

	public CaneOfDestinyItem(DbModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 18f;
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
		}, 3, -2f, new Item.Properties().group(DBWeaponsItemGroup.tab).isImmuneToFire()) {
			@Override
			public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onCreated(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				CaneOfQuantumItemIsCraftedsmeltedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("itemstack", itemstack))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("cane_of_destiny"));
	}
}
