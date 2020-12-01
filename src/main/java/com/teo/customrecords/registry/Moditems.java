package com.teo.customrecords.registry;

import com.teo.customrecords.Customrecords;
import net.ludocrypt.jukefix.mixin.MusicDiscAccessor;
import net.minecraft.client.texture.SpriteAtlasHolder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Moditems {

    public static final Item BLANK_DISC = new Item(new Item.Settings().group(ItemGroup.MISC));



    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(Customrecords.MOD_ID, "blank_disc"), BLANK_DISC);


    }



}
