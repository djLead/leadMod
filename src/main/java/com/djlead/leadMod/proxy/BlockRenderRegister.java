package com.djlead.leadmod.proxy;

import com.djlead.leadmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/** remder blocks
 * Created by Lead on 20-9-2015.
 */
public class BlockRenderRegister {
    public static void registerBlockRenderer() {
    }


    public static String modid = Reference.MODID;

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}

