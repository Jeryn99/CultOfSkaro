package mc.craig.software.sounds;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import static mc.craig.software.CultOfSkaro.MOD_ID;

;

public class COSSounds {


    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(MOD_ID, Registries.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> DALEK_MOVE = SOUNDS.register("dalek_move", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "dalek_move")));
    public static final RegistrySupplier<SoundEvent> DALEK_LASER = SOUNDS.register("dalek_laser", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, "dalek_laser")));


}
