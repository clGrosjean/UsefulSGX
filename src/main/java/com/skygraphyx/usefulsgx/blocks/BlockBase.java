package com.skygraphyx.usefulsgx.blocks;

import com.skygraphyx.usefulsgx.Reference;
import com.skygraphyx.usefulsgx.UsefulSGX;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

class BlockBase extends Block {

    BlockBase(String name, Material material){
        super(material);

        registerBlocks(name, this);
    }

    private void registerBlocks(String name, Block block){
        block.setCreativeTab(UsefulSGX.tabUsefulSGX);
        block.setBlockName(name);
        block.setBlockTextureName(Reference.MOD_ID+":"+name);

        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
    }
}
