package com.djlead.leadmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/** MyRecipes hold all recipes
 * Created by Lead on 22-9-2015.
 */
public final class MyRecipes {

    public static void makeRecipes() {

        // 2 items shapeless is 1 block

        GameRegistry.addShapelessRecipe(new ItemStack(MyBlocks.block_light), MyItems.item_ring, MyItems.item_ring);

        // 4 items in pattern results in 3 blocks
        GameRegistry.addRecipe(new ItemStack(MyBlocks.block_light, 3), "## ", " ##", '#', MyItems.item_ring);

        // Lapiz in furnace = item_ring
        // last argument is XP, iron (0.7), gold/diamond/em ore (1) beef/meat (0.35)
        GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 4), new ItemStack(MyItems.item_ring), 0.5f);
    }
}