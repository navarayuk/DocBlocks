package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.HashMap;

public class mcreator_sugarCaneDonglePlus extends testenvironmentmod.ModElement {

	public static Item block;
	static {
		block = (new ItemCustom());
	}

	@Override
	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("testenvironmentmod:sugarcanedongleplus", "inventory"));
		}
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(5);
			maxStackSize = 1;
			setUnlocalizedName("sugarcanedongleplus");
			setRegistryName("sugarcanedongleplus");
			setCreativeTab(mcreator_sugarCaneMode.tab);
			ForgeRegistries.ITEMS.register(this);
		}

		@Override
		public int getItemEnchantability() {
			return 14;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 5;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public boolean canHarvestBlock(IBlockState state, ItemStack stack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Dongle Of Life - More");
		}

		@Override
		public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ,
				EnumHand hand) {
			ItemStack itemstack = entity.getHeldItem(hand);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				mcreator_sugarCaneDonglePlusRightClickedOnBlock.executeProcedure($_dependencies);
			}
			return EnumActionResult.PASS;
		}
	}
}
