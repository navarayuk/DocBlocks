package mod.mcreator;

import net.minecraft.item.ItemStack;

public class mcreator_sweetFuel extends testenvironmentmod.ModElement {

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(mcreator_sweetCane.block).getItem()) {
			return 300;
		}
		return 0;
	}
}
