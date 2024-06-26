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

public class MicroceratusDinosaur extends Dinosaur
{
    public static final double SPEED = 0.35F;
    public MicroceratusDinosaur()
    {
        super();

        this.setName("Microceratus");
        this.setDinosaurType(DinosaurType.PASSIVE);
        this.setDinosaurClass(MicroceratusEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0x956F2D, 0x92442C);
        this.setEggColorFemale(0x958331, 0x7E4A1F);
        this.setHealth(2, 10);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(1, 5);
        this.setMaximumAge(fromDays(30));
        this.setEyeHeight(0.14F, 0.36F);
        this.setSizeX(0.15F, 0.4F);
        this.setSizeY(0.18F, 0.55F);
        this.setDiet((Diet.HERBIVORE.get()));
        this.setBones("arm_bones", "leg_bones", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "skull", "tail_vertebrae", "teeth");
        this.setHeadCubeName("Head");
        this.setScale(0.5F, 0.15F);
        this.setAttackBias(5);
        this.setImprintable(true);
        this.setFlee(true);
        this.setStorage(6);
        this.setBreeding(false, 2, 6, 20, false, true);
        String[][] recipe = {
                {"tail_vertebrae", "pelvis", "ribcage","neck_vertebrae","skull"},
                {"leg_bones", "arm_bones", "", "shoulder", "teeth"}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<ResourceKey<Biome>> biomeList = new ArrayList<>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.MESA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS));
        this.setSpawn(1, biomeList);
    }
}
