package com.aljun.foodcraftreborn;

import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;

@Mod(Utils.MOD_ID)
public class FoodCraftReborn {
    public static final DeferredBlock<Block> MY_BLOCK = BLOCKS.register("my_block", () -> new Block(...));
}
