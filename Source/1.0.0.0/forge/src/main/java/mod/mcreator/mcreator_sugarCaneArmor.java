package mod.mcreator;

import net.minecraft.entity.passive.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.boss.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.chunk.storage.*;

import net.minecraftforge.fml.common.network.*;

import net.minecraft.server.management.*;
import net.minecraft.client.particle.*;

import net.minecraftforge.client.model.obj.*;
import net.minecraftforge.oredict.*;

import net.minecraft.client.settings.*;

import net.minecraftforge.fml.common.eventhandler.*;

import net.minecraft.client.entity.*;

import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.server.*;

import net.minecraft.block.state.pattern.*;
import net.minecraft.network.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.crash.*;
import net.minecraft.stats.*;
import net.minecraft.world.gen.structure.template.*;
import net.minecraft.tileentity.*;

import net.minecraftforge.fml.client.registry.*;

import net.minecraft.world.gen.*;

import net.minecraftforge.fml.common.asm.transformers.*;

import net.minecraft.enchantment.*;

import net.minecraftforge.event.entity.*;
import net.minecraftforge.fml.common.discovery.*;

import net.minecraft.command.*;
import net.minecraft.dispenser.*;

import net.minecraftforge.event.entity.item.*;

import net.minecraft.client.gui.*;
import net.minecraft.server.*;
import net.minecraft.advancements.critereon.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.inventory.*;

import net.minecraftforge.items.*;

import net.minecraft.world.gen.layer.*;

import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.fml.common.*;

import net.minecraft.pathfinding.*;

import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.toposort.*;

import net.minecraft.client.util.*;

import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.client.model.*;

import net.minecraft.server.gui.*;

import net.minecraftforge.client.event.*;

import net.minecraft.util.*;

import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.event.world.*;

import net.minecraft.client.renderer.block.statemap.*;

import net.minecraftforge.fml.common.discovery.asm.*;

import net.minecraft.item.crafting.*;
import net.minecraft.entity.effect.*;
import net.minecraft.client.gui.achievement.*;

import net.minecraftforge.event.entity.minecart.*;

import net.minecraft.client.renderer.culling.*;

import net.minecraftforge.fml.common.versioning.*;

import net.minecraft.entity.projectile.*;

import net.minecraftforge.common.*;

import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import net.minecraft.item.*;

import net.minecraftforge.fml.client.*;
import net.minecraftforge.fluids.*;

import net.minecraft.init.*;
import net.minecraft.advancements.*;
import net.minecraft.client.audio.*;
import net.minecraft.world.gen.feature.*;

import net.minecraftforge.fml.common.asm.*;

import net.minecraft.block.state.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.text.*;
import net.minecraft.entity.player.*;

import net.minecraftforge.fml.common.gameevent.*;

import net.minecraft.world.storage.*;
import net.minecraft.world.biome.*;
import net.minecraft.client.*;

import net.minecraftforge.common.util.*;

import net.minecraft.network.rcon.*;
import net.minecraft.profiler.*;

import net.minecraftforge.classloading.*;

import net.minecraft.village.*;
import net.minecraft.potion.*;
import net.minecraft.block.material.*;
import net.minecraft.world.*;
import net.minecraft.nbt.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.server.integrated.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.entity.ai.attributes.*;

import net.minecraftforge.client.*;
import net.minecraftforge.fml.common.registry.*;

import net.minecraft.world.chunk.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.entity.monster.*;

import net.minecraftforge.event.*;

import net.minecraft.server.dedicated.*;

public class mcreator_sugarCaneArmor extends testenvironmentmod.ModElement {

	public static Item helmet;
	public static Item body;
	public static Item legs;
	public static Item boots;
	static {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SUGARCANEARMOR", "doc_reed_", 50, new int[]{8, 19, 14, 10}, 10, null, 2.4f);
		helmet = (new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD)).setUnlocalizedName("sugarcanearmorhelmet");
		helmet.setMaxStackSize(1);
		body = (new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST)).setUnlocalizedName("sugarcanearmorbody");
		body.setMaxStackSize(1);
		legs = (new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS)).setUnlocalizedName("sugarcanearmorlegs");
		legs.setMaxStackSize(1);
		boots = (new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET)).setUnlocalizedName("sugarcanearmorboots");
		boots.setMaxStackSize(1);
		helmet.setRegistryName("sugarcanearmorhelmet");
		ForgeRegistries.ITEMS.register(helmet);
		body.setRegistryName("sugarcanearmorbody");
		ForgeRegistries.ITEMS.register(body);
		legs.setRegistryName("sugarcanearmorlegs");
		ForgeRegistries.ITEMS.register(legs);
		boots.setRegistryName("sugarcanearmorboots");
		ForgeRegistries.ITEMS.register(boots);
	}

	@Override
	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(helmet, 0, new ModelResourceLocation("testenvironmentmod:sugarcanearmorhelmet", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(body, 0, new ModelResourceLocation("testenvironmentmod:sugarcanearmorbody", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(legs, 0, new ModelResourceLocation("testenvironmentmod:sugarcanearmorlegs", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(boots, 0, new ModelResourceLocation("testenvironmentmod:sugarcanearmorboots", "inventory"));
		}
		helmet.setCreativeTab(mcreator_sugarCaneMode.tab);
		body.setCreativeTab(mcreator_sugarCaneMode.tab);
		legs.setCreativeTab(mcreator_sugarCaneMode.tab);
		boots.setCreativeTab(mcreator_sugarCaneMode.tab);
	}
}
