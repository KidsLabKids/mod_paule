
package net.mcreator.poleskrasseerfindunghehexd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.poleskrasseerfindunghehexd.procedures.AwaaayProcedure;
import net.mcreator.poleskrasseerfindunghehexd.PolesKrasseErfindungHehexdModElements;

import java.util.Map;
import java.util.HashMap;

@PolesKrasseErfindungHehexdModElements.ModElement.Tag
public class PPPPigggGEItem extends PolesKrasseErfindungHehexdModElements.ModElement {
	@ObjectHolder("poles_krasse_erfindung_hehexd:ppp_piggg_ge")
	public static final Item block = null;
	public PPPPigggGEItem(PolesKrasseErfindungHehexdModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 10000f;
			}

			public float getAttackDamage() {
				return 98f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 6f, new Item.Properties().group(ItemGroup.TOOLS)) {
			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, blockstate, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					AwaaayProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("ppp_piggg_ge"));
	}
}
