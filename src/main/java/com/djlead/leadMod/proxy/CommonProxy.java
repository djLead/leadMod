package com.djlead.leadMod.proxy;

import com.djlead.leadMod.items.myItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/** Common Proxy
 * Created by Lead on 11-9-2015.
 */

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        myItems.createItems();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

//
//
//    public void preInit() {
//
//        myItems.createItems();
//    }
//
//    public abstract void init();
//
//    public abstract void postInit();

}

