package com.pam.harvestcraft.blocks.blocks;

import javax.annotation.Nullable;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.item.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WellBlock extends Block {

	public static final String registryName = "well";

	public WellBlock() {
		super(Material.ROCK);
		setCreativeTab(HarvestCraft.modTab);
		setSoundType(SoundType.STONE);

		setHardness(1.0f);
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos,
			IBlockState state, EntityPlayer playerIn, EnumHand hand,
			@Nullable ItemStack heldItem, EnumFacing side, float hitX,
			float hitY, float hitZ) {
		ItemStack itemstack = playerIn.getHeldItem(hand);

		if (itemstack.stackSize == 0) {
			return true;
		} else {

			Item item = heldItem.getItem();

			if (item == Items.BUCKET) {

				itemstack.stackSize = (itemstack.stackSize - 1);

				if (itemstack.stackSize == 0) {
					playerIn.setHeldItem(hand,
							new ItemStack(Items.WATER_BUCKET));
				} else if (!playerIn.inventory.addItemStackToInventory(
						new ItemStack(Items.WATER_BUCKET))) {
					playerIn.dropItem(new ItemStack(Items.WATER_BUCKET), false);
				}

				return true;
			} else if (item == Items.GLASS_BOTTLE) {

				ItemStack itemstack1 = PotionUtils.addPotionToItemStack(
						new ItemStack(Items.POTIONITEM), PotionTypes.WATER);

				if (itemstack.stackSize == 0) {
					playerIn.setHeldItem(hand, itemstack1);
				} else if (!playerIn.inventory
						.addItemStackToInventory(itemstack1)) {
					playerIn.dropItem(itemstack1, false);
				} else if (playerIn instanceof EntityPlayerMP) {
					((EntityPlayerMP) playerIn)
							.sendContainerToPlayer(playerIn.inventoryContainer);
				}

				return true;
			} else if (item == ItemRegistry.freshwaterItem) {
				{
					playerIn.inventory.addItemStackToInventory(
							new ItemStack(ItemRegistry.freshwaterItem));
				}
				return true;
			}

			return false;
		}
	}

}
