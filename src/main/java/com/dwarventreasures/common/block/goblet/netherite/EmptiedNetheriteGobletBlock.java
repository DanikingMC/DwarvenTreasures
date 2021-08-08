package com.dwarventreasures.common.block.goblet.netherite;

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

public class EmptiedNetheriteGobletBlock extends EmptiedGobletBlock {
    public EmptiedNetheriteGobletBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void playEmptyingGobletSound(PlayerEntity player) {
        if (player.getMainHandStack().isOf(ModObjects.NETHERITE_GOBLET_OF_LAVA_ITEM) || player.getMainHandStack().isOf(Items.HONEY_BOTTLE)) {
            player.playSound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK, 1.0F, 1.0F);
        } else {
            super.playEmptyingGobletSound(player);
        }
    }


    @Override
    protected Block getFilledBlock(PlayerEntity player, ItemStack inputStack) {
        if (inputStack.isOf(Items.WATER_BUCKET)) {
            return ModObjects.NETHERITE_GOBLET_OF_WATER;
        }
        if (PotionUtil.getPotion(inputStack) == Potions.WATER) {
            return ModObjects.NETHERITE_GOBLET_OF_WATER;
        }
        if (inputStack.isOf(ModObjects.NETHERITE_GOBLET_OF_WATER_ITEM)) {
            return ModObjects.NETHERITE_GOBLET_OF_WATER;
        }
        if (inputStack.isOf(ModObjects.NETHERITE_GOBLET_OF_MILK_ITEM)) {
            return ModObjects.NETHERITE_GOBLET_OF_MILK;
        }
        if (inputStack.isOf(Items.MILK_BUCKET)) {
            return ModObjects.NETHERITE_GOBLET_OF_MILK;
        }
        if (inputStack.isOf(ModObjects.NETHERITE_GOBLET_OF_HONEY_ITEM)) {
            return ModObjects.NETHERITE_GOBLET_OF_HONEY;
        }
        if (inputStack.isOf(Items.HONEY_BOTTLE)) {
            return ModObjects.NETHERITE_GOBLET_OF_HONEY;
        }
        if (inputStack.isOf(Items.LAVA_BUCKET)) {
            return ModObjects.NETHERITE_GOBLET_OF_LAVA;
        }
        if (inputStack.isOf(ModObjects.NETHERITE_GOBLET_OF_LAVA_ITEM)) {
            return ModObjects.NETHERITE_GOBLET_OF_LAVA;
        }
        return null;
    }

    @Override
    protected void getEmptyStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {

        if (toSwitch.isOf(ModObjects.NETHERITE_GOBLET_OF_WATER_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.EMPTY_NETHERITE_GOBLET_ITEM);
        }
        if (toSwitch.isOf(ModObjects.NETHERITE_GOBLET_OF_MILK_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.EMPTY_NETHERITE_GOBLET_ITEM);
        }
        if (toSwitch.isOf(ModObjects.NETHERITE_GOBLET_OF_HONEY_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.EMPTY_NETHERITE_GOBLET_ITEM);
        }
        if (toSwitch.isOf(ModObjects.NETHERITE_GOBLET_OF_LAVA_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.EMPTY_NETHERITE_GOBLET_ITEM);
        }
    }
}
