package com.direwolf20.buildinggadgets;

import com.direwolf20.buildinggadgets.items.BuildingTool;
import com.direwolf20.buildinggadgets.items.ExchangerTool;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    @GameRegistry.ObjectHolder("buildinggadgets:buildingtool")
    public static BuildingTool buildingTool;

    @GameRegistry.ObjectHolder("buildinggadgets:exchangertool")
    public static ExchangerTool exchangerTool;
}
