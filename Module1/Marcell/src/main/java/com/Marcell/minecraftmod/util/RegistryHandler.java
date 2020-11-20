package com.Marcell.minecraftmod.util;

import com.Marcell.minecraftmod.SimpleFoods;
import com.Marcell.minecraftmod.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SimpleFoods.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
// Items

public static final RegistryObject<Item> BANANA = ITEMS.register("banana", Banana::new);
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange", Orange::new);
    public static final RegistryObject<Item> BERRY = ITEMS.register("berry", Berry::new);
    public static final RegistryObject<Item> CHOCOLATEMILK = ITEMS.register("cmilk", CMilk::new);



}
