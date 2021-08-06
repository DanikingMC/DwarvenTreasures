package com.dwarventreasures.common.block.util;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EmptiedGobletBlock extends GobletBlock {
    public EmptiedGobletBlock(Settings settings) {
        super(settings);
    }

    protected void playEmptyingGobletSound(PlayerEntity player) {
        player.playSound(SoundEvents.ITEM_BUCKET_EMPTY, 1.0F, 1.0F);
    }

    protected abstract Block getFilledBlock(PlayerEntity player, ItemStack inputStack);

    protected abstract void switchStack(PlayerEntity player);

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (this.getFilledBlock(player, player.getStackInHand(hand)) != null) {
            if (world.isClient) {
                playEmptyingGobletSound(player);
            }
            world.setBlockState(pos, getFilledBlock(player, player.getStackInHand(hand)).getDefaultState(), 3);
            switchStack(player);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
