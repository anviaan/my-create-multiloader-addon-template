package net.anvian.mod_id.forge.registry;

import net.anvian.mod_id.CreateUnbreakableToolsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = CreateUnbreakableToolsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModGroup {
    private ModGroup() {
    }

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateUnbreakableToolsMod.MOD_ID);
    static final RegistryObject<CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.mod_id"))
            .icon(Items.DIAMOND::getDefaultInstance)
            .displayItems((context, entries) -> {
                entries.accept(Items.DIAMOND);
            })
            .build());
}
