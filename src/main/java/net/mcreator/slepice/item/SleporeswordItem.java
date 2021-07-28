
package net.mcreator.slepice.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.slepice.SlepiceModElements;

@SlepiceModElements.ModElement.Tag
public class SleporeswordItem extends SlepiceModElements.ModElement {
	@ObjectHolder("slepice:sleporesword")
	public static final Item block = null;
	public SleporeswordItem(SlepiceModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sleporesword"));
	}
}
