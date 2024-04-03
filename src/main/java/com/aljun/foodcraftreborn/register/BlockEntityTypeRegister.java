package com.aljun.foodcraftreborn.register;


import com.aljun.foodcraftreborn.FoodCraftReborn;
import com.aljun.foodcraftreborn.blockentities.PanBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;

public class BlockEntityTypeRegister {

    public static DeferredHolder<BlockEntityType<?>, BlockEntityType<PanBlockEntity>> PAN = Register.BLOCK_ENTITY_TYPES.register("pan", () -> BlockEntityType.Builder.of(PanBlockEntity::new, FoodCraftReborn.Blocks.PAN_BLOCK).build(null));


}
