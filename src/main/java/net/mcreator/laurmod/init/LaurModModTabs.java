
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.laurmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.laurmod.LaurModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LaurModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LaurModMod.MODID);
	public static final RegistryObject<CreativeModeTab> LAUR_MODS_COMBAT = REGISTRY.register("laur_mods_combat",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.laur_mod.laur_mods_combat")).icon(() -> new ItemStack(LaurModModItems.MYTHISTT_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LaurModModItems.MYTHISTS_ARMOR_HELMET.get());
				tabData.accept(LaurModModItems.MYTHISTS_ARMOR_CHESTPLATE.get());
				tabData.accept(LaurModModItems.MYTHISTS_ARMOR_LEGGINGS.get());
				tabData.accept(LaurModModItems.MYTHISTS_ARMOR_BOOTS.get());
				tabData.accept(LaurModModItems.MYTHISTT_SWORD.get());
				tabData.accept(LaurModModBlocks.FLUTY_FENCE_GATE.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> LAUR_MODS_TOOL = REGISTRY.register("laur_mods_tool",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.laur_mod.laur_mods_tool")).icon(() -> new ItemStack(LaurModModItems.MYTHISTT_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LaurModModItems.MYTHISTT_PICKAXE.get());
				tabData.accept(LaurModModItems.MYTHISTT_AXE.get());
				tabData.accept(LaurModModItems.MYTHISTT_SHOVEL.get());
				tabData.accept(LaurModModItems.MYTHISTT_HOE.get());
			}).withSearchBar().withTabsBefore(LAUR_MODS_COMBAT.getId()).build());
	public static final RegistryObject<CreativeModeTab> LAUR_MODS_BLOCKS = REGISTRY.register("laur_mods_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.laur_mod.laur_mods_blocks")).icon(() -> new ItemStack(LaurModModBlocks.FLUTY_STAIRS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LaurModModBlocks.FLUTY_WOOD.get().asItem());
				tabData.accept(LaurModModBlocks.FLUTY_LOG.get().asItem());
				tabData.accept(LaurModModBlocks.FLUTY_PLANKS.get().asItem());
				tabData.accept(LaurModModBlocks.FLUTY_LEAVES.get().asItem());
				tabData.accept(LaurModModBlocks.FLUTY_STAIRS.get().asItem());
				tabData.accept(LaurModModBlocks.FLUTY_SLAB.get().asItem());
				tabData.accept(LaurModModBlocks.FLUTY_FENCE.get().asItem());
				tabData.accept(LaurModModBlocks.FLUTY_PRESSURE_PLATE.get().asItem());
				tabData.accept(LaurModModBlocks.FLUTY_BUTTON.get().asItem());
				tabData.accept(LaurModModBlocks.MERECENISU_BLOCK.get().asItem());
				tabData.accept(LaurModModBlocks.MERECENISU_BODY_BLOCK.get().asItem());
			}).withSearchBar().withTabsBefore(LAUR_MODS_TOOL.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(LaurModModItems.MYTHIST.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(LaurModModBlocks.MYTHIST_ORE.get().asItem());
			tabData.accept(LaurModModBlocks.MYTHIST_BLOCK.get().asItem());
		}
	}
}
