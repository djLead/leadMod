package com.djlead.leadMod.init;

import com.djlead.leadMod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Lead on 18-9-2015.
 */
public class newItems {

        public static Item lead_disc;

        public static void init() {

                lead_disc = new Item().setUnlocalizedName("lead_disc");

        }

        public static void register() {

                GameRegistry.registerItem(lead_disc, lead_disc.getUnlocalizedName().substring(5));

        }

        public static void registerRenders() {

                registerRender(lead_disc);

        }

        public static void registerRender(Item item) {

                Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        }


}
