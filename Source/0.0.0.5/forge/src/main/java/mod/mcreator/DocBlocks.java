package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.model.obj.OBJLoader;

import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Random;

@Mod(modid = TestEnvironmentMod.MODID, version = TestEnvironmentMod.VERSION)
public class TestEnvironmentMod implements IFuelHandler, IWorldGenerator {

	public static final String MODID = "TestEnvironmentMod";
	public static final String VERSION = "0.0.0.5 M Alpha";

	@SidedProxy(clientSide = "mod.mcreator.ClientProxyTestEnvironmentMod", serverSide = "mod.mcreator.CommonProxyTestEnvironmentMod")
	public static CommonProxyTestEnvironmentMod proxy;

	@Instance(MODID)
	public static TestEnvironmentMod instance;

	mcreator_sugarCaneArmor mcreator_0 = new mcreator_sugarCaneArmor();
	mcreator_sugarCaneSword mcreator_1 = new mcreator_sugarCaneSword();
	mcreator_sugarCaneSwordEnc mcreator_2 = new mcreator_sugarCaneSwordEnc();
	mcreator_sugarCaneSwordAgain mcreator_3 = new mcreator_sugarCaneSwordAgain();
	mcreator_sugarCaneAxe mcreator_4 = new mcreator_sugarCaneAxe();
	mcreator_sugaCaneShovel mcreator_5 = new mcreator_sugaCaneShovel();
	mcreator_sugarCanePickaxe mcreator_6 = new mcreator_sugarCanePickaxe();
	mcreator_sugarCaneDongle mcreator_7 = new mcreator_sugarCaneDongle();
	mcreator_sugarCaneDonglePlus mcreator_8 = new mcreator_sugarCaneDonglePlus();
	mcreator_sugarCube mcreator_9 = new mcreator_sugarCube();
	mcreator_cscI mcreator_10 = new mcreator_cscI();
	mcreator_cscII mcreator_11 = new mcreator_cscII();
	mcreator_cscIII mcreator_12 = new mcreator_cscIII();
	mcreator_cscIIII mcreator_13 = new mcreator_cscIIII();

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (mcreator_0.addFuel(fuel) != 0)
			return mcreator_0.addFuel(fuel);
		if (mcreator_1.addFuel(fuel) != 0)
			return mcreator_1.addFuel(fuel);
		if (mcreator_2.addFuel(fuel) != 0)
			return mcreator_2.addFuel(fuel);
		if (mcreator_3.addFuel(fuel) != 0)
			return mcreator_3.addFuel(fuel);
		if (mcreator_4.addFuel(fuel) != 0)
			return mcreator_4.addFuel(fuel);
		if (mcreator_5.addFuel(fuel) != 0)
			return mcreator_5.addFuel(fuel);
		if (mcreator_6.addFuel(fuel) != 0)
			return mcreator_6.addFuel(fuel);
		if (mcreator_7.addFuel(fuel) != 0)
			return mcreator_7.addFuel(fuel);
		if (mcreator_8.addFuel(fuel) != 0)
			return mcreator_8.addFuel(fuel);
		if (mcreator_9.addFuel(fuel) != 0)
			return mcreator_9.addFuel(fuel);
		if (mcreator_10.addFuel(fuel) != 0)
			return mcreator_10.addFuel(fuel);
		if (mcreator_11.addFuel(fuel) != 0)
			return mcreator_11.addFuel(fuel);
		if (mcreator_12.addFuel(fuel) != 0)
			return mcreator_12.addFuel(fuel);
		if (mcreator_13.addFuel(fuel) != 0)
			return mcreator_13.addFuel(fuel);
		return 0;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

		chunkX = chunkX * 16;
		chunkZ = chunkZ * 16;
		if (world.provider.getDimension() == -1)
			mcreator_0.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_0.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_1.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_1.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_2.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_2.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_3.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_3.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_4.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_4.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_5.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_5.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_6.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_6.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_7.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_7.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_8.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_8.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_9.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_9.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_10.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_10.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_11.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_11.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_12.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_12.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_13.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_13.generateSurface(world, random, chunkX, chunkZ);

	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		GameRegistry.registerFuelHandler(this);
		GameRegistry.registerWorldGenerator(this, 1);
		if (event.getSide() == Side.CLIENT) {
			OBJLoader.INSTANCE.addDomain("TestEnvironmentMod");
		}
		MinecraftForge.EVENT_BUS.register(new mcreator_GlobalEventsTestEnvironmentMod());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		mcreator_0.load(event);
		mcreator_1.load(event);
		mcreator_2.load(event);
		mcreator_3.load(event);
		mcreator_4.load(event);
		mcreator_5.load(event);
		mcreator_6.load(event);
		mcreator_7.load(event);
		mcreator_8.load(event);
		mcreator_9.load(event);
		mcreator_10.load(event);
		mcreator_11.load(event);
		mcreator_12.load(event);
		mcreator_13.load(event);
		proxy.registerRenderers(this);

	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		mcreator_0.serverLoad(event);
		mcreator_1.serverLoad(event);
		mcreator_2.serverLoad(event);
		mcreator_3.serverLoad(event);
		mcreator_4.serverLoad(event);
		mcreator_5.serverLoad(event);
		mcreator_6.serverLoad(event);
		mcreator_7.serverLoad(event);
		mcreator_8.serverLoad(event);
		mcreator_9.serverLoad(event);
		mcreator_10.serverLoad(event);
		mcreator_11.serverLoad(event);
		mcreator_12.serverLoad(event);
		mcreator_13.serverLoad(event);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		mcreator_0.instance = this.instance;
		mcreator_1.instance = this.instance;
		mcreator_2.instance = this.instance;
		mcreator_3.instance = this.instance;
		mcreator_4.instance = this.instance;
		mcreator_5.instance = this.instance;
		mcreator_6.instance = this.instance;
		mcreator_7.instance = this.instance;
		mcreator_8.instance = this.instance;
		mcreator_9.instance = this.instance;
		mcreator_10.instance = this.instance;
		mcreator_11.instance = this.instance;
		mcreator_12.instance = this.instance;
		mcreator_13.instance = this.instance;
		mcreator_0.preInit(event);
		mcreator_1.preInit(event);
		mcreator_2.preInit(event);
		mcreator_3.preInit(event);
		mcreator_4.preInit(event);
		mcreator_5.preInit(event);
		mcreator_6.preInit(event);
		mcreator_7.preInit(event);
		mcreator_8.preInit(event);
		mcreator_9.preInit(event);
		mcreator_10.preInit(event);
		mcreator_11.preInit(event);
		mcreator_12.preInit(event);
		mcreator_13.preInit(event);

		ResourceLocation sound0 = new ResourceLocation("TestEnvironmentMod", "dongledo");
		GameRegistry.register(new net.minecraft.util.SoundEvent(sound0).setRegistryName(sound0));

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

}
