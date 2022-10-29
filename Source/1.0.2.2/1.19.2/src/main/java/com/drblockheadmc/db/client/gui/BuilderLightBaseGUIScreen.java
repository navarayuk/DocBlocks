
package com.drblockheadmc.db.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

import com.drblockheadmc.db.world.inventory.BuilderLightBaseGUIMenu;
import com.drblockheadmc.db.network.BuilderLightBaseGUIButtonMessage;
import com.drblockheadmc.db.DbMod;

public class BuilderLightBaseGUIScreen extends AbstractContainerScreen<BuilderLightBaseGUIMenu> {
	private final static HashMap<String, Object> guistate = BuilderLightBaseGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BuilderLightBaseGUIScreen(BuilderLightBaseGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 231;
		this.imageHeight = 229;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("db:textures/screens/lightgui.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 231, 229, 231, 229);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 55, this.topPos + 56, 125, 20, Component.literal("Blank small - soon"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 55, this.topPos + 80, 125, 20, Component.literal("Blank Larg"), e -> {
			if (true) {
				DbMod.PACKET_HANDLER.sendToServer(new BuilderLightBaseGUIButtonMessage(1, x, y, z));
				BuilderLightBaseGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 55, this.topPos + 160, 125, 20, Component.literal("Back"), e -> {
			if (true) {
				DbMod.PACKET_HANDLER.sendToServer(new BuilderLightBaseGUIButtonMessage(2, x, y, z));
				BuilderLightBaseGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 55, this.topPos + 104, 125, 20, Component.literal("Farms - soon"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 55, this.topPos + 128, 125, 20, Component.literal("Portals- soon"), e -> {
		}));
	}
}
