/*******************************************************************************
 * Copyright (c) 2012-2014 Yancarlo Ramsey and CJ Bowman
 * Licensed as open source with restrictions. Please see attached LICENSE.txt.
 ******************************************************************************/
package com.kaijin.AdvResMan.config;

import com.kaijin.AdvResMan.Info;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    // Keep config info around for use in config editor gui
    public static Configuration config = null;

    // Config options
    public static boolean debug = false;

    public static void setAndLoadFile(File cf)
    {
        if (config == null)
        {
            config = new Configuration(cf);
            loadConfig();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Info.MOD_ID))
        {
            loadConfig();
        }
    }

    private static void loadConfig()
    {
        // Load config options
        debug = config.getBoolean("debugOutput", Configuration.CATEGORY_GENERAL, false, "Enables debug output in the log. For development purposes.");

        if (config.hasChanged())
        {
            // Save to file
            config.save();
        }
    }
}
