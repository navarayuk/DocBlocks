package com.drblockheadmc.db.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class CarboardBoxStarterBoxOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("db", "starterpack2"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundSource.MASTER, 3, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundSource.MASTER, 3, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(),
							null).withSuppressedOutput(),
					("/tellraw " + entity.getDisplayName().getString()
							+ " [\"\",{\"text\":\"The sugar c\",\"color\":\"green\"},{\"text\":\"a\",\"obfuscated\":true,\"color\":\"green\"},{\"text\":\"ne is the truth\",\"color\":\"green\"},{\"text\":\", \"},{\"text\":\"welcome to your\",\"color\":\"green\"},{\"text\":\" \"},{\"text\":\"starter k\",\"color\":\"red\"},{\"text\":\"i\",\"obfuscated\":true,\"color\":\"red\"},{\"text\":\"t\",\"color\":\"red\"},{\"text\":\", \"},{\"text\":\"enjoy\",\"color\":\"green\"}]"));
	}
}
