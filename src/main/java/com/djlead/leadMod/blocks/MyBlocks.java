package com.djlead.leadmod.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/** MyBlocks - Register Custom Blocks
 * Created by Lead on 20-9-2015.
 */
public final class MyBlocks {

    public static Block LeadBlock;

    public static void createBlocks() {
        GameRegistry.registerBlock(LeadBlock = new BasicBlock("lead_block").setLightLevel(1.0f), "lead_block");
    }
}

