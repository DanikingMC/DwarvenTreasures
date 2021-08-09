package com.dwarventreasures.common.registry;

import com.dwarventreasures.common.DwarvenTreasures;
import com.dwarventreasures.common.block.goblet.copper.CopperGobletHoneyBlock;
import com.dwarventreasures.common.block.goblet.copper.CopperGobletMilkBlock;
import com.dwarventreasures.common.block.goblet.copper.CopperGobletWaterBlock;
import com.dwarventreasures.common.block.goblet.copper.EmptiedCopperGobletBlock;
import com.dwarventreasures.common.block.goblet.debris.*;
import com.dwarventreasures.common.block.goblet.gold.EmptiedGoldenGobletBlock;
import com.dwarventreasures.common.block.goblet.gold.GoldenGobletHoneyBlock;
import com.dwarventreasures.common.block.goblet.gold.GoldenGobletMilkBlock;
import com.dwarventreasures.common.block.goblet.gold.GoldenGobletWaterBlock;
import com.dwarventreasures.common.block.goblet.mithril.EmptiedMithrilGobletBlock;
import com.dwarventreasures.common.block.goblet.mithril.MithrilGobletHoneyBlock;
import com.dwarventreasures.common.block.goblet.mithril.MithrilGobletMilkBlock;
import com.dwarventreasures.common.block.goblet.mithril.MithrilGobletWaterBlock;
import com.dwarventreasures.common.block.goblet.netherite.*;
import com.dwarventreasures.common.block.goblet.oceanic.EmptiedOceanicGoldGobletBlock;
import com.dwarventreasures.common.block.goblet.oceanic.OceanicGoldGobletHoneyBlock;
import com.dwarventreasures.common.block.goblet.oceanic.OceanicGoldGobletMilkBlock;
import com.dwarventreasures.common.block.goblet.oceanic.OceanicGoldGobletWaterBlock;
import com.dwarventreasures.common.block.goblet.silver.EmptiedSilverGobletBlock;
import com.dwarventreasures.common.block.goblet.silver.SilverGobletHoneyBlock;
import com.dwarventreasures.common.block.goblet.silver.SilverGobletMilkBlock;
import com.dwarventreasures.common.block.goblet.silver.SilverGobletWaterBlock;
import com.dwarventreasures.common.item.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class DTObjects {

    private static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    private static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();

    //copper
    public static final Block EMPTY_COPPER_GOBLET = create("copper_goblet", new EmptiedCopperGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_COPPER_GOBLET_ITEM = create("copper_goblet", new EmptiedCopperGobletItem(EMPTY_COPPER_GOBLET, group().maxCount(16)));
    public static final Block COPPER_GOBLET_OF_WATER = create("copper_goblet_of_water", new CopperGobletWaterBlock(gobletBlock()), false);
    public static final Item COPPER_GOBLET_OF_WATER_ITEM = create("copper_goblet_of_water", new FilledGobletItem(COPPER_GOBLET_OF_WATER, group().maxCount(1), EMPTY_COPPER_GOBLET_ITEM));
    public static final Block COPPER_GOBLET_OF_MILK = create("copper_goblet_of_milk", new CopperGobletMilkBlock(gobletBlock()), false);
    public static final Item COPPER_GOBLET_OF_MILK_ITEM = create("copper_goblet_of_milk", new FilledGobletItem(COPPER_GOBLET_OF_MILK, group().maxCount(1), EMPTY_COPPER_GOBLET_ITEM));
    public static final Block COPPER_GOBLET_OF_HONEY = create("copper_goblet_of_honey", new CopperGobletHoneyBlock(gobletBlock()), false);
    public static final Item COPPER_GOBLET_OF_HONEY_ITEM = create("copper_goblet_of_honey", new FilledGobletItem(COPPER_GOBLET_OF_HONEY, group().maxCount(1).food(FoodComponents.HONEY_BOTTLE), EMPTY_COPPER_GOBLET_ITEM, true));
    //golden
    public static final Block EMPTY_GOLDEN_GOBLET = create("golden_goblet", new EmptiedGoldenGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_GOLDEN_GOBLET_ITEM = create("golden_goblet", new EmptiedGoldenGobletItem(EMPTY_GOLDEN_GOBLET, group().maxCount(16)));
    public static final Block GOLDEN_GOBLET_OF_WATER = create("golden_goblet_of_water", new GoldenGobletWaterBlock(gobletBlock()), false);
    public static final Item GOLDEN_GOBLET_OF_WATER_ITEM = create("golden_goblet_of_water", new FilledGobletItem(GOLDEN_GOBLET_OF_WATER, group().maxCount(1), EMPTY_GOLDEN_GOBLET_ITEM));
    public static final Block GOLDEN_GOBLET_OF_MILK = create("golden_goblet_of_milk", new GoldenGobletMilkBlock(gobletBlock()), false);
    public static final Item GOLDEN_GOBLET_OF_MILK_ITEM = create("golden_goblet_of_milk", new FilledGobletItem(GOLDEN_GOBLET_OF_MILK, group().maxCount(1), EMPTY_GOLDEN_GOBLET_ITEM));
    public static final Block GOLDEN_GOBLET_OF_HONEY = create("golden_goblet_of_honey", new GoldenGobletHoneyBlock(gobletBlock()), false);
    public static final Item GOLDEN_GOBLET_OF_HONEY_ITEM = create("golden_goblet_of_honey", new FilledGobletItem(GOLDEN_GOBLET_OF_HONEY, group().maxCount(1).food(FoodComponents.HONEY_BOTTLE), EMPTY_GOLDEN_GOBLET_ITEM, true));
    //debris
    public static final Block EMPTY_DEBRIS_GOBLET = create("debris_goblet", new EmptiedDebrisGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_DEBRIS_GOBLET_ITEM = create("debris_goblet", new EmptiedDebrisGobletItem(EMPTY_DEBRIS_GOBLET, group().maxCount(16).fireproof()));
    public static final Block DEBRIS_GOBLET_OF_WATER = create("debris_goblet_of_water", new DebrisGobletWaterBlock(gobletBlock()), false);
    public static final Item DEBRIS_GOBLET_OF_WATER_ITEM = create("debris_goblet_of_water", new FilledGobletItem(DEBRIS_GOBLET_OF_WATER, group().maxCount(1).fireproof(), EMPTY_DEBRIS_GOBLET_ITEM));
    public static final Block DEBRIS_GOBLET_OF_MILK = create("debris_goblet_of_milk", new DebrisGobletMilkBlock(gobletBlock()), false);
    public static final Item DEBRIS_GOBLET_OF_MILK_ITEM = create("debris_goblet_of_milk", new FilledGobletItem(DEBRIS_GOBLET_OF_MILK, group().maxCount(1).fireproof(), EMPTY_DEBRIS_GOBLET_ITEM));
    public static final Block DEBRIS_GOBLET_OF_HONEY = create("debris_goblet_of_honey", new DebrisGobletHoneyBlock(gobletBlock()), false);
    public static final Item DEBRIS_GOBLET_OF_HONEY_ITEM = create("debris_goblet_of_honey", new FilledGobletItem(DEBRIS_GOBLET_OF_HONEY, group().maxCount(1).fireproof().food(FoodComponents.HONEY_BOTTLE), EMPTY_DEBRIS_GOBLET_ITEM));
    public static final Block DEBRIS_GOBLET_OF_LAVA = create("debris_goblet_of_lava", new DebrisGobletLavaBlock(gobletBlock().luminance(value -> 15)), false);
    public static final Item DEBRIS_GOBLET_OF_LAVA_ITEM = create("debris_goblet_of_lava", new FilledGobletItem(DEBRIS_GOBLET_OF_LAVA, group().maxCount(1).fireproof(), EMPTY_DEBRIS_GOBLET_ITEM, true));
    //netherite
    public static final Block EMPTY_NETHERITE_GOBLET = create("netherite_goblet", new EmptiedNetheriteGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_NETHERITE_GOBLET_ITEM = create("netherite_goblet", new EmptiedNetheriteGobletItem(EMPTY_NETHERITE_GOBLET, group().maxCount(16).fireproof()));
    public static final Block NETHERITE_GOBLET_OF_WATER = create("netherite_goblet_of_water", new NetheriteGobletWaterBlock(gobletBlock()), false);
    public static final Item NETHERITE_GOBLET_OF_WATER_ITEM = create("netherite_goblet_of_water", new FilledGobletItem(NETHERITE_GOBLET_OF_WATER, group().maxCount(1).fireproof(), EMPTY_NETHERITE_GOBLET_ITEM));
    public static final Block NETHERITE_GOBLET_OF_MILK = create("netherite_goblet_of_milk", new NetheriteGobletMilkBlock(gobletBlock()), false);
    public static final Item NETHERITE_GOBLET_OF_MILK_ITEM = create("netherite_goblet_of_milk", new FilledGobletItem(NETHERITE_GOBLET_OF_MILK, group().maxCount(1).fireproof(), EMPTY_NETHERITE_GOBLET_ITEM));
    public static final Block NETHERITE_GOBLET_OF_HONEY = create("netherite_goblet_of_honey", new NetheriteGobletHoneyBlock(gobletBlock()), false);
    public static final Item NETHERITE_GOBLET_OF_HONEY_ITEM = create("netherite_goblet_of_honey", new FilledGobletItem(NETHERITE_GOBLET_OF_HONEY, group().maxCount(1).fireproof().food(FoodComponents.HONEY_BOTTLE), EMPTY_NETHERITE_GOBLET_ITEM));
    public static final Block NETHERITE_GOBLET_OF_LAVA = create("netherite_goblet_of_lava", new NetheriteGobletLavaBlock(gobletBlock().luminance(value -> 15)), false);
    public static final Item NETHERITE_GOBLET_OF_LAVA_ITEM = create("netherite_goblet_of_lava", new FilledGobletItem(NETHERITE_GOBLET_OF_LAVA, group().maxCount(1).fireproof(), EMPTY_NETHERITE_GOBLET_ITEM, true));
    //mithril
    public static final Block EMPTY_MITHRIL_GOBLET = create("mithril_goblet", new EmptiedMithrilGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_MITHRIL_GOBLET_ITEM = create("mithril_goblet", new EmptiedMithrilGobletItem(EMPTY_MITHRIL_GOBLET, group().maxCount(16)));
    public static final Block MITHRIL_GOBLET_OF_WATER = create("mithril_goblet_of_water", new MithrilGobletWaterBlock(gobletBlock()), false);
    public static final Item MITHRIL_GOBLET_OF_WATER_ITEM = create("mithril_goblet_of_water", new FilledGobletItem(MITHRIL_GOBLET_OF_WATER, group().maxCount(1), EMPTY_MITHRIL_GOBLET_ITEM));
    public static final Block MITHRIL_GOBLET_OF_MILK = create("mithril_goblet_of_milk", new MithrilGobletMilkBlock(gobletBlock()), false);
    public static final Item MITHRIL_GOBLET_OF_MILK_ITEM = create("mithril_goblet_of_milk", new FilledGobletItem(MITHRIL_GOBLET_OF_MILK, group().maxCount(1), EMPTY_MITHRIL_GOBLET_ITEM));
    public static final Block MITHRIL_GOBLET_OF_HONEY = create("mithril_goblet_of_honey", new MithrilGobletHoneyBlock(gobletBlock()), false);
    public static final Item MITHRIL_GOBLET_OF_HONEY_ITEM = create("mithril_goblet_of_honey", new FilledGobletItem(MITHRIL_GOBLET_OF_HONEY, group().maxCount(1).food(FoodComponents.HONEY_BOTTLE), EMPTY_MITHRIL_GOBLET_ITEM, true));
    public static final Item MITHRIL_INGOT = create("mithril_ingot", new Item(group()));
    //silver
    public static final Block EMPTY_SILVER_GOBLET = create("silver_goblet", new EmptiedSilverGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_SILVER_GOBLET_ITEM = create("silver_goblet", new EmptiedSilverGobletItem(EMPTY_SILVER_GOBLET, group().maxCount(16)));
    public static final Block SILVER_GOBLET_OF_WATER = create("silver_goblet_of_water", new SilverGobletWaterBlock(gobletBlock()), false);
    public static final Item SILVER_GOBLET_OF_WATER_ITEM = create("silver_goblet_of_water", new FilledGobletItem(SILVER_GOBLET_OF_WATER, group().maxCount(1), EMPTY_SILVER_GOBLET_ITEM));
    public static final Block SILVER_GOBLET_OF_MILK = create("silver_goblet_of_milk", new SilverGobletMilkBlock(gobletBlock()), false);
    public static final Item SILVER_GOBLET_OF_MILK_ITEM = create("silver_goblet_of_milk", new FilledGobletItem(SILVER_GOBLET_OF_MILK, group().maxCount(1), EMPTY_SILVER_GOBLET_ITEM));
    public static final Block SILVER_GOBLET_OF_HONEY = create("silver_goblet_of_honey", new SilverGobletHoneyBlock(gobletBlock()), false);
    public static final Item SILVER_GOBLET_OF_HONEY_ITEM = create("silver_goblet_of_honey", new FilledGobletItem(SILVER_GOBLET_OF_HONEY, group().maxCount(1).food(FoodComponents.HONEY_BOTTLE), EMPTY_SILVER_GOBLET_ITEM, true));
    //oceanic gold
    public static final Block EMPTY_OCEANIC_GOLD_GOBLET = create("oceanic_gold_goblet", new EmptiedOceanicGoldGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_OCEANIC_GOLD_GOBLET_ITEM = create("oceanic_gold_goblet", new EmptiedOceanicGoldGobletItem(EMPTY_OCEANIC_GOLD_GOBLET, group().maxCount(16)));
    public static final Block OCEANIC_GOLD_GOBLET_OF_WATER = create("oceanic_gold_goblet_of_water", new OceanicGoldGobletWaterBlock(gobletBlock()), false);
    public static final Item OCEANIC_GOLD_GOBLET_OF_WATER_ITEM = create("oceanic_gold_goblet_of_water", new FilledGobletItem(OCEANIC_GOLD_GOBLET_OF_WATER, group().maxCount(1), EMPTY_OCEANIC_GOLD_GOBLET_ITEM));
    public static final Block OCEANIC_GOLD_GOBLET_OF_MILK = create("oceanic_gold_goblet_of_milk", new OceanicGoldGobletMilkBlock(gobletBlock()), false);
    public static final Item OCEANIC_GOLD_GOBLET_OF_MILK_ITEM = create("oceanic_gold_goblet_of_milk", new FilledGobletItem(OCEANIC_GOLD_GOBLET_OF_MILK, group().maxCount(1), EMPTY_OCEANIC_GOLD_GOBLET_ITEM));
    public static final Block OCEANIC_GOLD_GOBLET_OF_HONEY = create("oceanic_gold_goblet_of_honey", new OceanicGoldGobletHoneyBlock(gobletBlock()), false);
    public static final Item OCEANIC_GOLD_GOBLET_OF_HONEY_ITEM = create("oceanic_gold_goblet_of_honey", new FilledGobletItem(OCEANIC_GOLD_GOBLET_OF_HONEY, group().maxCount(1).food(FoodComponents.HONEY_BOTTLE), EMPTY_OCEANIC_GOLD_GOBLET_ITEM, true));


    private static <T extends Item> T create(String name, T item) {
        ITEMS.put(item, new Identifier(DwarvenTreasures.MODID, name));
        return item;
    }

    private static <T extends Block> T create(String name, T block, boolean createBlockItem) {
        BLOCKS.put(block, new Identifier(DwarvenTreasures.MODID, name));
        if (createBlockItem) {
            ITEMS.put(new BlockItem(block, group()), BLOCKS.get(block));
        }
        return block;
    }

    private static Item.Settings group()     {
        return new Item.Settings().group(DwarvenTreasures.DWARVEN_TREASURES_GROUP);
    }

    private static AbstractBlock.Settings gobletBlock() {
        return AbstractBlock.Settings.of(Material.METAL).strength(0.3F, 1.0F).nonOpaque();
    }

    public static void init() {
        BLOCKS.keySet().forEach(block -> Registry.register(Registry.BLOCK, BLOCKS.get(block), block));
        ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
    }


}
