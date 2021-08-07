package com.dwarventreasures.mixin;

import net.minecraft.block.BeehiveBlock;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BeehiveBlock.class)
public abstract class BeehiveBlockMixin {
//
//    @Shadow protected abstract boolean hasBees(World world, BlockPos pos);
//
//    @Shadow protected abstract void angerNearbyBees(World world, BlockPos pos);
//
//    @Shadow public abstract void takeHoney(World world, BlockState state, BlockPos pos);
//
//    @Shadow public abstract void takeHoney(World world, BlockState state, BlockPos pos, @Nullable PlayerEntity player, BeehiveBlockEntity.BeeState beeState);
//
//    @Inject(method = "onUse", at = @At("HEAD"), cancellable = true)
//    public void onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> cir) {
//        final ItemStack emptyGoblet = player.getStackInHand(hand);
//        int age = state.get(BeehiveBlock.HONEY_LEVEL);
//        boolean dirty = false;
//        if (age >= 5) {
//            if (emptyGoblet.isOf(ModObjects.EMPTY_COPPER_GOBLET_ITEM)) {
//                emptyGoblet.decrement(1);
//                world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
//                if (emptyGoblet.isEmpty()) {
//                    player.setStackInHand(hand, new ItemStack(ModObjects.COPPER_GOBLET_OF_HONEY_ITEM));
//                } else if (!player.getInventory().insertStack(new ItemStack(ModObjects.COPPER_GOBLET_OF_HONEY_ITEM))) {
//                    player.dropItem(new ItemStack(ModObjects.COPPER_GOBLET_OF_HONEY_ITEM), false);
//                }
//                dirty = true;
//                world.emitGameEvent(player, GameEvent.FLUID_PICKUP, pos);
//            }
//        }
//        if (dirty) {
//            if (!CampfireBlock.isLitCampfireInRange(world, pos)) {
//                if (this.hasBees(world, pos)) {
//                    this.angerNearbyBees(world, pos);
//
//                }
//                this.takeHoney(world, state, pos, player, BeehiveBlockEntity.BeeState.EMERGENCY);
//            } else {
//                this.takeHoney(world, state, pos);
//            }
//            cir.setReturnValue(ActionResult.success(world.isClient));
//            cir.cancel();
//        } else {
//            cir.setReturnValue(ActionResult.PASS);
//        }
//
//    }
}
