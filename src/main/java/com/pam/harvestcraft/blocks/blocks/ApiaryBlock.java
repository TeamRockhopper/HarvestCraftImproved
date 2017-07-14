package com.pam.harvestcraft.blocks.blocks;

import javax.annotation.Nullable;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.gui.GuiHandler;
import com.pam.harvestcraft.tileentities.TileEntityApiary;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ApiaryBlock extends BlockContainerRotating {

	public static final String registryName = "apiary";
	private static boolean keepInventory;

	public ApiaryBlock() {
		super(Material.WOOD);
		setSoundType(SoundType.WOOD);
		setCreativeTab(HarvestCraft.modTab);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityApiary();
	}

	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		keepInventory = true;
		if (!keepInventory) {
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof TileEntityApiary) {
				InventoryHelper.dropInventoryItems(worldIn, pos,
						(TileEntityApiary) tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
			}
		}

		super.breakBlock(worldIn, pos, state);
	}

	/**
	 * Called when the block is right clicked by a player.
	 */
	@Override
	public boolean onBlockActivated(World world, BlockPos pos,
			IBlockState state, EntityPlayer player, EnumHand hand,
			@Nullable ItemStack facing, EnumFacing hitX, float hitY, float hitZ,
			float p_180639_10_) {
		if (world.isRemote) {
			return true;
		}
		TileEntity te = world.getTileEntity(pos);
		if (!(te instanceof TileEntityApiary)) {
			return false;
		}
		player.openGui(HarvestCraft.instance, GuiHandler.GUIID_APIARY, world,
				pos.getX(), pos.getY(), pos.getZ());
		return true;
	}
}
