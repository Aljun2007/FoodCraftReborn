package com.aljun.foodcraftreborn.register;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class ItemRegister {
    public static final DeferredItem<Item> PAN_BLOCK = Register.ITEMS.register("pan",BlockRegister.PAN_BLOCK::asItem);
}
