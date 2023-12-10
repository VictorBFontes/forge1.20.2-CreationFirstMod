package net.victor.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.victor.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = //DeferredRegister é como se fosse uma grande lista onde vai estar registrado, neste caso, todos os itens
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAFIRA= ITEMS.register("safira",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAFIRA = ITEMS.register("raw_safira" ,
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) { //método de registro
        ITEMS.register(eventBus);
    }
}
