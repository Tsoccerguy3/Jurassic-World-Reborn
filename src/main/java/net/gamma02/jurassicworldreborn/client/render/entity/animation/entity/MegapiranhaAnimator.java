package net.gamma02.jurassicworldreborn.client.render.entity.animation.entity;

import net.gamma02.jurassicworldreborn.client.model.AnimatableModel;
import net.gamma02.jurassicworldreborn.client.render.entity.animation.EntityAnimator;

import mod.reborn.server.entity.dinosaur.MegapiranhaEntity;

public class MegapiranhaAnimator extends EntityAnimator<MegapiranhaEntity>
{
    @Override
    protected void performAnimations(AnimatableModel model, MegapiranhaEntity entity, float f, float f1, float ticks, float rotationYaw, float rotationPitch, float scale)
    {
        AdvancedModelBox head = model.getCube("Neck ");
        AdvancedModelBox body1 = model.getCube("Body Section 1");
        AdvancedModelBox body2 = model.getCube("Body Section 2");
        AdvancedModelBox body3 = model.getCube("Body Section 3");

        AdvancedModelBox tail1 = model.getCube("Tail Section 1");
        AdvancedModelBox tail2 = model.getCube("Tail Section 2");
        AdvancedModelBox tail3 = model.getCube("Tail Section 3");

        AdvancedModelBox leftFlipper = model.getCube("Left Front Flipper");
        AdvancedModelBox rightFlipper = model.getCube("Right Front Flipper");

        AdvancedModelBox[] tail = new AdvancedModelBox[] { tail3, tail2, tail1, body3, body2, body1, head };

        head.rotationPointX -= -4 * f1 * Math.sin((f + 1) * 0.6); // Head moves side to side
        model.chainSwing(tail, 0.6F, 0.4F, 3.0D, f, f1); // and the tail follows with a delay.

        model.walk(leftFlipper, 0.6F, 0.6F, false, 0.0F, 0.8F, f, f1);
        model.walk(rightFlipper, 0.6F, 0.6F, false, 0.0F, 0.8F, f, f1);

        model.flap(leftFlipper, 0.6F, 0.6F, false, 0.0F, 0.8F, f, f1);
        model.flap(rightFlipper, 0.6F, 0.6F, true, 0.0F, -0.8F, f, f1);

        model.bob(head, 0.04F, 2.0F, false, ticks, 0.25F);
        model.walk(leftFlipper, 0.2F, 0.25F, false, 1.0F, 0.1F, ticks, 0.25F);
        model.walk(rightFlipper, 0.2F, 0.25F, false, 1.0F, 0.1F, ticks, 0.25F);
        model.chainSwing(tail, 0.05F, -0.075F, 1.5D, ticks, 0.25F);
    }
}
