package com.aljun.foodcraftreborn.register;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CustomStatRegister {

    public static DeferredHolder<ResourceLocation, ResourceLocation> INTERACT_WITH_PAN = Register.CUSTOM_STATS.register("interact_with_pan", () -> new ResourceLocation("interact_with_pan"));

}
