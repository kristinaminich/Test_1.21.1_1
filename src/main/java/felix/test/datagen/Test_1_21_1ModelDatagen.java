package felix.test.datagen;

import Felix.test_1_21_1.Test_1_21_1;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class Test_1_21_1ModelDatagen extends FabricModelProvider {
    public Test_1_21_1ModelDatagen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        Test_1_21_1.registryHelper.registeredBlocks.forEach(b -> {
            blockStateModelGenerator.registerCubeAllModelTexturePool(b.block());
        });
        Test_1_21_1.registryHelper.registeredBlockItems.forEach(bi -> {
            blockStateModelGenerator.registerCubeAllModelTexturePool(bi.block());
        });
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        Test_1_21_1.registryHelper.registeredItems.forEach(i -> {
            itemModelGenerator.register(i.item(), Models.GENERATED);
        });
        Test_1_21_1.registryHelper.registeredBlockItems.forEach(bi -> {
            itemModelGenerator.register(bi.item(),Models.GENERATED);
        });
    }
}
