package mod.mcreator;

import java.util.Random;

import net.minecraft.entity.passive.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.boss.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.chunk.storage.*;

import net.minecraftforge.fml.common.network.*;

import net.minecraft.server.management.*;
import net.minecraft.client.particle.*;

import net.minecraftforge.client.model.obj.*;
import net.minecraftforge.oredict.*;

import net.minecraft.client.settings.*;

import net.minecraftforge.fml.common.eventhandler.*;

import net.minecraft.client.entity.*;

import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.server.*;

import net.minecraft.block.state.pattern.*;
import net.minecraft.network.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.crash.*;
import net.minecraft.stats.*;
import net.minecraft.world.gen.structure.template.*;
import net.minecraft.tileentity.*;

import net.minecraftforge.fml.client.registry.*;

import net.minecraft.world.gen.*;

import net.minecraftforge.fml.common.asm.transformers.*;

import net.minecraft.enchantment.*;

import net.minecraftforge.event.entity.*;
import net.minecraftforge.fml.common.discovery.*;

import net.minecraft.command.*;
import net.minecraft.dispenser.*;

import net.minecraftforge.event.entity.item.*;

import net.minecraft.client.gui.*;
import net.minecraft.server.*;
import net.minecraft.advancements.critereon.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.inventory.*;

import net.minecraftforge.items.*;

import net.minecraft.world.gen.layer.*;

import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.fml.common.*;

import net.minecraft.pathfinding.*;

import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.toposort.*;

import net.minecraft.client.util.*;

import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.client.model.*;

import net.minecraft.server.gui.*;

import net.minecraftforge.client.event.*;

import net.minecraft.util.*;

import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.event.world.*;

import net.minecraft.client.renderer.block.statemap.*;

import net.minecraftforge.fml.common.discovery.asm.*;

import net.minecraft.item.crafting.*;
import net.minecraft.entity.effect.*;
import net.minecraft.client.gui.achievement.*;

import net.minecraftforge.event.entity.minecart.*;

import net.minecraft.client.renderer.culling.*;

import net.minecraftforge.fml.common.versioning.*;

import net.minecraft.entity.projectile.*;

import net.minecraftforge.common.*;

import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import net.minecraft.item.*;

import net.minecraftforge.fml.client.*;
import net.minecraftforge.fluids.*;

import net.minecraft.init.*;
import net.minecraft.advancements.*;
import net.minecraft.client.audio.*;
import net.minecraft.world.gen.feature.*;

import net.minecraftforge.fml.common.asm.*;

import net.minecraft.block.state.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.text.*;
import net.minecraft.entity.player.*;

import net.minecraftforge.fml.common.gameevent.*;

import net.minecraft.world.storage.*;
import net.minecraft.world.biome.*;
import net.minecraft.client.*;

import net.minecraftforge.common.util.*;

import net.minecraft.network.rcon.*;
import net.minecraft.profiler.*;

import net.minecraftforge.classloading.*;

import net.minecraft.village.*;
import net.minecraft.potion.*;
import net.minecraft.block.material.*;
import net.minecraft.world.*;
import net.minecraft.nbt.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.server.integrated.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.entity.ai.attributes.*;

import net.minecraftforge.client.*;
import net.minecraftforge.fml.common.registry.*;

import net.minecraft.world.chunk.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.entity.monster.*;

import net.minecraftforge.event.*;

import net.minecraft.server.dedicated.*;

public class mcreator_docReeds extends testenvironmentmod.ModElement {

	public static Block block;
	static {
		block = (Block) (new BlockCustomFlower()).setHardness(0.01F).setResistance(2F).setLightLevel(0F).setUnlocalizedName("docreeds");
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		block.setRegistryName("docreeds");
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("testenvironmentmod:docreeds", "inventory"));
		}
	}

	@Override
	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for (int i = 0; i < 3; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {

				@Override
				public boolean generate(World worldIn, Random random, BlockPos pos) {
					for (int i = 0; i < 20; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (worldIn.isAirBlock(blockpos1)) {
							BlockPos blockpos2 = blockpos1.down();
							int j = 1 + random.nextInt(random.nextInt(8) + 1);
							j = Math.min(8, j);
							for (int k = 0; k < j; ++k)
								if (((BlockReed) block).canBlockStay(worldIn, blockpos1))
									worldIn.setBlockState(blockpos1.up(k), block.getDefaultState(), 2);
						}
					}
					return true;
				}
			}).generate(world, random, new BlockPos(l6, i11, l14));
		}
	}

	public static class BlockCustomFlower extends BlockReed {

		public BlockCustomFlower() {
			setSoundType(SoundType.PLANT);
			this.setCreativeTab(mcreator_sugarCaneMode.tab);
		}

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Desert;
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			Block block2 = worldIn.getBlockState(pos.down()).getBlock();
			return (block2.canSustainPlant(worldIn.getBlockState(pos.down()), worldIn, pos.down(), EnumFacing.UP, this) || block2 == block);
		}

		@SideOnly(Side.CLIENT)
		public int colorMultiplier(IBlockAccess p_149720_1_, BlockPos pos, int pass) {
			return 16777215;
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			if (world.getBlockState(pos.down()).getBlock() == block || this.checkForDrop(world, pos, state)) {
				if (world.isAirBlock(pos.up())) {
					int l;
					for (l = 1; world.getBlockState(pos.down(l)).getBlock() == this; ++l);
					if (l < 8) {
						int i1 = (Integer) state.getValue(AGE);
						if (i1 == 15) {
							world.setBlockState(pos.up(), this.getDefaultState());
							world.setBlockState(pos, state.withProperty(AGE, 0), 4);
						} else {
							world.setBlockState(pos, state.withProperty(AGE, i1 + 1), 4);
						}
					}
				}
			}
		}

		@Override
		public int quantityDropped(Random random) {
			return 1;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return Item.getItemFromBlock(block);
		}
	}
}
