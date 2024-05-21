package gregicadditions;

import gregicadditions.item.GAMetaBlocks;
import gregicadditions.item.GAMetaItems;
import gregicadditions.recipes.*;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.GemMaterial;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.blocks.VariantItemBlock;
import knightminer.ceramics.Ceramics;
import knightminer.ceramics.items.ItemClayUnfired;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.text.translation.LanguageMap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import slimeknights.tconstruct.library.events.TinkerRegisterEvent;
import slimeknights.tconstruct.shared.TinkerFluids;

import java.io.ByteArrayInputStream;
import java.util.function.Function;

@Mod.EventBusSubscriber(modid = GregicAdditions.MODID)
public class CommonProxy {
    private static final String shapeSmelterTranslations = "recipemap.alloy_smelter.name=Shape Smelter" +
            "\ngregtech.machine.steam_alloy_smelter_bronze.name=Steam Shape Smelter" +
            "\ngregtech.machine.steam_alloy_smelter_steel.name=High Pressure Shape Smelter" +
            "\ngregtech.machine.alloy_smelter.lv.name=Basic Shape Smelter" +
            "\ngregtech.machine.alloy_smelter.mv.name=Advanced Shape Smelter" +
            "\ngregtech.machine.alloy_smelter.hv.name=Advanced Shape Smelter II" +
            "\ngregtech.machine.alloy_smelter.ev.name=Advanced Shape Smelter III" +
            "\ngtadditions.machine.alloy_smelter.iv.name=Advanced Shape Smelter IV" +
            "\ngtadditions.machine.alloy_smelter.luv.name=Advanced Shape Smelter V" +
            "\ngtadditions.machine.alloy_smelter.zpm.name=Advanced Shape Smelter VI" +
            "\ngtadditions.machine.alloy_smelter.uv.name=Advanced Shape Smelter VII";

    private static void loadAlternateTranslations() {
        if (GAConfig.Misc.disableAlloySmelterAlloying) {
            LanguageMap.inject(new ByteArrayInputStream(shapeSmelterTranslations.getBytes()));
        }
    }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.register(GAMetaBlocks.MUTLIBLOCK_CASING);
        registry.register(GAMetaBlocks.TRANSPARENT_CASING);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(createItemBlock(GAMetaBlocks.MUTLIBLOCK_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(GAMetaBlocks.TRANSPARENT_CASING, VariantItemBlock::new));
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        if (block.getRegistryName() != null)
            itemBlock.setRegistryName(block.getRegistryName());
        return itemBlock;
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void runEarlyMaterialHandlers(RegistryEvent.Register<IRecipe> event) {
        // Hook into GTCE's processing handlers, to automatically generate rod recipes for gems
        OrePrefix.gem.addProcessingHandler(GemMaterial.class, GAMaterials::processGem);
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GAMetaItems.registerOreDict();
        GAMetaItems.registerRecipes();
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerRecipesLate(RegistryEvent.Register<IRecipe> event) {
        // Initialize ore dictionary entries, removals can occur later no problem
        GAMaterials.oreDictInit();
        GAMachineRecipeRemoval.init();
        GARecipeAddition.init();
        GARecipeAddition.init2();
        GARecipeAddition.registerCokeOvenRecipes();
        if (Loader.isModLoaded("forestry") && GAConfig.GT6.electrodes)
            GARecipeAddition.forestrySupport();
        if (Loader.isModLoaded("tconstruct") && GAConfig.Misc.TiCIntegration)
            TinkersIntegration.init();
        if (Loader.isModLoaded("ceramics") && GAConfig.Misc.CeramicsIntegration)
            GARecipeAddition.recipeCeramicsIntegration();
        MatterReplication.init();
        MachineCraftingRecipes.init();
        GeneratorFuels.init();
    }


    public void preInit() {
        loadAlternateTranslations();
        if (GAConfig.Misc.CeramicsIntegration && GAConfig.Misc.TiCIntegration && Loader.isModLoaded("tconstruct") && Loader.isModLoaded("ceramics"))
            MinecraftForge.EVENT_BUS.register(new TinkerIntegrationEventBus());
    }

    public void postInit() {}

    public void init() {
        if (Loader.isModLoaded("ceramics") && GAConfig.Misc.CeramicsIntegration)
            GARecipeAddition.initCeramicsIntegration();
    }

    public static class TinkerIntegrationEventBus {
        @SubscribeEvent(priority = EventPriority.HIGH)
        public void castingRemoval(TinkerRegisterEvent.TableCastingRegisterEvent event) {
            if (event.getRecipe().matches(GameRegistry.makeItemStack("tconstruct:cast_custom", 3, 1, null), TinkerFluids.clay)) {
                ItemStack out = event.getRecipe().getResult(GameRegistry.makeItemStack("tconstruct:cast_custom", 3, 1, null), TinkerFluids.clay);
                ItemStack plate = new ItemStack(Ceramics.clayUnfired, 1, ItemClayUnfired.UnfiredType.CLAY_PLATE.getMeta());
                if (out.getItem() == plate.getItem() && out.getMetadata() == plate.getMetadata())
                    event.setCanceled(true);
            }
        }

        @SubscribeEvent(priority = EventPriority.HIGH)
        public void smeltingRemoval(TinkerRegisterEvent.MeltingRegisterEvent event) {
            if (event.getRecipe().getResult().amount == 288 && (event.getRecipe().matches(new ItemStack(Ceramics.clayUnfired, 1, ItemClayUnfired.UnfiredType.CLAY_PLATE_RAW.getMeta()))
                    || event.getRecipe().matches(OreDictUnifier.get(OrePrefix.plate, Materials.Clay))))
                event.setCanceled(true);
        }
    }
}
