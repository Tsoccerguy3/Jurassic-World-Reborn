package net.gamma02.jurassicworldreborn.client.render.entity.animation.entity;

import net.gamma02.jurassicworldreborn.client.model.AnimatableModel;
import net.gamma02.jurassicworldreborn.client.render.entity.animation.EntityAnimator;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import mod.reborn.server.entity.dinosaur.StegosaurusEntity;

@OnlyIn(Dist.CLIENT)
public class StegosaurusAnimator extends EntityAnimator<StegosaurusEntity>
{
    protected void performAnimations(AnimatableModel parModel, StegosaurusEntity entity, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, float scale) {
    }
}
