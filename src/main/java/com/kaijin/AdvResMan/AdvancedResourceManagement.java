/*******************************************************************************
 * Copyright (c) 2012-2014 Yancarlo Ramsey and CJ Bowman
 * Licensed as open source with restrictions. Please see attached LICENSE.txt.
 ******************************************************************************/
package com.kaijin.AdvResMan;

import com.kaijin.AdvResMan.config.ConfigurationHandler;
import com.kaijin.AdvResMan.proxy.CommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Info.MOD_ID, name = Info.TITLE, version = Info.VERSION, /* certificateFingerprint = Info.FINGERPRINT, */ guiFactory = Info.CONFIG_GUI_FACTORY)
public class AdvancedResourceManagement
{
    @Mod.Instance(Info.MOD_ID)
    public static AdvancedResourceManagement instance;

    @SidedProxy(clientSide = Info.CLIENT_PROXY, serverSide = Info.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.setAndLoadFile(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }
}
