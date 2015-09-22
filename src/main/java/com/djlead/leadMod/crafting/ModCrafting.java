package com.djlead.leadmod.crafting;

import com.djlead.leadmod.init.MyBlocks;
import com.djlead.leadmod.init.MyItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Lead on 22-9-2015.
 */
public final class ModCrafting {

    public static void makeRecipes() {

        // 2 items shapeless
        // cobble and lapiz, items.dye with meta data (bonemail, inksac etc.
        GameRegistry.addShapelessRecipe(new ItemStack(MyBlocks.block_light), MyItems.item_ring, MyItems.item_ring);

        // 4 items in pattern results in 3 blocks
        GameRegistry.addRecipe(new ItemStack(MyBlocks.block_light,3), "## "," ##",'#', MyItems.item_ring);



        GameRegistry.addShapelessRecipe(new ItemStack(MyItems.item_ring), Blocks.cobblestone, new ItemStack(Items.dye, 1, 4));
//        //or: GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), new Object[]{Items.redstone, new ItemStack(Items.dye, 1, 4)});
//
//        GameRegistry.addSmelting(Items.diamond, new ItemStack(MyItems.item_ring), 1.0f);
    }
}
