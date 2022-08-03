package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;

import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.ChilesaurusEntity;
import mod.reborn.server.period.TimePeriod;
import net.minecraft.world.biome.Biome;
import java.util.ArrayList;
import net.minecraftforge.common.BiomeDictionary;

public class ChilesaurusDinosaur extends Dinosaur {
    public static final double SPEED = 0.3F;
    public ChilesaurusDinosaur() {
        super();

        this.setName("Chilesaurus");
        this.setDinosaurType(DinosaurType.SCARED);
        this.setDinosaurClass(ChilesaurusEntity.class);
        this.setTimePeriod(TimePeriod.JURASSIC);
        this.setEggColorMale(0xE7D048, 0x7CB2A4);
        this.setEggColorFemale(0xE1CD50, 0x768840);
        this.setHealth(10, 20);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStorage(27);
        this.setStrength(1, 20);
        this.setMaximumAge(fromDays(45));
        this.setEyeHeight(0.45F, 1.6F);
        this.setSizeX(0.2F, 1.4F);
        this.setSizeY(0.3F, 1.8F);
        this.setDiet(Diet.HERBIVORE.get());
        this.setBones("skull", "arm_bones", "leg_bones", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "tail_vertebrae", "tooth");
        this.setHeadCubeName("Head");
        this.setScale(0.60F, 0.1F);
        this.setBreeding(false, 2, 6, 30, false, true);
        this.setJumpHeight(3);
        this.setImprintable(true);
        this.setDefendOwner(true);
        this.setStorage(8);
        this.shouldDefendOffspring();
        String[][] recipe =     {{"", "", "", "neck_vertebrae", "skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                {"", "leg_bones", "", "", "arm_bones"}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<Biome> biomeList = new ArrayList<Biome>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SANDY));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.MESA));
        this.setSpawn(1, biomeList.toArray(new Biome[biomeList.size()]));
    }
}
