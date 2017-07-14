package com.pam.harvestcraft.blocks.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.gui.GuiHandler;
import com.pam.harvestcraft.tileentities.TileEntityShippingBin;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockPamShippingBin extends BlockContainer {
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	public BlockPamShippingBin() {
		super(Material.WOOD);
		setSoundType(SoundType.WOOD);
		this.setCreativeTab(HarvestCraft.modTab);
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos,
			IBlockState state, EntityPlayer playerIn, EnumHand hand,
			ItemStack heldItem, EnumFacing side, float hitX, float hitY,
			float hitZ) {
		final TileEntity tile = worldIn.getTileEntity(pos);
		if ((tile == null) || (playerIn.isSneaking())) {
			return false;
		}

		playerIn.openGui(HarvestCraft.instance, GuiHandler.GUIID_SHIPPING_BIN,
				worldIn, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityShippingBin();
	}

	@SuppressWarnings("deprecation")
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return createTileEntity(worldIn, getStateFromMeta(meta));
	}
}
