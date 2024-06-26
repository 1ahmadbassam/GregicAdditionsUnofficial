package gregicadditions.item;

import gregicadditions.GAConfig;
import gregtech.api.items.materialitem.MaterialMetaItem;
import gregtech.api.items.metaitem.ElectricStats;
import gregtech.api.items.metaitem.stats.IItemComponent;
import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import net.minecraftforge.fml.common.Loader;

public class GAMetaItem extends MaterialMetaItem {

    public GAMetaItem() {
        super(OrePrefix.valueOf("plateCurved"), OrePrefix.valueOf("ingotDouble"), OrePrefix.valueOf("round"), null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null);
    }

    public void registerSubItems() {
        if (GAConfig.Misc.cokeOvenEnable) {
            GAMetaItems.COKE_BRICK = addItem(0, "ga_brick.coke");
        }
        if (GAConfig.Misc.CeramicsIntegration && Loader.isModLoaded("ceramics")) {
            GAMetaItems.UNFIRED_PORCELAIN_BRICK = addItem(70, "ga_brick.unfired.porcelain");
            GAMetaItems.UNFIRED_PORCELAIN_PLATE = addItem(71, "ga_plate.unfired.porcelain");
        }
        GAMetaItems.COMPRESSED_COKE_CLAY = addItem(6, "ga_compressed.coke.clay");
        GAMetaItems.FIRECLAY_BRICK = addItem(1, "ga_brick.fireclay").setUnificationData(OrePrefix.ingot, Materials.Fireclay);
        GAMetaItems.ADVANCED_CIRCUIT = addItem(2, "circuit.advanced.regular").setUnificationData(OrePrefix.circuit, Tier.Advanced);
        GAMetaItems.GOOD_CIRCUIT = addItem(3, "circuit.good.regular").setUnificationData(OrePrefix.circuit, Tier.Good);
        GAMetaItems.PETRI_DISH = addItem(4, "component.petri.dish");
        GAMetaItems.COMPRESSED_CLAY = addItem(5, "ga_compressed.clay").setUnificationData(OrePrefix.ingot, Materials.Clay);
        GAMetaItems.COMPRESSED_FIRECLAY = addItem(7, "ga_compressed.fireclay");
        GAMetaItems.CRYSTAL_COMPUTER = addItem(8, "computer.crystal").setUnificationData(OrePrefix.circuit, Tier.Ultimate);
        GAMetaItems.NANO_COMPUTER = addItem(9, "computer.nano").setUnificationData(OrePrefix.circuit, Tier.Elite);
        GAMetaItems.QUANTUM_COMPUTER = addItem(10, "computer.quantum").setUnificationData(OrePrefix.circuit, Tier.Master);
        GAMetaItems.CRYSTAL_MAINFRAME = addItem(11, "mainframe.crystal").setUnificationData(OrePrefix.circuit, Tier.Superconductor);
        GAMetaItems.NANO_MAINFRAME = addItem(12, "mainframe.nano").setUnificationData(OrePrefix.circuit, Tier.Master);
        GAMetaItems.INTEGRATED_MAINFRAME = addItem(13, "mainframe.normal").setUnificationData(OrePrefix.circuit, Tier.Elite);
        GAMetaItems.QUANTUM_MAINFRAME = addItem(14, "mainframe.quantum").setUnificationData(OrePrefix.circuit, Tier.Ultimate);
        GAMetaItems.NEURO_PROCESSOR = addItem(15, "processor.neuro");
        GAMetaItems.INTEGRATED_COMPUTER = addItem(16, "computer.normal").setUnificationData(OrePrefix.circuit, Tier.Extreme);
        GAMetaItems.RAW_CRYSTAL_CHIP = addItem(17, "crystal.raw");
        GAMetaItems.STEMCELLS = addItem(18, "stemcells");
        GAMetaItems.MICA_SHEET = addItem(26, "mica_sheet");
        GAMetaItems.MICA_INSULATOR_SHEET = addItem(27, "mica_insulator_sheet");
        GAMetaItems.MICA_INSULATOR_FOI = addItem(28, "mica_insulator_foil");
        GAMetaItems.BASIC_BOARD = addItem(29, "board.basic");
        GAMetaItems.GOOD_PHENOLIC_BOARD = addItem(30, "board.good.phenolic");
        GAMetaItems.GOOD_PLASTIC_BOARD = addItem(31, "board.good.plastic");
        GAMetaItems.ADVANCED_BOARD = addItem(32, "board.advanced");
        GAMetaItems.EXTREME_BOARD = addItem(33, "board.extreme");
        GAMetaItems.ELITE_BOARD = addItem(34, "board.elite");
        GAMetaItems.MASTER_BOARD = addItem(35, "board.master");

        if (Loader.isModLoaded("forestry") && GAConfig.GT6.electrodes) {
            GAMetaItems.ELECTRODE_APATITE = addItem(100, "electrode.apatite");
            GAMetaItems.ELECTRODE_BLAZE = addItem(101, "electrode.blaze");
            GAMetaItems.ELECTRODE_BRONZE = addItem(102, "electrode.bronze");
            GAMetaItems.ELECTRODE_COPPER = addItem(103, "electrode.copper");
            GAMetaItems.ELECTRODE_DIAMOND = addItem(104, "electrode.diamond");
            GAMetaItems.ELECTRODE_EMERALD = addItem(105, "electrode.emerald");
            GAMetaItems.ELECTRODE_ENDER = addItem(106, "electrode.ender");
            GAMetaItems.ELECTRODE_GOLD = addItem(107, "electrode.gold");
            if (Loader.isModLoaded("ic2") || Loader.isModLoaded("binniecore"))
                GAMetaItems.ELECTRODE_IRON = addItem(108, "electrode.iron");
            GAMetaItems.ELECTRODE_LAPIS = addItem(109, "electrode.lapis");
            GAMetaItems.ELECTRODE_OBSIDIAN = addItem(110, "electrode.obsidian");
            if (Loader.isModLoaded("extrautils2"))
                GAMetaItems.ELECTRODE_ORCHID = addItem(111, "electrode.orchid");
            if (Loader.isModLoaded("ic2") || Loader.isModLoaded("techreborn") || Loader.isModLoaded("binniecore"))
                GAMetaItems.ELECTRODE_RUBBER = addItem(112, "electrode.rubber");
            GAMetaItems.ELECTRODE_TIN = addItem(113, "electrode.tin");
        }

        if (GAConfig.GT5U.enableZPMAndUVBats) {
            GAMetaItems.ENERGY_MODULE = addItem(19, "energy.module").addComponents(new IItemComponent[]{ElectricStats.createRechargeableBattery(10000000000L, 7)}).setModelAmount(8);
            GAMetaItems.ENERGY_CLUSTER = addItem(20, "energy.cluster").addComponents(new IItemComponent[]{ElectricStats.createRechargeableBattery(100000000000L, 8)}).setModelAmount(8);
        }

        if (GAConfig.GT5U.replaceUVWithMAXBat) {
            GAMetaItems.MAX_BATTERY = addItem(21, "max.battery").addComponents(new IItemComponent[]{ElectricStats.createRechargeableBattery(9223372036854775807L, 9)}).setModelAmount(8);
            MetaItems.ZPM2.setInvisible();
        }

        if (GAConfig.Misc.cokeOvenEnable) {
            MetaItems.COKE_OVEN_BRICK.setInvisible();
        }

        MetaItems.COMPRESSED_CLAY.setInvisible();
        MetaItems.COMPRESSED_FIRECLAY.setInvisible();
        MetaItems.FIRECLAY_BRICK.setInvisible();
    }
}
