package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.Random;
import java.util.List;

@SuppressWarnings("unchecked")
public class mcreator_sugarCube {

	public mcreator_sugarCube() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("TestEnvironmentMod:SugarCube", "inventory"));

		GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{"012", "345", "678", Character.valueOf('0'), Items.SUGAR,
				Character.valueOf('1'), Items.SUGAR, Character.valueOf('2'), Items.SUGAR, Character.valueOf('3'), Items.SUGAR,
				Character.valueOf('4'), Items.SUGAR, Character.valueOf('5'), Items.SUGAR, Character.valueOf('6'), Items.SUGAR,
				Character.valueOf('7'), Items.SUGAR, Character.valueOf('8'), Items.SUGAR,});
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
		block = (new ItemsugarCube(444));

	}

	static class ItemsugarCube extends Item {

		public ItemsugarCube(int par1) {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("SugarCube");
			GameRegistry.registerItem(this, "SugarCube");
			setCreativeTab(CreativeTabs.MISC);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 0;
		}

		@Override
		public float getStrVsBlock(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1.0F;
		}

		@Override
		public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
			list.add("Sugar Cube");
		}

	}
}
