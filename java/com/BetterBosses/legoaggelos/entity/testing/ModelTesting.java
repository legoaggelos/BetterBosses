package com.BetterBosses.legoaggelos.entity.testing;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelTesting - Undefined
 * Created using Tabula 7.1.0
 */
@SideOnly(Side.CLIENT)
public class ModelTesting extends ModelBase {
    public double[] modelScale = new double[] { 1.0D, 1.0D, 1.1D };
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape6;

    public ModelTesting() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape4 = new ModelRenderer(this, 4, 0);
        this.shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        this.shape6 = new ModelRenderer(this, 0, 2);
        this.shape6.setRotationPoint(-2.3F, -5.0F, 0.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 15, 10, 10, 0.0F);
       
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 20, 1, 25, 0.0F);
        
        this.shape5 = new ModelRenderer(this, 0, 0);
        this.shape5.setRotationPoint(10.0F, -5.0F, 1.0F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 20, 1, 25, 0.0F);
        
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.shape3.render(f5);
        this.shape4.render(f5);
        this.shape6.render(f5);
        this.shape2.render(f5);
        this.shape5.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.shape2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
        this.shape5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
    }
}
