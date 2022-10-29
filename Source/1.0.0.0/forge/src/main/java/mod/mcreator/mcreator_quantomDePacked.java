package mod.mcreator;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;

public class mcreator_quantomDePacked extends testenvironmentmod.ModElement {

	@Override
	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(mcreator_quantumCrystal.block, (int) (9));
		Ingredient[] recipe = {Ingredient.fromStacks(new ItemStack(mcreator_quantumPackedBlock.block, (int) (1))),};
		GameRegistry.addShapelessRecipe(new ResourceLocation("testenvironmentmod:quantomdepacked"), new ResourceLocation("custom"), recStack, recipe);
	}
}
