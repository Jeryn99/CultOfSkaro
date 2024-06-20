package mc.craig.software.entity.dalek.types;

import net.minecraft.world.entity.LivingEntity;

public interface DalekType {

    float maxHealth();
    void performRangedAttack(LivingEntity livingEntity, float f);


}
