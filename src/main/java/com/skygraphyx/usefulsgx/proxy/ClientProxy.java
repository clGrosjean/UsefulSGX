package com.skygraphyx.usefulsgx.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders(){

    }

    @Override
    public EntityPlayer getClientPlayer(){ return Minecraft.getMinecraft().thePlayer; }

    @Override
    public boolean isSinglePlayer(){ return Minecraft.getMinecraft().isSingleplayer(); }

    @Override
    public void preInit(){
        MinecraftForge.EVENT_BUS.register(this);
    }
}
