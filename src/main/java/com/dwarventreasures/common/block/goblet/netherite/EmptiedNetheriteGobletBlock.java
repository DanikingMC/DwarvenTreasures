package com.dwarventreasures.common.block.goblet.netherite;

import com.dwarventreasures.common.block.goblet.EmptiedGobletBlock;
import com.dwarventreasures.common.registry.DTObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.util.Hand;

public class EmptiedNetheriteGobletBlock extends EmptiedGobletBlock {
    public EmptiedNetheriteGobletBlock(Settings settings) {
        super(settings);
    }


    @Override
    protected Block getFilledBlock(PlayerEntity player, ItemStack inputStack) {
        if (inputStack.isOf(Items.WATER_BUCKET)) {
            return DTObjects.NETHERITE_GOBLET_OF_WATER;
        }
        if (PotionUtil.getPotion(inputStack) == Potions.WATER) {
            return DTObjects.NETHERITE_GOBLET_OF_WATER;
        }
        if (inputStack.isOf(DTObjects.NETHERITE_GOBLET_OF_WATER_ITEM)) {
            return DTObjects.NETHERITE_GOBLET_OF_WATER;
        }
        if (inputStack.isOf(DTObjects.NETHERITE_GOBLET_OF_MILK_ITEM)) {
            return DTObjects.NETHERITE_GOBLET_OF_MILK;
        }
        if (inputStack.isOf(Items.MILK_BUCKET)) {
            return DTObjects.NETHERITE_GOBLET_OF_MILK;
        }
        if (inputStack.isOf(DTObjects.NETHERITE_GOBLET_OF_HONEY_ITEM)) {
            return DTObjects.NETHERITE_GOBLET_OF_HONEY;
        }
        if (inputStack.isOf(Items.HONEY_BOTTLE)) {
            return DTObjects.NETHERITE_GOBLET_OF_HONEY;
        }
        if (inputStack.isOf(Items.LAVA_BUCKET)) {
            return DTObjects.NETHERITE_GOBLET_OF_LAVA;
        }
        if (inputStack.isOf(DTObjects.NETHERITE_GOBLET_OF_LAVA_ITEM)) {
            return DTObjects.NETHERITE_GOBLET_OF_LAVA;
        }
        return null;
    }

    @Override
    protected void getEmptyStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {

        if (toSwitch.isOf(DTObjects.NETHERITE_GOBLET_OF_WATER_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, DTObjects.EMPTY_NETHERITE_GOBLET_ITEM);
        }
        if (toSwitch.isOf(DTObjects.NETHERITE_GOBLET_OF_MILK_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, DTObjects.EMPTY_NETHERITE_GOBLET_ITEM);
        }
        if (toSwitch.isOf(DTObjects.NETHERITE_GOBLET_OF_HONEY_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, DTObjects.EMPTY_NETHERITE_GOBLET_ITEM);
        }
        if (toSwitch.isOf(DTObjects.NETHERITE_GOBLET_OF_LAVA_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, DTObjects.EMPTY_NETHERITE_GOBLET_ITEM);
        }
    }
}
