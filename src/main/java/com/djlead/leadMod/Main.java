package com.djlead.leadMod;

import com.djlead.leadMod.init.newBlocks;
import com.djlead.leadMod.init.newItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.djlead.leadMod.proxy.CommonProxy;
/**
 * Created by Lead on 11-9-2015.
 */

@Mod(modid = Reference.MODID, name = Reference.MODNAME , version = Reference.MODVERSION, dependencies = "required-after:FML")

public class Main {



    @Instance(value=Reference.MODID)
    public static Main instance;

    @SidedProxy(modId=Reference.MODID, clientSide="com.djlead.leadMod.proxy.ClientProxy", serverSide="com.djlead.leadMod.proxy.ServerProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {



        newBlocks.init();
        newBlocks.register();
        newItems.init();
        newItems.register();

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {


        proxy.registerRenders();
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }

}
