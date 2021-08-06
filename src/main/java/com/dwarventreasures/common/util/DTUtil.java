package com.dwarventreasures.common.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class DTUtil {

    public static void switchItemStack(PlayerEntity player, ItemStack toSwitch, ItemStack newStack) {
        if (toSwitch.isEmpty()) {
            return;
        }
        if (!player.isCreative()) {
            toSwitch.decrement(1);
        }
        player.getInventory().insertStack(newStack);
    }

}
