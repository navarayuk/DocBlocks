package com.drblockheadmc.db.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import java.util.Map;

import com.drblockheadmc.db.DbMod;

public class CarboardBoxStarterBoxOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DbMod.LOGGER.warn("Failed to load dependency world for procedure CarboardBoxStarterBoxOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DbMod.LOGGER.warn("Failed to load dependency x for procedure CarboardBoxStarterBoxOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DbMod.LOGGER.warn("Failed to load dependency y for procedure CarboardBoxStarterBoxOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DbMod.LOGGER.warn("Failed to load dependency z for procedure CarboardBoxStarterBoxOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DbMod.LOGGER.warn("Failed to load dependency entity for procedure CarboardBoxStarterBoxOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("db", "starterpack2"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos(x, y, z),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
					SoundCategory.MASTER, (float) 3, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
					SoundCategory.MASTER, (float) 3, (float) 1, false);
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					("/tellraw " + entity.getDisplayName().getString()
							+ " [\"\",{\"text\":\"The sugar c\",\"color\":\"green\"},{\"text\":\"a\",\"obfuscated\":true,\"color\":\"green\"},{\"text\":\"ne is the truth\",\"color\":\"green\"},{\"text\":\", \"},{\"text\":\"welcome to your\",\"color\":\"green\"},{\"text\":\" \"},{\"text\":\"starter k\",\"color\":\"red\"},{\"text\":\"i\",\"obfuscated\":true,\"color\":\"red\"},{\"text\":\"t\",\"color\":\"red\"},{\"text\":\", \"},{\"text\":\"enjoy\",\"color\":\"green\"}]"));
		}
	}
}
