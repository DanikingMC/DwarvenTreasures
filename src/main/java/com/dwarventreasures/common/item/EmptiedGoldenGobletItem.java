package com.dwarventreasures.common.item;

import com.dwarventreasures.common.item.util.EmptiedGobletItem;
import com.dwarventreasures.common.registry.ModObjects;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class EmptiedGoldenGobletItem extends EmptiedGobletItem {
    public EmptiedGoldenGobletItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    protected ItemStack findFilledWaterGoblet(ItemStack inputStack) {
        if (inputStack.isOf(ModObjects.EMPTY_GOLDEN_GOBLET_ITEM)) {
            return new ItemStack(ModObjects.GOLDEN_GOBLET_OF_WATER_ITEM);
        }
        return ItemStack.EMPTY;
    }
}
