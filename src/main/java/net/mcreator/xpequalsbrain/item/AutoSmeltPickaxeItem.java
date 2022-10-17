
package net.mcreator.xpequalsbrain.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.xpequalsbrain.procedures.KazmaFirin3000prosedureProcedure;

import java.util.List;

public class AutoSmeltPickaxeItem extends PickaxeItem {
	public AutoSmeltPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Eski s\u0131k\u0131c\u0131 f\u0131r\u0131n\u0131n\u0131zdan s\u0131k\u0131ld\u0131n\u0131z m\u0131?"));
		list.add(new TextComponent("Kazmaf\u0131r\u0131n 3000 ile bu dertlerden kurtulun!"));
		list.add(new TextComponent("Madeninizi kaz\u0131n ve arkan\u0131za yaslan\u0131n!"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			KazmaFirin3000prosedureProcedure.execute(world, entity);
	}
}
