
package com.drblockheadmc.db.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.drblockheadmc.db.procedures.SugarCaneDonglePlusRightclickedOnBlockProcedure;
import com.drblockheadmc.db.init.DbModTabs;

public class SugarCaneDonglePlusItem extends Item {
	public SugarCaneDonglePlusItem() {
		super(new Item.Properties().tab(DbModTabs.TAB_DB_TOOLS).durability(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 14;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Dongle Of Life - More"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		SugarCaneDonglePlusRightclickedOnBlockProcedure.execute(context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
