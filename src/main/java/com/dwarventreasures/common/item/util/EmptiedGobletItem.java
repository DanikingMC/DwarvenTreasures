package com.dwarventreasures.common.item.util;

import com.dwarventreasures.common.registry.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidDrainable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public abstract class EmptiedGobletItem extends BlockItem {

    public EmptiedGobletItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        final ItemStack gobletStack = user.getStackInHand(hand);

        final BlockHitResult blockHitResult = raycast(world, user, RaycastContext.FluidHandling.SOURCE_ONLY);
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return TypedActionResult.pass(gobletStack);
        } else if (blockHitResult.getType() != HitResult.Type.BLOCK) {
            return TypedActionResult.pass(gobletStack);
        } else {
            final BlockPos blockPos = blockHitResult.getBlockPos();
            final Direction direction = blockHitResult.getSide();
            final BlockPos blockPos2 = blockPos.offset(direction);
            if (world.canPlayerModifyAt(user, blockPos) && user.canPlaceOn(blockPos2, direction, gobletStack)) {
                final BlockState blockState = world.getBlockState(blockPos);
                if (blockState.getBlock() instanceof final FluidDrainable fluidDrainable) {
                    world.emitGameEvent(user, GameEvent.FLUID_PICKUP, blockPos);
                    final FluidState fluidState = blockState.getFluidState();
                    if (fluidState.isIn(FluidTags.WATER)) {
                        //they are all valid for water
                        fluidDrainable.tryDrainFluid(world, blockPos, blockState);
                        fluidDrainable.getBucketFillSound().ifPresent((sound) -> user.playSound(sound, 1.0F, 1.0F));
                        return TypedActionResult.success(fillGobletWithWater(gobletStack, user, fluidState), world.isClient());
                    }
                    if (fluidState.isIn(FluidTags.LAVA)) {

                    }
                }
                return TypedActionResult.fail(gobletStack);
            }
        }
        return TypedActionResult.fail(gobletStack);
    }

    protected abstract ItemStack findFilledMilkGoblet(ItemStack inputStack, PlayerEntity player);

    protected abstract ItemStack findFilledWaterGoblet(ItemStack inputStack);


    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (ModTags.MILK_GOBLETS.contains(user.getStackInHand(hand).getItem())) {
            return ActionResult.PASS;
        }
        if (entity instanceof CowEntity) {
            entity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
            stack.decrement(1);
            user.getInventory().insertStack(this.findFilledMilkGoblet(stack, user));
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    private ItemStack fillGobletWithWater(ItemStack inputStack, PlayerEntity player, FluidState state) {
       final Item item = inputStack.getItem();
       final ItemStack outputStack;
        if (!state.isIn(FluidTags.WATER) || !ModTags.EMPTY_GOBLETS.contains(item)) {
            return inputStack;
        } else {
            if (!this.findFilledWaterGoblet(inputStack).isEmpty()) {
                outputStack = this.findFilledWaterGoblet(inputStack);
            } else {
                outputStack = inputStack;
            }
        }
        player.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
        return ItemUsage.exchangeStack(inputStack, player, outputStack);
    }

    private ActionResult fillGobletWithMilk(PlayerEntity player, Hand hand) {
        ItemStack inputStack = player.getStackInHand(hand);
        final ItemStack outputStack;
        if (!(inputStack.getItem() instanceof EmptiedGobletItem || this.findFilledMilkGoblet(inputStack, player).isEmpty())) {
            return ActionResult.PASS;
        } else {
            outputStack = this.findFilledMilkGoblet(inputStack, player);
        }
        inputStack.decrement(1);
        player.setStackInHand(hand, ItemUsage.exchangeStack(inputStack, player, outputStack));
        return ActionResult.SUCCESS;
    }
}
