package com.aljun.foodcraftreborn.register;

import com.aljun.foodcraftreborn.Utils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Register {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Utils.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Utils.MOD_ID);

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Utils.MOD_ID);
    public static final DeferredRegister<ResourceLocation> CUSTOM_STATS = DeferredRegister.create(BuiltInRegistries.CUSTOM_STAT, Utils.MOD_ID);

}
