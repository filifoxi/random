package net.mcreator.slepice.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.slepice.SlepiceModElements;
import net.mcreator.slepice.SlepiceMod;

import java.util.Map;

@SlepiceModElements.ModElement.Tag
public class SlepicometBulletHitsPlayerProcedure extends SlepiceModElements.ModElement {
	public SlepicometBulletHitsPlayerProcedure(SlepiceModElements instance) {
		super(instance, 38);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SlepiceMod.LOGGER.warn("Failed to load dependency entity for procedure SlepicometBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.IN_FIRE, (float) 30000);
	}
}
