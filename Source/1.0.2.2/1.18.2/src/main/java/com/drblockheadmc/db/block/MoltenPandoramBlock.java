
package com.drblockheadmc.db.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.drblockheadmc.db.init.DbModFluids;

public class MoltenPandoramBlock extends LiquidBlock {
	public MoltenPandoramBlock() {
		super(() -> (FlowingFluid) DbModFluids.MOLTEN_PANDORAM.get(), BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_GREEN)
				.strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 3));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 2;
	}
}
