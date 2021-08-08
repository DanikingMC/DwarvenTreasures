package com.dwarventreasures.common.block.goblet.gold;

import com.dwarventreasures.common.block.goblet.FilledGobletBlock;
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

public class GoldenGobletWaterBlock extends FilledGobletBlock {

    public GoldenGobletWaterBlock(Settings settings) {
        super(settings, ModObjects.EMPTY_GOLDEN_GOBLET, Type.WATER);
    }

    @Override
    protected void getFilledGobletStack(PlayerEntity player, Hand hand, ItemStack toSwitch) {
        if (toSwitch.isOf(ModObjects.EMPTY_GOLDEN_GOBLET_ITEM)) {
            DTUtil.switchStack(player, hand, toSwitch, ModObjects.GOLDEN_GOBLET_OF_WATER_ITEM);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().isOf(Items.BUCKET)) { //You can't take water back with bucket
            return ActionResult.PASS;
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }

}
