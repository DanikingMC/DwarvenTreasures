package tk.dwarventreasures.common.item.tool;

import net.fabricmc.fabric.api.tool.attribute.v1.DynamicAttributeTool;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import tk.dwarventreasures.common.registry.DTObjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MithrilSwordItem extends SwordItem implements DynamicAttributeTool {

    private static final byte KILLS_TO_UNLOCK_ATTUNEMENT = 5;
    private static final Map<String, Byte> KILLS = new HashMap<>();

    public MithrilSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        final String entityName = target.getName().getString();
        /*
         * We want to get the number of kills from nbt data
         * So kills are not shared between stacks
         */
        if (target.isDead() && !this.containsAttunement(stack)) {
            final NbtCompound data = stack.getOrCreateNbt();

            //saves entity name and sets default values for the map and nbt
            if (!KILLS.containsKey(entityName)) {//new record
                data.putByte("Kills", (byte) 0);
                KILLS.put(entityName, data.getByte("Kills"));
            }

            //Updates Kills nbt data
            if (KILLS.containsKey(entityName)) {
                byte killCounter = (byte) (KILLS.get(entityName) + 1);
                data.putByte("Kills", (byte) (data.getByte("Kills") + 1));
                KILLS.put(entityName, killCounter);//Updates Map values
                //Check if we are ready to apply attunement
                if (data.getByte("Kills") == KILLS_TO_UNLOCK_ATTUNEMENT) {
                    this.setAttunement(stack);//updates attunement boolean
                    data.putString("EntityName", entityName);
                    DTObjects.attackDamage = 15;//Name of the killed entity
                }
                //Send messages to the player, when is almost reaching the max number of kills
                ((PlayerEntity) attacker).sendMessage(new TranslatableText("dwarventreasures.tooltip.kills_left").append(Text.of(Integer.toString(KILLS_TO_UNLOCK_ATTUNEMENT - data.getByte("Kills")))), true);
            }
        }

        return super.postHit(stack, target, attacker);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (this.canUnlockAttunement(stack) && this.containsAttunement(stack)) {
            final String entityName = stack.getOrCreateNbt().getString("EntityName");
            tooltip.add(new LiteralText(entityName + " ").append(new TranslatableText("dwarventreasures.tooltip.slayer")).formatted(Formatting.DARK_PURPLE));
            tooltip.add(new TranslatableText("dwarventreasures.tooltip.attunement", entityName).formatted(Formatting.GOLD));
        }
    }

    private boolean canUnlockAttunement(ItemStack stack) {
        return stack.getOrCreateNbt().getByte("Kills") == KILLS_TO_UNLOCK_ATTUNEMENT;
    }

    public void setAttunement(ItemStack stack) {
        stack.getOrCreateNbt().putBoolean("Attunement", true);
    }

    public boolean containsAttunement(ItemStack stack) {
        return stack.getOrCreateNbt().getBoolean("Attunement");
    }

}
