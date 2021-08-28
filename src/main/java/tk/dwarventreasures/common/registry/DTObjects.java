package tk.dwarventreasures.common.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.dwarventreasures.common.DwarvenTreasures;
import tk.dwarventreasures.common.block.CoinPileBlock;
import tk.dwarventreasures.common.block.goblet.copper.CopperGobletHoneyBlock;
import tk.dwarventreasures.common.block.goblet.copper.CopperGobletMilkBlock;
import tk.dwarventreasures.common.block.goblet.copper.CopperGobletWaterBlock;
import tk.dwarventreasures.common.block.goblet.copper.EmptiedCopperGobletBlock;
import tk.dwarventreasures.common.block.goblet.debris.*;
import tk.dwarventreasures.common.block.goblet.gold.EmptiedGoldenGobletBlock;
import tk.dwarventreasures.common.block.goblet.gold.GoldenGobletHoneyBlock;
import tk.dwarventreasures.common.block.goblet.gold.GoldenGobletMilkBlock;
import tk.dwarventreasures.common.block.goblet.gold.GoldenGobletWaterBlock;
import tk.dwarventreasures.common.block.goblet.mithril.EmptiedMithrilGobletBlock;
import tk.dwarventreasures.common.block.goblet.mithril.MithrilGobletHoneyBlock;
import tk.dwarventreasures.common.block.goblet.mithril.MithrilGobletMilkBlock;
import tk.dwarventreasures.common.block.goblet.mithril.MithrilGobletWaterBlock;
import tk.dwarventreasures.common.block.goblet.netherite.*;
import tk.dwarventreasures.common.block.goblet.oceanic.EmptiedOceanicGoldGobletBlock;
import tk.dwarventreasures.common.block.goblet.oceanic.OceanicGoldGobletHoneyBlock;
import tk.dwarventreasures.common.block.goblet.oceanic.OceanicGoldGobletMilkBlock;
import tk.dwarventreasures.common.block.goblet.oceanic.OceanicGoldGobletWaterBlock;
import tk.dwarventreasures.common.block.goblet.silver.EmptiedSilverGobletBlock;
import tk.dwarventreasures.common.block.goblet.silver.SilverGobletHoneyBlock;
import tk.dwarventreasures.common.block.goblet.silver.SilverGobletMilkBlock;
import tk.dwarventreasures.common.block.goblet.silver.SilverGobletWaterBlock;
import tk.dwarventreasures.common.item.MithrilWaistcoatItem;
import tk.dwarventreasures.common.item.RingItem;
import tk.dwarventreasures.common.item.goblet.*;
import tk.dwarventreasures.common.item.tool.mithril.*;

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
    public static final Item COPPER_COIN = create("copper_coin", new Item(group()));
    public static final Block COPPER_COIN_PILE = create("copper_coin_pile", new CoinPileBlock(coinPileBlock()), true);
    public static final Item COPPER_RING = create("copper_ring", new RingItem(group().maxCount(1)));
    //golden
    public static final Block EMPTY_GOLDEN_GOBLET = create("golden_goblet", new EmptiedGoldenGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_GOLDEN_GOBLET_ITEM = create("golden_goblet", new EmptiedGoldenGobletItem(EMPTY_GOLDEN_GOBLET, group().maxCount(16)));
    public static final Block GOLDEN_GOBLET_OF_WATER = create("golden_goblet_of_water", new GoldenGobletWaterBlock(gobletBlock()), false);
    public static final Item GOLDEN_GOBLET_OF_WATER_ITEM = create("golden_goblet_of_water", new FilledGobletItem(GOLDEN_GOBLET_OF_WATER, group().maxCount(1), EMPTY_GOLDEN_GOBLET_ITEM));
    public static final Block GOLDEN_GOBLET_OF_MILK = create("golden_goblet_of_milk", new GoldenGobletMilkBlock(gobletBlock()), false);
    public static final Item GOLDEN_GOBLET_OF_MILK_ITEM = create("golden_goblet_of_milk", new FilledGobletItem(GOLDEN_GOBLET_OF_MILK, group().maxCount(1), EMPTY_GOLDEN_GOBLET_ITEM));
    public static final Block GOLDEN_GOBLET_OF_HONEY = create("golden_goblet_of_honey", new GoldenGobletHoneyBlock(gobletBlock()), false);
    public static final Item GOLDEN_GOBLET_OF_HONEY_ITEM = create("golden_goblet_of_honey", new FilledGobletItem(GOLDEN_GOBLET_OF_HONEY, group().maxCount(1).food(FoodComponents.HONEY_BOTTLE), EMPTY_GOLDEN_GOBLET_ITEM, true));
    public static final Item GOLD_COIN = create("gold_coin", new Item(group()));
    public static final Block GOLD_COIN_PILE = create("gold_coin_pile", new CoinPileBlock(coinPileBlock()), true);
    public static final Item GOLD_RING = create("gold_ring", new RingItem(group().maxCount(1)));
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
    public static final Item DEBRIS_COIN = create("debris_coin", new Item(group()));
    public static final Block DEBRIS_COIN_PILE = create("debris_coin_pile", new CoinPileBlock(coinPileBlock()), true);
    public static final Item DEBRIS_RING = create("debris_ring", new RingItem(group().maxCount(1)));
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
    public static final Item NETHERITE_COIN = create("netherite_coin", new Item(group()));
    public static final Block NETHERITE_COIN_PILE = create("netherite_coin_pile", new CoinPileBlock(coinPileBlock()), true);
    public static final Item NETHERITE_RING = create("netherite_ring", new RingItem(group().maxCount(1)));
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
    public static final Item MITHRIL_COIN = create("mithril_coin", new Item(group()));
    public static final Block MITHRIL_COIN_PILE = create("mithril_coin_pile", new CoinPileBlock(coinPileBlock()), true);
    public static final Block MITHRIL_BLOCK = create("mithril_block", new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)), true);
    public static final Block CHISELED_MITHRIL = create("chiseled_mithril", new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)), true);
    public static final Block POLISHED_MITHRIL = create("polished_mithril", new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)), true);
    public static final Block MITHRIL_PLATE = create("mithril_plate", new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)), true);
    public static final Block MITHRIL_TILE = create("mithril_tile", new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)), true);
    public static final Block INVERTED_MITHRIL_TILE = create("inverted_mithril_tile", new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)), true);
    public static final Item MITHRIL_RING = create("mithril_ring", new RingItem(group().maxCount(1)));
    //silver
    public static final Block EMPTY_SILVER_GOBLET = create("silver_goblet", new EmptiedSilverGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_SILVER_GOBLET_ITEM = create("silver_goblet", new EmptiedSilverGobletItem(EMPTY_SILVER_GOBLET, group().maxCount(16)));
    public static final Block SILVER_GOBLET_OF_WATER = create("silver_goblet_of_water", new SilverGobletWaterBlock(gobletBlock()), false);
    public static final Item SILVER_GOBLET_OF_WATER_ITEM = create("silver_goblet_of_water", new FilledGobletItem(SILVER_GOBLET_OF_WATER, group().maxCount(1), EMPTY_SILVER_GOBLET_ITEM));
    public static final Block SILVER_GOBLET_OF_MILK = create("silver_goblet_of_milk", new SilverGobletMilkBlock(gobletBlock()), false);
    public static final Item SILVER_GOBLET_OF_MILK_ITEM = create("silver_goblet_of_milk", new FilledGobletItem(SILVER_GOBLET_OF_MILK, group().maxCount(1), EMPTY_SILVER_GOBLET_ITEM));
    public static final Block SILVER_GOBLET_OF_HONEY = create("silver_goblet_of_honey", new SilverGobletHoneyBlock(gobletBlock()), false);
    public static final Item SILVER_GOBLET_OF_HONEY_ITEM = create("silver_goblet_of_honey", new FilledGobletItem(SILVER_GOBLET_OF_HONEY, group().maxCount(1).food(FoodComponents.HONEY_BOTTLE), EMPTY_SILVER_GOBLET_ITEM, true));
    public static final Item SILVER_COIN = create("silver_coin", new Item(group()));
    public static final Block SILVER_COIN_PILE = create("silver_coin_pile", new CoinPileBlock(coinPileBlock()), true);
    public static final Item SILVER_RING = create("silver_ring", new RingItem(group().maxCount(1)));
    //oceanic gold
    public static final Block EMPTY_OCEANIC_GOLD_GOBLET = create("oceanic_gold_goblet", new EmptiedOceanicGoldGobletBlock(gobletBlock()), false);
    public static final Item EMPTY_OCEANIC_GOLD_GOBLET_ITEM = create("oceanic_gold_goblet", new EmptiedOceanicGoldGobletItem(EMPTY_OCEANIC_GOLD_GOBLET, group().maxCount(16)));
    public static final Block OCEANIC_GOLD_GOBLET_OF_WATER = create("oceanic_gold_goblet_of_water", new OceanicGoldGobletWaterBlock(gobletBlock()), false);
    public static final Item OCEANIC_GOLD_GOBLET_OF_WATER_ITEM = create("oceanic_gold_goblet_of_water", new FilledGobletItem(OCEANIC_GOLD_GOBLET_OF_WATER, group().maxCount(1), EMPTY_OCEANIC_GOLD_GOBLET_ITEM));
    public static final Block OCEANIC_GOLD_GOBLET_OF_MILK = create("oceanic_gold_goblet_of_milk", new OceanicGoldGobletMilkBlock(gobletBlock()), false);
    public static final Item OCEANIC_GOLD_GOBLET_OF_MILK_ITEM = create("oceanic_gold_goblet_of_milk", new FilledGobletItem(OCEANIC_GOLD_GOBLET_OF_MILK, group().maxCount(1), EMPTY_OCEANIC_GOLD_GOBLET_ITEM));
    public static final Block OCEANIC_GOLD_GOBLET_OF_HONEY = create("oceanic_gold_goblet_of_honey", new OceanicGoldGobletHoneyBlock(gobletBlock()), false);
    public static final Item OCEANIC_GOLD_GOBLET_OF_HONEY_ITEM = create("oceanic_gold_goblet_of_honey", new FilledGobletItem(OCEANIC_GOLD_GOBLET_OF_HONEY, group().maxCount(1).food(FoodComponents.HONEY_BOTTLE), EMPTY_OCEANIC_GOLD_GOBLET_ITEM, true));
    public static final Item OCEANIC_GOLD_COIN = create("oceanic_gold_coin", new Item(group()));
    public static final Block OCEANIC_GOLD_COIN_PILE = create("oceanic_gold_coin_pile", new CoinPileBlock(coinPileBlock()), true);
    public static final Item OCEANIC_GOLD_RING = create("oceanic_gold_ring", new RingItem(group().maxCount(1)));
    //tools and equipment
    public static final Item MITHRIL_SWORD = create("mithril_sword", new MithrilSwordItem(DTMaterial.MITHRIL_TOOL, 3, -2.4F, group()));
    public static final Item MITHRIL_PICKAXE = create("mithril_pickaxe", new MithrilPickaxeItem(DTMaterial.MITHRIL_TOOL, 1, -2.8F, group()));
    public static final Item MITHRIL_AXE = create("mithril_axe", new MithrilAxeItem(DTMaterial.MITHRIL_TOOL, 5.0F, -3.0F, group()));
    public static final Item MITHRIL_SHOVEL = create("mithril_shovel", new MithrilShovelItem(DTMaterial.MITHRIL_TOOL, 1.5F, -3.0F, group()));
    public static final Item MITHRIL_HOE = create("mithril_hoe", new MithrilHoeItem(DTMaterial.MITHRIL_TOOL, -3, 0.0F, group()));
    public static final Item MITHRIL_HELMET = create("mithril_helmet", new ArmorItem(DTMaterial.MITHRIL_ARMOR, EquipmentSlot.HEAD, group()));
    public static final Item MITHRIL_CHESTPLATE = create("mithril_chestplate", new ArmorItem(DTMaterial.MITHRIL_ARMOR, EquipmentSlot.CHEST, group()));
    public static final Item MITHRIL_WAISTCOAT = create("mithril_waistcoat", new MithrilWaistcoatItem(group().maxCount(1)));
    public static final Item MITHRIL_LEGGINGS = create("mithril_leggings", new ArmorItem(DTMaterial.MITHRIL_ARMOR, EquipmentSlot.LEGS, group()));
    public static final Item MITHRIL_BOOTS = create("mithril_boots", new ArmorItem(DTMaterial.MITHRIL_ARMOR, EquipmentSlot.FEET, group()));

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

    private static Item.Settings group() {
        return new Item.Settings().group(DwarvenTreasures.DWARVEN_TREASURES_GROUP);
    }

    private static AbstractBlock.Settings gobletBlock() {
        return AbstractBlock.Settings.of(Material.METAL).strength(0.3F, 1.0F).nonOpaque();
    }
    private static AbstractBlock.Settings coinPileBlock() {
        return AbstractBlock.Settings.of(Material.DECORATION).ticksRandomly().strength(0.5F).requiresTool();
    }

    public static void init() {
        BLOCKS.keySet().forEach(block -> Registry.register(Registry.BLOCK, BLOCKS.get(block), block));
        ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
    }
}
