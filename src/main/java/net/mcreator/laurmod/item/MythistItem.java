
package net.mcreator.laurmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MythistItem extends Item {
	public MythistItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
