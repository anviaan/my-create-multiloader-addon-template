package net.anvian.mod_id.forge;

import net.anvian.mod_id.CreateUnbreakableToolsMod;
import net.anvian.mod_id.forge.registry.ModGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateUnbreakableToolsMod.MOD_ID)
public class CreateUnbreakableToolsForge {
    public CreateUnbreakableToolsForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModGroup.TABS.register(eventBus);
        CreateUnbreakableToolsMod.init();
    }
}
