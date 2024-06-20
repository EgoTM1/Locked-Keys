package net.egotm.lockedorigins.items;

import net.egotm.lockedorigins.LockedOrigins;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LockedOrigins.MOD_ID);

    public static final RegistryObject<Item> FIRE_KEY = ITEMS.register("key_fire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BERSERKER_KEY = ITEMS.register("key_berserker",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLEAR_KEY = ITEMS.register("key_clear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYO_KEY = ITEMS.register("key_cryo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_KEY = ITEMS.register("key_dark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEALER_KEY = ITEMS.register("key_healer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KING_KEY = ITEMS.register("key_king",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLAGUE_KEY = ITEMS.register("key_plague",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
