package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Set;
import java.util.HashMap;

public class mcreator_sugarCaneKey extends testenvironmentmod.ModElement {

	public static Item block;
	static {
		Item.ToolMaterial enumt = EnumHelper.addToolMaterial("SUGARCANEKEY", 1, 0, 20, 5, 14);
		block = (Item) (new ItemSword(enumt) {

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("sword", 1);
				return ret.keySet();
			}
		}).setUnlocalizedName("sugarcanekey");
		block.setRegistryName("sugarcanekey");
		block.setCreativeTab(mcreator_sugarCaneMode.tab);
		ForgeRegistries.ITEMS.register(block);
	}

	@Override
	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("testenvironmentmod:sugarcanekey", "inventory"));
		}
	}
}
