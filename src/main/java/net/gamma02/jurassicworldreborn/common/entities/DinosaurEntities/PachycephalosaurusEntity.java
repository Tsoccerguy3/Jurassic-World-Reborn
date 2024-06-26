package net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities;

import com.github.alexthe666.citadel.animation.Animation;
import net.gamma02.jurassicworldreborn.client.sounds.SoundHandler;
import net.gamma02.jurassicworldreborn.client.render.entity.animation.EntityAnimation;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EntityType;

public class PachycephalosaurusEntity extends DinosaurEntity
{
    public PachycephalosaurusEntity(Level world, EntityType<PachycephalosaurusEntity> type)
    {
        super(world, type);
                this.addTask(1, new HurtByTargetGoal(this));

    }
    @Override
    public SoundEvent getSoundForAnimation(Animation animation)
    {
        switch (EntityAnimation.getAnimation(animation))
        {
            case SPEAK:
                return SoundHandler.PACHYCEPHALOSAURUS_LIVING;
            case DYING:
                return SoundHandler.PACHYCEPHALOSAURUS_DEATH;
            case INJURED:
                return SoundHandler.PACHYCEPHALOSAURUS_HURT;
            case CALLING:
                return SoundHandler.PACHYCEPHALOSAURUS_CALL;
            case BEGGING:
                return SoundHandler.PACHYCEPHALOSAURUS_THREAT;
        }

        return null;
    }
}
