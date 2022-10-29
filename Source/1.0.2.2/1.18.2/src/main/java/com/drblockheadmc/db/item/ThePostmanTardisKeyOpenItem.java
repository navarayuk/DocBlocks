
package com.drblockheadmc.db.item;

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

import com.drblockheadmc.db.procedures.ThePostmanTardisKeyOpenRightclickedOnBlockProcedure;

public class ThePostmanTardisKeyOpenItem extends Item {
	public ThePostmanTardisKeyOpenItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("A strangely warm"));
		list.add(new TextComponent("key"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		ThePostmanTardisKeyOpenRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(),
				context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
