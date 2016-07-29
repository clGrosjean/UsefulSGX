package com.skygraphyx.usefulsgx.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UsefulTab extends CreativeTabs {

    public UsefulTab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem(){ return new ItemStack(UsefulItems.item_test).getItem(); }

//    @SideOnly(Side.CLIENT)
//    public String getBackgroundImageName(){ return null; }
}
