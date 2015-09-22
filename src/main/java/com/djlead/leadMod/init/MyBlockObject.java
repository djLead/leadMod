package com.djlead.leadmod.init;

import com.djlead.leadmod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Lead on 21-9-2015.
 */
public class MyBlockObject extends Block {
    public MyBlockObject(Material materialIn, float hardness, float resistance, float lightlevel) {
        super(materialIn);
        this.setCreativeTab(Main.tabCrea);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(lightlevel);
    }

}
