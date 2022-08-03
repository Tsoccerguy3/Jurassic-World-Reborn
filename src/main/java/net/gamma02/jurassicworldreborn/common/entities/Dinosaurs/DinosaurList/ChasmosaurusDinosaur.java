package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;


import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.ChasmosaurusEntity;
import mod.reborn.server.period.TimePeriod;
import net.minecraft.world.biome.Biome;
import java.util.ArrayList;
import net.minecraftforge.common.BiomeDictionary;

public class ChasmosaurusDinosaur extends Dinosaur
{
    public static final double SPEED = 0.35F;
    public ChasmosaurusDinosaur()
    {
        super();

        this.setName("Chasmosaurus");
        this.setDinosaurType(DinosaurType.NEUTRAL);
        this.setDinosaurClass(ChasmosaurusEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0xB6B293, 0x85563E);
        this.setEggColorFemale(0xB9B597, 0x323232);
        this.setHealth(10, 40);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(5, 15);
        this.setMaximumAge(fromDays(40));
        this.setEyeHeight(0.3F, 1.35F);
        this.setSizeX(0.35F, 1.75F);
        this.setSizeY(0.45F, 2.35F);
        this.setStorage(27);
        this.setDiet((Diet.HERBIVORE.get()));
        this.setBones("front_leg_bones", "hind_leg_bones", "tooth", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "skull", "tail_vertebrae");
        this.setHeadCubeName("Head");
        this.setScale(1.55F, 0.1F);
        this.setOffset(0.0F, 0.775F, 0.0F);
        this.setBreeding(false, 2, 6, 40, false, true);
        this.setImprintable(true);
        this.setDefendOwner(true);
        this.shouldDefendOffspring();
        String[][] recipe = {
                {"", "", "","neck_vertebrae","skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                {"", "", "hind_leg_bones", "front_leg_bones", ""}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<Biome> biomeList = new ArrayList<Biome>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.MESA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS));
        this.setSpawn(1, biomeList.toArray(new Biome[biomeList.size()]));
    }
}
