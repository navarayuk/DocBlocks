
package com.drblockheadmc.db.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.drblockheadmc.db.init.DbModTabs;

public class QuantumNuggetItem extends Item {
	public QuantumNuggetItem() {
		super(new Item.Properties().tab(DbModTabs.TAB_DOC_BLOCKS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Many Shards"));
		list.add(new TextComponent("make many things"));
	}
}
