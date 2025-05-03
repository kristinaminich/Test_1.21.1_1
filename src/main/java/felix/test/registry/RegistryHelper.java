package felix.test.registry;

import felix.test.Test;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class RegistryHelper {
    public List<BlockRegistryInfo> registeredBlocks = new ArrayList<>();
    public List<ItemRegistryInfo> registeredItems = new ArrayList<>();
    public List<BlockItemRegistryInfo> registeredBlockItems = new ArrayList<>();
    public boolean defaultOptionalFlagValue = true;
    public Block registerBlockAndItem(Block block, String id, String name) {
        Identifier identifier = Identifier.of(Test.MODID, id);
        Block registeredBlock = Registry.register(Registries.BLOCK, identifier, block);
        Item registeredItem = Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        registeredBlockItems.add(new BlockItemRegistryInfo(identifier, registeredBlock, registeredItem, name));
        return registeredBlock;
    }

    public void registerItem(Item item, String id, String name) {
        registeredItems.add(new ItemRegistryInfo(Registry.register(Registries.ITEM, Identifier.of(Test.MODID, id), item), name));
    }

    public void registerBlock(Block block, String id, String name) {
        registeredBlocks.add(new BlockRegistryInfo(Registry.register(Registries.BLOCK, Identifier.of(Test.MODID, id), block), name));
    }

    public record BlockItemRegistryInfo(Identifier identifier, Block block, Item item, String name) {
    }

    ;

    public record BlockRegistryInfo(Block block, String name) {
    }

    ;

    public record ItemRegistryInfo(Item item, String name) {
    }
}
