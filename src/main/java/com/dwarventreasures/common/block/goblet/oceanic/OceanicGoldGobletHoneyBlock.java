package com.dwarventreasures.common.block.goblet.oceanic;

import com.dwarventreasures.common.block.goblet.FilledGobletBlock;
import com.dwarventreasures.common.registry.DTObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class OceanicGoldGobletHoneyBlock extends FilledGobletBlock {
    public OceanicGoldGobletHoneyBlock(Settings settings) {
        super(settings, DTObjects.EMPTY_OCEANIC_GOLD_GOBLET, Type.HONEY);
    }

    @Override
    protected void getFilledGobletStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {
        if (toSwitch.isOf(DTObjects.EMPTY_OCEANIC_GOLD_GOBLET_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, DTObjects.OCEANIC_GOLD_GOBLET_OF_HONEY_ITEM);
        }
    }
}
