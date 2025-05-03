package felix.test.datagen;

import felix.test.Test;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class Test_1_21_1LangDatagen extends FabricLanguageProvider {


    protected Test_1_21_1LangDatagen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        Test.registryHelper.registeredItems.forEach(i -> {
            translationBuilder.add(i.item(),i.name());
        });
        Test.registryHelper.registeredBlocks.forEach(b -> {
            translationBuilder.add(b.block(),b.name());
        });
        Test.registryHelper.registeredBlockItems.forEach(bi -> {
            //translationBuilder.add(bi.item(),bi.name());
            translationBuilder.add(bi.block(),bi.name());
        });
    }
}
