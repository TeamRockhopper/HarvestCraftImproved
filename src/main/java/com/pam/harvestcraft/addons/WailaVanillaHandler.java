package com.pam.harvestcraft.addons;

public class WailaVanillaHandler {}
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
// /**
// * Waila ignores that vanilla beetroot only has stages 0-3. Let's fix that.
// */
// private String fixBeetroot(IWailaDataAccessor accessor) {
//
// if (!(accessor.getBlock() instanceof BlockBeetroot))
// return "";
// final BlockBeetroot blockBeetroot = (BlockBeetroot) accessor.getBlock();
//
// final boolean mature = accessor.getMetadata() >= blockBeetroot
// .getMaxAge();
//
// if (mature) {
// return String.format("%s : %s",
// LangUtil.translateG("hud.msg.growth"),
// LangUtil.translateG("hud.msg.mature"));
// } else {
// float matureAge = blockBeetroot.getMaxAge();
//
// final float growthValue = (accessor.getMetadata() / matureAge)
// * 100.0F;
// return String.format("%s : %.0f %%",
// LangUtil.translateG("hud.msg.growth"), growthValue);
// }
// }
//
// @Override
// public List<String> getWailaBody(ItemStack itemStack,
// List<String> currenttip, IWailaDataAccessor accessor,
// IWailaConfigHandler config) {
// FMLLog.info("beetroot 1");
//
// if (accessor.getBlock() instanceof BlockBeetroot) {
// FMLLog.info("beetroot 2");
//
// final String newtip = fixBeetroot(accessor);
// currenttip.clear();
// currenttip.add(newtip);
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
// registrar.registerBodyProvider(new WailaVanillaHandler(),
// BlockBeetroot.class);
// }
// }
