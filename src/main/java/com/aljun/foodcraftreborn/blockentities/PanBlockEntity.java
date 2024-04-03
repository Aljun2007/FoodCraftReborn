package com.aljun.foodcraftreborn.blockentities;

import com.aljun.foodcraftreborn.FoodCraftReborn;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PanBlockEntity extends BlockEntity implements MenuProvider {
    public PanBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(FoodCraftReborn.BlockEntityTypes.PAN, pPos, pBlockState);
    }


    @Override
    public @NotNull Component getDisplayName() {
        return Component.translatable("menu.pan.default_name");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return null;
    }
}
