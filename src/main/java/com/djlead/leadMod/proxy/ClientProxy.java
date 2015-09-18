package com.djlead.leadMod.proxy;

import com.djlead.leadMod.init.newBlocks;
import com.djlead.leadMod.init.newItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Lead on 11-9-2015.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {

        newBlocks.registerRenders();
        newItems.registerRenders();

    }


    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}

