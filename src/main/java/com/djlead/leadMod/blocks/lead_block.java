package com.djlead.leadMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;

/**
 * Created by Lead on 18-9-2015.
 */
public class lead_block extends Block {

        public lead_block(Material materialIn) {
            super(materialIn);
        }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT;
    }

}
