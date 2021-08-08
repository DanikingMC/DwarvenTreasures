package com.dwarventreasures.common.item;

import com.dwarventreasures.common.item.util.EmptiedGobletItem;
import com.dwarventreasures.common.registry.ModObjects;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class EmptiedNetheriteGobletItem extends EmptiedGobletItem {
    public EmptiedNetheriteGobletItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    protected ItemStack findFilledWaterGoblet(ItemStack inputStack) {
        if (inputStack.isOf(ModObjects.EMPTY_NETHERITE_GOBLET_ITEM)) {
            return new ItemStack(ModObjects.NETHERITE_GOBLET_OF_WATER);
        }
        return ItemStack.EMPTY;
    }
}
