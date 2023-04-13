package net.gamma02.jurassicworldreborn.client.render.entity.animation.entity;

import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import net.gamma02.jurassicworldreborn.client.model.AnimatableModel;
import net.gamma02.jurassicworldreborn.client.render.entity.animation.EntityAnimator;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.AmmoniteEntity;

public class AmmoniteAnimator extends EntityAnimator<AmmoniteEntity> {

    protected void performAnimations(AnimatableModel parModel, AmmoniteEntity entity, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, float scale) {

        AdvancedModelBox tentacle1 = parModel.getCube("Tentacle 1 base");
        AdvancedModelBox tentacle2 = parModel.getCube("Tentacle 2 base");
        AdvancedModelBox tentacle3 = parModel.getCube("Tentacle 3 base");
        AdvancedModelBox tentacle4 = parModel.getCube("Tentacle 4 base");
        AdvancedModelBox tentacle5 = parModel.getCube("Tentacle 5 base");
        AdvancedModelBox tentacle6 = parModel.getCube("Tentacle 6 base");
        AdvancedModelBox tentacle7 = parModel.getCube("Tentacle 7 base");
        AdvancedModelBox tentacle8 = parModel.getCube("Tentacle 8 base");
        AdvancedModelBox[] tentacles = { tentacle8, tentacle7, tentacle6, tentacle5, tentacle4, tentacle3, tentacle2, tentacle1};

        parModel.chainWave(tentacles, entity.inWater()?0.15F:0.1F , entity.inWater()?0.6F:0.5F, 2, ticks, limbSwingAmount + 0.25F * (entity.inWater()?1.5F:1.0F));
    }
}
