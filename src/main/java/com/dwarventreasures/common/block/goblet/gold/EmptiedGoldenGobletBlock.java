package com.dwarventreasures.common.block.goblet.gold;

import com.dwarventreasures.common.block.goblet.EmptiedGobletBlock;
import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;

public class EmptiedGoldenGobletBlock extends EmptiedGobletBlock {
    public EmptiedGoldenGobletBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void playEmptyingGobletSound(PlayerEntity player) {
        if (player.getMainHandStack().isOf(ModObjects.GOLDEN_GOBLET_OF_HONEY_ITEM) || player.getMainHandStack().isOf(Items.HONEY_BOTTLE)) {
            player.playSound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK, 1.0F, 1.0F);
        } else {
            super.playEmptyingGobletSound(player);
        }
    }

    @Override
    protected Block getFilledBlock(PlayerEntity player, ItemStack inputStack) {

        if (inputStack.isOf(Items.WATER_BUCKET)) {
            return ModObjects.GOLDEN_GOBLET_OF_WATER;
        }
        if (PotionUtil.getPotion(inputStack) == Potions.WATER) {
            return ModObjects.GOLDEN_GOBLET_OF_WATER;
        }
        if (inputStack.isOf(ModObjects.GOLDEN_GOBLET_OF_WATER_ITEM)) {
            return ModObjects.GOLDEN_GOBLET_OF_WATER;
        }
        if (inputStack.isOf(ModObjects.GOLDEN_GOBLET_OF_MILK_ITEM)) {
            return ModObjects.GOLDEN_GOBLET_OF_MILK;
        }
        if (inputStack.isOf(Items.MILK_BUCKET)) {
            return ModObjects.GOLDEN_GOBLET_OF_MILK;
        }
        if (inputStack.isOf(ModObjects.GOLDEN_GOBLET_OF_HONEY_ITEM)) {
            return ModObjects.GOLDEN_GOBLET_OF_HONEY;
        }
        if (inputStack.isOf(Items.HONEY_BOTTLE)) {
            return ModObjects.GOLDEN_GOBLET_OF_HONEY;
        }
        return null;
    }

    @Override
    protected void getEmptyStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {

        if (toSwitch.isOf(ModObjects.GOLDEN_GOBLET_OF_WATER_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.EMPTY_GOLDEN_GOBLET_ITEM);
        }

        if (toSwitch.isOf(ModObjects.GOLDEN_GOBLET_OF_MILK_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.EMPTY_GOLDEN_GOBLET_ITEM);
        }

        if (toSwitch.isOf(ModObjects.GOLDEN_GOBLET_OF_HONEY_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.EMPTY_GOLDEN_GOBLET_ITEM);
        }

    }
}
