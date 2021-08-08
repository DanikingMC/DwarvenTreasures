package com.dwarventreasures.common.item;

import com.dwarventreasures.common.item.util.EmptiedGobletItem;
import com.dwarventreasures.common.registry.ModObjects;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class EmptiedDebrisGobletItem extends EmptiedGobletItem {

    public EmptiedDebrisGobletItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    protected ItemStack findFilledWaterGoblet(ItemStack inputStack) {
        if (inputStack.isOf(ModObjects.EMPTY_DEBRIS_GOBLET_ITEM)) {
            return new ItemStack(ModObjects.DEBRIS_GOBLET_OF_WATER_ITEM);
        }
        return ItemStack.EMPTY;
    }

}
