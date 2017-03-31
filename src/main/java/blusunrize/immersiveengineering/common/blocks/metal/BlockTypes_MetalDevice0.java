package blusunrize.immersiveengineering.common.blocks.metal;

import blusunrize.immersiveengineering.common.blocks.BlockIEBase;
import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum BlockTypes_MetalDevice0 implements IStringSerializable, BlockIEBase.IBlockEnum
{
	CAPACITOR_LV,
	CAPACITOR_MV,
	CAPACITOR_HV,
	CAPACITOR_CREATIVE,
	BARREL,
	FLUID_PUMP,
	FLUID_PLACER;

	@Override
	public String getName()
	{
		return this.toString().toLowerCase(Locale.ENGLISH);
	}
	@Override
	public int getMeta()
	{
		return ordinal();
	}
	@Override
	public boolean listForCreative()
	{
		return true;
	}
}