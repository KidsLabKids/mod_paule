package net.mcreator.poleskrasseerfindunghehexd.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.ChickenModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.poleskrasseerfindunghehexd.entity.SiuuEntity;

@OnlyIn(Dist.CLIENT)
public class SiuuRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SiuuEntity.entity,
					renderManager -> new MobRenderer(renderManager, new ChickenModel(), 0.4f) {
						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("poles_krasse_erfindung_hehexd:textures/siuuu.png");
						}
					});
		}
	}
}
