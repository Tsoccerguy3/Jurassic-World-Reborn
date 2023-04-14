package net.gamma02.jurassicworldreborn.client.render.entity.animation.entity;

import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import net.gamma02.jurassicworldreborn.client.model.AnimatableModel;
import net.gamma02.jurassicworldreborn.client.render.entity.animation.EntityAnimator;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.BrachiosaurusEntity;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BrachiosaurusAnimator extends EntityAnimator<BrachiosaurusEntity> {
    @Override
    protected void performAnimations(AnimatableModel model, BrachiosaurusEntity entity, float f, float f1, float ticks, float rotationYaw, float rotationPitch, float scale) {
        AdvancedModelBox head = model.getCube("head");

        AdvancedModelBox neck1 = model.getCube("Neck 1");
        AdvancedModelBox neck2 = model.getCube("neck2");
        AdvancedModelBox neck3 = model.getCube("neck3");
        AdvancedModelBox neck4 = model.getCube("neck4");
        AdvancedModelBox neck5 = model.getCube("neck5");
        AdvancedModelBox neck6 = model.getCube("neck6");
        AdvancedModelBox neck8 = model.getCube("neck8");

        AdvancedModelBox neck7 = model.getCube("neck7");
        AdvancedModelBox tail1 = model.getCube("tail1");
        AdvancedModelBox tail2 = model.getCube("tail2");
        AdvancedModelBox tail3 = model.getCube("tail3");
        AdvancedModelBox tail4 = model.getCube("tail4");
        AdvancedModelBox tail5 = model.getCube("tail5");

        AdvancedModelBox[] neckParts = new AdvancedModelBox[] { head, neck8, neck7, neck6, neck5, neck4, neck3, neck2, neck1 };
        AdvancedModelBox[] tailParts = new AdvancedModelBox[] { tail5, tail4, tail3 };
        AdvancedModelBox[] tailParts2 = new AdvancedModelBox[] { tail5, tail4, tail3, tail2, tail1 };

        float delta = Minecraft.getInstance().getDeltaFrameTime();
        AdvancedModelBox root = model.getCube("hips");
        AdvancedModelBox backLeftThigh = model.getCube("top leg left");
        AdvancedModelBox backLeftCalf = model.getCube("bottom leg left");
        AdvancedModelBox backRightThigh = model.getCube("top leg right");
        AdvancedModelBox backRightCalf = model.getCube("bottom leg right");
        AdvancedModelBox frontLeftThigh = model.getCube("front left top leg");
        AdvancedModelBox frontLeftCalf = model.getCube("bottom front left leg");
        AdvancedModelBox frontRightThigh = model.getCube("front right top leg");
        AdvancedModelBox frontRightCalf = model.getCube("bottom front right leg");
        LegArticulator.articulateQuadruped(entity, entity.legSolver, root, neck1,
            backLeftThigh, backLeftCalf, backRightThigh, backRightCalf, frontLeftThigh, frontLeftCalf, frontRightThigh, frontRightCalf, 
            0.25F, 0.4F, -0.2F, -0.3F,
            delta
        );

        float globalSpeed = 0.4F;
        float globalHeight = 0.5F;

        entity.tailBuffer.applyChainSwingBuffer(tailParts2);
    }
}
