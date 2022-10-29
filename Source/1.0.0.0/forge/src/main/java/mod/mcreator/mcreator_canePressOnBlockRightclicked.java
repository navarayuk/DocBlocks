package mod.mcreator;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.HashMap;

public class mcreator_canePressOnBlockRightclicked extends testenvironmentmod.ModElement {

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure canePressOnBlockRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1))
				.getItem() == new ItemStack(mcreator_canenBottle.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(((entity instanceof EntityLivingBase)
						? ((EntityLivingBase) entity).getHeldItemMainhand().getItem()
						: null), (int) (1)).getItem(), -1, (int) 1, null);
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(mcreator_sugarCaneJuice.block, (int) (1)));
		}
	}
}
