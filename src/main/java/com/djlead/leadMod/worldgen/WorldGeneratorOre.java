package com.djlead.leadmod.worldgen;

import com.djlead.leadmod.init.MyBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Lead on 22-9-2015.
 */
public class WorldGeneratorOre implements IWorldGenerator {

    private WorldGenerator ore_djlead;      // djlead ore generates in Overworld

    public WorldGeneratorOre() {
        this.ore_djlead = new WorldGenMinable(MyBlocks.block_light.getDefaultState(),8);

    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        // Ores in which dimensions
        switch (world.provider.getDimensionId()) {

            case 0:     // Overworld

                //                                                      chance, minHeight, maxHeight
                this.DoGenerator(this.ore_djlead, world, random, chunkX, chunkZ, 128, 64, 128);

                break;

            case -1:    // Nether
                break;

            case 1:     // End
                break;
        }
    }


    public void DoGenerator (WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int generateFrequency, int minHeight, int maxHeight) {

        // Variables checker, for debugging during development
        if (minHeight<0 || maxHeight>256 || minHeight>maxHeight) {
            throw new IllegalArgumentException("Illegals Height specified in Worlg Generator (leadmod)");
        }

        int generatorYRange = maxHeight - minHeight +1;
        for (int i=0;i<generateFrequency;i++) {
            int randPosX = chunkX + random.nextInt(16);
            int randPosY = minHeight+random.nextInt(16);
            int randPosZ = chunkZ + random.nextInt(16);
            generator.generate(world, random, new BlockPos(randPosX, randPosY, randPosZ));
        }
    }

}

