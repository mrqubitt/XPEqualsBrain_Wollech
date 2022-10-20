
package net.mcreator.xpequalsbrain.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.xpequalsbrain.procedures.MiracleGrowthItemRightclickedOnBlockProcedure;

import java.util.List;

public class MiracleGrowthItemItem extends Item {
	public MiracleGrowthItemItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Hesaplar\u0131n do\u011Fru ise d\u00FCnyan\u0131n"));
		list.add(new TextComponent("do\u011Faya ba\u011Fl\u0131 sorunlar\u0131n\u0131 \u00E7\u00F6zmeli!"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		MiracleGrowthItemRightclickedOnBlockProcedure.execute(context.getLevel(), context.getLevel().getBlockState(context.getClickedPos()),
				context.getPlayer());
		return retval;
	}
}
