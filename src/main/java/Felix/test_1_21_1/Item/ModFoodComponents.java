package Felix.test_1_21_1.Item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


public class ModFoodComponents {
    public static final FoodComponent BURGER_ITEM = new FoodComponent.Builder().snack().saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1200),1).build();
}
