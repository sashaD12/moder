
package net.mcreator.doz_in_maincraft.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.doz_in_maincraft.procedures.DarkZoneCrystalObnovlieniieTikaProcedure;
import net.mcreator.doz_in_maincraft.procedures.DarkZoneCrystalDopolnitielnoieUsloviieDobavlieniiarostaProcedure;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModBlocks;

public class DarkZoneCrystalBlock extends FlowerBlock {
	public DarkZoneCrystalBlock() {
		super(() -> MobEffects.DARKNESS, 35,
				BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.AMETHYST_CLUSTER).strength(2f, 3f).lightLevel(s -> 4).noOcclusion().dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return Shapes.or(box(6, 2.90465, 3.46141, 9.8, 10.50465, 7.46141), box(10.15526, -0.39535, 6.21668, 15.55526, 9.50465, 10.01668), box(5, 0.72433, 9.52288, 9, 10.82433, 13.52288), box(2.79379, 1.52433, 6.61668, 10.29379, 5.42433, 9.61668))
				.move(offset.x, offset.y, offset.z);
	}

	@Override
	public int getEffectDuration() {
		return 35;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		boolean additionalCondition = true;
		if (worldIn instanceof LevelAccessor world) {
			int x = pos.getX();
			int y = pos.getY() + 1;
			int z = pos.getZ();
			BlockState blockstate = world.getBlockState(pos.above());
			additionalCondition = DarkZoneCrystalDopolnitielnoieUsloviieDobavlieniiarostaProcedure.execute(world, x, y, z);
		}
		return (groundState.is(DozInMaincraftModBlocks.CRYSTAL_STONE.get()) || groundState.is(DozInMaincraftModBlocks.CRYSTAL_COBBLESTONE.get()) || groundState.is(DozInMaincraftModBlocks.CRYSTAL_GROUND.get())
				|| groundState.is(DozInMaincraftModBlocks.CRYSTAL_EARTH.get())) && additionalCondition;
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CAVE;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		DarkZoneCrystalObnovlieniieTikaProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return world != null && pos != null ? Minecraft.getInstance().level.getBiome(pos).value().getFogColor() : 12638463;
		}, DozInMaincraftModBlocks.DARK_ZONE_CRYSTAL.get());
	}
}
