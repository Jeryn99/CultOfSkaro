package mc.craig.software.forge;

import dev.architectury.platform.forge.EventBuses;
import mc.craig.software.CultOfSkaro;
import mc.craig.software.forge.data.COSSoundProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CultOfSkaro.MOD_ID)
public final class CultOfSkaroForge {
    public CultOfSkaroForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(CultOfSkaro.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::onGatherData);

        // Run our common setup.
        CultOfSkaro.init();
    }


    public void onGatherData(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();

        /*Resource Pack*/
        generator.addProvider(e.includeClient(), new COSSoundProvider(generator.getPackOutput(), existingFileHelper));


        /*Data Pack*/

    }
}
