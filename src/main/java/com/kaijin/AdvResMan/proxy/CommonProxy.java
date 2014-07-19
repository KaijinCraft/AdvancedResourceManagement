/*******************************************************************************
 * Copyright (c) 2012-2014 Yancarlo Ramsey and CJ Bowman
 * Licensed as open source with restrictions. Please see attached LICENSE.txt.
 ******************************************************************************/
package com.kaijin.AdvResMan.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy
{
    public boolean isClient()
    {
        return FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT;
    }

    public boolean isServer()
    {
        return FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER;
    }

}
