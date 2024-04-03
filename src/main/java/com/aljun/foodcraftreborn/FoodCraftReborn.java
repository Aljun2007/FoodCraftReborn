package com.aljun.foodcraftreborn;

import com.aljun.foodcraftreborn.blockentities.PanBlockEntity;
import com.aljun.foodcraftreborn.register.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;


@Mod(Utils.MOD_ID)
public class FoodCraftReborn {
    public FoodCraftReborn(IEventBus modEventBus, Dist dist, ModContainer container) {
        Register.BLOCKS.register(modEventBus);
        Register.ITEMS.register(modEventBus);
        Register.BLOCK_ENTITY_TYPES.register(modEventBus);
        Register.CUSTOM_STATS.register(modEventBus);
    }

    public static class Blocks {
        public static Block PAN_BLOCK = BlockRegister.PAN_BLOCK.get();
    }

    public static class BlockEntityTypes {
        public static BlockEntityType<PanBlockEntity> PAN = BlockEntityTypeRegister.PAN.get();
    }

    public static class Items {
        public static Item PAN_BLOCK = ItemRegister.PAN_BLOCK.get();
    }

    public static class Stats {
        public static ResourceLocation INTERACT_WITH_PAN = CustomStatRegister.INTERACT_WITH_PAN.get();
    }
}
