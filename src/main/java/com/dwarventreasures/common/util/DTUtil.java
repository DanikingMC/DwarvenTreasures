package com.dwarventreasures.common.util;

import com.dwarventreasures.common.registry.ModObjects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.util.Hand;

public class DTUtil {

    public static void switchStack(PlayerEntity player, Hand hand, ItemStack toSwitch, Item newItem) {
       final ItemStack finalStack = ItemUsage.exchangeStack(toSwitch, player, new ItemStack(newItem));
       player.setStackInHand(hand, finalStack);
    }

    public static void switchStack(PlayerEntity player, Hand hand, ItemStack toSwitch, ItemStack newStack) {
        final ItemStack finalStack = ItemUsage.exchangeStack(toSwitch, player, newStack);
        player.setStackInHand(hand, finalStack);
    }

    /**
     * Used on entity mixins
     * @param inputStack empty goblet-
     * @return the matched milk goblet
     */
    public static ItemStack getMilkGobletFromInput(ItemStack inputStack) {
        if (inputStack.isOf(ModObjects.EMPTY_COPPER_GOBLET_ITEM)) {
            return new ItemStack(ModObjects.COPPER_GOBLET_OF_MILK_ITEM);
        } else if (inputStack.isOf(ModObjects.EMPTY_GOLDEN_GOBLET_ITEM)) {
            return new ItemStack(ModObjects.GOLDEN_GOBLET_OF_MILK_ITEM);
        } else {
            return ItemStack.EMPTY;
        }
    }

}
