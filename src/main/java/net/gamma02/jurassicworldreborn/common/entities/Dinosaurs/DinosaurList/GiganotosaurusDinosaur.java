package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;



import java.util.ArrayList;

import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.GiganotosaurusEntity;
import net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.Dinosaur;
import net.gamma02.jurassicworldreborn.common.entities.EntityUtils.Diet;
import net.gamma02.jurassicworldreborn.common.util.TimePeriod;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class GiganotosaurusDinosaur extends Dinosaur
{
    public static final double SPEED = 0.4F;
    public GiganotosaurusDinosaur()
    {
        super();
        this.setName("Giganotosaurus");
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setDinosaurClass(GiganotosaurusEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0x4F3F33, 0x4F3F33);
        this.setEggColorFemale(0x756E54, 0x4B474A);
        this.setHealth(20, 80);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(5, 35);
        this.setEyeHeight(0.6F, 4.8F);
        this.setSizeX(0.2F, 4.0F);
        this.setSizeY(0.5F, 5.8F);
        this.setMaximumAge(fromDays(60));
        this.setStorage(54);
        this.setAttackSpeed(2);
        this.setDiet((Diet.CARNIVORE.get()));
        this.setBones("skull", "tooth", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "leg_bones", "arm_bones", "tail_vertebrae", "foot_bones", "claw");
        this.setHeadCubeName("Head");
        this.setScale(2.37F, 0.1F);
        this.shouldDefendOffspring();
        this.setAttackBias(280);
        this.setBreeding(false, 2, 6, 70, false, true);
        String[][] recipe = {
                {"", "", "","neck_vertebrae","skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                {"", "leg_bones", "", "arm_bones", "claw"},
                {"", "foot_bones", "", "", ""}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<ResourceKey<Biome>> biomeList = new ArrayList<>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        this.setSpawn(1, biomeList);
    }
}
