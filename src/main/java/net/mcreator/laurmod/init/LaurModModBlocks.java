
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.laurmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.laurmod.block.MythistOreBlock;
import net.mcreator.laurmod.block.MythistBlockBlock;
import net.mcreator.laurmod.block.MerecenisuBodyBlockBlock;
import net.mcreator.laurmod.block.MerecenisuBlockBlock;
import net.mcreator.laurmod.block.FlutyWoodBlock;
import net.mcreator.laurmod.block.FlutyStairsBlock;
import net.mcreator.laurmod.block.FlutySlabBlock;
import net.mcreator.laurmod.block.FlutyPressurePlateBlock;
import net.mcreator.laurmod.block.FlutyPlanksBlock;
import net.mcreator.laurmod.block.FlutyLogBlock;
import net.mcreator.laurmod.block.FlutyLeavesBlock;
import net.mcreator.laurmod.block.FlutyFenceGateBlock;
import net.mcreator.laurmod.block.FlutyFenceBlock;
import net.mcreator.laurmod.block.FlutyButtonBlock;
import net.mcreator.laurmod.LaurModMod;

public class LaurModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LaurModMod.MODID);
	public static final RegistryObject<Block> MYTHIST_ORE = REGISTRY.register("mythist_ore", () -> new MythistOreBlock());
	public static final RegistryObject<Block> MYTHIST_BLOCK = REGISTRY.register("mythist_block", () -> new MythistBlockBlock());
	public static final RegistryObject<Block> FLUTY_WOOD = REGISTRY.register("fluty_wood", () -> new FlutyWoodBlock());
	public static final RegistryObject<Block> FLUTY_LOG = REGISTRY.register("fluty_log", () -> new FlutyLogBlock());
	public static final RegistryObject<Block> FLUTY_PLANKS = REGISTRY.register("fluty_planks", () -> new FlutyPlanksBlock());
	public static final RegistryObject<Block> FLUTY_LEAVES = REGISTRY.register("fluty_leaves", () -> new FlutyLeavesBlock());
	public static final RegistryObject<Block> FLUTY_STAIRS = REGISTRY.register("fluty_stairs", () -> new FlutyStairsBlock());
	public static final RegistryObject<Block> FLUTY_SLAB = REGISTRY.register("fluty_slab", () -> new FlutySlabBlock());
	public static final RegistryObject<Block> FLUTY_FENCE = REGISTRY.register("fluty_fence", () -> new FlutyFenceBlock());
	public static final RegistryObject<Block> FLUTY_FENCE_GATE = REGISTRY.register("fluty_fence_gate", () -> new FlutyFenceGateBlock());
	public static final RegistryObject<Block> FLUTY_PRESSURE_PLATE = REGISTRY.register("fluty_pressure_plate", () -> new FlutyPressurePlateBlock());
	public static final RegistryObject<Block> FLUTY_BUTTON = REGISTRY.register("fluty_button", () -> new FlutyButtonBlock());
	public static final RegistryObject<Block> MERECENISU_BLOCK = REGISTRY.register("merecenisu_block", () -> new MerecenisuBlockBlock());
	public static final RegistryObject<Block> MERECENISU_BODY_BLOCK = REGISTRY.register("merecenisu_body_block", () -> new MerecenisuBodyBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
