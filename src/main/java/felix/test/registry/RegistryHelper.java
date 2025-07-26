package felix.test.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import static felix.test.Test.MODID;

public class RegistryHelper {
    public List<BlockRegistryInfo> registeredBlocks = new ArrayList<>();
    public List<ItemRegistryInfo> registeredItems = new ArrayList<>();
    public List<BlockItemRegistryInfo> registeredBlockItems = new ArrayList<>();
    public boolean defaultOptionalFlagValue = true;
    public Item registerBlockAndItem(Function<Block.Settings, Block> blockFactory, AbstractBlock.Settings settings, Item.Settings itemSettings, String id, String name) {
        Block block = registerBlock(blockFactory, settings, id, name);
        Item blockItem = registerItem((givenSettings) -> new BlockItem(block, givenSettings), itemSettings, id, name);
        registeredBlockItems.add(new BlockItemRegistryInfo(blockItem, name));
        return blockItem;
    }

    public Item registerItem(Function<Item.Settings, Item> itemFactory, Item.Settings settings, String id, String name) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MODID, id));
        settings.registryKey(key);
        Item item = Registry.register(Registries.ITEM, key, itemFactory.apply(settings));
        registeredItems.add(new ItemRegistryInfo(item, name));
        return item;
    }

    public Block registerBlock(Function<Block.Settings, Block> blockFactory, Block.Settings settings, String id, String name) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MODID, id));
        settings.registryKey(key);
        Block block = Registry.register(Registries.BLOCK, key, blockFactory.apply(settings));
        registeredBlocks.add(new BlockRegistryInfo(block, name));
        return block;
    }

    public record BlockItemRegistryInfo(Item item, String name) {
    }

    public record BlockRegistryInfo(Block block, String name) {
    }

    public record ItemRegistryInfo(Item item, String name) {
    }
}
