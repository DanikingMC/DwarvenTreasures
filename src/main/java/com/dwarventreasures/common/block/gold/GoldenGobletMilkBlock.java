package com.dwarventreasures.common.block.gold;

import com.dwarventreasures.common.block.util.FilledGobletBlock;
import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().isOf(Items.GLASS_BOTTLE)) {
            return ActionResult.PASS;//You can't use a glass bottle to take milk
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }
}
