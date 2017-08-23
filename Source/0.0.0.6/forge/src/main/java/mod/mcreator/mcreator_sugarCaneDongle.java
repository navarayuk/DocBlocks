package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.Random;
import java.util.List;

@SuppressWarnings("unchecked")
public class mcreator_sugarCaneDongle {

	public mcreator_sugarCaneDongle() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("TestEnvironmentMod:SugarCaneDongle", "inventory"));

		GameRegistry.addRecipe(
				new ItemStack(block, 1),
				new Object[]{"X1X", "X4X", "X7X", Character.valueOf('1'), Items.DIAMOND_HOE, Character.valueOf('4'), Items.IRON_INGOT,
						Character.valueOf('7'), Blocks.LOG,});
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	public void registerRenderers() {
	}

	static {
		block = (new ItemsugarCaneDongle(442));

	}

	static class ItemsugarCaneDongle extends Item {

		public ItemsugarCaneDongle(int par1) {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("SugarCaneDongle");
			GameRegistry.registerItem(this, "SugarCaneDongle");
			setCreativeTab(CreativeTabs.TOOLS);
		}

		@Override
		public int getItemEnchantability() {
			return 14;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 0;
		}

		@Override
		public float getStrVsBlock(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1.0F;
		}

		public EnumActionResult onItemUseFirst(ItemStack itemStack, EntityPlayer entity, World world, BlockPos pos, EnumFacing side, float hitX,
				float hitY, float hitZ, EnumHand hand) {
			float var4 = 1.0F;
			int i = pos.getX();
			int j = pos.getY();
			int k = pos.getZ();

			if (true) {

				if (true) {
					world.playSound((EntityPlayer) null, (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(
									("TestEnvironmentMod:dongledo"))), SoundCategory.NEUTRAL, 1.0F, 1.0F);
				}

				if (true) {
					boolean place = true;

					if (place) {
						world.setBlockState(new BlockPos(i + 0, j + 0, k + 0), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 0, k + 0), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 0, k + 0), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 0, k + 0), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 0, k + 1), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 0, k + 1), Block.getBlockById(9).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 0, k + 1), Block.getBlockById(9).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 0, k + 1), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 0, k + 2), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 0, k + 2), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 0, k + 2), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 0, k + 2), Block.getBlockById(12).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 1, k + 0), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 1, k + 0), Block.getBlockById(83).getStateFromMeta(1), 3);
						world.setBlockState(new BlockPos(i + 2, j + 1, k + 0), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 1, k + 0), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 1, k + 1), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 1, k + 1), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 1, k + 1), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 1, k + 1), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 1, k + 2), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 1, k + 2), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 1, k + 2), Block.getBlockById(83).getStateFromMeta(1), 3);
						world.setBlockState(new BlockPos(i + 3, j + 1, k + 2), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 2, k + 0), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 2, k + 0), Block.getBlockById(83).getStateFromMeta(1), 3);
						world.setBlockState(new BlockPos(i + 2, j + 2, k + 0), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 2, k + 0), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 2, k + 1), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 2, k + 1), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 2, k + 1), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 2, k + 1), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 2, k + 2), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 2, k + 2), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 2, k + 2), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 2, k + 2), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 3, k + 0), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 3, k + 0), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 3, k + 0), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 3, k + 0), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 3, k + 1), Block.getBlockById(83).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 3, k + 1), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 3, k + 1), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 3, k + 1), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 0, j + 3, k + 2), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 1, j + 3, k + 2), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 2, j + 3, k + 2), Block.getBlockById(0).getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos(i + 3, j + 3, k + 2), Block.getBlockById(0).getStateFromMeta(0), 3);
					}
				}

			}

			return EnumActionResult.PASS;
		}

		@Override
		public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
			list.add("Dongle Of Life");
		}

		@Override
		public boolean canHarvestBlock(IBlockState state, ItemStack stack) {
			return true;
		}

	}
}