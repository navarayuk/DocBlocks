
package com.drblockheadmc.db.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import com.drblockheadmc.db.itemgroup.DBDarkItemGroup;
import com.drblockheadmc.db.DbModElements;

@DbModElements.ModElement.Tag
public class TardisWallDarkTrapdoorBlock extends DbModElements.ModElement {
	@ObjectHolder("db:tardis_wall_dark_trapdoor")
	public static final Block block = null;

	public TardisWallDarkTrapdoorBlock(DbModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(DBDarkItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends TrapDoorBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("tardis_wall_dark_trapdoor");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
