package mc.craig.software;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.RegistrarManager;
import mc.craig.software.sounds.COSSounds;

import java.util.function.Supplier;

public final class CultOfSkaro {
    public static final String MOD_ID = "cultofskaro";


    public static void init() {
        COSSounds.SOUNDS.register();
    }
}
