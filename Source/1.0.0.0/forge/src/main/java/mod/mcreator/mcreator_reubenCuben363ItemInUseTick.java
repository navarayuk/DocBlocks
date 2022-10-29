package mod.mcreator;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;

import java.util.HashMap;

public class mcreator_reubenCuben363ItemInUseTick extends testenvironmentmod.ModElement {

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure reubenCuben363ItemInUseTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure reubenCuben363ItemInUseTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure reubenCuben363ItemInUseTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure reubenCuben363ItemInUseTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure reubenCuben363ItemInUseTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((new Object() {

			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals(mcreator_recorder.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("testenvironmentmod:log363")), SoundCategory.NEUTRAL, (float) 2, (float) 1);
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(mcreator_reubenCuben363.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (!world.isRemote) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 2));
			}
		}
	}
}
