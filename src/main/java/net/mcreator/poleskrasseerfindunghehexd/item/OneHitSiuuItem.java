
package net.mcreator.poleskrasseerfindunghehexd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.poleskrasseerfindunghehexd.PolesKrasseErfindungHehexdModElements;

@PolesKrasseErfindungHehexdModElements.ModElement.Tag
public class OneHitSiuuItem extends PolesKrasseErfindungHehexdModElements.ModElement {
	@ObjectHolder("poles_krasse_erfindung_hehexd:one_hit_siuu")
	public static final Item block = null;
	public OneHitSiuuItem(PolesKrasseErfindungHehexdModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 9998f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("one_hit_siuu"));
	}
}
