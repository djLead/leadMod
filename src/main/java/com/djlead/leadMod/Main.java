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


    @EventHandler    //PreInits Handler used for creating blocks, items, plugin APIs and to register item/blocks with GameRegistry
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler    // Init build ui data structures, crafting recipes and register new handler and API useage
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler    //Postinit deals with communication with other mods
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }


}
