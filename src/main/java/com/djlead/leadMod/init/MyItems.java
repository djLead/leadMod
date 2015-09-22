package com.djlead.leadmod.init;

import com.djlead.leadmod.Main;
import com.djlead.leadmod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/** MyItems - Deals with custom init
 * Created by Lead on 19-9-2015.
 */
public final class MyItems {

    public static Item item_ring;

    public static void  InitItem() {
        item_ring = new Item().setUnlocalizedName("item_ring").setCreativeTab(Main.tabCrea).setMaxStackSize(16);

    }

    public static void register() {
        GameRegistry.registerItem(item_ring, item_ring.getUnlocalizedName().substring(5));
    }

    public static void RegisterRenders() {
        RegisterRender(item_ring);
    }

    public static void RegisterRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
