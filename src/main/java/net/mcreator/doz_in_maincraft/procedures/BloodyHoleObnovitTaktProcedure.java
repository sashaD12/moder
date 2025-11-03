package net.mcreator.doz_in_maincraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModEntities;

public class BloodyHoleObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.7) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.AIR) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.RISING_EXECUTIONER.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BLOODY_CLAW.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_RAIDER.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_BULL.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BLOODY_CARCASS.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_ARROWS.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BRIGADIER_GHUL.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_BANDIT.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.RISING_EXECUTIONER.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BLOODY_CLAW.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BLOODY_CARCASS.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BRIGADIER_GHUL.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_ARROWS.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_BANDIT.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_BULL.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_RAIDER.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.AIR) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.RISING_EXECUTIONER.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BLOODY_CLAW.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BLOODY_CARCASS.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BRIGADIER_GHUL.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_ARROWS.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_BANDIT.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_BULL.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_RAIDER.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.AIR) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.RISING_EXECUTIONER.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BLOODY_CLAW.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BLOODY_CARCASS.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.BRIGADIER_GHUL.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_ARROWS.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_BANDIT.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_BULL.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = DozInMaincraftModEntities.GHOUL_RAIDER.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			}
		}
	}
}
