package com.aljun.foodcraftreborn.blocks;

import com.aljun.foodcraftreborn.FoodCraftReborn;
import com.aljun.foodcraftreborn.blockentities.PanBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PanBlock extends BaseEntityBlock {

    public static final MapCodec<PanBlock> CODEC = simpleCodec(PanBlock::new);

    public PanBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull MapCodec<PanBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pPos, @NotNull BlockState pState) {
        return new PanBlockEntity(pPos, pState);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pLevel.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            this.openContainer(pLevel, pPos, pPlayer);
            return InteractionResult.CONSUME;
        }
    }

    private void openContainer(Level pLevel, BlockPos pPos, Player pPlayer) {
        BlockEntity blockentity = pLevel.getBlockEntity(pPos);
        if (blockentity instanceof PanBlockEntity) {
            pPlayer.openMenu((MenuProvider) blockentity);
            pPlayer.awardStat(FoodCraftReborn.Stats.INTERACT_WITH_PAN);
        }
    }
}
