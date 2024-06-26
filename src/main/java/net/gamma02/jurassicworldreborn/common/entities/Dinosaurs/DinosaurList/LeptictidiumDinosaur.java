package net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList;


import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.*;
import net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.Dinosaur;
import net.gamma02.jurassicworldreborn.common.entities.EntityUtils.Diet;
import net.gamma02.jurassicworldreborn.common.util.TimePeriod;
import java.util.ArrayList;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class LeptictidiumDinosaur extends Dinosaur
{
    public static final double SPEED = 0.39F;
    public LeptictidiumDinosaur()
    {
        super();

        this.setName("Leptictidium");
        this.setDinosaurType(DinosaurType.SCARED);
        this.setDinosaurClass(LeptictidiumEntity.class);
        this.setTimePeriod(TimePeriod.PALEOGENE); // TODO EOCENE
        this.setEggColorMale(0x362410, 0x978A78);
        this.setEggColorFemale(0xAFA27E, 0x3E2D17);
        this.setHealth(4, 14);
        this.setStrength(2, 4);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setMaximumAge(fromDays(25));
        this.setEyeHeight(0.21F, 0.63F);
        this.setSizeX(0.1F, 0.5F);
        this.setSizeY(0.15F, 0.75F);
        this.setMammal(true);
        this.setDiet((Diet.INHERBIVORE.get()));
        this.setBones("arm_bones", "leg_bones", "pelvis", "ribcage", "skull", "tail_vertebrae", "teeth", "neck_vertebrae", "shoulder");
        this.setHeadCubeName("Head");
        this.setScale(0.6F, 0.15F);
        this.setAttackBias(-50);
        this.setImprintable(true);
        this.setBirthType(BirthType.LIVE_BIRTH);
        this.setStorage(12);
        this.setBreeding(true, 2, 4, 20, false, true);
        String[][] recipe = {
                {"", "pelvis", "","",""},
                {"tail_vertebrae", "ribcage", "shoulder", "neck_vertebrae", "skull"},
                {"leg_bones", "", "", "arm_bones", "teeth"}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<ResourceKey<Biome>> biomeList = new ArrayList<>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.MESA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SNOWY));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS));
        this.setSpawn(1, biomeList);
    }
}
