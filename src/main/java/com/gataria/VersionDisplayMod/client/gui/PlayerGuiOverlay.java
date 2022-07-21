package com.gataria.VersionDisplayMod.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.awt.Color;

/**
 * The class with code that modifies/adds to the vanilla game's player HUD.
 *
 * @author Rodrigo Davila Castillo / gataria
 * @version 1.8.9.1
 */
public class PlayerGuiOverlay extends Gui {

    /**
     * Draws the text on the upper-left corner of the screen every time the game's vanilla overlay is rendered.
     * The drawn text is "Minecraft 1.8.9", and it should be in white with a drop shadow.
     *
     * @param event The in-game event of rendering the game's overlay (the player's HUD).
     */
    @SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event) {
        if (event.type.equals(RenderGameOverlayEvent.ElementType.TEXT)) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.fontRendererObj.drawString("Minecraft 1.8.9", 2, 2, Color.WHITE.getRGB(), true);
        }
    }
}