package net.anvian.mod_id.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class CreateUnbreakableToolsPlatformImpl {
	public static String platformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}
}
