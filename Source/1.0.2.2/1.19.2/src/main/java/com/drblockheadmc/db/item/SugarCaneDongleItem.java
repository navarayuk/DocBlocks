
package com.drblockheadmc.db.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.drblockheadmc.db.procedures.SugarCaneDongleRightclickedOnBlockProcedure;
import com.drblockheadmc.db.init.DbModTabs;

public class SugarCaneDongleItem extends Item {
	public SugarCaneDongleItem() {
		super(new Item.Properties().tab(DbModTabs.TAB_DB_TOOLS).durability(6).rarity(Rarity.COMMON));
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Dongle Of Life"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		SugarCaneDongleRightclickedOnBlockProcedure.execute(context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
