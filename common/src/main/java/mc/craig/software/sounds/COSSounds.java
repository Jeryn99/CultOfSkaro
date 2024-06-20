package mc.craig.software.sounds;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import mc.craig.software.CultOfSkaro;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import static mc.craig.software.CultOfSkaro.MOD_ID;

;

public class COSSounds {


    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(MOD_ID, Registries.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> DALEK_MOVE = setUpSound("dalek_move");
    public static final RegistrySupplier<SoundEvent> DALEK_LASER = setUpSound( "dalek_laser");


    private static RegistrySupplier<SoundEvent> setUpSound(String soundName) {
        System.out.println(soundName);
        SoundEvent sound = SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, soundName));
        return SOUNDS.register(soundName, () -> sound);
    }

}
