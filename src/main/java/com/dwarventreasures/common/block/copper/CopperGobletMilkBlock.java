package com.dwarventreasures.common.block.copper;

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

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().isOf(Items.GLASS_BOTTLE)) {
            return ActionResult.PASS;//You can't use a glass bottle to take milk
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }
}
