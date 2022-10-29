
package com.drblockheadmc.db.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import com.drblockheadmc.db.init.DbModItems;
import com.drblockheadmc.db.init.DbModFluids;
import com.drblockheadmc.db.init.DbModBlocks;

public abstract class MoltenPandoramFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(DbModFluids.MOLTEN_PANDORAM,
			DbModFluids.FLOWING_MOLTEN_PANDORAM,
			FluidAttributes.builder(new ResourceLocation("db:blocks/fluidcane_still"), new ResourceLocation("db:blocks/fluidcane_flow"))

					.viscosity(960)

					.rarity(Rarity.UNCOMMON).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava"))))
			.explosionResistance(100f).canMultiply().tickRate(8)

			.slopeFindDistance(3).bucket(DbModItems.MOLTEN_PANDORAM_BUCKET).block(() -> (LiquidBlock) DbModBlocks.MOLTEN_PANDORAM.get());

	private MoltenPandoramFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(1.4000000000000001);
	}

	public static class Source extends MoltenPandoramFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenPandoramFluid {
		public Flowing() {
			super();
		}

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
