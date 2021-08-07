package com.dwarventreasures.common.block.gold;

import com.dwarventreasures.common.block.util.FilledGobletBlock;
import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class GoldenGobletHoneyBlock extends FilledGobletBlock {
    public GoldenGobletHoneyBlock(Settings settings) {
        super(settings, ModObjects.EMPTY_GOLDEN_GOBLET, Type.HONEY);
    }

    @Override
    protected void getFilledGobletStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {
        if (toSwitch.isOf(ModObjects.EMPTY_GOLDEN_GOBLET_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.GOLDEN_GOBLET_OF_HONEY_ITEM);
        }
    }
}

