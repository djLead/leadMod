package com.djlead.leadmod.proxy;

/** Client Proxy
 * Created by Lead on 11-9-2015.
 */

public class ClientProxy extends CommonProxy {


    @Override
    public void preInit() {

    }

    @Override
    public void init() {
       ItemRenderRegister.registerItemRenderer();
    }

    @Override
    public void postInit() {

    }
}

