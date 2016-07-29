package com.skygraphyx.usefulsgx.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class UsefulRecipes {

    public static String[] oreDictDyes = new String[16];
    static String[] dyes = {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGray", "Gray", "Pink", "Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White"};

    public static void register(){

        /** Crafting **/
        GameRegistry.addShapedRecipe(new ItemStack(UsefulBlocks.block_test, 4), "TT ", "TT ", "   ", 'T', UsefulItems.item_test);

        /** Smelting **/
        GameRegistry.addSmelting(UsefulBlocks.block_test, new ItemStack(Items.diamond, 9), 1.0F);
    }
}
