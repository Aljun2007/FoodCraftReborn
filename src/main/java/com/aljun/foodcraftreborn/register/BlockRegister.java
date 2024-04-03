package com.aljun.foodcraftreborn.register;

import com.aljun.foodcraftreborn.blocks.PanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

public class BlockRegister {
    public static final DeferredBlock<Block> PAN_BLOCK =
            Register.BLOCKS.register("pan",()->new PanBlock(BlockBehaviour.Properties.of()));

}
