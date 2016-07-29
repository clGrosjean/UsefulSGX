package com.skygraphyx.usefulsgx.blocks;

import net.minecraft.block.material.Material;

public class BlockTest extends BlockBase {

    public BlockTest() {
        super("block_test", Material.ground);

        this.setStepSound(soundTypeGlass);
        this.setHardness(1.0F);
    }
}
