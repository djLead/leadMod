package com.djlead.leadMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.djlead.leadMod.proxy.CommonProxy;

/** Main Class
 *  Created by Lead on 11-9-2015.
 */

@Mod(modid = Reference.MODID, name = Reference.MODNAME , version = Reference.MODVERSION, dependencies = "required-after:FML")

public class Main {

    @Instance(value=Reference.MODID)
    public static Main instance;

    @SidedProxy(modId=Reference.MODID, clientSide="com.djlead.leadMod.proxy.ClientProxy", serverSide="com.djlead.leadMod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        //PreInits Handler used for creating blocks, items, plugin APIs and to register item/blocks with GameRegistry
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        // Init build ui data structures, crafting recipes and register new handler and API useage
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        //Postinit deals with communication with other mods
        proxy.postInit();
    }

}
