package com.teo.customrecords;



import com.teo.customrecords.registry.Moditems;
import com.teo.customrecords.registry.Recordsoundevents;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class Customrecords implements ModInitializer {

    public static final String MOD_ID = "customrecordsyeah";


    @Override
    public void onInitialize() {
        Moditems.registerItems();
        Recordsoundevents.initSounds();
    }

}
