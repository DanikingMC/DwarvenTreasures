package com.dwarventreasures.common.block.goblet.netherite;

import com.dwarventreasures.common.block.goblet.FilledGobletBlock;
import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class NetheriteGobletWaterBlock extends FilledGobletBlock {

    public NetheriteGobletWaterBlock(Settings settings) {
        super(settings, ModObjects.EMPTY_NETHERITE_GOBLET, Type.WATER);
    }

    @Override
    protected void getFilledGobletStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {
        if (toSwitch.isOf(ModObjects.EMPTY_NETHERITE_GOBLET_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.NETHERITE_GOBLET_OF_WATER_ITEM);
        }
    }
}
