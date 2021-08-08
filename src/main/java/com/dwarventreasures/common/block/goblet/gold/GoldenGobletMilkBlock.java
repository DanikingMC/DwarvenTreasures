package com.dwarventreasures.common.block.goblet.gold;

import com.dwarventreasures.common.block.goblet.FilledGobletBlock;
import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;

public class GoldenGobletMilkBlock extends FilledGobletBlock {

    public GoldenGobletMilkBlock(Settings settings) {
        super(settings, ModObjects.EMPTY_GOLDEN_GOBLET, Type.MILK);
    }

    @Override
    protected void getFilledGobletStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {
        if (toSwitch.isOf(ModObjects.EMPTY_GOLDEN_GOBLET_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.GOLDEN_GOBLET_OF_MILK_ITEM);
        }
        if (toSwitch.isOf(Items.BUCKET)) {
            DTUtil.switchStack(player, hand, toSwitch, Items.MILK_BUCKET);
        }
    }
}
