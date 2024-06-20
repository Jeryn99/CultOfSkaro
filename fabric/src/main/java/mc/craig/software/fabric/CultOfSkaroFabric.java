package mc.craig.software.fabric;

import mc.craig.software.CultOfSkaro;
import net.fabricmc.api.ModInitializer;

public final class CultOfSkaroFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CultOfSkaro.init();
    }
}
