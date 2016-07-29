package com.skygraphyx.usefulsgx.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy implements ProxyInterface {

    public void registerRenders(){}

    public World getClientWorld(){ return null; }

    public EntityPlayer getClientPlayer(){ return null; }

    @Override
    public boolean isSinglePlayer(){ return false; }

    @Override
    public void preInit(){}
}
