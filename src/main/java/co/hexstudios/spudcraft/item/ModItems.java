package co.hexstudios.spudcraft.item;

import co.hexstudios.spudcraft.SpudCraft;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpudCraft.MOD_ID);

    // Basic Potato items

    public static final RegistryObject<Item> RED_POTATO = ITEMS.register("red_potato",
            () -> new Item(new Item.Properties().tab(ModTab.SPUDCRAFT_TAB).food(Foods.RED_POTATO)));
    public static final RegistryObject<Item> RUSSET_POTATO = ITEMS.register("russet_potato",
            () -> new Item(new Item.Properties().tab(ModTab.SPUDCRAFT_TAB).food(Foods.RUSSET_POTATO)));


    public static  class Foods {
        public static final FoodProperties RED_POTATO = new FoodProperties.Builder().nutrition(2).saturationMod(1).alwaysEat().build();
        public static final FoodProperties RUSSET_POTATO = new FoodProperties.Builder().nutrition(2).saturationMod(1).alwaysEat().build();
    }



    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }


}
