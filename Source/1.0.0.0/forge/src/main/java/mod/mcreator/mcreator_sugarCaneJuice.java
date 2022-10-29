package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

public class mcreator_sugarCaneJuice extends testenvironmentmod.ModElement {

	public static Item block;
	static {
		block = (Item) (new CustomItemFood(7, 0.3F, false)).setAlwaysEdible();
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		block.setMaxStackSize(64);
		block.setCreativeTab(mcreator_sugarCaneMode.tab);
	}

	@Override
	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("testenvironmentmod:sugarcanejuice", "inventory"));
	}

	public static class CustomItemFood extends ItemFood {

		public CustomItemFood(int par2, float par3, boolean par4) {
			super(par2, par3, par4);
			setUnlocalizedName("sugarcanejuice");
			setRegistryName("sugarcanejuice");
			ForgeRegistries.ITEMS.register(this);
		}

		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				mcreator_sugarCaneJuiceFoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}
