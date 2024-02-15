package net.anvian.mod_id.forge;

import net.anvian.mod_id.ModNameToolsMod;
import net.anvian.mod_id.forge.registry.ModGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModNameToolsMod.MOD_ID)
public class ModNameToolsForge {
    public ModNameToolsForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModGroup.TABS.register(eventBus);
        ModNameToolsMod.init();
    }
}
