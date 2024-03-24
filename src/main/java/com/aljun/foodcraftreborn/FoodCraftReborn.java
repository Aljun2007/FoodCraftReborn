package com.aljun.foodcraftreborn;

import com.aljun.foodcraftreborn.register.BlockRegister;
import com.aljun.foodcraftreborn.register.ItemRegister;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;

@Mod(Utils.MOD_ID)
public class FoodCraftReborn {

    public static class Blocks {
        public static Block PAN_BLOCK = BlockRegister.PAN_BLOCK.get();
    }

    public static class Items {
        public static Item PAN_BLOCK = ItemRegister.PAN_BLOCK.get();
    }
}
