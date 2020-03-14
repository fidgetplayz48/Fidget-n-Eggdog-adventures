package net.mcreator.eggdog_and_fidgetspinner_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementseggdog_and_fidgetspinner_mod.ModElement.Tag
public class MCreatorTabbyBite extends Elementseggdog_and_fidgetspinner_mod.ModElement {
	@GameRegistry.ObjectHolder("eggdog_and_fidgetspinner_mod:tabbybite")
	public static final Item block = null;

	public MCreatorTabbyBite(Elementseggdog_and_fidgetspinner_mod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("eggdog_and_fidgetspinner_mod:tabbybite", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(7, 5f, false);
			setUnlocalizedName("tabbybite");
			setRegistryName("tabbybite");
			setCreativeTab(MCreatorTabby.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
