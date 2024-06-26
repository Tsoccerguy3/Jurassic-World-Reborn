package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;

import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.*;
import net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.Dinosaur;
import net.gamma02.jurassicworldreborn.common.entities.EntityUtils.Diet;
import net.gamma02.jurassicworldreborn.common.entities.EntityUtils.SleepTime;
import net.gamma02.jurassicworldreborn.common.util.TimePeriod;
import java.util.ArrayList;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;


public class VelociraptorDinosaur extends Dinosaur {
    public static final double SPEED = 0.4F;
    public VelociraptorDinosaur() {
        super();

        this.setName("Velociraptor");
        this.setDinosaurClass(VelociraptorEntity.class);
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0xA06238, 0x632D11);
        this.setEggColorFemale(0x91765D, 0x5A4739);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setAttackSpeed(1.9);
        this.setHealth(6, 35);
        this.setStrength(4, 10);
        this.setMaximumAge(this.fromDays(45));
        this.setEyeHeight(0.45F, 1.7F);
        this.setSizeX(0.5F, 1.0F);
        this.setSizeY(0.5F, 1.8F);
        this.setStorage(27);
        this.setDiet(Diet.CARNIVORE.get());
        this.setSleepTime(SleepTime.DIURNAL);
        this.setBones("claw", "arm_bones", "claw", "foot_bones", "leg_bones", "neck_vertebrae", "ribcage", "shoulder", "skull", "tail_vertebrae", "tooth", "pelvis");
        this.setHeadCubeName("Head");
        this.setScale(1.3F, 0.1F);
        this.setImprintable(true);
        this.setDefendOwner(true);
        this.setMaxHerdSize(7);
        this.setAttackBias(600.0);
        this.setCanClimb(true);
        this.setBreeding(false,1, 7, 28, false, true);
        this.setJumpHeight(3);
        String[][] recipe = {
                {"", "","neck_vertebrae","skull"},
                {"tail_vertebrae","pelvis", "ribcage","shoulder"},
                {"", "leg_bones", "arm_bones", "tooth"},
                {"", "foot_bones", "", ""}};
        this.setRecipe(recipe);

        
        ArrayList<ResourceKey<Biome>> biomeList = new ArrayList<>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.DENSE));
        this.setSpawn(1, biomeList);
        doSkeletonCheck();
    }

    protected void doSkeletonCheck(){
        this.enableSkeleton();
    }
}
