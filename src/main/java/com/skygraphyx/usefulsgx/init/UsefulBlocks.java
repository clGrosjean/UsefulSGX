package com.skygraphyx.usefulsgx.init;

import com.skygraphyx.usefulsgx.Reference;
import com.skygraphyx.usefulsgx.blocks.BlockTest;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class UsefulBlocks {

    static Block block_test;

    public static void load(FMLPreInitializationEvent event){
        block_test = new BlockTest();
    }
}
