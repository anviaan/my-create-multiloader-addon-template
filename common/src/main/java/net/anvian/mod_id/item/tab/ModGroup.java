package net.anvian.mod_id.item.tab;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.anvian.mod_id.ModNameToolsMod;
import net.anvian.mod_id.ModNameToolsPlatform;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class ModGroup {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ModNameToolsMod.MOD_ID);

    public static final CreativeModeTab GROUP = new CreativeModeTab(ModNameToolsPlatform.getModGroupId(), ModNameToolsMod.MOD_ID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return Items.DIAMOND.getDefaultInstance();
        }

    };

    public static void register() {
        REGISTRATE.creativeModeTab(() -> GROUP, ModNameToolsMod.MOD_ID);
    }
}
