package com.dog_house666.tutorialmod.block;

import com.dog_house666.tutorialmod.TutorialMod;
import com.dog_house666.tutorialmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

//ТАБЫ ДЛЯ МОДОВ
    public static final RegistryObject<CreativeModeTab> TETRA_ITEMS_TAB = CREATIVE_MODE_TABS.register("tetra_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TETRA_GEM.get()))
                    .title(Component.translatable("creativetab.tutorialmod.tetra_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TETRA_GEM.get());
                        output.accept(ModItems.RAW_TETRA_GEM.get());

                        output.accept(ModItems.CHISEL.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> TETRA_BlOCKS_TAB = CREATIVE_MODE_TABS.register("tetra_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TETRA_BLOCK.get()))
                    .withTabsBefore(TETRA_ITEMS_TAB.getId()) // появление после айтем таба а не в рандом месте
                    .title(Component.translatable("creativetab.tutorialmod.tetra_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TETRA_BLOCK.get());
                        output.accept(ModBlocks.RAW_TETRA_BLOCK.get());

                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
