package com.dwarventreasures.common.block.copper;

import com.dwarventreasures.common.block.util.FilledGobletBlock;
import com.dwarventreasures.common.registry.ModObjects;
import com.dwarventreasures.common.util.DTUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;

public class FilledCopperGobletBlock extends FilledGobletBlock {

    private final boolean honey;

    public FilledCopperGobletBlock(Settings settings, boolean honey) {
        super(settings, ModObjects.EMPTY_COPPER_GOBLET);
        this.honey = honey;
    }

    public FilledCopperGobletBlock(Settings settings) {
        this(settings, false);
    }

    @Override
    protected void playEmptyingGobletSound(PlayerEntity player) {
        if (this.honey) {
            player.playSound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK, 1.0F, 1.0F);
        } else {
            super.playEmptyingGobletSound(player);
        }
    }

    @Override
    protected void switchItemStack(PlayerEntity player) {
        final ItemStack inputStack = player.getMainHandStack();
        if (this.honey) {
            if (inputStack.isOf(ModObjects.EMPTY_COPPER_GOBLET_ITEM)) {
                DTUtil.switchItemStack(player, inputStack, new ItemStack(ModObjects.COPPER_GOBLET_OF_HONEY));
            }
            if (inputStack.isOf(Items.GLASS_BOTTLE)) {
                DTUtil.switchItemStack(player, inputStack, new ItemStack(Items.HONEY_BOTTLE));
            }
        } else {
            if (inputStack.isOf(Items.GLASS_BOTTLE)) {
                DTUtil.switchItemStack(player, inputStack, Items.POTION.getDefaultStack());
            }
            if (inputStack.isOf(ModObjects.EMPTY_COPPER_GOBLET_ITEM)) {
                DTUtil.switchItemStack(player, inputStack, new ItemStack(ModObjects.COPPER_GOBLET_OF_WATER_ITEM));
            }
        }

    }
}
