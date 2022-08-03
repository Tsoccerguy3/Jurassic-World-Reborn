package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;

import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.CrassigyrinusEntity;
import mod.reborn.server.period.TimePeriod;
import java.util.ArrayList;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class CrassigyrinusDinosaur extends Dinosaur {
    public static final double SPEED = 0.3F;
    public CrassigyrinusDinosaur() {
        super();

        this.setName("Crassigyrinus");
        this.setDinosaurType(DinosaurType.SCARED); //??
        this.setDinosaurClass(CrassigyrinusEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0xE5C2AD, 0x6E320E);
        this.setEggColorFemale(0xE8D0B2, 0x74480F);
        this.setHealth(10, 20);
        this.setSpeed((SPEED -0.25), SPEED);
        this.setStorage(27);
        this.setStrength(1, 20);
        this.setMaximumAge(fromDays(45));
        this.setAttackBias(120);
        this.setEyeHeight(0.45F, 1.6F);
        this.setSizeX(0.3F, 1.4F);
        this.setSizeY(0.5F, 1.8F);
        this.setDiet(Diet.CARNIVORE.get());
        this.setBones("skull", "teeth","tail_vertebrae","ribcage","foot_bone","hind_leg_bones", "front_leg_bones");
        this.setBirthType(BirthType.LIVE_BIRTH);
        this.setHeadCubeName("Head");
        this.setAttackBias(5);
        this.setScale(0.65F, 0.1F);
        this.setOffset(0,-2,0);
        this.setMarineAnimal(true);
        this.setBreeding(true, 2, 4, 20, false, true);
        String[][] recipe =     {
                { "", "", "skull"},
                { "tail_vertebrae", "ribcage","teeth"},
                { "hind_leg_bones", "", "front_leg_bones"},
                { "", "", "foot_bone"}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<Biome> biomeList = new ArrayList<Biome>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.RIVER));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.WATER));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN));
        this.setSpawn(1, biomeList.toArray(new Biome[biomeList.size()]));
    }
}
