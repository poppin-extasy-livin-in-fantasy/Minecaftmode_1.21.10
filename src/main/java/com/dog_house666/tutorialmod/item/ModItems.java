package com.dog_house666.tutorialmod.item;

import com.dog_house666.tutorialmod.TutorialMod;
import com.dog_house666.tutorialmod.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    //was changed
    //item registration
    public static final RegistryObject<Item> TETRA_GEM = ITEMS.register("tetra_gem",
            () -> new Item(new Item.Properties()));

    //new Item
    public static final RegistryObject<Item> RAW_TETRA_GEM = ITEMS.register("raw_tetra_gem",
            () -> new Item(new Item.Properties()));

    //new Item and arguments for him
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));


    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
