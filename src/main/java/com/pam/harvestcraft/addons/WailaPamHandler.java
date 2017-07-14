package com.pam.harvestcraft.addons;

public class WailaPamHandler {
}

// implements IWailaDataProvider {
// @Override
// public ItemStack getWailaStack(IWailaDataAccessor accessor,
// IWailaConfigHandler config) {
// return null;
// }
//
// @Override
// public List<String> getWailaHead(ItemStack itemStack,
// List<String> currenttip, IWailaDataAccessor accessor,
// IWailaConfigHandler config) {
// return currenttip;
// }
//
// @Override
// public List<String> getWailaBody(ItemStack itemStack,
// List<String> currenttip, IWailaDataAccessor accessor,
// IWailaConfigHandler config) {
// if (!config.getConfig("general.showcrop") || accessor.getBlock() == null
// || !(accessor.getBlock() instanceof PamCropGrowable)) {
// return currenttip;
// }
//
// currenttip.clear();
//
// float matureAge = ((PamCropGrowable) accessor.getBlock())
// .getMatureAge();
// final int growthStage = accessor.getMetadata();
//
// final float growthValue = (growthStage / matureAge) * 100.0F;
//
// if (growthValue < 100.0) {
// currenttip.add(String.format("%s : %.0f %%",
// LangUtil.translateG("hud.msg.growth"), growthValue));
// } else {
// currenttip.add(String.format("%s : %s",
// LangUtil.translateG("hud.msg.growth"),
// LangUtil.translateG("hud.msg.mature")));
// }
//
// return currenttip;
// }
//
// @Override
// public List<String> getWailaTail(ItemStack itemStack,
// List<String> currenttip, IWailaDataAccessor accessor,
// IWailaConfigHandler config) {
// return currenttip;
// }
//
// @Override
// public NBTTagCompound getNBTData(EntityPlayerMP player, TileEntity te,
// NBTTagCompound tag, World world, BlockPos pos) {
// if (te != null) {
// te.deserializeNBT(tag);
// }
//
// return tag;
// }
//
// @SuppressWarnings("unused")
// public static void callbackRegister(IWailaRegistrar registrar) {
// registrar.registerBodyProvider(new WailaPamHandler(),
// BlockPamCrop.class);
// registrar.registerBodyProvider(new WailaPamHandler(),
// BlockPamFruit.class);
// registrar.registerBodyProvider(new WailaPamHandler(),
// BlockPamFruitLog.class);
// }
// }
