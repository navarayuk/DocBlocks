
package com.drblockheadmc.db.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import com.drblockheadmc.db.init.DbModItems;
import com.drblockheadmc.db.init.DbModFluids;
import com.drblockheadmc.db.init.DbModFluidTypes;
import com.drblockheadmc.db.init.DbModBlocks;

public abstract class MoltenPandoramFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DbModFluidTypes.MOLTEN_PANDORAM_TYPE.get(),
			() -> DbModFluids.MOLTEN_PANDORAM.get(), () -> DbModFluids.FLOWING_MOLTEN_PANDORAM.get()).explosionResistance(100f).tickRate(8)
			.slopeFindDistance(3).bucket(() -> DbModItems.MOLTEN_PANDORAM_BUCKET.get()).block(() -> (LiquidBlock) DbModBlocks.MOLTEN_PANDORAM.get());

	private MoltenPandoramFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenPandoramFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenPandoramFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
