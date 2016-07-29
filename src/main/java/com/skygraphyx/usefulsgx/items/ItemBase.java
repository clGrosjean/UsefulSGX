package com.skygraphyx.usefulsgx.items;

import com.skygraphyx.usefulsgx.Reference;
import com.skygraphyx.usefulsgx.UsefulSGX;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

class ItemBase extends Item {

    ItemBase(String name){
        registerItems(name, this);
    }

    private void registerItems(String name, Item item){
        item.setCreativeTab(UsefulSGX.tabUsefulSGX);
        item.setUnlocalizedName(name);
        item.setTextureName(Reference.MOD_ID+":"+name);

        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }
}
