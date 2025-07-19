package felix.test.Item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;


public class ModFoodComponents {
    public static final ConsumableComponent BURGER_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION, 6 * 20, 1), 1.0f))
            .build();
    public static final FoodComponent BURGER_FOOD_COMPONENT = new FoodComponent.Builder().alwaysEdible().saturationModifier(0.6f).build();
}
