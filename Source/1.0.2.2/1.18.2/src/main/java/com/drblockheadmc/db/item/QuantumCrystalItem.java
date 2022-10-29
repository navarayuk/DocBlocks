
package com.drblockheadmc.db.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.drblockheadmc.db.procedures.QuantumCrystalItemIsCraftedsmeltedProcedure;
import com.drblockheadmc.db.init.DbModTabs;

public class QuantumCrystalItem extends Item {
	public QuantumCrystalItem() {
		super(new Item.Properties().tab(DbModTabs.TAB_DOC_BLOCKS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("The true power"));
		list.add(new TextComponent("of the cane"));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		QuantumCrystalItemIsCraftedsmeltedProcedure.execute(entity);
	}
}
