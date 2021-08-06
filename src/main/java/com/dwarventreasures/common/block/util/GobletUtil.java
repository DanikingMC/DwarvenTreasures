package com.dwarventreasures.common.block.util;

import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;

public class GobletUtil {

    public static void switchFilledStack(PlayerEntity player, Hand hand, boolean emptyStack) {
        final ItemStack playerInput = player.getStackInHand(hand);

        if (emptyStack) {
            if (PotionUtil.getPotion(playerInput) == Potions.WATER) {
                DTUtil.switchItemStack(player, playerInput, new ItemStack(Items.GLASS_BOTTLE));
                player.playSound(SoundEvents.ITEM_BOTTLE_FILL, 1.0F, 1.0F);
            }
            if (playerInput.isOf(Items.MILK_BUCKET)) {
                DTUtil.switchItemStack(player, playerInput, new ItemStack(Items.MILK_BUCKET));
                player.playSound(SoundEvents.ITEM_BUCKET_EMPTY, 1.0F, 1.0F);
            }
        } else {

        }
    }

}
