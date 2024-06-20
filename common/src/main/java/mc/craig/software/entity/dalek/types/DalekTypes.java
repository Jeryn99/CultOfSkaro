package mc.craig.software.entity.dalek.types;

import net.minecraft.world.entity.LivingEntity;

public class DalekTypes {

    public static final DalekType COPPER = new DalekType() {
        @Override
        public float maxHealth() {
            return 50;
        }

        @Override
        public void performRangedAttack(LivingEntity livingEntity, float f) {

        }

        @Override
        public String name() {
            return "copper";
        }
    };
}
