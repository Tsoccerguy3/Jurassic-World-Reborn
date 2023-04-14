package net.gamma02.jurassicworldreborn.client.render.entity.animation.entity;

import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import net.gamma02.jurassicworldreborn.client.model.AnimatableModel;
import net.gamma02.jurassicworldreborn.client.render.entity.animation.EntityAnimator;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.CoelacanthEntity;

@OnlyIn(Dist.CLIENT)
public class CoelacanthAnimator extends EntityAnimator<CoelacanthEntity> {
    @Override
    protected void performAnimations(AnimatableModel model, CoelacanthEntity entity, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, float scale) {
        AdvancedModelBox neck = model.getCube("Neck ");
        AdvancedModelBox body1 = model.getCube("Body Section 1");
        AdvancedModelBox body2 = model.getCube("Body Section 2");
        AdvancedModelBox body3 = model.getCube("Body Section 3");
        AdvancedModelBox tail1 = model.getCube("Tail Section 1");
        AdvancedModelBox tail2 = model.getCube("Tail Section 2");
        AdvancedModelBox tail3 = model.getCube("Tail Section 3");
        AdvancedModelBox leftFlipper = model.getCube("Left Front Flipper");
        AdvancedModelBox rightFlipper = model.getCube("Right Front Flipper");
        AdvancedModelBox lowerJawFront = model.getCube("Lower jaw front");

        AdvancedModelBox[] body = new AdvancedModelBox[] { tail3, tail2, tail1, body3, body2, body1 };
        AdvancedModelBox[] frontBody = new AdvancedModelBox[] { body3, body2, body1 };

        model.chainSwing(frontBody, 0.6F, 0.4F, 3.0D, limbSwing, limbSwingAmount);

        if (entity.isInWater()) {
            model.walk(leftFlipper, 0.2F, 0.25F, false, 1.0F, 0.1F, ticks, 0.25F);
            model.walk(rightFlipper, 0.2F, 0.25F, false, 1.0F, 0.1F, ticks, 0.25F);
            model.chainSwing(body, 0.05F, -0.075F, 1.5D, ticks, 0.25F);

            model.bob(neck, 0.125F, 4.5F, false, ticks, 0.25F);
            model.walk(lowerJawFront, 0.1F, 0.7F, false, 0.0F, 0.5F, ticks, 0.25F);
        }

        entity.tailBuffer.applyChainSwingBuffer(body);
    }
}
