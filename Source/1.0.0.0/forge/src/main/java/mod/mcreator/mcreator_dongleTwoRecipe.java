package mod.mcreator;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;

public class mcreator_dongleTwoRecipe extends testenvironmentmod.ModElement {

	@Override
	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(mcreator_sugarCaneDonglePlus.block, (int) (1));
		Object[] recipe = {" 12", "345", "67 ", '1', Ingredient.fromStacks(new ItemStack(mcreator_quantumshard.block, (int) (1))), '2',
				Ingredient.fromStacks(new ItemStack(mcreator_caneNugget.block, (int) (1))), '3',
				Ingredient.fromStacks(new ItemStack(mcreator_quantumshard.block, (int) (1))), '4',
				Ingredient.fromStacks(new ItemStack(mcreator_sugarCaneDongle.block, (int) (1))), '5',
				Ingredient.fromStacks(new ItemStack(mcreator_quantumshard.block, (int) (1))), '6',
				Ingredient.fromStacks(new ItemStack(mcreator_caneNugget.block, (int) (1))), '7',
				Ingredient.fromStacks(new ItemStack(mcreator_quantumshard.block, (int) (1))),};
		GameRegistry.addShapedRecipe(new ResourceLocation("testenvironmentmod:dongletworecipe"), new ResourceLocation("custom"), recStack, recipe);
	}
}
