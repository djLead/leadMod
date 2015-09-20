package com.djlead.leadMod.proxy;


import com.djlead.leadMod.items.myItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/** Client Proxy
 * Created by Lead on 11-9-2015.
 */

public class ClientProxy extends CommonProxy {


    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

    //    ItemRenderRegister.registerItemRenderer();
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myItems.LeadDisc, 0, new ModelResourceLocation("leadMod:lead_disc", "inventory"));

    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

//
//
//    @Override
//    public void preInit() {
//        // Keybindings,
//
//    }
//
//    @Override
//    public void init() {
//
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myItems.LeadDisc, 0, new ModelResourceLocation("leadMod:lead_disc", "inventory"));
//    }
//
//
//    @Override
//    public void postInit() {
//
//    }
//
//

}

