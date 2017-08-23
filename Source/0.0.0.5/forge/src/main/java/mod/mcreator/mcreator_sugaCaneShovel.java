package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Set;
import java.util.Random;
import java.util.HashMap;

public class mcreator_sugaCaneShovel {

	public mcreator_sugaCaneShovel() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack stack = new ItemStack(block, 1);
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("TestEnvironmentMod:SugaCaneShovel", "inventory"));

		GameRegistry.addRecipe(stack, new Object[]{"X1X", "X4X", "X7X", Character.valueOf('1'), Items.REEDS, Character.valueOf('4'),
				Items.DIAMOND_SHOVEL, Character.valueOf('7'), Items.STICK,});
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
		Item.ToolMaterial enumt = EnumHelper.addToolMaterial("SUGACANESHOVEL", 3, 4000, 18F, 6, 12);
		block = (Item) (new ItemSpade(enumt) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 3);
				return ret.keySet();
			}
		}).setUnlocalizedName("SugaCaneShovel");
		GameRegistry.registerItem(block, "SugaCaneShovel");
		block.setCreativeTab(CreativeTabs.TOOLS);

	}

}
