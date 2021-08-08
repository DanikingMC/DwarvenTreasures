package com.dwarventreasures.common.block.goblet.gold;

import com.dwarventreasures.common.block.goblet.FilledGobletBlock;
import com.dwarventreasures.common.registry.DTObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class GoldenGobletHoneyBlock extends FilledGobletBlock {
    public GoldenGobletHoneyBlock(Settings settings) {
        super(settings, DTObjects.EMPTY_GOLDEN_GOBLET, Type.HONEY);
    }

    @Override
    protected void getFilledGobletStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {
        if (toSwitch.isOf(DTObjects.EMPTY_GOLDEN_GOBLET_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, DTObjects.GOLDEN_GOBLET_OF_HONEY_ITEM);
        }
    }
}

