package tk.dwarventreasures.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Entity.class)
public abstract class EntityMixin {

    @Accessor("world")
    public abstract World getWorld();

}
