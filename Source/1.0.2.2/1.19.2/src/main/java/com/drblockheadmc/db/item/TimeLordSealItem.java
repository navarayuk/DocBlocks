
package com.drblockheadmc.db.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.drblockheadmc.db.procedures.TimeLordSealItemIsCraftedsmeltedProcedure;
import com.drblockheadmc.db.init.DbModTabs;

public class TimeLordSealItem extends Item {
	public TimeLordSealItem() {
		super(new Item.Properties().tab(DbModTabs.TAB_DOC_BLOCKS).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("The Time Lord Seal"));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		TimeLordSealItemIsCraftedsmeltedProcedure.execute(world, entity, itemstack);
	}
}
