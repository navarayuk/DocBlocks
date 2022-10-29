
package com.drblockheadmc.db.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

import com.drblockheadmc.db.world.inventory.BuilderLightDoorsGUIMenu;
import com.drblockheadmc.db.procedures.PlaceLightAirlockProcedure;
import com.drblockheadmc.db.procedures.BasePageProcedure;
import com.drblockheadmc.db.procedures.BackPageProcedure;
import com.drblockheadmc.db.DbMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BuilderLightDoorsGUIButtonMessage {
	private final int buttonID, x, y, z;

	public BuilderLightDoorsGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BuilderLightDoorsGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BuilderLightDoorsGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BuilderLightDoorsGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = BuilderLightDoorsGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			PlaceLightAirlockProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			BasePageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			BackPageProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DbMod.addNetworkMessage(BuilderLightDoorsGUIButtonMessage.class, BuilderLightDoorsGUIButtonMessage::buffer,
				BuilderLightDoorsGUIButtonMessage::new, BuilderLightDoorsGUIButtonMessage::handler);
	}
}
