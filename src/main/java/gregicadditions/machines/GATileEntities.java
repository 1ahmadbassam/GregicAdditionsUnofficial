package gregicadditions.machines;

import gregicadditions.GAConfig;
import gregicadditions.GATextures;
import gregicadditions.GregicAdditions;
import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.GregTechAPI;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.render.Textures;
import gregtech.api.unification.material.Materials;
import gregtech.common.metatileentities.electric.*;
import gregtech.common.metatileentities.storage.MetaTileEntityQuantumChest;
import gregtech.common.metatileentities.storage.MetaTileEntityQuantumTank;
import net.minecraft.util.ResourceLocation;

public class GATileEntities {
    public static SimpleMachineMetaTileEntity[] CIRCUIT_ASSEMBLER = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] CLUSTER_MILL = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] ELECTRIC_FURNACE = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] MACERATOR = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] ALLOY_SMELTER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] ARC_FURNACE = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] ASSEMBLER = new SimpleMachineMetaTileEntity[3];
    public static SimpleMachineMetaTileEntity[] AUTOCLAVE = new SimpleMachineMetaTileEntity[3];
    public static SimpleMachineMetaTileEntity[] BENDER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] BREWERY = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] CANNER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] CENTRIFUGE = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] CHEMICAL_BATH = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] CHEMICAL_REACTOR = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] COMPRESSOR = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] CUTTER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] DISTILLERY = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] ELECTROLYZER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] ELECTROMAGNETIC_SEPARATOR = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] EXTRACTOR = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] EXTRUDER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] FERMENTER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] FLUID_CANNER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] FLUID_EXTRACTOR = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] FLUID_HEATER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] FLUID_SOLIDIFIER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] FORGE_HAMMER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] FORMING_PRESS = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] LATHE = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] MICROWAVE = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] MIXER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] ORE_WASHER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] PACKER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] UNPACKER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] PLASMA_ARC_FURNACE = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] POLARIZER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] LASER_ENGRAVER = new SimpleMachineMetaTileEntity[3];
    public static SimpleMachineMetaTileEntity[] SIFTER = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] THERMAL_CENTRIFUGE = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] WIREMILL = new SimpleMachineMetaTileEntity[4];
    public static SimpleGeneratorMetaTileEntity[] NAQUADAH_REACTOR = new SimpleGeneratorMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] REPLICATOR = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] MASS_FAB = new SimpleMachineMetaTileEntity[8];
    public static TileEntityFusionReactor[] FUSION_REACTOR = new TileEntityFusionReactor[3];


    public static TileEntityAssemblyLine ASSEMBLY_LINE;

    public static TileEntitySteamMixer STEAM_MIXER_BRONZE;
    public static TileEntitySteamMixer STEAM_MIXER_STEEL;

    public static TileEntityCokeOven COKE_OVEN;
    public static TileEntityCokeFluidHatch COKE_FLUID_HATCH;
    public static TileEntityCokeItemBus COKE_ITEM_IN_BUS;
    public static TileEntityCokeItemBus COKE_ITEM_OUT_BUS;

    public static TileEntityDrum WOODEN_DRUM;
    public static TileEntityDrum BRONZE_DRUM;
    public static TileEntityDrum STEEL_DRUM;
    public static TileEntityDrum STAINLESS_STEEL_DRUM;
    public static TileEntityDrum TITANIUM_DRUM;
    public static TileEntityDrum TUNGSTENSTEEL_DRUM;

    public static TileEntityRockBreaker[] ROCK_BREAKER = new TileEntityRockBreaker[8];

    public static MetaTileEntityPump[] PUMP = new MetaTileEntityPump[8];
    public static MetaTileEntityAirCollector[] AIR_COLLECTOR = new MetaTileEntityAirCollector[8];
    public static MetaTileEntityFisher[] FISHER = new MetaTileEntityFisher[8];
    public static MetaTileEntityBlockBreaker[] BLOCK_BREAKER = new MetaTileEntityBlockBreaker[8];
    public static MetaTileEntityQuantumChest[] QUANTUM_CHEST = new MetaTileEntityQuantumChest[8];
    public static MetaTileEntityQuantumTank[] QUANTUM_TANK = new MetaTileEntityQuantumTank[8];
    public static MetaTileEntityItemCollector[] ITEM_COLLECTOR = new MetaTileEntityItemCollector[8];

    public static void init() {
        CIRCUIT_ASSEMBLER[0] = GregTechAPI.registerMetaTileEntity(2000, new SimpleMachineMetaTileEntity(location("circuit_assembler.lv"), GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 1));
        CIRCUIT_ASSEMBLER[1] = GregTechAPI.registerMetaTileEntity(2001, new SimpleMachineMetaTileEntity(location("circuit_assembler.mv"), GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 2));
        CIRCUIT_ASSEMBLER[2] = GregTechAPI.registerMetaTileEntity(2002, new SimpleMachineMetaTileEntity(location("circuit_assembler.hv"), GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 3));
        CIRCUIT_ASSEMBLER[3] = GregTechAPI.registerMetaTileEntity(2003, new SimpleMachineMetaTileEntity(location("circuit_assembler.ev"), GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 4));
        if (GAConfig.GT5U.highTierCircuitAssemblers) {
            CIRCUIT_ASSEMBLER[4] = GregTechAPI.registerMetaTileEntity(2004, new SimpleMachineMetaTileEntity(location("circuit_assembler.iv"), GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 5));
            CIRCUIT_ASSEMBLER[5] = GregTechAPI.registerMetaTileEntity(2005, new SimpleMachineMetaTileEntity(location("circuit_assembler.luv"), GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 6));
            CIRCUIT_ASSEMBLER[6] = GregTechAPI.registerMetaTileEntity(2006, new SimpleMachineMetaTileEntity(location("circuit_assembler.zpm"), GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 7));
            CIRCUIT_ASSEMBLER[7] = GregTechAPI.registerMetaTileEntity(2007, new SimpleMachineMetaTileEntity(location("circuit_assembler.uv"), GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierClusterMills) {
            CLUSTER_MILL[0] = GregTechAPI.registerMetaTileEntity(2008, new SimpleMachineMetaTileEntity(location("cluster_mill.lv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 1));
            CLUSTER_MILL[1] = GregTechAPI.registerMetaTileEntity(2009, new SimpleMachineMetaTileEntity(location("cluster_mill.mv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 2));
            CLUSTER_MILL[2] = GregTechAPI.registerMetaTileEntity(2010, new SimpleMachineMetaTileEntity(location("cluster_mill.hv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 3));
            CLUSTER_MILL[3] = GregTechAPI.registerMetaTileEntity(2011, new SimpleMachineMetaTileEntity(location("cluster_mill.ev"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 4));
            CLUSTER_MILL[4] = GregTechAPI.registerMetaTileEntity(2012, new SimpleMachineMetaTileEntity(location("cluster_mill.iv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 5));
            CLUSTER_MILL[5] = GregTechAPI.registerMetaTileEntity(2013, new SimpleMachineMetaTileEntity(location("cluster_mill.luv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 6));
            CLUSTER_MILL[6] = GregTechAPI.registerMetaTileEntity(2014, new SimpleMachineMetaTileEntity(location("cluster_mill.zpm"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 7));
            CLUSTER_MILL[7] = GregTechAPI.registerMetaTileEntity(2015, new SimpleMachineMetaTileEntity(location("cluster_mill.uv"), GARecipeMaps.CLUSTER_MILL_RECIPES, Textures.WIREMILL_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierElectricFurnace) {
            ELECTRIC_FURNACE[0] = GregTechAPI.registerMetaTileEntity(2016, new SimpleMachineMetaTileEntity(location("electric_furnace.iv"), RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 5));
            ELECTRIC_FURNACE[1] = GregTechAPI.registerMetaTileEntity(2017, new SimpleMachineMetaTileEntity(location("electric_furnace.luv"), RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 6));
            ELECTRIC_FURNACE[2] = GregTechAPI.registerMetaTileEntity(2018, new SimpleMachineMetaTileEntity(location("electric_furnace.zpm"), RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 7));
            ELECTRIC_FURNACE[3] = GregTechAPI.registerMetaTileEntity(2019, new SimpleMachineMetaTileEntity(location("electric_furnace.uv"), RecipeMaps.FURNACE_RECIPES, Textures.FURNACE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierMacerators) {
            MACERATOR[0] = GregTechAPI.registerMetaTileEntity(2020, new SimpleMachineMetaTileEntity(location("macerator.iv"), RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 5));
            MACERATOR[1] = GregTechAPI.registerMetaTileEntity(2021, new SimpleMachineMetaTileEntity(location("macerator.luv"), RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 6));
            MACERATOR[2] = GregTechAPI.registerMetaTileEntity(2022, new SimpleMachineMetaTileEntity(location("macerator.zpm"), RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 7));
            MACERATOR[3] = GregTechAPI.registerMetaTileEntity(2023, new SimpleMachineMetaTileEntity(location("macerator.uv"), RecipeMaps.MACERATOR_RECIPES, Textures.MACERATOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierAlloySmelter) {
            ALLOY_SMELTER[0] = GregTechAPI.registerMetaTileEntity(2024, new SimpleMachineMetaTileEntity(location("alloy_smelter.iv"), RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 5));
            ALLOY_SMELTER[1] = GregTechAPI.registerMetaTileEntity(2025, new SimpleMachineMetaTileEntity(location("alloy_smelter.luv"), RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 6));
            ALLOY_SMELTER[2] = GregTechAPI.registerMetaTileEntity(2026, new SimpleMachineMetaTileEntity(location("alloy_smelter.zpm"), RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 7));
            ALLOY_SMELTER[3] = GregTechAPI.registerMetaTileEntity(2027, new SimpleMachineMetaTileEntity(location("alloy_smelter.uv"), RecipeMaps.ALLOY_SMELTER_RECIPES, Textures.ALLOY_SMELTER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierArcFurnaces) {
            ARC_FURNACE[0] = GregTechAPI.registerMetaTileEntity(2032, new SimpleMachineMetaTileEntity(location("arc_furnace.iv"), RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 5));
            ARC_FURNACE[1] = GregTechAPI.registerMetaTileEntity(2033, new SimpleMachineMetaTileEntity(location("arc_furnace.luv"), RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 6));
            ARC_FURNACE[2] = GregTechAPI.registerMetaTileEntity(2034, new SimpleMachineMetaTileEntity(location("arc_furnace.zpm"), RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 7));
            ARC_FURNACE[3] = GregTechAPI.registerMetaTileEntity(2035, new SimpleMachineMetaTileEntity(location("arc_furnace.uv"), RecipeMaps.ARC_FURNACE_RECIPES, Textures.ARC_FURNACE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierAssemblers) {
            ASSEMBLER[0] = GregTechAPI.registerMetaTileEntity(2037, new SimpleMachineMetaTileEntity(location("assembler.luv"), RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 6));
            ASSEMBLER[1] = GregTechAPI.registerMetaTileEntity(2038, new SimpleMachineMetaTileEntity(location("assembler.zpm"), RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 7));
            ASSEMBLER[2] = GregTechAPI.registerMetaTileEntity(2039, new SimpleMachineMetaTileEntity(location("assembler.uv"), RecipeMaps.ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierAutoclaves) {
            AUTOCLAVE[0] = GregTechAPI.registerMetaTileEntity(2041, new SimpleMachineMetaTileEntity(location("autoclave.luv"), RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 6));
            AUTOCLAVE[1] = GregTechAPI.registerMetaTileEntity(2042, new SimpleMachineMetaTileEntity(location("autoclave.zpm"), RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 7));
            AUTOCLAVE[2] = GregTechAPI.registerMetaTileEntity(2043, new SimpleMachineMetaTileEntity(location("autoclave.uv"), RecipeMaps.AUTOCLAVE_RECIPES, Textures.AUTOCLAVE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierBenders) {
            BENDER[0] = GregTechAPI.registerMetaTileEntity(2044, new SimpleMachineMetaTileEntity(location("bender.iv"), RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 5));
            BENDER[1] = GregTechAPI.registerMetaTileEntity(2045, new SimpleMachineMetaTileEntity(location("bender.luv"), RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 6));
            BENDER[2] = GregTechAPI.registerMetaTileEntity(2046, new SimpleMachineMetaTileEntity(location("bender.zpm"), RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 7));
            BENDER[3] = GregTechAPI.registerMetaTileEntity(2047, new SimpleMachineMetaTileEntity(location("bender.uv"), RecipeMaps.BENDER_RECIPES, Textures.BENDER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierBreweries) {
            BREWERY[0] = GregTechAPI.registerMetaTileEntity(2048, new SimpleMachineMetaTileEntity(location("brewery.iv"), RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 5));
            BREWERY[1] = GregTechAPI.registerMetaTileEntity(2049, new SimpleMachineMetaTileEntity(location("brewery.luv"), RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 6));
            BREWERY[2] = GregTechAPI.registerMetaTileEntity(2050, new SimpleMachineMetaTileEntity(location("brewery.zpm"), RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 7));
            BREWERY[3] = GregTechAPI.registerMetaTileEntity(2051, new SimpleMachineMetaTileEntity(location("brewery.uv"), RecipeMaps.BREWING_RECIPES, Textures.BREWERY_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierCanners) {
            CANNER[0] = GregTechAPI.registerMetaTileEntity(2052, new SimpleMachineMetaTileEntity(location("canner.iv"), RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 5));
            CANNER[1] = GregTechAPI.registerMetaTileEntity(2053, new SimpleMachineMetaTileEntity(location("canner.luv"), RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 6));
            CANNER[2] = GregTechAPI.registerMetaTileEntity(2054, new SimpleMachineMetaTileEntity(location("canner.zpm"), RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 7));
            CANNER[3] = GregTechAPI.registerMetaTileEntity(2055, new SimpleMachineMetaTileEntity(location("canner.uv"), RecipeMaps.CANNER_RECIPES, Textures.CANNER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierCentrifuges) {
            CENTRIFUGE[0] = GregTechAPI.registerMetaTileEntity(2056, new SimpleMachineMetaTileEntity(location("centrifuge.iv"), RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 5));
            CENTRIFUGE[1] = GregTechAPI.registerMetaTileEntity(2057, new SimpleMachineMetaTileEntity(location("centrifuge.luv"), RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 6));
            CENTRIFUGE[2] = GregTechAPI.registerMetaTileEntity(2058, new SimpleMachineMetaTileEntity(location("centrifuge.zpm"), RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 7));
            CENTRIFUGE[3] = GregTechAPI.registerMetaTileEntity(2059, new SimpleMachineMetaTileEntity(location("centrifuge.uv"), RecipeMaps.CENTRIFUGE_RECIPES, Textures.CENTRIFUGE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierChemicalBaths) {
            CHEMICAL_BATH[0] = GregTechAPI.registerMetaTileEntity(2060, new SimpleMachineMetaTileEntity(location("chemical_bath.iv"), RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 5));
            CHEMICAL_BATH[1] = GregTechAPI.registerMetaTileEntity(2061, new SimpleMachineMetaTileEntity(location("chemical_bath.luv"), RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 6));
            CHEMICAL_BATH[2] = GregTechAPI.registerMetaTileEntity(2062, new SimpleMachineMetaTileEntity(location("chemical_bath.zpm"), RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 7));
            CHEMICAL_BATH[3] = GregTechAPI.registerMetaTileEntity(2063, new SimpleMachineMetaTileEntity(location("chemical_bath.uv"), RecipeMaps.CHEMICAL_BATH_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierChemicalReactors) {
            CHEMICAL_REACTOR[0] = GregTechAPI.registerMetaTileEntity(2064, new SimpleMachineMetaTileEntity(location("chemical_reactor.iv"), RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 5));
            CHEMICAL_REACTOR[1] = GregTechAPI.registerMetaTileEntity(2065, new SimpleMachineMetaTileEntity(location("chemical_reactor.luv"), RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 6));
            CHEMICAL_REACTOR[2] = GregTechAPI.registerMetaTileEntity(2066, new SimpleMachineMetaTileEntity(location("chemical_reactor.zpm"), RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 7));
            CHEMICAL_REACTOR[3] = GregTechAPI.registerMetaTileEntity(2067, new SimpleMachineMetaTileEntity(location("chemical_reactor.uv"), RecipeMaps.CHEMICAL_RECIPES, Textures.CHEMICAL_REACTOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierCompressors) {
            COMPRESSOR[0] = GregTechAPI.registerMetaTileEntity(2068, new SimpleMachineMetaTileEntity(location("compressor.iv"), RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 5));
            COMPRESSOR[1] = GregTechAPI.registerMetaTileEntity(2069, new SimpleMachineMetaTileEntity(location("compressor.luv"), RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 6));
            COMPRESSOR[2] = GregTechAPI.registerMetaTileEntity(2070, new SimpleMachineMetaTileEntity(location("compressor.zpm"), RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 7));
            COMPRESSOR[3] = GregTechAPI.registerMetaTileEntity(2071, new SimpleMachineMetaTileEntity(location("compressor.uv"), RecipeMaps.COMPRESSOR_RECIPES, Textures.COMPRESSOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierCutters) {
            CUTTER[0] = GregTechAPI.registerMetaTileEntity(2072, new SimpleMachineMetaTileEntity(location("cutter.iv"), RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 5));
            CUTTER[1] = GregTechAPI.registerMetaTileEntity(2073, new SimpleMachineMetaTileEntity(location("cutter.luv"), RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 6));
            CUTTER[2] = GregTechAPI.registerMetaTileEntity(2074, new SimpleMachineMetaTileEntity(location("cutter.zpm"), RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 7));
            CUTTER[3] = GregTechAPI.registerMetaTileEntity(2075, new SimpleMachineMetaTileEntity(location("cutter.uv"), RecipeMaps.CUTTER_RECIPES, Textures.CUTTER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierDistilleries) {
            DISTILLERY[0] = GregTechAPI.registerMetaTileEntity(2076, new SimpleMachineMetaTileEntity(location("distillery.iv"), RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 5));
            DISTILLERY[1] = GregTechAPI.registerMetaTileEntity(2077, new SimpleMachineMetaTileEntity(location("distillery.luv"), RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 6));
            DISTILLERY[2] = GregTechAPI.registerMetaTileEntity(2078, new SimpleMachineMetaTileEntity(location("distillery.zpm"), RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 7));
            DISTILLERY[3] = GregTechAPI.registerMetaTileEntity(2079, new SimpleMachineMetaTileEntity(location("distillery.uv"), RecipeMaps.DISTILLERY_RECIPES, Textures.DISTILLERY_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierElectrolyzers) {
            ELECTROLYZER[0] = GregTechAPI.registerMetaTileEntity(2080, new SimpleMachineMetaTileEntity(location("electrolyzer.iv"), RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 5));
            ELECTROLYZER[1] = GregTechAPI.registerMetaTileEntity(2081, new SimpleMachineMetaTileEntity(location("electrolyzer.luv"), RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 6));
            ELECTROLYZER[2] = GregTechAPI.registerMetaTileEntity(2082, new SimpleMachineMetaTileEntity(location("electrolyzer.zpm"), RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 7));
            ELECTROLYZER[3] = GregTechAPI.registerMetaTileEntity(2083, new SimpleMachineMetaTileEntity(location("electrolyzer.uv"), RecipeMaps.ELECTROLYZER_RECIPES, Textures.ELECTROLYZER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierElectromagneticSeparators) {
            ELECTROMAGNETIC_SEPARATOR[0] = GregTechAPI.registerMetaTileEntity(2084, new SimpleMachineMetaTileEntity(location("electromagnetic_separator.iv"), RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 5));
            ELECTROMAGNETIC_SEPARATOR[1] = GregTechAPI.registerMetaTileEntity(2085, new SimpleMachineMetaTileEntity(location("electromagnetic_separator.luv"), RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 6));
            ELECTROMAGNETIC_SEPARATOR[2] = GregTechAPI.registerMetaTileEntity(2086, new SimpleMachineMetaTileEntity(location("electromagnetic_separator.zpm"), RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 7));
            ELECTROMAGNETIC_SEPARATOR[3] = GregTechAPI.registerMetaTileEntity(2087, new SimpleMachineMetaTileEntity(location("electromagnetic_separator.uv"), RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES, Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierExtractors) {
            EXTRACTOR[0] = GregTechAPI.registerMetaTileEntity(2088, new SimpleMachineMetaTileEntity(location("extractor.iv"), RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 5));
            EXTRACTOR[1] = GregTechAPI.registerMetaTileEntity(2089, new SimpleMachineMetaTileEntity(location("extractor.luv"), RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 6));
            EXTRACTOR[2] = GregTechAPI.registerMetaTileEntity(2090, new SimpleMachineMetaTileEntity(location("extractor.zpm"), RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 7));
            EXTRACTOR[3] = GregTechAPI.registerMetaTileEntity(2091, new SimpleMachineMetaTileEntity(location("extractor.uv"), RecipeMaps.EXTRACTOR_RECIPES, Textures.EXTRACTOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierExtruders) {
            EXTRUDER[0] = GregTechAPI.registerMetaTileEntity(2092, new SimpleMachineMetaTileEntity(location("extruder.iv"), RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 5));
            EXTRUDER[1] = GregTechAPI.registerMetaTileEntity(2093, new SimpleMachineMetaTileEntity(location("extruder.luv"), RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 6));
            EXTRUDER[2] = GregTechAPI.registerMetaTileEntity(2094, new SimpleMachineMetaTileEntity(location("extruder.zpm"), RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 7));
            EXTRUDER[3] = GregTechAPI.registerMetaTileEntity(2095, new SimpleMachineMetaTileEntity(location("extruder.uv"), RecipeMaps.EXTRUDER_RECIPES, Textures.EXTRUDER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFermenters) {
            FERMENTER[0] = GregTechAPI.registerMetaTileEntity(2096, new SimpleMachineMetaTileEntity(location("fermenter.iv"), RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 5));
            FERMENTER[1] = GregTechAPI.registerMetaTileEntity(2097, new SimpleMachineMetaTileEntity(location("fermenter.luv"), RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 6));
            FERMENTER[2] = GregTechAPI.registerMetaTileEntity(2098, new SimpleMachineMetaTileEntity(location("fermenter.zpm"), RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 7));
            FERMENTER[3] = GregTechAPI.registerMetaTileEntity(2099, new SimpleMachineMetaTileEntity(location("fermenter.uv"), RecipeMaps.FERMENTING_RECIPES, Textures.FERMENTER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFluidCanners) {
            FLUID_CANNER[0] = GregTechAPI.registerMetaTileEntity(2100, new SimpleMachineMetaTileEntity(location("fluid_canner.iv"), RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 5));
            FLUID_CANNER[1] = GregTechAPI.registerMetaTileEntity(2101, new SimpleMachineMetaTileEntity(location("fluid_canner.luv"), RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 6));
            FLUID_CANNER[2] = GregTechAPI.registerMetaTileEntity(2102, new SimpleMachineMetaTileEntity(location("fluid_canner.zpm"), RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 7));
            FLUID_CANNER[3] = GregTechAPI.registerMetaTileEntity(2103, new SimpleMachineMetaTileEntity(location("fluid_canner.uv"), RecipeMaps.FLUID_CANNER_RECIPES, Textures.FLUID_CANNER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFluidExtractors) {
            FLUID_EXTRACTOR[0] = GregTechAPI.registerMetaTileEntity(2104, new SimpleMachineMetaTileEntity(location("fluid_extractor.iv"), RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 5));
            FLUID_EXTRACTOR[1] = GregTechAPI.registerMetaTileEntity(2105, new SimpleMachineMetaTileEntity(location("fluid_extractor.luv"), RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 6));
            FLUID_EXTRACTOR[2] = GregTechAPI.registerMetaTileEntity(2106, new SimpleMachineMetaTileEntity(location("fluid_extractor.zpm"), RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 7));
            FLUID_EXTRACTOR[3] = GregTechAPI.registerMetaTileEntity(2107, new SimpleMachineMetaTileEntity(location("fluid_extractor.uv"), RecipeMaps.FLUID_EXTRACTION_RECIPES, Textures.FLUID_EXTRACTOR_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFluidHeaters) {
            FLUID_HEATER[0] = GregTechAPI.registerMetaTileEntity(2108, new SimpleMachineMetaTileEntity(location("fluid_heater.iv"), RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 5));
            FLUID_HEATER[1] = GregTechAPI.registerMetaTileEntity(2109, new SimpleMachineMetaTileEntity(location("fluid_heater.luv"), RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 6));
            FLUID_HEATER[2] = GregTechAPI.registerMetaTileEntity(2110, new SimpleMachineMetaTileEntity(location("fluid_heater.zpm"), RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 7));
            FLUID_HEATER[3] = GregTechAPI.registerMetaTileEntity(2111, new SimpleMachineMetaTileEntity(location("fluid_heater.uv"), RecipeMaps.FLUID_HEATER_RECIPES, Textures.FLUID_HEATER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFluidSolidifiers) {
            FLUID_SOLIDIFIER[0] = GregTechAPI.registerMetaTileEntity(2112, new SimpleMachineMetaTileEntity(location("fluid_solidifier.iv"), RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 5));
            FLUID_SOLIDIFIER[1] = GregTechAPI.registerMetaTileEntity(2113, new SimpleMachineMetaTileEntity(location("fluid_solidifier.luv"), RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 6));
            FLUID_SOLIDIFIER[2] = GregTechAPI.registerMetaTileEntity(2114, new SimpleMachineMetaTileEntity(location("fluid_solidifier.zpm"), RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 7));
            FLUID_SOLIDIFIER[3] = GregTechAPI.registerMetaTileEntity(2115, new SimpleMachineMetaTileEntity(location("fluid_solidifier.uv"), RecipeMaps.FLUID_SOLIDFICATION_RECIPES, Textures.FLUID_SOLIDIFIER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierForgeHammers) {
            FORGE_HAMMER[0] = GregTechAPI.registerMetaTileEntity(2116, new SimpleMachineMetaTileEntity(location("forge_hammer.iv"), RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 5));
            FORGE_HAMMER[1] = GregTechAPI.registerMetaTileEntity(2117, new SimpleMachineMetaTileEntity(location("forge_hammer.luv"), RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 6));
            FORGE_HAMMER[2] = GregTechAPI.registerMetaTileEntity(2118, new SimpleMachineMetaTileEntity(location("forge_hammer.zpm"), RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 7));
            FORGE_HAMMER[3] = GregTechAPI.registerMetaTileEntity(2119, new SimpleMachineMetaTileEntity(location("forge_hammer.uv"), RecipeMaps.FORGE_HAMMER_RECIPES, Textures.FORGE_HAMMER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFormingPresses) {
            FORMING_PRESS[0] = GregTechAPI.registerMetaTileEntity(2120, new SimpleMachineMetaTileEntity(location("forming_press.iv"), RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 5));
            FORMING_PRESS[1] = GregTechAPI.registerMetaTileEntity(2121, new SimpleMachineMetaTileEntity(location("forming_press.luv"), RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 6));
            FORMING_PRESS[2] = GregTechAPI.registerMetaTileEntity(2122, new SimpleMachineMetaTileEntity(location("forming_press.zpm"), RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 7));
            FORMING_PRESS[3] = GregTechAPI.registerMetaTileEntity(2123, new SimpleMachineMetaTileEntity(location("forming_press.uv"), RecipeMaps.FORMING_PRESS_RECIPES, Textures.FORMING_PRESS_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierLathes) {
            LATHE[0] = GregTechAPI.registerMetaTileEntity(2124, new SimpleMachineMetaTileEntity(location("lathe.iv"), RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 5));
            LATHE[1] = GregTechAPI.registerMetaTileEntity(2125, new SimpleMachineMetaTileEntity(location("lathe.luv"), RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 6));
            LATHE[2] = GregTechAPI.registerMetaTileEntity(2126, new SimpleMachineMetaTileEntity(location("lathe.zpm"), RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 7));
            LATHE[3] = GregTechAPI.registerMetaTileEntity(2127, new SimpleMachineMetaTileEntity(location("lathe.uv"), RecipeMaps.LATHE_RECIPES, Textures.LATHE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierMicrowaves) {
            MICROWAVE[0] = GregTechAPI.registerMetaTileEntity(2128, new SimpleMachineMetaTileEntity(location("microwave.iv"), RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 5));
            MICROWAVE[1] = GregTechAPI.registerMetaTileEntity(2129, new SimpleMachineMetaTileEntity(location("microwave.luv"), RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 6));
            MICROWAVE[2] = GregTechAPI.registerMetaTileEntity(2130, new SimpleMachineMetaTileEntity(location("microwave.zpm"), RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 7));
            MICROWAVE[3] = GregTechAPI.registerMetaTileEntity(2131, new SimpleMachineMetaTileEntity(location("microwave.uv"), RecipeMaps.MICROWAVE_RECIPES, Textures.MICROWAVE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierMixers) {
            MIXER[0] = GregTechAPI.registerMetaTileEntity(2132, new SimpleMachineMetaTileEntity(location("mixer.iv"), RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 5));
            MIXER[1] = GregTechAPI.registerMetaTileEntity(2133, new SimpleMachineMetaTileEntity(location("mixer.luv"), RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 6));
            MIXER[2] = GregTechAPI.registerMetaTileEntity(2134, new SimpleMachineMetaTileEntity(location("mixer.zpm"), RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 7));
            MIXER[3] = GregTechAPI.registerMetaTileEntity(2135, new SimpleMachineMetaTileEntity(location("mixer.uv"), RecipeMaps.MIXER_RECIPES, Textures.MIXER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierOreWashers) {
            ORE_WASHER[0] = GregTechAPI.registerMetaTileEntity(2136, new SimpleMachineMetaTileEntity(location("ore_washer.iv"), RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 5));
            ORE_WASHER[1] = GregTechAPI.registerMetaTileEntity(2137, new SimpleMachineMetaTileEntity(location("ore_washer.luv"), RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 6));
            ORE_WASHER[2] = GregTechAPI.registerMetaTileEntity(2138, new SimpleMachineMetaTileEntity(location("ore_washer.zpm"), RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 7));
            ORE_WASHER[3] = GregTechAPI.registerMetaTileEntity(2139, new SimpleMachineMetaTileEntity(location("ore_washer.uv"), RecipeMaps.ORE_WASHER_RECIPES, Textures.ORE_WASHER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierPackers) {
            PACKER[0] = GregTechAPI.registerMetaTileEntity(2140, new SimpleMachineMetaTileEntity(location("packer.iv"), RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 5));
            PACKER[1] = GregTechAPI.registerMetaTileEntity(2141, new SimpleMachineMetaTileEntity(location("packer.luv"), RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 6));
            PACKER[2] = GregTechAPI.registerMetaTileEntity(2142, new SimpleMachineMetaTileEntity(location("packer.zpm"), RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 7));
            PACKER[3] = GregTechAPI.registerMetaTileEntity(2143, new SimpleMachineMetaTileEntity(location("packer.uv"), RecipeMaps.PACKER_RECIPES, Textures.PACKER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierUnpackers) {
            UNPACKER[0] = GregTechAPI.registerMetaTileEntity(2144, new SimpleMachineMetaTileEntity(location("unpacker.iv"), RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 5));
            UNPACKER[1] = GregTechAPI.registerMetaTileEntity(2145, new SimpleMachineMetaTileEntity(location("unpacker.luv"), RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 6));
            UNPACKER[2] = GregTechAPI.registerMetaTileEntity(2146, new SimpleMachineMetaTileEntity(location("unpacker.zpm"), RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 7));
            UNPACKER[3] = GregTechAPI.registerMetaTileEntity(2147, new SimpleMachineMetaTileEntity(location("unpacker.uv"), RecipeMaps.UNPACKER_RECIPES, Textures.UNPACKER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierPlasmaArcFurnaces) {
            PLASMA_ARC_FURNACE[0] = GregTechAPI.registerMetaTileEntity(2148, new SimpleMachineMetaTileEntity(location("plasma_arc_furnace.iv"), RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 5));
            PLASMA_ARC_FURNACE[1] = GregTechAPI.registerMetaTileEntity(2149, new SimpleMachineMetaTileEntity(location("plasma_arc_furnace.luv"), RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 6));
            PLASMA_ARC_FURNACE[2] = GregTechAPI.registerMetaTileEntity(2150, new SimpleMachineMetaTileEntity(location("plasma_arc_furnace.zpm"), RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 7));
            PLASMA_ARC_FURNACE[3] = GregTechAPI.registerMetaTileEntity(2151, new SimpleMachineMetaTileEntity(location("plasma_arc_furnace.uv"), RecipeMaps.PLASMA_ARC_FURNACE_RECIPES, Textures.PLASMA_ARC_FURNACE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierPolarizers) {
            POLARIZER[0] = GregTechAPI.registerMetaTileEntity(2152, new SimpleMachineMetaTileEntity(location("polarizer.iv"), RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 5));
            POLARIZER[1] = GregTechAPI.registerMetaTileEntity(2153, new SimpleMachineMetaTileEntity(location("polarizer.luv"), RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 6));
            POLARIZER[2] = GregTechAPI.registerMetaTileEntity(2154, new SimpleMachineMetaTileEntity(location("polarizer.zpm"), RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 7));
            POLARIZER[3] = GregTechAPI.registerMetaTileEntity(2155, new SimpleMachineMetaTileEntity(location("polarizer.uv"), RecipeMaps.POLARIZER_RECIPES, Textures.POLARIZER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierLaserEngravers) {
            LASER_ENGRAVER[0] = GregTechAPI.registerMetaTileEntity(2157, new SimpleMachineMetaTileEntity(location("laser_engraver.luv"), RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 6));
            LASER_ENGRAVER[1] = GregTechAPI.registerMetaTileEntity(2158, new SimpleMachineMetaTileEntity(location("laser_engraver.zpm"), RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 7));
            LASER_ENGRAVER[2] = GregTechAPI.registerMetaTileEntity(2159, new SimpleMachineMetaTileEntity(location("laser_engraver.uv"), RecipeMaps.LASER_ENGRAVER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierSifters) {
            SIFTER[0] = GregTechAPI.registerMetaTileEntity(2160, new SimpleMachineMetaTileEntity(location("sifter.iv"), RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 5));
            SIFTER[1] = GregTechAPI.registerMetaTileEntity(2161, new SimpleMachineMetaTileEntity(location("sifter.luv"), RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 6));
            SIFTER[2] = GregTechAPI.registerMetaTileEntity(2162, new SimpleMachineMetaTileEntity(location("sifter.zpm"), RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 7));
            SIFTER[3] = GregTechAPI.registerMetaTileEntity(2163, new SimpleMachineMetaTileEntity(location("sifter.uv"), RecipeMaps.SIFTER_RECIPES, Textures.SIFTER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierThermalCentrifuges) {
            THERMAL_CENTRIFUGE[0] = GregTechAPI.registerMetaTileEntity(2164, new SimpleMachineMetaTileEntity(location("thermal_centrifuge.iv"), RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 5));
            THERMAL_CENTRIFUGE[1] = GregTechAPI.registerMetaTileEntity(2165, new SimpleMachineMetaTileEntity(location("thermal_centrifuge.luv"), RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 6));
            THERMAL_CENTRIFUGE[2] = GregTechAPI.registerMetaTileEntity(2166, new SimpleMachineMetaTileEntity(location("thermal_centrifuge.zpm"), RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 7));
            THERMAL_CENTRIFUGE[3] = GregTechAPI.registerMetaTileEntity(2167, new SimpleMachineMetaTileEntity(location("thermal_centrifuge.uv"), RecipeMaps.THERMAL_CENTRIFUGE_RECIPES, Textures.THERMAL_CENTRIFUGE_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierWiremills) {
            WIREMILL[0] = GregTechAPI.registerMetaTileEntity(2168, new SimpleMachineMetaTileEntity(location("wiremill.iv"), RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 5));
            WIREMILL[1] = GregTechAPI.registerMetaTileEntity(2169, new SimpleMachineMetaTileEntity(location("wiremill.luv"), RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 6));
            WIREMILL[2] = GregTechAPI.registerMetaTileEntity(2170, new SimpleMachineMetaTileEntity(location("wiremill.zpm"), RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 7));
            WIREMILL[3] = GregTechAPI.registerMetaTileEntity(2171, new SimpleMachineMetaTileEntity(location("wiremill.uv"), RecipeMaps.WIREMILL_RECIPES, Textures.WIREMILL_OVERLAY, 8));
        }

        NAQUADAH_REACTOR[0] = GregTechAPI.registerMetaTileEntity(2172, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk1"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, GATextures.NAQUADAH_OVERLAY, 4));
        NAQUADAH_REACTOR[1] = GregTechAPI.registerMetaTileEntity(2173, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk2"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, GATextures.NAQUADAH_OVERLAY, 5));
        NAQUADAH_REACTOR[2] = GregTechAPI.registerMetaTileEntity(2174, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk3"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, GATextures.NAQUADAH_OVERLAY, 6));
        NAQUADAH_REACTOR[3] = GregTechAPI.registerMetaTileEntity(2191, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk4"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, GATextures.NAQUADAH_OVERLAY, 7));

        MASS_FAB[0] = GregTechAPI.registerMetaTileEntity(2175, new SimpleMachineMetaTileEntity(location("mass_fab.lv"), GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 1));
        MASS_FAB[1] = GregTechAPI.registerMetaTileEntity(2176, new SimpleMachineMetaTileEntity(location("mass_fab.mv"), GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 2));
        MASS_FAB[2] = GregTechAPI.registerMetaTileEntity(2177, new SimpleMachineMetaTileEntity(location("mass_fab.hv"), GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 3));
        MASS_FAB[3] = GregTechAPI.registerMetaTileEntity(2178, new SimpleMachineMetaTileEntity(location("mass_fab.ev"), GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 4));
        if (GAConfig.GT5U.highTierMassFabricators) {
            MASS_FAB[4] = GregTechAPI.registerMetaTileEntity(2179, new SimpleMachineMetaTileEntity(location("mass_fab.iv"), GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 5));
            MASS_FAB[5] = GregTechAPI.registerMetaTileEntity(2180, new SimpleMachineMetaTileEntity(location("mass_fab.luv"), GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 6));
            MASS_FAB[6] = GregTechAPI.registerMetaTileEntity(2181, new SimpleMachineMetaTileEntity(location("mass_fab.zpm"), GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 7));
            MASS_FAB[7] = GregTechAPI.registerMetaTileEntity(2182, new SimpleMachineMetaTileEntity(location("mass_fab.uv"), GARecipeMaps.MASS_FAB_RECIPES, GATextures.MASS_FAB_OVERLAY, 8));
        }

        REPLICATOR[0] = GregTechAPI.registerMetaTileEntity(2183, new SimpleMachineMetaTileEntity(location("replicator.lv"), GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 1));
        REPLICATOR[1] = GregTechAPI.registerMetaTileEntity(2184, new SimpleMachineMetaTileEntity(location("replicator.mv"), GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 2));
        REPLICATOR[2] = GregTechAPI.registerMetaTileEntity(2185, new SimpleMachineMetaTileEntity(location("replicator.hv"), GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 3));
        REPLICATOR[3] = GregTechAPI.registerMetaTileEntity(2186, new SimpleMachineMetaTileEntity(location("replicator.ev"), GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 4));
        if (GAConfig.GT5U.highTierReplicators) {
            REPLICATOR[4] = GregTechAPI.registerMetaTileEntity(2187, new SimpleMachineMetaTileEntity(location("replicator.iv"), GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 5));
            REPLICATOR[5] = GregTechAPI.registerMetaTileEntity(2188, new SimpleMachineMetaTileEntity(location("replicator.luv"), GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 6));
            REPLICATOR[6] = GregTechAPI.registerMetaTileEntity(2189, new SimpleMachineMetaTileEntity(location("replicator.zpm"), GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 7));
            REPLICATOR[7] = GregTechAPI.registerMetaTileEntity(2190, new SimpleMachineMetaTileEntity(location("replicator.uv"), GARecipeMaps.REPLICATOR_RECIPES, GATextures.REPLICATOR_OVERLAY, 8));
        }
        if (GAConfig.Misc.cokeOvenEnable)
            COKE_OVEN = GregTechAPI.registerMetaTileEntity(2500, new TileEntityCokeOven(location("ga_coke_oven")));

        ASSEMBLY_LINE = GregTechAPI.registerMetaTileEntity(2502, new TileEntityAssemblyLine(location("assembly_line")));

        FUSION_REACTOR[0] = GregTechAPI.registerMetaTileEntity(2504, new TileEntityFusionReactor(location("fusion_reactor.luv"), 6));
        FUSION_REACTOR[1] = GregTechAPI.registerMetaTileEntity(2505, new TileEntityFusionReactor(location("fusion_reactor.zpm"), 7));
        FUSION_REACTOR[2] = GregTechAPI.registerMetaTileEntity(2506, new TileEntityFusionReactor(location("fusion_reactor.uv"), 8));

        if (GAConfig.Misc.cokeOvenEnable) {
            COKE_FLUID_HATCH = GregTechAPI.registerMetaTileEntity(2507, new TileEntityCokeFluidHatch(location("ga_coke_fluid_hatch")));
            if (GAConfig.Misc.cokeOvenInputBusEnable)
                COKE_ITEM_IN_BUS = GregTechAPI.registerMetaTileEntity(2509, new TileEntityCokeItemBus(location("ga_coke_item_in_bus"), false));
            COKE_ITEM_OUT_BUS = GregTechAPI.registerMetaTileEntity(2508, new TileEntityCokeItemBus(location("ga_coke_item_out_bus"), true));
        }
        STEAM_MIXER_BRONZE = GregTechAPI.registerMetaTileEntity(2221, new TileEntitySteamMixer(location("steam_mixer_bronze"), false));
        STEAM_MIXER_STEEL = GregTechAPI.registerMetaTileEntity(2222, new TileEntitySteamMixer(location("steam_mixer_steel"), true));

        if (GAConfig.GT6.registerDrums) {
            WOODEN_DRUM = GregTechAPI.registerMetaTileEntity(2195, new TileEntityDrum(location("drum.wood"), Materials.Wood, 16000));
            BRONZE_DRUM = GregTechAPI.registerMetaTileEntity(2196, new TileEntityDrum(location("drum.bronze"), Materials.Bronze, 32000));
            STEEL_DRUM = GregTechAPI.registerMetaTileEntity(2197, new TileEntityDrum(location("drum.steel"), Materials.Steel, 64000));
            STAINLESS_STEEL_DRUM = GregTechAPI.registerMetaTileEntity(2198, new TileEntityDrum(location("drum.stainless_steel"), Materials.StainlessSteel, 128000));
            TITANIUM_DRUM = GregTechAPI.registerMetaTileEntity(2199, new TileEntityDrum(location("drum.titanium"), Materials.Titanium, 192000));
            TUNGSTENSTEEL_DRUM = GregTechAPI.registerMetaTileEntity(2200, new TileEntityDrum(location("drum.tungstensteel"), Materials.TungstenSteel, 256000));
        }

        if (GAConfig.GT5U.highTierPumps) {
            PUMP[0] = GregTechAPI.registerMetaTileEntity(2201, new MetaTileEntityPump(location("pump.iv"), 5));
            PUMP[1] = GregTechAPI.registerMetaTileEntity(2202, new MetaTileEntityPump(location("pump.luv"), 6));
            PUMP[2] = GregTechAPI.registerMetaTileEntity(2203, new MetaTileEntityPump(location("pump.zpm"), 7));
            PUMP[3] = GregTechAPI.registerMetaTileEntity(2204, new MetaTileEntityPump(location("pump.uv"), 8));
        }

        if (GAConfig.Misc.highTierCollector) {
            AIR_COLLECTOR[0] = GregTechAPI.registerMetaTileEntity(2205, new MetaTileEntityAirCollector(location("air_collector.iv"), 5));
            AIR_COLLECTOR[1] = GregTechAPI.registerMetaTileEntity(2206, new MetaTileEntityAirCollector(location("air_collector.luv"), 6));
        }

        ROCK_BREAKER[0] = GregTechAPI.registerMetaTileEntity(2213, new TileEntityRockBreaker(location("rock_breaker.lv"), GATextures.BREAKER_OVERLAY, 1));
        ROCK_BREAKER[1] = GregTechAPI.registerMetaTileEntity(2214, new TileEntityRockBreaker(location("rock_breaker.mv"), GATextures.BREAKER_OVERLAY, 2));
        ROCK_BREAKER[2] = GregTechAPI.registerMetaTileEntity(2215, new TileEntityRockBreaker(location("rock_breaker.hv"), GATextures.BREAKER_OVERLAY, 3));
        ROCK_BREAKER[3] = GregTechAPI.registerMetaTileEntity(2216, new TileEntityRockBreaker(location("rock_breaker.ev"), GATextures.BREAKER_OVERLAY, 4));
        if (GAConfig.GT5U.highTierRockBreakers) {
            ROCK_BREAKER[4] = GregTechAPI.registerMetaTileEntity(2217, new TileEntityRockBreaker(location("rock_breaker.iv"), GATextures.BREAKER_OVERLAY, 5));
            ROCK_BREAKER[5] = GregTechAPI.registerMetaTileEntity(2218, new TileEntityRockBreaker(location("rock_breaker.luv"), GATextures.BREAKER_OVERLAY, 6));
            ROCK_BREAKER[6] = GregTechAPI.registerMetaTileEntity(2219, new TileEntityRockBreaker(location("rock_breaker.zpm"), GATextures.BREAKER_OVERLAY, 7));
            ROCK_BREAKER[7] = GregTechAPI.registerMetaTileEntity(2220, new TileEntityRockBreaker(location("rock_breaker.uv"), GATextures.BREAKER_OVERLAY, 8));
        }

        if (GAConfig.GT5U.highTierFishers) {
            FISHER[0] = GregTechAPI.registerMetaTileEntity(2226, new MetaTileEntityFisher(location("fisher.iv"), 5));
            FISHER[1] = GregTechAPI.registerMetaTileEntity(2227, new MetaTileEntityFisher(location("fisher.luv"), 6));
            FISHER[2] = GregTechAPI.registerMetaTileEntity(2228, new MetaTileEntityFisher(location("fisher.zpm"), 7));
            FISHER[3] = GregTechAPI.registerMetaTileEntity(2229, new MetaTileEntityFisher(location("fisher.uv"), 8));
        }

        if (GAConfig.GT5U.highTierBlockBreakers) {
            BLOCK_BREAKER[0] = GregTechAPI.registerMetaTileEntity(2230, new MetaTileEntityBlockBreaker(location("block_breaker.iv"), 5));
            BLOCK_BREAKER[1] = GregTechAPI.registerMetaTileEntity(2231, new MetaTileEntityBlockBreaker(location("block_breaker.luv"), 6));
            BLOCK_BREAKER[2] = GregTechAPI.registerMetaTileEntity(2232, new MetaTileEntityBlockBreaker(location("block_breaker.zpm"), 7));
            BLOCK_BREAKER[3] = GregTechAPI.registerMetaTileEntity(2233, new MetaTileEntityBlockBreaker(location("block_breaker.uv"), 8));
        }

        if (GAConfig.GT5U.highTierQuantumChests) {
            QUANTUM_CHEST[0] = GregTechAPI.registerMetaTileEntity(2234, new MetaTileEntityQuantumChest(location("quantum_chest.luv"), 6, 24576000));
            QUANTUM_CHEST[1] = GregTechAPI.registerMetaTileEntity(2235, new MetaTileEntityQuantumChest(location("quantum_chest.zpm"), 7, 28672000));
            QUANTUM_CHEST[2] = GregTechAPI.registerMetaTileEntity(2236, new MetaTileEntityQuantumChest(location("quantum_chest.uv"), 8, 32768000));
        }

        if (GAConfig.GT5U.highTierQuantumTanks) {
            QUANTUM_TANK[0] = GregTechAPI.registerMetaTileEntity(2237, new MetaTileEntityQuantumTank(location("quantum_tank.luv"), 6, 384000000));
            QUANTUM_TANK[1] = GregTechAPI.registerMetaTileEntity(2238, new MetaTileEntityQuantumTank(location("quantum_tank.zpm"), 7, 448000000));
            QUANTUM_TANK[2] = GregTechAPI.registerMetaTileEntity(2239, new MetaTileEntityQuantumTank(location("quantum_tank.uv"), 8, 512000000));
        }

        if (GAConfig.GT5U.highTierItemCollectors) {
            ITEM_COLLECTOR[0] = GregTechAPI.registerMetaTileEntity(2240, new MetaTileEntityItemCollector(location("item_collector.iv"), 5, 96));
            ITEM_COLLECTOR[1] = GregTechAPI.registerMetaTileEntity(2241, new MetaTileEntityItemCollector(location("item_collector.luv"), 6, 128));
            ITEM_COLLECTOR[2] = GregTechAPI.registerMetaTileEntity(2242, new MetaTileEntityItemCollector(location("item_collector.zpm"), 7, 192));
            ITEM_COLLECTOR[3] = GregTechAPI.registerMetaTileEntity(2243, new MetaTileEntityItemCollector(location("item_collector.uv"), 8, 256));
        }
    }

    private static ResourceLocation location(String name) {
        return new ResourceLocation(GregicAdditions.MODID, name);
    }
}
