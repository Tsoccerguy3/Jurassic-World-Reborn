package net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities;

import com.github.alexthe666.citadel.animation.Animation;
import mod.reborn.server.entity.ai.LeapingMeleeEntityAI;
import mod.reborn.server.entity.ai.RaptorLeapEntityAI;
import net.gamma02.jurassicworldreborn.client.model.animation.EntityAnimation;
import net.gamma02.jurassicworldreborn.client.sounds.SoundHandler;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class AchillobatorEntity extends DinosaurEntity
{
    public AchillobatorEntity(Level world)
    {
        super(world);
        this.target(AlvarezsaurusEntity.class, TitanisEntity.class, SpinoraptorEntity.class, MegatheriumEntity.class, SmilodonEntity.class, ArsinoitheriumEntity.class, BeelzebufoEntity.class, VelociraptorBlueEntity.class, CearadactylusEntity.class, VelociraptorCharlieEntity.class, ChilesaurusEntity.class, CoelurusEntity.class, ProceratosaurusEntity.class, CompsognathusEntity.class, VelociraptorDeltaEntity.class, DilophosaurusEntity.class, DimorphodonEntity.class, VelociraptorEchoEntity.class, GallimimusEntity.class, DodoEntity.class, HypsilophodonEntity.class, Player.class
, LeaellynasauraEntity.class, LeptictidiumEntity.class, MetriacanthosaurusEntity.class, MicroraptorEntity.class, MussaurusEntity.class, OrnithomimusEntity.class, OthnieliaEntity.class, OviraptorEntity.class, ProtoceratopsEntity.class, Animal.class, Villager.class);
        this.tasks.addTask(1, new LeapingMeleeEntityAI(this, this.dinosaur.getAttackSpeed()));
        this.tasks.addTask(1, new RaptorLeapEntityAI(this));

        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, Player.class
, RaphusrexEntity.class, IndominusEntity.class, TyrannosaurusEntity.class, GiganotosaurusEntity.class, SpinosaurusEntity.class));
        doesEatEggs(true);
    }

    @Override
    public EntityAIBase getAttackAI() {
        return new RaptorLeapEntityAI(this);
    }


    @Override
    public void fall(float distance, float damageMultiplier) {
        if (this.getAnimation() != EntityAnimation.LEAP_LAND.get()) {
            super.fall(distance, damageMultiplier);
        }
    }
    @Override
    public SoundEvent getSoundForAnimation(Animation animation) {
        switch (EntityAnimation.getAnimation(animation)) {
            case SPEAK:
                return SoundHandler.ACHILLOBATOR_LIVING;
            case DYING:
                return SoundHandler.ACHILLOBATOR_DEATH;
            case INJURED:
                return SoundHandler.ACHILLOBATOR_HURT;
            case CALLING:
                return SoundHandler.ACHILLOBATOR_CALL;
            case ATTACKING:
                return SoundHandler.ACHILLOBATOR_ATTACK;
            case MATING:
                return SoundHandler.ACHILLOBATOR_MATE_CALL;
            default:
                break;
        }

        return null;
    }


    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
    }
}
