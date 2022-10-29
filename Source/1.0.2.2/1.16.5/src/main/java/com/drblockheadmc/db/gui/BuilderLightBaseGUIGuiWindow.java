
package com.drblockheadmc.db.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.drblockheadmc.db.DbMod;

@OnlyIn(Dist.CLIENT)
public class BuilderLightBaseGUIGuiWindow extends ContainerScreen<BuilderLightBaseGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = BuilderLightBaseGUIGui.guistate;

	public BuilderLightBaseGUIGuiWindow(BuilderLightBaseGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 231;
		this.ySize = 229;
	}

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("db:textures/screens/lightgui.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 231, 229, 231, 229);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 55, this.guiTop + 56, 125, 20, new StringTextComponent("Blank small - soon"), e -> {
			if (true) {
				DbMod.PACKET_HANDLER.sendToServer(new BuilderLightBaseGUIGui.ButtonPressedMessage(0, x, y, z));
				BuilderLightBaseGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 55, this.guiTop + 80, 125, 20, new StringTextComponent("Blank Larg"), e -> {
			if (true) {
				DbMod.PACKET_HANDLER.sendToServer(new BuilderLightBaseGUIGui.ButtonPressedMessage(1, x, y, z));
				BuilderLightBaseGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 55, this.guiTop + 160, 125, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				DbMod.PACKET_HANDLER.sendToServer(new BuilderLightBaseGUIGui.ButtonPressedMessage(2, x, y, z));
				BuilderLightBaseGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 55, this.guiTop + 104, 125, 20, new StringTextComponent("Farms - soon"), e -> {
			if (true) {
				DbMod.PACKET_HANDLER.sendToServer(new BuilderLightBaseGUIGui.ButtonPressedMessage(3, x, y, z));
				BuilderLightBaseGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 55, this.guiTop + 128, 125, 20, new StringTextComponent("Portals- soon"), e -> {
			if (true) {
				DbMod.PACKET_HANDLER.sendToServer(new BuilderLightBaseGUIGui.ButtonPressedMessage(4, x, y, z));
				BuilderLightBaseGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}
}
