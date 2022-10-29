package mod.mcreator;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

public class mcreator_sugarfuel extends testenvironmentmod.ModElement {

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.REEDS).getItem()) {
			return 450;
		}
		return 0;
	}
}
