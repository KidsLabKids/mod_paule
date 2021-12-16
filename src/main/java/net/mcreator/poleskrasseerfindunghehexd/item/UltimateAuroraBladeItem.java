
package net.mcreator.poleskrasseerfindunghehexd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.poleskrasseerfindunghehexd.procedures.SchwertpowerProcedure;
import net.mcreator.poleskrasseerfindunghehexd.PolesKrasseErfindungHehexdModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@PolesKrasseErfindungHehexdModElements.ModElement.Tag
public class UltimateAuroraBladeItem extends PolesKrasseErfindungHehexdModElements.ModElement {
	@ObjectHolder("poles_krasse_erfindung_hehexd:ultimate_aurora_blade")
	public static final Item block = null;
	public UltimateAuroraBladeItem(PolesKrasseErfindungHehexdModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5432;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 10.799999999999999f;
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
		}, 3, -2.0999999999999999f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Is it strong???"));
			}

			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					SchwertpowerProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("ultimate_aurora_blade"));
	}
}
