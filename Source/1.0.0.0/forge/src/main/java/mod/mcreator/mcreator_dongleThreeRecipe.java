package mod.mcreator;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;

public class mcreator_dongleThreeRecipe extends testenvironmentmod.ModElement {

	@Override
	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(mcreator_quantumSonicDongle.block, (int) (1));
		Object[] recipe = {"012", "345", "678", '0', Ingredient.fromStacks(new ItemStack(mcreator_sugarCaneJuice.block, (int) (1))), '1',
				Ingredient.fromStacks(new ItemStack(mcreator_quantumNugget.block, (int) (1))), '2',
				Ingredient.fromStacks(new ItemStack(Blocks.DRAGON_EGG, (int) (1))), '3',
				Ingredient.fromStacks(new ItemStack(Items.NETHER_STAR, (int) (1))), '4',
				Ingredient.fromStacks(new ItemStack(mcreator_sweetCane.block, (int) (1))), '5',
				Ingredient.fromStacks(new ItemStack(mcreator_quantumNugget.block, (int) (1))), '6',
				Ingredient.fromStacks(new ItemStack(mcreator_quantumCrystal.block, (int) (1))), '7',
				Ingredient.fromStacks(new ItemStack(Items.NETHER_STAR, (int) (1))), '8',
				Ingredient.fromStacks(new ItemStack(mcreator_sugarCaneJuice.block, (int) (1))),};
		GameRegistry.addShapedRecipe(new ResourceLocation("testenvironmentmod:donglethreerecipe"), new ResourceLocation("custom"), recStack, recipe);
	}
}
