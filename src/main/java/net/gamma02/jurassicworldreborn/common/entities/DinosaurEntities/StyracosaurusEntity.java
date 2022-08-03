package net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities;

import net.gamma02.jurassicworldreborn.client.model.animation.EntityAnimation;
import net.gamma02.jurassicworldreborn.client.sounds.SoundHandler;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntity;
import com.github.alexthe666.citadel.animation.Animation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.Level;

public class StyracosaurusEntity extends DinosaurEntity {

    private static boolean isKingSet = false;
    private boolean isKing = false;
    private StyracosaurusEntity king = null;

    public StyracosaurusEntity(Level world) {
        super(world);
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }

    @Override
    public SoundEvent getSoundForAnimation(Animation animation)
    {
        switch (EntityAnimation.getAnimation(animation))
        {
            case SPEAK:
                return SoundHandler.STYRACOSAURUS_LIVING;
            case DYING:
                return SoundHandler.STYRACOSAURUS_DEATH;
            case INJURED:
                return SoundHandler.STYRACOSAURUS_HURT;
            case CALLING:
                return SoundHandler.STYRACOSAURUS_CALL;
            case ROARING:
                return SoundHandler.STYRACOSAURUS_ROAR;
            case BEGGING:
                return SoundHandler.STYRACOSAURUS_THREAT;
        }

        return null;
    }

    @Override
    public void onLivingUpdate() {
        double distance2 = 18.0D;
        Entity entityFound2 = null;
        double d4 = -1.0D;
        for (Entity currE : this.world.loadedEntityList) {
            if (currE instanceof StyracosaurusEntity) {
                double d5 = currE.getDistanceSq(this.posX, this.posY, this.posZ);
                if ((d5 < distance2 * distance2) && (d4 == -1.0D || d5 < d4)) {
                    d4 = d5;
                    entityFound2 = currE;
                }
            }
        }
        if (entityFound2 != null) {
            if (!isKingSet) {
                king = ((StyracosaurusEntity) entityFound2);
                king.isKing = true;
                isKingSet = true;
            }
        }
        if(king == null){
            isKingSet = false;
        }
        if(!isKing && isKingSet) {
            moveHelper.setMoveTo(king.posX, king.posY, king.posZ, 1.0D);
        }
        super.onLivingUpdate();
    }
}
