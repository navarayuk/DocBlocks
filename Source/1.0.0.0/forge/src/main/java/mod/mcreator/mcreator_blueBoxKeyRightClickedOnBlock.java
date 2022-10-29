package mod.mcreator;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.HashMap;

public class mcreator_blueBoxKeyRightClickedOnBlock extends testenvironmentmod.ModElement {

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure blueBoxKeyRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure blueBoxKeyRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure blueBoxKeyRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure blueBoxKeyRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure blueBoxKeyRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((world.canSeeSky(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
			world.playSound((EntityPlayer) null, x, (y + 1), z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("testenvironmentmod:blueboxland")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), mcreator_blueBox.block.getDefaultState(), 3);
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(((entity instanceof EntityLivingBase)
						? ((EntityLivingBase) entity).getHeldItemMainhand().getItem()
						: null), (int) (1)).getItem(), -1, (int) 1, null);
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(mcreator_blueBoxOpen.block, (int) (1)));
		}
	}
}
