package net.mcreator.bettermine.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.bettermine.world.inventory.CuttingboardguiMenu;
import net.mcreator.bettermine.network.CuttingboardguiButtonMessage;
import net.mcreator.bettermine.BettermineMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CuttingboardguiScreen extends AbstractContainerScreen<CuttingboardguiMenu> {
	private final static HashMap<String, Object> guistate = CuttingboardguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_knife;

	public CuttingboardguiScreen(CuttingboardguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("bettermine:textures/screens/cuttingboardgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("bettermine:textures/screens/knife_ghost.png"), this.leftPos + 8, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("bettermine:textures/screens/cutting_table.png"), this.leftPos + 37, this.topPos + 5, 0, 0, 64, 64, 64, 64);

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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.bettermine.cuttingboardgui.label_cutting_board"), 52, 2, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_knife = new ImageButton(this.leftPos + 61, this.topPos + 35, 16, 16, 0, 0, 16, new ResourceLocation("bettermine:textures/screens/atlas/imagebutton_knife.png"), 16, 32, e -> {
			if (true) {
				BettermineMod.PACKET_HANDLER.sendToServer(new CuttingboardguiButtonMessage(0, x, y, z));
				CuttingboardguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_knife", imagebutton_knife);
		this.addRenderableWidget(imagebutton_knife);
	}
}
