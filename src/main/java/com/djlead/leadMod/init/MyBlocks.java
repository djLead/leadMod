package com.djlead.leadmod.init;


import com.djlead.leadmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Lead on 21-9-2015.
 */
public class MyBlocks {

    // Options for blocks

    //        .setHardness 	      recommended sets how long it takes to break the block 	[default:depends on material; stone:1.5F; obsidian:50.0F]
    //        .setResistance 	  recommended sets the block's resistance against explosions 	default:depends on material; stone:10.0F; obsidian:2000.0F
    //        .setLightLevel 	  optional 	  sets how much light is emitted from the block 	default: 0.0F (nothing); maximum: 1.0F (like full sunlight)

    //        .setCreativeTab 	  optional 	  sets the creative tab to display the block in 	[default: tabBlock]
    //        .setStepSound 	  recommended sets the step sound of a block 	default:depends on material
    //        .setLightOpacity 	  optional 	  sets how much light is subtracted when going through this block
    //                                        This is only used if isOpaqueCube() returns false 	default: 16 (completely opaque); maximum: 0 (100% translucent)
    //        .setHarvestLevel 	  recommended sets the tool and the tool level to break a block. If you don't use this, the break level is defined by the material
    //                              tool: "pickaxe", "axe", "shovel"
    //                              level: 0=wood; 1=stone; 2=iron; 3=diamond tool
    //        .setBlockUnbreakable 	optional  makes the block unbreakable in survival only bedrock and barriers are unbreakable
    //        .setTickRandomly 	  optional 	  if true the block receives random update ticks. Used for example for the decaying of leaves.    [default: false]

    public static Block block_light;

    public static void InitBlocks() {
        block_light = new MyBlockObject(Material.rock, 2.0f, 15.0f, 1.0f).setUnlocalizedName("block_light");
    }

    public static void register() {
        GameRegistry.registerBlock(block_light, block_light.getUnlocalizedName().substring(5));
    }

    public static void RegisterRenders() {
        RegisterRender(block_light);
    }


    public static void RegisterRender(Block block) {
        Item item =  Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
