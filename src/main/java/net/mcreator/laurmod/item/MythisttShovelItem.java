
package net.mcreator.laurmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.laurmod.init.LaurModModItems;

public class MythisttShovelItem extends ShovelItem {
	public MythisttShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1219;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 43;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(LaurModModItems.MYTHIST.get()));
			}
		}, 1, -1f, new Item.Properties());
	}
}
