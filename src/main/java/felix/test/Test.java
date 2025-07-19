package felix.test;

import felix.test.Item.ModArmorMaterial;
import felix.test.Item.ModToolMaterial;
import felix.test.registry.RegistryHelper;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.equipment.EquipmentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static felix.test.Item.ModFoodComponents.BURGER_CONSUMABLE_COMPONENT;
import static felix.test.Item.ModFoodComponents.BURGER_FOOD_COMPONENT;

public class Test implements ModInitializer {
    public static final String MODID = "test";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static RegistryHelper registryHelper = new RegistryHelper();
    public static final Block VIBRANIUM_ORE_BLOCK = new Block(AbstractBlock.Settings.create());
    public static final Item RAW_VIBRAIUM_ITEM = new Item(new Settings());
    public static final Item SHIELD = new ShieldItem(new Settings().maxDamage(2500));
    public static final Item QUADRATITE_INGOT = new Item(new Settings());
    public static final Item QUADRATITE_SWORD = new SwordItem(ModToolMaterial.QUADRATITE, 29f, 300f, new Item.Settings());
    public static final Item QUADRATITE_PICKAXE = new PickaxeItem(ModToolMaterial.QUADRATITE, 0f, 6f, new Item.Settings());
    public static final Item QUADRATITE_HELMET = new ArmorItem(ModArmorMaterial.QUADRATITE_ARMOR_MATERIAL, EquipmentType.HELMET, new Settings());
    public static final Item QUADRATITE_CHESTPLATE = new ArmorItem(ModArmorMaterial.QUADRATITE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Settings());
    public static final Item QUADRATITE_LEGGINS = new ArmorItem(ModArmorMaterial.QUADRATITE_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Settings());
    public static final Item QUADRATITE_BOOTS = new ArmorItem(ModArmorMaterial.QUADRATITE_ARMOR_MATERIAL, EquipmentType.BOOTS, new Settings());
    public static final Item HOT_POTATOE = new SnowballItem(new Settings());
    public static final Item BURGER_ITEM = new Item (new Settings().food(BURGER_FOOD_COMPONENT, BURGER_CONSUMABLE_COMPONENT));

    @Override
    public void onInitialize() {
        registryHelper.registerItem(BURGER_ITEM, "burger", "Burger");
        registryHelper.registerBlockAndItem(VIBRANIUM_ORE_BLOCK, "vibranium_ore_block", "Vibranium Ore");
        registryHelper.registerItem(RAW_VIBRAIUM_ITEM, "raw_vibranium", "raw vibranium");
        registryHelper.registerItem(SHIELD, "shield", "Shield");
        registryHelper.registerItem(QUADRATITE_SWORD, "quadratite_sword", "Quadratite Sword");
        registryHelper.registerItem(QUADRATITE_INGOT, "quadratite_ingot", "Quadratite Ingot");
        registryHelper.registerItem(QUADRATITE_HELMET, "quadratite_helmet", "Quadratite Helmet");
        registryHelper.registerItem(QUADRATITE_CHESTPLATE, "quadratite_chestplate", "Quadratite Chestplate");
        registryHelper.registerItem(QUADRATITE_LEGGINS, "quadratite_leggins", "Quadratite Leggins");
        registryHelper.registerItem(QUADRATITE_BOOTS, "quadratite_boots", "Quadratite Boots");
        registryHelper.registerItem(HOT_POTATOE, "hot_potatoe", "Hot Potatoe");
        registryHelper.registerItem(QUADRATITE_PICKAXE, "quadratite_pickaxe", "Quadratite Pickaxe");
    }
}
