package com.dwarventreasures.common.block.goblet.copper;

import com.dwarventreasures.common.block.goblet.FilledGobletBlock;
import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class CopperGobletMilkBlock extends FilledGobletBlock {

    public CopperGobletMilkBlock(Settings settings) {
        super(settings, ModObjects.EMPTY_COPPER_GOBLET, Type.MILK);
    }

    @Override
    protected void getFilledGobletStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {
        if (toSwitch.isOf(ModObjects.EMPTY_COPPER_GOBLET_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.COPPER_GOBLET_OF_MILK_ITEM);
        }

    }
}
