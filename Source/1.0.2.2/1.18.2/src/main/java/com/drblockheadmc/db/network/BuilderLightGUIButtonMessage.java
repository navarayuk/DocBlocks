
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

import com.drblockheadmc.db.world.inventory.BuilderLightGUIMenu;
import com.drblockheadmc.db.procedures.DoorPageProcedure;
import com.drblockheadmc.db.procedures.CorridorPageProcedure;
import com.drblockheadmc.db.procedures.CloseGUIProcedure;
import com.drblockheadmc.db.procedures.BasePageProcedure;
import com.drblockheadmc.db.DbMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BuilderLightGUIButtonMessage {
	private final int buttonID, x, y, z;

	public BuilderLightGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BuilderLightGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BuilderLightGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BuilderLightGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = BuilderLightGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CorridorPageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			BasePageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			DoorPageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			CloseGUIProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DbMod.addNetworkMessage(BuilderLightGUIButtonMessage.class, BuilderLightGUIButtonMessage::buffer, BuilderLightGUIButtonMessage::new,
				BuilderLightGUIButtonMessage::handler);
	}
}
