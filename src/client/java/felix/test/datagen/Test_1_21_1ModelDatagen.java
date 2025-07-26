package felix.test.datagen;


import felix.test.Test;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.Models;

public class Test_1_21_1ModelDatagen extends FabricModelProvider {
    public Test_1_21_1ModelDatagen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(net.minecraft.client.data.ItemModelGenerator itemModelGenerator) {
        Test.registryHelper.registeredItems.forEach(i -> {
            itemModelGenerator.register(i.item(), Models.GENERATED);
        });
        Test.registryHelper.registeredBlockItems.forEach(bi -> {
            itemModelGenerator.register(bi.item(),Models.GENERATED);
        });
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        Test.registryHelper.registeredBlocks.forEach(b -> {
            blockStateModelGenerator.registerCubeAllModelTexturePool(b.block());
        });
        Test.registryHelper.registeredBlockItems.forEach(bi -> {
            blockStateModelGenerator.registerCubeAllModelTexturePool(bi.block());
        });
    }
}
