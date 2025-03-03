
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.laurmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.laurmod.item.MythisttSwordItem;
import net.mcreator.laurmod.item.MythisttShovelItem;
import net.mcreator.laurmod.item.MythisttPickaxeItem;
import net.mcreator.laurmod.item.MythisttHoeItem;
import net.mcreator.laurmod.item.MythisttAxeItem;
import net.mcreator.laurmod.item.MythistsArmorItem;
import net.mcreator.laurmod.item.MythistItem;
import net.mcreator.laurmod.LaurModMod;

public class LaurModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LaurModMod.MODID);
	public static final RegistryObject<Item> MYTHIST = REGISTRY.register("mythist", () -> new MythistItem());
	public static final RegistryObject<Item> MYTHIST_ORE = block(LaurModModBlocks.MYTHIST_ORE);
	public static final RegistryObject<Item> MYTHIST_BLOCK = block(LaurModModBlocks.MYTHIST_BLOCK);
	public static final RegistryObject<Item> MYTHISTS_ARMOR_HELMET = REGISTRY.register("mythists_armor_helmet", () -> new MythistsArmorItem.Helmet());
	public static final RegistryObject<Item> MYTHISTS_ARMOR_CHESTPLATE = REGISTRY.register("mythists_armor_chestplate", () -> new MythistsArmorItem.Chestplate());
	public static final RegistryObject<Item> MYTHISTS_ARMOR_LEGGINGS = REGISTRY.register("mythists_armor_leggings", () -> new MythistsArmorItem.Leggings());
	public static final RegistryObject<Item> MYTHISTS_ARMOR_BOOTS = REGISTRY.register("mythists_armor_boots", () -> new MythistsArmorItem.Boots());
	public static final RegistryObject<Item> MYTHISTT_PICKAXE = REGISTRY.register("mythistt_pickaxe", () -> new MythisttPickaxeItem());
	public static final RegistryObject<Item> MYTHISTT_AXE = REGISTRY.register("mythistt_axe", () -> new MythisttAxeItem());
	public static final RegistryObject<Item> MYTHISTT_SWORD = REGISTRY.register("mythistt_sword", () -> new MythisttSwordItem());
	public static final RegistryObject<Item> MYTHISTT_SHOVEL = REGISTRY.register("mythistt_shovel", () -> new MythisttShovelItem());
	public static final RegistryObject<Item> MYTHISTT_HOE = REGISTRY.register("mythistt_hoe", () -> new MythisttHoeItem());
	public static final RegistryObject<Item> FLUTY_WOOD = block(LaurModModBlocks.FLUTY_WOOD);
	public static final RegistryObject<Item> FLUTY_LOG = block(LaurModModBlocks.FLUTY_LOG);
	public static final RegistryObject<Item> FLUTY_PLANKS = block(LaurModModBlocks.FLUTY_PLANKS);
	public static final RegistryObject<Item> FLUTY_LEAVES = block(LaurModModBlocks.FLUTY_LEAVES);
	public static final RegistryObject<Item> FLUTY_STAIRS = block(LaurModModBlocks.FLUTY_STAIRS);
	public static final RegistryObject<Item> FLUTY_SLAB = block(LaurModModBlocks.FLUTY_SLAB);
	public static final RegistryObject<Item> FLUTY_FENCE = block(LaurModModBlocks.FLUTY_FENCE);
	public static final RegistryObject<Item> FLUTY_FENCE_GATE = block(LaurModModBlocks.FLUTY_FENCE_GATE);
	public static final RegistryObject<Item> FLUTY_PRESSURE_PLATE = block(LaurModModBlocks.FLUTY_PRESSURE_PLATE);
	public static final RegistryObject<Item> FLUTY_BUTTON = block(LaurModModBlocks.FLUTY_BUTTON);
	public static final RegistryObject<Item> MERECENISU_BLOCK = block(LaurModModBlocks.MERECENISU_BLOCK);
	public static final RegistryObject<Item> MERECENISU_BODY_BLOCK = block(LaurModModBlocks.MERECENISU_BODY_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
