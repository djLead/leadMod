package com.djlead.leadmod.proxy;

import com.djlead.leadmod.Reference;
import com.djlead.leadmod.items.MyItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/** Rendering Items
 * Created by Lead on 20-9-2015.
 */
public final class ItemRenderRegister {


  public static void registerItemRenderer() {
        reg(MyItems.lead_disc);
    }

    // -----

    public static String modid = Reference.MODID;

    public static void reg(Item item) {
 //if (item != null) {
     Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
 //}
 //     Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MyItems.lead_disc, 0, new ModelResourceLocation("leadmod:lead_disc", "inventory"));
  }
}
