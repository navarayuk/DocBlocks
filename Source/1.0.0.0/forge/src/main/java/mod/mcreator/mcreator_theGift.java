package mod.mcreator;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;

public class mcreator_theGift extends testenvironmentmod.ModElement {

	@Override
	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(mcreator_blueBoxKey.block, (int) (1));
		Object[] recipe = {"012", "345", "678", '0', Ingredient.fromStacks(new ItemStack(Items.REEDS, (int) (1))), '1',
				Ingredient.fromStacks(new ItemStack(Items.DIAMOND, (int) (1))), '2', Ingredient.fromStacks(new ItemStack(Items.REEDS, (int) (1))),
				'3', Ingredient.fromStacks(new ItemStack(Items.STICK, (int) (1))), '4',
				Ingredient.fromStacks(new ItemStack(Blocks.CHEST, (int) (1))), '5', Ingredient.fromStacks(new ItemStack(Items.STICK, (int) (1))),
				'6', Ingredient.fromStacks(new ItemStack(Items.REEDS, (int) (1))), '7', Ingredient.fromStacks(new ItemStack(Items.STICK, (int) (1))),
				'8', Ingredient.fromStacks(new ItemStack(Items.REEDS, (int) (1))),};
		GameRegistry.addShapedRecipe(new ResourceLocation("testenvironmentmod:thegift"), new ResourceLocation("custom"), recStack, recipe);
	}
}
