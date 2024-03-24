package com.aljun.foodcraftreborn.register;

import com.aljun.foodcraftreborn.blocks.PanBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

public class BlockRegister {
    public static final DeferredBlock<Block> PAN_BLOCK = Register.BLOCKS.register("pan", PanBlock::new);

}
