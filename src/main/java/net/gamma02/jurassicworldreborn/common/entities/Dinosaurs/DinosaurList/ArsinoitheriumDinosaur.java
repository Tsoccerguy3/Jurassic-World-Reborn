package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;

import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.*;
import net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.Dinosaur;
import net.gamma02.jurassicworldreborn.common.entities.EntityUtils.Diet;
import net.gamma02.jurassicworldreborn.common.util.TimePeriod;
import java.util.ArrayList;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class ArsinoitheriumDinosaur extends Dinosaur {
    public static final double SPEED = 0.3F;
    public ArsinoitheriumDinosaur() {
        super();

        this.setName("Arsinoitherium");
        this.setDinosaurType(DinosaurType.NEUTRAL);
        this.setDinosaurClass(ArsinoitheriumEntity.class);
        this.setTimePeriod(TimePeriod.PALEOGENE);
        this.setEggColorMale(0x834948, 0x834948);
        this.setEggColorFemale(0x63736e, 0x29312f);
        this.setHealth(10, 40);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStorage(27);
        this.setAttackSpeed(1.5);
        this.setStrength(5, 20);
        this.setMaximumAge(fromDays(45));
        this.setEyeHeight(0.45F, 1.4F);
        this.setSizeX(0.35F, 1.6F);
        this.setSizeY(0.5F, 1.9F);
        this.setDiet(Diet.HERBIVORE.get());
        this.setBones("skull", "teeth","front_leg_bones", "hind_leg_bones", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "tail_vertebrae");
        this.setHeadCubeName("Head");
        this.setScale(1.05F, 0.30F);
        this.setMammal(true);
        this.setBirthType(BirthType.LIVE_BIRTH);
        this.shouldDefendOffspring();
        this.setAttackBias(400);
        this.setImprintable(true);
        this.setDefendOwner(true);
        this.setBreeding(true, 2, 4, 40, false, true);
        String[][] recipe = {
                {"", "", "","neck_vertebrae","skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","teeth"},
                {"", "", "hind_leg_bones", "front_leg_bones", ""}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<ResourceKey<Biome>> biomeList = new ArrayList<>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SNOWY));
        this.setSpawn(1, biomeList);
    }
}
