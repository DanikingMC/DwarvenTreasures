package com.dwarventreasures.common.block.goblet.debris;

import com.dwarventreasures.common.block.goblet.FilledGobletBlock;
import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class DebrisGobletLavaBlock extends FilledGobletBlock {

    public DebrisGobletLavaBlock(Settings settings) {
        super(settings, ModObjects.EMPTY_DEBRIS_GOBLET, Type.LAVA);
    }

    @Override
    protected void getFilledGobletStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {
        if (toSwitch.isOf(ModObjects.EMPTY_DEBRIS_GOBLET_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.DEBRIS_GOBLET_OF_LAVA_ITEM);
        }
    }
}
