package net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities;

import com.github.alexthe666.citadel.animation.Animation;
import net.gamma02.jurassicworldreborn.Jurassicworldreborn;
import net.gamma02.jurassicworldreborn.client.sounds.SoundHandler;
import net.gamma02.jurassicworldreborn.client.render.entity.animation.EntityAnimation;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EntityType;

import java.util.Locale;

public class AnkylosaurusEntity extends DinosaurEntity {
    private static final EntityDataAccessor<Integer> VARIANT= SynchedEntityData.defineId(AnkylosaurusEntity.class, EntityDataSerializers.INT);

    public AnkylosaurusEntity (Level world, EntityType<AnkylosaurusEntity> type) {
        super(world, type);
               this.addTask(1, new HurtByTargetGoal(this));
        this.setVariant(this.getRandom().nextInt(4));
    }


    @Override
    public SoundEvent getSoundForAnimation(Animation animation) {
        switch (EntityAnimation.getAnimation(animation)) {
            case SPEAK:
                return SoundHandler.ANKYLOSAURUS_LIVING;
            case DYING:
                return SoundHandler.ANKYLOSAURUS_DEATH;
            case INJURED:
                return SoundHandler.ANKYLOSAURUS_HURT;
            case CALLING:
                return SoundHandler.ANKYLOSAURUS_CALL;
            case ROARING:
                return SoundHandler.ANKYLOSAURUS_CALL;
            case ATTACKING:
                return SoundHandler.ANKYLOSAURUS_ATTACK;
            case MATING:
                return SoundHandler.ANKYLOSAURUS_MATE_CALL;
            default:
                break;
        }

        return null;
    }

    public void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(VARIANT, 0);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag nbt) {
        super.addAdditionalSaveData(nbt);
        nbt.putInt("Variant", this.entityData.get(VARIANT));
    }


    @Override
    public void readAdditionalSaveData(CompoundTag nbt) {
        super.readAdditionalSaveData(nbt);
        this.entityData.set(VARIANT, nbt.getInt("Variant"));
    }

    public void setVariant(int value){
        this.entityData.set(VARIANT, value);
    }

    public int getVariant(){
        return this.entityData.get(VARIANT);
    }

    public ResourceLocation getTexture(){
        switch(getVariant()){
            case 0: default: return texture("bumpy");
            case 1: return texture("jw");
            case 2: return texture("jp3");
            case 3: return texture("swamp");
        }
    }
    private ResourceLocation texture(String variant){
        String formattedName = this.dinosaur.getName().toLowerCase(Locale.ENGLISH).replaceAll(" ", "_");
        String baseTextures = "textures/entities/" + formattedName + "/";
        String texture = baseTextures + formattedName;
        return isMale()?new ResourceLocation(Jurassicworldreborn.modid, texture + "_male_" + "adult" + "_" + variant + ".png"):new ResourceLocation(Jurassicworldreborn.modid, texture + "_female_" + "adult" + "_" + variant +".png");
    }
}
