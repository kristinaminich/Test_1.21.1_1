package felix.test.Item;

import felix.test.Test;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

import static felix.test.Item.ModToolMaterial.QUADRATITE;

public class ModArmorMaterial {
    public static final RegistryKey<EquipmentAsset> QUADRATITE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(Test.MODID, "guidite"));
    public static final int BASE_DURABILITY = 15;
    public static final ArmorMaterial QUADRATITE_ARMOR_MATERIAL = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 8,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3
            ),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            0.0F,
            0.0F,
            QUADRATITE.repairItems(),
            QUADRATITE_ARMOR_MATERIAL_KEY
    );
}

