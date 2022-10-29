package mod.mcreator;

import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

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

@Mod(modid = testenvironmentmod.MODID, version = testenvironmentmod.VERSION)
public class testenvironmentmod implements IFuelHandler, IWorldGenerator {

	public static final String MODID = "testenvironmentmod";
	public static final String VERSION = "1.0";
	@SidedProxy(clientSide = "mod.mcreator.ClientProxytestenvironmentmod", serverSide = "mod.mcreator.CommonProxytestenvironmentmod")
	public static CommonProxytestenvironmentmod proxy;
	@Instance(MODID)
	public static testenvironmentmod instance;
	public static final List<ModElement> elements = new ArrayList<>();

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@Override
	public void generate(final Random random, int chunkX, int chunkZ, final World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		final int f_chunkX = chunkX * 16;
		final int f_chunkZ = chunkZ * 16;
		if (world.provider.getDimension() == -1)
			elements.forEach(element -> element.generateNether(world, random, f_chunkX, f_chunkZ));
		if (world.provider.getDimension() == 0)
			elements.forEach(element -> element.generateSurface(world, random, f_chunkX, f_chunkZ));
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		GameRegistry.registerFuelHandler(this);
		GameRegistry.registerWorldGenerator(this, 5);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		elements.forEach(element -> element.load(event));
		proxy.registerRenderers(this);
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		elements.forEach(element -> element.serverLoad(event));
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			OBJLoader.INSTANCE.addDomain("testenvironmentmod");
		elements.forEach(element -> {
			element.instance = this.instance;
			element.preInit(event);
		});
		ResourceLocation sound0 = new ResourceLocation("testenvironmentmod", "dongledo");
		ForgeRegistries.SOUND_EVENTS.register(new net.minecraft.util.SoundEvent(sound0).setRegistryName(sound0));
		ResourceLocation sound1 = new ResourceLocation("testenvironmentmod", "sonic");
		ForgeRegistries.SOUND_EVENTS.register(new net.minecraft.util.SoundEvent(sound1).setRegistryName(sound1));
		ResourceLocation sound2 = new ResourceLocation("testenvironmentmod", "blueboxland");
		ForgeRegistries.SOUND_EVENTS.register(new net.minecraft.util.SoundEvent(sound2).setRegistryName(sound2));
		ResourceLocation sound3 = new ResourceLocation("testenvironmentmod", "Suga9Master");
		ForgeRegistries.SOUND_EVENTS.register(new net.minecraft.util.SoundEvent(sound3).setRegistryName(sound3));
		ResourceLocation sound4 = new ResourceLocation("testenvironmentmod", "log363");
		ForgeRegistries.SOUND_EVENTS.register(new net.minecraft.util.SoundEvent(sound4).setRegistryName(sound4));
	}

	public static class GuiHandler implements IGuiHandler {

		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}
	}

	static {
		elements.add(new mcreator_sugarCaneArmor());
		elements.add(new mcreator_sugarCaneSword());
		elements.add(new mcreator_sugarCaneSwordEnc());
		elements.add(new mcreator_sugarCaneAxe());
		elements.add(new mcreator_sugaCaneShovel());
		elements.add(new mcreator_sugarCanePickaxe());
		elements.add(new mcreator_sugarCaneDongle());
		elements.add(new mcreator_sugarCaneDonglePlus());
		elements.add(new mcreator_sugarCube());
		elements.add(new mcreator_sugarCaneMode());
		elements.add(new mcreator_caneIngot());
		elements.add(new mcreator_quantumshard());
		elements.add(new mcreator_caneNugget());
		elements.add(new mcreator_quantumNugget());
		elements.add(new mcreator_moltenCane());
		elements.add(new mcreator_quantumCrystal());
		elements.add(new mcreator_quantumAchievement());
		elements.add(new mcreator_quantumSword());
		elements.add(new mcreator_caneIngots());
		elements.add(new mcreator_quantumPlus());
		elements.add(new mcreator_quantumSonicDongle());
		elements.add(new mcreator_sugarDoctor());
		elements.add(new mcreator_docReeds());
		elements.add(new mcreator_heartOfCane());
		elements.add(new mcreator_sugarCaneArmorHelmetRecipe());
		elements.add(new mcreator_sugarCaneArmorBodyRecipe());
		elements.add(new mcreator_sugarCaneArmorLeggingsRecipe());
		elements.add(new mcreator_sugarCaneArmorBootsRecipe());
		elements.add(new mcreator_sugarCaneSwordRecipe());
		elements.add(new mcreator_sugarCaneAxeRecipe());
		elements.add(new mcreator_sugaCaneShovelRecipe());
		elements.add(new mcreator_sugarCanePickaxeRecipe());
		elements.add(new mcreator_sugarCubeRecipe());
		elements.add(new mcreator_caneIngotRecipe());
		elements.add(new mcreator_quantumshardRecipe());
		elements.add(new mcreator_caneNuggetRecipe());
		elements.add(new mcreator_quantumNuggetRecipe());
		elements.add(new mcreator_moltenCaneRecipe());
		elements.add(new mcreator_quantumCrystalRecipe());
		elements.add(new mcreator_quantumSwordRecipe());
		elements.add(new mcreator_heartOfCaneRecipe());
		elements.add(new mcreator_caneBlock());
		elements.add(new mcreator_caneBlockRecipe());
		elements.add(new mcreator_sugar9());
		elements.add(new mcreator_sugarCaneDongleRightClickedOnBlock());
		elements.add(new mcreator_sugarCaneDonglePlusRightClickedOnBlock());
		elements.add(new mcreator_quantumSonicDongleRightClickedOnBlock());
		elements.add(new mcreator_startingSweet());
		elements.add(new mcreator_theGift());
		elements.add(new mcreator_startingSweetOnBlockRightclicked());
		elements.add(new mcreator_canePress());
		elements.add(new mcreator_sweetCane());
		elements.add(new mcreator_canenBottle());
		elements.add(new mcreator_sweetCaneRecipe());
		elements.add(new mcreator_canenBottleRecipe());
		elements.add(new mcreator_sugarCaneJuiceFoodEaten());
		elements.add(new mcreator_sugarCaneJuice());
		elements.add(new mcreator_canePressOnBlockRightclicked());
		elements.add(new mcreator_caneBail());
		elements.add(new mcreator_caneBailRecipe());
		elements.add(new mcreator_dongleOneRecipe());
		elements.add(new mcreator_dongleTwoRecipe());
		elements.add(new mcreator_dongleThreeRecipe());
		elements.add(new mcreator_sugarPressRecipe());
		elements.add(new mcreator_mooCane());
		elements.add(new mcreator_sweetFuel());
		elements.add(new mcreator_sugarfuel());
		elements.add(new mcreator_quantumPackedBlock());
		elements.add(new mcreator_packedQuantum());
		elements.add(new mcreator_quantomDePacked());
		elements.add(new mcreator_blueBox());
		elements.add(new mcreator_blueBoxKeyRightClickedOnBlock());
		elements.add(new mcreator_blueBoxKey());
		elements.add(new mcreator_blueBoxOpen());
		elements.add(new mcreator_blueBoxOpenRightClickedOnBlock());
		elements.add(new mcreator_pandoramBail());
		elements.add(new mcreator_pandoramBailRecipe());
		elements.add(new mcreator_pandoramBailBlockDestroyedByPlayer());
		elements.add(new mcreator_sugar9BlockAdded());
		elements.add(new mcreator_pandoramTool());
		elements.add(new mcreator_pandoramToolRecipe());
		elements.add(new mcreator_sugarCaneKey());
		elements.add(new mcreator_sugarCaneKeyX2());
		elements.add(new mcreator_reubenCuben363ItemInUseTick());
		elements.add(new mcreator_reubenCuben363());
		elements.add(new mcreator_recorder());
		elements.add(new mcreator_recoederOfflineRedstoneOn());
		elements.add(new mcreator_recoederOffline());
		elements.add(new mcreator_recorderRedstoneOff());
		elements.add(new mcreator_recorderRecipe());
		elements.add(new mcreator_superCaneKeyRecipe());
		elements.add(new mcreator_superCaneKeyx2Recipe());
	}

	public static class ModElement {

		public static Object instance;

		public void load(FMLInitializationEvent event) {
		}

		public void generateNether(World world, Random random, int chunkX, int chunkZ) {
		}

		public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void registerRenderers() {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}
	}
}
