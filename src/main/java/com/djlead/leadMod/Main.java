package com.djlead.leadmod;

import com.djlead.leadmod.proxy.ItemRenderRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.djlead.leadmod.proxy.CommonProxy;
import net.minecraftforge.fml.relauncher.Side;

/** Main Class
 *  Created by Lead on 11-9-2015.
 */

@Mod(modid = Reference.MODID, name = Reference.MODNAME , version = Reference.MODVERSION, dependencies = "required-after:FML")

public class Main {

    @Instance(value=Reference.MODID)
    public static Main instance;

    @SidedProxy(modId=Reference.MODID, clientSide="com.djlead.leadmod.proxy.ClientProxy", serverSide="com.djlead.leadmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    // initialization
    @EventHandler    //PreInits Handler used for creating blocks, items, plugin APIs and to register item/blocks with GameRegistry
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @EventHandler    // Init build ui data structures, crafting recipes and register new handler and API useage
    public void init(FMLInitializationEvent event) {
        proxy.init();

    }

    @EventHandler    //Postinit deals with communication with other mods
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
    }


}
