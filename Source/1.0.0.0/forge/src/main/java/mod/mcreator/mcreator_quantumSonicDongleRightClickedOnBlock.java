package mod.mcreator;

import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.HashMap;

public class mcreator_quantumSonicDongleRightClickedOnBlock extends testenvironmentmod.ModElement {

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure quantumSonicDongleRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure quantumSonicDongleRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure quantumSonicDongleRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure quantumSonicDongleRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure quantumSonicDongleRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("testenvironmentmod:sonic")),
				SoundCategory.NEUTRAL, (float) 3, (float) 1);
		{
			if (world.isRemote)
				return;
			Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
					new ResourceLocation("testenvironmentmod", "donglesthreesb"));
			if (template == null)
				return;
			BlockPos spawnTo = new BlockPos((int) x, (int) (y - 9), (int) z);
			IBlockState iblockstate = world.getBlockState(spawnTo);
			world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
			template.addBlocksToWorldChunk(world, spawnTo,
					new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
							.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity)
					.getHeldItemMainhand().getItem() : null), (int) (1)).getItem(), -1, (int) 1, null);
	}
}
