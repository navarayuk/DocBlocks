
package com.drblockheadmc.db.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;

import java.util.stream.Stream;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.AbstractMap;

import com.drblockheadmc.db.procedures.CaneOfQuantumItemIsCraftedsmeltedProcedure;
import com.drblockheadmc.db.itemgroup.DBWeaponsItemGroup;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class QuantumKeyBladeItem extends DbModElements.ModElement {
	@ObjectHolder("db:quantum_key_blade")
	public static final Item block = null;

	public QuantumKeyBladeItem(DbModElements instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(QuantumCrystalItem.block));
			}
		}, 3, -1.8f, new Item.Properties().group(DBWeaponsItemGroup.tab).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("The Shopkeeper is a"));
				list.add(new StringTextComponent("big kingdom of"));
				list.add(new StringTextComponent("hearts fan"));
			}

			@Override
			public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onCreated(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				CaneOfQuantumItemIsCraftedsmeltedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("itemstack", itemstack))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("quantum_key_blade"));
	}
}
