package mod.mcreator;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Enchantments;

import java.util.Random;

public class mcreator_sugarCaneSwordEnc {

	public mcreator_sugarCaneSwordEnc() {
	}

	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(mcreator_sugarCaneSword.block, 1);

		recStack.addEnchantment(Enchantments.MENDING, 1);
		recStack.addEnchantment(Enchantments.PUNCH, 10);
		recStack.addEnchantment(Enchantments.UNBREAKING, 10);
		recStack.addEnchantment(Enchantments.EFFICIENCY, 10);
		recStack.addEnchantment(Enchantments.FORTUNE, 10);
		recStack.addEnchantment(Enchantments.LOOTING, 10);

		GameRegistry.addRecipe(recStack,
				new Object[]{"X12", "345", "67X", Character.valueOf('1'), Items.REEDS, Character.valueOf('2'), Items.REEDS, Character.valueOf('3'),
						Items.EMERALD, Character.valueOf('4'), Items.DIAMOND, Character.valueOf('5'), Items.REEDS, Character.valueOf('6'),
						Items.DIAMOND_SWORD, Character.valueOf('7'), Items.EMERALD,});
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
}
