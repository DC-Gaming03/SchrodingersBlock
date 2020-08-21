package mod.dcgames.schrodingersblock.init;

import mod.dcgames.schrodingersblock.SchrodingersBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SchrodingersBlock.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SchrodingersBlock.MOD_ID);


    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Block
    public static final RegistryObject<Block> SCHRODINGERSBLOCK = BLOCKS.register("schrodingersblock", () -> new mod.dcgames.schrodingersblock.blocks.SchrodingersBlock());

    //Block Item
    public static final RegistryObject<Item> SCHRODINGERSBLOCK_BLOCK = ITEMS.register("schrodingersblock", () -> new BlockItem(SCHRODINGERSBLOCK.get(), new Item.Properties().group(ItemGroup.MISC)));


}
