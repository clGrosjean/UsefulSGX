package com.skygraphyx.usefulsgx;

import com.skygraphyx.usefulsgx.init.UsefulBlocks;
import com.skygraphyx.usefulsgx.init.UsefulItems;
import com.skygraphyx.usefulsgx.init.UsefulRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import com.skygraphyx.usefulsgx.init.UsefulTab;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import com.skygraphyx.usefulsgx.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class UsefulSGX {

    @Mod.Instance
    public static UsefulSGX instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    private static CommonProxy proxy;

    public static CreativeTabs tabUsefulSGX = new UsefulTab("tab_usefulsgx");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        /** Block and Item **/
        UsefulBlocks.load(event);
        UsefulItems.load(event);

        /** Sound **/


        /** Achievement **/


        /** Event **/

        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event){
        UsefulRecipes.register();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
