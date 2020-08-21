package mod.dcgames.schrodingersblock.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = mod.dcgames.schrodingersblock.SchrodingersBlock.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class SchrodingersBlock extends Block {
    public SchrodingersBlock() {
        super(AbstractBlock.Properties.create(Material.SHULKER)
                .hardnessAndResistance(0, 100)

        );
    }

    @SubscribeEvent
    public static void blockBroken(BlockEvent.BreakEvent event) {
        
    }


}
