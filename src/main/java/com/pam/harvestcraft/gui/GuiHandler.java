package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.tileentities.TileEntityApiary;
import com.pam.harvestcraft.tileentities.TileEntityGroundTrap;
import com.pam.harvestcraft.tileentities.TileEntityMarket;
import com.pam.harvestcraft.tileentities.TileEntityPresser;
import com.pam.harvestcraft.tileentities.TileEntityShippingBin;
import com.pam.harvestcraft.tileentities.TileEntityWaterTrap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int GUIID_BASE = 0;
	public static final int GUIID_MARKET = GUIID_BASE + 0;
	public static final int GUIID_SHIPPING_BIN = GUIID_BASE + 1;
	public static final int GUIID_APIARY = GUIID_BASE + 2;
	public static final int GUIID_PRESSER = GUIID_BASE + 3;
	public static final int GUIID_GROUND_TRAP = GUIID_BASE + 4;
	public static final int GUIID_WATER_TRAP = GUIID_BASE + 5;

	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

		if (ID == GUIID_MARKET) {
			return new ContainerMarket(player.inventory,
					(TileEntityMarket) tileEntity);
		} else if (ID == GUIID_SHIPPING_BIN) {
			return new ContainerShippingBin(player.inventory,
					(TileEntityShippingBin) tileEntity);
		} else if (ID == GUIID_APIARY) {
			return new ContainerApiary(player.inventory,
					(TileEntityApiary) tileEntity);
		} else if (ID == GUIID_PRESSER) {
			return new ContainerPresser(player.inventory,
					(TileEntityPresser) tileEntity);
		} else if (ID == GUIID_GROUND_TRAP) {
			return new ContainerGroundTrap(player.inventory,
					(TileEntityGroundTrap) tileEntity);
		} else if (ID == GUIID_WATER_TRAP) {
			return new ContainerWaterTrap(player.inventory,
					(TileEntityWaterTrap) tileEntity);
		}

		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

		if (ID == GUIID_MARKET) {
			return new GuiMarket(player.inventory,
					(TileEntityMarket) tileEntity);
		} else if (ID == GUIID_SHIPPING_BIN) {
			return new GuiShippingBin(player.inventory,
					(TileEntityShippingBin) tileEntity);
		} else if (ID == GUIID_APIARY) {
			return new GuiApiary(player.inventory,
					(TileEntityApiary) tileEntity);
		} else if (ID == GUIID_PRESSER) {
			return new GuiPresser(player.inventory,
					(TileEntityPresser) tileEntity);
		} else if (ID == GUIID_GROUND_TRAP) {
			return new GuiGroundTrap(player.inventory,
					(TileEntityGroundTrap) tileEntity);
		} else if (ID == GUIID_WATER_TRAP) {
			return new GuiWaterTrap(player.inventory,
					(TileEntityWaterTrap) tileEntity);
		}

		return null;
	}
}
