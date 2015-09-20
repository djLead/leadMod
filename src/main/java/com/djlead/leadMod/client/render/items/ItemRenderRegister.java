package com.djlead.leadMod.client.render.items;

import com.djlead.leadMod.Reference;
import com.djlead.leadMod.items.myItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Lead on 20-9-2015.
 */
public final class ItemRenderRegister {

    public static void registerItemRenderer() {
        reg(myItems.LeadDisc);
    }

    // -----

    public static String modid = Reference.MODID;

    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
