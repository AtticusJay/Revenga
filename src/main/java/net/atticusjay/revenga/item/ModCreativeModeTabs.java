package net.atticusjay.revenga.item;

import net.atticusjay.revenga.Revenga;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Revenga.MOD_ID);

    public static final RegistryObject<CreativeModeTab> REVENGA_TAB = CREATIVE_MODE_TABS.register("revenga_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_TITANIUM.get()))
                    .title(Component.translatable("creativetab.revenga_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RAW_TITANIUM.get());
                        pOutput.accept(ModItems.TITANIUM_INGOT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
