package net.gamma02.jurassicworldreborn.client.render.entity.animation.entity;

import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import net.gamma02.jurassicworldreborn.client.model.AnimatableModel;
import net.gamma02.jurassicworldreborn.client.render.entity.animation.EntityAnimator;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.MajungasaurusEntity;

@OnlyIn(Dist.CLIENT)
public class MajungasaurusAnimator extends EntityAnimator<MajungasaurusEntity>
{
    @Override
    protected void performAnimations(AnimatableModel model, MajungasaurusEntity entity, float f, float f1, float ticks, float rotationYaw, float rotationPitch, float scale)
    {
        AdvancedModelBox tail1 = model.getCube("Tail Base");
        AdvancedModelBox tail2 = model.getCube("Tail 2");
        AdvancedModelBox tail3 = model.getCube("Tail 3");
        AdvancedModelBox tail4 = model.getCube("Tail 4");
        AdvancedModelBox tail5 = model.getCube("Tail 5");
        AdvancedModelBox tail6 = model.getCube("Tail 6");

        AdvancedModelBox leftThigh = model.getCube("Left Thigh");
        AdvancedModelBox rightThigh = model.getCube("Right Thigh");

        AdvancedModelBox leftCalf1 = model.getCube("Left Calf 1");
        AdvancedModelBox rightCalf1 = model.getCube("Right Calf 1");

        AdvancedModelBox leftCalf2 = model.getCube("Left Calf 2");
        AdvancedModelBox rightCalf2 = model.getCube("Right Calf 2");

        AdvancedModelBox leftFoot = model.getCube("Foot Left");
        AdvancedModelBox rightFoot = model.getCube("Foot Right");

        AdvancedModelBox bodyRear = model.getCube("Body Rear");
        AdvancedModelBox bodyMid = model.getCube("Body Mid");
        AdvancedModelBox bodyFront = model.getCube("Body Front");

        AdvancedModelBox neck1 = model.getCube("Neck BASE");
        AdvancedModelBox neck2 = model.getCube("Neck 2");
        AdvancedModelBox neck3 = model.getCube("Neck 3");
        AdvancedModelBox neck4 = model.getCube("Neck 4");

        AdvancedModelBox head = model.getCube("Head");

        AdvancedModelBox upperJaw = model.getCube("Upper Jaw");
        AdvancedModelBox lowerJaw = model.getCube("Lower jaw");

        AdvancedModelBox upperArmRight = model.getCube("Upper Arm Right");
        AdvancedModelBox upperArmLeft = model.getCube("Upper Arm LEFT");

        AdvancedModelBox lowerArmRight = model.getCube("Lower Arm Right");
        AdvancedModelBox lowerArmLeft = model.getCube("Lower Arm LEFT");

        AdvancedModelBox handRight = model.getCube("Hand Right");
        AdvancedModelBox handLeft = model.getCube("Hand LEFT");

        AdvancedModelBox[] tail = new AdvancedModelBox[] { tail1, tail2, tail3, tail4, tail5, tail6 };

        AdvancedModelBox[] armLeft = new AdvancedModelBox[] { upperArmLeft, lowerArmLeft, handLeft };
        AdvancedModelBox[] armRight = new AdvancedModelBox[] { upperArmRight, lowerArmRight, handRight };

        AdvancedModelBox[] body = new AdvancedModelBox[] { bodyRear, bodyMid, bodyFront, neck1, neck2, neck3, neck4, head };

        float globalSpeed = 0.5F;
        float globalDegree = 0.4F;
        float globalHeight = 1.0F;

        model.bob(bodyRear, globalSpeed * 1F, globalHeight * 0.8F, false, f, f1);

        model.bob(leftThigh, globalSpeed * 1F, globalHeight * 0.8F, false, f, f1);
        model.bob(rightThigh, globalSpeed * 1F, globalHeight * 0.8F, false, f, f1);

        model.chainWave(body, globalSpeed * 1F, globalHeight * -0.02F, -3, f, f1);
        model.chainWave(tail, globalSpeed * 1F, globalHeight * 0.05F, -2, f, f1);

        model.chainWave(armRight, globalSpeed * 1F, globalHeight * -0.25F, -3, f, f1);
        model.chainWave(armLeft, globalSpeed * 1F, globalHeight * -0.25F, -3, f, f1);

        model.chainWave(tail, 0.1F, 0.05F, -2, ticks, 0.25F);
        model.chainWave(body, 0.1F, 0.03F, -5, ticks, 0.25F);
        model.chainWave(armRight, 0.1F, 0.1F, -4, ticks, 0.25F);
        model.chainWave(armLeft, 0.1F, 0.1F, -4, ticks, 0.25F);

        entity.tailBuffer.applyChainSwingBuffer(tail);
    }
}
