package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;

import java.util.ArrayList;

import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.*;
import net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.Dinosaur;
import net.gamma02.jurassicworldreborn.common.entities.EntityUtils.Diet;
import net.gamma02.jurassicworldreborn.common.util.TimePeriod;
import java.util.ArrayList;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class BrachiosaurusDinosaur extends Dinosaur {
    public static final double SPEED = 0.22F;
    public BrachiosaurusDinosaur() {
        super();
        this.setName("Brachiosaurus");
        this.setDinosaurType(DinosaurType.NEUTRAL);
        this.setDinosaurClass(BrachiosaurusEntity.class);
        this.setDinosaurType(DinosaurType.NEUTRAL);
        this.setTimePeriod(TimePeriod.JURASSIC);
        this.setEggColorMale(0x919256, 0x75281c);
        this.setEggColorFemale(0x624e43, 0x7c6b5e);
        this.setHealth(10, 150);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(5, 30);
        this.setMaximumAge(this.fromDays(85));
        this.setEyeHeight(2.2F, 17.4F);
        this.setSizeX(0.5F, 6.15F);
        this.setSizeY(1.1F, 6.65F);
        this.setDiet(Diet.HERBIVORE.get());
        this.setBones("front_leg_bones", "hind_leg_bones", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "skull", "tail_vertebrae", "tooth");
        this.setHeadCubeName("head");
        this.setScale(1.75F, 0.1F);
        this.setOffset(0.0F, 0.0F, 1.0F);
        this.setAttackBias(1200.0);
        this.setMaxHerdSize(15);
        this.setBreeding(false, 4, 8, 70, true, false);
        String[][] recipe =     {{"", "", "", "", "skull"},
                                 {"", "", "", "neck_vertebrae","tooth"},
                                 {"tail_vertebrae","pelvis","ribcage","shoulder",""},
                                 {"","hind_leg_bones","hind_leg_bones","front_leg_bones","front_leg_bones"}};
        this.setRecipe(recipe);
        ArrayList<ResourceKey<Biome>> biomeList = new ArrayList<>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        this.setSpawn(1, biomeList);
        this.enableSkeleton();
    }
}
