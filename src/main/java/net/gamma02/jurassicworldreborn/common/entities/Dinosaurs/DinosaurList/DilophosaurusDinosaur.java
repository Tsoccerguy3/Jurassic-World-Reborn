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

public class DilophosaurusDinosaur extends Dinosaur {
    public static final double SPEED = 0.4F;
    public DilophosaurusDinosaur() {
        super();

        this.setName("Dilophosaurus");
        this.setDinosaurClass(DilophosaurusEntity.class);
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setTimePeriod(TimePeriod.JURASSIC);
        this.setEggColorMale(0x6B7834, 0x2A2E30);
        this.setEggColorFemale(0x62712E, 0x30241C);
        this.setHealth(10, 30);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(2, 6);
        this.setMaximumAge(this.fromDays(40));
        this.setEyeHeight(0.35F, 1.8F);
        this.setSizeX(0.4F, 1.2F);
        this.setSizeY(0.5F, 1.9F);
        this.setStorage(27);
        this.setDiet(Diet.CARNIVORE.get());
        this.setSleepTime(SleepTime.CREPUSCULAR);
        this.setBones("arm_bones", "leg_bones", "neck", "pelvis", "ribcage", "shoulder", "skull", "tail_vertebrae", "tooth");
        this.setHeadCubeName("Head");
        this.setScale(0.95F, 0.22F);
        this.setImprintable(true);
        this.setDefendOwner(true);
        this.setMaxHerdSize(10);
        this.setAttackBias(1200.0);
        this.setBreeding(false, 2, 4, 24, false, true);
        String[][] recipe =     {{"", "", "", "neck", "skull"},
                                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                                 {"leg_bones", "leg_bones", "", "", "arm_bones"}};
        this.setRecipe(recipe);

        ArrayList<ResourceKey<Biome>> biomeList = new ArrayList<>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SANDY));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.MESA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS));
        this.setSpawn(1, biomeList);
        this.enableSkeleton();

    }
}
