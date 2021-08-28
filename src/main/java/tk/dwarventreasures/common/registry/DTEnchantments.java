package tk.dwarventreasures.common.registry;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.dwarventreasures.common.DwarvenTreasures;
import tk.dwarventreasures.common.enchantment.RingEnchantment;

import java.util.LinkedHashMap;
import java.util.Map;

public class DTEnchantments {

    private static final Map<Enchantment, Identifier> ENCHANTMENTS = new LinkedHashMap<>();

    public static final Enchantment HOLY = create("holy", new RingEnchantment());
    public static final Enchantment FROST = create("frost", new RingEnchantment());
    public static final Enchantment RADIANCE = create("radiance", new RingEnchantment());

    private static <T extends Enchantment> T create(String name, T enchantment) {
        ENCHANTMENTS.put(enchantment, new Identifier(DwarvenTreasures.MODID, name));
        return enchantment;
    }

    public static void init() {
        ENCHANTMENTS.keySet().forEach(particleType -> Registry.register(Registry.ENCHANTMENT, ENCHANTMENTS.get(particleType), particleType));
    }

}
