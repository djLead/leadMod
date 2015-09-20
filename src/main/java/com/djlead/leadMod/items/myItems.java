package com.djlead.leadmod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/** myItems - register custom items
 * Created by Lead on 19-9-2015.
 */
public final class myItems {

    public static Item LeadDisc;

    public static void createItems() {

        GameRegistry.registerItem(LeadDisc = new basicItem("lead_disc"), "lead_disc");
    }
}
