package com.dwarventreasures.common.block.goblet.netherite;

import com.dwarventreasures.common.block.goblet.FilledGobletBlock;
import com.dwarventreasures.common.registry.DTObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class NetheriteGobletLavaBlock extends FilledGobletBlock {

    public NetheriteGobletLavaBlock(Settings settings) {
        super(settings, DTObjects.EMPTY_NETHERITE_GOBLET, Type.LAVA);
    }

    @Override
    protected void getFilledGobletStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {
        if (toSwitch.isOf(DTObjects.EMPTY_NETHERITE_GOBLET_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, DTObjects.NETHERITE_GOBLET_OF_LAVA_ITEM);
        }
    }
}
