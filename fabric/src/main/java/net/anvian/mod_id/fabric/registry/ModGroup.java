package net.anvian.mod_id.fabric.registry;

import net.anvian.mod_id.ModNameToolsMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;

public class ModGroup {
    public static void register() {
        ResourceKey<CreativeModeTab> tab = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ModNameToolsMod.MOD_ID, "tab"));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, tab, FabricItemGroup.builder()
                .icon(Items.DIAMOND::getDefaultInstance)
                .title(Component.translatable("itemGroup.mod_id"))
                .displayItems((context, entries) -> {
                    entries.accept(Items.DIAMOND);
                })
                .build()
        );
    }
}
