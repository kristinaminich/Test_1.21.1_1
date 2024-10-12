package Felix.test_1_21_1;

import Felix.test_1_21_1.Item.ModFoodComponents;
import Felix.test_1_21_1.registry.RegistryHelper;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_1_21_1 implements ModInitializer {
    public static final String MODID = "test";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static RegistryHelper registryHelper = new RegistryHelper();
    public static final Block VIBRANIUM_ORE_BLOCK = new Block(AbstractBlock.Settings.create());
    public static final Item RAW_VIBRAIUM_ITEM = new Item(new Item.Settings());

    @Override
    public void onInitialize() {
        registryHelper.registerItem(new Item(new Item.Settings().food(ModFoodComponents.BURGER_ITEM)),"burger", "Burger");
        registryHelper.registerBlockAndItem(VIBRANIUM_ORE_BLOCK, "vibranium_ore", "Vibranium Ore");
        registryHelper.registerItem(RAW_VIBRAIUM_ITEM,"raw_vibranium", "raw vibranium");
    }
}
