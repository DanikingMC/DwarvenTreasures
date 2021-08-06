package com.dwarventreasures.common.registry;

import com.dwarventreasures.common.DwarvenTreasures;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {

    public static final Tag<Item> EMPTY_GOBLETS = TagRegistry.item(new Identifier(DwarvenTreasures.MODID, "empty_goblets"));
    public static final Tag<Item> VALID_TO_FILL_GOBLET = TagRegistry.item(new Identifier(DwarvenTreasures.MODID, "valid_to_fill_goblet"));
    public static final Tag<Item> MILK_GOBLETS = TagRegistry.item(new Identifier(DwarvenTreasures.MODID, "milk_goblets"));
    public static final Tag<Item> HONEY_GOBLETS = TagRegistry.item(new Identifier(DwarvenTreasures.MODID, "honey_goblets"));

}
