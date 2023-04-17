package net.gamma02.jurassicworldreborn.common.entities;

import net.gamma02.jurassicworldreborn.common.entities.DinosaurEntities.*;
import net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.Bone;
import net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.Dinosaur;
import net.gamma02.jurassicworldreborn.common.entities.Dinosaurs.DinosaurList.TitanisDinosaur;
import net.gamma02.jurassicworldreborn.common.entities.animal.CrabEntity;
import net.gamma02.jurassicworldreborn.common.entities.animal.SharkEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Locale;
import java.util.function.Supplier;

import static net.gamma02.jurassicworldreborn.Jurassicworldreborn.modEventBus;
import static net.gamma02.jurassicworldreborn.Jurassicworldreborn.modid;

public class ModEntities {
    public static HashMap<Dinosaur, Bone.BoneGroup> boneMap = new HashMap<>();

    public static DeferredRegister<EntityType<?>> MOD_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, modid);

    public static RegistryObject<EntityType<VenomEntity>> VenomType = MOD_ENTITY_TYPES.<EntityType<VenomEntity>>register("venom_entity", ((Supplier<EntityType<VenomEntity>>)EntityType.Builder.<VenomEntity>of(VenomEntity::new, MobCategory.MISC).build(null)));

    public static RegistryObject<EntityType<CrabEntity>> CRAB_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CrabEntity>>register("crab", ((Supplier<EntityType<CrabEntity>>)EntityType.Builder.<CrabEntity>of(CrabEntity::new, MobCategory.CREATURE).sized(0.4f, 0.3f).build(null)));

    public static RegistryObject<EntityType<SharkEntity>> SHARK_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<SharkEntity>>register("shark", ((Supplier<EntityType<SharkEntity>>)EntityType.Builder.<SharkEntity>of(SharkEntity::new, MobCategory.CREATURE).sized(1.6F, 0.8F).build(null)));



    public static RegistryObject<EntityType<OviraptorEntity>> OVIRAPTOR_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<OviraptorEntity>>register("Oviraptor".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<OviraptorEntity>of(((type, world) -> new OviraptorEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<DeinotheriumEntity>> DEINOTHERIUM_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<DeinotheriumEntity>>register("Deinotherium".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<DeinotheriumEntity>of(((type, world) -> new DeinotheriumEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MicroraptorEntity>> MICRORAPTOR_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MicroraptorEntity>>register("Microraptor".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MicroraptorEntity>of(((type, world) -> new MicroraptorEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MammothEntity>> MAMMOTH_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MammothEntity>>register("Mammoth".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MammothEntity>of(((type, world) -> new MammothEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<DodoEntity>> DODO_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<DodoEntity>>register("Dodo".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<DodoEntity>of(((type, world) -> new DodoEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<ZhenyuanopterusEntity>> ZHENYUANOPTERUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<ZhenyuanopterusEntity>>register("Zhenyuanopterus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<ZhenyuanopterusEntity>of(((type, world) -> new ZhenyuanopterusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<PostosuchusEntity>> POSTOSUCHUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<PostosuchusEntity>>register("Postosuchus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<PostosuchusEntity>of(((type, world) -> new PostosuchusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<IndoraptorEntity>> INDORAPTOR_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<IndoraptorEntity>>register("Indoraptor".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<IndoraptorEntity>of(((type, world) -> new IndoraptorEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<OthnieliaEntity>> OTHNIELIA_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<OthnieliaEntity>>register("Othnielia".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<OthnieliaEntity>of(((type, world) -> new OthnieliaEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<PteranodonEntity>> PTERANODON_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<PteranodonEntity>>register("Pteranodon".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<PteranodonEntity>of(((type, world) -> new PteranodonEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<IndominusEntity>> INDOMINUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<IndominusEntity>>register("Indominus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<IndominusEntity>of(((type, world) -> new IndominusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<AnkylosaurusEntity>> ANKYLOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<AnkylosaurusEntity>>register("Ankylosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<AnkylosaurusEntity>of(((type, world) -> new AnkylosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<ArsinoitheriumEntity>> ARSINOITHERIUM_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<ArsinoitheriumEntity>>register("Arsinoitherium".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<ArsinoitheriumEntity>of(((type, world) -> new ArsinoitheriumEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CrassigyrinusEntity>> CRASSIGYRINUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CrassigyrinusEntity>>register("Crassigyrinus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CrassigyrinusEntity>of(((type, world) -> new CrassigyrinusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<AmmoniteEntity>> AMMONITE_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<AmmoniteEntity>>register("Ammonite".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<AmmoniteEntity>of(((type, world) -> new AmmoniteEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<ProceratosaurusEntity>> PROCERATOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<ProceratosaurusEntity>>register("Proceratosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<ProceratosaurusEntity>of(((type, world) -> new ProceratosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<ApatosaurusEntity>> APATOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<ApatosaurusEntity>>register("Apatosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<ApatosaurusEntity>of(((type, world) -> new ApatosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CarnotaurusEntity>> CARNOTAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CarnotaurusEntity>>register("Carnotaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CarnotaurusEntity>of(((type, world) -> new CarnotaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<DunkleosteusEntity>> DUNKLEOSTEUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<DunkleosteusEntity>>register("Dunkleosteus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<DunkleosteusEntity>of(((type, world) -> new DunkleosteusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<TyrannosaurusEntity>> TYRANNOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<TyrannosaurusEntity>>register("Tyrannosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<TyrannosaurusEntity>of(((type, world) -> new TyrannosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<RaphusrexEntity>> RAPHUSREX_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<RaphusrexEntity>>register("Raphusrex".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<RaphusrexEntity>of(((type, world) -> new RaphusrexEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<ChasmosaurusEntity>> CHASMOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<ChasmosaurusEntity>>register("Chasmosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<ChasmosaurusEntity>of(((type, world) -> new ChasmosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MetriacanthosaurusEntity>> METRIACANTHOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MetriacanthosaurusEntity>>register("Metriacanthosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MetriacanthosaurusEntity>of(((type, world) -> new MetriacanthosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<TroodonEntity>> TROODON_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<TroodonEntity>>register("Troodon".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<TroodonEntity>of(((type, world) -> new TroodonEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<HerrerasaurusEntity>> HERRERASAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<HerrerasaurusEntity>>register("Herrerasaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<HerrerasaurusEntity>of(((type, world) -> new HerrerasaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<BaryonyxEntity>> BARYONYX_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<BaryonyxEntity>>register("Baryonyx".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<BaryonyxEntity>of(((type, world) -> new BaryonyxEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<BeelzebufoEntity>> BEELZEBUFO_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<BeelzebufoEntity>>register("Beelzebufo".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<BeelzebufoEntity>of(((type, world) -> new BeelzebufoEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<VelociraptorBlueEntity>> VELOCIRAPTORBLUE_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<VelociraptorBlueEntity>>register("VelociraptorBlue".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<VelociraptorBlueEntity>of(((type, world) -> new VelociraptorBlueEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<VelociraptorEchoEntity>> VELOCIRAPTORECHO_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<VelociraptorEchoEntity>>register("VelociraptorEcho".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<VelociraptorEchoEntity>of(((type, world) -> new VelociraptorEchoEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<SinoceratopsEntity>> SINOCERATOPS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<SinoceratopsEntity>>register("Sinoceratops".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<SinoceratopsEntity>of(((type, world) -> new SinoceratopsEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<ParasaurolophusEntity>> PARASAUROLOPHUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<ParasaurolophusEntity>>register("Parasaurolophus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<ParasaurolophusEntity>of(((type, world) -> new ParasaurolophusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MamenchisaurusEntity>> MAMENCHISAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MamenchisaurusEntity>>register("Mamenchisaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MamenchisaurusEntity>of(((type, world) -> new MamenchisaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<DimorphodonEntity>> DIMORPHODON_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<DimorphodonEntity>>register("Dimorphodon".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<DimorphodonEntity>of(((type, world) -> new DimorphodonEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<AllosaurusEntity>> ALLOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<AllosaurusEntity>>register("Allosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<AllosaurusEntity>of(((type, world) -> new AllosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MosasaurusEntity>> MOSASAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MosasaurusEntity>>register("Mosasaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MosasaurusEntity>of(((type, world) -> new MosasaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MawsoniaEntity>> MAWSONIA_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MawsoniaEntity>>register("Mawsonia".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MawsoniaEntity>of(((type, world) -> new MawsoniaEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<VelociraptorDeltaEntity>> VELOCIRAPTORDELTA_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<VelociraptorDeltaEntity>>register("VelociraptorDelta".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<VelociraptorDeltaEntity>of(((type, world) -> new VelociraptorDeltaEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<AlvarezsaurusEntity>> ALVAREZSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<AlvarezsaurusEntity>>register("Alvarezsaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<AlvarezsaurusEntity>of(((type, world) -> new AlvarezsaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<RugopsEntity>> RUGOPS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<RugopsEntity>>register("Rugops".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<RugopsEntity>of(((type, world) -> new RugopsEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CearadactylusEntity>> CEARADACTYLUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CearadactylusEntity>>register("Cearadactylus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CearadactylusEntity>of(((type, world) -> new CearadactylusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CorythosaurusEntity>> CORYTHOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CorythosaurusEntity>>register("Corythosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CorythosaurusEntity>of(((type, world) -> new CorythosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CompsognathusEntity>> COMPSOGNATHUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CompsognathusEntity>>register("Compsognathus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CompsognathusEntity>of(((type, world) -> new CompsognathusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<LudodactylusEntity>> LUDODACTYLUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<LudodactylusEntity>>register("Ludodactylus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<LudodactylusEntity>of(((type, world) -> new LudodactylusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<LeaellynasauraEntity>> LEAELLYNASAURA_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<LeaellynasauraEntity>>register("Leaellynasaura".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<LeaellynasauraEntity>of(((type, world) -> new LeaellynasauraEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MoganopterusEntity>> MOGANOPTERUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MoganopterusEntity>>register("Moganopterus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MoganopterusEntity>of(((type, world) -> new MoganopterusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<SuchomimusEntity>> SUCHOMIMUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<SuchomimusEntity>>register("Suchomimus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<SuchomimusEntity>of(((type, world) -> new SuchomimusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MajungasaurusEntity>> MAJUNGASAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MajungasaurusEntity>>register("Majungasaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MajungasaurusEntity>of(((type, world) -> new MajungasaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<ProtoceratopsEntity>> PROTOCERATOPS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<ProtoceratopsEntity>>register("Protoceratops".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<ProtoceratopsEntity>of(((type, world) -> new ProtoceratopsEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<TitanisEntity>> TITANIS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<TitanisEntity>>register("Titanis".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<TitanisEntity>of(((type, world) -> new TitanisEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CoelacanthEntity>> COELACANTH_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CoelacanthEntity>>register("Coelacanth".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CoelacanthEntity>of(((type, world) -> new CoelacanthEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<GallimimusEntity>> GALLIMIMUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<GallimimusEntity>>register("Gallimimus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<GallimimusEntity>of(((type, world) -> new GallimimusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CeratosaurusEntity>> CERATOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CeratosaurusEntity>>register("Ceratosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CeratosaurusEntity>of(((type, world) -> new CeratosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<VelociraptorCharlieEntity>> VELOCIRAPTORCHARLIE_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<VelociraptorCharlieEntity>>register("VelociraptorCharlie".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<VelociraptorCharlieEntity>of(((type, world) -> new VelociraptorCharlieEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<SpinosaurusEntity>> SPINOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<SpinosaurusEntity>>register("Spinosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<SpinosaurusEntity>of(((type, world) -> new SpinosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<PachycephalosaurusEntity>> PACHYCEPHALOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<PachycephalosaurusEntity>>register("Pachycephalosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<PachycephalosaurusEntity>of(((type, world) -> new PachycephalosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<QuetzalEntity>> QUETZAL_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<QuetzalEntity>>register("Quetzal".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<QuetzalEntity>of(((type, world) -> new QuetzalEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CarcharodontosaurusEntity>> CARCHARODONTOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CarcharodontosaurusEntity>>register("Carcharodontosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CarcharodontosaurusEntity>of(((type, world) -> new CarcharodontosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<TylosaurusEntity>> TYLOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<TylosaurusEntity>>register("Tylosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<TylosaurusEntity>of(((type, world) -> new TylosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<OrnithomimusEntity>> ORNITHOMIMUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<OrnithomimusEntity>>register("Ornithomimus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<OrnithomimusEntity>of(((type, world) -> new OrnithomimusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MegapiranhaEntity>> MEGAPIRANHA_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MegapiranhaEntity>>register("Megapiranha".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MegapiranhaEntity>of(((type, world) -> new MegapiranhaEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<DiplodocusEntity>> DIPLODOCUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<DiplodocusEntity>>register("Diplodocus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<DiplodocusEntity>of(((type, world) -> new DiplodocusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<DilophosaurusEntity>> DILOPHOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<DilophosaurusEntity>>register("Dilophosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<DilophosaurusEntity>of(((type, world) -> new DilophosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<StyracosaurusEntity>> STYRACOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<StyracosaurusEntity>>register("Styracosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<StyracosaurusEntity>of(((type, world) -> new StyracosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<GuanlongEntity>> GUANLONG_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<GuanlongEntity>>register("Guanlong".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<GuanlongEntity>of(((type, world) -> new GuanlongEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CamarasaurusEntity>> CAMARASAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CamarasaurusEntity>>register("Camarasaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CamarasaurusEntity>of(((type, world) -> new CamarasaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<HyaenodonEntity>> HYAENODON_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<HyaenodonEntity>>register("Hyaenodon".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<HyaenodonEntity>of(((type, world) -> new HyaenodonEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<CoelurusEntity>> COELURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<CoelurusEntity>>register("Coelurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<CoelurusEntity>of(((type, world) -> new CoelurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<DiplocaulusEntity>> DIPLOCAULUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<DiplocaulusEntity>>register("Diplocaulus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<DiplocaulusEntity>of(((type, world) -> new DiplocaulusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<DreadnoughtusEntity>> DREADNOUGHTUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<DreadnoughtusEntity>>register("Dreadnoughtus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<DreadnoughtusEntity>of(((type, world) -> new DreadnoughtusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<EdmontosaurusEntity>> EDMONTOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<EdmontosaurusEntity>>register("Edmontosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<EdmontosaurusEntity>of(((type, world) -> new EdmontosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<StegosaurusEntity>> STEGOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<StegosaurusEntity>>register("Stegosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<StegosaurusEntity>of(((type, world) -> new StegosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<SpinoraptorEntity>> SPINORAPTOR_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<SpinoraptorEntity>>register("Spinoraptor".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<SpinoraptorEntity>of(((type, world) -> new SpinoraptorEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<AchillobatorEntity>> ACHILLOBATOR_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<AchillobatorEntity>>register("Achillobator".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<AchillobatorEntity>of(((type, world) -> new AchillobatorEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<ChilesaurusEntity>> CHILESAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<ChilesaurusEntity>>register("Chilesaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<ChilesaurusEntity>of(((type, world) -> new ChilesaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MegatheriumEntity>> MEGATHERIUM_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MegatheriumEntity>>register("Megatherium".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MegatheriumEntity>of(((type, world) -> new MegatheriumEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<SegisaurusEntity>> SEGISAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<SegisaurusEntity>>register("Segisaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<SegisaurusEntity>of(((type, world) -> new SegisaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<AnkylodocusEntity>> ANKYLODOCUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<AnkylodocusEntity>>register("Ankylodocus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<AnkylodocusEntity>of(((type, world) -> new AnkylodocusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<BrachiosaurusEntity>> BRACHIOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<BrachiosaurusEntity>>register("Brachiosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<BrachiosaurusEntity>of(((type, world) -> new BrachiosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<SmilodonEntity>> SMILODON_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<SmilodonEntity>>register("Smilodon".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<SmilodonEntity>of(((type, world) -> new SmilodonEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MicroceratusEntity>> MICROCERATUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MicroceratusEntity>>register("Microceratus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MicroceratusEntity>of(((type, world) -> new MicroceratusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<LeptictidiumEntity>> LEPTICTIDIUM_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<LeptictidiumEntity>>register("Leptictidium".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<LeptictidiumEntity>of(((type, world) -> new LeptictidiumEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<HypsilophodonEntity>> HYPSILOPHODON_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<HypsilophodonEntity>>register("Hypsilophodon".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<HypsilophodonEntity>of(((type, world) -> new HypsilophodonEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<TherizinosaurusEntity>> THERIZINOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<TherizinosaurusEntity>>register("Therizinosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<TherizinosaurusEntity>of(((type, world) -> new TherizinosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<VelociraptorEntity>> VELOCIRAPTOR_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<VelociraptorEntity>>register("Velociraptor".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<VelociraptorEntity>of(((type, world) -> new VelociraptorEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<MussaurusEntity>> MUSSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<MussaurusEntity>>register("Mussaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<MussaurusEntity>of(((type, world) -> new MussaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<TriceratopsEntity>> TRICERATOPS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<TriceratopsEntity>>register("Triceratops".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<TriceratopsEntity>of(((type, world) -> new TriceratopsEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<GiganotosaurusEntity>> GIGANOTOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<GiganotosaurusEntity>>register("Giganotosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<GiganotosaurusEntity>of(((type, world) -> new GiganotosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<TropeognathusEntity>> TROPEOGNATHUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<TropeognathusEntity>>register("Tropeognathus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<TropeognathusEntity>of(((type, world) -> new TropeognathusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<LambeosaurusEntity>> LAMBEOSAURUS_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<LambeosaurusEntity>>register("Lambeosaurus".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<LambeosaurusEntity>of(((type, world) -> new LambeosaurusEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<AlligatorGarEntity>> ALLIGATORGAR_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<AlligatorGarEntity>>register("AlligatorGar".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<AlligatorGarEntity>of(((type, world) -> new AlligatorGarEntity(world, type)), MobCategory.CREATURE).build(null));
    public static RegistryObject<EntityType<ElasmotheriumEntity>> ELASMOTHERIUM_ENTITY_TYPE = MOD_ENTITY_TYPES.<EntityType<ElasmotheriumEntity>>register("Elasmotherium".toLowerCase(Locale.ROOT), () -> EntityType.Builder.<ElasmotheriumEntity>of(((type, world) -> new ElasmotheriumEntity(world, type)), MobCategory.CREATURE).build(null));




    public static void init(){
        MOD_ENTITY_TYPES.register(modEventBus);
    }
}
