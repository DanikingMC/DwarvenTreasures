package com.dwarventreasures.common;

import com.dwarventreasures.common.registry.DTObjects;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DwarvenTreasures implements ModInitializer {

    public static final String MODID = "dwarventreasures";
    public static final ItemGroup DWARVEN_TREASURES_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(DTObjects.EMPTY_MITHRIL_GOBLET_ITEM));


    @Override
    public void onInitialize() {
        DTObjects.init();
    }
}
