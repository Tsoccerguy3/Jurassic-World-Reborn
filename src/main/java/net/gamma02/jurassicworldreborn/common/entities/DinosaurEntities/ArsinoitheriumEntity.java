package net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities;

import com.github.alexthe666.citadel.animation.Animation;
import net.gamma02.jurassicworldreborn.client.model.animation.EntityAnimation;
import net.gamma02.jurassicworldreborn.client.sounds.SoundHandler;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.Level;

public class ArsinoitheriumEntity extends DinosaurEntity
{
    public ArsinoitheriumEntity(Level world) { super(world); }
    public SoundEvent getSoundForAnimation(Animation animation) {

        switch (EntityAnimation.getAnimation(animation)) {
            case SPEAK:
                return SoundHandler.ARSINOITHERIUM_LIVING;
            case CALLING:
                return SoundHandler.ARSINOITHERIUM_LIVING;
            case MATING:
                return SoundHandler.ARSINOITHERIUM_THREAT;
            case DYING:
                return SoundHandler.ARSINOITHERIUM_DEATH;
            case INJURED:
                return SoundHandler.ARSINOITHERIUM_HURT;
            case BEGGING:
                return SoundHandler.ARSINOITHERIUM_THREAT;
            default:
                return null;
        }
    }
}
