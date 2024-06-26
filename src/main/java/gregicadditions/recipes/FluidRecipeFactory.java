package gregicadditions.recipes;

import com.google.gson.JsonObject;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.oredict.ShapedOreRecipe;

import javax.annotation.Nonnull;

public class FluidRecipeFactory implements IRecipeFactory {
    @Override
    public IRecipe parse(JsonContext context, JsonObject json) {

        ShapedOreRecipe recipe = ShapedOreRecipe.factory(context, json);

        CraftingHelper.ShapedPrimer primer = new CraftingHelper.ShapedPrimer();
        primer.width = recipe.getRecipeWidth();
        primer.height = recipe.getRecipeHeight();
        primer.mirrored = JsonUtils.getBoolean(json, "mirrored", true);
        primer.input = recipe.getIngredients();

        return new FluidRecipe(new ResourceLocation("gtadditions"), recipe.getRecipeOutput(), primer);
    }

    public static class FluidRecipe extends ShapedOreRecipe {

        public FluidRecipe(ResourceLocation group, ItemStack result, CraftingHelper.ShapedPrimer primer) {
            super(group, result, primer);
        }

        @Override
        @Nonnull
        public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv) {

            NonNullList<ItemStack> ret = NonNullList.withSize(inv.getSizeInventory(), ItemStack.EMPTY);

            for (int i = 0; i < ret.size(); i++) {
                ItemStack stack = inv.getStackInSlot(i);
                IFluidHandlerItem handler = stack.getCount() > 1 ? FluidUtil.getFluidHandler(new ItemStack(stack.getItem(), 1)) : FluidUtil.getFluidHandler(stack);

                if (handler == null) {
                    ret.set(i, ForgeHooks.getContainerItem(stack));
                } else {
                    handler.drain(Fluid.BUCKET_VOLUME, true);
                    ret.set(i, handler.getContainer().copy());
                }
            }
            return ret;
        }

        @Override
        public boolean isDynamic() {

            return true;
        }
    }
}