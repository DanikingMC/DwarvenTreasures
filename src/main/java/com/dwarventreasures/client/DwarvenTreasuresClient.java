package com.dwarventreasures.client;

import com.dwarventreasures.common.registry.ModObjects;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.world.biome.BiomeKeys;

public class DwarvenTreasuresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModObjects.EMPTY_COPPER_GOBLET, ModObjects.EMPTY_GOLDEN_GOBLET);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> tintIndex == 1 ? BuiltinRegistries.BIOME.get(BiomeKeys.OCEAN).getWaterColor() : 0xFFFFFFFF , ModObjects.COPPER_GOBLET_OF_WATER, ModObjects.GOLDEN_GOBLET_OF_WATER);
    }
}
