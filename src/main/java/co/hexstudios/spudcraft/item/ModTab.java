package co.hexstudios.spudcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab
{
    public static final CreativeModeTab SPUDCRAFT_TAB = new CreativeModeTab("spudcraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUSSET_POTATO.get());
        }
    };
}
