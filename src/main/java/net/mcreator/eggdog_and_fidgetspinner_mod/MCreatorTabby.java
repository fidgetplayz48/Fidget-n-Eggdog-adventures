package net.mcreator.eggdog_and_fidgetspinner_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementseggdog_and_fidgetspinner_mod.ModElement.Tag
public class MCreatorTabby extends Elementseggdog_and_fidgetspinner_mod.ModElement {
	public MCreatorTabby(Elementseggdog_and_fidgetspinner_mod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtabby") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorTabbyBite.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
