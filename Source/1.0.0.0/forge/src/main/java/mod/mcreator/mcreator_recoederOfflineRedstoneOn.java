package mod.mcreator;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;

public class mcreator_recoederOfflineRedstoneOn extends testenvironmentmod.ModElement {

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure recoederOfflineRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure recoederOfflineRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure recoederOfflineRedstoneOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure recoederOfflineRedstoneOn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), mcreator_recorder.block.getDefaultState(), 3);
	}
}
