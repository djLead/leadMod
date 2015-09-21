package com.djlead.leadmod.proxy;

import com.djlead.leadmod.init.MyBlocks;
import com.djlead.leadmod.init.MyItems;

/** Client Proxy
 * Created by Lead on 11-9-2015.
 */

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders(){
        MyItems.RegisterRenders();
        MyBlocks.RegisterRenders();
    }
}

