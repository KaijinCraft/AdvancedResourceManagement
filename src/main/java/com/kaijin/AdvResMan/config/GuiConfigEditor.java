package com.kaijin.AdvResMan.config;

import com.kaijin.AdvResMan.Info;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class GuiConfigEditor extends GuiConfig
{
    public GuiConfigEditor(GuiScreen screen)
    {
        super(screen, new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
            Info.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString())
        );
    }
}
