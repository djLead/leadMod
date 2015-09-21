package com.djlead.leadmod.proxy;

import com.djlead.leadmod.blocks.MyBlocks;
import com.djlead.leadmod.items.MyItems;

/** COMMON Proxy
 * Created by Lead on 11-9-2015.
 */

public abstract class CommonProxy {

    public void preInit() {
        MyItems.createItems();
        MyBlocks.createBlocks();

   }

    public void init() {

    }

    public void postInit() {

    }
}

