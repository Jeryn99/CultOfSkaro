package mc.craig.software.entity;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;

import static mc.craig.software.CultOfSkaro.MOD_ID;

public class COSEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(MOD_ID, Registries.ENTITY_TYPE);



}
