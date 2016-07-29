package com.skygraphyx.usefulsgx.init;

import com.skygraphyx.usefulsgx.Reference;
import com.skygraphyx.usefulsgx.items.ItemTest;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class UsefulItems {

    static Item item_test;

    public static void load(FMLPreInitializationEvent event){
        item_test = new ItemTest();
    }
}
