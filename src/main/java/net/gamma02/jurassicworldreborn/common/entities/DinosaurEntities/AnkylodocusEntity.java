package net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities;

import mod.reborn.RebornMod;
import net.gamma02.jurassicworldreborn.client.model.animation.EntityAnimation;
import net.gamma02.jurassicworldreborn.client.sounds.SoundHandler;
import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntity;
import com.github.alexthe666.citadel.animation.Animation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.entity.EntityCreature;

import net.minecraft.world.level.Level;
import scala.tools.nsc.doc.model.Class;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.EntityDataAccessor;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ResourceLocation;
import java.util.Locale;

public class AnkylodocusEntity extends DinosaurEntity {
    private static final EntityDataAccessor<Integer> VARIANT= EntityDataManager.createKey(AnkylodocusEntity.class, DataSerializers.VARINT);

    public AnkylodocusEntity(Level world) {
        super(world);
        this.setVariant(this.getRNG().nextInt(4));
    }


    @Override
    public SoundEvent getSoundForAnimation(Animation animation)
    {
        switch (EntityAnimation.getAnimation(animation))
        {
            case SPEAK:
                return SoundHandler.ANKYLODOCUS_LIVING;
            case DYING:
                return SoundHandler.ANKYLODOCUS_DEATH;
            case INJURED:
                return SoundHandler.ANKYLODOCUS_HURT;
            case CALLING:
                return SoundHandler.ANKYLODOCUS_LIVING;
            case BEGGING:
                return SoundHandler.ANKYLODOCUS_HURT;
            case WALKING:
                return SoundHandler.STOMP;
        }

        return null;
    }

    public void entityInit() {
        super.entityInit();
        this.dataManager.register(VARIANT, 0);
    }

    public void writeEntityToNBT(NBTTagCompound tagCompound) {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setInteger("Variant", this.getVariant());
    }

    public void readEntityFromNBT(NBTTagCompound tagCompound) {
        super.readEntityFromNBT(tagCompound);
        this.setVariant(tagCompound.getInteger("Variant"));
    }

    public void setVariant(int value){
        this.dataManager.set(VARIANT, value);
    }

    public int getVariant(){
        return this.dataManager.get(VARIANT);
    }

    public ResourceLocation getTexture(){
        switch(getVariant()){
            case 0: default: return texture("blue");
            case 1: return texture("green");
            case 2: return texture("grey");
            case 3: return texture("red");
        }
    }
    private ResourceLocation texture(String variant){
        String formattedName = this.dinosaur.getName().toLowerCase(Locale.ENGLISH).replaceAll(" ", "_");
        String baseTextures = "textures/entities/" + formattedName + "/";
        String texture = baseTextures + formattedName;
        return isMale()?new ResourceLocation(RebornMod.MODID, texture + "_male_" + "adult" + "_" + variant + ".png"):new ResourceLocation(RebornMod.MODID, texture + "_female_" + "adult" + "_" + variant +".png");
    }
}