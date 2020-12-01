package com.teo.customrecords.registry;

import net.minecraft.sound.MusicSound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.teo.customrecords.Customrecords;
import net.minecraft.sound.SoundEvent;

import static com.teo.customrecords.Customrecords.MOD_ID;

public abstract class Recordsoundevents {
    public static final Identifier TESTDISC = new Identifier(MOD_ID, "mustard_plug_jerry");

    public static final SoundEvent MUSTARD_PLUG_JERRY = new SoundEvent(TESTDISC);


///////
    public static void initSounds() {
        Registry.register(Registry.SOUND_EVENT, TESTDISC, MUSTARD_PLUG_JERRY);
        System.out.println("Whatever");



    }
}
