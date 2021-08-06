package com.dwarventreasures.common.item.copper;

import com.dwarventreasures.common.item.util.EmptiedGobletItem;
import com.dwarventreasures.common.registry.ModObjects;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class EmptiedCopperGobletItem extends EmptiedGobletItem {

    public EmptiedCopperGobletItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    protected ItemStack findFilledMilkGoblet(ItemStack inputStack, PlayerEntity player) {
        if (inputStack.isOf(ModObjects.EMPTY_COPPER_GOBLET_ITEM)) {
            return new ItemStack(ModObjects.COPPER_GOBLET_OF_MILK_ITEM);
        }
        return ItemStack.EMPTY;
    }

    @Override
    protected ItemStack findFilledWaterGoblet(ItemStack inputStack) {
        if (inputStack.isOf(ModObjects.EMPTY_COPPER_GOBLET_ITEM)) {
            return new ItemStack(ModObjects.COPPER_GOBLET_OF_WATER_ITEM);
        }
        return ItemStack.EMPTY;
    }


//
//    @Override
//    protected ItemStack fillGobletWithWater(ItemStack inputStack, PlayerEntity player, FluidState state) {
//        final ItemStack filledGoblet = new ItemStack(ModObjects.COPPER_GOBLET_OF_WATER_ITEM);
//        DTUtil.switchItemStack(player, inputStack, filledGoblet);
//        return filledGoblet;
//    }
//
//    @Override
//    protected void fillGobletWithMilk(ItemStack inputStack, PlayerEntity player) {
//        final ItemStack filledGoblet = new ItemStack(ModObjects.COPPER_GOBLET_OF_MILK_ITEM);
//        DTUtil.switchItemStack(player, inputStack, filledGoblet);
//    }


}


