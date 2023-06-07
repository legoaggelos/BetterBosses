package com.BetterBosses.legoaggelos.util.handlers;

import com.BetterBosses.legoaggelos.entity.testing.EntityTesting;
import com.BetterBosses.legoaggelos.entity.testing.RenderTesting;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderHandler {
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityTesting.class, new IRenderFactory<EntityTesting>()
		{
			@Override
			public Render<? super EntityTesting> createRenderFor(RenderManager manager) 
			{
				return new RenderTesting(manager);		
			}
		});
		
	
	}
}
