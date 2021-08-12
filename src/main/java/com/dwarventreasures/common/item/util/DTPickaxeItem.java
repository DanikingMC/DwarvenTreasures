package com.dwarventreasures.common.item.util;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class DTPickaxeItem extends PickaxeItem {

    public DTPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
