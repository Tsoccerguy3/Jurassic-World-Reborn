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
public class OthnieliaDinosaur extends Dinosaur
{
    public static final double SPEED = 0.35F;
    public OthnieliaDinosaur()
    {
        super();

        this.setName("Othnielia");
        this.setDinosaurType(DinosaurType.SCARED);
        this.setDinosaurClass(OthnieliaEntity.class);
        this.setTimePeriod(TimePeriod.JURASSIC);
        this.setEggColorMale(0x3EA999, 0x584F41);
        this.setEggColorFemale(0xC9AC95, 0x46342E);
        this.setHealth(4, 12);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(1, 5);
        this.setMaximumAge(fromDays(25));
        this.setEyeHeight(0.2F, 0.55F);
        this.setSizeX(0.15F, 0.4F);
        this.setSizeY(0.25F, 0.55F);
        this.setStorage(9);
        this.setDiet((Diet.HERBIVORE.get()));
        this.setBones("skull", "teeth", "ribcage", "neck_vertebrae", "shoulder", "leg_bones", "pelvis", "tail_vertebrae");
        this.setHeadCubeName("Head ");
        this.setAttackBias(-100);
        this.setScale(0.35F, 0.15F);
        this.setImprintable(true);
        this.setBreeding(false, 2, 6, 28, false, true);
        String[][] recipe = {
                {"", "pelvis", "","",""},
                {"tail_vertebrae", "ribcage", "shoulder", "neck_vertebrae", "skull"},
                {"leg_bones", "", "", "", "teeth"}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<ResourceKey<Biome>> biomeList = new ArrayList<>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        this.setSpawn(1, biomeList);
    }
}
