package Felix.test_1_21_1;

import Felix.test_1_21_1.registry.RegistryHelper;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_1_21_1 implements ModInitializer {
    public static final String MODID = "Test 1.21.1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static RegistryHelper registryHelper = new RegistryHelper();

    @Override
    public void onInitialize() {
    }
}
