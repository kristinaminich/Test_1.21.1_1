package felix.test.datagen;

import felix.test.Test;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ItemTagDatagen extends FabricTagProvider<Item> {
    public ItemTagDatagen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    public void add(TagKey<Item> swords, Item[] items) {
    }

    public void configure(RegistryWrapper.WrapperLookup lookup) {
        var swords = getOrCreateTagBuilder(ItemTags.SWORDS);
        var chest_armor = getOrCreateTagBuilder(ItemTags.CHEST_ARMOR);
        var head_armor = getOrCreateTagBuilder(ItemTags.HEAD_ARMOR);
        var leg_armor = getOrCreateTagBuilder(ItemTags.LEG_ARMOR);
        var foot_armor = getOrCreateTagBuilder(ItemTags.FOOT_ARMOR);
        swords.add(Test.QUADRATITE_SWORD);
        chest_armor.add(Test.QUADRATITE_CHESTPLATE);
        head_armor.add(Test.QUADRATITE_HELMET);
        leg_armor.add(Test.QUADRATITE_LEGGINS);
        foot_armor.add(Test.QUADRATITE_BOOTS);
    }
}