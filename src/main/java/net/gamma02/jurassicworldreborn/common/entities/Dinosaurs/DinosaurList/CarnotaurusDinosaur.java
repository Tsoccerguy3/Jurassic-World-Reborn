package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;


import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.SleepTime;
import mod.reborn.server.entity.dinosaur.CarnotaurusEntity;
import mod.reborn.server.period.TimePeriod;
import net.minecraft.world.biome.Biome;
import java.util.ArrayList;
import net.minecraftforge.common.BiomeDictionary;

public class CarnotaurusDinosaur extends Dinosaur
{
    public static final double SPEED = 0.42F;
    public CarnotaurusDinosaur()
    {
        super();

        this.setName("Carnotaurus");
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setDinosaurClass(CarnotaurusEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0x535023, 0x292d0f);
        this.setEggColorFemale(0x964e26, 0x492f11);
        this.setHealth(10, 35);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(5, 20);
        this.setMaximumAge(fromDays(45));
        this.setEyeHeight(0.4F, 2.4F);
        this.setSizeX(0.45F, 2.35F);
        this.setSizeY(0.6F, 2.9F);
        this.setDiet(Diet.CARNIVORE.get());
        this.setBones("skull", "tooth", "claw", "foot_bones", "neck_vertebrae", "pelvis", "shoulder", "arm_bones", "leg_bones", "ribcage", "tail_vertebrae");
        this.setHeadCubeName("Head");
        this.setScale(1.5F, 0.15F);
        this.setBreeding(false, 2, 4, 40, false, true);
        this.shouldDefendOffspring();

        String[][] recipe = {
                {"", "", "","neck_vertebrae","skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                {"", "leg_bones", "", "arm_bones", "claw"},
                {"", "foot_bones", "", "", ""}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<Biome> biomeList = new ArrayList<Biome>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        this.setSpawn(1, biomeList.toArray(new Biome[biomeList.size()]));
    }
}
