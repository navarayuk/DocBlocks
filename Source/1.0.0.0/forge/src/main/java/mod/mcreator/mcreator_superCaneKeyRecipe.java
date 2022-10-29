package mod.mcreator;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

public class mcreator_superCaneKeyRecipe extends testenvironmentmod.ModElement {

	@Override
	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(mcreator_sugarCaneKey.block, (int) (1));
		Object[] recipe = {" 12", " 45", "6  ", '1', Ingredient.fromStacks(new ItemStack(mcreator_caneIngot.block, (int) (1))), '2',
				Ingredient.fromStacks(new ItemStack(mcreator_heartOfCane.block, (int) (1))), '4',
				Ingredient.fromStacks(new ItemStack(Items.STICK, (int) (1))), '5',
				Ingredient.fromStacks(new ItemStack(mcreator_caneIngot.block, (int) (1))), '6',
				Ingredient.fromStacks(new ItemStack(Items.STICK, (int) (1))),};
		GameRegistry.addShapedRecipe(new ResourceLocation("testenvironmentmod:supercanekeyrecipe"), new ResourceLocation("custom"), recStack, recipe);
	}
}
