package com.overreacted.horsebreedfix;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModBase.MODID, name = ModBase.MODNAME, version = ModBase.VERSION)
public class ModBase
{
    public static final String MODID = "horsebreedfix";
    public static final String MODNAME = "Overreacted's Horse Breeding Fix";
    public static final String VERSION = "1.0";
    
    @Mod.Instance(ModBase.MODID)
    public static ModBase instance;
    
    @SidedProxy(clientSide="com.overreacted.horsebreedfix.ClientProxy", serverSide="com.overreacted.horsebreedfix.ServerProxy")
    public static CommonProxy proxy;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    }
    
    @EventHandler
    public void postInit(FMLInitializationEvent event){
    	
    }
}
