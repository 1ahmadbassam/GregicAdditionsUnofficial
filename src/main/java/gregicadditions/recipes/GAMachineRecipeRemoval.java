package gregicadditions.recipes;

import gregicadditions.GAConfig;
import gregicadditions.GAUtils;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.recipes.*;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.material.type.GemMaterial;
import gregtech.api.unification.material.type.IngotMaterial;
import gregtech.api.unification.material.type.Material;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;

import java.util.*;

public class GAMachineRecipeRemoval {

    private static final MaterialStack[] solderingList = {
            new MaterialStack(Materials.Tin, 2L),
            new MaterialStack(Materials.SolderingAlloy, 1L)
    };

    public static void init() {
        for (Material m : IngotMaterial.MATERIAL_REGISTRY) {

            //Foil recipes
            removeRecipesByInputs(RecipeMaps.BENDER_RECIPES,
                    OreDictUnifier.get(OrePrefix.plate, m),
                    IntCircuitIngredient.getIntegratedCircuit(0));

            //Remove Old Rotor Recipe
            if (!OreDictUnifier.get(OrePrefix.rotor, m).isEmpty() && GAConfig.GT6.BendingRotors && GAConfig.GT6.BendingCylinders)
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.plate, m, 4), OreDictUnifier.get(OrePrefix.ring, m)},
                        new FluidStack[]{Materials.SolderingAlloy.getFluid(32)});

            //Remove Old Wrench Recipes
            if (m instanceof IngotMaterial && !m.hasFlag(DustMaterial.MatFlags.NO_SMASHING) && GAConfig.GT6.ExpensiveWrenches) {
                ModHandler.removeRecipeByName(new ResourceLocation(String.format("gregtech:wrench_%s", m)));
            }

            //Remove old mold copying recipes
            for (ItemStack mold : GAUtils.molds)
                RecipeMaps.FORMING_PRESS_RECIPES.removeRecipe(RecipeMaps.FORMING_PRESS_RECIPES.findRecipe(22, Arrays.asList(MetaItems.SHAPE_EMPTY.getStackForm(), mold), Collections.emptyList(), Integer.MAX_VALUE));

            //Remove EV+ Cable Recipes
            if (GAConfig.GT5U.CablesGT5U) {
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtSingle, m), IntCircuitIngredient.getIntegratedCircuit(24)},
                        new FluidStack[]{Materials.Rubber.getFluid(144)});
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtSingle, m, 2), IntCircuitIngredient.getIntegratedCircuit(25)},
                        new FluidStack[]{Materials.Rubber.getFluid(288)});
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtSingle, m, 4), IntCircuitIngredient.getIntegratedCircuit(26)},
                        new FluidStack[]{Materials.Rubber.getFluid(576)});
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtSingle, m, 8), IntCircuitIngredient.getIntegratedCircuit(27)},
                        new FluidStack[]{Materials.Rubber.getFluid(1152)});
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtSingle, m, 16), IntCircuitIngredient.getIntegratedCircuit(28)},
                        new FluidStack[]{Materials.Rubber.getFluid(2304)});
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtDouble, m), IntCircuitIngredient.getIntegratedCircuit(24)},
                        new FluidStack[]{Materials.Rubber.getFluid(288)});
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtQuadruple, m), IntCircuitIngredient.getIntegratedCircuit(24)},
                        new FluidStack[]{Materials.Rubber.getFluid(576)});
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtOctal, m), IntCircuitIngredient.getIntegratedCircuit(24)},
                        new FluidStack[]{Materials.Rubber.getFluid(1152)});
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtHex, m), IntCircuitIngredient.getIntegratedCircuit(24)},
                        new FluidStack[]{Materials.Rubber.getFluid(2304)});
            }
        }
        //Remove Old Bucket Recipe
        if (GAConfig.GT6.BendingCurvedPlates) {
            removeRecipesByInputs(RecipeMaps.BENDER_RECIPES,
                    OreDictUnifier.get(OrePrefix.plate, Materials.Iron, 12),
                    IntCircuitIngredient.getIntegratedCircuit(1));
            removeRecipesByInputs(RecipeMaps.BENDER_RECIPES,
                    OreDictUnifier.get(OrePrefix.plate, Materials.WroughtIron, 12),
                    IntCircuitIngredient.getIntegratedCircuit(1));
        }

        //Remove GTCE Circuit recipes
        for (MaterialStack stack : solderingList) {
            IngotMaterial material = (IngotMaterial) stack.material;
            int multiplier = (int) stack.amount;

            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PHENOLIC_BOARD.getStackForm(), MetaItems.INTEGRATED_LOGIC_CIRCUIT.getStackForm(), MetaItems.RESISTOR.getStackForm(2), OreDictUnifier.get(OrePrefix.wireFine, Materials.Copper)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PHENOLIC_BOARD.getStackForm(), MetaItems.INTEGRATED_LOGIC_CIRCUIT.getStackForm(), MetaItems.SMD_RESISTOR.getStackForm(2), OreDictUnifier.get(OrePrefix.wireFine, Materials.Copper)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PLASTIC_BOARD.getStackForm(), MetaItems.CENTRAL_PROCESSING_UNIT.getStackForm(4), MetaItems.RESISTOR.getStackForm(4), MetaItems.CAPACITOR.getStackForm(4), MetaItems.TRANSISTOR.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Copper, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PLASTIC_BOARD.getStackForm(), MetaItems.CENTRAL_PROCESSING_UNIT.getStackForm(4), MetaItems.SMD_RESISTOR.getStackForm(4), MetaItems.SMD_CAPACITOR.getStackForm(4), MetaItems.SMD_TRANSISTOR.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Copper, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PLASTIC_BOARD.getStackForm(), MetaItems.SYSTEM_ON_CHIP.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Copper, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PHENOLIC_BOARD.getStackForm(), MetaItems.BASIC_ELECTRONIC_CIRCUIT_LV.getStackForm(3), MetaItems.RESISTOR.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Electrum, 8)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PHENOLIC_BOARD.getStackForm(), MetaItems.BASIC_ELECTRONIC_CIRCUIT_LV.getStackForm(3), MetaItems.SMD_RESISTOR.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Electrum, 8)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PLASTIC_BOARD.getStackForm(), MetaItems.CENTRAL_PROCESSING_UNIT.getStackForm(), MetaItems.RESISTOR.getStackForm(2), MetaItems.CAPACITOR.getStackForm(2), MetaItems.TRANSISTOR.getStackForm(2), OreDictUnifier.get(OrePrefix.wireFine, Materials.RedAlloy, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PLASTIC_BOARD.getStackForm(), MetaItems.CENTRAL_PROCESSING_UNIT.getStackForm(), MetaItems.SMD_RESISTOR.getStackForm(2), MetaItems.SMD_CAPACITOR.getStackForm(2), MetaItems.SMD_TRANSISTOR.getStackForm(2), OreDictUnifier.get(OrePrefix.wireFine, Materials.RedAlloy, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PLASTIC_BOARD.getStackForm(), MetaItems.SYSTEM_ON_CHIP.getStackForm(), OreDictUnifier.get(OrePrefix.wireFine, Materials.RedAlloy, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PLASTIC_BOARD.getStackForm(), MetaItems.ADVANCED_CIRCUIT_MV.getStackForm(2), MetaItems.SMALL_COIL.getStackForm(4), MetaItems.CAPACITOR.getStackForm(4), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.RedAlloy, 12)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PLASTIC_BOARD.getStackForm(), MetaItems.ADVANCED_CIRCUIT_MV.getStackForm(2), MetaItems.SMALL_COIL.getStackForm(4), MetaItems.SMD_CAPACITOR.getStackForm(4), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.RedAlloy, 12)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.EPOXY_BOARD.getStackForm(), MetaItems.NANO_CENTRAL_PROCESSING_UNIT.getStackForm(), MetaItems.SMD_RESISTOR.getStackForm(2), MetaItems.SMD_CAPACITOR.getStackForm(2), MetaItems.SMD_TRANSISTOR.getStackForm(2), OreDictUnifier.get(OrePrefix.wireFine, Materials.Electrum, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.EPOXY_BOARD.getStackForm(), MetaItems.SYSTEM_ON_CHIP.getStackForm(), OreDictUnifier.get(OrePrefix.wireFine, Materials.Electrum, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.EPOXY_BOARD.getStackForm(), MetaItems.NANO_PROCESSOR_HV.getStackForm(2), MetaItems.SMALL_COIL.getStackForm(4), MetaItems.SMD_CAPACITOR.getStackForm(4), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Electrum, 6)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.FIBER_BOARD.getStackForm(), MetaItems.QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(), MetaItems.NANO_CENTRAL_PROCESSING_UNIT.getStackForm(), MetaItems.SMD_CAPACITOR.getStackForm(2), MetaItems.SMD_TRANSISTOR.getStackForm(2), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.FIBER_BOARD.getStackForm(), MetaItems.ADVANCED_SYSTEM_ON_CHIP.getStackForm(), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.FIBER_BOARD.getStackForm(), MetaItems.QUANTUM_PROCESSOR_EV.getStackForm(2), MetaItems.SMALL_COIL.getStackForm(4), MetaItems.SMD_CAPACITOR.getStackForm(4), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 6)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.MULTILAYER_FIBER_BOARD.getStackForm(), MetaItems.CRYSTAL_CENTRAL_PROCESSING_UNIT.getStackForm(), MetaItems.NANO_CENTRAL_PROCESSING_UNIT.getStackForm(), MetaItems.SMD_CAPACITOR.getStackForm(2), MetaItems.SMD_TRANSISTOR.getStackForm(2), OreDictUnifier.get(OrePrefix.wireFine, Materials.NiobiumTitanium, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.MULTILAYER_FIBER_BOARD.getStackForm(), MetaItems.CRYSTAL_SYSTEM_ON_CHIP.getStackForm(), OreDictUnifier.get(OrePrefix.wireFine, Materials.NiobiumTitanium, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.MULTILAYER_FIBER_BOARD.getStackForm(), MetaItems.CRYSTAL_PROCESSOR_IV.getStackForm(2), MetaItems.SMALL_COIL.getStackForm(4), MetaItems.SMD_CAPACITOR.getStackForm(4), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.NiobiumTitanium, 6)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.WETWARE_BOARD.getStackForm(), MetaItems.CRYSTAL_CENTRAL_PROCESSING_UNIT.getStackForm(), MetaItems.NANO_CENTRAL_PROCESSING_UNIT.getStackForm(), MetaItems.SMD_CAPACITOR.getStackForm(2), MetaItems.SMD_TRANSISTOR.getStackForm(2), OreDictUnifier.get(OrePrefix.wireFine, Materials.YttriumBariumCuprate, 2)}, new FluidStack[]{material.getFluid(72 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.WETWARE_BOARD.getStackForm(), MetaItems.WETWARE_PROCESSOR_LUV.getStackForm(2), MetaItems.SMALL_COIL.getStackForm(4), MetaItems.SMD_CAPACITOR.getStackForm(4), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.YttriumBariumCuprate, 6)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.WETWARE_BOARD.getStackForm(2), MetaItems.WETWARE_PROCESSOR_ASSEMBLY_ZPM.getStackForm(3), MetaItems.SMD_DIODE.getStackForm(4), MetaItems.NOR_MEMORY_CHIP.getStackForm(4), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.YttriumBariumCuprate, 6)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.FIBER_BOARD.getStackForm(), MetaItems.POWER_INTEGRATED_CIRCUIT.getStackForm(4), MetaItems.ENGRAVED_LAPOTRON_CHIP.getStackForm(18), MetaItems.NANO_CENTRAL_PROCESSING_UNIT.getStackForm(), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 16)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.FIBER_BOARD.getStackForm(), MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT.getStackForm(4), MetaItems.ENERGY_LAPOTRONIC_ORB.getStackForm(8), MetaItems.QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 16), OreDictUnifier.get(OrePrefix.plate, Materials.Europium, 4)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.PLASTIC_BOARD.getStackForm(), MetaItems.ADVANCED_CIRCUIT_MV.getStackForm(), MetaItems.NAND_MEMORY_CHIP.getStackForm(32), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(4), OreDictUnifier.get(OrePrefix.wireFine, Materials.RedAlloy, 8), OreDictUnifier.get(OrePrefix.plate, Materials.Plastic, 4)}, new FluidStack[]{material.getFluid(144 * multiplier)});
            removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.EPOXY_BOARD.getStackForm(), MetaItems.NANO_PROCESSOR_HV.getStackForm(), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(4), MetaItems.RANDOM_ACCESS_MEMORY.getStackForm(32), MetaItems.NAND_MEMORY_CHIP.getStackForm(64), OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 32)}, new FluidStack[]{material.getFluid(144 * multiplier)});
        }

        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaItems.MULTILAYER_FIBER_BOARD.getStackForm(), OreDictUnifier.get(OrePrefix.circuit, MarkerMaterials.Tier.Good)}, new FluidStack[]{Materials.Polystyrene.getFluid(144)});
        removeRecipesByInputs(RecipeMaps.CHEMICAL_RECIPES, new ItemStack[]{MetaItems.CENTRAL_PROCESSING_UNIT_WAFER.getStackForm(), MetaItems.CARBON_FIBERS.getStackForm(16)}, new FluidStack[]{Materials.Glowstone.getFluid(576)});

        //Remove GTCE's Engraved Crystal Chip recipes
        removeRecipesByInputs(RecipeMaps.BLAST_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.plate, Materials.Emerald, 10), OreDictUnifier.get(OrePrefix.gemExquisite, Materials.Emerald)}, new FluidStack[]{Materials.Helium.getFluid(5000)});
        removeRecipesByInputs(RecipeMaps.BLAST_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.plate, Materials.Olivine, 10), OreDictUnifier.get(OrePrefix.gemExquisite, Materials.Olivine)}, new FluidStack[]{Materials.Helium.getFluid(5000)});
        removeRecipesByInputs(RecipeMaps.LASER_ENGRAVER_RECIPES, MetaItems.ENGRAVED_CRYSTAL_CHIP.getStackForm(), OreDictUnifier.get(OrePrefix.craftingLens, MarkerMaterials.Color.Lime));

        //Remove Old Field Generator Recipes
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.circuit, MarkerMaterials.Tier.Basic, 4), OreDictUnifier.get(OrePrefix.dust, Materials.EnderPearl)}, new FluidStack[]{Materials.Osmium.getFluid(288)});
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.circuit, MarkerMaterials.Tier.Good, 4), OreDictUnifier.get(OrePrefix.dust, Materials.EnderEye)}, new FluidStack[]{Materials.Osmium.getFluid(576)});
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.circuit, MarkerMaterials.Tier.Advanced, 4), MetaItems.QUANTUM_EYE.getStackForm()}, new FluidStack[]{Materials.Osmium.getFluid(1152)});
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.circuit, MarkerMaterials.Tier.Extreme, 4), OreDictUnifier.get(OrePrefix.dust, Materials.NetherStar)}, new FluidStack[]{Materials.Osmium.getFluid(2304)});
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.circuit, MarkerMaterials.Tier.Elite, 4), MetaItems.QUANTUM_STAR.getStackForm()}, new FluidStack[]{Materials.Osmium.getFluid(4608)});

        //Remove old component recipes
        Set<ItemStack> markedForRemoval = new TreeSet<>((o1, o2) -> (o1.getItem().equals(o2.getItem())) ? o1.getMetadata() - o2.getMetadata() : -1);
        for (int tier = 0; tier <= 8; tier++) {
            markedForRemoval.add(((MetaItem<?>.MetaValueItem) GACraftingComponents.MOTOR.getIngredient(tier)).getStackForm());
            markedForRemoval.add(((MetaItem<?>.MetaValueItem) GACraftingComponents.CONVEYOR.getIngredient(tier)).getStackForm());
            markedForRemoval.add(((MetaItem<?>.MetaValueItem) GACraftingComponents.EMITTER.getIngredient(tier)).getStackForm());
            markedForRemoval.add(((MetaItem<?>.MetaValueItem) GACraftingComponents.PISTON.getIngredient(tier)).getStackForm());
            markedForRemoval.add(((MetaItem<?>.MetaValueItem) GACraftingComponents.ROBOT_ARM.getIngredient(tier)).getStackForm());
            markedForRemoval.add(((MetaItem<?>.MetaValueItem) GACraftingComponents.PUMP.getIngredient(tier)).getStackForm());
        }
        removeAllRecipesInSet(RecipeMaps.ASSEMBLER_RECIPES, markedForRemoval);

        //Pure Chemical Reactor Recipes
        ModHandler.removeRecipeByName(new ResourceLocation("minecraft:ender_eye"));
        ModHandler.removeRecipes(Items.GOLDEN_APPLE);
        ModHandler.removeRecipes(Items.GOLDEN_CARROT);
        ModHandler.removeRecipes(Items.MAGMA_CREAM);

        //Remove Vanilla Glass Panes Recipes
        ModHandler.removeRecipes(ItemBlock.getItemFromBlock(Blocks.GLASS_PANE));

        //Remove GTCE's Solution Electrolyzing Recipes
        removeRecipesByInputs(RecipeMaps.ELECTROLYZER_RECIPES, Materials.NickelSulfateSolution.getFluid(12000));
        removeRecipesByInputs(RecipeMaps.ELECTROLYZER_RECIPES, Materials.CopperSulfateSolution.getFluid(11000));

        //Star Recipes
        removeRecipesByInputs(RecipeMaps.AUTOCLAVE_RECIPES,
                new ItemStack[]{new ItemStack(Items.NETHER_STAR)},
                new FluidStack[]{Materials.Darmstadtium.getFluid(288)});
        removeRecipesByInputs(RecipeMaps.CHEMICAL_RECIPES, OreDictUnifier.get(OrePrefix.ingot, Materials.Plutonium, 6));

        //MAX Hull Recipes
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.plate, Materials.Darmstadtium, 8), IntCircuitIngredient.getIntegratedCircuit(8));
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MAX), OreDictUnifier.get(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor, 2)}, new FluidStack[]{Materials.Polytetrafluoroethylene.getFluid(288)});

        //Fix Seed Oil Recipe
        removeRecipesByInputs(RecipeMaps.FLUID_EXTRACTION_RECIPES, new ItemStack(Items.WHEAT_SEEDS));
        removeRecipesByInputs(RecipeMaps.FLUID_EXTRACTION_RECIPES, new ItemStack(Items.MELON_SEEDS));
        removeRecipesByInputs(RecipeMaps.FLUID_EXTRACTION_RECIPES, new ItemStack(Items.PUMPKIN_SEEDS));

        //Remove Conflicting Recipes
        removeRecipesByInputs(RecipeMaps.COMPRESSOR_RECIPES, OreDictUnifier.get(OrePrefix.dust, Materials.Redstone));
        removeRecipesByInputs(RecipeMaps.CHEMICAL_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.dust, Materials.Carbon, 3), OreDictUnifier.get(OrePrefix.dust, Materials.Rutile)}, new FluidStack[]{Materials.Chlorine.getFluid(2000)});

        //Remove Incorrect Quartz Plate Recipes
        removeRecipesByInputs(RecipeMaps.CUTTER_RECIPES, new ItemStack[]{new ItemStack(Blocks.QUARTZ_BLOCK)}, new FluidStack[]{Materials.Water.getFluid(73)});
        removeRecipesByInputs(RecipeMaps.CUTTER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.block, Materials.CertusQuartz)}, new FluidStack[]{Materials.Water.getFluid(73)});
        removeRecipesByInputs(RecipeMaps.CUTTER_RECIPES, new ItemStack[]{new ItemStack(Blocks.QUARTZ_BLOCK)}, new FluidStack[]{Materials.DistilledWater.getFluid(55)});
        removeRecipesByInputs(RecipeMaps.CUTTER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.block, Materials.CertusQuartz)}, new FluidStack[]{Materials.DistilledWater.getFluid(55)});
        removeRecipesByInputs(RecipeMaps.CUTTER_RECIPES, new ItemStack[]{new ItemStack(Blocks.QUARTZ_BLOCK)}, new FluidStack[]{Materials.Lubricant.getFluid(18)});
        removeRecipesByInputs(RecipeMaps.CUTTER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.block, Materials.CertusQuartz)}, new FluidStack[]{Materials.Lubricant.getFluid(18)});

        //GTCE Coke And Firebrick recipes
        removeRecipesByInputs(RecipeMaps.COMPRESSOR_RECIPES, OreDictUnifier.get(OrePrefix.dust, Materials.Fireclay));
        ModHandler.removeFurnaceSmelting(MetaItems.COMPRESSED_FIRECLAY.getStackForm());
        ModHandler.removeFurnaceSmelting(MetaItems.COMPRESSED_CLAY.getStackForm());

        //Remove Simple Superconductor recipe
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtSingle, Materials.YttriumBariumCuprate, 3), OreDictUnifier.get(OrePrefix.plate, Materials.TungstenSteel, 3), MetaItems.ELECTRIC_PUMP_LV.getStackForm()}, new FluidStack[]{Materials.Nitrogen.getFluid(2000)});
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtSingle, Materials.NiobiumTitanium, 3), OreDictUnifier.get(OrePrefix.plate, Materials.TungstenSteel, 3), MetaItems.ELECTRIC_PUMP_LV.getStackForm()}, new FluidStack[]{Materials.Nitrogen.getFluid(2000)});
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.wireGtSingle, Materials.VanadiumGallium, 3), OreDictUnifier.get(OrePrefix.plate, Materials.TungstenSteel, 3), MetaItems.ELECTRIC_PUMP_LV.getStackForm()}, new FluidStack[]{Materials.Nitrogen.getFluid(2000)});

        //Remove Simple Coil Recipes
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.wireGtDouble, Materials.Cupronickel, 8), IntCircuitIngredient.getIntegratedCircuit(8));
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.wireGtDouble, Materials.Kanthal, 8), IntCircuitIngredient.getIntegratedCircuit(8));
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.wireGtDouble, Materials.Nichrome, 8), IntCircuitIngredient.getIntegratedCircuit(8));
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.wireGtDouble, Materials.TungstenSteel, 8), IntCircuitIngredient.getIntegratedCircuit(8));
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.wireGtDouble, Materials.HSSG, 8), IntCircuitIngredient.getIntegratedCircuit(8));
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.wireGtDouble, Materials.Naquadah, 8), IntCircuitIngredient.getIntegratedCircuit(8));
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.wireGtDouble, Materials.NaquadahAlloy, 8), IntCircuitIngredient.getIntegratedCircuit(8));
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.wireGtDouble, MarkerMaterials.Tier.Superconductor, 8), IntCircuitIngredient.getIntegratedCircuit(8));

        //Remove Circuit Component Recipes
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.plate, Materials.Wood, 8), MetaItems.RUBBER_DROP.getStackForm()}, new FluidStack[]{Materials.Glue.getFluid(100)});
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.wireFine, Materials.AnnealedCopper, 4), OreDictUnifier.get(OrePrefix.dustSmall, Materials.Gallium)}, new FluidStack[]{Materials.Plastic.getFluid(288)});
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.wireFine, Materials.Platinum, 4), OreDictUnifier.get(OrePrefix.dustSmall, Materials.Gallium)}, new FluidStack[]{Materials.Plastic.getFluid(288)});
        removeRecipesByInputs(RecipeMaps.BLAST_RECIPES, OreDictUnifier.get(OrePrefix.dust, Materials.Silicon, 32), OreDictUnifier.get(OrePrefix.dustTiny, Materials.Gallium), IntCircuitIngredient.getIntegratedCircuit(1));
        removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES, OreDictUnifier.get(OrePrefix.wireFine, Materials.Copper, 4), OreDictUnifier.get(OrePrefix.dust, Materials.Coal));

        //Concrete
        removeRecipesByInputs(RecipeMaps.MIXER_RECIPES, new ItemStack[]{OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 3), OreDictUnifier.get(OrePrefix.dust, Materials.Clay)}, new FluidStack[]{Materials.Water.getFluid(500)});

        //Remove ore to dust smelting
        for (Material mat : Material.MATERIAL_REGISTRY) {
            if (mat instanceof DustMaterial && ((DustMaterial) mat).directSmelting == null && !(mat instanceof IngotMaterial) && !(mat instanceof GemMaterial)) {
                ModHandler.removeFurnaceSmelting(new UnificationEntry(OrePrefix.ore, mat));
                ModHandler.removeFurnaceSmelting(new UnificationEntry(OrePrefix.oreBasalt, mat));
                ModHandler.removeFurnaceSmelting(new UnificationEntry(OrePrefix.oreBlackgranite, mat));
                ModHandler.removeFurnaceSmelting(new UnificationEntry(OrePrefix.oreEndstone, mat));
                ModHandler.removeFurnaceSmelting(new UnificationEntry(OrePrefix.oreGravel, mat));
                ModHandler.removeFurnaceSmelting(new UnificationEntry(OrePrefix.oreMarble, mat));
                ModHandler.removeFurnaceSmelting(new UnificationEntry(OrePrefix.oreNetherrack, mat));
                ModHandler.removeFurnaceSmelting(new UnificationEntry(OrePrefix.oreRedgranite, mat));
                ModHandler.removeFurnaceSmelting(new UnificationEntry(OrePrefix.oreSand, mat));
            }
        }

        //Remove GTCE Magic energy absorber
        ModHandler.removeRecipes(MetaTileEntities.MAGIC_ENERGY_ABSORBER.getStackForm());
    }

    private static <T extends RecipeBuilder<T>> void removeRecipesByInputs(RecipeMap<T> map, ItemStack... itemInputs) {
        List<ItemStack> inputs = new ArrayList<>();
        Collections.addAll(inputs, itemInputs);
        map.removeRecipe(map.findRecipe(Integer.MAX_VALUE, inputs, Collections.emptyList(), Integer.MAX_VALUE));
    }

    private static <T extends RecipeBuilder<T>> void removeRecipesByInputs(RecipeMap<T> map, FluidStack... fluidInputs) {
        List<FluidStack> inputs = new ArrayList<>();
        Collections.addAll(inputs, fluidInputs);
        map.removeRecipe(map.findRecipe(Integer.MAX_VALUE, Collections.emptyList(), inputs, Integer.MAX_VALUE));
    }

    private static <T extends RecipeBuilder<T>> void removeRecipesByInputs(RecipeMap<T> map, ItemStack[] itemInputs, FluidStack[] fluidInputs) {
        List<ItemStack> itemIn = new ArrayList<>();
        Collections.addAll(itemIn, itemInputs);
        List<FluidStack> fluidIn = new ArrayList<>();
        Collections.addAll(fluidIn, fluidInputs);
        map.removeRecipe(map.findRecipe(Integer.MAX_VALUE, itemIn, fluidIn, Integer.MAX_VALUE));
    }

    private static <T extends RecipeBuilder<T>> void removeAllRecipesInSet(RecipeMap<T> map, Set<ItemStack> itemsToClear) {
        List<Recipe> recipes = new ArrayList<>(map.getRecipeList());
        for (Recipe r : recipes)
            for (ItemStack i : r.getOutputs())
                if (itemsToClear.contains(i)) {
                    map.removeRecipe(r);
                    break;
                }
    }
}
