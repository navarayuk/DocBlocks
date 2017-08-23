package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class mcreator_sugarCaneArmor {

	public mcreator_sugarCaneArmor() {
	}

	public static Item helmet;
	public static Item body;
	public static Item legs;
	public static Item boots;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(helmet, 0, new ModelResourceLocation("TestEnvironmentMod:doc_reed_head", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(body, 0, new ModelResourceLocation("TestEnvironmentMod:doc_reed_body", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(legs, 0, new ModelResourceLocation("TestEnvironmentMod:doc_reed_leggins", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(boots, 0, new ModelResourceLocation("TestEnvironmentMod:doc_reed_boots", "inventory"));
		}
		GameRegistry.addRecipe(new ItemStack(helmet, 1),
				new Object[]{"012", "345", "XXX", Character.valueOf('0'), Items.REEDS, Character.valueOf('1'), Items.REEDS, Character.valueOf('2'),
						Items.REEDS, Character.valueOf('3'), Items.REEDS, Character.valueOf('4'), Items.DIAMOND_HELMET, Character.valueOf('5'),
						Items.REEDS,});
		GameRegistry.addRecipe(
				new ItemStack(body, 1),
				new Object[]{"012", "345", "678", Character.valueOf('0'), Items.REEDS, Character.valueOf('1'), Items.DIAMOND_CHESTPLATE,
						Character.valueOf('2'), Items.REEDS, Character.valueOf('3'), Items.REEDS, Character.valueOf('4'), Items.REEDS,
						Character.valueOf('5'), Items.REEDS, Character.valueOf('6'), Items.REEDS, Character.valueOf('7'), Items.REEDS,
						Character.valueOf('8'), Items.REEDS,});
		GameRegistry.addRecipe(new ItemStack(legs, 1), new Object[]{"012", "345", "6X8", Character.valueOf('0'), Items.REEDS, Character.valueOf('1'),
				Items.REEDS, Character.valueOf('2'), Items.REEDS, Character.valueOf('3'), Items.REEDS, Character.valueOf('4'),
				Items.DIAMOND_LEGGINGS, Character.valueOf('5'), Items.REEDS, Character.valueOf('6'), Items.REEDS, Character.valueOf('8'),
				Items.REEDS,});
		GameRegistry.addRecipe(new ItemStack(boots, 1),
				new Object[]{"XXX", "3X5", "678", Character.valueOf('3'), Items.REEDS, Character.valueOf('5'), Items.REEDS, Character.valueOf('6'),
						Items.REEDS, Character.valueOf('7'), Items.DIAMOND_BOOTS, Character.valueOf('8'), Items.REEDS,});
		helmet.setCreativeTab(CreativeTabs.COMBAT);
		body.setCreativeTab(CreativeTabs.COMBAT);
		legs.setCreativeTab(CreativeTabs.COMBAT);
		boots.setCreativeTab(CreativeTabs.COMBAT);
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
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SUGARCANEARMOR", "doc_reed_", 50, new int[]{8, 19, 14, 10}, 10, null, 2.4f);

		int armorPreffix = 0;
		helmet = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.HEAD) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("doc_reed_head");
		helmet.setMaxStackSize(1);
		body = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.CHEST) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("doc_reed_body");
		body.setMaxStackSize(1);
		legs = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.LEGS) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("doc_reed_leggins");
		legs.setMaxStackSize(1);
		boots = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.FEET) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("doc_reed_boots");
		boots.setMaxStackSize(1);

		GameRegistry.registerItem(helmet, "doc_reed_head");
		GameRegistry.registerItem(body, "doc_reed_body");
		GameRegistry.registerItem(legs, "doc_reed_leggins");
		GameRegistry.registerItem(boots, "doc_reed_boots");

	}

}