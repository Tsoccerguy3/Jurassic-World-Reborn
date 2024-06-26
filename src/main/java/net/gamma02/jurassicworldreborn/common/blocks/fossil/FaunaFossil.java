package net.gamma02.jurassicworldreborn.common.blocks.fossil;

import net.gamma02.jurassicworldreborn.common.blocks.ModBlocks;
import net.gamma02.jurassicworldreborn.common.items.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FaunaFossil extends Block implements EncasedFossil, EntityBlock {
    public FaunaFossil(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public boolean mustBandage() {
        return true;
    }

    @Override
    public BlockState getEncasedFossil() {
        return ModBlocks.ENCASED_FAUNA_FOSSIL.get().defaultBlockState();
    }

    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult result) {
        if(player.getItemInHand(hand).getItem() == ModItems.PLASTER_AND_BANDAGE.get()){
            level.setBlock(pos, this.getEncasedFossil(), 1);
        }

        return super.use(state, level, pos, player, hand, result);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return null;
    }
}
