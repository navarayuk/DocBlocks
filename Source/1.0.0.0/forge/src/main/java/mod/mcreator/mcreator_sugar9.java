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
import net.minecraft.util.Rotation;
import net.minecraft.util.Mirror;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.Block;

import java.util.Random;
import java.util.HashMap;

public class mcreator_sugar9 extends testenvironmentmod.ModElement {

	public static boolean fallInstantly;
	public static Block block;
	static {
		block = new BlockCustom().setHardness(2F).setResistance(10F).setLightLevel(0.03F).setUnlocalizedName("sugar9").setLightOpacity(0)
				.setCreativeTab(mcreator_sugarCaneMode.tab);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		block.setHarvestLevel("pickaxe", 1);
		block.setRegistryName("sugar9");
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("testenvironmentmod:sugar9", "inventory"));
		}
	}

	public static class BlockCustom extends BlockHorizontal {

		private boolean red = false;

		public BlockCustom() {
			super(Material.ANVIL);
			setSoundType(SoundType.ANVIL);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			EnumFacing enumfacing = (EnumFacing) state.getValue(FACING);
			if (enumfacing == EnumFacing.NORTH) {
				return new AxisAlignedBB(0D, 0D, 0D, 0.11D, 1.0D, 1.0D);
			}
			if (enumfacing == EnumFacing.EAST) {
				return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1D);
			}
			if (enumfacing == EnumFacing.SOUTH) {
				return new AxisAlignedBB(1.0D, 0.0D, 0.0D, 0.87D, 1.0D, 1.0D);
			}
			if (enumfacing == EnumFacing.WEST) {
				return new AxisAlignedBB(0.0D, 0.0D, 1.0D, 1.0D, 1.0D, 0.87D);
			}
			return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
		}

		@Override
		public int quantityDropped(Random random) {
			return 7;
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
		public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			Block block = this;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				mcreator_sugar9BlockAdded.executeProcedure($_dependencies);
			}
		}

		@Override
		public Item getItemDropped(IBlockState state, Random random, int l) {
			return new ItemStack(mcreator_caneNugget.block, (int) (1)).getItem();
		}

		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			return worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos)
					&& worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos, EnumFacing.UP);
		}

		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
		}

		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
		}

		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
		}

		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
		}

		@Override
		protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[]{FACING});
		}

		/**
		 * Called when a neighboring block was changed and marks that this state
		 * should perform any checks during a neighbor change. Cases may include
		 * when redstone power is updated, cactus blocks popping off due to a
		 * neighboring solid block, etc.
		 */
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
			worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn));
		}

		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			if (!worldIn.isRemote) {
				this.checkFallable(worldIn, pos);
			}
		}

		private void checkFallable(World worldIn, BlockPos pos) {
			if ((worldIn.isAirBlock(pos.down()) || canFallThrough(worldIn.getBlockState(pos.down()))) && pos.getY() >= 0) {
				int i = 32;
				if (!fallInstantly && worldIn.isAreaLoaded(pos.add(-32, -32, -32), pos.add(32, 32, 32))) {
					if (!worldIn.isRemote) {
						EntityFallingBlock entityfallingblock = new EntityFallingBlock(worldIn, (double) pos.getX() + 0.5D, (double) pos.getY(),
								(double) pos.getZ() + 0.5D, worldIn.getBlockState(pos));
						this.onStartFalling(entityfallingblock);
						worldIn.spawnEntity(entityfallingblock);
					}
				} else {
					IBlockState state = worldIn.getBlockState(pos);
					worldIn.setBlockToAir(pos);
					BlockPos blockpos;
					for (blockpos = pos.down(); (worldIn.isAirBlock(blockpos) || canFallThrough(worldIn.getBlockState(blockpos)))
							&& blockpos.getY() > 0; blockpos = blockpos.down()) {
						;
					}
					if (blockpos.getY() > 0) {
						worldIn.setBlockState(blockpos.up(), state); // Forge:
																		// Fix
																		// loss
																		// of
																		// state
																		// information
																		// during
																		// world
																		// gen.
					}
				}
			}
		}

		protected void onStartFalling(EntityFallingBlock fallingEntity) {
		}

		/**
		 * How many world ticks before ticking
		 */
		@Override
		public int tickRate(World worldIn) {
			return 2;
		}

		public static boolean canFallThrough(IBlockState state) {
			Block block = state.getBlock();
			Material material = state.getMaterial();
			return block == Blocks.FIRE || material == Material.AIR || material == Material.WATER || material == Material.LAVA;
		}

		public void onEndFalling(World worldIn, BlockPos pos, IBlockState p_176502_3_, IBlockState p_176502_4_) {
		}

		public void onBroken(World worldIn, BlockPos pos) {
		}

		@SideOnly(Side.CLIENT)
		public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
			if (rand.nextInt(16) == 0) {
				BlockPos blockpos = pos.down();
				if (canFallThrough(worldIn.getBlockState(blockpos))) {
					double d0 = (double) ((float) pos.getX() + rand.nextFloat());
					double d1 = (double) pos.getY() - 0.05D;
					double d2 = (double) ((float) pos.getZ() + rand.nextFloat());
					worldIn.spawnParticle(EnumParticleTypes.FALLING_DUST, d0, d1, d2, 0.0D, 0.0D, 0.0D, Block.getStateId(stateIn));
				}
			}
		}

		@SideOnly(Side.CLIENT)
		public int getDustColor(IBlockState state) {
			return -16777216;
		}
	}
}
