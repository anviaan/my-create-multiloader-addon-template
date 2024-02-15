package net.anvian.mod_id.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.anvian.mod_id.ModNameToolsMod;
import net.anvian.mod_id.item.tab.ModGroup;
import net.fabricmc.api.ModInitializer;

public class ModNameToolsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ModNameToolsMod.init();
        ModNameToolsMod.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
        ), ModNameToolsMod.NAME);
        ModGroup.REGISTRATE.register();
    }
}
