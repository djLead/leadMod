package com.djlead.leadMod.init;

import com.djlead.leadMod.Reference;
import com.djlead.leadMod.blocks.lead_block;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraft.block.material.Material.glass;

/**
 * Created by Lead on 18-9-2015.
 */
public class newBlocks {


    public static Block lead_block;

    public static void  init() {


        lead_block = new lead_block(glass).setUnlocalizedName("lead_block");

    }

    public static void  register() {

        GameRegistry.registerBlock(lead_block, lead_block.getUnlocalizedName().substring(5));

    }

    public static void  registerRenders() {

        registerRender(lead_block);

    }

    public static void  registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
}
