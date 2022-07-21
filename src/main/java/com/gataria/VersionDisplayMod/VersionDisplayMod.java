package com.gataria.VersionDisplayMod;

import com.gataria.VersionDisplayMod.client.gui.PlayerGuiOverlay;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * <p>
 * VersionDisplayMod is a mod that shows the current version number on the top left of the player's in-game screen,
 * intended to replicate the appearance of older beta and alpha Minecraft versions.
 * This code is not applicable to modern Minecraft and Forge versions -- it must be adapted to work on versions other
 * than 1.8.9.
 * </p>
 * <p>
 * This class initializes the mod, registering PlayerGuiOverlay in Forge's event bus to allow it to draw an overlay on
 * the player's in-game screen.
 * </p>
 * <p>
 * This mod's code is based on wehavecookies's Tutorial-Mod source code.
 * Check it out <a href="https://github.com/Wehavecookies56/Tutorial-Mod">here!</a>
 * </p>
 * <p>
 * Note: if this code is to be modified, it must be noted that the 1.8.9 Forge MDK (11.15.1.2318) uses a very outdated
 * version of Gradle (2.x), which is itself only supported by outdated IDEs (I used IntelliJ IDEA 2016.1.4).
 * </p>
 * @author Rodrigo Davila Castillo / gataria
 * @version 1.8.9.1
 */
@Mod(modid = VersionDisplayMod.MODID, version = VersionDisplayMod.VERSION)
public class VersionDisplayMod
{
    public static final String MODID = "VersionDisplayMod";
    public static final String VERSION = "1.0";

    /**
     * init() registers the mod in the Forge event bus, which allows it to draw the overlay alongside the vanilla game's
     * rendering of the in-game overlay.
     *
     * @param event The Forge API event that is used to perform mod functions at the initialization step.
     */
    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new PlayerGuiOverlay());
    }
}