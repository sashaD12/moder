package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class DarkZoneUsloviieIspolzovaniiaPortalaProcedure {
	public static boolean execute(LevelAccessor world) {
		return (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD;
	}
}
