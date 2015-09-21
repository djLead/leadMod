package com.djlead.leadmod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/** MyItems - register custom items
 * Created by Lead on 19-9-2015.
 */
public final class MyItems {

    public static Item lead_disc;

    public static void createItems() {

        GameRegistry.registerItem(lead_disc = new BasicItem("lead_disc"), "lead_disc");

    }
}
