package com.overreacted.horsebreedfix;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class HBEventHandler {
	
    private static final IAttribute horseJumpStrength = (new RangedAttribute("horse.jumpStrength", 0.7D, 0.0D, 2.0D)).setDescription("Jump Strength").setShouldWatch(true);
	
	@SubscribeEvent
	public void onEntityCreateChild(EntityJoinWorldEvent event){
		if (event.entity instanceof EntityHorse && !((EntityHorse)event.entity).isAdultHorse()){
			EntityHorse entity = (EntityHorse)event.entity;			
			double i = entity.worldObj.rand.nextDouble();
			double j = entity.worldObj.rand.nextDouble();
			double k = entity.worldObj.rand.nextDouble();
			double d1 = entity.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue() + 1.5 + (i * 1.5);
			if (d1 <= 30){
			entity.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(d1);
			}
			double d2 = entity.getEntityAttribute(horseJumpStrength).getBaseValue() + 0.05 + (j * 0.05);
			if (d2 <= 1){
			entity.getEntityAttribute(horseJumpStrength).setBaseValue(d2);
			}
			double d3 = entity.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getBaseValue() + 0.016875 + (k * 0.016875);
			if (d3 <= 0.3375){
			entity.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(d3);
			}
		}
	}

}
