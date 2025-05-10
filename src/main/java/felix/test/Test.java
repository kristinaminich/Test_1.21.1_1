package felix.test;

import felix.test.Item.ModFoodComponents;
import felix.test.registry.RegistryHelper;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static felix.test.Item.ModToolMaterials.QUADRATITE;

public class Test implements ModInitializer {
    public static final String MODID = "test";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static RegistryHelper registryHelper = new RegistryHelper();
    public static final Block VIBRANIUM_ORE_BLOCK = new Block(AbstractBlock.Settings.create());
    public static final Item RAW_VIBRAIUM_ITEM = new Item(new Item.Settings());
    public static final Item SHIELD = new ShieldItem(new Item.Settings().maxDamage(2500));
    public static final Item QUADRATITE_INGOT = new Item(new Item.Settings());
    public static final Item QUADRITITE_SWORD = new SwordItem(QUADRATITE, new Item.Settings());
    @Override
    public void onInitialize() {
        registryHelper.registerItem(new Item(new Item.Settings().food(ModFoodComponents.BURGER_ITEM)), "burger", "Burger");
        registryHelper.registerBlockAndItem(VIBRANIUM_ORE_BLOCK, "vibranium_ore_block", "Vibranium Ore");
        registryHelper.registerItem(RAW_VIBRAIUM_ITEM, "raw_vibranium", "raw vibranium");
        registryHelper.registerItem(SHIELD, "shield", "Shield");
        registryHelper.registerItem(QUADRITITE_SWORD, "quadratite_sword", "Quadratite Sword");
        registryHelper.registerItem(QUADRATITE_INGOT, "quadratite_ingot", "Quadratite Ingot");
    }
}
