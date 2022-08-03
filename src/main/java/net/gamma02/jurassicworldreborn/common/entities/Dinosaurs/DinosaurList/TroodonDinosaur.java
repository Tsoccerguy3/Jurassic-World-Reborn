package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;


import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.SleepTime;
import mod.reborn.server.entity.dinosaur.TroodonEntity;
import mod.reborn.server.period.TimePeriod;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import java.util.ArrayList;

public class TroodonDinosaur extends Dinosaur
{
    public static final double SPEED = 0.4F;
    public TroodonDinosaur()
    {
        super();

        this.setName("Troodon");
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setDinosaurClass(TroodonEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0x9DAA7A, 0x636B67);
        this.setEggColorFemale(0xA2A67C, 0x646D66);
        this.setHealth(4, 20);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(1, 5);
        this.setMaximumAge(fromDays(35));
        this.setEyeHeight(0.3F, 0.95F);
        this.setSizeX(0.15F, 0.7F);
        this.setSizeY(0.2F, 0.95F);
        this.setStorage(12);
        this.setDiet((Diet.CARNIVORE.get()));
        this.setSleepTime(SleepTime.NOCTURNAL);
        this.setBones("arm_bones", "foot_bones", "leg_bones", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "skull", "tail_vertebrae", "tooth");
        this.setHeadCubeName("head UPPER");
        this.setAttackBias(600);
        this.setScale(0.75F, 0.15F);
        this.setOffset(0.0F, 0.0F, 0.5F);
        this.setRotationAngle(10, 75);
        this.setAttackSpeed(1.9F);
        this.shouldDefendOffspring();
        this.setCanClimb(true);
        this.setDefendOwner(true);
        this.setBreeding(false,1, 7, 28, false, true);
        this.setJumpHeight(2);
        this.setImprintable(true);
        String[][] recipe = {
                {"", "","neck_vertebrae","skull"},
                {"tail_vertebrae","pelvis", "ribcage","shoulder"},
                {"", "leg_bones", "arm_bones", "tooth"},
                {"", "foot_bones", "", ""}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<Biome> biomeList = new ArrayList<Biome>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS));
        this.setSpawn(1, biomeList.toArray(new Biome[biomeList.size()]));
    }
}
