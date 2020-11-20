package com.Marcell.minecraftmod.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Orange extends Item {

    public Orange() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(2f)
                        .effect(new EffectInstance(Effects.REGENERATION, 100,1),0.3f)
                        .build())
        );
    }
}
