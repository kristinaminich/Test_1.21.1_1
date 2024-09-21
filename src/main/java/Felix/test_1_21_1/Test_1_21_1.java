package Felix.test_1_21_1;

import Felix.test_1_21_1.Item.ModFoodComponents;
import Felix.test_1_21_1.registry.RegistryHelper;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_1_21_1 implements ModInitializer {
    public static final String MODID = "test_1.21.1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static RegistryHelper registryHelper = new RegistryHelper();

    @Override
    public void onInitialize() {
        registryHelper.registerItem(new Item(new Item.Settings().food(ModFoodComponents.BURGER_ITEM)),"burger", "Burger");
    }
}
