package mod.mcreator;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import java.util.Random;
import java.util.List;

public class mcreator_blueBox extends testenvironmentmod.ModElement {

	public static Block block;
	static {
		block = new BlockCustom().setHardness(10F).setResistance(10F).setLightLevel(1F).setUnlocalizedName("bluebox").setLightOpacity(255)
				.setCreativeTab(mcreator_sugarCaneMode.tab).setBlockUnbreakable();
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		block.setHarvestLevel("axe", 3);
		block.setRegistryName("bluebox");
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("testenvironmentmod:bluebox", "inventory"));
		}
	}

	public static class BlockCustom extends Block {

		private boolean red = false;

		public BlockCustom() {
			super(Material.WOOD);
			setSoundType(SoundType.WOOD);
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("The post man is here.");
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.SOLID;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0D, 0D, 0D, 1D, 2D, 1D);
		}

		@Override
		public int tickRate(World world) {
			return 10;
		}

		@Override
		public int quantityDropped(Random random) {
			return 1;
		}

		@Override
		public int getWeakPower(IBlockState state, IBlockAccess baccess, BlockPos pos, EnumFacing side) {
			return red ? 15 : 0;
		}

		@Override
		public int getStrongPower(IBlockState state, IBlockAccess baccess, BlockPos pos, EnumFacing side) {
			return red ? 15 : 0;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random random, int l) {
			return new ItemStack(mcreator_startingSweet.block, (int) (1)).getItem();
		}

		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			Block block = this;
			int i = x;
			int j = y;
			int k = z;
			if (true)
				for (int l = 0; l < 2; ++l) {
					double d0 = (double) ((float) i + random.nextFloat());
					double d1 = (double) ((float) j + random.nextFloat());
					double d2 = (double) ((float) k + random.nextFloat());
					int i1 = random.nextInt(2) * 2 - 1;
					double d3 = ((double) random.nextFloat() - 0.5D) * 0.2000000014901161D;
					double d4 = ((double) random.nextFloat() - 0.5D) * 0.2000000014901161D;
					double d5 = ((double) random.nextFloat() - 0.5D) * 0.2000000014901161D;
					world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, d3, d4, d5);
				}
		}
	}
}
