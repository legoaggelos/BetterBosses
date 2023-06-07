package com.BetterBosses.legoaggelos.entity.testing;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.BetterBosses.legoaggelos.util.Reference;
@SideOnly(Side.CLIENT)
public class RenderTesting extends RenderLiving<EntityTesting>
{
public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/entity/test/testing.png");
	
	public RenderTesting(RenderManager manager) 
	{
		super(manager, new ModelTesting(), 0.2f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityTesting entity) 
	{
		return TEXTURE;
	}
}
