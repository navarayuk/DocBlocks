package mod.mcreator;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

public class mcreator_canenBottleRecipe extends testenvironmentmod.ModElement {

	@Override
	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(mcreator_canenBottle.block, (int) (1));
		Object[] recipe = {"   ", " 4 ", "678", '4', Ingredient.fromStacks(new ItemStack(Items.GLASS_BOTTLE, (int) (1))), '6',
				Ingredient.fromStacks(new ItemStack(mcreator_sweetCane.block, (int) (1))), '7',
				Ingredient.fromStacks(new ItemStack(mcreator_sweetCane.block, (int) (1))), '8',
				Ingredient.fromStacks(new ItemStack(mcreator_sweetCane.block, (int) (1))),};
		GameRegistry.addShapedRecipe(new ResourceLocation("testenvironmentmod:canenbottlerecipe"), new ResourceLocation("custom"), recStack, recipe);
	}
}
