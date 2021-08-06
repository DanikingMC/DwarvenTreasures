package com.dwarventreasures.common.block.copper;

import com.dwarventreasures.common.block.util.EmptiedGobletBlock;
import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.sound.SoundEvents;

public class EmptiedCopperGobletBlock extends EmptiedGobletBlock  {

    private final boolean honey;

    public EmptiedCopperGobletBlock(Settings settings, boolean honey) {
        super(settings);
        this.honey = honey;
    }

    public EmptiedCopperGobletBlock(Settings settings) {
        this(settings, false);
    }
        @Override
    protected void playEmptyingGobletSound(PlayerEntity player) {
        if (player.getMainHandStack().isOf(ModObjects.COPPER_GOBLET_OF_HONEY_ITEM) || player.getMainHandStack().isOf(Items.HONEY_BOTTLE)) {
            player.playSound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK, 1.0F, 1.0F);
        } else {
            super.playEmptyingGobletSound(player);
        }
    }

    @Override
    protected Block getFilledBlock(PlayerEntity player, ItemStack inputStack) {
        if (PotionUtil.getPotion(inputStack) == Potions.WATER) {
            return ModObjects.COPPER_GOBLET_OF_WATER;
        }
        if (inputStack.isOf(ModObjects.COPPER_GOBLET_OF_WATER_ITEM)) {
            return ModObjects.COPPER_GOBLET_OF_WATER;
        }
        if (inputStack.isOf(ModObjects.COPPER_GOBLET_OF_MILK_ITEM)) {
            return ModObjects.COPPER_GOBLET_OF_MILK;
        }
        if (inputStack.isOf(Items.MILK_BUCKET)) {
            return ModObjects.COPPER_GOBLET_OF_MILK;
        }
        if (inputStack.isOf(ModObjects.COPPER_GOBLET_OF_HONEY_ITEM)) {
            return ModObjects.COPPER_GOBLET_OF_HONEY;
        }
        if (inputStack.isOf(Items.HONEY_BOTTLE)) {
            return ModObjects.COPPER_GOBLET_OF_HONEY;
        }
        return null;
    }

    @Override
    protected void switchStack(PlayerEntity player) {
        final ItemStack stack = player.getMainHandStack();
        if (PotionUtil.getPotion(stack) == Potions.WATER) {
            DTUtil.switchItemStack(player, stack, new ItemStack(Items.GLASS_BOTTLE));
        }
        if (stack.isOf(ModObjects.COPPER_GOBLET_OF_WATER_ITEM)) {
            DTUtil.switchItemStack(player, stack, new ItemStack(ModObjects.EMPTY_COPPER_GOBLET_ITEM));
        }
        if (stack.isOf(ModObjects.COPPER_GOBLET_OF_HONEY_ITEM)) {
            DTUtil.switchItemStack(player, stack, new ItemStack(ModObjects.EMPTY_COPPER_GOBLET_ITEM));
        }
        if (stack.isOf(Items.HONEY_BOTTLE)) {
            DTUtil.switchItemStack(player, stack, new ItemStack(Items.GLASS_BOTTLE));
        }
    }

}
