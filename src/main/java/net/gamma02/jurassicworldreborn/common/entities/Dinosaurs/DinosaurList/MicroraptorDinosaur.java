package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;

import java.util.ArrayList;

import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.*;
import net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.Dinosaur;
import net.gamma02.jurassicworldreborn.common.entities.EntityUtils.Diet;
import net.gamma02.jurassicworldreborn.common.entities.EntityUtils.FoodType;
import net.gamma02.jurassicworldreborn.common.util.TimePeriod;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
public class MicroraptorDinosaur extends Dinosaur {
    public static final double SPEED = 0.4F;
    public MicroraptorDinosaur() {
        super();
        this.setName("Microraptor");
        this.setDinosaurClass(MicroraptorEntity.class);
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0x142146, 0x101625);
        this.setEggColorFemale(0x0E1423, 0x121827);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setHealth(4, 10);
        this.setStrength(0.5, 2);
        this.setMaximumAge(this.fromDays(30));
        this.setFlee(true);
        this.setEyeHeight(0.2F, 0.5F);
        this.setSizeX(0.2F, 0.7F);
        this.setSizeY(0.25F, 0.6F);
        this.setStorage(9);
        this.setDiet(new Diet().withModule(new Diet.DietModule(FoodType.INSECT)).withModule(new Diet.DietModule(FoodType.MEAT)));
        this.setBones("arm_bones", "foot_bones", "leg_bones", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "skull", "tail_vertebrae", "tooth");
        this.setHeadCubeName("Head");
        this.setScale(0.4F, 0.15F);
        this.setImprintable(true);
        this.setDefendOwner(true);
        this.setMaxHerdSize(16);
        this.setAttackBias(400.0);
        this.setCanClimb(true);
        this.setBreeding(false, 1, 5, 15, false, true);
        this.setJumpHeight(2);
        this.setRandomFlock(false);
        String[][] recipe =
                {{"", "", "", "neck_vertebrae", "skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                {"", "leg_bones", "leg_bones", "arm_bones", ""},
                {"", "foot_bones", "foot_bones", "", ""}};
        this.setRecipe(recipe);
        
        ArrayList<ResourceKey<Biome>> biomeList = new ArrayList<>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.DENSE));
        this.setSpawn(1, biomeList);
        this.enableSkeleton();
    }
}
