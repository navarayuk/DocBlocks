package mod.mcreator;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.HashMap;

public class mcreator_blueBoxOpenRightClickedOnBlock extends testenvironmentmod.ModElement {

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure blueBoxOpenRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure blueBoxOpenRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure blueBoxOpenRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure blueBoxOpenRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure blueBoxOpenRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == mcreator_blueBox.block.getDefaultState().getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(((entity instanceof EntityLivingBase)
						? ((EntityLivingBase) entity).getHeldItemMainhand().getItem()
						: null), (int) (1)).getItem(), -1, (int) 1, null);
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("testenvironmentmod:dongledo")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
					.dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			if (!world.isRemote) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 16));
			}
		}
	}
}
