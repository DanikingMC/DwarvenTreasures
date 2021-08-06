package com.dwarventreasures.common.block.util;

import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.registry.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class FilledGobletBlock extends GobletBlock{

    private final Block emptyGobletBlock;

    public FilledGobletBlock(Settings settings, Block emptyGobletBlock) {
        super(settings);
        this.emptyGobletBlock = emptyGobletBlock;
    }


    protected void playEmptyingGobletSound(PlayerEntity player) {
        player.playSound(SoundEvents.ITEM_BOTTLE_FILL, 1.0F, 1.0F);
    }

    protected abstract void switchItemStack(PlayerEntity player);

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (ModTags.VALID_TO_FILL_GOBLET.contains(player.getStackInHand(hand).getItem())) {
            return ActionResult.PASS;//not valid to the empty goblet
        }
        if (!world.isClient) {
            if (ModTags.MILK_GOBLETS.contains(this.asItem())) {
                player.clearStatusEffects();
            }
            if (ModTags.HONEY_GOBLETS.contains(this.asItem())) {
                player.removeStatusEffect(StatusEffects.POISON);
                player.eatFood(world, new ItemStack(ModObjects.COPPER_GOBLET_OF_HONEY));
            }
            world.setBlockState(pos, getEmptyGobletBlock().getDefaultState(), 3);
            switchItemStack(player);
            return ActionResult.SUCCESS;
        } else {
            playEmptyingGobletSound(player);
        }
        return ActionResult.PASS;
    }



    public Block getEmptyGobletBlock() {
        return emptyGobletBlock;
    }
}
