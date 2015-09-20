package com.djlead.leadMod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Lead on 19-9-2015.
 */
public final class myItems {

    public static Item LeadDisc;

    public static void createItems() {

        GameRegistry.registerItem (LeadDisc = new basicItem("lead_disc"), "lead_disc");

    }
}
