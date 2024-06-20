package mc.craig.software.entity.dalek;

import mc.craig.software.entity.dalek.types.DalekType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;

public class DalekEntity extends Monster implements RangedAttackMob {

    private final DalekType dalekType;

    public DalekEntity(EntityType<? extends Monster> entityType, Level level, DalekType dalekType) {
        super(entityType, level);
        this.dalekType = dalekType;
        setMaxUpStep(0.6f);
        xpReward = 10;
        setNoAi(false);
    }

    @Override
    public void performRangedAttack(LivingEntity livingEntity, float f) {
        dalekType.performRangedAttack(livingEntity, f);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(2, new RandomStrollGoal(this, 0.8));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Villager.class, false, false));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 27, 10f) {
            @Override
            public boolean canContinueToUse() {
                return this.canUse();
            }
        });
    }

    @Override
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }


    public static AttributeSupplier.Builder setupAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
        builder = builder.add(Attributes.MAX_HEALTH, 50);
        builder = builder.add(Attributes.ARMOR, 3);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 3);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 3);
        return builder;
    }


    @Override
    public boolean hurt(DamageSource damageSource, float amount) {
        Entity directEntity = damageSource.getDirectEntity();
        if (directEntity instanceof AbstractArrow ||
                directEntity instanceof Player ||
                directEntity instanceof ThrownPotion ||
                directEntity instanceof AreaEffectCloud ||
                damageSource.is(DamageTypes.FALL) ||
                damageSource.is(DamageTypes.CACTUS) ||
                damageSource.is(DamageTypes.WITHER) ||
                damageSource.is(DamageTypes.WITHER_SKULL)) {
            return false;
        }
        return super.hurt(damageSource, amount);
    }


}
